/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Graphics
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.io.UncheckedIOException
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.invoke.LambdaMetafactory
 *  java.lang.reflect.Type
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.nio.file.Files
 *  java.nio.file.LinkOption
 *  java.nio.file.OpenOption
 *  java.nio.file.Path
 *  java.nio.file.Paths
 *  java.nio.file.StandardOpenOption
 *  java.nio.file.attribute.FileAttribute
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicInteger
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.function.Predicate
 *  java.util.zip.CRC32
 */
package com.imagineps.client.updater;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.updater.CacheFile;
import com.imagineps.client.updater.HttpUtil;
import com.imagineps.client.updater.UpdateState;
import com.imagineps.client.updater.screen.UpdateComponent;
import com.imagineps.client.updater.screen.UpdaterRenderer;
import com.imagineps.client.updater.screen.impl.CacheUpdateScreen;
import com.imagineps.client.updater.screen.impl.UpToDateUpdateScreen;
import com.imagineps.client.updater.screen.impl.VerifyingScreen;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.zip.CRC32;

public final class Updater {
    private static final Updater INSTANCE = new Updater();
    public static final String DOWNLOAD_URL = "https://www.imagine-ps.com/public/download";
    public static final Path CACHE_DIRECTORY = Configuration.clientRunMode == Configuration.ClientRunMode.PACKAGED ? Paths.get((String)"cache", (String[])new String[0]) : Paths.get((String)System.getProperty((String)"user.home"), (String[])new String[]{".imagineps"});
    private static final ExecutorService service;
    private static final AtomicLong size;
    private static final AtomicLong done;
    private static final AtomicInteger completed;
    private final List<Future<?>> futures = new ArrayList();
    public int totalUpdates = 0;
    public UpdateState state = UpdateState.UPDATE_CACHE;

    public void setup(Client client) {
        client.updaterRenderer = new UpdaterRenderer(client, client.graphics);
        CacheUpdateScreen cacheUpdateScreen = new CacheUpdateScreen();
        client.updaterRenderer.setScreen(cacheUpdateScreen);
        this.totalUpdates = 0;
        size.set(0L);
        done.set(0L);
        try {
            this.verifyCache(cacheUpdateScreen);
            return;
        }
        catch (IOException cause) {
            throw new UncheckedIOException("Unable to verify cache!", cause);
        }
    }

    public void finish() {
        if (this.state == UpdateState.FINISHED) return;
        this.state = UpdateState.FINISHED;
        Client client = Client.instance;
        Client.updateScreenGraphicsBuffer = null;
        client.updaterRenderer.finish();
        client.updaterRenderer = null;
        System.gc();
        System.runFinalization();
        client.startUp();
    }

    public static boolean isActive() {
        if (Updater.get().state == UpdateState.FINISHED) return false;
        return true;
    }

    private static List<CacheFile> fetchCrcs(boolean beta) throws IOException {
        Gson gson = new Gson();
        String url = "https://www.imagine-ps.com/public/download/crcs.json";
        if (beta) {
            url = "https://www.imagine-ps.com/public/download/crcs-beta.json";
        }
        String json = HttpUtil.readText(new URL(url).openStream());
        return (List)gson.fromJson(json, new TypeToken<List<CacheFile>>(){}.getType());
    }

    public List<QueuedCacheFile> getUpdates() throws IOException {
        ArrayList queue = new ArrayList();
        List<CacheFile> crcs = Updater.fetchCrcs(Configuration.clientRunMode == Configuration.ClientRunMode.PACKAGED);
        Iterator iterator = crcs.iterator();
        while (iterator.hasNext()) {
            CacheFile cacheFile = (CacheFile)iterator.next();
            String dir = cacheFile.getDir();
            String name = cacheFile.getName();
            String crc = cacheFile.getCrc();
            int size = cacheFile.getSize();
            Path path = cacheFile.path();
            Path file = path.resolve(name);
            boolean needsUpdate = false;
            if (Files.exists((Path)file, (LinkOption[])new LinkOption[0])) {
                String crc32 = Updater.crc32(Files.readAllBytes((Path)file));
                if (!crc32.contains((CharSequence)crc)) {
                    needsUpdate = true;
                }
            } else {
                needsUpdate = true;
            }
            if (!needsUpdate) continue;
            Updater.size.addAndGet((long)size);
            queue.add((Object)new QueuedCacheFile(name, dir, path));
        }
        return queue;
    }

    private void verifyCache(UpdateComponent screen) throws IOException {
        if (Configuration.SKIP_UPDATING) {
            this.state = UpdateState.UP_TO_DATE;
            Client.instance.updaterRenderer.setScreen(new UpToDateUpdateScreen());
            return;
        }
        List<QueuedCacheFile> updates = this.getUpdates();
        this.totalUpdates = updates.size();
        if (updates.isEmpty()) {
            this.state = UpdateState.UP_TO_DATE;
            Client.instance.updaterRenderer.setScreen(new UpToDateUpdateScreen());
            System.out.println("Cache is up to date.");
            return;
        }
        screen.setLabel("Updating (0/" + this.totalUpdates + ")");
        for (QueuedCacheFile cacheFile : updates) {
            this.futures.add((Object)service.submit(this.download(cacheFile, screen)));
        }
        while (this.futures.size() > 0) {
            this.futures.removeIf((Predicate)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isDone(), (Ljava/util/concurrent/Future;)Z)());
            if (this.futures.isEmpty()) {
                try {
                    service.shutdown();
                    service.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                this.setReady();
            }
            try {
                Thread.sleep((long)1000L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private Runnable download(QueuedCacheFile cacheFile, UpdateComponent screen) {
        return () -> {
            try {
                Path path = cacheFile.path();
                if (Files.notExists((Path)path, (LinkOption[])new LinkOption[0])) {
                    Files.createDirectories((Path)path, (FileAttribute[])new FileAttribute[0]);
                }
                HttpURLConnection connection = HttpUtil.getConnection(cacheFile.url(Configuration.clientRunMode == Configuration.ClientRunMode.PACKAGED));
                InputStream is = connection.getInputStream();
                Throwable throwable = null;
                try {
                    OutputStream os = Files.newOutputStream((Path)path.resolve(cacheFile.name), (OpenOption[])new OpenOption[]{StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING});
                    Throwable throwable2 = null;
                    try {
                        int n;
                        byte[] buffer = new byte[1024];
                        while ((n = is.read(buffer)) != -1) {
                            os.write(buffer, 0, n);
                            done.addAndGet((long)n);
                            ((CacheUpdateScreen)screen).setProgress((int)((double)done.get() / (double)size.get() * 100.0));
                        }
                        connection.disconnect();
                    }
                    catch (Throwable buffer) {
                        throwable2 = buffer;
                        throw buffer;
                    }
                    finally {
                        if (os != null) {
                            if (throwable2 != null) {
                                try {
                                    os.close();
                                }
                                catch (Throwable buffer) {
                                    throwable2.addSuppressed(buffer);
                                }
                            } else {
                                os.close();
                            }
                        }
                    }
                }
                catch (Throwable os) {
                    throwable = os;
                    throw os;
                }
                finally {
                    if (is != null) {
                        if (throwable != null) {
                            try {
                                is.close();
                            }
                            catch (Throwable os) {
                                throwable.addSuppressed(os);
                            }
                        } else {
                            is.close();
                        }
                    }
                }
                this.state = UpdateState.UPDATE_CACHE;
                screen.setLabel("Updating (" + completed.addAndGet(1) + "/" + this.totalUpdates + ")");
                return;
            }
            catch (Throwable cause) {
                System.out.println("Unable to download file: " + (Object)cause + " " + cause.getMessage());
                cause.printStackTrace();
            }
        }
        ;
    }

    public static String crc32(byte[] bytes) {
        CRC32 crc = new CRC32();
        crc.update(bytes);
        return Long.toHexString((long)crc.getValue()).toUpperCase();
    }

    private void setReady() {
        this.state = UpdateState.VERIFYING;
        Client.instance.updaterRenderer.setScreen(new VerifyingScreen());
    }

    public static Updater get() {
        return INSTANCE;
    }

    public static ExecutorService getService() {
        return service;
    }

    static {
        int cores = Runtime.getRuntime().availableProcessors();
        service = cores > 1 ? Executors.newFixedThreadPool((int)cores) : Executors.newSingleThreadExecutor();
        size = new AtomicLong(0L);
        done = new AtomicLong(0L);
        completed = new AtomicInteger(0);
    }

    public static final class QueuedCacheFile {
        String name;
        String directory;
        Path path;

        public QueuedCacheFile(String name, String directory, Path path) {
            this.name = name;
            this.directory = directory;
            this.path = path;
        }

        public String url(boolean beta) {
            String url = "http://cdn.imagine-ps.com/";
            url = url + "cache-39";
            if (beta) {
                url = url + "-beta";
            }
            url = url + "/";
            url = url + this.directory;
            if (this.directory.equals((Object)"/")) return url + this.name.replace((CharSequence)" ", (CharSequence)"%20");
            url = url + "/";
            return url + this.name.replace((CharSequence)" ", (CharSequence)"%20");
        }

        public String name() {
            return this.name;
        }

        public String dir() {
            return this.directory;
        }

        public Path path() {
            return this.path;
        }

        public String toString() {
            return "QueuedCacheFile{name='" + this.name + '\'' + ", directory='" + this.directory + '\'' + ", url='" + this.url(false) + '\'' + ", beta-url='" + this.url(true) + '\'' + '}';
        }
    }

}


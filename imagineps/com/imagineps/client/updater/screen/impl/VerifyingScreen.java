/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.BasicStroke
 *  java.awt.Color
 *  java.awt.Font
 *  java.awt.Graphics
 *  java.awt.Graphics2D
 *  java.awt.RenderingHints
 *  java.awt.RenderingHints$Key
 *  java.awt.Stroke
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.io.UncheckedIOException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.invoke.LambdaMetafactory
 *  java.net.HttpURLConnection
 *  java.nio.file.Files
 *  java.nio.file.LinkOption
 *  java.nio.file.OpenOption
 *  java.nio.file.Path
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
 *  java.util.function.Predicate
 */
package com.imagineps.client.updater.screen.impl;

import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.updater.HttpUtil;
import com.imagineps.client.updater.UpdateState;
import com.imagineps.client.updater.Updater;
import com.imagineps.client.updater.screen.UpdateComponent;
import com.imagineps.client.updater.screen.UpdaterRenderer;
import com.imagineps.client.updater.screen.impl.UpToDateUpdateScreen;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.lang.invoke.LambdaMetafactory;
import java.net.HttpURLConnection;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
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
import java.util.function.Predicate;

public class VerifyingScreen
extends UpdateComponent {
    private static final ExecutorService service;
    private final List<Future<?>> futures = new ArrayList();
    private final AtomicInteger completed = new AtomicInteger(0);
    private int totalUpdates = 0;

    @Override
    public void setup(Client client) {
        super.setup(client);
        Graphics2D g2d = (Graphics2D)this.getGraphics();
        g2d.setStroke((Stroke)new BasicStroke(5.0f));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.getGraphics().setFont(new Font("Helvetica", 0, 25));
        this.setLabel("Verifying");
        try {
            List<Updater.QueuedCacheFile> updates = Updater.get().getUpdates();
            Iterator iterator = updates.iterator();
            while (iterator.hasNext()) {
                Updater.QueuedCacheFile cacheFile = (Updater.QueuedCacheFile)iterator.next();
                if (service.isShutdown() || service.isTerminated()) continue;
                this.futures.add((Object)service.submit(this.download(cacheFile)));
            }
            return;
        }
        catch (IOException cause) {
            throw new UncheckedIOException(cause);
        }
    }

    @Override
    public void render(Client client) {
        if (this.getGraphics() == null) {
            return;
        }
        this.getGraphics().setFont(new Font("Helvetica", 0, 20));
        this.getGraphics().setFont(new Font("Helvetica", 0, 25));
        this.drawWaitingLabel(Color.WHITE);
    }

    @Override
    public void process() {
        super.process();
        this.futures.removeIf((Predicate)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isDone(), (Ljava/util/concurrent/Future;)Z)());
        if (!this.futures.isEmpty()) return;
        try {
            service.shutdown();
            service.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.finish();
    }

    private void finish() {
        Updater.get().state = UpdateState.UP_TO_DATE;
        Client.instance.updaterRenderer.setScreen(new UpToDateUpdateScreen());
        System.out.println("Cache was downloaded and extracted successfully.");
    }

    private Runnable download(Updater.QueuedCacheFile cacheFile) {
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
                    OutputStream os = Files.newOutputStream((Path)path.resolve(cacheFile.name()), (OpenOption[])new OpenOption[]{StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING});
                    Throwable throwable2 = null;
                    try {
                        int n;
                        byte[] buffer = new byte[1024];
                        while ((n = is.read(buffer)) != -1) {
                            os.write(buffer, 0, n);
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
                this.setLabel("CRC mismatch. Updating (" + this.completed.addAndGet(1) + "/" + this.totalUpdates + ")");
                return;
            }
            catch (Throwable cause) {
                System.out.println("Unable to verify file: " + (Object)cause + " " + cause.getMessage());
                cause.printStackTrace();
            }
        }
        ;
    }

    static {
        int cores = Runtime.getRuntime().availableProcessors();
        service = cores > 1 ? Executors.newFixedThreadPool((int)cores) : Executors.newSingleThreadExecutor();
    }
}


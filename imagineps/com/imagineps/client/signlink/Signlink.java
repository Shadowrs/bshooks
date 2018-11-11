/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.applet.Applet
 *  java.io.BufferedReader
 *  java.io.DataInputStream
 *  java.io.DataOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.FileWriter
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.io.RandomAccessFile
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Process
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.InetAddress
 *  java.net.Socket
 *  java.net.URL
 *  java.nio.channels.FileChannel
 *  java.security.SecureRandom
 *  java.util.Random
 *  javax.sound.midi.MidiSystem
 *  javax.sound.midi.Sequence
 *  javax.sound.midi.Sequencer
 *  javax.sound.sampled.AudioFormat
 *  javax.sound.sampled.AudioInputStream
 *  javax.sound.sampled.AudioSystem
 *  javax.sound.sampled.Control
 *  javax.sound.sampled.Control$Type
 *  javax.sound.sampled.DataLine
 *  javax.sound.sampled.DataLine$Info
 *  javax.sound.sampled.FloatControl
 *  javax.sound.sampled.FloatControl$Type
 *  javax.sound.sampled.Line
 *  javax.sound.sampled.Line$Info
 *  javax.sound.sampled.LineUnavailableException
 *  javax.sound.sampled.SourceDataLine
 *  javax.sound.sampled.UnsupportedAudioFileException
 */
package com.imagineps.client.signlink;

import com.imagineps.client.Configuration;
import com.imagineps.client.cache.CacheType;
import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.security.SecureRandom;
import java.util.Random;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Control;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public final class Signlink
implements Runnable {
    public static int personalUid;
    static Sequencer musicSr;
    private static final Random KEY_GEN;
    static Sequence musicS;
    public static int currentMidi;
    public static String uid;
    public static FileChannel cache_dat;
    public static final FileChannel[] cache_idx;
    public static boolean sunjava;
    public static Applet mainapp;
    private static boolean active;
    private static int threadliveid;
    private static InetAddress socketip;
    private static int socketreq;
    private static Socket socket;
    private static int threadreqpri;
    private static Runnable threadreq;
    private static String dnsreq;
    public static String dns;
    private static String urlreq;
    private static DataInputStream urlstream;
    private static int savelen;
    private static String savereq;
    private static byte[] savebuf;
    public static boolean midiplay;
    private static int midipos;
    public static String midi;
    public static int midivol;
    public static int midifade;
    private static boolean waveplay;
    private static int wavepos;
    public static int wavevol;
    public static boolean reporterror;
    public static String errorname;
    public static int clientcacheversion;
    private final int EXTERNAL_BUFFER_SIZE = 524288;
    private Position curPosition;

    public static synchronized void dnslookup(String s) {
        dns = s;
        dnsreq = s;
    }

    public static String getDirectory() {
        if (Configuration.clientRunMode == Configuration.ClientRunMode.PACKAGED) {
            return "cache/";
        }
        boolean exists = new File(System.getProperty((String)"user.home") + "/.imagineps/").exists();
        if (exists) {
            return System.getProperty((String)"user.home") + "/.imagineps/";
        }
        File f = new File(System.getProperty((String)"user.home") + "/.imagineps/");
        f.mkdir();
        return System.getProperty((String)"user.home") + "/.imagineps/";
    }

    public static String getIdentifier() throws NumberFormatException, Exception {
        String uniqueId;
        String string;
        Long identifier;
        DataOutputStream output;
        Throwable throwable;
        identifier = KEY_GEN.nextLong();
        uniqueId = null;
        File path = new File(Signlink.getIdentifierFile());
        File file = new File(Signlink.getIdentifierFile() + "client_data.dat");
        if (!path.exists()) {
            path.mkdir();
            if (!file.exists()) {
                file.createNewFile();
            }
            try {
                output = new DataOutputStream((OutputStream)new FileOutputStream(file));
                throwable = null;
                try {
                    output.writeLong(identifier.longValue());
                    output.flush();
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    if (output != null) {
                        if (throwable != null) {
                            try {
                                output.close();
                            }
                            catch (Throwable throwable3) {
                                throwable.addSuppressed(throwable3);
                            }
                        } else {
                            output.close();
                        }
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            if (!file.exists()) {
                file.createNewFile();
                try {
                    output = new DataOutputStream((OutputStream)new FileOutputStream(file));
                    throwable = null;
                    try {
                        output.writeLong(identifier.longValue());
                        output.flush();
                    }
                    catch (Throwable throwable4) {
                        throwable = throwable4;
                        throw throwable4;
                    }
                    finally {
                        if (output != null) {
                            if (throwable != null) {
                                try {
                                    output.close();
                                }
                                catch (Throwable throwable5) {
                                    throwable.addSuppressed(throwable5);
                                }
                            } else {
                                output.close();
                            }
                        }
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                uniqueId = Long.toString((long)identifier);
            }
            try {
                DataInputStream input = new DataInputStream((InputStream)new FileInputStream(file));
                throwable = null;
                try {
                    identifier = input.readLong();
                }
                catch (Throwable throwable6) {
                    throwable = throwable6;
                    throw throwable6;
                }
                finally {
                    if (input != null) {
                        if (throwable != null) {
                            try {
                                input.close();
                            }
                            catch (Throwable throwable7) {
                                throwable.addSuppressed(throwable7);
                            }
                        } else {
                            input.close();
                        }
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Signlink.getPlatform().equals((Object)Platform.WINDOWS)) {
            String result = "";
            try {
                String line;
                File file2 = File.createTempFile((String)"realhowto", (String)".vbs");
                file2.deleteOnExit();
                FileWriter fw = new FileWriter(file2);
                String vbs = "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\nSet colItems = objWMIService.ExecQuery _ \n   (\"Select * from Win32_BaseBoard\") \nFor Each objItem in colItems \n    Wscript.Echo objItem.SerialNumber \n    exit for  ' do the first cpu only! \nNext \n";
                fw.write(vbs);
                fw.close();
                Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file2.getPath());
                BufferedReader input = new BufferedReader((Reader)new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null) {
                    result = result + line;
                }
                input.close();
            }
            catch (Exception e) {
                e.printStackTrace();
                return Long.toString((long)identifier);
            }
            uniqueId = result.trim();
        }
        if (uniqueId != null && uniqueId.matches("^[0-9]*$") && uniqueId.length() > 2) {
            string = uniqueId;
            return string;
        }
        string = Long.toString((long)identifier);
        return string;
    }

    public static String getIdentifierFile() {
        String name = System.getProperty((String)"os.name");
        String directory = "";
        Platform platform = Signlink.getPlatform();
        if (platform != Platform.WINDOWS) {
            directory = System.getProperty((String)"user.home");
            if (platform != Platform.MAC_OS_X) return directory + File.separator + "/System Data/";
            directory = directory + "/Library/Application Support";
            return directory + File.separator + "/System Data/";
        }
        directory = name.toLowerCase().contains((CharSequence)"xp") ? "C:" + File.separator + "Documents and Settings" + File.separator + "All Users" + File.separator + "Documents" : "C:" + File.separator + "Users" + File.separator + "Public" + File.separator + "Documents" + File.separator;
        File dir = new File(directory);
        if (dir.exists()) return directory;
        return System.getenv((String)"AppData") + "/System Data/";
    }

    protected static Platform getPlatform() {
        String name = System.getProperty((String)"os.name").toLowerCase();
        if (name.contains((CharSequence)"win")) {
            return Platform.WINDOWS;
        }
        if (name.contains((CharSequence)"mac")) {
            return Platform.MAC_OS_X;
        }
        if (name.contains((CharSequence)"linux")) {
            return Platform.LINUX;
        }
        if (!name.contains((CharSequence)"unix")) return Platform.UNKOWN;
        return Platform.LINUX;
    }

    public static synchronized void midisave(byte[] abyte0, int i) {
        if (i > 2000000) {
            return;
        }
        if (savereq != null) {
            return;
        }
        midipos = (midipos + 1) % 5;
        savelen = i;
        savebuf = abyte0;
        midiplay = true;
        savereq = "jingle" + midipos + ".mid";
    }

    public static synchronized Socket opensocket(int i) throws IOException {
        socketreq = i;
        do {
            if (socketreq == 0) {
                if (socket != null) return socket;
                throw new IOException("could not open socket");
            }
            try {
                Thread.sleep((long)50L);
            }
            catch (Exception exception) {
            }
        } while (true);
    }

    public static synchronized DataInputStream openurl(String s) throws IOException {
        urlreq = s;
        do {
            if (urlreq == null) {
                if (urlstream != null) return urlstream;
                throw new IOException("could not open: " + s);
            }
            try {
                Thread.sleep((long)50L);
            }
            catch (Exception exception) {
            }
        } while (true);
    }

    public static void reporterror(String s) {
        System.out.println("Error: " + s);
    }

    public static void saveFile(String s, String s1, byte[] abyte0, int i) {
        try {
            FileOutputStream fileo = new FileOutputStream(s + s1);
            fileo.write(abyte0, 0, i);
            fileo.close();
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startpriv(InetAddress inetaddress) {
        threadliveid = (int)(Math.random() * 9.9999999E7);
        if (active) {
            try {
                Thread.sleep((long)500L);
            }
            catch (Exception exception) {
                // empty catch block
            }
            active = false;
        }
        socketreq = 0;
        threadreq = null;
        dnsreq = null;
        savereq = null;
        urlreq = null;
        socketip = inetaddress;
        Thread thread = new Thread((Runnable)new Signlink());
        thread.setDaemon(true);
        thread.start();
        while (!active) {
            try {
                Thread.sleep((long)50L);
            }
            catch (Exception exception) {}
        }
    }

    public static synchronized void startthread(Runnable runnable, int i) {
        threadreqpri = i;
        threadreq = runnable;
    }

    public static synchronized boolean wavereplay() {
        if (savereq != null) {
            return false;
        }
        savebuf = null;
        waveplay = true;
        savereq = "sound" + wavepos + ".wav";
        return true;
    }

    public static synchronized boolean wavesave(byte[] abyte0, int i) {
        if (i > 2000000) {
            return false;
        }
        if (savereq != null) {
            return false;
        }
        wavepos = (wavepos + 1) % 5;
        savelen = i;
        savebuf = abyte0;
        waveplay = true;
        savereq = "sound" + wavepos + ".wav";
        return true;
    }

    public static String getCurrentVersion(String url) {
        try {
            BufferedReader br = new BufferedReader((Reader)new InputStreamReader((InputStream)new FileInputStream(url)));
            String version = br.readLine();
            br.close();
            return version;
        }
        catch (Exception e) {
            return "0.1";
        }
    }

    public static String getNewestVersion(String url) {
        try {
            URL tmp = new URL(url);
            BufferedReader br = new BufferedReader((Reader)new InputStreamReader(tmp.openStream()));
            return br.readLine();
        }
        catch (Exception e) {
            return "-1";
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        String cacheDirectory = CacheType.MAIN_FILE_CACHE.getFullLocation();
        active = true;
        try {
            uid = Signlink.getIdentifier();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
            cache_dat = new RandomAccessFile(cacheDirectory + "main_file_cache.dat", "rw").getChannel();
            for (int index = 0; index < cache_idx.length; ++index) {
                Signlink.cache_idx[index] = new RandomAccessFile(cacheDirectory + "main_file_cache.idx" + index, "rw").getChannel();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        int i = threadliveid;
        while (threadliveid == i) {
            if (socketreq != 0) {
                try {
                    socket = new Socket(socketip, socketreq);
                }
                catch (Exception _ex) {
                    socket = null;
                }
                socketreq = 0;
            } else if (threadreq != null) {
                Thread thread = new Thread(threadreq);
                thread.setDaemon(true);
                thread.start();
                thread.setPriority(threadreqpri);
                threadreq = null;
            } else if (dnsreq != null) {
                try {
                    dns = InetAddress.getByName((String)dnsreq).getHostName();
                }
                catch (Exception _ex) {
                    dns = "unknown";
                }
                dnsreq = null;
            } else if (savereq != null) {
                if (savebuf != null) {
                    try {
                        FileOutputStream fileoutputstream = new FileOutputStream(cacheDirectory + savereq);
                        fileoutputstream.write(savebuf, 0, savelen);
                        fileoutputstream.close();
                    }
                    catch (Exception fileoutputstream) {
                        // empty catch block
                    }
                }
                if (waveplay) {
                    String wave = cacheDirectory + savereq;
                    waveplay = false;
                    AudioInputStream audioInputStream = null;
                    try {
                        audioInputStream = AudioSystem.getAudioInputStream((File)new File(wave));
                    }
                    catch (UnsupportedAudioFileException e1) {
                        e1.printStackTrace();
                        return;
                    }
                    catch (IOException e1) {
                        e1.printStackTrace();
                        return;
                    }
                    AudioFormat format = audioInputStream.getFormat();
                    SourceDataLine auline = null;
                    DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
                    try {
                        auline = (SourceDataLine)AudioSystem.getLine((Line.Info)info);
                        auline.open(format);
                    }
                    catch (LineUnavailableException e) {
                        e.printStackTrace();
                        return;
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                    if (auline.isControlSupported((Control.Type)FloatControl.Type.PAN)) {
                        FloatControl pan = (FloatControl)auline.getControl((Control.Type)FloatControl.Type.PAN);
                        if (this.curPosition == Position.RIGHT) {
                            pan.setValue(1.0f);
                        } else if (this.curPosition == Position.LEFT) {
                            pan.setValue(-1.0f);
                        }
                    }
                    auline.start();
                    int nBytesRead = 1810;
                    byte[] abData = new byte[524288];
                    try {
                        while (nBytesRead != -1) {
                            nBytesRead = audioInputStream.read(abData, 1810, abData.length);
                            if (nBytesRead < 1810) continue;
                            auline.write(abData, 1810, nBytesRead);
                        }
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                    finally {
                        auline.drain();
                        auline.close();
                    }
                }
                if (midiplay) {
                    midi = cacheDirectory + savereq;
                    try {
                        if (musicSr != null) {
                            musicSr.stop();
                            musicSr.close();
                        }
                        musicSr = null;
                        musicS = null;
                        File music = new File(midi);
                        if (music.exists()) {
                            musicS = MidiSystem.getSequence((File)music);
                            musicSr = MidiSystem.getSequencer();
                            musicSr.open();
                            musicSr.setSequence(musicS);
                            musicSr.start();
                        }
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    midiplay = false;
                }
                savereq = null;
            } else if (urlreq != null) {
                try {
                    System.out.println("urlstream");
                    urlstream = new DataInputStream(new URL(mainapp.getCodeBase(), urlreq).openStream());
                }
                catch (Exception _ex) {
                    urlstream = null;
                }
                urlreq = null;
            }
            try {
                Thread.sleep((long)50L);
            }
            catch (Exception _ex) {}
        }
    }

    static {
        musicSr = null;
        KEY_GEN = new SecureRandom();
        musicS = null;
        currentMidi = -1;
        cache_dat = null;
        cache_idx = new FileChannel[9];
        mainapp = null;
        socket = null;
        threadreqpri = 1;
        threadreq = null;
        dnsreq = null;
        dns = null;
        urlreq = null;
        urlstream = null;
        savereq = null;
        savebuf = null;
        midi = null;
        reporterror = true;
        errorname = "";
        clientcacheversion = 0;
    }

    static enum Position {
        LEFT,
        RIGHT,
        NORMAL;
        

        private Position() {
        }
    }

    protected static enum Platform {
        LINUX,
        MAC_OS_X,
        UNKOWN,
        WINDOWS;
        

        private Platform() {
        }
    }

}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.net.Socket
 */
package com.imagineps.client;

import com.imagineps.client.RSApplet;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

final class RSSocket
implements Runnable {
    private InputStream inputStream;
    OutputStream outputStream;
    private final Socket socket;
    private boolean closed = false;
    private final RSApplet rsApplet;
    private byte[] buffer;
    private int writeIndex;
    private int buffIndex;
    private boolean isWriter = false;
    private boolean hasIOError = false;

    public RSSocket(RSApplet RSApplet_, Socket socket1) throws IOException {
        this.rsApplet = RSApplet_;
        this.socket = socket1;
        this.socket.setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.inputStream = this.socket.getInputStream();
        this.outputStream = this.socket.getOutputStream();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        this.closed = true;
        try {
            if (this.inputStream != null) {
                this.inputStream.close();
            }
            if (this.outputStream != null) {
                this.outputStream.close();
            }
            if (this.socket != null) {
                this.socket.close();
            }
        }
        catch (IOException _ex2) {
            System.out.println("Error closing stream");
        }
        this.isWriter = false;
        RSSocket _ex2 = this;
        synchronized (_ex2) {
            this.notify();
        }
        this.buffer = null;
    }

    public int read() throws IOException {
        if (!this.closed) return this.inputStream.read();
        return 0;
    }

    public int available() throws IOException {
        if (!this.closed) return this.inputStream.available();
        return 0;
    }

    public void flushInputStream(byte[] abyte0, int j) throws IOException {
        try {
            int i = 0;
            if (this.closed) {
                return;
            }
            while (j > 0) {
                int k = this.inputStream.read(abyte0, i, j);
                if (k <= 0) {
                    throw new IOException("EOF");
                }
                i += k;
                j -= k;
            }
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void queueBytes(int i, byte[] abyte0) throws IOException {
        if (this.closed) {
            return;
        }
        if (this.hasIOError) {
            this.hasIOError = false;
            throw new IOException("Error in writer thread");
        }
        if (this.buffer == null) {
            this.buffer = new byte[5000];
        }
        RSSocket rSSocket = this;
        synchronized (rSSocket) {
            for (int l = 0; l < i; ++l) {
                this.buffer[this.buffIndex] = abyte0[l];
                this.buffIndex = (this.buffIndex + 1) % 5000;
                if (this.buffIndex != (this.writeIndex + 4900) % 5000) continue;
                throw new IOException("buffer overflow");
            }
            if (!this.isWriter) {
                this.isWriter = true;
                this.rsApplet.startRunnable(this, 3);
            }
            this.notify();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        while (this.isWriter) {
            int j;
            int i;
            RSSocket rSSocket = this;
            synchronized (rSSocket) {
                if (this.buffIndex == this.writeIndex) {
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                }
                if (!this.isWriter) {
                    return;
                }
                j = this.writeIndex;
                i = this.buffIndex >= this.writeIndex ? this.buffIndex - this.writeIndex : 5000 - this.writeIndex;
            }
            if (i <= 0) continue;
            try {
                this.outputStream.write(this.buffer, j, i);
            }
            catch (IOException _ex) {
                this.hasIOError = true;
            }
            this.writeIndex = (this.writeIndex + i) % 5000;
            try {
                if (this.buffIndex != this.writeIndex) continue;
                this.outputStream.flush();
            }
            catch (IOException _ex) {
                this.hasIOError = true;
            }
        }
    }

    public void printDebug() {
        System.out.println("dummy:" + this.closed);
        System.out.println("tcycl:" + this.writeIndex);
        System.out.println("tnum:" + this.buffIndex);
        System.out.println("writer:" + this.isWriter);
        System.out.println("ioerror:" + this.hasIOError);
        try {
            System.out.println("available:" + this.available());
            return;
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}


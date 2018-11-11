/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.BufferedInputStream
 *  java.io.BufferedOutputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.DataInputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipInputStream
 *  java.util.zip.ZipOutputStream
 */
package com.imagineps.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public final class FileUtility {
    public static int totalRead = 0;
    public static int totalWrite = 0;
    public static int completeWrite = 0;

    private FileUtility() {
    }

    public static File getOrCreate(String filePath, String fileName) throws IOException {
        File directory = new File(filePath);
        if (!directory.exists() && !directory.mkdir()) {
            throw new IOException("Could not create path '" + filePath + "'");
        }
        File file = new File(directory, fileName);
        if (file.exists()) return file;
        if (file.createNewFile()) return file;
        throw new IOException("Could not create file '" + fileName + "'");
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public static void replaceData(File source, File target) throws IOException {
        block26 : {
            buffer = new byte[1024];
            in = new ZipInputStream((InputStream)new BufferedInputStream((InputStream)new FileInputStream(source)));
            var6_4 = null;
            try {
                out = new ZipOutputStream((OutputStream)new BufferedOutputStream((OutputStream)new FileOutputStream(target)));
                var8_8 = null;
                ** try [egrp 1[TRYBLOCK] [1, 2 : 61->148)] { 
lbl8: // 1 sources:
                break block26;
lbl9: // 1 sources:
                catch (Throwable bytes) {}
                ** GOTO lbl-1000
lbl11: // 1 sources:
                finally {
                    if (out != null) {
                        if (var8_8 != null) {
                            try {
                                out.close();
                            }
                            catch (Throwable bytes) {
                                var8_8.addSuppressed(bytes);
                            }
                        } else {
                            out.close();
                        }
                    }
                }
            }
            catch (Throwable out) {
                var6_4 = out;
                throw out;
            }
        }
        while ((entry = in.getNextEntry()) != null) {
            if (entry.isDirectory()) continue;
            bytes = new ByteArrayOutputStream();
            while ((length = in.read(buffer, 0, buffer.length)) > -1) {
                bytes.write(buffer, 0, length);
            }
            out.putNextEntry(entry);
            out.write(bytes.toByteArray());
            out.closeEntry();
        }
        out.finish();
        return;
        finally {
            if (in != null) {
                if (var6_4 != null) {
                    try {
                        in.close();
                    }
                    catch (Throwable out) {
                        var6_4.addSuppressed(out);
                    }
                } else {
                    in.close();
                }
            }
        }
lbl-1000: // 1 sources:
        {
            var8_8 = bytes;
            throw bytes;
        }
    }

    public static final byte[] readFile(String name) {
        try {
            File file = new File(name);
            int i = (int)file.length();
            byte[] abyte0 = new byte[i];
            DataInputStream datainputstream = new DataInputStream((InputStream)new BufferedInputStream((InputStream)new FileInputStream(name)));
            datainputstream.readFully(abyte0, 0, i);
            datainputstream.close();
            ++totalRead;
            return abyte0;
        }
        catch (Exception file) {
            return null;
        }
    }

    public static final void writeFile(String name, byte[] data) {
        try {
            new File(new File(name).getParent()).mkdirs();
            FileOutputStream fileoutputstream = new FileOutputStream(name);
            fileoutputstream.write(data, 0, data.length);
            fileoutputstream.close();
            ++totalWrite;
            ++completeWrite;
            return;
        }
        catch (Throwable throwable) {
            System.out.println("Write Error: " + name);
        }
    }
}


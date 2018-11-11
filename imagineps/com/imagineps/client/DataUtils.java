/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.DataOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.RandomAccessFile
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.MappedByteBuffer
 *  java.nio.channels.FileChannel
 *  java.nio.channels.FileChannel$MapMode
 *  java.nio.channels.ReadableByteChannel
 *  java.util.zip.CRC32
 *  java.util.zip.GZIPInputStream
 *  java.util.zip.GZIPOutputStream
 */
package com.imagineps.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class DataUtils {
    public static void copy(File file, File target) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream targetOutputStream = new FileOutputStream(target);
            FileChannel source = fileInputStream.getChannel();
            FileChannel destination = targetOutputStream.getChannel();
            destination.transferFrom((ReadableByteChannel)source, 0L, source.size());
            fileInputStream.close();
            targetOutputStream.close();
            source.close();
            destination.close();
            return;
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] readFile(String file) {
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            MappedByteBuffer buf = raf.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, raf.length());
            try {
                if (buf.hasArray()) {
                    byte[] arrby = buf.array();
                    return arrby;
                }
                byte[] array = new byte[buf.remaining()];
                buf.get(array);
                byte[] arrby = array;
                return arrby;
            }
            finally {
                raf.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeFile(String file, byte[] data) {
        try {
            if (data == null) return;
            FileOutputStream out = new FileOutputStream(file);
            out.write(data);
            out.close();
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getHash(String string) {
        int id = 0;
        string = string.toUpperCase();
        int j = 0;
        while (j < string.length()) {
            id = id * 61 + string.charAt(j) - 32;
            ++j;
        }
        return id;
    }

    public static int getCRC(byte[] data) {
        CRC32 crc = new CRC32();
        crc.update(data);
        return (int)crc.getValue();
    }

    public static byte[] decompressGZ(byte[] data) throws IOException {
        GZIPInputStream gzi = new GZIPInputStream((InputStream)new ByteArrayInputStream(data));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        do {
            int len;
            if ((len = gzi.read(buf)) <= 0) {
                out.close();
                return out.toByteArray();
            }
            out.write(buf, 0, len);
        } while (true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] compressGZ(byte[] data, int off, int len) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            GZIPOutputStream gzo = new GZIPOutputStream((OutputStream)bos);
            try {
                gzo.write(data, off, len);
                return bos.toByteArray();
            }
            finally {
                gzo.close();
                bos.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeString(DataOutputStream dat, String input) throws IOException {
        dat.write(input.getBytes());
        dat.writeByte(10);
    }

    public static void write3Bytes(DataOutputStream dat, int i) throws IOException {
        dat.write((int)((byte)(i >> 16)));
        dat.write((int)((byte)(i >> 8)));
        dat.write((int)((byte)i));
    }
}


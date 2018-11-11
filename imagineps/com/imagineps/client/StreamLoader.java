/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client;

import com.imagineps.client.Class13;
import com.imagineps.client.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class StreamLoader {
    private final byte[] aByteArray726;
    private final int dataSize;
    private final int[] anIntArray728;
    private final int[] anIntArray729;
    private final int[] anIntArray730;
    private final int[] anIntArray731;
    private final boolean aBoolean732;

    public StreamLoader(byte[] abyte0) {
        Stream stream = new Stream(abyte0);
        int i = stream.read3Bytes();
        int j = stream.read3Bytes();
        if (j != i) {
            byte[] abyte1 = new byte[i];
            Class13.method225(abyte1, i, abyte0, j, 6);
            this.aByteArray726 = abyte1;
            stream = new Stream(this.aByteArray726);
            this.aBoolean732 = true;
        } else {
            this.aByteArray726 = abyte0;
            this.aBoolean732 = false;
        }
        this.dataSize = stream.readUnsignedWord();
        this.anIntArray728 = new int[this.dataSize];
        this.anIntArray729 = new int[this.dataSize];
        this.anIntArray730 = new int[this.dataSize];
        this.anIntArray731 = new int[this.dataSize];
        int k = stream.currentOffset + this.dataSize * 10;
        int l = 0;
        while (l < this.dataSize) {
            this.anIntArray728[l] = stream.readDWord();
            this.anIntArray729[l] = stream.read3Bytes();
            this.anIntArray730[l] = stream.read3Bytes();
            this.anIntArray731[l] = k;
            k += this.anIntArray730[l];
            ++l;
        }
    }

    public byte[] getDataForName(String s) {
        byte[] abyte0;
        int k;
        block5 : {
            abyte0 = null;
            int i = 0;
            s = s.toUpperCase();
            for (int j = 0; j < s.length(); ++j) {
                i = i * 61 + s.charAt(j) - 32;
            }
            k = 0;
            while (k < this.dataSize) {
                if (this.anIntArray728[k] == i) {
                    if (abyte0 == null) {
                        abyte0 = new byte[this.anIntArray729[k]];
                    }
                    if (!this.aBoolean732) {
                        Class13.method225(abyte0, this.anIntArray729[k], this.aByteArray726, this.anIntArray730[k], this.anIntArray731[k]);
                        return abyte0;
                    }
                    break block5;
                }
                ++k;
            }
            return null;
        }
        System.arraycopy((Object)this.aByteArray726, (int)this.anIntArray731[k], (Object)abyte0, (int)0, (int)this.anIntArray729[k]);
        return abyte0;
    }

    public byte[] getBytesFromFile(File file) throws IOException {
        int offset;
        FileInputStream is = new FileInputStream(file);
        long length = file.length();
        if (length <= Integer.MAX_VALUE) {
            // empty if block
        }
        byte[] bytes = new byte[(int)length];
        int numRead = 0;
        for (offset = 0; offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0; offset += numRead) {
        }
        if (offset < bytes.length) {
            is.close();
            throw new IOException("Could not completely read file " + file.getName());
        }
        is.close();
        return bytes;
    }
}


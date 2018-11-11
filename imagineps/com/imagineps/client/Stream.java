/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.math.BigInteger
 */
package com.imagineps.client;

import com.imagineps.client.ISAACRandomGenerator;
import com.imagineps.client.Node;
import com.imagineps.client.NodeList;
import com.imagineps.client.NodeSub;
import com.imagineps.client.signlink.Signlink;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public final class Stream
extends NodeSub {
    private static final BigInteger RSA_MODULUS = new BigInteger("107335431950805922839351648656255176972123900124956664477714981412806649168073781331736475303975643786331899202382258864496163032791818145743830036353515250289272382204215345569891210508706994023367412810817455412646207104315081038799955435454303777799044942027829797468801034111851679615040266808142187655177");
    private static final BigInteger RSA_EXPONENT = new BigInteger("65537");
    private static final int[] anIntArray1409 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    private static int anInt1412;
    private static final NodeList nodeList;
    public byte[] buffer;
    public int currentOffset;
    public int bitPosition;
    public ISAACRandomGenerator encryption;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Stream create() {
        NodeList nodeList = Stream.nodeList;
        synchronized (nodeList) {
            Stream stream = null;
            if (anInt1412 > 0) {
                --anInt1412;
                stream = (Stream)Stream.nodeList.popHead();
                if (stream != null) {
                    stream.currentOffset = 0;
                    return stream;
                }
            }
            Stream stream_1 = new Stream();
            stream_1.currentOffset = 0;
            stream_1.buffer = new byte[5000];
            return stream_1;
        }
    }

    private Stream() {
    }

    public Stream(byte[] abyte0) {
        this.buffer = abyte0;
        this.currentOffset = 0;
    }

    public void createFrame(int i) {
        this.buffer[this.currentOffset++] = (byte)(i + this.encryption.getNextKey());
    }

    public void doKeys() {
        int i = this.currentOffset;
        this.currentOffset = 0;
        byte[] abyte0 = new byte[i];
        this.readBytes(i, 0, abyte0);
        byte[] rsa = abyte0;
        rsa = new BigInteger(abyte0).modPow(RSA_EXPONENT, RSA_MODULUS).toByteArray();
        this.currentOffset = 0;
        this.writeWordBigEndian(rsa.length);
        this.writeBytes(rsa, rsa.length, 0);
    }

    public void finishBitAccess() {
        this.currentOffset = (this.bitPosition + 7) / 8;
    }

    public void initBitAccess() {
        this.bitPosition = this.currentOffset * 8;
    }

    public String makeString(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void method400(int i) {
        this.buffer[this.currentOffset++] = (byte)i;
        this.buffer[this.currentOffset++] = (byte)(i >> 8);
    }

    public void method403(int j) {
        this.buffer[this.currentOffset++] = (byte)j;
        this.buffer[this.currentOffset++] = (byte)(j >> 8);
        this.buffer[this.currentOffset++] = (byte)(j >> 16);
        this.buffer[this.currentOffset++] = (byte)(j >> 24);
    }

    public int method421() {
        int i = this.buffer[this.currentOffset] & 255;
        if (i >= 128) return this.readUnsignedWord() - 49152;
        return this.readUnsignedByte() - 64;
    }

    public int method422() {
        int i = this.buffer[this.currentOffset] & 255;
        if (i >= 128) return this.readUnsignedWord() - 32768;
        return this.readUnsignedByte();
    }

    public void putNegativeByte(int val) {
        this.buffer[this.currentOffset++] = (byte)(- val);
    }

    public void method425(int j) {
        this.buffer[this.currentOffset++] = (byte)(128 - j);
    }

    public int method426() {
        return this.buffer[this.currentOffset++] - 128 & 255;
    }

    public int method427() {
        return - this.buffer[this.currentOffset++] & 255;
    }

    public int method428() {
        return 128 - this.buffer[this.currentOffset++] & 255;
    }

    public byte method429() {
        return - this.buffer[this.currentOffset++];
    }

    public byte method430() {
        return (byte)(128 - this.buffer[this.currentOffset++]);
    }

    public void putLEShort(long val) {
        this.buffer[this.currentOffset++] = (byte)val;
        this.buffer[this.currentOffset++] = (byte)(val >> 8);
    }

    public void method432(int j) {
        this.buffer[this.currentOffset++] = (byte)(j >> 8);
        this.buffer[this.currentOffset++] = (byte)(j + 128);
    }

    public void putLEShortA(int j) {
        this.buffer[this.currentOffset++] = (byte)(j + 128);
        this.buffer[this.currentOffset++] = (byte)(j >> 8);
    }

    public int method434() {
        this.currentOffset += 2;
        return ((this.buffer[this.currentOffset - 1] & 255) << 8) + (this.buffer[this.currentOffset - 2] & 255);
    }

    public int method435() {
        this.currentOffset += 2;
        return ((this.buffer[this.currentOffset - 2] & 255) << 8) + (this.buffer[this.currentOffset - 1] - 128 & 255);
    }

    public int method436() {
        this.currentOffset += 2;
        return ((this.buffer[this.currentOffset - 1] & 255) << 8) + (this.buffer[this.currentOffset - 2] - 128 & 255);
    }

    public int method437() {
        this.currentOffset += 2;
        int j = ((this.buffer[this.currentOffset - 1] & 255) << 8) + (this.buffer[this.currentOffset - 2] & 255);
        if (j <= 32767) return j;
        j -= 65536;
        return j;
    }

    public int method438() {
        this.currentOffset += 2;
        int j = ((this.buffer[this.currentOffset - 1] & 255) << 8) + (this.buffer[this.currentOffset - 2] - 128 & 255);
        if (j <= 32767) return j;
        j -= 65536;
        return j;
    }

    public int method439() {
        this.currentOffset += 4;
        return ((this.buffer[this.currentOffset - 2] & 255) << 24) + ((this.buffer[this.currentOffset - 1] & 255) << 16) + ((this.buffer[this.currentOffset - 4] & 255) << 8) + (this.buffer[this.currentOffset - 3] & 255);
    }

    public int method440() {
        this.currentOffset += 4;
        return ((this.buffer[this.currentOffset - 3] & 255) << 24) + ((this.buffer[this.currentOffset - 4] & 255) << 16) + ((this.buffer[this.currentOffset - 1] & 255) << 8) + (this.buffer[this.currentOffset - 2] & 255);
    }

    public void method441(int i, byte[] abyte0, int j) {
        int k = i + j - 1;
        while (k >= i) {
            this.buffer[this.currentOffset++] = (byte)(abyte0[k] + 128);
            --k;
        }
    }

    public void method442(int i, int j, byte[] abyte0) {
        int k = j + i - 1;
        while (k >= j) {
            abyte0[k] = this.buffer[this.currentOffset++];
            --k;
        }
    }

    public int read3Bytes() {
        this.currentOffset += 3;
        return ((this.buffer[this.currentOffset - 3] & 255) << 16) + ((this.buffer[this.currentOffset - 2] & 255) << 8) + (this.buffer[this.currentOffset - 1] & 255);
    }

    public int readBits(int i) {
        int k = this.bitPosition >> 3;
        int l = 8 - (this.bitPosition & 7);
        int i1 = 0;
        this.bitPosition += i;
        while (i > l) {
            i1 += (this.buffer[k++] & anIntArray1409[l]) << i - l;
            i -= l;
            l = 8;
        }
        if (i == l) {
            return i1 += this.buffer[k] & anIntArray1409[l];
        }
        i1 += this.buffer[k] >> l - i & anIntArray1409[i];
        return i1;
    }

    public int readWord() {
        int val = (this.getByte() << 8) + this.getByte();
        if (val <= 32767) return val;
        val -= 65536;
        return val;
    }

    public byte getByte() {
        return this.buffer[this.currentOffset++];
    }

    public byte[] readBytes() {
        int i = this.currentOffset;
        while (this.buffer[this.currentOffset++] != 10) {
        }
        byte[] abyte0 = new byte[this.currentOffset - i - 1];
        System.arraycopy((Object)this.buffer, (int)i, (Object)abyte0, (int)(i - i), (int)(this.currentOffset - 1 - i));
        return abyte0;
    }

    public void readBytes(int i, int j, byte[] abyte0) {
        int l = j;
        while (l < j + i) {
            abyte0[l] = this.buffer[this.currentOffset++];
            ++l;
        }
    }

    public int readDWord() {
        this.currentOffset += 4;
        return ((this.buffer[this.currentOffset - 4] & 255) << 24) + ((this.buffer[this.currentOffset - 3] & 255) << 16) + ((this.buffer[this.currentOffset - 2] & 255) << 8) + (this.buffer[this.currentOffset - 1] & 255);
    }

    public String readNewString() {
        int i = this.currentOffset;
        while (this.buffer[this.currentOffset++] != 0) {
        }
        return new String(this.buffer, i, this.currentOffset - i - 1);
    }

    public long readQWord() {
        long l = (long)this.readDWord() & 0xFFFFFFFFL;
        long l1 = (long)this.readDWord() & 0xFFFFFFFFL;
        return (l << 32) + l1;
    }

    public int readShort2() {
        this.currentOffset += 2;
        int i = ((this.buffer[this.currentOffset - 2] & 255) << 8) + (this.buffer[this.currentOffset - 1] & 255);
        if (i <= 32767) return i;
        i -= 65537;
        return i;
    }

    public byte readSignedByte() {
        return this.buffer[this.currentOffset++];
    }

    public int readSignedWord() {
        this.currentOffset += 2;
        int i = ((this.buffer[this.currentOffset - 2] & 255) << 8) + (this.buffer[this.currentOffset - 1] & 255);
        if (i <= 32767) return i;
        i -= 65536;
        return i;
    }

    public String readString() {
        int i = this.currentOffset;
        while (this.buffer[this.currentOffset++] != 10) {
        }
        return new String(this.buffer, i, this.currentOffset - i - 1);
    }

    public int readUnsignedByte() {
        return this.buffer[this.currentOffset++] & 255;
    }

    public int getUnsignedByte() {
        if (this.currentOffset + 1 <= this.buffer.length) return this.buffer[this.currentOffset++] & 255;
        this.currentOffset = this.buffer.length - 2;
        return this.buffer[this.currentOffset++] & 255;
    }

    public int readUnsignedWord() {
        this.currentOffset += 2;
        return ((this.buffer[this.currentOffset - 2] & 255) << 8) + (this.buffer[this.currentOffset - 1] & 255);
    }

    public int readUSmart2() {
        int baseVal = 0;
        int lastVal = 0;
        while ((lastVal = this.method422()) == 32767) {
            baseVal += 32767;
        }
        return baseVal + lastVal;
    }

    final int v(int i) {
        this.currentOffset += 3;
        return (255 & this.buffer[this.currentOffset - 3] << 16) + (255 & this.buffer[this.currentOffset - 2] << 8) + (255 & this.buffer[this.currentOffset - 1]);
    }

    public void writeBytes(byte[] abyte0, int i, int j) {
        int k = j;
        while (k < j + i) {
            this.buffer[this.currentOffset++] = abyte0[k];
            ++k;
        }
    }

    public void writeBytes(int i) {
        this.buffer[this.currentOffset - i - 1] = (byte)i;
    }

    public void writeDWord(int i) {
        this.buffer[this.currentOffset++] = (byte)(i >> 24);
        this.buffer[this.currentOffset++] = (byte)(i >> 16);
        this.buffer[this.currentOffset++] = (byte)(i >> 8);
        this.buffer[this.currentOffset++] = (byte)i;
    }

    public void writeDWordBigEndian(int i) {
        this.buffer[this.currentOffset++] = (byte)(i >> 16);
        this.buffer[this.currentOffset++] = (byte)(i >> 8);
        this.buffer[this.currentOffset++] = (byte)i;
    }

    public void writeQWord(long l) {
        try {
            this.buffer[this.currentOffset++] = (byte)(l >> 56);
            this.buffer[this.currentOffset++] = (byte)(l >> 48);
            this.buffer[this.currentOffset++] = (byte)(l >> 40);
            this.buffer[this.currentOffset++] = (byte)(l >> 32);
            this.buffer[this.currentOffset++] = (byte)(l >> 24);
            this.buffer[this.currentOffset++] = (byte)(l >> 16);
            this.buffer[this.currentOffset++] = (byte)(l >> 8);
            this.buffer[this.currentOffset++] = (byte)l;
            return;
        }
        catch (RuntimeException runtimeexception) {
            Signlink.reporterror("14395, 5, " + l + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void writeString(String s) {
        System.arraycopy((Object)s.getBytes(), (int)0, (Object)this.buffer, (int)this.currentOffset, (int)s.length());
        this.currentOffset += s.length();
        this.buffer[this.currentOffset++] = 10;
    }

    public void writeWord(int i) {
        this.buffer[this.currentOffset++] = (byte)(i >> 8);
        this.buffer[this.currentOffset++] = (byte)i;
    }

    public void writeWordBigEndian(int i) {
        this.buffer[this.currentOffset++] = (byte)i;
    }

    public int readBigSmart() {
        if (~ this.buffer[this.currentOffset] > -1) return this.readInt() & Integer.MAX_VALUE;
        int value = this.readUnsignedWord();
        if (value != 32767) return value;
        return -1;
    }

    public int readInt() {
        this.currentOffset += 4;
        return ((this.buffer[this.currentOffset - 4] & 255) << 24) + ((this.buffer[this.currentOffset - 3] & 255) << 16) + ((this.buffer[this.currentOffset - 2] & 255) << 8) + (this.buffer[this.currentOffset - 1] & 255);
    }

    public byte readByte() {
        return this.buffer[this.currentOffset++];
    }

    public final int getMediumInt() {
        this.currentOffset += 3;
        return (255 & this.buffer[this.currentOffset - 1]) + ((this.buffer[this.currentOffset - 3] << 16 & 16711680) + (65280 & this.buffer[this.currentOffset - 2] << 8));
    }

    public void skip(int length) {
        this.currentOffset += length;
    }

    public int readUnsigned() {
        return this.buffer[this.currentOffset++] & 255;
    }

    public int readUnsignedSmart() {
        int i = this.buffer[this.currentOffset] & 255;
        if (i >= 128) return this.readUnsignedWord() - 32768;
        return this.readUnsigned();
    }

    public int readMedium() {
        this.currentOffset += 3;
        return (this.buffer[this.currentOffset - 3] & 255) << 16 | (this.buffer[this.currentOffset - 2] & 255) << 8 | this.buffer[this.currentOffset - 1] & 255;
    }

    public String readLine() {
        int begin = this.currentOffset;
        while (this.buffer[this.currentOffset++] != 10) {
        }
        return new String(this.buffer, begin, this.currentOffset - begin - 1);
    }

    static {
        nodeList = new NodeList();
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.imagineps.client.graphics;

import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.graphics.DrawingArea;

public final class Background
extends DrawingArea {
    public byte[] aByteArray1450;
    public final int[] anIntArray1451;
    public int anInt1452;
    public int anInt1453;
    public int anInt1454;
    public int anInt1455;
    public int anInt1456;
    private int anInt1457;

    public Background(StreamLoader streamLoader, String s, int i) {
        Stream stream = new Stream(streamLoader.getDataForName(s + ".dat"));
        Stream stream_1 = new Stream(streamLoader.getDataForName("index.dat"));
        stream_1.currentOffset = stream.readUnsignedWord();
        this.anInt1456 = stream_1.readUnsignedWord();
        this.anInt1457 = stream_1.readUnsignedWord();
        int j = stream_1.readUnsignedByte();
        this.anIntArray1451 = new int[j];
        for (int k = 0; k < j - 1; ++k) {
            this.anIntArray1451[k + 1] = stream_1.read3Bytes();
        }
        for (int l = 0; l < i; ++stream_1.currentOffset, stream.currentOffset += stream_1.readUnsignedWord() * stream_1.readUnsignedWord(), ++stream_1.currentOffset, ++l) {
            stream_1.currentOffset += 2;
        }
        this.anInt1454 = stream_1.readUnsignedByte();
        this.anInt1455 = stream_1.readUnsignedByte();
        this.anInt1452 = stream_1.readUnsignedWord();
        this.anInt1453 = stream_1.readUnsignedWord();
        int i1 = stream_1.readUnsignedByte();
        int j1 = this.anInt1452 * this.anInt1453;
        this.aByteArray1450 = new byte[j1];
        if (i1 == 0) {
            int k1 = 0;
            while (k1 < j1) {
                this.aByteArray1450[k1] = stream.readSignedByte();
                ++k1;
            }
            return;
        }
        if (i1 != 1) return;
        int l1 = 0;
        while (l1 < this.anInt1452) {
            for (int i2 = 0; i2 < this.anInt1453; ++i2) {
                this.aByteArray1450[l1 + i2 * this.anInt1452] = stream.readSignedByte();
            }
            ++l1;
        }
    }

    public void method357() {
        if (this.anInt1452 == this.anInt1456 && this.anInt1453 == this.anInt1457) {
            return;
        }
        byte[] abyte0 = new byte[this.anInt1456 * this.anInt1457];
        int i = 0;
        int j = 0;
        do {
            if (j >= this.anInt1453) {
                this.aByteArray1450 = abyte0;
                this.anInt1452 = this.anInt1456;
                this.anInt1453 = this.anInt1457;
                this.anInt1454 = 0;
                this.anInt1455 = 0;
                return;
            }
            for (int k = 0; k < this.anInt1452; ++k) {
                abyte0[k + this.anInt1454 + (j + this.anInt1455) * this.anInt1456] = this.aByteArray1450[i++];
            }
            ++j;
        } while (true);
    }

    public void method360(int i, int j, int k) {
        int i1 = 0;
        while (i1 < this.anIntArray1451.length) {
            int j1 = this.anIntArray1451[i1] >> 16 & 255;
            if ((j1 += i) < 0) {
                j1 = 0;
            } else if (j1 > 255) {
                j1 = 255;
            }
            int k1 = this.anIntArray1451[i1] >> 8 & 255;
            if ((k1 += j) < 0) {
                k1 = 0;
            } else if (k1 > 255) {
                k1 = 255;
            }
            int l1 = this.anIntArray1451[i1] & 255;
            if ((l1 += k) < 0) {
                l1 = 0;
            } else if (l1 > 255) {
                l1 = 255;
            }
            this.anIntArray1451[i1] = (j1 << 16) + (k1 << 8) + l1;
            ++i1;
        }
    }

    public void drawBackground(int i, int k) {
        int l = (i += this.anInt1454) + (k += this.anInt1455) * DrawingArea.width;
        int i1 = 0;
        int j1 = this.anInt1453;
        int k1 = this.anInt1452;
        int l1 = DrawingArea.width - k1;
        int i2 = 0;
        if (k < DrawingArea.topY) {
            int j2 = DrawingArea.topY - k;
            j1 -= j2;
            k = DrawingArea.topY;
            i1 += j2 * k1;
            l += j2 * DrawingArea.width;
        }
        if (k + j1 > DrawingArea.bottomY) {
            j1 -= k + j1 - DrawingArea.bottomY;
        }
        if (i < DrawingArea.topX) {
            int k2 = DrawingArea.topX - i;
            k1 -= k2;
            i = DrawingArea.topX;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if (i + k1 > DrawingArea.bottomX) {
            int l2 = i + k1 - DrawingArea.bottomX;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if (k1 <= 0) return;
        if (j1 <= 0) return;
        this.method362(j1, DrawingArea.pixels, this.aByteArray1450, l1, l, k1, i1, this.anIntArray1451, i2);
    }

    private void method362(int i, int[] ai, byte[] abyte0, int j, int k, int l, int i1, int[] ai1, int j1) {
        int k1 = - (l >> 2);
        l = - (l & 3);
        int l1 = - i;
        while (l1 < 0) {
            for (int i2 = k1; i2 < 0; ++i2) {
                byte byte1;
                if ((byte1 = abyte0[i1++]) != 0) {
                    ai[k++] = ai1[byte1 & 255];
                } else {
                    ++k;
                }
                byte1 = abyte0[i1++];
                if (byte1 != 0) {
                    ai[k++] = ai1[byte1 & 255];
                } else {
                    ++k;
                }
                byte1 = abyte0[i1++];
                if (byte1 != 0) {
                    ai[k++] = ai1[byte1 & 255];
                } else {
                    ++k;
                }
                byte1 = abyte0[i1++];
                if (byte1 != 0) {
                    ai[k++] = ai1[byte1 & 255];
                    continue;
                }
                ++k;
            }
            for (int j2 = l; j2 < 0; ++j2) {
                byte byte2;
                if ((byte2 = abyte0[i1++]) != 0) {
                    ai[k++] = ai1[byte2 & 255];
                    continue;
                }
                ++k;
            }
            k += j;
            i1 += j1;
            ++l1;
        }
    }
}


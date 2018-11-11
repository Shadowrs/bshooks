/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Random
 */
package com.imagineps.client;

import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.graphics.DrawingArea;
import java.util.Random;

public final class TextDrawingArea
extends DrawingArea {
    public byte[][] aByteArrayArray1491;
    public int[] anIntArray1492;
    public int[] anIntArray1493;
    public int[] anIntArray1494;
    public int[] anIntArray1495;
    public int[] anIntArray1496;
    public int anInt1497;
    public Random aRandom1498;
    public boolean aBoolean1499;

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public TextDrawingArea(boolean flag, String s, StreamLoader streamLoader) {
        block15 : {
            block16 : {
                super();
                try {
                    length = s.equals((Object)"hit_full") == false && s.equals((Object)"critical_full") == false ? 256 : 58;
                    this.aByteArrayArray1491 = new byte[length][];
                    this.anIntArray1492 = new int[length];
                    this.anIntArray1493 = new int[length];
                    this.anIntArray1494 = new int[length];
                    this.anIntArray1495 = new int[length];
                    this.anIntArray1496 = new int[length];
                    this.aRandom1498 = new Random();
                    this.aBoolean1499 = false;
                    stream = new Stream(streamLoader.getDataForName(s + ".dat"));
                    stream_1 = new Stream(streamLoader.getDataForName("index.dat"));
                    stream_1.currentOffset = stream.readUnsignedWord() + 4;
                    k = stream_1.readUnsignedByte();
                    if (k > 0) {
                        stream_1.currentOffset += 3 * (k - 1);
                    }
                    l = 0;
lbl19: // 2 sources:
                    if (l < length) {
                        this.anIntArray1494[l] = stream_1.readUnsignedByte();
                        this.anIntArray1495[l] = stream_1.readUnsignedByte();
                        i1 = this.anIntArray1492[l] = stream_1.readUnsignedWord();
                        j1 = this.anIntArray1493[l] = stream_1.readUnsignedWord();
                        k1 = stream_1.readUnsignedByte();
                        l1 = i1 * j1;
                        this.aByteArrayArray1491[l] = new byte[l1];
                        if (k1 == 0) {
                            for (i2 = 0; i2 < l1; ++i2) {
                                this.aByteArrayArray1491[l][i2] = stream.readSignedByte();
                            }
                            break block15;
                        }
                        if (k1 != 1) break block15;
                        break block16;
                    }
                    if (flag) {
                        this.anIntArray1496[32] = this.anIntArray1496[73];
                        return;
                    }
                    this.anIntArray1496[32] = this.anIntArray1496[105];
                    return;
                }
                catch (Exception length) {
                    // empty catch block
                }
                return;
            }
            for (j2 = 0; j2 < i1; ++j2) {
                for (l2 = 0; l2 < j1; ++l2) {
                    this.aByteArrayArray1491[l][j2 + l2 * i1] = stream.readSignedByte();
                }
            }
        }
        if (j1 > this.anInt1497 && l < 128) {
            this.anInt1497 = j1;
        }
        this.anIntArray1494[l] = 1;
        this.anIntArray1496[l] = i1 + 2;
        k2 = 0;
        for (i3 = j1 / 7; i3 < j1; k2 += this.aByteArrayArray1491[l][i3 * i1], ++i3) {
        }
        if (k2 <= j1 / 7) {
            v0 = this.anIntArray1496;
            v1 = l;
            v0[v1] = v0[v1] - 1;
            this.anIntArray1494[l] = 0;
        }
        k2 = 0;
        for (j3 = j1 / 7; j3 < j1; k2 += this.aByteArrayArray1491[l][i1 - 1 + j3 * i1], ++j3) {
        }
        if (k2 <= j1 / 7) {
            v2 = this.anIntArray1496;
            v3 = l;
            v2[v3] = v2[v3] - 1;
        }
        ++l;
        ** GOTO lbl19
    }

    public void method380(String s, int i, int j, int k) {
        this.method385(j, s, k, i - this.method384(s));
    }

    public void drawText(int i, String s, int k, int l) {
        this.method385(i, s, k, l - this.method384(s) / 2);
    }

    public void drawCenteredText(int color, int x, String s, int y, boolean flag) {
        this.method389(flag, x - this.getTextWidth(s) / 2, color, s, y);
    }

    public void drawText(boolean flag, int i, int j, String s, int l) {
        this.method389(flag, j - this.getTextWidth(s) / 2, i, s, l);
    }

    public void drawChatInput(int i, int j, String s, int l, boolean flag) {
        this.method389(flag, j, i, s, l);
    }

    public int getTextWidth(String s) {
        if (s == null) {
            return 0;
        }
        int j = 0;
        int k = 0;
        while (k < s.length()) {
            if (s.charAt(k) == '@' && k + 4 < s.length() && s.charAt(k + 4) == '@') {
                k += 4;
            } else {
                j += this.anIntArray1496[s.charAt(k)];
            }
            ++k;
        }
        return j;
    }

    public int method384(String s) {
        if (s == null) {
            return 0;
        }
        int j = 0;
        int k = 0;
        while (k < s.length()) {
            j += this.anIntArray1496[s.charAt(k)];
            ++k;
        }
        return j;
    }

    public void method385(int i, String s, int j, int l) {
        if (s == null) {
            return;
        }
        j -= this.anInt1497;
        int i1 = 0;
        while (i1 < s.length()) {
            char c = s.charAt(i1);
            if (c != ' ') {
                this.method392(this.aByteArrayArray1491[c], l + this.anIntArray1494[c], j + this.anIntArray1495[c], this.anIntArray1492[c], this.anIntArray1493[c], i);
            }
            l += this.anIntArray1496[c];
            ++i1;
        }
    }

    public void method386(int i, String s, int j, int k, int l) {
        if (s == null) {
            return;
        }
        j -= this.method384(s) / 2;
        l -= this.anInt1497;
        int i1 = 0;
        while (i1 < s.length()) {
            char c = s.charAt(i1);
            if (c != ' ') {
                this.method392(this.aByteArrayArray1491[c], j + this.anIntArray1494[c], l + this.anIntArray1495[c] + (int)(Math.sin((double)((double)i1 / 2.0 + (double)k / 5.0)) * 5.0), this.anIntArray1492[c], this.anIntArray1493[c], i);
            }
            j += this.anIntArray1496[c];
            ++i1;
        }
    }

    public void method387(int i, String s, int j, int k, int l) {
        if (s == null) {
            return;
        }
        i -= this.method384(s) / 2;
        k -= this.anInt1497;
        int i1 = 0;
        while (i1 < s.length()) {
            char c = s.charAt(i1);
            if (c != ' ') {
                this.method392(this.aByteArrayArray1491[c], i + this.anIntArray1494[c] + (int)(Math.sin((double)((double)i1 / 5.0 + (double)j / 5.0)) * 5.0), k + this.anIntArray1495[c] + (int)(Math.sin((double)((double)i1 / 3.0 + (double)j / 5.0)) * 5.0), this.anIntArray1492[c], this.anIntArray1493[c], l);
            }
            i += this.anIntArray1496[c];
            ++i1;
        }
    }

    public void method388(int i, String s, int j, int k, int l, int i1) {
        if (s == null) {
            return;
        }
        double d = 7.0 - (double)i / 8.0;
        if (d < 0.0) {
            d = 0.0;
        }
        l -= this.method384(s) / 2;
        k -= this.anInt1497;
        int k1 = 0;
        while (k1 < s.length()) {
            char c = s.charAt(k1);
            if (c != ' ') {
                this.method392(this.aByteArrayArray1491[c], l + this.anIntArray1494[c], k + this.anIntArray1495[c] + (int)(Math.sin((double)((double)k1 / 1.5 + (double)j)) * d), this.anIntArray1492[c], this.anIntArray1493[c], i1);
            }
            l += this.anIntArray1496[c];
            ++k1;
        }
    }

    public void method389(boolean flag1, int i, int j, String s, int k) {
        this.aBoolean1499 = false;
        int l = i;
        if (s == null) {
            return;
        }
        k -= this.anInt1497;
        int i1 = 0;
        do {
            if (i1 >= s.length()) {
                if (!this.aBoolean1499) return;
                DrawingArea.method339(k + (int)((double)this.anInt1497 * 0.7), 8388608, i - l, l);
                return;
            }
            if (s.charAt(i1) == '@' && i1 + 4 < s.length() && s.charAt(i1 + 4) == '@') {
                int j1 = this.getColorByName(s.substring(i1 + 1, i1 + 4));
                if (j1 != -1) {
                    j = j1;
                }
                i1 += 4;
            } else {
                char c = s.charAt(i1);
                if (c != ' ') {
                    if (flag1) {
                        this.method392(this.aByteArrayArray1491[c], i + this.anIntArray1494[c] + 1, k + this.anIntArray1495[c] + 1, this.anIntArray1492[c], this.anIntArray1493[c], 0);
                    }
                    this.method392(this.aByteArrayArray1491[c], i + this.anIntArray1494[c], k + this.anIntArray1495[c], this.anIntArray1492[c], this.anIntArray1493[c], j);
                }
                i += this.anIntArray1496[c];
            }
            ++i1;
        } while (true);
    }

    public void method390(int i, int j, String s, int k, int i1) {
        if (s == null) {
            return;
        }
        this.aRandom1498.setSeed((long)k);
        int j1 = 192 + (this.aRandom1498.nextInt() & 31);
        i1 -= this.anInt1497;
        int k1 = 0;
        while (k1 < s.length()) {
            if (s.charAt(k1) == '@' && k1 + 4 < s.length() && s.charAt(k1 + 4) == '@') {
                int l1 = this.getColorByName(s.substring(k1 + 1, k1 + 4));
                if (l1 != -1) {
                    j = l1;
                }
                k1 += 4;
            } else {
                char c = s.charAt(k1);
                if (c != ' ') {
                    this.method394(192, i + this.anIntArray1494[c] + 1, this.aByteArrayArray1491[c], this.anIntArray1492[c], i1 + this.anIntArray1495[c] + 1, this.anIntArray1493[c], 0);
                    this.method394(j1, i + this.anIntArray1494[c], this.aByteArrayArray1491[c], this.anIntArray1492[c], i1 + this.anIntArray1495[c], this.anIntArray1493[c], j);
                }
                i += this.anIntArray1496[c];
                if ((this.aRandom1498.nextInt() & 3) == 0) {
                    ++i;
                }
            }
            ++k1;
        }
    }

    public int getColorByName(String s) {
        if (s.equals((Object)"369")) {
            return 3368601;
        }
        if (s.equals((Object)"mon")) {
            return 65408;
        }
        if (s.equals((Object)"red")) {
            return 16711680;
        }
        if (s.equals((Object)"gre")) {
            return 65280;
        }
        if (s.equals((Object)"blu")) {
            return 255;
        }
        if (s.equals((Object)"yel")) {
            return 16776960;
        }
        if (s.equals((Object)"cya")) {
            return 65535;
        }
        if (s.equals((Object)"mag")) {
            return 16711935;
        }
        if (s.equals((Object)"whi")) {
            return 16777215;
        }
        if (s.equals((Object)"bla")) {
            return 0;
        }
        if (s.equals((Object)"lre")) {
            return 16748608;
        }
        if (s.equals((Object)"dre")) {
            return 8388608;
        }
        if (s.equals((Object)"dbl")) {
            return 128;
        }
        if (s.equals((Object)"or1")) {
            return 16756736;
        }
        if (s.equals((Object)"or2")) {
            return 16740352;
        }
        if (s.equals((Object)"or3")) {
            return 16723968;
        }
        if (s.equals((Object)"gr1")) {
            return 12648192;
        }
        if (s.equals((Object)"gr2")) {
            return 8453888;
        }
        if (s.equals((Object)"gr3")) {
            return 4259584;
        }
        if (s.equals((Object)"ddr")) {
            return 6425344;
        }
        if (s.equals((Object)"dom")) {
            return 13500415;
        }
        if (s.equals((Object)"adm")) {
            return 16776960;
        }
        if (s.equals((Object)"sup")) {
            return 9466588;
        }
        if (s.equals((Object)"sat")) {
            return 138;
        }
        if (s.equals((Object)"str")) {
            this.aBoolean1499 = true;
        }
        if (!s.equals((Object)"end")) return -1;
        this.aBoolean1499 = false;
        return -1;
    }

    private void method392(byte[] abyte0, int i, int j, int k, int l, int i1) {
        int j1 = i + j * width;
        int k1 = width - k;
        int l1 = 0;
        int i2 = 0;
        if (j < topY) {
            int j2 = topY - j;
            l -= j2;
            j = topY;
            i2 += j2 * k;
            j1 += j2 * width;
        }
        if (j + l >= bottomY) {
            l -= j + l - bottomY;
        }
        if (i < topX) {
            int k2 = topX - i;
            k -= k2;
            i = topX;
            i2 += k2;
            j1 += k2;
            l1 += k2;
            k1 += k2;
        }
        if (i + k >= bottomX) {
            int l2 = i + k - bottomX;
            k -= l2;
            l1 += l2;
            k1 += l2;
        }
        if (k <= 0) return;
        if (l <= 0) return;
        this.method393(pixels, abyte0, i1, i2, j1, k, l, k1, l1);
    }

    private void method393(int[] ai, byte[] abyte0, int i, int j, int k, int l, int i1, int j1, int k1) {
        int l1 = - (l >> 2);
        l = - (l & 3);
        int i2 = - i1;
        while (i2 < 0) {
            for (int j2 = l1; j2 < 0; ++j2) {
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                } else {
                    ++k;
                }
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                } else {
                    ++k;
                }
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                } else {
                    ++k;
                }
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                    continue;
                }
                ++k;
            }
            for (int k2 = l; k2 < 0; ++k2) {
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                    continue;
                }
                ++k;
            }
            k += j1;
            j += k1;
            ++i2;
        }
    }

    private void method394(int i, int j, byte[] abyte0, int k, int l, int i1, int j1) {
        int k1 = j + l * width;
        int l1 = width - k;
        int i2 = 0;
        int j2 = 0;
        if (l < topY) {
            int k2 = topY - l;
            i1 -= k2;
            l = topY;
            j2 += k2 * k;
            k1 += k2 * width;
        }
        if (l + i1 >= bottomY) {
            i1 -= l + i1 - bottomY;
        }
        if (j < topX) {
            int l2 = topX - j;
            k -= l2;
            j = topX;
            j2 += l2;
            k1 += l2;
            i2 += l2;
            l1 += l2;
        }
        if (j + k >= bottomX) {
            int i3 = j + k - bottomX;
            k -= i3;
            i2 += i3;
            l1 += i3;
        }
        if (k <= 0) return;
        if (i1 <= 0) {
            return;
        }
        this.method395(abyte0, i1, k1, pixels, j2, k, i2, l1, j1, i);
    }

    private void method395(byte[] abyte0, int i, int j, int[] ai, int l, int i1, int j1, int k1, int l1, int i2) {
        l1 = ((l1 & 16711935) * i2 & -16711936) + ((l1 & 65280) * i2 & 16711680) >> 8;
        i2 = 256 - i2;
        int j2 = - i;
        while (j2 < 0) {
            for (int k2 = - i1; k2 < 0; ++k2) {
                if (abyte0[l++] != 0) {
                    int l2 = ai[j];
                    ai[j++] = (((l2 & 16711935) * i2 & -16711936) + ((l2 & 65280) * i2 & 16711680) >> 8) + l1;
                    continue;
                }
                ++j;
            }
            j += k1;
            l += j1;
            ++j2;
        }
    }

    public void drawTextUncentered(String text, int color, int x, int y) {
        this.method385(color, text, y, x);
    }
}


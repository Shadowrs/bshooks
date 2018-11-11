/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client;

import com.imagineps.client.Class6;
import com.imagineps.client.Stream;

final class Sounds {
    private static final Sounds[] aSoundsArray325s = new Sounds[5000];
    public static final int[] anIntArray326 = new int[5000];
    private static byte[] aByteArray327;
    private static Stream aStream_328;
    private final Class6[] aClass6Array329 = new Class6[10];
    private int anInt330;
    private int anInt331;

    private Sounds() {
    }

    public static void unpack(Stream stream) {
        aByteArray327 = new byte[441000];
        aStream_328 = new Stream(aByteArray327);
        Class6.method166();
        int j;
        while ((j = stream.readUnsignedWord()) != 65535) {
            Sounds.aSoundsArray325s[j] = new Sounds();
            aSoundsArray325s[j].method242(stream);
            Sounds.anIntArray326[j] = aSoundsArray325s[j].method243();
        }
        return;
    }

    public static Stream method241(int i, int j) {
        if (aSoundsArray325s[j] == null) return null;
        Sounds sounds = aSoundsArray325s[j];
        return sounds.method244(i);
    }

    private void method242(Stream stream) {
        int i = 0;
        do {
            if (i >= 10) {
                this.anInt330 = stream.readUnsignedWord();
                this.anInt331 = stream.readUnsignedWord();
                return;
            }
            int j = stream.readUnsignedByte();
            if (j != 0) {
                --stream.currentOffset;
                this.aClass6Array329[i] = new Class6();
                this.aClass6Array329[i].method169(stream);
            }
            ++i;
        } while (true);
    }

    private int method243() {
        int j = 9999999;
        for (int k = 0; k < 10; ++k) {
            if (this.aClass6Array329[k] == null || this.aClass6Array329[k].anInt114 / 20 >= j) continue;
            j = this.aClass6Array329[k].anInt114 / 20;
        }
        if (this.anInt330 < this.anInt331 && this.anInt330 / 20 < j) {
            j = this.anInt330 / 20;
        }
        if (j == 9999999) return 0;
        if (j == 0) {
            return 0;
        }
        int l = 0;
        do {
            if (l >= 10) {
                if (this.anInt330 >= this.anInt331) return j;
                this.anInt330 -= j * 20;
                this.anInt331 -= j * 20;
                return j;
            }
            if (this.aClass6Array329[l] != null) {
                this.aClass6Array329[l].anInt114 -= j * 20;
            }
            ++l;
        } while (true);
    }

    private Stream method244(int i) {
        int k = this.method245(i);
        Sounds.aStream_328.currentOffset = 0;
        aStream_328.writeDWord(1380533830);
        aStream_328.method403(36 + k);
        aStream_328.writeDWord(1463899717);
        aStream_328.writeDWord(1718449184);
        aStream_328.method403(16);
        aStream_328.method400(1);
        aStream_328.method400(1);
        aStream_328.method403(22050);
        aStream_328.method403(22050);
        aStream_328.method400(1);
        aStream_328.method400(8);
        aStream_328.writeDWord(1684108385);
        aStream_328.method403(k);
        Sounds.aStream_328.currentOffset += k;
        return aStream_328;
    }

    private int method245(int i) {
        int j = 0;
        int k = 0;
        while (k < 10) {
            if (this.aClass6Array329[k] != null && this.aClass6Array329[k].anInt113 + this.aClass6Array329[k].anInt114 > j) {
                j = this.aClass6Array329[k].anInt113 + this.aClass6Array329[k].anInt114;
            }
            ++k;
        }
        return 0;
    }
}


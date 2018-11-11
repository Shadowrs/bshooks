/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client;

import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import java.io.PrintStream;

public final class Varp {
    public static Varp[] cache;
    private static int anInt702;
    private static int[] anIntArray703;
    public int anInt709;
    public boolean aBoolean713 = false;

    public static void unpackConfig(StreamLoader streamLoader) {
        Stream stream = new Stream(streamLoader.getDataForName("varp.dat"));
        anInt702 = 0;
        int cacheSize = stream.readUnsignedWord();
        if (cache == null) {
            cache = new Varp[cacheSize];
        }
        if (anIntArray703 == null) {
            anIntArray703 = new int[cacheSize];
        }
        int j = 0;
        do {
            if (j >= cacheSize) {
                if (stream.currentOffset == stream.buffer.length) return;
                System.out.println("varptype load mismatch");
                return;
            }
            if (cache[j] == null) {
                Varp.cache[j] = new Varp();
            }
            cache[j].readValues(stream, j);
            ++j;
        } while (true);
    }

    private void readValues(Stream stream, int i) {
        int j;
        while ((j = stream.readUnsignedByte()) != 0) {
            if (j == 1) {
                stream.readUnsignedByte();
                continue;
            }
            if (j == 2) {
                stream.readUnsignedByte();
                continue;
            }
            if (j == 3) {
                Varp.anIntArray703[Varp.anInt702++] = i;
                continue;
            }
            if (j == 4) continue;
            if (j == 5) {
                this.anInt709 = stream.readUnsignedWord();
                continue;
            }
            if (j == 6) continue;
            if (j == 7) {
                stream.readDWord();
                continue;
            }
            if (j == 8) {
                this.aBoolean713 = true;
                continue;
            }
            if (j == 10) {
                stream.readString();
                continue;
            }
            if (j == 11) {
                this.aBoolean713 = true;
                continue;
            }
            if (j == 12) {
                stream.readDWord();
                continue;
            }
            if (j == 13) continue;
            System.out.println("Error unrecognised config code: " + j);
        }
        return;
    }

    private Varp() {
    }
}


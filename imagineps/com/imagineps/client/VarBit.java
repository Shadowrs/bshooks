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
import com.imagineps.client.Varp;
import java.io.PrintStream;

public final class VarBit {
    public static VarBit[] cache;
    public int anInt648;
    public int anInt649;
    public int anInt650;
    private boolean aBoolean651 = false;

    public static void unpackConfig(StreamLoader streamLoader) {
        Stream stream = new Stream(streamLoader.getDataForName("varbit.dat"));
        int cacheSize = stream.readUnsignedWord();
        if (cache == null) {
            cache = new VarBit[cacheSize];
        }
        int j = 0;
        do {
            if (j >= cacheSize) {
                if (stream.currentOffset == stream.buffer.length) return;
                System.out.println("varbit load mismatch");
                return;
            }
            if (cache[j] == null) {
                VarBit.cache[j] = new VarBit();
            }
            cache[j].readValues(stream);
            if (VarBit.cache[j].aBoolean651) {
                Varp.cache[VarBit.cache[j].anInt648].aBoolean713 = true;
            }
            ++j;
        } while (true);
    }

    private void readValues(Stream stream) {
        int j;
        while ((j = stream.readUnsignedByte()) != 0) {
            if (j == 1) {
                this.anInt648 = stream.readUnsignedWord();
                this.anInt649 = stream.readUnsignedByte();
                this.anInt650 = stream.readUnsignedByte();
                continue;
            }
            if (j == 10) {
                stream.readString();
                continue;
            }
            if (j == 2) {
                this.aBoolean651 = true;
                continue;
            }
            if (j == 3) {
                stream.readDWord();
                continue;
            }
            if (j == 4) {
                stream.readDWord();
                continue;
            }
            System.out.println("Error unrecognised config code: " + j);
        }
        return;
    }

    private VarBit() {
    }
}


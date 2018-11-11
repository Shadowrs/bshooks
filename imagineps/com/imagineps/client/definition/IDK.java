/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client.definition;

import com.imagineps.client.Model;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import java.io.PrintStream;

public final class IDK {
    public static int length;
    public static IDK[] cache;
    public int anInt657 = -1;
    private int[] anIntArray658;
    private final int[] anIntArray659 = new int[6];
    private final int[] anIntArray660 = new int[6];
    private final int[] anIntArray661 = new int[]{-1, -1, -1, -1, -1};
    public boolean aBoolean662 = false;

    public static void unpackConfig(StreamLoader streamLoader) {
        Stream stream = new Stream(streamLoader.getDataForName("idk.dat"));
        length = stream.readUnsignedWord();
        if (cache == null) {
            cache = new IDK[length];
        }
        int j = 0;
        while (j < length) {
            if (cache[j] == null) {
                IDK.cache[j] = new IDK();
            }
            cache[j].readValues(stream);
            ++j;
        }
    }

    private void readValues(Stream stream) {
        int i;
        block0 : while ((i = stream.readUnsignedByte()) != 0) {
            if (i == 1) {
                this.anInt657 = stream.readUnsignedByte();
                continue;
            }
            if (i == 2) {
                int j = stream.readUnsignedByte();
                this.anIntArray658 = new int[j];
                int k = 0;
                do {
                    if (k >= j) continue block0;
                    this.anIntArray658[k] = stream.readUnsignedWord();
                    ++k;
                } while (true);
            }
            if (i == 3) {
                this.aBoolean662 = true;
                continue;
            }
            if (i >= 40 && i < 50) {
                this.anIntArray659[i - 40] = stream.readUnsignedWord();
                continue;
            }
            if (i >= 50 && i < 60) {
                this.anIntArray660[i - 50] = stream.readUnsignedWord();
                continue;
            }
            if (i >= 60 && i < 70) {
                this.anIntArray661[i - 60] = stream.readUnsignedWord();
                continue;
            }
            System.out.println("Error unrecognised config code: " + i);
        }
        return;
    }

    public boolean method537() {
        if (this.anIntArray658 == null) {
            return true;
        }
        boolean flag = true;
        int j = 0;
        while (j < this.anIntArray658.length) {
            if (!Model.isCached(this.anIntArray658[j])) {
                flag = false;
            }
            ++j;
        }
        return flag;
    }

    public Model method538() {
        if (this.anIntArray658 == null) {
            return null;
        }
        Model[] aclass30_sub2_sub4_sub6s = new Model[this.anIntArray658.length];
        for (int i = 0; i < this.anIntArray658.length; ++i) {
            aclass30_sub2_sub4_sub6s[i] = Model.fetchModel(this.anIntArray658[i]);
        }
        Model model = aclass30_sub2_sub4_sub6s.length == 1 ? aclass30_sub2_sub4_sub6s[0] : new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
        int j = 0;
        while (j < 6) {
            if (this.anIntArray659[j] == 0) return model;
            model.reColor(this.anIntArray659[j], this.anIntArray660[j]);
            ++j;
        }
        return model;
    }

    public boolean method539() {
        boolean flag1 = true;
        int i = 0;
        while (i < 5) {
            if (this.anIntArray661[i] != -1 && !Model.isCached(this.anIntArray661[i])) {
                flag1 = false;
            }
            ++i;
        }
        return flag1;
    }

    public Model method540() {
        Model[] aclass30_sub2_sub4_sub6s = new Model[5];
        int j = 0;
        for (int k = 0; k < 5; ++k) {
            if (this.anIntArray661[k] == -1) continue;
            aclass30_sub2_sub4_sub6s[j++] = Model.fetchModel(this.anIntArray661[k]);
        }
        Model model = new Model(j, aclass30_sub2_sub4_sub6s);
        int l = 0;
        while (l < 6) {
            if (this.anIntArray659[l] == 0) return model;
            model.reColor(this.anIntArray659[l], this.anIntArray660[l]);
            ++l;
        }
        return model;
    }

    private IDK() {
    }
}


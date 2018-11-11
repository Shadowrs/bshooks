/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client.definition;

import com.imagineps.client.Stream;

public final class SkinList {
    public final int[] anIntArray342;
    public final int[][] anIntArrayArray343;
    public int length;

    public SkinList(Stream stream) {
        int j;
        this.length = stream.readUnsignedWord();
        this.anIntArray342 = new int[this.length];
        this.anIntArrayArray343 = new int[this.length][];
        for (j = 0; j < this.length; ++j) {
            this.anIntArray342[j] = stream.readUnsignedWord();
        }
        for (j = 0; j < this.length; ++j) {
            this.anIntArrayArray343[j] = new int[stream.readUnsignedWord()];
        }
        j = 0;
        while (j < this.length) {
            for (int l = 0; l < this.anIntArrayArray343[j].length; ++l) {
                this.anIntArrayArray343[j][l] = stream.readUnsignedWord();
            }
            ++j;
        }
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package com.imagineps.client;

public final class ISAACRandomGenerator {
    private int count;
    private final int[] results = new int[256];
    private final int[] memory = new int[256];
    private int accumulator;
    private int lastResult;
    private int counter;

    public ISAACRandomGenerator(int[] seed) {
        System.arraycopy((Object)seed, (int)0, (Object)this.results, (int)0, (int)seed.length);
        this.initializeKeySet();
    }

    public int getNextKey() {
        if (this.count-- != 0) return this.results[this.count];
        this.isaac();
        this.count = 255;
        return this.results[this.count];
    }

    private void isaac() {
        this.lastResult += ++this.counter;
        int i = 0;
        while (i < 256) {
            int k;
            int j = this.memory[i];
            if ((i & 3) == 0) {
                this.accumulator ^= this.accumulator << 13;
            } else if ((i & 3) == 1) {
                this.accumulator ^= this.accumulator >>> 6;
            } else if ((i & 3) == 2) {
                this.accumulator ^= this.accumulator << 2;
            } else if ((i & 3) == 3) {
                this.accumulator ^= this.accumulator >>> 16;
            }
            this.accumulator += this.memory[i + 128 & 255];
            this.memory[i] = k = this.memory[(j & 1020) >> 2] + this.accumulator + this.lastResult;
            this.results[i] = this.lastResult = this.memory[(k >> 8 & 1020) >> 2] + j;
            ++i;
        }
    }

    private void initializeKeySet() {
        int k2 = -1640531527;
        int j2 = -1640531527;
        int i2 = -1640531527;
        int l1 = -1640531527;
        int k1 = -1640531527;
        int j1 = -1640531527;
        int i1 = -1640531527;
        int l = -1640531527;
        for (int i = 0; i < 4; i1 += j1, k1 += (l1 += (i1 ^= j1 >>> 2)), l1 += (i2 += (j1 ^= k1 << 8)), i2 += (j2 += (k1 ^= l1 >>> 16)), j2 += (k2 += (l1 ^= i2 << 10)), k2 += (l += (i2 ^= j2 >>> 4)), j1 += (k2 ^= l >>> 9), l += (i1 += (j2 ^= k2 << 8)), ++i) {
            j1 += (k1 += (l ^= i1 << 11));
        }
        for (int j = 0; j < 256; l += this.results[j], i1 += (j1 += this.results[j + 2]), j1 += (k1 += (l ^= (i1 += this.results[j + 1]) << 11)), k1 += (l1 += (i1 ^= j1 >>> 2)), l1 += (i2 += (j1 ^= k1 << 8)), i2 += (j2 += (k1 ^= l1 >>> 16)), j2 += (k2 += (l1 ^= i2 << 10)), k2 += (l += (i2 ^= j2 >>> 4)), j += 8) {
            k1 += this.results[j + 3];
            l1 += this.results[j + 4];
            i2 += this.results[j + 5];
            j2 += this.results[j + 6];
            k2 += this.results[j + 7];
            this.memory[j] = l += (i1 += (j2 ^= k2 << 8));
            this.memory[j + 1] = i1;
            this.memory[j + 2] = j1 += (k2 ^= l >>> 9);
            this.memory[j + 3] = k1;
            this.memory[j + 4] = l1;
            this.memory[j + 5] = i2;
            this.memory[j + 6] = j2;
            this.memory[j + 7] = k2;
        }
        int k = 0;
        do {
            if (k >= 256) {
                this.isaac();
                this.count = 256;
                return;
            }
            l += this.memory[k];
            k1 += this.memory[k + 3];
            l1 += this.memory[k + 4];
            i2 += this.memory[k + 5];
            j2 += this.memory[k + 6];
            k2 += this.memory[k + 7];
            i1 += (j1 += this.memory[k + 2]);
            j1 += (k1 += (l ^= (i1 += this.memory[k + 1]) << 11));
            k1 += (l1 += (i1 ^= j1 >>> 2));
            l1 += (i2 += (j1 ^= k1 << 8));
            i2 += (j2 += (k1 ^= l1 >>> 16));
            j2 += (k2 += (l1 ^= i2 << 10));
            k2 += (l += (i2 ^= j2 >>> 4));
            this.memory[k] = l += (i1 += (j2 ^= k2 << 8));
            this.memory[k + 1] = i1;
            this.memory[k + 2] = j1 += (k2 ^= l >>> 9);
            this.memory[k + 3] = k1;
            this.memory[k + 4] = l1;
            this.memory[k + 5] = i2;
            this.memory[k + 6] = j2;
            this.memory[k + 7] = k2;
            k += 8;
        } while (true);
    }
}


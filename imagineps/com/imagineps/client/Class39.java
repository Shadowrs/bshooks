/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package com.imagineps.client;

import com.imagineps.client.Class29;
import com.imagineps.client.Stream;

final class Class39 {
    final int[] anIntArray665 = new int[2];
    private final int[][][] anIntArrayArrayArray666 = new int[2][2][4];
    private final int[][][] anIntArrayArrayArray667 = new int[2][2][4];
    private final int[] anIntArray668 = new int[2];
    private static final float[][] aFloatArrayArray669 = new float[2][8];
    static final int[][] anIntArrayArray670 = new int[2][8];
    private static float aFloat671;
    static int anInt672;

    private float method541(int i, int j, float f) {
        float f1 = (float)this.anIntArrayArrayArray667[i][0][j] + f * (float)(this.anIntArrayArrayArray667[i][1][j] - this.anIntArrayArrayArray667[i][0][j]);
        return 1.0f - (float)Math.pow((double)10.0, (double)((- (f1 *= 0.001525879f)) / 20.0f));
    }

    private float method542(float f) {
        float f1 = 32.7032f * (float)Math.pow((double)2.0, (double)f);
        return f1 * 3.141593f / 11025.0f;
    }

    private float method543(float f, int i, int j) {
        float f1 = (float)this.anIntArrayArrayArray666[j][0][i] + f * (float)(this.anIntArrayArrayArray666[j][1][i] - this.anIntArrayArrayArray666[j][0][i]);
        return this.method542(f1 *= 1.220703E-4f);
    }

    public int method544(int i, float f) {
        if (i == 0) {
            float f1 = (float)this.anIntArray668[0] + (float)(this.anIntArray668[1] - this.anIntArray668[0]) * f;
            aFloat671 = (float)Math.pow((double)0.1, (double)((f1 *= 0.003051758f) / 20.0f));
            anInt672 = (int)(aFloat671 * 65536.0f);
        }
        if (this.anIntArray665[i] == 0) {
            return 0;
        }
        float f2 = this.method541(i, 0, f);
        Class39.aFloatArrayArray669[i][0] = -2.0f * f2 * (float)Math.cos((double)this.method543(f, 0, i));
        Class39.aFloatArrayArray669[i][1] = f2 * f2;
        for (int k = 1; k < this.anIntArray665[i]; ++k) {
            float f3 = this.method541(i, k, f);
            float f4 = -2.0f * f3 * (float)Math.cos((double)this.method543(f, k, i));
            float f5 = f3 * f3;
            Class39.aFloatArrayArray669[i][k * 2 + 1] = aFloatArrayArray669[i][k * 2 - 1] * f5;
            Class39.aFloatArrayArray669[i][k * 2] = aFloatArrayArray669[i][k * 2 - 1] * f4 + aFloatArrayArray669[i][k * 2 - 2] * f5;
            for (int j1 = k * 2 - 1; j1 >= 2; --j1) {
                float[] arrf = aFloatArrayArray669[i];
                int n = j1;
                arrf[n] = arrf[n] + (aFloatArrayArray669[i][j1 - 1] * f4 + aFloatArrayArray669[i][j1 - 2] * f5);
            }
            float[] arrf = aFloatArrayArray669[i];
            arrf[1] = arrf[1] + (aFloatArrayArray669[i][0] * f4 + f5);
            float[] arrf2 = aFloatArrayArray669[i];
            arrf2[0] = arrf2[0] + f4;
        }
        if (i == 0) {
            int l = 0;
            while (l < this.anIntArray665[0] * 2) {
                float[] arrf = aFloatArrayArray669[0];
                int n = l++;
                arrf[n] = arrf[n] * aFloat671;
            }
        }
        int i1 = 0;
        while (i1 < this.anIntArray665[i] * 2) {
            Class39.anIntArrayArray670[i][i1] = (int)(aFloatArrayArray669[i][i1] * 65536.0f);
            ++i1;
        }
        return this.anIntArray665[i] * 2;
    }

    public void method545(Stream stream, Class29 class29) {
        int i = stream.readUnsignedByte();
        this.anIntArray665[0] = i >> 4;
        this.anIntArray665[1] = i & 15;
        if (i == 0) {
            this.anIntArray668[1] = 0;
            this.anIntArray668[0] = 0;
            return;
        }
        this.anIntArray668[0] = stream.readUnsignedWord();
        this.anIntArray668[1] = stream.readUnsignedWord();
        int j = stream.readUnsignedByte();
        for (int k = 0; k < 2; ++k) {
            for (int l = 0; l < this.anIntArray665[k]; ++l) {
                this.anIntArrayArrayArray666[k][0][l] = stream.readUnsignedWord();
                this.anIntArrayArrayArray667[k][0][l] = stream.readUnsignedWord();
            }
        }
        for (int i1 = 0; i1 < 2; ++i1) {
            for (int j1 = 0; j1 < this.anIntArray665[i1]; ++j1) {
                if ((j & 1 << i1 * 4 << j1) != 0) {
                    this.anIntArrayArrayArray666[i1][1][j1] = stream.readUnsignedWord();
                    this.anIntArrayArrayArray667[i1][1][j1] = stream.readUnsignedWord();
                    continue;
                }
                this.anIntArrayArrayArray666[i1][1][j1] = this.anIntArrayArrayArray666[i1][0][j1];
                this.anIntArrayArrayArray667[i1][1][j1] = this.anIntArrayArrayArray667[i1][0][j1];
            }
        }
        if (j == 0) {
            if (this.anIntArray668[1] == this.anIntArray668[0]) return;
        }
        class29.method326(stream);
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package com.imagineps.client;

import com.imagineps.client.Class29;
import com.imagineps.client.Class39;
import com.imagineps.client.Stream;

final class Class6 {
    private Class29 aClass29_98;
    private Class29 aClass29_99;
    private Class29 aClass29_100;
    private Class29 aClass29_101;
    private Class29 aClass29_102;
    private Class29 aClass29_103;
    private Class29 aClass29_104;
    private Class29 aClass29_105;
    private final int[] anIntArray106 = new int[5];
    private final int[] anIntArray107 = new int[5];
    private final int[] anIntArray108 = new int[5];
    private int anInt109;
    private int anInt110 = 100;
    private Class39 aClass39_111;
    private Class29 aClass29_112;
    int anInt113 = 500;
    int anInt114;
    private static int[] anIntArray115;
    private static int[] anIntArray116;
    private static int[] anIntArray117;
    private static final int[] anIntArray118;
    private static final int[] anIntArray119;
    private static final int[] anIntArray120;
    private static final int[] anIntArray121;
    private static final int[] anIntArray122;

    public static void method166() {
        anIntArray116 = new int[32768];
        for (int i = 0; i < 32768; ++i) {
            Class6.anIntArray116[i] = Math.random() > 0.5 ? 1 : -1;
        }
        anIntArray117 = new int[32768];
        int j = 0;
        do {
            if (j >= 32768) {
                anIntArray115 = new int[220500];
                return;
            }
            Class6.anIntArray117[j] = (int)(Math.sin((double)((double)j / 5215.1903)) * 16384.0);
            ++j;
        } while (true);
    }

    public int[] method167(int i, int j) {
        block33 : {
            int i3;
            boolean flag1;
            for (int k = 0; k < i; ++k) {
                Class6.anIntArray115[k] = 0;
            }
            if (j < 10) {
                return anIntArray115;
            }
            double d = (double)i / ((double)j + 0.0);
            this.aClass29_98.resetValues();
            this.aClass29_99.resetValues();
            int l = 0;
            int i1 = 0;
            int j1 = 0;
            if (this.aClass29_100 != null) {
                this.aClass29_100.resetValues();
                this.aClass29_101.resetValues();
                l = (int)((double)(this.aClass29_100.anInt539 - this.aClass29_100.anInt538) * 32.768 / d);
                i1 = (int)((double)this.aClass29_100.anInt538 * 32.768 / d);
            }
            int k1 = 0;
            int l1 = 0;
            int i2 = 0;
            if (this.aClass29_102 != null) {
                this.aClass29_102.resetValues();
                this.aClass29_103.resetValues();
                k1 = (int)((double)(this.aClass29_102.anInt539 - this.aClass29_102.anInt538) * 32.768 / d);
                l1 = (int)((double)this.aClass29_102.anInt538 * 32.768 / d);
            }
            for (int j2 = 0; j2 < 5; ++j2) {
                if (this.anIntArray106[j2] == 0) continue;
                Class6.anIntArray118[j2] = 0;
                Class6.anIntArray119[j2] = (int)((double)this.anIntArray108[j2] * d);
                Class6.anIntArray120[j2] = (this.anIntArray106[j2] << 14) / 100;
                Class6.anIntArray121[j2] = (int)((double)(this.aClass29_98.anInt539 - this.aClass29_98.anInt538) * 32.768 * Math.pow((double)1.0057929410678534, (double)this.anIntArray107[j2]) / d);
                Class6.anIntArray122[j2] = (int)((double)this.aClass29_98.anInt538 * 32.768 / d);
            }
            int k2 = 0;
            do {
                int l2;
                int j4;
                if (k2 < i) {
                    l2 = this.aClass29_98.method328(i);
                    j4 = this.aClass29_99.method328(i);
                    if (this.aClass29_100 != null) {
                        int j5 = this.aClass29_100.method328(i);
                        int j6 = this.aClass29_101.method328(i);
                        l2 += this.method168(j6, j1, this.aClass29_100.anInt540) >> 1;
                        j1 += (j5 * l >> 16) + i1;
                    }
                    if (this.aClass29_102 != null) {
                        int k5 = this.aClass29_102.method328(i);
                        int k6 = this.aClass29_103.method328(i);
                        j4 = j4 * ((this.method168(k6, i2, this.aClass29_102.anInt540) >> 1) + 32768) >> 15;
                        i2 += (k5 * k1 >> 16) + l1;
                    }
                } else {
                    if (this.aClass29_104 != null) {
                        this.aClass29_104.resetValues();
                        this.aClass29_105.resetValues();
                        i3 = 0;
                        flag1 = true;
                        break;
                    }
                    break block33;
                }
                for (int l5 = 0; l5 < 5; ++l5) {
                    int l6;
                    if (this.anIntArray106[l5] == 0 || (l6 = k2 + anIntArray119[l5]) >= i) continue;
                    int[] arrn = anIntArray115;
                    int n = l6;
                    arrn[n] = arrn[n] + this.method168(j4 * anIntArray120[l5] >> 15, anIntArray118[l5], this.aClass29_98.anInt540);
                    int[] arrn2 = anIntArray118;
                    int n2 = l5;
                    arrn2[n2] = arrn2[n2] + ((l2 * anIntArray121[l5] >> 16) + anIntArray122[l5]);
                }
                ++k2;
            } while (true);
            for (int i7 = 0; i7 < i; ++i7) {
                int k7 = this.aClass29_104.method328(i);
                int i8 = this.aClass29_105.method328(i);
                int k4 = flag1 ? this.aClass29_104.anInt538 + ((this.aClass29_104.anInt539 - this.aClass29_104.anInt538) * k7 >> 8) : this.aClass29_104.anInt538 + ((this.aClass29_104.anInt539 - this.aClass29_104.anInt538) * i8 >> 8);
                if ((i3 += 256) >= k4) {
                    i3 = 0;
                    boolean bl = flag1 = !flag1;
                }
                if (!flag1) continue;
                Class6.anIntArray115[i7] = 0;
            }
        }
        if (this.anInt109 > 0 && this.anInt110 > 0) {
            for (int l4 = j3 = (int)((double)this.anInt109 * d); l4 < i; ++l4) {
                int j3;
                int[] arrn = anIntArray115;
                int n = l4;
                arrn[n] = arrn[n] + anIntArray115[l4 - j3] * this.anInt110 / 100;
            }
        }
        if (this.aClass39_111.anIntArray665[0] > 0 || this.aClass39_111.anIntArray665[1] > 0) {
            this.aClass29_112.resetValues();
            int k3 = this.aClass29_112.method328(i + 1);
            int i5 = this.aClass39_111.method544(0, (float)k3 / 65536.0f);
            int i6 = this.aClass39_111.method544(1, (float)k3 / 65536.0f);
            if (i >= i5 + i6) {
                int c;
                int j7 = 0;
                int l7 = i6;
                if (l7 > i - i5) {
                    l7 = i - i5;
                }
                while (j7 < l7) {
                    int j8 = (int)((long)anIntArray115[j7 + i5] * (long)Class39.anInt672 >> 16);
                    for (int k8 = 0; k8 < i5; j8 += (int)((long)Class6.anIntArray115[j7 + i5 - 1 - k8] * (long)Class39.anIntArrayArray670[0][k8] >> 16), ++k8) {
                    }
                    for (int j9 = 0; j9 < j7; j8 -= (int)((long)Class6.anIntArray115[j7 - 1 - j9] * (long)Class39.anIntArrayArray670[1][j9] >> 16), ++j9) {
                    }
                    Class6.anIntArray115[j7] = j8;
                    k3 = this.aClass29_112.method328(i + 1);
                    ++j7;
                }
                l7 = c = 128;
                do {
                    if (l7 > i - i5) {
                        l7 = i - i5;
                    }
                    while (j7 < l7) {
                        int l8 = (int)((long)anIntArray115[j7 + i5] * (long)Class39.anInt672 >> 16);
                        for (int k9 = 0; k9 < i5; l8 += (int)((long)Class6.anIntArray115[j7 + i5 - 1 - k9] * (long)Class39.anIntArrayArray670[0][k9] >> 16), ++k9) {
                        }
                        for (int i10 = 0; i10 < i6; l8 -= (int)((long)Class6.anIntArray115[j7 - 1 - i10] * (long)Class39.anIntArrayArray670[1][i10] >> 16), ++i10) {
                        }
                        Class6.anIntArray115[j7] = l8;
                        k3 = this.aClass29_112.method328(i + 1);
                        ++j7;
                    }
                    if (j7 >= i - i5) break;
                    i5 = this.aClass39_111.method544(0, (float)k3 / 65536.0f);
                    i6 = this.aClass39_111.method544(1, (float)k3 / 65536.0f);
                    l7 += c;
                } while (true);
                while (j7 < i) {
                    int i9 = 0;
                    for (int l9 = j7 + i5 - i; l9 < i5; i9 += (int)((long)Class6.anIntArray115[j7 + i5 - 1 - l9] * (long)Class39.anIntArrayArray670[0][l9] >> 16), ++l9) {
                    }
                    for (int j10 = 0; j10 < i6; i9 -= (int)((long)Class6.anIntArray115[j7 - 1 - j10] * (long)Class39.anIntArrayArray670[1][j10] >> 16), ++j10) {
                    }
                    Class6.anIntArray115[j7] = i9;
                    this.aClass29_112.method328(i + 1);
                    ++j7;
                }
            }
        }
        int i4 = 0;
        while (i4 < i) {
            if (anIntArray115[i4] < -32768) {
                Class6.anIntArray115[i4] = -32768;
            }
            if (anIntArray115[i4] > 32767) {
                Class6.anIntArray115[i4] = 32767;
            }
            ++i4;
        }
        return anIntArray115;
    }

    private int method168(int i, int k, int l) {
        if (l == 1) {
            if ((k & 32767) >= 16384) return - i;
            return i;
        }
        if (l == 2) {
            return anIntArray117[k & 32767] * i >> 14;
        }
        if (l == 3) {
            return ((k & 32767) * i >> 14) - i;
        }
        if (l != 4) return 0;
        return anIntArray116[k / 2607 & 32767] * i;
    }

    public void method169(Stream stream) {
        int k;
        this.aClass29_98 = new Class29();
        this.aClass29_98.method325(stream);
        this.aClass29_99 = new Class29();
        this.aClass29_99.method325(stream);
        int i = stream.readUnsignedByte();
        if (i != 0) {
            --stream.currentOffset;
            this.aClass29_100 = new Class29();
            this.aClass29_100.method325(stream);
            this.aClass29_101 = new Class29();
            this.aClass29_101.method325(stream);
        }
        if ((i = stream.readUnsignedByte()) != 0) {
            --stream.currentOffset;
            this.aClass29_102 = new Class29();
            this.aClass29_102.method325(stream);
            this.aClass29_103 = new Class29();
            this.aClass29_103.method325(stream);
        }
        if ((i = stream.readUnsignedByte()) != 0) {
            --stream.currentOffset;
            this.aClass29_104 = new Class29();
            this.aClass29_104.method325(stream);
            this.aClass29_105 = new Class29();
            this.aClass29_105.method325(stream);
        }
        for (int j = 0; j < 10 && (k = stream.method422()) != 0; ++j) {
            this.anIntArray106[j] = k;
            this.anIntArray107[j] = stream.method421();
            this.anIntArray108[j] = stream.method422();
        }
        this.anInt109 = stream.method422();
        this.anInt110 = stream.method422();
        this.anInt113 = stream.readUnsignedWord();
        this.anInt114 = stream.readUnsignedWord();
        this.aClass39_111 = new Class39();
        this.aClass29_112 = new Class29();
        this.aClass39_111.method545(stream, this.aClass29_112);
    }

    static {
        anIntArray118 = new int[5];
        anIntArray119 = new int[5];
        anIntArray120 = new int[5];
        anIntArray121 = new int[5];
        anIntArray122 = new int[5];
    }
}


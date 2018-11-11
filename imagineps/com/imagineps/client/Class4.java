/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client;

final class Class4 {
    Class4() {
    }

    public static int method155(int i, int j, int k) {
        if ((i &= 3) == 0) {
            return k;
        }
        if (i == 1) {
            return j;
        }
        if (i != 2) return 7 - j;
        return 7 - k;
    }

    public static int method156(int i, int j, int l) {
        if ((j &= 3) == 0) {
            return i;
        }
        if (j == 1) {
            return 7 - l;
        }
        if (j != 2) return l;
        return 7 - i;
    }

    public static int method157(int i, int j, int k, int l, int i1) {
        if ((i &= 3) == 0) {
            return k;
        }
        if (i == 1) {
            return l;
        }
        if (i != 2) return 7 - l - (j - 1);
        return 7 - k - (i1 - 1);
    }

    public static int method158(int j, int k, int l, int i1, int j1) {
        if ((l &= 3) == 0) {
            return j;
        }
        if (l == 1) {
            return 7 - j1 - (i1 - 1);
        }
        if (l != 2) return j1;
        return 7 - j - (k - 1);
    }
}


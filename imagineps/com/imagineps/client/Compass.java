/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client;

public enum Compass {
    NORTH(0, 1, new int[]{1, 0, 31, 30}),
    NORTHWEST(-1, 1, new int[]{5, 4, 3, 2}),
    WEST(-2, 0, new int[]{9, 8, 7, 6}),
    SOUTHWEST(-1, -1, new int[]{13, 12, 11, 10}),
    SOUTH(0, -1, new int[]{17, 16, 15, 14}),
    SOUTHEAST(1, -1, new int[]{21, 20, 19, 18}),
    EAST(2, 0, new int[]{25, 24, 23, 22}),
    NORTHEAST(1, 1, new int[]{29, 28, 27, 26});
    
    int x;
    int y;
    int[] delta;

    private Compass(int x, int y, int[] i) {
        this.x = x;
        this.y = y;
        this.delta = i;
    }

    public String toString() {
        return this.name();
    }

    public Compass opposite() {
        Compass[][] c;
        Compass[][] arrarrcompass = c = new Compass[][]{{NORTH, SOUTH}, {WEST, EAST}, {NORTHWEST, SOUTHEAST}, {NORTHEAST, SOUTHWEST}};
        int n = arrarrcompass.length;
        int n2 = 0;
        while (n2 < n) {
            Compass[] _c = arrarrcompass[n2];
            if (this == _c[0]) {
                return _c[1];
            }
            if (this == _c[1]) {
                return _c[0];
            }
            ++n2;
        }
        return null;
    }

    public static Compass rotate(Compass compass, boolean right) {
        int n;
        Compass[] _c;
        block3 : {
            Compass[][] c;
            Compass[][] arrarrcompass = c = new Compass[][]{{EAST, NORTH, WEST}, {SOUTH, EAST, NORTH}, {WEST, SOUTH, EAST}, {NORTH, WEST, SOUTH}, {NORTH, NORTHEAST, EAST}, {WEST, NORTHWEST, NORTH}, {SOUTH, SOUTHWEST, WEST}, {EAST, SOUTHEAST, SOUTH}};
            int n2 = arrarrcompass.length;
            int n3 = 0;
            while (n3 < n2) {
                _c = arrarrcompass[n3];
                if (compass == _c[1]) {
                    if (right) {
                        n = 2;
                        return _c[n];
                    }
                    break block3;
                }
                ++n3;
            }
            return null;
        }
        n = 0;
        return _c[n];
    }

    public static Compass getCurrentDirection(int i) {
        i /= 64;
        Compass[] arrcompass = Compass.values();
        int n = arrcompass.length;
        int n2 = 0;
        while (n2 < n) {
            Compass c = arrcompass[n2];
            for (int dir : c.delta) {
                if (i != dir) continue;
                return c;
            }
            ++n2;
        }
        return NORTH;
    }
}


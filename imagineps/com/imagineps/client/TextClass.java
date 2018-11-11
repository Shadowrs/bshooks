/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuffer
 */
package com.imagineps.client;

import com.imagineps.client.signlink.Signlink;

public final class TextClass {
    private static final char[] validChars = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static long longForName(String s) {
        long l = 0L;
        for (int i = 0; i < s.length() && i < 12; ++i) {
            char c = s.charAt(i);
            l *= 37L;
            if (c >= 'A' && c <= 'Z') {
                l += (long)('\u0001' + c - 65);
                continue;
            }
            if (c >= 'a' && c <= 'z') {
                l += (long)('\u0001' + c - 97);
                continue;
            }
            if (c < '0' || c > '9') continue;
            l += (long)(27 + c - 48);
        }
        while (l % 37L == 0L) {
            if (l == 0L) return l;
            l /= 37L;
        }
        return l;
    }

    public static String nameForLong(long l) {
        if (l <= 0L) return "invalid_name";
        if (l >= 6582952005840035281L) {
            return "invalid_name";
        }
        if (l % 37L == 0L) {
            return "invalid_name";
        }
        try {
            int i = 0;
            char[] ac = new char[12];
            while (l != 0L) {
                long l1 = l;
                ac[11 - i++] = validChars[(int)(l1 - (l /= 37L) * 37L)];
            }
            return new String(ac, 12 - i, i);
        }
        catch (RuntimeException runtimeexception) {
            Signlink.reporterror("81570, " + l + ", " + -99 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static long method585(String s) {
        s = s.toUpperCase();
        long l = 0L;
        int i = 0;
        while (i < s.length()) {
            l = l * 61L + (long)s.charAt(i) - 32L;
            l = l + (l >> 56) & 0xFFFFFFFFFFFFFFL;
            ++i;
        }
        return l;
    }

    public static String method586(int i) {
        return "" + (i >> 24 & 255) + "." + (i >> 16 & 255) + "." + (i >> 8 & 255) + "." + (i & 255);
    }

    public static String fixName(String s) {
        if (s.length() <= 0) return s;
        char[] ac = s.toCharArray();
        int j = 0;
        do {
            if (j >= ac.length) {
                if (ac[0] < 'a') return new String(ac);
                if (ac[0] > 'z') return new String(ac);
                ac[0] = (char)(ac[0] + 65 - 97);
                return new String(ac);
            }
            if (ac[j] == '_') {
                ac[j] = 32;
                if (j + 1 < ac.length && ac[j + 1] >= 'a' && ac[j + 1] <= 'z') {
                    ac[j + 1] = (char)(ac[j + 1] + 65 - 97);
                }
            }
            ++j;
        } while (true);
    }

    public static String passwordAsterisks(String s) {
        StringBuffer stringbuffer = new StringBuffer();
        int j = 0;
        while (j < s.length()) {
            stringbuffer.append("*");
            ++j;
        }
        return stringbuffer.toString();
    }
}


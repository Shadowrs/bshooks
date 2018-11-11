/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client;

import com.imagineps.client.Stream;

final class TextInput {
    private static final char[] aCharArray631 = new char[255];
    private static final char[] validChars = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '\u00a3', '$', '%', '\"', '[', ']', '<', '>', '/', '^'};

    TextInput() {
    }

    public static String method525(int i, Stream stream) {
        int j = 0;
        int k = -1;
        for (int l = 0; l < i; ++l) {
            int i1 = stream.readUnsignedByte();
            int j1 = i1 >> 4 & 15;
            if (k == -1) {
                if (j1 < 13) {
                    TextInput.aCharArray631[j++] = validChars[j1];
                } else {
                    k = j1;
                }
            } else {
                TextInput.aCharArray631[j++] = validChars[(k << 4) + j1 - 195];
                k = -1;
            }
            j1 = i1 & 15;
            if (k == -1) {
                if (j1 < 13) {
                    TextInput.aCharArray631[j++] = validChars[j1];
                    continue;
                }
                k = j1;
                continue;
            }
            TextInput.aCharArray631[j++] = validChars[(k << 4) + j1 - 195];
            k = -1;
        }
        boolean flag1 = true;
        int k1 = 0;
        while (k1 < j) {
            char c = aCharArray631[k1];
            if (flag1 && c >= 'a' && c <= 'z') {
                char[] arrc = aCharArray631;
                int n = k1;
                arrc[n] = (char)(arrc[n] + 65504);
                flag1 = false;
            }
            if (c == '.' || c == '!' || c == '?') {
                flag1 = true;
            }
            ++k1;
        }
        return new String(aCharArray631, 0, j);
    }

    public static void method526(String s, Stream stream) {
        if (s.length() > 80) {
            s = s.substring(0, 80);
        }
        s = s.toLowerCase();
        int i = -1;
        int j = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            int k = 0;
            for (int l = 0; l < validChars.length; ++l) {
                if (c != validChars[l]) continue;
                k = l;
                break;
            }
            if (k > 12) {
                k += 195;
            }
            if (i == -1) {
                if (k < 13) {
                    i = k;
                } else {
                    stream.writeWordBigEndian(k);
                }
            } else if (k < 13) {
                stream.writeWordBigEndian((i << 4) + k);
                i = -1;
            } else {
                stream.writeWordBigEndian((i << 4) + (k >> 4));
                i = k & 15;
            }
            ++j;
        }
    }

    public static String processText(String s) {
        return s;
    }
}


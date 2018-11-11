/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client;

import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;

final class Censor {
    private static int[] anIntArray620;
    private static char[][] aCharArrayArray621;
    private static byte[][][] aByteArrayArrayArray622;
    private static char[][] aCharArrayArray623;
    private static char[][] aCharArrayArray624;
    private static int[] anIntArray625;
    private static final String[] exceptions;

    Censor() {
    }

    public static void loadConfig(StreamLoader streamLoader) {
        Stream stream = new Stream(streamLoader.getDataForName("fragmentsenc.txt"));
        Stream stream_1 = new Stream(streamLoader.getDataForName("badenc.txt"));
        Stream stream_2 = new Stream(streamLoader.getDataForName("domainenc.txt"));
        Stream stream_3 = new Stream(streamLoader.getDataForName("tldlist.txt"));
        Censor.readValues(stream, stream_1, stream_2, stream_3);
    }

    private static void readValues(Stream stream, Stream stream_1, Stream stream_2, Stream stream_3) {
        Censor.readBadEnc(stream_1);
        Censor.readDomainEnc(stream_2);
        Censor.readFragmentsEnc(stream);
        Censor.readTldList(stream_3);
    }

    private static void readTldList(Stream stream) {
        int i = stream.readDWord();
        aCharArrayArray624 = new char[i][];
        anIntArray625 = new int[i];
        int j = 0;
        while (j < i) {
            Censor.anIntArray625[j] = stream.readUnsignedByte();
            char[] ac = new char[stream.readUnsignedByte()];
            for (int k = 0; k < ac.length; ++k) {
                ac[k] = (char)stream.readUnsignedByte();
            }
            Censor.aCharArrayArray624[j] = ac;
            ++j;
        }
    }

    private static void readBadEnc(Stream stream) {
        int j = stream.readDWord();
        aCharArrayArray621 = new char[j][];
        aByteArrayArrayArray622 = new byte[j][][];
        Censor.method493(stream, aCharArrayArray621, aByteArrayArrayArray622);
    }

    private static void readDomainEnc(Stream stream) {
        int i = stream.readDWord();
        aCharArrayArray623 = new char[i][];
        Censor.method494(aCharArrayArray623, stream);
    }

    private static void readFragmentsEnc(Stream stream) {
        anIntArray620 = new int[stream.readDWord()];
        int i = 0;
        while (i < anIntArray620.length) {
            Censor.anIntArray620[i] = stream.readUnsignedWord();
            ++i;
        }
    }

    private static void method493(Stream stream, char[][] ac, byte[][][] abyte0) {
        int j = 0;
        while (j < ac.length) {
            char[] ac1 = new char[stream.readUnsignedByte()];
            for (int k = 0; k < ac1.length; ++k) {
                ac1[k] = (char)stream.readUnsignedByte();
            }
            ac[j] = ac1;
            byte[][] abyte1 = new byte[stream.readUnsignedByte()][2];
            for (int l = 0; l < abyte1.length; ++l) {
                abyte1[l][0] = (byte)stream.readUnsignedByte();
                abyte1[l][1] = (byte)stream.readUnsignedByte();
            }
            if (abyte1.length > 0) {
                abyte0[j] = abyte1;
            }
            ++j;
        }
    }

    private static void method494(char[][] ac, Stream stream) {
        int j = 0;
        while (j < ac.length) {
            char[] ac1 = new char[stream.readUnsignedByte()];
            for (int k = 0; k < ac1.length; ++k) {
                ac1[k] = (char)stream.readUnsignedByte();
            }
            ac[j] = ac1;
            ++j;
        }
    }

    private static void method495(char[] ac) {
        int i = 0;
        for (int j = 0; j < ac.length; ++j) {
            ac[i] = Censor.method496(ac[j]) ? ac[j] : 32;
            if (i != 0 && ac[i] == ' ' && ac[i - 1] == ' ') continue;
            ++i;
        }
        int k = i;
        while (k < ac.length) {
            ac[k] = 32;
            ++k;
        }
    }

    private static boolean method496(char c) {
        if (c >= ' ') {
            if (c <= '') return true;
        }
        if (c == ' ') return true;
        if (c == '\n') return true;
        if (c == '\t') return true;
        if (c == '\u00a3') return true;
        if (c == '\u20ac') return true;
        return false;
    }

    public static String doCensor(String s) {
        System.currentTimeMillis();
        char[] ac = s.toCharArray();
        Censor.method495(ac);
        String s1 = new String(ac).trim();
        ac = s1.toLowerCase().toCharArray();
        String s2 = s1.toLowerCase();
        Censor.method505(ac);
        Censor.method500(ac);
        Censor.method501(ac);
        Censor.method514(ac);
        int j = 0;
        do {
            if (j >= exceptions.length) {
                Censor.method498(s1.toCharArray(), ac);
                Censor.method499(ac);
                System.currentTimeMillis();
                return new String(ac).trim();
            }
            int k = -1;
            while ((k = s2.indexOf(exceptions[j], k + 1)) != -1) {
                char[] ac1 = exceptions[j].toCharArray();
                System.arraycopy((Object)ac1, (int)0, (Object)ac, (int)k, (int)ac1.length);
            }
            ++j;
        } while (true);
    }

    private static void method498(char[] ac, char[] ac1) {
        int j = 0;
        while (j < ac.length) {
            if (ac1[j] != '*' && Censor.isUpperCaseLetter(ac[j])) {
                ac1[j] = ac[j];
            }
            ++j;
        }
    }

    private static void method499(char[] ac) {
        boolean flag = true;
        int j = 0;
        while (j < ac.length) {
            char c = ac[j];
            if (Censor.isLetter(c)) {
                if (flag) {
                    if (Censor.isLowerCaseLetter(c)) {
                        flag = false;
                    }
                } else if (Censor.isUpperCaseLetter(c)) {
                    ac[j] = (char)(c + 97 - 65);
                }
            } else {
                flag = true;
            }
            ++j;
        }
    }

    private static void method500(char[] ac) {
        int i = 0;
        while (i < 2) {
            for (int j = Censor.aCharArrayArray621.length - 1; j >= 0; --j) {
                Censor.method509(aByteArrayArrayArray622[j], ac, aCharArrayArray621[j]);
            }
            ++i;
        }
    }

    private static void method501(char[] ac) {
        char[] ac1 = (char[])ac.clone();
        char[] ac2 = new char[]{'(', 'a', ')'};
        Censor.method509(null, ac1, ac2);
        char[] ac3 = (char[])ac.clone();
        char[] ac4 = new char[]{'d', 'o', 't'};
        Censor.method509(null, ac3, ac4);
        int i = aCharArrayArray623.length - 1;
        while (i >= 0) {
            Censor.method502(ac, aCharArrayArray623[i], ac3, ac1);
            --i;
        }
    }

    private static void method502(char[] ac, char[] ac1, char[] ac2, char[] ac3) {
        if (ac1.length > ac.length) {
            return;
        }
        int k = 0;
        while (k <= ac.length - ac1.length) {
            int l = k;
            int i1 = 0;
            int j = 1;
            while (l < ac.length) {
                int j1;
                char c = ac[l];
                char c1 = '\u0000';
                if (l + 1 < ac.length) {
                    c1 = ac[l + 1];
                }
                if (i1 < ac1.length && (j1 = Censor.method511(c, ac1[i1], c1)) > 0) {
                    l += j1;
                    ++i1;
                    continue;
                }
                if (i1 == 0) break;
                j1 = Censor.method511(c, ac1[i1 - 1], c1);
                if (j1 > 0) {
                    l += j1;
                    if (i1 != 1) continue;
                    ++j;
                    continue;
                }
                if (i1 >= ac1.length || !Censor.method517(c)) break;
                ++l;
            }
            if (i1 >= ac1.length) {
                boolean flag1 = false;
                int k1 = Censor.method503(ac, ac3, k);
                int l1 = Censor.method504(ac2, l - 1, ac);
                if (k1 > 2 || l1 > 2) {
                    flag1 = true;
                }
                if (flag1) {
                    for (int i2 = k; i2 < l; ++i2) {
                        ac[i2] = 42;
                    }
                }
            }
            k += j;
        }
    }

    private static int method503(char[] ac, char[] ac1, int j) {
        if (j == 0) {
            return 2;
        }
        for (int k = j - 1; k >= 0 && Censor.method517(ac[k]); --k) {
            if (ac[k] != '@') continue;
            return 3;
        }
        int l = 0;
        for (int i1 = j - 1; i1 >= 0 && Censor.method517(ac1[i1]); --i1) {
            if (ac1[i1] != '*') continue;
            ++l;
        }
        if (l >= 3) {
            return 4;
        }
        if (!Censor.method517(ac[j - 1])) return 0;
        return 1;
    }

    private static int method504(char[] ac, int i, char[] ac1) {
        if (i + 1 == ac1.length) {
            return 2;
        }
        for (int j = i + 1; j < ac1.length && Censor.method517(ac1[j]); ++j) {
            if (ac1[j] == '.') return 3;
            if (ac1[j] != ',') continue;
            return 3;
        }
        int k = 0;
        for (int l = i + 1; l < ac1.length && Censor.method517(ac[l]); ++l) {
            if (ac[l] != '*') continue;
            ++k;
        }
        if (k >= 3) {
            return 4;
        }
        if (!Censor.method517(ac1[i + 1])) return 0;
        return 1;
    }

    private static void method505(char[] ac) {
        char[] ac1 = (char[])ac.clone();
        char[] ac2 = new char[]{'d', 'o', 't'};
        Censor.method509(null, ac1, ac2);
        char[] ac3 = (char[])ac.clone();
        char[] ac4 = new char[]{'s', 'l', 'a', 's', 'h'};
        Censor.method509(null, ac3, ac4);
        int i = 0;
        while (i < aCharArrayArray624.length) {
            Censor.method506(ac3, aCharArrayArray624[i], anIntArray625[i], ac1, ac);
            ++i;
        }
    }

    private static void method506(char[] ac, char[] ac1, int i, char[] ac2, char[] ac3) {
        if (ac1.length > ac3.length) {
            return;
        }
        int k = 0;
        while (k <= ac3.length - ac1.length) {
            int j;
            block25 : {
                int k1;
                int l;
                int l1;
                block26 : {
                    l = k;
                    int i1 = 0;
                    j = 1;
                    while (l < ac3.length) {
                        int j1;
                        char c = ac3[l];
                        char c1 = '\u0000';
                        if (l + 1 < ac3.length) {
                            c1 = ac3[l + 1];
                        }
                        if (i1 < ac1.length && (j1 = Censor.method511(c, ac1[i1], c1)) > 0) {
                            l += j1;
                            ++i1;
                            continue;
                        }
                        if (i1 == 0) break;
                        j1 = Censor.method511(c, ac1[i1 - 1], c1);
                        if (j1 > 0) {
                            l += j1;
                            if (i1 != 1) continue;
                            ++j;
                            continue;
                        }
                        if (i1 >= ac1.length || !Censor.method517(c)) break;
                        ++l;
                    }
                    if (i1 < ac1.length) break block25;
                    boolean flag1 = false;
                    k1 = Censor.method507(ac3, k, ac2);
                    l1 = Censor.method508(ac3, ac, l - 1);
                    if (i == 1 && k1 > 0 && l1 > 0) {
                        flag1 = true;
                    }
                    if (i == 2 && (k1 > 2 && l1 > 0 || k1 > 0 && l1 > 2)) {
                        flag1 = true;
                    }
                    if (i != 3) break block26;
                    if (k1 > 0 && l1 > 2) {
                        flag1 = true;
                    }
                    if (!flag1) break block25;
                }
                int i2 = k;
                int j2 = l - 1;
                if (k1 > 2) {
                    if (k1 == 4) {
                        boolean flag2 = false;
                        for (int l2 = i2 - 1; l2 >= 0; --l2) {
                            if (flag2) {
                                if (ac2[l2] != '*') break;
                                i2 = l2;
                                continue;
                            }
                            if (ac2[l2] != '*') continue;
                            i2 = l2;
                            flag2 = true;
                        }
                    }
                    boolean flag3 = false;
                    for (int i3 = i2 - 1; i3 >= 0; --i3) {
                        if (flag3) {
                            if (Censor.method517(ac3[i3])) break;
                            i2 = i3;
                            continue;
                        }
                        if (Censor.method517(ac3[i3])) continue;
                        flag3 = true;
                        i2 = i3;
                    }
                }
                if (l1 > 2) {
                    if (l1 == 4) {
                        boolean flag4 = false;
                        for (int j3 = j2 + 1; j3 < ac3.length; ++j3) {
                            if (flag4) {
                                if (ac[j3] != '*') break;
                                j2 = j3;
                                continue;
                            }
                            if (ac[j3] != '*') continue;
                            j2 = j3;
                            flag4 = true;
                        }
                    }
                    boolean flag5 = false;
                    for (int k3 = j2 + 1; k3 < ac3.length; ++k3) {
                        if (flag5) {
                            if (Censor.method517(ac3[k3])) break;
                            j2 = k3;
                            continue;
                        }
                        if (Censor.method517(ac3[k3])) continue;
                        flag5 = true;
                        j2 = k3;
                    }
                }
                for (int k2 = i2; k2 <= j2; ++k2) {
                    ac3[k2] = 42;
                }
            }
            k += j;
        }
    }

    private static int method507(char[] ac, int j, char[] ac1) {
        if (j == 0) {
            return 2;
        }
        for (int k = j - 1; k >= 0 && Censor.method517(ac[k]); --k) {
            if (ac[k] == ',') return 3;
            if (ac[k] != '.') continue;
            return 3;
        }
        int l = 0;
        for (int i1 = j - 1; i1 >= 0 && Censor.method517(ac1[i1]); --i1) {
            if (ac1[i1] != '*') continue;
            ++l;
        }
        if (l >= 3) {
            return 4;
        }
        if (!Censor.method517(ac[j - 1])) return 0;
        return 1;
    }

    private static int method508(char[] ac, char[] ac1, int i) {
        if (i + 1 == ac.length) {
            return 2;
        }
        for (int j = i + 1; j < ac.length && Censor.method517(ac[j]); ++j) {
            if (ac[j] == '\\') return 3;
            if (ac[j] != '/') continue;
            return 3;
        }
        int k = 0;
        for (int l = i + 1; l < ac.length && Censor.method517(ac1[l]); ++l) {
            if (ac1[l] != '*') continue;
            ++k;
        }
        if (k >= 5) {
            return 4;
        }
        if (!Censor.method517(ac[i + 1])) return 0;
        return 1;
    }

    private static void method509(byte[][] abyte0, char[] ac, char[] ac1) {
        if (ac1.length > ac.length) {
            return;
        }
        int k = 0;
        while (k <= ac.length - ac1.length) {
            int l = k;
            int i1 = 0;
            int j1 = 0;
            int j = 1;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            while (!(l >= ac.length || flag2 && flag3)) {
                int k1;
                char c = ac[l];
                char c2 = '\u0000';
                if (l + 1 < ac.length) {
                    c2 = ac[l + 1];
                }
                if (i1 < ac1.length && (k1 = Censor.method512(c2, c, ac1[i1])) > 0) {
                    if (k1 == 1 && Censor.isDigit(c)) {
                        flag2 = true;
                    }
                    if (k1 == 2 && (Censor.isDigit(c) || Censor.isDigit(c2))) {
                        flag2 = true;
                    }
                    l += k1;
                    ++i1;
                    continue;
                }
                if (i1 == 0) break;
                k1 = Censor.method512(c2, c, ac1[i1 - 1]);
                if (k1 <= 0) {
                    if (i1 >= ac1.length) break;
                } else {
                    l += k1;
                    if (i1 != 1) continue;
                    ++j;
                    continue;
                }
                if (!Censor.method518(c)) break;
                if (Censor.method517(c) && c != '\'') {
                    flag1 = true;
                }
                if (Censor.isDigit(c)) {
                    flag3 = true;
                }
                if (++j1 * 100 / (++l - k) <= 90) continue;
            }
            if (!(i1 < ac1.length || flag2 && flag3)) {
                boolean flag4 = true;
                if (!flag1) {
                    char c1 = ' ';
                    if (k - 1 >= 0) {
                        c1 = ac[k - 1];
                    }
                    char c3 = ' ';
                    if (l < ac.length) {
                        c3 = ac[l];
                    }
                    byte byte0 = Censor.method513(c1);
                    byte byte1 = Censor.method513(c3);
                    if (abyte0 != null && Censor.method510(byte0, abyte0, byte1)) {
                        flag4 = false;
                    }
                } else {
                    boolean flag5 = false;
                    boolean flag6 = false;
                    if (k - 1 < 0 || Censor.method517(ac[k - 1]) && ac[k - 1] != '\'') {
                        flag5 = true;
                    }
                    if (l >= ac.length || Censor.method517(ac[l]) && ac[l] != '\'') {
                        flag6 = true;
                    }
                    if (!flag5 || !flag6) {
                        boolean flag7 = false;
                        int k2 = k - 2;
                        if (flag5) {
                            k2 = k;
                        }
                        while (!flag7 && k2 < l) {
                            if (!(k2 < 0 || Censor.method517(ac[k2]) && ac[k2] != '\'')) {
                                int j3;
                                char[] ac2 = new char[3];
                                for (j3 = 0; !(j3 >= 3 || k2 + j3 >= ac.length || Censor.method517(ac[k2 + j3]) && ac[k2 + j3] != '\''); ++j3) {
                                    ac2[j3] = ac[k2 + j3];
                                }
                                boolean flag8 = true;
                                if (j3 == 0) {
                                    flag8 = false;
                                }
                                if (j3 < 3) {
                                    if (!(k2 - 1 < 0 || Censor.method517(ac[k2 - 1]) && ac[k2 - 1] != '\'')) {
                                        flag8 = false;
                                    }
                                    if (flag8 && !Censor.method523(ac2)) {
                                        flag7 = true;
                                    }
                                }
                            }
                            ++k2;
                        }
                        if (!flag7) {
                            flag4 = false;
                        }
                    }
                }
                if (flag4) {
                    int l1 = 0;
                    int i2 = 0;
                    int j2 = -1;
                    for (int l2 = k; l2 < l; ++l2) {
                        if (Censor.isDigit(ac[l2])) {
                            ++l1;
                            continue;
                        }
                        if (!Censor.isLetter(ac[l2])) continue;
                        ++i2;
                        j2 = l2;
                    }
                    if (j2 > -1) {
                        l1 -= l - 1 - j2;
                    }
                    if (l1 <= i2) {
                        for (int i3 = k; i3 < l; ++i3) {
                            ac[i3] = 42;
                        }
                    } else {
                        j = 1;
                    }
                }
            }
            k += j;
        }
    }

    private static boolean method510(byte byte0, byte[][] abyte0, byte byte2) {
        int i = 0;
        if (abyte0[i][0] == byte0 && abyte0[i][1] == byte2) {
            return true;
        }
        int j = abyte0.length - 1;
        if (abyte0[j][0] == byte0 && abyte0[j][1] == byte2) {
            return true;
        }
        do {
            int k;
            if (abyte0[k = (i + j) / 2][0] == byte0 && abyte0[k][1] == byte2) {
                return true;
            }
            if (byte0 < abyte0[k][0] || byte0 == abyte0[k][0] && byte2 < abyte0[k][1]) {
                j = k;
            } else {
                i = k;
            }
            if (i == j) return false;
        } while (i + 1 != j);
        return false;
    }

    private static int method511(char c, char c1, char c2) {
        if (c1 == c) {
            return 1;
        }
        if (c1 == 'o' && c == '0') {
            return 1;
        }
        if (c1 == 'o' && c == '(' && c2 == ')') {
            return 2;
        }
        if (c1 == 'c') {
            if (c == '(') return 1;
            if (c == '<') return 1;
            if (c == '[') {
                return 1;
            }
        }
        if (c1 == 'e' && c == '\u20ac') {
            return 1;
        }
        if (c1 == 's' && c == '$') {
            return 1;
        }
        if (c1 != 'l') return 0;
        if (c != 'i') return 0;
        return 1;
    }

    private static int method512(char c, char c1, char c2) {
        if (c2 == c1) {
            return 1;
        }
        if (c2 >= 'a' && c2 <= 'm') {
            if (c2 == 'a') {
                if (c1 == '4') return 1;
                if (c1 == '@') return 1;
                if (c1 == '^') {
                    return 1;
                }
                if (c1 != '/') return 0;
                if (c != '\\') return 0;
                return 2;
            }
            if (c2 == 'b') {
                if (c1 == '6') return 1;
                if (c1 == '8') {
                    return 1;
                }
                if (c1 == '1') {
                    if (c == '3') return 2;
                }
                if (c1 != 'i') return 0;
                if (c != '3') return 0;
                return 2;
            }
            if (c2 == 'c') {
                if (c1 == '(') return 1;
                if (c1 == '<') return 1;
                if (c1 == '{') return 1;
                if (c1 == '[') return 1;
                return 0;
            }
            if (c2 == 'd') {
                if (c1 == '[') {
                    if (c == ')') return 2;
                }
                if (c1 != 'i') return 0;
                if (c != ')') return 0;
                return 2;
            }
            if (c2 == 'e') {
                if (c1 == '3') return 1;
                if (c1 == '\u20ac') return 1;
                return 0;
            }
            if (c2 == 'f') {
                if (c1 == 'p' && c == 'h') {
                    return 2;
                }
                if (c1 != '\u00a3') return 0;
                return 1;
            }
            if (c2 == 'g') {
                if (c1 == '9') return 1;
                if (c1 == '6') return 1;
                if (c1 == 'q') return 1;
                return 0;
            }
            if (c2 == 'h') {
                if (c1 != '#') return 0;
                return 1;
            }
            if (c2 == 'i') {
                if (c1 == 'y') return 1;
                if (c1 == 'l') return 1;
                if (c1 == 'j') return 1;
                if (c1 == '1') return 1;
                if (c1 == '!') return 1;
                if (c1 == ':') return 1;
                if (c1 == ';') return 1;
                if (c1 == '|') return 1;
                return 0;
            }
            if (c2 == 'j') {
                return 0;
            }
            if (c2 == 'k') {
                return 0;
            }
            if (c2 == 'l') {
                if (c1 == '1') return 1;
                if (c1 == '|') return 1;
                if (c1 == 'i') return 1;
                return 0;
            }
            if (c2 == 'm') {
                return 0;
            }
        }
        if (c2 >= 'n' && c2 <= 'z') {
            if (c2 == 'n') {
                return 0;
            }
            if (c2 == 'o') {
                if (c1 == '0') return 1;
                if (c1 == '*') {
                    return 1;
                }
                if (c1 == '(') {
                    if (c == ')') return 2;
                }
                if (c1 == '[') {
                    if (c == ']') return 2;
                }
                if (c1 == '{') {
                    if (c == '}') return 2;
                }
                if (c1 != '<') return 0;
                if (c != '>') return 0;
                return 2;
            }
            if (c2 == 'p') {
                return 0;
            }
            if (c2 == 'q') {
                return 0;
            }
            if (c2 == 'r') {
                return 0;
            }
            if (c2 == 's') {
                if (c1 == '5') return 1;
                if (c1 == 'z') return 1;
                if (c1 == '$') return 1;
                if (c1 == '2') return 1;
                return 0;
            }
            if (c2 == 't') {
                if (c1 == '7') return 1;
                if (c1 == '+') return 1;
                return 0;
            }
            if (c2 == 'u') {
                if (c1 == 'v') {
                    return 1;
                }
                if (c1 == '\\') {
                    if (c == '/') return 2;
                }
                if (c1 == '\\') {
                    if (c == '|') return 2;
                }
                if (c1 != '|') return 0;
                if (c != '/') return 0;
                return 2;
            }
            if (c2 == 'v') {
                if (c1 == '\\') {
                    if (c == '/') return 2;
                }
                if (c1 == '\\') {
                    if (c == '|') return 2;
                }
                if (c1 != '|') return 0;
                if (c != '/') return 0;
                return 2;
            }
            if (c2 == 'w') {
                if (c1 != 'v') return 0;
                if (c != 'v') return 0;
                return 2;
            }
            if (c2 == 'x') {
                if (c1 == ')') {
                    if (c == '(') return 2;
                }
                if (c1 == '}') {
                    if (c == '{') return 2;
                }
                if (c1 == ']') {
                    if (c == '[') return 2;
                }
                if (c1 != '>') return 0;
                if (c != '<') return 0;
                return 2;
            }
            if (c2 == 'y') {
                return 0;
            }
            if (c2 == 'z') {
                return 0;
            }
        }
        if (c2 >= '0' && c2 <= '9') {
            if (c2 == '0') {
                if (c1 == 'o') return 1;
                if (c1 == 'O') {
                    return 1;
                }
                if (c1 == '(') {
                    if (c == ')') return 2;
                }
                if (c1 == '{') {
                    if (c == '}') return 2;
                }
                if (c1 != '[') return 0;
                if (c != ']') return 0;
                return 2;
            }
            if (c2 != '1') return 0;
            if (c1 != 'l') return 0;
            return 1;
        }
        if (c2 == ',') {
            if (c1 != '.') return 0;
            return 1;
        }
        if (c2 == '.') {
            if (c1 != ',') return 0;
            return 1;
        }
        if (c2 != '!') return 0;
        if (c1 != 'i') return 0;
        return 1;
    }

    private static byte method513(char c) {
        if (c >= 'a' && c <= 'z') {
            return (byte)(c - 97 + 1);
        }
        if (c == '\'') {
            return 28;
        }
        if (c < '0') return 27;
        if (c > '9') return 27;
        return (byte)(c - 48 + 29);
    }

    private static void method514(char[] ac) {
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j;
        while ((j = Censor.method515(ac, k)) != -1) {
            boolean flag = false;
            for (int j1 = k; j1 >= 0 && j1 < j && !flag; ++j1) {
                if (Censor.method517(ac[j1]) || Censor.method518(ac[j1])) continue;
                flag = true;
            }
            if (flag) {
                l = 0;
            }
            if (l == 0) {
                i1 = j;
            }
            k = Censor.method516(ac, j);
            int k1 = 0;
            for (int l1 = j; l1 < k; ++l1) {
                k1 = k1 * 10 + ac[l1] - 48;
            }
            l = k1 > 255 || k - j > 8 ? 0 : ++l;
            if (l != 4) continue;
            for (int i2 = i1; i2 < k; ++i2) {
                ac[i2] = 42;
            }
            l = 0;
        }
        return;
    }

    private static int method515(char[] ac, int i) {
        int k = i;
        while (k < ac.length) {
            if (k < 0) return -1;
            if (ac[k] >= '0' && ac[k] <= '9') {
                return k;
            }
            ++k;
        }
        return -1;
    }

    private static int method516(char[] ac, int j) {
        int k = j;
        while (k < ac.length) {
            if (k < 0) return ac.length;
            if (ac[k] < '0') return k;
            if (ac[k] > '9') {
                return k;
            }
            ++k;
        }
        return ac.length;
    }

    private static boolean method517(char c) {
        if (Censor.isLetter(c)) return false;
        if (Censor.isDigit(c)) return false;
        return true;
    }

    private static boolean method518(char c) {
        if (c < 'a') return true;
        if (c > 'z') return true;
        if (c == 'v') return true;
        if (c == 'x') return true;
        if (c == 'j') return true;
        if (c == 'q') return true;
        if (c == 'z') return true;
        return false;
    }

    private static boolean isLetter(char c) {
        if (c >= 'a') {
            if (c <= 'z') return true;
        }
        if (c < 'A') return false;
        if (c > 'Z') return false;
        return true;
    }

    private static boolean isDigit(char c) {
        if (c < '0') return false;
        if (c > '9') return false;
        return true;
    }

    private static boolean isLowerCaseLetter(char c) {
        if (c < 'a') return false;
        if (c > 'z') return false;
        return true;
    }

    private static boolean isUpperCaseLetter(char c) {
        if (c < 'A') return false;
        if (c > 'Z') return false;
        return true;
    }

    private static boolean method523(char[] ac) {
        boolean flag = true;
        int i = 0;
        while (i < ac.length) {
            if (!Censor.isDigit(ac[i]) && ac[i] != '\u0000') {
                flag = false;
            }
            ++i;
        }
        return true;
    }

    private static int method524(char[] ac) {
        if (ac.length > 6) {
            return 0;
        }
        int k = 0;
        int l = 0;
        while (l < ac.length) {
            char c = ac[ac.length - l - 1];
            if (c >= 'a' && c <= 'z') {
                k = k * 38 + (c - 97 + 1);
            } else if (c == '\'') {
                k = k * 38 + 27;
            } else if (c >= '0' && c <= '9') {
                k = k * 38 + (c - 48 + 28);
            } else if (c != '\u0000') {
                return 0;
            }
            ++l;
        }
        return k;
    }

    static {
        exceptions = new String[]{"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};
    }
}


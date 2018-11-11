/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client;

import com.imagineps.client.Class32;

final class Class13 {
    private static final Class32 aClass32_305 = new Class32();

    Class13() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int method225(byte[] abyte0, int i, byte[] abyte1, int j, int k) {
        Class32 class32 = aClass32_305;
        synchronized (class32) {
            Class13.aClass32_305.aByteArray563 = abyte1;
            Class13.aClass32_305.anInt564 = k;
            Class13.aClass32_305.aByteArray568 = abyte0;
            Class13.aClass32_305.anInt569 = 0;
            Class13.aClass32_305.anInt565 = j;
            Class13.aClass32_305.anInt570 = i;
            Class13.aClass32_305.anInt577 = 0;
            Class13.aClass32_305.anInt576 = 0;
            Class13.aClass32_305.anInt566 = 0;
            Class13.aClass32_305.anInt567 = 0;
            Class13.aClass32_305.anInt571 = 0;
            Class13.aClass32_305.anInt572 = 0;
            Class13.aClass32_305.anInt579 = 0;
            Class13.method227(aClass32_305);
            return i -= Class13.aClass32_305.anInt570;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void method226(Class32 class32) {
        byte4 = class32.aByte573;
        i = class32.anInt574;
        j = class32.anInt584;
        k = class32.anInt582;
        ai = Class32.anIntArray587;
        l = class32.anInt581;
        abyte0 = class32.aByteArray568;
        i1 = class32.anInt569;
        k1 = j1 = class32.anInt570;
        l1 = class32.anInt601 + 1;
        block0 : do {
            if (i <= 0) ** GOTO lbl30
            while (j1 != 0) {
                block11 : {
                    block12 : {
                        block10 : {
                            if (i != 1) break block10;
                            if (j1 != 0) break block11;
                            break block12;
                        }
                        abyte0[i1] = byte4;
                        --i;
                        ++i1;
                        --j1;
                        continue;
                    }
                    i = 1;
                    break block0;
                }
                abyte0[i1] = byte4;
                ++i1;
                --j1;
lbl30: // 2 sources:
                flag = true;
                while (flag) {
                    flag = false;
                    if (j == l1) {
                        i = 0;
                        break block0;
                    }
                    byte4 = (byte)k;
                    l = ai[l];
                    byte0 = (byte)(l & 255);
                    l >>= 8;
                    ++j;
                    if (byte0 != k) {
                        k = byte0;
                        if (j1 == 0) {
                            i = 1;
                            break block0;
                        }
                        abyte0[i1] = byte4;
                        ++i1;
                        --j1;
                        flag = true;
                        continue;
                    }
                    if (j != l1) continue;
                    if (j1 == 0) {
                        i = 1;
                        break block0;
                    }
                    abyte0[i1] = byte4;
                    ++i1;
                    --j1;
                    flag = true;
                }
                i = 2;
                l = ai[l];
                byte1 = (byte)(l & 255);
                l >>= 8;
                if (++j == l1) continue block0;
                if (byte1 != k) {
                    k = byte1;
                    continue block0;
                }
                i = 3;
                l = ai[l];
                byte2 = (byte)(l & 255);
                l >>= 8;
                if (++j == l1) continue block0;
                if (byte2 != k) {
                    k = byte2;
                    continue block0;
                }
                l = ai[l];
                byte3 = (byte)(l & 255);
                l >>= 8;
                ++j;
                i = (byte3 & 255) + 4;
                l = ai[l];
                k = (byte)(l & 255);
                l >>= 8;
                ++j;
                continue block0;
            }
            break;
        } while (true);
        i2 = class32.anInt571;
        class32.anInt571 += k1 - j1;
        if (class32.anInt571 < i2) {
            ++class32.anInt572;
        }
        class32.aByte573 = byte4;
        class32.anInt574 = i;
        class32.anInt584 = j;
        class32.anInt582 = k;
        Class32.anIntArray587 = ai;
        class32.anInt581 = l;
        class32.aByteArray568 = abyte0;
        class32.anInt569 = i1;
        class32.anInt570 = j1;
    }

    /*
     * Exception decompiling
     */
    private static void method227(Class32 class32) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[UNCONDITIONALDOLOOP]], but top level block is 12[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:809)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:191)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:136)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:369)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:770)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:702)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        // the.bytecode.club.bytecodeviewer.decompilers.CFRDecompiler.decompileToZip(CFRDecompiler.java:263)
        // the.bytecode.club.bytecodeviewer.gui.MainViewerGUI$18$1$3.run(MainViewerGUI.java:1122)
        throw new IllegalStateException("Decompilation failed");
    }

    private static byte method228(Class32 class32) {
        return (byte)Class13.method230(8, class32);
    }

    private static byte method229(Class32 class32) {
        return (byte)Class13.method230(1, class32);
    }

    private static int method230(int i, Class32 class32) {
        do {
            if (class32.anInt577 >= i) {
                int k = class32.anInt576 >> class32.anInt577 - i & (1 << i) - 1;
                class32.anInt577 -= i;
                return k;
            }
            class32.anInt576 = class32.anInt576 << 8 | class32.aByteArray563[class32.anInt564] & 255;
            class32.anInt577 += 8;
            ++class32.anInt564;
            --class32.anInt565;
            ++class32.anInt566;
            if (class32.anInt566 != 0) continue;
            ++class32.anInt567;
        } while (true);
    }

    private static void method231(Class32 class32) {
        class32.anInt588 = 0;
        int i = 0;
        while (i < 256) {
            if (class32.aBooleanArray589[i]) {
                class32.aByteArray591[class32.anInt588] = (byte)i;
                ++class32.anInt588;
            }
            ++i;
        }
    }

    private static void method232(int[] ai, int[] ai1, int[] ai2, byte[] abyte0, int i, int j, int k) {
        int l = 0;
        for (int i1 = i; i1 <= j; ++i1) {
            for (int l2 = 0; l2 < k; ++l2) {
                if (abyte0[l2] != i1) continue;
                ai2[l] = l2;
                ++l;
            }
        }
        for (int j1 = 0; j1 < 23; ++j1) {
            ai1[j1] = 0;
        }
        for (int k1 = 0; k1 < k; ++k1) {
            int[] arrn = ai1;
            int n = abyte0[k1] + 1;
            arrn[n] = arrn[n] + 1;
        }
        for (int l1 = 1; l1 < 23; ++l1) {
            int[] arrn = ai1;
            int n = l1;
            arrn[n] = arrn[n] + ai1[l1 - 1];
        }
        for (int i2 = 0; i2 < 23; ++i2) {
            ai[i2] = 0;
        }
        int i3 = 0;
        for (int j2 = i; j2 <= j; i3 <<= 1, ++j2) {
            ai[j2] = (i3 += ai1[j2 + 1] - ai1[j2]) - 1;
        }
        int k2 = i + 1;
        while (k2 <= j) {
            ai1[k2] = (ai[k2 - 1] + 1 << 1) - ai1[k2];
            ++k2;
        }
    }
}


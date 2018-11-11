/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client;

import com.imagineps.client.Class47;
import com.imagineps.client.Client;
import com.imagineps.client.Entity;
import com.imagineps.client.GroundDecoration;
import com.imagineps.client.GroundItemTile;
import com.imagineps.client.InteractiveObject;
import com.imagineps.client.Model;
import com.imagineps.client.Node;
import com.imagineps.client.NodeList;
import com.imagineps.client.PlainTile;
import com.imagineps.client.PlayerSettings;
import com.imagineps.client.ShapedTile;
import com.imagineps.client.Tile;
import com.imagineps.client.VertexNormal;
import com.imagineps.client.WallDecoration;
import com.imagineps.client.WallObject;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.Rasterizer;
import java.io.PrintStream;

final class WorldController {
    public static boolean HD = true;
    public static boolean lowMem = true;
    private static int anInt446;
    private static int anInt447;
    private static int anInt448;
    private static int anInt449;
    private static int anInt450;
    private static int anInt451;
    private static int anInt452;
    private static int anInt453;
    private static int anInt454;
    private static int anInt455;
    private static int anInt456;
    private static int anInt457;
    private static int anInt458;
    private static int anInt459;
    private static int anInt460;
    private static int anInt461;
    private static InteractiveObject[] aClass28Array462;
    private static final int[] anIntArray463;
    private static final int[] anIntArray464;
    private static final int[] anIntArray465;
    private static final int[] anIntArray466;
    private static boolean aBoolean467;
    private static int anInt468;
    private static int anInt469;
    public static int anInt470;
    public static int anInt471;
    private static final int anInt472;
    private static int[] anIntArray473;
    private static Class47[][] aClass47ArrayArray474;
    private static int anInt475;
    private static final Class47[] aClass47Array476;
    private static NodeList aClass19_477;
    private static final int[] anIntArray478;
    private static final int[] anIntArray479;
    private static final int[] anIntArray480;
    private static final int[] anIntArray481;
    private static final int[] anIntArray482;
    private static final int[] anIntArray483;
    private static final int[] anIntArray484;
    private static final int[] anIntArray485;
    private static int fowSize;
    private static boolean[][][][] aBooleanArrayArrayArrayArray491;
    private static boolean[][] aBooleanArrayArray492;
    private static int anInt493;
    private static int anInt494;
    private static int anInt495;
    private static int anInt496;
    private static int anInt497;
    private static int anInt498;
    private boolean aBoolean434;
    private final int anInt437;
    private final int anInt438;
    private final int anInt439;
    private final int[][][] anIntArrayArrayArray440;
    private final Tile[][][] tileArray;
    private int anInt442;
    private int obj5CacheCurrPos;
    private final InteractiveObject[] obj5Cache = new InteractiveObject[5000];
    private final int[][][] anIntArrayArrayArray445;
    private final int[] anIntArray486 = new int[10000];
    private final int[] anIntArray487 = new int[10000];
    private int anInt488;
    private final int[][] anIntArrayArray489 = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
    private final int[][] anIntArrayArray490 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};

    public static void method277(int i, int j, int k, int l, int i1, int j1, int l1, int i2) {
        Class47 class47 = new Class47();
        class47.anInt787 = j / 128;
        class47.anInt788 = l / 128;
        class47.anInt789 = l1 / 128;
        class47.anInt790 = i1 / 128;
        class47.anInt791 = i2;
        class47.anInt792 = j;
        class47.anInt793 = l;
        class47.anInt794 = l1;
        class47.anInt795 = i1;
        class47.anInt796 = j1;
        class47.anInt797 = k;
        int[] arrn = anIntArray473;
        int n = i;
        int n2 = arrn[n];
        arrn[n] = n2 + 1;
        WorldController.aClass47ArrayArray474[i][n2] = class47;
    }

    /*
     * Exception decompiling
     */
    public static void method310(int i, int j, int k, int l, int[] ai) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 2[UNCONDITIONALDOLOOP]
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

    private static boolean method311(int i, int j, int k) {
        int l = j * anInt460 + k * anInt461 >> 16;
        int i1 = j * anInt461 - k * anInt460 >> 16;
        int j1 = i * anInt458 + i1 * anInt459 >> 16;
        int k1 = i * anInt459 - i1 * anInt458 >> 16;
        if (j1 < 50) return false;
        if (j1 > 3500) {
            return false;
        }
        int l1 = anInt493 + (l << Client.log_view_dist) / j1;
        int i2 = anInt494 + (k1 << Client.log_view_dist) / j1;
        if (l1 < anInt495) return false;
        if (l1 > anInt497) return false;
        if (i2 < anInt496) return false;
        if (i2 > anInt498) return false;
        return true;
    }

    public static void nullLoader() {
        aClass28Array462 = null;
        anIntArray473 = null;
        aClass47ArrayArray474 = null;
        aClass19_477 = null;
        aBooleanArrayArrayArrayArray491 = null;
        aBooleanArrayArray492 = null;
    }

    public WorldController(int[][][] ai) {
        int i = 104;
        int j = 104;
        int k = 4;
        this.aBoolean434 = true;
        this.anInt437 = k;
        this.anInt438 = j;
        this.anInt439 = i;
        this.tileArray = new Tile[k][j][i];
        this.anIntArrayArrayArray445 = new int[k][j + 1][i + 1];
        this.anIntArrayArrayArray440 = ai;
        this.initToNull();
    }

    public void clearObj5Cache() {
        int i = 0;
        do {
            if (i >= this.obj5CacheCurrPos) {
                this.obj5CacheCurrPos = 0;
                return;
            }
            InteractiveObject object5 = this.obj5Cache[i];
            this.method289(object5);
            this.obj5Cache[i] = null;
            ++i;
        } while (true);
    }

    public void initToNull() {
        int j = 0;
        do {
            if (j >= this.anInt437) break;
            for (int k = 0; k < this.anInt438; ++k) {
                for (int i1 = 0; i1 < this.anInt439; ++i1) {
                    this.tileArray[j][k][i1] = null;
                }
            }
            ++j;
        } while (true);
        for (int l = 0; l < anInt472; ++l) {
            for (int j1 = 0; j1 < anIntArray473[l]; ++j1) {
                WorldController.aClass47ArrayArray474[l][j1] = null;
            }
            WorldController.anIntArray473[l] = 0;
        }
        for (int k1 = 0; k1 < this.obj5CacheCurrPos; ++k1) {
            this.obj5Cache[k1] = null;
        }
        this.obj5CacheCurrPos = 0;
        int l1 = 0;
        while (l1 < aClass28Array462.length) {
            WorldController.aClass28Array462[l1] = null;
            ++l1;
        }
    }

    public void method275(int i) {
        this.anInt442 = i;
        int k = 0;
        while (k < this.anInt438) {
            for (int l = 0; l < this.anInt439; ++l) {
                if (this.tileArray[i][k][l] != null) continue;
                this.tileArray[i][k][l] = new Tile(i, k, l);
            }
            ++k;
        }
    }

    public void method276(int i, int j) {
        Tile tile = this.tileArray[0][j][i];
        for (int l = 0; l < 3; ++l) {
            this.tileArray[l][j][i] = this.tileArray[l + 1][j][i];
            Tile class30_sub3_1 = this.tileArray[l][j][i];
            if (class30_sub3_1 == null) continue;
            --class30_sub3_1.tileZ;
            for (int j1 = 0; j1 < class30_sub3_1.count; ++j1) {
                InteractiveObject class28 = class30_sub3_1.interactiveObjects[j1];
                if ((class28.uid >> 29 & 3) != 2 || class28.tileLeft != j || class28.tileTop != i) continue;
                --class28.z;
            }
        }
        if (this.tileArray[0][j][i] == null) {
            this.tileArray[0][j][i] = new Tile(0, j, i);
        }
        this.tileArray[0][j][i].tileBelowZero = tile;
        this.tileArray[3][j][i] = null;
    }

    public void method278(int i, int j, int k, int l) {
        Tile class30_sub3 = this.tileArray[i][j][k];
        if (class30_sub3 == null) return;
        this.tileArray[i][j][k].logicHeight = l;
    }

    public void method279(int i, int j, int k, int l, int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2, int i3, int j3, int k3, int l3, int i4, int j4, int k4, int l4, boolean tex) {
        if (l == 0) {
            PlainTile class43 = new PlainTile(k2, l2, i3, j3, -1, k4);
            int i5 = i;
            do {
                if (i5 < 0) {
                    this.tileArray[i][j][k].plainTile = class43;
                    return;
                }
                if (this.tileArray[i5][j][k] == null) {
                    this.tileArray[i5][j][k] = new Tile(i5, j, k);
                }
                --i5;
            } while (true);
        }
        if (l == 1) {
            PlainTile class43_1 = new PlainTile(k3, l3, i4, j4, j1, l4);
            int j5 = i;
            do {
                if (j5 < 0) {
                    this.tileArray[i][j][k].plainTile = class43_1;
                    return;
                }
                if (this.tileArray[j5][j][k] == null) {
                    this.tileArray[j5][j][k] = new Tile(j5, j, k);
                }
                --j5;
            } while (true);
        }
        ShapedTile class40 = new ShapedTile(k, k3, j3, i2, j1, i4, i1, k2, k4, i3, j2, l1, k1, l, j4, l3, l2, j, l4, tex);
        int k5 = i;
        do {
            if (k5 < 0) {
                this.tileArray[i][j][k].shapedTile = class40;
                return;
            }
            if (this.tileArray[k5][j][k] == null) {
                this.tileArray[k5][j][k] = new Tile(k5, j, k);
            }
            --k5;
        } while (true);
    }

    public void addGroundDecoration(int i, int j, int k, Entity class30_sub2_sub4, byte byte0, int i1, int j1) {
        if (class30_sub2_sub4 == null) {
            return;
        }
        GroundDecoration class49 = new GroundDecoration();
        class49.entity = class30_sub2_sub4;
        class49.x = j1 * 128 + 64;
        class49.y = k * 128 + 64;
        class49.z = j;
        class49.uid = i1;
        class49.config = byte0;
        if (this.tileArray[i][j1][k] == null) {
            this.tileArray[i][j1][k] = new Tile(i, j1, k);
        }
        this.tileArray[i][j1][k].groundDecoration = class49;
    }

    public void addGroundTileItem(int i, int j, Entity class30_sub2_sub4, int k, Entity class30_sub2_sub4_1, Entity class30_sub2_sub4_2, int l, int i1) {
        GroundItemTile groundItemTile = new GroundItemTile();
        groundItemTile.groundItemOne = class30_sub2_sub4_2;
        groundItemTile.x = i * 128 + 64;
        groundItemTile.y = i1 * 128 + 64;
        groundItemTile.z = k;
        groundItemTile.uid = j;
        groundItemTile.groundItemTwo = class30_sub2_sub4;
        groundItemTile.groundItemThree = class30_sub2_sub4_1;
        int j1 = 0;
        Tile class30_sub3 = this.tileArray[l][i][i1];
        if (class30_sub3 != null) {
            for (int k1 = 0; k1 < class30_sub3.count; ++k1) {
                int l1;
                if (!(class30_sub3.interactiveObjects[k1].animable instanceof Model) || (l1 = ((Model)class30_sub3.interactiveObjects[k1].animable).anInt1654) <= j1) continue;
                j1 = l1;
            }
        }
        groundItemTile.anInt52 = j1;
        if (this.tileArray[l][i][i1] == null) {
            this.tileArray[l][i][i1] = new Tile(l, i, i1);
        }
        this.tileArray[l][i][i1].groundItemTile = groundItemTile;
    }

    public void addWallObject(int i, Entity class30_sub2_sub4, int j, int k, byte byte0, int l, Entity class30_sub2_sub4_1, int i1, int j1, int k1) {
        if (class30_sub2_sub4 == null && class30_sub2_sub4_1 == null) {
            return;
        }
        WallObject object1 = new WallObject();
        object1.uid = j;
        object1.config = byte0;
        object1.x = l * 128 + 64;
        object1.y = k * 128 + 64;
        object1.z = i1;
        object1.entityOne = class30_sub2_sub4;
        object1.entityTwo = class30_sub2_sub4_1;
        object1.orientation = i;
        object1.orientation1 = j1;
        int l1 = k1;
        do {
            if (l1 < 0) {
                this.tileArray[k1][l][k].wallObject = object1;
                return;
            }
            if (this.tileArray[l1][l][k] == null) {
                this.tileArray[l1][l][k] = new Tile(l1, l, k);
            }
            --l1;
        } while (true);
    }

    public void method283(int i, int j, int k, int i1, int j1, int k1, Entity class30_sub2_sub4, int l1, byte byte0, int i2, int j2) {
        if (class30_sub2_sub4 == null) {
            return;
        }
        WallDecoration class26 = new WallDecoration();
        class26.uid = i;
        class26.config = byte0;
        class26.x = l1 * 128 + 64 + j1;
        class26.y = j * 128 + 64 + i2;
        class26.z = k1;
        class26.entity = class30_sub2_sub4;
        class26.configBits = j2;
        class26.direction = k;
        int k2 = i1;
        do {
            if (k2 < 0) {
                this.tileArray[i1][l1][j].wallDecoration = class26;
                return;
            }
            if (this.tileArray[k2][l1][j] == null) {
                this.tileArray[k2][l1][j] = new Tile(k2, l1, j);
            }
            --k2;
        } while (true);
    }

    public boolean method284(int i, byte byte0, int j, int k, Entity class30_sub2_sub4, int l, int i1, int j1, int k1, int l1) {
        if (class30_sub2_sub4 == null) {
            return true;
        }
        int i2 = l1 * 128 + 64 * l;
        int j2 = k1 * 128 + 64 * k;
        return this.method287(i1, l1, k1, l, k, i2, j2, j, class30_sub2_sub4, j1, false, i, byte0);
    }

    public boolean method285(int i, int j, int k, int l, int i1, int j1, int k1, Entity class30_sub2_sub4, boolean flag) {
        if (class30_sub2_sub4 == null) {
            return true;
        }
        int l1 = k1 - j1;
        int i2 = i1 - j1;
        int j2 = k1 + j1;
        int k2 = i1 + j1;
        if (!flag) return this.method287(i, l1, i2, (j2 /= 128) - (l1 /= 128) + 1, (k2 /= 128) - (i2 /= 128) + 1, k1, i1, k, class30_sub2_sub4, j, true, l, (byte)0);
        if (j > 640 && j < 1408) {
            k2 += 128;
        }
        if (j > 1152 && j < 1920) {
            j2 += 128;
        }
        if (j > 1664 || j < 384) {
            i2 -= 128;
        }
        if (j <= 128) return this.method287(i, l1, i2, (j2 /= 128) - (l1 /= 128) + 1, (k2 /= 128) - (i2 /= 128) + 1, k1, i1, k, class30_sub2_sub4, j, true, l, (byte)0);
        if (j >= 896) return this.method287(i, l1, i2, (j2 /= 128) - (l1 /= 128) + 1, (k2 /= 128) - (i2 /= 128) + 1, k1, i1, k, class30_sub2_sub4, j, true, l, (byte)0);
        l1 -= 128;
        return this.method287(i, l1, i2, (j2 /= 128) - (l1 /= 128) + 1, (k2 /= 128) - (i2 /= 128) + 1, k1, i1, k, class30_sub2_sub4, j, true, l, (byte)0);
    }

    public boolean method286(int j, int k, Entity class30_sub2_sub4, int l, int i1, int j1, int k1, int l1, int i2, int j2, int k2) {
        if (class30_sub2_sub4 == null) return true;
        if (this.method287(j, l1, k2, i2 - l1 + 1, i1 - k2 + 1, j1, k, k1, class30_sub2_sub4, l, true, j2, (byte)0)) return true;
        return false;
    }

    private boolean method287(int i, int j, int k, int l, int i1, int j1, int k1, int l1, Entity class30_sub2_sub4, int i2, boolean flag, int j2, byte byte0) {
        int k2 = j;
        do {
            if (k2 >= j + l) break;
            for (int l2 = k; l2 < k + i1; ++l2) {
                if (k2 < 0) return false;
                if (l2 < 0) return false;
                if (k2 >= this.anInt438) return false;
                if (l2 >= this.anInt439) {
                    return false;
                }
                Tile class30_sub3 = this.tileArray[i][k2][l2];
                if (class30_sub3 == null || class30_sub3.count < 5) continue;
                return false;
            }
            ++k2;
        } while (true);
        InteractiveObject class28 = new InteractiveObject();
        class28.uid = j2;
        class28.config = byte0;
        class28.z = i;
        class28.anInt519 = j1;
        class28.anInt520 = k1;
        class28.anInt518 = l1;
        class28.animable = class30_sub2_sub4;
        class28.anInt522 = i2;
        class28.tileLeft = j;
        class28.tileTop = k;
        class28.anInt524 = j + l - 1;
        class28.anInt526 = k + i1 - 1;
        int i3 = j;
        do {
            int k3;
            if (i3 >= j + l) {
                if (!flag) return true;
                this.obj5Cache[this.obj5CacheCurrPos++] = class28;
                return true;
            }
            for (int j3 = k; j3 < k + i1; class30_sub3_1.anInt1320 |= k3, ++class30_sub3_1.count, ++j3) {
                k3 = 0;
                if (i3 > j) {
                    ++k3;
                }
                if (i3 < j + l - 1) {
                    k3 += 4;
                }
                if (j3 > k) {
                    k3 += 8;
                }
                if (j3 < k + i1 - 1) {
                    k3 += 2;
                }
                for (int l3 = i; l3 >= 0; --l3) {
                    if (this.tileArray[l3][i3][j3] != null) continue;
                    this.tileArray[l3][i3][j3] = new Tile(l3, i3, j3);
                }
                Tile class30_sub3_1 = this.tileArray[i][i3][j3];
                class30_sub3_1.interactiveObjects[class30_sub3_1.count] = class28;
                class30_sub3_1.anIntArray1319[class30_sub3_1.count] = k3;
            }
            ++i3;
        } while (true);
    }

    private void method289(InteractiveObject class28) {
        int j = class28.tileLeft;
        block0 : while (j <= class28.anInt524) {
            int k = class28.tileTop;
            do {
                block6 : {
                    block7 : {
                        block5 : {
                            if (k > class28.anInt526) break block5;
                            Tile class30_sub3 = this.tileArray[class28.z][j][k];
                            if (class30_sub3 == null) break block6;
                            break block7;
                        }
                        ++j;
                        continue block0;
                    }
                    for (int l = 0; l < class30_sub3.count; ++l) {
                        if (class30_sub3.interactiveObjects[l] != class28) continue;
                        --class30_sub3.count;
                        for (int i1 = l; i1 < class30_sub3.count; ++i1) {
                            class30_sub3.interactiveObjects[i1] = class30_sub3.interactiveObjects[i1 + 1];
                            class30_sub3.anIntArray1319[i1] = class30_sub3.anIntArray1319[i1 + 1];
                        }
                        class30_sub3.interactiveObjects[class30_sub3.count] = null;
                        break;
                    }
                    class30_sub3.anInt1320 = 0;
                    for (int j1 = 0; j1 < class30_sub3.count; class30_sub3.anInt1320 |= class30_sub3.anIntArray1319[j1], ++j1) {
                    }
                }
                ++k;
            } while (true);
            break;
        }
        return;
    }

    public void method290(int i, int k, int l, int i1) {
        Tile class30_sub3 = this.tileArray[i1][l][i];
        if (class30_sub3 == null) {
            return;
        }
        WallDecoration class26 = class30_sub3.wallDecoration;
        if (class26 == null) return;
        int j1 = l * 128 + 64;
        int k1 = i * 128 + 64;
        class26.x = j1 + (class26.x - j1) * k / 16;
        class26.y = k1 + (class26.y - k1) * k / 16;
    }

    public void method291(int i, int j, int k, byte byte0) {
        Tile class30_sub3 = this.tileArray[j][i][k];
        if (byte0 != -119) {
            this.aBoolean434 = !this.aBoolean434;
        }
        if (class30_sub3 == null) return;
        class30_sub3.wallObject = null;
    }

    public void method292(int j, int k, int l) {
        Tile class30_sub3 = this.tileArray[k][l][j];
        if (class30_sub3 == null) return;
        class30_sub3.wallDecoration = null;
    }

    public void method293(int i, int k, int l) {
        Tile class30_sub3 = this.tileArray[i][k][l];
        if (class30_sub3 == null) {
            return;
        }
        int j1 = 0;
        while (j1 < class30_sub3.count) {
            InteractiveObject class28 = class30_sub3.interactiveObjects[j1];
            if ((class28.uid >> 29 & 3) == 2 && class28.tileLeft == k && class28.tileTop == l) {
                this.method289(class28);
                return;
            }
            ++j1;
        }
    }

    public void method294(int i, int j, int k) {
        Tile class30_sub3 = this.tileArray[i][k][j];
        if (class30_sub3 == null) {
            return;
        }
        class30_sub3.groundDecoration = null;
    }

    public void method295(int i, int j, int k) {
        Tile class30_sub3 = this.tileArray[i][j][k];
        if (class30_sub3 == null) return;
        class30_sub3.groundItemTile = null;
    }

    public WallObject method296(int i, int j, int k) {
        Tile class30_sub3 = this.tileArray[i][j][k];
        if (class30_sub3 != null) return class30_sub3.wallObject;
        return null;
    }

    public WallDecoration method297(int i, int k, int l) {
        Tile class30_sub3 = this.tileArray[l][i][k];
        if (class30_sub3 != null) return class30_sub3.wallDecoration;
        return null;
    }

    public InteractiveObject method298(int i, int j, int k) {
        Tile class30_sub3 = this.tileArray[k][i][j];
        if (class30_sub3 == null) {
            return null;
        }
        int l = 0;
        while (l < class30_sub3.count) {
            InteractiveObject class28 = class30_sub3.interactiveObjects[l];
            if ((class28.uid >> 29 & 3) == 2 && class28.tileLeft == i && class28.tileTop == j) {
                return class28;
            }
            ++l;
        }
        return null;
    }

    public GroundDecoration method299(int i, int j, int k) {
        Tile class30_sub3 = this.tileArray[k][j][i];
        if (class30_sub3 == null) return null;
        if (class30_sub3.groundDecoration != null) return class30_sub3.groundDecoration;
        return null;
    }

    public int method300(int i, int j, int k) {
        Tile class30_sub3 = this.tileArray[i][j][k];
        if (class30_sub3 == null) return 0;
        if (class30_sub3.wallObject != null) return class30_sub3.wallObject.uid;
        return 0;
    }

    public int method301(int i, int j, int l) {
        Tile class30_sub3 = this.tileArray[i][j][l];
        if (class30_sub3 == null) return 0;
        if (class30_sub3.wallDecoration != null) return class30_sub3.wallDecoration.uid;
        return 0;
    }

    public int method302(int i, int j, int k) {
        Tile class30_sub3 = this.tileArray[i][j][k];
        if (class30_sub3 == null) {
            return 0;
        }
        int l = 0;
        while (l < class30_sub3.count) {
            InteractiveObject class28 = class30_sub3.interactiveObjects[l];
            if ((class28.uid >> 29 & 3) == 2 && class28.tileLeft == j && class28.tileTop == k) {
                return class28.uid;
            }
            ++l;
        }
        return 0;
    }

    public int method303(int i, int j, int k) {
        Tile class30_sub3 = this.tileArray[i][j][k];
        if (class30_sub3 == null) return 0;
        if (class30_sub3.groundDecoration != null) return class30_sub3.groundDecoration.uid;
        return 0;
    }

    public int getObjectConfig(int i, int j, int k, int l) {
        Tile class30_sub3 = this.tileArray[i][j][k];
        if (class30_sub3 == null) {
            return -1;
        }
        if (class30_sub3.wallObject != null && class30_sub3.wallObject.uid == l) {
            return class30_sub3.wallObject.config & 255;
        }
        if (class30_sub3.wallDecoration != null && class30_sub3.wallDecoration.uid == l) {
            return class30_sub3.wallDecoration.config & 255;
        }
        if (class30_sub3.groundDecoration != null && class30_sub3.groundDecoration.uid == l) {
            return class30_sub3.groundDecoration.config & 255;
        }
        int i1 = 0;
        while (i1 < class30_sub3.count) {
            if (class30_sub3.interactiveObjects[i1].uid == l) {
                return class30_sub3.interactiveObjects[i1].config & 255;
            }
            ++i1;
        }
        return -1;
    }

    public void method305(int i, int k, int i1) {
        int j = 100;
        int l = 5500;
        int j1 = (int)Math.sqrt((double)(k * k + i * i + i1 * i1));
        int b = (int)Math.ceil((double)((double)j * 12.69));
        int k1 = b + l / 2 >> 4;
        int l1 = 0;
        block0 : while (l1 < this.anInt437) {
            int i2 = 0;
            do {
                if (i2 < this.anInt438) {
                } else {
                    ++l1;
                    continue block0;
                }
                for (int j2 = 0; j2 < this.anInt439; ++j2) {
                    Tile class30_sub3 = this.tileArray[l1][i2][j2];
                    if (class30_sub3 == null) continue;
                    WallObject class10 = class30_sub3.wallObject;
                    if (class10 != null && class10.entityOne != null && class10.entityOne.vertexNormals != null) {
                        this.method307(l1, 1, 1, i2, j2, (Model)class10.entityOne);
                        if (class10.entityTwo != null && class10.entityTwo.vertexNormals != null) {
                            this.method307(l1, 1, 1, i2, j2, (Model)class10.entityTwo);
                            this.method308((Model)class10.entityOne, (Model)class10.entityTwo, 0, 0, 0, false);
                            ((Model)class10.entityTwo).method480(j, k1, k, i, i1);
                        }
                        ((Model)class10.entityOne).method480(j, k1, k, i, i1);
                    }
                    for (int k2 = 0; k2 < class30_sub3.count; ++k2) {
                        InteractiveObject class28 = class30_sub3.interactiveObjects[k2];
                        if (class28 == null || class28.animable == null || class28.animable.vertexNormals == null) continue;
                        this.method307(l1, class28.anInt524 - class28.tileLeft + 1, class28.anInt526 - class28.tileTop + 1, i2, j2, (Model)class28.animable);
                        ((Model)class28.animable).method480(j, k1, k, i, i1);
                    }
                    GroundDecoration class49 = class30_sub3.groundDecoration;
                    if (class49 == null || class49.entity.vertexNormals == null) continue;
                    this.method306(i2, l1, (Model)class49.entity, j2);
                    ((Model)class49.entity).method480(j, k1, k, i, i1);
                }
                ++i2;
            } while (true);
            break;
        }
        return;
    }

    private void method306(int i, int j, Model model, int k) {
        Tile class30_sub3_1;
        Tile class30_sub3;
        Tile class30_sub3_2;
        if (i < this.anInt438 && (class30_sub3 = this.tileArray[j][i + 1][k]) != null && class30_sub3.groundDecoration != null && class30_sub3.groundDecoration.entity.vertexNormals != null) {
            this.method308(model, (Model)class30_sub3.groundDecoration.entity, 128, 0, 0, true);
        }
        if (k < this.anInt438 && (class30_sub3_1 = this.tileArray[j][i][k + 1]) != null && class30_sub3_1.groundDecoration != null && class30_sub3_1.groundDecoration.entity.vertexNormals != null) {
            this.method308(model, (Model)class30_sub3_1.groundDecoration.entity, 0, 0, 128, true);
        }
        if (i < this.anInt438 && k < this.anInt439 && (class30_sub3_2 = this.tileArray[j][i + 1][k + 1]) != null && class30_sub3_2.groundDecoration != null && class30_sub3_2.groundDecoration.entity.vertexNormals != null) {
            this.method308(model, (Model)class30_sub3_2.groundDecoration.entity, 128, 0, 128, true);
        }
        if (i >= this.anInt438) return;
        if (k <= 0) return;
        Tile class30_sub3_3 = this.tileArray[j][i + 1][k - 1];
        if (class30_sub3_3 == null) return;
        if (class30_sub3_3.groundDecoration == null) return;
        if (class30_sub3_3.groundDecoration.entity.vertexNormals == null) return;
        this.method308(model, (Model)class30_sub3_3.groundDecoration.entity, 128, 0, -128, true);
    }

    /*
     * Unable to fully structure code
     */
    private void method307(int i, int j, int k, int l, int i1, Model model) {
        flag = true;
        j1 = l;
        k1 = l + j;
        l1 = i1 - 1;
        i2 = i1 + k;
        j2 = i;
        block0 : do {
            if (j2 > i + 1) return;
            if (j2 == this.anInt437) ** GOTO lbl18
            k2 = j1;
            do {
                block7 : {
                    block8 : {
                        block6 : {
                            if (k2 > k1) break block6;
                            if (k2 < 0 || k2 >= this.anInt438) break block7;
                            break block8;
                        }
                        --j1;
                        flag = false;
lbl18: // 2 sources:
                        ++j2;
                        continue block0;
                    }
                    for (l2 = l1; l2 <= i2; ++l2) {
                        if (l2 < 0 || l2 >= this.anInt439 || flag && k2 < k1 && l2 < i2 && (l2 >= i1 || k2 == l) || (class30_sub3 = this.tileArray[j2][k2][l2]) == null) continue;
                        i3 = (this.anIntArrayArrayArray440[j2][k2][l2] + this.anIntArrayArrayArray440[j2][k2 + 1][l2] + this.anIntArrayArrayArray440[j2][k2][l2 + 1] + this.anIntArrayArrayArray440[j2][k2 + 1][l2 + 1]) / 4 - (this.anIntArrayArrayArray440[i][l][i1] + this.anIntArrayArrayArray440[i][l + 1][i1] + this.anIntArrayArrayArray440[i][l][i1 + 1] + this.anIntArrayArrayArray440[i][l + 1][i1 + 1]) / 4;
                        class10 = class30_sub3.wallObject;
                        if (class10 != null && class10.entityOne != null && class10.entityOne.vertexNormals != null) {
                            this.method308(model, (Model)class10.entityOne, (k2 - l) * 128 + (1 - j) * 64, i3, (l2 - i1) * 128 + (1 - k) * 64, flag);
                        }
                        if (class10 != null && class10.entityTwo != null && class10.entityTwo.vertexNormals != null) {
                            this.method308(model, (Model)class10.entityTwo, (k2 - l) * 128 + (1 - j) * 64, i3, (l2 - i1) * 128 + (1 - k) * 64, flag);
                        }
                        for (j3 = 0; j3 < class30_sub3.count; ++j3) {
                            class28 = class30_sub3.interactiveObjects[j3];
                            if (class28 == null || class28.animable == null || class28.animable.vertexNormals == null) continue;
                            k3 = class28.anInt524 - class28.tileLeft + 1;
                            l3 = class28.anInt526 - class28.tileTop + 1;
                            this.method308(model, (Model)class28.animable, (class28.tileLeft - l) * 128 + (k3 - j) * 64, i3, (class28.tileTop - i1) * 128 + (l3 - k) * 64, flag);
                        }
                    }
                }
                ++k2;
            } while (true);
            break;
        } while (true);
    }

    private void method308(Model model, Model model_1, int i, int j, int k, boolean flag) {
        ++this.anInt488;
        int l = 0;
        int[] ai = model_1.anIntArray1627;
        int i1 = model_1.anInt1626;
        for (int j1 = 0; j1 < model.anInt1626; ++j1) {
            int j2;
            int k2;
            int i2;
            VertexNormal class33 = model.vertexNormals[j1];
            VertexNormal class33_1 = model.aClass33Array1660[j1];
            if (class33_1.divisor == 0 || (i2 = model.anIntArray1628[j1] - j) > model_1.anInt1651 || (j2 = model.anIntArray1627[j1] - i) < model_1.anInt1646 || j2 > model_1.anInt1647 || (k2 = model.anIntArray1629[j1] - k) < model_1.anInt1649 || k2 > model_1.anInt1648) continue;
            for (int l2 = 0; l2 < i1; ++l2) {
                VertexNormal class33_2 = model_1.vertexNormals[l2];
                VertexNormal class33_3 = model_1.aClass33Array1660[l2];
                if (j2 != ai[l2] || k2 != model_1.anIntArray1629[l2] || i2 != model_1.anIntArray1628[l2] || class33_3.divisor == 0) continue;
                class33.x += class33_3.x;
                class33.y += class33_3.y;
                class33.z += class33_3.z;
                class33.divisor += class33_3.divisor;
                class33_2.x += class33_1.x;
                class33_2.y += class33_1.y;
                class33_2.z += class33_1.z;
                class33_2.divisor += class33_1.divisor;
                ++l;
                this.anIntArray486[j1] = this.anInt488;
                this.anIntArray487[l2] = this.anInt488;
            }
        }
        if (l < 3) return;
        if (!flag) {
            return;
        }
        for (int k1 = 0; k1 < model.anInt1630; ++k1) {
            if (this.anIntArray486[model.anIntArray1631[k1]] != this.anInt488 || this.anIntArray486[model.anIntArray1632[k1]] != this.anInt488 || this.anIntArray486[model.anIntArray1633[k1]] != this.anInt488) continue;
            model.anIntArray1637[k1] = -1;
        }
        int l1 = 0;
        while (l1 < model_1.anInt1630) {
            if (this.anIntArray487[model_1.anIntArray1631[l1]] == this.anInt488 && this.anIntArray487[model_1.anIntArray1632[l1]] == this.anInt488 && this.anIntArray487[model_1.anIntArray1633[l1]] == this.anInt488) {
                model_1.anIntArray1637[l1] = -1;
            }
            ++l1;
        }
    }

    public void method309(int[] pixels, int pixelOffset, int z, int x, int y) {
        int k2;
        int[] ai2;
        int[] ai1;
        int l2;
        int j2;
        block33 : {
            int l21;
            int k1;
            int l31;
            int hs1;
            int l11;
            int l41;
            block32 : {
                int hs;
                int l22;
                int l4;
                int l1;
                int l3;
                block30 : {
                    block31 : {
                        block28 : {
                            block29 : {
                                if (!HD) return;
                                Tile class30_sub3 = this.tileArray[z][x][y];
                                if (class30_sub3 == null) {
                                    return;
                                }
                                PlainTile class43 = class30_sub3.plainTile;
                                if (class43 == null) break block28;
                                if (class43.anInt716 == 12345678) break block29;
                                if (class43.anInt722 == 0) {
                                    return;
                                }
                                hs = class43.anInt716 & -128;
                                l1 = class43.anInt719 & 127;
                                l22 = class43.anInt718 & 127;
                                l3 = (class43.anInt716 & 127) - l1;
                                l4 = (class43.anInt717 & 127) - l22;
                                l1 <<= 2;
                                l22 <<= 2;
                                break block30;
                            }
                            int mapColor = class43.anInt722;
                            if (mapColor == 0) {
                                return;
                            }
                            int k12 = 0;
                            while (k12 < 4) {
                                pixels[pixelOffset] = mapColor;
                                pixels[pixelOffset + 1] = mapColor;
                                pixels[pixelOffset + 2] = mapColor;
                                pixels[pixelOffset + 3] = mapColor;
                                pixelOffset += 512;
                                ++k12;
                            }
                            return;
                        }
                        ShapedTile class40 = class30_sub3.shapedTile;
                        if (class40 == null) {
                            return;
                        }
                        int l12 = class40.shape;
                        int i2 = class40.rotation;
                        j2 = class40.colorRGB;
                        k2 = class40.colorARGB;
                        ai1 = this.anIntArrayArray489[l12];
                        ai2 = this.anIntArrayArray490[i2];
                        l2 = 0;
                        if (class40.color62 == 12345678) break block31;
                        hs1 = class40.color62 & -128;
                        l11 = class40.color92 & 127;
                        l21 = class40.color82 & 127;
                        l31 = (class40.color62 & 127) - l11;
                        l41 = (class40.color72 & 127) - l21;
                        l11 <<= 2;
                        l21 <<= 2;
                        break block32;
                    }
                    if (j2 == 0) {
                        int j3 = 0;
                        while (j3 < 4) {
                            if (ai1[ai2[l2++]] != 0) {
                                pixels[pixelOffset] = k2;
                            }
                            if (ai1[ai2[l2++]] != 0) {
                                pixels[pixelOffset + 1] = k2;
                            }
                            if (ai1[ai2[l2++]] != 0) {
                                pixels[pixelOffset + 2] = k2;
                            }
                            if (ai1[ai2[l2++]] != 0) {
                                pixels[pixelOffset + 3] = k2;
                            }
                            pixelOffset += 512;
                            ++j3;
                        }
                        return;
                    }
                    break block33;
                }
                int k13 = 0;
                while (k13 < 4) {
                    if (!class43.aBoolean721) {
                        pixels[pixelOffset] = Rasterizer.anIntArray1482[hs | l1 >> 2];
                        pixels[pixelOffset + 1] = Rasterizer.anIntArray1482[hs | l1 * 3 + l22 >> 4];
                        pixels[pixelOffset + 2] = Rasterizer.anIntArray1482[hs | l1 + l22 >> 3];
                        pixels[pixelOffset + 3] = Rasterizer.anIntArray1482[hs | l1 + l22 * 3 >> 4];
                    } else {
                        int j1 = class43.anInt722;
                        int lig = 255 - ((l1 >> 1) * (l1 >> 1) >> 8);
                        pixels[pixelOffset] = ((j1 & 16711935) * lig & -16711936) + ((j1 & 65280) * lig & 16711680) >> 8;
                        lig = 255 - ((l1 * 3 + l22 >> 3) * (l1 * 3 + l22 >> 3) >> 8);
                        pixels[pixelOffset + 1] = ((j1 & 16711935) * lig & -16711936) + ((j1 & 65280) * lig & 16711680) >> 8;
                        lig = 255 - ((l1 + l22 >> 2) * (l1 + l22 >> 2) >> 8);
                        pixels[pixelOffset + 2] = ((j1 & 16711935) * lig & -16711936) + ((j1 & 65280) * lig & 16711680) >> 8;
                        lig = 255 - ((l1 + l22 * 3 >> 3) * (l1 + l22 * 3 >> 3) >> 8);
                        pixels[pixelOffset + 3] = ((j1 & 16711935) * lig & -16711936) + ((j1 & 65280) * lig & 16711680) >> 8;
                    }
                    l1 += l3;
                    l22 += l4;
                    pixelOffset += 512;
                    ++k13;
                }
                return;
            }
            for (k1 = 0; k1 < 4; l11 += l31, l21 += l41, pixelOffset += 512, ++k1) {
                int lig;
                if (!class40.textured) {
                    if (ai1[ai2[l2++]] != 0) {
                        pixels[pixelOffset] = Rasterizer.anIntArray1482[hs1 | l11 >> 2];
                    }
                    if (ai1[ai2[l2++]] != 0) {
                        pixels[pixelOffset + 1] = Rasterizer.anIntArray1482[hs1 | l11 * 3 + l21 >> 4];
                    }
                    if (ai1[ai2[l2++]] != 0) {
                        pixels[pixelOffset + 2] = Rasterizer.anIntArray1482[hs1 | l11 + l21 >> 3];
                    }
                    if (ai1[ai2[l2++]] == 0) continue;
                    pixels[pixelOffset + 3] = Rasterizer.anIntArray1482[hs1 | l11 + l21 * 3 >> 4];
                    continue;
                }
                int j1 = k2;
                if (ai1[ai2[l2++]] != 0) {
                    lig = 255 - ((l11 >> 1) * (l11 >> 1) >> 8);
                    pixels[pixelOffset] = ((j1 & 16711935) * lig & -16711936) + ((j1 & 65280) * lig & 16711680) >> 8;
                }
                if (ai1[ai2[l2++]] != 0) {
                    lig = 255 - ((l11 * 3 + l21 >> 3) * (l11 * 3 + l21 >> 3) >> 8);
                    pixels[pixelOffset + 1] = ((j1 & 16711935) * lig & -16711936) + ((j1 & 65280) * lig & 16711680) >> 8;
                }
                if (ai1[ai2[l2++]] != 0) {
                    lig = 255 - ((l11 + l21 >> 2) * (l11 + l21 >> 2) >> 8);
                    pixels[pixelOffset + 2] = ((j1 & 16711935) * lig & -16711936) + ((j1 & 65280) * lig & 16711680) >> 8;
                }
                if (ai1[ai2[l2++]] == 0) continue;
                lig = 255 - ((l11 + l21 * 3 >> 3) * (l11 + l21 * 3 >> 3) >> 8);
                pixels[pixelOffset + 3] = ((j1 & 16711935) * lig & -16711936) + ((j1 & 65280) * lig & 16711680) >> 8;
            }
            if (j2 == 0) return;
            if (class40.color61 == 12345678) return;
            pixelOffset -= 2048;
            l2 -= 16;
            hs1 = class40.color61 & -128;
            l11 = class40.color91 & 127;
            l21 = class40.color81 & 127;
            l31 = (class40.color61 & 127) - l11;
            l41 = (class40.color71 & 127) - l21;
            l11 <<= 2;
            l21 <<= 2;
            k1 = 0;
            while (k1 < 4) {
                if (ai1[ai2[l2++]] == 0) {
                    pixels[pixelOffset] = Rasterizer.anIntArray1482[hs1 | l11 >> 2];
                }
                if (ai1[ai2[l2++]] == 0) {
                    pixels[pixelOffset + 1] = Rasterizer.anIntArray1482[hs1 | l11 * 3 + l21 >> 4];
                }
                if (ai1[ai2[l2++]] == 0) {
                    pixels[pixelOffset + 2] = Rasterizer.anIntArray1482[hs1 | l11 + l21 >> 3];
                }
                if (ai1[ai2[l2++]] == 0) {
                    pixels[pixelOffset + 3] = Rasterizer.anIntArray1482[hs1 | l11 + l21 * 3 >> 4];
                }
                l11 += l31;
                l21 += l41;
                pixelOffset += 512;
                ++k1;
            }
            return;
        }
        int i3 = 0;
        while (i3 < 4) {
            pixels[pixelOffset] = ai1[ai2[l2++]] != 0 ? k2 : j2;
            pixels[pixelOffset + 1] = ai1[ai2[l2++]] != 0 ? k2 : j2;
            pixels[pixelOffset + 2] = ai1[ai2[l2++]] != 0 ? k2 : j2;
            pixels[pixelOffset + 3] = ai1[ai2[l2++]] != 0 ? k2 : j2;
            pixelOffset += 512;
            ++i3;
        }
    }

    public void method312(int i, int j) {
        aBoolean467 = true;
        anInt468 = j;
        anInt469 = i;
        anInt470 = -1;
        anInt471 = -1;
    }

    public void method313(int i, int j, int k, int l, int i1, int j1) {
        if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.INCREASE_RENDER_DISTANCE)) {
            fowSize = 25;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.anInt438 * 128) {
            i = this.anInt438 * 128 - 1;
        }
        if (j < 0) {
            j = 0;
        } else if (j >= this.anInt439 * 128) {
            j = this.anInt439 * 128 - 1;
        }
        ++anInt448;
        anInt458 = Model.modelIntArray1[j1];
        anInt459 = Model.modelIntArray2[j1];
        anInt460 = Model.modelIntArray1[k];
        anInt461 = Model.modelIntArray2[k];
        if (aBooleanArrayArrayArrayArray491 != null) {
            try {
                aBooleanArrayArray492 = aBooleanArrayArrayArrayArray491[(j1 - 128) / 32][k / 64];
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        anInt455 = i;
        anInt456 = l;
        anInt457 = j;
        anInt453 = i / 128;
        anInt454 = j / 128;
        anInt447 = i1;
        anInt449 = anInt453 - fowSize;
        if (anInt449 < 0) {
            anInt449 = 0;
        }
        if ((WorldController.anInt451 = anInt454 - fowSize) < 0) {
            anInt451 = 0;
        }
        if ((WorldController.anInt450 = anInt453 + fowSize) > this.anInt438) {
            anInt450 = this.anInt438;
        }
        if ((WorldController.anInt452 = anInt454 + fowSize) > this.anInt439) {
            anInt452 = this.anInt439;
        }
        if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.INCREASE_RENDER_DISTANCE)) {
            anInt450 += Client.renderDistance;
            anInt451 -= Client.renderDistance;
            anInt452 += Client.renderDistance;
            if ((anInt449 -= Client.renderDistance) < 1) {
                anInt449 = 1;
            }
            if (anInt451 < 1) {
                anInt451 = 1;
            }
            if (anInt450 > 102) {
                anInt450 = 102;
            }
            if (anInt452 > 102) {
                anInt452 = 102;
            }
        }
        this.method319();
        anInt446 = 0;
        int k1 = this.anInt442;
        block2 : do {
            if (k1 >= this.anInt437) break;
            Tile[][] aclass30_sub3 = this.tileArray[k1];
            int i2 = anInt449;
            do {
                if (i2 < anInt450) {
                } else {
                    ++k1;
                    continue block2;
                }
                for (int k2 = WorldController.anInt451; k2 < anInt452; ++k2) {
                    Tile class30_sub3 = aclass30_sub3[i2][k2];
                    if (class30_sub3 == null) continue;
                    int x = i2 - anInt453 + fowSize;
                    int y = k2 - anInt454 + fowSize;
                    if (x < 0) {
                        x = 0;
                    } else if (x >= aBooleanArrayArray492.length) {
                        x = aBooleanArrayArray492.length - 1;
                    }
                    if (y < 0) {
                        y = 0;
                    } else if (y >= aBooleanArrayArray492[x].length) {
                        y = aBooleanArrayArray492[x].length - 1;
                    }
                    if (class30_sub3.logicHeight > i1 || !aBooleanArrayArray492[x][y] && this.anIntArrayArrayArray440[k1][i2][k2] - l < (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.INCREASE_RENDER_DISTANCE) ? 0 : 2000)) {
                        class30_sub3.aBoolean1322 = false;
                        class30_sub3.aBoolean1323 = false;
                        class30_sub3.anInt1325 = 0;
                        continue;
                    }
                    class30_sub3.aBoolean1322 = true;
                    class30_sub3.aBoolean1323 = true;
                    class30_sub3.aBoolean1324 = class30_sub3.count > 0;
                    ++anInt446;
                }
                ++i2;
            } while (true);
            break;
        } while (true);
        fowSize = Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.INCREASE_RENDER_DISTANCE) ? 103 : 25;
        int l1 = this.anInt442;
        block5 : do {
            if (l1 >= this.anInt437) break;
            Tile[][] aclass30_sub3_1 = this.tileArray[l1];
            int l2 = - fowSize;
            do {
                block51 : {
                    int i3;
                    int k3;
                    block52 : {
                        block50 : {
                            if (l2 > 0) break block50;
                            i3 = anInt453 + l2;
                            k3 = anInt453 - l2;
                            if (i3 < anInt449 && k3 >= anInt450) break block51;
                            break block52;
                        }
                        ++l1;
                        continue block5;
                    }
                    for (int i4 = - WorldController.fowSize; i4 <= 0; ++i4) {
                        int k4 = anInt454 + i4;
                        int i5 = anInt454 - i4;
                        if (i3 >= anInt449) {
                            Tile class30_sub3_2;
                            Tile class30_sub3_1;
                            if (k4 >= anInt451 && (class30_sub3_1 = aclass30_sub3_1[i3][k4]) != null && class30_sub3_1.aBoolean1322) {
                                this.method314(class30_sub3_1, true);
                            }
                            if (i5 < anInt452 && (class30_sub3_2 = aclass30_sub3_1[i3][i5]) != null && class30_sub3_2.aBoolean1322) {
                                this.method314(class30_sub3_2, true);
                            }
                        }
                        if (k3 < anInt450) {
                            Tile class30_sub3_3;
                            Tile class30_sub3_4;
                            if (k4 >= anInt451 && (class30_sub3_3 = aclass30_sub3_1[k3][k4]) != null && class30_sub3_3.aBoolean1322) {
                                this.method314(class30_sub3_3, true);
                            }
                            if (i5 < anInt452 && (class30_sub3_4 = aclass30_sub3_1[k3][i5]) != null && class30_sub3_4.aBoolean1322) {
                                this.method314(class30_sub3_4, true);
                            }
                        }
                        if (anInt446 != 0) continue;
                        aBoolean467 = false;
                        return;
                    }
                }
                ++l2;
            } while (true);
            break;
        } while (true);
        int j2 = this.anInt442;
        block8 : do {
            if (j2 >= this.anInt437) {
                aBoolean467 = false;
                return;
            }
            Tile[][] aclass30_sub3_2 = this.tileArray[j2];
            int j3 = - fowSize;
            do {
                block54 : {
                    int l3;
                    int j4;
                    block55 : {
                        block53 : {
                            if (j3 > 0) break block53;
                            l3 = anInt453 + j3;
                            j4 = anInt453 - j3;
                            if (l3 < anInt449 && j4 >= anInt450) break block54;
                            break block55;
                        }
                        ++j2;
                        continue block8;
                    }
                    for (int l4 = - WorldController.fowSize; l4 <= 0; ++l4) {
                        int j5 = anInt454 + l4;
                        int k5 = anInt454 - l4;
                        if (l3 >= anInt449) {
                            Tile class30_sub3_5;
                            Tile class30_sub3_6;
                            if (j5 >= anInt451 && (class30_sub3_5 = aclass30_sub3_2[l3][j5]) != null && class30_sub3_5.aBoolean1322) {
                                this.method314(class30_sub3_5, false);
                            }
                            if (k5 < anInt452 && (class30_sub3_6 = aclass30_sub3_2[l3][k5]) != null && class30_sub3_6.aBoolean1322) {
                                this.method314(class30_sub3_6, false);
                            }
                        }
                        if (j4 < anInt450) {
                            Tile class30_sub3_8;
                            Tile class30_sub3_7;
                            if (j5 >= anInt451 && (class30_sub3_7 = aclass30_sub3_2[j4][j5]) != null && class30_sub3_7.aBoolean1322) {
                                this.method314(class30_sub3_7, false);
                            }
                            if (k5 < anInt452 && (class30_sub3_8 = aclass30_sub3_2[j4][k5]) != null && class30_sub3_8.aBoolean1322) {
                                this.method314(class30_sub3_8, false);
                            }
                        }
                        if (anInt446 != 0) continue;
                        aBoolean467 = false;
                        return;
                    }
                }
                ++j3;
            } while (true);
            break;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    private void method314(Tile class30_sub3, boolean flag) {
        block95 : {
            WorldController.aClass19_477.insertHead(class30_sub3);
            do {
                if ((class30_sub3_1 = (Tile)WorldController.aClass19_477.popHead()) == null) {
                    return;
                }
                if (!class30_sub3_1.aBoolean1323) continue;
                i = class30_sub3_1.anInt1308;
                j = class30_sub3_1.anInt1309;
                k = class30_sub3_1.tileZ;
                l = class30_sub3_1.anInt1310;
                aclass30_sub3 = this.tileArray[k];
                if (class30_sub3_1.aBoolean1322) {
                    if (flag) {
                        if (k > 0 && (class30_sub3_2 = this.tileArray[k - 1][i][j]) != null && class30_sub3_2.aBoolean1323 || i <= WorldController.anInt453 && i > WorldController.anInt449 && (class30_sub3_3 = aclass30_sub3[i - 1][j]) != null && class30_sub3_3.aBoolean1323 && (class30_sub3_3.aBoolean1322 || (class30_sub3_1.anInt1320 & 1) == 0) || i >= WorldController.anInt453 && i < WorldController.anInt450 - 1 && (class30_sub3_4 = aclass30_sub3[i + 1][j]) != null && class30_sub3_4.aBoolean1323 && (class30_sub3_4.aBoolean1322 || (class30_sub3_1.anInt1320 & 4) == 0) || j <= WorldController.anInt454 && j > WorldController.anInt451 && (class30_sub3_5 = aclass30_sub3[i][j - 1]) != null && class30_sub3_5.aBoolean1323 && (class30_sub3_5.aBoolean1322 || (class30_sub3_1.anInt1320 & 8) == 0) || j >= WorldController.anInt454 && j < WorldController.anInt452 - 1 && (class30_sub3_6 = aclass30_sub3[i][j + 1]) != null && class30_sub3_6.aBoolean1323 && (class30_sub3_6.aBoolean1322 || (class30_sub3_1.anInt1320 & 2) == 0)) {
                            continue;
                        }
                    } else {
                        flag = true;
                    }
                    class30_sub3_1.aBoolean1322 = false;
                    if (class30_sub3_1.tileBelowZero != null) {
                        class30_sub3_7 = class30_sub3_1.tileBelowZero;
                        if (class30_sub3_7.plainTile != null) {
                            if (!this.method320(0, i, j)) {
                                this.method315(class30_sub3_7.plainTile, 0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, i, j);
                            }
                        } else if (class30_sub3_7.shapedTile != null && !this.method320(0, i, j)) {
                            this.method316(i, WorldController.anInt458, WorldController.anInt460, class30_sub3_7.shapedTile, WorldController.anInt459, j, WorldController.anInt461);
                        }
                        if ((class10 = class30_sub3_7.wallObject) != null && class10.entityOne != null) {
                            class10.entityOne.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class10.x - WorldController.anInt455, class10.z - WorldController.anInt456, class10.y - WorldController.anInt457, class10.uid, 10);
                        }
                        for (i2 = 0; i2 < class30_sub3_7.count; ++i2) {
                            class28 = class30_sub3_7.interactiveObjects[i2];
                            if (class28 == null) continue;
                            class28.animable.method443(class28.anInt522, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class28.anInt519 - WorldController.anInt455, class28.anInt518 - WorldController.anInt456, class28.anInt520 - WorldController.anInt457, class28.uid, 20);
                        }
                    }
                    flag1 = false;
                    if (class30_sub3_1.plainTile != null) {
                        if (!this.method320(l, i, j)) {
                            flag1 = true;
                            this.method315(class30_sub3_1.plainTile, l, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, i, j);
                        }
                    } else if (class30_sub3_1.shapedTile != null && !this.method320(l, i, j)) {
                        flag1 = true;
                        this.method316(i, WorldController.anInt458, WorldController.anInt460, class30_sub3_1.shapedTile, WorldController.anInt459, j, WorldController.anInt461);
                    }
                    j1 = 0;
                    j2 = 0;
                    class10_3 = class30_sub3_1.wallObject;
                    class26_1 = class30_sub3_1.wallDecoration;
                    if (class10_3 != null || class26_1 != null) {
                        if (WorldController.anInt453 == i) {
                            ++j1;
                        } else if (WorldController.anInt453 < i) {
                            j1 += 2;
                        }
                        if (WorldController.anInt454 == j) {
                            j1 += 3;
                        } else if (WorldController.anInt454 > j) {
                            j1 += 6;
                        }
                        j2 = WorldController.anIntArray478[j1];
                        class30_sub3_1.anInt1328 = WorldController.anIntArray480[j1];
                    }
                    if (class10_3 != null) {
                        if ((class10_3.orientation & WorldController.anIntArray479[j1]) != 0) {
                            if (class10_3.orientation == 16) {
                                class30_sub3_1.anInt1325 = 3;
                                class30_sub3_1.anInt1326 = WorldController.anIntArray481[j1];
                                class30_sub3_1.anInt1327 = 3 - class30_sub3_1.anInt1326;
                            } else if (class10_3.orientation == 32) {
                                class30_sub3_1.anInt1325 = 6;
                                class30_sub3_1.anInt1326 = WorldController.anIntArray482[j1];
                                class30_sub3_1.anInt1327 = 6 - class30_sub3_1.anInt1326;
                            } else if (class10_3.orientation == 64) {
                                class30_sub3_1.anInt1325 = 12;
                                class30_sub3_1.anInt1326 = WorldController.anIntArray483[j1];
                                class30_sub3_1.anInt1327 = 12 - class30_sub3_1.anInt1326;
                            } else {
                                class30_sub3_1.anInt1325 = 9;
                                class30_sub3_1.anInt1326 = WorldController.anIntArray484[j1];
                                class30_sub3_1.anInt1327 = 9 - class30_sub3_1.anInt1326;
                            }
                        } else {
                            class30_sub3_1.anInt1325 = 0;
                        }
                        if ((class10_3.orientation & j2) != 0 && !this.method321(l, i, j, class10_3.orientation) && class10_3.entityOne != null) {
                            class10_3.entityOne.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class10_3.x - WorldController.anInt455, class10_3.z - WorldController.anInt456, class10_3.y - WorldController.anInt457, class10_3.uid, 10);
                        }
                        if ((class10_3.orientation1 & j2) != 0 && !this.method321(l, i, j, class10_3.orientation1) && class10_3.entityTwo != null) {
                            class10_3.entityTwo.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class10_3.x - WorldController.anInt455, class10_3.z - WorldController.anInt456, class10_3.y - WorldController.anInt457, class10_3.uid, 10);
                        }
                    }
                    if (class26_1 != null && !this.method322(l, i, j, class26_1.entity.modelHeight)) {
                        if ((class26_1.configBits & j2) != 0) {
                            class26_1.entity.method443(class26_1.direction, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class26_1.x - WorldController.anInt455, class26_1.z - WorldController.anInt456, class26_1.y - WorldController.anInt457, class26_1.uid, 15);
                        } else if ((class26_1.configBits & 768) != 0) {
                            j4 = class26_1.x - WorldController.anInt455;
                            l5 = class26_1.z - WorldController.anInt456;
                            k6 = class26_1.y - WorldController.anInt457;
                            i8 = class26_1.direction;
                            k9 = i8 == 1 || i8 == 2 ? - j4 : j4;
                            k10 = i8 == 2 || i8 == 3 ? - k6 : k6;
                            if ((class26_1.configBits & 256) != 0 && k10 < k9) {
                                i11 = j4 + WorldController.anIntArray463[i8];
                                k11 = k6 + WorldController.anIntArray464[i8];
                                class26_1.entity.method443(i8 * 512 + 256, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, i11, l5, k11, class26_1.uid, 15);
                            }
                            if ((class26_1.configBits & 512) != 0 && k10 > k9) {
                                j11 = j4 + WorldController.anIntArray465[i8];
                                l11 = k6 + WorldController.anIntArray466[i8];
                                class26_1.entity.method443(i8 * 512 + 1280 & 2047, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, j11, l5, l11, class26_1.uid, 15);
                            }
                        }
                    }
                    if (flag1) {
                        class49 = class30_sub3_1.groundDecoration;
                        if (class49 != null) {
                            class49.entity.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class49.x - WorldController.anInt455, class49.z - WorldController.anInt456, class49.y - WorldController.anInt457, class49.uid, 15);
                        }
                        if ((object4_1 = class30_sub3_1.groundItemTile) != null && object4_1.anInt52 == 0) {
                            if (object4_1.groundItemTwo != null) {
                                object4_1.groundItemTwo.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, object4_1.x - WorldController.anInt455, object4_1.z - WorldController.anInt456, object4_1.y - WorldController.anInt457, object4_1.uid, 5);
                            }
                            if (object4_1.groundItemThree != null) {
                                object4_1.groundItemThree.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, object4_1.x - WorldController.anInt455, object4_1.z - WorldController.anInt456, object4_1.y - WorldController.anInt457, object4_1.uid, 5);
                            }
                            if (object4_1.groundItemOne != null) {
                                object4_1.groundItemOne.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, object4_1.x - WorldController.anInt455, object4_1.z - WorldController.anInt456, object4_1.y - WorldController.anInt457, object4_1.uid, 5);
                            }
                        }
                    }
                    if ((k4 = class30_sub3_1.anInt1320) != 0) {
                        if (i < WorldController.anInt453 && (k4 & 4) != 0 && (class30_sub3_17 = aclass30_sub3[i + 1][j]) != null && class30_sub3_17.aBoolean1323) {
                            WorldController.aClass19_477.insertHead(class30_sub3_17);
                        }
                        if (j < WorldController.anInt454 && (k4 & 2) != 0 && (class30_sub3_18 = aclass30_sub3[i][j + 1]) != null && class30_sub3_18.aBoolean1323) {
                            WorldController.aClass19_477.insertHead(class30_sub3_18);
                        }
                        if (i > WorldController.anInt453 && (k4 & 1) != 0 && (class30_sub3_19 = aclass30_sub3[i - 1][j]) != null && class30_sub3_19.aBoolean1323) {
                            WorldController.aClass19_477.insertHead(class30_sub3_19);
                        }
                        if (j > WorldController.anInt454 && (k4 & 8) != 0 && (class30_sub3_20 = aclass30_sub3[i][j - 1]) != null && class30_sub3_20.aBoolean1323) {
                            WorldController.aClass19_477.insertHead(class30_sub3_20);
                        }
                    }
                }
                if (class30_sub3_1.anInt1325 != 0) {
                    flag2 = true;
                    for (k1 = 0; k1 < class30_sub3_1.count; ++k1) {
                        if (class30_sub3_1.interactiveObjects[k1].anInt528 == WorldController.anInt448 || (class30_sub3_1.anIntArray1319[k1] & class30_sub3_1.anInt1325) != class30_sub3_1.anInt1326) continue;
                        flag2 = false;
                        break;
                    }
                    if (flag2) {
                        class10_1 = class30_sub3_1.wallObject;
                        if (!this.method321(l, i, j, class10_1.orientation) && class10_1.entityOne != null) {
                            class10_1.entityOne.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class10_1.x - WorldController.anInt455, class10_1.z - WorldController.anInt456, class10_1.y - WorldController.anInt457, class10_1.uid, 10);
                        }
                        class30_sub3_1.anInt1325 = 0;
                    }
                }
                if (class30_sub3_1.aBoolean1324) {
                    try {
                        i1 = class30_sub3_1.count;
                        class30_sub3_1.aBoolean1324 = false;
                        l1 = 0;
                        k2 = 0;
lbl141: // 2 sources:
                        if (k2 < i1) {
                            class28_1 = class30_sub3_1.interactiveObjects[k2];
                            if (class28_1.anInt528 != WorldController.anInt448) {
                                k3 = class28_1.tileLeft;
                                break;
                            }
                            break block95;
                        }
                        if (l1 > 0) {
                            i3 = -50;
                            l3 = -1;
                            for (j5 = 0; j5 < l1; ++j5) {
                                class28_2 = WorldController.aClass28Array462[j5];
                                if (class28_2.anInt528 == WorldController.anInt448) continue;
                                if (class28_2.anInt527 > i3) {
                                    i3 = class28_2.anInt527;
                                    l3 = j5;
                                    continue;
                                }
                                if (class28_2.anInt527 != i3 || (j7 = class28_2.anInt519 - WorldController.anInt455) * j7 + (k8 = class28_2.anInt520 - WorldController.anInt457) * k8 <= (l9 = WorldController.aClass28Array462[l3].anInt519 - WorldController.anInt455) * l9 + (l10 = WorldController.aClass28Array462[l3].anInt520 - WorldController.anInt457) * l10) continue;
                                l3 = j5;
                            }
                        }
                        if (class30_sub3_1.aBoolean1324) {
                            continue;
                        }
                    }
                    catch (Exception _ex) {
                        class30_sub3_1.aBoolean1324 = false;
                    }
                }
                if (!class30_sub3_1.aBoolean1323 || class30_sub3_1.anInt1325 != 0 || i <= WorldController.anInt453 && i > WorldController.anInt449 && (class30_sub3_8 = aclass30_sub3[i - 1][j]) != null && class30_sub3_8.aBoolean1323 || i >= WorldController.anInt453 && i < WorldController.anInt450 - 1 && (class30_sub3_9 = aclass30_sub3[i + 1][j]) != null && class30_sub3_9.aBoolean1323 || j <= WorldController.anInt454 && j > WorldController.anInt451 && (class30_sub3_10 = aclass30_sub3[i][j - 1]) != null && class30_sub3_10.aBoolean1323 || j >= WorldController.anInt454 && j < WorldController.anInt452 - 1 && (class30_sub3_11 = aclass30_sub3[i][j + 1]) != null && class30_sub3_11.aBoolean1323) continue;
                class30_sub3_1.aBoolean1323 = false;
                --WorldController.anInt446;
                object4 = class30_sub3_1.groundItemTile;
                if (object4 != null && object4.anInt52 != 0) {
                    if (object4.groundItemTwo != null) {
                        object4.groundItemTwo.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, object4.x - WorldController.anInt455, object4.z - WorldController.anInt456 - object4.anInt52, object4.y - WorldController.anInt457, object4.uid, 5);
                    }
                    if (object4.groundItemThree != null) {
                        object4.groundItemThree.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, object4.x - WorldController.anInt455, object4.z - WorldController.anInt456 - object4.anInt52, object4.y - WorldController.anInt457, object4.uid, 5);
                    }
                    if (object4.groundItemOne != null) {
                        object4.groundItemOne.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, object4.x - WorldController.anInt455, object4.z - WorldController.anInt456 - object4.anInt52, object4.y - WorldController.anInt457, object4.uid, 5);
                    }
                }
                if (class30_sub3_1.anInt1328 != 0) {
                    class26 = class30_sub3_1.wallDecoration;
                    if (class26 != null && !this.method322(l, i, j, class26.entity.modelHeight)) {
                        if ((class26.configBits & class30_sub3_1.anInt1328) != 0) {
                            class26.entity.method443(class26.direction, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class26.x - WorldController.anInt455, class26.z - WorldController.anInt456, class26.y - WorldController.anInt457, class26.uid, 15);
                        } else if ((class26.configBits & 768) != 0) {
                            l2 = class26.x - WorldController.anInt455;
                            j3 = class26.z - WorldController.anInt456;
                            i4 = class26.y - WorldController.anInt457;
                            k5 = class26.direction;
                            j6 = k5 == 1 || k5 == 2 ? - l2 : l2;
                            l7 = k5 == 2 || k5 == 3 ? - i4 : i4;
                            if ((class26.configBits & 256) != 0 && l7 >= j6) {
                                i9 = l2 + WorldController.anIntArray463[k5];
                                i10 = i4 + WorldController.anIntArray464[k5];
                                class26.entity.method443(k5 * 512 + 256, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, i9, j3, i10, class26.uid, 15);
                            }
                            if ((class26.configBits & 512) != 0 && l7 <= j6) {
                                j9 = l2 + WorldController.anIntArray465[k5];
                                j10 = i4 + WorldController.anIntArray466[k5];
                                class26.entity.method443(k5 * 512 + 1280 & 2047, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, j9, j3, j10, class26.uid, 15);
                            }
                        }
                    }
                    if ((class10_2 = class30_sub3_1.wallObject) != null) {
                        if ((class10_2.orientation1 & class30_sub3_1.anInt1328) != 0 && !this.method321(l, i, j, class10_2.orientation1) && class10_2.entityTwo != null) {
                            class10_2.entityTwo.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class10_2.x - WorldController.anInt455, class10_2.z - WorldController.anInt456, class10_2.y - WorldController.anInt457, class10_2.uid, 10);
                        }
                        if ((class10_2.orientation & class30_sub3_1.anInt1328) != 0 && !this.method321(l, i, j, class10_2.orientation) && class10_2.entityOne != null) {
                            class10_2.entityOne.method443(0, WorldController.anInt458, WorldController.anInt459, WorldController.anInt460, WorldController.anInt461, class10_2.x - WorldController.anInt455, class10_2.z - WorldController.anInt456, class10_2.y - WorldController.anInt457, class10_2.uid, 10);
                        }
                    }
                }
                if (k < this.anInt437 - 1 && (class30_sub3_12 = this.tileArray[k + 1][i][j]) != null && class30_sub3_12.aBoolean1323) {
                    WorldController.aClass19_477.insertHead(class30_sub3_12);
                }
                if (i < WorldController.anInt453 && (class30_sub3_13 = aclass30_sub3[i + 1][j]) != null && class30_sub3_13.aBoolean1323) {
                    WorldController.aClass19_477.insertHead(class30_sub3_13);
                }
                if (j < WorldController.anInt454 && (class30_sub3_14 = aclass30_sub3[i][j + 1]) != null && class30_sub3_14.aBoolean1323) {
                    WorldController.aClass19_477.insertHead(class30_sub3_14);
                }
                if (i > WorldController.anInt453 && (class30_sub3_15 = aclass30_sub3[i - 1][j]) != null && class30_sub3_15.aBoolean1323) {
                    WorldController.aClass19_477.insertHead(class30_sub3_15);
                }
                if (j <= WorldController.anInt454 || (class30_sub3_16 = aclass30_sub3[i][j - 1]) == null || !class30_sub3_16.aBoolean1323) continue;
                WorldController.aClass19_477.insertHead(class30_sub3_16);
            } while (true);
            block7 : do {
                if (k3 <= class28_1.anInt524) {
                } else {
                    WorldController.aClass28Array462[l1++] = class28_1;
                    i6 = class28_1.anInt524 - WorldController.anInt453;
                    i5 = WorldController.anInt453 - class28_1.tileLeft;
                    if (i6 > i5) {
                        i5 = i6;
                    }
                    if ((j8 = class28_1.anInt526 - WorldController.anInt454) > (i7 = WorldController.anInt454 - class28_1.tileTop)) {
                        class28_1.anInt527 = i5 + j8;
                        break;
                    }
                    class28_1.anInt527 = i5 + i7;
                    break;
                }
                for (l4 = class28_1.tileTop; l4 <= class28_1.anInt526; ++l4) {
                    class30_sub3_21 = aclass30_sub3[k3][l4];
                    if (class30_sub3_21.aBoolean1322) {
                        class30_sub3_1.aBoolean1324 = true;
                        break block7;
                    }
                    if (class30_sub3_21.anInt1325 == 0) continue;
                    l6 = 0;
                    if (k3 > class28_1.tileLeft) {
                        ++l6;
                    }
                    if (k3 < class28_1.anInt524) {
                        l6 += 4;
                    }
                    if (l4 > class28_1.tileTop) {
                        l6 += 8;
                    }
                    if (l4 < class28_1.anInt526) {
                        l6 += 2;
                    }
                    if ((l6 & class30_sub3_21.anInt1325) != class30_sub3_1.anInt1327) continue;
                    class30_sub3_1.aBoolean1324 = true;
                    break block7;
                }
                ++k3;
            } while (true);
        }
        ++k2;
        ** GOTO lbl141
    }

    private void method315(PlainTile class43, int i, int j, int k, int l, int i1, int j1, int k1) {
        int l2;
        int j3;
        int j2;
        int l1;
        int i2 = l1 = (j1 << 7) - anInt455;
        int k2 = j2 = (k1 << 7) - anInt457;
        int i3 = l2 = i2 + 128;
        int k3 = j3 = k2 + 128;
        int l3 = this.anIntArrayArrayArray440[i][j1][k1] - anInt456;
        int i4 = this.anIntArrayArrayArray440[i][j1 + 1][k1] - anInt456;
        int j4 = this.anIntArrayArrayArray440[i][j1 + 1][k1 + 1] - anInt456;
        int k4 = this.anIntArrayArrayArray440[i][j1][k1 + 1] - anInt456;
        int l4 = k2 * l + i2 * i1 >> 16;
        k2 = k2 * i1 - i2 * l >> 16;
        i2 = l4;
        l4 = l3 * k - k2 * j >> 16;
        k2 = l3 * j + k2 * k >> 16;
        l3 = l4;
        if (k2 < 50) {
            return;
        }
        l4 = j2 * l + i3 * i1 >> 16;
        j2 = j2 * i1 - i3 * l >> 16;
        i3 = l4;
        l4 = i4 * k - j2 * j >> 16;
        j2 = i4 * j + j2 * k >> 16;
        i4 = l4;
        if (j2 < 50) {
            return;
        }
        l4 = k3 * l + l2 * i1 >> 16;
        k3 = k3 * i1 - l2 * l >> 16;
        l2 = l4;
        l4 = j4 * k - k3 * j >> 16;
        k3 = j4 * j + k3 * k >> 16;
        j4 = l4;
        if (k3 < 50) {
            return;
        }
        l4 = j3 * l + l1 * i1 >> 16;
        j3 = j3 * i1 - l1 * l >> 16;
        l1 = l4;
        l4 = k4 * k - j3 * j >> 16;
        j3 = k4 * j + j3 * k >> 16;
        k4 = l4;
        if (j3 < 50) {
            return;
        }
        int i5 = Rasterizer.textureInt1 + (i2 << Client.log_view_dist) / k2;
        int j5 = Rasterizer.textureInt2 + (l3 << Client.log_view_dist) / k2;
        int k5 = Rasterizer.textureInt1 + (i3 << Client.log_view_dist) / j2;
        int l5 = Rasterizer.textureInt2 + (i4 << Client.log_view_dist) / j2;
        int i6 = Rasterizer.textureInt1 + (l2 << Client.log_view_dist) / k3;
        int j6 = Rasterizer.textureInt2 + (j4 << Client.log_view_dist) / k3;
        int k6 = Rasterizer.textureInt1 + (l1 << Client.log_view_dist) / j3;
        int l6 = Rasterizer.textureInt2 + (k4 << Client.log_view_dist) / j3;
        Rasterizer.anInt1465 = 0;
        if ((i6 - k6) * (l5 - l6) - (j6 - l6) * (k5 - k6) > 0) {
            boolean bl = Rasterizer.aBoolean1462 = i6 < 0 || k6 < 0 || k5 < 0 || i6 > DrawingArea.centerX || k6 > DrawingArea.centerX || k5 > DrawingArea.centerX;
            if (aBoolean467 && this.method318(anInt468, anInt469, j6, l6, l5, i6, k6, k5)) {
                anInt470 = j1;
                anInt471 = k1;
            }
            if (class43.anInt720 == -1) {
                if (class43.anInt718 != 12345678) {
                    Rasterizer.drawGouraudTriangle(j6, l6, l5, i6, k6, k5, class43.anInt718, class43.anInt719, class43.anInt717, k3, j3, j2, 0);
                }
            } else if (!lowMem) {
                if (class43.aBoolean721) {
                    Rasterizer.drawTexturedTriangle(j6, l6, l5, i6, k6, k5, class43.anInt718, class43.anInt719, class43.anInt717, i2, i3, l1, l3, i4, k4, k2, j2, j3, class43.anInt720, k3, j3, j2, 0);
                } else {
                    Rasterizer.drawTexturedTriangle(j6, l6, l5, i6, k6, k5, class43.anInt718, class43.anInt719, class43.anInt717, l2, l1, i3, j4, k4, i4, k3, j3, j2, class43.anInt720, k3, j3, j2, 0);
                }
            } else {
                int i7 = anIntArray485[class43.anInt720];
                Rasterizer.drawGouraudTriangle(j6, l6, l5, i6, k6, k5, this.method317(i7, class43.anInt718), this.method317(i7, class43.anInt719), this.method317(i7, class43.anInt717), k3, j3, j2, 0);
            }
        }
        if ((i5 - k5) * (l6 - l5) - (j5 - l5) * (k6 - k5) <= 0) return;
        boolean bl = Rasterizer.aBoolean1462 = i5 < 0 || k5 < 0 || k6 < 0 || i5 > DrawingArea.centerX || k5 > DrawingArea.centerX || k6 > DrawingArea.centerX;
        if (aBoolean467 && this.method318(anInt468, anInt469, j5, l5, l6, i5, k5, k6)) {
            anInt470 = j1;
            anInt471 = k1;
        }
        if (class43.anInt720 == -1) {
            if (class43.anInt716 == 12345678) return;
            Rasterizer.drawGouraudTriangle(j5, l5, l6, i5, k5, k6, class43.anInt716, class43.anInt717, class43.anInt719, k2, j2, j3, 0);
            return;
        }
        if (!lowMem) {
            Rasterizer.drawTexturedTriangle(j5, l5, l6, i5, k5, k6, class43.anInt716, class43.anInt717, class43.anInt719, i2, i3, l1, l3, i4, k4, k2, j2, j3, class43.anInt720, k2, j2, j3, 0);
            return;
        }
        int j7 = anIntArray485[class43.anInt720];
        Rasterizer.drawGouraudTriangle(j5, l5, l6, i5, k5, k6, this.method317(j7, class43.anInt716), this.method317(j7, class43.anInt717), this.method317(j7, class43.anInt719), k2, j2, j3, 0);
    }

    private void method316(int i, int j, int k, ShapedTile class40, int l, int i1, int j1) {
        int k1 = class40.originalVertexX.length;
        for (int l1 = 0; l1 < k1; ++l1) {
            int i2 = class40.originalVertexX[l1] - anInt455;
            int k2 = class40.originalVertexY[l1] - anInt456;
            int i3 = class40.originalVertexZ[l1] - anInt457;
            int k3 = i3 * k + i2 * j1 >> 16;
            i3 = i3 * j1 - i2 * k >> 16;
            i2 = k3;
            k3 = k2 * l - i3 * j >> 16;
            i3 = k2 * j + i3 * l >> 16;
            k2 = k3;
            if (i3 < 50) {
                return;
            }
            if (class40.triangleTexture != null) {
                ShapedTile.anIntArray690[l1] = i2;
                ShapedTile.anIntArray691[l1] = k2;
                ShapedTile.anIntArray692[l1] = i3;
            }
            ShapedTile.anIntArray688[l1] = Rasterizer.textureInt1 + (i2 << Client.log_view_dist) / i3;
            ShapedTile.anIntArray689[l1] = Rasterizer.textureInt2 + (k2 << Client.log_view_dist) / i3;
            ShapedTile.depthPoint[l1] = i3;
        }
        Rasterizer.anInt1465 = 0;
        k1 = class40.triangleA.length;
        int j2 = 0;
        while (j2 < k1) {
            int l2 = class40.triangleA[j2];
            int j3 = class40.triangleB[j2];
            int l3 = class40.triangleC[j2];
            int i4 = ShapedTile.anIntArray688[l2];
            int j4 = ShapedTile.anIntArray688[j3];
            int k4 = ShapedTile.anIntArray688[l3];
            int l4 = ShapedTile.anIntArray689[l2];
            int i5 = ShapedTile.anIntArray689[j3];
            int j5 = ShapedTile.anIntArray689[l3];
            int z1 = ShapedTile.depthPoint[l2];
            int z2 = ShapedTile.depthPoint[j3];
            int z3 = ShapedTile.depthPoint[l3];
            if ((i4 - j4) * (j5 - i5) - (l4 - i5) * (k4 - j4) > 0) {
                boolean bl = Rasterizer.aBoolean1462 = i4 < 0 || j4 < 0 || k4 < 0 || i4 > DrawingArea.centerX || j4 > DrawingArea.centerX || k4 > DrawingArea.centerX;
                if (aBoolean467 && this.method318(anInt468, anInt469, l4, i5, j5, i4, j4, k4)) {
                    anInt470 = i;
                    anInt471 = i1;
                }
                if (class40.triangleTexture == null || class40.triangleTexture[j2] == -1) {
                    if (class40.triangleHSLA[j2] != 12345678) {
                        Rasterizer.drawGouraudTriangle(l4, i5, j5, i4, j4, k4, class40.triangleHSLA[j2], class40.triangleHSLB[j2], class40.triangleHSLC[j2], z1, z2, z3, 0);
                    }
                } else if (!lowMem) {
                    if (class40.flat) {
                        Rasterizer.drawTexturedTriangle(l4, i5, j5, i4, j4, k4, class40.triangleHSLA[j2], class40.triangleHSLB[j2], class40.triangleHSLC[j2], ShapedTile.anIntArray690[0], ShapedTile.anIntArray690[1], ShapedTile.anIntArray690[3], ShapedTile.anIntArray691[0], ShapedTile.anIntArray691[1], ShapedTile.anIntArray691[3], ShapedTile.anIntArray692[0], ShapedTile.anIntArray692[1], ShapedTile.anIntArray692[3], class40.triangleTexture[j2], z1, z2, z3, 0);
                    } else {
                        Rasterizer.drawTexturedTriangle(l4, i5, j5, i4, j4, k4, class40.triangleHSLA[j2], class40.triangleHSLB[j2], class40.triangleHSLC[j2], ShapedTile.anIntArray690[l2], ShapedTile.anIntArray690[j3], ShapedTile.anIntArray690[l3], ShapedTile.anIntArray691[l2], ShapedTile.anIntArray691[j3], ShapedTile.anIntArray691[l3], ShapedTile.anIntArray692[l2], ShapedTile.anIntArray692[j3], ShapedTile.anIntArray692[l3], class40.triangleTexture[j2], z1, z2, z3, 0);
                    }
                } else {
                    int k5 = anIntArray485[class40.triangleTexture[j2]];
                    Rasterizer.drawGouraudTriangle(l4, i5, j5, i4, j4, k4, this.method317(k5, class40.triangleHSLA[j2]), this.method317(k5, class40.triangleHSLB[j2]), this.method317(k5, class40.triangleHSLC[j2]), z1, z2, z3, 0);
                }
            }
            ++j2;
        }
    }

    private int method317(int j, int k) {
        k = 127 - k;
        if ((k = k * (j & 127) / 160) < 2) {
            k = 2;
            return (j & 65408) + k;
        }
        if (k <= 126) return (j & 65408) + k;
        k = 126;
        return (j & 65408) + k;
    }

    private boolean method318(int i, int j, int k, int l, int i1, int j1, int k1, int l1) {
        if (j < k && j < l && j < i1) {
            return false;
        }
        if (j > k && j > l && j > i1) {
            return false;
        }
        if (i < j1 && i < k1 && i < l1) {
            return false;
        }
        if (i > j1 && i > k1 && i > l1) {
            return false;
        }
        int i2 = (j - k) * (k1 - j1) - (i - j1) * (l - k);
        int j2 = (j - i1) * (j1 - l1) - (i - l1) * (k - i1);
        int k2 = (j - l) * (l1 - k1) - (i - k1) * (i1 - l);
        if (i2 * k2 <= 0) return false;
        if (k2 * j2 <= 0) return false;
        return true;
    }

    private void method319() {
        int j = anIntArray473[anInt447];
        Class47[] aclass47 = aClass47ArrayArray474[anInt447];
        anInt475 = 0;
        int k = 0;
        while (k < j) {
            block21 : {
                int l2;
                int j1;
                int i2;
                Class47 class47;
                int l3;
                boolean flag2;
                block25 : {
                    int k3;
                    block29 : {
                        block28 : {
                            int l1;
                            int k2;
                            int i1;
                            boolean flag1;
                            block24 : {
                                int j3;
                                block27 : {
                                    block26 : {
                                        boolean flag;
                                        int l;
                                        int k1;
                                        int j2;
                                        block22 : {
                                            block23 : {
                                                block20 : {
                                                    class47 = aclass47[k];
                                                    if (class47.anInt791 != 1) break block20;
                                                    l = class47.anInt787 - anInt453 + fowSize;
                                                    if (l < 0 || l > 50) break block21;
                                                    k1 = class47.anInt789 - anInt454 + fowSize;
                                                    if (k1 < 0) {
                                                        k1 = 0;
                                                    }
                                                    if ((j2 = class47.anInt790 - anInt454 + fowSize) > 50) {
                                                        j2 = 50;
                                                    }
                                                    flag = false;
                                                    break block22;
                                                }
                                                if (class47.anInt791 != 2) break block23;
                                                i1 = class47.anInt789 - anInt454 + fowSize;
                                                if (i1 < 0 || i1 > 50) break block21;
                                                l1 = class47.anInt787 - anInt453 + fowSize;
                                                if (l1 < 0) {
                                                    l1 = 0;
                                                }
                                                if ((k2 = class47.anInt788 - anInt453 + fowSize) > 50) {
                                                    k2 = 50;
                                                }
                                                flag1 = false;
                                                break block24;
                                            }
                                            if (class47.anInt791 != 4 || (j1 = class47.anInt796 - anInt456) <= 128) break block21;
                                            i2 = class47.anInt789 - anInt454 + fowSize;
                                            if (i2 < 0) {
                                                i2 = 0;
                                            }
                                            if ((l2 = class47.anInt790 - anInt454 + fowSize) > 50) {
                                                l2 = 50;
                                            }
                                            if (i2 > l2) break block21;
                                            int i3 = class47.anInt787 - anInt453 + fowSize;
                                            if (i3 < 0) {
                                                i3 = 0;
                                            }
                                            if ((l3 = class47.anInt788 - anInt453 + fowSize) > 50) {
                                                l3 = 50;
                                            }
                                            flag2 = false;
                                            break block25;
                                        }
                                        while (k1 <= j2) {
                                            if (!aBooleanArrayArray492[l][k1++]) continue;
                                            flag = true;
                                            break;
                                        }
                                        if (!flag) break block21;
                                        j3 = anInt455 - class47.anInt792;
                                        if (j3 <= 32) break block26;
                                        class47.anInt798 = 1;
                                        break block27;
                                    }
                                    if (j3 >= -32) break block21;
                                    class47.anInt798 = 2;
                                    j3 = - j3;
                                }
                                class47.anInt801 = (class47.anInt794 - anInt457 << 8) / j3;
                                class47.anInt802 = (class47.anInt795 - anInt457 << 8) / j3;
                                class47.anInt803 = (class47.anInt796 - anInt456 << 8) / j3;
                                class47.anInt804 = (class47.anInt797 - anInt456 << 8) / j3;
                                WorldController.aClass47Array476[WorldController.anInt475++] = class47;
                                break block21;
                            }
                            while (l1 <= k2) {
                                if (!aBooleanArrayArray492[l1++][i1]) continue;
                                flag1 = true;
                                break;
                            }
                            if (!flag1) break block21;
                            k3 = anInt457 - class47.anInt794;
                            if (k3 <= 32) break block28;
                            class47.anInt798 = 3;
                            break block29;
                        }
                        if (k3 >= -32) break block21;
                        class47.anInt798 = 4;
                        k3 = - k3;
                    }
                    class47.anInt799 = (class47.anInt792 - anInt455 << 8) / k3;
                    class47.anInt800 = (class47.anInt793 - anInt455 << 8) / k3;
                    class47.anInt803 = (class47.anInt796 - anInt456 << 8) / k3;
                    class47.anInt804 = (class47.anInt797 - anInt456 << 8) / k3;
                    WorldController.aClass47Array476[WorldController.anInt475++] = class47;
                    break block21;
                }
                block3 : for (int i4 = i3; i4 <= l3; ++i4) {
                    int j4 = i2;
                    do {
                        if (j4 > l2) {
                            continue block3;
                        }
                        if (aBooleanArrayArray492[i4][j4]) {
                            flag2 = true;
                            break block3;
                        }
                        ++j4;
                    } while (true);
                }
                if (flag2) {
                    class47.anInt798 = 5;
                    class47.anInt799 = (class47.anInt792 - anInt455 << 8) / j1;
                    class47.anInt800 = (class47.anInt793 - anInt455 << 8) / j1;
                    class47.anInt801 = (class47.anInt794 - anInt457 << 8) / j1;
                    class47.anInt802 = (class47.anInt795 - anInt457 << 8) / j1;
                    WorldController.aClass47Array476[WorldController.anInt475++] = class47;
                }
            }
            ++k;
        }
    }

    private boolean method320(int i, int j, int k) {
        int l = this.anIntArrayArrayArray445[i][j][k];
        if (l == - anInt448) {
            return false;
        }
        if (l == anInt448) {
            return true;
        }
        int i1 = j << 7;
        int j1 = k << 7;
        if (this.method324(i1 + 1, this.anIntArrayArrayArray440[i][j][k], j1 + 1) && this.method324(i1 + 128 - 1, this.anIntArrayArrayArray440[i][j + 1][k], j1 + 1) && this.method324(i1 + 128 - 1, this.anIntArrayArrayArray440[i][j + 1][k + 1], j1 + 128 - 1) && this.method324(i1 + 1, this.anIntArrayArrayArray440[i][j][k + 1], j1 + 128 - 1)) {
            this.anIntArrayArrayArray445[i][j][k] = anInt448;
            return true;
        }
        this.anIntArrayArrayArray445[i][j][k] = - anInt448;
        return false;
    }

    private boolean method321(int i, int j, int k, int l) {
        if (!this.method320(i, j, k)) {
            return false;
        }
        int i1 = j << 7;
        int j1 = k << 7;
        int k1 = this.anIntArrayArrayArray440[i][j][k] - 1;
        int l1 = k1 - 120;
        int i2 = k1 - 230;
        int j2 = k1 - 238;
        if (l < 16) {
            if (l == 1) {
                if (i1 > anInt455) {
                    if (!this.method324(i1, k1, j1)) {
                        return false;
                    }
                    if (!this.method324(i1, k1, j1 + 128)) {
                        return false;
                    }
                }
                if (i > 0) {
                    if (!this.method324(i1, l1, j1)) {
                        return false;
                    }
                    if (!this.method324(i1, l1, j1 + 128)) {
                        return false;
                    }
                }
                if (!this.method324(i1, i2, j1)) return false;
                if (!this.method324(i1, i2, j1 + 128)) return false;
                return true;
            }
            if (l == 2) {
                if (j1 < anInt457) {
                    if (!this.method324(i1, k1, j1 + 128)) {
                        return false;
                    }
                    if (!this.method324(i1 + 128, k1, j1 + 128)) {
                        return false;
                    }
                }
                if (i > 0) {
                    if (!this.method324(i1, l1, j1 + 128)) {
                        return false;
                    }
                    if (!this.method324(i1 + 128, l1, j1 + 128)) {
                        return false;
                    }
                }
                if (!this.method324(i1, i2, j1 + 128)) return false;
                if (!this.method324(i1 + 128, i2, j1 + 128)) return false;
                return true;
            }
            if (l == 4) {
                if (i1 < anInt455) {
                    if (!this.method324(i1 + 128, k1, j1)) {
                        return false;
                    }
                    if (!this.method324(i1 + 128, k1, j1 + 128)) {
                        return false;
                    }
                }
                if (i > 0) {
                    if (!this.method324(i1 + 128, l1, j1)) {
                        return false;
                    }
                    if (!this.method324(i1 + 128, l1, j1 + 128)) {
                        return false;
                    }
                }
                if (!this.method324(i1 + 128, i2, j1)) return false;
                if (!this.method324(i1 + 128, i2, j1 + 128)) return false;
                return true;
            }
            if (l == 8) {
                if (j1 > anInt457) {
                    if (!this.method324(i1, k1, j1)) {
                        return false;
                    }
                    if (!this.method324(i1 + 128, k1, j1)) {
                        return false;
                    }
                }
                if (i > 0) {
                    if (!this.method324(i1, l1, j1)) {
                        return false;
                    }
                    if (!this.method324(i1 + 128, l1, j1)) {
                        return false;
                    }
                }
                if (!this.method324(i1, i2, j1)) return false;
                if (!this.method324(i1 + 128, i2, j1)) return false;
                return true;
            }
        }
        if (!this.method324(i1 + 64, j2, j1 + 64)) {
            return false;
        }
        if (l == 16) {
            return this.method324(i1, i2, j1 + 128);
        }
        if (l == 32) {
            return this.method324(i1 + 128, i2, j1 + 128);
        }
        if (l == 64) {
            return this.method324(i1 + 128, i2, j1);
        }
        if (l == 128) {
            return this.method324(i1, i2, j1);
        }
        System.out.println("Warning unsupported wall type");
        return true;
    }

    private boolean method322(int i, int j, int k, int l) {
        if (!this.method320(i, j, k)) {
            return false;
        }
        int i1 = j << 7;
        int j1 = k << 7;
        if (!this.method324(i1 + 1, this.anIntArrayArrayArray440[i][j][k] - l, j1 + 1)) return false;
        if (!this.method324(i1 + 128 - 1, this.anIntArrayArrayArray440[i][j + 1][k] - l, j1 + 1)) return false;
        if (!this.method324(i1 + 128 - 1, this.anIntArrayArrayArray440[i][j + 1][k + 1] - l, j1 + 128 - 1)) return false;
        if (!this.method324(i1 + 1, this.anIntArrayArrayArray440[i][j][k + 1] - l, j1 + 128 - 1)) return false;
        return true;
    }

    private boolean method323(int i, int j, int k, int l, int i1, int j1) {
        if (j == k && l == i1) {
            if (!this.method320(i, j, l)) {
                return false;
            }
            int k1 = j << 7;
            int i2 = l << 7;
            if (!this.method324(k1 + 1, this.anIntArrayArrayArray440[i][j][l] - j1, i2 + 1)) return false;
            if (!this.method324(k1 + 128 - 1, this.anIntArrayArrayArray440[i][j + 1][l] - j1, i2 + 1)) return false;
            if (!this.method324(k1 + 128 - 1, this.anIntArrayArrayArray440[i][j + 1][l + 1] - j1, i2 + 128 - 1)) return false;
            if (!this.method324(k1 + 1, this.anIntArrayArrayArray440[i][j][l + 1] - j1, i2 + 128 - 1)) return false;
            return true;
        }
        int l1 = j;
        do {
            if (l1 <= k) {
            } else {
                int k2 = (j << 7) + 1;
                int i3 = this.anIntArrayArrayArray440[i][j][l] - j1;
                int l2 = (l << 7) + 2;
                if (!this.method324(k2, i3, l2)) {
                    return false;
                }
                int j3 = (k << 7) - 1;
                if (!this.method324(j3, i3, l2)) {
                    return false;
                }
                int k3 = (i1 << 7) - 1;
                if (!this.method324(k2, i3, k3)) return false;
                if (!this.method324(j3, i3, k3)) return false;
                return true;
            }
            for (int j2 = l; j2 <= i1; ++j2) {
                if (this.anIntArrayArrayArray445[i][l1][j2] != - anInt448) continue;
                return false;
            }
            ++l1;
        } while (true);
    }

    private boolean method324(int i, int j, int k) {
        int l = 0;
        while (l < anInt475) {
            int i2;
            Class47 class47 = aClass47Array476[l];
            if (class47.anInt798 == 1) {
                int i1 = class47.anInt792 - i;
                if (i1 > 0) {
                    int j2 = class47.anInt794 + (class47.anInt801 * i1 >> 8);
                    int k3 = class47.anInt795 + (class47.anInt802 * i1 >> 8);
                    int l4 = class47.anInt796 + (class47.anInt803 * i1 >> 8);
                    int i6 = class47.anInt797 + (class47.anInt804 * i1 >> 8);
                    if (k >= j2 && k <= k3 && j >= l4 && j <= i6) {
                        return true;
                    }
                }
            } else if (class47.anInt798 == 2) {
                int j1 = i - class47.anInt792;
                if (j1 > 0) {
                    int k2 = class47.anInt794 + (class47.anInt801 * j1 >> 8);
                    int l3 = class47.anInt795 + (class47.anInt802 * j1 >> 8);
                    int i5 = class47.anInt796 + (class47.anInt803 * j1 >> 8);
                    int j6 = class47.anInt797 + (class47.anInt804 * j1 >> 8);
                    if (k >= k2 && k <= l3 && j >= i5 && j <= j6) {
                        return true;
                    }
                }
            } else if (class47.anInt798 == 3) {
                int k1 = class47.anInt794 - k;
                if (k1 > 0) {
                    int l2 = class47.anInt792 + (class47.anInt799 * k1 >> 8);
                    int i4 = class47.anInt793 + (class47.anInt800 * k1 >> 8);
                    int j5 = class47.anInt796 + (class47.anInt803 * k1 >> 8);
                    int k6 = class47.anInt797 + (class47.anInt804 * k1 >> 8);
                    if (i >= l2 && i <= i4 && j >= j5 && j <= k6) {
                        return true;
                    }
                }
            } else if (class47.anInt798 == 4) {
                int l1 = k - class47.anInt794;
                if (l1 > 0) {
                    int i3 = class47.anInt792 + (class47.anInt799 * l1 >> 8);
                    int j4 = class47.anInt793 + (class47.anInt800 * l1 >> 8);
                    int k5 = class47.anInt796 + (class47.anInt803 * l1 >> 8);
                    int l6 = class47.anInt797 + (class47.anInt804 * l1 >> 8);
                    if (i >= i3 && i <= j4 && j >= k5 && j <= l6) {
                        return true;
                    }
                }
            } else if (class47.anInt798 == 5 && (i2 = j - class47.anInt796) > 0) {
                int j3 = class47.anInt792 + (class47.anInt799 * i2 >> 8);
                int k4 = class47.anInt793 + (class47.anInt800 * i2 >> 8);
                int l5 = class47.anInt794 + (class47.anInt801 * i2 >> 8);
                int i7 = class47.anInt795 + (class47.anInt802 * i2 >> 8);
                if (i >= j3 && i <= k4 && k >= l5 && k <= i7) {
                    return true;
                }
            }
            ++l;
        }
        return false;
    }

    static {
        aClass28Array462 = new InteractiveObject[100];
        anIntArray463 = new int[]{53, -53, -53, 53};
        anIntArray464 = new int[]{-53, -53, 53, 53};
        anIntArray465 = new int[]{-45, 45, 45, -45};
        anIntArray466 = new int[]{45, 45, -45, -45};
        anInt470 = -1;
        anInt471 = -1;
        aClass47Array476 = new Class47[500];
        aClass19_477 = new NodeList();
        anIntArray478 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
        anIntArray479 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
        anIntArray480 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
        anIntArray481 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
        anIntArray482 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
        anIntArray483 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
        anIntArray484 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
        anIntArray485 = new int[]{41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41};
        fowSize = 25;
        aBooleanArrayArrayArrayArray491 = new boolean[8][32][fowSize * 3 + 1][fowSize * 3 + 1];
        anInt472 = 4;
        anIntArray473 = new int[anInt472];
        aClass47ArrayArray474 = new Class47[anInt472][500];
    }
}


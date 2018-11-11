/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 */
package com.imagineps.client;

import com.imagineps.client.Animable_Sub5;
import com.imagineps.client.Class4;
import com.imagineps.client.Client;
import com.imagineps.client.CollisionMap;
import com.imagineps.client.Entity;
import com.imagineps.client.Model;
import com.imagineps.client.Stream;
import com.imagineps.client.WorldController;
import com.imagineps.client.cache.OnDemandFetcher;
import com.imagineps.client.definition.ObjectDefinition;
import com.imagineps.client.graphics.Rasterizer;
import java.util.ArrayList;

public class MapRegion {
    public ArrayList<Integer> fogColorList = new ArrayList();
    public static int anInt123 = (int)(Math.random() * 17.0) - 8;
    public final int[] blendedHue;
    public final int[] blendedSaturation;
    public final int[] blendedLightness;
    public final int[] blendedDivisor;
    public final int[] blendDirectionTracker;
    public final int[][][] heightMap;
    public final byte[][][] overlay;
    public static int anInt131;
    public static int anInt133;
    public final byte[][][] objectShadowData;
    public final int[][][] tileCullingBitmap;
    public final byte[][][] aByteArrayArrayArray136;
    public static final int[] anIntArray137;
    public static final int anInt138 = 323;
    public final int[][] tileLightingIntensity;
    public static final int[] anIntArray140;
    public final byte[][][] underlay;
    public static final int[] anIntArray144;
    public static int setZ;
    public final int landscapeSizeX;
    public final int landscapeSizeY;
    public final byte[][][] aByteArrayArrayArray148;
    public final byte[][][] tileSetting;
    public static boolean lowMem;
    public static final int[] anIntArray152;

    public MapRegion(byte[][][] settings, int[][][] map) {
        setZ = 99;
        this.landscapeSizeX = 104;
        this.landscapeSizeY = 104;
        this.heightMap = map;
        this.tileSetting = settings;
        this.underlay = new byte[4][this.landscapeSizeX][this.landscapeSizeY];
        this.overlay = new byte[4][this.landscapeSizeX][this.landscapeSizeY];
        this.aByteArrayArrayArray136 = new byte[4][this.landscapeSizeX][this.landscapeSizeY];
        this.aByteArrayArrayArray148 = new byte[4][this.landscapeSizeX][this.landscapeSizeY];
        this.tileCullingBitmap = new int[4][this.landscapeSizeX + 1][this.landscapeSizeY + 1];
        this.objectShadowData = new byte[4][this.landscapeSizeX + 1][this.landscapeSizeY + 1];
        this.tileLightingIntensity = new int[this.landscapeSizeX + 1][this.landscapeSizeY + 1];
        this.blendedHue = new int[this.landscapeSizeY];
        this.blendedSaturation = new int[this.landscapeSizeY];
        this.blendedLightness = new int[this.landscapeSizeY];
        this.blendedDivisor = new int[this.landscapeSizeY];
        this.blendDirectionTracker = new int[this.landscapeSizeY];
    }

    public static int method170(int i, int j) {
        int k = i + j * 57;
        k = k << 13 ^ k;
        int l = k * (k * k * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
        return l >> 19 & 255;
    }

    /*
     * Exception decompiling
     */
    public void method171(CollisionMap[] collision, WorldController scene) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[UNCONDITIONALDOLOOP]], but top level block is 18[UNCONDITIONALDOLOOP]
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

    public static int method172(int i, int j) {
        int k = MapRegion.method176(i + 45365, j + 91923, 4) - 128 + (MapRegion.method176(i + 10294, j + 37821, 2) - 128 >> 1) + (MapRegion.method176(i, j, 1) - 128 >> 2);
        if ((k = (int)((double)k * 0.3) + 35) < 10) {
            return 10;
        }
        if (k <= 60) return k;
        return 60;
    }

    public static void method173(Stream stream, OnDemandFetcher class42_sub1) {
        int i = -1;
        int j;
        block0 : while ((j = stream.readUSmart2()) != 0) {
            ObjectDefinition class46 = ObjectDefinition.forID(i += j);
            class46.method574(class42_sub1);
            do {
                int k;
                if ((k = stream.readUnsignedSmart()) == 0) continue block0;
                stream.readUnsignedByte();
            } while (true);
            break;
        }
        return;
    }

    public final void method174(int i, int j, int l, int i1) {
        int j1 = i;
        while (j1 <= i + j) {
            for (int k1 = i1; k1 <= i1 + l; ++k1) {
                if (k1 < 0 || k1 >= this.landscapeSizeX || j1 < 0 || j1 >= this.landscapeSizeY) continue;
                this.objectShadowData[0][k1][j1] = 127;
                if (k1 == i1 && k1 > 0) {
                    this.heightMap[0][k1][j1] = this.heightMap[0][k1 - 1][j1];
                }
                if (k1 == i1 + l && k1 < this.landscapeSizeX - 1) {
                    this.heightMap[0][k1][j1] = this.heightMap[0][k1 + 1][j1];
                }
                if (j1 == i && j1 > 0) {
                    this.heightMap[0][k1][j1] = this.heightMap[0][k1][j1 - 1];
                }
                if (j1 != i + j || j1 >= this.landscapeSizeY - 1) continue;
                this.heightMap[0][k1][j1] = this.heightMap[0][k1][j1 + 1];
            }
            ++j1;
        }
    }

    public void method175(int i, WorldController worldController, CollisionMap class11, int j, int k, int l, int i1, int j1) {
        block76 : {
            int j4;
            int l4;
            block77 : {
                int k1;
                int l2;
                ObjectDefinition class46;
                int k2;
                int j2;
                int l1;
                int i2;
                byte byte0;
                block75 : {
                    if (lowMem && (this.tileSetting[0][l][i] & 2) == 0) {
                        if ((this.tileSetting[k][l][i] & 16) != 0) {
                            return;
                        }
                        if (this.method182(i, k, l) != anInt131) {
                            return;
                        }
                    }
                    if (k < setZ) {
                        setZ = k;
                    }
                    k1 = this.heightMap[k][l][i];
                    l1 = this.heightMap[k][l + 1][i];
                    i2 = this.heightMap[k][l + 1][i + 1];
                    j2 = this.heightMap[k][l][i + 1];
                    k2 = k1 + l1 + i2 + j2 >> 2;
                    class46 = ObjectDefinition.forID(i1);
                    int mX = Client.anInt1069 - 6;
                    int mY = Client.anInt1070 - 6;
                    int actualX = mX * 8 + l;
                    int actualY = mY * 8 + i;
                    if (actualX >= 3209 && actualX <= 3217 && actualY >= 3425 && actualY <= 3433) {
                        return;
                    }
                    l2 = l + (i << 7) + (i1 << 14) + 1073741824;
                    if (!class46.hasActions) {
                        l2 -= Integer.MIN_VALUE;
                    }
                    byte0 = (byte)((j1 << 6) + j);
                    if (j == 22) {
                        if (lowMem && !class46.hasActions && !class46.aBoolean736) {
                            return;
                        }
                        Entity obj = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(22, j1, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, j1, 22, l1, i2, k1, j2, class46.anInt781, true);
                        worldController.addGroundDecoration(k, k2, i, obj, byte0, l2, l);
                        if (!class46.aBoolean767) return;
                        if (!class46.hasActions) return;
                        if (class11 == null) return;
                        class11.clipTableSet(i, l);
                        return;
                    }
                    if (j != 10 && j != 11) break block75;
                    Entity obj1 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(10, j1, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, j1, 10, l1, i2, k1, j2, class46.anInt781, true);
                    if (obj1 == null) break block76;
                    int i5 = 0;
                    if (j == 11) {
                        i5 += 256;
                    }
                    if (j1 == 1 || j1 == 3) {
                        j4 = class46.length;
                        l4 = class46.width;
                    } else {
                        j4 = class46.width;
                        l4 = class46.length;
                    }
                    if (!worldController.method284(l2, byte0, k2, l4, obj1, j4, k, i5, i, l) || !class46.aBoolean779) break block76;
                    Entity model = obj1 instanceof Model ? obj1 : class46.method578(10, j1, k1, l1, i2, j2, -1);
                    if (model == null) break block76;
                    break block77;
                }
                if (j >= 12) {
                    Entity obj2 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(j, j1, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, j1, j, l1, i2, k1, j2, class46.anInt781, true);
                    worldController.method284(l2, byte0, k2, 1, obj2, 1, k, 0, i, l);
                    if (j >= 12 && j <= 17 && j != 13 && k > 0) {
                        int[] arrn = this.tileCullingBitmap[k][l];
                        int n = i;
                        arrn[n] = arrn[n] | 2340;
                    }
                    if (!class46.aBoolean767) return;
                    if (class11 == null) return;
                    class11.method212(class46.aBoolean757, class46.width, class46.length, l, i, j1);
                    return;
                }
                if (j == 0) {
                    Entity obj3 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(0, j1, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, j1, 0, l1, i2, k1, j2, class46.anInt781, true);
                    worldController.addWallObject(anIntArray152[j1], obj3, l2, i, byte0, l, null, k2, 0, k);
                    if (j1 == 0) {
                        if (class46.aBoolean779) {
                            this.objectShadowData[k][l][i] = 50;
                            this.objectShadowData[k][l][i + 1] = 50;
                        }
                        if (class46.aBoolean764) {
                            int[] arrn = this.tileCullingBitmap[k][l];
                            int n = i;
                            arrn[n] = arrn[n] | 585;
                        }
                    } else if (j1 == 1) {
                        if (class46.aBoolean779) {
                            this.objectShadowData[k][l][i + 1] = 50;
                            this.objectShadowData[k][l + 1][i + 1] = 50;
                        }
                        if (class46.aBoolean764) {
                            int[] arrn = this.tileCullingBitmap[k][l];
                            int n = i + 1;
                            arrn[n] = arrn[n] | 1170;
                        }
                    } else if (j1 == 2) {
                        if (class46.aBoolean779) {
                            this.objectShadowData[k][l + 1][i] = 50;
                            this.objectShadowData[k][l + 1][i + 1] = 50;
                        }
                        if (class46.aBoolean764) {
                            int[] arrn = this.tileCullingBitmap[k][l + 1];
                            int n = i;
                            arrn[n] = arrn[n] | 585;
                        }
                    } else if (j1 == 3) {
                        if (class46.aBoolean779) {
                            this.objectShadowData[k][l][i] = 50;
                            this.objectShadowData[k][l + 1][i] = 50;
                        }
                        if (class46.aBoolean764) {
                            int[] arrn = this.tileCullingBitmap[k][l];
                            int n = i;
                            arrn[n] = arrn[n] | 1170;
                        }
                    }
                    if (class46.aBoolean767 && class11 != null) {
                        class11.method211(i, j1, l, j, class46.aBoolean757);
                    }
                    if (class46.anInt775 == 16) return;
                    worldController.method290(i, class46.anInt775, l, k);
                    return;
                }
                if (j == 1) {
                    Entity obj4 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(1, j1, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, j1, 1, l1, i2, k1, j2, class46.anInt781, true);
                    worldController.addWallObject(anIntArray140[j1], obj4, l2, i, byte0, l, null, k2, 0, k);
                    if (class46.aBoolean779) {
                        if (j1 == 0) {
                            this.objectShadowData[k][l][i + 1] = 50;
                        } else if (j1 == 1) {
                            this.objectShadowData[k][l + 1][i + 1] = 50;
                        } else if (j1 == 2) {
                            this.objectShadowData[k][l + 1][i] = 50;
                        } else if (j1 == 3) {
                            this.objectShadowData[k][l][i] = 50;
                        }
                    }
                    if (!class46.aBoolean767) return;
                    if (class11 == null) return;
                    class11.method211(i, j1, l, j, class46.aBoolean757);
                    return;
                }
                if (j == 2) {
                    Entity obj122;
                    Entity obj122;
                    Entity obj112;
                    Entity obj112;
                    int i3 = j1 + 1 & 3;
                    if (class46.anInt781 == -1 && class46.childrenIDs == null) {
                        obj112 = class46.method578(2, 4 + j1, k1, l1, i2, j2, -1);
                        obj122 = class46.method578(2, i3, k1, l1, i2, j2, -1);
                    } else {
                        obj112 = new Animable_Sub5(i1, 4 + j1, 2, l1, i2, k1, j2, class46.anInt781, true);
                        obj122 = new Animable_Sub5(i1, i3, 2, l1, i2, k1, j2, class46.anInt781, true);
                    }
                    worldController.addWallObject(anIntArray152[j1], obj112, l2, i, byte0, l, obj122, k2, anIntArray152[i3], k);
                    if (class46.aBoolean764) {
                        if (j1 == 0) {
                            int[] arrn = this.tileCullingBitmap[k][l];
                            int n = i;
                            arrn[n] = arrn[n] | 585;
                            int[] arrn2 = this.tileCullingBitmap[k][l];
                            int n2 = i + 1;
                            arrn2[n2] = arrn2[n2] | 1170;
                        } else if (j1 == 1) {
                            int[] arrn = this.tileCullingBitmap[k][l];
                            int n = i + 1;
                            arrn[n] = arrn[n] | 1170;
                            int[] arrn3 = this.tileCullingBitmap[k][l + 1];
                            int n3 = i;
                            arrn3[n3] = arrn3[n3] | 585;
                        } else if (j1 == 2) {
                            int[] arrn = this.tileCullingBitmap[k][l + 1];
                            int n = i;
                            arrn[n] = arrn[n] | 585;
                            int[] arrn4 = this.tileCullingBitmap[k][l];
                            int n4 = i;
                            arrn4[n4] = arrn4[n4] | 1170;
                        } else if (j1 == 3) {
                            int[] arrn = this.tileCullingBitmap[k][l];
                            int n = i;
                            arrn[n] = arrn[n] | 1170;
                            int[] arrn5 = this.tileCullingBitmap[k][l];
                            int n5 = i;
                            arrn5[n5] = arrn5[n5] | 585;
                        }
                    }
                    if (class46.aBoolean767 && class11 != null) {
                        class11.method211(i, j1, l, j, class46.aBoolean757);
                    }
                    if (class46.anInt775 == 16) return;
                    worldController.method290(i, class46.anInt775, l, k);
                    return;
                }
                if (j == 3) {
                    Entity obj5 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(3, j1, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, j1, 3, l1, i2, k1, j2, class46.anInt781, true);
                    worldController.addWallObject(anIntArray140[j1], obj5, l2, i, byte0, l, null, k2, 0, k);
                    if (class46.aBoolean779) {
                        if (j1 == 0) {
                            this.objectShadowData[k][l][i + 1] = 50;
                        } else if (j1 == 1) {
                            this.objectShadowData[k][l + 1][i + 1] = 50;
                        } else if (j1 == 2) {
                            this.objectShadowData[k][l + 1][i] = 50;
                        } else if (j1 == 3) {
                            this.objectShadowData[k][l][i] = 50;
                        }
                    }
                    if (!class46.aBoolean767) return;
                    if (class11 == null) return;
                    class11.method211(i, j1, l, j, class46.aBoolean757);
                    return;
                }
                if (j == 9) {
                    Entity obj6 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(j, j1, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, j1, j, l1, i2, k1, j2, class46.anInt781, true);
                    worldController.method284(l2, byte0, k2, 1, obj6, 1, k, 0, i, l);
                    if (!class46.aBoolean767) return;
                    if (class11 == null) return;
                    class11.method212(class46.aBoolean757, class46.width, class46.length, l, i, j1);
                    return;
                }
                if (class46.aBoolean762) {
                    if (j1 == 1) {
                        int j3 = j2;
                        j2 = i2;
                        i2 = l1;
                        l1 = k1;
                        k1 = j3;
                    } else if (j1 == 2) {
                        int k3 = j2;
                        j2 = l1;
                        l1 = k3;
                        k3 = i2;
                        i2 = k1;
                        k1 = k3;
                    } else if (j1 == 3) {
                        int l3 = j2;
                        j2 = k1;
                        k1 = l1;
                        l1 = i2;
                        i2 = l3;
                    }
                }
                if (j == 4) {
                    Entity obj7 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, 0, 4, l1, i2, k1, j2, class46.anInt781, true);
                    worldController.method283(l2, i, j1 * 512, k, 0, k2, obj7, l, byte0, 0, anIntArray152[j1]);
                    return;
                }
                if (j == 5) {
                    int i4 = 16;
                    int k4 = worldController.method300(k, l, i);
                    if (k4 > 0) {
                        i4 = ObjectDefinition.forID((int)(k4 >> 14 & 32767)).anInt775;
                    }
                    Entity obj13 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, 0, 4, l1, i2, k1, j2, class46.anInt781, true);
                    worldController.method283(l2, i, j1 * 512, k, anIntArray137[j1] * i4, k2, obj13, l, byte0, anIntArray144[j1] * i4, anIntArray152[j1]);
                    return;
                }
                if (j == 6) {
                    Entity obj8 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, 0, 4, l1, i2, k1, j2, class46.anInt781, true);
                    worldController.method283(l2, i, j1, k, 0, k2, obj8, l, byte0, 0, 256);
                    return;
                }
                if (j == 7) {
                    Entity obj9 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, 0, 4, l1, i2, k1, j2, class46.anInt781, true);
                    worldController.method283(l2, i, j1, k, 0, k2, obj9, l, byte0, 0, 512);
                    return;
                }
                if (j != 8) return;
                Entity obj10 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, k1, l1, i2, j2, -1) : new Animable_Sub5(i1, 0, 4, l1, i2, k1, j2, class46.anInt781, true);
                worldController.method283(l2, i, j1, k, 0, k2, obj10, l, byte0, 0, 768);
                return;
            }
            for (int j5 = 0; j5 <= j4; ++j5) {
                for (int k5 = 0; k5 <= l4; ++k5) {
                    int l5 = model.anInt1650 / 4;
                    if (l5 > 30) {
                        l5 = 30;
                    }
                    if (l5 <= this.objectShadowData[k][l + j5][i + k5]) continue;
                    this.objectShadowData[k][l + j5][i + k5] = (byte)l5;
                }
            }
        }
        if (!class46.aBoolean767) return;
        if (class11 == null) return;
        class11.method212(class46.aBoolean757, class46.width, class46.length, l, i, j1);
    }

    public static int method176(int i, int j, int k) {
        int l = i / k;
        int i1 = i & k - 1;
        int j1 = j / k;
        int k1 = j & k - 1;
        int l1 = MapRegion.method186(l, j1);
        int i2 = MapRegion.method186(l + 1, j1);
        int j2 = MapRegion.method186(l, j1 + 1);
        int k2 = MapRegion.method186(l + 1, j1 + 1);
        int l2 = MapRegion.method184(l1, i2, i1, k);
        int i3 = MapRegion.method184(j2, k2, i1, k);
        return MapRegion.method184(l2, i3, k1, k);
    }

    public int method177(int i, int j, int k) {
        if (k > 179) {
            j /= 2;
        }
        if (k > 192) {
            j /= 2;
        }
        if (k > 217) {
            j /= 2;
        }
        if (k <= 243) return (i / 4 << 10) + (j / 32 << 7) + k / 2;
        j /= 2;
        return (i / 4 << 10) + (j / 32 << 7) + k / 2;
    }

    public static boolean method178(int i, int j) {
        ObjectDefinition class46 = ObjectDefinition.forID(i);
        if (j == 11) {
            j = 10;
        }
        if (j < 5) return class46.method577(j);
        if (j > 8) return class46.method577(j);
        j = 4;
        return class46.method577(j);
    }

    public final void method179(int i, int j, CollisionMap[] aclass11, int l, int i1, byte[] abyte0, int j1, int k1, int l1) {
        for (int i2 = 0; i2 < 8; ++i2) {
            for (int j2 = 0; j2 < 8; ++j2) {
                if (l + i2 <= 0 || l + i2 >= 103 || l1 + j2 <= 0 || l1 + j2 >= 103) continue;
                int[] arrn = aclass11[k1].clipData[l + i2];
                int n = l1 + j2;
                arrn[n] = arrn[n] & -16777217;
            }
        }
        Stream stream = new Stream(abyte0);
        int l2 = 0;
        block2 : while (l2 < 4) {
            int i3 = 0;
            do {
                if (i3 < 64) {
                } else {
                    ++l2;
                    continue block2;
                }
                for (int j3 = 0; j3 < 64; ++j3) {
                    if (l2 == i && i3 >= i1 && i3 < i1 + 8 && j3 >= j1 && j3 < j1 + 8) {
                        this.method181(l1 + Class4.method156(j3 & 7, j, i3 & 7), 0, stream, l + Class4.method155(j, j3 & 7, i3 & 7), k1, j, 0);
                        continue;
                    }
                    this.method181(-1, 0, stream, -1, 0, 0, 0);
                }
                ++i3;
            } while (true);
            break;
        }
        return;
    }

    public final void method180(byte[] abyte0, int i, int j, int k, int l, CollisionMap[] aclass11) {
        int i1 = 0;
        do {
            if (i1 >= 4) break;
            for (int j1 = 0; j1 < 64; ++j1) {
                for (int k1 = 0; k1 < 64; ++k1) {
                    if (j + j1 <= 0 || j + j1 >= 103 || i + k1 <= 0 || i + k1 >= 103) continue;
                    int[] arrn = aclass11[i1].clipData[j + j1];
                    int n = i + k1;
                    arrn[n] = arrn[n] & -16777217;
                }
            }
            ++i1;
        } while (true);
        Stream stream = new Stream(abyte0);
        int l1 = 0;
        while (l1 < 4) {
            for (int i2 = 0; i2 < 64; ++i2) {
                for (int j2 = 0; j2 < 64; ++j2) {
                    this.method181(j2 + i, l, stream, i2 + j, l1, 0, k);
                }
            }
            ++l1;
        }
    }

    public void method181(int i, int j, Stream stream, int k, int l, int i1, int k1) {
        if (k >= 0 && k < 104 && i >= 0 && i < 104) {
            this.tileSetting[l][k][i] = 0;
            do {
                int l1;
                if ((l1 = stream.readUnsignedByte()) == 0) {
                    if (l != 0) break;
                    this.heightMap[0][k][i] = (- MapRegion.method172(932731 + k + k1, 556238 + i + j)) * 8;
                    return;
                }
                if (l1 == 1) {
                    int j2 = stream.readUnsignedByte();
                    if (j2 == 1) {
                        j2 = 0;
                    }
                    if (l == 0) {
                        this.heightMap[0][k][i] = (- j2) * 8;
                        return;
                    }
                    this.heightMap[l][k][i] = this.heightMap[l - 1][k][i] - j2 * 8;
                    return;
                }
                if (l1 <= 49) {
                    this.overlay[l][k][i] = stream.readSignedByte();
                    this.aByteArrayArrayArray136[l][k][i] = (byte)((l1 - 2) / 4);
                    this.aByteArrayArrayArray148[l][k][i] = (byte)(l1 - 2 + i1 & 3);
                    continue;
                }
                if (l1 <= 81) {
                    this.tileSetting[l][k][i] = (byte)(l1 - 49);
                    continue;
                }
                this.underlay[l][k][i] = (byte)(l1 - 81);
            } while (true);
            this.heightMap[l][k][i] = this.heightMap[l - 1][k][i] - 240;
            return;
        }
        int i2;
        while ((i2 = stream.readUnsignedByte()) != 0) {
            if (i2 == 1) {
                stream.readUnsignedByte();
                return;
            }
            if (i2 > 49) continue;
            stream.readUnsignedByte();
        }
        return;
    }

    public int method182(int i, int j, int k) {
        if ((this.tileSetting[j][k][i] & 8) != 0) {
            return 0;
        }
        if (j <= 0) return j;
        if ((this.tileSetting[1][k][i] & 2) == 0) return j;
        return j - 1;
    }

    public final void method183(CollisionMap[] aclass11, WorldController worldController, int i, int j, int k, int l, byte[] abyte0, int i1, int j1, int k1) {
        Stream stream = new Stream(abyte0);
        int l1 = -1;
        int i2;
        block0 : while ((i2 = stream.readUSmart2()) != 0) {
            l1 += i2;
            int j2 = 0;
            do {
                int k2;
                if ((k2 = stream.readUnsignedSmart()) == 0) continue block0;
                int l2 = (j2 += k2 - 1) & 63;
                int i3 = j2 >> 6 & 63;
                int j3 = j2 >> 12;
                int k3 = stream.readUnsignedByte();
                int l3 = k3 >> 2;
                int i4 = k3 & 3;
                if (j3 != i || i3 < i1 || i3 >= i1 + 8 || l2 < k || l2 >= k + 8) continue;
                ObjectDefinition class46 = ObjectDefinition.forID(l1);
                int j4 = j + Class4.method157(j1, class46.length, i3 & 7, l2 & 7, class46.width);
                int k4 = k1 + Class4.method158(l2 & 7, class46.length, j1, class46.width, i3 & 7);
                if (j4 <= 0 || k4 <= 0 || j4 >= 103 || k4 >= 103) continue;
                int l4 = j3;
                if ((this.tileSetting[1][j4][k4] & 2) == 2) {
                    --l4;
                }
                CollisionMap class11 = null;
                if (l4 >= 0) {
                    class11 = aclass11[l4];
                }
                this.method175(k4, worldController, class11, l3, l, j4, l1, i4 + j1 & 3);
            } while (true);
            break;
        }
        return;
    }

    public static int method184(int i, int j, int k, int l) {
        int i1 = 65536 - Rasterizer.anIntArray1471[k * 1024 / l] >> 1;
        return (i * (65536 - i1) >> 16) + (j * i1 >> 16);
    }

    public int method185(int i, int j) {
        if (i == -2) {
            return 12345678;
        }
        if (i == -1) {
            if (j < 0) {
                j = 0;
                return 127 - j;
            } else {
                if (j <= 127) return 127 - j;
                j = 127;
            }
            return 127 - j;
        }
        if ((j = j * (i & 127) / 128) < 2) {
            j = 2;
            return (i & 65408) + j;
        }
        if (j <= 126) return (i & 65408) + j;
        j = 126;
        return (i & 65408) + j;
    }

    public static int method186(int i, int j) {
        int k = MapRegion.method170(i - 1, j - 1) + MapRegion.method170(i + 1, j - 1) + MapRegion.method170(i - 1, j + 1) + MapRegion.method170(i + 1, j + 1);
        int l = MapRegion.method170(i - 1, j) + MapRegion.method170(i + 1, j) + MapRegion.method170(i, j - 1) + MapRegion.method170(i, j + 1);
        int i1 = MapRegion.method170(i, j);
        return k / 16 + l / 8 + i1 / 4;
    }

    public static int method187(int i, int j) {
        if (i == -1) {
            return 12345678;
        }
        if ((j = j * (i & 127) / 128) < 2) {
            j = 2;
            return (i & 65408) + j;
        }
        if (j <= 126) return (i & 65408) + j;
        j = 126;
        return (i & 65408) + j;
    }

    public static void method188(WorldController worldController, int i, int j, int k, int l, CollisionMap class11, int[][][] ai, int i1, int j1, int k1) {
        int l1 = ai[l][i1][j];
        int i2 = ai[l][i1 + 1][j];
        int j2 = ai[l][i1 + 1][j + 1];
        int k2 = ai[l][i1][j + 1];
        int l2 = l1 + i2 + j2 + k2 >> 2;
        ObjectDefinition class46 = ObjectDefinition.forID(j1);
        int i3 = i1 + (j << 7) + (j1 << 14) + 1073741824;
        if (!class46.hasActions) {
            i3 -= Integer.MIN_VALUE;
        }
        byte byte1 = (byte)((i << 6) + k);
        if (k == 22) {
            Entity obj = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(22, i, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, i, 22, i2, j2, l1, k2, class46.anInt781, true);
            worldController.addGroundDecoration(k1, l2, j, obj, byte1, i3, i1);
            if (!class46.aBoolean767) return;
            if (!class46.hasActions) return;
            class11.clipTableSet(j, i1);
            return;
        }
        if (k == 10 || k == 11) {
            Entity obj1 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(10, i, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, i, 10, i2, j2, l1, k2, class46.anInt781, true);
            if (obj1 != null) {
                int i5;
                int k4;
                int j5 = 0;
                if (k == 11) {
                    j5 += 256;
                }
                if (i == 1 || i == 3) {
                    k4 = class46.length;
                    i5 = class46.width;
                } else {
                    k4 = class46.width;
                    i5 = class46.length;
                }
                worldController.method284(i3, byte1, l2, i5, obj1, k4, k1, j5, j, i1);
            }
            if (!class46.aBoolean767) return;
            class11.method212(class46.aBoolean757, class46.width, class46.length, i1, j, i);
            return;
        }
        if (k >= 12) {
            Entity obj2 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(k, i, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, i, k, i2, j2, l1, k2, class46.anInt781, true);
            worldController.method284(i3, byte1, l2, 1, obj2, 1, k1, 0, j, i1);
            if (!class46.aBoolean767) return;
            class11.method212(class46.aBoolean757, class46.width, class46.length, i1, j, i);
            return;
        }
        if (k == 0) {
            Entity obj3 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(0, i, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, i, 0, i2, j2, l1, k2, class46.anInt781, true);
            worldController.addWallObject(anIntArray152[i], obj3, i3, j, byte1, i1, null, l2, 0, k1);
            if (!class46.aBoolean767) return;
            class11.method211(j, i, i1, k, class46.aBoolean757);
            return;
        }
        if (k == 1) {
            Entity obj4 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(1, i, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, i, 1, i2, j2, l1, k2, class46.anInt781, true);
            worldController.addWallObject(anIntArray140[i], obj4, i3, j, byte1, i1, null, l2, 0, k1);
            if (!class46.aBoolean767) return;
            class11.method211(j, i, i1, k, class46.aBoolean757);
            return;
        }
        if (k == 2) {
            Entity obj122;
            Entity obj112;
            Entity obj112;
            Entity obj122;
            int j3 = i + 1 & 3;
            if (class46.anInt781 == -1 && class46.childrenIDs == null) {
                obj112 = class46.method578(2, 4 + i, l1, i2, j2, k2, -1);
                obj122 = class46.method578(2, j3, l1, i2, j2, k2, -1);
            } else {
                obj112 = new Animable_Sub5(j1, 4 + i, 2, i2, j2, l1, k2, class46.anInt781, true);
                obj122 = new Animable_Sub5(j1, j3, 2, i2, j2, l1, k2, class46.anInt781, true);
            }
            worldController.addWallObject(anIntArray152[i], obj112, i3, j, byte1, i1, obj122, l2, anIntArray152[j3], k1);
            if (!class46.aBoolean767) return;
            class11.method211(j, i, i1, k, class46.aBoolean757);
            return;
        }
        if (k == 3) {
            Entity obj5 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(3, i, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, i, 3, i2, j2, l1, k2, class46.anInt781, true);
            worldController.addWallObject(anIntArray140[i], obj5, i3, j, byte1, i1, null, l2, 0, k1);
            if (!class46.aBoolean767) return;
            class11.method211(j, i, i1, k, class46.aBoolean757);
            return;
        }
        if (k == 9) {
            Entity obj6 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(k, i, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, i, k, i2, j2, l1, k2, class46.anInt781, true);
            worldController.method284(i3, byte1, l2, 1, obj6, 1, k1, 0, j, i1);
            if (!class46.aBoolean767) return;
            class11.method212(class46.aBoolean757, class46.width, class46.length, i1, j, i);
            return;
        }
        if (class46.aBoolean762) {
            if (i == 1) {
                int k3 = k2;
                k2 = j2;
                j2 = i2;
                i2 = l1;
                l1 = k3;
            } else if (i == 2) {
                int l3 = k2;
                k2 = i2;
                i2 = l3;
                l3 = j2;
                j2 = l1;
                l1 = l3;
            } else if (i == 3) {
                int i4 = k2;
                k2 = l1;
                l1 = i2;
                i2 = j2;
                j2 = i4;
            }
        }
        if (k == 4) {
            Entity obj7 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, 0, 4, i2, j2, l1, k2, class46.anInt781, true);
            worldController.method283(i3, j, i * 512, k1, 0, l2, obj7, i1, byte1, 0, anIntArray152[i]);
            return;
        }
        if (k == 5) {
            int j4 = 16;
            int l4 = worldController.method300(k1, i1, j);
            if (l4 > 0) {
                j4 = ObjectDefinition.forID((int)(l4 >> 14 & 32767)).anInt775;
            }
            Entity obj13 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, 0, 4, i2, j2, l1, k2, class46.anInt781, true);
            worldController.method283(i3, j, i * 512, k1, anIntArray137[i] * j4, l2, obj13, i1, byte1, anIntArray144[i] * j4, anIntArray152[i]);
            return;
        }
        if (k == 6) {
            Entity obj8 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, 0, 4, i2, j2, l1, k2, class46.anInt781, true);
            worldController.method283(i3, j, i, k1, 0, l2, obj8, i1, byte1, 0, 256);
            return;
        }
        if (k == 7) {
            Entity obj9 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, 0, 4, i2, j2, l1, k2, class46.anInt781, true);
            worldController.method283(i3, j, i, k1, 0, l2, obj9, i1, byte1, 0, 512);
            return;
        }
        if (k != 8) return;
        Entity obj10 = class46.anInt781 == -1 && class46.childrenIDs == null ? class46.method578(4, 0, l1, i2, j2, k2, -1) : new Animable_Sub5(j1, 0, 4, i2, j2, l1, k2, class46.anInt781, true);
        worldController.method283(i3, j, i, k1, 0, l2, obj10, i1, byte1, 0, 768);
    }

    /*
     * Unable to fully structure code
     */
    public static boolean method189(int i, byte[] is, int i_250_) {
        bool = true;
        stream = new Stream(is);
        i_252_ = -1;
        block0 : do lbl-1000: // 3 sources:
        {
            if ((i_253_ = stream.readUSmart2()) == 0) {
                return bool;
            }
            i_252_ += i_253_;
            i_254_ = 0;
            bool_255_ = false;
            do {
                block3 : {
                    if (!bool_255_) break block3;
                    i_256_ = stream.readUnsignedSmart();
                    if (i_256_ == 0) ** GOTO lbl-1000
                    stream.readUnsignedByte();
                    continue;
                }
                i_257_ = stream.readUnsignedSmart();
                if (i_257_ == 0) continue block0;
                i_258_ = (i_254_ += i_257_ - 1) & 63;
                i_259_ = i_254_ >> 6 & 63;
                i_260_ = stream.readUnsignedByte() >> 2;
                i_261_ = i_259_ + i;
                i_262_ = i_258_ + i_250_;
                if (i_261_ <= 0 || i_262_ <= 0 || i_261_ >= 103 || i_262_ >= 103) continue;
                class46 = ObjectDefinition.forID(i_252_);
                if (i_260_ == 22 && MapRegion.lowMem && !class46.hasActions && !class46.aBoolean736) continue;
                bool &= class46.method579();
                bool_255_ = true;
            } while (true);
            break;
        } while (true);
    }

    public final void method190(int i, CollisionMap[] aclass11, int j, WorldController worldController, byte[] abyte0) {
        try {
            Stream stream = new Stream(abyte0);
            int l = -1;
            block2 : do {
                int i1;
                if ((i1 = stream.readUSmart2()) == 0) {
                    return;
                }
                l += i1;
                int j1 = 0;
                do {
                    int k1;
                    if ((k1 = stream.readUnsignedSmart()) == 0) continue block2;
                    int l1 = (j1 += k1 - 1) & 63;
                    int i2 = j1 >> 6 & 63;
                    int j2 = j1 >> 12;
                    int k2 = stream.readUnsignedByte();
                    int l2 = k2 >> 2;
                    int i3 = k2 & 3;
                    int j3 = i2 + i;
                    int k3 = l1 + j;
                    if (j3 <= 0 || k3 <= 0 || j3 >= 103 || k3 >= 103) continue;
                    int l3 = j2;
                    if ((this.tileSetting[1][j3][k3] & 2) == 2) {
                        --l3;
                    }
                    CollisionMap class11 = null;
                    if (l3 >= 0) {
                        class11 = aclass11[l3];
                    }
                    this.method175(k3, worldController, class11, l2, j2, j3, l, i3);
                } while (true);
                break;
            } while (true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        anInt133 = (int)(Math.random() * 33.0) - 16;
        anIntArray137 = new int[]{1, 0, -1, 0};
        anIntArray140 = new int[]{16, 32, 64, 128};
        anIntArray144 = new int[]{0, -1, 0, 1};
        setZ = 99;
        lowMem = true;
        anIntArray152 = new int[]{1, 2, 4, 8};
    }
}


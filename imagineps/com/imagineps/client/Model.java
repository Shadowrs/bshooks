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
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.Entity;
import com.imagineps.client.ModelHeader;
import com.imagineps.client.PlayerSettings;
import com.imagineps.client.Stream;
import com.imagineps.client.VertexNormal;
import com.imagineps.client.cache.OnDemandFetcherParent;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.RevisionType;
import com.imagineps.client.definition.SkinList;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.Rasterizer;
import com.imagineps.client.particles.Particle;
import com.imagineps.client.particles.ParticleAttachment;
import com.imagineps.client.particles.ParticleDefinition;
import com.imagineps.client.particles.Vector;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Model
extends Entity {
    public boolean scaledVertices;
    private static final int MAX_POLYGONS = 20000;
    public static int anInt1620;
    public static Model EMPTY_MODEL;
    private static int[] anIntArray1622;
    private static int[] anIntArray1623;
    private static int[] anIntArray1624;
    private static int[] anIntArray1625;
    static OnDemandFetcherParent aOnDemandFetcherParent;
    static boolean[] aBooleanArray1663;
    static boolean[] aBooleanArray1664;
    static int[] anIntArray1665;
    static int[] anIntArray1666;
    static int[] anIntArray1667;
    static int[] anIntArray1668;
    static int[] anIntArray1669;
    static int[] anIntArray1670;
    static int[] anIntArray1671;
    static int[][] anIntArrayArray1672;
    static int[] anIntArray1673;
    static int[][] anIntArrayArray1674;
    static int[] anIntArray1675;
    static int[] anIntArray1676;
    static int[] vertexPerspectiveDepth;
    static int[] anIntArray1677;
    static int[] anIntArray1678;
    static int[] anIntArray1679;
    static int[] anIntArray1680;
    static int anInt1681;
    static int anInt1682;
    static int anInt1683;
    public static boolean aBoolean1684;
    public static int anInt1685;
    public static int anInt1686;
    public static int anInt1687;
    public static int[] anIntArray1688;
    public static int[] modelIntArray1;
    public static int[] modelIntArray2;
    static int[] modelIntArray3;
    static int[] modelIntArray4;
    private static final HashMap<RevisionType, ModelHeader[]> MODEL_DATA;
    private int lastRenderedRotation = 0;
    private int renderAtPointX;
    public int renderAtPointZ = 0;
    public int renderAtPointY = 0;
    public int[] verticesParticle;
    private boolean aBoolean1618;
    public int anInt1626;
    public int[] anIntArray1627;
    public int[] anIntArray1628;
    public int[] anIntArray1629;
    public int anInt1630;
    public int[] anIntArray1631;
    public int[] anIntArray1632;
    public int[] anIntArray1633;
    public int[] anIntArray1634;
    public int[] anIntArray1635;
    public int[] anIntArray1636;
    public int[] anIntArray1637;
    public int[] anIntArray1638;
    public int[] anIntArray1639;
    public int[] anIntArray1640;
    public int anInt1641;
    public int anInt1642;
    public int[] anIntArray1643;
    public int[] anIntArray1644;
    public int[] anIntArray1645;
    public int anInt1646;
    public int anInt1647;
    public int anInt1648;
    public int anInt1649;
    public int anInt1650;
    public int anInt1651;
    public int anInt1652;
    public int anInt1653;
    public int anInt1654;
    public int[] anIntArray1655;
    public int[] anIntArray1656;
    public int[][] anIntArrayArray1657;
    public int[][] anIntArrayArray1658;
    public boolean aBoolean1659;
    VertexNormal[] aClass33Array1660;

    public static boolean isCached(int modelId) {
        return Model.isCached(modelId, RevisionType.DEFAULT);
    }

    public static boolean isCached(int modelId, RevisionType type) {
        if (!MODEL_DATA.containsKey((Object)type)) {
            return false;
        }
        ModelHeader[] header = (ModelHeader[])MODEL_DATA.get((Object)type);
        if (modelId < 0) return false;
        if (modelId >= header.length) {
            return false;
        }
        ModelHeader class21 = header[modelId];
        if (class21 != null) return true;
        aOnDemandFetcherParent.fetch(modelId, type.getModelCacheIndex());
        return false;
    }

    public static Model fetchModel(int modelId) {
        return Model.fetchModel(modelId, RevisionType.DEFAULT);
    }

    public static Model fetchModel(int modelId, RevisionType type) {
        try {
            if (!MODEL_DATA.containsKey((Object)type)) {
                return null;
            }
            ModelHeader class21 = ((ModelHeader[])MODEL_DATA.get((Object)type))[modelId];
            if (class21 != null) return new Model(modelId, type);
            aOnDemandFetcherParent.fetch(modelId, type.getModelCacheIndex());
            return null;
        }
        catch (Exception e) {
            return null;
        }
    }

    public static void initialize(int i, OnDemandFetcherParent onDemandFetcherParent) {
        MODEL_DATA.put((Object)RevisionType.DEFAULT, (Object)new ModelHeader[95000]);
        MODEL_DATA.put((Object)RevisionType.OSRS, (Object)new ModelHeader[40000]);
        MODEL_DATA.put((Object)RevisionType.PRE_EOC, (Object)new ModelHeader[100000]);
        MODEL_DATA.put((Object)RevisionType.CUSTOM_ITEM_MODELS, (Object)new ModelHeader[200]);
        aOnDemandFetcherParent = onDemandFetcherParent;
    }

    public static void method460(byte[] abyte0, int j, RevisionType type) {
        try {
            int l2;
            if (abyte0 == null) {
                ModelHeader modelHeader = new ModelHeader();
                ((ModelHeader[])Model.MODEL_DATA.get((Object)type))[j] = modelHeader;
                ModelHeader class21 = modelHeader;
                class21.anInt369 = 0;
                class21.anInt370 = 0;
                class21.anInt371 = 0;
                return;
            }
            Stream stream = new Stream(abyte0);
            stream.currentOffset = abyte0.length - 18;
            ModelHeader modelHeader = new ModelHeader();
            ((ModelHeader[])Model.MODEL_DATA.get((Object)type))[j] = modelHeader;
            ModelHeader class21_1 = modelHeader;
            class21_1.aByteArray368 = abyte0;
            class21_1.anInt369 = stream.readUnsignedWord();
            class21_1.anInt370 = stream.readUnsignedWord();
            class21_1.anInt371 = stream.readUnsignedByte();
            int k = stream.readUnsignedByte();
            int l = stream.readUnsignedByte();
            int i1 = stream.readUnsignedByte();
            int j1 = stream.readUnsignedByte();
            int k1 = stream.readUnsignedByte();
            int l1 = stream.readUnsignedWord();
            int i2 = stream.readUnsignedWord();
            int j2 = stream.readUnsignedWord();
            int k2 = stream.readUnsignedWord();
            class21_1.anInt372 = l2 = 0;
            class21_1.anInt378 = l2 += class21_1.anInt369;
            class21_1.anInt381 = l2 += class21_1.anInt370;
            if (l == 255) {
                l2 += class21_1.anInt370;
            } else {
                class21_1.anInt381 = - l - 1;
            }
            class21_1.anInt383 = l2;
            if (j1 == 1) {
                l2 += class21_1.anInt370;
            } else {
                class21_1.anInt383 = -1;
            }
            class21_1.anInt380 = l2;
            if (k == 1) {
                l2 += class21_1.anInt370;
            } else {
                class21_1.anInt380 = -1;
            }
            class21_1.anInt376 = l2;
            if (k1 == 1) {
                l2 += class21_1.anInt369;
            } else {
                class21_1.anInt376 = -1;
            }
            class21_1.anInt382 = l2;
            if (i1 == 1) {
                l2 += class21_1.anInt370;
            } else {
                class21_1.anInt382 = -1;
            }
            class21_1.anInt377 = l2;
            class21_1.anInt379 = l2 += k2;
            class21_1.anInt384 = l2 += class21_1.anInt370 * 2;
            class21_1.anInt373 = l2 += class21_1.anInt371 * 6;
            class21_1.anInt374 = l2 += l1;
            class21_1.anInt375 = l2 += i2;
            l2 += j2;
            return;
        }
        catch (Exception stream) {
            // empty catch block
        }
    }

    public static final int method481(int i, int j, int k) {
        if (i == 65535) {
            return 0;
        }
        if ((k & 2) == 2) {
            if (j < 0) {
                j = 0;
                return 127 - j;
            } else {
                if (j <= 127) return 127 - j;
                j = 127;
            }
            return 127 - j;
        }
        if ((j = j * (i & 127) >> 7) < 2) {
            j = 2;
            return (i & 65408) + j;
        }
        if (j <= 126) return (i & 65408) + j;
        j = 126;
        return (i & 65408) + j;
    }

    public static void nullLoader() {
        MODEL_DATA.clear();
        aBooleanArray1663 = null;
        aBooleanArray1664 = null;
        anIntArray1666 = null;
        anIntArray1667 = null;
        anIntArray1668 = null;
        anIntArray1669 = null;
        anIntArray1670 = null;
        anIntArray1671 = null;
        anIntArrayArray1672 = null;
        anIntArray1673 = null;
        anIntArrayArray1674 = null;
        anIntArray1675 = null;
        anIntArray1676 = null;
        anIntArray1677 = null;
        modelIntArray1 = null;
        modelIntArray2 = null;
        modelIntArray3 = null;
        modelIntArray4 = null;
    }

    private Model(boolean flag) {
        this.aBoolean1618 = true;
        this.aBoolean1659 = false;
        if (flag) return;
        this.aBoolean1618 = !this.aBoolean1618;
    }

    public Model(boolean flag, boolean flag1, boolean flag2, Model model) {
        this.aBoolean1618 = true;
        this.aBoolean1659 = false;
        ++anInt1620;
        this.anInt1626 = model.anInt1626;
        this.anInt1630 = model.anInt1630;
        this.anInt1642 = model.anInt1642;
        if (flag2) {
            this.verticesParticle = model.verticesParticle;
            this.anIntArray1627 = model.anIntArray1627;
            this.anIntArray1628 = model.anIntArray1628;
            this.anIntArray1629 = model.anIntArray1629;
        } else {
            this.verticesParticle = new int[this.anInt1626];
            this.anIntArray1627 = new int[this.anInt1626];
            this.anIntArray1628 = new int[this.anInt1626];
            this.anIntArray1629 = new int[this.anInt1626];
            for (int j = 0; j < this.anInt1626; ++j) {
                this.verticesParticle[j] = model.verticesParticle[j];
                this.anIntArray1627[j] = model.anIntArray1627[j];
                this.anIntArray1628[j] = model.anIntArray1628[j];
                this.anIntArray1629[j] = model.anIntArray1629[j];
            }
        }
        if (flag) {
            this.anIntArray1640 = model.anIntArray1640;
        } else {
            this.anIntArray1640 = new int[this.anInt1630];
            for (int k = 0; k < this.anInt1630; ++k) {
                this.anIntArray1640[k] = model.anIntArray1640[k];
            }
        }
        if (flag1) {
            this.anIntArray1639 = model.anIntArray1639;
        } else {
            this.anIntArray1639 = new int[this.anInt1630];
            if (model.anIntArray1639 == null) {
                for (int l = 0; l < this.anInt1630; ++l) {
                    this.anIntArray1639[l] = 0;
                }
            } else {
                for (int i1 = 0; i1 < this.anInt1630; ++i1) {
                    this.anIntArray1639[i1] = model.anIntArray1639[i1];
                }
            }
        }
        this.anIntArray1655 = model.anIntArray1655;
        this.anIntArray1656 = model.anIntArray1656;
        this.anIntArray1637 = model.anIntArray1637;
        this.anIntArray1631 = model.anIntArray1631;
        this.anIntArray1632 = model.anIntArray1632;
        this.anIntArray1633 = model.anIntArray1633;
        this.anIntArray1638 = model.anIntArray1638;
        this.anInt1641 = model.anInt1641;
        this.anIntArray1643 = model.anIntArray1643;
        this.anIntArray1644 = model.anIntArray1644;
        this.anIntArray1645 = model.anIntArray1645;
        this.scaledVertices = model.scaledVertices;
    }

    public Model(boolean flag, boolean flag1, Model model) {
        this.aBoolean1618 = true;
        this.aBoolean1659 = false;
        ++anInt1620;
        this.anInt1626 = model.anInt1626;
        this.anInt1630 = model.anInt1630;
        this.anInt1642 = model.anInt1642;
        if (flag) {
            this.anIntArray1628 = new int[this.anInt1626];
            for (int j = 0; j < this.anInt1626; ++j) {
                this.anIntArray1628[j] = model.anIntArray1628[j];
            }
        } else {
            this.anIntArray1628 = model.anIntArray1628;
        }
        if (flag1) {
            this.anIntArray1634 = new int[this.anInt1630];
            this.anIntArray1635 = new int[this.anInt1630];
            this.anIntArray1636 = new int[this.anInt1630];
            for (int k = 0; k < this.anInt1630; ++k) {
                this.anIntArray1634[k] = model.anIntArray1634[k];
                this.anIntArray1635[k] = model.anIntArray1635[k];
                this.anIntArray1636[k] = model.anIntArray1636[k];
            }
            this.anIntArray1637 = new int[this.anInt1630];
            if (model.anIntArray1637 == null) {
                for (int l = 0; l < this.anInt1630; ++l) {
                    this.anIntArray1637[l] = 0;
                }
            } else {
                for (int i1 = 0; i1 < this.anInt1630; ++i1) {
                    this.anIntArray1637[i1] = model.anIntArray1637[i1];
                }
            }
            this.vertexNormals = new VertexNormal[this.anInt1626];
            for (int j1 = 0; j1 < this.anInt1626; ++j1) {
                VertexNormal class33 = this.vertexNormals[j1] = new VertexNormal();
                VertexNormal class33_1 = model.vertexNormals[j1];
                class33.x = class33_1.x;
                class33.y = class33_1.y;
                class33.z = class33_1.z;
                class33.divisor = class33_1.divisor;
            }
            this.aClass33Array1660 = model.aClass33Array1660;
        } else {
            this.anIntArray1634 = model.anIntArray1634;
            this.anIntArray1635 = model.anIntArray1635;
            this.anIntArray1636 = model.anIntArray1636;
            this.anIntArray1637 = model.anIntArray1637;
        }
        this.verticesParticle = model.verticesParticle;
        this.anIntArray1627 = model.anIntArray1627;
        this.anIntArray1629 = model.anIntArray1629;
        this.anIntArray1640 = model.anIntArray1640;
        this.anIntArray1639 = model.anIntArray1639;
        this.anIntArray1638 = model.anIntArray1638;
        this.anInt1641 = model.anInt1641;
        this.anIntArray1631 = model.anIntArray1631;
        this.anIntArray1632 = model.anIntArray1632;
        this.anIntArray1633 = model.anIntArray1633;
        this.anIntArray1643 = model.anIntArray1643;
        this.anIntArray1644 = model.anIntArray1644;
        this.anIntArray1645 = model.anIntArray1645;
        this.modelHeight = model.modelHeight;
        this.anInt1650 = model.anInt1650;
        this.anInt1653 = model.anInt1653;
        this.anInt1652 = model.anInt1652;
        this.anInt1646 = model.anInt1646;
        this.anInt1648 = model.anInt1648;
        this.anInt1649 = model.anInt1649;
        this.anInt1647 = model.anInt1647;
        this.scaledVertices = model.scaledVertices;
    }

    public Model(int i, Model[] amodel) {
        this.aBoolean1618 = true;
        this.aBoolean1659 = false;
        ++anInt1620;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        this.anInt1626 = 0;
        this.anInt1630 = 0;
        this.anInt1642 = 0;
        this.anInt1641 = -1;
        for (int k = 0; k < i; ++k) {
            Model model = amodel[k];
            if (model == null) continue;
            this.anInt1626 += model.anInt1626;
            this.anInt1630 += model.anInt1630;
            this.anInt1642 += model.anInt1642;
            flag |= model.anIntArray1637 != null;
            if (model.anIntArray1638 != null) {
                flag1 = true;
            } else {
                if (this.anInt1641 == -1) {
                    this.anInt1641 = model.anInt1641;
                }
                if (this.anInt1641 != model.anInt1641) {
                    flag1 = true;
                }
            }
            flag2 |= model.anIntArray1639 != null;
            flag3 |= model.anIntArray1656 != null;
            this.scaledVertices |= model.scaledVertices;
        }
        this.verticesParticle = new int[this.anInt1626];
        this.anIntArray1627 = new int[this.anInt1626];
        this.anIntArray1628 = new int[this.anInt1626];
        this.anIntArray1629 = new int[this.anInt1626];
        this.anIntArray1655 = new int[this.anInt1626];
        this.anIntArray1631 = new int[this.anInt1630];
        this.anIntArray1632 = new int[this.anInt1630];
        this.anIntArray1633 = new int[this.anInt1630];
        this.anIntArray1643 = new int[this.anInt1642];
        this.anIntArray1644 = new int[this.anInt1642];
        this.anIntArray1645 = new int[this.anInt1642];
        if (flag) {
            this.anIntArray1637 = new int[this.anInt1630];
        }
        if (flag1) {
            this.anIntArray1638 = new int[this.anInt1630];
        }
        if (flag2) {
            this.anIntArray1639 = new int[this.anInt1630];
        }
        if (flag3) {
            this.anIntArray1656 = new int[this.anInt1630];
        }
        this.anIntArray1640 = new int[this.anInt1630];
        this.anInt1626 = 0;
        this.anInt1630 = 0;
        this.anInt1642 = 0;
        int l = 0;
        int i1 = 0;
        while (i1 < i) {
            Model model_1 = amodel[i1];
            if (model_1 != null) {
                for (int j1 = 0; j1 < model_1.anInt1630; ++this.anInt1630, ++j1) {
                    if (flag) {
                        if (model_1.anIntArray1637 == null) {
                            this.anIntArray1637[this.anInt1630] = 0;
                        } else {
                            int k1 = model_1.anIntArray1637[j1];
                            if ((k1 & 2) == 2) {
                                k1 += l << 2;
                            }
                            this.anIntArray1637[this.anInt1630] = k1;
                        }
                    }
                    if (flag1) {
                        this.anIntArray1638[this.anInt1630] = model_1.anIntArray1638 == null ? model_1.anInt1641 : model_1.anIntArray1638[j1];
                    }
                    if (flag2) {
                        this.anIntArray1639[this.anInt1630] = model_1.anIntArray1639 == null ? 0 : model_1.anIntArray1639[j1];
                    }
                    if (flag3 && model_1.anIntArray1656 != null) {
                        this.anIntArray1656[this.anInt1630] = model_1.anIntArray1656[j1];
                    }
                    this.anIntArray1640[this.anInt1630] = model_1.anIntArray1640[j1];
                    this.anIntArray1631[this.anInt1630] = this.method465(model_1, model_1.anIntArray1631[j1]);
                    this.anIntArray1632[this.anInt1630] = this.method465(model_1, model_1.anIntArray1632[j1]);
                    this.anIntArray1633[this.anInt1630] = this.method465(model_1, model_1.anIntArray1633[j1]);
                }
                for (int l1 = 0; l1 < model_1.anInt1642; ++this.anInt1642, ++l1) {
                    this.anIntArray1643[this.anInt1642] = this.method465(model_1, model_1.anIntArray1643[l1]);
                    this.anIntArray1644[this.anInt1642] = this.method465(model_1, model_1.anIntArray1644[l1]);
                    this.anIntArray1645[this.anInt1642] = this.method465(model_1, model_1.anIntArray1645[l1]);
                }
                l += model_1.anInt1642;
            }
            ++i1;
        }
    }

    public Model(int modelId, RevisionType type) {
        byte[] is = ((ModelHeader[])Model.MODEL_DATA.get((Object)type))[modelId].aByteArray368;
        if (is[is.length - 1] == -1 && is[is.length - 2] == -1) {
            this.read622Model(is, modelId, type);
        } else {
            this.readOldModel(modelId, type);
        }
        int[][] attachments = ParticleAttachment.getAttachments(modelId);
        if (attachments == null) return;
        int n = 0;
        while (n < attachments.length) {
            int z;
            int[] attach = attachments[n];
            if (attach[0] == -1) {
                for (z = 0; z < this.anIntArray1631.length; ++z) {
                    this.verticesParticle[this.anIntArray1631[z]] = attach[1] + 1;
                }
            } else if (attach[0] == -2) {
                for (z = 0; z < this.anIntArray1632.length; ++z) {
                    this.verticesParticle[this.anIntArray1632[z]] = attach[1] + 1;
                }
            } else if (attach[0] == -3) {
                for (z = 0; z < this.anIntArray1633.length; ++z) {
                    this.verticesParticle[this.anIntArray1633[z]] = attach[1] + 1;
                }
            } else if (attach[0] == -4) {
                for (z = 0; z < this.anIntArray1631.length; ++z) {
                    this.verticesParticle[this.anIntArray1631[z]] = attach[1] + 1;
                }
                for (z = 0; z < this.anIntArray1632.length; ++z) {
                    this.verticesParticle[this.anIntArray1632[z]] = attach[1] + 1;
                }
                for (z = 0; z < this.anIntArray1633.length; ++z) {
                    this.verticesParticle[this.anIntArray1633[z]] = attach[1] + 1;
                }
            } else {
                this.verticesParticle[attach[0]] = attach[1] + 1;
            }
            ++n;
        }
    }

    public Model(Model[] amodel) {
        int i = 2;
        this.aBoolean1618 = true;
        this.aBoolean1659 = false;
        ++anInt1620;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        this.anInt1626 = 0;
        this.anInt1630 = 0;
        this.anInt1642 = 0;
        this.anInt1641 = -1;
        for (int k = 0; k < i; ++k) {
            Model model = amodel[k];
            if (model == null) continue;
            this.anInt1626 += model.anInt1626;
            this.anInt1630 += model.anInt1630;
            this.anInt1642 += model.anInt1642;
            flag1 |= model.anIntArray1637 != null;
            if (model.anIntArray1638 != null) {
                flag2 = true;
            } else {
                if (this.anInt1641 == -1) {
                    this.anInt1641 = model.anInt1641;
                }
                if (this.anInt1641 != model.anInt1641) {
                    flag2 = true;
                }
            }
            flag3 |= model.anIntArray1639 != null;
            flag4 |= model.anIntArray1640 != null;
            this.scaledVertices |= model.scaledVertices;
        }
        this.verticesParticle = new int[this.anInt1626];
        this.anIntArray1627 = new int[this.anInt1626];
        this.anIntArray1628 = new int[this.anInt1626];
        this.anIntArray1629 = new int[this.anInt1626];
        this.anIntArray1631 = new int[this.anInt1630];
        this.anIntArray1632 = new int[this.anInt1630];
        this.anIntArray1633 = new int[this.anInt1630];
        this.anIntArray1634 = new int[this.anInt1630];
        this.anIntArray1635 = new int[this.anInt1630];
        this.anIntArray1636 = new int[this.anInt1630];
        this.anIntArray1643 = new int[this.anInt1642];
        this.anIntArray1644 = new int[this.anInt1642];
        this.anIntArray1645 = new int[this.anInt1642];
        if (flag1) {
            this.anIntArray1637 = new int[this.anInt1630];
        }
        if (flag2) {
            this.anIntArray1638 = new int[this.anInt1630];
        }
        if (flag3) {
            this.anIntArray1639 = new int[this.anInt1630];
        }
        if (flag4) {
            this.anIntArray1640 = new int[this.anInt1630];
        }
        this.anInt1626 = 0;
        this.anInt1630 = 0;
        this.anInt1642 = 0;
        int i1 = 0;
        int j1 = 0;
        do {
            if (j1 >= i) {
                this.method466();
                return;
            }
            Model model_1 = amodel[j1];
            if (model_1 != null) {
                int k1 = this.anInt1626;
                for (int l1 = 0; l1 < model_1.anInt1626; ++this.anInt1626, ++l1) {
                    int x = model_1.anIntArray1627[l1];
                    int y = model_1.anIntArray1628[l1];
                    int z = model_1.anIntArray1629[l1];
                    if (this.scaledVertices && !model_1.scaledVertices) {
                        x <<= 2;
                        y <<= 2;
                        z <<= 2;
                    }
                    this.anIntArray1627[this.anInt1626] = x;
                    this.anIntArray1628[this.anInt1626] = y;
                    this.anIntArray1629[this.anInt1626] = z;
                }
                for (int i2 = 0; i2 < model_1.anInt1630; ++this.anInt1630, ++i2) {
                    this.anIntArray1631[this.anInt1630] = model_1.anIntArray1631[i2] + k1;
                    this.anIntArray1632[this.anInt1630] = model_1.anIntArray1632[i2] + k1;
                    this.anIntArray1633[this.anInt1630] = model_1.anIntArray1633[i2] + k1;
                    this.anIntArray1634[this.anInt1630] = model_1.anIntArray1634[i2];
                    this.anIntArray1635[this.anInt1630] = model_1.anIntArray1635[i2];
                    this.anIntArray1636[this.anInt1630] = model_1.anIntArray1636[i2];
                    if (flag1) {
                        if (model_1.anIntArray1637 == null) {
                            this.anIntArray1637[this.anInt1630] = 0;
                        } else {
                            int j2 = model_1.anIntArray1637[i2];
                            if ((j2 & 2) == 2) {
                                j2 += i1 << 2;
                            }
                            this.anIntArray1637[this.anInt1630] = j2;
                        }
                    }
                    if (flag2) {
                        this.anIntArray1638[this.anInt1630] = model_1.anIntArray1638 == null ? model_1.anInt1641 : model_1.anIntArray1638[i2];
                    }
                    if (flag3) {
                        this.anIntArray1639[this.anInt1630] = model_1.anIntArray1639 == null ? 0 : model_1.anIntArray1639[i2];
                    }
                    if (!flag4 || model_1.anIntArray1640 == null) continue;
                    this.anIntArray1640[this.anInt1630] = model_1.anIntArray1640[i2];
                }
                for (int k2 = 0; k2 < model_1.anInt1642; ++this.anInt1642, ++k2) {
                    this.anIntArray1643[this.anInt1642] = model_1.anIntArray1643[k2] + k1;
                    this.anIntArray1644[this.anInt1642] = model_1.anIntArray1644[k2] + k1;
                    this.anIntArray1645[this.anInt1642] = model_1.anIntArray1645[k2] + k1;
                }
                i1 += model_1.anInt1642;
            }
            ++j1;
        } while (true);
    }

    public void filterTriangles() {
        int triangleId = 0;
        while (triangleId < this.anInt1630) {
            block7 : {
                int l = this.anIntArray1631[triangleId];
                int k1 = this.anIntArray1632[triangleId];
                int j2_ = this.anIntArray1633[triangleId];
                boolean b = true;
                for (int triId = 0; triId < this.anInt1630; ++triId) {
                    if (triId == triangleId) continue;
                    if (this.anIntArray1631[triId] == l) {
                        b = false;
                    } else if (this.anIntArray1632[triId] == k1) {
                        b = false;
                    } else {
                        if (this.anIntArray1633[triId] != j2_) continue;
                        b = false;
                    }
                    if (!b) break block7;
                }
                if (this.anIntArray1637 != null) {
                    this.anIntArray1639[triangleId] = 255;
                }
            }
            ++triangleId;
        }
    }

    public void interpolateFrames(int frame, int nextFrame, int cycle, int length) {
        if (!Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) {
            this.method470(frame);
            return;
        }
        if (this.anIntArrayArray1657 == null) {
            return;
        }
        if (frame == -1) {
            return;
        }
        FrameReader currAnim = FrameReader.forId(frame);
        if (currAnim == null) {
            return;
        }
        SkinList skinList = currAnim.aClass18_637;
        FrameReader nextAnim = null;
        if (nextFrame != -1) {
            nextAnim = FrameReader.forId(nextFrame);
            if (nextAnim.aClass18_637 != skinList) {
                nextAnim = null;
            }
        }
        anInt1681 = 0;
        anInt1682 = 0;
        anInt1683 = 0;
        if (nextAnim == null) {
            int index = 0;
            while (index < currAnim.anInt638) {
                int anim = currAnim.anIntArray639[index];
                this.method472(skinList.anIntArray342[anim], skinList.anIntArrayArray343[anim], currAnim.anIntArray640[index], currAnim.anIntArray641[index], currAnim.anIntArray642[index]);
                ++index;
            }
            return;
        }
        int currFrameId = 0;
        int nextFrameId = 0;
        int index = 0;
        while (index < skinList.length) {
            boolean interpolate = false;
            if (currFrameId < currAnim.anInt638 && currAnim.anIntArray639[currFrameId] == index) {
                interpolate = true;
            }
            boolean interpolate2 = false;
            if (nextFrameId < nextAnim.anInt638 && nextAnim.anIntArray639[nextFrameId] == index) {
                interpolate2 = true;
            }
            if (interpolate || interpolate2) {
                int interpolatedZ;
                int interpolatedY;
                int interpolatedX;
                int nextAnimZ;
                int nextAnimY;
                int nextAnimX;
                int currAnimZ;
                int currAnimY;
                int currAnimX;
                int defaultModifier = 0;
                int opcode = skinList.anIntArray342[index];
                if (opcode == 3) {
                    defaultModifier = 128;
                }
                if (interpolate) {
                    currAnimX = currAnim.anIntArray640[currFrameId];
                    currAnimY = currAnim.anIntArray641[currFrameId];
                    currAnimZ = currAnim.anIntArray642[currFrameId];
                    ++currFrameId;
                } else {
                    currAnimX = defaultModifier;
                    currAnimY = defaultModifier;
                    currAnimZ = defaultModifier;
                }
                if (interpolate2) {
                    nextAnimX = nextAnim.anIntArray640[nextFrameId];
                    nextAnimY = nextAnim.anIntArray641[nextFrameId];
                    nextAnimZ = nextAnim.anIntArray642[nextFrameId];
                    ++nextFrameId;
                } else {
                    nextAnimX = defaultModifier;
                    nextAnimY = defaultModifier;
                    nextAnimZ = defaultModifier;
                }
                if (opcode == 2) {
                    int deltaX = nextAnimX - currAnimX & 2047;
                    int deltaY = nextAnimY - currAnimY & 2047;
                    int deltaZ = nextAnimZ - currAnimZ & 2047;
                    if (deltaX >= 1024) {
                        deltaX -= 2048;
                    }
                    if (deltaY >= 1024) {
                        deltaY -= 2048;
                    }
                    if (deltaZ >= 1024) {
                        deltaZ -= 2048;
                    }
                    interpolatedX = currAnimX + deltaX * cycle / length & 2047;
                    interpolatedY = currAnimY + deltaY * cycle / length & 2047;
                    interpolatedZ = currAnimZ + deltaZ * cycle / length & 2047;
                } else {
                    interpolatedX = currAnimX + (nextAnimX - currAnimX) * cycle / length;
                    interpolatedY = currAnimY + (nextAnimY - currAnimY) * cycle / length;
                    interpolatedZ = currAnimZ + (nextAnimZ - currAnimZ) * cycle / length;
                }
                this.method472(opcode, skinList.anIntArrayArray343[index], interpolatedX, interpolatedY, interpolatedZ);
            }
            ++index;
        }
    }

    public void method1337(int j) {
        int k = 0;
        while (k < this.anInt1630) {
            this.anIntArray1640[k] = j;
            ++k;
        }
    }

    public void method1338(int j) {
        j += 100;
        int kcolor = 0;
        int k = 0;
        while (k < this.anInt1630) {
            kcolor = this.anIntArray1640[k];
            if (k + j >= 0) {
                this.anIntArray1640[k] = kcolor + j;
            }
            ++k;
        }
    }

    public void method1339(int j) {
        ++j;
        int k = 0;
        while (k < this.anInt1630) {
            if (k + j >= 0) {
                this.anIntArray1640[k] = k + j;
            }
            ++k;
        }
    }

    @Override
    public final void method443(int i, int j, int k, int l, int i1, int j1, int k1, int l1, int i2, int bufferOffset) {
        this.renderAtPointX = j1 + Client.instance.xCameraPos;
        this.renderAtPointY = l1 + Client.instance.yCameraPos;
        this.renderAtPointZ = k1 + Client.instance.zCameraPos;
        this.lastRenderedRotation = i;
        int j2 = l1 * i1 - j1 * l >> 16;
        int k2 = k1 * j + j2 * k >> 16;
        int l2 = this.anInt1650 * k >> 16;
        int i3 = k2 + l2;
        if (i3 <= 50) return;
        if (k2 >= (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.INCREASE_RENDER_DISTANCE) ? 8000 : 3500)) {
            return;
        }
        int j3 = l1 * l + j1 * i1 >> 16;
        int k3 = j3 - this.anInt1650 << Client.log_view_dist;
        if (k3 / i3 >= DrawingArea.centerY) {
            return;
        }
        int l3 = j3 + this.anInt1650 << Client.log_view_dist;
        if (l3 / i3 <= - DrawingArea.centerY) {
            return;
        }
        int i4 = k1 * k - j2 * j >> 16;
        int j4 = this.anInt1650 * j >> 16;
        int k4 = i4 + j4 << Client.log_view_dist;
        if (k4 / i3 <= - DrawingArea.anInt1387) {
            return;
        }
        int l4 = j4 + (this.modelHeight * k >> 16);
        int i5 = i4 - l4 << Client.log_view_dist;
        if (i5 / i3 >= DrawingArea.anInt1387) {
            return;
        }
        int j5 = l2 + (this.modelHeight * j >> 16);
        boolean flag = false;
        if (k2 - j5 <= 50) {
            flag = true;
        }
        boolean flag1 = false;
        if (i2 > 0 && aBoolean1684) {
            int k5 = k2 - l2;
            if (k5 <= 50) {
                k5 = 50;
            }
            if (j3 > 0) {
                k3 /= i3;
                l3 /= k5;
            } else {
                l3 /= i3;
                k3 /= k5;
            }
            if (i4 > 0) {
                i5 /= i3;
                k4 /= k5;
            } else {
                k4 /= i3;
                i5 /= k5;
            }
            int i6 = anInt1685 - Rasterizer.textureInt1;
            int k6 = anInt1686 - Rasterizer.textureInt2;
            if (i6 > k3 && i6 < l3 && k6 > i5 && k6 < k4) {
                if (this.aBoolean1659) {
                    Model.anIntArray1688[Model.anInt1687++] = i2;
                } else {
                    flag1 = true;
                }
            }
        }
        int l5 = Rasterizer.textureInt1;
        int j6 = Rasterizer.textureInt2;
        int l6 = 0;
        int i7 = 0;
        if (i != 0) {
            l6 = modelIntArray1[i];
            i7 = modelIntArray2[i];
        }
        for (int j7 = 0; j7 < this.anInt1626; ++j7) {
            int k7 = this.anIntArray1627[j7] << (this.scaledVertices ? 0 : 2);
            int l7 = this.anIntArray1628[j7] << (this.scaledVertices ? 0 : 2);
            int i8 = this.anIntArray1629[j7] << (this.scaledVertices ? 0 : 2);
            if (i != 0) {
                int j8 = i8 * l6 + k7 * i7 >> 16;
                i8 = i8 * i7 - k7 * l6 >> 16;
                k7 = j8;
            }
            int k8 = (i8 += l1 << 2) * l + (k7 += j1 << 2) * i1 >> 16;
            i8 = i8 * i1 - k7 * l >> 16;
            k7 = k8;
            k8 = (l7 += k1 << 2) * k - i8 * j >> 16;
            i8 = l7 * j + i8 * k >> 16;
            l7 = k8;
            Model.anIntArray1667[j7] = (i8 >> 2) - k2;
            Model.vertexPerspectiveDepth[j7] = i8 >> 2;
            if (i8 >= 50) {
                Model.anIntArray1665[j7] = l5 + (k7 << Client.log_view_dist) / i8;
                Model.anIntArray1666[j7] = j6 + (l7 << Client.log_view_dist) / i8;
            } else {
                Model.anIntArray1665[j7] = -5000;
                flag = true;
            }
            if (!flag && this.anInt1642 <= 0) continue;
            Model.anIntArray1668[j7] = k7 >> 2;
            Model.anIntArray1669[j7] = l7 >> 2;
            Model.anIntArray1670[j7] = i8 >> 2;
        }
        try {
            this.method483(flag, flag1, i2, bufferOffset);
            return;
        }
        catch (Exception _ex) {
            return;
        }
    }

    public void method464(Model model, boolean flag) {
        this.anInt1626 = model.anInt1626;
        this.anInt1630 = model.anInt1630;
        this.anInt1642 = model.anInt1642;
        if (anIntArray1622.length < this.anInt1626) {
            anIntArray1622 = new int[this.anInt1626 + 10000];
            anIntArray1623 = new int[this.anInt1626 + 10000];
            anIntArray1624 = new int[this.anInt1626 + 10000];
        }
        this.verticesParticle = new int[this.anInt1626];
        this.anIntArray1627 = anIntArray1622;
        this.anIntArray1628 = anIntArray1623;
        this.anIntArray1629 = anIntArray1624;
        for (int k = 0; k < this.anInt1626; ++k) {
            this.anIntArray1627[k] = model.anIntArray1627[k];
            this.anIntArray1628[k] = model.anIntArray1628[k];
            this.anIntArray1629[k] = model.anIntArray1629[k];
            this.verticesParticle[k] = model.verticesParticle[k];
        }
        if (flag) {
            this.anIntArray1639 = model.anIntArray1639;
        } else {
            if (anIntArray1625.length < this.anInt1630) {
                anIntArray1625 = new int[this.anInt1630 + 100];
            }
            this.anIntArray1639 = anIntArray1625;
            if (model.anIntArray1639 == null) {
                for (int l = 0; l < this.anInt1630; ++l) {
                    this.anIntArray1639[l] = 0;
                }
            } else {
                System.arraycopy((Object)model.anIntArray1639, (int)0, (Object)this.anIntArray1639, (int)0, (int)this.anInt1630);
            }
        }
        this.anIntArray1637 = model.anIntArray1637;
        this.anIntArray1640 = model.anIntArray1640;
        this.anIntArray1638 = model.anIntArray1638;
        this.anInt1641 = model.anInt1641;
        this.anIntArrayArray1658 = model.anIntArrayArray1658;
        this.anIntArrayArray1657 = model.anIntArrayArray1657;
        this.anIntArray1631 = model.anIntArray1631;
        this.anIntArray1632 = model.anIntArray1632;
        this.anIntArray1633 = model.anIntArray1633;
        this.anIntArray1634 = model.anIntArray1634;
        this.anIntArray1635 = model.anIntArray1635;
        this.anIntArray1636 = model.anIntArray1636;
        this.anIntArray1643 = model.anIntArray1643;
        this.anIntArray1644 = model.anIntArray1644;
        this.anIntArray1645 = model.anIntArray1645;
        this.scaledVertices = model.scaledVertices;
    }

    private final int method465(Model model, int i) {
        int j = -1;
        int p = model.verticesParticle[i];
        int x = model.anIntArray1627[i];
        int y = model.anIntArray1628[i];
        int z = model.anIntArray1629[i];
        if (this.scaledVertices && !model.scaledVertices) {
            x <<= 2;
            y <<= 2;
            z <<= 2;
        }
        for (int j1 = 0; j1 < this.anInt1626; ++j1) {
            if (x != this.anIntArray1627[j1] || y != this.anIntArray1628[j1] || z != this.anIntArray1629[j1]) continue;
            j = j1;
            break;
        }
        if (j != -1) return j;
        this.verticesParticle[this.anInt1626] = p;
        this.anIntArray1627[this.anInt1626] = x;
        this.anIntArray1628[this.anInt1626] = y;
        this.anIntArray1629[this.anInt1626] = z;
        if (model.anIntArray1655 == null) return this.anInt1626++;
        this.anIntArray1655[this.anInt1626] = model.anIntArray1655[i];
        return this.anInt1626++;
    }

    public void method466() {
        this.modelHeight = 0;
        this.anInt1650 = 0;
        this.anInt1651 = 0;
        int i = 0;
        do {
            int i1;
            if (i >= this.anInt1626) {
                this.anInt1650 = (int)(Math.sqrt((double)this.anInt1650) + 0.99);
                this.anInt1653 = (int)(Math.sqrt((double)(this.anInt1650 * this.anInt1650 + this.modelHeight * this.modelHeight)) + 0.99);
                this.anInt1652 = this.anInt1653 + (int)(Math.sqrt((double)(this.anInt1650 * this.anInt1650 + this.anInt1651 * this.anInt1651)) + 0.99);
                return;
            }
            int x = this.anIntArray1627[i];
            int y = this.anIntArray1628[i];
            int z = this.anIntArray1629[i];
            if (this.scaledVertices) {
                x >>= 2;
                y >>= 2;
                z >>= 2;
            }
            if (- y > this.modelHeight) {
                this.modelHeight = - y;
            }
            if (y > this.anInt1651) {
                this.anInt1651 = y;
            }
            if ((i1 = x * x + z * z) > this.anInt1650) {
                this.anInt1650 = i1;
            }
            ++i;
        } while (true);
    }

    public void method467() {
        this.modelHeight = 0;
        this.anInt1651 = 0;
        int i = 0;
        do {
            if (i >= this.anInt1626) {
                this.anInt1653 = (int)(Math.sqrt((double)(this.anInt1650 * this.anInt1650 + this.modelHeight * this.modelHeight)) + 0.99);
                this.anInt1652 = this.anInt1653 + (int)(Math.sqrt((double)(this.anInt1650 * this.anInt1650 + this.anInt1651 * this.anInt1651)) + 0.99);
                return;
            }
            int j = this.anIntArray1628[i];
            if (- j > this.modelHeight) {
                this.modelHeight = - j;
            }
            if (j > this.anInt1651) {
                this.anInt1651 = j;
            }
            ++i;
        } while (true);
    }

    public void method468(int i) {
        this.modelHeight = 0;
        this.anInt1650 = 0;
        this.anInt1651 = 0;
        this.anInt1646 = 999999;
        this.anInt1647 = -999999;
        this.anInt1648 = -99999;
        this.anInt1649 = 99999;
        for (int j = 0; j < this.anInt1626; ++j) {
            int j1;
            int x = this.anIntArray1627[j];
            int y = this.anIntArray1628[j];
            int z = this.anIntArray1629[j];
            if (this.scaledVertices) {
                x >>= 2;
                y >>= 2;
                z >>= 2;
            }
            if (x < this.anInt1646) {
                this.anInt1646 = x;
            }
            if (x > this.anInt1647) {
                this.anInt1647 = x;
            }
            if (z < this.anInt1649) {
                this.anInt1649 = z;
            }
            if (z > this.anInt1648) {
                this.anInt1648 = z;
            }
            if (- y > this.modelHeight) {
                this.modelHeight = - y;
            }
            if (y > this.anInt1651) {
                this.anInt1651 = y;
            }
            if ((j1 = x * x + z * z) <= this.anInt1650) continue;
            this.anInt1650 = j1;
        }
        this.anInt1650 = (int)Math.sqrt((double)this.anInt1650);
        this.anInt1653 = (int)Math.sqrt((double)(this.anInt1650 * this.anInt1650 + this.modelHeight * this.modelHeight));
        if (i != 21073) {
            return;
        }
        this.anInt1652 = this.anInt1653 + (int)Math.sqrt((double)(this.anInt1650 * this.anInt1650 + this.anInt1651 * this.anInt1651));
    }

    public void method469() {
        if (this.anIntArray1655 != null) {
            int[] ai = new int[256];
            int j = 0;
            for (int l = 0; l < this.anInt1626; ++l) {
                int j1 = this.anIntArray1655[l];
                int[] arrn = ai;
                int n = j1;
                arrn[n] = arrn[n] + 1;
                if (j1 <= j) continue;
                j = j1;
            }
            this.anIntArrayArray1657 = new int[j + 1][];
            for (int k1 = 0; k1 <= j; ++k1) {
                this.anIntArrayArray1657[k1] = new int[ai[k1]];
                ai[k1] = 0;
            }
            int j2 = 0;
            while (j2 < this.anInt1626) {
                int l2 = this.anIntArray1655[j2];
                int[] arrn = ai;
                int n = l2;
                int n2 = arrn[n];
                arrn[n] = n2 + 1;
                this.anIntArrayArray1657[l2][n2] = j2++;
            }
            this.anIntArray1655 = null;
        }
        if (this.anIntArray1656 == null) return;
        int[] ai1 = new int[256];
        int k = 0;
        for (int i1 = 0; i1 < this.anInt1630; ++i1) {
            int l1 = this.anIntArray1656[i1];
            int[] arrn = ai1;
            int n = l1;
            arrn[n] = arrn[n] + 1;
            if (l1 <= k) continue;
            k = l1;
        }
        this.anIntArrayArray1658 = new int[k + 1][];
        for (int i2 = 0; i2 <= k; ++i2) {
            this.anIntArrayArray1658[i2] = new int[ai1[i2]];
            ai1[i2] = 0;
        }
        int k2 = 0;
        do {
            if (k2 >= this.anInt1630) {
                this.anIntArray1656 = null;
                return;
            }
            int i3 = this.anIntArray1656[k2];
            int[] arrn = ai1;
            int n = i3;
            int n3 = arrn[n];
            arrn[n] = n3 + 1;
            this.anIntArrayArray1658[i3][n3] = k2++;
        } while (true);
    }

    public void method470(int i) {
        this.method470(i, RevisionType.DEFAULT);
    }

    public void method470(int i, RevisionType type) {
        if (this.anIntArrayArray1657 == null) {
            return;
        }
        if (i == -1) {
            return;
        }
        FrameReader class36 = FrameReader.forId(i, type);
        if (class36 == null) {
            return;
        }
        SkinList class18 = class36.aClass18_637;
        anInt1681 = 0;
        anInt1682 = 0;
        anInt1683 = 0;
        int k = 0;
        while (k < class36.anInt638) {
            int l = class36.anIntArray639[k];
            this.method472(class18.anIntArray342[l], class18.anIntArrayArray343[l], class36.anIntArray640[k], class36.anIntArray641[k], class36.anIntArray642[k]);
            ++k;
        }
    }

    public void method470(int frame, int nextFrame, int end, int cycle) {
        if (!Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) {
            this.method470(frame);
            return;
        }
        if (this.anIntArrayArray1657 == null) return;
        if (frame == -1) return;
        FrameReader currentAnimation = FrameReader.forId(frame);
        SkinList list1 = currentAnimation.aClass18_637;
        anInt1681 = 0;
        anInt1682 = 0;
        anInt1683 = 0;
        FrameReader nextAnimation = null;
        SkinList list2 = null;
        if (nextFrame != -1) {
            nextAnimation = FrameReader.forId(nextFrame);
            if (nextAnimation.aClass18_637 != list1) {
                nextAnimation = null;
            }
            list2 = nextAnimation.aClass18_637;
        }
        if (nextAnimation == null || list2 == null) {
            int i_263_ = 0;
            while (i_263_ < currentAnimation.anInt638) {
                int i_264_ = currentAnimation.anIntArray639[i_263_];
                this.method472(list1.anIntArray342[i_264_], list1.anIntArrayArray343[i_264_], currentAnimation.anIntArray640[i_263_], currentAnimation.anIntArray641[i_263_], currentAnimation.anIntArray642[i_263_]);
                ++i_263_;
            }
            return;
        }
        int i1 = 0;
        while (i1 < currentAnimation.anInt638) {
            int x;
            int[] skin;
            int z;
            int y;
            int opcode;
            block20 : {
                int n1 = currentAnimation.anIntArray639[i1];
                opcode = list1.anIntArray342[n1];
                skin = list1.anIntArrayArray343[n1];
                x = currentAnimation.anIntArray640[i1];
                y = currentAnimation.anIntArray641[i1];
                z = currentAnimation.anIntArray642[i1];
                boolean found = false;
                for (int i2 = 0; i2 < nextAnimation.anInt638; ++i2) {
                    int n2 = nextAnimation.anIntArray639[i2];
                    if (!list2.anIntArrayArray343[n2].equals((Object)skin)) continue;
                    if (opcode != 2) {
                        x += (nextAnimation.anIntArray640[i2] - x) * cycle / end;
                        y += (nextAnimation.anIntArray641[i2] - y) * cycle / end;
                        z += (nextAnimation.anIntArray642[i2] - z) * cycle / end;
                    } else {
                        int dx = nextAnimation.anIntArray640[i2] - (x &= 255) & 255;
                        int dy = nextAnimation.anIntArray641[i2] - (y &= 255) & 255;
                        int dz = nextAnimation.anIntArray642[i2] - (z &= 255) & 255;
                        if (dx >= 128) {
                            dx -= 256;
                        }
                        if (dy >= 128) {
                            dy -= 256;
                        }
                        if (dz >= 128) {
                            dz -= 256;
                        }
                        x = x + dx * cycle / end & 255;
                        y = y + dy * cycle / end & 255;
                        z = z + dz * cycle / end & 255;
                    }
                    found = true;
                    if (!found) {
                        break;
                    }
                    break block20;
                }
                if (opcode != 3 && opcode != 2) {
                    x = x * (end - cycle) / end;
                    y = y * (end - cycle) / end;
                    z = z * (end - cycle) / end;
                } else if (opcode == 3) {
                    x = (x * (end - cycle) + (cycle << 7)) / end;
                    y = (y * (end - cycle) + (cycle << 7)) / end;
                    z = (z * (end - cycle) + (cycle << 7)) / end;
                } else {
                    int dx = - (x &= 255) & 255;
                    int dy = - (y &= 255) & 255;
                    int dz = - (z &= 255) & 255;
                    if (dx >= 128) {
                        dx -= 256;
                    }
                    if (dy >= 128) {
                        dy -= 256;
                    }
                    if (dz >= 128) {
                        dz -= 256;
                    }
                    x = x + dx * cycle / end & 255;
                    y = y + dy * cycle / end & 255;
                    z = z + dz * cycle / end & 255;
                }
            }
            this.method472(opcode, skin, x, y, z);
            ++i1;
        }
    }

    public void method471(int[] ai, int j, int k, RevisionType type) {
        if (k == -1) {
            return;
        }
        if (ai == null || j == -1) {
            this.method470(k, type);
            return;
        }
        FrameReader class36 = FrameReader.forId(k, type);
        if (class36 == null) {
            return;
        }
        FrameReader class36_1 = FrameReader.forId(j, type);
        if (class36_1 == null) {
            this.method470(k, type);
            return;
        }
        SkinList class18 = class36.aClass18_637;
        anInt1681 = 0;
        anInt1682 = 0;
        anInt1683 = 0;
        int l = 0;
        int i1 = ai[l++];
        for (int j1 = 0; j1 < class36.anInt638; ++j1) {
            int k1 = class36.anIntArray639[j1];
            while (k1 > i1) {
                i1 = ai[l++];
            }
            if (k1 == i1 && class18.anIntArray342[k1] != 0) continue;
            this.method472(class18.anIntArray342[k1], class18.anIntArrayArray343[k1], class36.anIntArray640[j1], class36.anIntArray641[j1], class36.anIntArray642[j1]);
        }
        anInt1681 = 0;
        anInt1682 = 0;
        anInt1683 = 0;
        l = 0;
        i1 = ai[l++];
        int l1 = 0;
        while (l1 < class36_1.anInt638) {
            int i2 = class36_1.anIntArray639[l1];
            while (i2 > i1) {
                i1 = ai[l++];
            }
            if (i2 == i1 || class18.anIntArray342[i2] == 0) {
                this.method472(class18.anIntArray342[i2], class18.anIntArrayArray343[i2], class36_1.anIntArray640[l1], class36_1.anIntArray641[l1], class36_1.anIntArray642[l1]);
            }
            ++l1;
        }
    }

    private void method472(int i, int[] ai, int j, int k, int l) {
        int i1;
        block23 : {
            block22 : {
                block21 : {
                    block20 : {
                        block19 : {
                            i1 = ai.length;
                            if (i == 0) break block19;
                            if (i == 1) break block20;
                            if (i == 2) break block21;
                            if (i == 3) break block22;
                            break block23;
                        }
                        int j1 = 0;
                        anInt1681 = 0;
                        anInt1682 = 0;
                        anInt1683 = 0;
                        int k2 = 0;
                        do {
                            block25 : {
                                int j6;
                                int[] ai5;
                                block26 : {
                                    block24 : {
                                        if (k2 >= i1) break block24;
                                        int l3 = ai[k2];
                                        if (l3 >= this.anIntArrayArray1657.length) break block25;
                                        ai5 = this.anIntArrayArray1657[l3];
                                        break block26;
                                    }
                                    if (j1 > 0) {
                                        anInt1681 = anInt1681 / j1 + j;
                                        anInt1682 = anInt1682 / j1 + k;
                                        anInt1683 = anInt1683 / j1 + l;
                                        return;
                                    }
                                    anInt1681 = j;
                                    anInt1682 = k;
                                    anInt1683 = l;
                                    return;
                                }
                                for (int i5 = 0; i5 < ai5.length; Model.anInt1681 += this.anIntArray1627[j6] >> (this.scaledVertices != false ? 2 : 0), Model.anInt1682 += this.anIntArray1628[j6] >> (this.scaledVertices != false ? 2 : 0), Model.anInt1683 += this.anIntArray1629[j6] >> (this.scaledVertices != false ? 2 : 0), ++j1, ++i5) {
                                    j6 = ai5[i5];
                                }
                            }
                            ++k2;
                        } while (true);
                    }
                    int k1 = 0;
                    while (k1 < i1) {
                        int l2 = ai[k1];
                        if (l2 < this.anIntArrayArray1657.length) {
                            int[] ai1 = this.anIntArrayArray1657[l2];
                            for (int i4 = 0; i4 < ai1.length; ++i4) {
                                int j5 = ai1[i4];
                                int[] arrn = this.anIntArray1627;
                                int n = j5;
                                arrn[n] = arrn[n] + (j << (this.scaledVertices ? 2 : 0));
                                int[] arrn2 = this.anIntArray1628;
                                int n2 = j5;
                                arrn2[n2] = arrn2[n2] + (k << (this.scaledVertices ? 2 : 0));
                                int[] arrn3 = this.anIntArray1629;
                                int n3 = j5;
                                arrn3[n3] = arrn3[n3] + (l << (this.scaledVertices ? 2 : 0));
                            }
                        }
                        ++k1;
                    }
                    return;
                }
                int l1 = 0;
                while (l1 < i1) {
                    int i3 = ai[l1];
                    if (i3 < this.anIntArrayArray1657.length) {
                        int[] ai2 = this.anIntArrayArray1657[i3];
                        for (int j4 = 0; j4 < ai2.length; ++j4) {
                            int k5 = ai2[j4];
                            int[] arrn = this.anIntArray1627;
                            int n = k5;
                            arrn[n] = arrn[n] - (anInt1681 << (this.scaledVertices ? 2 : 0));
                            int[] arrn4 = this.anIntArray1628;
                            int n4 = k5;
                            arrn4[n4] = arrn4[n4] - (anInt1682 << (this.scaledVertices ? 2 : 0));
                            int[] arrn5 = this.anIntArray1629;
                            int n5 = k5;
                            arrn5[n5] = arrn5[n5] - (anInt1683 << (this.scaledVertices ? 2 : 0));
                            if (l != 0) {
                                int j7 = modelIntArray1[l];
                                int i8 = modelIntArray2[l];
                                int l8 = this.anIntArray1628[k5] * j7 + this.anIntArray1627[k5] * i8 >> 16;
                                this.anIntArray1628[k5] = this.anIntArray1628[k5] * i8 - this.anIntArray1627[k5] * j7 >> 16;
                                this.anIntArray1627[k5] = l8;
                            }
                            if (j != 0) {
                                int k7 = modelIntArray1[j];
                                int j8 = modelIntArray2[j];
                                int i9 = this.anIntArray1628[k5] * j8 - this.anIntArray1629[k5] * k7 >> 16;
                                this.anIntArray1629[k5] = this.anIntArray1628[k5] * k7 + this.anIntArray1629[k5] * j8 >> 16;
                                this.anIntArray1628[k5] = i9;
                            }
                            if (k != 0) {
                                int l7 = modelIntArray1[k];
                                int k8 = modelIntArray2[k];
                                int j9 = this.anIntArray1629[k5] * l7 + this.anIntArray1627[k5] * k8 >> 16;
                                this.anIntArray1629[k5] = this.anIntArray1629[k5] * k8 - this.anIntArray1627[k5] * l7 >> 16;
                                this.anIntArray1627[k5] = j9;
                            }
                            int[] arrn6 = this.anIntArray1627;
                            int n6 = k5;
                            arrn6[n6] = arrn6[n6] + (anInt1681 << (this.scaledVertices ? 2 : 0));
                            int[] arrn7 = this.anIntArray1628;
                            int n7 = k5;
                            arrn7[n7] = arrn7[n7] + (anInt1682 << (this.scaledVertices ? 2 : 0));
                            int[] arrn8 = this.anIntArray1629;
                            int n8 = k5;
                            arrn8[n8] = arrn8[n8] + (anInt1683 << (this.scaledVertices ? 2 : 0));
                        }
                    }
                    ++l1;
                }
                return;
            }
            int i2 = 0;
            while (i2 < i1) {
                int j3 = ai[i2];
                if (j3 < this.anIntArrayArray1657.length) {
                    int[] ai3 = this.anIntArrayArray1657[j3];
                    for (int k4 = 0; k4 < ai3.length; ++k4) {
                        int l5 = ai3[k4];
                        int[] arrn = this.anIntArray1627;
                        int n = l5;
                        arrn[n] = arrn[n] - (anInt1681 << (this.scaledVertices ? 2 : 0));
                        int[] arrn9 = this.anIntArray1628;
                        int n9 = l5;
                        arrn9[n9] = arrn9[n9] - (anInt1682 << (this.scaledVertices ? 2 : 0));
                        int[] arrn10 = this.anIntArray1629;
                        int n10 = l5;
                        arrn10[n10] = arrn10[n10] - (anInt1683 << (this.scaledVertices ? 2 : 0));
                        this.anIntArray1627[l5] = this.anIntArray1627[l5] * j / 128;
                        this.anIntArray1628[l5] = this.anIntArray1628[l5] * k / 128;
                        this.anIntArray1629[l5] = this.anIntArray1629[l5] * l / 128;
                        int[] arrn11 = this.anIntArray1627;
                        int n11 = l5;
                        arrn11[n11] = arrn11[n11] + (anInt1681 << (this.scaledVertices ? 2 : 0));
                        int[] arrn12 = this.anIntArray1628;
                        int n12 = l5;
                        arrn12[n12] = arrn12[n12] + (anInt1682 << (this.scaledVertices ? 2 : 0));
                        int[] arrn13 = this.anIntArray1629;
                        int n13 = l5;
                        arrn13[n13] = arrn13[n13] + (anInt1683 << (this.scaledVertices ? 2 : 0));
                    }
                }
                ++i2;
            }
            return;
        }
        if (i != 5) return;
        if (this.anIntArrayArray1658 == null) return;
        if (this.anIntArray1639 == null) return;
        int j2 = 0;
        while (j2 < i1) {
            int k3 = ai[j2];
            if (k3 < this.anIntArrayArray1658.length) {
                int[] ai4 = this.anIntArrayArray1658[k3];
                for (int l4 = 0; l4 < ai4.length; ++l4) {
                    int i6 = ai4[l4];
                    int[] arrn = this.anIntArray1639;
                    int n = i6;
                    arrn[n] = arrn[n] + j * 8;
                    if (this.anIntArray1639[i6] < 0) {
                        this.anIntArray1639[i6] = 0;
                    }
                    if (this.anIntArray1639[i6] <= 255) continue;
                    this.anIntArray1639[i6] = 255;
                }
            }
            ++j2;
        }
    }

    public void method473() {
        int j = 0;
        while (j < this.anInt1626) {
            int k = this.anIntArray1627[j];
            this.anIntArray1627[j] = this.anIntArray1629[j];
            this.anIntArray1629[j] = - k;
            ++j;
        }
    }

    public void method474(int i) {
        int k = modelIntArray1[i];
        int l = modelIntArray2[i];
        int i1 = 0;
        while (i1 < this.anInt1626) {
            int j1 = this.anIntArray1628[i1] * l - this.anIntArray1629[i1] * k >> 16;
            this.anIntArray1629[i1] = this.anIntArray1628[i1] * k + this.anIntArray1629[i1] * l >> 16;
            this.anIntArray1628[i1] = j1;
            ++i1;
        }
    }

    public void method475(int x, int y, int z) {
        if (this.scaledVertices) {
            x <<= 2;
            y <<= 2;
            z <<= 2;
        }
        int i1 = 0;
        while (i1 < this.anInt1626) {
            int[] arrn = this.anIntArray1627;
            int n = i1;
            arrn[n] = arrn[n] + x;
            int[] arrn2 = this.anIntArray1628;
            int n2 = i1;
            arrn2[n2] = arrn2[n2] + y;
            int[] arrn3 = this.anIntArray1629;
            int n3 = i1++;
            arrn3[n3] = arrn3[n3] + z;
        }
    }

    public void reColor(int i, int j) {
        int k = 0;
        while (k < this.anInt1630) {
            if (this.anIntArray1640[k] == i) {
                this.anIntArray1640[k] = j;
            }
            ++k;
        }
    }

    public void method477() {
        for (int j = 0; j < this.anInt1626; ++j) {
            this.anIntArray1629[j] = - this.anIntArray1629[j];
        }
        int k = 0;
        while (k < this.anInt1630) {
            int l = this.anIntArray1631[k];
            this.anIntArray1631[k] = this.anIntArray1633[k];
            this.anIntArray1633[k] = l;
            ++k;
        }
    }

    public void method478(int i, int j, int l) {
        int i1 = 0;
        while (i1 < this.anInt1626) {
            this.anIntArray1627[i1] = this.anIntArray1627[i1] * i / 128;
            this.anIntArray1628[i1] = this.anIntArray1628[i1] * l / 128;
            this.anIntArray1629[i1] = this.anIntArray1629[i1] * j / 128;
            ++i1;
        }
    }

    public void light(int i, int j, int k, int l, int i1, boolean flag) {
        this.light(i, j, k, l, i1, flag, false);
    }

    public final void light(int i, int j, int k, int l, int i1, boolean flag, boolean player) {
        int j1 = (int)Math.sqrt((double)(k * k + l * l + i1 * i1));
        int k1 = j * j1 >> 8;
        if (this.anIntArray1634 == null) {
            this.anIntArray1634 = new int[this.anInt1630];
            this.anIntArray1635 = new int[this.anInt1630];
            this.anIntArray1636 = new int[this.anInt1630];
        }
        if (this.vertexNormals == null) {
            this.vertexNormals = new VertexNormal[this.anInt1626];
            for (int l1 = 0; l1 < this.anInt1626; ++l1) {
                this.vertexNormals[l1] = new VertexNormal();
            }
        }
        for (int face = 0; face < this.anInt1630; ++face) {
            int j5;
            if (this.anIntArray1640 != null && this.anIntArray1639 != null && (this.anIntArray1640[face] == 65535 || this.anIntArray1640[face] == 4)) {
                this.anIntArray1639[face] = 255;
            }
            int j2 = this.anIntArray1631[face];
            int l2 = this.anIntArray1632[face];
            int i3 = this.anIntArray1633[face];
            int j3 = this.anIntArray1627[l2] - this.anIntArray1627[j2] >> (this.scaledVertices ? 2 : 0);
            int k3 = this.anIntArray1628[l2] - this.anIntArray1628[j2] >> (this.scaledVertices ? 2 : 0);
            int l3 = this.anIntArray1629[l2] - this.anIntArray1629[j2] >> (this.scaledVertices ? 2 : 0);
            int i4 = this.anIntArray1627[i3] - this.anIntArray1627[j2] >> (this.scaledVertices ? 2 : 0);
            int j4 = this.anIntArray1628[i3] - this.anIntArray1628[j2] >> (this.scaledVertices ? 2 : 0);
            int k4 = this.anIntArray1629[i3] - this.anIntArray1629[j2] >> (this.scaledVertices ? 2 : 0);
            int l4 = k3 * k4 - j4 * l3;
            int i5 = l3 * i4 - k4 * j3;
            for (j5 = j3 * j4 - i4 * k3; l4 > 8192 || i5 > 8192 || j5 > 8192 || l4 < -8192 || i5 < -8192 || j5 < -8192; l4 >>= 1, i5 >>= 1, j5 >>= 1) {
            }
            int k5 = (int)Math.sqrt((double)(l4 * l4 + i5 * i5 + j5 * j5));
            if (k5 <= 0) {
                k5 = 1;
            }
            l4 = l4 * 256 / k5;
            i5 = i5 * 256 / k5;
            j5 = j5 * 256 / k5;
            if (this.anIntArray1637 == null || (this.anIntArray1637[face] & 1) == 0) {
                VertexNormal class33_2 = this.vertexNormals[j2];
                class33_2.x += l4;
                class33_2.y += i5;
                class33_2.z += j5;
                ++class33_2.divisor;
                class33_2 = this.vertexNormals[l2];
                class33_2.x += l4;
                class33_2.y += i5;
                class33_2.z += j5;
                ++class33_2.divisor;
                class33_2 = this.vertexNormals[i3];
                class33_2.x += l4;
                class33_2.y += i5;
                class33_2.z += j5;
                ++class33_2.divisor;
                continue;
            }
            int l5 = i + (k * l4 + l * i5 + i1 * j5) / (k1 + k1 / 2);
            this.anIntArray1634[face] = Model.method481(this.anIntArray1640[face], l5, this.anIntArray1637[face]);
        }
        if (flag) {
            this.method480(i, k1, k, l, i1);
            this.method466();
        } else {
            this.aClass33Array1660 = new VertexNormal[this.anInt1626];
            for (int k2 = 0; k2 < this.anInt1626; ++k2) {
                VertexNormal class33 = this.vertexNormals[k2];
                VertexNormal class33_1 = this.aClass33Array1660[k2] = new VertexNormal();
                class33_1.x = class33.x;
                class33_1.y = class33.y;
                class33_1.z = class33.z;
                class33_1.divisor = class33.divisor;
            }
        }
        this.method468(21073);
    }

    public final void method480(int i, int j, int k, int l, int i1) {
        for (int j1 = 0; j1 < this.anInt1630; ++j1) {
            int k1 = this.anIntArray1631[j1];
            int i2 = this.anIntArray1632[j1];
            int j2 = this.anIntArray1633[j1];
            if (this.anIntArray1637 == null) {
                int i3 = this.anIntArray1640[j1];
                VertexNormal class33 = this.vertexNormals[k1];
                int k2 = i + (k * class33.x + l * class33.y + i1 * class33.z) / (j * class33.divisor);
                this.anIntArray1634[j1] = Model.method481(i3, k2, 0);
                class33 = this.vertexNormals[i2];
                k2 = i + (k * class33.x + l * class33.y + i1 * class33.z) / (j * class33.divisor);
                this.anIntArray1635[j1] = Model.method481(i3, k2, 0);
                class33 = this.vertexNormals[j2];
                k2 = i + (k * class33.x + l * class33.y + i1 * class33.z) / (j * class33.divisor);
                this.anIntArray1636[j1] = Model.method481(i3, k2, 0);
                continue;
            }
            if ((this.anIntArray1637[j1] & 1) != 0) continue;
            int j3 = this.anIntArray1640[j1];
            int k3 = this.anIntArray1637[j1];
            VertexNormal class33_1 = this.vertexNormals[k1];
            int l2 = i + (k * class33_1.x + l * class33_1.y + i1 * class33_1.z) / (j * class33_1.divisor);
            this.anIntArray1634[j1] = Model.method481(j3, l2, k3);
            class33_1 = this.vertexNormals[i2];
            l2 = i + (k * class33_1.x + l * class33_1.y + i1 * class33_1.z) / (j * class33_1.divisor);
            this.anIntArray1635[j1] = Model.method481(j3, l2, k3);
            class33_1 = this.vertexNormals[j2];
            l2 = i + (k * class33_1.x + l * class33_1.y + i1 * class33_1.z) / (j * class33_1.divisor);
            this.anIntArray1636[j1] = Model.method481(j3, l2, k3);
        }
        this.vertexNormals = null;
        this.aClass33Array1660 = null;
        this.anIntArray1655 = null;
        this.anIntArray1656 = null;
        if (this.anIntArray1637 != null) {
            for (int l1 = 0; l1 < this.anInt1630; ++l1) {
                if ((this.anIntArray1637[l1] & 2) != 2) continue;
                return;
            }
        }
        this.anIntArray1640 = null;
    }

    public final void method482(int j, int k, int l, int i1, int j1, int k1) {
        int i = 0;
        int l1 = Rasterizer.textureInt1;
        int i2 = Rasterizer.textureInt2;
        int j2 = modelIntArray1[i];
        int k2 = modelIntArray2[i];
        int l2 = modelIntArray1[j];
        int i3 = modelIntArray2[j];
        int j3 = modelIntArray1[k];
        int k3 = modelIntArray2[k];
        int l3 = modelIntArray1[l];
        int i4 = modelIntArray2[l];
        int j4 = j1 * l3 + k1 * i4 >> 16;
        for (int k4 = 0; k4 < this.anInt1626; ++k4) {
            int l4 = this.anIntArray1627[k4] << (this.scaledVertices ? 0 : 2);
            int i5 = this.anIntArray1628[k4] << (this.scaledVertices ? 0 : 2);
            int j5 = this.anIntArray1629[k4] << (this.scaledVertices ? 0 : 2);
            if (k != 0) {
                int k5 = i5 * j3 + l4 * k3 >> 16;
                i5 = i5 * k3 - l4 * j3 >> 16;
                l4 = k5;
            }
            if (i != 0) {
                int l5 = i5 * k2 - j5 * j2 >> 16;
                j5 = i5 * j2 + j5 * k2 >> 16;
                i5 = l5;
            }
            if (j != 0) {
                int i6 = j5 * l2 + l4 * i3 >> 16;
                j5 = j5 * i3 - l4 * l2 >> 16;
                l4 = i6;
            }
            int j6 = (i5 += j1 << 2) * i4 - (j5 += k1 << 2) * l3 >> 16;
            j5 = i5 * l3 + j5 * i4 >> 16;
            i5 = j6;
            Model.anIntArray1667[k4] = (j5 >> 2) - j4;
            Model.vertexPerspectiveDepth[k4] = j5 >> 2;
            Model.anIntArray1665[k4] = l1 + ((l4 += i1 << 2) << 9) / j5;
            Model.anIntArray1666[k4] = i2 + (i5 << 9) / j5;
            if (this.anInt1642 <= 0) continue;
            Model.anIntArray1668[k4] = l4 >> 2;
            Model.anIntArray1669[k4] = i5 >> 2;
            Model.anIntArray1670[k4] = j5 >> 2;
        }
        try {
            this.method483(false, false, 0, 0);
            return;
        }
        catch (Exception _ex) {
            return;
        }
    }

    private final void method483(boolean flag, boolean flag1, int i, int bufferOffset) {
        int j4;
        int k6;
        int i6;
        int k3;
        int i5;
        int l2;
        int[] ai3;
        int[] ai2;
        for (int j = 0; j < this.anInt1652; ++j) {
            Model.anIntArray1671[j] = 0;
        }
        for (int k = 0; k < this.anInt1630; ++k) {
            if (this.anIntArray1637 != null && this.anIntArray1637[k] == -1) continue;
            int l = this.anIntArray1631[k];
            int k1 = this.anIntArray1632[k];
            int j2 = this.anIntArray1633[k];
            int i3 = anIntArray1665[l];
            int l3 = anIntArray1665[k1];
            int k4 = anIntArray1665[j2];
            if (flag && (i3 == -5000 || l3 == -5000 || k4 == -5000)) {
                Model.aBooleanArray1664[k] = true;
                int j5 = (anIntArray1667[l] + anIntArray1667[k1] + anIntArray1667[j2]) / 3 + this.anInt1653;
                int[] arrn = anIntArray1671;
                int n = j5;
                int n2 = arrn[n];
                arrn[n] = n2 + 1;
                Model.anIntArrayArray1672[j5][n2] = k;
                continue;
            }
            if (flag1 && this.method486(anInt1685, anInt1686, anIntArray1666[l], anIntArray1666[k1], anIntArray1666[j2], i3, l3, k4)) {
                Model.anIntArray1688[Model.anInt1687++] = i;
                flag1 = false;
            }
            if ((i3 - l3) * (anIntArray1666[j2] - anIntArray1666[k1]) - (anIntArray1666[l] - anIntArray1666[k1]) * (k4 - l3) <= 0) continue;
            Model.aBooleanArray1664[k] = false;
            Model.aBooleanArray1663[k] = i3 < 0 || l3 < 0 || k4 < 0 || i3 > DrawingArea.centerX || l3 > DrawingArea.centerX || k4 > DrawingArea.centerX;
            int k5 = (anIntArray1667[l] + anIntArray1667[k1] + anIntArray1667[j2]) / 3 + this.anInt1653;
            int[] arrn = anIntArray1671;
            int n = k5;
            int n3 = arrn[n];
            arrn[n] = n3 + 1;
            Model.anIntArrayArray1672[k5][n3] = k;
        }
        if (this.anIntArray1638 != null) {
            for (int j1 = 0; j1 < 12; ++j1) {
                Model.anIntArray1673[j1] = 0;
                Model.anIntArray1677[j1] = 0;
            }
        } else {
            int i1 = this.anInt1652 - 1;
            while (i1 >= 0) {
                int l1 = anIntArray1671[i1];
                if (l1 > 0) {
                    int[] ai = anIntArrayArray1672[i1];
                    for (int j3 = 0; j3 < l1; ++j3) {
                        this.method484(ai[j3], bufferOffset);
                    }
                }
                --i1;
            }
            return;
        }
        int i2 = this.anInt1652 - 1;
        do {
            block37 : {
                int[] ai1;
                int k2;
                block38 : {
                    block36 : {
                        if (i2 < 0) break block36;
                        k2 = anIntArray1671[i2];
                        if (k2 <= 0) break block37;
                        ai1 = anIntArrayArray1672[i2];
                        break block38;
                    }
                    l2 = 0;
                    if (anIntArray1673[1] > 0 || anIntArray1673[2] > 0) {
                        l2 = (anIntArray1677[1] + anIntArray1677[2]) / (anIntArray1673[1] + anIntArray1673[2]);
                    }
                    k3 = 0;
                    if (anIntArray1673[3] > 0 || anIntArray1673[4] > 0) {
                        k3 = (anIntArray1677[3] + anIntArray1677[4]) / (anIntArray1673[3] + anIntArray1673[4]);
                    }
                    j4 = 0;
                    if (anIntArray1673[6] > 0 || anIntArray1673[8] > 0) {
                        j4 = (anIntArray1677[6] + anIntArray1677[8]) / (anIntArray1673[6] + anIntArray1673[8]);
                    }
                    i6 = 0;
                    k6 = anIntArray1673[10];
                    ai2 = anIntArrayArray1674[10];
                    ai3 = anIntArray1675;
                    if (i6 == k6) {
                        i6 = 0;
                        k6 = anIntArray1673[11];
                        ai2 = anIntArrayArray1674[11];
                        ai3 = anIntArray1676;
                    }
                    i5 = i6 < k6 ? ai3[i6] : -1000;
                    break;
                }
                for (int i4 = 0; i4 < k2; ++i4) {
                    int l4 = ai1[i4];
                    int l5 = this.anIntArray1638[l4];
                    int[] arrn = anIntArray1673;
                    int n = l5;
                    arrn[n] = arrn[n] + 1;
                    Model.anIntArrayArray1674[l5][j6] = l4;
                    if (l5 < 10) {
                        int[] arrn2 = anIntArray1677;
                        int n4 = l5;
                        arrn2[n4] = arrn2[n4] + i2;
                        continue;
                    }
                    if (l5 == 10) {
                        Model.anIntArray1675[j6] = i2;
                        continue;
                    }
                    Model.anIntArray1676[j6] = i2;
                }
            }
            --i2;
        } while (true);
        for (int l6 = 0; l6 < 10; ++l6) {
            while (l6 == 0 && i5 > l2) {
                this.method484(ai2[i6++], bufferOffset);
                if (i6 == k6 && ai2 != anIntArrayArray1674[11]) {
                    i6 = 0;
                    k6 = anIntArray1673[11];
                    ai2 = anIntArrayArray1674[11];
                    ai3 = anIntArray1676;
                }
                if (i6 < k6) {
                    i5 = ai3[i6];
                    continue;
                }
                i5 = -1000;
            }
            while (l6 == 3 && i5 > k3) {
                this.method484(ai2[i6++], bufferOffset);
                if (i6 == k6 && ai2 != anIntArrayArray1674[11]) {
                    i6 = 0;
                    k6 = anIntArray1673[11];
                    ai2 = anIntArrayArray1674[11];
                    ai3 = anIntArray1676;
                }
                if (i6 < k6) {
                    i5 = ai3[i6];
                    continue;
                }
                i5 = -1000;
            }
            while (l6 == 5 && i5 > j4) {
                this.method484(ai2[i6++], bufferOffset);
                if (i6 == k6 && ai2 != anIntArrayArray1674[11]) {
                    i6 = 0;
                    k6 = anIntArray1673[11];
                    ai2 = anIntArrayArray1674[11];
                    ai3 = anIntArray1676;
                }
                if (i6 < k6) {
                    i5 = ai3[i6];
                    continue;
                }
                i5 = -1000;
            }
            int i7 = anIntArray1673[l6];
            int[] ai4 = anIntArrayArray1674[l6];
            for (int j7 = 0; j7 < i7; ++j7) {
                this.method484(ai4[j7], bufferOffset);
            }
        }
        while (i5 != -1000) {
            this.method484(ai2[i6++], bufferOffset);
            if (i6 == k6 && ai2 != anIntArrayArray1674[11]) {
                i6 = 0;
                ai2 = anIntArrayArray1674[11];
                k6 = anIntArray1673[11];
                ai3 = anIntArray1676;
            }
            if (i6 < k6) {
                i5 = ai3[i6];
                continue;
            }
            i5 = -1000;
        }
        int vertex = 0;
        while (vertex < this.anInt1626) {
            int pid = this.verticesParticle[vertex] - 1;
            if (pid >= 0) {
                ParticleDefinition def = ParticleDefinition.cache[pid];
                int x = this.anIntArray1627[vertex] >> (this.scaledVertices ? 2 : 0);
                int y = this.anIntArray1628[vertex] >> (this.scaledVertices ? 2 : 0);
                int z = this.anIntArray1629[vertex] >> (this.scaledVertices ? 2 : 0);
                int depth = vertexPerspectiveDepth[vertex] >> (this.scaledVertices ? 2 : 0);
                if (this.lastRenderedRotation != 0) {
                    int sine = modelIntArray1[this.lastRenderedRotation];
                    int cosine = modelIntArray2[this.lastRenderedRotation];
                    int rotatedX = z * sine + x * cosine >> 16;
                    z = z * cosine - x * sine >> 16;
                    x = rotatedX;
                }
                Vector pos = new Vector(x += this.renderAtPointX, - y, z += this.renderAtPointY);
                for (int p = 0; p < def.getSpawnRate(); ++p) {
                    Particle particle = new Particle(def, pos, depth, pid);
                    Client.instance.addParticle(particle);
                }
            }
            ++vertex;
        }
    }

    private final void method484(int i, int bufferOffset) {
        if (aBooleanArray1664[i]) {
            this.method485(i, bufferOffset);
            return;
        }
        int j = this.anIntArray1631[i];
        int k = this.anIntArray1632[i];
        int l = this.anIntArray1633[i];
        Rasterizer.aBoolean1462 = aBooleanArray1663[i];
        Rasterizer.anInt1465 = this.anIntArray1639 == null ? 0 : this.anIntArray1639[i];
        int i1 = this.anIntArray1637 == null ? 0 : this.anIntArray1637[i] & 3;
        if (i1 == 0) {
            Rasterizer.drawGouraudTriangle(anIntArray1666[j], anIntArray1666[k], anIntArray1666[l], anIntArray1665[j], anIntArray1665[k], anIntArray1665[l], this.anIntArray1634[i], this.anIntArray1635[i], this.anIntArray1636[i], vertexPerspectiveDepth[j], vertexPerspectiveDepth[k], vertexPerspectiveDepth[l], bufferOffset);
            return;
        }
        if (i1 == 1) {
            Rasterizer.drawFlatTriangle(anIntArray1666[j], anIntArray1666[k], anIntArray1666[l], anIntArray1665[j], anIntArray1665[k], anIntArray1665[l], modelIntArray3[this.anIntArray1634[i]], vertexPerspectiveDepth[j], vertexPerspectiveDepth[k], vertexPerspectiveDepth[l], bufferOffset);
            return;
        }
        if (i1 == 2) {
            int j1 = this.anIntArray1637[i] >> 2;
            int l1 = this.anIntArray1643[j1];
            int j2 = this.anIntArray1644[j1];
            int l2 = this.anIntArray1645[j1];
            Rasterizer.drawTexturedTriangle(anIntArray1666[j], anIntArray1666[k], anIntArray1666[l], anIntArray1665[j], anIntArray1665[k], anIntArray1665[l], this.anIntArray1634[i], this.anIntArray1635[i], this.anIntArray1636[i], anIntArray1668[l1], anIntArray1668[j2], anIntArray1668[l2], anIntArray1669[l1], anIntArray1669[j2], anIntArray1669[l2], anIntArray1670[l1], anIntArray1670[j2], anIntArray1670[l2], this.anIntArray1640[i], vertexPerspectiveDepth[j], vertexPerspectiveDepth[k], vertexPerspectiveDepth[l], bufferOffset);
            return;
        }
        if (i1 != 3) return;
        int k1 = this.anIntArray1637[i] >> 2;
        int i2 = this.anIntArray1643[k1];
        int k2 = this.anIntArray1644[k1];
        int i3 = this.anIntArray1645[k1];
        Rasterizer.drawTexturedTriangle(anIntArray1666[j], anIntArray1666[k], anIntArray1666[l], anIntArray1665[j], anIntArray1665[k], anIntArray1665[l], this.anIntArray1634[i], this.anIntArray1634[i], this.anIntArray1634[i], anIntArray1668[i2], anIntArray1668[k2], anIntArray1668[i3], anIntArray1669[i2], anIntArray1669[k2], anIntArray1669[i3], anIntArray1670[i2], anIntArray1670[k2], anIntArray1670[i3], this.anIntArray1640[i], vertexPerspectiveDepth[j], vertexPerspectiveDepth[k], vertexPerspectiveDepth[l], bufferOffset);
    }

    private final void method485(int i, int bufferOffset) {
        if (this.anIntArray1640 != null && this.anIntArray1640[i] == 65535) {
            return;
        }
        int j = Rasterizer.textureInt1;
        int k = Rasterizer.textureInt2;
        int l = 0;
        int i1 = this.anIntArray1631[i];
        int j1 = this.anIntArray1632[i];
        int k1 = this.anIntArray1633[i];
        int l1 = anIntArray1670[i1];
        int i2 = anIntArray1670[j1];
        int j2 = anIntArray1670[k1];
        if (l1 >= 50) {
            Model.anIntArray1678[l] = anIntArray1665[i1];
            Model.anIntArray1679[l] = anIntArray1666[i1];
            Model.anIntArray1680[l++] = this.anIntArray1634[i];
        } else {
            int k2 = anIntArray1668[i1];
            int k3 = anIntArray1669[i1];
            int k4 = this.anIntArray1634[i];
            if (j2 >= 50) {
                int k5 = (50 - l1) * modelIntArray4[j2 - l1];
                Model.anIntArray1678[l] = j + (k2 + ((anIntArray1668[k1] - k2) * k5 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1679[l] = k + (k3 + ((anIntArray1669[k1] - k3) * k5 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1680[l++] = k4 + ((this.anIntArray1636[i] - k4) * k5 >> 16);
            }
            if (i2 >= 50) {
                int l5 = (50 - l1) * modelIntArray4[i2 - l1];
                Model.anIntArray1678[l] = j + (k2 + ((anIntArray1668[j1] - k2) * l5 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1679[l] = k + (k3 + ((anIntArray1669[j1] - k3) * l5 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1680[l++] = k4 + ((this.anIntArray1635[i] - k4) * l5 >> 16);
            }
        }
        if (i2 >= 50) {
            Model.anIntArray1678[l] = anIntArray1665[j1];
            Model.anIntArray1679[l] = anIntArray1666[j1];
            Model.anIntArray1680[l++] = this.anIntArray1635[i];
        } else {
            int l2 = anIntArray1668[j1];
            int l3 = anIntArray1669[j1];
            int l4 = this.anIntArray1635[i];
            if (l1 >= 50) {
                int i6 = (50 - i2) * modelIntArray4[l1 - i2];
                Model.anIntArray1678[l] = j + (l2 + ((anIntArray1668[i1] - l2) * i6 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1679[l] = k + (l3 + ((anIntArray1669[i1] - l3) * i6 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1680[l++] = l4 + ((this.anIntArray1634[i] - l4) * i6 >> 16);
            }
            if (j2 >= 50) {
                int j6 = (50 - i2) * modelIntArray4[j2 - i2];
                Model.anIntArray1678[l] = j + (l2 + ((anIntArray1668[k1] - l2) * j6 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1679[l] = k + (l3 + ((anIntArray1669[k1] - l3) * j6 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1680[l++] = l4 + ((this.anIntArray1636[i] - l4) * j6 >> 16);
            }
        }
        if (j2 >= 50) {
            Model.anIntArray1678[l] = anIntArray1665[k1];
            Model.anIntArray1679[l] = anIntArray1666[k1];
            Model.anIntArray1680[l++] = this.anIntArray1636[i];
        } else {
            int i3 = anIntArray1668[k1];
            int i4 = anIntArray1669[k1];
            int i5 = this.anIntArray1636[i];
            if (i2 >= 50) {
                int k6 = (50 - j2) * modelIntArray4[i2 - j2];
                Model.anIntArray1678[l] = j + (i3 + ((anIntArray1668[j1] - i3) * k6 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1679[l] = k + (i4 + ((anIntArray1669[j1] - i4) * k6 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1680[l++] = i5 + ((this.anIntArray1635[i] - i5) * k6 >> 16);
            }
            if (l1 >= 50) {
                int l6 = (50 - j2) * modelIntArray4[l1 - j2];
                Model.anIntArray1678[l] = j + (i3 + ((anIntArray1668[i1] - i3) * l6 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1679[l] = k + (i4 + ((anIntArray1669[i1] - i4) * l6 >> 16) << Client.log_view_dist) / 50;
                Model.anIntArray1680[l++] = i5 + ((this.anIntArray1634[i] - i5) * l6 >> 16);
            }
        }
        int j3 = anIntArray1678[0];
        int j4 = anIntArray1678[1];
        int j5 = anIntArray1678[2];
        int i7 = anIntArray1679[0];
        int j7 = anIntArray1679[1];
        int k7 = anIntArray1679[2];
        if ((j3 - j4) * (k7 - j7) - (i7 - j7) * (j5 - j4) <= 0) return;
        Rasterizer.aBoolean1462 = false;
        if (l == 3) {
            if (j3 < 0 || j4 < 0 || j5 < 0 || j3 > DrawingArea.centerX || j4 > DrawingArea.centerX || j5 > DrawingArea.centerX) {
                Rasterizer.aBoolean1462 = true;
            }
            int l7 = this.anIntArray1637 == null ? 0 : this.anIntArray1637[i] & 3;
            if (l7 == 0) {
                Rasterizer.drawGouraudTriangle(i7, j7, k7, j3, j4, j5, anIntArray1680[0], anIntArray1680[1], anIntArray1680[2], -1.0f, -1.0f, -1.0f, bufferOffset);
            } else if (l7 == 1) {
                Rasterizer.drawFlatTriangle(i7, j7, k7, j3, j4, j5, modelIntArray3[this.anIntArray1634[i]], -1.0f, -1.0f, -1.0f, bufferOffset);
            } else if (l7 == 2) {
                int j8 = this.anIntArray1637[i] >> 2;
                int k9 = this.anIntArray1643[j8];
                int k10 = this.anIntArray1644[j8];
                int k11 = this.anIntArray1645[j8];
                Rasterizer.drawTexturedTriangle(i7, j7, k7, j3, j4, j5, anIntArray1680[0], anIntArray1680[1], anIntArray1680[2], anIntArray1668[k9], anIntArray1668[k10], anIntArray1668[k11], anIntArray1669[k9], anIntArray1669[k10], anIntArray1669[k11], anIntArray1670[k9], anIntArray1670[k10], anIntArray1670[k11], this.anIntArray1640[i], vertexPerspectiveDepth[i1], vertexPerspectiveDepth[j1], vertexPerspectiveDepth[k1], bufferOffset);
            } else if (l7 == 3) {
                int k8 = this.anIntArray1637[i] >> 2;
                int l9 = this.anIntArray1643[k8];
                int l10 = this.anIntArray1644[k8];
                int l11 = this.anIntArray1645[k8];
                Rasterizer.drawTexturedTriangle(i7, j7, k7, j3, j4, j5, this.anIntArray1634[i], this.anIntArray1634[i], this.anIntArray1634[i], anIntArray1668[l9], anIntArray1668[l10], anIntArray1668[l11], anIntArray1669[l9], anIntArray1669[l10], anIntArray1669[l11], anIntArray1670[l9], anIntArray1670[l10], anIntArray1670[l11], this.anIntArray1640[i], vertexPerspectiveDepth[i1], vertexPerspectiveDepth[j1], vertexPerspectiveDepth[k1], bufferOffset);
            }
        }
        if (l != 4) return;
        if (j3 < 0 || j4 < 0 || j5 < 0 || j3 > DrawingArea.centerX || j4 > DrawingArea.centerX || j5 > DrawingArea.centerX || anIntArray1678[3] < 0 || anIntArray1678[3] > DrawingArea.centerX) {
            Rasterizer.aBoolean1462 = true;
        }
        int i8 = this.anIntArray1637 == null ? 0 : this.anIntArray1637[i] & 3;
        if (i8 == 0) {
            Rasterizer.drawGouraudTriangle(i7, j7, k7, j3, j4, j5, anIntArray1680[0], anIntArray1680[1], anIntArray1680[2], -1.0f, -1.0f, -1.0f, bufferOffset);
            Rasterizer.drawGouraudTriangle(i7, k7, anIntArray1679[3], j3, j5, anIntArray1678[3], anIntArray1680[0], anIntArray1680[2], anIntArray1680[3], vertexPerspectiveDepth[i1], vertexPerspectiveDepth[j1], vertexPerspectiveDepth[k1], bufferOffset);
            return;
        }
        if (i8 == 1) {
            int l8 = modelIntArray3[this.anIntArray1634[i]];
            Rasterizer.drawFlatTriangle(i7, j7, k7, j3, j4, j5, l8, -1.0f, -1.0f, -1.0f, bufferOffset);
            Rasterizer.drawFlatTriangle(i7, k7, anIntArray1679[3], j3, j5, anIntArray1678[3], l8, vertexPerspectiveDepth[i1], vertexPerspectiveDepth[j1], vertexPerspectiveDepth[k1], bufferOffset);
            return;
        }
        if (i8 == 2) {
            int i9 = this.anIntArray1637[i] >> 2;
            int i10 = this.anIntArray1643[i9];
            int i11 = this.anIntArray1644[i9];
            int i12 = this.anIntArray1645[i9];
            Rasterizer.drawTexturedTriangle(i7, j7, k7, j3, j4, j5, anIntArray1680[0], anIntArray1680[1], anIntArray1680[2], anIntArray1668[i10], anIntArray1668[i11], anIntArray1668[i12], anIntArray1669[i10], anIntArray1669[i11], anIntArray1669[i12], anIntArray1670[i10], anIntArray1670[i11], anIntArray1670[i12], this.anIntArray1640[i], vertexPerspectiveDepth[i1], vertexPerspectiveDepth[j1], vertexPerspectiveDepth[k1], bufferOffset);
            Rasterizer.drawTexturedTriangle(i7, k7, anIntArray1679[3], j3, j5, anIntArray1678[3], anIntArray1680[0], anIntArray1680[2], anIntArray1680[3], anIntArray1668[i10], anIntArray1668[i11], anIntArray1668[i12], anIntArray1669[i10], anIntArray1669[i11], anIntArray1669[i12], anIntArray1670[i10], anIntArray1670[i11], anIntArray1670[i12], this.anIntArray1640[i], vertexPerspectiveDepth[i1], vertexPerspectiveDepth[j1], vertexPerspectiveDepth[k1], bufferOffset);
            return;
        }
        if (i8 != 3) return;
        int j9 = this.anIntArray1637[i] >> 2;
        int j10 = this.anIntArray1643[j9];
        int j11 = this.anIntArray1644[j9];
        int j12 = this.anIntArray1645[j9];
        Rasterizer.drawTexturedTriangle(i7, j7, k7, j3, j4, j5, this.anIntArray1634[i], this.anIntArray1634[i], this.anIntArray1634[i], anIntArray1668[j10], anIntArray1668[j11], anIntArray1668[j12], anIntArray1669[j10], anIntArray1669[j11], anIntArray1669[j12], anIntArray1670[j10], anIntArray1670[j11], anIntArray1670[j12], this.anIntArray1640[i], vertexPerspectiveDepth[i1], vertexPerspectiveDepth[j1], vertexPerspectiveDepth[k1], bufferOffset);
        Rasterizer.drawTexturedTriangle(i7, k7, anIntArray1679[3], j3, j5, anIntArray1678[3], this.anIntArray1634[i], this.anIntArray1634[i], this.anIntArray1634[i], anIntArray1668[j10], anIntArray1668[j11], anIntArray1668[j12], anIntArray1669[j10], anIntArray1669[j11], anIntArray1669[j12], anIntArray1670[j10], anIntArray1670[j11], anIntArray1670[j12], this.anIntArray1640[i], vertexPerspectiveDepth[i1], vertexPerspectiveDepth[j1], vertexPerspectiveDepth[k1], bufferOffset);
    }

    private final boolean method486(int i, int j, int k, int l, int i1, int j1, int k1, int l1) {
        if (j < k && j < l && j < i1) {
            return false;
        }
        if (j > k && j > l && j > i1) {
            return false;
        }
        if (i < j1 && i < k1 && i < l1) {
            return false;
        }
        if (i <= j1) return true;
        if (i <= k1) return true;
        if (i <= l1) return true;
        return false;
    }

    private void printModelColors(int modelId) {
        if (this.anIntArray1640 == null || this.anIntArray1640.length == 0) {
            System.out.println("[" + modelId + "] No model colors have been found!");
            return;
        }
        ArrayList foundColors = new ArrayList();
        int[] arrn = this.anIntArray1640;
        int n = arrn.length;
        int n2 = 0;
        do {
            if (n2 >= n) {
                System.out.println("[" + modelId + "] Found model colors: " + foundColors.toString());
                return;
            }
            int color = arrn[n2];
            if (!foundColors.contains((Object)color)) {
                foundColors.add((Object)color);
            }
            ++n2;
        } while (true);
    }

    public void read525Model(byte[] abyte0, int modelID, RevisionType type) {
        int k5;
        Stream nc1 = new Stream(abyte0);
        Stream nc2 = new Stream(abyte0);
        Stream nc3 = new Stream(abyte0);
        Stream nc4 = new Stream(abyte0);
        Stream nc5 = new Stream(abyte0);
        Stream nc6 = new Stream(abyte0);
        Stream nc7 = new Stream(abyte0);
        nc1.currentOffset = abyte0.length - 23;
        int numVertices = nc1.readUnsignedWord();
        int numTriangles = nc1.readUnsignedWord();
        int numTexTriangles = nc1.readUnsignedByte();
        ModelHeader modelHeader = new ModelHeader();
        ((ModelHeader[])Model.MODEL_DATA.get((Object)type))[modelID] = modelHeader;
        ModelHeader ModelDef_1 = modelHeader;
        ModelDef_1.aByteArray368 = abyte0;
        ModelDef_1.anInt369 = numVertices;
        ModelDef_1.anInt370 = numTriangles;
        ModelDef_1.anInt371 = numTexTriangles;
        int l1 = nc1.readUnsignedByte();
        boolean bool = ~ (1 & l1) == -2;
        boolean bool_78_ = ~ (l1 & 2) == -3;
        int i2 = nc1.readUnsignedByte();
        int j2 = nc1.readUnsignedByte();
        int k2 = nc1.readUnsignedByte();
        int l2 = nc1.readUnsignedByte();
        int i3 = nc1.readUnsignedByte();
        int j3 = nc1.readUnsignedWord();
        int k3 = nc1.readUnsignedWord();
        int l3 = nc1.readUnsignedWord();
        int i4 = nc1.readUnsignedWord();
        int j4 = nc1.readUnsignedWord();
        int k4 = 0;
        int l4 = 0;
        int i5 = 0;
        int v = 0;
        int hb = 0;
        int P = 0;
        byte G = 0;
        byte[] x = null;
        byte[] O = null;
        byte[] J = null;
        byte[] F = null;
        byte[] cb = null;
        byte[] gb = null;
        byte[] lb = null;
        Object ab = null;
        int[] kb = null;
        int[] y = null;
        int[] N = null;
        short[] D = null;
        int[] triangleColours2 = new int[numTriangles];
        if (numTexTriangles > 0) {
            O = new byte[numTexTriangles];
            nc1.currentOffset = 0;
            for (int j5 = 0; j5 < numTexTriangles; ++j5) {
                O[j5] = nc1.readSignedByte();
                byte byte0 = O[j5];
                if (byte0 == 0) {
                    ++k4;
                }
                if (byte0 >= 1 && byte0 <= 3) {
                    ++l4;
                }
                if (byte0 != 2) continue;
                ++i5;
            }
        }
        int l5 = k5 = numTexTriangles;
        int i6 = k5 += numVertices;
        if (l1 == 1) {
            k5 += numTriangles;
        }
        int j6 = k5;
        int k6 = k5 += numTriangles;
        if (i2 == 255) {
            k5 += numTriangles;
        }
        int l6 = k5;
        if (k2 == 1) {
            k5 += numTriangles;
        }
        int i7 = k5;
        if (i3 == 1) {
            k5 += numVertices;
        }
        int j7 = k5;
        if (j2 == 1) {
            k5 += numTriangles;
        }
        int k7 = k5;
        int l7 = k5 += i4;
        if (l2 == 1) {
            k5 += numTriangles * 2;
        }
        int i8 = k5;
        int j8 = k5 += j4;
        int k8 = k5 += numTriangles * 2;
        int l8 = k5 += j3;
        int i9 = k5 += k3;
        int j9 = k5 += l3;
        int k9 = k5 += k4 * 6;
        int l9 = k5 += l4 * 6;
        int i10 = k5 += l4 * 6;
        int j10 = k5 += l4;
        int k10 = k5 += l4;
        k5 += l4 + i5 * 2;
        v = numVertices;
        hb = numTriangles;
        P = numTexTriangles;
        int[] vertexX = new int[numVertices];
        int[] vertexY = new int[numVertices];
        int[] vertexZ = new int[numVertices];
        int[] facePoint1 = new int[numTriangles];
        int[] facePoint2 = new int[numTriangles];
        int[] facePoint3 = new int[numTriangles];
        this.verticesParticle = new int[numVertices];
        this.anIntArray1655 = new int[numVertices];
        this.anIntArray1637 = new int[numTriangles];
        this.anIntArray1638 = new int[numTriangles];
        this.anIntArray1639 = new int[numTriangles];
        this.anIntArray1656 = new int[numTriangles];
        if (i3 == 1) {
            this.anIntArray1655 = new int[numVertices];
        }
        if (bool) {
            this.anIntArray1637 = new int[numTriangles];
        }
        if (i2 == 255) {
            this.anIntArray1638 = new int[numTriangles];
        } else {
            G = (byte)i2;
        }
        if (j2 == 1) {
            this.anIntArray1639 = new int[numTriangles];
        }
        if (k2 == 1) {
            this.anIntArray1656 = new int[numTriangles];
        }
        if (l2 == 1) {
            D = new short[numTriangles];
        }
        if (l2 == 1 && numTexTriangles > 0) {
            x = new byte[numTriangles];
        }
        triangleColours2 = new int[numTriangles];
        int[] texTrianglesPoint1 = null;
        int[] texTrianglesPoint2 = null;
        int[] texTrianglesPoint3 = null;
        if (numTexTriangles > 0) {
            texTrianglesPoint1 = new int[numTexTriangles];
            texTrianglesPoint2 = new int[numTexTriangles];
            texTrianglesPoint3 = new int[numTexTriangles];
            if (l4 > 0) {
                kb = new int[l4];
                N = new int[l4];
                y = new int[l4];
                gb = new byte[l4];
                lb = new byte[l4];
                F = new byte[l4];
            }
            if (i5 > 0) {
                cb = new byte[i5];
                J = new byte[i5];
            }
        }
        nc1.currentOffset = l5;
        nc2.currentOffset = k8;
        nc3.currentOffset = l8;
        nc4.currentOffset = i9;
        nc5.currentOffset = i7;
        int l10 = 0;
        int i11 = 0;
        int j11 = 0;
        for (int k11 = 0; k11 < numVertices; ++k11) {
            int l11 = nc1.readUnsignedByte();
            int j12 = 0;
            if ((l11 & 1) != 0) {
                j12 = nc2.method421();
            }
            int l12 = 0;
            if ((l11 & 2) != 0) {
                l12 = nc3.method421();
            }
            int j13 = 0;
            if ((l11 & 4) != 0) {
                j13 = nc4.method421();
            }
            vertexX[k11] = l10 + j12;
            vertexY[k11] = i11 + l12;
            vertexZ[k11] = j11 + j13;
            l10 = vertexX[k11];
            i11 = vertexY[k11];
            j11 = vertexZ[k11];
            if (this.anIntArray1655 == null) continue;
            this.anIntArray1655[k11] = nc5.readUnsignedByte();
        }
        nc1.currentOffset = j8;
        nc2.currentOffset = i6;
        nc3.currentOffset = k6;
        nc4.currentOffset = j7;
        nc5.currentOffset = l6;
        nc6.currentOffset = l7;
        nc7.currentOffset = i8;
        for (int i12 = 0; i12 < numTriangles; ++i12) {
            triangleColours2[i12] = nc1.readUnsignedWord();
            if (l1 == 1) {
                this.anIntArray1637[i12] = nc2.readSignedByte();
                if (this.anIntArray1637[i12] == 2) {
                    triangleColours2[i12] = 65535;
                }
                this.anIntArray1637[i12] = 0;
            }
            if (i2 == 255) {
                this.anIntArray1638[i12] = nc3.readSignedByte();
            }
            if (j2 == 1) {
                this.anIntArray1639[i12] = nc4.readSignedByte();
                if (this.anIntArray1639[i12] < 0) {
                    this.anIntArray1639[i12] = 256 + this.anIntArray1639[i12];
                }
            }
            if (k2 == 1) {
                this.anIntArray1656[i12] = nc5.readUnsignedByte();
            }
            if (l2 == 1) {
                D[i12] = (short)(nc6.readUnsignedWord() - 1);
            }
            if (x == null) continue;
            x[i12] = D[i12] != -1 ? (byte)(nc7.readUnsignedByte() - 1) : -1;
        }
        nc1.currentOffset = k7;
        nc2.currentOffset = j6;
        int k12 = 0;
        int i13 = 0;
        int k13 = 0;
        int l13 = 0;
        for (int i14 = 0; i14 < numTriangles; ++i14) {
            int j14 = nc2.readUnsignedByte();
            if (j14 == 1) {
                l13 = k12 = nc1.method421() + l13;
                l13 = i13 = nc1.method421() + l13;
                l13 = k13 = nc1.method421() + l13;
                facePoint1[i14] = k12;
                facePoint2[i14] = i13;
                facePoint3[i14] = k13;
            }
            if (j14 == 2) {
                i13 = k13;
                l13 = k13 = nc1.method421() + l13;
                facePoint1[i14] = k12;
                facePoint2[i14] = i13;
                facePoint3[i14] = k13;
            }
            if (j14 == 3) {
                k12 = k13;
                l13 = k13 = nc1.method421() + l13;
                facePoint1[i14] = k12;
                facePoint2[i14] = i13;
                facePoint3[i14] = k13;
            }
            if (j14 != 4) continue;
            int l14 = k12;
            k12 = i13;
            i13 = l14;
            l13 = k13 = nc1.method421() + l13;
            facePoint1[i14] = k12;
            facePoint2[i14] = i13;
            facePoint3[i14] = k13;
        }
        nc1.currentOffset = j9;
        nc2.currentOffset = k9;
        nc3.currentOffset = l9;
        nc4.currentOffset = i10;
        nc5.currentOffset = j10;
        nc6.currentOffset = k10;
        for (int k14 = 0; k14 < numTexTriangles; ++k14) {
            int i15 = O[k14] & 255;
            if (i15 == 0) {
                texTrianglesPoint1[k14] = nc1.readUnsignedWord();
                texTrianglesPoint2[k14] = nc1.readUnsignedWord();
                texTrianglesPoint3[k14] = nc1.readUnsignedWord();
            }
            if (i15 == 1) {
                texTrianglesPoint1[k14] = nc2.readUnsignedWord();
                texTrianglesPoint2[k14] = nc2.readUnsignedWord();
                texTrianglesPoint3[k14] = nc2.readUnsignedWord();
                kb[k14] = nc3.readUnsignedWord();
                N[k14] = nc3.readUnsignedWord();
                y[k14] = nc3.readUnsignedWord();
                gb[k14] = nc4.readSignedByte();
                lb[k14] = nc5.readSignedByte();
                F[k14] = nc6.readSignedByte();
            }
            if (i15 == 2) {
                texTrianglesPoint1[k14] = nc2.readUnsignedWord();
                texTrianglesPoint2[k14] = nc2.readUnsignedWord();
                texTrianglesPoint3[k14] = nc2.readUnsignedWord();
                kb[k14] = nc3.readUnsignedWord();
                N[k14] = nc3.readUnsignedWord();
                y[k14] = nc3.readUnsignedWord();
                gb[k14] = nc4.readSignedByte();
                lb[k14] = nc5.readSignedByte();
                F[k14] = nc6.readSignedByte();
                cb[k14] = nc6.readSignedByte();
                J[k14] = nc6.readSignedByte();
            }
            if (i15 != 3) continue;
            texTrianglesPoint1[k14] = nc2.readUnsignedWord();
            texTrianglesPoint2[k14] = nc2.readUnsignedWord();
            texTrianglesPoint3[k14] = nc2.readUnsignedWord();
            kb[k14] = nc3.readUnsignedWord();
            N[k14] = nc3.readUnsignedWord();
            y[k14] = nc3.readUnsignedWord();
            gb[k14] = nc4.readSignedByte();
            lb[k14] = nc5.readSignedByte();
            F[k14] = nc6.readSignedByte();
        }
        if (i2 != 255) {
            for (int i12 = 0; i12 < numTriangles; ++i12) {
                this.anIntArray1638[i12] = i2;
            }
        }
        this.anIntArray1640 = triangleColours2;
        this.anInt1626 = numVertices;
        this.anInt1630 = numTriangles;
        this.anIntArray1627 = vertexX;
        this.anIntArray1628 = vertexY;
        this.anIntArray1629 = vertexZ;
        this.anIntArray1631 = facePoint1;
        this.anIntArray1632 = facePoint2;
        this.anIntArray1633 = facePoint3;
        this.filterTriangles();
    }

    public void read622Model(byte[] abyte0, int modelID, RevisionType type) {
        boolean bool_26_;
        int k5;
        Stream nc1 = new Stream(abyte0);
        Stream nc2 = new Stream(abyte0);
        Stream nc3 = new Stream(abyte0);
        Stream nc4 = new Stream(abyte0);
        Stream nc5 = new Stream(abyte0);
        Stream nc6 = new Stream(abyte0);
        Stream nc7 = new Stream(abyte0);
        nc1.currentOffset = abyte0.length - 23;
        int numVertices = nc1.readUnsignedWord();
        int numTriangles = nc1.readUnsignedWord();
        int numTexTriangles = nc1.readUnsignedByte();
        ModelHeader modelHeader = new ModelHeader();
        ((ModelHeader[])Model.MODEL_DATA.get((Object)type))[modelID] = modelHeader;
        ModelHeader ModelDef_1 = modelHeader;
        ModelDef_1.aByteArray368 = abyte0;
        ModelDef_1.anInt369 = numVertices;
        ModelDef_1.anInt370 = numTriangles;
        ModelDef_1.anInt371 = numTexTriangles;
        int l1 = nc1.readUnsignedByte();
        boolean bool = ~ (1 & l1) == -2;
        boolean bool_78_ = ~ (l1 & 2) == -3;
        boolean bool_25_ = (4 & l1) == 4;
        boolean bl = bool_26_ = (8 & l1) == 8;
        if (!bool_26_) {
            this.read525Model(abyte0, modelID, type);
            return;
        }
        int newformat = 0;
        if (bool_26_) {
            nc1.currentOffset -= 7;
            newformat = nc1.readUnsignedByte();
            this.scaledVertices = true;
            nc1.currentOffset += 6;
        }
        int i2 = nc1.readUnsignedByte();
        int j2 = nc1.readUnsignedByte();
        int k2 = nc1.readUnsignedByte();
        int l2 = nc1.readUnsignedByte();
        int i3 = nc1.readUnsignedByte();
        int j3 = nc1.readUnsignedWord();
        int k3 = nc1.readUnsignedWord();
        int l3 = nc1.readUnsignedWord();
        int i4 = nc1.readUnsignedWord();
        int j4 = nc1.readUnsignedWord();
        int k4 = 0;
        int l4 = 0;
        int i5 = 0;
        int v = 0;
        int hb = 0;
        int P = 0;
        byte G = 0;
        byte[] x = null;
        byte[] O = null;
        byte[] J = null;
        byte[] F = null;
        byte[] cb = null;
        byte[] gb = null;
        byte[] lb = null;
        Object ab = null;
        int[] kb = null;
        int[] y = null;
        int[] N = null;
        short[] D = null;
        int[] triangleColours2 = new int[numTriangles];
        if (numTexTriangles > 0) {
            O = new byte[numTexTriangles];
            nc1.currentOffset = 0;
            for (int j5 = 0; j5 < numTexTriangles; ++j5) {
                O[j5] = nc1.readSignedByte();
                byte byte0 = O[j5];
                if (byte0 == 0) {
                    ++k4;
                }
                if (byte0 >= 1 && byte0 <= 3) {
                    ++l4;
                }
                if (byte0 != 2) continue;
                ++i5;
            }
        }
        int l5 = k5 = numTexTriangles;
        int i6 = k5 += numVertices;
        if (bool) {
            k5 += numTriangles;
        }
        if (l1 == 1) {
            k5 += numTriangles;
        }
        int j6 = k5;
        int k6 = k5 += numTriangles;
        if (i2 == 255) {
            k5 += numTriangles;
        }
        int l6 = k5;
        if (k2 == 1) {
            k5 += numTriangles;
        }
        int i7 = k5;
        if (i3 == 1) {
            k5 += numVertices;
        }
        int j7 = k5;
        if (j2 == 1) {
            k5 += numTriangles;
        }
        int k7 = k5;
        int l7 = k5 += i4;
        if (l2 == 1) {
            k5 += numTriangles * 2;
        }
        int i8 = k5;
        int j8 = k5 += j4;
        int k8 = k5 += numTriangles * 2;
        int l8 = k5 += j3;
        int i9 = k5 += k3;
        int j9 = k5 += l3;
        int k9 = k5 += k4 * 6;
        k5 += l4 * 6;
        int i_59_ = 6;
        if (newformat != 14) {
            if (newformat >= 15) {
                i_59_ = 9;
            }
        } else {
            i_59_ = 7;
        }
        int l9 = k5;
        int i10 = k5 += i_59_ * l4;
        int j10 = k5 += l4;
        int k10 = k5 += l4;
        k5 += l4 + i5 * 2;
        v = numVertices;
        hb = numTriangles;
        P = numTexTriangles;
        int[] vertexX = new int[numVertices];
        int[] vertexY = new int[numVertices];
        int[] vertexZ = new int[numVertices];
        this.verticesParticle = new int[numVertices];
        int[] facePoint1 = new int[numTriangles];
        int[] facePoint2 = new int[numTriangles];
        int[] facePoint3 = new int[numTriangles];
        this.anIntArray1655 = new int[numVertices];
        this.anIntArray1637 = new int[numTriangles];
        this.anIntArray1638 = new int[numTriangles];
        this.anIntArray1639 = new int[numTriangles];
        this.anIntArray1656 = new int[numTriangles];
        if (i3 == 1) {
            this.anIntArray1655 = new int[numVertices];
        }
        if (bool) {
            this.anIntArray1637 = new int[numTriangles];
        }
        if (i2 == 255) {
            this.anIntArray1638 = new int[numTriangles];
        } else {
            G = (byte)i2;
        }
        if (j2 == 1) {
            this.anIntArray1639 = new int[numTriangles];
        }
        if (k2 == 1) {
            this.anIntArray1656 = new int[numTriangles];
        }
        if (l2 == 1) {
            D = new short[numTriangles];
        }
        if (l2 == 1 && numTexTriangles > 0) {
            x = new byte[numTriangles];
        }
        triangleColours2 = new int[numTriangles];
        int[] texTrianglesPoint1 = null;
        int[] texTrianglesPoint2 = null;
        int[] texTrianglesPoint3 = null;
        if (numTexTriangles > 0) {
            texTrianglesPoint1 = new int[numTexTriangles];
            texTrianglesPoint2 = new int[numTexTriangles];
            texTrianglesPoint3 = new int[numTexTriangles];
            if (l4 > 0) {
                kb = new int[l4];
                N = new int[l4];
                y = new int[l4];
                gb = new byte[l4];
                lb = new byte[l4];
                F = new byte[l4];
            }
            if (i5 > 0) {
                cb = new byte[i5];
                J = new byte[i5];
            }
        }
        nc1.currentOffset = l5;
        nc2.currentOffset = k8;
        nc3.currentOffset = l8;
        nc4.currentOffset = i9;
        nc5.currentOffset = i7;
        int l10 = 0;
        int i11 = 0;
        int j11 = 0;
        for (int k11 = 0; k11 < numVertices; ++k11) {
            int l11 = nc1.readUnsignedByte();
            int j12 = 0;
            if ((l11 & 1) != 0) {
                j12 = nc2.method421();
            }
            int l12 = 0;
            if ((l11 & 2) != 0) {
                l12 = nc3.method421();
            }
            int j13 = 0;
            if ((l11 & 4) != 0) {
                j13 = nc4.method421();
            }
            vertexX[k11] = l10 + j12;
            vertexY[k11] = i11 + l12;
            vertexZ[k11] = j11 + j13;
            l10 = vertexX[k11];
            i11 = vertexY[k11];
            j11 = vertexZ[k11];
            if (this.anIntArray1655 == null) continue;
            this.anIntArray1655[k11] = nc5.readUnsignedByte();
        }
        nc1.currentOffset = j8;
        nc2.currentOffset = i6;
        nc3.currentOffset = k6;
        nc4.currentOffset = j7;
        nc5.currentOffset = l6;
        nc6.currentOffset = l7;
        nc7.currentOffset = i8;
        for (int i12 = 0; i12 < numTriangles; ++i12) {
            triangleColours2[i12] = nc1.readUnsignedWord();
            if (l1 == 1) {
                this.anIntArray1637[i12] = nc2.readSignedByte();
                if (this.anIntArray1637[i12] == 2) {
                    triangleColours2[i12] = 65535;
                }
                this.anIntArray1637[i12] = 0;
            }
            if (i2 == 255) {
                this.anIntArray1638[i12] = nc3.readSignedByte();
            }
            if (j2 == 1) {
                this.anIntArray1639[i12] = nc4.readSignedByte();
                if (this.anIntArray1639[i12] < 0) {
                    this.anIntArray1639[i12] = 256 + this.anIntArray1639[i12];
                }
            }
            if (k2 == 1) {
                this.anIntArray1656[i12] = nc5.readUnsignedByte();
            }
            if (l2 == 1) {
                D[i12] = (short)(nc6.readUnsignedWord() - 1);
            }
            if (x == null) continue;
            x[i12] = D[i12] != -1 ? (byte)(nc7.readUnsignedByte() - 1) : -1;
        }
        nc1.currentOffset = k7;
        nc2.currentOffset = j6;
        int k12 = 0;
        int i13 = 0;
        int k13 = 0;
        int l13 = 0;
        for (int i14 = 0; i14 < numTriangles; ++i14) {
            int j14 = nc2.readUnsignedByte();
            if (j14 == 1) {
                l13 = k12 = nc1.method421() + l13;
                l13 = i13 = nc1.method421() + l13;
                l13 = k13 = nc1.method421() + l13;
                facePoint1[i14] = k12;
                facePoint2[i14] = i13;
                facePoint3[i14] = k13;
            }
            if (j14 == 2) {
                i13 = k13;
                l13 = k13 = nc1.method421() + l13;
                facePoint1[i14] = k12;
                facePoint2[i14] = i13;
                facePoint3[i14] = k13;
            }
            if (j14 == 3) {
                k12 = k13;
                l13 = k13 = nc1.method421() + l13;
                facePoint1[i14] = k12;
                facePoint2[i14] = i13;
                facePoint3[i14] = k13;
            }
            if (j14 != 4) continue;
            int l14 = k12;
            k12 = i13;
            i13 = l14;
            l13 = k13 = nc1.method421() + l13;
            facePoint1[i14] = k12;
            facePoint2[i14] = i13;
            facePoint3[i14] = k13;
        }
        nc1.currentOffset = j9;
        nc2.currentOffset = k9;
        nc3.currentOffset = l9;
        nc4.currentOffset = i10;
        nc5.currentOffset = j10;
        nc6.currentOffset = k10;
        for (int k14 = 0; k14 < numTexTriangles; ++k14) {
            int i15 = O[k14] & 255;
            if (i15 == 0) {
                texTrianglesPoint1[k14] = nc1.readUnsignedWord();
                texTrianglesPoint2[k14] = nc1.readUnsignedWord();
                texTrianglesPoint3[k14] = nc1.readUnsignedWord();
            }
            if (i15 == 1) {
                texTrianglesPoint1[k14] = nc2.readUnsignedWord();
                texTrianglesPoint2[k14] = nc2.readUnsignedWord();
                texTrianglesPoint3[k14] = nc2.readUnsignedWord();
                if (newformat < 15) {
                    kb[k14] = nc3.readUnsignedWord();
                    N[k14] = newformat >= 14 ? nc3.v(-1) : nc3.readUnsignedWord();
                    y[k14] = nc3.readUnsignedWord();
                } else {
                    kb[k14] = nc3.v(-1);
                    N[k14] = nc3.v(-1);
                    y[k14] = nc3.v(-1);
                }
                gb[k14] = nc4.readSignedByte();
                lb[k14] = nc5.readSignedByte();
                F[k14] = nc6.readSignedByte();
            }
            if (i15 == 2) {
                texTrianglesPoint1[k14] = nc2.readUnsignedWord();
                texTrianglesPoint2[k14] = nc2.readUnsignedWord();
                texTrianglesPoint3[k14] = nc2.readUnsignedWord();
                if (newformat >= 15) {
                    kb[k14] = nc3.v(-1);
                    N[k14] = nc3.v(-1);
                    y[k14] = nc3.v(-1);
                } else {
                    kb[k14] = nc3.readUnsignedWord();
                    N[k14] = newformat < 14 ? nc3.readUnsignedWord() : nc3.v(-1);
                    y[k14] = nc3.readUnsignedWord();
                }
                gb[k14] = nc4.readSignedByte();
                lb[k14] = nc5.readSignedByte();
                F[k14] = nc6.readSignedByte();
                cb[k14] = nc6.readSignedByte();
                J[k14] = nc6.readSignedByte();
            }
            if (i15 != 3) continue;
            texTrianglesPoint1[k14] = nc2.readUnsignedWord();
            texTrianglesPoint2[k14] = nc2.readUnsignedWord();
            texTrianglesPoint3[k14] = nc2.readUnsignedWord();
            if (newformat < 15) {
                kb[k14] = nc3.readUnsignedWord();
                N[k14] = newformat < 14 ? nc3.readUnsignedWord() : nc3.v(-1);
                y[k14] = nc3.readUnsignedWord();
            } else {
                kb[k14] = nc3.v(-1);
                N[k14] = nc3.v(-1);
                y[k14] = nc3.v(-1);
            }
            gb[k14] = nc4.readSignedByte();
            lb[k14] = nc5.readSignedByte();
            F[k14] = nc6.readSignedByte();
        }
        if (i2 != 255) {
            for (int i12 = 0; i12 < numTriangles; ++i12) {
                this.anIntArray1638[i12] = i2;
            }
        }
        this.anIntArray1640 = triangleColours2;
        this.anInt1626 = numVertices;
        this.anInt1630 = numTriangles;
        this.anIntArray1627 = vertexX;
        this.anIntArray1628 = vertexY;
        this.anIntArray1629 = vertexZ;
        this.anIntArray1631 = facePoint1;
        this.anIntArray1632 = facePoint2;
        this.anIntArray1633 = facePoint3;
        if (!this.scaledVertices) {
            this.downscale();
        }
        this.filterTriangles();
    }

    private void readOldModel(int i, RevisionType type) {
        int j = -870;
        this.aBoolean1618 = true;
        this.aBoolean1659 = false;
        ++anInt1620;
        ModelHeader class21 = ((ModelHeader[])MODEL_DATA.get((Object)type))[i];
        this.anInt1626 = class21.anInt369;
        this.anInt1630 = class21.anInt370;
        this.anInt1642 = class21.anInt371;
        this.verticesParticle = new int[this.anInt1626];
        this.anIntArray1627 = new int[this.anInt1626];
        this.anIntArray1628 = new int[this.anInt1626];
        this.anIntArray1629 = new int[this.anInt1626];
        this.anIntArray1631 = new int[this.anInt1630];
        this.anIntArray1632 = new int[this.anInt1630];
        while (j >= 0) {
            this.aBoolean1618 = !this.aBoolean1618;
        }
        this.anIntArray1633 = new int[this.anInt1630];
        this.anIntArray1643 = new int[this.anInt1642];
        this.anIntArray1644 = new int[this.anInt1642];
        this.anIntArray1645 = new int[this.anInt1642];
        if (class21.anInt376 >= 0) {
            this.anIntArray1655 = new int[this.anInt1626];
        }
        if (class21.anInt380 >= 0) {
            this.anIntArray1637 = new int[this.anInt1630];
        }
        if (class21.anInt381 >= 0) {
            this.anIntArray1638 = new int[this.anInt1630];
        } else {
            this.anInt1641 = - class21.anInt381 - 1;
        }
        if (class21.anInt382 >= 0) {
            this.anIntArray1639 = new int[this.anInt1630];
        }
        if (class21.anInt383 >= 0) {
            this.anIntArray1656 = new int[this.anInt1630];
        }
        this.anIntArray1640 = new int[this.anInt1630];
        Stream stream = new Stream(class21.aByteArray368);
        stream.currentOffset = class21.anInt372;
        Stream stream_1 = new Stream(class21.aByteArray368);
        stream_1.currentOffset = class21.anInt373;
        Stream stream_2 = new Stream(class21.aByteArray368);
        stream_2.currentOffset = class21.anInt374;
        Stream stream_3 = new Stream(class21.aByteArray368);
        stream_3.currentOffset = class21.anInt375;
        Stream stream_4 = new Stream(class21.aByteArray368);
        stream_4.currentOffset = class21.anInt376;
        int k = 0;
        int l = 0;
        int i1 = 0;
        for (int j1 = 0; j1 < this.anInt1626; ++j1) {
            int k1 = stream.readUnsignedByte();
            int i2 = 0;
            if ((k1 & 1) != 0) {
                i2 = stream_1.method421();
            }
            int k2 = 0;
            if ((k1 & 2) != 0) {
                k2 = stream_2.method421();
            }
            int i3 = 0;
            if ((k1 & 4) != 0) {
                i3 = stream_3.method421();
            }
            this.anIntArray1627[j1] = k + i2;
            this.anIntArray1628[j1] = l + k2;
            this.anIntArray1629[j1] = i1 + i3;
            k = this.anIntArray1627[j1];
            l = this.anIntArray1628[j1];
            i1 = this.anIntArray1629[j1];
            if (this.anIntArray1655 == null) continue;
            this.anIntArray1655[j1] = stream_4.readUnsignedByte();
        }
        stream.currentOffset = class21.anInt379;
        stream_1.currentOffset = class21.anInt380;
        stream_2.currentOffset = class21.anInt381;
        stream_3.currentOffset = class21.anInt382;
        stream_4.currentOffset = class21.anInt383;
        for (int l1 = 0; l1 < this.anInt1630; ++l1) {
            this.anIntArray1640[l1] = stream.readUnsignedWord();
            if (this.anIntArray1637 != null) {
                this.anIntArray1637[l1] = stream_1.readUnsignedByte();
            }
            if (this.anIntArray1638 != null) {
                this.anIntArray1638[l1] = stream_2.readUnsignedByte();
            }
            if (this.anIntArray1639 != null) {
                this.anIntArray1639[l1] = stream_3.readUnsignedByte();
            }
            if (this.anIntArray1656 == null) continue;
            this.anIntArray1656[l1] = stream_4.readUnsignedByte();
        }
        stream.currentOffset = class21.anInt377;
        stream_1.currentOffset = class21.anInt378;
        int j2 = 0;
        int l2 = 0;
        int j3 = 0;
        int k3 = 0;
        for (int l3 = 0; l3 < this.anInt1630; ++l3) {
            int i4 = stream_1.readUnsignedByte();
            if (i4 == 1) {
                k3 = j2 = stream.method421() + k3;
                k3 = l2 = stream.method421() + k3;
                k3 = j3 = stream.method421() + k3;
                this.anIntArray1631[l3] = j2;
                this.anIntArray1632[l3] = l2;
                this.anIntArray1633[l3] = j3;
            }
            if (i4 == 2) {
                l2 = j3;
                k3 = j3 = stream.method421() + k3;
                this.anIntArray1631[l3] = j2;
                this.anIntArray1632[l3] = l2;
                this.anIntArray1633[l3] = j3;
            }
            if (i4 == 3) {
                j2 = j3;
                k3 = j3 = stream.method421() + k3;
                this.anIntArray1631[l3] = j2;
                this.anIntArray1632[l3] = l2;
                this.anIntArray1633[l3] = j3;
            }
            if (i4 != 4) continue;
            int k4 = j2;
            j2 = l2;
            l2 = k4;
            k3 = j3 = stream.method421() + k3;
            this.anIntArray1631[l3] = j2;
            this.anIntArray1632[l3] = l2;
            this.anIntArray1633[l3] = j3;
        }
        stream.currentOffset = class21.anInt384;
        int j4 = 0;
        while (j4 < this.anInt1642) {
            this.anIntArray1643[j4] = stream.readUnsignedWord();
            this.anIntArray1644[j4] = stream.readUnsignedWord();
            this.anIntArray1645[j4] = stream.readUnsignedWord();
            ++j4;
        }
    }

    public void downscale() {
        int i = 0;
        while (i < this.anInt1626) {
            this.anIntArray1627[i] = this.anIntArray1627[i] + 7 >> 2;
            this.anIntArray1628[i] = this.anIntArray1628[i] + 7 >> 2;
            this.anIntArray1629[i] = this.anIntArray1629[i] + 7 >> 2;
            ++i;
        }
    }

    static {
        EMPTY_MODEL = new Model(true);
        anIntArray1622 = new int[20000];
        anIntArray1623 = new int[20000];
        anIntArray1624 = new int[20000];
        anIntArray1625 = new int[20000];
        aBooleanArray1663 = new boolean[20000];
        aBooleanArray1664 = new boolean[20000];
        anIntArray1665 = new int[20000];
        anIntArray1666 = new int[20000];
        anIntArray1667 = new int[20000];
        anIntArray1668 = new int[20000];
        anIntArray1669 = new int[20000];
        anIntArray1670 = new int[20000];
        anIntArray1671 = new int[20000];
        anIntArrayArray1672 = new int[8000][512];
        anIntArray1673 = new int[12];
        anIntArrayArray1674 = new int[12][10000];
        anIntArray1675 = new int[8000];
        anIntArray1676 = new int[8000];
        vertexPerspectiveDepth = new int[20000];
        anIntArray1677 = new int[20000];
        anIntArray1678 = new int[20000];
        anIntArray1679 = new int[20000];
        anIntArray1680 = new int[20000];
        anIntArray1688 = new int[20000];
        MODEL_DATA = new HashMap();
        modelIntArray1 = Rasterizer.anIntArray1470;
        modelIntArray2 = Rasterizer.anIntArray1471;
        modelIntArray3 = Rasterizer.anIntArray1482;
        modelIntArray4 = Rasterizer.anIntArray1469;
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client.definition;

import com.imagineps.client.FileOperations;
import com.imagineps.client.MRUNodes;
import com.imagineps.client.Model;
import com.imagineps.client.NodeSub;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.cache.CacheType;
import com.imagineps.client.definition.AnimationDefinition;
import com.imagineps.client.definition.RevisionType;
import java.io.PrintStream;

public final class SpotAnim {
    public static final int OSRS_GRAPHICS_OFFSET = 10000;
    private static int graphicsAmount;
    private static int osrsGraphicsAmount;
    private static SpotAnim[] cache;
    private static SpotAnim[] osrsCache;
    private RevisionType revisionType = RevisionType.DEFAULT;
    private int anInt404;
    private int anInt405;
    private int anInt406 = -1;
    public AnimationDefinition aAnimation_407;
    private final int[] anIntArray408 = new int[6];
    private final int[] anIntArray409 = new int[6];
    public int anInt410 = 128;
    public int anInt411 = 128;
    public int anInt412;
    public int anInt413;
    public int anInt414;
    public static MRUNodes aMRUNodes_415;

    public static void unpackConfig(StreamLoader streamLoader) {
        Stream stream = new Stream(streamLoader.getDataForName("spotanim.dat"));
        graphicsAmount = stream.readUnsignedWord();
        if (cache == null) {
            cache = new SpotAnim[graphicsAmount];
        }
        for (int j = 0; j < cache.length; ++j) {
            if (cache[j] == null) {
                SpotAnim.cache[j] = new SpotAnim();
            }
            SpotAnim.cache[j].anInt404 = j;
            cache[j].readValues(stream);
            switch (j) {
                case 1242: {
                    SpotAnim.cache[j].anInt405 = 29306;
                    SpotAnim.cache[j].anInt406 = 4497;
                    break;
                }
                case 1243: {
                    SpotAnim.cache[j].anInt405 = 29306;
                    SpotAnim.cache[j].anInt406 = 4498;
                    break;
                }
                case 1244: {
                    SpotAnim.cache[j].anInt405 = 29390;
                    SpotAnim.cache[j].anInt406 = 4499;
                    break;
                }
                case 1245: {
                    SpotAnim.cache[j].anInt405 = 29390;
                    SpotAnim.cache[j].anInt406 = 4500;
                    break;
                }
                case 1246: {
                    SpotAnim.cache[j].anInt405 = 29311;
                    SpotAnim.cache[j].anInt406 = 4502;
                    break;
                }
                case 1247: {
                    SpotAnim.cache[j].anInt405 = 29269;
                    SpotAnim.cache[j].anInt406 = 4501;
                }
            }
            if (j == 2034) {
                SpotAnim.cache[2034].anInt405 = 13289;
                SpotAnim.cache[2034].anInt406 = 15449;
                SpotAnim.cache[2034].aAnimation_407 = AnimationDefinition.getAnim(15449);
            }
            if (j == 2035) {
                SpotAnim.cache[2035].anInt405 = 13289;
                SpotAnim.cache[2035].anInt406 = 15450;
                SpotAnim.cache[2035].aAnimation_407 = AnimationDefinition.getAnim(15450);
            }
            if (j == 2036) {
                SpotAnim.cache[2036].anInt405 = 13289;
                SpotAnim.cache[2036].anInt406 = 15451;
                SpotAnim.cache[2036].aAnimation_407 = AnimationDefinition.getAnim(15451);
            }
            if (j == 333) {
                SpotAnim.cache[333].anInt405 = 29216;
                SpotAnim.cache[333].anInt406 = 13026;
                SpotAnim.cache[333].aAnimation_407 = AnimationDefinition.getAnim(13026);
            }
            if (j == 1247) {
                SpotAnim.cache[j].anInt405 = 60776;
                SpotAnim.cache[j].anInt406 = 4001;
                SpotAnim.cache[j].aAnimation_407 = AnimationDefinition.getAnim(4001);
            }
            if (j != 1248) continue;
            SpotAnim.cache[j].anInt405 = 60776;
            SpotAnim.cache[j].anInt406 = 4002;
            SpotAnim.cache[j].aAnimation_407 = AnimationDefinition.getAnim(4002);
        }
        Stream osrsStream = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "/osrs/spotAnim.dat"));
        osrsGraphicsAmount = osrsStream.readUnsignedWord();
        if (osrsCache == null) {
            osrsCache = new SpotAnim[osrsGraphicsAmount];
        }
        int j = 0;
        while (j < osrsCache.length) {
            if (osrsCache[j] == null) {
                SpotAnim.osrsCache[j] = new SpotAnim();
            }
            SpotAnim.osrsCache[j].anInt404 = j;
            osrsCache[j].readValuesOSRS(osrsStream);
            SpotAnim.osrsCache[j].revisionType = RevisionType.OSRS;
            ++j;
        }
    }

    public static SpotAnim forId(int graphicsId) {
        if (graphicsId > 0 && graphicsId <= graphicsAmount) {
            return cache[graphicsId];
        }
        if (graphicsId <= 10000) return null;
        if (graphicsId > osrsGraphicsAmount + 10000) return null;
        return osrsCache[graphicsId - 10000];
    }

    private void readValues(Stream stream) {
        int k;
        this.anInt406 = stream.readUnsignedWord();
        this.anInt405 = stream.readUnsignedWord();
        if (this.anInt406 != 65535 && this.anInt406 != -1) {
            this.aAnimation_407 = AnimationDefinition.getAnim(this.anInt406);
        }
        this.anInt410 = stream.readUnsignedByte();
        this.anInt411 = stream.readUnsignedByte();
        int j = stream.readUnsignedWord();
        if (j == 65535) return;
        for (k = 0; k < j; ++k) {
            this.anIntArray409[k] = stream.readUnsignedWord();
        }
        k = 0;
        while (k < j) {
            this.anIntArray408[k] = stream.readUnsignedWord();
            ++k;
        }
    }

    private void readValuesOSRS(Stream stream) {
        int i;
        block0 : while ((i = stream.readUnsignedByte()) != 0) {
            if (i == 1) {
                this.anInt405 = stream.readUnsignedWord();
                continue;
            }
            if (i == 2) {
                this.anInt406 = stream.readUnsignedWord() + 20000;
                this.aAnimation_407 = AnimationDefinition.getAnim(this.anInt406);
                continue;
            }
            if (i == 4) {
                this.anInt410 = stream.readUnsignedWord();
                continue;
            }
            if (i == 5) {
                this.anInt411 = stream.readUnsignedWord();
                continue;
            }
            if (i == 6) {
                this.anInt412 = stream.readUnsignedWord();
                continue;
            }
            if (i == 7) {
                this.anInt413 = stream.readUnsignedWord();
                continue;
            }
            if (i == 8) {
                this.anInt414 = stream.readUnsignedWord();
                continue;
            }
            if (i == 40) {
                int j = stream.readUnsignedByte();
                int k = 0;
                do {
                    if (k >= j) continue block0;
                    this.anIntArray408[k] = stream.readUnsignedWord();
                    this.anIntArray409[k] = stream.readUnsignedWord();
                    ++k;
                } while (true);
            }
            System.out.println("Error unrecognised spotanim config code: " + i);
        }
        return;
    }

    public Model getModel() {
        Model model = (Model)aMRUNodes_415.insertFromCache(this.anInt404);
        if (model != null) {
            return model;
        }
        model = Model.fetchModel(this.anInt405, this.revisionType);
        if (model == null) {
            return null;
        }
        int i = 0;
        do {
            if (i >= 6) {
                aMRUNodes_415.removeFromCache(model, this.anInt404);
                return model;
            }
            if (this.anIntArray408[0] != 0) {
                model.reColor(this.anIntArray408[i], this.anIntArray409[i]);
            }
            ++i;
        } while (true);
    }

    private SpotAnim() {
    }

    public static void nullLoader() {
        cache = null;
        osrsCache = null;
        aMRUNodes_415 = null;
    }

    static {
        aMRUNodes_415 = new MRUNodes(30);
    }
}


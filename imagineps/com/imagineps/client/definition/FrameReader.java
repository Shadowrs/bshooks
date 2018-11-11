/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 */
package com.imagineps.client.definition;

import com.imagineps.client.Client;
import com.imagineps.client.Stream;
import com.imagineps.client.cache.OnDemandFetcher;
import com.imagineps.client.definition.RevisionType;
import com.imagineps.client.definition.SkinList;

public final class FrameReader {
    public static FrameReader[][][] animationDataList = new FrameReader[2][5000][0];
    public int anInt636;
    public SkinList aClass18_637;
    public int anInt638;
    public int[] anIntArray639;
    public int[] anIntArray640;
    public int[] anIntArray641;
    public int[] anIntArray642;

    public static FrameReader forId(int animationFrameId) {
        return FrameReader.forId(animationFrameId, RevisionType.DEFAULT);
    }

    public static FrameReader forId(int animationFrame, RevisionType type) {
        try {
            if (animationDataList == null) {
                return null;
            }
            int animationFileId = animationFrame >> 16;
            if (animationDataList[type.ordinal()][animationFileId].length != 0) return animationDataList[type.ordinal()][animationFileId][animationFrame &= 65535];
            Client.onDemandFetcher.loadMandatory(type.getAnimationCacheIndex() - 1, animationFileId);
            return animationDataList[type.ordinal()][animationFileId][animationFrame &= 65535];
        }
        catch (Exception animationFileId) {
            return null;
        }
    }

    public static void readCacheFile(byte[] animationData, int animationDataID, RevisionType type) {
        try {
            Stream buffer = new Stream(animationData);
            SkinList skins = new SkinList(buffer);
            int k1 = buffer.readUnsignedWord();
            FrameReader.animationDataList[type.ordinal()][animationDataID] = new FrameReader[k1];
            int[] ai = new int[500];
            int[] ai1 = new int[500];
            int[] ai2 = new int[500];
            int[] ai3 = new int[500];
            int l1 = 0;
            while (l1 < k1) {
                int i2 = buffer.readUnsignedWord();
                FrameReader frameReader = new FrameReader();
                FrameReader.animationDataList[type.ordinal()][animationDataID][i2] = frameReader;
                FrameReader animation = frameReader;
                animation.aClass18_637 = skins;
                int j2 = buffer.readUnsignedByte();
                int l2 = 0;
                int k2 = -1;
                for (int i3 = 0; i3 < j2; ++i3) {
                    int j3 = buffer.readUnsignedByte();
                    if (j3 <= 0) continue;
                    if (skins.anIntArray342[i3] != 0) {
                        for (int l3 = i3 - 1; l3 > k2; --l3) {
                            if (skins.anIntArray342[l3] != 0) {
                                continue;
                            }
                            ai[l2] = l3;
                            ai1[l2] = 0;
                            ai2[l2] = 0;
                            ai3[l2] = 0;
                            ++l2;
                            break;
                        }
                    }
                    ai[l2] = i3;
                    int c = 0;
                    if (skins.anIntArray342[i3] == 3) {
                        c = 128;
                    }
                    ai1[l2] = (j3 & 1) != 0 ? (int)((short)buffer.readShort2()) : c;
                    ai2[l2] = (j3 & 2) != 0 ? buffer.readShort2() : c;
                    ai3[l2] = (j3 & 4) != 0 ? buffer.readShort2() : c;
                    if (skins.anIntArray342[i3] == 2) {
                        ai1[l2] = ((ai1[l2] & 255) << 3) + (ai1[l2] >> 8 & 7);
                        ai2[l2] = ((ai2[l2] & 255) << 3) + (ai2[l2] >> 8 & 7);
                        ai3[l2] = ((ai3[l2] & 255) << 3) + (ai3[l2] >> 8 & 7);
                    }
                    k2 = i3;
                    ++l2;
                }
                animation.anInt638 = l2;
                animation.anIntArray639 = new int[l2];
                animation.anIntArray640 = new int[l2];
                animation.anIntArray641 = new int[l2];
                animation.anIntArray642 = new int[l2];
                for (int k3 = 0; k3 < l2; ++k3) {
                    animation.anIntArray639[k3] = ai[k3];
                    animation.anIntArray640[k3] = ai1[k3];
                    animation.anIntArray641[k3] = ai2[k3];
                    animation.anIntArray642[k3] = ai3[k3];
                }
                ++l1;
            }
            return;
        }
        catch (Exception buffer) {
            // empty catch block
        }
    }

    public static void nullLoader() {
        animationDataList = null;
    }

    public static boolean method532(int i) {
        if (i != -1) return false;
        return true;
    }
}


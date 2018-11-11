/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package com.imagineps.client.graphics;

import com.imagineps.client.Client;
import com.imagineps.client.Stream;
import com.imagineps.client.cache.OnDemandFetcher;

public final class Texture {
    private static Texture[] cache = new Texture[678];
    public int[][] mipmaps = new int[8][];
    private static double brightness;

    public static final Texture get(int index) {
        if (index < 0) return null;
        if (index >= cache.length) {
            return null;
        }
        if (cache[index] != null) return cache[index];
        Client.onDemandFetcher.loadMandatory(4, index);
        return null;
    }

    public static final void decode(int index, byte[] data) {
        Texture texture = Texture.cache[index] = new Texture();
        Stream buffer = new Stream(data);
        int width = buffer.readUnsignedWord();
        int height = buffer.readUnsignedWord();
        texture.mipmaps[0] = new int[16384];
        int y = 0;
        do {
            if (y >= height) {
                texture.generate();
                return;
            }
            for (int x = 0; x < width; ++x) {
                int rgb = buffer.read3Bytes();
                if (width <= 64 && height <= 64) {
                    int x2 = x << 1;
                    int y2 = y << 1;
                    texture.set(x2, y2, rgb);
                    texture.set(x2 + 1, y2, rgb);
                    texture.set(x2 + 1, y2 + 1, rgb);
                    texture.set(x2, y2 + 1, rgb);
                    continue;
                }
                texture.set(x, y, rgb);
            }
            ++y;
        } while (true);
    }

    public static void setBrightness(double value) {
        brightness = value;
    }

    private void set(int x, int y, int rgb) {
        if (x >= 128) return;
        if (y >= 128) return;
        this.mipmaps[0][x + (y << 7)] = Texture.adjustBrightness(rgb, brightness / 1.25);
    }

    private static int adjustBrightness(int rgb, double brightness) {
        int r = (int)(Math.pow((double)((double)(rgb >>> 16) / 256.0), (double)brightness) * 256.0) << 16;
        int g = (int)(Math.pow((double)((double)(rgb >>> 8 & 255) / 256.0), (double)brightness) * 256.0) << 8;
        int b = (int)(Math.pow((double)((double)(rgb & 255) / 256.0), (double)brightness) * 256.0);
        return r | g | b;
    }

    private void generate() {
        int level = 1;
        int size = 64;
        block0 : while (level < 8) {
            int[] src = this.mipmaps[level - 1];
            this.mipmaps[level] = new int[size * size];
            int[] dst = this.mipmaps[level];
            int x = 0;
            do {
                if (x < size) {
                } else {
                    size >>= 1;
                    src = null;
                    dst = null;
                    ++level;
                    continue block0;
                }
                for (int y = 0; y < size; ++y) {
                    double r = 0.0;
                    double g = 0.0;
                    double b = 0.0;
                    int count = 0;
                    for (int rgb : new int[]{src[x + (y * size << 1) << 1], src[(x + (y * size << 1) << 1) + 1], src[(x + (y * size << 1) << 1) + (size << 1)], src[(x + (y * size << 1) << 1) + (size << 1) + 1]}) {
                        if (rgb == 0) continue;
                        double dr = (double)(rgb >> 16 & 255) / 255.0;
                        double dg = (double)(rgb >> 8 & 255) / 255.0;
                        double db = (double)(rgb & 255) / 255.0;
                        r += dr * dr;
                        g += dg * dg;
                        b += db * db;
                        ++count;
                    }
                    if (count == 0) continue;
                    int ri = Math.round((float)(255.0f * (float)Math.sqrt((double)(r / (double)count))));
                    int gi = Math.round((float)(255.0f * (float)Math.sqrt((double)(g / (double)count))));
                    int bi = Math.round((float)(255.0f * (float)Math.sqrt((double)(b / (double)count))));
                    dst[x + y * size] = ri << 16 | gi << 8 | bi;
                }
                ++x;
            } while (true);
            break;
        }
        return;
    }

    public static final void reset() {
        cache = null;
    }
}


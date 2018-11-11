/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.String
 */
package com.imagineps.client.graphics;

import com.imagineps.client.Client;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.graphics.Background;
import com.imagineps.client.graphics.DrawingArea;

public class Rasterizer
extends DrawingArea {
    private static int mipmaps;
    public static int textureAmount;
    public static boolean aBoolean1462;
    private static boolean aBoolean1463;
    public static boolean aBoolean1464;
    public static int anInt1465;
    public static int textureInt1;
    public static int textureInt2;
    private static int[] anIntArray1468;
    public static final int[] anIntArray1469;
    public static int[] anIntArray1470;
    public static int[] anIntArray1471;
    public static int[] anIntArray1472;
    private static int anInt1473;
    public static Background[] aBackgroundArray1474s;
    private static boolean[] aBooleanArray1475;
    private static int[] anIntArray1476;
    private static int anInt1477;
    private static int[][][] anIntArrayArray1478;
    private static int[][][] anIntArrayArray1479;
    public static int[] anIntArray1480;
    public static int anInt1481;
    public static int[] anIntArray1482;
    private static int[][] anIntArrayArray1483;
    public static int newFogColor;
    public static int fogColor;

    public static void nullLoader() {
        anIntArray1468 = null;
        anIntArray1468 = null;
        anIntArray1470 = null;
        anIntArray1471 = null;
        anIntArray1472 = null;
        aBackgroundArray1474s = null;
        aBooleanArray1475 = null;
        anIntArray1476 = null;
        anIntArrayArray1478 = null;
        anIntArrayArray1479 = null;
        anIntArray1480 = null;
        anIntArray1482 = null;
        anIntArrayArray1483 = null;
    }

    public static void method364() {
        anIntArray1472 = new int[height];
        int j = 0;
        do {
            if (j >= height) {
                textureInt1 = width / 2;
                textureInt2 = height / 2;
                return;
            }
            Rasterizer.anIntArray1472[j] = width * j;
            ++j;
        } while (true);
    }

    public static final void clearDepthBuffer() {
        if (depthBuffer == null || depthBuffer.length != pixels.length) {
            depthBuffer = new float[pixels.length];
        }
        int index = 0;
        while (index < depthBuffer.length) {
            Rasterizer.depthBuffer[index] = 3500.0f;
            ++index;
        }
    }

    public static void method365(int width, int height) {
        anIntArray1472 = new int[height];
        int l = 0;
        do {
            if (l >= height) {
                textureInt1 = width / 2;
                textureInt2 = height / 2;
                return;
            }
            Rasterizer.anIntArray1472[l] = width * l;
            ++l;
        } while (true);
    }

    public static void method366() {
        anIntArrayArray1478 = null;
        int j = 0;
        while (j < textureAmount) {
            Rasterizer.anIntArrayArray1479[j] = null;
            ++j;
        }
    }

    public static void method367() {
        if (anIntArrayArray1478 != null) return;
        anInt1477 = 20;
        anIntArrayArray1478 = new int[anInt1477][][];
        for (int i = 0; i < anInt1477; ++i) {
            Rasterizer.anIntArrayArray1478[i] = new int[][]{new int[16384], new int[4096], new int[1024], new int[256], new int[64], new int[16], new int[4], new int[1]};
        }
        int k = 0;
        while (k < textureAmount) {
            Rasterizer.anIntArrayArray1479[k] = null;
            ++k;
        }
    }

    public static void method368(StreamLoader streamLoader) {
        anInt1473 = 0;
        int index = 0;
        while (index < textureAmount) {
            Rasterizer.aBackgroundArray1474s[index] = new Background(streamLoader, String.valueOf((int)index), 0);
            aBackgroundArray1474s[index].method357();
            ++anInt1473;
            ++index;
        }
    }

    public static int method369(int texture) {
        if (anIntArray1476[texture] != 0) {
            return anIntArray1476[texture];
        }
        int r = 0;
        int g = 0;
        int b = 0;
        int count = anIntArrayArray1483[texture].length;
        for (int index = 0; index < count; r += Rasterizer.anIntArrayArray1483[texture][index] >> 16 & 255, g += Rasterizer.anIntArrayArray1483[texture][index] >> 8 & 255, b += Rasterizer.anIntArrayArray1483[texture][index] & 255, ++index) {
        }
        int rgb = (r / count << 16) + (g / count << 8) + b / count;
        if ((rgb = Rasterizer.method373(rgb, 1.4)) == 0) {
            rgb = 1;
        }
        Rasterizer.anIntArray1476[texture] = rgb;
        return rgb;
    }

    public static void method370(int texture) {
        if (anIntArrayArray1479[texture] == null) {
            return;
        }
        Rasterizer.anIntArrayArray1478[Rasterizer.anInt1477++] = anIntArrayArray1479[texture];
        Rasterizer.anIntArrayArray1479[texture] = null;
    }

    private static int[][] method371(int texture) {
        int[][] texels;
        ++anInt1481;
        if (anIntArrayArray1479[texture] != null) {
            return anIntArrayArray1479[texture];
        }
        if (anInt1477 > 0) {
            texels = anIntArrayArray1478[--anInt1477];
            Rasterizer.anIntArrayArray1478[Rasterizer.anInt1477] = null;
        } else {
            int j = 0;
            int k = -1;
            for (int l = 0; l < anInt1473; ++l) {
                if (anIntArrayArray1479[l] == null || anIntArray1480[l] >= j && k != -1) continue;
                j = anIntArray1480[l];
                k = l;
            }
            texels = anIntArrayArray1479[k];
            Rasterizer.anIntArrayArray1479[k] = null;
        }
        Rasterizer.anIntArrayArray1479[texture] = texels;
        Background background = aBackgroundArray1474s[texture];
        int[] ai1 = anIntArrayArray1483[texture];
        if (background.anInt1452 != 64) {
            for (int k1 = 0; k1 < 16384; ++k1) {
                texels[0][k1] = ai1[background.aByteArray1450[k1]];
            }
        } else {
            for (int j1 = 0; j1 < 128; ++j1) {
                for (int j2 = 0; j2 < 128; ++j2) {
                    texels[0][j2 + (j1 << 7)] = ai1[background.aByteArray1450[(j2 >> 1) + (j1 >> 1 << 6)]];
                }
            }
        }
        Rasterizer.aBooleanArray1475[texture] = false;
        for (int l1 = 0; l1 < 16384; ++l1) {
            int[] arrn = texels[0];
            int n = l1;
            arrn[n] = arrn[n] & 16316671;
            int k2 = texels[0][l1];
            if (k2 != 0) continue;
            Rasterizer.aBooleanArray1475[texture] = true;
        }
        int level = 1;
        int size = 64;
        block5 : while (level < 8) {
            int[] src = texels[level - 1];
            int[] dst = texels[level];
            int x = 0;
            do {
                if (x < size) {
                } else {
                    size >>= 1;
                    ++level;
                    continue block5;
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
                    if (count != 0) {
                        int ri = Math.round((float)(255.0f * (float)Math.sqrt((double)(r / (double)count))));
                        int gi = Math.round((float)(255.0f * (float)Math.sqrt((double)(g / (double)count))));
                        int bi = Math.round((float)(255.0f * (float)Math.sqrt((double)(b / (double)count))));
                        dst[x + y * size] = ri << 16 | gi << 8 | bi;
                        continue;
                    }
                    dst[x + y * size] = 0;
                }
                ++x;
            } while (true);
            break;
        }
        return texels;
    }

    public static void method372(double value) {
        int pos = 0;
        int index = 0;
        do {
            if (index >= 512) break;
            double d1 = (double)(index / 8) / 64.0 + 0.0078125;
            double d2 = (double)(index & 7) / 8.0 + 0.0625;
            for (int i = 0; i < 128; ++i) {
                double c;
                double r = c = (double)i / 128.0;
                double g = c;
                double b = c;
                if (d2 != 0.0) {
                    double d7 = c < 0.5 ? c * (1.0 + d2) : c + d2 - c * d2;
                    double d8 = 2.0 * c - d7;
                    double d9 = d1 + 0.3333333333333333;
                    if (d9 > 1.0) {
                        d9 -= 1.0;
                    }
                    double d10 = d1;
                    double d11 = d1 - 0.3333333333333333;
                    if (d11 < 0.0) {
                        d11 += 1.0;
                    }
                    r = 6.0 * d9 < 1.0 ? d8 + (d7 - d8) * 6.0 * d9 : (2.0 * d9 < 1.0 ? d7 : (3.0 * d9 < 2.0 ? d8 + (d7 - d8) * (0.6666666666666666 - d9) * 6.0 : d8));
                    g = 6.0 * d10 < 1.0 ? d8 + (d7 - d8) * 6.0 * d10 : (2.0 * d10 < 1.0 ? d7 : (3.0 * d10 < 2.0 ? d8 + (d7 - d8) * (0.6666666666666666 - d10) * 6.0 : d8));
                    b = 6.0 * d11 < 1.0 ? d8 + (d7 - d8) * 6.0 * d11 : (2.0 * d11 < 1.0 ? d7 : (3.0 * d11 < 2.0 ? d8 + (d7 - d8) * (0.6666666666666666 - d11) * 6.0 : d8));
                }
                int red = (int)(r * 256.0);
                int green = (int)(g * 256.0);
                int blue = (int)(b * 256.0);
                int color = (red << 16) + (green << 8) + blue;
                if ((color = Rasterizer.method373(color, value)) == 0) {
                    color = 1;
                }
                Rasterizer.anIntArray1482[pos++] = color;
            }
            ++index;
        } while (true);
        for (index = 0; index < textureAmount; ++index) {
            if (aBackgroundArray1474s[index] == null) continue;
            int[] colors = Rasterizer.aBackgroundArray1474s[index].anIntArray1451;
            Rasterizer.anIntArrayArray1483[index] = new int[colors.length];
            for (int i = 0; i < colors.length; ++i) {
                Rasterizer.anIntArrayArray1483[index][i] = Rasterizer.method373(colors[i], value);
                if ((anIntArrayArray1483[index][i] & 16316671) != 0 || i == 0) continue;
                Rasterizer.anIntArrayArray1483[index][i] = 1;
            }
        }
        index = 0;
        while (index < textureAmount) {
            Rasterizer.method370(index);
            ++index;
        }
    }

    public static int method373(int color, double amt) {
        double red = (double)(color >> 16) / 256.0;
        double green = (double)(color >> 8 & 255) / 256.0;
        double blue = (double)(color & 255) / 256.0;
        red = Math.pow((double)red, (double)amt);
        green = Math.pow((double)green, (double)amt);
        blue = Math.pow((double)blue, (double)amt);
        int red2 = (int)(red * 256.0);
        int green2 = (int)(green * 256.0);
        int blue2 = (int)(blue * 256.0);
        return (red2 << 16) + (green2 << 8) + blue2;
    }

    public static void drawFog(int begin, int end) {
        float length = end - begin;
        int index = 0;
        while (index < pixels.length) {
            float factor = (depthBuffer[index] - (float)begin) / length;
            Rasterizer.pixels[index] = Rasterizer.blend(pixels[index], fogColor, factor);
            ++index;
        }
    }

    private static int blend(int c1, int c2, float factor) {
        if (factor >= 1.0f) {
            return c2;
        }
        if (factor <= 0.0f) {
            return c1;
        }
        int r1 = c1 >> 16 & 255;
        int g1 = c1 >> 8 & 255;
        int b1 = c1 & 255;
        int r2 = c2 >> 16 & 255;
        int g2 = c2 >> 8 & 255;
        int b2 = c2 & 255;
        int r3 = r2 - r1;
        int g3 = g2 - g1;
        int b3 = b2 - b1;
        int r = (int)((float)r1 + (float)r3 * factor);
        int g = (int)((float)g1 + (float)g3 * factor);
        int b = (int)((float)b1 + (float)b3 * factor);
        return (r << 16) + (g << 8) + b;
    }

    private static int texelPos(int defaultIndex, int mipmaps) {
        int x = (defaultIndex & 127) >> mipmaps;
        int y = defaultIndex >> 7 >> mipmaps;
        return x + (y << 7 - mipmaps);
    }

    public static void drawGouraudTriangle(int y1, int y2, int y3, int x1, int x2, int x3, int hsl1, int hsl2, int hsl3, float z1, float z2, float z3, int bufferOffset) {
        int rgb1 = anIntArray1482[hsl1];
        int rgb2 = anIntArray1482[hsl2];
        int rgb3 = anIntArray1482[hsl3];
        int r1 = rgb1 >> 16 & 255;
        int g1 = rgb1 >> 8 & 255;
        int b1 = rgb1 & 255;
        int r2 = rgb2 >> 16 & 255;
        int g2 = rgb2 >> 8 & 255;
        int b2 = rgb2 & 255;
        int r3 = rgb3 >> 16 & 255;
        int g3 = rgb3 >> 8 & 255;
        int b3 = rgb3 & 255;
        int dx1 = 0;
        int dr1 = 0;
        int dg1 = 0;
        int db1 = 0;
        if (y2 != y1) {
            dx1 = (x2 - x1 << 16) / (y2 - y1);
            dr1 = (r2 - r1 << 16) / (y2 - y1);
            dg1 = (g2 - g1 << 16) / (y2 - y1);
            db1 = (b2 - b1 << 16) / (y2 - y1);
        }
        int dx2 = 0;
        int dr2 = 0;
        int dg2 = 0;
        int db2 = 0;
        if (y3 != y2) {
            dx2 = (x3 - x2 << 16) / (y3 - y2);
            dr2 = (r3 - r2 << 16) / (y3 - y2);
            dg2 = (g3 - g2 << 16) / (y3 - y2);
            db2 = (b3 - b2 << 16) / (y3 - y2);
        }
        int dx3 = 0;
        int dr3 = 0;
        int dg3 = 0;
        int db3 = 0;
        if (y3 != y1) {
            dx3 = (x1 - x3 << 16) / (y1 - y3);
            dr3 = (r1 - r3 << 16) / (y1 - y3);
            dg3 = (g1 - g3 << 16) / (y1 - y3);
            db3 = (b1 - b3 << 16) / (y1 - y3);
        }
        float x21 = x2 - x1;
        float y32 = y2 - y1;
        float x31 = x3 - x1;
        float y31 = y3 - y1;
        float z21 = z2 - z1;
        float z31 = z3 - z1;
        float div = x21 * y31 - x31 * y32;
        float depthSlope = (z21 * y31 - z31 * y32) / div;
        float depthScale = (z31 * x21 - z21 * x31) / div;
        if (y1 <= y2 && y1 <= y3) {
            if (y1 >= DrawingArea.bottomY) {
                return;
            }
            if (y2 > DrawingArea.bottomY) {
                y2 = DrawingArea.bottomY;
            }
            if (y3 > DrawingArea.bottomY) {
                y3 = DrawingArea.bottomY;
            }
            z1 = z1 - depthSlope * (float)x1 + depthSlope;
            if (y2 < y3) {
                x3 = x1 <<= 16;
                r3 = r1 <<= 16;
                g3 = g1 <<= 16;
                b3 = b1 <<= 16;
                if (y1 < 0) {
                    x3 -= dx3 * y1;
                    x1 -= dx1 * y1;
                    r3 -= dr3 * y1;
                    g3 -= dg3 * y1;
                    b3 -= db3 * y1;
                    r1 -= dr1 * y1;
                    g1 -= dg1 * y1;
                    b1 -= db1 * y1;
                    z1 -= depthScale * (float)y1;
                    y1 = 0;
                }
                x2 <<= 16;
                r2 <<= 16;
                g2 <<= 16;
                b2 <<= 16;
                if (y2 < 0) {
                    x2 -= dx2 * y2;
                    r2 -= dr2 * y2;
                    g2 -= dg2 * y2;
                    b2 -= db2 * y2;
                    y2 = 0;
                }
                if (y1 != y2 && dx3 < dx1 || y1 == y2 && dx3 > dx2) {
                    y3 -= y2;
                    y2 -= y1;
                    y1 = anIntArray1472[y1];
                    do {
                        if (--y2 < 0) {
                            while (--y3 >= 0) {
                                Rasterizer.drawGouraudScanline(DrawingArea.pixels, y1, x3 >> 16, x2 >> 16, r3, g3, b3, r2, g2, b2, z1, depthSlope, bufferOffset);
                                x3 += dx3;
                                x2 += dx2;
                                r3 += dr3;
                                g3 += dg3;
                                b3 += db3;
                                r2 += dr2;
                                g2 += dg2;
                                b2 += db2;
                                y1 += DrawingArea.width;
                                z1 += depthScale;
                            }
                            return;
                        }
                        Rasterizer.drawGouraudScanline(DrawingArea.pixels, y1, x3 >> 16, x1 >> 16, r3, g3, b3, r1, g1, b1, z1, depthSlope, bufferOffset);
                        x3 += dx3;
                        x1 += dx1;
                        r3 += dr3;
                        g3 += dg3;
                        b3 += db3;
                        r1 += dr1;
                        g1 += dg1;
                        b1 += db1;
                        z1 += depthScale;
                        y1 += DrawingArea.width;
                    } while (true);
                }
                y3 -= y2;
                y2 -= y1;
                y1 = anIntArray1472[y1];
                do {
                    if (--y2 < 0) {
                        while (--y3 >= 0) {
                            Rasterizer.drawGouraudScanline(DrawingArea.pixels, y1, x2 >> 16, x3 >> 16, r2, g2, b2, r3, g3, b3, z1, depthSlope, bufferOffset);
                            x3 += dx3;
                            x2 += dx2;
                            r3 += dr3;
                            g3 += dg3;
                            b3 += db3;
                            r2 += dr2;
                            g2 += dg2;
                            b2 += db2;
                            y1 += DrawingArea.width;
                            z1 += depthScale;
                        }
                        return;
                    }
                    Rasterizer.drawGouraudScanline(DrawingArea.pixels, y1, x1 >> 16, x3 >> 16, r1, g1, b1, r3, g3, b3, z1, depthSlope, bufferOffset);
                    x3 += dx3;
                    x1 += dx1;
                    r3 += dr3;
                    g3 += dg3;
                    b3 += db3;
                    r1 += dr1;
                    g1 += dg1;
                    b1 += db1;
                    z1 += depthScale;
                    y1 += DrawingArea.width;
                } while (true);
            }
            x2 = x1 <<= 16;
            r2 = r1 <<= 16;
            g2 = g1 <<= 16;
            b2 = b1 <<= 16;
            if (y1 < 0) {
                x2 -= dx3 * y1;
                x1 -= dx1 * y1;
                r2 -= dr3 * y1;
                g2 -= dg3 * y1;
                b2 -= db3 * y1;
                r1 -= dr1 * y1;
                g1 -= dg1 * y1;
                b1 -= db1 * y1;
                z1 -= depthScale * (float)y1;
                y1 = 0;
            }
            x3 <<= 16;
            r3 <<= 16;
            g3 <<= 16;
            b3 <<= 16;
            if (y3 < 0) {
                x3 -= dx2 * y3;
                r3 -= dr2 * y3;
                g3 -= dg2 * y3;
                b3 -= db2 * y3;
                y3 = 0;
            }
            if (y1 != y3 && dx3 < dx1 || y1 == y3 && dx2 > dx1) {
                y2 -= y3;
                y3 -= y1;
                y1 = anIntArray1472[y1];
                do {
                    if (--y3 < 0) {
                        while (--y2 >= 0) {
                            Rasterizer.drawGouraudScanline(DrawingArea.pixels, y1, x3 >> 16, x1 >> 16, r3, g3, b3, r1, g1, b1, z1, depthSlope, bufferOffset);
                            x3 += dx2;
                            x1 += dx1;
                            r3 += dr2;
                            g3 += dg2;
                            b3 += db2;
                            r1 += dr1;
                            g1 += dg1;
                            b1 += db1;
                            y1 += DrawingArea.width;
                            z1 += depthScale;
                        }
                        return;
                    }
                    Rasterizer.drawGouraudScanline(DrawingArea.pixels, y1, x2 >> 16, x1 >> 16, r2, g2, b2, r1, g1, b1, z1, depthSlope, bufferOffset);
                    x2 += dx3;
                    x1 += dx1;
                    r2 += dr3;
                    g2 += dg3;
                    b2 += db3;
                    r1 += dr1;
                    g1 += dg1;
                    b1 += db1;
                    z1 += depthScale;
                    y1 += DrawingArea.width;
                } while (true);
            }
            y2 -= y3;
            y3 -= y1;
            y1 = anIntArray1472[y1];
            do {
                if (--y3 < 0) {
                    while (--y2 >= 0) {
                        Rasterizer.drawGouraudScanline(DrawingArea.pixels, y1, x1 >> 16, x3 >> 16, r1, g1, b1, r3, g3, b3, z1, depthSlope, bufferOffset);
                        x3 += dx2;
                        x1 += dx1;
                        r3 += dr2;
                        g3 += dg2;
                        b3 += db2;
                        r1 += dr1;
                        g1 += dg1;
                        b1 += db1;
                        y1 += DrawingArea.width;
                        z1 += depthScale;
                    }
                    return;
                }
                Rasterizer.drawGouraudScanline(DrawingArea.pixels, y1, x1 >> 16, x2 >> 16, r1, g1, b1, r2, g2, b2, z1, depthSlope, bufferOffset);
                x2 += dx3;
                x1 += dx1;
                r2 += dr3;
                g2 += dg3;
                b2 += db3;
                r1 += dr1;
                g1 += dg1;
                b1 += db1;
                z1 += depthScale;
                y1 += DrawingArea.width;
            } while (true);
        }
        if (y2 <= y3) {
            if (y2 >= DrawingArea.bottomY) {
                return;
            }
            if (y3 > DrawingArea.bottomY) {
                y3 = DrawingArea.bottomY;
            }
            if (y1 > DrawingArea.bottomY) {
                y1 = DrawingArea.bottomY;
            }
            z2 = z2 - depthSlope * (float)x2 + depthSlope;
            if (y3 < y1) {
                x1 = x2 <<= 16;
                r1 = r2 <<= 16;
                g1 = g2 <<= 16;
                b1 = b2 <<= 16;
                if (y2 < 0) {
                    x1 -= dx1 * y2;
                    x2 -= dx2 * y2;
                    r1 -= dr1 * y2;
                    g1 -= dg1 * y2;
                    b1 -= db1 * y2;
                    r2 -= dr2 * y2;
                    g2 -= dg2 * y2;
                    b2 -= db2 * y2;
                    z2 -= depthScale * (float)y2;
                    y2 = 0;
                }
                x3 <<= 16;
                r3 <<= 16;
                g3 <<= 16;
                b3 <<= 16;
                if (y3 < 0) {
                    x3 -= dx3 * y3;
                    r3 -= dr3 * y3;
                    g3 -= dg3 * y3;
                    b3 -= db3 * y3;
                    y3 = 0;
                }
                if (y2 != y3 && dx1 < dx2 || y2 == y3 && dx1 > dx3) {
                    y1 -= y3;
                    y3 -= y2;
                    y2 = anIntArray1472[y2];
                    do {
                        if (--y3 < 0) {
                            while (--y1 >= 0) {
                                Rasterizer.drawGouraudScanline(DrawingArea.pixels, y2, x1 >> 16, x3 >> 16, r1, g1, b1, r3, g3, b3, z2, depthSlope, bufferOffset);
                                x1 += dx1;
                                x3 += dx3;
                                r1 += dr1;
                                g1 += dg1;
                                b1 += db1;
                                r3 += dr3;
                                g3 += dg3;
                                b3 += db3;
                                y2 += DrawingArea.width;
                                z2 += depthScale;
                            }
                            return;
                        }
                        Rasterizer.drawGouraudScanline(DrawingArea.pixels, y2, x1 >> 16, x2 >> 16, r1, g1, b1, r2, g2, b2, z2, depthSlope, bufferOffset);
                        x1 += dx1;
                        x2 += dx2;
                        r1 += dr1;
                        g1 += dg1;
                        b1 += db1;
                        r2 += dr2;
                        g2 += dg2;
                        b2 += db2;
                        z2 += depthScale;
                        y2 += DrawingArea.width;
                    } while (true);
                }
                y1 -= y3;
                y3 -= y2;
                y2 = anIntArray1472[y2];
                do {
                    if (--y3 < 0) {
                        while (--y1 >= 0) {
                            Rasterizer.drawGouraudScanline(DrawingArea.pixels, y2, x3 >> 16, x1 >> 16, r3, g3, b3, r1, g1, b1, z2, depthSlope, bufferOffset);
                            x1 += dx1;
                            x3 += dx3;
                            r1 += dr1;
                            g1 += dg1;
                            b1 += db1;
                            r3 += dr3;
                            g3 += dg3;
                            b3 += db3;
                            y2 += DrawingArea.width;
                            z2 += depthScale;
                        }
                        return;
                    }
                    Rasterizer.drawGouraudScanline(DrawingArea.pixels, y2, x2 >> 16, x1 >> 16, r2, g2, b2, r1, g1, b1, z2, depthSlope, bufferOffset);
                    x1 += dx1;
                    x2 += dx2;
                    r1 += dr1;
                    g1 += dg1;
                    b1 += db1;
                    r2 += dr2;
                    g2 += dg2;
                    b2 += db2;
                    z2 += depthScale;
                    y2 += DrawingArea.width;
                } while (true);
            }
            x3 = x2 <<= 16;
            r3 = r2 <<= 16;
            g3 = g2 <<= 16;
            b3 = b2 <<= 16;
            if (y2 < 0) {
                x3 -= dx1 * y2;
                x2 -= dx2 * y2;
                r3 -= dr1 * y2;
                g3 -= dg1 * y2;
                b3 -= db1 * y2;
                r2 -= dr2 * y2;
                g2 -= dg2 * y2;
                b2 -= db2 * y2;
                z2 -= depthScale * (float)y2;
                y2 = 0;
            }
            x1 <<= 16;
            r1 <<= 16;
            g1 <<= 16;
            b1 <<= 16;
            if (y1 < 0) {
                x1 -= dx3 * y1;
                r1 -= dr3 * y1;
                g1 -= dg3 * y1;
                b1 -= db3 * y1;
                y1 = 0;
            }
            if (dx1 < dx2) {
                y3 -= y1;
                y1 -= y2;
                y2 = anIntArray1472[y2];
                do {
                    if (--y1 < 0) {
                        while (--y3 >= 0) {
                            Rasterizer.drawGouraudScanline(DrawingArea.pixels, y2, x1 >> 16, x2 >> 16, r1, g1, b1, r2, g2, b2, z2, depthSlope, bufferOffset);
                            x1 += dx3;
                            x2 += dx2;
                            r1 += dr3;
                            g1 += dg3;
                            b1 += db3;
                            r2 += dr2;
                            g2 += dg2;
                            b2 += db2;
                            y2 += DrawingArea.width;
                            z2 += depthScale;
                        }
                        return;
                    }
                    Rasterizer.drawGouraudScanline(DrawingArea.pixels, y2, x3 >> 16, x2 >> 16, r3, g3, b3, r2, g2, b2, z2, depthSlope, bufferOffset);
                    x3 += dx1;
                    x2 += dx2;
                    r3 += dr1;
                    g3 += dg1;
                    b3 += db1;
                    r2 += dr2;
                    g2 += dg2;
                    b2 += db2;
                    z2 += depthScale;
                    y2 += DrawingArea.width;
                } while (true);
            }
            y3 -= y1;
            y1 -= y2;
            y2 = anIntArray1472[y2];
            do {
                if (--y1 < 0) {
                    while (--y3 >= 0) {
                        Rasterizer.drawGouraudScanline(DrawingArea.pixels, y2, x2 >> 16, x1 >> 16, r2, g2, b2, r1, g1, b1, z2, depthSlope, bufferOffset);
                        x1 += dx3;
                        x2 += dx2;
                        r1 += dr3;
                        g1 += dg3;
                        b1 += db3;
                        r2 += dr2;
                        g2 += dg2;
                        b2 += db2;
                        y2 += DrawingArea.width;
                        z2 += depthScale;
                    }
                    return;
                }
                Rasterizer.drawGouraudScanline(DrawingArea.pixels, y2, x2 >> 16, x3 >> 16, r2, g2, b2, r3, g3, b3, z2, depthSlope, bufferOffset);
                x3 += dx1;
                x2 += dx2;
                r3 += dr1;
                g3 += dg1;
                b3 += db1;
                r2 += dr2;
                g2 += dg2;
                b2 += db2;
                z2 += depthScale;
                y2 += DrawingArea.width;
            } while (true);
        }
        if (y3 >= DrawingArea.bottomY) {
            return;
        }
        if (y1 > DrawingArea.bottomY) {
            y1 = DrawingArea.bottomY;
        }
        if (y2 > DrawingArea.bottomY) {
            y2 = DrawingArea.bottomY;
        }
        z3 = z3 - depthSlope * (float)x3 + depthSlope;
        if (y1 < y2) {
            x2 = x3 <<= 16;
            r2 = r3 <<= 16;
            g2 = g3 <<= 16;
            b2 = b3 <<= 16;
            if (y3 < 0) {
                x2 -= dx2 * y3;
                x3 -= dx3 * y3;
                r2 -= dr2 * y3;
                g2 -= dg2 * y3;
                b2 -= db2 * y3;
                r3 -= dr3 * y3;
                g3 -= dg3 * y3;
                b3 -= db3 * y3;
                z3 -= depthScale * (float)y3;
                y3 = 0;
            }
            x1 <<= 16;
            r1 <<= 16;
            g1 <<= 16;
            b1 <<= 16;
            if (y1 < 0) {
                x1 -= dx1 * y1;
                r1 -= dr1 * y1;
                g1 -= dg1 * y1;
                b1 -= db1 * y1;
                y1 = 0;
            }
            if (dx2 < dx3) {
                y2 -= y1;
                y1 -= y3;
                y3 = anIntArray1472[y3];
                do {
                    if (--y1 < 0) {
                        while (--y2 >= 0) {
                            Rasterizer.drawGouraudScanline(DrawingArea.pixels, y3, x2 >> 16, x1 >> 16, r2, g2, b2, r1, g1, b1, z3, depthSlope, bufferOffset);
                            x2 += dx2;
                            x1 += dx1;
                            r2 += dr2;
                            g2 += dg2;
                            b2 += db2;
                            r1 += dr1;
                            g1 += dg1;
                            b1 += db1;
                            y3 += DrawingArea.width;
                            z3 += depthScale;
                        }
                        return;
                    }
                    Rasterizer.drawGouraudScanline(DrawingArea.pixels, y3, x2 >> 16, x3 >> 16, r2, g2, b2, r3, g3, b3, z3, depthSlope, bufferOffset);
                    x2 += dx2;
                    x3 += dx3;
                    r2 += dr2;
                    g2 += dg2;
                    b2 += db2;
                    r3 += dr3;
                    g3 += dg3;
                    b3 += db3;
                    z3 += depthScale;
                    y3 += DrawingArea.width;
                } while (true);
            }
            y2 -= y1;
            y1 -= y3;
            y3 = anIntArray1472[y3];
            do {
                if (--y1 < 0) {
                    while (--y2 >= 0) {
                        Rasterizer.drawGouraudScanline(DrawingArea.pixels, y3, x1 >> 16, x2 >> 16, r1, g1, b1, r2, g2, b2, z3, depthSlope, bufferOffset);
                        x2 += dx2;
                        x1 += dx1;
                        r2 += dr2;
                        g2 += dg2;
                        b2 += db2;
                        r1 += dr1;
                        g1 += dg1;
                        b1 += db1;
                        z3 += depthScale;
                        y3 += DrawingArea.width;
                    }
                    return;
                }
                Rasterizer.drawGouraudScanline(DrawingArea.pixels, y3, x3 >> 16, x2 >> 16, r3, g3, b3, r2, g2, b2, z3, depthSlope, bufferOffset);
                x2 += dx2;
                x3 += dx3;
                r2 += dr2;
                g2 += dg2;
                b2 += db2;
                r3 += dr3;
                g3 += dg3;
                b3 += db3;
                z3 += depthScale;
                y3 += DrawingArea.width;
            } while (true);
        }
        x1 = x3 <<= 16;
        r1 = r3 <<= 16;
        g1 = g3 <<= 16;
        b1 = b3 <<= 16;
        if (y3 < 0) {
            x1 -= dx2 * y3;
            x3 -= dx3 * y3;
            r1 -= dr2 * y3;
            g1 -= dg2 * y3;
            b1 -= db2 * y3;
            r3 -= dr3 * y3;
            g3 -= dg3 * y3;
            b3 -= db3 * y3;
            z3 -= depthScale * (float)y3;
            y3 = 0;
        }
        x2 <<= 16;
        r2 <<= 16;
        g2 <<= 16;
        b2 <<= 16;
        if (y2 < 0) {
            x2 -= dx1 * y2;
            r2 -= dr1 * y2;
            g2 -= dg1 * y2;
            b2 -= db1 * y2;
            y2 = 0;
        }
        if (dx2 < dx3) {
            y1 -= y2;
            y2 -= y3;
            y3 = anIntArray1472[y3];
            do {
                if (--y2 < 0) {
                    while (--y1 >= 0) {
                        Rasterizer.drawGouraudScanline(DrawingArea.pixels, y3, x2 >> 16, x3 >> 16, r2, g2, b2, r3, g3, b3, z3, depthSlope, bufferOffset);
                        x2 += dx1;
                        x3 += dx3;
                        r2 += dr1;
                        g2 += dg1;
                        b2 += db1;
                        r3 += dr3;
                        g3 += dg3;
                        b3 += db3;
                        z3 += depthScale;
                        y3 += DrawingArea.width;
                    }
                    return;
                }
                Rasterizer.drawGouraudScanline(DrawingArea.pixels, y3, x1 >> 16, x3 >> 16, r1, g1, b1, r3, g3, b3, z3, depthSlope, bufferOffset);
                x1 += dx2;
                x3 += dx3;
                r1 += dr2;
                g1 += dg2;
                b1 += db2;
                r3 += dr3;
                g3 += dg3;
                b3 += db3;
                z3 += depthScale;
                y3 += DrawingArea.width;
            } while (true);
        }
        y1 -= y2;
        y2 -= y3;
        y3 = anIntArray1472[y3];
        do {
            if (--y2 < 0) {
                while (--y1 >= 0) {
                    Rasterizer.drawGouraudScanline(DrawingArea.pixels, y3, x3 >> 16, x2 >> 16, r3, g3, b3, r2, g2, b2, z3, depthSlope, bufferOffset);
                    x2 += dx1;
                    x3 += dx3;
                    r2 += dr1;
                    g2 += dg1;
                    b2 += db1;
                    r3 += dr3;
                    g3 += dg3;
                    b3 += db3;
                    y3 += DrawingArea.width;
                    z3 += depthScale;
                }
                return;
            }
            Rasterizer.drawGouraudScanline(DrawingArea.pixels, y3, x3 >> 16, x1 >> 16, r3, g3, b3, r1, g1, b1, z3, depthSlope, bufferOffset);
            x1 += dx2;
            x3 += dx3;
            r1 += dr2;
            g1 += dg2;
            b1 += db2;
            r3 += dr3;
            g3 += dg3;
            b3 += db3;
            z3 += depthScale;
            y3 += DrawingArea.width;
        } while (true);
    }

    public static void drawGouraudScanline(int[] dest, int offset, int x1, int x2, int r1, int g1, int b1, int r2, int g2, int b2, float z1, float z2, int bufferOffset) {
        int n = x2 - x1;
        if (n <= 0) {
            return;
        }
        r2 = (r2 - r1) / n;
        g2 = (g2 - g1) / n;
        b2 = (b2 - b1) / n;
        if (aBoolean1462) {
            if (x2 > DrawingArea.centerX) {
                n -= x2 - DrawingArea.centerX;
                x2 = DrawingArea.centerX;
            }
            if (x1 < 0) {
                n = x2;
                r1 -= x1 * r2;
                g1 -= x1 * g2;
                b1 -= x1 * b2;
                x1 = 0;
            }
        }
        if (x1 >= x2) return;
        offset += x1;
        z1 += z2 * (float)x1;
        if (anInt1465 == 0) {
            while (--n >= 0) {
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = r1 & 16711680 | g1 >> 8 & 65280 | b1 >> 16 & 255;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                z1 += z2;
                r1 += r2;
                g1 += g2;
                b1 += b2;
                ++offset;
            }
            return;
        }
        int a1 = anInt1465;
        int a2 = 256 - anInt1465;
        while (--n >= 0) {
            int rgb = r1 & 16711680 | g1 >> 8 & 65280 | b1 >> 16 & 255;
            rgb = ((rgb & 16711935) * a2 >> 8 & 16711935) + ((rgb & 65280) * a2 >> 8 & 65280);
            int dst = dest[offset];
            if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                dest[offset] = rgb + ((dst & 16711935) * a1 >> 8 & 16711935) + ((dst & 65280) * a1 >> 8 & 65280);
                Rasterizer.depthBuffer[offset] = z1;
            }
            ++offset;
            z1 += z2;
            r1 += r2;
            g1 += g2;
            b1 += b2;
        }
    }

    public static void drawFlatTriangle(int y1, int y2, int y3, int x1, int x2, int x3, int rgb, float z1, float z2, float z3, int bufferOffset) {
        int dx1 = 0;
        if (y2 != y1) {
            dx1 = (x2 - x1 << 16) / (y2 - y1);
        }
        int dx2 = 0;
        if (y3 != y2) {
            dx2 = (x3 - x2 << 16) / (y3 - y2);
        }
        int dx3 = 0;
        if (y3 != y1) {
            dx3 = (x1 - x3 << 16) / (y1 - y3);
        }
        float x21 = x2 - x1;
        float y32 = y2 - y1;
        float x31 = x3 - x1;
        float y31 = y3 - y1;
        float z21 = z2 - z1;
        float z31 = z3 - z1;
        float div = x21 * y31 - x31 * y32;
        float depthSlope = (z21 * y31 - z31 * y32) / div;
        float depthScale = (z31 * x21 - z21 * x31) / div;
        if (y1 <= y2 && y1 <= y3) {
            if (y1 >= DrawingArea.bottomY) {
                return;
            }
            if (y2 > DrawingArea.bottomY) {
                y2 = DrawingArea.bottomY;
            }
            if (y3 > DrawingArea.bottomY) {
                y3 = DrawingArea.bottomY;
            }
            z1 = z1 - depthSlope * (float)x1 + depthSlope;
            if (y2 < y3) {
                x3 = x1 <<= 16;
                if (y1 < 0) {
                    x3 -= dx3 * y1;
                    x1 -= dx1 * y1;
                    z1 -= depthScale * (float)y1;
                    y1 = 0;
                }
                x2 <<= 16;
                if (y2 < 0) {
                    x2 -= dx2 * y2;
                    y2 = 0;
                }
                if (y1 != y2 && dx3 < dx1 || y1 == y2 && dx3 > dx2) {
                    y3 -= y2;
                    y2 -= y1;
                    y1 = anIntArray1472[y1];
                    do {
                        if (--y2 < 0) {
                            while (--y3 >= 0) {
                                Rasterizer.drawFlatScanline(DrawingArea.pixels, y1, rgb, x3 >> 16, x2 >> 16, z1, depthSlope, bufferOffset);
                                z1 += depthScale;
                                x3 += dx3;
                                x2 += dx2;
                                y1 += DrawingArea.width;
                            }
                            return;
                        }
                        Rasterizer.drawFlatScanline(DrawingArea.pixels, y1, rgb, x3 >> 16, x1 >> 16, z1, depthSlope, bufferOffset);
                        z1 += depthScale;
                        x3 += dx3;
                        x1 += dx1;
                        y1 += DrawingArea.width;
                    } while (true);
                }
                y3 -= y2;
                y2 -= y1;
                y1 = anIntArray1472[y1];
                do {
                    if (--y2 < 0) {
                        while (--y3 >= 0) {
                            Rasterizer.drawFlatScanline(DrawingArea.pixels, y1, rgb, x2 >> 16, x3 >> 16, z1, depthSlope, bufferOffset);
                            z1 += depthScale;
                            x3 += dx3;
                            x2 += dx2;
                            y1 += DrawingArea.width;
                        }
                        return;
                    }
                    Rasterizer.drawFlatScanline(DrawingArea.pixels, y1, rgb, x1 >> 16, x3 >> 16, z1, depthSlope, bufferOffset);
                    z1 += depthScale;
                    x3 += dx3;
                    x1 += dx1;
                    y1 += DrawingArea.width;
                } while (true);
            }
            x2 = x1 <<= 16;
            if (y1 < 0) {
                x2 -= dx3 * y1;
                x1 -= dx1 * y1;
                z1 -= depthScale * (float)y1;
                y1 = 0;
            }
            x3 <<= 16;
            if (y3 < 0) {
                x3 -= dx2 * y3;
                y3 = 0;
            }
            if (y1 != y3 && dx3 < dx1 || y1 == y3 && dx2 > dx1) {
                y2 -= y3;
                y3 -= y1;
                y1 = anIntArray1472[y1];
                do {
                    if (--y3 < 0) {
                        while (--y2 >= 0) {
                            Rasterizer.drawFlatScanline(DrawingArea.pixels, y1, rgb, x3 >> 16, x1 >> 16, z1, depthSlope, bufferOffset);
                            z1 += depthScale;
                            x3 += dx2;
                            x1 += dx1;
                            y1 += DrawingArea.width;
                        }
                        return;
                    }
                    Rasterizer.drawFlatScanline(DrawingArea.pixels, y1, rgb, x2 >> 16, x1 >> 16, z1, depthSlope, bufferOffset);
                    z1 += depthScale;
                    x2 += dx3;
                    x1 += dx1;
                    y1 += DrawingArea.width;
                } while (true);
            }
            y2 -= y3;
            y3 -= y1;
            y1 = anIntArray1472[y1];
            do {
                if (--y3 < 0) {
                    while (--y2 >= 0) {
                        Rasterizer.drawFlatScanline(DrawingArea.pixels, y1, rgb, x1 >> 16, x3 >> 16, z1, depthSlope, bufferOffset);
                        z1 += depthScale;
                        x3 += dx2;
                        x1 += dx1;
                        y1 += DrawingArea.width;
                    }
                    return;
                }
                Rasterizer.drawFlatScanline(DrawingArea.pixels, y1, rgb, x1 >> 16, x2 >> 16, z1, depthSlope, bufferOffset);
                z1 += depthScale;
                x2 += dx3;
                x1 += dx1;
                y1 += DrawingArea.width;
            } while (true);
        }
        if (y2 <= y3) {
            if (y2 >= DrawingArea.bottomY) {
                return;
            }
            if (y3 > DrawingArea.bottomY) {
                y3 = DrawingArea.bottomY;
            }
            if (y1 > DrawingArea.bottomY) {
                y1 = DrawingArea.bottomY;
            }
            z2 = z2 - depthSlope * (float)x2 + depthSlope;
            if (y3 < y1) {
                x1 = x2 <<= 16;
                if (y2 < 0) {
                    x1 -= dx1 * y2;
                    x2 -= dx2 * y2;
                    z2 -= depthScale * (float)y2;
                    y2 = 0;
                }
                x3 <<= 16;
                if (y3 < 0) {
                    x3 -= dx3 * y3;
                    y3 = 0;
                }
                if (y2 != y3 && dx1 < dx2 || y2 == y3 && dx1 > dx3) {
                    y1 -= y3;
                    y3 -= y2;
                    y2 = anIntArray1472[y2];
                    do {
                        if (--y3 < 0) {
                            while (--y1 >= 0) {
                                Rasterizer.drawFlatScanline(DrawingArea.pixels, y2, rgb, x1 >> 16, x3 >> 16, z2, depthSlope, bufferOffset);
                                z2 += depthScale;
                                x1 += dx1;
                                x3 += dx3;
                                y2 += DrawingArea.width;
                            }
                            return;
                        }
                        Rasterizer.drawFlatScanline(DrawingArea.pixels, y2, rgb, x1 >> 16, x2 >> 16, z2, depthSlope, bufferOffset);
                        z2 += depthScale;
                        x1 += dx1;
                        x2 += dx2;
                        y2 += DrawingArea.width;
                    } while (true);
                }
                y1 -= y3;
                y3 -= y2;
                y2 = anIntArray1472[y2];
                do {
                    if (--y3 < 0) {
                        while (--y1 >= 0) {
                            Rasterizer.drawFlatScanline(DrawingArea.pixels, y2, rgb, x3 >> 16, x1 >> 16, z2, depthSlope, bufferOffset);
                            z2 += depthScale;
                            x1 += dx1;
                            x3 += dx3;
                            y2 += DrawingArea.width;
                        }
                        return;
                    }
                    Rasterizer.drawFlatScanline(DrawingArea.pixels, y2, rgb, x2 >> 16, x1 >> 16, z2, depthSlope, bufferOffset);
                    z2 += depthScale;
                    x1 += dx1;
                    x2 += dx2;
                    y2 += DrawingArea.width;
                } while (true);
            }
            x3 = x2 <<= 16;
            if (y2 < 0) {
                x3 -= dx1 * y2;
                x2 -= dx2 * y2;
                z2 -= depthScale * (float)y2;
                y2 = 0;
            }
            x1 <<= 16;
            if (y1 < 0) {
                x1 -= dx3 * y1;
                y1 = 0;
            }
            if (dx1 < dx2) {
                y3 -= y1;
                y1 -= y2;
                y2 = anIntArray1472[y2];
                do {
                    if (--y1 < 0) {
                        while (--y3 >= 0) {
                            Rasterizer.drawFlatScanline(DrawingArea.pixels, y2, rgb, x1 >> 16, x2 >> 16, z2, depthSlope, bufferOffset);
                            z2 += depthScale;
                            x1 += dx3;
                            x2 += dx2;
                            y2 += DrawingArea.width;
                        }
                        return;
                    }
                    Rasterizer.drawFlatScanline(DrawingArea.pixels, y2, rgb, x3 >> 16, x2 >> 16, z2, depthSlope, bufferOffset);
                    z2 += depthScale;
                    x3 += dx1;
                    x2 += dx2;
                    y2 += DrawingArea.width;
                } while (true);
            }
            y3 -= y1;
            y1 -= y2;
            y2 = anIntArray1472[y2];
            do {
                if (--y1 < 0) {
                    while (--y3 >= 0) {
                        Rasterizer.drawFlatScanline(DrawingArea.pixels, y2, rgb, x2 >> 16, x1 >> 16, z2, depthSlope, bufferOffset);
                        z2 += depthScale;
                        x1 += dx3;
                        x2 += dx2;
                        y2 += DrawingArea.width;
                    }
                    return;
                }
                Rasterizer.drawFlatScanline(DrawingArea.pixels, y2, rgb, x2 >> 16, x3 >> 16, z2, depthSlope, bufferOffset);
                z2 += depthScale;
                x3 += dx1;
                x2 += dx2;
                y2 += DrawingArea.width;
            } while (true);
        }
        if (y3 >= DrawingArea.bottomY) {
            return;
        }
        if (y1 > DrawingArea.bottomY) {
            y1 = DrawingArea.bottomY;
        }
        if (y2 > DrawingArea.bottomY) {
            y2 = DrawingArea.bottomY;
        }
        z3 = z3 - depthSlope * (float)x3 + depthSlope;
        if (y1 < y2) {
            x2 = x3 <<= 16;
            if (y3 < 0) {
                x2 -= dx2 * y3;
                x3 -= dx3 * y3;
                z3 -= depthScale * (float)y3;
                y3 = 0;
            }
            x1 <<= 16;
            if (y1 < 0) {
                x1 -= dx1 * y1;
                y1 = 0;
            }
            if (dx2 < dx3) {
                y2 -= y1;
                y1 -= y3;
                y3 = anIntArray1472[y3];
                do {
                    if (--y1 < 0) {
                        while (--y2 >= 0) {
                            Rasterizer.drawFlatScanline(DrawingArea.pixels, y3, rgb, x2 >> 16, x1 >> 16, z3, depthSlope, bufferOffset);
                            z3 += depthScale;
                            x2 += dx2;
                            x1 += dx1;
                            y3 += DrawingArea.width;
                        }
                        return;
                    }
                    Rasterizer.drawFlatScanline(DrawingArea.pixels, y3, rgb, x2 >> 16, x3 >> 16, z3, depthSlope, bufferOffset);
                    z3 += depthScale;
                    x2 += dx2;
                    x3 += dx3;
                    y3 += DrawingArea.width;
                } while (true);
            }
            y2 -= y1;
            y1 -= y3;
            y3 = anIntArray1472[y3];
            do {
                if (--y1 < 0) {
                    while (--y2 >= 0) {
                        Rasterizer.drawFlatScanline(DrawingArea.pixels, y3, rgb, x1 >> 16, x2 >> 16, z3, depthSlope, bufferOffset);
                        z3 += depthScale;
                        x2 += dx2;
                        x1 += dx1;
                        y3 += DrawingArea.width;
                    }
                    return;
                }
                Rasterizer.drawFlatScanline(DrawingArea.pixels, y3, rgb, x3 >> 16, x2 >> 16, z3, depthSlope, bufferOffset);
                z3 += depthScale;
                x2 += dx2;
                x3 += dx3;
                y3 += DrawingArea.width;
            } while (true);
        }
        x1 = x3 <<= 16;
        if (y3 < 0) {
            x1 -= dx2 * y3;
            x3 -= dx3 * y3;
            z3 -= depthScale * (float)y3;
            y3 = 0;
        }
        x2 <<= 16;
        if (y2 < 0) {
            x2 -= dx1 * y2;
            y2 = 0;
        }
        if (dx2 < dx3) {
            y1 -= y2;
            y2 -= y3;
            y3 = anIntArray1472[y3];
            do {
                if (--y2 < 0) {
                    while (--y1 >= 0) {
                        Rasterizer.drawFlatScanline(DrawingArea.pixels, y3, rgb, x2 >> 16, x3 >> 16, z3, depthSlope, bufferOffset);
                        z3 += depthScale;
                        x2 += dx1;
                        x3 += dx3;
                        y3 += DrawingArea.width;
                    }
                    return;
                }
                Rasterizer.drawFlatScanline(DrawingArea.pixels, y3, rgb, x1 >> 16, x3 >> 16, z3, depthSlope, bufferOffset);
                z3 += depthScale;
                x1 += dx2;
                x3 += dx3;
                y3 += DrawingArea.width;
            } while (true);
        }
        y1 -= y2;
        y2 -= y3;
        y3 = anIntArray1472[y3];
        do {
            if (--y2 < 0) {
                while (--y1 >= 0) {
                    Rasterizer.drawFlatScanline(DrawingArea.pixels, y3, rgb, x3 >> 16, x2 >> 16, z3, depthSlope, bufferOffset);
                    z3 += depthScale;
                    x2 += dx1;
                    x3 += dx3;
                    y3 += DrawingArea.width;
                }
                return;
            }
            Rasterizer.drawFlatScanline(DrawingArea.pixels, y3, rgb, x3 >> 16, x1 >> 16, z3, depthSlope, bufferOffset);
            z3 += depthScale;
            x1 += dx2;
            x3 += dx3;
            y3 += DrawingArea.width;
        } while (true);
    }

    private static void drawFlatScanline(int[] dest, int offset, int rgb, int x1, int x2, float z1, float z2, int bufferOffset) {
        if (x1 >= x2) {
            return;
        }
        if (aBoolean1462) {
            if (x2 > DrawingArea.centerX) {
                x2 = DrawingArea.centerX;
            }
            if (x1 < 0) {
                x1 = 0;
            }
        }
        if (x1 >= x2) {
            return;
        }
        offset += x1;
        z1 += z2 * (float)x1;
        int n = x2 - x1;
        if (anInt1465 == 0) {
            while (--n >= 0) {
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = rgb;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                z1 += z2;
                ++offset;
            }
            return;
        }
        int a1 = anInt1465;
        int a2 = 256 - anInt1465;
        rgb = ((rgb & 16711935) * a2 >> 8 & 16711935) + ((rgb & 65280) * a2 >> 8 & 65280);
        while (--n >= 0) {
            if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                dest[offset] = rgb + ((dest[offset] & 16711935) * a1 >> 8 & 16711935) + ((dest[offset] & 65280) * a1 >> 8 & 65280);
                if (anInt1465 < 200) {
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
        }
    }

    public static void drawTexturedTriangle(int y1, int y2, int y3, int x1, int x2, int x3, int c1, int c2, int c3, int tx1, int tx2, int tx3, int ty1, int ty2, int ty3, int tz1, int tz2, int tz3, int tex, float z1, float z2, float z3, int bufferOffset) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) >> 1;
        if (area < 0) {
            area = - area;
        }
        mipmaps = !aBoolean1464 || area > 16384 || tex == 17 || tex == 26 || tex == 31 || tex == 34 || tex == 40 ? 0 : (area > 4096 ? 1 : (area > 1024 ? 1 : (area > 256 ? 2 : (area > 64 ? 3 : (area > 16 ? 4 : (area > 4 ? 5 : (area > 1 ? 6 : 7)))))));
        c1 = 127 - c1 << 1;
        c2 = 127 - c2 << 1;
        c3 = 127 - c3 << 1;
        int[] texels = Rasterizer.method371(tex)[mipmaps];
        aBoolean1463 = !aBooleanArray1475[tex];
        tx2 = tx1 - tx2;
        ty2 = ty1 - ty2;
        tz2 = tz1 - tz2;
        int l4 = (tx3 -= tx1) * ty1 - (ty3 -= ty1) * tx1 << (Client.log_view_dist == 9 ? 14 : 15);
        int i5 = ty3 * tz1 - (tz3 -= tz1) * ty1 << 8;
        int j5 = tz3 * tx1 - tx3 * tz1 << 5;
        int k5 = tx2 * ty1 - ty2 * tx1 << (Client.log_view_dist == 9 ? 14 : 15);
        int l5 = ty2 * tz1 - tz2 * ty1 << 8;
        int i6 = tz2 * tx1 - tx2 * tz1 << 5;
        int j6 = ty2 * tx3 - tx2 * ty3 << (Client.log_view_dist == 9 ? 14 : 15);
        int k6 = tz2 * ty3 - ty2 * tz3 << 8;
        int l6 = tx2 * tz3 - tz2 * tx3 << 5;
        int i7 = 0;
        int j7 = 0;
        if (y2 != y1) {
            i7 = (x2 - x1 << 16) / (y2 - y1);
            j7 = (c2 - c1 << 16) / (y2 - y1);
        }
        int k7 = 0;
        int l7 = 0;
        if (y3 != y2) {
            k7 = (x3 - x2 << 16) / (y3 - y2);
            l7 = (c3 - c2 << 16) / (y3 - y2);
        }
        int i8 = 0;
        int j8 = 0;
        if (y3 != y1) {
            i8 = (x1 - x3 << 16) / (y1 - y3);
            j8 = (c1 - c3 << 16) / (y1 - y3);
        }
        float x21 = x2 - x1;
        float y32 = y2 - y1;
        float x31 = x3 - x1;
        float y31 = y3 - y1;
        float z21 = z2 - z1;
        float z31 = z3 - z1;
        float div = x21 * y31 - x31 * y32;
        float depthSlope = (z21 * y31 - z31 * y32) / div;
        float depthScale = (z31 * x21 - z21 * x31) / div;
        if (y1 <= y2 && y1 <= y3) {
            if (y1 >= DrawingArea.bottomY) {
                return;
            }
            if (y2 > DrawingArea.bottomY) {
                y2 = DrawingArea.bottomY;
            }
            if (y3 > DrawingArea.bottomY) {
                y3 = DrawingArea.bottomY;
            }
            z1 = z1 - depthSlope * (float)x1 + depthSlope;
            if (y2 < y3) {
                x3 = x1 <<= 16;
                c3 = c1 <<= 16;
                if (y1 < 0) {
                    x3 -= i8 * y1;
                    x1 -= i7 * y1;
                    z1 -= depthScale * (float)y1;
                    c3 -= j8 * y1;
                    c1 -= j7 * y1;
                    y1 = 0;
                }
                x2 <<= 16;
                c2 <<= 16;
                if (y2 < 0) {
                    x2 -= k7 * y2;
                    c2 -= l7 * y2;
                    y2 = 0;
                }
                int k8 = y1 - textureInt2;
                l4 += j5 * k8;
                k5 += i6 * k8;
                j6 += l6 * k8;
                if (y1 != y2 && i8 < i7 || y1 == y2 && i8 > k7) {
                    y3 -= y2;
                    y2 -= y1;
                    y1 = anIntArray1472[y1];
                    do {
                        if (--y2 < 0) {
                            while (--y3 >= 0) {
                                Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y1, x3 >> 16, x2 >> 16, c3, c2, l4, k5, j6, i5, l5, k6, z1, depthSlope, bufferOffset, mipmaps);
                                z1 += depthScale;
                                x3 += i8;
                                x2 += k7;
                                c3 += j8;
                                c2 += l7;
                                y1 += DrawingArea.width;
                                l4 += j5;
                                k5 += i6;
                                j6 += l6;
                            }
                            return;
                        }
                        Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y1, x3 >> 16, x1 >> 16, c3, c1, l4, k5, j6, i5, l5, k6, z1, depthSlope, bufferOffset, mipmaps);
                        z1 += depthScale;
                        x3 += i8;
                        x1 += i7;
                        c3 += j8;
                        c1 += j7;
                        y1 += DrawingArea.width;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    } while (true);
                }
                y3 -= y2;
                y2 -= y1;
                y1 = anIntArray1472[y1];
                do {
                    if (--y2 < 0) {
                        while (--y3 >= 0) {
                            Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y1, x2 >> 16, x3 >> 16, c2, c3, l4, k5, j6, i5, l5, k6, z1, depthSlope, bufferOffset, mipmaps);
                            z1 += depthScale;
                            x3 += i8;
                            x2 += k7;
                            c3 += j8;
                            c2 += l7;
                            y1 += DrawingArea.width;
                            l4 += j5;
                            k5 += i6;
                            j6 += l6;
                        }
                        return;
                    }
                    Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y1, x1 >> 16, x3 >> 16, c1, c3, l4, k5, j6, i5, l5, k6, z1, depthSlope, bufferOffset, mipmaps);
                    z1 += depthScale;
                    x3 += i8;
                    x1 += i7;
                    c3 += j8;
                    c1 += j7;
                    y1 += DrawingArea.width;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                } while (true);
            }
            x2 = x1 <<= 16;
            c2 = c1 <<= 16;
            if (y1 < 0) {
                x2 -= i8 * y1;
                z1 -= depthScale * (float)y1;
                x1 -= i7 * y1;
                c2 -= j8 * y1;
                c1 -= j7 * y1;
                y1 = 0;
            }
            x3 <<= 16;
            c3 <<= 16;
            if (y3 < 0) {
                x3 -= k7 * y3;
                c3 -= l7 * y3;
                y3 = 0;
            }
            int l8 = y1 - textureInt2;
            l4 += j5 * l8;
            k5 += i6 * l8;
            j6 += l6 * l8;
            if (y1 != y3 && i8 < i7 || y1 == y3 && k7 > i7) {
                y2 -= y3;
                y3 -= y1;
                y1 = anIntArray1472[y1];
                do {
                    if (--y3 < 0) {
                        while (--y2 >= 0) {
                            Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y1, x3 >> 16, x1 >> 16, c3, c1, l4, k5, j6, i5, l5, k6, z1, depthSlope, bufferOffset, mipmaps);
                            z1 += depthScale;
                            x3 += k7;
                            x1 += i7;
                            c3 += l7;
                            c1 += j7;
                            y1 += DrawingArea.width;
                            l4 += j5;
                            k5 += i6;
                            j6 += l6;
                        }
                        return;
                    }
                    Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y1, x2 >> 16, x1 >> 16, c2, c1, l4, k5, j6, i5, l5, k6, z1, depthSlope, bufferOffset, mipmaps);
                    z1 += depthScale;
                    x2 += i8;
                    x1 += i7;
                    c2 += j8;
                    c1 += j7;
                    y1 += DrawingArea.width;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                } while (true);
            }
            y2 -= y3;
            y3 -= y1;
            y1 = anIntArray1472[y1];
            do {
                if (--y3 < 0) {
                    while (--y2 >= 0) {
                        Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y1, x1 >> 16, x3 >> 16, c1, c3, l4, k5, j6, i5, l5, k6, z1, depthSlope, bufferOffset, mipmaps);
                        z1 += depthScale;
                        x3 += k7;
                        x1 += i7;
                        c3 += l7;
                        c1 += j7;
                        y1 += DrawingArea.width;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    return;
                }
                Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y1, x1 >> 16, x2 >> 16, c1, c2, l4, k5, j6, i5, l5, k6, z1, depthSlope, bufferOffset, mipmaps);
                z1 += depthScale;
                x2 += i8;
                x1 += i7;
                c2 += j8;
                c1 += j7;
                y1 += DrawingArea.width;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            } while (true);
        }
        if (y2 <= y3) {
            if (y2 >= DrawingArea.bottomY) {
                return;
            }
            if (y3 > DrawingArea.bottomY) {
                y3 = DrawingArea.bottomY;
            }
            if (y1 > DrawingArea.bottomY) {
                y1 = DrawingArea.bottomY;
            }
            z2 = z2 - depthSlope * (float)x2 + depthSlope;
            if (y3 < y1) {
                x1 = x2 <<= 16;
                c1 = c2 <<= 16;
                if (y2 < 0) {
                    x1 -= i7 * y2;
                    x2 -= k7 * y2;
                    z2 -= depthScale * (float)y2;
                    c1 -= j7 * y2;
                    c2 -= l7 * y2;
                    y2 = 0;
                }
                x3 <<= 16;
                c3 <<= 16;
                if (y3 < 0) {
                    x3 -= i8 * y3;
                    c3 -= j8 * y3;
                    y3 = 0;
                }
                int i9 = y2 - textureInt2;
                l4 += j5 * i9;
                k5 += i6 * i9;
                j6 += l6 * i9;
                if (y2 != y3 && i7 < k7 || y2 == y3 && i7 > i8) {
                    y1 -= y3;
                    y3 -= y2;
                    y2 = anIntArray1472[y2];
                    do {
                        if (--y3 < 0) {
                            while (--y1 >= 0) {
                                Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y2, x1 >> 16, x3 >> 16, c1, c3, l4, k5, j6, i5, l5, k6, z2, depthSlope, bufferOffset, mipmaps);
                                z2 += depthScale;
                                x1 += i7;
                                x3 += i8;
                                c1 += j7;
                                c3 += j8;
                                y2 += DrawingArea.width;
                                l4 += j5;
                                k5 += i6;
                                j6 += l6;
                            }
                            return;
                        }
                        Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y2, x1 >> 16, x2 >> 16, c1, c2, l4, k5, j6, i5, l5, k6, z2, depthSlope, bufferOffset, mipmaps);
                        z2 += depthScale;
                        x1 += i7;
                        x2 += k7;
                        c1 += j7;
                        c2 += l7;
                        y2 += DrawingArea.width;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    } while (true);
                }
                y1 -= y3;
                y3 -= y2;
                y2 = anIntArray1472[y2];
                do {
                    if (--y3 < 0) {
                        while (--y1 >= 0) {
                            Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y2, x3 >> 16, x1 >> 16, c3, c1, l4, k5, j6, i5, l5, k6, z2, depthSlope, bufferOffset, mipmaps);
                            z2 += depthScale;
                            x1 += i7;
                            x3 += i8;
                            c1 += j7;
                            c3 += j8;
                            y2 += DrawingArea.width;
                            l4 += j5;
                            k5 += i6;
                            j6 += l6;
                        }
                        return;
                    }
                    Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y2, x2 >> 16, x1 >> 16, c2, c1, l4, k5, j6, i5, l5, k6, z2, depthSlope, bufferOffset, mipmaps);
                    z2 += depthScale;
                    x1 += i7;
                    x2 += k7;
                    c1 += j7;
                    c2 += l7;
                    y2 += DrawingArea.width;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                } while (true);
            }
            x3 = x2 <<= 16;
            c3 = c2 <<= 16;
            if (y2 < 0) {
                x3 -= i7 * y2;
                z2 -= depthScale * (float)y2;
                x2 -= k7 * y2;
                c3 -= j7 * y2;
                c2 -= l7 * y2;
                y2 = 0;
            }
            x1 <<= 16;
            c1 <<= 16;
            if (y1 < 0) {
                x1 -= i8 * y1;
                c1 -= j8 * y1;
                y1 = 0;
            }
            int j9 = y2 - textureInt2;
            l4 += j5 * j9;
            k5 += i6 * j9;
            j6 += l6 * j9;
            if (i7 < k7) {
                y3 -= y1;
                y1 -= y2;
                y2 = anIntArray1472[y2];
                do {
                    if (--y1 < 0) {
                        while (--y3 >= 0) {
                            Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y2, x1 >> 16, x2 >> 16, c1, c2, l4, k5, j6, i5, l5, k6, z2, depthSlope, bufferOffset, mipmaps);
                            z2 += depthScale;
                            x1 += i8;
                            x2 += k7;
                            c1 += j8;
                            c2 += l7;
                            y2 += DrawingArea.width;
                            l4 += j5;
                            k5 += i6;
                            j6 += l6;
                        }
                        return;
                    }
                    Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y2, x3 >> 16, x2 >> 16, c3, c2, l4, k5, j6, i5, l5, k6, z2, depthSlope, bufferOffset, mipmaps);
                    z2 += depthScale;
                    x3 += i7;
                    x2 += k7;
                    c3 += j7;
                    c2 += l7;
                    y2 += DrawingArea.width;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                } while (true);
            }
            y3 -= y1;
            y1 -= y2;
            y2 = anIntArray1472[y2];
            do {
                if (--y1 < 0) {
                    while (--y3 >= 0) {
                        Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y2, x2 >> 16, x1 >> 16, c2, c1, l4, k5, j6, i5, l5, k6, z2, depthSlope, bufferOffset, mipmaps);
                        z2 += depthScale;
                        x1 += i8;
                        x2 += k7;
                        c1 += j8;
                        c2 += l7;
                        y2 += DrawingArea.width;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    return;
                }
                Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y2, x2 >> 16, x3 >> 16, c2, c3, l4, k5, j6, i5, l5, k6, z2, depthSlope, bufferOffset, mipmaps);
                z2 += depthScale;
                x3 += i7;
                x2 += k7;
                c3 += j7;
                c2 += l7;
                y2 += DrawingArea.width;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            } while (true);
        }
        if (y3 >= DrawingArea.bottomY) {
            return;
        }
        if (y1 > DrawingArea.bottomY) {
            y1 = DrawingArea.bottomY;
        }
        if (y2 > DrawingArea.bottomY) {
            y2 = DrawingArea.bottomY;
        }
        z3 = z3 - depthSlope * (float)x3 + depthSlope;
        if (y1 < y2) {
            x2 = x3 <<= 16;
            c2 = c3 <<= 16;
            if (y3 < 0) {
                x2 -= k7 * y3;
                x3 -= i8 * y3;
                z3 -= depthScale * (float)y3;
                c2 -= l7 * y3;
                c3 -= j8 * y3;
                y3 = 0;
            }
            x1 <<= 16;
            c1 <<= 16;
            if (y1 < 0) {
                x1 -= i7 * y1;
                c1 -= j7 * y1;
                y1 = 0;
            }
            int k9 = y3 - textureInt2;
            l4 += j5 * k9;
            k5 += i6 * k9;
            j6 += l6 * k9;
            if (k7 < i8) {
                y2 -= y1;
                y1 -= y3;
                y3 = anIntArray1472[y3];
                do {
                    if (--y1 < 0) {
                        while (--y2 >= 0) {
                            Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y3, x2 >> 16, x1 >> 16, c2, c1, l4, k5, j6, i5, l5, k6, z3, depthSlope, bufferOffset, mipmaps);
                            z3 += depthScale;
                            x2 += k7;
                            x1 += i7;
                            c2 += l7;
                            c1 += j7;
                            y3 += DrawingArea.width;
                            l4 += j5;
                            k5 += i6;
                            j6 += l6;
                        }
                        return;
                    }
                    Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y3, x2 >> 16, x3 >> 16, c2, c3, l4, k5, j6, i5, l5, k6, z3, depthSlope, bufferOffset, mipmaps);
                    z3 += depthScale;
                    x2 += k7;
                    x3 += i8;
                    c2 += l7;
                    c3 += j8;
                    y3 += DrawingArea.width;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                } while (true);
            }
            y2 -= y1;
            y1 -= y3;
            y3 = anIntArray1472[y3];
            do {
                if (--y1 < 0) {
                    while (--y2 >= 0) {
                        Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y3, x1 >> 16, x2 >> 16, c1, c2, l4, k5, j6, i5, l5, k6, z3, depthSlope, bufferOffset, mipmaps);
                        z3 += depthScale;
                        x2 += k7;
                        x1 += i7;
                        c2 += l7;
                        c1 += j7;
                        y3 += DrawingArea.width;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    return;
                }
                Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y3, x3 >> 16, x2 >> 16, c3, c2, l4, k5, j6, i5, l5, k6, z3, depthSlope, bufferOffset, mipmaps);
                z3 += depthScale;
                x2 += k7;
                x3 += i8;
                c2 += l7;
                c3 += j8;
                y3 += DrawingArea.width;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            } while (true);
        }
        x1 = x3 <<= 16;
        c1 = c3 <<= 16;
        if (y3 < 0) {
            x1 -= k7 * y3;
            x3 -= i8 * y3;
            z3 -= depthScale * (float)y3;
            c1 -= l7 * y3;
            c3 -= j8 * y3;
            y3 = 0;
        }
        x2 <<= 16;
        c2 <<= 16;
        if (y2 < 0) {
            x2 -= i7 * y2;
            c2 -= j7 * y2;
            y2 = 0;
        }
        int l9 = y3 - textureInt2;
        l4 += j5 * l9;
        k5 += i6 * l9;
        j6 += l6 * l9;
        if (k7 < i8) {
            y1 -= y2;
            y2 -= y3;
            y3 = anIntArray1472[y3];
            do {
                if (--y2 < 0) {
                    while (--y1 >= 0) {
                        Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y3, x2 >> 16, x3 >> 16, c2, c3, l4, k5, j6, i5, l5, k6, z3, depthSlope, bufferOffset, mipmaps);
                        z3 += depthScale;
                        x2 += i7;
                        x3 += i8;
                        c2 += j7;
                        c3 += j8;
                        y3 += DrawingArea.width;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    return;
                }
                Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y3, x1 >> 16, x3 >> 16, c1, c3, l4, k5, j6, i5, l5, k6, z3, depthSlope, bufferOffset, mipmaps);
                z3 += depthScale;
                x1 += k7;
                x3 += i8;
                c1 += l7;
                c3 += j8;
                y3 += DrawingArea.width;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            } while (true);
        }
        y1 -= y2;
        y2 -= y3;
        y3 = anIntArray1472[y3];
        do {
            if (--y2 < 0) {
                while (--y1 >= 0) {
                    Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y3, x3 >> 16, x2 >> 16, c3, c2, l4, k5, j6, i5, l5, k6, z3, depthSlope, bufferOffset, mipmaps);
                    z3 += depthScale;
                    x2 += i7;
                    x3 += i8;
                    c2 += j7;
                    c3 += j8;
                    y3 += DrawingArea.width;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            Rasterizer.drawTexturedScanline(DrawingArea.pixels, texels, y3, x3 >> 16, x1 >> 16, c3, c1, l4, k5, j6, i5, l5, k6, z3, depthSlope, bufferOffset, mipmaps);
            z3 += depthScale;
            x1 += k7;
            x3 += i8;
            c1 += l7;
            c3 += j8;
            y3 += DrawingArea.width;
            l4 += j5;
            k5 += i6;
            j6 += l6;
        } while (true);
    }

    private static void drawTexturedScanline(int[] dest, int[] src, int offset, int x1, int x2, int hsl1, int hsl2, int t1, int t2, int t3, int t4, int t5, int t6, float z1, float z2, int bufferOffset, int mipmaps) {
        int darken = 0;
        int srcPos = 0;
        if (x1 >= x2) {
            return;
        }
        int dl = (hsl2 - hsl1) / (x2 - x1);
        if (aBoolean1462) {
            if (x2 > DrawingArea.centerX) {
                x2 = DrawingArea.centerX;
            }
            if (x1 < 0) {
                hsl1 -= x1 * dl;
                x1 = 0;
            }
        }
        if (x1 >= x2) {
            return;
        }
        int n = x2 - x1 >> 3;
        offset += x1;
        z1 += z2 * (float)x1;
        int j4 = 0;
        int l4 = 0;
        int l6 = x1 - textureInt1;
        t1 += (t4 >> 3) * l6;
        t2 += (t5 >> 3) * l6;
        int l5 = (t3 += (t6 >> 3) * l6) >> 14;
        if (l5 != 0) {
            darken = t1 / l5;
            srcPos = t2 / l5;
            if (darken < 0) {
                darken = 0;
            } else if (darken > 16256) {
                darken = 16256;
            }
        }
        t1 += t4;
        t2 += t5;
        l5 = (t3 += t6) >> 14;
        if (l5 != 0) {
            j4 = t1 / l5;
            l4 = t2 / l5;
            if (j4 < 7) {
                j4 = 7;
            } else if (j4 > 16256) {
                j4 = 16256;
            }
        }
        int j7 = j4 - darken >> 3;
        int l7 = l4 - srcPos >> 3;
        if (aBoolean1463) {
            int l;
            int rgb;
            while (n-- > 0) {
                rgb = src[Rasterizer.texelPos((srcPos & 16256) + (darken >> 7), mipmaps)];
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((rgb & 16711935) * l & -16711936) + ((rgb & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                rgb = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
                l = (hsl1 += dl) >> 16;
                if ((z1 += z2) < depthBuffer[++offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((rgb & 16711935) * l & -16711936) + ((rgb & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                rgb = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
                l = (hsl1 += dl) >> 16;
                if ((z1 += z2) < depthBuffer[++offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((rgb & 16711935) * l & -16711936) + ((rgb & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                rgb = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
                l = (hsl1 += dl) >> 16;
                if ((z1 += z2) < depthBuffer[++offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((rgb & 16711935) * l & -16711936) + ((rgb & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                rgb = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
                l = (hsl1 += dl) >> 16;
                if ((z1 += z2) < depthBuffer[++offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((rgb & 16711935) * l & -16711936) + ((rgb & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                rgb = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
                l = (hsl1 += dl) >> 16;
                if ((z1 += z2) < depthBuffer[++offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((rgb & 16711935) * l & -16711936) + ((rgb & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                rgb = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
                l = (hsl1 += dl) >> 16;
                if ((z1 += z2) < depthBuffer[++offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((rgb & 16711935) * l & -16711936) + ((rgb & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                rgb = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
                l = (hsl1 += dl) >> 16;
                if ((z1 += z2) < depthBuffer[++offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((rgb & 16711935) * l & -16711936) + ((rgb & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                ++offset;
                z1 += z2;
                darken += j7;
                srcPos += l7;
                hsl1 += dl;
                t1 += t4;
                t2 += t5;
                int i6 = (t3 += t6) >> 14;
                if (i6 != 0) {
                    j4 = t1 / i6;
                    l4 = t2 / i6;
                    if (j4 < 7) {
                        j4 = 7;
                    } else if (j4 > 16256) {
                        j4 = 16256;
                    }
                }
                j7 = j4 - darken >> 3;
                l7 = l4 - srcPos >> 3;
                hsl1 += dl;
            }
            n = x2 - x1 & 7;
            while (n-- > 0) {
                rgb = src[Rasterizer.texelPos((srcPos & 16256) + (darken >> 7), mipmaps)];
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((rgb & 16711935) * l & -16711936) + ((rgb & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
                z1 += z2;
                ++offset;
                darken += j7;
                srcPos += l7;
                hsl1 += dl;
            }
            return;
        }
        while (n-- > 0) {
            int l;
            int i9 = src[Rasterizer.texelPos((srcPos & 16256) + (darken >> 7), mipmaps)];
            if (i9 != 0) {
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((i9 & 16711935) * l & -16711936) + ((i9 & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
            hsl1 += dl;
            i9 = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
            if (i9 != 0) {
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((i9 & 16711935) * l & -16711936) + ((i9 & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
            hsl1 += dl;
            i9 = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
            if (i9 != 0) {
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((i9 & 16711935) * l & -16711936) + ((i9 & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
            hsl1 += dl;
            i9 = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
            if (i9 != 0) {
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((i9 & 16711935) * l & -16711936) + ((i9 & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
            hsl1 += dl;
            i9 = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
            if (i9 != 0) {
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((i9 & 16711935) * l & -16711936) + ((i9 & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
            hsl1 += dl;
            i9 = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
            if (i9 != 0) {
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((i9 & 16711935) * l & -16711936) + ((i9 & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
            hsl1 += dl;
            i9 = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
            if (i9 != 0) {
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((i9 & 16711935) * l & -16711936) + ((i9 & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
            hsl1 += dl;
            i9 = src[Rasterizer.texelPos(((srcPos += l7) & 16256) + ((darken += j7) >> 7), mipmaps)];
            if (i9 != 0) {
                l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((i9 & 16711935) * l & -16711936) + ((i9 & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
            darken += j7;
            srcPos += l7;
            hsl1 += dl;
            t1 += t4;
            t2 += t5;
            int j6 = (t3 += t6) >> 14;
            if (j6 != 0) {
                j4 = t1 / j6;
                l4 = t2 / j6;
                if (j4 < 7) {
                    j4 = 7;
                } else if (j4 > 16256) {
                    j4 = 16256;
                }
            }
            j7 = j4 - darken >> 3;
            l7 = l4 - srcPos >> 3;
            hsl1 += dl;
        }
        int l3 = x2 - x1 & 7;
        while (l3-- > 0) {
            int j9 = src[Rasterizer.texelPos((srcPos & 16256) + (darken >> 7), mipmaps)];
            if (j9 != 0) {
                int l = hsl1 >> 16;
                if (z1 < depthBuffer[offset] || z1 < depthBuffer[offset] + (float)bufferOffset) {
                    dest[offset] = ((j9 & 16711935) * l & -16711936) + ((j9 & 65280) * l & 16711680) >> 8;
                    Rasterizer.depthBuffer[offset] = z1;
                }
            }
            z1 += z2;
            ++offset;
            darken += j7;
            srcPos += l7;
            hsl1 += dl;
        }
    }

    static {
        textureAmount = 67;
        aBoolean1464 = true;
        aBackgroundArray1474s = new Background[textureAmount];
        aBooleanArray1475 = new boolean[textureAmount];
        anIntArray1476 = new int[textureAmount];
        anIntArrayArray1479 = new int[textureAmount][][];
        anIntArray1480 = new int[textureAmount];
        anIntArray1482 = new int[65536];
        anIntArrayArray1483 = new int[textureAmount][];
        anIntArray1468 = new int[512];
        anIntArray1469 = new int[2048];
        anIntArray1470 = new int[2048];
        anIntArray1471 = new int[2048];
        for (int i = 1; i < 512; ++i) {
            Rasterizer.anIntArray1468[i] = 32768 / i;
        }
        for (int j = 1; j < 2048; ++j) {
            Rasterizer.anIntArray1469[j] = 65536 / j;
        }
        int k = 0;
        do {
            if (k >= 2048) {
                fogColor = 13156520;
                return;
            }
            Rasterizer.anIntArray1470[k] = (int)(65536.0 * Math.sin((double)((double)k * 0.0030679615)));
            Rasterizer.anIntArray1471[k] = (int)(65536.0 * Math.cos((double)((double)k * 0.0030679615)));
            ++k;
        } while (true);
    }
}


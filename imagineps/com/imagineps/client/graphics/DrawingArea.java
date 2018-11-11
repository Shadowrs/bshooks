/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client.graphics;

import com.imagineps.client.NodeSub;
import java.awt.Color;

public class DrawingArea
extends NodeSub {
    public static float[] depthBuffer = new float[1];
    public static int[] pixels;
    public static int width;
    public static int height;
    public static int topY;
    public static int bottomY;
    public static int topX;
    public static int bottomX;
    public static int centerX;
    public static int centerY;
    public static int anInt1387;

    public static void drawAlphaGradient(int x, int y, int gradientWidth, int gradientHeight, int startColor, int endColor, int alpha) {
        int k1 = 0;
        int l1 = 65536 / gradientHeight;
        if (x < topX) {
            gradientWidth -= topX - x;
            x = topX;
        }
        if (y < topY) {
            k1 += (topY - y) * l1;
            gradientHeight -= topY - y;
            y = topY;
        }
        if (x + gradientWidth > bottomX) {
            gradientWidth = bottomX - x;
        }
        if (y + gradientHeight > bottomY) {
            gradientHeight = bottomY - y;
        }
        int i2 = width - gradientWidth;
        int result_alpha = 256 - alpha;
        int total_pixels = x + y * width;
        int k2 = - gradientHeight;
        while (k2 < 0) {
            int gradient1 = 65536 - k1 >> 8;
            int gradient2 = k1 >> 8;
            int gradient_color = ((startColor & 16711935) * gradient1 + (endColor & 16711935) * gradient2 & -16711936) + ((startColor & 65280) * gradient1 + (endColor & 65280) * gradient2 & 16711680) >>> 8;
            int color = ((gradient_color & 16711935) * alpha >> 8 & 16711935) + ((gradient_color & 65280) * alpha >> 8 & 65280);
            for (int k3 = - gradientWidth; k3 < 0; ++k3) {
                int pixel_pixels = pixels[total_pixels];
                pixel_pixels = ((pixel_pixels & 16711935) * result_alpha >> 8 & 16711935) + ((pixel_pixels & 65280) * result_alpha >> 8 & 65280);
                DrawingArea.pixels[total_pixels++] = color + pixel_pixels;
            }
            total_pixels += i2;
            k1 += l1;
            ++k2;
        }
    }

    public static void drawAlphaBox(int x, int y, int lineWidth, int lineHeight, int color, int alpha) {
        if (y < topY) {
            if (y <= topY - lineHeight) return;
            lineHeight -= topY - y;
            y += topY - y;
        }
        if (y + lineHeight > bottomY) {
            lineHeight -= y + lineHeight - bottomY;
        }
        if (x < topX) {
            lineWidth -= topX - x;
            x = topX;
        }
        if (x + lineWidth > bottomX) {
            lineWidth = bottomX - x;
        }
        int yOff = 0;
        while (yOff < lineHeight) {
            int i3 = x + (y + yOff) * width;
            for (int j3 = 0; j3 < lineWidth; ++j3) {
                int j1 = 256 - alpha;
                int k1 = (color >> 16 & 255) * alpha;
                int l1 = (color >> 8 & 255) * alpha;
                int i2 = (color & 255) * alpha;
                int j2 = (pixels[i3] >> 16 & 255) * j1;
                int k2 = (pixels[i3] >> 8 & 255) * j1;
                int l2 = (pixels[i3] & 255) * j1;
                int k3 = (k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8);
                DrawingArea.pixels[i3++] = k3;
            }
            ++yOff;
        }
    }

    public static void drawVerticalLine(int x, int y, int length, int colour) {
        if (x < topX) return;
        if (x >= bottomX) {
            return;
        }
        if (y < topY) {
            length -= topY - y;
            y = topY;
        }
        if (y + length > bottomY) {
            length = bottomY - y;
        }
        int j1 = x + y * width;
        int k1 = 0;
        while (k1 < length) {
            DrawingArea.pixels[j1 + k1 * DrawingArea.width] = colour;
            ++k1;
        }
    }

    public static void drawBubble(int x, int y, int radius, int colour, int initialAlpha) {
        DrawingArea.fillCircleAlpha(x, y, radius, colour, initialAlpha);
        DrawingArea.fillCircleAlpha(x, y, radius + 2, colour, 8);
        DrawingArea.fillCircleAlpha(x, y, radius + 4, colour, 6);
        DrawingArea.fillCircleAlpha(x, y, radius + 6, colour, 4);
        DrawingArea.fillCircleAlpha(x, y, radius + 8, colour, 2);
    }

    public static void drawRoundedRectangle(int x, int y, int width, int height, int color, int alpha, boolean filled, boolean shadowed) {
        if (width <= 0) {
            return;
        }
        if (shadowed) {
            DrawingArea.drawRoundedRectangle(x + 1, y + 1, width, height, 0, alpha, filled, false);
        }
        if (alpha == -1) {
            if (filled) {
                DrawingArea.drawHorizontalLine(x + 2, y + 1, width - 4, color);
                DrawingArea.drawHorizontalLine(x + 2, y + height - 2, width - 4, color);
                DrawingArea.drawFilledPixels(x + 1, y + 2, width - 2, height - 4, color);
            }
            DrawingArea.drawHorizontalLine(x + 2, y, width - 4, color);
            DrawingArea.drawHorizontalLine(x + 2, y + height - 1, width - 4, color);
            DrawingArea.drawVerticalLine(x, y + 2, height - 4, color);
            DrawingArea.drawVerticalLine(x + width - 1, y + 2, height - 4, color);
            DrawingArea.drawFilledPixels(x + 1, y + 1, 1, 1, color);
            DrawingArea.drawFilledPixels(x + width - 2, y + 1, 1, 1, color);
            DrawingArea.drawFilledPixels(x + width - 2, y + height - 2, 1, 1, color);
            DrawingArea.drawFilledPixels(x + 1, y + height - 2, 1, 1, color);
            return;
        }
        if (alpha == -1) return;
        if (filled) {
            DrawingArea.drawHorizontalLine(x + 2, y + 1, width - 4, color, alpha);
            DrawingArea.drawHorizontalLine(x + 2, y + height - 2, width - 4, color, alpha);
            DrawingArea.drawFilledPixels(x + 1, y + 2, width - 2, height - 4, color, alpha);
        }
        DrawingArea.drawHorizontalLine(x + 2, y, width - 4, color, alpha);
        DrawingArea.drawHorizontalLine(x + 2, y + height - 1, width - 4, color, alpha);
        DrawingArea.drawVerticalLine(x, y + 2, height - 4, color, alpha);
        DrawingArea.drawVerticalLine(x + width - 1, y + 2, height - 4, color, alpha);
        DrawingArea.drawFilledPixels(x + 1, y + 1, 1, 1, color, alpha);
        DrawingArea.drawFilledPixels(x + width - 2, y + 1, 1, 1, color, alpha);
        DrawingArea.drawFilledPixels(x + width - 2, y + height - 2, 1, 1, color, alpha);
        DrawingArea.drawFilledPixels(x + 1, y + height - 2, 1, 1, color, alpha);
    }

    public static void drawHorizontalLine(int x, int y, int length, int color, int alpha) {
        if (y < topY) return;
        if (y >= bottomY) {
            return;
        }
        if (x < topX) {
            length -= topX - x;
            x = topX;
        }
        if (x + length > bottomX) {
            length = bottomX - x;
        }
        int j1 = 256 - alpha;
        int k1 = (color >> 16 & 255) * alpha;
        int l1 = (color >> 8 & 255) * alpha;
        int i2 = (color & 255) * alpha;
        int i3 = x + y * width;
        int j3 = 0;
        while (j3 < length) {
            int j2 = (pixels[i3] >> 16 & 255) * j1;
            int k2 = (pixels[i3] >> 8 & 255) * j1;
            int l2 = (pixels[i3] & 255) * j1;
            int k3 = (k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8);
            DrawingArea.pixels[i3++] = k3;
            ++j3;
        }
    }

    public static void drawVerticalLine(int x, int y, int length, int color, int alpha) {
        if (x < topX) return;
        if (x >= bottomX) {
            return;
        }
        if (y < topY) {
            length -= topY - y;
            y = topY;
        }
        if (y + length > bottomY) {
            length = bottomY - y;
        }
        int j1 = 256 - alpha;
        int k1 = (color >> 16 & 255) * alpha;
        int l1 = (color >> 8 & 255) * alpha;
        int i2 = (color & 255) * alpha;
        int i3 = x + y * width;
        int j3 = 0;
        while (j3 < length) {
            int k3;
            int j2 = (pixels[i3] >> 16 & 255) * j1;
            int k2 = (pixels[i3] >> 8 & 255) * j1;
            int l2 = (pixels[i3] & 255) * j1;
            DrawingArea.pixels[i3] = k3 = (k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8);
            i3 += width;
            ++j3;
        }
    }

    public static void drawLine(int x, int y, int endX, int endY, int color, int alpha) {
        endX -= x;
        if ((endY -= y) == 0) {
            if (endX >= 0) {
                DrawingArea.drawHorizontalLine(x, y, endX + 1, color, alpha);
                return;
            }
            DrawingArea.drawHorizontalLine(x + endX, y, - endX + 1, color, alpha);
            return;
        }
        if (endX == 0) {
            if (endY >= 0) {
                DrawingArea.drawVerticalLine(x, y, endY + 1, color, alpha);
                return;
            }
            DrawingArea.drawVerticalLine(x, y + endY, - endY + 1, color, alpha);
            return;
        }
        if (endX + endY < 0) {
            x += endX;
            endX = - endX;
            y += endY;
            endY = - endY;
        }
        if (endX > endY) {
            y <<= 16;
            y += 32768;
            int j1 = (int)Math.floor((double)((double)(endY <<= 16) / (double)endX + 0.5));
            endX += x;
            if (x < topX) {
                y += j1 * (topX - x);
                x = topX;
            }
            if (endX >= bottomX) {
                endX = bottomX - 1;
            }
            while (x <= endX) {
                int l1 = y >> 16;
                if (l1 >= topY && l1 < bottomY) {
                    DrawingArea.pixels[x + l1 * DrawingArea.width] = color;
                }
                y += j1;
                ++x;
            }
            return;
        }
        x <<= 16;
        x += 32768;
        int k1 = (int)Math.floor((double)((double)(endX <<= 16) / (double)endY + 0.5));
        endY += y;
        if (y < topY) {
            x += k1 * (topY - y);
            y = topY;
        }
        if (endY >= bottomY) {
            endY = bottomY - 1;
        }
        while (y <= endY) {
            int i2 = x >> 16;
            if (i2 >= topX && i2 < bottomX) {
                DrawingArea.pixels[i2 + y * DrawingArea.width] = color;
            }
            x += k1;
            ++y;
        }
    }

    public static void drawFilledPixels(int x, int y, int pixelWidth, int pixelHeight, int color) {
        if (x < topX) {
            pixelWidth -= topX - x;
            x = topX;
        }
        if (y < topY) {
            pixelHeight -= topY - y;
            y = topY;
        }
        if (x + pixelWidth > bottomX) {
            pixelWidth = bottomX - x;
        }
        if (y + pixelHeight > bottomY) {
            pixelHeight = bottomY - y;
        }
        int j1 = width - pixelWidth;
        int k1 = x + y * width;
        int l1 = - pixelHeight;
        while (l1 < 0) {
            for (int i2 = - pixelWidth; i2 < 0; ++i2) {
                DrawingArea.pixels[k1++] = color;
            }
            k1 += j1;
            ++l1;
        }
    }

    public static void drawFilledPixels(int x, int y, int pixelWidth, int pixelHeight, int color, int alpha) {
        if (x < topX) {
            pixelWidth -= topX - x;
            x = topX;
        }
        if (y < topY) {
            pixelHeight -= topY - y;
            y = topY;
        }
        if (x + pixelWidth > bottomX) {
            pixelWidth = bottomX - x;
        }
        if (y + pixelHeight > bottomY) {
            pixelHeight = bottomY - y;
        }
        int l1 = 256 - alpha;
        int i2 = (color >> 16 & 255) * alpha;
        int j2 = (color >> 8 & 255) * alpha;
        int k2 = (color & 255) * alpha;
        int k3 = width - pixelWidth;
        int l3 = x + y * width;
        int i4 = 0;
        while (i4 < pixelHeight) {
            for (int j4 = - pixelWidth; j4 < 0; ++j4) {
                int l2 = (pixels[l3] >> 16 & 255) * l1;
                int i3 = (pixels[l3] >> 8 & 255) * l1;
                int j3 = (pixels[l3] & 255) * l1;
                int k4 = (i2 + l2 >> 8 << 16) + (j2 + i3 >> 8 << 8) + (k2 + j3 >> 8);
                DrawingArea.pixels[l3++] = k4;
            }
            l3 += k3;
            ++i4;
        }
    }

    public static void drawRectangle(int x, int y, int width, int height, int colour) {
        DrawingArea.drawHorizontalLine(x, y, width, colour, false);
        DrawingArea.drawHorizontalLine(x, y + height - 1, width, colour, false);
        DrawingArea.drawVerticalLine(x, y, height, colour);
        DrawingArea.drawVerticalLine(x + width - 1, y, height, colour);
    }

    public static void drawRectangle(int x, int y, int width, int height, int colour, int opacity) {
        DrawingArea.drawHorizontalLine(x, y, width, colour, opacity);
        DrawingArea.drawHorizontalLine(x, y + height - 1, width, colour, opacity);
        DrawingArea.drawVerticalLine(x, y, height, colour, opacity);
        DrawingArea.drawVerticalLine(x + width - 1, y, height, colour, opacity);
    }

    public static void drawPixelsWithOpacity(int color, int yPos, int pixelWidth, int pixelHeight, int opacityLevel, int xPos) {
        if (xPos < topX) {
            pixelWidth -= topX - xPos;
            xPos = topX;
        }
        if (yPos < topY) {
            pixelHeight -= topY - yPos;
            yPos = topY;
        }
        if (xPos + pixelWidth > bottomX) {
            pixelWidth = bottomX - xPos;
        }
        if (yPos + pixelHeight > bottomY) {
            pixelHeight = bottomY - yPos;
        }
        int l1 = 256 - opacityLevel;
        int i2 = (color >> 16 & 255) * opacityLevel;
        int j2 = (color >> 8 & 255) * opacityLevel;
        int k2 = (color & 255) * opacityLevel;
        int k3 = width - pixelWidth;
        int l3 = xPos + yPos * width;
        if (l3 > pixels.length - 1) {
            l3 = pixels.length - 1;
        }
        int i4 = 0;
        while (i4 < pixelHeight) {
            for (int j4 = - pixelWidth; j4 < 0; ++j4) {
                int l2 = (pixels[l3] >> 16 & 255) * l1;
                int i3 = (pixels[l3] >> 8 & 255) * l1;
                int j3 = (pixels[l3] & 255) * l1;
                int k4 = (i2 + l2 >> 8 << 16) + (j2 + i3 >> 8 << 8) + (k2 + j3 >> 8);
                DrawingArea.pixels[l3++] = k4;
            }
            l3 += k3;
            ++i4;
        }
    }

    public static void drawGradualAlphaHorizontalLine(int x, int y, int lineWidth, int color, int alpha, Direction dir) {
        try {
            if (dir == Direction.LEFT) {
                x -= lineWidth;
            }
            if (y < topY) return;
            if (y >= bottomY) {
                return;
            }
            if (x < topX) {
                lineWidth -= topX - x;
                x = topX;
            }
            if (x + lineWidth > bottomX) {
                lineWidth = bottomX - x;
            }
            if (dir == Direction.RIGHT) {
                int i3 = x + y * width;
                int i = 0;
                while (i < lineWidth) {
                    double percent = (double)alpha / (double)lineWidth;
                    int alpha2 = (int)((double)(lineWidth - i) * percent);
                    int j1 = 256 - alpha2;
                    int k1 = (color >> 16 & 255) * alpha2;
                    int l1 = (color >> 8 & 255) * alpha2;
                    int i2 = (color & 255) * alpha2;
                    int j2 = (pixels[i3] >> 16 & 255) * j1;
                    int k2 = (pixels[i3] >> 8 & 255) * j1;
                    int l2 = (pixels[i3] & 255) * j1;
                    int k3 = (k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8);
                    DrawingArea.pixels[i3++] = k3;
                    ++i;
                }
                return;
            }
            int i3 = x + y * width;
            int i = lineWidth;
            while (i > 0) {
                double percent = (double)alpha / (double)lineWidth;
                int alpha2 = (int)((double)(lineWidth - i) * percent);
                int j1 = 256 - alpha2;
                int k1 = (color >> 16 & 255) * alpha2;
                int l1 = (color >> 8 & 255) * alpha2;
                int i2 = (color & 255) * alpha2;
                int j2 = (pixels[i3] >> 16 & 255) * j1;
                int k2 = (pixels[i3] >> 8 & 255) * j1;
                int l2 = (pixels[i3] & 255) * j1;
                int k3 = (k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8);
                DrawingArea.pixels[i3++] = k3;
                --i;
            }
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void drawGradualAlphaHorizontalBox(int x, int y, int width, int height, int color, int alpha, Direction dir) {
        int i = 0;
        while (i < height) {
            DrawingArea.drawGradualAlphaHorizontalLine(x, y + i, width, color, alpha, dir);
            ++i;
        }
    }

    public static void drawHorizontalLine(int x, int y, int length, int colour, boolean shaded) {
        if (shaded) {
            DrawingArea.drawHorizontalLine(x + 1, y + 1, length, 0, false);
        }
        if (y < topY) return;
        if (y >= bottomY) {
            return;
        }
        if (x < topX) {
            length -= topX - x;
            x = topX;
        }
        if (x + length > bottomX) {
            length = bottomX - x;
        }
        int i1 = x + y * width;
        int j1 = 0;
        while (j1 < length) {
            DrawingArea.pixels[i1 + j1] = colour;
            ++j1;
        }
    }

    public static boolean drawHorizontalLine(int yPos, int lineColor, int lineWidth, int xPos) {
        if (yPos < topY) return false;
        if (yPos >= bottomY) {
            return false;
        }
        if (xPos < topX) {
            lineWidth -= topX - xPos;
            xPos = topX;
        }
        if (xPos + lineWidth > bottomX) {
            lineWidth = bottomX - xPos;
        }
        int i1 = xPos + yPos * width;
        int j1 = 0;
        while (j1 < lineWidth) {
            DrawingArea.pixels[i1 + j1] = lineColor;
            ++j1;
        }
        return true;
    }

    public static void initDrawingArea(int i, int j, int[] ai) {
        pixels = ai;
        width = j;
        height = i;
        DrawingArea.setDrawingArea(i, 0, j, 0);
    }

    public static void defaultDrawingAreaSize() {
        topX = 0;
        topY = 0;
        bottomX = width;
        bottomY = height;
        centerX = bottomX;
        centerY = bottomX / 2;
    }

    public static void setDrawingArea(int i, int j, int k, int l) {
        if (j < 0) {
            j = 0;
        }
        if (l < 0) {
            l = 0;
        }
        if (k > width) {
            k = width;
        }
        if (i > height) {
            i = height;
        }
        topX = j;
        topY = l;
        bottomX = k;
        bottomY = i;
        centerX = bottomX;
        centerY = bottomX / 2;
        anInt1387 = bottomY / 2;
    }

    public static void setAllPixelsToZero() {
        int i = width * height;
        int j = 0;
        while (j < i) {
            DrawingArea.pixels[j] = 0;
            ++j;
        }
    }

    public static void method335(int i, int j, int k, int l, int i1, int k1) {
        if (k1 < topX) {
            k -= topX - k1;
            k1 = topX;
        }
        if (j < topY) {
            l -= topY - j;
            j = topY;
        }
        if (k1 + k > bottomX) {
            k = bottomX - k1;
        }
        if (j + l > bottomY) {
            l = bottomY - j;
        }
        int l1 = 256 - i1;
        int i2 = (i >> 16 & 255) * i1;
        int j2 = (i >> 8 & 255) * i1;
        int k2 = (i & 255) * i1;
        int k3 = width - k;
        int l3 = k1 + j * width;
        int i4 = 0;
        while (i4 < l) {
            for (int j4 = - k; j4 < 0; ++j4) {
                int l2 = (pixels[l3] >> 16 & 255) * l1;
                int i3 = (pixels[l3] >> 8 & 255) * l1;
                int j3 = (pixels[l3] & 255) * l1;
                int k4 = (i2 + l2 >> 8 << 16) + (j2 + i3 >> 8 << 8) + (k2 + j3 >> 8);
                DrawingArea.pixels[l3++] = k4;
            }
            l3 += k3;
            ++i4;
        }
    }

    public static void resetDepthBuffer() {
        int i = width * height;
        if (depthBuffer.length != width * height) {
            depthBuffer = new float[width * height];
        }
        int j = 0;
        while (j < i) {
            DrawingArea.depthBuffer[j] = Float.MAX_VALUE;
            ++j;
        }
    }

    public static void reset(Color color) {
        int canvas = width * height;
        int j = 0;
        while (j < canvas) {
            DrawingArea.pixels[j] = color.getRGB();
            ++j;
        }
    }

    public static void drawAlphaPixels(int x, int y, int w, int h, int color, int alpha) {
        if (x < topX) {
            w -= topX - x;
            x = topX;
        }
        if (y < topY) {
            h -= topY - y;
            y = topY;
        }
        if (x + w > bottomX) {
            w = bottomX - x;
        }
        if (y + h > bottomY) {
            h = bottomY - y;
        }
        int l1 = 256 - alpha;
        int i2 = (color >> 16 & 255) * alpha;
        int j2 = (color >> 8 & 255) * alpha;
        int k2 = (color & 255) * alpha;
        int k3 = width - w;
        int l3 = x + y * width;
        int i4 = 0;
        while (i4 < h) {
            for (int j4 = - w; j4 < 0; ++j4) {
                int l2 = (pixels[l3] >> 16 & 255) * l1;
                int i3 = (pixels[l3] >> 8 & 255) * l1;
                int j3 = (pixels[l3] & 255) * l1;
                int k4 = (i2 + l2 >> 8 << 16) + (j2 + i3 >> 8 << 8) + (k2 + j3 >> 8);
                DrawingArea.pixels[l3++] = k4;
            }
            l3 += k3;
            ++i4;
        }
    }

    public static void drawPixels(int i, int j, int k, int l, int i1) {
        if (k < topX) {
            i1 -= topX - k;
            k = topX;
        }
        if (j < topY) {
            i -= topY - j;
            j = topY;
        }
        if (k + i1 > bottomX) {
            i1 = bottomX - k;
        }
        if (j + i > bottomY) {
            i = bottomY - j;
        }
        int k1 = width - i1;
        int l1 = k + j * width;
        int i2 = - i;
        while (i2 < 0) {
            for (int j2 = - i1; j2 < 0; ++j2) {
                DrawingArea.pixels[l1++] = l;
            }
            l1 += k1;
            ++i2;
        }
    }

    public static void fillPixels(int i, int j, int k, int l, int i1) {
        DrawingArea.method339(i1, l, j, i);
        DrawingArea.method339(i1 + k - 1, l, j, i);
        DrawingArea.method341(i1, l, k, i);
        DrawingArea.method341(i1, l, k, i + j - 1);
    }

    public static void method338(int i, int j, int k, int l, int i1, int j1) {
        DrawingArea.method340(l, i1, i, k, j1);
        DrawingArea.method340(l, i1, i + j - 1, k, j1);
        if (j < 3) return;
        DrawingArea.method342(l, j1, k, i + 1, j - 2);
        DrawingArea.method342(l, j1 + i1 - 1, k, i + 1, j - 2);
    }

    public static void method339(int i, int j, int k, int l) {
        if (i < topY) return;
        if (i >= bottomY) {
            return;
        }
        if (l < topX) {
            k -= topX - l;
            l = topX;
        }
        if (l + k > bottomX) {
            k = bottomX - l;
        }
        int i1 = l + i * width;
        int j1 = 0;
        while (j1 < k) {
            DrawingArea.pixels[i1 + j1] = j;
            ++j1;
        }
    }

    private static void method340(int i, int j, int k, int l, int i1) {
        if (k < topY) return;
        if (k >= bottomY) {
            return;
        }
        if (i1 < topX) {
            j -= topX - i1;
            i1 = topX;
        }
        if (i1 + j > bottomX) {
            j = bottomX - i1;
        }
        int j1 = 256 - l;
        int k1 = (i >> 16 & 255) * l;
        int l1 = (i >> 8 & 255) * l;
        int i2 = (i & 255) * l;
        int i3 = i1 + k * width;
        int j3 = 0;
        while (j3 < j) {
            int j2 = (pixels[i3] >> 16 & 255) * j1;
            int k2 = (pixels[i3] >> 8 & 255) * j1;
            int l2 = (pixels[i3] & 255) * j1;
            int k3 = (k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8);
            DrawingArea.pixels[i3++] = k3;
            ++j3;
        }
    }

    public static void method341(int i, int j, int k, int l) {
        if (l < topX) return;
        if (l >= bottomX) {
            return;
        }
        if (i < topY) {
            k -= topY - i;
            i = topY;
        }
        if (i + k > bottomY) {
            k = bottomY - i;
        }
        int j1 = l + i * width;
        int k1 = 0;
        while (k1 < k) {
            DrawingArea.pixels[j1 + k1 * DrawingArea.width] = j;
            ++k1;
        }
    }

    private static void method342(int i, int j, int k, int l, int i1) {
        if (j < topX) return;
        if (j >= bottomX) {
            return;
        }
        if (l < topY) {
            i1 -= topY - l;
            l = topY;
        }
        if (l + i1 > bottomY) {
            i1 = bottomY - l;
        }
        int j1 = 256 - k;
        int k1 = (i >> 16 & 255) * k;
        int l1 = (i >> 8 & 255) * k;
        int i2 = (i & 255) * k;
        int i3 = j + l * width;
        int j3 = 0;
        while (j3 < i1) {
            int k3;
            int j2 = (pixels[i3] >> 16 & 255) * j1;
            int k2 = (pixels[i3] >> 8 & 255) * j1;
            int l2 = (pixels[i3] & 255) * j1;
            DrawingArea.pixels[i3] = k3 = (k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8);
            i3 += width;
            ++j3;
        }
    }

    public static void drawCircle(int x, int y, int radius, int colour, int initialAlpha) {
        DrawingArea.fillCircleAlpha(x, y, radius, colour, initialAlpha);
        DrawingArea.fillCircleAlpha(x, y, radius + 2, colour, 8);
        DrawingArea.fillCircleAlpha(x, y, radius + 4, colour, 6);
        DrawingArea.fillCircleAlpha(x, y, radius + 6, colour, 4);
        DrawingArea.fillCircleAlpha(x, y, radius + 8, colour, 2);
    }

    public static void fillCircleAlpha(int posX, int posY, int radius, int colour, int alpha) {
        int j3;
        int dest_intensity = 256 - alpha;
        int src_red = (colour >> 16 & 255) * alpha;
        int src_green = (colour >> 8 & 255) * alpha;
        int src_blue = (colour & 255) * alpha;
        int i3 = posY - radius;
        if (i3 < 0) {
            i3 = 0;
        }
        if ((j3 = posY + radius) >= height) {
            j3 = height - 1;
        }
        int y = i3;
        while (y <= j3) {
            int k4;
            int l3 = y - posY;
            int i4 = (int)Math.sqrt((double)(radius * radius - l3 * l3));
            int x = posX - i4;
            if (x < 0) {
                x = 0;
            }
            if ((k4 = posX + i4) >= width) {
                k4 = width - 1;
            }
            int pixel_offset = x + y * width;
            for (int i5 = x; i5 <= k4; ++i5) {
                int dest_red = (pixels[pixel_offset] >> 16 & 255) * dest_intensity;
                int dest_green = (pixels[pixel_offset] >> 8 & 255) * dest_intensity;
                int dest_blue = (pixels[pixel_offset] & 255) * dest_intensity;
                int result_rgb = (src_red + dest_red >> 8 << 16) + (src_green + dest_green >> 8 << 8) + (src_blue + dest_blue >> 8);
                DrawingArea.pixels[pixel_offset++] = result_rgb;
            }
            ++y;
        }
    }

    public static void setAllPixelsTo(int rgb) {
        int i = width * height;
        int j = 0;
        while (j < i) {
            DrawingArea.pixels[j] = rgb;
            ++j;
        }
    }

    public static enum Direction {
        LEFT,
        RIGHT;
        

        private Direction() {
        }
    }

}


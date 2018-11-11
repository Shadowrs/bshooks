/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.Point
 *  java.awt.Rectangle
 *  java.awt.RenderingHints
 *  java.awt.RenderingHints$Key
 *  java.awt.Toolkit
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.awt.image.DataBuffer
 *  java.awt.image.DataBufferInt
 *  java.awt.image.ImageObserver
 *  java.awt.image.PixelGrabber
 *  java.awt.image.Raster
 *  java.awt.image.WritableRaster
 *  java.io.File
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Hashtable
 *  javax.swing.ImageIcon
 */
package com.imagineps.client.graphics;

import com.imagineps.client.FileOperations;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.cache.CacheType;
import com.imagineps.client.graphics.DrawingArea;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;
import java.awt.image.PixelGrabber;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.PrintStream;
import java.util.Hashtable;
import javax.swing.ImageIcon;

/*
 * Exception performing whole class analysis ignored.
 */
public class Sprite
extends DrawingArea {
    private static final String DEFAULT_SPRITE_LOCATION = CacheType.SPRITES.getFullLocation();
    public int[] myPixels;
    public int myWidth;
    public int myHeight;
    private int xDrawOffset;
    private int yDrawOffset;
    public int maxWidth;
    public int maxHeight;
    public int anInt1442;
    public int anInt1443;
    public int anInt1444;
    public int anInt1445;
    public boolean isGreyscale;

    public Sprite() {
    }

    public void outline(int color) {
        int[] raster = new int[this.myWidth * this.myHeight];
        int start = 0;
        int y = 0;
        do {
            if (y >= this.myHeight) {
                this.myPixels = raster;
                return;
            }
            for (int x = 0; x < this.myWidth; ++x) {
                int outline = this.myPixels[start];
                if (outline == 0) {
                    if (x > 0 && this.myPixels[start - 1] != 0) {
                        outline = color;
                    } else if (y > 0 && this.myPixels[start - this.myWidth] != 0) {
                        outline = color;
                    } else if (x < this.myWidth - 1 && this.myPixels[start + 1] != 0) {
                        outline = color;
                    } else if (y < this.myHeight - 1 && this.myPixels[start + this.myWidth] != 0) {
                        outline = color;
                    }
                }
                raster[start++] = outline;
            }
            ++y;
        } while (true);
    }

    public void shadow(int color) {
        int y = this.myHeight - 1;
        while (y > 0) {
            int pos = y * this.myWidth;
            for (int x = this.myWidth - 1; x > 0; --x) {
                if (this.myPixels[x + pos] != 0 || this.myPixels[x + pos - 1 - this.myWidth] == 0) continue;
                this.myPixels[x + pos] = color;
            }
            --y;
        }
    }

    public Sprite(int width, int height) {
        this.myPixels = new int[width * height];
        this.myWidth = this.maxWidth = width;
        this.myHeight = this.maxHeight = height;
        this.yDrawOffset = 0;
        this.xDrawOffset = 0;
    }

    public void drawAdvancedSpriteCentered(int xPos, int yPos) {
        this.drawAdvancedSprite(xPos - this.myWidth / 2, yPos - this.myHeight / 2);
    }

    public static BufferedImage cropImage(BufferedImage src, Rectangle rect) {
        return src.getSubimage(0, 0, rect.width, rect.height);
    }

    public static BufferedImage getScaledImage(BufferedImage src, int w, int h, int origW, int origH) {
        int finalw = w;
        int finalh = h;
        double factor = 1.0;
        if (src.getWidth() > src.getHeight()) {
            factor = (double)src.getHeight() / (double)src.getWidth();
            finalh = (int)((double)finalw * factor);
        } else {
            factor = (double)src.getWidth() / (double)src.getHeight();
            finalw = (int)((double)finalh * factor);
        }
        BufferedImage resizedImg = new BufferedImage(finalw, finalh, 2);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage((Image)src, 0, 0, finalw, finalh, null);
        g2.dispose();
        return resizedImg;
    }

    public static BufferedImage getImageFromArray(int[] pixels, int width, int height) {
        DataBufferInt buffer = new DataBufferInt(pixels, pixels.length);
        int[] bandMasks = new int[]{16711680, 65280, 255, -16777216};
        WritableRaster raster = Raster.createPackedRaster((DataBuffer)buffer, (int)width, (int)height, (int)width, (int[])bandMasks, (Point)null);
        ColorModel cm = ColorModel.getRGBdefault();
        return new BufferedImage(cm, raster, cm.isAlphaPremultiplied(), null);
    }

    public static Image downScaleImage(Image image, int width, int height) {
        return image.getScaledInstance(width, height, 4);
    }

    public static Sprite getResizedSprite(Sprite s, int width, int height) {
        if (width == 0) {
            width = 1;
        }
        if (height == 0) {
            height = 1;
        }
        try {
            Sprite sprite = new Sprite();
            BufferedImage image = Sprite.getScaledImage(Sprite.getImageFromArray(s.myPixels, s.myWidth, s.myHeight), width, height, s.myWidth, s.myHeight);
            sprite.myWidth = width;
            sprite.myHeight = height;
            sprite.maxWidth = width;
            sprite.maxHeight = height;
            sprite.xDrawOffset = 0;
            sprite.yDrawOffset = 0;
            sprite.myPixels = new int[sprite.myWidth * sprite.myHeight];
            PixelGrabber pixelgrabber = new PixelGrabber((Image)image, 0, 0, sprite.myWidth, sprite.myHeight, sprite.myPixels, 0, sprite.myWidth);
            boolean grabbed = pixelgrabber.grabPixels();
            return sprite;
        }
        catch (Exception _ex) {
            _ex.printStackTrace();
            return null;
        }
    }

    public void drawAdvancedSprite(int posX, int posY) {
        int widthLeft;
        int containerPixel = (posX += this.anInt1442) + (posY += this.anInt1443) * DrawingArea.width;
        int pixelOffset = 0;
        int height = this.myHeight;
        int width = this.myWidth;
        int containerScanSize = DrawingArea.width - width;
        int spriteScanSize = 0;
        if (posY < DrawingArea.topY) {
            int heightLeft = DrawingArea.topY - posY;
            height -= heightLeft;
            posY = DrawingArea.topY;
            pixelOffset += heightLeft * width;
            containerPixel += heightLeft * DrawingArea.width;
        }
        if (posY + height > DrawingArea.bottomY) {
            height -= posY + height - DrawingArea.bottomY;
        }
        if (posX < DrawingArea.topX) {
            widthLeft = DrawingArea.topX - posX;
            width -= widthLeft;
            posX = DrawingArea.topX;
            pixelOffset += widthLeft;
            containerPixel += widthLeft;
            spriteScanSize += widthLeft;
            containerScanSize += widthLeft;
        }
        if (posX + width > DrawingArea.bottomX) {
            widthLeft = posX + width - DrawingArea.bottomX;
            width -= widthLeft;
            spriteScanSize += widthLeft;
            containerScanSize += widthLeft;
        }
        if (width <= 0) return;
        if (height <= 0) return;
        this.drawToContainer(width, height, pixelOffset, this.myPixels, spriteScanSize, containerPixel, DrawingArea.pixels, containerScanSize);
    }

    private void drawToContainer(int width, int height, int spritePixel, int[] spriteData, int spriteScanSize, int containerPixel, int[] containerData, int containerScanSize) {
        int y = 0;
        while (y < height) {
            for (int x = 0; x < width; ++x) {
                int argb;
                if ((argb = spriteData[spritePixel++]) != 0) {
                    int alpha = argb >> 24 & 255;
                    int transparency = 256 - alpha;
                    int originalColor = containerData[containerPixel];
                    containerData[containerPixel++] = ((argb & 16711935) * alpha + (originalColor & 16711935) * transparency & -16711936) + ((argb & 65280) * alpha + (originalColor & 65280) * transparency & 16711680) >> 8;
                    continue;
                }
                ++containerPixel;
            }
            containerPixel += containerScanSize;
            spritePixel += spriteScanSize;
            ++y;
        }
    }

    public void drawSpriteOpacity(int xPosition, int yPosition, int opacity) {
        int i1 = (xPosition += this.xDrawOffset) + (yPosition += this.yDrawOffset) * DrawingArea.width;
        int j1 = 0;
        int k1 = this.myHeight;
        int l1 = this.myWidth;
        int i2 = DrawingArea.width - l1;
        int j2 = 0;
        if (yPosition < DrawingArea.topY) {
            int k2 = DrawingArea.topY - yPosition;
            k1 -= k2;
            yPosition = DrawingArea.topY;
            j1 += k2 * l1;
            i1 += k2 * DrawingArea.width;
        }
        if (yPosition + k1 > DrawingArea.bottomY) {
            k1 -= yPosition + k1 - DrawingArea.bottomY;
        }
        if (xPosition < DrawingArea.topX) {
            int l2 = DrawingArea.topX - xPosition;
            l1 -= l2;
            xPosition = DrawingArea.topX;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if (xPosition + l1 > DrawingArea.bottomX) {
            int i3 = xPosition + l1 - DrawingArea.bottomX;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if (l1 <= 0) return;
        if (k1 <= 0) return;
        this.method351(j1, l1, DrawingArea.pixels, this.myPixels, j2, k1, i2, opacity, i1);
    }

    public void greyScale() {
        int index = 0;
        while (index < this.myWidth * this.myHeight) {
            int alpha = this.myPixels[index] >>> 24;
            int red = this.myPixels[index] >>> 16 & 255;
            int green = this.myPixels[index] >>> 8 & 255;
            int blue = this.myPixels[index] & 255;
            int delta = (red + green + blue) / 3;
            this.myPixels[index] = delta | delta << 8 | delta << 16 | alpha << 24;
            this.isGreyscale = true;
            ++index;
        }
    }

    public void drawTransparentSprite(int i, int j, int opacity) {
        int k = opacity;
        int i1 = (i += this.xDrawOffset) + (j += this.yDrawOffset) * DrawingArea.width;
        int j1 = 0;
        int k1 = this.myHeight;
        int l1 = this.myWidth;
        int i2 = DrawingArea.width - l1;
        int j2 = 0;
        if (j < DrawingArea.topY) {
            int k2 = DrawingArea.topY - j;
            k1 -= k2;
            j = DrawingArea.topY;
            j1 += k2 * l1;
            i1 += k2 * DrawingArea.width;
        }
        if (j + k1 > DrawingArea.bottomY) {
            k1 -= j + k1 - DrawingArea.bottomY;
        }
        if (i < DrawingArea.topX) {
            int l2 = DrawingArea.topX - i;
            l1 -= l2;
            i = DrawingArea.topX;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if (i + l1 > DrawingArea.bottomX) {
            int i3 = i + l1 - DrawingArea.bottomX;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if (l1 <= 0) return;
        if (k1 <= 0) return;
        this.method351(j1, l1, DrawingArea.pixels, this.myPixels, j2, k1, i2, k, i1);
    }

    public Sprite(byte[] spriteData) {
        try {
            Image image = Toolkit.getDefaultToolkit().createImage(spriteData);
            ImageIcon sprite = new ImageIcon(image);
            this.myWidth = sprite.getIconWidth();
            this.myHeight = sprite.getIconHeight();
            this.xDrawOffset = 0;
            this.yDrawOffset = 0;
            this.myPixels = new int[this.myWidth * this.myHeight];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, this.myWidth, this.myHeight, this.myPixels, 0, this.myWidth);
            pixelgrabber.grabPixels();
            image = null;
            this.setTransparency(255, 0, 255);
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Sprite(String s, int w, int h) {
        try {
            Image image = Toolkit.getDefaultToolkit().createImage(FileOperations.readFile(DEFAULT_SPRITE_LOCATION + s + ".png"));
            this.myWidth = w;
            this.myHeight = h;
            this.maxWidth = this.myWidth;
            this.maxHeight = this.myHeight;
            this.xDrawOffset = 0;
            this.yDrawOffset = 0;
            this.myPixels = new int[Math.abs((int)(this.myWidth * this.myHeight))];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, this.myWidth, this.myHeight, this.myPixels, 0, this.myWidth);
            pixelgrabber.grabPixels();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Sprite(Sprite sprite) {
        this.myPixels = sprite.myPixels;
        this.myWidth = sprite.myWidth;
        this.myHeight = sprite.myHeight;
        this.xDrawOffset = sprite.xDrawOffset;
        this.yDrawOffset = sprite.yDrawOffset;
        this.maxWidth = sprite.maxWidth;
        this.maxHeight = sprite.maxHeight;
        this.anInt1442 = sprite.anInt1442;
        this.anInt1443 = sprite.anInt1443;
        this.anInt1444 = sprite.anInt1444;
        this.anInt1445 = sprite.anInt1445;
    }

    public Sprite(String img) {
        try {
            String s = DEFAULT_SPRITE_LOCATION + img + ".png";
            Image image = Toolkit.getDefaultToolkit().getImage(s);
            ImageIcon sprite = new ImageIcon(image);
            this.myWidth = sprite.getIconWidth();
            this.myHeight = sprite.getIconHeight();
            this.maxWidth = this.myWidth;
            this.maxHeight = this.myHeight;
            this.xDrawOffset = 0;
            this.yDrawOffset = 0;
            this.myPixels = new int[this.myWidth * this.myHeight];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, this.myWidth, this.myHeight, this.myPixels, 0, this.myWidth);
            pixelgrabber.grabPixels();
            image = null;
            this.setTransparency(255, 0, 255);
            return;
        }
        catch (Exception _ex) {
            _ex.printStackTrace();
        }
    }

    public void setTransparency(int transRed, int transGreen, int transBlue) {
        int index = 0;
        while (index < this.myPixels.length) {
            if ((this.myPixels[index] >> 16 & 255) == transRed && (this.myPixels[index] >> 8 & 255) == transGreen && (this.myPixels[index] & 255) == transBlue) {
                this.myPixels[index] = 0;
            }
            ++index;
        }
    }

    public Sprite(StreamLoader streamLoader, String s, int i) {
        Stream stream = new Stream(streamLoader.getDataForName(s + ".dat"));
        Stream stream_1 = new Stream(streamLoader.getDataForName("index.dat"));
        stream_1.currentOffset = stream.readUnsignedWord();
        this.maxWidth = stream_1.readUnsignedWord();
        this.maxHeight = stream_1.readUnsignedWord();
        int j = stream_1.readUnsignedByte();
        int[] ai = new int[j];
        for (int k = 0; k < j - 1; ++k) {
            ai[k + 1] = stream_1.read3Bytes();
            if (ai[k + 1] != 0) continue;
            ai[k + 1] = 1;
        }
        for (int l = 0; l < i; ++stream_1.currentOffset, stream.currentOffset += stream_1.readUnsignedWord() * stream_1.readUnsignedWord(), ++stream_1.currentOffset, ++l) {
            stream_1.currentOffset += 2;
        }
        this.xDrawOffset = stream_1.readUnsignedByte();
        this.yDrawOffset = stream_1.readUnsignedByte();
        this.myWidth = stream_1.readUnsignedWord();
        this.myHeight = stream_1.readUnsignedWord();
        int i1 = stream_1.readUnsignedByte();
        int j1 = this.myWidth * this.myHeight;
        this.myPixels = new int[j1];
        if (i1 == 0) {
            int k1 = 0;
            do {
                if (k1 >= j1) {
                    this.setTransparency(255, 0, 255);
                    return;
                }
                this.myPixels[k1] = ai[stream.readUnsignedByte()];
                ++k1;
            } while (true);
        }
        if (i1 == 1) {
            for (int l1 = 0; l1 < this.myWidth; ++l1) {
                for (int i2 = 0; i2 < this.myHeight; ++i2) {
                    this.myPixels[l1 + i2 * this.myWidth] = ai[stream.readUnsignedByte()];
                }
            }
        }
        this.setTransparency(255, 0, 255);
    }

    public void method343() {
        DrawingArea.initDrawingArea(this.myHeight, this.myWidth, this.myPixels);
    }

    public void method344(int i, int j, int k) {
        int i1 = 0;
        while (i1 < this.myPixels.length) {
            int j1 = this.myPixels[i1];
            if (j1 != 0) {
                int k1 = j1 >> 16 & 255;
                if ((k1 += i) < 1) {
                    k1 = 1;
                } else if (k1 > 255) {
                    k1 = 255;
                }
                int l1 = j1 >> 8 & 255;
                if ((l1 += j) < 1) {
                    l1 = 1;
                } else if (l1 > 255) {
                    l1 = 255;
                }
                int i2 = j1 & 255;
                if ((i2 += k) < 1) {
                    i2 = 1;
                } else if (i2 > 255) {
                    i2 = 255;
                }
                this.myPixels[i1] = (k1 << 16) + (l1 << 8) + i2;
            }
            ++i1;
        }
    }

    public void method345() {
        int[] ai = new int[this.maxWidth * this.maxHeight];
        int j = 0;
        do {
            if (j >= this.myHeight) {
                this.myPixels = ai;
                this.myWidth = this.maxWidth;
                this.myHeight = this.maxHeight;
                this.xDrawOffset = 0;
                this.yDrawOffset = 0;
                return;
            }
            System.arraycopy((Object)this.myPixels, (int)(j * this.myWidth), (Object)ai, (int)(j + this.yDrawOffset * this.maxWidth + this.xDrawOffset), (int)this.myWidth);
            ++j;
        } while (true);
    }

    public void method346(int i, int j) {
        int l = (i += this.xDrawOffset) + (j += this.yDrawOffset) * DrawingArea.width;
        int i1 = 0;
        int j1 = this.myHeight;
        int k1 = this.myWidth;
        int l1 = DrawingArea.width - k1;
        int i2 = 0;
        if (j < DrawingArea.topY) {
            int j2 = DrawingArea.topY - j;
            j1 -= j2;
            j = DrawingArea.topY;
            i1 += j2 * k1;
            l += j2 * DrawingArea.width;
        }
        if (j + j1 > DrawingArea.bottomY) {
            j1 -= j + j1 - DrawingArea.bottomY;
        }
        if (i < DrawingArea.topX) {
            int k2 = DrawingArea.topX - i;
            k1 -= k2;
            i = DrawingArea.topX;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if (i + k1 > DrawingArea.bottomX) {
            int l2 = i + k1 - DrawingArea.bottomX;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if (k1 <= 0) return;
        if (j1 <= 0) return;
        this.method347(l, k1, j1, i2, i1, l1, this.myPixels, DrawingArea.pixels);
    }

    private void method347(int i, int j, int k, int l, int i1, int k1, int[] ai, int[] ai1) {
        int l1 = - (j >> 2);
        j = - (j & 3);
        int i2 = - k;
        while (i2 < 0) {
            for (int j2 = l1; j2 < 0; ++j2) {
                ai1[i++] = ai[i1++];
                ai1[i++] = ai[i1++];
                ai1[i++] = ai[i1++];
                ai1[i++] = ai[i1++];
            }
            for (int k2 = j; k2 < 0; ++k2) {
                ai1[i++] = ai[i1++];
            }
            i += k1;
            i1 += l;
            ++i2;
        }
    }

    public void configXDrawOffset(int value) {
        this.xDrawOffset = value;
    }

    public void configYDrawOffset(int value) {
        this.yDrawOffset = value;
    }

    public void drawSprite1(int i, int j, int k) {
        int i1 = (i += this.xDrawOffset) + (j += this.yDrawOffset) * DrawingArea.width;
        int j1 = 0;
        int k1 = this.myHeight;
        int l1 = this.myWidth;
        int i2 = DrawingArea.width - l1;
        int j2 = 0;
        if (j < DrawingArea.topY) {
            int k2 = DrawingArea.topY - j;
            k1 -= k2;
            j = DrawingArea.topY;
            j1 += k2 * l1;
            i1 += k2 * DrawingArea.width;
        }
        if (j + k1 > DrawingArea.bottomY) {
            k1 -= j + k1 - DrawingArea.bottomY;
        }
        if (i < DrawingArea.topX) {
            int l2 = DrawingArea.topX - i;
            l1 -= l2;
            i = DrawingArea.topX;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if (i + l1 > DrawingArea.bottomX) {
            int i3 = i + l1 - DrawingArea.bottomX;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if (l1 <= 0) return;
        if (k1 <= 0) return;
        this.method351(j1, l1, DrawingArea.pixels, this.myPixels, j2, k1, i2, k, i1);
    }

    public void drawSprite(int xPosition, int yPosition) {
        int l = (xPosition += this.xDrawOffset) + (yPosition += this.yDrawOffset) * DrawingArea.width;
        int i1 = 0;
        int j1 = this.myHeight;
        int k1 = this.myWidth;
        int l1 = DrawingArea.width - k1;
        int i2 = 0;
        if (yPosition < DrawingArea.topY) {
            int j2 = DrawingArea.topY - yPosition;
            j1 -= j2;
            yPosition = DrawingArea.topY;
            i1 += j2 * k1;
            l += j2 * DrawingArea.width;
        }
        if (yPosition + j1 > DrawingArea.bottomY) {
            j1 -= yPosition + j1 - DrawingArea.bottomY;
        }
        if (xPosition < DrawingArea.topX) {
            int k2 = DrawingArea.topX - xPosition;
            k1 -= k2;
            xPosition = DrawingArea.topX;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if (xPosition + k1 > DrawingArea.bottomX) {
            int l2 = xPosition + k1 - DrawingArea.bottomX;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if (k1 <= 0) return;
        if (j1 <= 0) return;
        this.method349(DrawingArea.pixels, this.myPixels, i1, l, k1, j1, l1, i2);
    }

    public void drawSprite(int i, int k, int color) {
        int y;
        int x;
        int tempWidth = this.myWidth + 2;
        int tempHeight = this.myHeight + 2;
        int[] tempArray = new int[tempWidth * tempHeight];
        for (x = 0; x < this.myWidth; ++x) {
            for (y = 0; y < this.myHeight; ++y) {
                if (this.myPixels[x + y * this.myWidth] == 0) continue;
                tempArray[x + 1 + (y + 1) * tempWidth] = this.myPixels[x + y * this.myWidth];
            }
        }
        for (x = 0; x < tempWidth; ++x) {
            for (y = 0; y < tempHeight; ++y) {
                if (tempArray[x + y * tempWidth] != 0) continue;
                if (x < tempWidth - 1 && tempArray[x + 1 + y * tempWidth] > 0 && tempArray[x + 1 + y * tempWidth] != 16777215) {
                    tempArray[x + y * tempWidth] = color;
                }
                if (x > 0 && tempArray[x - 1 + y * tempWidth] > 0 && tempArray[x - 1 + y * tempWidth] != 16777215) {
                    tempArray[x + y * tempWidth] = color;
                }
                if (y < tempHeight - 1 && tempArray[x + (y + 1) * tempWidth] > 0 && tempArray[x + (y + 1) * tempWidth] != 16777215) {
                    tempArray[x + y * tempWidth] = color;
                }
                if (y <= 0 || tempArray[x + (y - 1) * tempWidth] <= 0 || tempArray[x + (y - 1) * tempWidth] == 16777215) continue;
                tempArray[x + y * tempWidth] = color;
            }
        }
        --i;
        --k;
        int l = (i += this.xDrawOffset) + (k += this.yDrawOffset) * DrawingArea.width;
        int i1 = 0;
        int j1 = tempHeight;
        int k1 = tempWidth;
        int l1 = DrawingArea.width - k1;
        int i2 = 0;
        if (k < DrawingArea.topY) {
            int j2 = DrawingArea.topY - k;
            j1 -= j2;
            k = DrawingArea.topY;
            i1 += j2 * k1;
            l += j2 * DrawingArea.width;
        }
        if (k + j1 > DrawingArea.bottomY) {
            j1 -= k + j1 - DrawingArea.bottomY;
        }
        if (i < DrawingArea.topX) {
            int k2 = DrawingArea.topX - i;
            k1 -= k2;
            i = DrawingArea.topX;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if (i + k1 > DrawingArea.bottomX) {
            int l2 = i + k1 - DrawingArea.bottomX;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if (k1 <= 0) return;
        if (j1 <= 0) return;
        this.method349(DrawingArea.pixels, tempArray, i1, l, k1, j1, l1, i2);
    }

    private void method349(int[] ai, int[] ai1, int j, int k, int l, int i1, int j1, int k1) {
        int l1 = - (l >> 2);
        l = - (l & 3);
        int i2 = - i1;
        while (i2 < 0) {
            int i;
            for (int j2 = l1; j2 < 0 && j + 1 <= ai1.length; ++j2) {
                if ((i = ai1[j++]) != 0 && i != -1) {
                    ai[k++] = i;
                } else {
                    ++k;
                }
                i = ai1[j++];
                if (i != 0 && i != -1) {
                    ai[k++] = i;
                } else {
                    ++k;
                }
                i = ai1[j++];
                if (i != 0 && i != -1) {
                    ai[k++] = i;
                } else {
                    ++k;
                }
                i = ai1[j++];
                if (i != 0 && i != -1) {
                    ai[k++] = i;
                    continue;
                }
                ++k;
            }
            for (int k2 = l; k2 < 0 && j + 1 <= ai1.length; ++k2) {
                if ((i = ai1[j++]) != 0 && i != -1) {
                    ai[k++] = i;
                    continue;
                }
                ++k;
            }
            k += j1;
            j += k1;
            ++i2;
        }
    }

    private void method351(int i, int j, int[] ai, int[] ai1, int l, int i1, int j1, int k1, int l1) {
        int j2 = 256 - k1;
        int k2 = - i1;
        while (k2 < 0) {
            for (int l2 = - j; l2 < 0; ++l2) {
                int k;
                if ((k = ai1[i++]) != 0) {
                    int i3 = ai[l1];
                    ai[l1++] = ((k & 16711935) * k1 + (i3 & 16711935) * j2 & -16711936) + ((k & 65280) * k1 + (i3 & 65280) * j2 & 16711680) >> 8;
                    continue;
                }
                ++l1;
            }
            l1 += j1;
            i += l;
            ++k2;
        }
    }

    public void drawRotatableSprite(int i, int j, int[] ai, int k, int[] ai1, int i1, int j1, int k1, int l1, int i2) {
        try {
            int j2 = (- l1) / 2;
            int k2 = (- i) / 2;
            int l2 = (int)(Math.sin((double)((double)j / 326.11)) * 65536.0);
            int i3 = (int)(Math.cos((double)((double)j / 326.11)) * 65536.0);
            l2 = l2 * k >> 8;
            i3 = i3 * k >> 8;
            int j3 = (i2 << 16) + (k2 * l2 + j2 * i3);
            int k3 = (i1 << 16) + (k2 * i3 - j2 * l2);
            int l3 = k1 + j1 * DrawingArea.width;
            j1 = 0;
            while (j1 < i) {
                int i4 = ai1[j1];
                int j4 = l3 + i4;
                int k4 = j3 + i3 * i4;
                int l4 = k3 - l2 * i4;
                for (k1 = - ai[j1]; k1 < 0; k4 += i3, l4 -= l2, ++k1) {
                    int x1 = k4 >> 16;
                    int y1 = l4 >> 16;
                    int x2 = x1 + 1;
                    int y2 = y1 + 1;
                    int c1 = this.myPixels[x1 + y1 * this.myWidth];
                    int c2 = this.myPixels[x2 + y1 * this.myWidth];
                    int c3 = this.myPixels[x1 + y2 * this.myWidth];
                    int c4 = this.myPixels[x2 + y2 * this.myWidth];
                    int u1 = (k4 >> 8) - (x1 << 8);
                    int v1 = (l4 >> 8) - (y1 << 8);
                    int u2 = (x2 << 8) - (k4 >> 8);
                    int v2 = (y2 << 8) - (l4 >> 8);
                    int a1 = u2 * v2;
                    int a2 = u1 * v2;
                    int a3 = u2 * v1;
                    int a4 = u1 * v1;
                    int r = (c1 >> 16 & 255) * a1 + (c2 >> 16 & 255) * a2 + (c3 >> 16 & 255) * a3 + (c4 >> 16 & 255) * a4 & 16711680;
                    int g = (c1 >> 8 & 255) * a1 + (c2 >> 8 & 255) * a2 + (c3 >> 8 & 255) * a3 + (c4 >> 8 & 255) * a4 >> 8 & 65280;
                    int b = (c1 & 255) * a1 + (c2 & 255) * a2 + (c3 & 255) * a3 + (c4 & 255) * a4 >> 16;
                    DrawingArea.pixels[j4++] = r | g | b;
                }
                j3 += l2;
                k3 += i3;
                l3 += DrawingArea.width;
                ++j1;
            }
            return;
        }
        catch (Exception j2) {
            // empty catch block
        }
    }

    public static Sprite createCustomSprite(String directory, String name) {
        Sprite custom_sprite = new Sprite();
        try {
            Image image = Toolkit.getDefaultToolkit().getImage(directory + File.separator + name + ".png");
            ImageIcon sprite = new ImageIcon(image);
            custom_sprite.myWidth = sprite.getIconWidth();
            custom_sprite.myHeight = sprite.getIconHeight();
            custom_sprite.maxWidth = custom_sprite.myWidth;
            custom_sprite.maxHeight = custom_sprite.myHeight;
            custom_sprite.anInt1442 = 0;
            custom_sprite.anInt1443 = 0;
            custom_sprite.myPixels = new int[custom_sprite.myWidth * custom_sprite.myHeight];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, custom_sprite.myWidth, custom_sprite.myHeight, custom_sprite.myPixels, 0, custom_sprite.myWidth);
            pixelgrabber.grabPixels();
            image = null;
            custom_sprite.setTransparency(255, 0, 255);
            return custom_sprite;
        }
        catch (Exception _ex) {
            System.out.println((Object)_ex);
        }
        return custom_sprite;
    }

    public void drawARGBSprite(int xPos, int yPos) {
        this.drawARGBSprite(xPos, yPos, 256);
    }

    public void drawARGBSprite(int xPos, int yPos, int alpha) {
        if (alpha > 256) {
            alpha = 256;
        }
        int alphaValue = alpha;
        int i1 = (xPos += this.xDrawOffset) + (yPos += this.yDrawOffset) * DrawingArea.width;
        int j1 = 0;
        int spriteHeight = this.myHeight;
        int spriteWidth = this.myWidth;
        int i2 = DrawingArea.width - spriteWidth;
        int j2 = 0;
        if (yPos < DrawingArea.topY) {
            int k2 = DrawingArea.topY - yPos;
            spriteHeight -= k2;
            yPos = DrawingArea.topY;
            j1 += k2 * spriteWidth;
            i1 += k2 * DrawingArea.width;
        }
        if (yPos + spriteHeight > DrawingArea.bottomY) {
            spriteHeight -= yPos + spriteHeight - DrawingArea.bottomY;
        }
        if (xPos < DrawingArea.topX) {
            int l2 = DrawingArea.topX - xPos;
            spriteWidth -= l2;
            xPos = DrawingArea.topX;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if (xPos + spriteWidth > DrawingArea.bottomX) {
            int i3 = xPos + spriteWidth - DrawingArea.bottomX;
            spriteWidth -= i3;
            j2 += i3;
            i2 += i3;
        }
        if (spriteWidth <= 0) return;
        if (spriteHeight <= 0) return;
        this.renderARGBPixels(spriteWidth, spriteHeight, this.myPixels, DrawingArea.pixels, i1, alphaValue, j1, j2, i2);
    }

    private void renderARGBPixels(int spriteWidth, int spriteHeight, int[] spritePixels, int[] renderAreaPixels, int pixel, int alphaValue, int i, int l, int j1) {
        int alpha = alphaValue;
        int height = - spriteHeight;
        while (height < 0) {
            for (int width = - spriteWidth; width < 0; ++width) {
                int pixelColor;
                alphaValue = this.myPixels[i] >> 24 & alpha - 1;
                int alphaLevel = 256 - alphaValue;
                if (alphaLevel > 256) {
                    alphaValue = 0;
                }
                if (alpha == 0) {
                    alphaLevel = 256;
                    alphaValue = 0;
                }
                if ((pixelColor = spritePixels[i++]) != 0) {
                    int pixelValue = renderAreaPixels[pixel];
                    renderAreaPixels[pixel++] = ((pixelColor & 16711935) * alphaValue + (pixelValue & 16711935) * alphaLevel & -16711936) + ((pixelColor & 65280) * alphaValue + (pixelValue & 65280) * alphaLevel & 16711680) >> 8;
                    continue;
                }
                ++pixel;
            }
            pixel += j1;
            i += l;
            ++height;
        }
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Component
 *  java.awt.Graphics
 *  java.awt.Image
 *  java.awt.Point
 *  java.awt.Rectangle
 *  java.awt.Shape
 *  java.awt.image.BufferedImage
 *  java.awt.image.ColorModel
 *  java.awt.image.DataBuffer
 *  java.awt.image.DataBufferInt
 *  java.awt.image.DirectColorModel
 *  java.awt.image.ImageObserver
 *  java.awt.image.Raster
 *  java.awt.image.SampleModel
 *  java.awt.image.WritableRaster
 *  java.lang.Object
 *  java.util.Hashtable
 */
package com.imagineps.client;

import com.imagineps.client.graphics.DrawingArea;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class RSImageProducer {
    public final int[] anIntArray315;
    public final int width;
    public final int height;
    public final BufferedImage image;
    public final Component component;
    private final Rectangle clip = new Rectangle();
    private static final ColorModel COLOR_MODEL = new DirectColorModel(32, 16711680, 65280, 255);

    public RSImageProducer(int width, int height, Component component) {
        this.width = width;
        this.height = height;
        this.component = component;
        int count = width * height;
        this.anIntArray315 = new int[count];
        this.image = new BufferedImage(COLOR_MODEL, Raster.createWritableRaster((SampleModel)COLOR_MODEL.createCompatibleSampleModel(width, height), (DataBuffer)new DataBufferInt(this.anIntArray315, count), (Point)null), false, new Hashtable());
        this.initDrawingArea();
    }

    public void drawGraphics(int y, Graphics gfx, int x) {
        this.draw(gfx, x, y);
    }

    public void draw(Graphics gfx, int x, int y) {
        gfx.drawImage((Image)this.image, x, y, (ImageObserver)this.component);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void draw(Graphics gfx, int x, int y, int clipX, int clipY, int clipWidth, int clipHeight) {
        Shape tmp = gfx.getClip();
        try {
            this.clip.x = clipX;
            this.clip.y = clipY;
            this.clip.width = clipWidth;
            this.clip.height = clipHeight;
            gfx.setClip((Shape)this.clip);
            gfx.drawImage((Image)this.image, x, y, (ImageObserver)this.component);
            return;
        }
        finally {
            gfx.setClip(tmp);
        }
    }

    public void initDrawingArea() {
        DrawingArea.initDrawingArea(this.height, this.width, this.anIntArray315);
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Component
 *  java.awt.Graphics
 *  java.awt.Image
 *  java.awt.image.ColorModel
 *  java.awt.image.DirectColorModel
 *  java.awt.image.ImageConsumer
 *  java.awt.image.ImageObserver
 *  java.awt.image.ImageProducer
 *  java.io.PrintStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Hashtable
 */
package com.imagineps.client.graphics;

import com.imagineps.client.graphics.DrawingArea;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.PrintStream;
import java.util.Hashtable;

public class GraphicsBuffer
implements ImageProducer,
ImageObserver {
    protected Image image;
    public int width;
    public int[] pixels;
    public int height;
    private ColorModel model;
    private ImageConsumer consumer;

    public GraphicsBuffer(int width, int height, int[] raster, Component component) {
        this.width = width;
        this.height = height;
        this.pixels = raster;
        this.model = new DirectColorModel(32, 16711680, 65280, 255);
        this.image = component.createImage((ImageProducer)this);
        this.setPixels();
        component.prepareImage(this.image, (ImageObserver)this);
        this.setPixels();
        component.prepareImage(this.image, (ImageObserver)this);
        this.setPixels();
        component.prepareImage(this.image, (ImageObserver)this);
        this.initDrawingArea();
    }

    public GraphicsBuffer(int width, int height, Component component) {
        this.width = width;
        this.height = height;
        this.pixels = new int[width * height];
        this.model = new DirectColorModel(32, 16711680, 65280, 255);
        this.image = component.createImage((ImageProducer)this);
        this.setPixels();
        component.prepareImage(this.image, (ImageObserver)this);
        this.setPixels();
        component.prepareImage(this.image, (ImageObserver)this);
        this.setPixels();
        component.prepareImage(this.image, (ImageObserver)this);
        this.initDrawingArea();
    }

    public synchronized void addConsumer(ImageConsumer consumer) {
        this.consumer = consumer;
        consumer.setDimensions(this.width, this.height);
        consumer.setProperties(null);
        consumer.setColorModel(this.model);
        consumer.setHints(14);
    }

    public void drawGraphics(int y, Graphics g, int x) {
        this.setPixels();
        g.drawImage(this.image, x, y, (ImageObserver)this);
    }

    public boolean imageUpdate(Image image, int bit, int x, int y, int width, int height) {
        return true;
    }

    public synchronized boolean isConsumer(ImageConsumer consumer) {
        if (this.consumer != consumer) return false;
        return true;
    }

    private synchronized void setPixels() {
        if (this.consumer == null) return;
        this.consumer.setPixels(0, 0, this.width, this.height, this.model, this.pixels, 0, this.width);
        this.consumer.imageComplete(2);
    }

    public synchronized void removeConsumer(ImageConsumer consumer) {
        if (this.consumer != consumer) return;
    }

    public void requestTopDownLeftRightResend(ImageConsumer consumer) {
        System.out.println("TDLR");
    }

    public void startProduction(ImageConsumer consumer) {
        this.addConsumer(consumer);
    }

    public String toString() {
        return "Width: " + this.width + " Height: " + this.height;
    }

    public final void initDrawingArea() {
        DrawingArea.initDrawingArea(this.height, this.width, this.pixels);
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.FontMetrics
 *  java.awt.Graphics
 *  java.awt.Graphics2D
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.TimeUnit
 */
package com.imagineps.client.updater.screen;

import com.imagineps.client.Client;
import com.imagineps.client.Stopwatch;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public abstract class UpdateComponent {
    private String label;
    private int ticks;
    private final Stopwatch stopwatch = new Stopwatch();
    private BufferedImage image;
    private Graphics graphics;

    public void setup(Client client) {
        this.image = new BufferedImage(this.getWidth(), this.getHeight(), 2);
        this.graphics = this.image.createGraphics();
    }

    public abstract void render(Client var1);

    public void setLabel(String label) {
        this.label = label;
    }

    protected final void drawLabel(Color color) {
        int labelWidth = this.getGraphics().getFontMetrics().stringWidth(this.label);
        int x = (this.getWidth() - labelWidth) / 2;
        int y = this.getHeight() / 2;
        this.getGraphics().setColor(new Color(0, 0, 0, color.getAlpha()));
        this.getGraphics().drawString(this.label, x + 1, y + 1);
        this.getGraphics().setColor(color);
        this.getGraphics().drawString(this.label, x, y);
    }

    protected final void drawWaitingLabel(Color color) {
        int labelWidth = this.getGraphics().getFontMetrics().stringWidth(this.label);
        int x = (this.getWidth() - labelWidth) / 2;
        int y = this.getHeight() / 2;
        if (this.ticks % 4 <= 0) {
            this.getGraphics().setColor(Color.BLACK);
            this.getGraphics().drawString(this.label, x + 1, y + 1);
            this.getGraphics().setColor(color);
            this.getGraphics().drawString(this.label, x, y);
            return;
        }
        StringBuilder message = new StringBuilder(this.label);
        int index = 0;
        do {
            if (index > this.ticks % 4) {
                this.getGraphics().setColor(Color.BLACK);
                this.getGraphics().drawString(message.toString(), x + 1, y + 1);
                this.getGraphics().setColor(color);
                this.getGraphics().drawString(message.toString(), x, y);
                return;
            }
            if (index > 0) {
                message.append('.');
            }
            ++index;
        } while (true);
    }

    public void process() {
        if (!this.stopwatch.hasElapsed(500L, TimeUnit.MILLISECONDS)) return;
        ++this.ticks;
        this.stopwatch.reset();
    }

    public int getWidth() {
        return Client.clientWidth;
    }

    public int getHeight() {
        return Client.clientHeight;
    }

    public BufferedImage getImage() {
        return this.image;
    }

    public Graphics getGraphics() {
        return this.graphics;
    }
}


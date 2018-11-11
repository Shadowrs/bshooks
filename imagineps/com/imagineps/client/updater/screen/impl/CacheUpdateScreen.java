/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.BasicStroke
 *  java.awt.Color
 *  java.awt.Font
 *  java.awt.FontMetrics
 *  java.awt.Graphics
 *  java.awt.Graphics2D
 *  java.awt.RenderingHints
 *  java.awt.RenderingHints$Key
 *  java.awt.Stroke
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client.updater.screen.impl;

import com.imagineps.client.Client;
import com.imagineps.client.updater.screen.UpdateComponent;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;

public class CacheUpdateScreen
extends UpdateComponent {
    private int progress;
    private int ticks;
    private int arcLength;
    private int arcAngle;
    private int startColor;
    private int endColor;

    @Override
    public void setup(Client client) {
        super.setup(client);
        Graphics2D g2d = (Graphics2D)this.getGraphics();
        g2d.setStroke((Stroke)new BasicStroke(5.0f));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.getGraphics().setFont(new Font("Helvetica", 0, 25));
        this.setLabel("Requesting cache files");
    }

    @Override
    public void render(Client client) {
        if (this.getGraphics() == null) {
            return;
        }
        this.getGraphics().setFont(new Font("Helvetica", 0, 20));
        this.drawProgressBar();
        this.getGraphics().setFont(new Font("Helvetica", 0, 25));
        this.drawWaitingLabel(Color.WHITE);
    }

    @Override
    public void process() {
        super.process();
        if (this.startColor == this.endColor) {
            int minimum = 127;
            int r = (int)(Math.random() * (double)(255 - minimum)) + minimum;
            int g = (int)(Math.random() * (double)(255 - minimum)) + minimum;
            int b = (int)(Math.random() * (double)(255 - minimum)) + minimum;
            this.endColor = (r & 255) << 16 | (g & 255) << 8 | b & 255;
        }
        double amplitude = (double)this.ticks++ / 45.0;
        double offset = Math.sin((double)amplitude) + Math.cos((double)amplitude);
        this.arcAngle = (int)(180.0 * offset);
        this.arcLength = (int)(45.0 * offset);
    }

    public synchronized void setProgress(int progress) {
        this.progress = progress;
    }

    private void drawProgressBar() {
        int messageWidth = this.getGraphics().getFontMetrics().stringWidth("Requesting cache files...");
        messageWidth += messageWidth / 2 + 5;
        int x = (this.getWidth() - messageWidth) / 2;
        int y = (this.getHeight() - messageWidth) / 2;
        this.getGraphics().setFont(new Font("Helvetica", 0, 15));
        this.drawArc(x, y, messageWidth, 0, this.arcAngle);
        this.drawArc(x, y, messageWidth, 0, 180 + this.arcAngle);
        this.drawArc(x, y, messageWidth, 20, 180 - this.arcAngle);
        this.drawArc(x, y, messageWidth, 20, 360 - this.arcAngle);
        this.getGraphics().setFont(new Font("Helvetica", 0, 25));
        messageWidth = this.getGraphics().getFontMetrics().stringWidth("" + this.progress + "%");
        this.getGraphics().setColor(Color.WHITE);
        this.getGraphics().drawString("" + this.progress + "%", (this.getWidth() - messageWidth) / 2, this.getHeight() / 2 + 50);
    }

    private void drawArc(int x, int y, int size, int offSet, int angle) {
        Graphics2D g2d = (Graphics2D)this.getGraphics();
        g2d.setStroke((Stroke)new BasicStroke(1.0f, 1, 1));
        this.getGraphics().setColor(new Color(this.getRed(), this.getGreen(), this.getBlue()));
        this.getGraphics().drawArc(x - offSet / 2, y - offSet / 2, size + offSet, size + offSet, angle, 90 - this.arcLength);
        g2d.setStroke((Stroke)new BasicStroke(3.0f, 1, 1));
        this.getGraphics().setColor(new Color(this.getRed(), this.getGreen(), this.getBlue(), 75));
        this.getGraphics().drawArc(x - offSet / 2, y - offSet / 2, size + offSet, size + offSet, angle, 90 - this.arcLength);
        g2d.setStroke((Stroke)new BasicStroke(7.0f, 1, 1));
        this.getGraphics().setColor(new Color(this.getRed(), this.getGreen(), this.getBlue(), 25));
        this.getGraphics().drawArc(x - offSet / 2, y - offSet / 2, size + offSet, size + offSet, angle, 90 - this.arcLength);
    }

    private int getRed() {
        int start = this.startColor >> 16 & 255;
        int end = this.endColor >> 16 & 255;
        if (start > end) {
            start = start - 1 & 255;
        } else if (start < end) {
            start = start + 1 & 255;
        }
        this.startColor = this.startColor & 65535 | start << 16;
        return start;
    }

    private int getGreen() {
        int start = this.startColor >> 8 & 255;
        int end = this.endColor >> 8 & 255;
        if (start > end) {
            start = start - 1 & 255;
        } else if (start < end) {
            start = start + 1 & 255;
        }
        this.startColor = this.startColor & 16711935 | start << 8;
        return start;
    }

    private int getBlue() {
        int start = this.startColor & 255;
        int end = this.endColor & 255;
        if (start > end) {
            start = start - 1 & 255;
        } else if (start < end) {
            start = start + 1 & 255;
        }
        this.startColor = this.startColor & 16776960 | start;
        return start;
    }
}


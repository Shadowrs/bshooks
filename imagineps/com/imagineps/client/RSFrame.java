/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Component
 *  java.awt.Graphics
 *  java.awt.Insets
 *  java.awt.image.BufferStrategy
 *  java.lang.String
 *  javax.swing.JFrame
 */
package com.imagineps.client;

import com.imagineps.client.RSApplet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

public class RSFrame
extends JFrame {
    private static final long serialVersionUID = 1L;
    private BufferStrategy bufferStrategy;
    private final RSApplet rsApplet;

    public RSFrame(RSApplet applet, int width, int height, boolean undecorated, boolean resizable) {
        this.rsApplet = applet;
        this.setTitle("Imagine");
        this.setUndecorated(undecorated);
        this.setResizable(resizable);
        this.setVisible(true);
        Insets insets = this.getInsets();
        this.setSize(width + insets.left + insets.right, height + insets.top + insets.bottom);
        this.setFocusTraversalKeysEnabled(false);
        this.setLocationRelativeTo(null);
        this.requestFocus();
        this.toFront();
        this.setBackground(Color.BLACK);
    }

    public RSFrame(RSApplet rsapplet, int width, int height) {
        this(rsapplet, width, height, false, false);
    }

    public Graphics getGraphics() {
        Graphics g = super.getGraphics();
        Insets insets = this.getInsets();
        g.translate(insets.left, insets.top);
        return g;
    }

    public void update(Graphics g) {
        this.rsApplet.update(g);
    }

    public void paintComponents(Graphics g) {
        this.rsApplet.paintComponents(g);
    }

    public BufferStrategy getBufStrategy() {
        return this.bufferStrategy;
    }
}


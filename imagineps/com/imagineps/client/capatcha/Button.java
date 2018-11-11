/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Dimension
 *  java.awt.Graphics
 *  java.awt.Image
 *  java.awt.image.ImageObserver
 *  javax.swing.JButton
 */
package com.imagineps.client.capatcha;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.JButton;

abstract class Button
extends JButton {
    public Button() {
        this.setMinimumSize(new Dimension(25, 17));
        this.setMaximumSize(new Dimension(25, 17));
        this.setPreferredSize(new Dimension(25, 17));
        this.setSize(new Dimension(25, 17));
    }

    public abstract Image getImage();

    public void paint(Graphics graphics) {
        graphics.drawImage(this.getImage(), 0, 0, null);
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Component
 *  java.awt.Graphics
 *  java.awt.event.ActionEvent
 *  java.awt.event.ActionListener
 *  java.awt.image.BufferedImage
 *  java.awt.image.DataBuffer
 *  java.awt.image.DataBufferInt
 *  java.awt.image.WritableRaster
 *  java.lang.Object
 *  javax.swing.Timer
 */
package com.imagineps.client.updater.screen;

import com.imagineps.client.Client;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.login.LoginRenderer;
import com.imagineps.client.updater.screen.UpdateComponent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.WritableRaster;
import javax.swing.Timer;

public class UpdaterRenderer
implements ActionListener {
    private final Client client;
    private final Graphics graphics;
    public UpdateComponent screen;
    private final Timer timer;

    public UpdaterRenderer(Client client, Graphics graphics) {
        this.timer = new Timer(25, (ActionListener)this);
        this.client = client;
        this.graphics = graphics;
    }

    public void setScreen(UpdateComponent screen) {
        this.screen = screen;
        screen.setup(this.client);
        int[] raster = ((DataBufferInt)screen.getImage().getRaster().getDataBuffer()).getData();
        Client.updateScreenGraphicsBuffer = new GraphicsBuffer(765, 503, raster, this.client.getGameComponent());
        Client.updateScreenGraphicsBuffer.initDrawingArea();
        this.timer.restart();
    }

    private void process() {
        if (this.screen == null) return;
        this.screen.process();
    }

    private void render() {
        if (this.client.loginRenderer != null) {
            return;
        }
        if (this.screen == null) return;
        if (Client.updateScreenGraphicsBuffer == null) return;
        DrawingArea.reset(new Color(19, 44, 50));
        this.screen.render(this.client);
        if (this.graphics == null) return;
        Client.updateScreenGraphicsBuffer.drawGraphics(0, this.graphics, 0);
    }

    public void actionPerformed(ActionEvent e) {
        this.process();
        this.render();
    }

    public void finish() {
        this.timer.stop();
    }
}


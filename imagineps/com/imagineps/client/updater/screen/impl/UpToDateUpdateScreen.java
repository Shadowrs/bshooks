/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Font
 *  java.awt.Graphics
 *  java.awt.Graphics2D
 *  java.awt.RenderingHints
 *  java.awt.RenderingHints$Key
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 */
package com.imagineps.client.updater.screen.impl;

import com.imagineps.client.Client;
import com.imagineps.client.Stopwatch;
import com.imagineps.client.updater.Updater;
import com.imagineps.client.updater.screen.UpdateComponent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.concurrent.TimeUnit;

public class UpToDateUpdateScreen
extends UpdateComponent {
    private final Stopwatch stopwatch = new Stopwatch();

    @Override
    public void setup(Client client) {
        super.setup(client);
        Graphics2D g2d = (Graphics2D)this.getGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.getGraphics().setFont(new Font("Helvetica", 0, 25));
        this.setLabel("Client is up to date!");
        this.stopwatch.reset();
    }

    @Override
    public void render(Client client) {
        this.drawLabel(Color.WHITE);
    }

    @Override
    public void process() {
        if (!this.stopwatch.hasElapsed(750L, TimeUnit.MILLISECONDS)) return;
        Updater.get().finish();
    }
}


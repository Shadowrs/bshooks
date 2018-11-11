/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Graphics
 *  java.lang.String
 */
package com.imagineps.client.login.impl;

import com.imagineps.client.Client;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.graphics.Rasterizer;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.login.LoginComponent;
import com.imagineps.client.login.LoginRenderer;
import com.imagineps.client.login.ScreenType;
import com.imagineps.client.login.impl.MainScreen;
import com.imagineps.content.login_screen.LoginScreen;
import java.awt.Graphics;

public class MessageScreen
extends LoginComponent {
    @Override
    public void render(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        this.refresh(client);
        this.load(client, 13);
        Sprite background = LoginScreen.getImage("error_screen");
        if (background != null) {
            background.drawTransparentSprite(client.getWidth() / 2 - background.myWidth / 2, client.getHeight() / 2 - background.myHeight / 2, client.loginTick);
        }
        Rasterizer.drawFilledPixels(centerX - 212, centerY - 50, 425, 100, 3680810, 150);
        Rasterizer.drawRectangle(centerX - 212, centerY - 50, 425, 100, 11937318);
        client.normalFont.drawCenteredText(15032673, centerX + 5, client.loginMessage, centerY + 20, true);
        client.boldFont.drawCenteredText(1142143, centerX + 5, "[ Click anywhere to return to the main screen ]", centerY + 155, true);
        this.drawWorldSelect(client);
        Client.loginScreenGraphicsBuffer.drawGraphics(0, client.getGraphics(), 0);
        DrawingArea.setAllPixelsToZero();
    }

    @Override
    public void click(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        this.settingButton(client);
        this.worldSelectButton(client);
        if (client.clickMode3 != 1) return;
        if (!client.mouseInRegion(centerX - 381, centerY - 249, centerX + 381, centerY + 245)) return;
        client.loginMessage = "";
        client.loginRenderer.setScreen(new MainScreen());
    }

    @Override
    public ScreenType type() {
        return ScreenType.MESSAGE;
    }
}


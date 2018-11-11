/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Graphics
 *  java.lang.String
 */
package com.imagineps.client.login.impl;

import com.imagineps.client.AccountData;
import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.RSFont;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.login.LoginComponent;
import com.imagineps.client.login.ScreenType;
import com.imagineps.content.login_screen.LoginScreen;
import java.awt.Graphics;

public class CaptchaScreen
extends LoginComponent {
    @Override
    public void render(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        this.refresh(client);
        this.load(client, 13);
        Sprite background = LoginScreen.getImage("captch_screen");
        if (background != null) {
            background.drawTransparentSprite(client.getWidth() / 2 - background.myWidth / 2, client.getHeight() / 2 - background.myHeight / 2, client.loginTick);
        }
        client.boldFont.drawCenteredText(1803417, centerX + 11, "Remove " + client.accountToRemove.username + "?", centerY - 59, true);
        if (client.mouseInRegion(centerX - 72, centerY + 22, centerX + 83, centerY + 52)) {
            Sprite loginButton = LoginScreen.getImage("confirmation_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(310, 270, client.loginTick);
            }
        } else {
            Sprite loginButton = LoginScreen.getImage("confirmation_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(310, 270, client.loginTick - 30);
            }
        }
        client.newBoldFont.drawBasicString("Login", 366, 287, 9944261, 0);
        this.drawSetting(client);
        this.drawWorldSelect(client);
        if (Configuration.DEBUG_MODE) {
            client.smallFont.drawCenteredText(16777215, centerX + 300, "MouseX: " + client.mouseX + " Mouse Y: " + client.mouseY, centerY - 225, true);
        }
        Client.loginScreenGraphicsBuffer.drawGraphics(0, client.getGraphics(), 0);
        DrawingArea.setAllPixelsToZero();
    }

    @Override
    public void click(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        this.settingButton(client);
        this.worldSelectButton(client);
    }

    @Override
    public ScreenType type() {
        return ScreenType.CAPTCHA;
    }
}


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
import com.imagineps.client.login.LoginRenderer;
import com.imagineps.client.login.ScreenType;
import com.imagineps.client.login.impl.MainScreen;
import com.imagineps.content.AccountManager;
import com.imagineps.content.login_screen.LoginScreen;
import java.awt.Graphics;

public class ConfirmationScreen
extends LoginComponent {
    @Override
    public void render(Client client) {
        Sprite loginButton;
        int centerX = this.getX();
        int centerY = this.getY();
        this.refresh(client);
        this.load(client, 13);
        Sprite background = LoginScreen.getImage("confirmation_screen");
        if (background != null) {
            background.drawTransparentSprite(client.getWidth() / 2 - background.myWidth / 2, client.getHeight() / 2 - background.myHeight / 2, client.loginTick);
        }
        client.boldFont.drawCenteredText(1803417, centerX + 11, "Remove " + client.accountToRemove.username + "?", centerY - 59, true);
        if (client.mouseInRegion(centerX - 72, centerY - 19, centerX + 83, centerY + 5)) {
            loginButton = LoginScreen.getImage("confirmation_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(centerX - 72, centerY - 20, client.loginTick);
            }
        } else {
            loginButton = LoginScreen.getImage("confirmation_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(centerX - 72, centerY - 20, client.loginTick - 30);
            }
        }
        if (client.mouseInRegion(centerX - 72, centerY + 22, centerX + 83, centerY + 52)) {
            loginButton = LoginScreen.getImage("confirmation_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(centerX - 72, centerY + 23, client.loginTick);
            }
        } else {
            loginButton = LoginScreen.getImage("confirmation_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(centerX - 72, centerY + 23, client.loginTick - 30);
            }
        }
        Client.newRegularFont.drawBasicString("Remove account", centerX - 40, centerY - 2, 9944261, 0);
        Client.newRegularFont.drawBasicString("Cancel", centerX - 13, centerY + 40, 9944261, 0);
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
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 72, centerY - 19, centerX + 83, centerY + 5)) {
            AccountManager.removeAccount(client.accountToRemove);
            client.accountToRemove = null;
            client.loginRenderer.setScreen(new MainScreen());
        }
        if (client.clickMode3 != 1) return;
        if (!client.mouseInRegion(centerX - 72, centerY + 22, centerX + 83, centerY + 52)) return;
        client.accountToRemove = null;
        client.loginRenderer.setScreen(new MainScreen());
    }

    @Override
    public ScreenType type() {
        return ScreenType.CONFIRMATION;
    }
}


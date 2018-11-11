/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Graphics
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.imagineps.client.login.impl;

import com.imagineps.client.AccountData;
import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.RSFont;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.Utility;
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

public class AccountScreen
extends LoginComponent {
    @Override
    public void render(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        this.refresh(client);
        this.load(client, 13);
        AccountData account = client.lastAccount;
        int moveY = 20;
        Sprite background = LoginScreen.getImage("account_screen");
        if (background != null) {
            background.drawTransparentSprite(client.getWidth() / 2 - background.myWidth / 2, client.getHeight() / 2 - background.myHeight / 2, client.loginTick);
        }
        Rasterizer.drawFilledPixels(centerX, centerY - 150 + moveY, 200, 245, 1319717, 150);
        Rasterizer.drawRectangle(centerX, centerY - 150 + moveY, 200, 245, 1390397);
        client.newBoldFont.drawCenteredString(account.username == null ? "" : Utility.formatName(account.username), centerX + 93, centerY - 110, 9944261, 0);
        client.newBoldFont.drawBasicString("Created:", centerX + 5, centerY - 70 + moveY, 1142143, 0);
        client.newBoldFont.drawBasicString(account.created, centerX + 75, centerY - 70 + moveY, 9944261, 0);
        client.newBoldFont.drawBasicString("Rank:", centerX + 5, centerY - 110 + moveY, 1142143, 0);
        int rank = account.rank - 1;
        client.newBoldFont.drawBasicString((rank == 0 ? new StringBuilder().append("<img=").append(rank).append("> ").toString() : "") + Utility.getRank(rank), centerX + 46, centerY - 110 + moveY, 9944261, 0);
        client.newBoldFont.drawBasicString("Uses:", centerX + 5, centerY - 90 + moveY, 1142143, 0);
        client.newBoldFont.drawBasicString("" + account.uses + "", centerX + 48, centerY - 90 + moveY, 9944261, 0);
        client.boldFont.drawCenteredText(1142143, centerX + 5, "[ Click anywhere to return to the main screen ]", centerY + 155, true);
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
        if (client.clickMode3 != 1) return;
        if (!client.mouseInRegion(centerX - 381, centerY - 249, centerX + 381, centerY + 245)) return;
        client.loginMessage = "";
        client.loginRenderer.setScreen(new MainScreen());
    }

    @Override
    public ScreenType type() {
        return ScreenType.ACCOUNT;
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Component
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package com.imagineps.client.login;

import com.imagineps.client.Bubble;
import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.RSFont;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.graphics.Rasterizer;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.login.LoginRenderer;
import com.imagineps.client.login.ScreenType;
import com.imagineps.client.login.impl.MainScreen;
import com.imagineps.client.login.impl.SettingScreen;
import com.imagineps.client.login.impl.WorldSelectScreen;
import com.imagineps.content.login_screen.LoginScreen;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class LoginComponent {
    public abstract void render(Client var1);

    public abstract void click(Client var1);

    public abstract ScreenType type();

    protected void refresh(Client client) {
        if (Client.loginScreenGraphicsBuffer != null && Client.loginScreenGraphicsBuffer.width == Client.clientWidth) {
            if (Client.loginScreenGraphicsBuffer.height == Client.clientHeight) return;
        }
        Client.loginScreenGraphicsBuffer = Client.constructGraphicsBuffer(Client.clientWidth, Client.clientHeight, client.getGameComponent());
        DrawingArea.setAllPixelsToZero();
    }

    public void load(Client client, int rate) {
        client.loginTick += rate;
        if (client.loginTick > 255) {
            client.loginTick = 255;
            client.loginLoaded = true;
        }
        if (!Configuration.DRAW_BUBBLES) return;
        Iterator iterator = Client.bubbles.iterator();
        while (iterator.hasNext()) {
            Bubble bubble = (Bubble)iterator.next();
            bubble.draw((byte)0);
        }
    }

    protected void drawSetting(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        Sprite settingsButton = LoginScreen.getImage("settings_button");
        Sprite backButton = LoginScreen.getImage("back_button");
        if (client.mouseInRegion(centerX - 372, centerY + 203, centerX - 332, centerY + 242)) {
            if (settingsButton == null) return;
            if (backButton == null) return;
            if (client.loginRenderer.getScreen(ScreenType.SETTING)) {
                backButton.drawTransparentSprite(10, 453, 130);
                return;
            }
            settingsButton.drawTransparentSprite(10, 453, 130);
            return;
        }
        if (settingsButton == null) return;
        if (backButton == null) return;
        if (client.loginRenderer.getScreen(ScreenType.SETTING)) {
            backButton.drawTransparentSprite(10, 453, 100);
            return;
        }
        settingsButton.drawTransparentSprite(10, 453, 100);
    }

    protected void drawWorldSelect(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        Sprite worldSelectButton = LoginScreen.getImage("world_select");
        Sprite backButton = LoginScreen.getImage("back_button");
        if (client.mouseInRegion(centerX - 372, centerY + 203, centerX - 332, centerY + 242)) {
            if (worldSelectButton == null) return;
            if (backButton == null) return;
            if (client.loginRenderer.getScreen(ScreenType.WORLD_SELECT)) {
                backButton.drawTransparentSprite(centerX - 372, centerY + 203, 130);
                return;
            }
            worldSelectButton.drawTransparentSprite(centerX - 372, centerY + 203, 130);
            return;
        }
        if (worldSelectButton == null) return;
        if (backButton == null) return;
        if (client.loginRenderer.getScreen(ScreenType.WORLD_SELECT)) {
            backButton.drawTransparentSprite(centerX - 372, centerY + 203, 130);
            return;
        }
        worldSelectButton.drawTransparentSprite(centerX - 372, centerY + 203, 130);
    }

    protected void settingButton(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        if (client.clickMode3 != 1) return;
        if (!client.mouseInRegion(centerX - 372, centerY + 203, centerX - 332, centerY + 242)) return;
        if (client.loginRenderer.getScreen(ScreenType.SETTING)) {
            client.loginRenderer.setScreen(new MainScreen());
            return;
        }
        client.loginRenderer.setScreen(new SettingScreen());
    }

    protected void worldSelectButton(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        if (client.clickMode3 != 1) return;
        if (!client.mouseInRegion(centerX - 372, centerY + 203, centerX - 332, centerY + 242)) return;
        if (client.loginRenderer.getScreen(ScreenType.WORLD_SELECT)) {
            client.loginRenderer.setScreen(new MainScreen());
            return;
        }
        client.loginRenderer.setScreen(new WorldSelectScreen());
    }

    protected void addTooltip(String message) {
        int x = Client.instance.mouseX;
        int y = Client.instance.mouseY;
        int boxWith = Client.newSmallFont.getTextWidth(message) + 30;
        if (x > 638) {
            x = 638;
        }
        if (y > 467) {
            y = 467;
        }
        Rasterizer.drawFilledPixels(x + 15, y + 10, boxWith, 22, 1390397, 150);
        Rasterizer.drawRectangle(x + 15, y + 10, boxWith, 22, 0);
        Client.newSmallFont.drawBasicString(message, x + 30, y + 27, 16777215, 1);
    }

    public int getX() {
        return Client.getClientWidth() / 2;
    }

    public int getY() {
        return Client.getClientHeight() / 2;
    }
}


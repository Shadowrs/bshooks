/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Component
 *  java.awt.Graphics
 *  java.lang.Object
 *  java.lang.String
 *  javax.swing.JOptionPane
 */
package com.imagineps.client.login.impl;

import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.ConnectionStatus;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.graphics.Rasterizer;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.login.LoginComponent;
import com.imagineps.client.login.ScreenType;
import com.imagineps.content.login_screen.LoginScreen;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class WorldSelectScreen
extends LoginComponent {
    @Override
    public void render(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        this.refresh(client);
        this.load(client, 13);
        Sprite background = LoginScreen.getImage("settings_screen");
        if (background != null) {
            background.drawTransparentSprite(centerX - background.myWidth / 2, centerY - background.myHeight / 2, client.loginTick);
        }
        Rasterizer.drawFilledPixels(centerX - 145, centerY - 110, 300, 260, 1319717, 150);
        Rasterizer.drawRectangle(centerX - 145, centerY - 110, 300, 260, 1390397);
        client.boldFont.drawCenteredText(1142143, centerX + 5, "Selected World", centerY - 130, true);
        client.boldFont.drawCenteredText(9944261, centerX + 5, Client.connectionStatus.name, centerY - 115, true);
        client.boldFont.drawCenteredText(1803417, centerX - 114, "World", centerY - 91, true);
        client.boldFont.drawCenteredText(1803417, centerX, "Description", centerY - 91, true);
        client.boldFont.drawCenteredText(1803417, centerX + 114, "Players", centerY - 91, true);
        Rasterizer.drawFilledPixels(centerX - 145, centerY - 110, 300, 30, 945784, 40);
        Rasterizer.drawRectangle(centerX - 145, centerY - 110, 300, 30, 1390397);
        String[][] worldData = new String[][]{{"1", "ECO (World 1)", "0"}, {"2", "PVP (World 2)", "0"}, {"3", "Local", "0"}, {"4", "Beta", "0"}};
        int xPos = centerX - 145;
        int yPos = centerY - 80;
        String[][] arrarrstring = worldData;
        int n = arrarrstring.length;
        for (int i = 0; i < n; yPos += 30, ++i) {
            String[] s = arrarrstring[i];
            client.normalFont.drawCenteredText(9944261, centerX - 113, s[0], yPos + 19, true);
            client.normalFont.drawCenteredText(9944261, centerX, s[1], yPos + 19, true);
            client.normalFont.drawCenteredText(9944261, centerX + 114, s[2], yPos + 19, true);
            if (client.mouseInRegion(xPos, yPos - 2, xPos + 200, yPos + 30)) {
                Rasterizer.drawFilledPixels(xPos, yPos, 300, 30, 945784, 105);
                Rasterizer.drawRectangle(xPos, yPos, 300, 30, 1390397);
                continue;
            }
            Rasterizer.drawFilledPixels(xPos, yPos, 300, 30, 1319717, 130);
            Rasterizer.drawRectangle(xPos, yPos, 300, 30, 1390397);
        }
        this.drawWorldSelect(client);
        if (Configuration.DEBUG_MODE) {
            client.smallFont.drawCenteredText(16777215, centerX + 300, "MouseX: " + (client.mouseX - centerX) + " Mouse Y: " + (client.mouseY - centerY), centerY - 225, true);
        }
        Client.loginScreenGraphicsBuffer.drawGraphics(0, client.getGraphics(), 0);
        DrawingArea.setAllPixelsToZero();
    }

    @Override
    public void click(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 150, centerY - 78, centerX + 152, centerY - 50)) {
            if (Client.betaOnly) {
                JOptionPane.showMessageDialog((Component)client, (Object)"This is a beta only client, you cannot select this world.", (String)"Beta Only", (int)2);
                return;
            }
            Client.connectionStatus = ConnectionStatus.ECO;
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 150, centerY - 50, centerX + 152, centerY - 21)) {
            if (Client.betaOnly) {
                JOptionPane.showMessageDialog((Component)client, (Object)"This is a beta only client, you cannot select this world.", (String)"Beta Only", (int)2);
                return;
            }
            Client.connectionStatus = ConnectionStatus.PVP;
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 150, centerY - 20, centerX + 152, centerY + 7)) {
            if (Client.betaOnly) {
                JOptionPane.showMessageDialog((Component)client, (Object)"This is a beta only client, you cannot select this world.", (String)"Beta Only", (int)2);
                return;
            }
            Client.connectionStatus = ConnectionStatus.LOCAL;
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 150, centerY + 10, centerX + 152, centerY + 36)) {
            Client.connectionStatus = ConnectionStatus.BETA;
        }
        this.worldSelectButton(client);
    }

    @Override
    public ScreenType type() {
        return ScreenType.WORLD_SELECT;
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Graphics
 *  java.lang.String
 */
package com.imagineps.client.login.impl;

import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.login.LoginComponent;
import com.imagineps.client.login.LoginRenderer;
import com.imagineps.client.login.ScreenType;
import com.imagineps.client.login.impl.MainScreen;
import com.imagineps.content.login_screen.LoginScreen;
import java.awt.Graphics;

public class LoaderScreen
extends LoginComponent {
    @Override
    public void render(Client client) {
        Sprite creditsSale;
        Sprite runningSmooth;
        Sprite browseButton;
        Sprite chinPetSale;
        Sprite loginButton;
        Sprite tyrantArmourSale;
        Sprite voteButton;
        int centerX = this.getX();
        int centerY = this.getY();
        this.refresh(client);
        this.load(client, 10);
        Sprite background = LoginScreen.getImage("loader_screen");
        if (background != null) {
            background.drawTransparentSprite(client.getWidth() / 2 - background.myWidth / 2, client.getHeight() / 2 - background.myHeight / 2, client.loginTick);
        }
        if ((runningSmooth = LoginScreen.getImage("running_smooth")) != null) {
            runningSmooth.drawTransparentSprite(72, 35, client.loginTick - 80);
        }
        client.boldFont.drawCenteredText(16772787, 238, "Loader Screen & Client Improvements", 125, false);
        client.normalFont.drawCenteredText(13881279, 238, "February 15, 2018", 142, false);
        client.normalFont.drawText(false, 13881279, 238, "Hey guys! Firstly thank you so much for playing. This", 170);
        client.normalFont.drawText(false, 13881279, 238, "batch of updates are particularity fine tuned to keep", 184);
        client.normalFont.drawText(false, 13881279, 238, "you in the loop as much as possible. With the launcher", 198);
        client.normalFont.drawText(false, 13881279, 238, "displaying not only the latest updates and current sales", 212);
        client.normalFont.drawText(false, 13881279, 238, "but also the server status. This screen will keep you up", 226);
        client.normalFont.drawText(false, 13881279, 238, "to date with important information.", 240);
        client.normalFont.drawText(false, 13881279, 238, "Over the next few months you'll see a lot of changes to", 270);
        client.normalFont.drawText(false, 13881279, 238, "Imagine-PS as we do our best to provide you with nothing", 284);
        client.normalFont.drawText(false, 13881279, 238, "but perfection. You motivate us simply by playing.", 298);
        client.normalFont.drawText(false, 13881279, 238, "Please make sure you vote for us. It helps get our name", 328);
        client.normalFont.drawText(false, 13881279, 240, "out there. Thanks for playing. You're the best!", 342);
        if (client.mouseInRegion(151, 356, 317, 392)) {
            voteButton = LoginScreen.getImage("vote_button");
            if (voteButton != null) {
                voteButton.drawTransparentSprite(150, 355, client.loginTick);
            }
        } else {
            voteButton = LoginScreen.getImage("vote_button");
            if (voteButton != null) {
                voteButton.drawTransparentSprite(150, 355, client.loginTick - 50);
            }
        }
        client.boldFont.drawCenteredText(16772787, 573, "Store Promotions & Flash Sales", 125, false);
        client.normalFont.drawCenteredText(13881279, 573, "These are custom to change at anytime", 142, false);
        if (client.mouseInRegion(445, 161, 703, 215)) {
            creditsSale = LoginScreen.getImage("credits_sale");
            if (creditsSale != null) {
                creditsSale.drawTransparentSprite(446, 160, client.loginTick);
            }
        } else {
            creditsSale = LoginScreen.getImage("credits_sale");
            if (creditsSale != null) {
                creditsSale.drawTransparentSprite(446, 160, client.loginTick - 50);
            }
        }
        if (client.mouseInRegion(445, 225, 703, 279)) {
            chinPetSale = LoginScreen.getImage("chinchompa_pet_sale");
            if (chinPetSale != null) {
                chinPetSale.drawTransparentSprite(446, 223, client.loginTick);
            }
        } else {
            chinPetSale = LoginScreen.getImage("chinchompa_pet_sale");
            if (chinPetSale != null) {
                chinPetSale.drawTransparentSprite(446, 223, client.loginTick - 50);
            }
        }
        if (client.mouseInRegion(445, 287, 703, 343)) {
            tyrantArmourSale = LoginScreen.getImage("tyrant_armour_sale");
            if (tyrantArmourSale != null) {
                tyrantArmourSale.drawTransparentSprite(446, 286, client.loginTick);
            }
        } else {
            tyrantArmourSale = LoginScreen.getImage("tyrant_armour_sale");
            if (tyrantArmourSale != null) {
                tyrantArmourSale.drawTransparentSprite(446, 286, client.loginTick - 50);
            }
        }
        if (client.mouseInRegion(493, 358, 657, 391)) {
            browseButton = LoginScreen.getImage("browse_button");
            if (browseButton != null) {
                browseButton.drawTransparentSprite(490, 355, client.loginTick);
            }
        } else {
            browseButton = LoginScreen.getImage("browse_button");
            if (browseButton != null) {
                browseButton.drawTransparentSprite(490, 355, client.loginTick - 50);
            }
        }
        if (client.mouseInRegion(270, 432, 510, 468)) {
            loginButton = LoginScreen.getImage("continue_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(270, 430, client.loginTick);
            }
        } else {
            loginButton = LoginScreen.getImage("continue_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(270, 430, client.loginTick - 50);
            }
        }
        if (Configuration.DEBUG_MODE) {
            client.smallFont.drawCenteredText(16777215, centerX + 300, "MouseX: " + client.mouseX + " Mouse Y: " + client.mouseY, centerY - 225, true);
        }
        Client.loginScreenGraphicsBuffer.drawGraphics(0, client.getGraphics(), 0);
        DrawingArea.setAllPixelsToZero();
    }

    @Override
    public void click(Client client) {
        if (client.clickMode3 == 1 && client.mouseInRegion(151, 356, 317, 392)) {
            Client.launchURL("http://imagine-ps.com/vote");
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(445, 161, 703, 215)) {
            Client.launchURL("http://imagine-ps.com/store");
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(445, 225, 703, 279)) {
            Client.launchURL("http://imagine-ps.com/store");
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(445, 287, 703, 343)) {
            Client.launchURL("http://imagine-ps.com/store");
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(493, 358, 657, 391)) {
            Client.launchURL("http://imagine-ps.com/store");
        }
        if (client.clickMode3 != 1) return;
        if (!client.mouseInRegion(270, 432, 510, 468)) return;
        client.loginRenderer.setScreen(new MainScreen());
    }

    @Override
    public ScreenType type() {
        return ScreenType.LOADER;
    }
}


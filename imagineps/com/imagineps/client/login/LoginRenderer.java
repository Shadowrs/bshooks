/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client.login;

import com.imagineps.client.Client;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.login.LoginComponent;
import com.imagineps.client.login.ScreenType;
import com.imagineps.client.login.impl.MainScreen;

public class LoginRenderer {
    private final Client client;
    public LoginComponent screen;

    public LoginRenderer(Client client) {
        this.client = client;
        this.setScreen(new MainScreen());
    }

    public void display() {
        if (Client.updateScreenGraphicsBuffer != null) {
            Client.updateScreenGraphicsBuffer = null;
        }
        this.screen.render(this.client);
    }

    public void click() {
        if (!this.client.loginLoaded) {
            return;
        }
        this.screen.click(this.client);
    }

    public void setScreen(LoginComponent screen) {
        this.screen = screen;
        this.client.loginLoaded = false;
        this.client.loginTick = 50;
    }

    public boolean getScreen(ScreenType type) {
        if (this.screen.type() != type) return false;
        return true;
    }
}


/*
 * Decompiled with CFR 0_125.
 */
package com.imagineps.client.login.impl;

import com.imagineps.client.Client;
import com.imagineps.client.login.LoginComponent;
import com.imagineps.client.login.ScreenType;

public class SettingScreen
extends LoginComponent {
    @Override
    public void render(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        this.refresh(client);
        this.load(client, 13);
    }

    @Override
    public void click(Client client) {
    }

    @Override
    public ScreenType type() {
        return ScreenType.SETTING;
    }
}


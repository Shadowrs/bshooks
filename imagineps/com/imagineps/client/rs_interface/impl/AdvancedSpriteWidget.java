/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.imagineps.client.rs_interface.impl;

import com.imagineps.client.Client;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.rs_interface.RSInterface;

public final class AdvancedSpriteWidget
extends RSInterface {
    public AdvancedSpriteWidget(int identifier, String spriteLocation) {
        super(identifier);
        this.sprite1 = new Sprite(spriteLocation);
    }

    @Override
    public boolean drawInterface(Client client, int widgetDrawX, int widgetDrawY, int superWidgetDrawX, int superWidgetDrawY) {
        this.sprite1.drawAdvancedSprite(widgetDrawX, widgetDrawY);
        return false;
    }
}


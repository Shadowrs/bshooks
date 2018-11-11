/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 */
package com.imagineps.client.rs_interface.impl;

import com.imagineps.client.Client;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.rs_interface.RSInterface;

public final class ToggleSpriteWidget
extends RSInterface {
    private int currentState = 0;
    private final Sprite[] sprites;

    public /* varargs */ ToggleSpriteWidget(int identifier, String ... spriteLocations) {
        super(identifier);
        this.sprites = new Sprite[spriteLocations.length];
        if (this.sprites == null) return;
        if (this.sprites.length <= 0) return;
        int index = 0;
        do {
            if (index >= this.sprites.length) {
                this.width = this.sprites[0].myWidth;
                this.height = this.sprites[0].myHeight;
                return;
            }
            this.sprites[index] = new Sprite(spriteLocations[index]);
            ++index;
        } while (true);
    }

    @Override
    public boolean drawInterface(Client client, int widgetDrawX, int widgetDrawY, int superWidgetDrawX, int superWidgetDrawY) {
        if (this.sprites == null) return true;
        if (this.sprites.length == 0) {
            return true;
        }
        this.sprites[this.currentState].drawAdvancedSprite(widgetDrawX, widgetDrawY);
        return true;
    }

    public void setState(int newState) {
        if (newState < 0) throw new IllegalArgumentException("State has to be above 0 and below the maximum sprite amount!");
        if (newState > this.sprites.length - 1) {
            throw new IllegalArgumentException("State has to be above 0 and below the maximum sprite amount!");
        }
        this.currentState = newState;
    }
}


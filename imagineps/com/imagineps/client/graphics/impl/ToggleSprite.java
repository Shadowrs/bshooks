/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.imagineps.client.graphics.impl;

import com.imagineps.client.graphics.Sprite;

public final class ToggleSprite
extends Sprite {
    private final Sprite secondSprite;

    public ToggleSprite(String primarySpriteLocation, String secondSpriteLocation) {
        super(primarySpriteLocation);
        this.secondSprite = new Sprite(secondSpriteLocation);
    }

    public void drawSprite(int xPosition, int yPosition, int mouseX, int mouseY) {
        this.drawSprite(xPosition, yPosition, mouseX >= xPosition && mouseX <= xPosition + this.myWidth && mouseY >= yPosition && mouseY <= yPosition + this.myHeight);
    }

    public void drawSpriteCentered(int xPosition, int yPosition, int mouseX, int mouseY) {
        this.drawSprite(xPosition, yPosition, mouseX >= (xPosition -= this.myWidth / 2) && mouseX <= xPosition + this.myWidth && mouseY >= yPosition && mouseY <= (yPosition -= this.myHeight / 2) + this.myHeight);
    }

    public void drawSprite(int xPosition, int yPosition, boolean drawSecondSprite) {
        (drawSecondSprite ? this /* !! */ .secondSprite : this /* !! */ ).drawAdvancedSprite(xPosition, yPosition);
    }

    public void drawSpriteCentered(int xPosition, int yPosition, boolean drawSecondSprite) {
        this.drawSprite(xPosition - this.myWidth / 2, yPosition - this.myHeight / 2, drawSecondSprite);
    }
}


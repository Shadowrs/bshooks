/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.imagineps.client.graphics.impl;

import com.imagineps.client.graphics.Sprite;

public final class TransitioningSprite
extends Sprite {
    private static final int CYCLE_INCREMENT = 8;
    private final Sprite transitioningSprite;
    private int opacity;
    private int xOffset = 0;
    private int yOffset = 0;

    public TransitioningSprite(String spriteLocation1, String spriteLocation2) {
        super(spriteLocation1);
        this.transitioningSprite = new Sprite(spriteLocation2);
    }

    public void drawCenteredSprite(int xPosition, int yPosition, boolean transition) {
        this.drawSprite(xPosition - this.myWidth / 2, yPosition - this.myHeight / 2, transition);
    }

    public void drawSprite(int xPosition, int yPosition, boolean transition) {
        if (transition) {
            if (this.opacity < 256) {
                this.opacity += 8;
            }
        } else if (this.opacity > 0) {
            this.opacity -= 8;
        }
        if (this.opacity < 256) {
            this.drawAdvancedSprite(xPosition, yPosition);
        }
        if (this.opacity <= 0) return;
        this.transitioningSprite.drawARGBSprite(xPosition + (this.xOffset != 0 ? this.xOffset : 0), yPosition + (this.yOffset != 0 ? this.yOffset : 0), this.opacity);
    }

    public int getxOffset() {
        return this.xOffset;
    }

    public TransitioningSprite setxOffset(int xOffset) {
        this.xOffset = xOffset;
        return this;
    }

    public int getyOffset() {
        return this.yOffset;
    }

    public TransitioningSprite setyOffset(int yOffset) {
        this.yOffset = yOffset;
        return this;
    }
}


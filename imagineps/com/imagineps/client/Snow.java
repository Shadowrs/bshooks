/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Random
 */
package com.imagineps.client;

import com.imagineps.client.graphics.DrawingArea;
import java.util.Random;

public class Snow {
    private int x;
    private int constantX;
    private int y;
    private byte radius = (byte)(Math.random() * 5.0);
    private int speed;
    private int fadeTicks;
    private boolean melt;
    private boolean clicked;
    Random random = new Random();

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setFadeTicks() {
        this.fadeTicks = 480;
        this.melt = true;
        this.clicked = true;
    }

    Snow() {
        if (this.radius < 5) {
            this.radius = (byte)(this.radius + 2);
        }
        this.constantX = this.radius + (int)(Math.random() * (double)(740 - this.radius));
        this.y = 0 - this.random.nextInt(1000);
        this.fadeTicks = 0;
        this.melt = false;
        this.clicked = false;
        this.speed = (int)(Math.random() * 1.5);
        if (this.speed != 0) return;
        this.speed = 1;
    }

    void draw() {
        this.x = this.constantX;
        if (this.melt) {
            if (this.fadeTicks++ == 500) {
                this.melt();
                return;
            }
            if (this.clicked) {
                this.y += this.speed;
            }
            DrawingArea.drawCircle(this.x, this.y, this.radius, 16777215, this.getAlpha());
            return;
        }
        if (this.y + this.radius >= 500) {
            this.melt = true;
            DrawingArea.drawCircle(this.x, this.y, this.radius, 16777215, this.getAlpha());
            return;
        }
        this.y += this.speed;
        DrawingArea.drawCircle(this.x, this.y, this.radius, 16777215, 100);
    }

    public void melt() {
        this.radius = (byte)(Math.random() * 5.0);
        if (this.radius < 5) {
            this.radius = (byte)(this.radius + 2);
        }
        this.constantX = this.radius + (int)(Math.random() * (double)(740 - this.radius));
        this.y = 0 - this.random.nextInt(250);
        this.fadeTicks = 0;
        this.x = 0;
        this.melt = false;
        this.clicked = false;
        this.speed = (int)(Math.random() * 1.5);
        if (this.speed != 0) return;
        this.speed = 1;
    }

    private int getAlpha() {
        if (this.fadeTicks > 490) {
            return 5;
        }
        if (this.fadeTicks > 480) {
            return 15;
        }
        if (this.fadeTicks > 470) {
            return 25;
        }
        if (this.fadeTicks > 450) {
            return 35;
        }
        if (this.fadeTicks > 440) {
            return 45;
        }
        if (this.fadeTicks > 430) {
            return 55;
        }
        if (this.fadeTicks > 420) {
            return 65;
        }
        if (this.fadeTicks <= 410) return 100;
        return 75;
    }
}


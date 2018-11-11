/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.graphics.DrawingArea;

public class Bubble {
    public Client client;
    private int xPos;
    private int yPos;
    private byte radius = (byte)(Math.random() * 60.0);
    private int speed;
    private int xChange;
    public static final byte BUBBLES = 1;
    public static final byte BOUNCING_BALLS = 0;
    private final int color = 1666944;
    private boolean setToRandomY = false;
    private int xSpeed;
    private int ySpeed;

    public int getX() {
        return this.xPos;
    }

    public int getY() {
        return this.yPos;
    }

    public byte getRadius() {
        return this.radius;
    }

    public Bubble() {
        if (this.radius < 30) {
            this.radius = (byte)(this.radius + 15);
        }
        this.xChange = (Math.random() == 1.0 ? -1 : 1) * (int)Math.round((double)Math.random());
        this.xPos = this.radius + (int)(Math.random() * (double)(Client.clientWidth - this.radius * 2));
        this.yPos = Client.clientHeight + this.radius + (int)(Math.random() * 50.0);
        this.speed = (int)(Math.random() * 3.0);
        if (this.speed == 0) {
            this.speed = 1;
        }
        this.xSpeed = this.speed;
        this.ySpeed = this.speed;
    }

    public void draw(byte state) {
        if (this == null) return;
        switch (state) {
            case 1: {
                this.yPos -= this.speed;
                this.xPos += this.xChange;
                if (this.yPos < 0 - this.radius) {
                    this.radius = (byte)(Math.random() * 60.0);
                    if (this.radius < 30) {
                        this.radius = (byte)(this.radius + 15);
                    }
                    this.xChange = (Math.round((double)Math.random()) == 1L ? -1 : 1) * (int)Math.round((double)Math.random());
                    this.xPos = this.radius + (int)(Math.random() * (double)(Client.clientWidth - this.radius));
                    this.yPos = Client.clientHeight + this.radius + (int)(Math.random() * (Math.random() * 50.0));
                    this.speed = (int)(Math.random() * 3.0);
                    if (this.speed == 0) {
                        this.speed = 1;
                    }
                }
                DrawingArea.drawBubble(this.xPos, this.yPos, this.radius, 1666944, 20);
                return;
            }
            case 0: {
                if (!this.setToRandomY) {
                    this.yPos = this.radius + 1 + (int)(Math.random() * (double)(Client.clientHeight - this.radius + 1));
                    this.setToRandomY = true;
                }
                if (this.setToRandomY) {
                    if (this.yPos - this.radius <= 0) {
                        this.ySpeed *= -1;
                    }
                    if (this.yPos + this.radius >= Client.clientHeight) {
                        this.ySpeed *= -1;
                    }
                    if (this.xPos - this.radius <= 0) {
                        this.xSpeed *= -1;
                    }
                    if (this.xPos + this.radius >= Client.clientWidth) {
                        this.xSpeed *= -1;
                    }
                }
                this.yPos += this.ySpeed;
                this.xPos += this.xSpeed;
                DrawingArea.drawBubble(this.xPos, this.yPos, this.radius, 1666944, 25);
            }
        }
    }
}


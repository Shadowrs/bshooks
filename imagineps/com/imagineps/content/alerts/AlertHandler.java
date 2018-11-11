/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.content.alerts;

import com.imagineps.client.Client;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.content.alerts.Alert;

public class AlertHandler {
    public boolean hovered = false;
    public boolean close = false;
    public boolean show = false;
    public boolean remove = false;
    public Alert alert = null;
    public Client c;

    public AlertHandler(Client c) {
        this.c = c;
    }

    public void close() {
        this.close = true;
    }

    public void processAlerts() {
        if (this.alert == null) {
            return;
        }
        if (this.alert.active()) {
            if (this.close) {
                this.alert.close();
                this.close = false;
            }
            if (!this.alert.isClosed() && this.alert.getOpacity() < 90 && this.alert.extraY > 0) {
                this.alert.opacity += 5;
                if (this.alert.extraY > 0) {
                    this.alert.extraY -= 5;
                }
                if (this.alert.extraY < 0) {
                    this.alert.extraY = 0;
                }
                this.c.alertBack.drawSpriteOpacity(this.alert.getX(), this.alert.getY() + this.alert.extraY, this.alert.getOpacity());
            } else if (this.alert.isClosed()) {
                this.alert.extraY += 5;
                if (this.alert.getOpacity() > 0) {
                    this.alert.opacity -= 5;
                } else {
                    this.remove = true;
                    this.show = false;
                    this.alert.active = false;
                }
                this.c.alertBack.drawSpriteOpacity(this.alert.getX(), this.alert.getY() + this.alert.extraY, this.alert.getOpacity());
            } else {
                if (this.alert.getOpacity() < 90) {
                    this.alert.opacity = 90;
                }
                if (this.show) {
                    this.c.alertBack.drawSpriteOpacity(this.alert.getX(), this.alert.getY(), this.hovered ? this.alert.getOpacity() + 25 : this.alert.getOpacity());
                    if (this.hovered) {
                        this.c.alertBorderH.drawSprite(this.alert.getX(), this.alert.getY());
                    } else {
                        this.c.alertBorder.drawSprite(this.alert.getX(), this.alert.getY());
                    }
                }
                this.c.fancyFont.drawText(0, this.alert.getTitle(), this.alert.getY() + 16, this.alert.getX() + 243);
                this.c.fancyFont.drawText(this.alert.getTitleColor(), this.alert.getTitle(), this.alert.getY() + 15, this.alert.getX() + 242);
                this.c.smallFont.drawText(0, this.alert.getLine(1), this.alert.getY() + 36, this.alert.getX() + 243);
                this.c.smallFont.drawText(this.alert.getColor(2), this.alert.getLine(1), this.alert.getY() + 35, this.alert.getX() + 242);
                this.c.smallFont.drawText(0, this.alert.getLine(2), this.alert.getY() + 56, this.alert.getX() + 243);
                this.c.smallFont.drawText(this.alert.getColor(2), this.alert.getLine(2), this.alert.getY() + 55, this.alert.getX() + 242);
                this.show = true;
            }
        }
        if (!this.remove) return;
        this.alert = null;
        this.remove = false;
    }

    public void processMouse(int x, int y) {
        if (this.alert == null) {
            return;
        }
        if (!this.alert.active()) return;
        this.hovered = x >= this.alert.getX() && x <= this.alert.getX() + 484 && y >= this.alert.getY() && y <= this.alert.getY() + 79;
        if (!this.hovered) return;
        this.c.menuActionName[1] = "Dismiss";
        this.c.menuActionID[1] = 476;
        this.c.menuActionRow = 2;
    }
}


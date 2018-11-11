/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.content.alerts;

public class Alert {
    private String title;
    private String line1;
    private String line2;
    private int titleColor;
    private int color1;
    private int color2;
    public boolean active = false;
    private boolean closed = false;
    public boolean open = true;
    public int opacity = 0;
    private int x = 14;
    private int y = 250;
    public int extraX = 0;
    public int extraY = 40;

    public Alert(String title, String line1, String line2) {
        this.title = title;
        this.line1 = line1;
        this.line2 = line2;
        this.titleColor = 16711680;
        this.color1 = 16777215;
        this.color2 = 16777215;
        this.active = true;
    }

    public Alert(String title, String line1, String line2, int c1, int c2, int c3) {
        this.title = title;
        this.line1 = line1;
        this.line2 = line2;
        this.titleColor = c1;
        this.color1 = c2;
        this.color2 = c3;
        this.active = true;
    }

    public String getTitle() {
        return this.title;
    }

    public String getLine(int i) {
        String string;
        if (i == 1) {
            string = this.line1;
            return string;
        }
        string = this.line2;
        return string;
    }

    public int getTitleColor() {
        return this.titleColor;
    }

    public int getColor(int i) {
        int n;
        if (i == 1) {
            n = this.color1;
            return n;
        }
        n = this.color2;
        return n;
    }

    public boolean active() {
        return this.active;
    }

    public void close() {
        this.closed = true;
    }

    public boolean opening() {
        return this.open;
    }

    public int getOpacity() {
        return this.opacity;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}


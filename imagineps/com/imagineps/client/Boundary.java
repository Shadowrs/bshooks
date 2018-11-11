/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Point
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client;

import java.awt.Point;

public class Boundary {
    private final Point topLeft;
    private final Point bottomRight;

    public Boundary(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean isWithing(int x, int y) {
        if ((double)x < this.topLeft.getX()) return false;
        if ((double)x > this.bottomRight.getX()) return false;
        if ((double)y < this.topLeft.getY()) return false;
        if ((double)y > this.bottomRight.getY()) return false;
        return true;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public Point getBottomRight() {
        return this.bottomRight;
    }

    public String toString() {
        return "[toPleft= " + (Object)this.topLeft + " bottomRight" + (Object)this.bottomRight + "]";
    }
}


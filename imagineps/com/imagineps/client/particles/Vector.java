/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.CloneNotSupportedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client.particles;

public class Vector {
    public static final Vector ZERO = new Vector(0, 0, 0);
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Vector divide(float scalar) {
        return new Vector((int)((float)this.x / scalar), (int)((float)this.y / scalar), (int)((float)this.z / scalar));
    }

    public Vector addLocal(Vector other) {
        this.x += other.x;
        this.y += other.y;
        this.z += other.z;
        return this;
    }

    public Vector mix(Vector other, float x, float y, float z) {
        return new Vector(this.x + (int)((float)other.x * x), this.y + (int)((float)other.y * y), this.z + (int)((float)other.z * z));
    }

    public Vector clone() {
        return new Vector(this.x, this.y, this.z);
    }

    public int randomWithRange(int min, int max) {
        int range = max - min + 1;
        return (int)(Math.random() * (double)range) + min;
    }

    public String toString() {
        return "Vector{x=" + this.x + ", y=" + this.y + ", z=" + this.z + '}';
    }
}


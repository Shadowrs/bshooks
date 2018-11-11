/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
package com.imagineps.client.particles;

import com.imagineps.client.particles.SpawnShape;
import com.imagineps.client.particles.Vector;
import java.util.Random;

public class PointSpawnShape
implements SpawnShape {
    private Vector point;

    public PointSpawnShape(Vector point) {
        this.point = point;
    }

    @Override
    public Vector getPoint(Random r) {
        return this.point.clone();
    }
}


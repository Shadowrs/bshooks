/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
package com.imagineps.client.particles;

import com.imagineps.client.particles.ParticleDefinition;
import com.imagineps.client.particles.SpawnShape;
import com.imagineps.client.particles.Vector;
import java.util.Random;

public class Particle {
    private int zBuffer;
    private int age = 0;
    private int color;
    private float size;
    private Vector velocity;
    private float alpha;
    private boolean dead = false;
    private ParticleDefinition definition = null;
    private Vector position;

    public float getAlpha() {
        return this.alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public boolean isDead() {
        return this.dead;
    }

    public void tick() {
        if (this.definition == null) {
            return;
        }
        ++this.age;
        if (this.age >= this.definition.getLifespan()) {
            this.dead = true;
            return;
        }
        this.color += this.definition.getColorStep();
        this.size += this.definition.getSizeStep();
        this.position.addLocal(this.velocity);
        this.velocity.addLocal(this.definition.getVelocityStep());
        this.alpha += this.definition.getAlphaStep();
        if (this.alpha > 0.0f) return;
        this.alpha = 0.025f;
    }

    public ParticleDefinition getDefinition() {
        return this.definition;
    }

    public Vector getPosition() {
        return this.position;
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public Particle(ParticleDefinition pd, Vector position, int zbuffer, int definitionID) {
        this(pd.getStartColor(), pd.getStartSize(), pd.getStartVelocity(definitionID).clone(), pd.getSpawnShape().getPoint(ParticleDefinition.RANDOM).addLocal(position), pd.getStartAlpha(), zbuffer);
        this.definition = pd;
    }

    public Particle(int color, float size, Vector velocity, Vector position, float alpha, int zBuffer) {
        this.color = color;
        this.size = size;
        this.velocity = velocity;
        this.position = position;
        this.alpha = alpha;
        this.zBuffer = zBuffer;
    }

    public int getAge() {
        return this.age;
    }

    public int getZbuffer() {
        return this.zBuffer;
    }

    public void setZbuffer(int zBuffer) {
        this.zBuffer = zBuffer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getSize() {
        return this.size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public Vector getVelocity() {
        return this.velocity;
    }

    public void setVelocity(Vector velocity) {
        this.velocity = velocity;
    }
}


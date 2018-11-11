/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Random
 */
package com.imagineps.client.particles;

import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.particles.PointSpawnShape;
import com.imagineps.client.particles.SpawnShape;
import com.imagineps.client.particles.Vector;
import java.util.Random;

public class ParticleDefinition {
    public static final Random RANDOM = new Random(System.currentTimeMillis());
    public static ParticleDefinition[] cache = new ParticleDefinition[]{new ParticleDefinition(){
        {
            this.setStartVelocity(new Vector(0, -1, 0));
            this.setEndVelocity(new Vector(0, -1, 0));
            this.setGravity(new Vector(0, 0, 0));
            this.setLifespan(19);
            this.setStartColor(0);
            this.setSpawnRate(4);
            this.setStartSize(1.25f);
            this.setEndSize(0.0f);
            this.setStartAlpha(0.095f);
            this.updateSteps();
            this.setColorStep(0);
        }
    }, new ParticleDefinition(){
        {
            this.setStartVelocity(new Vector(0, -1, 0));
            this.setEndVelocity(new Vector(0, -1, 0));
            this.setGravity(new Vector(0, 0, 0));
            this.setLifespan(19);
            this.setStartColor(16777215);
            this.setSpawnRate(4);
            this.setStartSize(1.25f);
            this.setEndSize(0.0f);
            this.setStartAlpha(0.095f);
            this.updateSteps();
            this.setColorStep(0);
        }
    }, new ParticleDefinition(){
        {
            this.setStartVelocity(new Vector(0, -3, 0));
            this.setEndVelocity(new Vector(0, -3, 0));
            this.setGravity(new Vector(0, 0, 0));
            this.setLifespan(19);
            this.setStartColor(16713728);
            this.setSpawnRate(1);
            this.setStartSize(1.0f);
            this.setEndSize(0.0f);
            this.setStartAlpha(0.075f);
            this.updateSteps();
            this.setColorStep(2304);
        }
    }, new ParticleDefinition(){
        {
            this.setStartVelocity(new Vector(0, 2, 0));
            this.setEndVelocity(new Vector(0, 2, 0));
            this.setGravity(new Vector(0, 16, 0));
            this.setLifespan(19);
            this.setStartColor(0);
            this.setSpawnRate(3);
            this.setStartSize(0.7f);
            this.setEndSize(0.5f);
            this.setStartAlpha(0.0f);
            this.setEndAlpha(0.035f);
            this.updateSteps();
            this.setColorStep(0);
        }
    }, new ParticleDefinition(){
        {
            this.setStartVelocity(new Vector(0, 2, 0));
            this.setEndVelocity(new Vector(0, 2, 0));
            this.setGravity(new Vector(0, 1, 0));
            this.setLifespan(19);
            this.setStartColor(16713728);
            this.setSpawnRate(4);
            this.setStartSize(1.7f);
            this.setEndSize(0.5f);
            this.setStartAlpha(0.0f);
            this.setEndAlpha(0.045f);
            this.updateSteps();
            this.setColorStep(2304);
        }
    }, new ParticleDefinition(){
        {
            this.setStartVelocity(new Vector(0, 2, 0));
            this.setEndVelocity(new Vector(0, 2, 0));
            this.setGravity(new Vector(0, 10, 0));
            this.setLifespan(20);
            this.setStartColor(4031942);
            this.setSpawnRate(3);
            this.setStartSize(1.5f);
            this.setEndSize(0.5f);
            this.setStartAlpha(0.0f);
            this.setEndAlpha(0.045f);
            this.updateSteps();
            this.setColorStep(0);
        }
    }};
    private float startSize = 1.0f;
    private float endSize = 1.0f;
    private int startColor = -1;
    private int endColor = -1;
    private Vector startVelocity = Vector.ZERO;
    private Vector endVelocity = Vector.ZERO;
    private int lifespan = 1;
    private static int maxParticles = 10000;
    private int spawnRate = 4;
    private int zBuffer;
    private Sprite sprite;
    private float startAlpha = 1.0f;
    private float endAlpha = 0.05f;
    private Vector gravity;
    private SpawnShape spawnShape = new PointSpawnShape(Vector.ZERO);
    private Vector velocityStep;
    private int colorStep;
    private float sizeStep;
    private float alphaStep;

    public Vector getGravity() {
        return this.gravity;
    }

    public void setGravity(Vector gravity) {
        this.gravity = gravity;
    }

    public int getzBuffer() {
        return this.zBuffer;
    }

    public void setzBuffer(int zBuffer) {
        this.zBuffer = zBuffer;
    }

    public float getStartAlpha() {
        return this.startAlpha;
    }

    public void setStartAlpha(float startAlpha) {
        this.startAlpha = startAlpha;
    }

    public float getEndAlpha() {
        return this.endAlpha;
    }

    public void setEndAlpha(float endAlpha) {
        this.endAlpha = endAlpha;
    }

    public float getAlphaStep() {
        return this.alphaStep;
    }

    public void setAlphaStep(float alphaStep) {
        this.alphaStep = alphaStep;
    }

    public Sprite getSprite() {
        return this.sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public SpawnShape getSpawnShape() {
        return this.spawnShape;
    }

    public void setSpawnShape(SpawnShape spawnShape) {
        this.spawnShape = spawnShape;
    }

    public int randomWithRange(int min, int max) {
        int range = max - min + 1;
        return (int)(Math.random() * (double)range) + min;
    }

    public int getSpawnRate() {
        return this.spawnRate;
    }

    public void setSpawnRate(int spawnRate) {
        this.spawnRate = spawnRate;
    }

    public static int getMaxParticles() {
        return maxParticles;
    }

    public void setMaxParticles(int max) {
        maxParticles = max;
    }

    public float getStartSize() {
        return this.startSize;
    }

    public void setStartSize(float startSize) {
        this.startSize = startSize;
    }

    public float getEndSize() {
        return this.endSize;
    }

    public void setEndSize(float endSize) {
        this.endSize = endSize;
    }

    public int getStartColor() {
        return this.startColor;
    }

    public void setStartColor(int startColor) {
        this.startColor = startColor;
    }

    public int getEndColor() {
        return this.endColor;
    }

    public void setEndColor(int endColor) {
        this.endColor = endColor;
    }

    /*
     * Exception decompiling
     */
    public Vector getStartVelocity(int id) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:486)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.rebuildSwitches(SwitchReplacer.java:334)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:508)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:191)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:136)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:369)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:770)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:702)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        // the.bytecode.club.bytecodeviewer.decompilers.CFRDecompiler.decompileToZip(CFRDecompiler.java:263)
        // the.bytecode.club.bytecodeviewer.gui.MainViewerGUI$18$1$3.run(MainViewerGUI.java:1122)
        throw new IllegalStateException("Decompilation failed");
    }

    public void setStartVelocity(Vector startVelocity) {
        this.startVelocity = startVelocity;
    }

    public Vector getEndVelocity() {
        return this.endVelocity;
    }

    public void setEndVelocity(Vector endVelocity) {
        this.endVelocity = endVelocity;
    }

    public int getLifespan() {
        return this.lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public void setVelocityStep(Vector velocityStep) {
        this.velocityStep = velocityStep;
    }

    public void setColorStep(int colorStep) {
        this.colorStep = colorStep;
    }

    public void setSizeStep(float sizeStep) {
        this.sizeStep = sizeStep;
    }

    public float getSizeStep() {
        return this.sizeStep;
    }

    public Vector getVelocityStep() {
        return this.velocityStep;
    }

    public int getColorStep() {
        return this.colorStep;
    }

    public void updateSteps() {
        this.sizeStep = (this.endSize - this.startSize) / ((float)this.lifespan * 1.0f);
        this.colorStep = (this.endColor - this.startColor) / this.lifespan;
        this.velocityStep = this.endVelocity.subtract(this.startVelocity).divide(this.lifespan);
        this.alphaStep = (this.endAlpha - this.startAlpha) / (float)this.lifespan;
    }

    public void updateStepsNoAlpha() {
        this.sizeStep = (this.endSize - this.startSize) / ((float)this.lifespan * 1.0f);
        this.colorStep = (this.endColor - this.startColor) / this.lifespan;
        this.velocityStep = this.endVelocity.subtract(this.startVelocity).divide(this.lifespan);
    }

}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.imagineps.client;

import com.imagineps.client.Entity;
import com.imagineps.client.definition.AnimationDefinition;

public class Mobile
extends Entity {
    public int[] hitmarkMove = new int[4];
    public int[] hitmarkTrans = new int[4];
    public int[] hitmarkIcon = new int[4];
    public int[] hitMarkFocusPlayer = new int[4];
    public int[] hitMarkFocusNPC = new int[4];
    public int entScreenX;
    public int entScreenY;
    public final int index = -1;
    public final int[] pathX = new int[10];
    public final int[] pathY = new int[10];
    public int interactingEntity = -1;
    int anInt1503;
    int anInt1504 = 32;
    int runAnim = -1;
    public String textSpoken;
    public int height = 200;
    public int turnDirection;
    int standAnim = -1;
    int standTurnAnim = -1;
    int anInt1513;
    final int[] hitMarkDamage = new int[4];
    final int[] hitMarkTypes = new int[4];
    final int[] hitsLoopCycle = new int[4];
    int anInt1517 = -1;
    int anInt1518;
    int anInt1519;
    int graphic = -1;
    int currentAnimation;
    int anInt1522;
    int graphicDelay;
    int anInt1524;
    int pathLength;
    public int forcedAnimation = -1;
    int displayedEmoteFrames;
    int emoteTimeRemaining;
    int animationDelay;
    int currentAnimationLoops;
    int anInt1531;
    public int loopCycleStatus = -1000;
    public int currentHealth;
    public int maxHealth;
    int textCycle = 100;
    int anInt1537;
    int anInt1538;
    int anInt1539;
    int tileSize = 1;
    boolean aBoolean1541 = false;
    int anInt1542;
    int anInt1543;
    int anInt1544;
    int anInt1545;
    int anInt1546;
    int startForceMovement;
    int endForceMovement;
    int anInt1549;
    public int x;
    public int y;
    int anInt1552;
    final boolean[] pathRun = new boolean[10];
    int walkAnim = -1;
    int turn160DefAnim = -1;
    int turn90CWAnim = -1;
    int turn90CCAnim = -1;
    public int nextAnimFrame;
    public int nextGraphicFrame;
    public int nextIdleFrame;

    final void setPos(int x, int y, boolean moving) {
        if (this.forcedAnimation != -1 && AnimationDefinition.getAnim((int)this.forcedAnimation).walkingPrecedence == 1) {
            this.forcedAnimation = -1;
        }
        if (!moving) {
            int dx = x - this.pathX[0];
            int dy = y - this.pathY[0];
            if (dx >= -8 && dx <= 8 && dy >= -8 && dy <= 8) {
                if (this.pathLength < 9) {
                    ++this.pathLength;
                }
                int index = this.pathLength;
                do {
                    if (index <= 0) {
                        this.pathX[0] = x;
                        this.pathY[0] = y;
                        this.pathRun[0] = false;
                        return;
                    }
                    this.pathX[index] = this.pathX[index - 1];
                    this.pathY[index] = this.pathY[index - 1];
                    this.pathRun[index] = this.pathRun[index - 1];
                    --index;
                } while (true);
            }
        }
        this.pathLength = 0;
        this.anInt1542 = 0;
        this.anInt1503 = 0;
        this.pathX[0] = x;
        this.pathY[0] = y;
        this.x = this.pathX[0] * 128 + this.tileSize * 64;
        this.y = this.pathY[0] * 128 + this.tileSize * 64;
    }

    final void method446() {
        this.pathLength = 0;
        this.anInt1542 = 0;
    }

    /*
     * Exception decompiling
     */
    final void updateHitData(int markType, int damage, int loopCycle, int icon, int focusPlayer, int focusNPC) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[WHILELOOP]], but top level block is 2[SIMPLE_IF_ELSE]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:809)
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

    final void move(boolean run, int direction) {
        int x = this.pathX[0];
        int y = this.pathY[0];
        if (direction == 0) {
            --x;
            ++y;
        }
        if (direction == 1) {
            ++y;
        }
        if (direction == 2) {
            ++x;
            ++y;
        }
        if (direction == 3) {
            --x;
        }
        if (direction == 4) {
            ++x;
        }
        if (direction == 5) {
            --x;
            --y;
        }
        if (direction == 6) {
            --y;
        }
        if (direction == 7) {
            ++x;
            --y;
        }
        if (this.forcedAnimation != -1 && AnimationDefinition.getAnim((int)this.forcedAnimation).walkingPrecedence == 1) {
            this.forcedAnimation = -1;
        }
        if (this.pathLength < 9) {
            ++this.pathLength;
        }
        int l = this.pathLength;
        do {
            if (l <= 0) {
                this.pathX[0] = x;
                this.pathY[0] = y;
                this.pathRun[0] = run;
                return;
            }
            this.pathX[l] = this.pathX[l - 1];
            this.pathY[l] = this.pathY[l - 1];
            this.pathRun[l] = this.pathRun[l - 1];
            --l;
        } while (true);
    }

    public boolean isVisible() {
        return false;
    }

    Mobile() {
    }
}


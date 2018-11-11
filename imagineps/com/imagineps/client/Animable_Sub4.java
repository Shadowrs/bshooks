/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 */
package com.imagineps.client;

import com.imagineps.client.Entity;
import com.imagineps.client.Model;
import com.imagineps.client.definition.AnimationDefinition;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.SpotAnim;

final class Animable_Sub4
extends Entity {
    public final int anInt1571;
    public final int anInt1572;
    private double aDouble1574;
    private double aDouble1575;
    private double aDouble1576;
    private double aDouble1577;
    private double aDouble1578;
    private boolean aBoolean1579 = false;
    private final int anInt1580;
    private final int anInt1581;
    private final int anInt1582;
    public final int anInt1583;
    public double aDouble1585;
    public double aDouble1586;
    public double aDouble1587;
    private final int anInt1588;
    private final int anInt1589;
    public final int anInt1590;
    private final SpotAnim aSpotAnim_1592;
    private int anInt1593;
    private int anInt1594;
    public int anInt1595;
    private int anInt1596;
    public final int anInt1597;

    public void method455(int i, int j, int k, int l) {
        if (!this.aBoolean1579) {
            double d = l - this.anInt1580;
            double d2 = j - this.anInt1581;
            double d3 = Math.sqrt((double)(d * d + d2 * d2));
            this.aDouble1585 = (double)this.anInt1580 + d * (double)this.anInt1589 / d3;
            this.aDouble1586 = (double)this.anInt1581 + d2 * (double)this.anInt1589 / d3;
            this.aDouble1587 = this.anInt1582;
        }
        double d1 = this.anInt1572 + 1 - i;
        this.aDouble1574 = ((double)l - this.aDouble1585) / d1;
        this.aDouble1575 = ((double)j - this.aDouble1586) / d1;
        this.aDouble1576 = Math.sqrt((double)(this.aDouble1574 * this.aDouble1574 + this.aDouble1575 * this.aDouble1575));
        if (!this.aBoolean1579) {
            this.aDouble1577 = (- this.aDouble1576) * Math.tan((double)((double)this.anInt1588 * 0.02454369));
        }
        this.aDouble1578 = 2.0 * ((double)k - this.aDouble1587 - this.aDouble1577 * d1) / (d1 * d1);
    }

    @Override
    public Model getModel() {
        Model model = this.aSpotAnim_1592.getModel();
        if (model == null) {
            return null;
        }
        int j = -1;
        if (this.aSpotAnim_1592.aAnimation_407 != null) {
            j = this.aSpotAnim_1592.aAnimation_407.frame[this.anInt1593];
        }
        Model model_1 = new Model(true, FrameReader.method532(j), false, model);
        if (j != -1) {
            model_1.method469();
            model_1.method470(j);
            model_1.anIntArrayArray1658 = null;
            model_1.anIntArrayArray1657 = null;
        }
        if (this.aSpotAnim_1592.anInt410 != 128 || this.aSpotAnim_1592.anInt411 != 128) {
            model_1.method478(this.aSpotAnim_1592.anInt410, this.aSpotAnim_1592.anInt410, this.aSpotAnim_1592.anInt411);
        }
        model_1.method474(this.anInt1596);
        model_1.light(64 + this.aSpotAnim_1592.anInt413, 850 + this.aSpotAnim_1592.anInt414, -30, -50, -30, true);
        return model_1;
    }

    public Animable_Sub4(int i, int j, int l, int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2) {
        this.aSpotAnim_1592 = SpotAnim.forId(l2);
        this.anInt1597 = k1;
        this.anInt1580 = j2;
        this.anInt1581 = i2;
        this.anInt1582 = l1;
        this.anInt1571 = l;
        this.anInt1572 = i1;
        this.anInt1588 = i;
        this.anInt1589 = j1;
        this.anInt1590 = k2;
        this.anInt1583 = j;
        this.aBoolean1579 = false;
    }

    public void method456(int i) {
        this.aBoolean1579 = true;
        this.aDouble1585 += this.aDouble1574 * (double)i;
        this.aDouble1586 += this.aDouble1575 * (double)i;
        this.aDouble1587 += this.aDouble1577 * (double)i + 0.5 * this.aDouble1578 * (double)i * (double)i;
        this.aDouble1577 += this.aDouble1578 * (double)i;
        this.anInt1595 = (int)(Math.atan2((double)this.aDouble1574, (double)this.aDouble1575) * 325.949) + 1024 & 2047;
        this.anInt1596 = (int)(Math.atan2((double)this.aDouble1577, (double)this.aDouble1576) * 325.949) & 2047;
        if (this.aSpotAnim_1592 == null) return;
        if (this.aSpotAnim_1592.aAnimation_407 == null) return;
        this.anInt1594 += i;
        while (this.anInt1594 > this.aSpotAnim_1592.aAnimation_407.method258(this.anInt1593)) {
            this.anInt1594 -= this.aSpotAnim_1592.aAnimation_407.method258(this.anInt1593) + 1;
            ++this.anInt1593;
            if (this.anInt1593 < this.aSpotAnim_1592.aAnimation_407.frameCount) continue;
            this.anInt1593 = 0;
        }
        return;
    }
}


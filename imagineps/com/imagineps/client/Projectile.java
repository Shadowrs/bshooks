/*
 * Decompiled with CFR 0_125.
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.Entity;
import com.imagineps.client.Model;
import com.imagineps.client.PlayerSettings;
import com.imagineps.client.definition.AnimationDefinition;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.SpotAnim;

final class Projectile
extends Entity {
    public final int anInt1560;
    public final int anInt1561;
    public final int anInt1562;
    public final int anInt1563;
    public final int anInt1564;
    public boolean aBoolean1567 = false;
    private final SpotAnim aSpotAnim_1568;
    private int anInt1569;
    private int anInt1570;
    private int nextAnimFrameId;

    public Projectile(int i, int j, int l, int i1, int j1, int k1, int l1) {
        this.aSpotAnim_1568 = SpotAnim.forId(i1);
        this.anInt1560 = i;
        this.anInt1561 = l1;
        this.anInt1562 = k1;
        this.anInt1563 = j1;
        this.anInt1564 = j + l;
        this.aBoolean1567 = false;
    }

    @Override
    public Model getModel() {
        Model model = this.aSpotAnim_1568.getModel();
        if (model == null) {
            return null;
        }
        int frame = this.aSpotAnim_1568.aAnimation_407.frame[this.anInt1569];
        Model model_1 = new Model(true, FrameReader.method532(frame), false, model);
        if (!this.aBoolean1567) {
            model_1.method469();
            if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING) && this.nextAnimFrameId != -1) {
                model_1.interpolateFrames(frame, this.aSpotAnim_1568.aAnimation_407.frame[this.nextAnimFrameId], this.anInt1570, this.aSpotAnim_1568.aAnimation_407.delay[this.anInt1569]);
            } else {
                model_1.method470(frame);
            }
            model_1.anIntArrayArray1658 = null;
            model_1.anIntArrayArray1657 = null;
        }
        if (this.aSpotAnim_1568.anInt410 != 128 || this.aSpotAnim_1568.anInt411 != 128) {
            model_1.method478(this.aSpotAnim_1568.anInt410, this.aSpotAnim_1568.anInt410, this.aSpotAnim_1568.anInt411);
        }
        if (this.aSpotAnim_1568.anInt412 != 0) {
            if (this.aSpotAnim_1568.anInt412 == 90) {
                model_1.method473();
            }
            if (this.aSpotAnim_1568.anInt412 == 180) {
                model_1.method473();
                model_1.method473();
            }
            if (this.aSpotAnim_1568.anInt412 == 270) {
                model_1.method473();
                model_1.method473();
                model_1.method473();
            }
        }
        model_1.light(64 + this.aSpotAnim_1568.anInt413, 850 + this.aSpotAnim_1568.anInt414, -30, -50, -30, true);
        return model_1;
    }

    public void method454(int i) {
        this.anInt1570 += i;
        while (this.anInt1570 > this.aSpotAnim_1568.aAnimation_407.method258(this.anInt1569)) {
            this.anInt1570 -= this.aSpotAnim_1568.aAnimation_407.method258(this.anInt1569) + 1;
            ++this.anInt1569;
            if (this.anInt1569 >= this.aSpotAnim_1568.aAnimation_407.frameCount && (this.anInt1569 < 0 || this.anInt1569 >= this.aSpotAnim_1568.aAnimation_407.frameCount)) {
                this.anInt1569 = 0;
                this.aBoolean1567 = true;
            }
            if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) {
                this.nextAnimFrameId = this.anInt1569 + 1;
            }
            if (this.nextAnimFrameId < this.aSpotAnim_1568.aAnimation_407.frameCount) continue;
            this.nextAnimFrameId = -1;
        }
    }
}


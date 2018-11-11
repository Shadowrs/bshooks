/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 */
package com.imagineps.client.rs_interface.impl;

import com.imagineps.client.Client;
import com.imagineps.client.Model;
import com.imagineps.client.definition.AnimationDefinition;
import com.imagineps.client.definition.IDK;
import com.imagineps.client.definition.ItemDefinition;
import com.imagineps.client.definition.NPCDefinition;
import com.imagineps.client.graphics.Rasterizer;
import com.imagineps.client.rs_interface.RSInterface;

public final class DrawCharacterWidget
extends RSInterface {
    private static final int DEFAULT_STAND_ANIMATION = 808;
    private int[] modelIds;
    private int animationId;
    private boolean isFemale;

    public DrawCharacterWidget(int identifier, int[] modelIds) {
        super(identifier, 0, 200, 6, 0);
        this.modelIds = modelIds;
        this.animationId = 808;
        this.modelZoom = 1100;
        this.modelRotation1 = 150;
        this.modelRotation2 = 0;
        this.disabledAnimation = this.anInt258 = NPCDefinition.forID((int)this.npcId).standAnim;
    }

    @Override
    public boolean drawInterface(Client client, int widgetDrawX, int widgetDrawY, int superWidgetDrawX, int superWidgetDrawY) {
        Model model1;
        if (this.modelIds == null) return true;
        if (this.modelIds.length == 0) {
            return true;
        }
        int verticleTilt = 150;
        int animationSpeed = (int)(Math.sin((double)((double)Client.loopCycle / 40.0)) * 256.0) & 2047;
        this.modelRotation1 = verticleTilt;
        this.modelRotation2 = animationSpeed;
        Model[] aclass30_sub2_sub4_sub6s = new Model[12];
        int j2 = 0;
        for (int l2 = 0; l2 < 12; ++l2) {
            Model model_4;
            if (l2 >= this.modelIds.length) continue;
            int i3 = this.modelIds[l2];
            if (i3 >= 256 && i3 < 512) {
                Model model_3 = IDK.cache[i3 - 256].method538();
                model_3 = IDK.cache[i3 - 256].method538();
                if (model_3 != null) {
                    aclass30_sub2_sub4_sub6s[j2++] = model_3;
                }
            }
            if (i3 < 512 || (model_4 = ItemDefinition.forID(i3 - 512).method196(this.isFemale ? 1 : 0)) == null) continue;
            aclass30_sub2_sub4_sub6s[j2++] = model_4;
        }
        Model model = new Model(j2, aclass30_sub2_sub4_sub6s);
        model.method469();
        model.method470(AnimationDefinition.anims[this.animationId].frame[this.animationLength]);
        this.anInt233 = 5;
        this.mediaID = 0;
        RSInterface.method208(client.aBoolean994, model);
        int k3 = Rasterizer.textureInt1;
        int j4 = Rasterizer.textureInt2;
        Rasterizer.textureInt1 = widgetDrawX + this.width / 2;
        Rasterizer.textureInt2 = widgetDrawY + this.height / 2;
        int i5 = Rasterizer.anIntArray1470[this.modelRotation1] * this.modelZoom >> 16;
        int l5 = Rasterizer.anIntArray1471[this.modelRotation1] * this.modelZoom >> 16;
        boolean flag2 = client.interfaceIsSelected(this);
        if (this.animationId == -1) {
            model1 = this.method209(-1, -1, flag2);
        } else {
            AnimationDefinition animation = AnimationDefinition.getAnim(this.animationId);
            model1 = this.method209(animation.anIntArray354[this.animationLength], animation.frame[this.animationLength], flag2);
        }
        if (model1 != null) {
            Rasterizer.clearDepthBuffer();
            model1.method482(this.modelRotation2, 0, this.modelRotation1, 0, i5, l5);
        }
        Rasterizer.textureInt1 = k3;
        Rasterizer.textureInt2 = j4;
        return true;
    }

    public int getNpcId() {
        return this.npcId;
    }

    public void setModelIds(int[] modelIds) {
        this.modelIds = modelIds;
    }

    public void setFemale(boolean isFemale) {
        this.isFemale = isFemale;
    }
}


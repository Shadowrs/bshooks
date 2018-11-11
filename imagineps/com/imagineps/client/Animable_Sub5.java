/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.Entity;
import com.imagineps.client.Model;
import com.imagineps.client.VarBit;
import com.imagineps.client.definition.AnimationDefinition;
import com.imagineps.client.definition.ObjectDefinition;

final class Animable_Sub5
extends Entity {
    private int anInt1599;
    private final int[] anIntArray1600;
    private final int anInt1601;
    private final int anInt1602;
    private final int anInt1603;
    private final int anInt1604;
    private final int anInt1605;
    private final int anInt1606;
    private AnimationDefinition aAnimation_1607;
    private int anInt1608;
    public static Client clientInstance;
    private final int anInt1610;
    private final int anInt1611;
    private final int anInt1612;

    @Override
    public Model getModel() {
        int j = -1;
        if (this.aAnimation_1607 != null) {
            Client.getSingleton();
            int k = Client.loopCycle - this.anInt1608;
            if (k > 100 && this.aAnimation_1607.anInt356 > 0) {
                k = 100;
            }
            while (k > this.aAnimation_1607.method258(this.anInt1599)) {
                k -= this.aAnimation_1607.method258(this.anInt1599);
                ++this.anInt1599;
                if (this.anInt1599 < this.aAnimation_1607.frameCount) continue;
                this.anInt1599 -= this.aAnimation_1607.anInt356;
                if (this.anInt1599 >= 0 && this.anInt1599 < this.aAnimation_1607.frameCount) continue;
                this.aAnimation_1607 = null;
                break;
            }
            Client.getSingleton();
            this.anInt1608 = Client.loopCycle - k;
            if (this.aAnimation_1607 != null) {
                j = this.aAnimation_1607.frame[this.anInt1599];
            }
        }
        ObjectDefinition class46 = this.anIntArray1600 != null ? this.method457() : ObjectDefinition.forID(this.anInt1610);
        if (class46 != null) return class46.method578(this.anInt1611, this.anInt1612, this.anInt1603, this.anInt1604, this.anInt1605, this.anInt1606, j);
        return null;
    }

    private ObjectDefinition method457() {
        int i = -1;
        if (this.anInt1601 != -1 && this.anInt1601 < VarBit.cache.length) {
            VarBit varBit = VarBit.cache[this.anInt1601];
            int k = varBit.anInt648;
            int l = varBit.anInt649;
            int i1 = varBit.anInt650;
            int j1 = Client.anIntArray1232[i1 - l];
            i = Animable_Sub5.clientInstance.variousSettings[k] >> l & j1;
        } else if (this.anInt1602 != -1) {
            i = Animable_Sub5.clientInstance.variousSettings[this.anInt1602];
        }
        if (i < 0) return null;
        if (i >= this.anIntArray1600.length) return null;
        if (this.anIntArray1600[i] != -1) return ObjectDefinition.forID(this.anIntArray1600[i]);
        return null;
    }

    public Animable_Sub5(int i, int j, int k, int l, int i1, int j1, int k1, int l1, boolean flag) {
        this.anInt1610 = i;
        this.anInt1611 = k;
        this.anInt1612 = j;
        this.anInt1603 = j1;
        this.anInt1604 = l;
        this.anInt1605 = i1;
        this.anInt1606 = k1;
        if (l1 != -1) {
            this.aAnimation_1607 = AnimationDefinition.getAnim(l1);
            this.anInt1599 = 0;
            Client.getSingleton();
            this.anInt1608 = Client.loopCycle;
            if (flag && this.aAnimation_1607.anInt356 != -1) {
                this.anInt1599 = (int)(Math.random() * (double)this.aAnimation_1607.frameCount);
                this.anInt1608 -= (int)(Math.random() * (double)this.aAnimation_1607.method258(this.anInt1599));
            }
        }
        ObjectDefinition class46 = ObjectDefinition.forID(this.anInt1610);
        this.anInt1601 = class46.anInt774;
        this.anInt1602 = class46.anInt749;
        this.anIntArray1600 = class46.childrenIDs;
    }
}


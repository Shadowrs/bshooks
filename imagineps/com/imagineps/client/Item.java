/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.imagineps.client;

import com.imagineps.client.Entity;
import com.imagineps.client.Model;
import com.imagineps.client.definition.ItemDefinition;

final class Item
extends Entity {
    public int ID;
    public int x;
    public int y;
    public int amount;
    public String customName;

    @Override
    public final Model getModel() {
        ItemDefinition itemDef = ItemDefinition.forID(this.ID);
        return itemDef.method201(this.amount);
    }
}


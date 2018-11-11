/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package com.imagineps.client.rs_interface.impl;

import com.imagineps.client.Client;
import com.imagineps.client.definition.ItemDefinition;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.rs_interface.RSInterface;

public final class ItemSpinnerWidget
extends RSInterface {
    private final int[] items;
    private final int[] amounts;
    private final int selectedIndex;
    private int spinLengthSeconds = 3;

    public ItemSpinnerWidget(int id, int[] items, int[] amounts, int selectedIndex) {
        super(id);
        this.items = items;
        this.amounts = amounts;
        this.selectedIndex = selectedIndex;
    }

    @Override
    public boolean drawInterface(Client client, int widgetDrawX, int widgetDrawY, int superWidgetDrawX, int superWidgetDrawY) {
        int x = 50;
        int[] arrn = this.items;
        int n = arrn.length;
        int n2 = 0;
        while (n2 < n) {
            int inventoryItemId = arrn[n2];
            Sprite itemSprite = ItemDefinition.getSprite(inventoryItemId - 1, 0, 0);
            itemSprite.drawSprite(x, 60);
            x += 30;
            ++n2;
        }
        return false;
    }

    private void shift() {
        int startId = this.inv[0];
        int startAmount = this.invStackSizes[0];
        System.arraycopy((Object)this.inv, (int)1, (Object)this.inv, (int)0, (int)(this.inv.length - 1));
        System.arraycopy((Object)this.invStackSizes, (int)1, (Object)this.invStackSizes, (int)0, (int)(this.invStackSizes.length - 1));
        this.inv[this.inv.length - 1] = startId;
        this.invStackSizes[this.invStackSizes.length - 1] = startAmount;
    }
}


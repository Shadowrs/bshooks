/*
 * Decompiled with CFR 0_125.
 */
package com.imagineps.client.rs_interface.impl;

import com.imagineps.client.Client;
import com.imagineps.client.Player;
import com.imagineps.client.rs_interface.RSInterface;

public final class DrawCharacterHeadWidget
extends RSInterface {
    private static final int DEFAULT_HEAD_MOVE_ANIMATION = 9847;

    public DrawCharacterHeadWidget(int identifier) {
        super(identifier, 75, 55, 6, 0);
        this.disabledAnimation = 9847;
        this.modelRotation1 = 40;
        this.modelRotation2 = 1900;
        this.modelZoom = 2000;
        this.anInt233 = 3;
    }

    @Override
    public boolean drawInterface(Client client, int widgetDrawX, int widgetDrawY, int superWidgetDrawX, int superWidgetDrawY) {
        this.mediaID = (Client.myPlayer.lookColors[0] << 25) + (Client.myPlayer.lookColors[4] << 20) + (Client.myPlayer.equipment[0] << 15) + (Client.myPlayer.equipment[8] << 10) + (Client.myPlayer.equipment[11] << 5) + Client.myPlayer.equipment[1];
        return false;
    }
}


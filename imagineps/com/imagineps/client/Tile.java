/*
 * Decompiled with CFR 0_125.
 */
package com.imagineps.client;

import com.imagineps.client.GroundDecoration;
import com.imagineps.client.GroundItemTile;
import com.imagineps.client.InteractiveObject;
import com.imagineps.client.Node;
import com.imagineps.client.PlainTile;
import com.imagineps.client.ShapedTile;
import com.imagineps.client.WallDecoration;
import com.imagineps.client.WallObject;

final class Tile
extends Node {
    int tileZ;
    final int anInt1308;
    final int anInt1309;
    final int anInt1310;
    PlainTile plainTile;
    ShapedTile shapedTile;
    WallObject wallObject;
    WallDecoration wallDecoration;
    GroundDecoration groundDecoration;
    GroundItemTile groundItemTile;
    int count;
    final InteractiveObject[] interactiveObjects = new InteractiveObject[5];
    final int[] anIntArray1319 = new int[5];
    int anInt1320;
    int logicHeight;
    boolean aBoolean1322;
    boolean aBoolean1323;
    boolean aBoolean1324;
    int anInt1325;
    int anInt1326;
    int anInt1327;
    int anInt1328;
    Tile tileBelowZero;

    Tile(int i, int j, int k) {
        this.anInt1310 = this.tileZ = i;
        this.anInt1308 = j;
        this.anInt1309 = k;
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client.definition;

public enum RevisionType {
    DEFAULT(1, 2, 4),
    OSRS(5, 6, 4),
    PRE_EOC(7, 2, 4),
    CUSTOM_ITEM_MODELS(8, 2, 4);
    
    private final int modelCacheIndex;
    private final int animationCacheIndex;
    private final int mapCacheIndex;

    private RevisionType(int modelCacheIndex, int animationCacheIndex, int mapCacheIndex) {
        this.modelCacheIndex = modelCacheIndex;
        this.animationCacheIndex = animationCacheIndex;
        this.mapCacheIndex = mapCacheIndex;
    }

    public int getModelCacheIndex() {
        return this.modelCacheIndex;
    }

    public int getAnimationCacheIndex() {
        return this.animationCacheIndex;
    }

    public int getMapCacheIndex() {
        return this.mapCacheIndex;
    }
}


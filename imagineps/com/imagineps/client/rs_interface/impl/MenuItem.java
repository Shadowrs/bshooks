/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client.rs_interface.impl;

import com.imagineps.client.graphics.Sprite;

public class MenuItem {
    private final Sprite sprite;
    private String text;

    public MenuItem(String text) {
        this(null, text);
    }

    public MenuItem(Sprite sprite, String text) {
        this.sprite = sprite;
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public Sprite getSprite() {
        return this.sprite;
    }

    public void setText(String text) {
        this.text = text;
    }
}


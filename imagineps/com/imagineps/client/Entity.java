/*
 * Decompiled with CFR 0_125.
 */
package com.imagineps.client;

import com.imagineps.client.Model;
import com.imagineps.client.NodeSub;
import com.imagineps.client.VertexNormal;

public class Entity
extends NodeSub {
    VertexNormal[] vertexNormals;
    public int modelHeight = 1000;

    public void method443(int i, int j, int k, int l, int i1, int j1, int k1, int l1, int i2, int bufferOffset) {
        Model model = this.getModel();
        if (model == null) return;
        this.modelHeight = model.modelHeight;
        model.method443(i, j, k, l, i1, j1, k1, l1, i2, bufferOffset);
    }

    Model getModel() {
        return null;
    }

    Entity() {
    }
}


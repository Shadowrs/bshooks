/*
 * Decompiled with CFR 0_125.
 */
package com.imagineps.client;

import com.imagineps.client.Node;

public class NodeSub
extends Node {
    public NodeSub prevNodeSub;
    NodeSub nextNodeSub;
    public static int anInt1305;

    public final void unlinkSub() {
        if (this.nextNodeSub == null) return;
        this.nextNodeSub.prevNodeSub = this.prevNodeSub;
        this.prevNodeSub.nextNodeSub = this.nextNodeSub;
        this.prevNodeSub = null;
        this.nextNodeSub = null;
    }
}


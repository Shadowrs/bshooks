/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client;

import com.imagineps.client.NodeSub;

public final class NodeSubList {
    private final NodeSub head;
    private NodeSub current;

    public NodeSubList() {
        this.head.prevNodeSub = this.head = new NodeSub();
        this.head.nextNodeSub = this.head;
    }

    public void insertHead(NodeSub nodeSub) {
        if (nodeSub.nextNodeSub != null) {
            nodeSub.unlinkSub();
        }
        nodeSub.nextNodeSub = this.head.nextNodeSub;
        nodeSub.prevNodeSub = this.head;
        nodeSub.nextNodeSub.prevNodeSub = nodeSub;
        nodeSub.prevNodeSub.nextNodeSub = nodeSub;
    }

    public NodeSub popTail() {
        NodeSub nodeSub = this.head.prevNodeSub;
        if (nodeSub == this.head) {
            return null;
        }
        nodeSub.unlinkSub();
        return nodeSub;
    }

    public NodeSub reverseGetFirst() {
        NodeSub nodeSub = this.head.prevNodeSub;
        if (nodeSub == this.head) {
            this.current = null;
            return null;
        }
        this.current = nodeSub.prevNodeSub;
        return nodeSub;
    }

    public NodeSub reverseGetNext() {
        NodeSub nodeSub = this.current;
        if (nodeSub == this.head) {
            this.current = null;
            return null;
        }
        this.current = nodeSub.prevNodeSub;
        return nodeSub;
    }

    public int getNodeCount() {
        int i = 0;
        NodeSub nodeSub = this.head.prevNodeSub;
        while (nodeSub != this.head) {
            ++i;
            nodeSub = nodeSub.prevNodeSub;
        }
        return i;
    }
}


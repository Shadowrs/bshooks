/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package com.imagineps.client;

import com.imagineps.client.Node;
import com.imagineps.client.NodeCache;
import com.imagineps.client.NodeSub;
import com.imagineps.client.NodeSubList;
import com.imagineps.client.signlink.Signlink;

public final class MRUNodes {
    private final NodeSub emptyNodeSub = new NodeSub();
    private final int initialCount;
    private int spaceLeft;
    private final NodeCache nodeCache = new NodeCache();
    private final NodeSubList nodeSubList = new NodeSubList();

    public MRUNodes(int i) {
        this.initialCount = i;
        this.spaceLeft = i;
    }

    public NodeSub insertFromCache(long l) {
        NodeSub nodeSub = (NodeSub)this.nodeCache.findNodeByID(l);
        if (nodeSub == null) return nodeSub;
        this.nodeSubList.insertHead(nodeSub);
        return nodeSub;
    }

    public void removeFromCache(NodeSub nodeSub, long l) {
        try {
            if (this.spaceLeft == 0) {
                NodeSub nodeSub_1 = this.nodeSubList.popTail();
                nodeSub_1.unlink();
                nodeSub_1.unlinkSub();
                if (nodeSub_1 == this.emptyNodeSub) {
                    NodeSub nodeSub_2 = this.nodeSubList.popTail();
                    nodeSub_2.unlink();
                    nodeSub_2.unlinkSub();
                }
            } else {
                --this.spaceLeft;
            }
            this.nodeCache.removeFromCache(nodeSub, l);
            this.nodeSubList.insertHead(nodeSub);
            return;
        }
        catch (RuntimeException runtimeexception) {
            Signlink.reporterror("47547, " + nodeSub + ", " + l + ", " + 2 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void unlinkAll() {
        do {
            NodeSub nodeSub;
            if ((nodeSub = this.nodeSubList.popTail()) == null) {
                this.spaceLeft = this.initialCount;
                return;
            }
            nodeSub.unlink();
            nodeSub.unlinkSub();
        } while (true);
    }
}


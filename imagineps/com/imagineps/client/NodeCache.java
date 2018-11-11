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
import com.imagineps.client.signlink.Signlink;

final class NodeCache {
    private final int size;
    private final Node[] cache;

    public NodeCache() {
        int i;
        this.size = i = 1024;
        this.cache = new Node[i];
        int k = 0;
        while (k < i) {
            Node node;
            node.prev = node = (this.cache[k] = new Node());
            node.next = node;
            ++k;
        }
    }

    public Node findNodeByID(long l) {
        Node node = this.cache[(int)(l & (long)(this.size - 1))];
        Node node_1 = node.prev;
        while (node_1 != node) {
            if (node_1.id == l) {
                return node_1;
            }
            node_1 = node_1.prev;
        }
        return null;
    }

    public void removeFromCache(Node node, long l) {
        try {
            if (node.next != null) {
                node.unlink();
            }
            Node node_1 = this.cache[(int)(l & (long)(this.size - 1))];
            node.next = node_1.next;
            node.prev = node_1;
            node.next.prev = node;
            node.prev.next = node;
            node.id = l;
            return;
        }
        catch (RuntimeException runtimeexception) {
            Signlink.reporterror("91499, " + node + ", " + l + ", " + 7 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client;

public class Node {
    public long id;
    public Node prev;
    public Node next;

    public final void unlink() {
        if (this.next == null) return;
        this.next.prev = this.prev;
        this.prev.next = this.next;
        this.prev = null;
        this.next = null;
    }
}


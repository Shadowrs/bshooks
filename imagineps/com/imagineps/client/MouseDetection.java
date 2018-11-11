/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 */
package com.imagineps.client;

import com.imagineps.client.Client;

final class MouseDetection
implements Runnable {
    private Client clientInstance;
    public final Object syncObject = new Object();
    public final int[] coordsY = new int[500];
    public boolean running = true;
    public final int[] coordsX = new int[500];
    public int coordsIndex;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        while (this.running) {
            Object object = this.syncObject;
            synchronized (object) {
                if (this.coordsIndex < 500) {
                    this.coordsX[this.coordsIndex] = this.clientInstance.mouseX;
                    this.coordsY[this.coordsIndex] = this.clientInstance.mouseY;
                    ++this.coordsIndex;
                }
            }
            try {
                Thread.sleep((long)50L);
            }
            catch (Exception exception) {}
        }
    }

    public MouseDetection(Client client1) {
        this.clientInstance = client1;
    }
}


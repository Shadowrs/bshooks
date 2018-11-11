/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client;

public enum ConnectionStatus {
    ECO("ECO (World 1)", "66.70.180.232", 43594),
    PVP("PVP (World 2)", "66.70.180.232", 55555),
    LOCAL("Local", "127.0.0.1", 43594),
    BETA("Beta", "74.91.120.240", 43594);
    
    public final String name;
    private final String address;
    private final int port;
    private static final ConnectionStatus[] values;

    private ConnectionStatus(String name, String address, int port) {
        this.name = name;
        this.address = address;
        this.port = port;
    }

    public String getAddress() {
        return this.address;
    }

    public int getPort() {
        return this.port;
    }

    public ConnectionStatus getNext() {
        int next = this.ordinal() + 1;
        if (next < values.length) return values[next];
        return values[0];
    }

    static {
        values = ConnectionStatus.values();
    }
}


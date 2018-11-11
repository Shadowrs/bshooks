/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.content.clan;

public class ClanUser {
    private final String username;
    private final int rights;

    public ClanUser(String username, int rights) {
        this.username = username;
        this.rights = rights;
    }

    public String getUsername() {
        return this.username;
    }

    public int getRights() {
        return this.rights;
    }

    public String toString() {
        return "Clan user [name = " + this.username + ", rights = " + this.rights + "]";
    }
}


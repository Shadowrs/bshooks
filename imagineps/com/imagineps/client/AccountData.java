/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client;

import com.imagineps.client.Utility;

public class AccountData {
    public String username;
    public String password;
    public String created;
    public int avatar;
    public int rank;
    public int uses;
    public boolean female;

    public AccountData(String username, String password, String created, boolean female, int avatar, int rank, int uses) {
        this.username = username;
        this.password = password;
        this.created = created;
        this.avatar = avatar;
        this.rank = rank;
        this.uses = uses;
        this.female = female;
    }

    public AccountData(String username, String password, boolean female, int rank) {
        this(username, password, Utility.getDate(), female, 534, rank, 0);
    }

    public String toString() {
        return "[Username: " + this.username + " | Password: " + this.password + " | Created: " + this.created + " | Avatar: " + this.avatar + " | Rank: " + this.rank + " | Uses: " + this.uses + "]";
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.imagineps.content.clan;

import com.imagineps.client.Client;
import com.imagineps.client.rs_interface.RSInterface;
import com.imagineps.content.clan.ClanUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClanChat {
    private final Client client;
    private String name;
    private String owner;
    private static final int START_INDEX = 31544;
    private List<ClanUser> users = new ArrayList();

    public ClanChat(Client client) {
        this.client = client;
    }

    public void add(String username, int rights) {
        if (this.inClan(username)) return;
        this.users.add((Object)new ClanUser(username, rights));
    }

    public void remove(String username) {
        Iterator it$ = this.users.iterator();
        while (it$.hasNext()) {
            ClanUser user = (ClanUser)it$.next();
            if (!user.getUsername().equalsIgnoreCase(username)) continue;
            it$.remove();
        }
    }

    public boolean inClan(String username) {
        ClanUser s;
        Iterator iterator = this.users.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while ((s = (ClanUser)iterator.next()) == null || s.getUsername() == null || !s.getUsername().equalsIgnoreCase(username));
        return true;
    }

    public void drawLines() {
        String username = this.users.size() == 0 ? "" : this.name;
        RSInterface.interfaceCache[31539].message = "Talking In: " + username;
        RSInterface.interfaceCache[31540].message = "Owner: " + username;
        int index = 0;
        while (index <= 500) {
            RSInterface.interfaceCache[31544 + index].message = index < this.users.size() ? ((ClanUser)this.users.get(index)).getUsername() : "";
            ++index;
        }
    }

    public void setName(String name) {
        this.name = this.owner = name;
    }

    public void clear() {
        this.users.clear();
    }

    public String getName() {
        return this.name;
    }
}


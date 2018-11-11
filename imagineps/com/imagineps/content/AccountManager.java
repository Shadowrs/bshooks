/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.DataInputStream
 *  java.io.DataOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 */
package com.imagineps.content;

import com.imagineps.client.AccountData;
import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.FileUtility;
import com.imagineps.client.Utility;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AccountManager {
    private static final String FILE_NAME = "accounts.dat";
    public static final List<AccountData> ACCOUNTS = new LinkedList();

    public static AccountData get(int index) {
        if (ACCOUNTS.isEmpty()) return null;
        if (index < ACCOUNTS.size()) return (AccountData)ACCOUNTS.get(index);
        return null;
    }

    public static void add(String username, String password, int rank, boolean female) {
        Utility.formatName(username);
        AccountData account = null;
        int accountIndex = 0;
        for (int index = 0; index < ACCOUNTS.size(); ++index) {
            if (!((AccountData)AccountManager.ACCOUNTS.get((int)index)).username.equalsIgnoreCase(username)) continue;
            account = (AccountData)ACCOUNTS.get(index);
            accountIndex = index;
            if (account == null) break;
            ++account.uses;
            ACCOUNTS.remove(accountIndex);
            ACCOUNTS.add(accountIndex, (Object)new AccountData(username, password, account.created, account.female, account.avatar, rank, account.uses));
            AccountManager.saveAccount();
            return;
        }
        if (ACCOUNTS.size() >= 3) {
            return;
        }
        ACCOUNTS.add((Object)new AccountData(username, password, female, rank));
        AccountManager.saveAccount();
    }

    public static void clearAccountList() {
        ACCOUNTS.clear();
        AccountManager.saveAccount();
    }

    public static void removeAccount(AccountData account) {
        if (!ACCOUNTS.contains((Object)account)) {
            return;
        }
        ACCOUNTS.remove((Object)account);
        AccountManager.saveAccount();
    }

    public static void saveAccount() {
        if (ACCOUNTS.isEmpty()) {
            return;
        }
        try {
            File file = FileUtility.getOrCreate(Configuration.CHAR_PATH, FILE_NAME);
            DataOutputStream output = new DataOutputStream((OutputStream)new FileOutputStream(file));
            output.writeByte(ACCOUNTS.size());
            Iterator iterator = ACCOUNTS.iterator();
            do {
                if (!iterator.hasNext()) {
                    output.close();
                    return;
                }
                AccountData account = (AccountData)iterator.next();
                output.writeUTF(account.username);
                output.writeUTF(account.password);
                output.writeUTF(account.created);
                output.writeInt(account.avatar);
                output.writeInt(account.rank);
                output.writeInt(account.uses);
                output.writeBoolean(account.female);
            } while (true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadAccount() {
        try {
            File file = FileUtility.getOrCreate(Configuration.CHAR_PATH, FILE_NAME);
            DataInputStream input = new DataInputStream((InputStream)new FileInputStream(file));
            int fileSize = input.read();
            if (fileSize < 0) {
                input.close();
                return;
            }
            for (int index = 0; index < fileSize; ++index) {
                String username = input.readUTF();
                String password = input.readUTF();
                String created = input.readUTF();
                int avatar = input.readInt();
                int rank = input.readInt();
                int uses = input.readInt();
                boolean female = input.readBoolean();
                AccountData account = new AccountData(username, password, created, female, avatar, rank, uses);
                ACCOUNTS.add((Object)account);
            }
            input.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        AccountManager.initialize();
    }

    public static void initialize() {
        if (ACCOUNTS.isEmpty()) {
            return;
        }
        Client.instance.lastAccount = (AccountData)ACCOUNTS.get(0);
    }
}


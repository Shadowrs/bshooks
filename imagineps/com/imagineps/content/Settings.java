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
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.content;

import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.signlink.Signlink;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class Settings {
    private static final int STRING_ID = 28450;
    private static final String DIRECTORY = Signlink.getDirectory() + "/config.dat";
    public static final String[] strings = new String[]{"Hide Npcs", "Smooth Fog", "Smooth Animations", "Particles", "Tile Blending", "First Person", "Enter To Chat", "Screen Gliding", "Tool Tips", "HD Minimap"};

    public static void updateText() {
        Client.sendFrame126(Settings.prefix(Configuration.firstPerson) + strings[5], 28455);
        Client.sendFrame126(Settings.prefix(Configuration.enterToChat) + strings[6], 28456);
    }

    public static String prefix(boolean paramBoolean) {
        if (!paramBoolean) return "<col=D61E30>";
        return "<col=4DE024>";
    }

    public static void defaultSettings() {
        Configuration.firstPerson = false;
        Configuration.enterToChat = false;
        Configuration.DRAW_BUBBLES = true;
        Settings.updateText();
        Client.loadingStage = 1;
    }

    public static void save() {
        try {
            File file = new File(DIRECTORY);
            DataOutputStream out = new DataOutputStream((OutputStream)new FileOutputStream(file));
            out.writeUTF(Client.getSingleton().myUsername);
            out.writeUTF(Client.getSingleton().myPassword);
            out.writeUTF(Client.chatColorHex);
            out.writeBoolean(Configuration.firstPerson);
            out.writeBoolean(Configuration.enterToChat);
            out.writeBoolean(Configuration.DRAW_BUBBLES);
            out.writeBoolean(Configuration.REMEMBER_ME);
            out.close();
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void load() {
        try {
            File file = new File(DIRECTORY);
            if (!file.exists()) {
                return;
            }
            DataInputStream in = new DataInputStream((InputStream)new FileInputStream(file));
            Client.getSingleton().myUsername = in.readUTF();
            Client.getSingleton().myPassword = in.readUTF();
            Client.chatColorHex = in.readUTF();
            Configuration.firstPerson = in.readBoolean();
            Configuration.enterToChat = in.readBoolean();
            Configuration.DRAW_BUBBLES = in.readBoolean();
            Configuration.REMEMBER_ME = in.readBoolean();
            in.close();
            System.out.println("Settings loaded: " + strings.length);
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Hashtable
 */
package com.imagineps.client.definition;

import com.imagineps.client.Client;
import com.imagineps.client.FileOperations;
import com.imagineps.client.MRUNodes;
import com.imagineps.client.Model;
import com.imagineps.client.NodeSub;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.VarBit;
import com.imagineps.client.cache.CacheType;
import com.imagineps.client.cache.OnDemandFetcher;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.RevisionType;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;
import org.apache.commons.lang3.ArrayUtils;

public final class ObjectDefinition {
    private static final int[] OBJECTS_728 = new int[]{226, 2639, 16455, 32157, 32159, 53084};
    private static Stream stream;
    private static int[] streamIndices;
    private static Stream stream728;
    private static int[] streamIndices728;
    private RevisionType revisionType = RevisionType.DEFAULT;
    public boolean aBoolean736;
    public byte aByte737;
    public int anInt738;
    public String name;
    public int anInt740;
    public static final Model[] aModelArray741s;
    public byte aByte742;
    public int width;
    public int anInt745;
    public int anInt746;
    public int[] originalModelColors;
    public int anInt748;
    public int anInt749;
    public boolean aBoolean751;
    public static boolean lowMem;
    public int type = -1;
    public boolean aBoolean757;
    public int anInt758;
    public int[] childrenIDs;
    public int anInt760;
    public int length;
    public boolean aBoolean762;
    public boolean aBoolean764;
    public static Client clientInstance;
    public boolean aBoolean766;
    public boolean aBoolean767;
    public int entryMask;
    public boolean aBoolean769;
    public static int cacheIndex;
    public int anInt772;
    public int[] anIntArray773;
    public int anInt774;
    public int anInt775;
    public int[] anIntArray776;
    public byte[] description;
    public boolean hasActions;
    public boolean aBoolean779;
    public static MRUNodes mruNodes2;
    public int anInt781;
    private static ObjectDefinition[] cache;
    public int anInt783;
    public int[] modifiedModelColors;
    public static MRUNodes mruNodes1;
    public String[] itemActions;

    public static void unpackConfig(StreamLoader streamLoader) {
        int index;
        stream = new Stream(streamLoader.getDataForName("loc.dat"));
        Stream indexStream = new Stream(streamLoader.getDataForName("loc.idx"));
        int totalObjects = indexStream.readUnsignedWord();
        System.out.println("508 Object Amount: " + totalObjects);
        streamIndices = new int[totalObjects];
        int position = 2;
        for (int index2 = 0; index2 < totalObjects; position += indexStream.readUnsignedWord(), ++index2) {
            ObjectDefinition.streamIndices[index2] = position;
        }
        stream728 = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "loc728.dat"));
        Stream indexStream728 = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "loc728.idx"));
        int objectAmount728 = 73000;
        streamIndices728 = new int[73000];
        position = 2;
        for (index = 0; index < 73000; position += indexStream728.readUnsignedWord(), ++index) {
            ObjectDefinition.streamIndices728[index] = position;
        }
        index = 0;
        while (index < cache.length) {
            ObjectDefinition.cache[index] = new ObjectDefinition();
            ++index;
        }
    }

    private int[] toModelArray(int[][] models) {
        ArrayList list = new ArrayList();
        int[][] arrn = models;
        int n = arrn.length;
        int n2 = 0;
        while (n2 < n) {
            int[] model;
            for (int aModel : model = arrn[n2]) {
                list.add((Object)aModel);
            }
            ++n2;
        }
        return ArrayUtils.toPrimitive((Integer[])list.toArray((Object[])new Integer[0]));
    }

    public static ObjectDefinition forID(int i) {
        if (ObjectDefinition.is728Object(i)) {
            return ObjectDefinition.for728(i);
        }
        if (i > streamIndices.length) {
            i = streamIndices.length - 1;
        }
        for (int j = 0; j < 20; ++j) {
            if (ObjectDefinition.cache[j].type != i) continue;
            return cache[j];
        }
        cacheIndex = (cacheIndex + 1) % 20;
        ObjectDefinition class46 = cache[cacheIndex];
        try {
            ObjectDefinition.stream.currentOffset = streamIndices[i];
        }
        catch (Exception exception) {
            // empty catch block
        }
        class46.type = i;
        class46.setDefaults();
        class46.readValues(stream);
        class46.revisionType = RevisionType.DEFAULT;
        if (i == 10959) {
            class46.name = "Imagine Statue";
            class46.description = "Tweety sucks farts and smells like eggs. #ImagineGang".getBytes();
        }
        if (i == 2716) {
            class46.name = "Item Exchanger";
            class46.description = "Exchange high tier items for 1b tokens.".getBytes();
        }
        if (i == 11214) {
            class46.name = "Empty space";
            class46.description = "You can build something here.".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50099;
            class46.itemActions = new String[5];
            class46.itemActions[0] = "Build";
            class46.hasActions = true;
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 884) {
            class46.name = "Donation Well";
        }
        if (i == 11215) {
            class46.name = "Prayer-Altar";
            class46.description = "You can build an altar here.".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50099;
            class46.itemActions = new String[5];
            class46.itemActions[0] = "Build";
            class46.hasActions = true;
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 6282) {
            class46.name = "Blood Portal";
            class46.description = "You need an imp key to go through!".getBytes();
            class46.itemActions = new String[5];
            class46.itemActions[0] = "Unlock";
        }
        if (i == 7272) {
            class46.name = "Melee Portal";
            class46.description = "A magic portal!".getBytes();
        }
        if (i == 7288) {
            class46.name = "Range Portal";
            class46.description = "A magic portal!".getBytes();
        }
        if (i == 7273) {
            class46.name = "Mage Portal";
            class46.description = "A magic portal!".getBytes();
        }
        if (i == 5628) {
            class46.name = "Luxury table";
            class46.width = 2;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 70129;
            class46.hasActions = false;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 11216) {
            class46.name = "Bed";
            class46.description = "You can build a bed here.".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50099;
            class46.itemActions = new String[5];
            class46.itemActions[0] = "Build";
            class46.hasActions = true;
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 11217) {
            class46.name = "Tree";
            class46.description = "You can plant a tree here.".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50099;
            class46.itemActions = new String[5];
            class46.itemActions[0] = "Plant";
            class46.hasActions = true;
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 11219) {
            class46.name = "Bank Chest";
            class46.description = "You can build a bank here.".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50099;
            class46.itemActions = new String[5];
            class46.itemActions[0] = "Build";
            class46.hasActions = true;
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 11220) {
            class46.name = "Burner";
            class46.description = "Allows you to build two lecterns".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50099;
            class46.itemActions = new String[5];
            class46.itemActions[0] = "Build";
            class46.hasActions = true;
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 11212) {
            class46.name = "Teleporter";
            class46.description = "Allows you to teleport to places.".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50099;
            class46.itemActions = new String[5];
            class46.itemActions[0] = "Build";
            class46.hasActions = true;
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 11209) {
            class46.name = "Crystal";
            class46.description = "Allows you to create teleport tablets.".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50099;
            class46.itemActions = new String[5];
            class46.itemActions[0] = "Build";
            class46.hasActions = true;
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 13660) {
            class46.itemActions = new String[5];
            class46.name = "Crystal Ball";
            class46.itemActions[1] = "Use";
        }
        if (i == 3994) {
            class46.itemActions = new String[5];
            class46.name = "Small Furnace";
            class46.itemActions[1] = "Use";
        }
        if (i == 2152) {
            class46.itemActions = new String[5];
            class46.name = "Summoning Obelisk";
            class46.itemActions[1] = "Infuse Pouches";
        }
        if (i == 1503) {
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 28124;
            class46.hasActions = false;
        }
        if (i == 2823) {
            class46.hasActions = true;
            class46.name = "Low Pale Energy Hole";
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Harvest";
        }
        if (i == 2693) {
            class46.name = "Golden Key Chest";
        }
        if (i == 2996) {
            class46.name = "Crystal Key Chest";
        }
        if (i == 43) {
            class46.aBoolean767 = false;
        }
        if (i == 6002) {
            class46.name = "Mario Pipe";
            class46.description = "Mario Warp Pipe".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 65275;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Go to Mario Zone";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 9770) {
            class46.name = "Aqua Altar";
            class46.description = "An under water altar.".getBytes();
            class46.width = 2;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50100;
            class46.hasActions = true;
            class46.itemActions[1] = "Pray";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 9771) {
            class46.name = "Board of Fame";
            class46.description = "A board where is exposed all the cool people.".getBytes();
            class46.width = 1;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 50101;
            class46.hasActions = true;
            class46.itemActions[0] = "Look at";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 5024) {
            class46.name = "Mario Pipe";
            class46.description = "Mario Warp Pipe".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 65275;
            class46.hasActions = false;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 6003) {
            class46.name = "@yel@Treasure Chest";
            class46.description = "Mario treasure chest".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 65276;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Open mario treasure chest";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 2505) {
            class46.name = "@mag@Bank Booth";
            class46.description = "It's hot!".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 42145;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Use quickly";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 2503) {
            class46.name = "@red@Meteorite";
            class46.description = "Aouuchh! It's hot!".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 42146;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Mine";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 7890) {
            class46.name = "@red@Meteorite";
            class46.description = "Aouuchh! It's hot!".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 79418;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Mine";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 5022) {
            class46.name = "@yel@Golds";
            class46.description = "A stack of golds on the ground ? what u waiting to pick it up!".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 2488;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Pick Up";
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 4001) {
            class46.name = "@yel@Gambling Machine";
            class46.description = "Gamble FTW".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 45037;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Gamble";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 4002) {
            class46.name = "@yel@Gambling Machine";
            class46.description = "Gamble FTW.".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 45036;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Gamble";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 5020) {
            class46.name = "@yel@Gift Table";
            class46.description = "Gamble FTW.".getBytes();
            class46.width = 3;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 45038;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 2533) {
            class46.name = "@yel@Trophy";
            class46.description = "Gamble FTW.".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.hasActions = false;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 45039;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 7322) {
            class46.name = "@cya@Fortune Banner";
            class46.description = "Thats the banner of the gnome! DONT TOUCH!".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.hasActions = false;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 40565;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 7321) {
            class46.name = "@dre@Bank booth";
            class46.description = "That's a deathly bank booth!".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.hasActions = true;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 40566;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 7325) {
            class46.name = "@cya@Crystal Tree";
            class46.description = "A level 105 tree.".getBytes();
            class46.width = 5;
            class46.length = 5;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Chop";
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 40563;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 7324) {
            class46.name = "@dre@Drygore Tree";
            class46.description = "A level 115 tree.".getBytes();
            class46.width = 5;
            class46.length = 5;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Chop";
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 40564;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 6770) {
            class46.name = "@yel@Tree House";
            class46.description = "Gamble FTW.".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 45040;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 6778) {
            class46.name = "@yel@Note Table";
            class46.description = "Gamble FTW.".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 45041;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 6777) {
            class46.name = "@yel@Wealth Fountain";
            class46.description = "Gamble FTW.".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 45042;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 3451) {
            class46.description = "Hexis Statue".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 28908;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 3450) {
            class46.description = "Af Statue".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 28910;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 3449) {
            class46.description = "Rot Statue".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 28911;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 3448) {
            class46.description = "Fl Statue".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 28912;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 3447) {
            class46.name = "@red@Power Energy Hole";
            class46.description = "Level 50 divination hole!".getBytes();
            class46.width = 2;
            class46.length = 2;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 28925;
            class46.hasActions = true;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Drain";
            class46.aBoolean767 = false;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 2657) {
            class46.name = "@yel@Blocking Barrel";
            class46.description = "A barrel to block the passage to Narnia!".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.hasActions = false;
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 2504) {
            class46.name = "River Plant";
            class46.description = "River Plant".getBytes();
            class46.width = 1;
            class46.length = 1;
            class46.anIntArray773 = new int[1];
            class46.anIntArray773[0] = 65277;
            class46.hasActions = false;
            class46.itemActions = new String[5];
            class46.itemActions[1] = "Open mario treasure chest";
            class46.aBoolean767 = true;
            class46.aBoolean762 = false;
            class46.aBoolean769 = false;
        }
        if (i == 732) {
            class46.anIntArray773 = new int[]{2298};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.anInt781 = 494;
            class46.aByte737 = (byte)50;
            class46.aByte742 = (byte)25;
            class46.aBoolean779 = false;
        }
        if (i == 1502) {
            class46.anIntArray773 = new int[]{782, 783, 784};
            class46.anIntArray776 = new int[]{0, 1, 9};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
            class46.originalModelColors = new int[]{8};
            class46.modifiedModelColors = new int[]{6689};
        }
        if (i == 4451) {
            class46.anIntArray773 = new int[]{2214, 4873, 16239, 2215, 16238};
            class46.anIntArray776 = new int[]{0, 2, 4, 9, 22};
            class46.name = "null";
            class46.aBoolean779 = false;
            class46.anInt758 = 22;
        }
        if (i == 6775) {
            class46.anIntArray773 = new int[]{12451};
            class46.anIntArray776 = new int[]{4};
            class46.name = "Curtains";
            class46.aBoolean767 = false;
            class46.itemActions = new String[]{null, null, null, null, "Remove"};
        }
        if (i == 7823) {
            class46.anIntArray773 = new int[]{29377};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean769 = true;
        }
        if (i == 7824) {
            class46.anIntArray773 = new int[]{29368};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean769 = true;
        }
        if (i == 7825) {
            class46.anIntArray773 = new int[]{29364};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean769 = true;
        }
        if (i == 7826) {
            class46.anIntArray773 = new int[]{29369};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean769 = true;
        }
        if (i == 7827) {
            class46.anIntArray773 = new int[]{29370};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean769 = true;
        }
        if (i == 7828) {
            class46.anIntArray773 = new int[]{29367};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean769 = true;
        }
        if (i == 7829) {
            class46.anIntArray773 = new int[]{29375};
            class46.anIntArray776 = new int[]{2};
            class46.name = "null";
            class46.aBoolean769 = true;
        }
        if (i == 7830) {
            class46.anIntArray773 = new int[]{29365};
            class46.anIntArray776 = new int[]{3};
            class46.name = "null";
            class46.aBoolean769 = true;
        }
        if (i == 7834) {
            class46.anIntArray773 = new int[]{29376, 29371};
            class46.anIntArray776 = new int[]{10, 0};
            class46.name = "null";
            class46.aBoolean769 = true;
        }
        if (i == 11853) {
            class46.anIntArray773 = new int[]{9297};
            class46.name = "null";
            class46.anInt781 = 2599;
            class46.aByte737 = (byte)25;
            class46.aByte742 = (byte)15;
            class46.aBoolean779 = false;
        }
        if (i == 12930) {
            class46.anIntArray773 = new int[]{1124};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.originalModelColors = new int[]{20, 20, 20};
            class46.modifiedModelColors = new int[]{4899, 5921, 4892};
        }
        if (i == 12931) {
            class46.anIntArray773 = new int[]{1139};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.originalModelColors = new int[]{20, 20, 20};
            class46.modifiedModelColors = new int[]{4899, 5921, 4892};
        }
        if (i == 12932) {
            class46.anIntArray773 = new int[]{1032};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.originalModelColors = new int[]{20, 20, 20};
            class46.modifiedModelColors = new int[]{4899, 5921, 4892};
        }
        if (i == 14645) {
            class46.anIntArray773 = new int[]{1079};
            class46.name = "Skeleton";
            class46.aBoolean757 = false;
            class46.originalModelColors = new int[]{24};
            class46.modifiedModelColors = new int[]{6241};
        }
        if (i == 14674) {
            class46.anIntArray773 = new int[]{1079};
            class46.name = "Skeleton";
            class46.aBoolean757 = false;
            class46.originalModelColors = new int[]{20};
            class46.modifiedModelColors = new int[]{6241};
        }
        if (i == 14675) {
            class46.anIntArray773 = new int[]{1080};
            class46.name = "Skeleton";
            class46.width = 2;
            class46.aBoolean757 = false;
            class46.originalModelColors = new int[]{20};
            class46.modifiedModelColors = new int[]{6241};
        }
        if (i == 17118) {
            class46.anIntArray773 = new int[]{2297};
            class46.name = "Pool of Slime";
            class46.width = 3;
            class46.length = 3;
            class46.aBoolean767 = false;
            class46.anInt781 = 493;
            class46.aByte737 = (byte)50;
            class46.aByte742 = (byte)25;
            class46.originalModelColors = new int[]{20797};
            class46.modifiedModelColors = new int[]{5058};
            class46.aBoolean779 = false;
            class46.anInt748 = 256;
            class46.anInt772 = 256;
            class46.anInt740 = 256;
        }
        if (i == 20196) {
            class46.anIntArray773 = new int[]{29383};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 20737) {
            class46.anIntArray773 = new int[]{834};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
            class46.originalModelColors = new int[]{0};
            class46.modifiedModelColors = new int[]{6689};
        }
        if (i == 21696) {
            class46.anIntArray773 = new int[]{29379};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21697) {
            class46.anIntArray773 = new int[]{29381};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21698) {
            class46.anIntArray773 = new int[]{29387};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21699) {
            class46.anIntArray773 = new int[]{29389};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21700) {
            class46.anIntArray773 = new int[]{29388};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21701) {
            class46.anIntArray773 = new int[]{29384};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21702) {
            class46.anIntArray773 = new int[]{29386};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21703) {
            class46.anIntArray773 = new int[]{29380};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21704) {
            class46.anIntArray773 = new int[]{29308};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
        }
        if (i == 21705) {
            class46.anIntArray773 = new int[]{29307};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
        }
        if (i == 21706) {
            class46.anIntArray773 = new int[]{29309};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
        }
        if (i == 21707) {
            class46.anIntArray773 = new int[]{29310};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
        }
        if (i == 21708) {
            class46.anIntArray773 = new int[]{29344};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21709) {
            class46.anIntArray773 = new int[]{29348};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21710) {
            class46.anIntArray773 = new int[]{29343};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21711) {
            class46.anIntArray773 = new int[]{29342};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21712) {
            class46.anIntArray773 = new int[]{29345};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21713) {
            class46.anIntArray773 = new int[]{29339};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21714) {
            class46.anIntArray773 = new int[]{29349};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21715) {
            class46.anIntArray773 = new int[]{29340};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21716) {
            class46.anIntArray773 = new int[]{29338};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21717) {
            class46.anIntArray773 = new int[]{29347};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21718) {
            class46.anIntArray773 = new int[]{29346};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21748) {
            class46.anIntArray773 = new int[]{29341};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21749) {
            class46.anIntArray773 = new int[]{29385};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21750) {
            class46.anIntArray773 = new int[]{29378};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21751) {
            class46.anIntArray773 = new int[]{29350};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21752) {
            class46.anIntArray773 = new int[]{29352};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21753) {
            class46.anIntArray773 = new int[]{29359};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21754) {
            class46.anIntArray773 = new int[]{29351};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21755) {
            class46.anIntArray773 = new int[]{29358};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21756) {
            class46.anIntArray773 = new int[]{29353};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21757) {
            class46.anIntArray773 = new int[]{29354};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21758) {
            class46.anIntArray773 = new int[]{29357};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21759) {
            class46.anIntArray773 = new int[]{29355};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21760) {
            class46.anIntArray773 = new int[]{29356};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21761) {
            class46.anIntArray773 = new int[]{29281};
            class46.name = "null";
            class46.width = 2;
            class46.length = 2;
            class46.aBoolean762 = true;
        }
        if (i == 21762) {
            class46.anIntArray773 = new int[]{29282};
            class46.name = "null";
            class46.width = 2;
            class46.length = 2;
            class46.aBoolean762 = true;
        }
        if (i == 21763) {
            class46.anIntArray773 = new int[]{29283};
            class46.name = "null";
            class46.aBoolean762 = true;
        }
        if (i == 21765) {
            class46.anIntArray773 = new int[]{29284};
            class46.name = "null";
            class46.width = 2;
            class46.length = 2;
        }
        if (i == 21766) {
            class46.anIntArray773 = new int[]{29275};
            class46.name = "null";
            class46.width = 2;
            class46.length = 2;
        }
        if (i == 21767) {
            class46.anIntArray773 = new int[]{29276};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
        }
        if (i == 21768) {
            class46.anIntArray773 = new int[]{29271};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
        }
        if (i == 21769) {
            class46.anIntArray773 = new int[]{29272};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
        }
        if (i == 21770) {
            class46.anIntArray773 = new int[]{29273};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
        }
        if (i == 21772) {
            class46.anIntArray773 = new int[]{29399};
            class46.name = "Portcullis";
            class46.width = 3;
            class46.aBoolean764 = true;
            class46.itemActions = new String[]{"Exit", null, null, null, null};
        }
        if (i == 21773) {
            class46.anIntArray773 = new int[]{29280};
            class46.name = "Soul Devourer";
            class46.width = 5;
            class46.length = 5;
            class46.aBoolean762 = true;
            class46.anInt781 = 4517;
        }
        if (i == 21775) {
            class46.anIntArray773 = new int[]{29294};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21776) {
            class46.anIntArray773 = new int[]{29305};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21777) {
            class46.anIntArray773 = new int[]{29292};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21779) {
            class46.anIntArray773 = new int[]{29293};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21780) {
            class46.anIntArray773 = new int[]{29299};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21946) {
            class46.anIntArray773 = new int[]{29300};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 21947) {
            class46.anIntArray773 = new int[]{29296};
            class46.anIntArray776 = new int[]{2};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 22494) {
            class46.anIntArray773 = new int[]{29295};
            class46.anIntArray776 = new int[]{0};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 22495) {
            class46.anIntArray773 = new int[]{29289};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 23102) {
            class46.anIntArray773 = new int[]{29279};
            class46.name = "null";
            class46.width = 3;
            class46.length = 3;
            class46.aBoolean764 = true;
        }
        if (i == 23104) {
            class46.anIntArray773 = new int[]{29285};
            class46.name = "Iron Winch";
            class46.width = 2;
            class46.length = 2;
            class46.aBoolean762 = true;
            class46.itemActions = new String[]{"Turn", "Peek", null, null, null};
        }
        if (i == 23106) {
            class46.anIntArray773 = new int[]{29334};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 23107) {
            class46.anIntArray773 = new int[]{29335};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 23108) {
            class46.anIntArray773 = new int[]{29336};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 23109) {
            class46.anIntArray773 = new int[]{29331};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 23112) {
            class46.anIntArray773 = new int[]{29333};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 23610) {
            class46.anIntArray773 = new int[]{29332};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 26294) {
            class46.anIntArray773 = new int[]{29337};
            class46.anIntArray776 = new int[]{22};
            class46.name = "null";
            class46.aBoolean767 = false;
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
        }
        if (i == 26571) {
            class46.anIntArray773 = new int[]{29398};
            class46.name = "null";
            class46.width = 3;
            class46.aBoolean764 = true;
        }
        if (i == 26572) {
            class46.anIntArray773 = new int[]{1638};
            class46.anIntArray776 = new int[]{22};
            class46.name = "Blighted vine";
            class46.aBoolean762 = true;
            class46.aBoolean769 = true;
            class46.itemActions = new String[]{"Climb", null, null, null, null};
            class46.originalModelColors = new int[]{7585, 7465};
            class46.modifiedModelColors = new int[]{929, 931};
            class46.anInt772 = 136;
            class46.entryMask = 13;
            class46.aBoolean736 = true;
        }
        if (class46.anIntArray776 != null && class46.anIntArray776[0] == 22) {
            class46.hasActions = true;
            class46.aBoolean767 = false;
        }
        if (class46.modifiedModelColors != null) return class46;
        class46.modifiedModelColors = new int[1];
        class46.originalModelColors = new int[1];
        class46.modifiedModelColors[0] = 0;
        class46.originalModelColors[0] = 1;
        return class46;
    }

    /*
     * Unable to fully structure code
     */
    private void readValues(Stream stream) {
        block48 : {
            i = -1;
            block0 : do {
                if ((j = stream.readUnsignedByte()) == 0) {
                    if (i == -1) {
                        break;
                    }
                    break block48;
                }
                if (j == 1) {
                    k = stream.readUnsignedByte();
                    if (k <= 0) continue;
                    if (this.anIntArray773 == null || ObjectDefinition.lowMem) {
                        this.anIntArray776 = new int[k];
                        this.anIntArray773 = new int[k];
                        k1 = 0;
                        do {
                            if (k1 >= k) continue block0;
                            this.anIntArray773[k1] = stream.readUnsignedWord();
                            this.anIntArray776[k1] = stream.readUnsignedByte();
                            ++k1;
                        } while (true);
                    }
                    stream.currentOffset += k * 3;
                    continue;
                }
                if (j == 2) {
                    this.name = stream.readString();
                    continue;
                }
                if (j == 3) {
                    this.description = stream.readBytes();
                    continue;
                }
                if (j == 5) {
                    l = stream.readUnsignedByte();
                    if (l <= 0) continue;
                    if (this.anIntArray773 == null || ObjectDefinition.lowMem) {
                        this.anIntArray776 = null;
                        this.anIntArray773 = new int[l];
                        l1 = 0;
                        do {
                            if (l1 >= l) continue block0;
                            this.anIntArray773[l1] = stream.readUnsignedWord();
                            ++l1;
                        } while (true);
                    }
                    stream.currentOffset += l * 2;
                    continue;
                }
                if (j == 14) {
                    this.width = stream.readUnsignedByte();
                    continue;
                }
                if (j == 15) {
                    this.length = stream.readUnsignedByte();
                    continue;
                }
                if (j == 17) {
                    this.aBoolean767 = false;
                    continue;
                }
                if (j == 18) {
                    this.aBoolean757 = false;
                    continue;
                }
                if (j == 19) {
                    i = stream.readUnsignedByte();
                    if (i != 1) continue;
                    this.hasActions = true;
                    continue;
                }
                if (j == 21) {
                    this.aBoolean762 = true;
                    continue;
                }
                if (j == 22) {
                    this.aBoolean769 = false;
                    continue;
                }
                if (j == 23) {
                    this.aBoolean764 = true;
                    continue;
                }
                if (j == 24) {
                    this.anInt781 = stream.readUnsignedWord();
                    if (this.anInt781 != 65535) continue;
                    this.anInt781 = -1;
                    continue;
                }
                if (j == 28) {
                    this.anInt775 = stream.readUnsignedByte();
                    continue;
                }
                if (j == 29) {
                    this.aByte737 = stream.readSignedByte();
                    continue;
                }
                if (j == 39) {
                    this.aByte742 = stream.readSignedByte();
                    continue;
                }
                if (j >= 30 && j < 39) {
                    if (this.itemActions == null) {
                        this.itemActions = new String[10];
                    }
                    this.itemActions[j - 30] = stream.readString();
                    if (!this.itemActions[j - 30].equalsIgnoreCase("hidden")) continue;
                    this.itemActions[j - 30] = null;
                    continue;
                }
                if (j == 40) {
                    i1 = stream.readUnsignedByte();
                    this.modifiedModelColors = new int[i1];
                    this.originalModelColors = new int[i1];
                    i2 = 0;
                    do {
                        if (i2 >= i1) continue block0;
                        this.modifiedModelColors[i2] = stream.readUnsignedWord();
                        this.originalModelColors[i2] = stream.readUnsignedWord();
                        ++i2;
                    } while (true);
                }
                if (j == 60) {
                    this.anInt746 = stream.readUnsignedWord();
                    continue;
                }
                if (j == 62) {
                    this.aBoolean751 = true;
                    continue;
                }
                if (j == 64) {
                    this.aBoolean779 = false;
                    continue;
                }
                if (j == 65) {
                    this.anInt748 = stream.readUnsignedWord();
                    continue;
                }
                if (j == 66) {
                    this.anInt772 = stream.readUnsignedWord();
                    continue;
                }
                if (j == 67) {
                    this.anInt740 = stream.readUnsignedWord();
                    continue;
                }
                if (j == 68) {
                    this.anInt758 = stream.readUnsignedWord();
                    continue;
                }
                if (j == 69) {
                    this.entryMask = stream.readUnsignedByte();
                    continue;
                }
                if (j == 70) {
                    this.anInt738 = stream.readSignedWord();
                    continue;
                }
                if (j == 71) {
                    this.anInt745 = stream.readSignedWord();
                    continue;
                }
                if (j == 72) {
                    this.anInt783 = stream.readSignedWord();
                    continue;
                }
                if (j == 73) {
                    this.aBoolean736 = true;
                    continue;
                }
                if (j == 74) {
                    this.aBoolean766 = true;
                    continue;
                }
                if (j != 75) {
                    if (j != 77) continue;
                } else {
                    this.anInt760 = stream.readUnsignedByte();
                    continue;
                }
                this.anInt774 = stream.readUnsignedWord();
                if (this.anInt774 == 65535) {
                    this.anInt774 = -1;
                }
                this.anInt749 = stream.readUnsignedWord();
                if (this.anInt749 == 65535) {
                    this.anInt749 = -1;
                }
                j1 = stream.readUnsignedByte();
                this.childrenIDs = new int[j1 + 1];
                j2 = 0;
                do {
                    if (j2 <= j1) ** break;
                    continue block0;
                    this.childrenIDs[j2] = stream.readUnsignedWord();
                    if (this.childrenIDs[j2] == 65535) {
                        this.childrenIDs[j2] = -1;
                    }
                    ++j2;
                } while (true);
                break;
            } while (true);
            v0 = this.hasActions = this.anIntArray773 != null && (this.anIntArray776 == null || this.anIntArray776[0] == 10);
            if (this.itemActions != null) {
                this.hasActions = true;
            }
        }
        if (this.aBoolean766) {
            this.aBoolean767 = false;
            this.aBoolean757 = false;
        }
        if (this.anInt760 != -1) return;
        this.anInt760 = this.aBoolean767 != false ? 1 : 0;
    }

    private static boolean is728Object(int objectId) {
        for (int aOBJECTS_728 : OBJECTS_728) {
            if (objectId != aOBJECTS_728) continue;
            return true;
        }
        if (objectId > 57265) {
            if (objectId < 75000) return true;
        }
        if (objectId > 200000) return true;
        return false;
    }

    private static ObjectDefinition for728(int i) {
        for (int j = 0; j < 20; ++j) {
            if (ObjectDefinition.cache[j].type != i) continue;
            return cache[j];
        }
        cacheIndex = (cacheIndex + 1) % 20;
        ObjectDefinition definition = cache[cacheIndex];
        definition.type = i;
        definition.setDefaults();
        if (i > streamIndices728.length) {
            return definition;
        }
        ObjectDefinition.stream728.currentOffset = streamIndices728[i];
        try {
            definition.readValueLoop728(stream728);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        definition.revisionType = RevisionType.PRE_EOC;
        if (i >= 70755 && i <= 70771) {
            definition.anInt781 = 475;
        }
        if (i != 68444) return definition;
        definition.hasActions = true;
        definition.name = "Kiln";
        definition.itemActions = new String[]{"Enter", "QuickEnter", null, null, null};
        return definition;
    }

    private void readValueLoop728(Stream stream) {
        int opcode;
        while ((opcode = stream.getUnsignedByte()) != 0) {
            this.readValues728(stream, opcode);
        }
        return;
    }

    private void readValues728(Stream stream, int opcode) {
        int i;
        block102 : {
            block103 : {
                block32 : {
                    int length;
                    Hashtable aHashTable3014;
                    block101 : {
                        int length2;
                        int[][] preEocModels;
                        boolean lowMem_;
                        block30 : {
                            block100 : {
                                int anInt3302;
                                block99 : {
                                    block98 : {
                                        block97 : {
                                            block96 : {
                                                int aByte3847;
                                                block95 : {
                                                    block94 : {
                                                        block93 : {
                                                            block92 : {
                                                                block91 : {
                                                                    block90 : {
                                                                        block89 : {
                                                                            block88 : {
                                                                                int i_56_;
                                                                                block87 : {
                                                                                    int aByte3912;
                                                                                    block86 : {
                                                                                        block85 : {
                                                                                            block84 : {
                                                                                                int i_55_;
                                                                                                block83 : {
                                                                                                    int i_57_;
                                                                                                    block82 : {
                                                                                                        int anInt3844;
                                                                                                        block81 : {
                                                                                                            block80 : {
                                                                                                                block79 : {
                                                                                                                    block78 : {
                                                                                                                        block77 : {
                                                                                                                            block76 : {
                                                                                                                                block75 : {
                                                                                                                                    block74 : {
                                                                                                                                        block73 : {
                                                                                                                                            block72 : {
                                                                                                                                                block71 : {
                                                                                                                                                    block70 : {
                                                                                                                                                        block69 : {
                                                                                                                                                            block68 : {
                                                                                                                                                                block67 : {
                                                                                                                                                                    block66 : {
                                                                                                                                                                        block65 : {
                                                                                                                                                                            block64 : {
                                                                                                                                                                                block63 : {
                                                                                                                                                                                    block62 : {
                                                                                                                                                                                        block61 : {
                                                                                                                                                                                            block60 : {
                                                                                                                                                                                                block59 : {
                                                                                                                                                                                                    block58 : {
                                                                                                                                                                                                        block57 : {
                                                                                                                                                                                                            block56 : {
                                                                                                                                                                                                                block55 : {
                                                                                                                                                                                                                    block54 : {
                                                                                                                                                                                                                        block53 : {
                                                                                                                                                                                                                            block52 : {
                                                                                                                                                                                                                                block51 : {
                                                                                                                                                                                                                                    block50 : {
                                                                                                                                                                                                                                        block49 : {
                                                                                                                                                                                                                                            block48 : {
                                                                                                                                                                                                                                                block47 : {
                                                                                                                                                                                                                                                    block46 : {
                                                                                                                                                                                                                                                        block45 : {
                                                                                                                                                                                                                                                            block44 : {
                                                                                                                                                                                                                                                                block43 : {
                                                                                                                                                                                                                                                                    block42 : {
                                                                                                                                                                                                                                                                        block41 : {
                                                                                                                                                                                                                                                                            block40 : {
                                                                                                                                                                                                                                                                                block39 : {
                                                                                                                                                                                                                                                                                    block38 : {
                                                                                                                                                                                                                                                                                        block37 : {
                                                                                                                                                                                                                                                                                            block36 : {
                                                                                                                                                                                                                                                                                                block35 : {
                                                                                                                                                                                                                                                                                                    block34 : {
                                                                                                                                                                                                                                                                                                        block33 : {
                                                                                                                                                                                                                                                                                                            block31 : {
                                                                                                                                                                                                                                                                                                                block29 : {
                                                                                                                                                                                                                                                                                                                    i = -1;
                                                                                                                                                                                                                                                                                                                    if (opcode != 1 && opcode != 5) break block29;
                                                                                                                                                                                                                                                                                                                    lowMem_ = lowMem;
                                                                                                                                                                                                                                                                                                                    if (opcode == 5 && lowMem_) {
                                                                                                                                                                                                                                                                                                                        this.skip(stream);
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    length2 = stream.getUnsignedByte();
                                                                                                                                                                                                                                                                                                                    preEocModels = new int[length2][];
                                                                                                                                                                                                                                                                                                                    this.anIntArray776 = new int[length2];
                                                                                                                                                                                                                                                                                                                    break block30;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                if (opcode != 2) break block31;
                                                                                                                                                                                                                                                                                                                this.name = stream.readNewString();
                                                                                                                                                                                                                                                                                                                break block32;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            if (opcode != 14) break block33;
                                                                                                                                                                                                                                                                                                            this.width = stream.getUnsignedByte();
                                                                                                                                                                                                                                                                                                            break block32;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        if (opcode != 15) break block34;
                                                                                                                                                                                                                                                                                                        this.length = stream.getUnsignedByte();
                                                                                                                                                                                                                                                                                                        break block32;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    if (opcode != 17) break block35;
                                                                                                                                                                                                                                                                                                    this.aBoolean767 = false;
                                                                                                                                                                                                                                                                                                    break block32;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                if (opcode != 18) break block36;
                                                                                                                                                                                                                                                                                                this.aBoolean757 = false;
                                                                                                                                                                                                                                                                                                break block32;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            if (opcode != 19) break block37;
                                                                                                                                                                                                                                                                                            i = stream.getUnsignedByte();
                                                                                                                                                                                                                                                                                            break block32;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        if (opcode != 21) break block38;
                                                                                                                                                                                                                                                                                        this.aBoolean762 = true;
                                                                                                                                                                                                                                                                                        break block32;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (opcode != 22) break block39;
                                                                                                                                                                                                                                                                                    this.aBoolean769 = false;
                                                                                                                                                                                                                                                                                    break block32;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (opcode != 23) break block40;
                                                                                                                                                                                                                                                                                this.aBoolean764 = true;
                                                                                                                                                                                                                                                                                break block32;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            if (opcode != 24) break block41;
                                                                                                                                                                                                                                                                            int n = stream.readBigSmart();
                                                                                                                                                                                                                                                                            if (n != 65535) {
                                                                                                                                                                                                                                                                                this.anInt781 = n;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            break block32;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (opcode != 28) break block42;
                                                                                                                                                                                                                                                                        this.anInt775 = stream.getUnsignedByte();
                                                                                                                                                                                                                                                                        break block32;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (opcode != 29) break block43;
                                                                                                                                                                                                                                                                    this.aByte737 = stream.readSignedByte();
                                                                                                                                                                                                                                                                    break block32;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (opcode != 39) break block44;
                                                                                                                                                                                                                                                                this.aByte742 = (byte)(stream.readUnsignedByte() * 5);
                                                                                                                                                                                                                                                                break block32;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (opcode < 30 || opcode >= 35) break block45;
                                                                                                                                                                                                                                                            if (this.itemActions == null) {
                                                                                                                                                                                                                                                                this.itemActions = new String[10];
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            this.itemActions[opcode - 30] = stream.readNewString();
                                                                                                                                                                                                                                                            if (this.itemActions[opcode - 30].equalsIgnoreCase("hidden")) {
                                                                                                                                                                                                                                                                this.itemActions[opcode - 30] = null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break block32;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (opcode != 40) break block46;
                                                                                                                                                                                                                                                        int i_53_ = stream.getUnsignedByte();
                                                                                                                                                                                                                                                        this.originalModelColors = new int[i_53_];
                                                                                                                                                                                                                                                        this.modifiedModelColors = new int[i_53_];
                                                                                                                                                                                                                                                        for (int i_54_ = 0; i_53_ > i_54_; ++i_54_) {
                                                                                                                                                                                                                                                            this.originalModelColors[i_54_] = stream.readUnsignedWord();
                                                                                                                                                                                                                                                            this.modifiedModelColors[i_54_] = stream.readUnsignedWord();
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        break block32;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (opcode != 41) break block47;
                                                                                                                                                                                                                                                    int i_71_ = stream.getUnsignedByte();
                                                                                                                                                                                                                                                    short[] modifiedModelTextures = new short[i_71_];
                                                                                                                                                                                                                                                    short[] originalModelTextures = new short[i_71_];
                                                                                                                                                                                                                                                    for (int i_72_ = 0; i_71_ > i_72_; ++i_72_) {
                                                                                                                                                                                                                                                        modifiedModelTextures[i_72_] = (short)stream.readUnsignedWord();
                                                                                                                                                                                                                                                        originalModelTextures[i_72_] = (short)stream.readUnsignedWord();
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break block32;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (opcode != 42) break block48;
                                                                                                                                                                                                                                                int i_69_ = stream.getUnsignedByte();
                                                                                                                                                                                                                                                byte[] aByteArray3858 = new byte[i_69_];
                                                                                                                                                                                                                                                for (int i_70_ = 0; i_70_ < i_69_; ++i_70_) {
                                                                                                                                                                                                                                                    aByteArray3858[i_70_] = stream.getByte();
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                break block32;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (opcode != 62) break block49;
                                                                                                                                                                                                                                            this.aBoolean751 = true;
                                                                                                                                                                                                                                            break block32;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (opcode != 64) break block50;
                                                                                                                                                                                                                                        this.aBoolean779 = false;
                                                                                                                                                                                                                                        break block32;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (opcode != 65) break block51;
                                                                                                                                                                                                                                    this.anInt748 = stream.readUnsignedWord();
                                                                                                                                                                                                                                    break block32;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (opcode != 66) break block52;
                                                                                                                                                                                                                                this.anInt772 = stream.readUnsignedWord();
                                                                                                                                                                                                                                break block32;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (opcode != 67) break block53;
                                                                                                                                                                                                                            this.anInt740 = stream.readUnsignedWord();
                                                                                                                                                                                                                            break block32;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (opcode != 69) break block54;
                                                                                                                                                                                                                        this.entryMask = stream.getUnsignedByte();
                                                                                                                                                                                                                        break block32;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (opcode != 70) break block55;
                                                                                                                                                                                                                    this.anInt738 = stream.readSignedWord();
                                                                                                                                                                                                                    break block32;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (opcode != 71) break block56;
                                                                                                                                                                                                                this.anInt745 = stream.readSignedWord();
                                                                                                                                                                                                                break block32;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (opcode != 72) break block57;
                                                                                                                                                                                                            this.anInt783 = stream.readSignedWord();
                                                                                                                                                                                                            break block32;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (opcode != 73) break block58;
                                                                                                                                                                                                        this.aBoolean736 = true;
                                                                                                                                                                                                        break block32;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (opcode != 74) break block59;
                                                                                                                                                                                                    this.aBoolean766 = true;
                                                                                                                                                                                                    break block32;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (opcode != 75) break block60;
                                                                                                                                                                                                this.anInt760 = stream.getUnsignedByte();
                                                                                                                                                                                                break block32;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (opcode != 77 && opcode != 92) break block61;
                                                                                                                                                                                            this.anInt774 = stream.readUnsignedWord();
                                                                                                                                                                                            if (this.anInt774 == 65535) {
                                                                                                                                                                                                this.anInt774 = -1;
                                                                                                                                                                                            }
                                                                                                                                                                                            this.anInt749 = stream.readUnsignedWord();
                                                                                                                                                                                            if (this.anInt749 == 65535) {
                                                                                                                                                                                                this.anInt749 = -1;
                                                                                                                                                                                            }
                                                                                                                                                                                            int i_66_ = -1;
                                                                                                                                                                                            if (opcode == 92 && (i_66_ = stream.readBigSmart()) == 65535) {
                                                                                                                                                                                                i_66_ = -1;
                                                                                                                                                                                            }
                                                                                                                                                                                            int i_67_ = stream.getUnsignedByte();
                                                                                                                                                                                            this.childrenIDs = new int[i_67_ + 2];
                                                                                                                                                                                            for (int i_68_ = 0; i_67_ >= i_68_; ++i_68_) {
                                                                                                                                                                                                this.childrenIDs[i_68_] = stream.readBigSmart();
                                                                                                                                                                                                if (this.childrenIDs[i_68_] != 65535) continue;
                                                                                                                                                                                                this.childrenIDs[i_68_] = -1;
                                                                                                                                                                                            }
                                                                                                                                                                                            this.childrenIDs[i_67_ + 1] = i_66_;
                                                                                                                                                                                            break block32;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (opcode != 78) break block62;
                                                                                                                                                                                        int anInt3860 = stream.readUnsignedWord();
                                                                                                                                                                                        int i_67_ = stream.getUnsignedByte();
                                                                                                                                                                                        break block32;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (opcode != 79) break block63;
                                                                                                                                                                                    int anInt3900 = stream.readUnsignedWord();
                                                                                                                                                                                    int anInt3905 = stream.readUnsignedWord();
                                                                                                                                                                                    int anInt3904 = stream.getUnsignedByte();
                                                                                                                                                                                    int i_64_ = stream.getUnsignedByte();
                                                                                                                                                                                    int[] anIntArray3859 = new int[i_64_];
                                                                                                                                                                                    for (int i_65_ = 0; i_65_ < i_64_; ++i_65_) {
                                                                                                                                                                                        anIntArray3859[i_65_] = stream.readUnsignedWord();
                                                                                                                                                                                    }
                                                                                                                                                                                    break block32;
                                                                                                                                                                                }
                                                                                                                                                                                if (opcode != 81) break block64;
                                                                                                                                                                                aByte3912 = 2;
                                                                                                                                                                                int anInt3905 = 256 * stream.getUnsignedByte();
                                                                                                                                                                                break block32;
                                                                                                                                                                            }
                                                                                                                                                                            if (opcode != 82) break block65;
                                                                                                                                                                            aByte3912 = 1;
                                                                                                                                                                            break block32;
                                                                                                                                                                        }
                                                                                                                                                                        if (opcode != 88) break block66;
                                                                                                                                                                        aByte3912 = 0;
                                                                                                                                                                        break block32;
                                                                                                                                                                    }
                                                                                                                                                                    if (opcode != 89) break block67;
                                                                                                                                                                    aByte3912 = 0;
                                                                                                                                                                    break block32;
                                                                                                                                                                }
                                                                                                                                                                if (opcode != 90) break block68;
                                                                                                                                                                aByte3912 = 1;
                                                                                                                                                                break block32;
                                                                                                                                                            }
                                                                                                                                                            if (opcode != 91) break block69;
                                                                                                                                                            aByte3912 = 1;
                                                                                                                                                            break block32;
                                                                                                                                                        }
                                                                                                                                                        if (opcode != 93) break block70;
                                                                                                                                                        aByte3912 = 3;
                                                                                                                                                        int anInt3905 = stream.readUnsignedWord();
                                                                                                                                                        break block32;
                                                                                                                                                    }
                                                                                                                                                    if (opcode != 94) break block71;
                                                                                                                                                    aByte3912 = 4;
                                                                                                                                                    break block32;
                                                                                                                                                }
                                                                                                                                                if (opcode != 95) break block72;
                                                                                                                                                aByte3912 = 5;
                                                                                                                                                int anInt3905 = stream.readSignedWord();
                                                                                                                                                break block32;
                                                                                                                                            }
                                                                                                                                            if (opcode != 96) break block73;
                                                                                                                                            aByte3912 = 1;
                                                                                                                                            break block32;
                                                                                                                                        }
                                                                                                                                        if (opcode != 97) break block74;
                                                                                                                                        aByte3912 = 1;
                                                                                                                                        break block32;
                                                                                                                                    }
                                                                                                                                    if (opcode != 98) break block75;
                                                                                                                                    aByte3912 = 1;
                                                                                                                                    break block32;
                                                                                                                                }
                                                                                                                                if (opcode != 99) break block76;
                                                                                                                                int anInt3857 = stream.getUnsignedByte();
                                                                                                                                int anInt3905 = stream.readUnsignedWord();
                                                                                                                                break block32;
                                                                                                                            }
                                                                                                                            if (opcode != 100) break block77;
                                                                                                                            anInt3844 = stream.getUnsignedByte();
                                                                                                                            int anInt3905 = stream.readUnsignedWord();
                                                                                                                            break block32;
                                                                                                                        }
                                                                                                                        if (opcode != 101) break block78;
                                                                                                                        anInt3844 = stream.getUnsignedByte();
                                                                                                                        break block32;
                                                                                                                    }
                                                                                                                    if (opcode != 102) break block79;
                                                                                                                    anInt3844 = stream.readUnsignedWord();
                                                                                                                    break block32;
                                                                                                                }
                                                                                                                if (opcode != 103) break block80;
                                                                                                                anInt3844 = 0;
                                                                                                                break block32;
                                                                                                            }
                                                                                                            if (opcode != 104) break block81;
                                                                                                            anInt3844 = stream.getUnsignedByte();
                                                                                                            break block32;
                                                                                                        }
                                                                                                        if (opcode != 105) break block82;
                                                                                                        anInt3844 = 1;
                                                                                                        break block32;
                                                                                                    }
                                                                                                    if (opcode != 106) break block83;
                                                                                                    i_55_ = stream.getUnsignedByte();
                                                                                                    int[] anIntArray3869 = new int[i_55_];
                                                                                                    int[] anIntArray3833 = new int[i_55_];
                                                                                                    for (i_56_ = 0; i_56_ < i_55_; this.anInt781 += i_57_, ++i_56_) {
                                                                                                        anIntArray3833[i_56_] = stream.readBigSmart();
                                                                                                        anIntArray3869[i_56_] = i_57_ = stream.getUnsignedByte();
                                                                                                    }
                                                                                                    break block32;
                                                                                                }
                                                                                                if (opcode != 107) break block84;
                                                                                                i_55_ = stream.readUnsignedWord();
                                                                                                break block32;
                                                                                            }
                                                                                            if (opcode < 150 || opcode >= 155) break block85;
                                                                                            if (this.itemActions == null) {
                                                                                                this.itemActions = new String[5];
                                                                                            }
                                                                                            this.itemActions[opcode - 150] = stream.readNewString();
                                                                                            break block32;
                                                                                        }
                                                                                        if (opcode != 160) break block86;
                                                                                        int i_62_ = stream.getUnsignedByte();
                                                                                        int[] anIntArray3908 = new int[i_62_];
                                                                                        for (int i_63_ = 0; i_62_ > i_63_; ++i_63_) {
                                                                                            anIntArray3908[i_63_] = stream.readUnsignedWord();
                                                                                        }
                                                                                        break block32;
                                                                                    }
                                                                                    if (opcode != 162) break block87;
                                                                                    aByte3912 = 3;
                                                                                    int anIntArray3908 = stream.readInt();
                                                                                    break block32;
                                                                                }
                                                                                if (opcode != 163) break block88;
                                                                                aByte3847 = stream.readUnsignedByte();
                                                                                byte aByte3849 = (byte)stream.readUnsignedByte();
                                                                                byte aByte3837 = (byte)stream.readUnsignedByte();
                                                                                i_56_ = (byte)stream.readUnsignedByte();
                                                                                break block32;
                                                                            }
                                                                            if (opcode != 164) break block89;
                                                                            aByte3847 = stream.readSignedWord();
                                                                            break block32;
                                                                        }
                                                                        if (opcode != 165) break block90;
                                                                        aByte3847 = stream.readSignedWord();
                                                                        break block32;
                                                                    }
                                                                    if (opcode != 166) break block91;
                                                                    aByte3847 = stream.readSignedWord();
                                                                    break block32;
                                                                }
                                                                if (opcode != 167) break block92;
                                                                aByte3847 = stream.readUnsignedWord();
                                                                break block32;
                                                            }
                                                            if (opcode != 168) break block93;
                                                            aByte3847 = 1;
                                                            break block32;
                                                        }
                                                        if (opcode != 169) break block94;
                                                        aByte3847 = 1;
                                                        break block32;
                                                    }
                                                    if (opcode != 170) break block95;
                                                    aByte3847 = stream.readUnsignedSmart();
                                                    break block32;
                                                }
                                                if (opcode != 171) break block96;
                                                aByte3847 = stream.readUnsignedSmart();
                                                break block32;
                                            }
                                            if (opcode != 173) break block97;
                                            anInt3302 = stream.readUnsignedWord();
                                            int aByte3849 = stream.readUnsignedWord();
                                            break block32;
                                        }
                                        if (opcode != 177) break block98;
                                        anInt3302 = 1;
                                        break block32;
                                    }
                                    if (opcode != 178) break block99;
                                    anInt3302 = stream.getUnsignedByte();
                                    break block32;
                                }
                                if (opcode != 189) break block100;
                                anInt3302 = 1;
                                break block32;
                            }
                            if (opcode != 249) break block32;
                            length = stream.getUnsignedByte();
                            aHashTable3014 = new Hashtable();
                            break block101;
                        }
                        for (int index = 0; index < length2; ++index) {
                            this.anIntArray776[index] = (byte)stream.readUnsignedByte();
                            int length22 = stream.getUnsignedByte();
                            preEocModels[index] = new int[length22];
                            for (int index2 = 0; length22 > index2; ++index2) {
                                preEocModels[index][index2] = stream.readBigSmart();
                            }
                        }
                        this.anIntArray773 = this.toModelArray(preEocModels);
                        if (opcode == 5 && !lowMem_) {
                            this.skip(stream);
                        }
                        break block32;
                    }
                    for (int i_60_ = 0; i_60_ < length; ++i_60_) {
                        boolean bool = stream.getUnsignedByte() == 1;
                        int i_61_ = stream.readMedium();
                        if (!bool) {
                            aHashTable3014.put((Object)i_61_, (Object)stream.readInt());
                            continue;
                        }
                        aHashTable3014.put((Object)i_61_, (Object)stream.readNewString());
                    }
                }
                if (i != -1) break block102;
                i = 0;
                if (this.anIntArray776 == null) break block103;
                if (this.anIntArray776.length == 1 && this.anIntArray776[0] == 10) {
                    i = 1;
                }
                if (i != 0) break block102;
            }
            if (this.itemActions != null) {
                for (int x = 0; x != 5; ++x) {
                    if (this.itemActions[x] == null) continue;
                    i = 1;
                    break;
                }
            }
        }
        if (this.anInt760 == -1) {
            this.anInt760 = this.aBoolean767 ? 0 : 1;
        }
        this.hasActions = i == 1;
    }

    private void skip(Stream buffer) {
        int count = buffer.getUnsignedByte();
        int i = 0;
        while (i != count) {
            ++buffer.currentOffset;
            int childCount = buffer.getUnsignedByte();
            buffer.currentOffset += childCount * 2;
            ++i;
        }
    }

    private void setDefaults() {
        this.anIntArray773 = null;
        this.anIntArray776 = null;
        this.name = null;
        this.description = null;
        this.modifiedModelColors = null;
        this.originalModelColors = null;
        this.width = 1;
        this.length = 1;
        this.aBoolean767 = true;
        this.aBoolean757 = true;
        this.hasActions = false;
        this.aBoolean762 = false;
        this.aBoolean769 = false;
        this.aBoolean764 = false;
        this.anInt781 = -1;
        this.anInt775 = 16;
        this.aByte737 = 0;
        this.aByte742 = 0;
        this.itemActions = null;
        this.anInt746 = -1;
        this.anInt758 = -1;
        this.aBoolean751 = false;
        this.aBoolean779 = true;
        this.anInt748 = 128;
        this.anInt772 = 128;
        this.anInt740 = 128;
        this.entryMask = 0;
        this.anInt738 = 0;
        this.anInt745 = 0;
        this.anInt783 = 0;
        this.aBoolean736 = false;
        this.aBoolean766 = false;
        this.anInt760 = -1;
        this.anInt774 = -1;
        this.anInt749 = -1;
        this.childrenIDs = null;
    }

    public void method574(OnDemandFetcher class42_sub1) {
        if (this.anIntArray773 == null) {
            return;
        }
        int[] arrn = this.anIntArray773;
        int n = arrn.length;
        int n2 = 0;
        while (n2 < n) {
            int anAnIntArray773 = arrn[n2];
            class42_sub1.method560(anAnIntArray773, this.revisionType.getModelCacheIndex() - 1);
            ++n2;
        }
    }

    public static void nullLoader() {
        mruNodes1 = null;
        mruNodes2 = null;
        cache = null;
        stream = null;
        streamIndices = null;
        stream728 = null;
        streamIndices728 = null;
    }

    public boolean method577(int i) {
        if (this.anIntArray776 == null) {
            if (this.anIntArray773 == null) {
                return true;
            }
            if (i != 10) {
                return true;
            }
            boolean flag1 = true;
            int[] arrn = this.anIntArray773;
            int n = arrn.length;
            int n2 = 0;
            while (n2 < n) {
                int anAnIntArray773 = arrn[n2];
                flag1 &= Model.isCached(anAnIntArray773, this.revisionType);
                ++n2;
            }
            return flag1;
        }
        int j = 0;
        while (j < this.anIntArray776.length) {
            if (this.anIntArray776[j] == i) {
                return Model.isCached(this.anIntArray773[j], this.revisionType);
            }
            ++j;
        }
        return true;
    }

    public Model method578(int i, int j, int k, int l, int i1, int j1, int k1) {
        Model model = this.method581(i, k1, j);
        if (model == null) {
            return null;
        }
        if (this.aBoolean762 || this.aBoolean769) {
            model = new Model(this.aBoolean762, this.aBoolean769, model);
        }
        if (!this.aBoolean762) return model;
        int l1 = (k + l + i1 + j1) / 4;
        int i2 = 0;
        do {
            if (i2 >= model.anInt1626) {
                model.method467();
                return model;
            }
            int j2 = model.anIntArray1627[i2];
            int k2 = model.anIntArray1629[i2];
            int l2 = k + (l - k) * (j2 + 64) / 128;
            int i3 = j1 + (i1 - j1) * (j2 + 64) / 128;
            int j3 = l2 + (i3 - l2) * (k2 + 64) / 128;
            int[] arrn = model.anIntArray1628;
            int n = i2++;
            arrn[n] = arrn[n] + (j3 - l1);
        } while (true);
    }

    public boolean method579() {
        if (this.anIntArray773 == null) {
            return true;
        }
        boolean flag1 = true;
        int[] arrn = this.anIntArray773;
        int n = arrn.length;
        int n2 = 0;
        while (n2 < n) {
            int anAnIntArray773 = arrn[n2];
            flag1 &= Model.isCached(anAnIntArray773, this.revisionType);
            ++n2;
        }
        return flag1;
    }

    public ObjectDefinition method580() {
        int i = -1;
        if (this.anInt774 != -1) {
            VarBit varBit = VarBit.cache[this.anInt774];
            int j = varBit.anInt648;
            int k = varBit.anInt649;
            int l = varBit.anInt650;
            int i1 = Client.anIntArray1232[l - k];
            i = ObjectDefinition.clientInstance.variousSettings[j] >> k & i1;
        } else if (this.anInt749 != -1) {
            i = ObjectDefinition.clientInstance.variousSettings[this.anInt749];
        }
        if (i < 0) return null;
        if (i >= this.childrenIDs.length) return null;
        if (this.childrenIDs[i] != -1) return ObjectDefinition.forID(this.childrenIDs[i]);
        return null;
    }

    public Model method581(int j, int k, int l) {
        long l1;
        Model model = null;
        if (this.anIntArray776 != null) {
            int j1;
            int i1;
            block27 : {
                i1 = -1;
                j1 = 0;
                while (j1 < this.anIntArray776.length) {
                    if (this.anIntArray776[j1] != j) {
                        ++j1;
                        continue;
                    }
                    break block27;
                }
                return null;
            }
            i1 = j1;
            if (i1 == -1) {
                return null;
            }
            l1 = (long)((this.type << 8) + (i1 << 3) + l) + ((long)(k + 1) << 32);
            Model model_2 = (Model)mruNodes2.insertFromCache(l1);
            if (model_2 != null) {
                return model_2;
            }
            if (i1 >= this.anIntArray773.length) {
                return null;
            }
            int j2 = this.anIntArray773[i1];
            boolean flag3 = this.aBoolean751 ^ l > 3;
            if (flag3) {
                j2 += 65536;
            }
            if ((model = (Model)mruNodes1.insertFromCache(j2)) == null) {
                model = Model.fetchModel(j2, this.revisionType);
                if (model == null) {
                    return null;
                }
                if (flag3) {
                    model.method477();
                }
                mruNodes1.removeFromCache(model, j2);
            }
        } else {
            if (j != 10) {
                return null;
            }
            l1 = (long)((this.type << 6) + l) + ((long)(k + 1) << 32);
            Model model_1 = (Model)mruNodes2.insertFromCache(l1);
            if (model_1 != null) {
                return model_1;
            }
            if (this.anIntArray773 == null) {
                return null;
            }
            boolean flag1 = this.aBoolean751 ^ l > 3;
            int k1 = this.anIntArray773.length;
            for (int i2 = 0; i2 < k1; ++i2) {
                int l2 = this.anIntArray773[i2];
                if (flag1) {
                    l2 += 65536;
                }
                if ((model = (Model)mruNodes1.insertFromCache(l2)) == null) {
                    model = Model.fetchModel(l2, this.revisionType);
                    if (model == null) {
                        return null;
                    }
                    if (flag1) {
                        model.method477();
                    }
                    mruNodes1.removeFromCache(model, l2);
                }
                if (k1 <= 1) continue;
                ObjectDefinition.aModelArray741s[i2] = model;
            }
            if (k1 > 1) {
                model = new Model(k1, aModelArray741s);
            }
        }
        boolean flag = this.anInt748 != 128 || this.anInt772 != 128 || this.anInt740 != 128;
        boolean flag2 = this.anInt738 != 0 || this.anInt745 != 0 || this.anInt783 != 0;
        Model model_3 = new Model(this.modifiedModelColors == null, FrameReader.method532(k), l == 0 && k == -1 && !flag && !flag2, model);
        if (k != -1) {
            model_3.method469();
            model_3.method470(k);
            model_3.anIntArrayArray1658 = null;
            model_3.anIntArrayArray1657 = null;
        }
        while (l-- > 0) {
            model_3.method473();
        }
        if (this.modifiedModelColors != null) {
            for (int k2 = 0; k2 < this.modifiedModelColors.length; ++k2) {
                model_3.reColor(this.modifiedModelColors[k2], this.originalModelColors[k2]);
            }
        }
        if (flag) {
            model_3.method478(this.anInt748, this.anInt740, this.anInt772);
        }
        if (flag2) {
            model_3.method475(this.anInt738, this.anInt745, this.anInt783);
        }
        model_3.light(74, 1000, -90, -580, -90, !this.aBoolean769);
        if (this.anInt760 == 1) {
            model_3.anInt1654 = model_3.modelHeight;
        }
        mruNodes2.removeFromCache(model_3, l1);
        return model_3;
    }

    static {
        aModelArray741s = new Model[4];
        mruNodes2 = new MRUNodes(30);
        cache = new ObjectDefinition[20];
        mruNodes1 = new MRUNodes(500);
    }
}


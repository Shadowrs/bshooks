/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 */
package com.imagineps.client.definition;

import com.imagineps.client.Client;
import com.imagineps.client.FileOperations;
import com.imagineps.client.MRUNodes;
import com.imagineps.client.Mobile;
import com.imagineps.client.Model;
import com.imagineps.client.NPC;
import com.imagineps.client.NodeSub;
import com.imagineps.client.PlayerSettings;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.VarBit;
import com.imagineps.client.cache.CacheType;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.RevisionType;
import com.imagineps.client.definition.custom.CustomNPCDefinitions;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class NPCDefinition {
    private static final int OSRS_NPC_OFFSET = 15000;
    private static final boolean[] printed = new boolean[40000];
    private static CustomNPCDefinitions customDefinitions = new CustomNPCDefinitions();
    public static Stream stream;
    public static int[] streamIndices;
    private static int npcAmount;
    private static Stream osrsStream;
    private static int[] osrsStreamIndices;
    private static int osrsNpcAmount;
    public static int anInt56;
    public static NPCDefinition[] cache;
    public static Client clientInstance;
    public static MRUNodes mruNodes;
    public RevisionType revisionType = RevisionType.DEFAULT;
    NPC npc;
    Mobile entity;
    public int anInt55 = -1;
    public int anInt57 = -1;
    public int anInt58 = -1;
    public int anInt59 = -1;
    public int combatLevel = -1;
    public final int anInt64 = 1834;
    public String name;
    public String[] actions;
    public int walkAnim = -1;
    public byte boundDim = 1;
    public int[] modifiedModelColors;
    public int[] chatModelArray;
    public int headIcon = -1;
    public int[] originalModelColors;
    public int standAnim = -1;
    public long type = -1L;
    public int anInt79 = 32;
    public int anInt83 = -1;
    public boolean aBoolean84 = true;
    public int anInt85;
    public int scaleY = 128;
    public boolean aBoolean87 = true;
    public int[] childrenIDs;
    public byte[] description;
    public int scaleXZ = 128;
    public int anInt92;
    public boolean aBoolean93 = false;
    public int[] models;

    public static Collection<NPCDefinition> findNPCs(String name) {
        ArrayList toReturn = new ArrayList();
        int npcId = 0;
        while (npcId < npcAmount) {
            NPCDefinition npcDef = NPCDefinition.forID(npcId);
            if (npcDef != null && npcDef.name != null && !npcDef.name.isEmpty() && npcDef.name.toLowerCase().contains((CharSequence)name.toLowerCase())) {
                toReturn.add((Object)npcDef);
            }
            ++npcId;
        }
        return toReturn;
    }

    public static NPCDefinition forID(int npcId) {
        boolean cachingEnabled;
        if (!printed[npcId]) {
            NPCDefinition.printed[npcId] = true;
        }
        if (cachingEnabled = false) {
            for (int j = 0; j < 20; ++j) {
                if (NPCDefinition.cache[j].type != (long)npcId) continue;
                return cache[j];
            }
        }
        anInt56 = (anInt56 + 1) % 20;
        NPCDefinition entityDef = NPCDefinition.cache[NPCDefinition.anInt56] = new NPCDefinition();
        entityDef.type = npcId;
        if (npcId >= 15000 && npcId <= 15000 + osrsNpcAmount) {
            NPCDefinition.osrsStream.currentOffset = osrsStreamIndices[npcId - 15000];
            entityDef.readOSRSValues(osrsStream);
            entityDef.revisionType = RevisionType.OSRS;
            entityDef = customDefinitions.load(npcId, entityDef);
        } else {
            NPCDefinition.stream.currentOffset = streamIndices[npcId];
            entityDef.readValues(stream);
            entityDef = customDefinitions.load(npcId, entityDef);
        }
        switch (npcId) {
            case 11257: {
                entityDef.name = "[RAIDS] Medusa";
                entityDef.models = new int[]{94142};
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.combatLevel = 827;
                entityDef.boundDim = 1;
                entityDef.scaleY = 250;
                entityDef.scaleXZ = 250;
                entityDef.description = "Test".getBytes();
                return entityDef;
            }
            case 11256: {
                entityDef.name = "[RAIDS] Minotaur";
                entityDef.models = new int[]{94141};
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.combatLevel = 966;
                entityDef.boundDim = 1;
                entityDef.standAnim = 4264;
                entityDef.walkAnim = 4263;
                entityDef.scaleY = 350;
                entityDef.scaleXZ = 350;
                entityDef.description = "Test".getBytes();
                return entityDef;
            }
            case 11255: {
                entityDef.name = "Hailstorm Dragon";
                entityDef.models = new int[]{94140};
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.combatLevel = 1200;
                entityDef.boundDim = 1;
                entityDef.standAnim = 12248;
                entityDef.walkAnim = 12246;
                entityDef.scaleY = 350;
                entityDef.scaleXZ = 350;
                entityDef.description = "Test".getBytes();
                return entityDef;
            }
            case 7136: {
                entityDef.name = "Mini Bork";
                entityDef.models = new int[]{32351, 32352};
                entityDef.description = "Smaller Bork".getBytes();
                entityDef.combatLevel = 150;
                entityDef.walkAnim = 8752;
                entityDef.standAnim = 8753;
                entityDef.scaleXZ = 70;
                entityDef.scaleY = 70;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                return entityDef;
            }
            case 6204: {
                entityDef.name = "Mini K'ril Tsutsaroth";
                entityDef.models = new int[]{51535, 27765, 27770};
                entityDef.description = "Smaller K'ril".getBytes();
                entityDef.combatLevel = 450;
                entityDef.walkAnim = 6942;
                entityDef.standAnim = 6943;
                entityDef.scaleXZ = 50;
                entityDef.scaleY = 50;
                return entityDef;
            }
            case 4582: {
                entityDef.name = "Pumpkin";
                entityDef.models = new int[]{46404};
                entityDef.description = "Halloween Event".getBytes();
                entityDef.combatLevel = 50;
                entityDef.walkAnim = 1311;
                entityDef.standAnim = 1310;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.scaleXZ = 128;
                entityDef.scaleY = 128;
                return entityDef;
            }
            case 4587: {
                entityDef.name = "Pumpkin Pet";
                entityDef.models = new int[]{46404};
                entityDef.description = "Halloween Event".getBytes();
                entityDef.combatLevel = 50;
                entityDef.walkAnim = 1311;
                entityDef.standAnim = 1310;
                entityDef.actions = new String[]{null, null, null, null, null};
                entityDef.scaleXZ = 50;
                entityDef.scaleY = 50;
                return entityDef;
            }
            case 4588: {
                entityDef.name = "Pumpkin Raid Boss";
                entityDef.models = new int[]{46404};
                entityDef.description = "Halloween Event".getBytes();
                entityDef.combatLevel = 500;
                entityDef.walkAnim = 1311;
                entityDef.standAnim = 1310;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.scaleXZ = 300;
                entityDef.scaleY = 300;
                return entityDef;
            }
            case 4583: {
                entityDef.name = "Scarecrow";
                entityDef.models = new int[]{46405};
                entityDef.description = "Halloween Event".getBytes();
                entityDef.actions = new String[]{"Talk to", null, "Exchange an Empty Basket", "Exchange Pumpkins", null};
                return entityDef;
            }
            case 4584: {
                entityDef.name = "Scarecrow";
                entityDef.models = new int[]{46406};
                entityDef.description = "Halloween Event".getBytes();
                entityDef.actions = new String[]{"Talk to", null, "Exchange an Empty Basket", "Exchange Pumpkins", null};
                return entityDef;
            }
            case 4585: {
                entityDef.name = "Scarecrow";
                entityDef.models = new int[]{46407};
                entityDef.description = "Halloween Event".getBytes();
                entityDef.actions = new String[]{"Talk to", null, "Exchange an Empty Basket", "Exchange Pumpkins", null};
                return entityDef;
            }
            case 4586: {
                entityDef.name = "Scarecrow";
                entityDef.models = new int[]{46408};
                entityDef.description = "Halloween Event".getBytes();
                entityDef.actions = new String[]{"Talk to", null, "Exchange an Empty Basket", "Exchange Pumpkins", null};
                return entityDef;
            }
            case 6528: {
                entityDef.name = "Auctioneer";
                entityDef.actions = new String[]{"Show Auctions", null, "New Auction", "Collect Items", null};
                return entityDef;
            }
            case 597: {
                entityDef.name = "Exclusive Shop";
                entityDef.actions = new String[]{"Open Shop", null, null, null, null};
                return entityDef;
            }
            case 9850: {
                entityDef.name = "Elite Guide";
                entityDef.actions = new String[]{"Check Eligibility", null, null, null, null};
                entityDef.combatLevel = 20000;
                entityDef.description = "Elite Guide".getBytes();
                return entityDef;
            }
            case 11250: {
                entityDef.name = "Zeus";
                entityDef.models = new int[]{57393};
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.combatLevel = 1200;
                entityDef.boundDim = 1;
                entityDef.standAnim = 808;
                entityDef.walkAnim = 6395;
                entityDef.scaleY = 250;
                entityDef.scaleXZ = 250;
                entityDef.description = "Zeus".getBytes();
                return entityDef;
            }
            case 11249: {
                entityDef.name = "Zeus";
                entityDef.models = new int[]{57394};
                entityDef.actions = new String[]{null, "Speak To", null, null, null};
                entityDef.combatLevel = 1200;
                entityDef.boundDim = 1;
                entityDef.standAnim = 6393;
                entityDef.walkAnim = 6395;
                entityDef.scaleY = 300;
                entityDef.scaleXZ = 300;
                entityDef.description = "Zeus".getBytes();
                return entityDef;
            }
            case 11251: {
                entityDef.name = "Imagine Dragon";
                entityDef.description = "Imagine Dragon".getBytes();
                entityDef.combatLevel = 2017;
                entityDef.standAnim = 12248;
                entityDef.walkAnim = 12246;
                entityDef.models = new int[]{91692};
                entityDef.scaleY = 225;
                entityDef.scaleXZ = 225;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                return entityDef;
            }
            case 11252: {
                entityDef.actions = new String[5];
                entityDef.actions[1] = "Attack";
                entityDef.combatLevel = 1000;
                entityDef.name = "Hulk";
                entityDef.models = new int[]{94259};
                entityDef.standAnim = 808;
                entityDef.walkAnim = 819;
                entityDef.scaleY = 225;
                entityDef.scaleXZ = 225;
                return entityDef;
            }
            case 11253: {
                entityDef.actions = new String[5];
                entityDef.actions[1] = "Attack";
                entityDef.combatLevel = 1000;
                entityDef.name = "Thanos";
                entityDef.models = new int[]{94277};
                entityDef.standAnim = 808;
                entityDef.walkAnim = 819;
                entityDef.scaleY = 225;
                entityDef.scaleXZ = 225;
                return entityDef;
            }
            case 11254: {
                entityDef.actions = new String[5];
                entityDef.actions[1] = "Attack";
                entityDef.combatLevel = 1000;
                entityDef.name = "Ultron";
                entityDef.models = new int[]{94278};
                entityDef.standAnim = 808;
                entityDef.walkAnim = 819;
                entityDef.scaleY = 225;
                entityDef.scaleXZ = 225;
                return entityDef;
            }
            case 11248: {
                entityDef.name = "Diablo";
                entityDef.models = new int[]{50025};
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.combatLevel = 300;
                entityDef.boundDim = (byte)3;
                entityDef.standAnim = 10921;
                entityDef.walkAnim = 10920;
                entityDef.description = "Diablo".getBytes();
                return entityDef;
            }
            case 11245: {
                entityDef.name = "Queen Black Dragon";
                entityDef.models = new int[]{70260, 69766};
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.combatLevel = 2100;
                entityDef.boundDim = (byte)5;
                entityDef.standAnim = 16715;
                entityDef.walkAnim = 32767;
                entityDef.anInt79 = 0;
                entityDef.description = "Worms burrow through her rotting flesh.".getBytes();
                return entityDef;
            }
            case 11246: {
                entityDef.name = "Queen Black Dragon";
                entityDef.models = new int[]{34060, 69766};
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.combatLevel = 2100;
                entityDef.boundDim = (byte)5;
                entityDef.standAnim = 16715;
                entityDef.walkAnim = 32767;
                entityDef.anInt79 = 0;
                entityDef.description = "Worms burrow through her rotting flesh.".getBytes();
                return entityDef;
            }
            case 11247: {
                entityDef.name = "Queen Black Dragon";
                entityDef.models = new int[]{70268, 69766};
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.combatLevel = 2100;
                entityDef.boundDim = (byte)5;
                entityDef.standAnim = 16715;
                entityDef.walkAnim = 32767;
                entityDef.anInt79 = 0;
                entityDef.description = "Worms burrow through her rotting flesh.".getBytes();
                return entityDef;
            }
            case 11258: {
                entityDef.name = "Callisto";
                entityDef.models = new int[]{28298, 18886};
                entityDef.boundDim = (byte)5;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 4919;
                entityDef.walkAnim = 4923;
                entityDef.combatLevel = 470;
                entityDef.scaleXZ = 128;
                entityDef.scaleY = 128;
                entityDef.anInt85 = 25;
                return entityDef;
            }
            case 7238: 
            case 10145: {
                entityDef.walkAnim = 13015;
                entityDef.standAnim = -1;
                return entityDef;
            }
            case 11259: {
                entityDef.name = "Venenatis";
                entityDef.models = new int[]{28294, 28295};
                entityDef.boundDim = (byte)4;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 5318;
                entityDef.walkAnim = 5317;
                entityDef.combatLevel = 464;
                entityDef.scaleXZ = 190;
                entityDef.scaleY = 190;
                return entityDef;
            }
            case 11260: {
                entityDef.name = "Vet'ion";
                entityDef.models = new int[]{28299};
                entityDef.boundDim = (byte)3;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 5505;
                entityDef.walkAnim = 5497;
                entityDef.combatLevel = 454;
                entityDef.scaleXZ = 190;
                entityDef.scaleY = 190;
                return entityDef;
            }
            case 11261: {
                entityDef.name = "Vet'ion Reborn";
                entityDef.models = new int[]{28299};
                entityDef.originalModelColors = new int[]{55184, 54926, 54693, 55190, 54571, 54804};
                entityDef.modifiedModelColors = new int[]{4019, 4007, 4007, 3879, 4023, 2966};
                entityDef.boundDim = (byte)3;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 5505;
                entityDef.walkAnim = 5497;
                entityDef.combatLevel = 454;
                entityDef.scaleXZ = 190;
                entityDef.scaleY = 190;
                return entityDef;
            }
            case 11262: {
                entityDef.name = "Skeleton Hellhound";
                entityDef.models = new int[]{26262};
                entityDef.boundDim = (byte)2;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 6580;
                entityDef.walkAnim = 6577;
                entityDef.combatLevel = 214;
                entityDef.scaleXZ = 128;
                entityDef.scaleY = 128;
                return entityDef;
            }
            case 11263: {
                entityDef.name = "Greater Skeleton Hellhound";
                entityDef.models = new int[]{26262};
                entityDef.boundDim = (byte)2;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 6580;
                entityDef.walkAnim = 6577;
                entityDef.combatLevel = 281;
                entityDef.scaleXZ = 128;
                entityDef.scaleY = 128;
                return entityDef;
            }
            case 11264: {
                entityDef.name = "Scorpia";
                entityDef.models = new int[]{28293};
                entityDef.boundDim = (byte)5;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 6252;
                entityDef.walkAnim = 6262;
                entityDef.combatLevel = 225;
                entityDef.scaleXZ = 210;
                entityDef.scaleY = 210;
                return entityDef;
            }
            case 11265: {
                entityDef.name = "Scorpia's offspring";
                entityDef.models = new int[]{24612};
                entityDef.originalModelColors = new int[]{142, 4525, 4636, 4884, 4645};
                entityDef.modifiedModelColors = new int[]{28, 16, 16, 16, 16};
                entityDef.boundDim = 1;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 6258;
                entityDef.walkAnim = 6257;
                entityDef.combatLevel = 15;
                entityDef.scaleXZ = 104;
                entityDef.scaleY = 104;
                return entityDef;
            }
            case 11266: {
                entityDef.name = "Scorpia's guardian";
                entityDef.models = new int[]{24612};
                entityDef.originalModelColors = new int[]{142, 4525, 4636, 4884, 4645};
                entityDef.modifiedModelColors = new int[]{54437, 16, 54430, 54550, 54317};
                entityDef.boundDim = 1;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 6258;
                entityDef.walkAnim = 6257;
                entityDef.combatLevel = 47;
                entityDef.scaleXZ = 160;
                entityDef.scaleY = 160;
                return entityDef;
            }
            case 11267: {
                entityDef.name = "Crazy archaeologist";
                entityDef.models = new int[]{6364, 203, 250, 292, 3707, 173, 176, 254, 185, 556};
                entityDef.originalModelColors = new int[]{43072, 3131, 3127, 3123, 25238, 5018};
                entityDef.modifiedModelColors = new int[]{12, 10388, 10514, 10638, 10388, 35619};
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 2770;
                entityDef.walkAnim = 819;
                entityDef.combatLevel = 204;
                entityDef.scaleXZ = 140;
                entityDef.scaleY = 140;
                entityDef.anInt85 = 35;
                entityDef.anInt92 = 175;
                return entityDef;
            }
            case 11268: {
                entityDef.name = "Chaos Fanatic";
                entityDef.models = new int[]{10981, 247, 9622, 170, 176, 274, 185, 6232};
                entityDef.originalModelColors = new int[]{6798, 8741, 25238, 9096, 7281};
                entityDef.modifiedModelColors = new int[]{10349, 10349, 10349, 54164, 10324};
                entityDef.boundDim = 1;
                entityDef.actions = new String[]{null, "Attack", null, null, null};
                entityDef.standAnim = 2770;
                entityDef.walkAnim = 2769;
                entityDef.combatLevel = 202;
                entityDef.scaleXZ = 128;
                entityDef.scaleY = 128;
                return entityDef;
            }
            case 11269: {
                entityDef.name = "Miniature chaotic clouds";
                entityDef.models = new int[]{28256};
                entityDef.boundDim = 1;
                entityDef.actions = new String[]{null, null, null, null, null};
                entityDef.standAnim = 3144;
                entityDef.walkAnim = 3145;
                entityDef.combatLevel = 0;
                entityDef.scaleXZ = 128;
                entityDef.scaleY = 128;
            }
        }
        return entityDef;
    }

    public static void nullLoader() {
        mruNodes = null;
        streamIndices = null;
        cache = null;
        stream = null;
    }

    public static void unpackConfig(StreamLoader streamLoader) {
        stream = new Stream(streamLoader.getDataForName("npc.dat"));
        Stream stream2 = new Stream(streamLoader.getDataForName("npc.idx"));
        npcAmount = stream2.readUnsignedWord();
        streamIndices = new int[npcAmount + 50];
        int i = 2;
        for (int j = 0; j < npcAmount; i += stream2.readUnsignedWord(), ++j) {
            NPCDefinition.streamIndices[j] = i;
        }
        osrsStream = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "/osrs/npc.dat"));
        Stream osrsStream2 = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "/osrs/npc.idx"));
        osrsNpcAmount = osrsStream2.readUnsignedWord();
        osrsStreamIndices = new int[osrsNpcAmount];
        i = 2;
        for (int j = 0; j < osrsNpcAmount; i += osrsStream2.readUnsignedWord(), ++j) {
            NPCDefinition.osrsStreamIndices[j] = i;
        }
        System.out.println("Total regular NPCs: " + npcAmount + ", OSRS NPCs: " + osrsNpcAmount);
        int index = 0;
        do {
            if (index >= cache.length) {
                System.out.println("Models: " + Arrays.toString((int[])NPCDefinition.forID((int)6528).models));
                return;
            }
            NPCDefinition.cache[index] = new NPCDefinition();
            ++index;
        } while (true);
    }

    public Model getChatHeadModel() {
        if (this.childrenIDs != null) {
            NPCDefinition entityDef = this.method161();
            if (entityDef != null) return entityDef.getChatHeadModel();
            return null;
        }
        if (this.chatModelArray == null) {
            return null;
        }
        boolean flag1 = false;
        for (int i = 0; i < this.chatModelArray.length; ++i) {
            if (Model.isCached(this.chatModelArray[i], this.revisionType)) continue;
            flag1 = true;
        }
        Model[] models = new Model[this.chatModelArray.length];
        for (int j = 0; j < this.chatModelArray.length; ++j) {
            models[j] = Model.fetchModel(this.chatModelArray[j], this.revisionType);
        }
        Model model = models.length == 1 ? models[0] : new Model(models.length, models);
        if (this.originalModelColors == null) return model;
        int k = 0;
        while (k < this.originalModelColors.length) {
            model.reColor(this.originalModelColors[k], this.modifiedModelColors[k]);
            ++k;
        }
        return model;
    }

    public NPCDefinition method161() {
        try {
            int j = -1;
            if (this.anInt57 != -1) {
                VarBit varBit = VarBit.cache[this.anInt57];
                int k = varBit.anInt648;
                int l = varBit.anInt649;
                int i1 = varBit.anInt650;
                int j1 = Client.anIntArray1232[i1 - l];
                j = NPCDefinition.clientInstance.variousSettings[k] >> l & j1;
            } else if (this.anInt59 != -1) {
                j = NPCDefinition.clientInstance.variousSettings[this.anInt59];
            }
            if (j < 0) return null;
            if (j >= this.childrenIDs.length) return null;
            if (this.childrenIDs[j] != -1) return NPCDefinition.forID(this.childrenIDs[j]);
            return null;
        }
        catch (Exception e) {
            return null;
        }
    }

    public Model method164(int j, int currentAnim, int nextAnim, int currentCycle, int nextCycle, int[] ai) {
        if (this.childrenIDs != null) {
            NPCDefinition entityDef = this.method161();
            if (entityDef != null) return entityDef.method164(j, currentAnim, nextAnim, currentCycle, nextCycle, ai);
            return null;
        }
        Model model = null;
        if (this.revisionType == RevisionType.DEFAULT) {
            model = (Model)mruNodes.insertFromCache(this.type);
        }
        if (model == null) {
            boolean flag = false;
            for (int i1 = 0; i1 < this.models.length; ++i1) {
                if (Model.isCached(this.models[i1], this.revisionType)) continue;
                flag = true;
            }
            Model[] aclass30_sub2_sub4_sub6s = new Model[this.models.length];
            for (int j1 = 0; j1 < this.models.length; ++j1) {
                aclass30_sub2_sub4_sub6s[j1] = Model.fetchModel(this.models[j1], this.revisionType);
            }
            model = aclass30_sub2_sub4_sub6s.length == 1 ? aclass30_sub2_sub4_sub6s[0] : new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
            if (this.originalModelColors != null) {
                for (int k1 = 0; k1 < this.originalModelColors.length; ++k1) {
                    model.reColor(this.originalModelColors[k1], this.modifiedModelColors[k1]);
                }
            }
            model.method469();
            model.light(64 + this.anInt85, 850 + this.anInt92, -30, -50, -30, true);
            if (this.revisionType == RevisionType.DEFAULT) {
                mruNodes.removeFromCache(model, this.type);
            }
        }
        Model model_1 = Model.EMPTY_MODEL;
        model_1.method464(model, FrameReader.method532(currentAnim) & FrameReader.method532(j));
        if (currentAnim != -1 && j != -1) {
            model_1.method471(ai, j, currentAnim, this.revisionType);
        } else if (currentAnim != -1) {
            if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) {
                model_1.interpolateFrames(currentAnim, nextAnim, nextCycle, currentCycle);
            } else {
                model_1.method470(currentAnim, this.revisionType);
            }
        }
        if (this.scaleXZ != 128 || this.scaleY != 128) {
            model_1.method478(this.scaleXZ, this.scaleXZ, this.scaleY);
        }
        model_1.method466();
        model_1.anIntArrayArray1658 = null;
        model_1.anIntArrayArray1657 = null;
        if (this.boundDim != 1) return model_1;
        model_1.aBoolean1659 = true;
        return model_1;
    }

    private void readOSRSValues(Stream stream) {
        int opcode;
        block0 : while ((opcode = stream.readUnsignedByte()) != 0) {
            if (opcode == 1) {
                int j = stream.readUnsignedByte();
                this.models = new int[j];
                int j1 = 0;
                do {
                    if (j1 >= j) continue block0;
                    this.models[j1] = stream.readUnsignedWord();
                    ++j1;
                } while (true);
            }
            if (opcode == 2) {
                this.name = stream.readString();
                continue;
            }
            if (opcode == 3) {
                this.description = stream.readBytes();
                continue;
            }
            if (opcode == 12) {
                this.boundDim = stream.readSignedByte();
                continue;
            }
            if (opcode == 13) {
                this.standAnim = stream.readUnsignedWord() + 20000;
                continue;
            }
            if (opcode == 14) {
                this.walkAnim = stream.readUnsignedWord() + 20000;
                continue;
            }
            if (opcode == 17) {
                this.walkAnim = stream.readUnsignedWord() + 20000;
                this.anInt58 = stream.readUnsignedWord() + 20000;
                this.anInt83 = stream.readUnsignedWord() + 20000;
                this.anInt55 = stream.readUnsignedWord() + 20000;
                continue;
            }
            if (opcode >= 30 && opcode < 40) {
                if (this.actions == null) {
                    this.actions = new String[5];
                }
                this.actions[opcode - 30] = stream.readString();
                if (!this.actions[opcode - 30].equalsIgnoreCase("hidden")) continue;
                this.actions[opcode - 30] = null;
                continue;
            }
            if (opcode == 40) {
                int k = stream.readUnsignedByte();
                this.originalModelColors = new int[k];
                this.modifiedModelColors = new int[k];
                int k1 = 0;
                do {
                    if (k1 >= k) continue block0;
                    this.originalModelColors[k1] = stream.readUnsignedWord();
                    this.modifiedModelColors[k1] = stream.readUnsignedWord();
                    ++k1;
                } while (true);
            }
            if (opcode == 60) {
                int l = stream.readUnsignedByte();
                this.chatModelArray = new int[l];
                int l1 = 0;
                do {
                    if (l1 >= l) continue block0;
                    this.chatModelArray[l1] = stream.readUnsignedWord();
                    ++l1;
                } while (true);
            }
            if (opcode == 93) {
                this.aBoolean87 = false;
                continue;
            }
            if (opcode == 95) {
                this.combatLevel = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 97) {
                this.scaleXZ = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 98) {
                this.scaleY = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 99) {
                this.aBoolean93 = true;
                continue;
            }
            if (opcode == 100) {
                this.anInt85 = stream.readSignedByte();
                continue;
            }
            if (opcode == 101) {
                this.anInt92 = stream.readSignedByte();
                continue;
            }
            if (opcode == 102) {
                this.headIcon = stream.readSignedByte();
                continue;
            }
            if (opcode == 103) {
                this.anInt79 = stream.readSignedByte();
                continue;
            }
            if (opcode == 106) {
                this.anInt57 = stream.readUnsignedWord();
                if (this.anInt57 == 65535) {
                    this.anInt57 = -1;
                }
                this.anInt59 = stream.readUnsignedWord();
                if (this.anInt59 == 65535) {
                    this.anInt59 = -1;
                }
                int i1 = stream.readUnsignedByte();
                this.childrenIDs = new int[i1 + 1];
                int i2 = 0;
                do {
                    if (i2 > i1) continue block0;
                    this.childrenIDs[i2] = stream.readUnsignedWord();
                    if (this.childrenIDs[i2] == 65535) {
                        this.childrenIDs[i2] = -1;
                    }
                    ++i2;
                } while (true);
            }
            if (opcode != 107) continue;
            this.aBoolean84 = false;
        }
        return;
    }

    public void readValues(Stream stream) {
        int i;
        block0 : while ((i = stream.readUnsignedByte()) != 0) {
            if (i == 1) {
                int j = stream.readUnsignedByte();
                this.models = new int[j];
                int j1 = 0;
                do {
                    if (j1 >= j) continue block0;
                    this.models[j1] = stream.readUnsignedWord();
                    ++j1;
                } while (true);
            }
            if (i == 2) {
                this.name = stream.readString();
                continue;
            }
            if (i == 3) {
                this.description = stream.readBytes();
                continue;
            }
            if (i == 12) {
                this.boundDim = stream.readSignedByte();
                continue;
            }
            if (i == 13) {
                this.standAnim = stream.readUnsignedWord();
                continue;
            }
            if (i == 14) {
                this.walkAnim = stream.readUnsignedWord();
                continue;
            }
            if (i == 17) {
                this.walkAnim = stream.readUnsignedWord();
                this.anInt58 = stream.readUnsignedWord();
                this.anInt83 = stream.readUnsignedWord();
                this.anInt55 = stream.readUnsignedWord();
                if (this.walkAnim == 65535) {
                    this.walkAnim = -1;
                }
                if (this.anInt58 == 65535) {
                    this.anInt58 = -1;
                }
                if (this.anInt83 == 65535) {
                    this.anInt83 = -1;
                }
                if (this.anInt55 != 65535) continue;
                this.anInt55 = -1;
                continue;
            }
            if (i >= 30 && i < 40) {
                if (this.actions == null) {
                    this.actions = new String[5];
                }
                this.actions[i - 30] = stream.readString();
                if (!this.actions[i - 30].equalsIgnoreCase("hidden")) continue;
                this.actions[i - 30] = null;
                continue;
            }
            if (i == 40) {
                int k = stream.readUnsignedByte();
                this.modifiedModelColors = new int[k];
                this.originalModelColors = new int[k];
                int k1 = 0;
                do {
                    if (k1 >= k) continue block0;
                    this.originalModelColors[k1] = stream.readUnsignedWord();
                    this.modifiedModelColors[k1] = stream.readUnsignedWord();
                    ++k1;
                } while (true);
            }
            if (i == 60) {
                int l = stream.readUnsignedByte();
                this.chatModelArray = new int[l];
                int l1 = 0;
                do {
                    if (l1 >= l) continue block0;
                    this.chatModelArray[l1] = stream.readUnsignedWord();
                    ++l1;
                } while (true);
            }
            if (i == 90) {
                stream.readUnsignedWord();
                continue;
            }
            if (i == 91) {
                stream.readUnsignedWord();
                continue;
            }
            if (i == 92) {
                stream.readUnsignedWord();
                continue;
            }
            if (i == 93) {
                this.aBoolean87 = false;
                continue;
            }
            if (i == 95) {
                this.combatLevel = stream.readUnsignedWord();
                continue;
            }
            if (i == 97) {
                this.scaleXZ = stream.readUnsignedWord();
                continue;
            }
            if (i == 98) {
                this.scaleY = stream.readUnsignedWord();
                continue;
            }
            if (i == 99) {
                this.aBoolean93 = true;
                continue;
            }
            if (i == 100) {
                this.anInt85 = stream.readSignedByte();
                continue;
            }
            if (i == 101) {
                this.anInt92 = stream.readSignedByte() * 5;
                continue;
            }
            if (i == 102) {
                this.headIcon = stream.readUnsignedWord();
                continue;
            }
            if (i == 103) {
                this.anInt79 = stream.readUnsignedWord();
                continue;
            }
            if (i == 106) {
                this.anInt57 = stream.readUnsignedWord();
                if (this.anInt57 == 65535) {
                    this.anInt57 = -1;
                }
                this.anInt59 = stream.readUnsignedWord();
                if (this.anInt59 == 65535) {
                    this.anInt59 = -1;
                }
                int i1 = stream.readUnsignedByte();
                this.childrenIDs = new int[i1 + 1];
                int i2 = 0;
                do {
                    if (i2 > i1) continue block0;
                    this.childrenIDs[i2] = stream.readUnsignedWord();
                    if (this.childrenIDs[i2] == 65535) {
                        this.childrenIDs[i2] = -1;
                    }
                    ++i2;
                } while (true);
            }
            if (i != 107) continue;
            this.aBoolean84 = false;
        }
        return;
    }

    public void addColors(NPCDefinition def, int[] srcColors, int[] destColors) {
        def.modifiedModelColors = Arrays.copyOfRange((int[])def.modifiedModelColors, (int)0, (int)(def.modifiedModelColors.length + srcColors.length));
        def.originalModelColors = Arrays.copyOfRange((int[])def.originalModelColors, (int)0, (int)(def.originalModelColors.length + destColors.length));
        System.arraycopy((Object)srcColors, (int)0, (Object)def.modifiedModelColors, (int)(def.modifiedModelColors.length - srcColors.length), (int)srcColors.length);
        System.arraycopy((Object)destColors, (int)0, (Object)def.originalModelColors, (int)(def.originalModelColors.length - destColors.length), (int)destColors.length);
    }

    public void addModel(NPCDefinition def, int[] newModels) {
        def.models = Arrays.copyOfRange((int[])def.models, (int)0, (int)(def.models.length + newModels.length));
        System.arraycopy((Object)newModels, (int)0, (Object)def.models, (int)(def.models.length - newModels.length), (int)newModels.length);
    }

    public void copy(NPCDefinition def, int toCopy) {
        NPCDefinition copyOf = NPCDefinition.forID(toCopy);
        if (copyOf == null) {
            return;
        }
        def.anInt55 = copyOf.anInt55;
        def.anInt57 = copyOf.anInt57;
        def.anInt58 = copyOf.anInt58;
        def.anInt59 = copyOf.anInt59;
        def.combatLevel = copyOf.combatLevel;
        def.walkAnim = copyOf.walkAnim;
        def.boundDim = copyOf.boundDim;
        def.headIcon = copyOf.headIcon;
        def.standAnim = copyOf.standAnim;
        def.type = copyOf.type;
        def.anInt79 = copyOf.anInt79;
        def.anInt83 = copyOf.anInt83;
        def.aBoolean84 = copyOf.aBoolean84;
        def.scaleY = copyOf.scaleY;
        def.aBoolean87 = copyOf.aBoolean87;
        def.scaleXZ = copyOf.scaleXZ;
        def.aBoolean93 = copyOf.aBoolean93;
        def.revisionType = copyOf.revisionType;
        def.name = copyOf.name;
        def.modifiedModelColors = new int[copyOf.originalModelColors.length];
        def.originalModelColors = def.modifiedModelColors;
        def.models = new int[copyOf.models.length];
        def.actions = new String[copyOf.actions.length];
        def.originalModelColors = this.copyOfArray(copyOf.originalModelColors);
        def.modifiedModelColors = this.copyOfArray(copyOf.modifiedModelColors);
        def.actions = this.copyOfArray(copyOf.actions);
        int i = 0;
        while (i < copyOf.models.length) {
            def.models[i] = new Integer(copyOf.models[i]);
            ++i;
        }
    }

    public int[] copyOfArray(int[] source) {
        return Arrays.copyOf((int[])source, (int)source.length);
    }

    public String[] copyOfArray(String[] source) {
        return (String[])Arrays.copyOf((Object[])source, (int)source.length);
    }

    static {
        cache = new NPCDefinition[20];
        mruNodes = new MRUNodes(30);
    }
}


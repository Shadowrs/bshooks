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
 *  java.util.Arrays
 *  java.util.List
 */
package com.imagineps.client.definition;

import com.imagineps.client.FileOperations;
import com.imagineps.client.MRUNodes;
import com.imagineps.client.Model;
import com.imagineps.client.NodeSub;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.cache.CacheType;
import com.imagineps.client.definition.RevisionType;
import com.imagineps.client.definition.custom.ItemDef_2;
import com.imagineps.client.definition.custom.ItemDef_3;
import com.imagineps.client.definition.custom.ItemDef_4;
import com.imagineps.client.definition.custom.ItemDef_5;
import com.imagineps.client.definition.custom.ItemDef_6;
import com.imagineps.client.definition.custom.ItemDef_7;
import com.imagineps.client.definition.custom.ItemDef_8;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.Rasterizer;
import com.imagineps.client.graphics.Sprite;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public final class ItemDefinition {
    public static final int OSRS_ITEM_OFFSET = 25000;
    public static final List<Integer> CUSTOM_ITEM_MODELS = Arrays.asList((Object[])new Integer[]{540, 626, 627, 3294, 3295, 2903, 2902, 14114, 14115});
    public int rdc = 0;
    public int rdc2 = 0;
    public int rdc3 = 0;
    public int lendID;
    public int lendTemplateID;
    public static int ITEMAMOUNT = 18635;
    public byte aByte154;
    public int value;
    public int[] modifiedModelColors;
    public int id = -1;
    public static MRUNodes mruNodes1 = new MRUNodes(100);
    public static MRUNodes mruNodes2 = new MRUNodes(50);
    public int[] originalModelColors;
    public boolean membersObject;
    public int anInt162;
    public int certTemplateID;
    public int anInt164;
    public int femaleEquipt;
    public int anInt166;
    public int anInt167;
    public String[] groundActions;
    public int modelOffset1;
    public String name;
    public static ItemDefinition[] cache;
    public int anInt173;
    public int groundModelId;
    public int anInt175;
    public boolean stackable;
    public String description;
    public int certID;
    public static int cacheIndex;
    public int modelZoom;
    public static boolean isMembers;
    public int anInt184;
    public int anInt185;
    public int anInt188;
    public String[] itemActions;
    public int modelRotation1;
    public int anInt191;
    public int anInt192;
    public int[] stackIDs;
    public int modelOffset2;
    public int anInt196;
    public int anInt197;
    public int modelRotation2;
    public int maleEquipt;
    public int[] stackAmounts;
    public int team;
    public int anInt204;
    public byte aByte205;
    public RevisionType revisionType = RevisionType.DEFAULT;
    private static Stream stream;
    private static int[] streamIndices;
    private static Stream osrsStream;
    private static int[] osrsStreamIndices;
    public static int totalItems;
    public static int totalOsrsItems;

    public static void convertToNote(ItemDefinition def, int model, int noteId) {
        def.stackable = true;
        def.certID = model;
        def.certTemplateID = noteId;
    }

    public static void unpackConfig(StreamLoader streamLoader) {
        stream = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "obj.dat"));
        Stream stream = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "obj.idx"));
        totalItems = stream.readUnsignedWord();
        streamIndices = new int[24000];
        int i = 2;
        for (int j = 0; j < totalItems; i += stream.readUnsignedWord(), ++j) {
            ItemDefinition.streamIndices[j] = i;
        }
        osrsStream = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "/osrs/obj.dat"));
        Stream osrsStream = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "/osrs/obj.idx"));
        totalOsrsItems = osrsStream.readUnsignedWord();
        osrsStreamIndices = new int[totalOsrsItems];
        i = 2;
        for (int j = 0; j < totalOsrsItems; i += osrsStream.readUnsignedWord(), ++j) {
            ItemDefinition.osrsStreamIndices[j] = i;
        }
        cache = new ItemDefinition[10];
        int k = 0;
        do {
            if (k >= 10) {
                System.out.println("Total regular items: " + totalItems + ", osrs items: " + totalOsrsItems);
                return;
            }
            ItemDefinition.cache[k] = new ItemDefinition();
            ++k;
        } while (true);
    }

    public static ItemDefinition forID(int itemId) {
        boolean loadCached = true;
        if (loadCached) {
            for (int j = 0; j < 10; ++j) {
                if (ItemDefinition.cache[j].id != itemId) continue;
                return cache[j];
            }
        }
        cacheIndex = (cacheIndex + 1) % 10;
        ItemDefinition itemDef = cache[cacheIndex];
        itemDef.id = itemId;
        itemDef.setDefaults();
        if (itemId >= 25000 && itemId <= 25000 + totalOsrsItems) {
            if (itemId - 25000 >= osrsStreamIndices.length) {
                return null;
            }
            ItemDefinition.osrsStream.currentOffset = osrsStreamIndices[itemId - 25000];
            itemDef.readOSRSValues(osrsStream);
            itemDef.revisionType = RevisionType.OSRS;
        } else if (itemId > 0 && itemId <= 24999) {
            if (itemId >= streamIndices.length) {
                return null;
            }
            ItemDefinition.stream.currentOffset = streamIndices[itemId];
            itemDef.readValues(stream);
            itemDef.revisionType = RevisionType.DEFAULT;
            itemDef = ItemDef_2.itemDef(itemId, itemDef);
            itemDef = ItemDef_3.itemDef(itemId, itemDef);
            itemDef = ItemDef_4.itemDef(itemId, itemDef);
            itemDef = ItemDef_5.itemDef(itemId, itemDef);
            itemDef = ItemDef_6.itemDef(itemId, itemDef);
            itemDef = ItemDef_7.itemDef(itemId, itemDef);
            itemDef = ItemDef_8.itemDef(itemId, itemDef);
        }
        if (itemDef.certTemplateID != -1) {
            itemDef.toNote();
        }
        if (itemDef.lendTemplateID != -1) {
            itemDef.toLend();
        }
        if (isMembers) return itemDef;
        if (!itemDef.membersObject) return itemDef;
        itemDef.name = "Members Object";
        itemDef.description = "Login to a members' server to use this object.";
        itemDef.groundActions = null;
        itemDef.itemActions = null;
        itemDef.team = 0;
        return itemDef;
    }

    public static void nullLoader() {
        mruNodes2 = null;
        mruNodes1 = null;
        streamIndices = null;
        cache = null;
        stream = null;
        osrsStream = null;
        osrsStreamIndices = null;
    }

    public static String itemModels(int itemID) {
        int inv = ItemDefinition.forID((int)itemID).groundModelId;
        int male = ItemDefinition.forID((int)itemID).femaleEquipt;
        int female = ItemDefinition.forID((int)itemID).maleEquipt;
        int rotation1 = ItemDefinition.forID((int)itemID).modelRotation1;
        int rotation2 = ItemDefinition.forID((int)itemID).modelRotation2;
        String name = ItemDefinition.forID((int)itemID).name;
        return "<col=225>" + name + "</col>-[i:<col=800000000>" + inv + "</col>]-[m:<col=800000000>" + male + "</col>]-[f: <col=800000000>" + female + "</col>]-[r1: <col=800000000>" + rotation1 + "</col>]-[r2: <col=800000000>" + rotation2 + "</col>]";
    }

    public static String itemModels2(int itemID) {
        int offset1 = ItemDefinition.forID((int)itemID).modelOffset1;
        int offset2 = ItemDefinition.forID((int)itemID).modelOffset2;
        int zoom = ItemDefinition.forID((int)itemID).modelZoom;
        return "-[o1: <col=800000000>" + offset1 + "</col>]-[o2: <col=800000000>" + offset2 + "</col>]-[z: <col=800000000>" + zoom + "</col>]";
    }

    public static void itemModel() {
        try {
            int i = 0;
            while (i < 20793) {
                ItemDefinition itemDef = ItemDefinition.forID(i);
                System.out.println(i);
                byte[] abyte0121 = FileOperations.readFile("./items/" + itemDef.groundModelId + ".mdl");
                FileOperations.writeFile("./dumped/" + itemDef.groundModelId + ".mdl", abyte0121);
                ++i;
            }
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void toLend() {
        ItemDefinition itemDef = ItemDefinition.forID(this.lendTemplateID);
        this.itemActions = new String[5];
        this.groundModelId = itemDef.groundModelId;
        this.modelOffset1 = itemDef.modelOffset1;
        this.modelRotation2 = itemDef.modelRotation2;
        this.modelOffset2 = itemDef.modelOffset2;
        this.modelZoom = itemDef.modelZoom;
        this.modelRotation1 = itemDef.modelRotation1;
        this.anInt204 = itemDef.anInt204;
        this.value = 0;
        ItemDefinition itemDef_1 = ItemDefinition.forID(this.lendID);
        this.anInt166 = itemDef_1.anInt166;
        this.originalModelColors = itemDef_1.originalModelColors;
        this.anInt185 = itemDef_1.anInt185;
        this.maleEquipt = itemDef_1.maleEquipt;
        this.anInt173 = itemDef_1.anInt173;
        this.anInt175 = itemDef_1.anInt175;
        this.groundActions = itemDef_1.groundActions;
        this.femaleEquipt = itemDef_1.femaleEquipt;
        this.name = itemDef_1.name;
        this.anInt188 = itemDef_1.anInt188;
        this.membersObject = itemDef_1.membersObject;
        this.anInt197 = itemDef_1.anInt197;
        this.anInt164 = itemDef_1.anInt164;
        this.anInt162 = itemDef_1.anInt162;
        this.modifiedModelColors = itemDef_1.modifiedModelColors;
        this.team = itemDef_1.team;
        if (itemDef_1.itemActions != null) {
            for (int i_33_ = 0; i_33_ < 4; ++i_33_) {
                this.itemActions[i_33_] = itemDef_1.itemActions[i_33_];
            }
        }
        this.itemActions[4] = "Discard";
    }

    public void copy(int id) {
        ItemDefinition itemDef = ItemDefinition.forID(id);
        this.itemActions = new String[5];
        this.groundModelId = itemDef.groundModelId;
        this.modelOffset1 = itemDef.modelOffset1;
        this.modelRotation2 = itemDef.modelRotation2;
        this.modelOffset2 = itemDef.modelOffset2;
        this.modelZoom = itemDef.modelZoom;
        this.modelRotation1 = itemDef.modelRotation1;
        this.anInt204 = itemDef.anInt204;
        this.value = 0;
        ItemDefinition itemDef_1 = ItemDefinition.forID(id);
        this.anInt166 = itemDef_1.anInt166;
        this.originalModelColors = itemDef_1.originalModelColors;
        this.anInt185 = itemDef_1.anInt185;
        this.maleEquipt = itemDef_1.maleEquipt;
        this.anInt173 = itemDef_1.anInt173;
        this.anInt175 = itemDef_1.anInt175;
        this.groundActions = itemDef_1.groundActions;
        this.femaleEquipt = itemDef_1.femaleEquipt;
        this.name = itemDef_1.name;
        this.anInt188 = itemDef_1.anInt188;
        this.membersObject = itemDef_1.membersObject;
        this.anInt197 = itemDef_1.anInt197;
        this.anInt164 = itemDef_1.anInt164;
        this.anInt162 = itemDef_1.anInt162;
        this.modifiedModelColors = itemDef_1.modifiedModelColors;
        this.team = itemDef_1.team;
        this.itemActions = itemDef_1.itemActions;
    }

    public boolean method192(int j) {
        int k = this.anInt175;
        int l = this.anInt166;
        if (j == 1) {
            k = this.anInt197;
            l = this.anInt173;
        }
        if (k == -1) {
            return true;
        }
        boolean flag = true;
        if (!Model.isCached(k, this.revisionType)) {
            flag = false;
        }
        if (l == -1) return flag;
        if (Model.isCached(l, this.revisionType)) return flag;
        return false;
    }

    public Model method194(int j) {
        int k = this.anInt175;
        int l = this.anInt166;
        if (j == 1) {
            k = this.anInt197;
            l = this.anInt173;
        }
        if (k == -1) {
            return null;
        }
        Model model = Model.fetchModel(k, this.revisionType);
        if (l != -1) {
            Model model_1 = Model.fetchModel(l, this.revisionType);
            Model[] models = new Model[]{model, model_1};
            model = new Model(2, models);
        }
        if (this.modifiedModelColors != null) {
            for (int i1 = 0; i1 < this.modifiedModelColors.length; ++i1) {
                model.reColor(this.modifiedModelColors[i1], this.originalModelColors[i1]);
            }
        }
        if (this.rdc > 0) {
            model.method1337(this.rdc);
        }
        if (this.rdc2 != 0) {
            model.method1338(this.rdc2);
        }
        if (this.rdc3 == 0) return model;
        model.method1339(this.rdc3);
        return model;
    }

    public boolean modelsLoaded(int j) {
        int k = this.femaleEquipt;
        int l = this.anInt188;
        int i1 = this.anInt185;
        if (j == 1) {
            k = this.maleEquipt;
            l = this.anInt164;
            i1 = this.anInt162;
        }
        if (k == -1) {
            return true;
        }
        boolean flag = true;
        if (!Model.isCached(k, this.revisionType)) {
            flag = false;
        }
        if (l != -1 && !Model.isCached(l, this.revisionType)) {
            flag = false;
        }
        if (i1 == -1) return flag;
        if (Model.isCached(i1, this.revisionType)) return flag;
        return false;
    }

    public Model method196(int i) {
        int j = this.femaleEquipt;
        int k = this.anInt188;
        int l = this.anInt185;
        if (i == 1) {
            j = this.maleEquipt;
            k = this.anInt164;
            l = this.anInt162;
        }
        if (j == -1) {
            return null;
        }
        Model model = Model.fetchModel(j, this.revisionType);
        if (k != -1) {
            if (l != -1) {
                Model model_1 = Model.fetchModel(k, this.revisionType);
                Model model_3 = Model.fetchModel(l, this.revisionType);
                Model[] model_1s = new Model[]{model, model_1, model_3};
                model = new Model(3, model_1s);
            } else {
                Model model_2 = Model.fetchModel(k, this.revisionType);
                Model[] models = new Model[]{model, model_2};
                model = new Model(2, models);
            }
        }
        if (i == 0 && this.aByte205 != 0) {
            model.method475(0, this.aByte205, 0);
        }
        if (i == 1 && this.aByte154 != 0) {
            model.method475(0, this.aByte154, 0);
        }
        if (this.modifiedModelColors != null) {
            for (int i1 = 0; i1 < this.modifiedModelColors.length; ++i1) {
                model.reColor(this.modifiedModelColors[i1], this.originalModelColors[i1]);
            }
        }
        if (this.rdc > 0) {
            model.method1337(this.rdc);
        }
        if (this.rdc2 != 0) {
            model.method1338(this.rdc2);
        }
        if (this.rdc3 == 0) return model;
        model.method1339(this.rdc3);
        return model;
    }

    private void setDefaults() {
        this.groundModelId = 0;
        this.name = null;
        this.description = null;
        this.originalModelColors = null;
        this.modifiedModelColors = null;
        this.modelZoom = 2000;
        this.modelRotation1 = 0;
        this.modelRotation2 = 0;
        this.anInt204 = 0;
        this.modelOffset1 = 0;
        this.modelOffset2 = 0;
        this.stackable = false;
        this.value = 1;
        this.membersObject = false;
        this.groundActions = null;
        this.itemActions = null;
        this.lendID = -1;
        this.lendTemplateID = -1;
        this.femaleEquipt = -1;
        this.anInt188 = -1;
        this.aByte205 = 0;
        this.maleEquipt = -1;
        this.anInt164 = -1;
        this.aByte154 = 0;
        this.anInt185 = -1;
        this.anInt162 = -1;
        this.anInt175 = -1;
        this.anInt166 = -1;
        this.anInt197 = -1;
        this.anInt173 = -1;
        this.stackIDs = null;
        this.stackAmounts = null;
        this.certID = -1;
        this.certTemplateID = -1;
        this.anInt167 = 128;
        this.anInt192 = 128;
        this.anInt191 = 128;
        this.anInt196 = 0;
        this.anInt184 = 0;
        this.team = 0;
        this.rdc = 0;
        this.rdc2 = 0;
        this.rdc3 = 0;
        this.revisionType = RevisionType.DEFAULT;
    }

    private void readOSRSValues(Stream stream) {
        int opcode;
        block0 : while ((opcode = stream.readUnsignedByte()) != 0) {
            int index;
            int size;
            if (opcode == 1) {
                this.groundModelId = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 2) {
                this.name = stream.readString();
                continue;
            }
            if (opcode == 3) {
                this.description = stream.readString();
                continue;
            }
            if (opcode == 4) {
                this.modelZoom = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 5) {
                this.modelRotation1 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 6) {
                this.modelRotation2 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 7) {
                this.modelOffset1 = stream.readUnsignedWord();
                if (this.modelOffset1 <= 32767) continue;
                this.modelOffset1 -= 65536;
                continue;
            }
            if (opcode == 8) {
                this.modelOffset2 = stream.readUnsignedWord();
                if (this.modelOffset2 <= 32767) continue;
                this.modelOffset2 -= 65536;
                continue;
            }
            if (opcode == 11) {
                this.stackable = true;
                continue;
            }
            if (opcode == 12) {
                this.value = stream.readDWord();
                continue;
            }
            if (opcode == 16) {
                this.membersObject = true;
                continue;
            }
            if (opcode == 23) {
                this.femaleEquipt = stream.readUnsignedWord();
                this.aByte205 = stream.readSignedByte();
                continue;
            }
            if (opcode == 24) {
                this.anInt188 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 25) {
                this.maleEquipt = stream.readUnsignedWord();
                this.aByte154 = stream.readSignedByte();
                continue;
            }
            if (opcode == 26) {
                this.anInt164 = stream.readUnsignedWord();
                continue;
            }
            if (opcode >= 30 && opcode < 35) {
                if (this.groundActions == null) {
                    this.groundActions = new String[5];
                }
                this.groundActions[opcode - 30] = stream.readString();
                if (!this.groundActions[opcode - 30].equalsIgnoreCase("hidden")) continue;
                this.groundActions[opcode - 30] = null;
                continue;
            }
            if (opcode >= 35 && opcode < 40) {
                if (this.itemActions == null) {
                    this.itemActions = new String[5];
                }
                this.itemActions[opcode - 35] = stream.readString();
                continue;
            }
            if (opcode == 40) {
                size = stream.readUnsignedByte();
                this.originalModelColors = new int[size];
                this.modifiedModelColors = new int[size];
                index = 0;
                do {
                    if (index >= size) continue block0;
                    this.originalModelColors[index] = stream.readUnsignedWord();
                    this.modifiedModelColors[index] = stream.readUnsignedWord();
                    ++index;
                } while (true);
            }
            if (opcode == 41) {
                size = stream.readUnsignedByte();
                index = 0;
                do {
                    if (index >= size) continue block0;
                    stream.readUnsignedWord();
                    stream.readUnsignedWord();
                    ++index;
                } while (true);
            }
            if (opcode == 65) continue;
            if (opcode == 78) {
                this.anInt185 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 79) {
                this.anInt162 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 90) {
                this.anInt175 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 91) {
                this.anInt197 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 92) {
                this.anInt166 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 93) {
                this.anInt173 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 95) {
                this.anInt204 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 97) {
                this.certID = stream.readUnsignedWord();
                if (this.certID == -1) continue;
                this.certID += 25000;
                continue;
            }
            if (opcode == 98) {
                this.certTemplateID = stream.readUnsignedWord();
                if (this.certTemplateID == -1) continue;
                this.certTemplateID += 25000;
                continue;
            }
            if (opcode == 100) {
                int length = stream.readUnsignedByte();
                this.stackIDs = new int[length];
                this.stackAmounts = new int[length];
                int k = 0;
                do {
                    if (k >= length) continue block0;
                    this.stackIDs[k] = stream.readUnsignedWord();
                    if (this.stackIDs[k] != -1) {
                        int[] arrn = this.stackIDs;
                        int n = k;
                        arrn[n] = arrn[n] + 25000;
                    }
                    this.stackAmounts[k] = stream.readUnsignedWord();
                    ++k;
                } while (true);
            }
            if (opcode == 110) {
                this.anInt167 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 111) {
                this.anInt192 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 112) {
                this.anInt191 = stream.readUnsignedWord();
                continue;
            }
            if (opcode == 113) {
                this.anInt196 = stream.readSignedByte();
                continue;
            }
            if (opcode == 114) {
                this.anInt184 = stream.readSignedByte() * 5;
                continue;
            }
            if (opcode == 115) {
                this.team = stream.readUnsignedByte();
                continue;
            }
            if (opcode == 139) {
                stream.readUnsignedWord();
                continue;
            }
            if (opcode == 140) {
                stream.readUnsignedWord();
                continue;
            }
            if (opcode == 148) {
                stream.readUnsignedWord();
                continue;
            }
            if (opcode == 149) {
                stream.readUnsignedWord();
                continue;
            }
            System.out.println("Error loading item " + this.id + ", opcode " + opcode);
        }
        return;
    }

    private void readValues(Stream stream) {
        int i;
        block0 : while ((i = stream.readUnsignedByte()) != 0) {
            if (i == 1) {
                this.groundModelId = stream.readUnsignedWord();
                continue;
            }
            if (i == 2) {
                this.name = stream.readString();
                continue;
            }
            if (i == 3) {
                this.description = stream.readBytes().toString();
                continue;
            }
            if (i == 4) {
                this.modelZoom = stream.readUnsignedWord();
                continue;
            }
            if (i == 5) {
                this.modelRotation1 = stream.readUnsignedWord();
                continue;
            }
            if (i == 6) {
                this.modelRotation2 = stream.readUnsignedWord();
                continue;
            }
            if (i == 7) {
                this.modelOffset1 = stream.readUnsignedWord();
                if (this.modelOffset1 <= 32767) continue;
                this.modelOffset1 -= 65536;
                continue;
            }
            if (i == 8) {
                this.modelOffset2 = stream.readUnsignedWord();
                if (this.modelOffset2 <= 32767) continue;
                this.modelOffset2 -= 65536;
                continue;
            }
            if (i == 10) {
                stream.readUnsignedWord();
                continue;
            }
            if (i == 11) {
                this.stackable = true;
                continue;
            }
            if (i == 12) {
                this.value = stream.readDWord();
                continue;
            }
            if (i == 16) {
                this.membersObject = true;
                continue;
            }
            if (i == 23) {
                this.femaleEquipt = stream.readUnsignedWord();
                this.aByte205 = stream.readSignedByte();
                continue;
            }
            if (i == 24) {
                this.anInt188 = stream.readUnsignedWord();
                continue;
            }
            if (i == 25) {
                this.maleEquipt = stream.readUnsignedWord();
                this.aByte154 = stream.readSignedByte();
                continue;
            }
            if (i == 26) {
                this.anInt164 = stream.readUnsignedWord();
                continue;
            }
            if (i >= 30 && i < 35) {
                if (this.groundActions == null) {
                    this.groundActions = new String[5];
                }
                this.groundActions[i - 30] = stream.readString();
                if (!this.groundActions[i - 30].equalsIgnoreCase("hidden")) continue;
                this.groundActions[i - 30] = null;
                continue;
            }
            if (i >= 35 && i < 40) {
                if (this.itemActions == null) {
                    this.itemActions = new String[5];
                }
                this.itemActions[i - 35] = stream.readString();
                continue;
            }
            if (i == 40) {
                int j = stream.readUnsignedByte();
                this.modifiedModelColors = new int[j];
                this.originalModelColors = new int[j];
                int k = 0;
                do {
                    if (k >= j) continue block0;
                    this.modifiedModelColors[k] = stream.readUnsignedWord();
                    this.originalModelColors[k] = stream.readUnsignedWord();
                    ++k;
                } while (true);
            }
            if (i == 78) {
                this.anInt185 = stream.readUnsignedWord();
                continue;
            }
            if (i == 79) {
                this.anInt162 = stream.readUnsignedWord();
                continue;
            }
            if (i == 90) {
                this.anInt175 = stream.readUnsignedWord();
                continue;
            }
            if (i == 91) {
                this.anInt197 = stream.readUnsignedWord();
                continue;
            }
            if (i == 92) {
                this.anInt166 = stream.readUnsignedWord();
                continue;
            }
            if (i == 93) {
                this.anInt173 = stream.readUnsignedWord();
                continue;
            }
            if (i == 95) {
                this.anInt204 = stream.readUnsignedWord();
                continue;
            }
            if (i == 97) {
                this.certID = stream.readUnsignedWord();
                continue;
            }
            if (i == 98) {
                this.certTemplateID = stream.readUnsignedWord();
                continue;
            }
            if (i >= 100 && i < 110) {
                if (this.stackIDs == null) {
                    this.stackIDs = new int[10];
                    this.stackAmounts = new int[10];
                }
                this.stackIDs[i - 100] = stream.readUnsignedWord();
                this.stackAmounts[i - 100] = stream.readUnsignedWord();
                continue;
            }
            if (i == 110) {
                this.anInt167 = stream.readUnsignedWord();
                continue;
            }
            if (i == 111) {
                this.anInt192 = stream.readUnsignedWord();
                continue;
            }
            if (i == 112) {
                this.anInt191 = stream.readUnsignedWord();
                continue;
            }
            if (i == 113) {
                this.anInt196 = stream.readSignedByte();
                continue;
            }
            if (i == 114) {
                this.anInt184 = stream.readSignedByte() * 5;
                continue;
            }
            if (i == 115) {
                this.team = stream.readUnsignedByte();
                continue;
            }
            if (i == 121) {
                stream.readUnsignedWord();
                continue;
            }
            if (i != 122) continue;
            stream.readUnsignedWord();
        }
        return;
    }

    public void toNote() {
        ItemDefinition itemDef = ItemDefinition.forID(this.certTemplateID);
        if (itemDef == null) {
            return;
        }
        this.groundModelId = itemDef.groundModelId;
        this.modelZoom = itemDef.modelZoom;
        this.modelRotation1 = itemDef.modelRotation1;
        this.modelRotation2 = itemDef.modelRotation2;
        this.anInt204 = itemDef.anInt204;
        this.modelOffset1 = itemDef.modelOffset1;
        this.modelOffset2 = itemDef.modelOffset2;
        this.modifiedModelColors = itemDef.modifiedModelColors;
        this.originalModelColors = itemDef.originalModelColors;
        ItemDefinition itemDef_1 = ItemDefinition.forID(this.certID);
        if (itemDef_1 == null) {
            return;
        }
        if (itemDef_1.name == null) {
            return;
        }
        this.name = itemDef_1.name;
        this.membersObject = itemDef_1.membersObject;
        this.value = itemDef_1.value;
        String s = "a";
        char c = itemDef_1.name.charAt(0);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            s = "an";
        }
        this.description = "Swap this note at any bank for " + s + " " + itemDef_1.name + ".";
        this.stackable = true;
    }

    public static Sprite getSpriteScaled(int i, int j, int k, int width) {
        int j6;
        int l5;
        Model model;
        boolean loadCached = true;
        ItemDefinition itemDef = ItemDefinition.forID(i);
        if (itemDef.stackIDs == null || !itemDef.stackable) {
            j = -1;
        }
        if (j > 1) {
            int i1 = -1;
            for (int j1 = 0; j1 < 10; ++j1) {
                if (j < itemDef.stackAmounts[j1] || itemDef.stackAmounts[j1] == 0) continue;
                i1 = itemDef.stackIDs[j1];
            }
        }
        if ((model = itemDef.method201(1)) == null) {
            return null;
        }
        Sprite sprite = null;
        if (itemDef.certTemplateID != -1 && (sprite = ItemDefinition.getSprite(itemDef.certID, 10, -1)) == null) {
            return null;
        }
        if (itemDef.lendTemplateID != -1 && (sprite = ItemDefinition.getSprite(itemDef.lendID, 50, 0)) == null) {
            return null;
        }
        Sprite sprite2 = new Sprite(width, width);
        int k1 = Rasterizer.textureInt1;
        int l1 = Rasterizer.textureInt2;
        int[] ai = Rasterizer.anIntArray1472;
        int[] ai1 = DrawingArea.pixels;
        int i2 = DrawingArea.width;
        int j2 = DrawingArea.height;
        int k2 = DrawingArea.topX;
        int l2 = DrawingArea.bottomX;
        int i3 = DrawingArea.topY;
        int j3 = DrawingArea.bottomY;
        Rasterizer.aBoolean1464 = false;
        DrawingArea.initDrawingArea(width, width, sprite2.myPixels);
        DrawingArea.setAllPixelsTo(0);
        DrawingArea.resetDepthBuffer();
        DrawingArea.drawPixels(width, 0, 0, 0, width);
        Rasterizer.method364();
        int k3 = itemDef.modelZoom;
        if (k == -1) {
            k3 = (int)((double)k3 * 1.5);
        }
        if (k > 0) {
            k3 = (int)((double)k3 * 1.04);
        }
        int l3 = Rasterizer.anIntArray1470[itemDef.modelRotation1] * k3 >> 16;
        int i4 = Rasterizer.anIntArray1471[itemDef.modelRotation1] * k3 >> 16;
        model.method482(itemDef.modelRotation2, itemDef.anInt204, itemDef.modelRotation1, itemDef.modelOffset1, l3 + model.modelHeight / 2 + itemDef.modelOffset2, i4 + itemDef.modelOffset2);
        sprite2.outline(1);
        if (k > 0) {
            sprite2.outline(16777215);
        }
        if (k == 0) {
            sprite2.shadow(3153952);
        }
        DrawingArea.initDrawingArea(width, width, sprite2.myPixels);
        if (itemDef.certTemplateID != -1) {
            l5 = sprite.maxWidth;
            j6 = sprite.maxHeight;
            sprite.maxWidth = width;
            sprite.maxHeight = width;
            sprite.drawSprite(0, 0);
            sprite.maxWidth = l5;
            sprite.maxHeight = j6;
        }
        if (itemDef.lendTemplateID != -1) {
            l5 = sprite.maxWidth;
            j6 = sprite.maxHeight;
            sprite.maxWidth = width;
            sprite.maxHeight = width;
            sprite.drawSprite(0, 0);
            sprite.maxWidth = l5;
            sprite.maxHeight = j6;
        }
        DrawingArea.initDrawingArea(j2, i2, ai1);
        DrawingArea.setDrawingArea(j3, k2, l2, i3);
        Rasterizer.textureInt1 = k1;
        Rasterizer.textureInt2 = l1;
        Rasterizer.anIntArray1472 = ai;
        Rasterizer.aBoolean1464 = true;
        sprite2.maxWidth = itemDef.stackable ? width + 1 : width;
        sprite2.maxHeight = j;
        return sprite2;
    }

    public static Sprite getSprite(int i, int j, int k) {
        int l5;
        Model model;
        int j6;
        boolean loadCached = true;
        if (k == 0 && loadCached) {
            Sprite sprite = (Sprite)mruNodes1.insertFromCache(i);
            if (sprite != null && sprite.maxHeight != j && sprite.maxHeight != -1) {
                sprite.unlink();
                sprite = null;
            }
            if (sprite != null) {
                return sprite;
            }
        }
        ItemDefinition itemDef = ItemDefinition.forID(i);
        if (itemDef.stackIDs == null || !itemDef.stackable) {
            j = -1;
        }
        if (j > 1) {
            int i1 = -1;
            for (int j1 = 0; j1 < 10; ++j1) {
                if (j < itemDef.stackAmounts[j1] || itemDef.stackAmounts[j1] == 0) continue;
                i1 = itemDef.stackIDs[j1];
            }
        }
        if ((model = itemDef.method201(1)) == null) {
            return null;
        }
        Sprite sprite = null;
        if (itemDef.certTemplateID != -1 && (sprite = ItemDefinition.getSprite(itemDef.certID, 10, -1)) == null) {
            return null;
        }
        if (itemDef.lendTemplateID != -1 && (sprite = ItemDefinition.getSprite(itemDef.lendID, 50, 0)) == null) {
            return null;
        }
        Sprite sprite2 = new Sprite(32, 32);
        int k1 = Rasterizer.textureInt1;
        int l1 = Rasterizer.textureInt2;
        int[] ai = Rasterizer.anIntArray1472;
        int[] ai1 = DrawingArea.pixels;
        int i2 = DrawingArea.width;
        int j2 = DrawingArea.height;
        int k2 = DrawingArea.topX;
        int l2 = DrawingArea.bottomX;
        int i3 = DrawingArea.topY;
        int j3 = DrawingArea.bottomY;
        Rasterizer.aBoolean1464 = false;
        DrawingArea.initDrawingArea(32, 32, sprite2.myPixels);
        DrawingArea.setAllPixelsTo(0);
        DrawingArea.resetDepthBuffer();
        DrawingArea.drawPixels(32, 0, 0, 0, 32);
        Rasterizer.method364();
        int k3 = itemDef.modelZoom;
        if (k == -1) {
            k3 = (int)((double)k3 * 1.5);
        }
        if (k > 0) {
            k3 = (int)((double)k3 * 1.04);
        }
        int l3 = Rasterizer.anIntArray1470[itemDef.modelRotation1] * k3 >> 16;
        int i4 = Rasterizer.anIntArray1471[itemDef.modelRotation1] * k3 >> 16;
        model.method482(itemDef.modelRotation2, itemDef.anInt204, itemDef.modelRotation1, itemDef.modelOffset1, l3 + model.modelHeight / 2 + itemDef.modelOffset2, i4 + itemDef.modelOffset2);
        sprite2.outline(1);
        if (k > 0) {
            sprite2.outline(16777215);
        }
        if (k == 0) {
            sprite2.shadow(3153952);
        }
        DrawingArea.initDrawingArea(32, 32, sprite2.myPixels);
        if (itemDef.certTemplateID != -1) {
            l5 = sprite.maxWidth;
            j6 = sprite.maxHeight;
            sprite.maxWidth = 32;
            sprite.maxHeight = 32;
            sprite.drawSprite(0, 0);
            sprite.maxWidth = l5;
            sprite.maxHeight = j6;
        }
        if (itemDef.lendTemplateID != -1) {
            l5 = sprite.maxWidth;
            j6 = sprite.maxHeight;
            sprite.maxWidth = 32;
            sprite.maxHeight = 32;
            sprite.drawSprite(0, 0);
            sprite.maxWidth = l5;
            sprite.maxHeight = j6;
        }
        if (k == 0) {
            mruNodes1.removeFromCache(sprite2, i);
        }
        DrawingArea.initDrawingArea(j2, i2, ai1);
        DrawingArea.setDrawingArea(j3, k2, l2, i3);
        Rasterizer.textureInt1 = k1;
        Rasterizer.textureInt2 = l1;
        Rasterizer.anIntArray1472 = ai;
        Rasterizer.aBoolean1464 = true;
        sprite2.maxWidth = itemDef.stackable ? 33 : 32;
        sprite2.maxHeight = j;
        return sprite2;
    }

    public Model method201(int i) {
        Model model;
        if (this.stackIDs != null && i > 1) {
            int j = -1;
            for (int k = 0; k < 10; ++k) {
                if (i < this.stackAmounts[k] || this.stackAmounts[k] == 0) continue;
                j = this.stackIDs[k];
            }
        }
        if ((model = (Model)mruNodes2.insertFromCache(this.id)) != null) {
            return model;
        }
        model = Model.fetchModel(this.groundModelId, this.revisionType);
        if (model == null) {
            return null;
        }
        if (this.anInt167 != 128 || this.anInt192 != 128 || this.anInt191 != 128) {
            model.method478(this.anInt167, this.anInt191, this.anInt192);
        }
        if (this.modifiedModelColors != null) {
            for (int l = 0; l < this.modifiedModelColors.length; ++l) {
                model.reColor(this.modifiedModelColors[l], this.originalModelColors[l]);
            }
        }
        if (this.rdc > 0) {
            model.method1337(this.rdc);
        }
        if (this.rdc2 != 0) {
            model.method1338(this.rdc2);
        }
        if (this.rdc3 != 0) {
            model.method1339(this.rdc3);
        }
        model.light(64 + this.anInt196, 768 + this.anInt184, -50, -10, -50, true);
        model.aBoolean1659 = true;
        mruNodes2.removeFromCache(model, this.id);
        return model;
    }

    public Model method202(int i) {
        Model model;
        if (this.stackIDs != null && i > 1) {
            int j = -1;
            for (int k = 0; k < 10; ++k) {
                if (i < this.stackAmounts[k] || this.stackAmounts[k] == 0) continue;
                j = this.stackIDs[k];
            }
        }
        if ((model = Model.fetchModel(this.groundModelId, this.revisionType)) == null) {
            return null;
        }
        if (this.modifiedModelColors != null) {
            for (int l = 0; l < this.modifiedModelColors.length; ++l) {
                model.reColor(this.modifiedModelColors[l], this.originalModelColors[l]);
            }
        }
        if (this.rdc > 0) {
            model.method1337(this.rdc);
        }
        if (this.rdc2 != 0) {
            model.method1338(this.rdc2);
        }
        if (this.rdc3 == 0) return model;
        model.method1339(this.rdc3);
        return model;
    }

    static {
        isMembers = true;
    }
}


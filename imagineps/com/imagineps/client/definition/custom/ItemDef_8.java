/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client.definition.custom;

import com.imagineps.client.definition.ItemDefinition;
import com.imagineps.client.definition.RevisionType;
import java.awt.Color;

public class ItemDef_8 {
    public static int RGB_to_RS2HSB(int red, int green, int blue) {
        float[] HSB = Color.RGBtoHSB((int)red, (int)green, (int)blue, (float[])null);
        float hue = HSB[0];
        float saturation = HSB[1];
        float brightness = HSB[2];
        int encode_hue = (int)(hue * 63.0f);
        int encode_saturation = (int)(saturation * 7.0f);
        int encode_brightness = (int)(brightness * 127.0f);
        return (encode_hue << 10) + (encode_saturation << 7) + encode_brightness;
    }

    public static int RS2HSB_to_RGB(int RS2HSB) {
        int decode_hue = RS2HSB >> 10 & 63;
        int decode_saturation = RS2HSB >> 7 & 7;
        int decode_brightness = RS2HSB & 127;
        return Color.HSBtoRGB((float)((float)decode_hue / 63.0f), (float)((float)decode_saturation / 7.0f), (float)((float)decode_brightness / 127.0f));
    }

    /*
     * Opcode count of 24702 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    public static ItemDefinition itemDef(int i, ItemDefinition itemDef) {
        void var1_1;
        int n;
        switch (itemDef.id) {
            case 19892: {
                itemDef.name = "Immortal Charm";
                break;
            }
            case 1654: {
                itemDef.name = "Necklace of Lightning";
                itemDef.description = "A necklace used to deflect some lightning damage.";
                break;
            }
            case 1655: {
                itemDef.name = "Necklace of Lightning";
                itemDef.description = "A necklace used to deflect some lightning damage.";
                break;
            }
            case 1609: {
                itemDef.name = "Stone of Lightning";
                itemDef.description = "A stone used to create the Necklace of Lightning.";
                itemDef.originalModelColors[0] = ItemDef_8.RGB_to_RS2HSB(52, 145, 130);
                itemDef.originalModelColors[1] = ItemDef_8.RGB_to_RS2HSB(52, 145, 130);
                itemDef.originalModelColors[2] = ItemDef_8.RGB_to_RS2HSB(52, 145, 130);
                itemDef.originalModelColors[3] = ItemDef_8.RGB_to_RS2HSB(52, 145, 130);
                break;
            }
            case 746: {
                itemDef.name = "Sword of Zeus";
                itemDef.description = "The famous sword of the God of Lightning Zeus.";
                itemDef.modelZoom = 2500;
                itemDef.modelRotation1 = 292;
                itemDef.modelRotation2 = 1899;
                break;
            }
            case 747: {
                itemDef.name = "Sword of Zeus";
                itemDef.description = "The famous sword of the God of Lightning Zeus.";
                itemDef.modelZoom = 2500;
                itemDef.modelRotation1 = 292;
                itemDef.modelRotation2 = 1899;
                itemDef.certTemplateID = 799;
                itemDef.certID = 746;
                itemDef.toNote();
                break;
            }
            case 936: {
                itemDef.name = "Staff of Zeus";
                itemDef.description = "A powerful staff of the God of Lightning.";
                itemDef.modelOffset1 = -3;
                itemDef.modelOffset2 = 2;
                itemDef.modelZoom = 1874;
                itemDef.modelRotation1 = 292;
                itemDef.modelRotation2 = 1499;
                itemDef.groundModelId = 3;
                itemDef.maleEquipt = 4;
                itemDef.femaleEquipt = 4;
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.stackable = false;
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 937: {
                itemDef.name = "Staff of Zeus";
                itemDef.description = "A powerful staff of the God of Lightning.";
                itemDef.modelOffset1 = -3;
                itemDef.modelOffset2 = 2;
                itemDef.modelZoom = 1874;
                itemDef.modelRotation1 = 292;
                itemDef.modelRotation2 = 1499;
                itemDef.certTemplateID = 540;
                itemDef.certID = 936;
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 538: {
                itemDef.name = "Zeus robe bottom";
                itemDef.maleEquipt = 428;
                itemDef.femaleEquipt = 428;
                break;
            }
            case 539: {
                itemDef.name = "Zeus robe bottom";
                itemDef.maleEquipt = 428;
                itemDef.femaleEquipt = 428;
                break;
            }
            case 540: {
                itemDef.copy(799);
                itemDef.groundModelId = 9;
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 14114: {
                itemDef.name = "Zeus robe top";
                itemDef.femaleEquipt = 8;
                itemDef.maleEquipt = 8;
                itemDef.groundModelId = 7;
                itemDef.modelZoom = 1150;
                itemDef.anInt188 = 10;
                itemDef.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 14115: {
                itemDef.name = "Zeus robe top";
                itemDef.maleEquipt = 8;
                itemDef.femaleEquipt = 8;
                itemDef.groundModelId = 7;
                itemDef.modelZoom = 1150;
                itemDef.anInt188 = 10;
                itemDef.certID = 14114;
                itemDef.certTemplateID = 540;
                itemDef.itemActions = new String[]{null, null, null, null, "Drop"};
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 626: {
                itemDef.name = "Zeus boots";
                itemDef.maleEquipt = 1;
                itemDef.femaleEquipt = 1;
                itemDef.groundModelId = 2;
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 627: {
                itemDef.name = "Zeus boots";
                itemDef.certID = 626;
                itemDef.certTemplateID = 540;
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 628: {
                itemDef.name = "Zeus wings";
                itemDef.maleEquipt = 14;
                itemDef.femaleEquipt = 14;
                itemDef.groundModelId = 13;
                itemDef.modelOffset1 = -60;
                itemDef.modelOffset2 = 0;
                itemDef.modelZoom = 1900;
                itemDef.modelRotation1 = 445;
                itemDef.modelRotation2 = 487;
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 629: {
                itemDef.name = "Zeus wings";
                itemDef.groundModelId = 185;
                break;
            }
            case 74: {
                itemDef.name = "Zeus helmet";
                itemDef.maleEquipt = 40436;
                itemDef.femaleEquipt = 40436;
                itemDef.modelRotation1 = 1500;
                itemDef.modelRotation2 = 600;
                itemDef.modelOffset1 = 1;
                itemDef.modelOffset2 = 0;
                itemDef.modelZoom = 724;
                break;
            }
            case 75: {
                itemDef.name = "Zeus helmet";
                itemDef.maleEquipt = 40436;
                itemDef.femaleEquipt = 40436;
                itemDef.groundModelId = 40637;
                itemDef.certID = 74;
                itemDef.certTemplateID = 799;
                itemDef.toNote();
                break;
            }
            case 2902: {
                itemDef.name = "Zeus gloves";
                itemDef.groundModelId = 5;
                itemDef.maleEquipt = 6;
                itemDef.femaleEquipt = 6;
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 2903: {
                itemDef.name = "Zeus gloves";
                itemDef.groundModelId = 5;
                itemDef.maleEquipt = 6;
                itemDef.femaleEquipt = 6;
                itemDef.certID = 2902;
                itemDef.certTemplateID = 9;
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 19879: {
                itemDef.name = "Immortal Band";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 22044: {
                itemDef.groundModelId = 46409;
                itemDef.modelZoom = 2750;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset1 = 1;
                itemDef.name = "$5 Bond";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Claim Credits";
                itemDef.stackable = false;
                break;
            }
            case 22046: {
                itemDef.groundModelId = 46409;
                itemDef.modelZoom = 2700;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset1 = 1;
                itemDef.name = "$10 Bond";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Claim Credits";
                break;
            }
            case 22048: {
                itemDef.groundModelId = 46409;
                itemDef.modelZoom = 2650;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset1 = 1;
                itemDef.name = "$25 Bond";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Claim Credits";
                break;
            }
            case 22050: {
                itemDef.groundModelId = 46409;
                itemDef.modelZoom = 2600;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset1 = 1;
                itemDef.name = "$50 Bond";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Claim Credits";
                break;
            }
            case 22052: {
                itemDef.groundModelId = 46409;
                itemDef.modelZoom = 2550;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset1 = 1;
                itemDef.name = "$100 Bond";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Claim Credits";
                break;
            }
            case 22054: {
                itemDef.groundModelId = 46409;
                itemDef.modelZoom = 2500;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset1 = 1;
                itemDef.name = "$150 Bond";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Claim Credits";
                break;
            }
            case 22056: {
                itemDef.groundModelId = 46409;
                itemDef.modelZoom = 2450;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset1 = 1;
                itemDef.name = "$250 Bond";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Claim Credits";
                break;
            }
            case 22058: {
                itemDef.groundModelId = 46409;
                itemDef.modelZoom = 2400;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset1 = 1;
                itemDef.name = "$500 Bond";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Claim Credits";
                break;
            }
            case 22060: {
                itemDef.groundModelId = 46409;
                itemDef.modelZoom = 2350;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset1 = 1;
                itemDef.name = "$1000 Bond";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Claim Credits";
                break;
            }
            case 21183: {
                itemDef.groundModelId = 71001;
                itemDef.maleEquipt = 71002;
                itemDef.femaleEquipt = 71003;
                itemDef.modelZoom = 825;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -8;
                itemDef.modelRotation1 = 380;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Skeletal Full Helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21185: {
                itemDef.groundModelId = 71004;
                itemDef.maleEquipt = 71005;
                itemDef.femaleEquipt = 71006;
                itemDef.modelZoom = 1450;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 12;
                itemDef.modelRotation1 = 425;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Skeletal Platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21187: {
                itemDef.groundModelId = 71007;
                itemDef.maleEquipt = 71008;
                itemDef.femaleEquipt = 71009;
                itemDef.modelZoom = 1660;
                itemDef.modelOffset1 = -5;
                itemDef.modelOffset2 = -3;
                itemDef.modelRotation1 = 515;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Skeletal Platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 19626: {
                itemDef.name = "Memory Scroll";
                itemDef.modelZoom = 3170;
                itemDef.modelOffset1 = 6;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 395;
                itemDef.modelRotation2 = 47;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Read";
                break;
            }
            case 22000: {
                itemDef.groundModelId = 46377;
                itemDef.modelZoom = 625;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 1050;
                itemDef.modelRotation2 = 60;
                itemDef.name = "Jawbreaker";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Break";
                itemDef.stackable = true;
                break;
            }
            case 22002: {
                itemDef.groundModelId = 46378;
                itemDef.modelZoom = 1640;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 160;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Empty Basket";
                itemDef.itemActions = new String[5];
                itemDef.stackable = true;
                break;
            }
            case 22004: {
                itemDef.groundModelId = 46379;
                itemDef.maleEquipt = 46380;
                itemDef.femaleEquipt = 46380;
                itemDef.modelZoom = 916;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset2 = 1;
                itemDef.modelRotation1 = 428;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Pumpkin Head";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 22006: {
                itemDef.groundModelId = 46381;
                itemDef.modelZoom = 880;
                itemDef.modelOffset1 = 2;
                itemDef.modelOffset2 = 1;
                itemDef.modelRotation1 = 440;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Halloween Candy";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Eat";
                itemDef.stackable = true;
                break;
            }
            case 22008: {
                itemDef.groundModelId = 46382;
                itemDef.modelZoom = 1388;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -3;
                itemDef.modelRotation1 = 521;
                itemDef.modelRotation2 = 50;
                itemDef.name = "Halloween Candy";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Eat";
                itemDef.stackable = true;
                break;
            }
            case 22010: {
                itemDef.groundModelId = 46383;
                itemDef.modelZoom = 861;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset2 = 18;
                itemDef.modelRotation1 = 323;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Halloween Candy";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Eat";
                itemDef.stackable = true;
                break;
            }
            case 22012: {
                itemDef.groundModelId = 46384;
                itemDef.modelZoom = 1195;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 450;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Halloween Candy";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Eat";
                itemDef.stackable = true;
                break;
            }
            case 22014: {
                itemDef.groundModelId = 46385;
                itemDef.modelZoom = 1481;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset2 = -12;
                itemDef.modelRotation1 = 408;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Halloween Candy";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Eat";
                itemDef.stackable = true;
                break;
            }
            case 22016: {
                itemDef.groundModelId = 46386;
                itemDef.modelZoom = 1195;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 525;
                itemDef.modelRotation2 = 5;
                itemDef.name = "Halloween Candy";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Eat";
                itemDef.stackable = true;
                break;
            }
            case 22018: {
                itemDef.groundModelId = 46387;
                itemDef.modelZoom = 1030;
                itemDef.modelOffset1 = -4;
                itemDef.modelOffset2 = 4;
                itemDef.modelRotation1 = 595;
                itemDef.modelRotation2 = 125;
                itemDef.name = "Voucher of Good Taste";
                itemDef.itemActions = new String[5];
                itemDef.stackable = true;
                break;
            }
            case 22020: {
                itemDef.groundModelId = 46388;
                itemDef.modelZoom = 1174;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 7;
                itemDef.modelRotation1 = 401;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Voucher of Bad Taste";
                itemDef.itemActions = new String[5];
                itemDef.stackable = true;
                break;
            }
            case 22022: {
                itemDef.groundModelId = 46389;
                itemDef.modelZoom = 1950;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 390;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Party Invitation";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Read";
                itemDef.stackable = false;
                break;
            }
            case 22024: {
                itemDef.groundModelId = 46390;
                itemDef.modelZoom = 1470;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 63;
                itemDef.modelRotation1 = 268;
                itemDef.modelRotation2 = 1964;
                itemDef.name = "Pumpkin";
                itemDef.itemActions = new String[5];
                itemDef.stackable = true;
                break;
            }
            case 22026: {
                itemDef.groundModelId = 46391;
                itemDef.modelZoom = 1140;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset2 = 4;
                itemDef.modelRotation1 = 336;
                itemDef.modelRotation2 = 131;
                itemDef.name = "Halloween Token Box";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Open";
                itemDef.stackable = false;
                break;
            }
            case 22028: {
                itemDef.groundModelId = 46392;
                itemDef.modelZoom = 730;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset2 = 2;
                itemDef.modelRotation1 = 358;
                itemDef.modelRotation2 = 1949;
                itemDef.name = "Halloween Token";
                itemDef.itemActions = new String[5];
                itemDef.stackable = true;
                break;
            }
            case 22030: {
                itemDef.groundModelId = 46393;
                itemDef.modelZoom = 1390;
                itemDef.modelOffset1 = 4;
                itemDef.modelOffset2 = -10;
                itemDef.modelRotation1 = 191;
                itemDef.modelRotation2 = 76;
                itemDef.name = "Basket of Candies";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[0] = "Check";
                itemDef.stackable = false;
                break;
            }
            case 22032: {
                itemDef.groundModelId = 46394;
                itemDef.maleEquipt = 46395;
                itemDef.femaleEquipt = 46395;
                itemDef.modelZoom = 755;
                itemDef.modelOffset1 = 8;
                itemDef.modelOffset2 = 11;
                itemDef.modelRotation1 = 426;
                itemDef.modelRotation2 = 196;
                itemDef.name = "Ghost Mask";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 22034: {
                itemDef.groundModelId = 46396;
                itemDef.maleEquipt = 46397;
                itemDef.femaleEquipt = 46397;
                itemDef.modelZoom = 580;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 7;
                itemDef.modelRotation1 = 331;
                itemDef.modelRotation2 = 226;
                itemDef.name = "Jason Mask";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 22036: {
                itemDef.groundModelId = 46398;
                itemDef.maleEquipt = 46399;
                itemDef.femaleEquipt = 46399;
                itemDef.modelZoom = 700;
                itemDef.modelOffset1 = 2;
                itemDef.modelOffset2 = 6;
                itemDef.modelRotation1 = 396;
                itemDef.modelRotation2 = 160;
                itemDef.name = "Scream Mask";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 22038: {
                itemDef.groundModelId = 46400;
                itemDef.maleEquipt = 46401;
                itemDef.femaleEquipt = 46401;
                itemDef.modelZoom = 975;
                itemDef.modelOffset1 = 9;
                itemDef.modelOffset2 = 7;
                itemDef.modelRotation1 = 388;
                itemDef.modelRotation2 = 193;
                itemDef.name = "Halloween Wizard Hat (R)";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 22040: {
                itemDef.groundModelId = 46402;
                itemDef.maleEquipt = 46403;
                itemDef.femaleEquipt = 46403;
                itemDef.modelZoom = 915;
                itemDef.modelOffset1 = 7;
                itemDef.modelOffset2 = 6;
                itemDef.modelRotation1 = 433;
                itemDef.modelRotation2 = 124;
                itemDef.name = "Halloween Wizard Hat (G)";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 22042: {
                itemDef.groundModelId = 46404;
                itemDef.name = "Pumpkin Pet";
                itemDef.modelZoom = 2645;
                itemDef.modelOffset1 = 1;
                itemDef.modelOffset2 = -25;
                itemDef.modelRotation1 = 155;
                itemDef.modelRotation2 = 106;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[3] = "Summon";
                itemDef.stackable = false;
                break;
            }
            case 21171: {
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.groundModelId = 72;
                itemDef.maleEquipt = 73;
                itemDef.femaleEquipt = 74;
                itemDef.modelZoom = 1200;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 3;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 135;
                itemDef.name = "Tyrant Full Helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21173: {
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.groundModelId = 75;
                itemDef.maleEquipt = 76;
                itemDef.femaleEquipt = 77;
                itemDef.modelZoom = 1710;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 595;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Tyrant Platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21175: {
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.groundModelId = 78;
                itemDef.maleEquipt = 79;
                itemDef.femaleEquipt = 80;
                itemDef.modelZoom = 2000;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Tyrant Platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21177: {
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.groundModelId = 81;
                itemDef.maleEquipt = 82;
                itemDef.femaleEquipt = 83;
                itemDef.modelZoom = 760;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 590;
                itemDef.modelRotation2 = 0;
                itemDef.name = "Tyrant Gloves";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21179: {
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.groundModelId = 84;
                itemDef.maleEquipt = 85;
                itemDef.femaleEquipt = 86;
                itemDef.modelZoom = 635;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 110;
                itemDef.modelRotation2 = 180;
                itemDef.name = "Tyrant Boots";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21181: {
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.groundModelId = 87;
                itemDef.maleEquipt = 88;
                itemDef.femaleEquipt = 88;
                itemDef.modelZoom = 2070;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 470;
                itemDef.modelRotation2 = 1015;
                itemDef.name = "Tyrant Cape";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21161: {
                itemDef.groundModelId = 46358;
                itemDef.maleEquipt = 46359;
                itemDef.femaleEquipt = 46359;
                itemDef.name = "LALA Axe";
                itemDef.description = "LALA Axe.";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21153: {
                itemDef.groundModelId = 46356;
                itemDef.name = "Extreme Donator Sword";
                itemDef.description = "A Extreme Donator Sword.";
                itemDef.maleEquipt = 46357;
                itemDef.femaleEquipt = 46357;
                itemDef.modelZoom = 1785;
                itemDef.modelOffset1 = 2;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 560;
                itemDef.modelRotation2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21010: {
                itemDef.groundModelId = 29216;
                itemDef.name = "Zeus's Lightning Bolt";
                itemDef.description = "The Weapon Of The Gods!";
                itemDef.maleEquipt = 29217;
                itemDef.femaleEquipt = 29217;
                itemDef.modelZoom = 750;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 3;
                itemDef.modelRotation1 = 488;
                itemDef.modelRotation2 = 600;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = true;
                break;
            }
            case 21001: {
                itemDef.groundModelId = 46336;
                itemDef.name = "Diablo Sword";
                itemDef.description = "A Diablo sword!.";
                itemDef.maleEquipt = 46337;
                itemDef.femaleEquipt = 46337;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21003: {
                itemDef.groundModelId = 46338;
                itemDef.name = "Diablo Shield";
                itemDef.description = "A Diablo shield!.";
                itemDef.maleEquipt = 46339;
                itemDef.femaleEquipt = 46339;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 575;
                itemDef.modelRotation2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21005: {
                itemDef.groundModelId = 46340;
                itemDef.name = "Diablo Bow";
                itemDef.description = "A Diablo bow!.";
                itemDef.maleEquipt = 46341;
                itemDef.femaleEquipt = 46341;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21007: {
                itemDef.groundModelId = 46342;
                itemDef.name = "Diablo Wings";
                itemDef.description = "A Diablo wings!.";
                itemDef.maleEquipt = 46343;
                itemDef.femaleEquipt = 46343;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 450;
                itemDef.modelRotation2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21009: {
                itemDef.groundModelId = 46344;
                itemDef.name = "Blood Edge Sword";
                itemDef.description = "A Blood's Edge sword!.";
                itemDef.modelZoom = 1750;
                itemDef.maleEquipt = 46345;
                itemDef.femaleEquipt = 46345;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 1575;
                itemDef.modelRotation2 = 1040;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21011: {
                itemDef.groundModelId = 46346;
                itemDef.name = "HellSlayer Sword";
                itemDef.description = "A HellSlayer sword!.";
                itemDef.modelZoom = 2550;
                itemDef.maleEquipt = 46347;
                itemDef.femaleEquipt = 46347;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 1630;
                itemDef.modelRotation2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21013: {
                itemDef.groundModelId = 46348;
                itemDef.name = "Equilibrium Sword [T1]";
                itemDef.description = "A Equilibrium sword.";
                itemDef.modelZoom = 1750;
                itemDef.maleEquipt = 46349;
                itemDef.femaleEquipt = 46349;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 1575;
                itemDef.modelRotation2 = 1040;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21015: {
                itemDef.groundModelId = 46350;
                itemDef.name = "Equilibrium Shield [T1]";
                itemDef.description = "A Equilibrium shield!.";
                itemDef.modelZoom = 1930;
                itemDef.maleEquipt = 46351;
                itemDef.femaleEquipt = 46351;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 425;
                itemDef.modelRotation2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21017: {
                itemDef.groundModelId = 46352;
                itemDef.name = "Equilibrium Sword [T2]";
                itemDef.description = "A Equilibrium sword.";
                itemDef.modelZoom = 1750;
                itemDef.maleEquipt = 46353;
                itemDef.femaleEquipt = 46353;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 550;
                itemDef.modelRotation2 = 500;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21019: {
                itemDef.groundModelId = 46354;
                itemDef.name = "Equilibrium Shield [T2]";
                itemDef.description = "A Equilibrium shield!.";
                itemDef.modelZoom = 1880;
                itemDef.maleEquipt = 46355;
                itemDef.femaleEquipt = 46355;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 550;
                itemDef.modelRotation2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 21151: {
                itemDef.groundModelId = 50025;
                itemDef.name = "Diablo pet";
                itemDef.description = "A Diablo pet!.";
                itemDef.modelZoom = 9000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[3] = "Summon";
                itemDef.itemActions[4] = "Drop";
                itemDef.stackable = false;
                break;
            }
            case 21152: {
                itemDef.groundModelId = 57393;
                itemDef.name = "Zeus pet";
                itemDef.description = "A Zeus pet!.";
                itemDef.modelZoom = 3000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[3] = "Summon";
                itemDef.itemActions[4] = "Drop";
                itemDef.stackable = false;
                break;
            }
            case 20191: {
                itemDef.name = "Phantom helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46327;
                itemDef.maleEquipt = 46328;
                itemDef.femaleEquipt = 46329;
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 1750;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.certID = -1;
                itemDef.certTemplateID = -1;
                break;
            }
            case 20193: {
                itemDef.name = "Phantom platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46330;
                itemDef.maleEquipt = 46331;
                itemDef.femaleEquipt = 46332;
                itemDef.modelZoom = 1500;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.certID = -1;
                itemDef.certTemplateID = -1;
                break;
            }
            case 20195: {
                itemDef.name = "Phantom platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46333;
                itemDef.maleEquipt = 46334;
                itemDef.femaleEquipt = 46335;
                itemDef.modelZoom = 1750;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.certID = -1;
                itemDef.certTemplateID = -1;
                break;
            }
            case 20185: {
                itemDef.name = "Elite full helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46318;
                itemDef.maleEquipt = 46319;
                itemDef.femaleEquipt = 46320;
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 1750;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.certID = -1;
                itemDef.certTemplateID = -1;
                break;
            }
            case 20187: {
                itemDef.name = "Elite platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46321;
                itemDef.maleEquipt = 46322;
                itemDef.femaleEquipt = 46323;
                itemDef.modelZoom = 1500;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.certID = -1;
                itemDef.certTemplateID = -1;
                break;
            }
            case 20189: {
                itemDef.name = "Elite platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46324;
                itemDef.maleEquipt = 46325;
                itemDef.femaleEquipt = 46326;
                itemDef.modelZoom = 1750;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.certID = -1;
                itemDef.certTemplateID = -1;
                break;
            }
            case 20197: {
                itemDef.name = "K'ril Tsutsaroth Cape";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46316;
                itemDef.maleEquipt = 46317;
                itemDef.femaleEquipt = 46317;
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.certID = -1;
                itemDef.certTemplateID = -1;
                break;
            }
            case 20155: {
                itemDef.name = "Elite full helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46280;
                itemDef.maleEquipt = 46283;
                itemDef.femaleEquipt = 46286;
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 1750;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20157: {
                itemDef.name = "Elite platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46281;
                itemDef.maleEquipt = 46284;
                itemDef.femaleEquipt = 46287;
                itemDef.modelZoom = 1500;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20159: {
                itemDef.name = "Elite platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46282;
                itemDef.maleEquipt = 46285;
                itemDef.femaleEquipt = 46288;
                itemDef.modelZoom = 1750;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20161: {
                itemDef.name = "Elite full helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46238;
                itemDef.maleEquipt = 46241;
                itemDef.femaleEquipt = 46244;
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 1750;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20163: {
                itemDef.name = "Elite platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46239;
                itemDef.maleEquipt = 46242;
                itemDef.femaleEquipt = 46245;
                itemDef.modelZoom = 1500;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20165: {
                itemDef.name = "Elite platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46240;
                itemDef.maleEquipt = 46243;
                itemDef.femaleEquipt = 46246;
                itemDef.modelZoom = 1750;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20167: {
                itemDef.name = "Elite full helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46289;
                itemDef.maleEquipt = 46292;
                itemDef.femaleEquipt = 46295;
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 1750;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20169: {
                itemDef.name = "Elite platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46290;
                itemDef.maleEquipt = 46293;
                itemDef.femaleEquipt = 46296;
                itemDef.modelZoom = 1500;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20171: {
                itemDef.name = "Elite platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46291;
                itemDef.maleEquipt = 46294;
                itemDef.femaleEquipt = 46297;
                itemDef.modelZoom = 1750;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20173: {
                itemDef.name = "Elite full helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46298;
                itemDef.maleEquipt = 46301;
                itemDef.femaleEquipt = 46304;
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 1750;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20175: {
                itemDef.name = "Elite platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46299;
                itemDef.maleEquipt = 46302;
                itemDef.femaleEquipt = 46305;
                itemDef.modelZoom = 1500;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20177: {
                itemDef.name = "Elite platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46300;
                itemDef.maleEquipt = 46303;
                itemDef.femaleEquipt = 46306;
                itemDef.modelZoom = 1750;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20179: {
                itemDef.name = "Elite full helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46307;
                itemDef.maleEquipt = 46310;
                itemDef.femaleEquipt = 46313;
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 1750;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20181: {
                itemDef.name = "Elite platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46308;
                itemDef.maleEquipt = 46311;
                itemDef.femaleEquipt = 46314;
                itemDef.modelZoom = 1500;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20183: {
                itemDef.name = "Elite platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46309;
                itemDef.maleEquipt = 46312;
                itemDef.femaleEquipt = 46315;
                itemDef.modelZoom = 1750;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.certID = -1;
                itemDef.certTemplateID = -1;
                break;
            }
            case 20143: {
                itemDef.name = "QBD Helm";
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 54;
                itemDef.maleEquipt = 55;
                itemDef.femaleEquipt = 56;
                itemDef.modelRotation1 = 0;
                itemDef.modelRotation2 = 1750;
                itemDef.modelZoom = 750;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20145: {
                itemDef.name = "QBD Body";
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 57;
                itemDef.maleEquipt = 58;
                itemDef.femaleEquipt = 59;
                itemDef.modelZoom = 1250;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20147: {
                itemDef.name = "QBD Legs";
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 60;
                itemDef.maleEquipt = 61;
                itemDef.femaleEquipt = 62;
                itemDef.modelZoom = 1750;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20149: {
                itemDef.name = "QBD Gloves";
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 63;
                itemDef.maleEquipt = 64;
                itemDef.femaleEquipt = 65;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20151: {
                itemDef.name = "QBD Boots";
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 66;
                itemDef.maleEquipt = 67;
                itemDef.femaleEquipt = 68;
                itemDef.modelZoom = 750;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 20153: {
                itemDef.name = "QBD Wings";
                itemDef.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 69;
                itemDef.maleEquipt = 70;
                itemDef.femaleEquipt = 71;
                itemDef.modelZoom = 1000;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                break;
            }
            case 201323: {
                itemDef.name = "Youtuber Cape";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46247;
                itemDef.maleEquipt = 46248;
                itemDef.femaleEquipt = 46248;
                itemDef.stackable = false;
                break;
            }
            case 20135: {
                itemDef.name = "Helper Cape";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46249;
                itemDef.maleEquipt = 46250;
                itemDef.femaleEquipt = 46250;
                itemDef.stackable = false;
                break;
            }
            case 20137: {
                itemDef.name = "Moderator Cape";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46251;
                itemDef.maleEquipt = 46252;
                itemDef.femaleEquipt = 46252;
                itemDef.stackable = false;
                break;
            }
            case 20139: {
                itemDef.name = "Admin Cape";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46253;
                itemDef.maleEquipt = 46254;
                itemDef.femaleEquipt = 46254;
                itemDef.stackable = false;
                break;
            }
            case 20141: {
                itemDef.name = "Developer Cape";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.groundModelId = 46255;
                itemDef.maleEquipt = 46256;
                itemDef.femaleEquipt = 46256;
                itemDef.stackable = false;
                break;
            }
            case 6542: {
                itemDef.name = "Requirements Mystery Box";
                itemDef.description = "Requirements mystery box.";
                itemDef.stackable = false;
                break;
            }
            case 19810: {
                itemDef.name = "NPC Kill Medal [T1]";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modelZoom = 1550;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.groundModelId = 49819;
                itemDef.femaleEquipt = 49814;
                itemDef.maleEquipt = 49814;
                itemDef.description = "A great honor to have.";
                itemDef.stackable = false;
                break;
            }
            case 19811: {
                itemDef.name = "NPC Kill Medal [T2]";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modelZoom = 2000;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.groundModelId = 49820;
                itemDef.femaleEquipt = 49815;
                itemDef.maleEquipt = 49815;
                itemDef.description = "A great honor to have.";
                itemDef.stackable = false;
                break;
            }
            case 19812: {
                itemDef.name = "NPC Kill Medal [T3]";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modelZoom = 2000;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.groundModelId = 49821;
                itemDef.femaleEquipt = 49816;
                itemDef.maleEquipt = 49816;
                itemDef.description = "A great honor to have.";
                itemDef.stackable = false;
                break;
            }
            case 19813: {
                itemDef.name = "NPC Kill Medal [T4]";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modelZoom = 2000;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.groundModelId = 49822;
                itemDef.femaleEquipt = 49817;
                itemDef.maleEquipt = 49817;
                itemDef.description = "A great honor to have.";
                itemDef.stackable = false;
                break;
            }
            case 19814: {
                itemDef.name = "NPC Kill Medal [T5]";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modelZoom = 2000;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.groundModelId = 49823;
                itemDef.femaleEquipt = 49818;
                itemDef.maleEquipt = 49818;
                itemDef.description = "A great honor to have.";
                itemDef.stackable = false;
                break;
            }
            case 19815: {
                itemDef.name = "Nightmare Full Helm";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.groundModelId = 49824;
                itemDef.femaleEquipt = 49827;
                itemDef.maleEquipt = 49828;
                itemDef.description = "A great honor to have.";
                itemDef.stackable = false;
                break;
            }
            case 19816: {
                itemDef.name = "Nightmare Platebody";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.groundModelId = 49825;
                itemDef.femaleEquipt = 49831;
                itemDef.maleEquipt = 49832;
                itemDef.description = "A great honor to have.";
                itemDef.stackable = false;
                break;
            }
            case 19817: {
                itemDef.name = "Nightmare Platelegs";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.groundModelId = 49826;
                itemDef.femaleEquipt = 49831;
                itemDef.maleEquipt = 49832;
                itemDef.description = "A great honor to have.";
                itemDef.stackable = false;
                break;
            }
            case 19123: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.description = "A Cape made from Dandelion flowers.";
                itemDef.groundModelId = 79240;
                itemDef.femaleEquipt = 79239;
                itemDef.maleEquipt = 79239;
                itemDef.modelZoom = 2128;
                itemDef.modelRotation1 = 504;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 1;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.anInt175 = 14;
                itemDef.anInt197 = 7;
                itemDef.name = "Dandelion Death Cape";
                break;
            }
            case 13362: {
                itemDef.groundModelId = 62714;
                itemDef.name = "Torva full helm";
                itemDef.description = "Torva full helm.";
                itemDef.modelZoom = 672;
                itemDef.modelRotation1 = 85;
                itemDef.modelRotation2 = 1867;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -3;
                itemDef.femaleEquipt = 62738;
                itemDef.maleEquipt = 62754;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 19111: {
                itemDef.name = "TokHaar-Kal";
                itemDef.value = 60000;
                itemDef.femaleEquipt = 62575;
                itemDef.maleEquipt = 62582;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -4;
                itemDef.groundModelId = 62592;
                itemDef.stackable = false;
                itemDef.description = "A cape made of ancient, enchanted rocks.";
                itemDef.modelZoom = 2086;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 533;
                itemDef.modelRotation2 = 333;
                break;
            }
            case 15651: {
                itemDef.groundModelId = 62820;
                itemDef.name = "Obsidian boots";
                itemDef.description = "Obsidian boots.";
                itemDef.modelZoom = 676;
                itemDef.modelRotation1 = 63;
                itemDef.modelRotation2 = 106;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = -1;
                itemDef.femaleEquipt = 62818;
                itemDef.maleEquipt = 62818;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 15653: {
                itemDef.groundModelId = 62825;
                itemDef.name = "Obsidian gloves";
                itemDef.description = "Obsidian Gloves.";
                itemDef.modelZoom = 548;
                itemDef.modelRotation1 = 618;
                itemDef.modelRotation2 = 1143;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62824;
                itemDef.maleEquipt = 62824;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 15654: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.groundModelId = 62827;
                itemDef.femaleEquipt = 62826;
                itemDef.modelZoom = 1886;
                itemDef.modelRotation1 = 477;
                itemDef.modelRotation2 = 757;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 13;
                itemDef.stackable = false;
                itemDef.rdc2 = 304782;
                itemDef.name = "Evil shield";
                itemDef.description = "A Shield said to be able to corrupt even the purest of hearts.";
                break;
            }
            case 15662: {
                itemDef.groundModelId = 62803;
                itemDef.name = "Tok-Tkzar Platebody";
                itemDef.description = "Tok-Tkzar legs";
                itemDef.modelZoom = 1358;
                itemDef.modelOffset1 = 2;
                itemDef.modelOffset2 = 6;
                itemDef.modelRotation1 = 539;
                itemDef.modelRotation2 = 0;
                itemDef.femaleEquipt = 62802;
                itemDef.maleEquipt = 62802;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.anInt204 = 40;
                itemDef.anInt196 = 30;
                itemDef.anInt184 = 100;
                break;
            }
            case 15656: {
                itemDef.groundModelId = 62805;
                itemDef.name = "Tok-Tkzar legs";
                itemDef.description = "Tok-Tkzar legs";
                itemDef.modelZoom = 1828;
                itemDef.modelRotation1 = 539;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = 0;
                itemDef.femaleEquipt = 62804;
                itemDef.maleEquipt = 62804;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.anInt204 = 40;
                itemDef.anInt196 = 30;
                itemDef.anInt184 = 100;
                break;
            }
            case 15657: {
                itemDef.groundModelId = 62807;
                itemDef.name = "Tok-Tkzar cloak";
                itemDef.description = "Tok-Tkzar cloak";
                itemDef.stackable = false;
                itemDef.modelZoom = 2713;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 29;
                itemDef.modelRotation1 = 504;
                itemDef.modelRotation2 = 1030;
                itemDef.femaleEquipt = 62806;
                itemDef.maleEquipt = 62806;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 15658: {
                itemDef.groundModelId = 62809;
                itemDef.name = "Tok-Tkzar boots";
                itemDef.description = "Tok-Tkzar boots";
                itemDef.modelZoom = 676;
                itemDef.modelRotation1 = 63;
                itemDef.modelRotation2 = 106;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = -1;
                itemDef.femaleEquipt = 62808;
                itemDef.maleEquipt = 62808;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 15659: {
                itemDef.groundModelId = 62811;
                itemDef.name = "Tok-Tkzar Gloves";
                itemDef.description = "Tok-Tkzar Gloves";
                itemDef.modelZoom = 648;
                itemDef.modelRotation1 = 618;
                itemDef.modelRotation2 = 1143;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62810;
                itemDef.maleEquipt = 62810;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 15660: {
                itemDef.groundModelId = 62813;
                itemDef.name = "Tok-Tkzar Helm";
                itemDef.description = "Tok-Tkzar Helm.";
                itemDef.modelZoom = 672;
                itemDef.modelRotation1 = 85;
                itemDef.modelRotation2 = 1867;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -3;
                itemDef.femaleEquipt = 62812;
                itemDef.maleEquipt = 62812;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 15661: {
                itemDef.groundModelId = 62815;
                itemDef.name = "Tok-Tkzar Mace";
                itemDef.description = "Tok-Tkzar Mace.";
                itemDef.modelZoom = 1672;
                itemDef.modelRotation1 = 285;
                itemDef.modelRotation2 = 607;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -3;
                itemDef.femaleEquipt = 62814;
                itemDef.maleEquipt = 62814;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16603: {
                itemDef.groundModelId = 62841;
                itemDef.name = "Max platelegs";
                itemDef.description = "Max platelegs";
                itemDef.modelZoom = 1740;
                itemDef.modelRotation1 = 474;
                itemDef.modelRotation2 = 2045;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62840;
                itemDef.maleEquipt = 62840;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16604: {
                itemDef.groundModelId = 62843;
                itemDef.name = "Max boots";
                itemDef.description = "Max boots";
                itemDef.modelZoom = 676;
                itemDef.modelRotation1 = 63;
                itemDef.modelRotation2 = 106;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = -1;
                itemDef.femaleEquipt = 62842;
                itemDef.maleEquipt = 62842;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16605: {
                itemDef.groundModelId = 62845;
                itemDef.name = "Max gloves";
                itemDef.description = "Max gloves";
                itemDef.modelZoom = 548;
                itemDef.modelRotation1 = 618;
                itemDef.modelRotation2 = 1143;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62844;
                itemDef.maleEquipt = 62844;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16606: {
                itemDef.groundModelId = 62867;
                itemDef.name = "Max Plate";
                itemDef.description = "Max Plate";
                itemDef.modelZoom = 1506;
                itemDef.modelRotation1 = 473;
                itemDef.modelRotation2 = 2042;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.femaleEquipt = 62846;
                itemDef.maleEquipt = 62846;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16608: {
                itemDef.groundModelId = 62849;
                itemDef.name = "Max Helm";
                itemDef.description = "Max Helm.";
                itemDef.modelZoom = 672;
                itemDef.modelRotation1 = 85;
                itemDef.modelRotation2 = 1867;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -3;
                itemDef.femaleEquipt = 62848;
                itemDef.maleEquipt = 62848;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16609: {
                itemDef.groundModelId = 62851;
                itemDef.name = "Max Dual longsword";
                itemDef.description = "Max Dual longsword.";
                itemDef.modelZoom = 1316;
                itemDef.modelRotation1 = 477;
                itemDef.modelRotation2 = 9;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 13;
                itemDef.femaleEquipt = 62850;
                itemDef.maleEquipt = 62850;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16610: {
                itemDef.groundModelId = 62883;
                itemDef.name = "Corrupt Dragon Fullhelm";
                itemDef.modelZoom = 980;
                itemDef.description = "You feel the corruption pulse through you.";
                itemDef.modelRotation1 = 208;
                itemDef.modelRotation2 = 220;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -18;
                itemDef.stackable = false;
                itemDef.femaleEquipt = 62871;
                itemDef.maleEquipt = 62871;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.anInt175 = 62730;
                itemDef.anInt197 = 62730;
                break;
            }
            case 16611: {
                itemDef.groundModelId = 62879;
                itemDef.name = "Corrupt Dragon Plate";
                itemDef.description = "You feel the corruption pulse through you";
                itemDef.modelZoom = 1506;
                itemDef.modelRotation1 = 473;
                itemDef.modelRotation2 = 2042;
                itemDef.modelOffset1 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset2 = 0;
                itemDef.femaleEquipt = 62869;
                itemDef.maleEquipt = 62873;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16613: {
                itemDef.groundModelId = 62880;
                itemDef.name = "Corrupt Dragon Platelegs";
                itemDef.description = "You feel the corruption pulse through you.";
                itemDef.modelZoom = 1740;
                itemDef.modelRotation1 = 474;
                itemDef.modelRotation2 = 2045;
                itemDef.modelOffset1 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62870;
                itemDef.maleEquipt = 62874;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16614: {
                itemDef.groundModelId = 62881;
                itemDef.name = "Corrupt Dragon Gloves";
                itemDef.description = "You feel the corruption pulse through you";
                itemDef.modelZoom = 548;
                itemDef.modelRotation1 = 618;
                itemDef.modelRotation2 = 1143;
                itemDef.modelOffset1 = 0;
                itemDef.stackable = false;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62878;
                itemDef.maleEquipt = 62877;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16615: {
                itemDef.groundModelId = 62882;
                itemDef.name = "Corrupt Dragon Boots";
                itemDef.modelZoom = 676;
                itemDef.description = "You feel the corruption pulse through you";
                itemDef.modelRotation1 = 63;
                itemDef.modelRotation2 = 106;
                itemDef.modelOffset1 = 5;
                itemDef.stackable = false;
                itemDef.modelOffset2 = -1;
                itemDef.femaleEquipt = 62872;
                itemDef.maleEquipt = 62876;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16616: {
                itemDef.groundModelId = 62884;
                itemDef.name = "Corrupt Dragon wings";
                itemDef.description = "Enchanted wings torn from the back of a Corrupt Dragon ";
                itemDef.modelZoom = 850;
                itemDef.modelRotation1 = 252;
                itemDef.modelRotation2 = 1020;
                itemDef.modelOffset1 = -1;
                itemDef.stackable = false;
                itemDef.modelOffset2 = 24;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 62868;
                itemDef.maleEquipt = 62868;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17751: {
                itemDef.groundModelId = 62866;
                itemDef.name = "@red@Corrupt Dragon wings";
                itemDef.description = "Enchanted wings torn from the back of a Corrupt Dragon ";
                itemDef.modelZoom = 850;
                itemDef.modelRotation1 = 252;
                itemDef.modelRotation2 = 1020;
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = 24;
                itemDef.stackable = false;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 62867;
                itemDef.maleEquipt = 62867;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 16618: {
                itemDef.groundModelId = 62778;
                itemDef.name = "Blood mage hood";
                itemDef.description = "Deathy Hood from a lost order of mages.";
                itemDef.modelZoom = 724;
                itemDef.modelRotation1 = 81;
                itemDef.modelRotation2 = 1670;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -4;
                itemDef.femaleEquipt = 62779;
                itemDef.maleEquipt = 62779;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16619: {
                itemDef.groundModelId = 62787;
                itemDef.name = "Blood mage robe top";
                itemDef.description = "Deathy robe top from a lost order of mages";
                itemDef.modelZoom = 1513;
                itemDef.modelRotation1 = 566;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 1;
                itemDef.modelOffset2 = -8;
                itemDef.femaleEquipt = 62780;
                itemDef.maleEquipt = 62780;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16620: {
                itemDef.groundModelId = 62781;
                itemDef.name = "Blood Mage robe bottom ";
                itemDef.description = "Deathy Hood from a lost order of mages";
                itemDef.modelZoom = 1550;
                itemDef.modelRotation1 = 344;
                itemDef.modelRotation2 = 186;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = 11;
                itemDef.femaleEquipt = 62782;
                itemDef.maleEquipt = 62782;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16621: {
                itemDef.groundModelId = 62785;
                itemDef.name = "Book of Cataclysm";
                itemDef.description = "This book contains the knowledge of generations of powerfull dark mages ";
                itemDef.modelZoom = 850;
                itemDef.modelRotation1 = 252;
                itemDef.modelRotation2 = 1020;
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = 24;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 62786;
                itemDef.maleEquipt = 62786;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 16623: {
                itemDef.groundModelId = 62783;
                itemDef.name = "Staff of Sanguine";
                itemDef.description = "A powerfull staff able to suck the blood out of its enemies";
                itemDef.modelZoom = 850;
                itemDef.modelRotation1 = 252;
                itemDef.modelRotation2 = 1020;
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = 24;
                itemDef.stackable = false;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 62784;
                itemDef.maleEquipt = 62784;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Weild";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16624: {
                itemDef.groundModelId = 62832;
                itemDef.name = "BeastMaster Plate";
                itemDef.description = "BeastMaster Plate.";
                itemDef.modelZoom = 1506;
                itemDef.modelRotation1 = 473;
                itemDef.modelRotation2 = 2042;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.femaleEquipt = 62831;
                itemDef.maleEquipt = 62831;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16625: {
                itemDef.groundModelId = 62833;
                itemDef.name = "BeastMaster platelegs";
                itemDef.description = "BeastMaster platelegs.";
                itemDef.modelZoom = 1740;
                itemDef.modelRotation1 = 474;
                itemDef.modelRotation2 = 2045;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62930;
                itemDef.maleEquipt = 62930;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16626: {
                itemDef.groundModelId = 62837;
                itemDef.name = "BeastMaster boots";
                itemDef.description = "BeastMaster boots.";
                itemDef.modelZoom = 676;
                itemDef.modelRotation1 = 63;
                itemDef.modelRotation2 = 106;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = -1;
                itemDef.femaleEquipt = 62836;
                itemDef.maleEquipt = 62836;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16628: {
                itemDef.groundModelId = 62835;
                itemDef.name = "BeastMaster helm";
                itemDef.description = "BeastMaster helm.";
                itemDef.modelZoom = 672;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -3;
                itemDef.modelRotation1 = 50;
                itemDef.modelRotation2 = 2027;
                itemDef.femaleEquipt = 62834;
                itemDef.maleEquipt = 62834;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16629: {
                itemDef.groundModelId = 62839;
                itemDef.name = "BeastMaster gloves";
                itemDef.description = "BeastMaster gloves.";
                itemDef.modelZoom = 548;
                itemDef.modelRotation1 = 618;
                itemDef.modelRotation2 = 1143;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62838;
                itemDef.maleEquipt = 62838;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.stackable = false;
                break;
            }
            case 16630: {
                itemDef.groundModelId = 62771;
                itemDef.name = "Ares`s full helm";
                itemDef.description = "Helm of the war god, Ares.";
                itemDef.modelZoom = 972;
                itemDef.modelOffset1 = 2;
                itemDef.modelOffset2 = -3;
                itemDef.modelRotation1 = 100;
                itemDef.modelRotation2 = 1667;
                itemDef.femaleEquipt = 62770;
                itemDef.maleEquipt = 62770;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 16631: {
                itemDef.groundModelId = 62773;
                itemDef.name = "Ares' Platelegs";
                itemDef.description = "Platelegs of the war god, Ares.";
                itemDef.modelZoom = 1740;
                itemDef.modelRotation1 = 474;
                itemDef.modelRotation2 = 2045;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62772;
                itemDef.maleEquipt = 62772;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 16633: {
                itemDef.groundModelId = 62767;
                itemDef.name = "Ares' Platebody";
                itemDef.description = "Platebody of the war god, Ares.";
                itemDef.modelZoom = 1576;
                itemDef.modelOffset1 = -8;
                itemDef.modelOffset2 = 2;
                itemDef.modelRotation1 = 473;
                itemDef.modelRotation2 = 2042;
                itemDef.femaleEquipt = 62766;
                itemDef.maleEquipt = 62766;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 16634: {
                itemDef.groundModelId = 62829;
                itemDef.name = "Ares' gloves";
                itemDef.description = "Gloves of the war god, Ares.";
                itemDef.modelZoom = 418;
                itemDef.modelOffset1 = -3;
                itemDef.modelOffset2 = 3;
                itemDef.modelRotation1 = 618;
                itemDef.modelRotation2 = 1143;
                itemDef.femaleEquipt = 62830;
                itemDef.maleEquipt = 62830;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16635: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.groundModelId = 62789;
                itemDef.femaleEquipt = 62828;
                itemDef.maleEquipt = 62828;
                itemDef.modelZoom = 1316;
                itemDef.modelRotation1 = 477;
                itemDef.modelRotation2 = 9;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 13;
                itemDef.stackable = false;
                itemDef.name = "Crossbow of Devastation";
                itemDef.description = "A Crossbow said to be able to lay waste to entire cities. One of the three Items of armageddon ";
                break;
            }
            case 16636: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.groundModelId = 62777;
                itemDef.femaleEquipt = 62776;
                itemDef.maleEquipt = 62776;
                itemDef.modelZoom = 1316;
                itemDef.modelRotation1 = 477;
                itemDef.modelRotation2 = 9;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 13;
                itemDef.stackable = false;
                itemDef.name = "Spear of Rapture";
                itemDef.description = "A Spear said to be able to reap the soul out of a body. One of the three items of armageddon.";
                break;
            }
            case 16638: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.groundModelId = 62775;
                itemDef.femaleEquipt = 62774;
                itemDef.modelZoom = 1316;
                itemDef.modelRotation1 = 477;
                itemDef.modelRotation2 = 9;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 13;
                itemDef.stackable = false;
                itemDef.name = "Shield of Wrath";
                itemDef.description = "A Shield said to be able harness the power of the heavens. One of the three items of armageddon.";
                break;
            }
            case 16639: {
                itemDef.groundModelId = 78000;
                itemDef.name = "Knightmare Plate";
                itemDef.description = "22222222222222222 ";
                itemDef.modelZoom = 1506;
                itemDef.modelRotation1 = 473;
                itemDef.modelRotation2 = 2042;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.femaleEquipt = 78001;
                itemDef.maleEquipt = 78001;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16640: {
                itemDef.groundModelId = 78002;
                itemDef.name = "Knightmare platelegs";
                itemDef.description = "2222222222222222222222222.";
                itemDef.modelZoom = 1740;
                itemDef.modelRotation1 = 474;
                itemDef.modelRotation2 = 2045;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 78003;
                itemDef.maleEquipt = 78003;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16641: {
                itemDef.groundModelId = 78004;
                itemDef.name = "Knightmare boots";
                itemDef.description = "2222222222222222222222222.";
                itemDef.modelZoom = 676;
                itemDef.modelRotation1 = 63;
                itemDef.modelRotation2 = 106;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = -1;
                itemDef.femaleEquipt = 78005;
                itemDef.maleEquipt = 78005;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16644: {
                itemDef.groundModelId = 78008;
                itemDef.name = "Knightmare Helm";
                itemDef.description = "2222222222222222222222222.";
                itemDef.modelZoom = 1172;
                itemDef.modelRotation1 = 85;
                itemDef.modelRotation2 = 1867;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -3;
                itemDef.femaleEquipt = 78009;
                itemDef.maleEquipt = 78009;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 16645: {
                itemDef.groundModelId = 78010;
                itemDef.name = "Souledge";
                itemDef.stackable = false;
                itemDef.description = "A powerful weapon.";
                itemDef.modelZoom = 2200;
                itemDef.modelRotation1 = 9;
                itemDef.modelRotation2 = 477;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 13;
                itemDef.femaleEquipt = 78011;
                itemDef.maleEquipt = 78011;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 17743: {
                itemDef.groundModelId = 62853;
                itemDef.name = "Completionest Plate";
                itemDef.description = "22222222222222222 ";
                itemDef.modelZoom = 1506;
                itemDef.modelRotation1 = 473;
                itemDef.modelRotation2 = 2042;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.femaleEquipt = 62852;
                itemDef.maleEquipt = 62852;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 17744: {
                itemDef.groundModelId = 62855;
                itemDef.name = "Completionest platelegs";
                itemDef.description = "2222222222222222222222222.";
                itemDef.modelZoom = 1740;
                itemDef.modelRotation1 = 474;
                itemDef.modelRotation2 = 2045;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62854;
                itemDef.maleEquipt = 62854;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 17745: {
                itemDef.groundModelId = 62861;
                itemDef.name = "Completionest boots";
                itemDef.description = "2222222222222222222222222.";
                itemDef.modelZoom = 676;
                itemDef.modelRotation1 = 63;
                itemDef.modelRotation2 = 106;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = -1;
                itemDef.femaleEquipt = 62860;
                itemDef.maleEquipt = 62860;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 17746: {
                itemDef.groundModelId = 62859;
                itemDef.name = "Completionest gloves";
                itemDef.description = "2222222222222222222222222.";
                itemDef.modelZoom = 548;
                itemDef.modelRotation1 = 618;
                itemDef.modelRotation2 = 1143;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -5;
                itemDef.femaleEquipt = 62858;
                itemDef.maleEquipt = 62858;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 17748: {
                itemDef.groundModelId = 62857;
                itemDef.name = "Completionest Helm";
                itemDef.description = "2222222222222222222222222.";
                itemDef.modelZoom = 672;
                itemDef.modelRotation1 = 85;
                itemDef.modelRotation2 = 1867;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -3;
                itemDef.femaleEquipt = 62856;
                itemDef.maleEquipt = 62856;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 17749: {
                itemDef.groundModelId = 62863;
                itemDef.name = "Completionest longsword (main Hand)";
                itemDef.description = "2222222222222222222222222.";
                itemDef.modelZoom = 1300;
                itemDef.modelRotation1 = 477;
                itemDef.modelRotation2 = 9;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 13;
                itemDef.femaleEquipt = 62862;
                itemDef.maleEquipt = 62862;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 17750: {
                itemDef.groundModelId = 62863;
                itemDef.name = "Completionest longsword (Off Hand)";
                itemDef.description = "2222222222222222222222222.";
                itemDef.modelZoom = 1300;
                itemDef.modelRotation1 = 477;
                itemDef.modelRotation2 = 9;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 13;
                itemDef.femaleEquipt = 62864;
                itemDef.maleEquipt = 62864;
                itemDef.stackable = false;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Morph";
                itemDef.itemActions[2] = "Check-charges";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 17779: {
                itemDef.groundModelId = 78013;
                itemDef.name = "@red@Advanced Comp Cape";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1316;
                itemDef.modelRotation1 = 252;
                itemDef.modelRotation2 = 1020;
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = 24;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78012;
                itemDef.maleEquipt = 78012;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17851: {
                itemDef.groundModelId = 78025;
                itemDef.name = "@red@Advanced Dung cape";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1316;
                itemDef.modelRotation1 = 252;
                itemDef.modelRotation2 = 1020;
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = 24;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78024;
                itemDef.maleEquipt = 78024;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 4279: {
                itemDef.groundModelId = 78014;
                itemDef.name = "@blu@Trident of the MOON";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 3355;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 256;
                itemDef.modelOffset1 = 3;
                itemDef.modelOffset2 = -9;
                itemDef.femaleEquipt = 78014;
                itemDef.maleEquipt = 78014;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 17845: {
                itemDef.groundModelId = 78016;
                itemDef.name = "@blu@Chronic Greataxe";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 2500;
                itemDef.modelRotation1 = 228;
                itemDef.modelRotation2 = 1155;
                itemDef.modelOffset1 = -5;
                itemDef.modelOffset2 = 65;
                itemDef.membersObject = true;
                itemDef.stackable = false;
                itemDef.femaleEquipt = 78015;
                itemDef.maleEquipt = 78015;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17846: {
                itemDef.groundModelId = 78018;
                itemDef.name = "@blu@Chronic Godsword";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 2000;
                itemDef.modelRotation1 = 228;
                itemDef.modelRotation2 = 1225;
                itemDef.modelOffset1 = -5;
                itemDef.modelOffset2 = 65;
                itemDef.membersObject = true;
                itemDef.stackable = false;
                itemDef.femaleEquipt = 78017;
                itemDef.maleEquipt = 78017;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17847: {
                itemDef.groundModelId = 79610;
                itemDef.name = "Lavaflow Godsword";
                itemDef.description = "What in the world ? You really got that ? Youre amazing dude! ";
                itemDef.modelZoom = 1500;
                itemDef.modelRotation1 = 228;
                itemDef.modelRotation2 = 1985;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = -55;
                itemDef.stackable = false;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78019;
                itemDef.maleEquipt = 78019;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17848: {
                itemDef.groundModelId = 78021;
                itemDef.name = "Blazing Sword";
                itemDef.description = "What in the world ? You really got that ? Youre amazing dude! ";
                itemDef.modelZoom = 2000;
                itemDef.modelRotation1 = 228;
                itemDef.modelRotation2 = 1985;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = -55;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78020;
                itemDef.maleEquipt = 78020;
                itemDef.stackable = false;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17849: {
                itemDef.groundModelId = 79464;
                itemDef.name = "Flaming Whip";
                itemDef.description = "What in the world ? You really got that ? Youre amazing dude! ";
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 601;
                itemDef.modelRotation2 = 1000;
                itemDef.modelOffset1 = 4;
                itemDef.modelOffset2 = 8;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78022;
                itemDef.maleEquipt = 78022;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17850: {
                itemDef.groundModelId = 79465;
                itemDef.name = "Razor Whip";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1000;
                itemDef.modelRotation1 = 601;
                itemDef.modelRotation2 = 1000;
                itemDef.modelOffset1 = 4;
                itemDef.modelOffset2 = 8;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78023;
                itemDef.maleEquipt = 78023;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17854: {
                itemDef.groundModelId = 78028;
                itemDef.name = "Brutal longsword ( offhand )";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1447;
                itemDef.modelRotation1 = 444;
                itemDef.modelRotation2 = 1217;
                itemDef.modelOffset1 = -5;
                itemDef.modelOffset2 = -4;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78028;
                itemDef.maleEquipt = 78028;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 17855: {
                itemDef.groundModelId = 78029;
                itemDef.name = "@yel@Sword of Edictation";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1744;
                itemDef.modelRotation1 = 738;
                itemDef.modelRotation2 = 1985;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 0;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78029;
                itemDef.maleEquipt = 78029;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 17856: {
                itemDef.groundModelId = 78027;
                itemDef.name = "@bla@Obsidian rapier";
                itemDef.description = "What in the world ? You really got that ? Youre amazing dude! ";
                itemDef.modelZoom = 2079;
                itemDef.modelRotation1 = 459;
                itemDef.modelRotation2 = 77;
                itemDef.modelOffset1 = 5;
                itemDef.stackable = false;
                itemDef.modelOffset2 = -7;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78030;
                itemDef.maleEquipt = 78030;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17857: {
                itemDef.groundModelId = 78032;
                itemDef.name = "@yel@Corrupt Korasi sword";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1779;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = 0;
                itemDef.modelRotation1 = 500;
                itemDef.modelRotation2 = 0;
                itemDef.membersObject = true;
                itemDef.stackable = false;
                itemDef.femaleEquipt = 78031;
                itemDef.maleEquipt = 78031;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17858: {
                itemDef.groundModelId = 78034;
                itemDef.name = "Red Anchor of Death";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1104;
                itemDef.modelRotation1 = 321;
                itemDef.modelRotation2 = 24;
                itemDef.modelOffset1 = -5;
                itemDef.modelOffset2 = 2;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78033;
                itemDef.maleEquipt = 78033;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modifiedModelColors = new int[7];
                itemDef.originalModelColors = new int[7];
                itemDef.modifiedModelColors[0] = 10283;
                itemDef.originalModelColors[0] = 1818;
                itemDef.modifiedModelColors[1] = 10287;
                itemDef.originalModelColors[1] = 1820;
                itemDef.modifiedModelColors[2] = 10279;
                itemDef.originalModelColors[2] = 1825;
                itemDef.modifiedModelColors[3] = 10291;
                itemDef.originalModelColors[3] = 1818;
                itemDef.modifiedModelColors[4] = 10275;
                itemDef.originalModelColors[4] = 1819;
                itemDef.stackable = false;
                break;
            }
            case 17859: {
                itemDef.groundModelId = 78036;
                itemDef.name = "Upgraded Armadyl Godsword";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 2000;
                itemDef.modelRotation1 = 228;
                itemDef.modelRotation2 = 1985;
                itemDef.modelOffset1 = 5;
                itemDef.modelOffset2 = 55;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78035;
                itemDef.maleEquipt = 78035;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17860: {
                itemDef.groundModelId = 78038;
                itemDef.name = "Christmas TreeHat";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 996;
                itemDef.modelRotation1 = 9;
                itemDef.modelRotation2 = 1815;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 1;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78037;
                itemDef.maleEquipt = 78037;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17861: {
                itemDef.groundModelId = 78042;
                itemDef.stackable = false;
                itemDef.name = "Tzhaar Whip";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 987;
                itemDef.modelRotation1 = 440;
                itemDef.modelRotation2 = 630;
                itemDef.modelOffset1 = 8;
                itemDef.modelOffset2 = -1;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78041;
                itemDef.maleEquipt = 78041;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17862: {
                itemDef.groundModelId = 79476;
                itemDef.stackable = false;
                itemDef.name = "Tzhaar body";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1500;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -1;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78043;
                itemDef.maleEquipt = 78043;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17863: {
                itemDef.groundModelId = 79475;
                itemDef.stackable = false;
                itemDef.name = "Tzhaar legs";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 2000;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -1;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78044;
                itemDef.maleEquipt = 78044;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17864: {
                itemDef.groundModelId = 78046;
                itemDef.name = "Obsidian Body";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1650;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -1;
                itemDef.stackable = false;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78045;
                itemDef.maleEquipt = 78045;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 17865: {
                itemDef.groundModelId = 78048;
                itemDef.name = "Obsidian legs";
                itemDef.description = "What in the world ? You really got that ? Your amazing dude! ";
                itemDef.modelZoom = 1850;
                itemDef.modelRotation1 = 512;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -1;
                itemDef.stackable = false;
                itemDef.membersObject = true;
                itemDef.femaleEquipt = 78047;
                itemDef.maleEquipt = 78047;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 15001: {
                itemDef.name = "White wings";
                itemDef.value = 60000;
                itemDef.femaleEquipt = 79242;
                itemDef.maleEquipt = 79242;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.groundModelId = 79243;
                itemDef.stackable = false;
                itemDef.description = "White WINS!.";
                itemDef.modelZoom = 850;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelOffset2 = 24;
                itemDef.modelRotation1 = 252;
                itemDef.modelRotation2 = 1020;
                break;
            }
            case 16428: {
                itemDef.groundModelId = 9001;
                itemDef.name = "Rainbow Partyhat";
                itemDef.description = "Rainbow Partyhat.";
                itemDef.modelZoom = 440;
                itemDef.value = 60000;
                itemDef.modelRotation2 = 1845;
                itemDef.modelRotation1 = 121;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = 1;
                itemDef.femaleEquipt = 9000;
                itemDef.maleEquipt = 9002;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.stackable = false;
                break;
            }
            case 9500: {
                itemDef.name = "@yel@Wizard Hat";
                itemDef.value = 20000000;
                itemDef.femaleEquipt = 13079;
                itemDef.maleEquipt = 13082;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 11400;
                itemDef.stackable = false;
                itemDef.description = "Its a wizard hat.";
                itemDef.modelZoom = 800;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelRotation1 = 152;
                itemDef.modelRotation2 = 156;
                break;
            }
            case 9501: {
                itemDef.name = "@yel@Zaros Godsword";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 7997;
                itemDef.maleEquipt = 7997;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 7998;
                itemDef.stackable = false;
                itemDef.description = "Its a zaros godsword.";
                itemDef.modelZoom = 1957;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 9502: {
                itemDef.name = "@yel@Masamune";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 13083;
                itemDef.maleEquipt = 13083;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 13084;
                itemDef.stackable = false;
                itemDef.description = "Auron's Celestial Weapon: The Masamune.";
                itemDef.modelZoom = 1957;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 19000: {
                itemDef.name = "@yel@drygore Mace";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 19001;
                itemDef.maleEquipt = 19001;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19000;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.modelZoom = 1250;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 18999: {
                itemDef.name = "@yel@Upgraded drygore Mace";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 18999;
                itemDef.maleEquipt = 18999;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19000;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.modelZoom = 1250;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 19001: {
                itemDef.name = "@yel@drygore Mace ( broken )";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = -1;
                itemDef.maleEquipt = -1;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19002;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 8671: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 11200;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Yellow h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 19002: {
                itemDef.name = "@yel@drygore Mace ( off-hand )";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 19003;
                itemDef.maleEquipt = 19003;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19003;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 19003: {
                itemDef.name = "@yel@drygore Longsword ( off-hand )";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 19004;
                itemDef.maleEquipt = 19004;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19005;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 19004: {
                itemDef.name = "@yel@drygore Longsword ( broken )";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = -1;
                itemDef.maleEquipt = -1;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19006;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 19005: {
                itemDef.name = "@yel@drygore Longsword";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 19007;
                itemDef.maleEquipt = 19007;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19005;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 19006: {
                itemDef.name = "@yel@drygore Rapier ( off-hand )";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 19008;
                itemDef.maleEquipt = 19008;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19009;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 19007: {
                itemDef.name = "@yel@drygore Rapier";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 19010;
                itemDef.maleEquipt = 19010;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19009;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 19008: {
                itemDef.name = "@yel@drygore Rapier ( broken )";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = -1;
                itemDef.maleEquipt = -1;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19011;
                itemDef.stackable = false;
                itemDef.description = "Its's a drygore weapon.";
                itemDef.modelZoom = 1250;
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 19009: {
                itemDef.name = "Halo Sword";
                itemDef.value = 2000000000;
                itemDef.femaleEquipt = 19013;
                itemDef.maleEquipt = 19013;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.modelOffset1 = -1;
                itemDef.modelOffset2 = -1;
                itemDef.groundModelId = 19012;
                itemDef.stackable = false;
                itemDef.description = "its a sword from halo game.";
                itemDef.modelZoom = 1250;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wield";
                itemDef.itemActions[4] = "Drop";
                itemDef.modelRotation1 = 498;
                itemDef.modelRotation2 = 484;
                break;
            }
            case 8673: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 6073;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Orange h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 8675: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 32895;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Random h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 8695: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 57300;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Hot h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 8697: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 34503;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Winter h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 8677: {
                itemDef.groundModelId = 40920;
                itemDef.name = "Pink Special spirit shield";
                itemDef.description = "It's a Spectral spirit shield";
                itemDef.modifiedModelColors = new int[13];
                itemDef.originalModelColors = new int[13];
                itemDef.modifiedModelColors[0] = 44635;
                itemDef.originalModelColors[0] = 62135;
                itemDef.modifiedModelColors[1] = 44612;
                itemDef.originalModelColors[1] = 62135;
                itemDef.modifiedModelColors[2] = 44606;
                itemDef.originalModelColors[2] = 62135;
                itemDef.modifiedModelColors[3] = 44615;
                itemDef.originalModelColors[3] = 62135;
                itemDef.modifiedModelColors[4] = 44641;
                itemDef.originalModelColors[4] = 62135;
                itemDef.modifiedModelColors[5] = 44564;
                itemDef.originalModelColors[5] = 62135;
                itemDef.modifiedModelColors[6] = 44575;
                itemDef.originalModelColors[6] = 62135;
                itemDef.modifiedModelColors[7] = 44618;
                itemDef.originalModelColors[7] = 62135;
                itemDef.modifiedModelColors[8] = 105;
                itemDef.originalModelColors[8] = 6073;
                itemDef.modifiedModelColors[9] = 44603;
                itemDef.originalModelColors[9] = 62135;
                itemDef.modifiedModelColors[10] = 44570;
                itemDef.originalModelColors[10] = 62135;
                itemDef.modifiedModelColors[11] = 4500;
                itemDef.originalModelColors[11] = 62135;
                itemDef.modelZoom = 1616;
                itemDef.modelRotation1 = 396;
                itemDef.modelRotation2 = 1050;
                itemDef.modelOffset2 = -3;
                itemDef.modelOffset1 = 4;
                itemDef.femaleEquipt = 40940;
                itemDef.maleEquipt = 40940;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 8679: {
                itemDef.groundModelId = 5412;
                itemDef.name = "Cyan Whip";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modelZoom = 840;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.aByte205 = (byte)7;
                itemDef.aByte154 = (byte)-7;
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors[0] = 34503;
                itemDef.modifiedModelColors[0] = 944;
                itemDef.stackable = false;
                break;
            }
            case 8687: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 34503;
                itemDef.groundModelId = 2635;
                itemDef.modelZoom = 440;
                itemDef.modelRotation1 = 76;
                itemDef.modelRotation2 = 1850;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 1;
                itemDef.modelOffset2 = 1;
                itemDef.femaleEquipt = 187;
                itemDef.maleEquipt = 363;
                itemDef.anInt175 = 29;
                itemDef.anInt197 = 87;
                itemDef.name = "Cyan Party Hat";
                itemDef.description = "An Cyan Party Hat.";
                break;
            }
            case 8689: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 57300;
                itemDef.groundModelId = 2635;
                itemDef.modelZoom = 440;
                itemDef.modelRotation1 = 76;
                itemDef.modelRotation2 = 1850;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 1;
                itemDef.modelOffset2 = 1;
                itemDef.femaleEquipt = 187;
                itemDef.maleEquipt = 363;
                itemDef.anInt175 = 29;
                itemDef.anInt197 = 87;
                itemDef.name = "Random Party Hat";
                itemDef.description = "An Random Party Hat.";
                break;
            }
            case 8691: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 14898140;
                itemDef.groundModelId = 2635;
                itemDef.modelZoom = 440;
                itemDef.modelRotation1 = 76;
                itemDef.modelRotation2 = 1850;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 1;
                itemDef.modelOffset2 = 1;
                itemDef.femaleEquipt = 187;
                itemDef.maleEquipt = 363;
                itemDef.anInt175 = 29;
                itemDef.anInt197 = 87;
                itemDef.name = "Random Party Hat";
                itemDef.description = "An Random Party Hat.";
                break;
            }
            case 8693: {
                itemDef.groundModelId = 40920;
                itemDef.name = "De'Vil spirit shield";
                itemDef.description = "It's a Spectral spirit shield";
                itemDef.modifiedModelColors = new int[13];
                itemDef.originalModelColors = new int[13];
                itemDef.modifiedModelColors[0] = 44635;
                itemDef.originalModelColors[0] = 924;
                itemDef.modifiedModelColors[1] = 44612;
                itemDef.originalModelColors[1] = 924;
                itemDef.modifiedModelColors[2] = 44606;
                itemDef.originalModelColors[2] = 924;
                itemDef.modifiedModelColors[3] = 44615;
                itemDef.originalModelColors[3] = 924;
                itemDef.modifiedModelColors[4] = 44641;
                itemDef.originalModelColors[4] = 924;
                itemDef.modifiedModelColors[5] = 44564;
                itemDef.originalModelColors[5] = 924;
                itemDef.modifiedModelColors[6] = 44575;
                itemDef.originalModelColors[6] = 924;
                itemDef.modifiedModelColors[7] = 44618;
                itemDef.originalModelColors[7] = 924;
                itemDef.modifiedModelColors[8] = 105;
                itemDef.originalModelColors[8] = 105;
                itemDef.modifiedModelColors[9] = 44603;
                itemDef.originalModelColors[9] = 924;
                itemDef.modifiedModelColors[10] = 44570;
                itemDef.originalModelColors[10] = 924;
                itemDef.modifiedModelColors[11] = 4500;
                itemDef.originalModelColors[11] = 924;
                itemDef.modelZoom = 1616;
                itemDef.modelRotation1 = 396;
                itemDef.modelRotation2 = 1050;
                itemDef.modelOffset2 = -3;
                itemDef.modelOffset1 = 4;
                itemDef.femaleEquipt = 40940;
                itemDef.maleEquipt = 40940;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 8699: {
                itemDef.groundModelId = 40920;
                itemDef.name = "Saradomin spirit shield";
                itemDef.description = "It's a Spectral spirit shield";
                itemDef.modifiedModelColors = new int[13];
                itemDef.originalModelColors = new int[13];
                itemDef.modifiedModelColors[0] = 44635;
                itemDef.originalModelColors[0] = 105;
                itemDef.modifiedModelColors[1] = 44612;
                itemDef.originalModelColors[1] = 105;
                itemDef.modifiedModelColors[2] = 44606;
                itemDef.originalModelColors[2] = 105;
                itemDef.modifiedModelColors[3] = 44615;
                itemDef.originalModelColors[3] = 105;
                itemDef.modifiedModelColors[4] = 44641;
                itemDef.originalModelColors[4] = 105;
                itemDef.modifiedModelColors[5] = 44564;
                itemDef.originalModelColors[5] = 105;
                itemDef.modifiedModelColors[6] = 44575;
                itemDef.originalModelColors[6] = 105;
                itemDef.modifiedModelColors[7] = 44618;
                itemDef.originalModelColors[7] = 105;
                itemDef.modifiedModelColors[8] = 105;
                itemDef.originalModelColors[8] = 105;
                itemDef.modifiedModelColors[9] = 44603;
                itemDef.originalModelColors[9] = 105;
                itemDef.modifiedModelColors[10] = 44570;
                itemDef.originalModelColors[10] = 105;
                itemDef.modifiedModelColors[11] = 4500;
                itemDef.originalModelColors[11] = 105;
                itemDef.modelZoom = 1616;
                itemDef.modelRotation1 = 396;
                itemDef.modelRotation2 = 1050;
                itemDef.modelOffset2 = -3;
                itemDef.modelOffset1 = 4;
                itemDef.femaleEquipt = 40940;
                itemDef.maleEquipt = 40940;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 8701: {
                itemDef.groundModelId = 40920;
                itemDef.name = "Lava spirit shield";
                itemDef.description = "It's a Spectral spirit shield";
                itemDef.modifiedModelColors = new int[13];
                itemDef.originalModelColors = new int[13];
                itemDef.modifiedModelColors[0] = 44635;
                itemDef.originalModelColors[0] = 6073;
                itemDef.modifiedModelColors[1] = 44612;
                itemDef.originalModelColors[1] = 6073;
                itemDef.modifiedModelColors[2] = 44606;
                itemDef.originalModelColors[2] = 6073;
                itemDef.modifiedModelColors[3] = 44615;
                itemDef.originalModelColors[3] = 6073;
                itemDef.modifiedModelColors[4] = 44641;
                itemDef.originalModelColors[4] = 6073;
                itemDef.modifiedModelColors[5] = 44564;
                itemDef.originalModelColors[5] = 6073;
                itemDef.modifiedModelColors[6] = 44575;
                itemDef.originalModelColors[6] = 6073;
                itemDef.modifiedModelColors[7] = 44618;
                itemDef.originalModelColors[7] = 6073;
                itemDef.modifiedModelColors[8] = 105;
                itemDef.originalModelColors[8] = 105;
                itemDef.modifiedModelColors[9] = 44603;
                itemDef.originalModelColors[9] = 6073;
                itemDef.modifiedModelColors[10] = 44570;
                itemDef.originalModelColors[10] = 6073;
                itemDef.modifiedModelColors[11] = 4500;
                itemDef.originalModelColors[11] = 6073;
                itemDef.modelZoom = 1616;
                itemDef.modelRotation1 = 396;
                itemDef.modelRotation2 = 1050;
                itemDef.modelOffset2 = -3;
                itemDef.modelOffset1 = 4;
                itemDef.femaleEquipt = 40940;
                itemDef.maleEquipt = 40940;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 8717: {
                itemDef.groundModelId = 40920;
                itemDef.name = "DOOM spirit shield";
                itemDef.description = "It's a Spectral spirit shield";
                itemDef.modifiedModelColors = new int[13];
                itemDef.originalModelColors = new int[13];
                itemDef.modifiedModelColors[0] = 44635;
                itemDef.originalModelColors[0] = 1;
                itemDef.modifiedModelColors[1] = 44612;
                itemDef.originalModelColors[1] = 1;
                itemDef.modifiedModelColors[2] = 44606;
                itemDef.originalModelColors[2] = 1;
                itemDef.modifiedModelColors[3] = 44615;
                itemDef.originalModelColors[3] = 1;
                itemDef.modifiedModelColors[4] = 44641;
                itemDef.originalModelColors[4] = 1;
                itemDef.modifiedModelColors[5] = 44564;
                itemDef.originalModelColors[5] = 1;
                itemDef.modifiedModelColors[6] = 44575;
                itemDef.originalModelColors[6] = 1;
                itemDef.modifiedModelColors[7] = 44618;
                itemDef.originalModelColors[7] = 1;
                itemDef.modifiedModelColors[8] = 105;
                itemDef.originalModelColors[8] = 17350;
                itemDef.modifiedModelColors[9] = 44603;
                itemDef.originalModelColors[9] = 1;
                itemDef.modifiedModelColors[10] = 44570;
                itemDef.originalModelColors[10] = 1;
                itemDef.modifiedModelColors[11] = 4500;
                itemDef.originalModelColors[11] = 1;
                itemDef.modelZoom = 1616;
                itemDef.modelRotation1 = 396;
                itemDef.modelRotation2 = 1050;
                itemDef.modelOffset2 = -3;
                itemDef.modelOffset1 = 4;
                itemDef.femaleEquipt = 40940;
                itemDef.maleEquipt = 40940;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 8719: {
                itemDef.groundModelId = 40920;
                itemDef.name = "Lime spirit shield";
                itemDef.description = "It's a Spectral spirit shield";
                itemDef.modifiedModelColors = new int[13];
                itemDef.originalModelColors = new int[13];
                itemDef.modifiedModelColors[0] = 44635;
                itemDef.originalModelColors[0] = 17350;
                itemDef.modifiedModelColors[1] = 44612;
                itemDef.originalModelColors[1] = 17350;
                itemDef.modifiedModelColors[2] = 44606;
                itemDef.originalModelColors[2] = 17350;
                itemDef.modifiedModelColors[3] = 44615;
                itemDef.originalModelColors[3] = 17350;
                itemDef.modifiedModelColors[4] = 44641;
                itemDef.originalModelColors[4] = 17350;
                itemDef.modifiedModelColors[5] = 44564;
                itemDef.originalModelColors[5] = 17350;
                itemDef.modifiedModelColors[6] = 44575;
                itemDef.originalModelColors[6] = 17350;
                itemDef.modifiedModelColors[7] = 44618;
                itemDef.originalModelColors[7] = 17350;
                itemDef.modifiedModelColors[8] = 105;
                itemDef.originalModelColors[8] = 105;
                itemDef.modifiedModelColors[9] = 44603;
                itemDef.originalModelColors[9] = 17350;
                itemDef.modifiedModelColors[10] = 44570;
                itemDef.originalModelColors[10] = 17350;
                itemDef.modifiedModelColors[11] = 4500;
                itemDef.originalModelColors[11] = 17350;
                itemDef.modelZoom = 1616;
                itemDef.modelRotation1 = 396;
                itemDef.modelRotation2 = 1050;
                itemDef.modelOffset2 = -3;
                itemDef.modelOffset1 = 4;
                itemDef.femaleEquipt = 40940;
                itemDef.maleEquipt = 40940;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 8721: {
                itemDef.groundModelId = 40920;
                itemDef.name = "Shaded spirit shield";
                itemDef.description = "It's a Spectral spirit shield";
                itemDef.modifiedModelColors = new int[13];
                itemDef.originalModelColors = new int[13];
                itemDef.modifiedModelColors[0] = 44635;
                itemDef.originalModelColors[0] = 6028;
                itemDef.modifiedModelColors[1] = 44612;
                itemDef.originalModelColors[1] = 6028;
                itemDef.modifiedModelColors[2] = 44606;
                itemDef.originalModelColors[2] = 6028;
                itemDef.modifiedModelColors[3] = 44615;
                itemDef.originalModelColors[3] = 6028;
                itemDef.modifiedModelColors[4] = 44641;
                itemDef.originalModelColors[4] = 6028;
                itemDef.modifiedModelColors[5] = 44564;
                itemDef.originalModelColors[5] = 6028;
                itemDef.modifiedModelColors[6] = 44575;
                itemDef.originalModelColors[6] = 6028;
                itemDef.modifiedModelColors[7] = 44618;
                itemDef.originalModelColors[7] = 6028;
                itemDef.modifiedModelColors[8] = 105;
                itemDef.originalModelColors[8] = 105;
                itemDef.modifiedModelColors[9] = 44603;
                itemDef.originalModelColors[9] = 6028;
                itemDef.modifiedModelColors[10] = 44570;
                itemDef.originalModelColors[10] = 6028;
                itemDef.modifiedModelColors[11] = 4500;
                itemDef.originalModelColors[11] = 6028;
                itemDef.modelZoom = 1616;
                itemDef.modelRotation1 = 396;
                itemDef.modelRotation2 = 1050;
                itemDef.modelOffset2 = -3;
                itemDef.modelOffset1 = 4;
                itemDef.femaleEquipt = 40940;
                itemDef.maleEquipt = 40940;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 8723: {
                itemDef.groundModelId = 40920;
                itemDef.name = "DragonBone shield";
                itemDef.description = "It's a Spectral spirit shield";
                itemDef.modifiedModelColors = new int[13];
                itemDef.originalModelColors = new int[13];
                itemDef.modifiedModelColors[0] = 44635;
                itemDef.originalModelColors[0] = 44635;
                itemDef.modifiedModelColors[1] = 44612;
                itemDef.originalModelColors[1] = 44612;
                itemDef.modifiedModelColors[2] = 44606;
                itemDef.originalModelColors[2] = 44606;
                itemDef.modifiedModelColors[3] = 44615;
                itemDef.originalModelColors[3] = 44615;
                itemDef.modifiedModelColors[4] = 44641;
                itemDef.originalModelColors[4] = 6028;
                itemDef.modifiedModelColors[5] = 44564;
                itemDef.originalModelColors[5] = 44564;
                itemDef.modifiedModelColors[6] = 44575;
                itemDef.originalModelColors[6] = 44575;
                itemDef.modifiedModelColors[7] = 44618;
                itemDef.originalModelColors[7] = 44618;
                itemDef.modifiedModelColors[8] = 105;
                itemDef.originalModelColors[8] = 1;
                itemDef.modifiedModelColors[9] = 44603;
                itemDef.originalModelColors[9] = 44603;
                itemDef.modifiedModelColors[10] = 44570;
                itemDef.originalModelColors[10] = 6028;
                itemDef.modifiedModelColors[11] = 4500;
                itemDef.originalModelColors[11] = 4500;
                itemDef.modelZoom = 1616;
                itemDef.modelRotation1 = 396;
                itemDef.modelRotation2 = 1050;
                itemDef.modelOffset2 = -3;
                itemDef.modelOffset1 = 4;
                itemDef.femaleEquipt = 40940;
                itemDef.maleEquipt = 40940;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                break;
            }
            case 8711: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 17350;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Lime h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14018: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 6028;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Bronze h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14019: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 33;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Iron h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14020: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 61;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Steel h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14021: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 6020;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Black h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14022: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 255;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "White h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14023: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 43297;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Mithril h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14024: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 21662;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Adamant h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14025: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 36252;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Rune h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14026: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 945;
                itemDef.originalModelColors[0] = 926;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Dragon h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14027: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 6073;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Lava h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14028: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.rdc3 = 521111;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Pink hell h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14029: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.rdc3 = 225555;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Green hell h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14030: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.rdc3 = 152222;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Lime hell h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14031: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.rdc3 = 834788;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "White hell h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14032: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.rdc3 = 1555;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Bronze hell h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14033: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.rdc3 = 52666;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Purple hell h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14034: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 51136;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Purple h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14035: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 290770;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Blurite h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 14036: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.itemActions[4] = "Drop";
                itemDef.modifiedModelColors = new int[1];
                itemDef.originalModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 926;
                itemDef.originalModelColors[0] = 226770;
                itemDef.groundModelId = 2438;
                itemDef.modelZoom = 730;
                itemDef.modelRotation1 = 516;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.modelOffset2 = -10;
                itemDef.femaleEquipt = 3188;
                itemDef.maleEquipt = 3192;
                itemDef.name = "Aqua h'ween Mask";
                itemDef.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 938: {
                itemDef.name = "Robin hood hat";
                itemDef.groundModelId = 3021;
                itemDef.stackable = false;
                itemDef.modifiedModelColors = new int[3];
                itemDef.originalModelColors = new int[3];
                itemDef.modifiedModelColors[0] = 15009;
                itemDef.originalModelColors[0] = 3745;
                itemDef.modifiedModelColors[1] = 17294;
                itemDef.originalModelColors[1] = 3982;
                itemDef.modifiedModelColors[2] = 15252;
                itemDef.originalModelColors[2] = 3988;
                itemDef.modelZoom = 650;
                itemDef.modelRotation1 = 2044;
                itemDef.modelRotation2 = 256;
                itemDef.modelOffset1 = -3;
                itemDef.modelOffset2 = -2;
                itemDef.femaleEquipt = 3378;
                itemDef.maleEquipt = 3382;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 939: {
                itemDef.name = "Robin hood hat";
                itemDef.groundModelId = 3021;
                itemDef.stackable = false;
                itemDef.modifiedModelColors = new int[3];
                itemDef.originalModelColors = new int[3];
                itemDef.modifiedModelColors[0] = 15009;
                itemDef.originalModelColors[0] = 30847;
                itemDef.modifiedModelColors[1] = 17294;
                itemDef.originalModelColors[1] = 32895;
                itemDef.modifiedModelColors[2] = 15252;
                itemDef.originalModelColors[2] = 30847;
                itemDef.modelZoom = 650;
                itemDef.modelRotation1 = 2044;
                itemDef.modelRotation2 = 256;
                itemDef.modelOffset1 = -3;
                itemDef.modelOffset2 = -2;
                itemDef.femaleEquipt = 3378;
                itemDef.maleEquipt = 3382;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 940: {
                itemDef.name = "Robin hood hat";
                itemDef.groundModelId = 3021;
                itemDef.stackable = false;
                itemDef.modifiedModelColors = new int[3];
                itemDef.originalModelColors = new int[3];
                itemDef.modifiedModelColors[0] = 15009;
                itemDef.originalModelColors[0] = 10015;
                itemDef.modifiedModelColors[1] = 17294;
                itemDef.originalModelColors[1] = 7730;
                itemDef.modifiedModelColors[2] = 15252;
                itemDef.originalModelColors[2] = 7973;
                itemDef.modelZoom = 650;
                itemDef.modelRotation1 = 2044;
                itemDef.modelRotation2 = 256;
                itemDef.modelOffset1 = -3;
                itemDef.modelOffset2 = -2;
                itemDef.femaleEquipt = 3378;
                itemDef.maleEquipt = 3382;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 941: {
                itemDef.name = "Robin hood hat";
                itemDef.groundModelId = 3021;
                itemDef.stackable = false;
                itemDef.modifiedModelColors = new int[3];
                itemDef.originalModelColors = new int[3];
                itemDef.modifiedModelColors[0] = 15009;
                itemDef.originalModelColors[0] = 35489;
                itemDef.modifiedModelColors[1] = 17294;
                itemDef.originalModelColors[1] = 37774;
                itemDef.modifiedModelColors[2] = 15252;
                itemDef.originalModelColors[2] = 35732;
                itemDef.modelZoom = 650;
                itemDef.modelRotation1 = 2044;
                itemDef.modelRotation2 = 256;
                itemDef.modelOffset1 = -3;
                itemDef.modelOffset2 = -2;
                itemDef.femaleEquipt = 3378;
                itemDef.maleEquipt = 3382;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 904: {
                itemDef.name = "Gnome scarf";
                itemDef.stackable = false;
                itemDef.groundModelId = 17125;
                itemDef.modifiedModelColors = new int[3];
                itemDef.originalModelColors = new int[3];
                itemDef.modifiedModelColors[0] = 119;
                itemDef.originalModelColors[0] = 7737;
                itemDef.modifiedModelColors[1] = 103;
                itemDef.originalModelColors[1] = 7737;
                itemDef.modifiedModelColors[2] = 127;
                itemDef.originalModelColors[2] = 7737;
                itemDef.modelZoom = 919;
                itemDef.modelRotation1 = 595;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = -7;
                itemDef.modelOffset2 = 8;
                itemDef.femaleEquipt = 17155;
                itemDef.maleEquipt = 17157;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 943: {
                itemDef.name = "Gnome scarf";
                itemDef.groundModelId = 17125;
                itemDef.stackable = false;
                itemDef.modifiedModelColors = new int[3];
                itemDef.originalModelColors = new int[3];
                itemDef.modifiedModelColors[0] = 119;
                itemDef.originalModelColors[0] = 725;
                itemDef.modifiedModelColors[1] = 103;
                itemDef.originalModelColors[1] = 725;
                itemDef.modifiedModelColors[2] = 127;
                itemDef.originalModelColors[2] = 725;
                itemDef.modelZoom = 919;
                itemDef.modelRotation1 = 595;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = -7;
                itemDef.modelOffset2 = 8;
                itemDef.femaleEquipt = 17155;
                itemDef.maleEquipt = 17157;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 906: {
                itemDef.name = "Gnome scarf";
                itemDef.groundModelId = 17125;
                itemDef.stackable = false;
                itemDef.modifiedModelColors = new int[3];
                itemDef.originalModelColors = new int[3];
                itemDef.modifiedModelColors[0] = 119;
                itemDef.originalModelColors[0] = -22250;
                itemDef.modifiedModelColors[1] = 103;
                itemDef.originalModelColors[1] = -22250;
                itemDef.modifiedModelColors[2] = 127;
                itemDef.originalModelColors[2] = -22250;
                itemDef.modelZoom = 919;
                itemDef.modelRotation1 = 595;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = -7;
                itemDef.modelOffset2 = 8;
                itemDef.femaleEquipt = 17155;
                itemDef.maleEquipt = 17157;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 899: {
                itemDef.name = "Gnome scarf";
                itemDef.groundModelId = 17125;
                itemDef.stackable = false;
                itemDef.modifiedModelColors = new int[3];
                itemDef.originalModelColors = new int[3];
                itemDef.modifiedModelColors[0] = 119;
                itemDef.originalModelColors[0] = 23970;
                itemDef.modifiedModelColors[1] = 103;
                itemDef.originalModelColors[1] = 23970;
                itemDef.modifiedModelColors[2] = 127;
                itemDef.originalModelColors[2] = 23970;
                itemDef.modelZoom = 919;
                itemDef.modelRotation1 = 595;
                itemDef.modelRotation2 = 0;
                itemDef.modelOffset1 = -7;
                itemDef.modelOffset2 = 8;
                itemDef.femaleEquipt = 17155;
                itemDef.maleEquipt = 17157;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 19904: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 57300;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Pink Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19905: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 1;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Black Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19906: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 33;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Iron Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19908: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 21662;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Adamant Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19909: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 43297;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Mithirl Whip";
                itemDef.stackable = false;
                itemDef.description = "a weapon from the abyss";
                break;
            }
            case 19910: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 49823;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Elemental Whip";
                itemDef.stackable = false;
                itemDef.description = "a weapon from the abyss";
                break;
            }
            case 19911: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 17350;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Lime Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19913: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 43072;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Steel Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19914: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 36133;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Rune Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19915: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 7833;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Barrows Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19916: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 6073;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Lava Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19907: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 6028;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Bronze Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19912: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 1000;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "Dragon Whip";
                itemDef.stackable = false;
                itemDef.description = "A weapon from the abyss.";
                break;
            }
            case 19917: {
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.originalModelColors = new int[1];
                itemDef.originalModelColors[0] = 255;
                itemDef.modifiedModelColors = new int[1];
                itemDef.modifiedModelColors[0] = 944;
                itemDef.groundModelId = 5412;
                itemDef.modelZoom = 840;
                itemDef.modelRotation1 = 280;
                itemDef.modelRotation2 = 0;
                itemDef.anInt204 = 0;
                itemDef.modelOffset1 = -2;
                itemDef.modelOffset2 = 56;
                itemDef.femaleEquipt = 5409;
                itemDef.maleEquipt = 5409;
                itemDef.anInt188 = -1;
                itemDef.anInt164 = -1;
                itemDef.anInt175 = -1;
                itemDef.anInt197 = -1;
                itemDef.name = "White Whip";
                itemDef.description = "A weapon from the abyss.";
                itemDef.stackable = false;
                break;
            }
            case 798: {
                itemDef.name = "Trickster helm";
                itemDef.description = "Its a Trickster helm";
                itemDef.maleEquipt = 44764;
                itemDef.femaleEquipt = 44764;
                itemDef.groundModelId = 45328;
                itemDef.modelRotation1 = 5;
                itemDef.modelRotation2 = 1889;
                itemDef.modelZoom = 738;
                itemDef.modelOffset2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 796: {
                itemDef.name = "Trickster robe";
                itemDef.description = "Its a Trickster robe";
                itemDef.maleEquipt = 44786;
                itemDef.femaleEquipt = 44786;
                itemDef.groundModelId = 45329;
                itemDef.modelRotation1 = 593;
                itemDef.modelRotation2 = 2041;
                itemDef.modelZoom = 1420;
                itemDef.modelOffset2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 797: {
                itemDef.name = "Trickster robe legs";
                itemDef.description = "Its a Trickster robe";
                itemDef.maleEquipt = 44770;
                itemDef.femaleEquipt = 44770;
                itemDef.groundModelId = 45335;
                itemDef.modelRotation1 = 567;
                itemDef.modelRotation2 = 1023;
                itemDef.modelZoom = 2105;
                itemDef.modelOffset2 = 0;
                itemDef.modelOffset1 = 0;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                break;
            }
            case 1685: {
                itemDef.groundModelId = 45316;
                itemDef.name = "Trickster boots";
                itemDef.description = "Its a Trickster boot";
                itemDef.modelZoom = 848;
                itemDef.modelRotation2 = 141;
                itemDef.modelRotation1 = 141;
                itemDef.modelOffset1 = -9;
                itemDef.modelOffset2 = 0;
                itemDef.stackable = false;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.maleEquipt = 44757;
                itemDef.femaleEquipt = 44757;
                break;
            }
            case 894: {
                itemDef.groundModelId = 45317;
                itemDef.name = "Trickster gloves";
                itemDef.description = "Its a Trickster glove";
                itemDef.modelZoom = 830;
                itemDef.modelRotation2 = 150;
                itemDef.modelRotation1 = 536;
                itemDef.modelOffset1 = 1;
                itemDef.modelOffset2 = 3;
                itemDef.stackable = false;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.maleEquipt = 44761;
                itemDef.femaleEquipt = 44761;
                break;
            }
            case 895: {
                itemDef.groundModelId = 44633;
                itemDef.name = "Vanguard helm";
                itemDef.description = "Its a Vanguard helm";
                itemDef.modelZoom = 855;
                itemDef.modelRotation1 = 1966;
                itemDef.modelRotation2 = 5;
                itemDef.modelOffset2 = 4;
                itemDef.modelOffset1 = -1;
                itemDef.stackable = false;
                itemDef.itemActions = new String[5];
                itemDef.itemActions[1] = "Wear";
                itemDef.maleEquipt = 44769;
                itemDef.femaleEquipt = 44769;
                break;
            }
            case 896: {
                itemDef.groundModelId = 44627;
                itemDef.name = "Vanguard body";
                itemDef.description = "Its a Vanguard body";
                itemDef.modelZoom = 1513;
                itemDef.modelRotation2 = 2041;
                itemDef.modelRotation1 = 593;
                var1_1.modelOffset1 = 3;
                var1_1.modelOffset2 = -11;
                var1_1.stackable = false;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.maleEquipt = 44812;
                var1_1.femaleEquipt = 44812;
                break;
            }
            case 2052: {
                var1_1.groundModelId = 79903;
                var1_1.name = "Vanguard legs";
                var1_1.description = "Its a Vanguard legs";
                var1_1.modelZoom = 1711;
                var1_1.modelRotation2 = 0;
                var1_1.modelRotation1 = 360;
                var1_1.modelOffset1 = 3;
                var1_1.modelOffset2 = -11;
                var1_1.stackable = false;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.maleEquipt = 44768;
                var1_1.femaleEquipt = 44768;
                break;
            }
            case 898: {
                var1_1.groundModelId = 79340;
                var1_1.name = "Vanguard gloves";
                var1_1.description = "Its a Vanguard glove";
                var1_1.modelZoom = 830;
                var1_1.modelRotation2 = 0;
                var1_1.modelRotation1 = 536;
                var1_1.modelOffset1 = 9;
                var1_1.modelOffset2 = 3;
                var1_1.stackable = false;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.maleEquipt = 44758;
                var1_1.femaleEquipt = 44758;
                break;
            }
            case 18995: {
                var1_1.groundModelId = 44700;
                var1_1.name = "Vanguard boots";
                var1_1.description = "Its a Vanguard boot";
                var1_1.modelZoom = 848;
                var1_1.modelRotation2 = 141;
                var1_1.modelRotation1 = 141;
                var1_1.modelOffset1 = 4;
                var1_1.modelOffset2 = 0;
                var1_1.stackable = false;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.maleEquipt = 44752;
                var1_1.femaleEquipt = 44752;
                break;
            }
            case 900: {
                var1_1.groundModelId = 44704;
                var1_1.name = "Battle-mage hat";
                var1_1.description = "Its a Battle-mage hat";
                var1_1.modelZoom = 658;
                var1_1.modelRotation2 = 1898;
                var1_1.modelRotation1 = 2;
                var1_1.modelOffset1 = 12;
                var1_1.modelOffset2 = 3;
                var1_1.stackable = false;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.maleEquipt = 44767;
                var1_1.femaleEquipt = 44767;
                break;
            }
            case 901: {
                var1_1.groundModelId = 44631;
                var1_1.name = "Battle-mage robe";
                var1_1.description = "Its a Battle-mage robe";
                var1_1.modelZoom = 1382;
                var1_1.modelRotation2 = 3;
                var1_1.modelRotation1 = 488;
                var1_1.modelOffset1 = 1;
                var1_1.modelOffset2 = 0;
                var1_1.stackable = false;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.maleEquipt = 44818;
                var1_1.femaleEquipt = 44818;
                break;
            }
            case 902: {
                var1_1.groundModelId = 44672;
                var1_1.name = "Battle-mage robe legs";
                var1_1.description = "Its a Battle-mage legs";
                var1_1.modelZoom = 1842;
                var1_1.modelRotation2 = 1024;
                var1_1.modelRotation1 = 498;
                var1_1.modelOffset1 = 4;
                var1_1.modelOffset2 = -1;
                var1_1.stackable = false;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.maleEquipt = 44775;
                var1_1.femaleEquipt = 44775;
                break;
            }
            case 903: {
                var1_1.groundModelId = 44662;
                var1_1.name = "Battle-mage boots";
                var1_1.description = "Its a Battle-mage boot";
                var1_1.modelZoom = 987;
                var1_1.modelRotation2 = 1988;
                var1_1.modelRotation1 = 188;
                var1_1.modelOffset1 = -8;
                var1_1.modelOffset2 = 5;
                var1_1.stackable = false;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.maleEquipt = 44755;
                var1_1.femaleEquipt = 44755;
                break;
            }
            case 18994: {
                var1_1.groundModelId = 79341;
                var1_1.name = "Battle-mage gloves";
                var1_1.description = "Its a Battle-mage glove";
                var1_1.modelZoom = 1053;
                var1_1.modelRotation2 = 0;
                var1_1.modelRotation1 = 536;
                var1_1.modelOffset1 = 3;
                var1_1.modelOffset2 = 0;
                var1_1.stackable = false;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.maleEquipt = 44762;
                var1_1.femaleEquipt = 44762;
                break;
            }
            case 19016: {
                var1_1.name = "Mario chomp chomp";
                var1_1.value = 2000000000;
                var1_1.femaleEquipt = 19016;
                var1_1.maleEquipt = 19016;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                var1_1.groundModelId = 19016;
                var1_1.stackable = false;
                var1_1.description = "Chomp Chomp!!";
                var1_1.modelZoom = 1250;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wield";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 484;
                break;
            }
            case 19017: {
                var1_1.name = "Iron Man Hat";
                var1_1.value = 2000000000;
                var1_1.femaleEquipt = 71924;
                var1_1.maleEquipt = 71924;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                var1_1.groundModelId = 728;
                var1_1.stackable = false;
                var1_1.description = "Some metalics shits!";
                var1_1.modelZoom = 1250;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wield";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 484;
                break;
            }
            case 19019: {
                var1_1.groundModelId = 4423;
                var1_1.name = "MineCraft Helm";
                var1_1.description = "MineCraft Helmet";
                var1_1.modelZoom = 980;
                var1_1.modelRotation1 = 208;
                var1_1.modelRotation2 = 220;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -18;
                var1_1.femaleEquipt = 4424;
                var1_1.maleEquipt = 4424;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Craft";
                break;
            }
            case 19022: {
                var1_1.groundModelId = 12234;
                var1_1.name = "Bandos C'bow";
                var1_1.description = "Its a cbow make be bandos.";
                var1_1.modelZoom = 1100;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 550;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -1;
                var1_1.femaleEquipt = 12233;
                var1_1.maleEquipt = 12233;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 19023: {
                var1_1.groundModelId = 13421;
                var1_1.name = "Dragon C'bow";
                var1_1.description = "Its a cbow make be dragon plate.";
                var1_1.modelZoom = 1100;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 550;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -1;
                var1_1.femaleEquipt = 13422;
                var1_1.maleEquipt = 13422;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 19024: {
                var1_1.groundModelId = 13086;
                var1_1.name = "Obsidian bandos shield";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 2000;
                var1_1.modelRotation1 = 572;
                var1_1.modelRotation2 = 1000;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 16;
                var1_1.femaleEquipt = 13087;
                var1_1.maleEquipt = 13087;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 19025: {
                var1_1.groundModelId = 8394;
                var1_1.name = "Birdy suit";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1250;
                var1_1.modelRotation1 = 494;
                var1_1.modelRotation2 = 484;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                var1_1.femaleEquipt = 8394;
                var1_1.maleEquipt = 8394;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 8878: {
                var1_1.groundModelId = 13088;
                var1_1.name = "Demon wind";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1967;
                var1_1.modelRotation1 = 434;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.femaleEquipt = 13089;
                var1_1.maleEquipt = 13089;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 19031: {
                var1_1.groundModelId = 10031;
                var1_1.name = "Paper Bag";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 2500;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 383;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -1;
                var1_1.femaleEquipt = 10031;
                var1_1.maleEquipt = 10031;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 19033: {
                var1_1.groundModelId = 14680;
                var1_1.name = "Bow of Fame";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1957;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 484;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -1;
                var1_1.femaleEquipt = 14679;
                var1_1.maleEquipt = 14679;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 19035: {
                var1_1.groundModelId = 13701;
                var1_1.name = "Deathful Kite";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1560;
                var1_1.modelRotation1 = 344;
                var1_1.modelRotation2 = 1104;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -6;
                var1_1.femaleEquipt = 13700;
                var1_1.maleEquipt = 13700;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 19036: {
                var1_1.groundModelId = 13701;
                var1_1.name = "@yel@Yellow Deathful Kite";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1560;
                var1_1.modelRotation1 = 344;
                var1_1.modelRotation2 = 1104;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -6;
                var1_1.femaleEquipt = 13700;
                var1_1.maleEquipt = 13700;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 782;
                var1_1.originalModelColors[0] = 14030;
                var1_1.modifiedModelColors[1] = 1818;
                var1_1.originalModelColors[1] = 14304;
                var1_1.modifiedModelColors[2] = 10317;
                var1_1.originalModelColors[2] = 1818;
                break;
            }
            case 19037: {
                var1_1.groundModelId = 13701;
                var1_1.name = "@gre@Lime Deathful Kite";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1560;
                var1_1.modelRotation1 = 344;
                var1_1.modelRotation2 = 1104;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -6;
                var1_1.femaleEquipt = 13700;
                var1_1.maleEquipt = 13700;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 782;
                var1_1.originalModelColors[0] = 22974;
                var1_1.modifiedModelColors[1] = 1818;
                var1_1.originalModelColors[1] = 17350;
                var1_1.modifiedModelColors[2] = 10317;
                var1_1.originalModelColors[2] = 1818;
                break;
            }
            case 19038: {
                var1_1.groundModelId = 13701;
                var1_1.name = "@blu@Purple Deathful Kite";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1560;
                var1_1.modelRotation1 = 344;
                var1_1.modelRotation2 = 1104;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -6;
                var1_1.femaleEquipt = 13700;
                var1_1.maleEquipt = 13700;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 782;
                var1_1.originalModelColors[0] = 46777;
                var1_1.modifiedModelColors[1] = 1818;
                var1_1.originalModelColors[1] = 45510;
                var1_1.modifiedModelColors[2] = 10317;
                var1_1.originalModelColors[2] = 1818;
                break;
            }
            case 19039: {
                var1_1.groundModelId = 13701;
                var1_1.name = "@whi@White Deathful Kite";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1560;
                var1_1.modelRotation1 = 344;
                var1_1.modelRotation2 = 1104;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -6;
                var1_1.femaleEquipt = 13700;
                var1_1.maleEquipt = 13700;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 782;
                var1_1.originalModelColors[0] = 255;
                var1_1.modifiedModelColors[1] = 1818;
                var1_1.originalModelColors[1] = 255;
                var1_1.modifiedModelColors[2] = 10317;
                var1_1.originalModelColors[2] = 1818;
                break;
            }
            case 19040: {
                var1_1.groundModelId = 13701;
                var1_1.name = "@bla@Black Deathful Kite";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1560;
                var1_1.modelRotation1 = 344;
                var1_1.modelRotation2 = 1104;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -6;
                var1_1.femaleEquipt = 13700;
                var1_1.maleEquipt = 13700;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 782;
                var1_1.originalModelColors[0] = 1;
                var1_1.modifiedModelColors[1] = 1818;
                var1_1.originalModelColors[1] = 1;
                var1_1.modifiedModelColors[2] = 10317;
                var1_1.originalModelColors[2] = 1818;
                break;
            }
            case 19034: {
                var1_1.groundModelId = 13701;
                var1_1.name = "@blu@Blue Deathful Kite";
                var1_1.description = "Blablabla";
                var1_1.modelZoom = 1560;
                var1_1.modelRotation1 = 344;
                var1_1.modelRotation2 = 1104;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -6;
                var1_1.femaleEquipt = 13700;
                var1_1.maleEquipt = 13700;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 782;
                var1_1.originalModelColors[0] = 33743;
                var1_1.modifiedModelColors[1] = 1818;
                var1_1.originalModelColors[1] = 33251;
                var1_1.modifiedModelColors[2] = 10317;
                var1_1.originalModelColors[2] = 1818;
                break;
            }
            case 9506: {
                var1_1.name = "imagine's epic sword";
                var1_1.value = 2000000000;
                var1_1.femaleEquipt = 546;
                var1_1.maleEquipt = 546;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.groundModelId = 2754;
                var1_1.stackable = false;
                var1_1.description = "Nothing to say.";
                var1_1.modelZoom = 1561;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "@yel@ Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 354;
                var1_1.modelRotation2 = 1513;
                var1_1.modifiedModelColors = new int[6];
                var1_1.originalModelColors = new int[6];
                var1_1.modifiedModelColors[0] = 127;
                var1_1.originalModelColors[0] = 45877;
                var1_1.modifiedModelColors[1] = 82;
                var1_1.originalModelColors[1] = 35292;
                var1_1.modifiedModelColors[2] = 75;
                var1_1.originalModelColors[2] = 13013;
                var1_1.modifiedModelColors[3] = 41;
                var1_1.originalModelColors[3] = 22845;
                var1_1.modifiedModelColors[4] = 48;
                var1_1.originalModelColors[4] = 694;
                var1_1.modifiedModelColors[5] = 57;
                var1_1.originalModelColors[5] = 694;
                break;
            }
            case 9507: {
                var1_1.name = "imagine's epic scim";
                var1_1.value = 2000000000;
                var1_1.femaleEquipt = 490;
                var1_1.maleEquipt = 490;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 4;
                var1_1.modelOffset2 = -3;
                var1_1.groundModelId = 2373;
                var1_1.stackable = false;
                var1_1.description = "Nothing to say.";
                var1_1.modelZoom = 1513;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "@yel@ Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 525;
                var1_1.modelRotation2 = 40;
                var1_1.modifiedModelColors = new int[6];
                var1_1.originalModelColors = new int[6];
                var1_1.modifiedModelColors[0] = 127;
                var1_1.originalModelColors[0] = 45877;
                var1_1.modifiedModelColors[1] = 82;
                var1_1.originalModelColors[1] = 35292;
                var1_1.modifiedModelColors[2] = 75;
                var1_1.originalModelColors[2] = 13013;
                var1_1.modifiedModelColors[3] = 41;
                var1_1.originalModelColors[3] = 22845;
                var1_1.modifiedModelColors[4] = 48;
                var1_1.originalModelColors[4] = 694;
                var1_1.modifiedModelColors[5] = 57;
                var1_1.originalModelColors[5] = 694;
                break;
            }
            case 4000: {
                var1_1.name = "@blu@Mastering ranging cape";
                var1_1.value = 2147000000;
                var1_1.femaleEquipt = 18948;
                var1_1.maleEquipt = 18985;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.groundModelId = 19063;
                var1_1.stackable = false;
                var1_1.description = "You must be 126 ranging to wear this mastered cape.";
                var1_1.modelZoom = 2128;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 504;
                var1_1.modelRotation2 = 0;
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 57280;
                var1_1.originalModelColors[0] = 34776;
                var1_1.modifiedModelColors[1] = 15128;
                var1_1.originalModelColors[1] = 44981;
                break;
            }
            case 4001: {
                var1_1.name = "@blu@Mastered ranging hood";
                var1_1.value = 2147000000;
                var1_1.femaleEquipt = 18914;
                var1_1.maleEquipt = 18967;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.groundModelId = 19058;
                var1_1.stackable = false;
                var1_1.description = "A hood from masted ranging.";
                var1_1.modelZoom = 720;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Put on";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 21;
                var1_1.modelRotation2 = 18;
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 960;
                var1_1.originalModelColors[0] = 44981;
                var1_1.modifiedModelColors[1] = 15128;
                var1_1.originalModelColors[1] = 34776;
                var1_1.modifiedModelColors[2] = 15252;
                var1_1.originalModelColors[2] = 34776;
                var1_1.modifiedModelColors[3] = 43968;
                var1_1.originalModelColors[3] = 34776;
                break;
            }
            case 4002: {
                var1_1.name = "@yel@Spongebob Bones";
                var1_1.value = 2147000000;
                var1_1.femaleEquipt = -1;
                var1_1.maleEquipt = -1;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.groundModelId = 2768;
                var1_1.stackable = false;
                var1_1.description = "its a bone from spongebob.";
                var1_1.modelZoom = 1830;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[0] = "Give to spongebob mom";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 216;
                var1_1.modelRotation2 = 648;
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 127;
                var1_1.originalModelColors[0] = 14302;
                break;
            }
            case 4004: {
                var1_1.name = "@yel@Perfect Hood";
                var1_1.value = 2147000000;
                var1_1.femaleEquipt = 33200;
                var1_1.maleEquipt = 33254;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -4;
                var1_1.groundModelId = 33185;
                var1_1.stackable = false;
                var1_1.description = "Its a pefect hood.";
                var1_1.modelZoom = 724;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Give a damn";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 84;
                var1_1.modelRotation2 = 1979;
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 50079;
                var1_1.originalModelColors[0] = 3002;
                var1_1.modifiedModelColors[1] = 50086;
                var1_1.originalModelColors[1] = 12761;
                var1_1.modifiedModelColors[2] = 50072;
                var1_1.originalModelColors[2] = 34784;
                var1_1.modifiedModelColors[3] = 50058;
                var1_1.originalModelColors[3] = 46015;
                break;
            }
            case 4005: {
                var1_1.name = "@yel@Perfect coins";
                var1_1.value = 2147000000;
                var1_1.femaleEquipt = -1;
                var1_1.maleEquipt = -1;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 3;
                var1_1.modelOffset2 = 0;
                var1_1.groundModelId = 2484;
                var1_1.stackable = true;
                var1_1.description = "Its a pefect key.";
                var1_1.modelZoom = 710;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 184;
                var1_1.modelRotation2 = 2012;
                var1_1.modifiedModelColors = new int[5];
                var1_1.originalModelColors = new int[5];
                var1_1.modifiedModelColors[0] = 8128;
                var1_1.originalModelColors[0] = 46767;
                break;
            }
            case 12150: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.groundModelId = 14125;
                var1_1.modelZoom = 2000;
                var1_1.modelRotation1 = 572;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.anInt204 = 0;
                var1_1.femaleEquipt = 14126;
                var1_1.maleEquipt = 14126;
                var1_1.anInt188 = -1;
                var1_1.anInt164 = -1;
                var1_1.anInt175 = -1;
                var1_1.anInt197 = -1;
                var1_1.name = "Mod Cape";
                var1_1.stackable = false;
                var1_1.description = "A cape worn by player Moderators.";
                break;
            }
            case 12151: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.groundModelId = 14127;
                var1_1.modelZoom = 2000;
                var1_1.modelRotation1 = 572;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.anInt204 = 0;
                var1_1.femaleEquipt = 14128;
                var1_1.maleEquipt = 14128;
                var1_1.anInt188 = -1;
                var1_1.anInt164 = -1;
                var1_1.anInt175 = -1;
                var1_1.anInt197 = -1;
                var1_1.name = "Admin Cape";
                var1_1.description = "A cape worn by Administrators";
                break;
            }
            case 1391: {
                var1_1.name = "Ethereal battlestaff";
                var1_1.description = "Provides extra damage while casting the storm of ethereal";
                var1_1.maleEquipt = 53577;
                var1_1.femaleEquipt = 53577;
                var1_1.groundModelId = 58945;
                var1_1.modelRotation1 = 450;
                var1_1.modelRotation2 = 1330;
                var1_1.modelZoom = 2925;
                var1_1.modelOffset2 = 0;
                var1_1.modelOffset1 = 0;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                break;
            }
            case 12152: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.groundModelId = 14129;
                var1_1.modelZoom = 2000;
                var1_1.modelRotation1 = 572;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.anInt204 = 0;
                var1_1.femaleEquipt = 14130;
                var1_1.maleEquipt = 14130;
                var1_1.anInt188 = -1;
                var1_1.anInt164 = -1;
                var1_1.anInt175 = -1;
                var1_1.anInt197 = -1;
                var1_1.name = "Owner Cape";
                var1_1.description = "A cape worn by Owners.";
                break;
            }
            case 8713: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 10388;
                var1_1.groundModelId = 2438;
                var1_1.modelZoom = 730;
                var1_1.modelRotation1 = 516;
                var1_1.modelRotation2 = 0;
                var1_1.anInt204 = 0;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -10;
                var1_1.femaleEquipt = 3188;
                var1_1.maleEquipt = 3192;
                var1_1.name = "Barrows h'ween Mask";
                var1_1.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 8715: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 6028;
                var1_1.groundModelId = 2438;
                var1_1.modelZoom = 730;
                var1_1.modelRotation1 = 516;
                var1_1.modelRotation2 = 0;
                var1_1.anInt204 = 0;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -10;
                var1_1.femaleEquipt = 3188;
                var1_1.maleEquipt = 3192;
                var1_1.name = "Shaded h'ween Mask";
                var1_1.description = "AaaarrrgmodelRotation1h... I'm a monster.";
                break;
            }
            case 19997: {
                var1_1.name = "Mod body";
                var1_1.value = 60000;
                var1_1.femaleEquipt = 12847;
                var1_1.maleEquipt = 14436;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 1;
                var1_1.modelOffset2 = 0;
                var1_1.groundModelId = 19853;
                var1_1.stackable = false;
                var1_1.description = "mod body bitch gtfo if your not a mod.";
                var1_1.modelZoom = 1447;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 539;
                var1_1.modelRotation2 = 0;
                break;
            }
            case 19996: {
                var1_1.name = "Mod legs";
                var1_1.value = 60000;
                var1_1.femaleEquipt = 12845;
                var1_1.maleEquipt = 14418;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 8;
                var1_1.modelOffset2 = 7;
                var1_1.groundModelId = 18109;
                var1_1.stackable = false;
                var1_1.description = "mod legs bitch gtfo if your not a mod.";
                var1_1.modelZoom = 1742;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 526;
                var1_1.modelRotation2 = 229;
                break;
            }
            case 19995: {
                var1_1.name = "Mod boots";
                var1_1.value = 60000;
                var1_1.femaleEquipt = 10367;
                var1_1.maleEquipt = 14398;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -7;
                var1_1.groundModelId = 21879;
                var1_1.stackable = false;
                var1_1.description = "mod boots bitch gtfo if your not a mod.";
                var1_1.modelZoom = 615;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 173;
                var1_1.modelRotation2 = 2039;
                break;
            }
            case 19994: {
                var1_1.name = "Mod gloves";
                var1_1.value = 60000;
                var1_1.femaleEquipt = 12839;
                var1_1.maleEquipt = 14406;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelOffset1 = 3;
                var1_1.modelOffset2 = -4;
                var1_1.groundModelId = 12839;
                var1_1.stackable = false;
                var1_1.description = "mod gloves bitch gtfo if your not a mod.";
                var1_1.modelZoom = 658;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modelRotation1 = 485;
                var1_1.modelRotation2 = 0;
                break;
            }
            case 4278: {
                var1_1.name = "@gre@Unicorns Token";
                break;
            }
            case 3606: {
                var1_1.name = "@yel@Yellow Key";
                break;
            }
            case 13234: {
                var1_1.name = "@yel@Custom Key";
                break;
            }
            case 13360: {
                var1_1.groundModelId = 62701;
                var1_1.name = "Torva platelegs";
                var1_1.description = "Torva platelegs.";
                var1_1.modelZoom = 1740;
                var1_1.modelRotation1 = 474;
                var1_1.modelRotation2 = 2045;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -5;
                var1_1.femaleEquipt = 62743;
                var1_1.maleEquipt = 62760;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[2] = "Check-charges";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 13358: {
                var1_1.groundModelId = 62699;
                var1_1.name = "Torva platebody";
                var1_1.description = "Torva Platebody.";
                var1_1.modelZoom = 1506;
                var1_1.modelRotation1 = 473;
                var1_1.modelRotation2 = 2042;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.femaleEquipt = 62746;
                var1_1.maleEquipt = 62762;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[2] = "Check-charges";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 13355: {
                var1_1.groundModelId = 62693;
                var1_1.name = "Pernix cowl";
                var1_1.description = "Pernix cowl";
                var1_1.modelZoom = 800;
                var1_1.modelRotation1 = 532;
                var1_1.modelRotation2 = 14;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = 1;
                var1_1.femaleEquipt = 62739;
                var1_1.maleEquipt = 62756;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[2] = "Check-charges";
                var1_1.itemActions[4] = "Drop";
                var1_1.anInt175 = 62731;
                var1_1.anInt197 = 62727;
                break;
            }
            case 15152: {
                var1_1.groundModelId = 2635;
                var1_1.name = "Black Partyhat";
                var1_1.description = "A new color :3";
                var1_1.modelZoom = 440;
                var1_1.modelRotation2 = 1845;
                var1_1.modelRotation1 = 121;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.stackable = false;
                var1_1.value = 1;
                var1_1.femaleEquipt = 187;
                var1_1.maleEquipt = 363;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 1;
                break;
            }
            case 19877: {
                var1_1.groundModelId = 2635;
                var1_1.name = "Pink Partyhat";
                var1_1.description = "A new color :3";
                var1_1.modelZoom = 440;
                var1_1.modelRotation2 = 1845;
                var1_1.modelRotation1 = 121;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.stackable = false;
                var1_1.value = 1;
                var1_1.femaleEquipt = 187;
                var1_1.maleEquipt = 363;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 57050;
                break;
            }
            case 15154: {
                var1_1.groundModelId = 2635;
                var1_1.name = "Cyan Partyhat";
                var1_1.description = "A new color :3";
                var1_1.modelZoom = 440;
                var1_1.modelRotation2 = 1845;
                var1_1.modelRotation1 = 121;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.stackable = false;
                var1_1.value = 1;
                var1_1.femaleEquipt = 187;
                var1_1.maleEquipt = 363;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 30296;
                break;
            }
            case 15156: {
                var1_1.groundModelId = 2635;
                var1_1.name = "Orange Partyhat";
                var1_1.description = "A new color :3";
                var1_1.modelZoom = 440;
                var1_1.modelRotation2 = 1845;
                var1_1.modelRotation1 = 121;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.stackable = false;
                var1_1.value = 1;
                var1_1.femaleEquipt = 187;
                var1_1.maleEquipt = 363;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 5947;
                break;
            }
            case 15158: {
                var1_1.groundModelId = 2635;
                var1_1.name = "God Partyhat";
                var1_1.description = "A new color :3";
                var1_1.modelZoom = 440;
                var1_1.modelRotation2 = 1845;
                var1_1.modelRotation1 = 121;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.stackable = false;
                var1_1.value = 1;
                var1_1.femaleEquipt = 187;
                var1_1.maleEquipt = 363;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 44580;
                break;
            }
            case 15160: {
                var1_1.groundModelId = 2635;
                var1_1.name = "Abyss Partyhat";
                var1_1.description = "A new color :3";
                var1_1.modelZoom = 440;
                var1_1.modelRotation2 = 1845;
                var1_1.modelRotation1 = 121;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.stackable = false;
                var1_1.value = 1;
                var1_1.femaleEquipt = 187;
                var1_1.maleEquipt = 363;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 63650;
                break;
            }
            case 15162: {
                var1_1.groundModelId = 2635;
                var1_1.name = "Forest Partyhat";
                var1_1.description = "A new color :3";
                var1_1.modelZoom = 440;
                var1_1.modelRotation2 = 1845;
                var1_1.modelRotation1 = 121;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.stackable = false;
                var1_1.value = 1;
                var1_1.femaleEquipt = 187;
                var1_1.maleEquipt = 363;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 25371;
                break;
            }
            case 15164: {
                var1_1.groundModelId = 2635;
                var1_1.name = "Sky Partyhat";
                var1_1.description = "A new color :3";
                var1_1.modelZoom = 440;
                var1_1.modelRotation2 = 1845;
                var1_1.modelRotation1 = 121;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 1;
                var1_1.stackable = false;
                var1_1.value = 1;
                var1_1.femaleEquipt = 187;
                var1_1.maleEquipt = 363;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 34258;
                break;
            }
            case 18743: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 0;
                var1_1.groundModelId = 3288;
                var1_1.modelZoom = 2500;
                var1_1.modelRotation1 = 1500;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = -40;
                var1_1.modelOffset2 = -90;
                var1_1.femaleEquipt = 79902;
                var1_1.maleEquipt = 79902;
                var1_1.anInt175 = 14;
                var1_1.anInt197 = 7;
                var1_1.name = "@red@Death cape@red@";
                break;
            }
            case 19010: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 0;
                var1_1.groundModelId = 3288;
                var1_1.modelZoom = 2500;
                var1_1.modelRotation1 = 1500;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = -40;
                var1_1.modelOffset2 = -90;
                var1_1.femaleEquipt = 79902;
                var1_1.maleEquipt = 79902;
                var1_1.anInt175 = 14;
                var1_1.anInt197 = 7;
                var1_1.name = "@yel@Death cape@red@";
                var1_1.modifiedModelColors = new int[7];
                var1_1.originalModelColors = new int[7];
                var1_1.modifiedModelColors[0] = 1;
                var1_1.originalModelColors[0] = 14030;
                var1_1.modifiedModelColors[1] = 9230;
                var1_1.originalModelColors[1] = 14304;
                var1_1.modifiedModelColors[2] = 11013;
                var1_1.originalModelColors[2] = 14304;
                var1_1.modifiedModelColors[3] = 23;
                var1_1.originalModelColors[3] = 14030;
                var1_1.modifiedModelColors[4] = 40036;
                var1_1.originalModelColors[4] = 14030;
                var1_1.modifiedModelColors[5] = 10348;
                var1_1.originalModelColors[5] = 14030;
                var1_1.modifiedModelColors[6] = 1822;
                var1_1.originalModelColors[6] = 14030;
                break;
            }
            case 19013: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 0;
                var1_1.groundModelId = 3288;
                var1_1.modelZoom = 2500;
                var1_1.modelRotation1 = 1500;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = -40;
                var1_1.modelOffset2 = -90;
                var1_1.femaleEquipt = 79902;
                var1_1.maleEquipt = 79902;
                var1_1.anInt175 = 14;
                var1_1.anInt197 = 7;
                var1_1.name = "@blu@Death cape@red@";
                var1_1.modifiedModelColors = new int[7];
                var1_1.originalModelColors = new int[7];
                var1_1.modifiedModelColors[0] = 1;
                var1_1.originalModelColors[0] = 33743;
                var1_1.modifiedModelColors[1] = 9230;
                var1_1.originalModelColors[1] = 33251;
                var1_1.modifiedModelColors[2] = 11013;
                var1_1.originalModelColors[2] = 33251;
                var1_1.modifiedModelColors[3] = 23;
                var1_1.originalModelColors[3] = 33743;
                var1_1.modifiedModelColors[4] = 40036;
                var1_1.originalModelColors[4] = 33743;
                var1_1.modifiedModelColors[5] = 10348;
                var1_1.originalModelColors[5] = 33743;
                var1_1.modifiedModelColors[6] = 1822;
                var1_1.originalModelColors[6] = 33743;
                break;
            }
            case 19014: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 926;
                var1_1.originalModelColors[0] = 0;
                var1_1.groundModelId = 3288;
                var1_1.modelZoom = 2500;
                var1_1.modelRotation1 = 1500;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = -40;
                var1_1.modelOffset2 = -90;
                var1_1.femaleEquipt = 79902;
                var1_1.maleEquipt = 79902;
                var1_1.anInt175 = 14;
                var1_1.anInt197 = 7;
                var1_1.name = "@gre@Death cape@red@";
                var1_1.modifiedModelColors = new int[7];
                var1_1.originalModelColors = new int[7];
                var1_1.modifiedModelColors[0] = 1;
                var1_1.originalModelColors[0] = 22974;
                var1_1.modifiedModelColors[1] = 9230;
                var1_1.originalModelColors[1] = 17350;
                var1_1.modifiedModelColors[2] = 11013;
                var1_1.originalModelColors[2] = 17350;
                var1_1.modifiedModelColors[3] = 23;
                var1_1.originalModelColors[3] = 22974;
                var1_1.modifiedModelColors[4] = 40036;
                var1_1.originalModelColors[4] = 22974;
                var1_1.modifiedModelColors[5] = 10348;
                var1_1.originalModelColors[5] = 22974;
                var1_1.modifiedModelColors[6] = 1822;
                var1_1.originalModelColors[6] = 22974;
                break;
            }
            case 23000: {
                var1_1.groundModelId = 78026;
                var1_1.name = "@yel@Golden AK-47";
                var1_1.description = "The thug life chose you.";
                var1_1.modelZoom = 1579;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation2 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.femaleEquipt = 78027;
                var1_1.maleEquipt = 78027;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.stackable = false;
                var1_1.itemActions[1] = "Wear";
                break;
            }
            case 23002: {
                var1_1.groundModelId = 77566;
                var1_1.name = "Shadow boots";
                var1_1.description = "It's a " + var1_1.name + ".";
                var1_1.modelZoom = 825;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 400;
                var1_1.femaleEquipt = 77566;
                var1_1.maleEquipt = 77566;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 8334;
                var1_1.originalModelColors[0] = 32703;
                break;
            }
            case 23004: {
                var1_1.groundModelId = 77573;
                var1_1.name = "Shadow wings";
                var1_1.description = "It's a " + var1_1.name + ".";
                var1_1.modelZoom = 825;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 400;
                var1_1.femaleEquipt = 77574;
                var1_1.maleEquipt = 77574;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                var1_1.modifiedModelColors = new int[1];
                var1_1.originalModelColors = new int[1];
                var1_1.modifiedModelColors[0] = 8334;
                var1_1.originalModelColors[0] = 32703;
                break;
            }
            case 23006: {
                var1_1.groundModelId = 78010;
                var1_1.name = "Hot katana";
                var1_1.description = "Imagine ninjas only.";
                var1_1.modelZoom = 1579;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.femaleEquipt = 78011;
                var1_1.maleEquipt = 78011;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.stackable = false;
                var1_1.itemActions[1] = "Wear";
                break;
            }
            case 23008: {
                var1_1.groundModelId = 75018;
                var1_1.name = "Chainsaw";
                var1_1.description = "Got any gas?";
                var1_1.modelZoom = 1579;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.femaleEquipt = 75019;
                var1_1.maleEquipt = 75019;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                break;
            }
            case 23010: {
                var1_1.groundModelId = 90740;
                var1_1.maleEquipt = 90741;
                var1_1.femaleEquipt = 90741;
                var1_1.name = "Ironman Helmet";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 494;
                var1_1.modelOffset1 = -2;
                var1_1.modelOffset2 = 1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 0;
                break;
            }
            case 23012: {
                var1_1.groundModelId = 90742;
                var1_1.maleEquipt = 90743;
                var1_1.femaleEquipt = 90743;
                var1_1.name = "Ironman platebody";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 1224;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 5;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 10;
                break;
            }
            case 23014: {
                var1_1.groundModelId = 90744;
                var1_1.maleEquipt = 90745;
                var1_1.femaleEquipt = 90745;
                var1_1.name = "Ironman platelegs";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 1784;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = 7;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 10;
                break;
            }
            case 23016: {
                var1_1.groundModelId = 90746;
                var1_1.maleEquipt = 90747;
                var1_1.femaleEquipt = 90747;
                var1_1.name = "Ironman boots";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 729;
                var1_1.modelOffset1 = -6;
                var1_1.modelOffset2 = 10;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 2040;
                break;
            }
            case 23018: {
                var1_1.groundModelId = 90748;
                var1_1.maleEquipt = 90749;
                var1_1.femaleEquipt = 90749;
                var1_1.name = "Ironman gloves";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 494;
                var1_1.modelOffset1 = 6;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                break;
            }
            case 23020: {
                var1_1.groundModelId = 91009;
                var1_1.name = "@cya@Imagine Helm";
                var1_1.description = "Imagine a dream that came true...";
                var1_1.modelZoom = 850;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 16;
                var1_1.modelRotation1 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.femaleEquipt = 91010;
                var1_1.maleEquipt = 91010;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 23022: {
                var1_1.groundModelId = 91011;
                var1_1.name = "@cya@Imagine Body";
                var1_1.description = "Imagine a dream that came true...";
                var1_1.modelZoom = 1506;
                var1_1.modelRotation1 = 473;
                var1_1.modelRotation2 = 2042;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.femaleEquipt = 91012;
                var1_1.maleEquipt = 91012;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 23024: {
                var1_1.groundModelId = 91013;
                var1_1.name = "@cya@Imagine Legs";
                var1_1.description = "Imagine a dream that came true...";
                var1_1.modelZoom = 1579;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 333;
                var1_1.modelRotation2 = 73;
                var1_1.femaleEquipt = 91014;
                var1_1.maleEquipt = 91014;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 23026: {
                var1_1.groundModelId = 91015;
                var1_1.name = "@cya@I@or1@m@cya@a@or1@g@cya@g@or2@i@blu@n@gre@e @or1@K@cya@a@or1@t@cya@a@or1@n@cya@a";
                var1_1.description = "Imagine a dream that came true...";
                var1_1.modelZoom = 676;
                var1_1.modelRotation1 = 0;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = 3;
                var1_1.modelOffset2 = -14;
                var1_1.femaleEquipt = 91016;
                var1_1.maleEquipt = 91016;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 23028: {
                var1_1.groundModelId = 91018;
                var1_1.name = "@cya@I@or1@m@cya@a@or1@g@cya@g@or2@i@blu@n@gre@e @or1@G@cya@l@or1@o@cya@v@or1@e@cya@s";
                var1_1.description = "Imagine a dream that came true...";
                var1_1.modelZoom = 676;
                var1_1.modelRotation1 = 0;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = 3;
                var1_1.modelOffset2 = -14;
                var1_1.femaleEquipt = 91019;
                var1_1.maleEquipt = 91019;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 23030: {
                var1_1.groundModelId = 91017;
                var1_1.name = "@cya@Imagine Boots";
                var1_1.description = "Imagine a dream that came true...";
                var1_1.modelZoom = 676;
                var1_1.modelRotation1 = 0;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = 3;
                var1_1.modelOffset2 = -14;
                var1_1.femaleEquipt = 91017;
                var1_1.maleEquipt = 91017;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                break;
            }
            case 23032: {
                var1_1.name = "Trainee platelegs";
                var1_1.description = "It's a " + var1_1.name;
                var1_1.groundModelId = 91050;
                var1_1.femaleEquipt = 91051;
                var1_1.maleEquipt = 91051;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wield";
                var1_1.itemActions[4] = "Drop";
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelZoom = 540;
                var1_1.modelRotation1 = 72;
                var1_1.modelRotation2 = 136;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.stackable = false;
                break;
            }
            case 23034: {
                var1_1.name = "Trainee full helm";
                var1_1.description = "It's a " + var1_1.name;
                var1_1.groundModelId = 91052;
                var1_1.femaleEquipt = 91053;
                var1_1.maleEquipt = 91053;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wield";
                var1_1.itemActions[4] = "Drop";
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelZoom = 540;
                var1_1.modelRotation1 = 72;
                var1_1.modelRotation2 = 136;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.stackable = false;
                break;
            }
            case 23036: {
                var1_1.name = "Trainee platebody";
                var1_1.description = "It's a " + var1_1.name;
                var1_1.groundModelId = 91055;
                var1_1.femaleEquipt = 91054;
                var1_1.maleEquipt = 91054;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.itemActions[4] = "Drop";
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelZoom = 540;
                var1_1.modelRotation1 = 72;
                var1_1.modelRotation2 = 136;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.stackable = false;
                break;
            }
            case 23038: {
                var1_1.name = "Trainee Sword";
                var1_1.description = "It's a " + var1_1.name;
                var1_1.groundModelId = 91057;
                var1_1.femaleEquipt = 91056;
                var1_1.maleEquipt = 91056;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wield";
                var1_1.itemActions[4] = "Drop";
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelZoom = 540;
                var1_1.modelRotation1 = 72;
                var1_1.modelRotation2 = 136;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.stackable = false;
                break;
            }
            case 23040: {
                var1_1.groundModelId = 91100;
                var1_1.name = "Luigi's head";
                var1_1.description = "It's a Luigi's head.";
                var1_1.modelZoom = 579;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.femaleEquipt = 91101;
                var1_1.maleEquipt = 91101;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wield";
                break;
            }
            case 23042: {
                var1_1.name = "Mario's head";
                var1_1.description = "It's a Mario head.";
                var1_1.groundModelId = 91104;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wield";
                var1_1.itemActions[4] = "Drop";
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.femaleEquipt = 91105;
                var1_1.maleEquipt = 91105;
                var1_1.modelZoom = 625;
                var1_1.modelRotation1 = 72;
                var1_1.modelRotation2 = 20;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -10;
                var1_1.stackable = false;
                break;
            }
            case 23044: {
                var1_1.groundModelId = 91315;
                var1_1.femaleEquipt = 91316;
                var1_1.maleEquipt = 91316;
                var1_1.name = "@blc@Emperor Platebody";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1506;
                var1_1.modelRotation1 = 473;
                var1_1.modelRotation2 = 2042;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23046: {
                var1_1.groundModelId = 91317;
                var1_1.femaleEquipt = 91317;
                var1_1.maleEquipt = 91317;
                var1_1.name = "@blc@Emperor Boots";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 850;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 16;
                var1_1.modelRotation1 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23048: {
                var1_1.groundModelId = 91318;
                var1_1.femaleEquipt = 91319;
                var1_1.maleEquipt = 91319;
                var1_1.name = "@blc@Emperor Gloves";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1053;
                var1_1.modelRotation2 = 0;
                var1_1.modelRotation1 = 536;
                var1_1.modelOffset1 = 3;
                var1_1.modelOffset2 = 0;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23050: {
                var1_1.groundModelId = 91320;
                var1_1.femaleEquipt = 91321;
                var1_1.maleEquipt = 91321;
                var1_1.name = "@blc@Emperors Helmet";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1500;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 900;
                var1_1.modelRotation2 = 1200;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23052: {
                var1_1.groundModelId = 91323;
                var1_1.femaleEquipt = 91322;
                var1_1.maleEquipt = 91322;
                var1_1.name = "@blc@Emperors Platelegs";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1500;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 900;
                var1_1.modelRotation2 = 1200;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23054: {
                var1_1.name = "Nex soul";
                var1_1.description = "A soul";
                var1_1.groundModelId = 91349;
                var1_1.femaleEquipt = 91349;
                var1_1.maleEquipt = 91349;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[4] = "Drop";
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelZoom = 2500;
                var1_1.modelRotation1 = 700;
                var1_1.modelRotation2 = 20;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 5;
                break;
            }
            case 23056: {
                var1_1.name = "@blc@Emperor's soul";
                var1_1.description = "A soul";
                var1_1.groundModelId = 91439;
                var1_1.femaleEquipt = 91439;
                var1_1.maleEquipt = 91439;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[0] = "Combine";
                var1_1.itemActions[4] = "Drop";
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.modelZoom = 2500;
                var1_1.modelRotation1 = 700;
                var1_1.modelRotation2 = 20;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 5;
                break;
            }
            case 23058: {
                var1_1.groundModelId = 91415;
                var1_1.name = "@yel@Platinum AK-47";
                var1_1.description = "The thug life chose you.";
                var1_1.modelZoom = 1579;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.femaleEquipt = 91416;
                var1_1.maleEquipt = 91416;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.stackable = false;
                var1_1.itemActions[1] = "Wear";
                break;
            }
            case 23060: {
                var1_1.groundModelId = 91500;
                var1_1.femaleEquipt = 91501;
                var1_1.maleEquipt = 91501;
                var1_1.name = "Hunters helm";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 850;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 16;
                var1_1.modelRotation1 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23062: {
                var1_1.groundModelId = 91502;
                var1_1.femaleEquipt = 91503;
                var1_1.maleEquipt = 91503;
                var1_1.name = "Hunters platelegs";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1579;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 333;
                var1_1.modelRotation2 = 73;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23064: {
                var1_1.groundModelId = 91504;
                var1_1.femaleEquipt = 91505;
                var1_1.maleEquipt = 91505;
                var1_1.name = "Hunters platebody";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1506;
                var1_1.modelRotation1 = 473;
                var1_1.modelRotation2 = 2042;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23066: {
                var1_1.name = "Staff of 1000 Truths";
                var1_1.groundModelId = 91512;
                var1_1.modelZoom = 2256;
                var1_1.modelRotation1 = 456;
                var1_1.modelRotation2 = 513;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.femaleEquipt = 91513;
                var1_1.maleEquipt = 91513;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wield";
                break;
            }
            case 23068: {
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.groundModelId = 91514;
                var1_1.modelZoom = 1325;
                var1_1.modelRotation1 = 240;
                var1_1.modelRotation2 = 110;
                var1_1.modelOffset1 = -6;
                var1_1.modelOffset2 = -40;
                var1_1.femaleEquipt = 91516;
                var1_1.maleEquipt = 91516;
                var1_1.name = "Ascension Crossbow Offhand";
                var1_1.description = "A weapon originally developed for Armadyl's forces";
                break;
            }
            case 23070: {
                var1_1.groundModelId = 91517;
                var1_1.femaleEquipt = 91518;
                var1_1.maleEquipt = 91518;
                var1_1.name = "@sly@Oblivion helm";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 850;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 16;
                var1_1.modelRotation1 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23072: {
                var1_1.groundModelId = 91519;
                var1_1.femaleEquipt = 91520;
                var1_1.maleEquipt = 91520;
                var1_1.name = "@sly@Oblivion platelegs";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1579;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 333;
                var1_1.modelRotation2 = 73;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23074: {
                var1_1.groundModelId = 91521;
                var1_1.femaleEquipt = 91522;
                var1_1.maleEquipt = 91522;
                var1_1.name = "@sly@Oblivion platebody";
                var1_1.description = "It's an " + var1_1.name;
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1506;
                var1_1.modelRotation1 = 473;
                var1_1.modelRotation2 = 2042;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23076: {
                var1_1.groundModelId = 91523;
                var1_1.name = "@sly@Oblivion Wings";
                var1_1.description = "It's a " + var1_1.name + ".";
                var1_1.modelZoom = 1579;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 533;
                var1_1.modelRotation1 = 333;
                var1_1.femaleEquipt = 91524;
                var1_1.maleEquipt = 91524;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.stackable = false;
                var1_1.itemActions[1] = "Wear";
                break;
            }
            case 23078: {
                var1_1.groundModelId = 91581;
                var1_1.femaleEquipt = 91582;
                var1_1.maleEquipt = 91582;
                var1_1.name = "Black Knight Platebody";
                var1_1.description = "you are one rich son of a bitch";
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1506;
                var1_1.modelRotation1 = 473;
                var1_1.modelRotation2 = 2042;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23080: {
                var1_1.groundModelId = 91583;
                var1_1.femaleEquipt = 91584;
                var1_1.maleEquipt = 91584;
                var1_1.name = "Black Knight Helmet";
                var1_1.description = "you are one rich son of a bitch";
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1500;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 900;
                var1_1.modelRotation2 = 1200;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23082: {
                var1_1.groundModelId = 91585;
                var1_1.femaleEquipt = 91586;
                var1_1.maleEquipt = 91586;
                var1_1.name = "Black Knight Platelegs";
                var1_1.description = "you are one rich son of a bitch";
                var1_1.itemActions = new String[]{null, "Wield", null, null, "Drop"};
                var1_1.modelZoom = 1500;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 900;
                var1_1.modelRotation2 = 1200;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                break;
            }
            case 23084: {
                var1_1.groundModelId = 94116;
                var1_1.maleEquipt = 94117;
                var1_1.femaleEquipt = 94117;
                var1_1.name = "Samurai Hat";
                var1_1.description = "Recoloured samurai set.";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 964;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                break;
            }
            case 23086: {
                var1_1.groundModelId = 94118;
                var1_1.maleEquipt = 94119;
                var1_1.femaleEquipt = 94119;
                var1_1.name = "Samurai Body";
                var1_1.description = "Recoloured samurai set.";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 964;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                break;
            }
            case 23088: {
                var1_1.groundModelId = 94120;
                var1_1.maleEquipt = 94121;
                var1_1.femaleEquipt = 94121;
                var1_1.name = "Samurai Legs";
                var1_1.description = "Recoloured samurai set.";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 964;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                break;
            }
            case 23090: {
                var1_1.groundModelId = 94127;
                var1_1.maleEquipt = 94128;
                var1_1.femaleEquipt = 94128;
                var1_1.name = "Raiden Helm";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 1179;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                break;
            }
            case 23092: {
                var1_1.groundModelId = 94129;
                var1_1.maleEquipt = 94130;
                var1_1.femaleEquipt = 94130;
                var1_1.name = "Raiden Body";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 1054;
                var1_1.modelOffset1 = 1;
                var1_1.modelOffset2 = -3;
                var1_1.modelRotation1 = 578;
                var1_1.modelRotation2 = 10;
                break;
            }
            case 23094: {
                var1_1.groundModelId = 94131;
                var1_1.maleEquipt = 94132;
                var1_1.femaleEquipt = 94132;
                var1_1.name = "Raiden Legs";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 1614;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = 1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 2040;
                break;
            }
            case 23096: {
                var1_1.groundModelId = 94133;
                var1_1.maleEquipt = 94134;
                var1_1.femaleEquipt = 94134;
                var1_1.name = "Dark Raiden Helm";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 1109;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                break;
            }
            case 23098: {
                var1_1.groundModelId = 94135;
                var1_1.maleEquipt = 94136;
                var1_1.femaleEquipt = 94136;
                var1_1.name = "Dark Raiden Body";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 1239;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 0;
                break;
            }
            case 23100: {
                var1_1.groundModelId = 94137;
                var1_1.maleEquipt = 94138;
                var1_1.femaleEquipt = 94138;
                var1_1.name = "Dark Raiden Legs";
                var1_1.itemActions = new String[]{null, "Wear", null, null, "Drop"};
                var1_1.modelZoom = 1624;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = 1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 2040;
                break;
            }
            case 23102: {
                var1_1.groundModelId = 90092;
                var1_1.name = "Malevolent cuirass";
                var1_1.description = "It's a " + var1_1.name + ".";
                var1_1.modelZoom = 1524;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -73;
                var1_1.modelRotation1 = 333;
                var1_1.modelRotation2 = 31;
                var1_1.femaleEquipt = 90092;
                var1_1.maleEquipt = 90092;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.stackable = false;
                var1_1.itemActions[1] = "Wear";
                break;
            }
            case 23104: {
                var1_1.groundModelId = 90094;
                var1_1.name = "Malevolent greaves";
                var1_1.description = "It's a " + var1_1.name + ".";
                var1_1.modelZoom = 1244;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 0;
                var1_1.modelRotation1 = 333;
                var1_1.modelRotation2 = 5;
                var1_1.femaleEquipt = 90094;
                var1_1.maleEquipt = 90094;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.stackable = false;
                var1_1.itemActions[1] = "Wear";
                break;
            }
            case 23106: {
                var1_1.groundModelId = 90096;
                var1_1.name = "Malevolent helm";
                var1_1.description = "It's a " + var1_1.name + ".";
                var1_1.modelZoom = 1239;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -127;
                var1_1.modelRotation1 = 333;
                var1_1.modelRotation2 = 26;
                var1_1.femaleEquipt = 90096;
                var1_1.maleEquipt = 90096;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.stackable = false;
                var1_1.itemActions[1] = "Wear";
                break;
            }
            case 23108: {
                var1_1.name = "@dgr@T@gra@y@dgr@r@gra@a@dgr@n@gra@t@dgr@i@gra@t@dgr@o@gra@'@dgr@s @gra@C@dgr@a@gra@p@dgr@e";
                var1_1.groundModelId = 80346;
                var1_1.femaleEquipt = 80346;
                var1_1.maleEquipt = 80346;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                break;
            }
            case 23110: {
                var1_1.name = "The Pummeller";
                var1_1.groundModelId = 11;
                var1_1.femaleEquipt = 12;
                var1_1.maleEquipt = 12;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelRotation1 = 607;
                var1_1.modelRotation2 = 267;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.modelZoom = 1560;
                break;
            }
            case 23112: {
                var1_1.name = "Donor boots";
                var1_1.maleEquipt = 15;
                var1_1.femaleEquipt = 15;
                var1_1.groundModelId = 16;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 645;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 25;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 11;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                break;
            }
            case 23114: {
                var1_1.name = "Donor Demon Cape";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.groundModelId = 18;
                var1_1.maleEquipt = 17;
                var1_1.modelZoom = 1700;
                var1_1.modelOffset1 = -20;
                var1_1.modelOffset2 = -10;
                var1_1.modelRotation1 = 305;
                var1_1.modelRotation2 = 0;
                var1_1.femaleEquipt = 17;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23116: {
                var1_1.name = "Donor gloves";
                var1_1.groundModelId = 20;
                var1_1.maleEquipt = 19;
                var1_1.femaleEquipt = 19;
                var1_1.modelZoom = 610;
                var1_1.modelOffset1 = 1;
                var1_1.modelOffset2 = -6;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23118: {
                var1_1.name = "Donor Helm";
                var1_1.maleEquipt = 21;
                var1_1.femaleEquipt = 21;
                var1_1.groundModelId = 22;
                var1_1.modelZoom = 865;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 12;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23120: {
                var1_1.name = "Donor Body";
                var1_1.maleEquipt = 23;
                var1_1.femaleEquipt = 23;
                var1_1.groundModelId = 24;
                var1_1.modelZoom = 1320;
                var1_1.modelOffset1 = 1;
                var1_1.modelOffset2 = 12;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23122: {
                var1_1.name = "Donor Legs";
                var1_1.maleEquipt = 25;
                var1_1.femaleEquipt = 25;
                var1_1.groundModelId = 26;
                var1_1.modelZoom = 1555;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 9;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23124: {
                var1_1.name = "Superior Slayer Helm";
                var1_1.maleEquipt = 27;
                var1_1.femaleEquipt = 27;
                var1_1.groundModelId = 28;
                var1_1.modelZoom = 770;
                var1_1.modelOffset1 = -5;
                var1_1.modelOffset2 = 17;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23126: {
                var1_1.name = "Superior Slayer Cape";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.groundModelId = 30;
                var1_1.maleEquipt = 29;
                var1_1.femaleEquipt = 29;
                var1_1.modelZoom = 2885;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 76;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 5;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23128: {
                var1_1.name = "Superior Slayer Scarf";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.groundModelId = 32;
                var1_1.maleEquipt = 31;
                var1_1.femaleEquipt = 31;
                var1_1.modelZoom = 1040;
                var1_1.modelOffset1 = -6;
                var1_1.modelOffset2 = 4;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 876;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23130: {
                var1_1.name = "Superior Slayer PlateBody";
                var1_1.maleEquipt = 33;
                var1_1.femaleEquipt = 33;
                var1_1.groundModelId = 34;
                var1_1.modelZoom = 1415;
                var1_1.modelOffset1 = 2;
                var1_1.modelOffset2 = -13;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 1;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23132: {
                var1_1.name = "Superior Slayer PlateLegs";
                var1_1.maleEquipt = 35;
                var1_1.femaleEquipt = 35;
                var1_1.groundModelId = 36;
                var1_1.modelZoom = 1755;
                var1_1.modelOffset1 = -8;
                var1_1.modelOffset2 = 7;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 1;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23134: {
                var1_1.name = "Superior Slayer KiteShield";
                var1_1.maleEquipt = 37;
                var1_1.femaleEquipt = 37;
                var1_1.groundModelId = 38;
                var1_1.modelZoom = 1755;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 12;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 11;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23136: {
                var1_1.name = "Superior Slayer Gloves";
                var1_1.maleEquipt = 39;
                var1_1.femaleEquipt = 39;
                var1_1.groundModelId = 40;
                var1_1.modelZoom = 665;
                var1_1.modelOffset1 = 1;
                var1_1.modelOffset2 = -4;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 431;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23138: {
                var1_1.name = "Superior Slayer Boots";
                var1_1.maleEquipt = 41;
                var1_1.femaleEquipt = 41;
                var1_1.groundModelId = 42;
                var1_1.modelZoom = 655;
                var1_1.modelOffset1 = 1;
                var1_1.modelOffset2 = 18;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23140: {
                var1_1.name = "Hailstorm Sword";
                var1_1.maleEquipt = 43;
                var1_1.femaleEquipt = 43;
                var1_1.groundModelId = 44;
                var1_1.modelZoom = 2100;
                var1_1.modelOffset1 = -5;
                var1_1.modelOffset2 = 13;
                var1_1.modelRotation1 = 350;
                var1_1.modelRotation2 = 545;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "HOLY SHIT";
                var1_1.stackable = false;
                break;
            }
            case 23142: {
                var1_1.name = "Omega Helm";
                var1_1.maleEquipt = 45;
                var1_1.femaleEquipt = 45;
                var1_1.groundModelId = 46;
                var1_1.modelZoom = 540;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = 27;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23144: {
                var1_1.name = "Omega PlateBody";
                var1_1.maleEquipt = 47;
                var1_1.femaleEquipt = 47;
                var1_1.groundModelId = 48;
                var1_1.modelZoom = 1305;
                var1_1.modelOffset1 = -2;
                var1_1.modelOffset2 = 12;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23146: {
                var1_1.name = "Omega PlateLegs";
                var1_1.maleEquipt = 49;
                var1_1.femaleEquipt = 49;
                var1_1.groundModelId = 50;
                var1_1.modelZoom = 1620;
                var1_1.modelOffset1 = -8;
                var1_1.modelOffset2 = 12;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23148: {
                var1_1.name = "Omega Gloves";
                var1_1.maleEquipt = 51;
                var1_1.femaleEquipt = 51;
                var1_1.groundModelId = 52;
                var1_1.modelZoom = 450;
                var1_1.modelOffset1 = -3;
                var1_1.modelOffset2 = -8;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23150: {
                var1_1.name = "Omega Boots";
                var1_1.maleEquipt = 53;
                var1_1.femaleEquipt = 53;
                var1_1.groundModelId = 53;
                var1_1.modelZoom = 680;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 29;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 41;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23152: {
                var1_1.name = "Sword";
                var1_1.maleEquipt = 53;
                var1_1.femaleEquipt = 53;
                var1_1.groundModelId = 54;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                break;
            }
            case 23154: {
                var1_1.name = "Morty Pet";
                var1_1.maleEquipt = 94004;
                var1_1.femaleEquipt = 94004;
                var1_1.groundModelId = 94004;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Drop";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 964;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                break;
            }
            case 23156: {
                var1_1.name = "Rick Pet";
                var1_1.maleEquipt = 94005;
                var1_1.femaleEquipt = 94005;
                var1_1.groundModelId = 94005;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Drop";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 964;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                break;
            }
            case 23158: {
                var1_1.name = "Crash Bandicoot jr";
                var1_1.maleEquipt = 94218;
                var1_1.femaleEquipt = 94218;
                var1_1.groundModelId = 94218;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Drop";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 964;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                break;
            }
            case 23160: {
                var1_1.name = "Space Invader jr";
                var1_1.maleEquipt = 94214;
                var1_1.femaleEquipt = 94214;
                var1_1.groundModelId = 94214;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Drop";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 964;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                break;
            }
            case 23162: {
                var1_1.name = "Pacman jr";
                var1_1.maleEquipt = 94205;
                var1_1.femaleEquipt = 94205;
                var1_1.groundModelId = 94205;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Drop";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 964;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                break;
            }
            case 18449: {
                var1_1.name = "Imagine PlateBody";
                var1_1.groundModelId = 89;
                var1_1.maleEquipt = 90;
                var1_1.femaleEquipt = 90;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1244;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 5;
                break;
            }
            case 18450: {
                var1_1.name = "Imagine Helm";
                var1_1.groundModelId = 91;
                var1_1.maleEquipt = 92;
                var1_1.femaleEquipt = 92;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 649;
                var1_1.modelOffset1 = 2;
                var1_1.modelOffset2 = 4;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 2035;
                break;
            }
            case 18451: {
                var1_1.name = "Imagine Platelegs";
                var1_1.groundModelId = 93;
                var1_1.maleEquipt = 94;
                var1_1.femaleEquipt = 94;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1614;
                var1_1.modelOffset1 = -7;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 0;
                break;
            }
            case 18452: {
                var1_1.name = "Imagine Sword";
                var1_1.groundModelId = 95;
                var1_1.maleEquipt = 96;
                var1_1.femaleEquipt = 96;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1649;
                var1_1.modelOffset1 = -2;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 1753;
                var1_1.modelRotation2 = 1520;
                break;
            }
            case 18453: {
                var1_1.name = "Imagine Sword";
                var1_1.groundModelId = 95;
                var1_1.maleEquipt = 96;
                var1_1.femaleEquipt = 96;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1649;
                var1_1.modelOffset1 = -2;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 1753;
                var1_1.modelRotation2 = 1520;
                break;
            }
            case 18454: {
                var1_1.name = "Imagine Spirit Shield";
                var1_1.groundModelId = 97;
                var1_1.maleEquipt = 98;
                var1_1.femaleEquipt = 98;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1694;
                var1_1.modelOffset1 = -3;
                var1_1.modelOffset2 = -6;
                var1_1.modelRotation1 = 513;
                var1_1.modelRotation2 = 2025;
                break;
            }
            case 18455: {
                var1_1.name = "Imagine Fire Cape";
                var1_1.groundModelId = 99;
                var1_1.maleEquipt = 100;
                var1_1.femaleEquipt = 100;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1809;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -9;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1005;
                break;
            }
            case 23164: {
                var1_1.name = "Imagine Gloves";
                var1_1.groundModelId = 101;
                var1_1.maleEquipt = 102;
                var1_1.femaleEquipt = 102;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 579;
                var1_1.modelOffset1 = -2;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 498;
                var1_1.modelRotation2 = 1150;
                break;
            }
            case 23166: {
                var1_1.name = "Imagine Boots";
                var1_1.groundModelId = 103;
                var1_1.maleEquipt = 103;
                var1_1.femaleEquipt = 103;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 644;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 2;
                var1_1.modelRotation1 = 28;
                var1_1.modelRotation2 = 2025;
                break;
            }
            case 23168: {
                var1_1.name = "Imagine Chest(MBox)";
                var1_1.groundModelId = 104;
                var1_1.maleEquipt = 104;
                var1_1.femaleEquipt = 104;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Open";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 964;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = 2;
                var1_1.modelRotation1 = 2038;
                var1_1.modelRotation2 = 2025;
                break;
            }
            case 23169: {
                var1_1.name = "Beginner Trophy";
                var1_1.groundModelId = 105;
                var1_1.maleEquipt = 105;
                var1_1.femaleEquipt = 105;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 776;
                break;
            }
            case 23170: {
                var1_1.name = "Easy Trophy";
                var1_1.groundModelId = 106;
                var1_1.maleEquipt = 106;
                var1_1.femaleEquipt = 106;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 776;
                break;
            }
            case 23171: {
                var1_1.name = "Medium Trophy";
                var1_1.groundModelId = 107;
                var1_1.maleEquipt = 107;
                var1_1.femaleEquipt = 107;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 776;
                break;
            }
            case 23172: {
                var1_1.name = "Hard Trophy";
                var1_1.groundModelId = 108;
                var1_1.maleEquipt = 108;
                var1_1.femaleEquipt = 108;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 776;
                break;
            }
            case 23173: {
                var1_1.name = "Elite Trophy";
                var1_1.groundModelId = 109;
                var1_1.maleEquipt = 109;
                var1_1.femaleEquipt = 109;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 776;
                break;
            }
            case 23174: {
                var1_1.name = "Hailstorm Shield";
                var1_1.maleEquipt = 110;
                var1_1.femaleEquipt = 110;
                var1_1.groundModelId = 111;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "HOLY SHIT";
                var1_1.stackable = false;
                var1_1.modelZoom = 1760;
                var1_1.modelOffset1 = -2;
                var1_1.modelOffset2 = 4;
                var1_1.modelRotation1 = 555;
                var1_1.modelRotation2 = 0;
                break;
            }
            case 23176: {
                var1_1.name = "Finest Rune";
                var1_1.groundModelId = 112;
                var1_1.maleEquipt = 112;
                var1_1.femaleEquipt = 112;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 776;
                break;
            }
            case 23177: {
                var1_1.name = "Lucky Rune";
                var1_1.groundModelId = 113;
                var1_1.maleEquipt = 113;
                var1_1.femaleEquipt = 113;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 776;
                break;
            }
            case 23178: {
                var1_1.name = "Chaos Stone";
                var1_1.groundModelId = 114;
                var1_1.maleEquipt = 114;
                var1_1.femaleEquipt = 114;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 15;
                var1_1.modelRotation1 = 800;
                var1_1.modelRotation2 = 1031;
                break;
            }
            case 23179: {
                var1_1.name = "Extreme Stone";
                var1_1.groundModelId = 115;
                var1_1.maleEquipt = 115;
                var1_1.femaleEquipt = 115;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 15;
                var1_1.modelRotation1 = 800;
                var1_1.modelRotation2 = 1031;
                break;
            }
            case 23180: {
                var1_1.name = "Rune of Protection I";
                var1_1.groundModelId = 116;
                var1_1.maleEquipt = 116;
                var1_1.femaleEquipt = 116;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 460;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 2;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1;
                break;
            }
            case 23181: {
                var1_1.name = "Rune of Protection II";
                var1_1.groundModelId = 117;
                var1_1.maleEquipt = 117;
                var1_1.femaleEquipt = 117;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 460;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 2;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1;
                break;
            }
            case 23182: {
                var1_1.name = "Rune of Protection III";
                var1_1.groundModelId = 118;
                var1_1.maleEquipt = 118;
                var1_1.femaleEquipt = 118;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 460;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 2;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1;
                break;
            }
            case 23183: {
                var1_1.name = "Rune of Protection IV";
                var1_1.groundModelId = 119;
                var1_1.maleEquipt = 119;
                var1_1.femaleEquipt = 119;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 460;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 2;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1;
                break;
            }
            case 23184: {
                var1_1.name = "Master Stone +17";
                var1_1.groundModelId = 120;
                var1_1.maleEquipt = 120;
                var1_1.femaleEquipt = 120;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1031;
                break;
            }
            case 23185: {
                var1_1.name = "Master Stone +18";
                var1_1.groundModelId = 121;
                var1_1.maleEquipt = 121;
                var1_1.femaleEquipt = 121;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1006;
                break;
            }
            case 23186: {
                var1_1.name = "Master Stone +19";
                var1_1.groundModelId = 122;
                var1_1.maleEquipt = 122;
                var1_1.femaleEquipt = 122;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1355;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1006;
                break;
            }
            case 23187: {
                var1_1.name = "Master Stone +20";
                var1_1.groundModelId = 123;
                var1_1.maleEquipt = 123;
                var1_1.femaleEquipt = 123;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1165;
                var1_1.modelOffset1 = -3;
                var1_1.modelOffset2 = 5;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1026;
                break;
            }
            case 23188: {
                var1_1.name = "Master Stone +21";
                var1_1.groundModelId = 124;
                var1_1.maleEquipt = 124;
                var1_1.femaleEquipt = 124;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1170;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1001;
                break;
            }
            case 23189: {
                var1_1.name = "Master Stone +23";
                var1_1.groundModelId = 125;
                var1_1.maleEquipt = 125;
                var1_1.femaleEquipt = 125;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1190;
                var1_1.modelOffset1 = -4;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1011;
                break;
            }
            case 23190: {
                var1_1.name = "Master Stone +25";
                var1_1.groundModelId = 126;
                var1_1.maleEquipt = 126;
                var1_1.femaleEquipt = 126;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 900;
                var1_1.modelOffset1 = -3;
                var1_1.modelOffset2 = -5;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1016;
                break;
            }
            case 23191: {
                var1_1.name = "Master Stone +26";
                var1_1.groundModelId = 127;
                var1_1.maleEquipt = 127;
                var1_1.femaleEquipt = 127;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1100;
                var1_1.modelOffset1 = -3;
                var1_1.modelOffset2 = 3;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1016;
                break;
            }
            case 23192: {
                var1_1.name = "Master Stone +27";
                var1_1.groundModelId = 128;
                var1_1.maleEquipt = 128;
                var1_1.femaleEquipt = 128;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 995;
                var1_1.modelOffset1 = 2;
                var1_1.modelOffset2 = 4;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1016;
                break;
            }
            case 23193: {
                var1_1.name = "Master Stone +28";
                var1_1.groundModelId = 129;
                var1_1.maleEquipt = 129;
                var1_1.femaleEquipt = 129;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 935;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1036;
                break;
            }
            case 23194: {
                var1_1.name = "Master Stone +29";
                var1_1.groundModelId = 130;
                var1_1.maleEquipt = 130;
                var1_1.femaleEquipt = 130;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1165;
                var1_1.modelOffset1 = -2;
                var1_1.modelOffset2 = 6;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1036;
                break;
            }
            case 23195: {
                var1_1.name = "Master Stone +30";
                var1_1.groundModelId = 131;
                var1_1.maleEquipt = 131;
                var1_1.femaleEquipt = 131;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 1310;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = -1;
                var1_1.modelRotation1 = 550;
                var1_1.modelRotation2 = 1036;
                break;
            }
            case 13151: {
                var1_1.name = "Vote Book";
                break;
            }
            case 23196: {
                var1_1.name = "Necklace of Virtue";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.groundModelId = 132;
                var1_1.maleEquipt = 133;
                var1_1.femaleEquipt = 133;
                var1_1.modelZoom = 1005;
                var1_1.modelOffset1 = 2;
                var1_1.modelOffset2 = 12;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 31;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 23197: {
                var1_1.name = "Band of Virtue";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.groundModelId = 134;
                var1_1.maleEquipt = 134;
                var1_1.femaleEquipt = 134;
                var1_1.modelZoom = 740;
                var1_1.modelOffset1 = 6;
                var1_1.modelOffset2 = 29;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 271;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 23198: {
                var1_1.groundModelId = 135;
                var1_1.name = "Medusa's Bow";
                var1_1.description = "A Medusa bow!.";
                var1_1.maleEquipt = 135;
                var1_1.femaleEquipt = 135;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Wear";
                var1_1.stackable = false;
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                break;
            }
            case 23199: {
                var1_1.groundModelId = 94277;
                var1_1.name = "Thanos pet";
                var1_1.description = "A Thanos pet!.";
                var1_1.modelZoom = 3000;
                var1_1.modelRotation1 = 0;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[3] = "Summon";
                var1_1.itemActions[4] = "Drop";
                var1_1.stackable = false;
                break;
            }
            case 23200: {
                var1_1.groundModelId = 94259;
                var1_1.name = "Hulk pet";
                var1_1.description = "A Hulk pet!.";
                var1_1.modelZoom = 3000;
                var1_1.modelRotation1 = 0;
                var1_1.modelRotation2 = 0;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 0;
                var1_1.itemActions = new String[5];
                var1_1.itemActions[3] = "Summon";
                var1_1.itemActions[4] = "Drop";
                var1_1.stackable = false;
                break;
            }
            case 23201: {
                var1_1.name = "Skeletal Plate Gloves";
                var1_1.groundModelId = 136;
                var1_1.maleEquipt = 137;
                var1_1.femaleEquipt = 137;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 585;
                var1_1.modelOffset1 = 0;
                var1_1.modelOffset2 = 2;
                var1_1.modelRotation1 = 320;
                var1_1.modelRotation2 = 0;
                break;
            }
            case 23202: {
                var1_1.name = "Skeletal Plate Boots";
                var1_1.groundModelId = 138;
                var1_1.maleEquipt = 139;
                var1_1.femaleEquipt = 139;
                var1_1.groundActions = new String[5];
                var1_1.groundActions[2] = "Take";
                var1_1.itemActions = new String[5];
                var1_1.itemActions[1] = "Equip";
                var1_1.revisionType = RevisionType.CUSTOM_ITEM_MODELS;
                var1_1.modelZoom = 735;
                var1_1.modelOffset1 = -1;
                var1_1.modelOffset2 = 22;
                var1_1.modelRotation1 = 370;
                var1_1.modelRotation2 = 0;
                break;
            }
        }
        if (n >= 23000 && n <= 23111 && (n & 1) == 1) {
            ItemDefinition.convertToNote((ItemDefinition)var1_1, n - 1, 799);
        }
        boolean bl = false;
        String[] arrstring = var1_1.itemActions;
        int n2 = arrstring.length;
        int n3 = 0;
        do {
            if (n3 >= n2) {
                if (!bl) return var1_1;
                var1_1.aByte154 = (byte)-15;
                return var1_1;
            }
            String string = arrstring[n3];
            if (string != null && string.length() != 0 && string.equalsIgnoreCase("Wear")) {
                bl = true;
            }
            ++n3;
        } while (true);
    }

    private ItemDef_8() {
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.imagineps.client.definition.custom;

import com.imagineps.client.Stream;
import com.imagineps.client.definition.NPCDefinition;
import com.imagineps.client.definition.RevisionType;

public class CustomNPCDefinitions
extends NPCDefinition {
    public NPCDefinition load(int npcId, NPCDefinition entityDef) {
        int changedColors2;
        int i;
        int i2;
        if (npcId == 2254) {
            this.copy(entityDef, 2253);
            entityDef.name = "Evil Wise Old Man";
            entityDef.combatLevel = 2500;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            for (i2 = 0; i2 < entityDef.originalModelColors.length; ++i2) {
                entityDef.modifiedModelColors[i2] = 0;
            }
            entityDef.models[7] = 539;
            entityDef.standAnim = 808;
            entityDef.scaleXZ = 450;
            entityDef.scaleY = 450;
            entityDef.boundDim = (byte)4;
        }
        if (npcId == 2255) {
            this.copy(entityDef, 2253);
            entityDef.name = "Evil Wise Old Man";
            entityDef.combatLevel = 2500;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            for (i2 = 0; i2 < entityDef.originalModelColors.length; ++i2) {
                entityDef.modifiedModelColors[i2] = 0;
            }
            entityDef.models[7] = 539;
            entityDef.standAnim = 808;
            entityDef.scaleXZ = 450;
            entityDef.scaleY = 450;
            entityDef.boundDim = (byte)4;
        }
        if (npcId == 2256) {
            NPCDefinition def = NPCDefinition.forID(8133);
            entityDef.models = new int[def.models.length];
            for (i = 0; i < def.models.length; ++i) {
                entityDef.models[i] = def.models[i];
            }
            entityDef.standAnim = def.standAnim;
            entityDef.scaleXZ = 80;
            entityDef.scaleY = 80;
            entityDef.name = "Mini Corporeal Beast";
        }
        if (npcId == 4677) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.name = "Elvarg";
            entityDef.combatLevel = 150;
        }
        if (npcId == 10141) {
            entityDef.scaleXZ = 200;
            entityDef.scaleY = 200;
            entityDef.combatLevel = 2250;
        }
        if (npcId == 3001) {
            entityDef.name = "Lottery";
            entityDef.description = "Enter the lottery!".getBytes();
        }
        if (npcId == 351) {
            entityDef.name = "The Trickster";
            entityDef.models = new int[]{215, 249, 44786, 44770, 44764, 44761, 44757, 52831};
            entityDef.scaleXZ = 220;
            entityDef.scaleY = 200;
            entityDef.combatLevel = 650;
        }
        if (npcId >= 22307 && npcId <= 22309) {
            entityDef.name = "Wizard Darius";
            entityDef.combatLevel = 255;
        }
        if (npcId == 22306) {
            entityDef.name = "Wizard Darius";
            NPCDefinition def = NPCDefinition.forID(22307);
            entityDef.models = new int[def.models.length];
            for (i = 0; i < def.models.length; ++i) {
                entityDef.models[i] = def.models[i];
            }
            entityDef.standAnim = 808;
        }
        if (npcId == 352) {
            entityDef.name = "The Predator";
            entityDef.models = new int[]{79286, 79280, 79283, 79290, 79289, 71949, 40942};
            entityDef.scaleXZ = 220;
            entityDef.scaleY = 200;
            entityDef.combatLevel = 650;
        }
        if (npcId == 4247) {
            entityDef.name = "Construction Manager";
            entityDef.description = "Imagine Construction!".getBytes();
            entityDef.actions[2] = "Visit House";
            entityDef.actions[3] = "Buy Skillcape";
        }
        if (npcId == 9850) {
            entityDef.combatLevel = 0;
            entityDef.actions = new String[]{"Talk-to", null, null, null, null};
        }
        if (npcId == 3661) {
            entityDef.name = "Donor Boss";
            entityDef.scaleXZ = 200;
            entityDef.scaleY = 200;
            entityDef.boundDim = (byte)2;
        }
        if (npcId == 6105) {
            entityDef.name = "Chosen Skeleton";
            entityDef.scaleXZ = 400;
            entityDef.scaleY = 400;
            entityDef.boundDim = (byte)2;
        }
        if (npcId == 94) {
            entityDef.scaleXZ = 150;
            entityDef.scaleY = 150;
            entityDef.boundDim = (byte)2;
        }
        if (npcId == 6312) {
            entityDef.name = "Event NPC";
        }
        if (npcId == 5866) {
            entityDef.name = "Cerberus";
            entityDef.models = new int[]{29270};
            entityDef.boundDim = (byte)5;
            entityDef.actions = new String[]{null, null, null, null, null};
            entityDef.combatLevel = 318;
            entityDef.scaleXZ = 128;
            entityDef.scaleY = 128;
        }
        if (npcId == 199) {
            entityDef.combatLevel = 0;
            entityDef.actions = new String[]{"Open Shop", null, null, null, null};
        }
        if (npcId == 1438) {
            entityDef.name = "Harambe";
            entityDef.combatLevel = 69;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.actions[2] = "Touch";
            entityDef.actions[3] = "Taunt";
            entityDef.scaleXZ = 340;
            entityDef.scaleY = 340;
        }
        if (npcId == 5867) {
            entityDef.name = "Summoned Soul";
            entityDef.models = new int[]{29268};
            entityDef.boundDim = 1;
            entityDef.actions = new String[]{null, null, null, null, null};
            entityDef.combatLevel = 96;
            entityDef.scaleXZ = 140;
            entityDef.scaleY = 140;
        }
        if (npcId == 5868) {
            entityDef.name = "Summoned Soul";
            entityDef.models = new int[]{29267};
            entityDef.boundDim = 1;
            entityDef.actions = new String[]{null, null, null, null, null};
            entityDef.combatLevel = 96;
            entityDef.scaleXZ = 140;
            entityDef.scaleY = 140;
        }
        if (npcId == 5869) {
            entityDef.name = "Summoned Soul";
            entityDef.models = new int[]{29266};
            entityDef.boundDim = 1;
            entityDef.actions = new String[]{null, null, null, null, null};
            entityDef.combatLevel = 79;
            entityDef.scaleXZ = 140;
            entityDef.scaleY = 140;
        }
        if (npcId == 668) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Question";
            entityDef.actions[2] = "Touch";
            entityDef.actions[3] = "Poke";
            entityDef.name = "Ash";
            entityDef.description = "Imagine-PS Community Manager.".getBytes();
            entityDef.combatLevel = 54321;
        }
        if (npcId == 1093) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Question";
            entityDef.actions[2] = "Touch";
            entityDef.actions[3] = "Poke";
            entityDef.name = "Reliinquish";
            entityDef.description = "Imagine-PS Moderator.".getBytes();
            entityDef.combatLevel = 54321;
        }
        if (npcId == 723) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Question";
            entityDef.actions[2] = "Touch";
            entityDef.actions[3] = "Poke";
            entityDef.name = "Jackson";
            entityDef.description = "Imagine-PS Helper.".getBytes();
            entityDef.combatLevel = 54321;
        }
        if (npcId == 4527) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.actions[2] = "Touch";
            entityDef.actions[3] = "Taunt";
            entityDef.scaleXZ = 300;
            entityDef.scaleY = 300;
            entityDef.name = "Hank The Tank";
            entityDef.boundDim = (byte)2;
            entityDef.description = "The unkillable beast... goodness, I can just imagine the rewards.".getBytes();
            entityDef.combatLevel = 2000;
        }
        if (npcId == 4528) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.actions[2] = "Touch";
            entityDef.actions[3] = "Taunt";
            entityDef.scaleXZ = 75;
            entityDef.scaleY = 75;
            entityDef.name = "Hank the Not-So-Tank";
            entityDef.description = "Spawned by the one and only, Hank The Tank.".getBytes();
            entityDef.combatLevel = 1000;
        }
        if (npcId == 4529) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.actions[2] = "Touch";
            entityDef.actions[3] = "Taunt";
            entityDef.scaleXZ = 150;
            entityDef.scaleY = 150;
            entityDef.name = "Hank The Mini Tank";
            entityDef.boundDim = (byte)2;
            entityDef.description = "The unkillable beast... goodness, I can just imagine the rewards.".getBytes();
            entityDef.combatLevel = 1000;
        }
        if (npcId == 8274) {
            entityDef.name = "Duo Slayer Master";
            entityDef.description = "Duo Slayer Master".getBytes();
        }
        if (npcId == 7941) {
            entityDef.name = "Holiday Shop";
            entityDef.description = "A shop with discontinued items, buy them before they go out of stock!".getBytes();
        }
        if (npcId == 6296) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.name = "Turtle";
            entityDef.description = "Holy mother of ....".getBytes();
            entityDef.combatLevel = 1999;
        }
        if (npcId == 4089) {
            entityDef.name = "Turtle Orb";
            entityDef.actions[0] = "Shop";
            entityDef.actions[1] = "Gamble";
            entityDef.description = "A shop with discontinued items, buy them before they go out of stock!".getBytes();
        }
        if (npcId == 10040) {
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 521;
        }
        if (npcId == 2465) {
            entityDef.name = "1m Tickets exchanger";
            entityDef.actions[0] = "Exchange";
        }
        if (npcId == 2466) {
            entityDef.name = "500m Tickets exchanger";
            entityDef.actions[0] = "Exchange";
        }
        if (npcId == 2467) {
            entityDef.name = "1b Tickets exchanger";
            entityDef.actions[0] = "Exchange";
        }
        if (npcId == 9225) {
            entityDef.name = "500m Tickets Shop";
            entityDef.actions[0] = "Trade";
        }
        if (npcId == 9224) {
            entityDef.name = "500m Tickets Shop";
            entityDef.actions[0] = "Trade";
        }
        if (npcId == 5053) {
            entityDef.name = "Suspicious Assistant";
            entityDef.actions[3] = "Trade";
        }
        if (npcId == 251) {
            entityDef.name = "King Milestone";
            entityDef.actions[2] = "Milestone";
            entityDef.description = "Deathlypvpz Official MilestoneCape Seller".getBytes();
        }
        if (npcId == 9713) {
            entityDef.actions[2] = "Buy Skillcape";
        }
        if (npcId == 2290) {
            entityDef.name = "Loyalty Title Shop";
        }
        if (npcId == 2617) {
            entityDef.name = "General and Skilling Shop";
        }
        if (npcId == 541) {
            entityDef.name = "Starting Shop";
        }
        if (npcId == 2284) {
            entityDef.name = "Loyalty Point Shop";
        }
        if (npcId == 5622) {
            entityDef.name = "Gambling Shop";
        }
        if (npcId == 683) {
            entityDef.name = "Range Shop";
        }
        if (npcId == 549) {
            entityDef.name = "Basic Armour Shop";
        }
        if (npcId == 2538) {
            entityDef.name = "Supply Shop";
        }
        if (npcId == 1704) {
            entityDef.name = "Dominion Tower";
        }
        if (npcId == 992) {
            entityDef.name = "Trivia Store";
        }
        if (npcId == 5879) {
            entityDef.name = "Goblin Challenge";
        }
        if (npcId == 8591) {
            entityDef.name = "Nomad Challenge";
        }
        if (npcId == 6138) {
            entityDef.name = "Stat Reset";
        }
        if (npcId == 8206) {
            entityDef.name = "Lottery";
        }
        if (npcId == 4241) {
            entityDef.name = "Ckey Exchanger";
        }
        if (npcId == 694) {
            entityDef.name = "Ticket Exchanger";
        }
        if (npcId == 602) {
            entityDef.name = "1b Ticket Shop";
        }
        if (npcId == 532) {
            entityDef.name = "Vote Shop";
        }
        if (npcId == 519) {
            entityDef.name = "Skilling Shop";
        }
        if (npcId == 522) {
            entityDef.name = "Sell Everything";
        }
        if (npcId == 1113) {
            entityDef.name = "Summoning Training";
        }
        if (npcId == 666) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.actions[2] = "Talk";
            entityDef.actions[3] = "Interact-with";
            entityDef.models = new int[1];
            entityDef.models[0] = 44751;
            entityDef.name = "Tzrek-jad Pet";
            entityDef.description = "A fearsome obsidian beast... Aww, so cute.".getBytes();
        }
        if (npcId == 2221) {
            NPCDefinition.stream.currentOffset = NPCDefinition.streamIndices[630];
            entityDef.boundDim = 1;
            entityDef.readValues(NPCDefinition.stream);
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Drive";
            entityDef.models = new int[1];
            entityDef.models[0] = 52041;
            entityDef.name = "Car";
            entityDef.description = "".getBytes();
        }
        if (npcId == 2586) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[2];
            entityDef.models[0] = 62747;
            entityDef.models[1] = 62734;
            entityDef.boundDim = 1;
            entityDef.scaleXZ = 130;
            entityDef.scaleY = 130;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.name = "Glacies";
            entityDef.combatLevel = 285;
        }
        if (npcId == 5001) {
            entityDef.models = new int[1];
            entityDef.models[0] = 62717;
            entityDef.name = "Nex";
            entityDef.boundDim = (byte)3;
            entityDef.standAnim = 6320;
            entityDef.walkAnim = 6319;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 1001;
        }
        if (npcId == 1593) {
            entityDef.name = "Sweeber";
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 350;
        }
        if (npcId == 3155) {
            entityDef.name = "Mysterious man";
            entityDef.boundDim = 1;
            entityDef.scaleXZ = 40;
            entityDef.scaleY = 40;
        }
        if (npcId == 10145) {
            entityDef.boundDim = (byte)4;
            entityDef.standAnim = 13015;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Ingage";
            entityDef.combatLevel = 655;
            entityDef.headIcon = 16;
        }
        if (npcId == 8211) {
            entityDef.name = "Ganodermic beast";
            entityDef.models = new int[]{13888};
            entityDef.boundDim = (byte)3;
            entityDef.standAnim = 3309;
            entityDef.walkAnim = 3313;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 280;
        }
        if (npcId == 2587) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[2];
            entityDef.models[0] = 62747;
            entityDef.models[1] = 62734;
            entityDef.modifiedModelColors = new int[10];
            entityDef.originalModelColors = new int[10];
            entityDef.originalModelColors[0] = 33893;
            entityDef.modifiedModelColors[0] = 828;
            entityDef.originalModelColors[1] = 34853;
            entityDef.modifiedModelColors[1] = 795;
            entityDef.originalModelColors[2] = 35214;
            entityDef.modifiedModelColors[2] = 780;
            entityDef.originalModelColors[3] = 32882;
            entityDef.modifiedModelColors[3] = 828;
            entityDef.originalModelColors[4] = 32832;
            entityDef.modifiedModelColors[4] = 828;
            entityDef.originalModelColors[5] = 35461;
            entityDef.modifiedModelColors[5] = 774;
            entityDef.originalModelColors[6] = 35216;
            entityDef.modifiedModelColors[6] = 782;
            entityDef.originalModelColors[7] = 30885;
            entityDef.modifiedModelColors[7] = 794;
            entityDef.originalModelColors[8] = 34568;
            entityDef.modifiedModelColors[8] = 780;
            entityDef.originalModelColors[9] = 34454;
            entityDef.modifiedModelColors[9] = 794;
            entityDef.boundDim = 1;
            entityDef.scaleXZ = 130;
            entityDef.scaleY = 130;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.name = "Cruor";
            entityDef.combatLevel = 285;
        }
        if (npcId == 2588) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[2];
            entityDef.models[0] = 62747;
            entityDef.models[1] = 62734;
            entityDef.modifiedModelColors = new int[10];
            entityDef.originalModelColors = new int[10];
            entityDef.originalModelColors[0] = 33893;
            entityDef.modifiedModelColors[0] = 80;
            entityDef.originalModelColors[1] = 34853;
            entityDef.modifiedModelColors[1] = 45;
            entityDef.originalModelColors[2] = 35214;
            entityDef.modifiedModelColors[2] = 25;
            entityDef.originalModelColors[3] = 32882;
            entityDef.modifiedModelColors[3] = 68;
            entityDef.originalModelColors[4] = 32832;
            entityDef.modifiedModelColors[4] = 68;
            entityDef.originalModelColors[5] = 35461;
            entityDef.modifiedModelColors[5] = 20;
            entityDef.originalModelColors[6] = 35216;
            entityDef.modifiedModelColors[6] = 30;
            entityDef.originalModelColors[7] = 30885;
            entityDef.modifiedModelColors[7] = 45;
            entityDef.originalModelColors[8] = 34568;
            entityDef.modifiedModelColors[8] = 30;
            entityDef.originalModelColors[9] = 34454;
            entityDef.modifiedModelColors[9] = 45;
            entityDef.boundDim = 1;
            entityDef.scaleXZ = 130;
            entityDef.scaleY = 130;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.name = "Fumus";
            entityDef.combatLevel = 285;
        }
        if (npcId == 2589) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[2];
            entityDef.models[0] = 62747;
            entityDef.models[1] = 62734;
            entityDef.modifiedModelColors = new int[10];
            entityDef.originalModelColors = new int[10];
            entityDef.originalModelColors[0] = 33893;
            entityDef.modifiedModelColors[0] = 50360;
            entityDef.originalModelColors[1] = 34853;
            entityDef.modifiedModelColors[1] = 48550;
            entityDef.originalModelColors[2] = 35214;
            entityDef.modifiedModelColors[2] = 15;
            entityDef.originalModelColors[3] = 32882;
            entityDef.modifiedModelColors[3] = 48540;
            entityDef.originalModelColors[4] = 32832;
            entityDef.modifiedModelColors[4] = 48540;
            entityDef.originalModelColors[5] = 35461;
            entityDef.modifiedModelColors[5] = 10;
            entityDef.originalModelColors[6] = 35216;
            entityDef.modifiedModelColors[6] = 4506;
            entityDef.originalModelColors[7] = 30885;
            entityDef.modifiedModelColors[7] = 48550;
            entityDef.originalModelColors[8] = 34568;
            entityDef.modifiedModelColors[8] = 50074;
            entityDef.originalModelColors[9] = 34454;
            entityDef.modifiedModelColors[9] = 48550;
            entityDef.boundDim = 1;
            entityDef.scaleXZ = 130;
            entityDef.scaleY = 130;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.name = "Umbra";
            entityDef.combatLevel = 285;
        }
        if (npcId == 2636) {
            entityDef.models = new int[1];
            entityDef.models[0] = 62717;
            entityDef.name = "Nex";
            entityDef.boundDim = (byte)3;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.aBoolean87 = true;
            entityDef.combatLevel = 1001;
            entityDef.aBoolean93 = true;
            entityDef.anInt85 = 10;
            entityDef.anInt92 = 50;
            entityDef.headIcon = 15;
            entityDef.anInt79 = 32;
            entityDef.aBoolean84 = true;
        }
        if (npcId == 33) {
            entityDef.name = "Bank server";
            entityDef.combatLevel = 9000;
        }
        if (npcId == 876) {
            entityDef.name = "Phat point shop";
        }
        if (npcId == 1225) {
            entityDef.name = "Bryan the Vampire";
            entityDef.combatLevel = 341;
        }
        if (npcId == 3109) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.name = "I don't remember my name";
            entityDef.combatLevel = 389;
        }
        if (npcId == 4477) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.name = "Barebones";
            entityDef.combatLevel = 941;
        }
        if (npcId == 879) {
            entityDef.name = "Pim the Delrith";
            entityDef.combatLevel = 341;
        }
        if (npcId == 2134) {
            entityDef.name = "Terrance the Rage";
            entityDef.combatLevel = 119;
        }
        if (npcId == 2579) {
            entityDef.name = "Mandrith";
            entityDef.boundDim = 1;
            entityDef.standAnim = 2715;
            entityDef.walkAnim = 2715;
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Sell Artifacts";
            entityDef.combatLevel = 0;
            entityDef.scaleXZ = 130;
            entityDef.scaleY = 130;
            entityDef.models = new int[1];
            entityDef.models[0] = 30182;
        }
        if (npcId == 2577) {
            entityDef.name = "Harry";
            entityDef.boundDim = 1;
            entityDef.combatLevel = 0;
            entityDef.scaleXZ = 130;
            entityDef.walkAnim = 819;
            entityDef.scaleY = 180;
            entityDef.standAnim = 2715;
            entityDef.walkAnim = 2715;
            entityDef.models = new int[1];
            entityDef.models[0] = 29909;
        }
        if (npcId == 2578) {
            entityDef.name = "Nastroth";
            entityDef.boundDim = 1;
            entityDef.combatLevel = 0;
            entityDef.scaleXZ = 130;
            entityDef.scaleY = 130;
            entityDef.standAnim = 2715;
            entityDef.walkAnim = 2715;
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open SSP Shop";
            entityDef.models = new int[1];
            entityDef.models[0] = 40058;
        }
        if (npcId == 5247) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 40955;
            entityDef.standAnim = 10056;
            entityDef.walkAnim = 10055;
            entityDef.name = "Corporeal Beast";
            entityDef.combatLevel = 785;
            entityDef.description = "A vision of supernatural horror.".getBytes();
        }
        if (npcId == 3592) {
            entityDef.actions = new String[5];
            entityDef.actions[2] = "Special Move";
            entityDef.aBoolean87 = false;
            entityDef.models = new int[1];
            entityDef.models[0] = 31101;
            entityDef.standAnim = 6374;
            entityDef.walkAnim = 6373;
            entityDef.name = "Unicorn Stallion";
            entityDef.combatLevel = 70;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if (npcId == 1282) {
            entityDef.name = "Summoning Master";
            entityDef.actions[2] = "Refill-BoB";
            entityDef.actions[3] = "Open Pouch Shop";
        }
        if (npcId == 243) {
            entityDef.name = "Dungeoneering Master";
            entityDef.actions[2] = "Start Dungeoneering";
            entityDef.actions[3] = "Open Token Shop";
        }
        if (npcId == 3591) {
            entityDef.actions = new String[5];
            entityDef.actions[2] = "Special Move";
            entityDef.aBoolean87 = false;
            entityDef.models = new int[1];
            entityDef.models[0] = 30469;
            entityDef.standAnim = 8186;
            entityDef.walkAnim = 8189;
            entityDef.name = "Steel Titan";
            entityDef.combatLevel = 175;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if (npcId == 5363) {
            NPCDefinition.stream.currentOffset = NPCDefinition.streamIndices[630];
            entityDef.readValues(NPCDefinition.stream);
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[3];
            entityDef.models[0] = 24575;
            entityDef.models[1] = 24584;
            entityDef.models[2] = 24580;
            entityDef.standAnim = 90;
            entityDef.walkAnim = 79;
            entityDef.name = "Damo's Pet Dragon";
            entityDef.combatLevel = 999;
            entityDef.description = "Scales Seem to be made of pure energy!".getBytes();
        }
        if (npcId == 3587) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Take BoB";
            entityDef.actions[2] = "Store";
            entityDef.aBoolean87 = false;
            entityDef.models = new int[1];
            entityDef.models[0] = 30460;
            entityDef.standAnim = 8284;
            entityDef.walkAnim = 8281;
            entityDef.name = "War tortoise";
            entityDef.scaleXZ = 129;
            entityDef.scaleY = 129;
            entityDef.combatLevel = 86;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if (npcId == 3588) {
            entityDef.actions = new String[5];
            entityDef.actions[2] = "Teleport";
            entityDef.aBoolean87 = false;
            entityDef.models = new int[1];
            entityDef.models[0] = 31132;
            entityDef.standAnim = 5225;
            entityDef.walkAnim = 5226;
            entityDef.name = "Spirit Ghraak";
            entityDef.scaleXZ = 129;
            entityDef.scaleY = 129;
            entityDef.combatLevel = 51;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if (npcId == 3593) {
            entityDef.actions = new String[5];
            entityDef.actions[2] = "Special move";
            entityDef.scaleXZ = 129;
            entityDef.scaleY = 129;
            entityDef.models = new int[1];
            entityDef.models[0] = 30475;
            entityDef.standAnim = 8301;
            entityDef.walkAnim = 8302;
            entityDef.aBoolean87 = false;
            entityDef.name = "Wolpertinger";
            entityDef.combatLevel = 51;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if (npcId == 3590) {
            entityDef.actions = new String[5];
            entityDef.actions[2] = "Take-Supplies";
            entityDef.aBoolean87 = false;
            entityDef.models = new int[1];
            entityDef.models[0] = 30460;
            entityDef.standAnim = 8284;
            entityDef.walkAnim = 8281;
            entityDef.name = "War tortoise";
            entityDef.scaleXZ = 129;
            entityDef.scaleY = 129;
            entityDef.combatLevel = 86;
            entityDef.description = "A summoning monster.".getBytes();
        }
        if (npcId == 3586) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Take BoB";
            entityDef.actions[2] = "Store";
            entityDef.aBoolean87 = false;
            entityDef.models = new int[1];
            entityDef.models[0] = 31096;
            entityDef.standAnim = 1008;
            entityDef.walkAnim = 1007;
            entityDef.scaleXZ = 129;
            entityDef.scaleY = 129;
            entityDef.name = "Spirit terrorbird";
            entityDef.combatLevel = 62;
            entityDef.description = "A Bank That Follows You.".getBytes();
        }
        if (npcId == 3596) {
            entityDef.actions = new String[5];
            entityDef.actions[2] = "Take-Supplies";
            entityDef.aBoolean87 = false;
            entityDef.models = new int[1];
            entityDef.models[0] = 31096;
            entityDef.standAnim = 1008;
            entityDef.walkAnim = 1007;
            entityDef.scaleXZ = 129;
            entityDef.scaleY = 129;
            entityDef.name = "Spirit terrorbird";
            entityDef.combatLevel = 62;
            entityDef.description = "A Bank That Follows You.".getBytes();
        }
        if (npcId == 3594) {
            entityDef.actions = new String[5];
            entityDef.actions[2] = "Take-Supplies";
            entityDef.aBoolean87 = false;
            entityDef.models = new int[1];
            entityDef.models[0] = 23892;
            entityDef.standAnim = 5785;
            entityDef.walkAnim = 5781;
            entityDef.name = "Pack-yak";
            entityDef.combatLevel = 175;
            entityDef.description = "Summoning Bank.".getBytes();
        }
        if (npcId == 3595) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Take BoB";
            entityDef.actions[2] = "Store";
            entityDef.aBoolean87 = false;
            entityDef.models = new int[1];
            entityDef.models[0] = 23892;
            entityDef.standAnim = 5785;
            entityDef.walkAnim = 5781;
            entityDef.name = "Pack-yak";
            entityDef.combatLevel = 175;
            entityDef.description = "Summoning Bank.".getBytes();
        }
        if (npcId == 1155) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.name = "Tormented Demon";
            entityDef.combatLevel = 450;
            entityDef.models = new int[1];
            entityDef.standAnim = 10921;
            entityDef.walkAnim = 10920;
            entityDef.models[0] = 44733;
            entityDef.description = "Dangerous shit bro...".getBytes();
        }
        if (npcId == 5781) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Talk To";
            entityDef.actions[2] = "Open Shop";
            entityDef.name = "CalliPts Shop";
            entityDef.description = "CalliPts Shops. Enjoy!.".getBytes();
        }
        if (npcId == 5778) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
            entityDef.name = "PokePts Shop";
            entityDef.description = "PokePts Shops. Enjoy!.".getBytes();
        }
        if (npcId == 5782) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
            entityDef.name = "MarioPts Shop";
            entityDef.description = "MarioPts Shops. Enjoy!.".getBytes();
        }
        if (npcId == 5777) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
            entityDef.name = "SonicPts Shop";
            entityDef.description = "SonicPts Shops. Enjoy!.".getBytes();
        }
        if (npcId == 5779) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
            entityDef.name = "NinjaPts Shop";
            entityDef.description = "NinjaPts Shops. Enjoy!.".getBytes();
        }
        if (npcId == 1380) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74108;
            entityDef.name = "Ursaring";
            entityDef.combatLevel = 176;
        }
        if (npcId == 1379) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74109;
            entityDef.name = "Totodile";
            entityDef.combatLevel = 133;
        }
        if (npcId == 3123) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 79570;
            entityDef.name = "Rainbow unicorn";
            entityDef.combatLevel = 98;
            entityDef.standAnim = 6374;
            entityDef.walkAnim = 6373;
            entityDef.headIcon = 6375;
            entityDef.anInt79 = 6375;
        }
        if (npcId == 3122) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.name = "@whi@S@red@a@whi@n@red@t@whi@a @red@a@whi@n@red@i@whi@m@red@a@whi@l";
            entityDef.combatLevel = 25;
        }
        if (npcId == 1378) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74110;
            entityDef.name = "Gardevoir";
            entityDef.combatLevel = 234;
        }
        if (npcId == 1376) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74111;
            entityDef.name = "Frosslass";
            entityDef.combatLevel = 142;
        }
        if (npcId == 1375) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74112;
            entityDef.name = "Celebi";
            entityDef.combatLevel = 567;
        }
        if (npcId == 1374) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74113;
            entityDef.name = "Reshiram";
            entityDef.combatLevel = 2500;
        }
        if (npcId == 1381) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74107;
            entityDef.name = "Sonic";
            entityDef.combatLevel = 435;
        }
        if (npcId == 1387) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74091;
            entityDef.name = "Scyther";
            entityDef.combatLevel = 100;
            entityDef.description = "It's Scythe pokemon!.".getBytes();
        }
        if (npcId == 7189) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 79618;
            entityDef.name = "Spyro";
            entityDef.combatLevel = 250;
            entityDef.description = "Spyroooo!!!!!.".getBytes();
        }
        if (npcId == 9572) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.name = "Evil Turnip";
            entityDef.combatLevel = 210;
            entityDef.description = "EVILLLLLLLLL !.".getBytes();
        }
        if (npcId == 8822) {
            entityDef.name = "Show-off Gnome";
            entityDef.description = "Hey, check my show-off!.".getBytes();
        }
        if (npcId == 4654) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 79619;
            entityDef.name = "Yoshi";
            entityDef.combatLevel = 250;
            entityDef.description = "Yoshiiii!!!!.".getBytes();
        }
        if (npcId == 1388) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74092;
            entityDef.name = "Water Beast";
            entityDef.combatLevel = 510;
            entityDef.description = "It's a blue beast!.".getBytes();
        }
        if (npcId == 1389) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Rescue!";
            entityDef.models = new int[1];
            entityDef.models[0] = 65278;
            entityDef.name = "Princess Peach";
            entityDef.description = "Its princess peach! Hurry before bowser catch her!!.".getBytes();
        }
        if (npcId == 1866) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Go to Minecraft Zone";
            entityDef.models = new int[1];
            entityDef.models[0] = 74125;
            entityDef.name = "Villager";
            entityDef.combatLevel = 200;
            entityDef.description = "Make some trade with that villager!!.".getBytes();
        }
        if (npcId == 1391) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74126;
            entityDef.name = "Lion";
            entityDef.boundDim = (byte)2;
            entityDef.combatLevel = 133;
            entityDef.description = "RAWR! You gonna hear me roawwrr !.".getBytes();
        }
        if (npcId == 250) {
            entityDef.actions = new String[5];
            entityDef.name = "Prestige Master";
            entityDef.description = "Prestige master, can reset your stats for some points for the prestige shop.".getBytes();
            entityDef.actions[0] = "Talk To";
            entityDef.actions[2] = "Open Shop";
            entityDef.models = new int[9];
            entityDef.models[0] = 65297;
            entityDef.models[1] = 66475;
            entityDef.models[2] = 66680;
            entityDef.models[3] = 66593;
            entityDef.models[4] = 43660;
            entityDef.models[5] = 79541;
            entityDef.models[6] = 74058;
            entityDef.models[7] = 250;
            entityDef.models[8] = 20147;
        }
        if (npcId == 244) {
            entityDef.actions = new String[5];
            entityDef.name = "Slayer Pet";
            entityDef.description = "Slayer pet, yes, the one and only Slayer admin.".getBytes();
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[9];
            entityDef.models[0] = 79902;
            entityDef.models[1] = 235;
            entityDef.models[2] = 34653;
            entityDef.models[3] = 34667;
            entityDef.models[4] = 55998;
            entityDef.models[5] = 179;
            entityDef.models[6] = 185;
            entityDef.models[7] = 250;
            entityDef.models[8] = 34651;
        }
        if (npcId == 248) {
            entityDef.actions = new String[5];
            entityDef.name = "Kuri Pet";
            entityDef.description = "Kuri pet, yes, the one and only Kuri admin.".getBytes();
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[11];
            entityDef.models[0] = 18981;
            entityDef.models[1] = 186;
            entityDef.models[10] = 235;
            entityDef.models[2] = 478;
            entityDef.models[3] = 4207;
            entityDef.models[4] = 78101;
            entityDef.models[5] = 13307;
            entityDef.models[6] = 10683;
            entityDef.models[7] = 250;
            entityDef.models[8] = 6685;
            entityDef.models[9] = 11076;
        }
        if (npcId == 8312) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open shop";
            entityDef.name = "Elite Pker";
            entityDef.combatLevel = 167;
        }
        if (npcId == 9457) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open shop";
            entityDef.name = "Basic Pker";
            entityDef.combatLevel = 167;
        }
        if (npcId == 245) {
            entityDef.actions = new String[5];
            entityDef.name = "Tweety Pet";
            entityDef.description = "Tweety pet, yes, the one and only Tweety admin.".getBytes();
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[9];
            entityDef.models[0] = 4437;
            entityDef.models[1] = 79458;
            entityDef.models[2] = 79454;
            entityDef.models[3] = 79456;
            entityDef.models[4] = 70900;
            entityDef.models[5] = 79460;
            entityDef.models[6] = 18490;
            entityDef.models[7] = 250;
            entityDef.models[8] = 79462;
        }
        if (npcId == 1472) {
            entityDef.name = "Range Demon";
            entityDef.description = "Its a range demon! RUNNN!".getBytes();
        }
        if (npcId == 8918) {
            entityDef.name = "@dre@I Buy Customs";
            entityDef.description = "Sell me your custom items summoner!".getBytes();
        }
        if (npcId == 510) {
            entityDef.actions = new String[5];
            entityDef.name = "Melee Demon";
            entityDef.description = "Its a melee demon! RUNNN!".getBytes();
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[4];
            entityDef.models[0] = 17399;
            entityDef.models[1] = 17379;
            entityDef.models[2] = 17391;
            entityDef.models[3] = 17385;
            entityDef.boundDim = (byte)3;
            entityDef.standAnim = 66;
            entityDef.walkAnim = 63;
        }
        if (npcId == 663) {
            entityDef.name = "Blood Saver";
            entityDef.description = "Come spend your demon points now !".getBytes();
        }
        if (npcId == 511) {
            entityDef.actions = new String[5];
            entityDef.name = "Magic Demon";
            entityDef.description = "Its a magic demon! RUNNN!".getBytes();
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[4];
            entityDef.models[0] = 79505;
            entityDef.models[1] = 79506;
            entityDef.models[2] = 79507;
            entityDef.models[3] = 79508;
            entityDef.boundDim = (byte)3;
            entityDef.standAnim = 66;
            entityDef.walkAnim = 63;
        }
        if (npcId == 1868) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74096;
            entityDef.name = "Kalphite King";
            entityDef.combatLevel = 450;
        }
        if (npcId == 8120) {
            entityDef.name = "Melee Demon Ghost";
        }
        if (npcId == 8116) {
            entityDef.name = "Range Demon Ghost";
        }
        if (npcId == 8117) {
            entityDef.name = "Magic Demon Ghost";
        }
        if (npcId == 1869) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74097;
            entityDef.name = "Torva Survivor";
            entityDef.combatLevel = 138;
        }
        if (npcId == 1870) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74098;
            entityDef.name = "Akrisae Magician";
            entityDef.combatLevel = 200;
        }
        if (npcId == 1871) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74099;
            entityDef.name = "Sun Beast";
            entityDef.combatLevel = 876;
        }
        if (npcId == 231) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Enter Minigame";
            entityDef.name = "Cracking Wall Safe Minigame";
        }
        if (npcId == 2862) {
            entityDef.name = "Grim Reaper";
            entityDef.scaleY = 180;
            entityDef.scaleXZ = 180;
            entityDef.boundDim = (byte)3;
        }
        if (npcId == 6268) {
            entityDef.boundDim = (byte)2;
        }
        if (npcId == 1864) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74100;
            entityDef.name = "MilkoMeda";
            entityDef.combatLevel = 1;
        }
        if (npcId == 1567) {
            entityDef.name = "Smoke devil";
            entityDef.combatLevel = 160;
            entityDef.models = new int[1];
            entityDef.models[0] = 74127;
            entityDef.standAnim = 1624;
            entityDef.walkAnim = 1624;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
        }
        if (npcId == 189) {
            NPCDefinition.stream.currentOffset = NPCDefinition.streamIndices[630];
            entityDef.boundDim = (byte)3;
            entityDef.readValues(NPCDefinition.stream);
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[9];
            entityDef.models[0] = 9638;
            entityDef.models[1] = 205;
            entityDef.models[2] = 40207;
            entityDef.models[3] = 5024;
            entityDef.models[4] = 43660;
            entityDef.models[5] = 13319;
            entityDef.models[6] = 10683;
            entityDef.models[7] = 17461;
            entityDef.models[8] = 20147;
            entityDef.name = "Dark's Warrior";
            entityDef.combatLevel = 175;
            entityDef.description = "A very powerful Warrior!".getBytes();
        }
        if (npcId == 1569) {
            entityDef.name = "Callisto";
            entityDef.combatLevel = 470;
            entityDef.models = new int[1];
            entityDef.models[0] = 74128;
            NPCDefinition callisto = NPCDefinition.forID(105);
            entityDef.boundDim = (byte)4;
            entityDef.standAnim = callisto.standAnim;
            entityDef.walkAnim = callisto.walkAnim;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.scaleY = 120;
            entityDef.scaleXZ = 110;
        }
        if (npcId == 1863) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74101;
            entityDef.name = "Bubbling";
            entityDef.combatLevel = 56;
        }
        if (npcId == 1862) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74102;
            entityDef.name = "Hello Kitty";
            entityDef.combatLevel = 69;
        }
        if (npcId == 1860) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74103;
            entityDef.name = "Bisharp";
            entityDef.combatLevel = 178;
        }
        if (npcId == 1840) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74104;
            entityDef.name = "Jolteon";
            entityDef.combatLevel = 144;
        }
        if (npcId == 1839) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 74105;
            entityDef.name = "Typhlosion";
            entityDef.combatLevel = 6551;
        }
        if (npcId == 5309) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 12141;
            entityDef.name = "Blue Beast";
            entityDef.combatLevel = 200;
            entityDef.standAnim = 2783;
            entityDef.walkAnim = 833;
            entityDef.description = "It's Blue Beast.".getBytes();
        }
        if (npcId == 5570) {
            entityDef.name = "Donkey Kong";
            entityDef.models = new int[]{102};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 555;
        }
        if (npcId == 5571) {
            entityDef.name = "Sin Seer";
            entityDef.actions = new String[5];
            entityDef.models = new int[]{22319};
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 575;
            entityDef.standAnim = 5810;
            entityDef.walkAnim = 5809;
        }
        if (npcId == 5569) {
            entityDef.name = "Assassin Banker";
            entityDef.models = new int[]{71973};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Get a bank pin";
            entityDef.combatLevel = 1337;
            entityDef.standAnim = 6320;
            entityDef.walkAnim = 6319;
        }
        if (npcId == 5587) {
            entityDef.name = "Jake";
            entityDef.models = new int[]{74067};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 185;
        }
        if (npcId == 5588) {
            entityDef.name = "Robot";
            entityDef.models = new int[]{74068};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 256;
        }
        if (npcId == 4568) {
            entityDef.name = "High Bomber";
            entityDef.models = new int[]{72025};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 3;
        }
        if (npcId == 6512) {
            entityDef.name = "Ascension Beast";
            entityDef.models = new int[]{71994};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 682;
        }
        if (npcId == 6513) {
            entityDef.name = "Ascension Mage";
            entityDef.models = new int[]{71995};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 1501;
        }
        if (npcId == 6514) {
            entityDef.name = "Ascension Destroyer";
            entityDef.models = new int[]{71996};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 2500;
        }
        if (npcId == 6515) {
            entityDef.name = "Ascension Defender";
            entityDef.models = new int[]{71997};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 1800;
        }
        if (npcId == 6516) {
            entityDef.name = "Ascension Defender";
            entityDef.models = new int[]{71998};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 1900;
        }
        if (npcId == 6517) {
            entityDef.name = "Ascension Ranger";
            entityDef.models = new int[]{71999};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 999;
        }
        if (npcId == 6518) {
            entityDef.name = "Vorago Minion";
            entityDef.models = new int[]{72000};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 500;
        }
        if (npcId == 6519) {
            entityDef.name = "Rage Vorago";
            entityDef.models = new int[]{79489};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 1500;
            entityDef.boundDim = (byte)6;
            entityDef.standAnim = 12193;
            entityDef.walkAnim = 12195;
        }
        if (npcId == 6520) {
            entityDef.name = "Vorago";
            entityDef.models = new int[]{79484};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 1500;
            entityDef.boundDim = (byte)6;
            entityDef.standAnim = 12193;
            entityDef.walkAnim = 12195;
        }
        if (npcId == 232) {
            entityDef.name = "Omen";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Talk-to";
        }
        if (npcId == 8848) {
            entityDef.name = "Donator Store";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
        }
        if (npcId == 8849) {
            entityDef.name = "Donator Store";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
        }
        if (npcId == 8850) {
            entityDef.name = "Donator Store";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
        }
        if (npcId == 8851) {
            entityDef.name = "Donator Store";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
        }
        if (npcId == 8852) {
            entityDef.name = "Donator Store";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
        }
        if (npcId == 7138) {
            entityDef.name = "Aggressive mage";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Talk to";
            entityDef.combatLevel = 153;
        }
        if (npcId == 1614) {
            entityDef.name = "Aggressive demon";
        }
        if (npcId == 1336) {
            entityDef.name = "Vote Store";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
        }
        if (npcId == 3387) {
            entityDef.name = "Trivia Store";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
        }
        if (npcId == 3517) {
            entityDef.name = "SkillPoints Store";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Open Shop";
        }
        if (npcId == 1225) {
            entityDef.name = "Bryan the gate protector";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Discuss with";
        }
        if (npcId == 83) {
            entityDef.name = "Fire Demon";
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
        }
        if (npcId == 5088) {
            entityDef.name = "Luigi";
            entityDef.models = new int[]{75106};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 250;
        }
        if (npcId == 5089) {
            entityDef.name = "Ninja";
            entityDef.models = new int[]{75928};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 175;
            entityDef.standAnim = 1501;
            entityDef.walkAnim = 1851;
        }
        if (npcId == 5087) {
            entityDef.name = "Megaman";
            entityDef.models = new int[]{75105};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 200;
        }
        if (npcId == 9161) {
            entityDef.name = "Arrav hero";
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 180;
        }
        if (npcId == 93) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 79589;
            entityDef.name = "Mewtwo";
            entityDef.boundDim = (byte)2;
            entityDef.combatLevel = 150;
            entityDef.description = "It's a legendary pokemon.".getBytes();
        }
        if (npcId == 7969) {
            entityDef.name = "Mr.Trophy";
        }
        if (npcId == 5086) {
            entityDef.name = "Pikachu";
            entityDef.models = new int[]{75104};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 210;
        }
        if (npcId == 4502) {
            entityDef.name = "Ethereal Mage";
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 150;
        }
        if (npcId == 8249) {
            entityDef.name = "Transformed Horse";
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.actions[2] = null;
            entityDef.actions[3] = null;
            entityDef.actions[4] = null;
            entityDef.combatLevel = 118;
            entityDef.aBoolean87 = true;
        }
        if (npcId == 6112) {
            entityDef.name = "Pikachu Pet";
            entityDef.models = new int[]{75104};
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 210;
            entityDef.scaleY = 75;
            entityDef.scaleXZ = 75;
            entityDef.boundDim = 1;
        }
        if (npcId == 22519) {
            entityDef.name = "Olmlet Pet";
        }
        if (npcId == 22334) {
            entityDef.name = "Giant Squirrel Pet";
        }
        if (npcId == 185) {
            entityDef.name = "Hulk Pet";
            entityDef.models = new int[]{94259};
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 210;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.scaleY = 80;
            entityDef.scaleXZ = 80;
            entityDef.boundDim = 1;
        }
        if (npcId == 190) {
            entityDef.name = "Thanos Pet";
            entityDef.models = new int[]{94277};
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 1000;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.scaleY = 80;
            entityDef.scaleXZ = 80;
        }
        if (npcId == 44) {
            entityDef.name = "Diablo Pet";
            entityDef.models = new int[]{50025};
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 550;
            entityDef.standAnim = 10921;
            entityDef.walkAnim = 10920;
            entityDef.scaleY = 25;
            entityDef.scaleXZ = 25;
            entityDef.boundDim = 1;
            entityDef.description = "Diablo Pet".getBytes();
        }
        if (npcId == 43) {
            entityDef.name = "Zeus Pet";
            entityDef.models = new int[]{57393};
            entityDef.actions = new String[]{"Get Buff", null, null, null, null};
            entityDef.combatLevel = 1200;
            entityDef.standAnim = 1501;
            entityDef.walkAnim = 1851;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
            entityDef.boundDim = 1;
            entityDef.description = "Zeus".getBytes();
        }
        if (npcId == 49) {
            entityDef.name = "Diablo Minion";
            entityDef.models = new int[]{50025};
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.combatLevel = 400;
            entityDef.boundDim = (byte)5;
            entityDef.standAnim = 10921;
            entityDef.walkAnim = 10920;
            entityDef.scaleY = 35;
            entityDef.scaleXZ = 35;
            entityDef.anInt79 = 0;
            entityDef.description = "Diablo Minion".getBytes();
        }
        if (npcId == 6205) {
            entityDef.name = "Mini Diablo";
            entityDef.models = new int[]{50025};
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.combatLevel = 400;
            entityDef.boundDim = (byte)2;
            entityDef.standAnim = 10921;
            entityDef.walkAnim = 10920;
            entityDef.scaleY = 40;
            entityDef.scaleXZ = 40;
            entityDef.anInt79 = 0;
            entityDef.description = "Mini-Diablo".getBytes();
        }
        if (npcId == 6113) {
            entityDef.name = "Raichu";
            entityDef.models = new int[]{79511};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 350;
        }
        if (npcId == 6114) {
            entityDef.name = "Raichu Pet";
            entityDef.models = new int[]{79511};
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 350;
            entityDef.scaleY = 75;
            entityDef.scaleXZ = 75;
            entityDef.boundDim = 1;
        }
        if (npcId == 3610) {
            entityDef.name = "Scare Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 350;
            entityDef.boundDim = 1;
        }
        if (npcId == 8455) {
            entityDef.name = "Light orb Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.scaleY = 75;
            entityDef.scaleXZ = 75;
            entityDef.boundDim = 1;
        }
        if (npcId == 1020) {
            entityDef.name = "Stone Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
        }
        if (npcId == 9019) {
            entityDef.name = "Imp Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
        }
        if (npcId == 256) {
            entityDef.actions = new String[5];
            entityDef.name = "Bandosian Warlord";
            entityDef.description = "A warlord of the bandosian team.".getBytes();
            entityDef.actions[0] = "Talk-to";
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[7];
            entityDef.models[0] = 79520;
            entityDef.models[1] = 79521;
            entityDef.models[2] = 79522;
            entityDef.models[3] = 79523;
            entityDef.models[4] = 79524;
            entityDef.models[5] = 79525;
            entityDef.models[6] = 250;
        }
        if (npcId == 257) {
            entityDef.actions = new String[5];
            entityDef.name = "Bandosian";
            entityDef.description = "A bandosian of the bandosian team.".getBytes();
            entityDef.actions[0] = "Talk-to";
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[8];
            entityDef.models[0] = 79526;
            entityDef.models[1] = 79527;
            entityDef.models[2] = 79528;
            entityDef.models[3] = 79529;
            entityDef.models[4] = 79530;
            entityDef.models[5] = 79531;
            entityDef.models[6] = 79532;
            entityDef.models[7] = 250;
        }
        if (npcId == 5085) {
            entityDef.name = "Spongebob";
            entityDef.models = new int[]{79400};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 140;
        }
        if (npcId == 5094) {
            entityDef.name = "Homer Simpson";
            entityDef.models = new int[]{79399};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 250;
        }
        if (npcId == 5098) {
            entityDef.name = "Ho-Oh";
            entityDef.models = new int[]{35233};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 250;
        }
        if (npcId == 5097) {
            entityDef.name = "Onix";
            entityDef.models = new int[]{35232};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 250;
        }
        if (npcId == 5096) {
            entityDef.name = "Charmeleon";
            entityDef.models = new int[]{35231};
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.combatLevel = 250;
        }
        if (npcId == 7161) {
            entityDef.boundDim = 1;
            entityDef.readValues(NPCDefinition.stream);
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[1];
            entityDef.models[0] = 30827;
            entityDef.name = "Vorago Pet";
            entityDef.description = "Vorago Pet.".getBytes();
            entityDef.standAnim = 12193;
            entityDef.walkAnim = 12195;
        }
        if (npcId == 7162) {
            entityDef.boundDim = 1;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 30827;
            entityDef.name = "Vorago servant";
            entityDef.description = "Vorago Pet.".getBytes();
            entityDef.standAnim = 12193;
            entityDef.walkAnim = 12195;
        }
        if (npcId == 7164) {
            entityDef.boundDim = (byte)2;
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[5];
            entityDef.models[0] = 79493;
            entityDef.models[1] = 79495;
            entityDef.models[2] = 79496;
            entityDef.models[3] = 79497;
            entityDef.models[4] = 79498;
            entityDef.name = "Legio Primus";
            entityDef.description = "Legio".getBytes();
            entityDef.standAnim = 1501;
            entityDef.walkAnim = 1851;
        }
        if (npcId == 4000) {
            entityDef.name = "KBD Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{17414, 17415, 17429, 17422};
            entityDef.combatLevel = 276;
            entityDef.standAnim = 90;
            entityDef.walkAnim = 4635;
            entityDef.scaleY = 50;
            entityDef.scaleXZ = 50;
        }
        if (npcId == 8023) {
            entityDef.readValues(NPCDefinition.stream);
            entityDef.name = "Sun pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.scaleY = 80;
            entityDef.scaleXZ = 80;
            entityDef.boundDim = 1;
        }
        if (npcId == 8027) {
            entityDef.readValues(NPCDefinition.stream);
            entityDef.name = "Grass pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
            entityDef.boundDim = 1;
        }
        if (npcId == 4965) {
            entityDef.name = "Fortune Gnome";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Discuss";
        }
        if (npcId == 4001) {
            entityDef.name = "General Graardor Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{27785, 27789};
            entityDef.combatLevel = 624;
            entityDef.standAnim = 7059;
            entityDef.walkAnim = 7058;
            entityDef.scaleY = 40;
            entityDef.scaleXZ = 40;
        }
        if (npcId == 4002) {
            entityDef.name = "TzTok-Jad Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{34131};
            entityDef.combatLevel = 702;
            entityDef.standAnim = 9274;
            entityDef.walkAnim = 9273;
            entityDef.scaleY = 40;
            entityDef.scaleXZ = 40;
        }
        if (npcId == 4003) {
            entityDef.name = "Chaos Elemental Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{11216};
            entityDef.combatLevel = 305;
            entityDef.standAnim = 3144;
            entityDef.walkAnim = 3145;
            entityDef.scaleY = 60;
            entityDef.scaleXZ = 60;
        }
        if (npcId == 4004) {
            entityDef.name = "Corporeal Beast Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{40955};
            entityDef.combatLevel = 785;
            entityDef.standAnim = 10056;
            entityDef.walkAnim = 10055;
            entityDef.scaleY = 40;
            entityDef.scaleXZ = 40;
        }
        if (npcId == 4005) {
            entityDef.name = "Kree Arra Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{28003, 28004};
            entityDef.combatLevel = 580;
            entityDef.standAnim = 6972;
            entityDef.walkAnim = 6973;
            entityDef.scaleY = 40;
            entityDef.scaleXZ = 40;
        }
        if (npcId == 4035) {
            entityDef.name = "K'ril Tsutsaroth Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{27765, 27768, 27770, 27773, 27764};
            entityDef.combatLevel = 650;
            entityDef.standAnim = 6943;
            entityDef.walkAnim = 6942;
            entityDef.scaleY = 40;
            entityDef.scaleXZ = 40;
        }
        if (npcId == 4007) {
            entityDef.name = "Commander Zilyana Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{28057, 28071, 28078, 28056};
            entityDef.combatLevel = 596;
            entityDef.standAnim = 6963;
            entityDef.walkAnim = 6962;
            entityDef.scaleY = 90;
            entityDef.scaleXZ = 90;
        }
        if (npcId == 4008) {
            entityDef.name = "Dagannoth Supreme Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{9941, 9943};
            entityDef.combatLevel = 303;
            entityDef.standAnim = 2850;
            entityDef.walkAnim = 2849;
            entityDef.scaleY = 90;
            entityDef.scaleXZ = 90;
        }
        if (npcId == 4009) {
            entityDef.name = "Dagannoth Prime Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[3];
            entityDef.models[0] = 9940;
            entityDef.models[1] = 9943;
            entityDef.models[2] = 9942;
            int changedColors1 = 4;
            entityDef.originalModelColors = new int[changedColors1];
            entityDef.modifiedModelColors = new int[changedColors1];
            entityDef.originalModelColors[0] = 11930;
            entityDef.originalModelColors[1] = 27144;
            entityDef.originalModelColors[2] = 16536;
            entityDef.originalModelColors[3] = 16540;
            entityDef.modifiedModelColors[0] = 5931;
            entityDef.modifiedModelColors[1] = 1688;
            entityDef.modifiedModelColors[2] = 21530;
            entityDef.modifiedModelColors[3] = 21534;
            entityDef.combatLevel = 303;
            entityDef.standAnim = 2850;
            entityDef.walkAnim = 2849;
            entityDef.scaleY = 90;
            entityDef.scaleXZ = 90;
        }
        if (npcId == 4010) {
            entityDef.name = "Dagannoth Rex Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[1];
            entityDef.models[0] = 9941;
            changedColors2 = 4;
            entityDef.originalModelColors = new int[changedColors2];
            entityDef.modifiedModelColors = new int[changedColors2];
            entityDef.originalModelColors[0] = 16536;
            entityDef.originalModelColors[1] = 16540;
            entityDef.originalModelColors[2] = 27144;
            entityDef.originalModelColors[3] = 2477;
            entityDef.modifiedModelColors[0] = 7322;
            entityDef.modifiedModelColors[1] = 7326;
            entityDef.modifiedModelColors[2] = 10403;
            entityDef.modifiedModelColors[3] = 2595;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 2850;
            entityDef.walkAnim = 2849;
            entityDef.scaleY = 90;
            entityDef.scaleXZ = 90;
        }
        if (npcId == 4011) {
            entityDef.name = "Ahrim the Blighted";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{6668};
            entityDef.combatLevel = 98;
            entityDef.standAnim = 813;
            entityDef.walkAnim = 1205;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
        }
        if (npcId == 4012) {
            entityDef.name = "Dharok the Wretched";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{6652, 6671, 6640, 6661, 6703, 6679};
            entityDef.combatLevel = 115;
            entityDef.standAnim = 2065;
            entityDef.walkAnim = 2064;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
        }
        if (npcId == 4013) {
            entityDef.name = "Guthan the Infested";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{6654, 6673, 6642, 6666, 6679, 6710};
            entityDef.standAnim = 813;
            entityDef.walkAnim = 1205;
            entityDef.combatLevel = 115;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
        }
        if (npcId == 4014) {
            entityDef.name = "Karil the Tainted";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{6675};
            entityDef.standAnim = 2074;
            entityDef.walkAnim = 2076;
            entityDef.combatLevel = 98;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
        }
        if (npcId == 4015) {
            entityDef.name = "Torag the Corrupted";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{6657, 6677, 6645, 6663, 6708, 6679};
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.combatLevel = 115;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
        }
        if (npcId == 4016) {
            entityDef.name = "Verac the Defiled";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[]{6678, 6705};
            entityDef.standAnim = 2061;
            entityDef.walkAnim = 2060;
            entityDef.combatLevel = 115;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
        }
        if (npcId == 20866) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
        }
        if (npcId == 20864) {
            entityDef.walkAnim = 24488;
            entityDef.standAnim = 24484;
            entityDef.combatLevel = 750;
            entityDef.models = new int[]{30014};
            entityDef.name = "Skeletal Cerberus";
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
        }
        if (npcId == 4017) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.name = "Cerberus Pet";
            entityDef.description = "Thanks to Sausage ( rune-server.org ) for this npc!".getBytes();
            entityDef.combatLevel = 199;
            entityDef.models = new int[4];
            entityDef.models[0] = 35055;
            entityDef.models[1] = 35056;
            entityDef.models[2] = 35057;
            entityDef.models[3] = 35058;
            entityDef.standAnim = 6561;
            entityDef.walkAnim = 6583;
            entityDef.scaleY = 85;
            entityDef.scaleXZ = 85;
        }
        if (npcId == 4018) {
            entityDef.name = "Ninja Servant Pet";
            entityDef.models = new int[]{75928};
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 175;
            entityDef.standAnim = 1501;
            entityDef.walkAnim = 1851;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
        }
        if (npcId == 4019) {
            entityDef.name = "Sin Seer Pet";
            entityDef.models = new int[]{22319};
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 575;
            entityDef.standAnim = 5810;
            entityDef.walkAnim = 5809;
            entityDef.scaleY = 70;
            entityDef.scaleXZ = 70;
        }
        if (npcId == 4020) {
            entityDef.name = "Callisto Pet";
            entityDef.combatLevel = 470;
            entityDef.models = new int[1];
            entityDef.models[0] = 74128;
            NPCDefinition callisto = NPCDefinition.forID(105);
            entityDef.standAnim = callisto.standAnim;
            entityDef.walkAnim = callisto.walkAnim;
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.scaleY = 50;
            entityDef.scaleXZ = 40;
        }
        if (npcId == 6028) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.name = "Tormented Demon Pet";
            entityDef.combatLevel = 450;
            entityDef.models = new int[1];
            entityDef.standAnim = 10921;
            entityDef.walkAnim = 10920;
            entityDef.models[0] = 44733;
            entityDef.description = "Dangerous shit bro...".getBytes();
            entityDef.scaleY = 50;
            entityDef.scaleXZ = 50;
        }
        if (npcId == 6037) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.name = "Barebones Pet";
            entityDef.combatLevel = 941;
            entityDef.scaleY = 90;
            entityDef.scaleXZ = 90;
            entityDef.standAnim = 5558;
            entityDef.walkAnim = 5557;
            entityDef.models = new int[1];
            entityDef.models[0] = 20906;
        }
        if (npcId == 4023) {
            entityDef.models = new int[1];
            entityDef.models[0] = 62717;
            entityDef.name = "Nex Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 1001;
            entityDef.scaleY = 70;
            entityDef.scaleXZ = 70;
            entityDef.standAnim = 6320;
            entityDef.walkAnim = 6319;
        }
        if (npcId == 1691) {
            entityDef.boundDim = (byte)2;
        }
        if (npcId == 7231) {
            entityDef.models = new int[9];
            entityDef.models[0] = 233;
            entityDef.models[1] = 247;
            entityDef.models[2] = 312;
            entityDef.models[3] = 323;
            entityDef.models[4] = 152;
            entityDef.models[5] = 179;
            entityDef.models[6] = 6098;
            entityDef.models[7] = 263;
            entityDef.models[8] = 4954;
            entityDef.name = "Drunk Slave Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 522;
            entityDef.standAnim = 3040;
            entityDef.walkAnim = 3039;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
        }
        if (npcId == 7229) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.name = "Alchemist Servant Pet";
            entityDef.combatLevel = 130;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
            entityDef.models = new int[7];
            entityDef.models[0] = 207;
            entityDef.models[1] = 248;
            entityDef.models[2] = 22604;
            entityDef.models[3] = 22596;
            entityDef.models[4] = 177;
            entityDef.models[5] = 17525;
            entityDef.models[6] = 181;
            entityDef.standAnim = 5823;
            entityDef.walkAnim = 5822;
        }
        if (npcId == 6036) {
            entityDef.models = new int[4];
            entityDef.models[0] = 12076;
            entityDef.models[1] = 12075;
            entityDef.models[2] = 12074;
            entityDef.models[3] = 12077;
            entityDef.name = "Mole Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 230;
            entityDef.scaleY = 50;
            entityDef.scaleXZ = 50;
            entityDef.standAnim = 3309;
            entityDef.walkAnim = 3313;
        }
        if (npcId == 6039) {
            entityDef.models = new int[4];
            entityDef.models[0] = 13905;
            entityDef.models[1] = 13906;
            entityDef.models[2] = 13907;
            entityDef.name = "Flambeed Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 149;
            entityDef.scaleY = 30;
            entityDef.scaleXZ = 30;
            entityDef.standAnim = 1749;
            entityDef.walkAnim = 1748;
        }
        if (npcId == 6033) {
            entityDef.models = new int[4];
            entityDef.models[0] = 24597;
            entityDef.models[1] = 24598;
            entityDef.name = "Kalphite Queen Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 333;
            entityDef.scaleY = 40;
            entityDef.scaleXZ = 40;
            entityDef.standAnim = 6239;
            entityDef.walkAnim = 6238;
        }
        if (npcId == 6035) {
            entityDef.models = new int[4];
            entityDef.models[0] = 24602;
            entityDef.models[1] = 24605;
            entityDef.models[2] = 24606;
            entityDef.name = "Kalphite Queen Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 333;
            entityDef.scaleY = 40;
            entityDef.scaleXZ = 40;
            entityDef.standAnim = 6236;
            entityDef.walkAnim = 6236;
        }
        if (npcId == 6032) {
            entityDef.models = new int[4];
            entityDef.models[0] = 22790;
            entityDef.name = "BarrelChest Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 190;
            entityDef.scaleY = 70;
            entityDef.scaleXZ = 70;
            entityDef.standAnim = 5893;
            entityDef.walkAnim = 5892;
        }
        if (npcId == 6038) {
            entityDef.models = new int[4];
            entityDef.models[0] = 17380;
            entityDef.models[1] = 17397;
            entityDef.models[2] = 17384;
            entityDef.models[3] = 17401;
            entityDef.name = "Agrith Naar Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.combatLevel = 100;
            entityDef.scaleY = 70;
            entityDef.scaleXZ = 70;
            entityDef.standAnim = 4675;
            entityDef.walkAnim = 4674;
        }
        if (npcId == 1092) {
            entityDef.name = "Lucky Knight";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Taunt";
            entityDef.actions[1] = "Attack";
            entityDef.scaleXZ = 400;
            entityDef.scaleY = 400;
            entityDef.boundDim = (byte)2;
            entityDef.combatLevel = 1500;
        }
        if (npcId == 7230) {
            entityDef.models = new int[8];
            entityDef.models[0] = 391;
            entityDef.models[1] = 471;
            entityDef.models[2] = 332;
            entityDef.models[3] = 353;
            entityDef.models[4] = 419;
            entityDef.models[5] = 358;
            entityDef.models[6] = 414;
            entityDef.models[7] = 6098;
            entityDef.name = "Whore Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.scaleY = 130;
            entityDef.scaleXZ = 130;
            changedColors2 = 3;
            entityDef.originalModelColors = new int[changedColors2];
            entityDef.modifiedModelColors = new int[changedColors2];
            entityDef.originalModelColors[0] = 25238;
            entityDef.modifiedModelColors[0] = 4550;
            entityDef.originalModelColors[1] = 6798;
            entityDef.modifiedModelColors[1] = 58062;
            entityDef.originalModelColors[1] = 8741;
            entityDef.modifiedModelColors[1] = 4550;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
        }
        if (npcId == 692) {
            entityDef.name = "Vote Point Shop";
        }
        if (npcId == 7282) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.models = new int[1];
            entityDef.models[0] = 63604;
            entityDef.standAnim = 12790;
            entityDef.walkAnim = 12790;
            entityDef.scaleY = 150;
            entityDef.scaleXZ = 150;
            entityDef.boundDim = (byte)5;
            entityDef.name = "Wildywyrm";
            entityDef.combatLevel = 382;
            entityDef.description = "It's made of pure fire.".getBytes();
        }
        if (npcId == 4034) {
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            entityDef.models = new int[1];
            entityDef.models[0] = 63604;
            entityDef.standAnim = 12790;
            entityDef.walkAnim = 12790;
            entityDef.scaleY = 50;
            entityDef.scaleXZ = 50;
            entityDef.name = "Wildywyrm Pet";
            entityDef.combatLevel = 382;
            entityDef.description = "It's made of pure fire.".getBytes();
        }
        if (npcId == 6302) {
            entityDef.models = new int[2];
            entityDef.models[0] = 62790;
            entityDef.models[1] = 28295;
            entityDef.name = "Venenatis";
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.scaleY = 200;
            entityDef.scaleXZ = 200;
            entityDef.boundDim = (byte)5;
            NPCDefinition ven = NPCDefinition.forID(60);
            entityDef.standAnim = ven.standAnim;
            entityDef.walkAnim = ven.walkAnim;
            entityDef.combatLevel = 464;
        }
        if (npcId == 6027) {
            entityDef.models = new int[2];
            entityDef.models[0] = 62790;
            entityDef.models[1] = 28295;
            entityDef.name = "Venenatis Pet";
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.scaleY = 70;
            entityDef.scaleXZ = 70;
            NPCDefinition ven = NPCDefinition.forID(60);
            entityDef.standAnim = ven.standAnim;
            entityDef.walkAnim = ven.walkAnim;
            entityDef.combatLevel = 464;
        }
        if (npcId == 6303) {
            entityDef.models = new int[1];
            entityDef.models[0] = 28293;
            entityDef.name = "Scorpia";
            entityDef.boundDim = (byte)5;
            entityDef.scaleY = 200;
            entityDef.scaleXZ = 200;
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            NPCDefinition scor = NPCDefinition.forID(107);
            entityDef.standAnim = scor.standAnim;
            entityDef.walkAnim = scor.walkAnim;
            entityDef.combatLevel = 464;
        }
        if (npcId == 6030) {
            entityDef.models = new int[1];
            entityDef.models[0] = 28293;
            entityDef.name = "Scorpia Pet";
            entityDef.scaleY = 70;
            entityDef.scaleXZ = 70;
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            NPCDefinition scor = NPCDefinition.forID(107);
            entityDef.standAnim = scor.standAnim;
            entityDef.walkAnim = scor.walkAnim;
            entityDef.combatLevel = 464;
        }
        if (npcId == 6304) {
            entityDef.models = new int[1];
            entityDef.models[0] = 28299;
            entityDef.name = "Vet'ion";
            entityDef.boundDim = (byte)4;
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            NPCDefinition vet = NPCDefinition.forID(90);
            entityDef.standAnim = vet.standAnim;
            entityDef.walkAnim = vet.walkAnim;
            entityDef.combatLevel = 464;
        }
        if (npcId == 6031) {
            entityDef.models = new int[1];
            entityDef.models[0] = 28299;
            entityDef.name = "Vet'ion Pet";
            entityDef.scaleY = 70;
            entityDef.scaleXZ = 70;
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            NPCDefinition vet = NPCDefinition.forID(90);
            entityDef.standAnim = vet.standAnim;
            entityDef.walkAnim = vet.walkAnim;
            entityDef.combatLevel = 464;
        }
        if (npcId == 6305) {
            entityDef.name = "Kraken Pet";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pick-up";
            NPCDefinition cave = NPCDefinition.forID(3847);
            entityDef.models = new int[1];
            entityDef.models[0] = 28231;
            entityDef.combatLevel = 127;
            entityDef.boundDim = (byte)2;
            entityDef.standAnim = 3989;
            entityDef.walkAnim = cave.walkAnim;
            entityDef.scaleY = 42;
            entityDef.scaleXZ = 42;
        }
        if (npcId == 6306) {
            entityDef.name = "Kraken";
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            NPCDefinition kra = NPCDefinition.forID(3847);
            entityDef.models = new int[1];
            entityDef.models[0] = 28231;
            entityDef.combatLevel = 291;
            entityDef.standAnim = 3989;
            entityDef.boundDim = (byte)4;
            entityDef.walkAnim = kra.walkAnim;
            entityDef.scaleY = 84;
            entityDef.scaleXZ = 84;
        }
        if (npcId == 6307) {
            entityDef.name = "Mystical Imp";
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.models = new int[1];
            entityDef.models[0] = 28965;
            entityDef.combatLevel = 188;
            entityDef.standAnim = 171;
            entityDef.boundDim = (byte)2;
            entityDef.walkAnim = 168;
            entityDef.scaleY = 304;
            entityDef.scaleXZ = 304;
        }
        if (npcId == 6029) {
            entityDef.name = "Mystical Imp Pet";
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.models = new int[1];
            entityDef.models[0] = 28965;
            entityDef.combatLevel = 188;
            entityDef.standAnim = 171;
            entityDef.walkAnim = 168;
            entityDef.scaleY = 154;
            entityDef.scaleXZ = 154;
        }
        if (npcId == 269) {
            entityDef.walkAnim = 6582;
            entityDef.boundDim = (byte)2;
            entityDef.standAnim = 6580;
        }
        if (npcId == 4223) {
            entityDef.models = new int[1];
            entityDef.models[0] = 79263;
            entityDef.name = "Zulrah";
            entityDef.boundDim = (byte)4;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.standAnim = 4037;
            entityDef.walkAnim = 4037;
            entityDef.combatLevel = 725;
        }
        if (npcId == 6026) {
            entityDef.models = new int[1];
            entityDef.models[0] = 79263;
            entityDef.name = "Zulrah Pet";
            entityDef.scaleY = 25;
            entityDef.scaleXZ = 25;
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.standAnim = 4037;
            entityDef.walkAnim = 4037;
            entityDef.combatLevel = 725;
        }
        if (npcId == 4221) {
            entityDef.models = new int[1];
            entityDef.models[0] = 79264;
            entityDef.name = "Zulrah";
            entityDef.boundDim = (byte)4;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.standAnim = 4037;
            entityDef.walkAnim = 4037;
            entityDef.combatLevel = 725;
        }
        if (npcId == 7233) {
            entityDef.models = new int[1];
            entityDef.models[0] = 79264;
            entityDef.name = "Zulrah Pet";
            entityDef.scaleY = 25;
            entityDef.scaleXZ = 25;
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.standAnim = 4037;
            entityDef.walkAnim = 4037;
            entityDef.combatLevel = 725;
        }
        if (npcId == 4222) {
            entityDef.models = new int[1];
            entityDef.models[0] = 79265;
            entityDef.name = "Zulrah";
            entityDef.boundDim = (byte)4;
            entityDef.scaleY = 100;
            entityDef.scaleXZ = 100;
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.standAnim = 4037;
            entityDef.walkAnim = 4037;
            entityDef.combatLevel = 725;
        }
        if (npcId == 7232) {
            entityDef.models = new int[1];
            entityDef.models[0] = 79265;
            entityDef.name = "Zulrah Pet";
            entityDef.scaleY = 25;
            entityDef.scaleXZ = 25;
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.standAnim = 4037;
            entityDef.walkAnim = 4037;
            entityDef.combatLevel = 725;
        }
        if (npcId == 4515) {
            entityDef.models = new int[4];
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Attack";
            entityDef.name = "Cerberus";
            entityDef.description = "Thanks to Sausage ( rune-server.org ) for this npc!".getBytes();
            entityDef.combatLevel = 199;
            entityDef.models[0] = 35055;
            entityDef.models[1] = 35056;
            entityDef.models[2] = 35057;
            entityDef.models[3] = 35058;
            entityDef.standAnim = 6561;
            entityDef.walkAnim = 6583;
        }
        if (npcId == 5581) {
            entityDef.actions = new String[5];
            entityDef.actions[1] = "Attack";
            entityDef.name = "Homerectus";
            entityDef.combatLevel = 578;
        }
        if (npcId == 6309) {
            entityDef.name = "Celestial Dragon";
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.models = new int[2];
            entityDef.models[0] = 79352;
            entityDef.models[1] = 79351;
            entityDef.combatLevel = 127;
            entityDef.standAnim = 12248;
            entityDef.boundDim = (byte)4;
            entityDef.walkAnim = 12246;
        }
        if (npcId == 7234) {
            entityDef.name = "Celestial Dragon Pet";
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.models = new int[2];
            entityDef.models[0] = 79352;
            entityDef.models[1] = 79351;
            entityDef.combatLevel = 127;
            entityDef.standAnim = 12248;
            entityDef.boundDim = (byte)2;
            entityDef.scaleY = 60;
            entityDef.scaleXZ = 60;
            entityDef.walkAnim = 12246;
        }
        if (npcId == 7235) {
            entityDef.name = "Alien demon";
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.models = new int[2];
            entityDef.models[0] = 79404;
            entityDef.combatLevel = 124;
            entityDef.boundDim = 1;
            entityDef.scaleY = 75;
            entityDef.scaleXZ = 75;
            entityDef.standAnim = 1536;
            entityDef.walkAnim = 1534;
        }
        if (npcId == 7239) {
            entityDef.name = "Warped terrorbird Pet";
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.models = new int[4];
            entityDef.models[0] = 28331;
            entityDef.models[1] = 28339;
            entityDef.models[2] = 28334;
            entityDef.models[3] = 28336;
            entityDef.combatLevel = 81;
            entityDef.boundDim = 1;
            entityDef.scaleY = 65;
            entityDef.scaleXZ = 65;
            entityDef.standAnim = 7105;
            entityDef.walkAnim = 7106;
        }
        if (npcId == 7240) {
            entityDef.name = "Forgotten Warrior Pet";
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.models = new int[6];
            entityDef.models[0] = 56353;
            entityDef.models[1] = 56417;
            entityDef.models[2] = 56434;
            entityDef.models[3] = 56515;
            entityDef.models[4] = 56478;
            entityDef.models[5] = 56181;
            entityDef.combatLevel = 130;
            entityDef.boundDim = 1;
            entityDef.scaleY = 85;
            entityDef.scaleXZ = 85;
            entityDef.standAnim = 13217;
            entityDef.walkAnim = 13218;
        }
        if (npcId == 7241) {
            entityDef.name = "Prestigious Pet";
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.models = new int[1];
            entityDef.models[0] = 41508;
            entityDef.combatLevel = 100;
            entityDef.boundDim = 1;
            entityDef.scaleY = 85;
            entityDef.scaleXZ = 85;
            entityDef.standAnim = 10176;
            entityDef.walkAnim = 10176;
        }
        if (npcId == 7236) {
            entityDef.name = "Bork Pet";
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.models = new int[2];
            entityDef.models[0] = 32351;
            entityDef.models[1] = 32352;
            entityDef.combatLevel = 267;
            entityDef.boundDim = (byte)2;
            entityDef.scaleY = 55;
            entityDef.scaleXZ = 55;
            entityDef.standAnim = 8753;
            entityDef.walkAnim = 8752;
        }
        if (npcId == 7237) {
            entityDef.name = "Orc legion Pet";
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.models = new int[2];
            entityDef.models[0] = 32348;
            entityDef.models[1] = 32347;
            entityDef.combatLevel = 70;
            entityDef.boundDim = 1;
            entityDef.standAnim = 8763;
            entityDef.walkAnim = 8764;
        }
        if (npcId == 7238) {
            entityDef.name = "Shadow-Forger Pet";
            entityDef.actions = new String[]{"Pick-up", null, null, null, null};
            entityDef.models = new int[1];
            entityDef.models[0] = 55402;
            entityDef.combatLevel = 117;
            entityDef.boundDim = 1;
            entityDef.scaleY = 35;
            entityDef.scaleXZ = 35;
            entityDef.standAnim = 13015;
            entityDef.walkAnim = 13015;
        }
        if (npcId == 240) {
            entityDef.name = "Skeletal Cerberus";
            entityDef.models = new int[]{30014};
            entityDef.boundDim = (byte)5;
            entityDef.actions = new String[]{null, "Attack", "Pickpocket", null, null};
            entityDef.standAnim = 24484;
            entityDef.walkAnim = 24488;
            entityDef.combatLevel = 318;
            entityDef.scaleXZ = 128;
            entityDef.scaleY = 128;
            entityDef.revisionType = RevisionType.OSRS;
        }
        if (npcId == 9261) {
            entityDef.name = "Vulture";
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.combatLevel = 150;
            entityDef.boundDim = 1;
            entityDef.scaleY = 150;
            entityDef.scaleXZ = 150;
        }
        if (npcId == 2397) {
            entityDef.name = "Mysterious shadow";
            entityDef.actions = new String[]{null, "Attack", null, null, null};
            entityDef.combatLevel = 150;
        }
        if (npcId == 1281) {
            entityDef.name = "Impling Catcher";
        }
        if (npcId == 3639) {
            entityDef.name = "PvP Master";
        }
        if (npcId == 1781) {
            entityDef.name = "Impling Catcher Shop";
        }
        if (npcId != 7868) return entityDef;
        entityDef.name = "Divine Impling";
        entityDef.actions = new String[]{"Catch", null, null, null, null};
        entityDef.models = new int[2];
        entityDef.models[0] = 79367;
        entityDef.models[1] = 26367;
        entityDef.standAnim = 6613;
        entityDef.walkAnim = 6614;
        entityDef.anInt85 = 25;
        entityDef.anInt92 = 75;
        return entityDef;
    }
}


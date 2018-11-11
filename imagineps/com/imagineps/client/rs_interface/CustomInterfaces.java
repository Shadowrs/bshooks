/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.imagineps.client.rs_interface;

import com.imagineps.client.Client;
import com.imagineps.client.RSFont;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.definition.NPCDefinition;
import com.imagineps.client.rs_interface.RSInterface;
import com.imagineps.client.rs_interface.impl.AdvancedSpriteWidget;
import com.imagineps.client.rs_interface.impl.CountDownTimerWidget;
import com.imagineps.client.rs_interface.impl.DrawCharacterWidget;
import com.imagineps.client.rs_interface.impl.InputFieldWidget;
import com.imagineps.client.rs_interface.impl.ItemSpinnerWidget;
import com.imagineps.client.rs_interface.impl.MenuItem;
import com.imagineps.client.rs_interface.impl.ToggleSpriteWidget;
import java.util.Arrays;
import java.util.List;

public final class CustomInterfaces
extends RSInterface {
    public static void loadCustomInterfaces(TextDrawingArea[] textDrawingAreas, RSFont[] rsFonts, StreamLoader imageArchive) {
        CustomInterfaces.bank(textDrawingAreas);
        CustomInterfaces.extraOptions(textDrawingAreas);
        CustomInterfaces.diceInterface(textDrawingAreas);
        CustomInterfaces.walkableDiceInterface(textDrawingAreas);
        CustomInterfaces.Curses(textDrawingAreas);
        CustomInterfaces.prayerMenu(textDrawingAreas);
        CustomInterfaces.emoteTab();
        CustomInterfaces.optionTab(textDrawingAreas);
        CustomInterfaces.NewSkillLamp(textDrawingAreas);
        CustomInterfaces.clanChatTab(textDrawingAreas);
        CustomInterfaces.questTab(textDrawingAreas);
        CustomInterfaces.pkingTab(textDrawingAreas);
        CustomInterfaces.dungTab(textDrawingAreas);
        CustomInterfaces.Shop(textDrawingAreas);
        CustomInterfaces.implingCatching(textDrawingAreas);
        CustomInterfaces.implingCatching2(textDrawingAreas);
        CustomInterfaces.implingCatching3(textDrawingAreas);
        CustomInterfaces.dropratesInterface(textDrawingAreas);
        CustomInterfaces.achievementInterface(textDrawingAreas);
        CustomInterfaces.loyaltyInterface(textDrawingAreas);
        CustomInterfaces.SummonTab(textDrawingAreas);
        CustomInterfaces.skillLevel(textDrawingAreas);
        CustomInterfaces.bobInterface(textDrawingAreas);
        CustomInterfaces.Trade(textDrawingAreas);
        CustomInterfaces.monsterTele(textDrawingAreas);
        CustomInterfaces.monsterTeleb(textDrawingAreas);
        CustomInterfaces.runecraftingTable(textDrawingAreas);
        CustomInterfaces.Sidebar0(textDrawingAreas);
        CustomInterfaces.friendsTab(textDrawingAreas);
        CustomInterfaces.ignoreTab(textDrawingAreas);
        CustomInterfaces.Pestpanel(textDrawingAreas);
        CustomInterfaces.Pestpanel2(textDrawingAreas);
        CustomInterfaces.equipmentScreen(textDrawingAreas);
        CustomInterfaces.EquipmentTab(textDrawingAreas);
        CustomInterfaces.CostumeTab(textDrawingAreas);
        CustomInterfaces.magicTab(textDrawingAreas);
        CustomInterfaces.ancientMagicTab(textDrawingAreas);
        CustomInterfaces.configureLunar(textDrawingAreas);
        CustomInterfaces.constructLunar();
        CustomInterfaces.quickPrayers(textDrawingAreas);
        CustomInterfaces.Construction(textDrawingAreas);
        CustomInterfaces.itemsOnDeath(textDrawingAreas);
        CustomInterfaces.itemsOnDeathDATA(textDrawingAreas);
        CustomInterfaces.quickCurses(textDrawingAreas);
        CustomInterfaces.newLamp(textDrawingAreas);
        CustomInterfaces.extraEquipment(textDrawingAreas);
        CustomInterfaces.staffTab(textDrawingAreas);
        CustomInterfaces.LodestoneNetwork(textDrawingAreas);
        CustomInterfaces.SquealOfFortune(textDrawingAreas);
        CustomInterfaces.Skillcapes(textDrawingAreas);
        CustomInterfaces.summoningLevelUp(textDrawingAreas);
        CustomInterfaces.scrollCreation(textDrawingAreas);
        CustomInterfaces.summoning(textDrawingAreas);
        CustomInterfaces.pouchCreation(textDrawingAreas);
        CustomInterfaces.settingsInterface(textDrawingAreas);
        CustomInterfaces.teleport(textDrawingAreas);
        CustomInterfaces.wilderness(textDrawingAreas);
        CustomInterfaces.boss(textDrawingAreas);
        CustomInterfaces.minigame(textDrawingAreas);
        CustomInterfaces.OsDropViewer(textDrawingAreas);
        CustomInterfaces.Zone(textDrawingAreas);
        CustomInterfaces.Refer(textDrawingAreas);
        CustomInterfaces.sanctionInterface(textDrawingAreas);
        CustomInterfaces.pvpGameLobby(textDrawingAreas);
        CustomInterfaces.itemSpinner(textDrawingAreas);
        CustomInterfaces.newAuction(textDrawingAreas);
        CustomInterfaces.auction(textDrawingAreas);
        CustomInterfaces.viewAuction(textDrawingAreas);
        CustomInterfaces.slayerInterface(textDrawingAreas);
        CustomInterfaces.settings(textDrawingAreas);
        CustomInterfaces.inspect(textDrawingAreas);
        CustomInterfaces.compare(textDrawingAreas);
        CustomInterfaces.protectionRune(textDrawingAreas);
        CustomInterfaces.lootBagContainer(textDrawingAreas);
        CustomInterfaces.pvpMinigameInterface(textDrawingAreas);
        CustomInterfaces.weaponGameInterface(textDrawingAreas);
        CustomInterfaces.hourlyEvent(textDrawingAreas);
        RSInterface miasmic = interfaceCache[13095];
        miasmic.spellName = "Miasmic Barrage";
        miasmic.spellUsableOn = 10;
        miasmic.atActionType = 2;
        miasmic.tooltip = "Cast @gre@Miasmic Barrage";
        miasmic.selectedActionName = "Cast On";
        CustomInterfaces.initializeCharacterWidget();
        CustomInterfaces.qbdHealthBar();
    }

    private static void hourlyEvent(TextDrawingArea[] font) {
        int i;
        RSInterface RSInterface2 = CustomInterfaces.addTabInterface(65000);
        CustomInterfaces.addSprite(65001, 150);
        CustomInterfaces.addHoverButton(65002, 12, 16, 16, "Close", 0, 65003, 1);
        CustomInterfaces.addHoveredButton(65003, 13, 16, 16, 65004);
        for (i = 0; i < 3; ++i) {
            CustomInterfaces.addToItemGroup(65005 + i, 1, 1, 0, 0, false, null, null, null);
        }
        CustomInterfaces.addText(65008, "Hourly Event", font, 2, 16750623, true, true);
        CustomInterfaces.addText(65009, "INSTRUCTIONS FOR EVENT", font, 2, 16750623, false, true);
        CustomInterfaces.addText(65010, "Time Left: 59 Minutes, 59 Seconds", font, 1, 16750623, false, false);
        for (i = 0; i < 3; ++i) {
            CustomInterfaces.addText(65011 + i, "Reward " + (i + 1), font, 0, i == 0 ? 14263346 : (i == 1 ? 11974328 : (i == 2 ? 7228978 : 14935011)), false, false);
        }
        CustomInterfaces.addText(65014, "Next Event:", font, 2, 16750623, false, true);
        CustomInterfaces.addText(65015, "Next Event Instructions", font, 1, 16750623, false, true);
        CustomInterfaces.addText(65016, "Previous Winner: None", font, 1, 16750623, false, true);
        CustomInterfaces.addText(65017, "(0/50)", font, 1, 11534354, false, false);
        for (i = 0; i < 7; ++i) {
            CustomInterfaces.addText(65018 + i, "" + (i + 1) + ". Title " + (i + 1), font, 1, i == 0 ? 14263346 : (i == 1 ? 11974328 : (i == 2 ? 7228978 : 14935011)), false, true);
            CustomInterfaces.addText(65025 + i, "Progress: 0", font, 0, i == 0 ? 14263346 : (i == 1 ? 11974328 : (i == 2 ? 7228978 : 14935011)), false, true);
        }
        CustomInterfaces.addText(65032, "Rewards:", font, 1, 16750623, true, true);
        CustomInterfaces.addSprite(65033, 153);
        CustomInterfaces.addSprite(65034, 152);
        CustomInterfaces.addSprite(65035, 151);
        CustomInterfaces.setChildren(34, RSInterface2);
        CustomInterfaces.setBounds(65001, 0, 0, 0, RSInterface2);
        CustomInterfaces.setBounds(65002, 464, 7, 1, RSInterface2);
        CustomInterfaces.setBounds(65003, 464, 7, 2, RSInterface2);
        for (i = 0; i < 3; ++i) {
            CustomInterfaces.setBounds(65005 + i, 170, 152, 3 + i, RSInterface2);
        }
        CustomInterfaces.setBounds(65008, 245, 7, 6, RSInterface2);
        CustomInterfaces.setBounds(65009, 225, 55, 7, RSInterface2);
        CustomInterfaces.setBounds(65010, 215, 70, 8, RSInterface2);
        for (i = 0; i < 3; ++i) {
            CustomInterfaces.setBounds(65011 + i, 215 + i * 70, 140, 9 + i, RSInterface2);
        }
        CustomInterfaces.setBounds(65014, 275, 220, 12, RSInterface2);
        CustomInterfaces.setBounds(65015, 245, 235, 13, RSInterface2);
        CustomInterfaces.setBounds(65016, 245, 270, 14, RSInterface2);
        CustomInterfaces.setBounds(65017, 145, 295, 15, RSInterface2);
        i = 0;
        do {
            if (i >= 7) {
                CustomInterfaces.setBounds(65032, 315, 110, 30, RSInterface2);
                CustomInterfaces.setBounds(65033, 15, 113, 31, RSInterface2);
                CustomInterfaces.setBounds(65034, 15, 76, 32, RSInterface2);
                CustomInterfaces.setBounds(65035, 15, 42, 33, RSInterface2);
                return;
            }
            CustomInterfaces.setBounds(65018 + i, 40, 40 + i * 30 + i * 5, 16 + i, RSInterface2);
            CustomInterfaces.setBounds(65025 + i, 40, 55 + i * 30 + i * 5, 23 + i, RSInterface2);
            ++i;
        } while (true);
    }

    private static void pvpGameLobby(TextDrawingArea[] tda) {
        RSInterface RSinterface = CustomInterfaces.addInterface(44600);
        CustomInterfaces.addText(44601, "Title", 16763955, false, true, 52, tda, 2);
        CustomInterfaces.addText(44602, "Timer", 16751360, false, true, 52, tda, 1);
        CustomInterfaces.addText(44603, "Players", 16751360, false, true, 52, tda, 1);
        CustomInterfaces.addText(44604, "", 16751360, false, true, 52, tda, 1);
        int last = 4;
        RSinterface.children = new int[last];
        RSinterface.childX = new int[last];
        RSinterface.childY = new int[last];
        CustomInterfaces.setBounds(44601, 15, 20, 0, RSinterface);
        CustomInterfaces.setBounds(44602, 15, 38, 1, RSinterface);
        CustomInterfaces.setBounds(44603, 15, 56, 2, RSinterface);
        CustomInterfaces.setBounds(44604, 15, 74, 3, RSinterface);
    }

    private static void weaponGameInterface(TextDrawingArea[] tda) {
        RSInterface RSinterface = CustomInterfaces.addInterface(44605);
        CustomInterfaces.addText(44606, "Title", 16763955, false, true, 52, tda, 2);
        CustomInterfaces.addText(44607, "Timer", 16751360, false, true, 52, tda, 1);
        CustomInterfaces.addText(44608, "Players", 16751360, false, true, 52, tda, 1);
        CustomInterfaces.addText(44609, "", 16751360, false, true, 52, tda, 1);
        CustomInterfaces.addToItemGroup(44610, 1, 1, 24, 24, false, null);
        int last = 5;
        RSinterface.children = new int[last];
        RSinterface.childX = new int[last];
        RSinterface.childY = new int[last];
        CustomInterfaces.setBounds(44606, 15, 20, 0, RSinterface);
        CustomInterfaces.setBounds(44607, 15, 38, 1, RSinterface);
        CustomInterfaces.setBounds(44608, 15, 56, 2, RSinterface);
        CustomInterfaces.setBounds(44609, 15, 74, 3, RSinterface);
        CustomInterfaces.setBounds(44610, 15, 89, 4, RSinterface);
    }

    private static void pvpMinigameInterface(TextDrawingArea[] tda) {
        RSInterface tab = CustomInterfaces.addInterface(44100);
        String dir = "auction";
        CustomInterfaces.addCachedSprite(44101, 0, dir);
        CustomInterfaces.addCachedHoverButton(44102, dir, 1, 16, 16, "Close", -1, 44103, 3);
        CustomInterfaces.addCachedHoveredButton(44103, dir, 2, 16, 16, 43504);
        CustomInterfaces.addText(44105, "PvP Minigames", tda, 2, 16753920, true, true);
        CustomInterfaces.addText(44106, "Minigame:", tda, 1, 16748608, true, true);
        CustomInterfaces.addText(44107, "Players:", tda, 1, 16748608, true, true);
        CustomInterfaces.addText(44108, "Wait Time:", tda, 1, 16748608, true, true);
        CustomInterfaces.addText(44109, "Game Time:", tda, 1, 16748608, true, true);
        CustomInterfaces.addText(44110, "Status:", tda, 1, 16748608, true, true);
        int x = 10;
        int y = 10;
        tab.totalChildren(10);
        tab.child(0, 44101, x, y);
        tab.child(1, 44102, 464 + x, 4 + y);
        tab.child(2, 44103, 464 + x, 4 + y);
        tab.child(3, 44105, 243 + x, 4 + y);
        tab.child(4, 44106, 66 + x, 24 + y);
        tab.child(5, 44107, 170 + x, 24 + y);
        tab.child(6, 44108, 258 + x, 24 + y);
        tab.child(7, 44109, 349 + x, 24 + y);
        tab.child(8, 44110, 438 + x, 24 + y);
        tab.child(9, 44111, 7 + x, 42 + y);
        String[] minigames = new String[]{"Weapon", "Tank"};
        RSInterface scroll = CustomInterfaces.addInterface(44111);
        scroll.totalChildren(minigames.length * 7);
        int yy = 0;
        int sprite = 3;
        int iterate = 0;
        int i = 0;
        do {
            if (i >= minigames.length) {
                scroll.width = 457;
                scroll.height = 229;
                scroll.scrollMax = 230;
                return;
            }
            CustomInterfaces.addCachedHoverButton(44112 + iterate, dir, sprite, 473, 32, "Join Minigame", -1, 44113 + iterate, 1);
            CustomInterfaces.addCachedHoveredButton(44113 + iterate, dir, 5, 473, 32, 44214 + iterate);
            CustomInterfaces.addText(44114 + iterate, minigames[i], tda, 2, 16748608, true, true);
            CustomInterfaces.addText(44115 + iterate, "0/25", tda, 0, 16748608, true, true);
            CustomInterfaces.addText(44116 + iterate, "Text3 " + i, tda, 0, 16748608, true, true);
            CustomInterfaces.addText(44117 + iterate, "Text4 " + i, tda, 0, 16748608, true, true);
            CustomInterfaces.addText(44118 + iterate, "Text5 " + i, tda, 0, 16748608, true, true);
            scroll.child(iterate, 44112 + iterate, 0, yy);
            scroll.child(iterate + 1, 44113 + iterate, 0, yy);
            scroll.child(iterate + 2, 44114 + iterate, 60, yy + 10);
            scroll.child(iterate + 3, 44115 + iterate, 163, yy + 10);
            scroll.child(iterate + 4, 44116 + iterate, 251, yy + 10);
            scroll.child(iterate + 5, 44117 + iterate, 342, yy + 10);
            scroll.child(iterate + 6, 44118 + iterate, 425, yy + 10);
            yy += 32;
            iterate += 7;
            sprite = sprite == 3 ? 4 : 3;
            ++i;
        } while (true);
    }

    public static void lootBagContainer(TextDrawingArea[] font) {
        RSInterface rsInterface = CustomInterfaces.addTabInterface(44020);
        CustomInterfaces.addToItemGroup(44021, 4, 7, 12, 0, true, "Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All");
        CustomInterfaces.addHoverButton(44022, "Interfaces/Slayer/TAB", 0, 83, 20, "Return", -1, 44023, 1);
        CustomInterfaces.addHoveredButton(44023, "Interfaces/Slayer/TAB", 1, 83, 20, 44024);
        CustomInterfaces.addText(44025, "Return", font, 2, 16750623);
        CustomInterfaces.addTransparentSprite(44026, 0, "BACKDROP", 40);
        CustomInterfaces.addSprite(44027, 0, "LINE");
        CustomInterfaces.setChildren(6, rsInterface);
        CustomInterfaces.setBounds(44026, 5, 4, 0, rsInterface);
        CustomInterfaces.setBounds(44022, 53, 238, 1, rsInterface);
        CustomInterfaces.setBounds(44023, 53, 238, 2, rsInterface);
        CustomInterfaces.setBounds(44025, 72, 241, 3, rsInterface);
        CustomInterfaces.setBounds(44021, 14, 7, 4, rsInterface);
        CustomInterfaces.setBounds(44027, 5, 232, 5, rsInterface);
    }

    public static void lending(TextDrawingArea[] font) {
        RSInterface RSInterface2 = CustomInterfaces.addTabInterface(64000);
        CustomInterfaces.addSprite(64001, 149);
        CustomInterfaces.addHoverButton(64002, 12, 16, 16, "Close", 0, 64003, 1);
        CustomInterfaces.addHoveredButton(64003, 13, 16, 16, 64004);
        CustomInterfaces.addToItemGroup(64005, 1, 1, 0, 0, false, null, null, null);
        CustomInterfaces.addText(64006, "Protect Item", font, 2, 16750623, true, true);
        CustomInterfaces.addText(64007, "You are about to upgrade an item", font, 1, 16750623, false, true);
        CustomInterfaces.addText(64008, "with a chance of losing the item.", font, 1, 16750623, false, true);
        CustomInterfaces.addHoverButton(64009, 52, 99, 23, "Confirm", -1, 64010, 1);
        CustomInterfaces.addHoveredButton(64010, 53, 99, 23, 43424);
        CustomInterfaces.addText(64011, "Confirm", font, 2, 65280, true, true);
        CustomInterfaces.setChildren(10, RSInterface2);
        CustomInterfaces.setBounds(64001, 140, 60, 0, RSInterface2);
        CustomInterfaces.setBounds(64002, 394, 68, 1, RSInterface2);
        CustomInterfaces.setBounds(64003, 394, 68, 2, RSInterface2);
        CustomInterfaces.setBounds(64005, 170, 152, 3, RSInterface2);
        CustomInterfaces.setBounds(64006, 270, 68, 4, RSInterface2);
        CustomInterfaces.setBounds(64007, 190, 100, 5, RSInterface2);
        CustomInterfaces.setBounds(64008, 190, 115, 6, RSInterface2);
        CustomInterfaces.setBounds(64009, 250, 175, 7, RSInterface2);
        CustomInterfaces.setBounds(64010, 250, 175, 8, RSInterface2);
        CustomInterfaces.setBounds(64011, 300, 178, 9, RSInterface2);
    }

    private static void protectionRune(TextDrawingArea[] font) {
        RSInterface RSInterface2 = CustomInterfaces.addTabInterface(63000);
        CustomInterfaces.addSprite(63001, 148);
        CustomInterfaces.addHoverButton(63002, 12, 16, 16, "Close", 0, 63003, 1);
        CustomInterfaces.addHoveredButton(63003, 13, 16, 16, 63004);
        CustomInterfaces.addToItemGroup(63005, 1, 1, 0, 0, false, null, null, null);
        CustomInterfaces.addText(63006, "Protect Item", font, 2, 16750623, true, true);
        CustomInterfaces.addText(63007, "You are about to upgrade an item", font, 1, 16750623, false, true);
        CustomInterfaces.addText(63008, "with a chance of losing the item.", font, 1, 16750623, false, true);
        CustomInterfaces.addText(63009, "Insert a Rune of Protection to", font, 1, 16750623, false, true);
        CustomInterfaces.addText(63010, "keep item from being desroyed.", font, 1, 16750623, false, true);
        CustomInterfaces.addHoverButton(63011, 52, 99, 23, "Confirm", -1, 63012, 1);
        CustomInterfaces.addHoveredButton(63012, 53, 99, 23, 43424);
        CustomInterfaces.addText(63013, "Confirm", font, 2, 65280, true, true);
        CustomInterfaces.setChildren(12, RSInterface2);
        CustomInterfaces.setBounds(63001, 140, 60, 0, RSInterface2);
        CustomInterfaces.setBounds(63002, 394, 68, 1, RSInterface2);
        CustomInterfaces.setBounds(63003, 394, 68, 2, RSInterface2);
        CustomInterfaces.setBounds(63005, 170, 152, 3, RSInterface2);
        CustomInterfaces.setBounds(63006, 270, 68, 4, RSInterface2);
        CustomInterfaces.setBounds(63007, 190, 100, 5, RSInterface2);
        CustomInterfaces.setBounds(63008, 190, 115, 6, RSInterface2);
        CustomInterfaces.setBounds(63009, 222, 135, 7, RSInterface2);
        CustomInterfaces.setBounds(63010, 222, 150, 8, RSInterface2);
        CustomInterfaces.setBounds(63011, 250, 175, 9, RSInterface2);
        CustomInterfaces.setBounds(63012, 250, 175, 10, RSInterface2);
        CustomInterfaces.setBounds(63013, 300, 178, 11, RSInterface2);
    }

    private static void inspect(TextDrawingArea[] font) {
        int i;
        RSInterface RSInterface2 = CustomInterfaces.addTabInterface(62000);
        CustomInterfaces.addSprite(62001, 146);
        CustomInterfaces.addHoverButton(62002, 12, 16, 16, "Close", 0, 62003, 1);
        CustomInterfaces.addHoveredButton(62003, 13, 16, 16, 62004);
        CustomInterfaces.addToItemGroup(62005, 1, 1, 0, 0, false, null, null, null);
        CustomInterfaces.addText(62006, "Inspect Item", font, 2, 16750623, true, true);
        CustomInterfaces.addText(62007, "Name: Test Item", font, 1, 16750623, false, true);
        CustomInterfaces.addText(62008, "Guide Price: 3,333B", font, 1, 16750623, false, true);
        RSInterface stats = CustomInterfaces.addTabInterface(62009);
        int totalLines = 65;
        stats.width = 200;
        stats.height = 220;
        stats.scrollMax = totalLines * 16;
        int id = 62010;
        for (i = 0; i < totalLines; ++i, ++id) {
            String defaultName = i == 0 ? "Attack Bonuses" : (i == 6 ? "Defense Bonuses" : (i == 12 ? "Other Bonuses" : (i == 15 ? "Attributes" : "")));
            CustomInterfaces.addText(id, defaultName.isEmpty() ? "Line - " + id : defaultName, font, i == 0 || i == 6 || i == 12 || i == 15 ? 2 : 1, 16750623, true, true);
        }
        CustomInterfaces.setChildren(totalLines, stats);
        i = 0;
        id = 62010;
        int y = 0;
        do {
            if (i >= totalLines) {
                CustomInterfaces.setChildren(8, RSInterface2);
                CustomInterfaces.setBounds(62001, 140, 10, 0, RSInterface2);
                CustomInterfaces.setBounds(62002, 394, 18, 1, RSInterface2);
                CustomInterfaces.setBounds(62003, 394, 18, 2, RSInterface2);
                CustomInterfaces.setBounds(62005, 155, 50, 3, RSInterface2);
                CustomInterfaces.setBounds(62006, 270, 18, 4, RSInterface2);
                CustomInterfaces.setBounds(62007, 199, 50, 5, RSInterface2);
                CustomInterfaces.setBounds(62008, 199, 65, 6, RSInterface2);
                CustomInterfaces.setBounds(62009, 190, 95, 7, RSInterface2);
                return;
            }
            CustomInterfaces.setBounds(id, 79, y + (i >= 15 ? 20 : 0), i, stats);
            ++i;
            ++id;
            y += 16;
        } while (true);
    }

    private static void compare(TextDrawingArea[] font) {
        String defaultName;
        int i;
        RSInterface RSInterface2 = CustomInterfaces.addTabInterface(62200);
        CustomInterfaces.addSprite(62201, 147);
        CustomInterfaces.addHoverButton(62202, 12, 16, 16, "Close", 0, 62203, 1);
        CustomInterfaces.addHoveredButton(62203, 13, 16, 16, 62204);
        CustomInterfaces.addText(62205, "Compare Items", font, 2, 16750623, true, true);
        CustomInterfaces.addToItemGroup(62206, 1, 1, 0, 0, false, null, null, null);
        CustomInterfaces.addToItemGroup(62207, 1, 1, 0, 0, false, null, null, null);
        CustomInterfaces.addText(62208, "Name: Test Item", font, 1, 16750623, false, true);
        CustomInterfaces.addText(62209, "Guide Price: 3,333B", font, 1, 16750623, false, true);
        CustomInterfaces.addText(62210, "Name: Test Item", font, 1, 16750623, false, true);
        CustomInterfaces.addText(62211, "Guide Price: 3,333B", font, 1, 16750623, false, true);
        RSInterface stats = CustomInterfaces.addTabInterface(62212);
        int totalLines = 65;
        stats.width = 450;
        stats.height = 228;
        stats.scrollMax = totalLines * 16;
        int id = 62213;
        for (i = 0; i < totalLines; ++i, ++id) {
            defaultName = i == 0 ? "Attack Bonuses" : (i == 6 ? "Defense Bonuses" : (i == 12 ? "Other Bonuses" : (i == 15 ? "Attributes" : "")));
            CustomInterfaces.addText(id, defaultName.isEmpty() ? "Line - " + id : defaultName, font, i == 0 || i == 6 || i == 12 || i == 15 ? 2 : 1, 16750623, true, true);
        }
        id = 62300;
        for (i = 0; i < totalLines; ++i, ++id) {
            defaultName = i == 0 ? "Attack Bonuses" : (i == 6 ? "Defense Bonuses" : (i == 12 ? "Other Bonuses" : (i == 15 ? "Attributes" : "")));
            CustomInterfaces.addText(id, defaultName.isEmpty() ? "Line - " + id : defaultName, font, i == 0 || i == 6 || i == 12 || i == 15 ? 2 : 1, 16750623, true, true);
        }
        id = 62400;
        for (i = 0; i < totalLines; ++i, ++id) {
            CustomInterfaces.addText(id, i == 0 || i == 6 || i == 12 || i == 15 ? "" : "0", font, i == 0 || i == 6 || i == 12 || i == 15 ? 2 : 1, 16777215, true, true);
        }
        CustomInterfaces.setChildren(totalLines * 3, stats);
        id = 62213;
        int y = 0;
        for (i = 0; i < totalLines; ++i, ++id, y += 16) {
            CustomInterfaces.setBounds(id, 96, y + (i >= 15 ? 20 : 0), i, stats);
        }
        id = 62300;
        y = 0;
        for (i = totalLines; i < totalLines * 2; ++i, ++id, y += 16) {
            CustomInterfaces.setBounds(id, 324, y + (i >= totalLines + 15 ? 20 : 0), i, stats);
        }
        i = totalLines * 2;
        id = 62400;
        y = 0;
        do {
            if (i >= totalLines * 3) {
                CustomInterfaces.setChildren(11, RSInterface2);
                CustomInterfaces.setBounds(62201, 10, 5, 0, RSInterface2);
                CustomInterfaces.setBounds(62202, 458, 13, 1, RSInterface2);
                CustomInterfaces.setBounds(62203, 458, 13, 2, RSInterface2);
                CustomInterfaces.setBounds(62205, 253, 13, 3, RSInterface2);
                CustomInterfaces.setBounds(62206, 26, 42, 4, RSInterface2);
                CustomInterfaces.setBounds(62207, 435, 43, 5, RSInterface2);
                CustomInterfaces.setBounds(62208, 65, 45, 6, RSInterface2);
                CustomInterfaces.setBounds(62209, 65, 60, 7, RSInterface2);
                CustomInterfaces.setBounds(62210, 265, 45, 8, RSInterface2);
                CustomInterfaces.setBounds(62211, 265, 60, 9, RSInterface2);
                CustomInterfaces.setBounds(62212, 0, 90, 10, RSInterface2);
                return;
            }
            CustomInterfaces.setBounds(id, 210, y + (i >= totalLines * 2 + 15 ? 20 : 0), i, stats);
            ++i;
            ++id;
            y += 16;
        } while (true);
    }

    private static void settings(TextDrawingArea[] font) {
        int i;
        int i2;
        int i3;
        RSInterface widget = CustomInterfaces.addTabInterface(60000);
        CustomInterfaces.addSprite(60001, 139);
        CustomInterfaces.addHoverButton(60002, 12, 16, 16, "Close", 60003, 0, 1);
        CustomInterfaces.addHoveredButton(60003, 13, 16, 16, 60004);
        CustomInterfaces.addHoverButton(60005, 140, 50, 39, "Fixed", 60006, 0, 1);
        CustomInterfaces.addHoveredButton(60006, 141, 50, 39, 60007);
        CustomInterfaces.addHoverButton(60008, 142, 50, 39, "Resizable", 60009, 0, 1);
        CustomInterfaces.addHoveredButton(60009, 143, 50, 39, 60010);
        CustomInterfaces.addHoverButton(60011, 144, 50, 39, "Fullscreen", 60012, 0, 1);
        CustomInterfaces.addHoveredButton(60012, 145, 50, 39, 60013);
        CustomInterfaces.addPixels(60014, 1512207, 1, 102, 0, true);
        CustomInterfaces.addText(60015, "Settings", font, 2, 16750623, true, true);
        RSInterface ranks = CustomInterfaces.addTabInterface(60020);
        int totalRanks = 15;
        ranks.width = 99;
        ranks.height = 102;
        ranks.scrollMax = totalRanks * 20;
        int id = 60021;
        int config = 1150;
        for (i3 = 0; i3 < totalRanks; ++i3, id += 3) {
            CustomInterfaces.addPixels(id, i3 % 2 == 0 ? 4734259 : 5393216, 110, 20, 0, true);
            CustomInterfaces.addConfigButton(id + 1, 60020, 137, 138, 14, 15, "Select", 1, 1, config);
            CustomInterfaces.addText(id + 2, "Rank " + i3, font, 1, 16750623, false, true);
        }
        CustomInterfaces.setChildren(totalRanks * 3, ranks);
        int index = 0;
        int id2 = 60021;
        int y = 0;
        for (i3 = 0; i3 < totalRanks; ++i3, index += 3, id2 += 3, y += 20) {
            CustomInterfaces.setBounds(id2, 0, y, index, ranks);
            CustomInterfaces.setBounds(id2 + 1, 2, y + 3, index + 1, ranks);
            CustomInterfaces.setBounds(id2 + 2, 20, y + 3, index + 2, ranks);
        }
        RSInterface titles = CustomInterfaces.addTabInterface(60100);
        int totalTitles = 50;
        titles.width = 110;
        titles.height = 102;
        titles.scrollMax = totalTitles * 20;
        int id3 = 60101;
        int config2 = 1175;
        for (i = 0; i < totalTitles; ++i, id3 += 3) {
            CustomInterfaces.addPixels(id3, i % 2 == 0 ? 4734259 : 5393216, 110, 20, 0, true);
            CustomInterfaces.addConfigButton(id3 + 1, 60020, 137, 138, 14, 15, "Select", 1, 1, config2);
            CustomInterfaces.addText(id3 + 2, "Title " + i, font, 1, 16750623, false, true);
        }
        CustomInterfaces.setChildren(totalTitles * 3, titles);
        int index2 = 0;
        int id4 = 60101;
        int y2 = 0;
        for (i = 0; i < totalTitles; ++i, index2 += 3, id4 += 3, y2 += 20) {
            CustomInterfaces.setBounds(id4, 0, y2, index2, titles);
            CustomInterfaces.setBounds(id4 + 1, 2, y2 + 3, index2 + 1, titles);
            CustomInterfaces.setBounds(id4 + 2, 20, y2 + 3, index2 + 2, titles);
        }
        RSInterface settings = CustomInterfaces.addTabInterface(60300);
        List<String> settingNames = Client.getSettings().getToggleNames();
        int totalSettings = settingNames.size();
        settings.width = 483;
        settings.height = 199;
        settings.scrollMax = totalSettings * 20;
        int id5 = 60301;
        int config3 = 1225;
        for (i2 = 0; i2 < totalSettings; ++i2, id5 += 3) {
            CustomInterfaces.addPixels(id5, i2 % 2 == 0 ? 4734259 : 5393216, 483, 20, 0, true);
            CustomInterfaces.addConfigButton(id5 + 1, 60020, 137, 138, 20, 18, "Select", 1, 1, config3++);
            String title = i2 < settingNames.size() ? (String)settingNames.get(i2) : "";
            CustomInterfaces.addText(id5 + 2, title, font, 1, 16750623, false, true);
        }
        CustomInterfaces.setChildren(totalSettings * 3, settings);
        i2 = 0;
        int index3 = 0;
        int id6 = 60301;
        int y3 = 0;
        do {
            if (i2 >= totalSettings) {
                CustomInterfaces.setChildren(14, widget);
                CustomInterfaces.setBounds(60001, 0, 0, 0, widget);
                CustomInterfaces.setBounds(60002, 490, 4, 1, widget);
                CustomInterfaces.setBounds(60003, 490, 4, 2, widget);
                CustomInterfaces.setBounds(60005, 35, 53, 3, widget);
                CustomInterfaces.setBounds(60006, 35, 53, 4, widget);
                CustomInterfaces.setBounds(60008, 110, 53, 5, widget);
                CustomInterfaces.setBounds(60009, 110, 53, 6, widget);
                CustomInterfaces.setBounds(60011, 185, 53, 7, widget);
                CustomInterfaces.setBounds(60012, 185, 53, 8, widget);
                CustomInterfaces.setBounds(60014, 264, 22, 9, widget);
                CustomInterfaces.setBounds(60020, 265, 22, 10, widget);
                CustomInterfaces.setBounds(60100, 380, 22, 11, widget);
                CustomInterfaces.setBounds(60300, 7, 128, 12, widget);
                CustomInterfaces.setBounds(60015, 255, 3, 13, widget);
                return;
            }
            CustomInterfaces.setBounds(id6, 0, y3, index3, settings);
            CustomInterfaces.setBounds(id6 + 1, 2, y3 + 3, index3 + 1, settings);
            CustomInterfaces.setBounds(id6 + 2, 20, y3 + 3, index3 + 2, settings);
            ++i2;
            index3 += 3;
            id6 += 3;
            y3 += 20;
        } while (true);
    }

    public static void addPixels(int id, int color, int width, int height, int alpha, boolean filled) {
        RSInterface rsi = CustomInterfaces.addInterface(id);
        rsi.type = 3;
        rsi.opacity = (byte)alpha;
        rsi.textColor = color;
        rsi.textHoverColour = color;
        rsi.anInt219 = color;
        rsi.anInt239 = color;
        rsi.textShadow = filled;
        rsi.width = width;
        rsi.height = height;
    }

    public static void itemSpinner(TextDrawingArea[] tda) {
        RSInterface inter = CustomInterfaces.addTabInterface(35000);
        inter.totalChildren(1);
        int[] items = new int[10];
        Arrays.fill((int[])items, (int)4152);
        inter.child(0, new ItemSpinnerWidget(35001, items, null, 0), 30, 30);
    }

    public static void slayerInterface(TextDrawingArea[] tda) {
        RSInterface buy = CustomInterfaces.addScreenInterface(55000);
        CustomInterfaces.addSprite(55001, 0, "Interfaces/Slayer/BACKGROUND");
        CustomInterfaces.addText(55002, "Slayer Rewards", 16750623, true, true, 52, tda, 2);
        CustomInterfaces.addHoverButton(55003, "Interfaces/Slayer/CLOSE", 0, 21, 21, "Exit", -1, 55004, 1);
        CustomInterfaces.addHoveredButton(55004, "Interfaces/Slayer/CLOSE", 1, 21, 21, 55005);
        CustomInterfaces.addHoverButton(55006, "Interfaces/Slayer/TAB", 0, 83, 20, "Unlock", -1, 55007, 1);
        CustomInterfaces.addHoveredButton(55007, "Interfaces/Slayer/TAB", 1, 83, 20, 55008);
        CustomInterfaces.addHoverButton(55009, "Interfaces/Slayer/TAB", 0, 83, 20, "Extend", -1, 55010, 1);
        CustomInterfaces.addHoveredButton(55010, "Interfaces/Slayer/TAB", 1, 83, 20, 55011);
        CustomInterfaces.addHoverButton(55012, "Interfaces/Slayer/TAB", 0, 83, 20, "Buy", -1, 55013, 1);
        CustomInterfaces.addHoveredButton(55013, "Interfaces/Slayer/TAB", 1, 83, 20, 55014);
        CustomInterfaces.addHoverButton(55015, "Interfaces/Slayer/TAB", 0, 83, 20, "Tasks", -1, 55016, 1);
        CustomInterfaces.addHoveredButton(55016, "Interfaces/Slayer/TAB", 1, 83, 20, 55017);
        CustomInterfaces.addText(55018, "Slayer Points:", 16751360, false, true, 16, tda, 0);
        CustomInterfaces.addText(55019, "", 16751360, false, true, 16, tda, 0);
        CustomInterfaces.addText(55020, "Unlock", 16751360, true, true, 16, tda, 0);
        CustomInterfaces.addText(55021, "Extend", 16751360, true, true, 16, tda, 0);
        CustomInterfaces.addText(55022, "Buy", 16751360, true, true, 16, tda, 0);
        CustomInterfaces.addText(55023, "Tasks", 16751360, true, true, 16, tda, 0);
        buy.totalChildren(19);
        buy.child(0, 55001, 15, 15);
        buy.child(1, 55002, 255, 25);
        buy.child(2, 55003, 475, 22);
        buy.child(3, 55004, 475, 22);
        buy.child(4, 55006, 25, 52);
        buy.child(5, 55007, 25, 52);
        buy.child(6, 55009, 111, 52);
        buy.child(7, 55010, 111, 52);
        buy.child(8, 55012, 196, 52);
        buy.child(9, 55013, 196, 52);
        buy.child(10, 55015, 281, 52);
        buy.child(11, 55016, 281, 52);
        buy.child(12, 55018, 377, 56);
        buy.child(13, 55019, 451, 56);
        buy.child(14, 55020, 67, 57);
        buy.child(15, 55021, 152, 57);
        buy.child(16, 55022, 237, 57);
        buy.child(17, 55023, 322, 57);
        buy.child(18, 55050, 35, 83);
        RSInterface shop = CustomInterfaces.addTabInterface(55050);
        shop.totalChildren(43);
        shop.width = 440;
        shop.height = 220;
        shop.scrollMax = 100;
        CustomInterfaces.addToItemGroup(55024, 7, 6, 23, 18, true, "", "", "");
        RSInterface.interfaceCache[55024].itemActions = new String[]{"Check Cost", "Buy 1", "Buy 5", "Buy 10", "Buy X"};
        shop.child(0, 55024, 22, 4);
        int xx = 35;
        int yy = 38;
        int b = 0;
        do {
            if (b >= 42) {
                RSInterface warning = CustomInterfaces.addTabInterface(55200);
                CustomInterfaces.addSprite(55201, 0, "Interfaces/Slayer/WARNING");
                CustomInterfaces.addHoverButton(55202, "Interfaces/Slayer/TAB", 0, 83, 20, "Confirm", -1, 55203, 1);
                CustomInterfaces.addHoveredButton(55203, "Interfaces/Slayer/TAB", 1, 83, 20, 55204);
                CustomInterfaces.addHoverButton(55205, "Interfaces/Slayer/TAB", 0, 83, 20, "Back", -1, 55206, 1);
                CustomInterfaces.addHoveredButton(55206, "Interfaces/Slayer/TAB", 1, 83, 20, 55207);
                CustomInterfaces.addText(55208, "Confirm", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55209, "Back", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55210, "", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55211, "", 10027008, true, true, 34, tda, 1);
                CustomInterfaces.addText(55212, "", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55213, "more npcs to kill", 16751360, true, true, 34, tda, 1);
                warning.totalChildren(11);
                warning.child(0, 55201, 175, 130);
                warning.child(1, 55202, 205, 250);
                warning.child(2, 55203, 205, 250);
                warning.child(3, 55205, 305, 250);
                warning.child(4, 55206, 305, 250);
                warning.child(5, 55208, 245, 254);
                warning.child(6, 55209, 345, 254);
                warning.child(7, 55210, 294, 145);
                warning.child(8, 55211, 294, 170);
                warning.child(9, 55212, 294, 195);
                warning.child(10, 55213, 294, 210);
                RSInterface tasks = CustomInterfaces.addScreenInterface(55100);
                CustomInterfaces.addSprite(55101, 0, "Interfaces/Slayer/BACKGROUND");
                CustomInterfaces.addText(55102, "Slayer Rewards", 16750623, true, true, 52, tda, 2);
                CustomInterfaces.addHoverButton(55103, "Interfaces/Slayer/CLOSE", 0, 21, 21, "Exit", -1, 55104, 1);
                CustomInterfaces.addHoveredButton(55104, "Interfaces/Slayer/CLOSE", 1, 21, 21, 55105);
                CustomInterfaces.addHoverButton(55106, "Interfaces/Slayer/TAB", 0, 83, 20, "Unlock", -1, 55107, 1);
                CustomInterfaces.addHoveredButton(55107, "Interfaces/Slayer/TAB", 1, 83, 20, 55108);
                CustomInterfaces.addHoverButton(55109, "Interfaces/Slayer/TAB", 0, 83, 20, "Extend", -1, 55110, 1);
                CustomInterfaces.addHoveredButton(55110, "Interfaces/Slayer/TAB", 1, 83, 20, 55111);
                CustomInterfaces.addHoverButton(55112, "Interfaces/Slayer/TAB", 0, 83, 20, "Buy", -1, 55113, 1);
                CustomInterfaces.addHoveredButton(55113, "Interfaces/Slayer/TAB", 1, 83, 20, 55114);
                CustomInterfaces.addHoverButton(55115, "Interfaces/Slayer/TAB", 0, 83, 20, "Tasks", -1, 55116, 1);
                CustomInterfaces.addHoveredButton(55116, "Interfaces/Slayer/TAB", 1, 83, 20, 55117);
                CustomInterfaces.addText(55118, "Slayer Points:", 16751360, false, true, 16, tda, 0);
                CustomInterfaces.addText(55119, "", 16751360, false, true, 16, tda, 0);
                CustomInterfaces.addText(55120, "Unlock", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55121, "Extend", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55122, "Buy", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55123, "Tasks", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55124, "You may spend points to cancel or block your current task. \\nIf you cancel it, you may be assigned that target again in future. (100 points)\\nIf you block it, you will not get that assignment again. (250 points)\\nBoth options will reset your slayer task streak.", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addSprite(55125, 0, "Interfaces/Slayer/CURRENT_ASSIGNMENT");
                CustomInterfaces.addText(55126, "Current assignment:", 16750623, true, true, 52, tda, 2);
                CustomInterfaces.addText(55127, "No task", 16777215, true, true, 34, tda, 1);
                CustomInterfaces.addHoverButton(55128, "Interfaces/Slayer/TAB", 0, 83, 20, "Cancel task", -1, 55129, 1);
                CustomInterfaces.addHoveredButton(55129, "Interfaces/Slayer/TAB", 1, 83, 20, 55130);
                CustomInterfaces.addHoverButton(55131, "Interfaces/Slayer/TAB", 0, 83, 20, "Block task", -1, 55132, 1);
                CustomInterfaces.addHoveredButton(55132, "Interfaces/Slayer/TAB", 1, 83, 20, 55133);
                CustomInterfaces.addText(55134, "Cancel task", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55135, "Block task", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55136, "Blocked tasks:", 16750623, true, true, 52, tda, 2);
                CustomInterfaces.addText(55137, "Slot 1:", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55138, "Slot 2:", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55139, "Slot 3:", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55140, "Slot 4:", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55141, "Slot 5:", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55142, "Slot 6:", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55143, "Empty", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55144, "Empty", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55145, "Empty", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55146, "Empty", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55147, "Empty", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addText(55148, "Empty", 16751360, true, true, 34, tda, 1);
                CustomInterfaces.addHoverButton(55149, "Interfaces/Slayer/TAB", 0, 83, 20, "Unblock task", -1, 55150, 1);
                CustomInterfaces.addHoveredButton(55150, "Interfaces/Slayer/TAB", 1, 83, 20, 55151);
                CustomInterfaces.addHoverButton(55152, "Interfaces/Slayer/TAB", 0, 83, 20, "Unblock task", -1, 55153, 1);
                CustomInterfaces.addHoveredButton(55153, "Interfaces/Slayer/TAB", 1, 83, 20, 55154);
                CustomInterfaces.addHoverButton(55155, "Interfaces/Slayer/TAB", 0, 83, 20, "Unblock task", -1, 55156, 1);
                CustomInterfaces.addHoveredButton(55156, "Interfaces/Slayer/TAB", 1, 83, 20, 55157);
                CustomInterfaces.addHoverButton(55158, "Interfaces/Slayer/TAB", 0, 83, 20, "Unblock task", -1, 55159, 1);
                CustomInterfaces.addHoveredButton(55159, "Interfaces/Slayer/TAB", 1, 83, 20, 55160);
                CustomInterfaces.addHoverButton(55161, "Interfaces/Slayer/TAB", 0, 83, 20, "Unblock task", -1, 55162, 1);
                CustomInterfaces.addHoveredButton(55162, "Interfaces/Slayer/TAB", 1, 83, 20, 55163);
                CustomInterfaces.addHoverButton(55164, "Interfaces/Slayer/TAB", 0, 83, 20, "Unblock task", -1, 55165, 1);
                CustomInterfaces.addHoveredButton(55165, "Interfaces/Slayer/TAB", 1, 83, 20, 55166);
                CustomInterfaces.addText(55167, "Unblock task", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55168, "Unblock task", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55169, "Unblock task", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55170, "Unblock task", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55171, "Unblock task", 16751360, true, true, 16, tda, 0);
                CustomInterfaces.addText(55172, "Unblock task", 16751360, true, true, 16, tda, 0);
                tasks.totalChildren(59);
                tasks.child(0, 55101, 15, 15);
                tasks.child(1, 55102, 255, 25);
                tasks.child(2, 55103, 475, 22);
                tasks.child(3, 55104, 475, 22);
                tasks.child(4, 55106, 25, 52);
                tasks.child(5, 55107, 25, 52);
                tasks.child(6, 55109, 111, 52);
                tasks.child(7, 55110, 111, 52);
                tasks.child(8, 55112, 196, 52);
                tasks.child(9, 55113, 196, 52);
                tasks.child(10, 55115, 281, 52);
                tasks.child(11, 55116, 281, 52);
                tasks.child(12, 55118, 377, 56);
                tasks.child(13, 55119, 451, 56);
                tasks.child(14, 55120, 67, 57);
                tasks.child(15, 55121, 152, 57);
                tasks.child(16, 55122, 237, 57);
                tasks.child(17, 55123, 322, 57);
                tasks.child(18, 55124, 255, 78);
                tasks.child(19, 55125, 25, 125);
                tasks.child(20, 55126, 155, 130);
                tasks.child(21, 55127, 155, 145);
                tasks.child(22, 55128, 300, 141);
                tasks.child(23, 55129, 300, 141);
                tasks.child(24, 55131, 403, 141);
                tasks.child(25, 55132, 403, 141);
                tasks.child(26, 55134, 341, 145);
                tasks.child(27, 55135, 442, 145);
                tasks.child(28, 55136, 265, 165);
                tasks.child(29, 55137, 85, 182);
                tasks.child(30, 55138, 85, 202);
                tasks.child(31, 55139, 85, 222);
                tasks.child(32, 55140, 85, 242);
                tasks.child(33, 55141, 85, 262);
                tasks.child(34, 55142, 85, 282);
                tasks.child(35, 55143, 265, 182);
                tasks.child(36, 55144, 265, 202);
                tasks.child(37, 55145, 265, 222);
                tasks.child(38, 55146, 265, 242);
                tasks.child(39, 55147, 265, 262);
                tasks.child(40, 55148, 265, 282);
                tasks.child(41, 55149, 380, 181);
                tasks.child(42, 55150, 380, 181);
                tasks.child(43, 55152, 380, 201);
                tasks.child(44, 55153, 380, 201);
                tasks.child(45, 55155, 380, 221);
                tasks.child(46, 55156, 380, 221);
                tasks.child(47, 55158, 380, 241);
                tasks.child(48, 55159, 380, 241);
                tasks.child(49, 55161, 380, 261);
                tasks.child(50, 55162, 380, 261);
                tasks.child(51, 55164, 380, 281);
                tasks.child(52, 55165, 380, 281);
                tasks.child(53, 55167, 420, 185);
                tasks.child(54, 55168, 420, 205);
                tasks.child(55, 55169, 420, 225);
                tasks.child(56, 55170, 420, 245);
                tasks.child(57, 55171, 420, 265);
                tasks.child(58, 55172, 420, 285);
                return;
            }
            CustomInterfaces.addText(55051 + b, "", tda, 0, 16777215, true, true);
            shop.child(1 + b, 55051 + b, xx, yy);
            if ((xx += 56) == 427) {
                xx = 35;
                yy += 50;
            }
            ++b;
        } while (true);
    }

    private static final void qbdHealthBar() {
        RSInterface tab = CustomInterfaces.addInterface(59575);
        tab.totalChildren(6);
        tab.child(0, new AdvancedSpriteWidget(59576, "Interfaces/qbd_health_bar/IMAGE 0"), 55, 5);
        tab.child(1, new AdvancedSpriteWidget(59577, "Interfaces/qbd_health_bar/IMAGE 1"), 118, 31);
        int index = 0;
        while (index < 4) {
            tab.child(2 + index, new ToggleSpriteWidget(59578 + index, "Interfaces/qbd_health_bar/IMAGE 2", "Interfaces/qbd_health_bar/IMAGE 3", "Interfaces/qbd_health_bar/IMAGE 4"), 205 + 25 * index, 3);
            ++index;
        }
    }

    private static void initializeCharacterWidget() {
        RSInterface tab = CustomInterfaces.addInterface(44500);
        tab.totalChildren(1);
        tab.child(0, new DrawCharacterWidget(44501, new int[]{46357, 46339}), 10, 10);
    }

    public static void drawNpcOnInterface(int childId, int npcId) {
        RSInterface rsInterface = CustomInterfaces.interfaceCache[childId] = new RSInterface();
        rsInterface.id = childId;
        rsInterface.type = 6;
        rsInterface.atActionType = 0;
        rsInterface.contentType = 3000;
        rsInterface.contentId = npcId;
        rsInterface.width = 136;
        rsInterface.height = 168;
        rsInterface.modelZoom = 1500;
        rsInterface.modelRotation1 = 150;
        rsInterface.modelRotation2 = 0;
        rsInterface.disabledAnimation = rsInterface.anInt258 = NPCDefinition.forID((int)npcId).standAnim;
    }

    public static void sanctionInterface(TextDrawingArea[] tda) {
        RSInterface rsInterface = CustomInterfaces.addInterface(46000);
        CustomInterfaces.setChildren(11, rsInterface);
        boolean startX = false;
        boolean startY = false;
        CustomInterfaces.addSprite(46001, 0, "/QuestTab/QUEST");
        rsInterface.child(0, 46001, 0, 0);
        rsInterface.child(1, new InputFieldWidget(46002, 5064246, 15, 15108608, "Display Name", 120, 22, false, false, false, false, false), 15, 10);
        rsInterface.child(3, new InputFieldWidget(46004, 5064246, 15, 15108608, "Days", 120, 22, false, false, false, true, true), 15, 38);
        rsInterface.child(4, new InputFieldWidget(46005, 5064246, 15, 15108608, "Hours", 120, 22, false, false, false, true, true), 15, 66);
        rsInterface.child(5, new InputFieldWidget(46006, 5064246, 15, 15108608, "Minutes", 120, 22, false, false, false, true, true), 15, 94);
        rsInterface.child(6, new InputFieldWidget(46007, 5064246, 120, 15108608, "Reason", 120, 22, false, false, false, false, false), 15, 122);
        CustomInterfaces.addButton(46008, 1, "BUTTON", "Submit Sanction");
        rsInterface.child(7, 46008, 7, 183);
        CustomInterfaces.addText(46009, "Submit Sanction", tda, 2, 16753920, false, true);
        rsInterface.child(8, 46009, 30, 193);
        CustomInterfaces.addHoverButton(46010, "Interfaces/Slayer/CLOSE", 0, 21, 21, "Exit", -1, 46011, 1);
        rsInterface.child(9, 46010, 140, 6);
        CustomInterfaces.addHoveredButton(46011, "Interfaces/Slayer/CLOSE", 1, 21, 21, 46012);
        rsInterface.child(10, 46011, 140, 6);
        CustomInterfaces.addDropMenu(46013, 140, 20, 16748608, fonts[1], new MenuItem("Mute"), new MenuItem("Address mute"), new MenuItem("Ban"), new MenuItem("Address ban"));
        rsInterface.child(2, 46013, 15, 150);
    }

    public static void auction(TextDrawingArea[] tda) {
        RSInterface tab = CustomInterfaces.addInterface(43500);
        String dir = "auction";
        CustomInterfaces.addCachedSprite(43501, 0, dir);
        CustomInterfaces.addCachedHoverButton(43502, dir, 1, 16, 16, "Close", -1, 43503, 3);
        CustomInterfaces.addCachedHoveredButton(43503, dir, 2, 16, 16, 43504);
        CustomInterfaces.addText(43505, "Auction Listings", tda, 2, 16753920, true, true);
        CustomInterfaces.addText(43506, "Item for sale:", tda, 1, 16748608, true, true);
        CustomInterfaces.addText(43507, "Seller:", tda, 1, 16748608, true, true);
        CustomInterfaces.addText(43508, "Highest Bid:", tda, 1, 16748608, true, true);
        CustomInterfaces.addText(43509, "Buy Out:", tda, 1, 16748608, true, true);
        CustomInterfaces.addText(43510, "Time:", tda, 1, 16748608, true, true);
        int x = 10;
        int y = 10;
        tab.totalChildren(12);
        tab.child(0, 43501, x, y);
        tab.child(1, 43502, 464 + x, 4 + y);
        tab.child(2, 43503, 464 + x, 4 + y);
        tab.child(3, 43505, 243 + x, 4 + y);
        tab.child(4, 43506, 66 + x, 24 + y);
        tab.child(5, 43507, 170 + x, 24 + y);
        tab.child(6, 43508, 258 + x, 24 + y);
        tab.child(7, 43509, 349 + x, 24 + y);
        tab.child(8, 43510, 438 + x, 24 + y);
        tab.child(9, 43511, 7 + x, 42 + y);
        tab.child(10, new InputFieldWidget(43951, 4537394, 15, 16748608, "Search by item", 140, 22, false, false, true, false, false), 98 + x, 275 + y);
        tab.child(11, new InputFieldWidget(43952, 4537394, 15, 16748608, "Search by seller", 140, 22, false, false, true, false, false), 250 + x, 275 + y);
        RSInterface scroll = CustomInterfaces.addInterface(43511);
        scroll.totalChildren(351);
        int yy = 0;
        int sprite = 3;
        CustomInterfaces.itemGroup(43950, 1, 50, 1, 0);
        int i = 0;
        do {
            if (i >= 50) {
                scroll.child(350, 43950, 2, 0);
                scroll.width = 457;
                scroll.height = 229;
                scroll.scrollMax = yy;
                return;
            }
            CustomInterfaces.addCachedHoverButton(43550 + i, dir, sprite, 473, 32, "View Auction", -1, 43600 + i, 1);
            CustomInterfaces.addCachedHoveredButton(43600 + i, dir, 5, 473, 32, 43650 + i);
            CustomInterfaces.addText(43700 + i, "Text1 " + i, tda, 0, 16748608, false, true);
            CustomInterfaces.addText(43750 + i, "Text2 " + i, tda, 0, 16748608, true, true);
            CustomInterfaces.addText(43800 + i, "Text3 " + i, tda, 0, 16748608, true, true);
            CustomInterfaces.addText(43850 + i, "Text4 " + i, tda, 0, 16748608, true, true);
            scroll.child(i, 43550 + i, 0, yy);
            scroll.child(i + 50, 43600 + i, 0, yy);
            scroll.child(i + 100, 43700 + i, 37, yy + 10);
            scroll.child(i + 150, 43750 + i, 163, yy + 10);
            scroll.child(i + 200, 43800 + i, 251, yy + 10);
            scroll.child(i + 250, 43850 + i, 342, yy + 10);
            scroll.child(i + 300, new CountDownTimerWidget(43900 + i, 16748608, true), 425, yy + 10);
            yy += 32;
            if (++sprite == 5) {
                sprite = 3;
            }
            ++i;
        } while (true);
    }

    public static void newAuction(TextDrawingArea[] tda) {
        int startX = 88;
        int startY = 45;
        String dir = "auction";
        RSInterface tab = CustomInterfaces.addInterface(43400);
        tab.totalChildren(17);
        CustomInterfaces.addCachedSprite(43401, 6, "auction");
        tab.child(0, 43401, 88, 45);
        CustomInterfaces.addCachedHoverButton(43402, "auction", 1, 16, 16, "Close", -1, 43403, 3);
        CustomInterfaces.addCachedHoveredButton(43403, "auction", 2, 16, 16, 43404);
        tab.child(1, 43402, 402, 49);
        tab.child(2, 43403, 402, 49);
        CustomInterfaces.addText(43405, "Start an Auction", tda, 2, 16753920, true, true);
        tab.child(3, 43405, 257, 49);
        CustomInterfaces.addCachedSprite(43406, 9, "auction");
        tab.child(4, 43406, 186, 77);
        CustomInterfaces.addText(43407, "Item Name", tda, 2, 16753920, false, true);
        tab.child(5, 43407, 234, 76);
        CustomInterfaces.addText(43408, "Guide Price", tda, 1, 16753920, false, true);
        tab.child(6, 43408, 234, 96);
        CustomInterfaces.itemGroup(43409, 1, 1, 1, 1);
        tab.child(7, 43409, 188, 78);
        CustomInterfaces.addText(43410, "Starting bid (Optional, in 1 bil tokens):", tda, 0, 16753920, true, true);
        tab.child(8, 43410, 256, 125);
        tab.child(9, new InputFieldWidget(43411, 5064246, 15, 15108608, "Enter starting bid", 140, 22, false, false, false, true, true), 186, 140);
        CustomInterfaces.addText(43412, "Buy-out price (Optional, in 1 bil tokens):", tda, 0, 16753920, true, true);
        tab.child(10, 43412, 256, 165);
        tab.child(11, new InputFieldWidget(43413, 5064246, 15, 15108608, "Enter buy-out price", 140, 22, false, false, false, true, true), 186, 180);
        CustomInterfaces.addText(43414, "Time in minutes (10 - 1,440):", tda, 0, 16753920, true, true);
        tab.child(12, 43414, 256, 205);
        tab.child(13, new InputFieldWidget(43415, 5064246, 4, 15108608, "Time in minutes", 140, 22, false, false, false, true, false), 186, 220);
        CustomInterfaces.addCachedHoverButton(43416, "auction", 7, 110, 29, "Create Auction", -1, 43417, 1);
        CustomInterfaces.addCachedHoveredButton(43417, "auction", 8, 110, 29, 43418);
        tab.child(14, 43416, 201, 245);
        tab.child(15, 43417, 201, 245);
        CustomInterfaces.addText(43419, "Create Auction", tda, 2, 65280, true, true);
        tab.child(16, 43419, 256, 252);
    }

    public static void viewAuction(TextDrawingArea[] tda) {
        int startX = 88;
        int startY = 45;
        String dir = "auction";
        RSInterface tab = CustomInterfaces.addInterface(43300);
        tab.totalChildren(23);
        CustomInterfaces.addCachedSprite(43301, 6, "auction");
        tab.child(0, 43301, 88, 45);
        CustomInterfaces.addCachedHoverButton(43302, "auction", 1, 16, 16, "Close", -1, 43303, 3);
        CustomInterfaces.addCachedHoveredButton(43303, "auction", 2, 16, 16, 43304);
        tab.child(1, 43302, 402, 49);
        tab.child(2, 43303, 402, 49);
        CustomInterfaces.addText(43305, "Auction Information", tda, 2, 16753920, true, true);
        tab.child(3, 43305, 257, 49);
        CustomInterfaces.addCachedSprite(43306, 9, "auction");
        tab.child(4, 43306, 186, 77);
        CustomInterfaces.addText(43307, "Item Name", tda, 2, 15108608, false, true);
        tab.child(5, 43307, 234, 76);
        CustomInterfaces.addText(43308, "Guide Price", tda, 1, 16753920, false, true);
        tab.child(6, 43308, 234, 96);
        CustomInterfaces.itemGroup(43309, 1, 1, 1, 1);
        tab.child(7, 43309, 188, 78);
        CustomInterfaces.addText(43310, "Time Ramaining:", tda, 1, 15108608, true, true);
        tab.child(8, 43310, 256, 125);
        tab.child(9, new CountDownTimerWidget(43311, 16753920, true), 256, 140);
        CustomInterfaces.addText(43312, "Current Bid:", tda, 1, 15108608, false, true);
        tab.child(10, 43312, 108, 155);
        CustomInterfaces.addText(43313, String.valueOf((int)43313), tda, 0, 16753920, false, true);
        tab.child(11, 43313, 108, 171);
        CustomInterfaces.addText(43314, "Enter new bid (in 1 bil tokens):", tda, 1, 15108608, false, true);
        tab.child(12, 43314, 108, 195);
        tab.child(13, new InputFieldWidget(43315, 5064246, 11, 15108608, "Enter bid", 110, 22, false, false, false, true, true), 108, 210);
        CustomInterfaces.addHoverButton(43316, 52, 99, 23, "Confirm Bid", -1, 43317, 1);
        CustomInterfaces.addHoveredButton(43317, 53, 99, 23, 43318);
        tab.child(14, 43316, 115, 245);
        tab.child(15, 43317, 115, 245);
        CustomInterfaces.addText(43319, "Confirm Bid", tda, 2, 65280, true, true);
        tab.child(16, 43319, 163, 249);
        CustomInterfaces.addText(43320, "Buy-out Price:", tda, 1, 15108608, false, true);
        tab.child(17, 43320, 295, 155);
        CustomInterfaces.addText(43321, String.valueOf((int)43321), tda, 0, 16753920, false, true);
        tab.child(18, 43321, 295, 172);
        CustomInterfaces.addHoverButton(43322, 52, 99, 23, "Buy-out", -1, 43323, 1);
        CustomInterfaces.addHoveredButton(43323, 53, 99, 23, 43424);
        tab.child(19, 43322, 299, 245);
        tab.child(20, 43323, 299, 245);
        CustomInterfaces.addText(43325, "Buy-out", tda, 2, 65280, true, true);
        tab.child(21, 43325, 350, 249);
        CustomInterfaces.addClickableText(43326, "Cancel Auction", "Cancel", tda, 1, 15108608, false, true, 80);
        tab.child(22, 43326, 308, 215);
    }

    private static void diceInterface(TextDrawingArea[] tda) {
        RSInterface inter = CustomInterfaces.addInterface(58000);
        CustomInterfaces.addTransparentSprite(58001, 19, 19, 165);
        CustomInterfaces.addTransparentSprite(58002, 19, 19, 165);
        CustomInterfaces.addHoverButton(58003, 20, 88, 22, "Accept", -1, 58004, 4, true);
        CustomInterfaces.addHoveredButton(58004, 21, 88, 22, 58005, true);
        CustomInterfaces.addHoverButton(58006, 22, 88, 22, "Decline", -1, 58007, 4, true);
        CustomInterfaces.addHoveredButton(58007, 23, 88, 22, 58008, true);
        CustomInterfaces.addGambleContainer(58009, true);
        CustomInterfaces.addGambleContainer(58010, false);
        CustomInterfaces.addText(58011, "Player1", tda, 2, 16750899, true);
        CustomInterfaces.addText(58012, "Player2", tda, 2, 16750899, true);
        CustomInterfaces.addText(58013, String.valueOf((int)Integer.MAX_VALUE), tda, 2, 16750899, true);
        CustomInterfaces.addText(58014, String.valueOf((int)Integer.MAX_VALUE), tda, 2, 16750899, true);
        CustomInterfaces.addText(58015, "", tda, 2, 16750899, true);
        CustomInterfaces.addText(58016, "", tda, 2, 16750899, true);
        CustomInterfaces.addText(58017, "Waiting", tda, 2, 16750899, true);
        CustomInterfaces.addText(58018, "Waiting", tda, 2, 16750899, true);
        CustomInterfaces.addButton(58030, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "Npc Duel", 655, 1);
        CustomInterfaces.addButton(58031, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "Flower Poker", 656, 1);
        CustomInterfaces.addButton(58032, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "First To One", 657, 1);
        CustomInterfaces.addButton(58033, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "First To Three", 658, 1);
        CustomInterfaces.addButton(58034, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "First To Five", 659, 1);
        CustomInterfaces.addText(58035, "Npc Duel", tda, 2, 16777215, true);
        CustomInterfaces.addText(58036, "Flower Poker", tda, 2, 16777215, true);
        CustomInterfaces.addText(58037, "First To One", tda, 2, 16777215, true);
        CustomInterfaces.addText(58038, "First To Three", tda, 2, 16777215, true);
        CustomInterfaces.addText(58039, "First To Five", tda, 2, 16777215, true);
        CustomInterfaces.setChildren(26, inter);
        CustomInterfaces.setBounds(58001, 20, 120, 0, inter);
        CustomInterfaces.setBounds(58002, 260, 120, 1, inter);
        CustomInterfaces.setBounds(58003, 95, 215, 2, inter);
        CustomInterfaces.setBounds(58004, 95, 215, 3, inter);
        CustomInterfaces.setBounds(58006, 340, 215, 4, inter);
        CustomInterfaces.setBounds(58007, 340, 215, 5, inter);
        CustomInterfaces.setBounds(58009, 35, 150, 6, inter);
        CustomInterfaces.setBounds(58010, 273, 150, 7, inter);
        CustomInterfaces.setBounds(58011, 130, 125, 8, inter);
        CustomInterfaces.setBounds(58012, 370, 125, 9, inter);
        CustomInterfaces.setBounds(58013, 190, 191, 10, inter);
        CustomInterfaces.setBounds(58014, 430, 191, 11, inter);
        CustomInterfaces.setBounds(58015, 131, 223, 12, inter);
        CustomInterfaces.setBounds(58016, 375, 223, 13, inter);
        CustomInterfaces.setBounds(58017, 55, 191, 14, inter);
        CustomInterfaces.setBounds(58018, 295, 191, 15, inter);
        CustomInterfaces.setBounds(58030, 50, 265, 16, inter);
        CustomInterfaces.setBounds(58031, 150, 265, 17, inter);
        CustomInterfaces.setBounds(58032, 250, 265, 18, inter);
        CustomInterfaces.setBounds(58033, 350, 265, 19, inter);
        CustomInterfaces.setBounds(58034, 450, 265, 20, inter);
        CustomInterfaces.setBounds(58035, 60, 245, 21, inter);
        CustomInterfaces.setBounds(58036, 150, 245, 22, inter);
        CustomInterfaces.setBounds(58037, 250, 245, 23, inter);
        CustomInterfaces.setBounds(58038, 350, 245, 24, inter);
        CustomInterfaces.setBounds(58039, 450, 245, 25, inter);
        inter = CustomInterfaces.addTabInterface(58019);
        CustomInterfaces.addGambleInventoryContainer(58020, true);
        CustomInterfaces.setChildren(1, inter);
        CustomInterfaces.setBounds(58020, 16, 8, 0, inter);
    }

    private static void walkableDiceInterface(TextDrawingArea[] tda) {
        RSInterface inter = CustomInterfaces.addInterface(58021);
        CustomInterfaces.addTransparentSprite(58022, 19, 19, 125);
        CustomInterfaces.addTransparentSprite(58023, 19, 19, 125);
        CustomInterfaces.addGambleContainer(58024, false);
        CustomInterfaces.addGambleContainer(58025, false);
        CustomInterfaces.addText(58026, "", tda, 2, 16750899, true);
        CustomInterfaces.addText(58027, "", tda, 2, 16750899, true);
        CustomInterfaces.addText(58028, "", tda, 2, 16750899, true);
        CustomInterfaces.addText(58029, "", tda, 2, 16750899, true);
        CustomInterfaces.setChildren(8, inter);
        int yModifier = 120;
        CustomInterfaces.setBounds(58022, 20, 120 - yModifier, 0, inter);
        CustomInterfaces.setBounds(58023, 260, 120 - yModifier, 1, inter);
        CustomInterfaces.setBounds(58024, 35, 150 - yModifier, 2, inter);
        CustomInterfaces.setBounds(58025, 273, 150 - yModifier, 3, inter);
        CustomInterfaces.setBounds(58026, 130, 125 - yModifier, 4, inter);
        CustomInterfaces.setBounds(58027, 370, 125 - yModifier, 5, inter);
        CustomInterfaces.setBounds(58028, 190, 191 - yModifier, 6, inter);
        CustomInterfaces.setBounds(58029, 430, 191 - yModifier, 7, inter);
    }

    public static void achievementInterface(TextDrawingArea[] tda) {
        RSInterface tab = CustomInterfaces.addInterface(46100);
        String dir = "achievements";
        CustomInterfaces.addCachedSprite(46101, 0, dir);
        CustomInterfaces.addCachedHoverButton(46102, dir, 1, 16, 16, "Close", -1, 46103, 1);
        CustomInterfaces.addCachedHoveredButton(46103, dir, 2, 16, 16, 46104);
        CustomInterfaces.addText(46105, "Title", tda, 2, 16753920, true, true);
        CustomInterfaces.addText(46106, "Title of selected achievement", tda, 2, 16740352, true, true);
        CustomInterfaces.addText(46107, "Description:", tda, 1, 16753920, false, true);
        CustomInterfaces.addText(46108, "..................", tda, 0, 16740352, false, true);
        CustomInterfaces.addText(46109, "..................", tda, 0, 16740352, false, true);
        CustomInterfaces.addText(46110, "Difficulty:", tda, 1, 16753920, false, true);
        CustomInterfaces.addText(46111, "..................", tda, 0, 16740352, false, true);
        CustomInterfaces.addText(46112, "Progress", tda, 1, 16753920, false, true);
        CustomInterfaces.addText(46113, "..................", tda, 0, 16740352, false, true);
        CustomInterfaces.addText(46114, "Rewards:", tda, 1, 16753920, false, true);
        CustomInterfaces.addText(46115, "..................", tda, 0, 16740352, false, true);
        CustomInterfaces.addText(46116, "..................", tda, 0, 16740352, false, true);
        CustomInterfaces.addText(46117, "Achievements List", tda, 2, 16740352, true, true);
        CustomInterfaces.addText(46118, "You have ... Achievement points", tda, 1, 16753920, true, true);
        int x = 6;
        int y = 6;
        tab.totalChildren(18);
        tab.child(0, 46101, x, y);
        tab.child(1, 46102, 472 + x, 9 + y);
        tab.child(2, 46103, 472 + x, 9 + y);
        tab.child(3, 46105, 249 + x, 9 + y);
        tab.child(4, 46106, 361 + x, 48 + y);
        tab.child(5, 46107, 250 + x, 85 + y);
        tab.child(6, 46108, 265 + x, 100 + y);
        tab.child(7, 46109, 265 + x, 112 + y);
        tab.child(8, 46110, 250 + x, 130 + y);
        tab.child(9, 46111, 265 + x, 145 + y);
        tab.child(10, 46112, 250 + x, 175 + y);
        tab.child(11, 46113, 265 + x, 190 + y);
        tab.child(12, 46114, 250 + x, 220 + y);
        tab.child(13, 46115, 265 + x, 235 + y);
        tab.child(14, 46116, 265 + x, 247 + y);
        tab.child(15, 46117, 112 + x, 40 + y);
        tab.child(16, 46118, 361 + x, 291 + y);
        tab.child(17, 46120, 10 + x, 64 + y);
        RSInterface scroll = CustomInterfaces.addInterface(46120);
        int BEGINNER = 10;
        int EASY = 35;
        int MEDIUM = 41;
        int HARD = 30;
        int ELITE = 15;
        int[] sections = new int[]{10, 35, 41, 30, 15};
        CustomInterfaces.addText(46121, "Beginner:", tda, 2, 16753920, false, true);
        CustomInterfaces.addText(46122, "Easy:", tda, 2, 16753920, false, true);
        CustomInterfaces.addText(46123, "Medium:", tda, 2, 16753920, false, true);
        CustomInterfaces.addText(46124, "Hard:", tda, 2, 16753920, false, true);
        CustomInterfaces.addText(46125, "Elite:", tda, 2, 16753920, false, true);
        scroll.totalChildren(136);
        int yy = 3;
        int child = 0;
        int b = 0;
        do {
            if (b >= sections.length) {
                scroll.width = 198;
                scroll.height = 243;
                scroll.scrollMax = yy;
                return;
            }
            scroll.child(child, 46121 + b, 2, yy);
            ++child;
            yy += 15;
            for (int i = 0; i < sections[b]; yy += 13, ++child, ++i) {
                CustomInterfaces.addClickableText(46200 + i + 100 * b, "Achievement " + i, "Select", tda, 1, 16711680, false, true, 136);
                scroll.child(child, 46200 + i + 100 * b, 6, yy);
            }
            yy += 17;
            ++b;
        } while (true);
    }
}


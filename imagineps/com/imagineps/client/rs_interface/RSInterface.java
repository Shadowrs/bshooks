/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 */
package com.imagineps.client.rs_interface;

import com.imagineps.client.Client;
import com.imagineps.client.InterfaceTextInput;
import com.imagineps.client.MRUNodes;
import com.imagineps.client.Model;
import com.imagineps.client.NodeSub;
import com.imagineps.client.Player;
import com.imagineps.client.RSFont;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.TextClass;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.ItemDefinition;
import com.imagineps.client.definition.NPCDefinition;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.rs_interface.CustomInterfaces;
import com.imagineps.client.rs_interface.impl.MenuItem;
import java.io.PrintStream;
import java.util.Arrays;

public class RSInterface {
    public int contentId = -1;
    public String[] tooltips;
    public InterfaceTextInput textInput;
    public boolean inputToggled = false;
    public String inputText = "";
    public String defaultText = "";
    public static RSInterface[] inputFields = new RSInterface[20];
    public boolean hasInputField = false;
    public static RSFont[] newFonts;
    public RSFont rsFont;
    public String[] actions;
    public boolean menuVisible;
    public MenuItem defaultMenuItem;
    public MenuItem menuItem;
    public static int[] boxIds;
    public Sprite setSprite;
    public Sprite savedFirstSprite;
    public String popupString;
    public String hoverText;
    public static StreamLoader aClass44;
    public boolean drawsTransparent;
    public Sprite sprite1;
    public int animationDelay;
    public Sprite[] sprites;
    public static RSInterface[] interfaceCache;
    public int[] requiredValues;
    public int contentType;
    public int[] spritesX;
    public int textHoverColour;
    public int atActionType;
    public String spellName;
    public int anInt219;
    public int width;
    public String tooltip;
    public String selectedActionName;
    public boolean center;
    public int scrollPosition;
    public String[] itemActions;
    public int[][] valueIndexArray;
    public boolean aBoolean227;
    public String disabledText;
    public int mOverInterToTrigger;
    public int invSpritePadX;
    public int textColor;
    public int anInt233;
    public int mediaID;
    public boolean aBoolean235;
    public int parentID;
    public int spellUsableOn;
    protected static MRUNodes aMRUNodes_238;
    public int anInt239;
    public int[] children;
    public int[] childX;
    public boolean usableItemInterface;
    public TextDrawingArea textDrawingAreas;
    public int invSpritePadY;
    public int[] valueCompareType;
    public int animationLength;
    public int[] spritesY;
    public String message;
    public int npcId;
    public boolean isInventoryInterface;
    public int id;
    public int[] invStackSizes;
    public int[] inv;
    public String[] customName;
    public int opacity;
    private int anInt255;
    private int anInt256;
    public int disabledAnimation;
    public int scrollSpeed = 30;
    public int anInt258;
    public boolean aBoolean259;
    public Sprite sprite2;
    public int scrollMax;
    public int type;
    public int offsetX;
    private static final MRUNodes aMRUNodes_264;
    public int offsetY;
    public boolean isMouseoverTriggered;
    public int height;
    public boolean textShadow;
    public int modelZoom;
    public int modelRotation1;
    public int modelRotation2;
    public int[] childY;
    public int itemSpriteId1;
    public int itemSpriteId2;
    public int itemSpriteZoom1;
    public int itemSpriteZoom2;
    public int itemSpriteIndex;
    public boolean greyScale;
    public boolean advancedSprite;
    public boolean searchableContainer;
    public static TextDrawingArea[] fonts;
    public static int[] summoningLevelRequirements;
    private static int[] pouchItems;
    private static int[] scrollItems;
    private static String[] scrollNames;
    private static String[] pouchNames;

    public static void unpack(StreamLoader interfaceArchive, TextDrawingArea[] textDrawingAreas, StreamLoader imageArchive, RSFont[] newFontSystem) {
        fonts = textDrawingAreas;
        newFonts = newFontSystem;
        aMRUNodes_238 = new MRUNodes(70000);
        Stream stream = new Stream(interfaceArchive.getDataForName("data"));
        aClass44 = imageArchive;
        int i = -1;
        int j = stream.readUnsignedWord();
        interfaceCache = new RSInterface[70000];
        do {
            int k1;
            if (stream.currentOffset >= stream.buffer.length) {
                CustomInterfaces.loadCustomInterfaces(textDrawingAreas, newFontSystem, imageArchive);
                aMRUNodes_238 = null;
                return;
            }
            int k = stream.readUnsignedWord();
            if (k == 65535) {
                i = stream.readUnsignedWord();
                k = stream.readUnsignedWord();
            }
            RSInterface rsInterface = RSInterface.interfaceCache[k] = new RSInterface();
            rsInterface.id = k;
            rsInterface.parentID = i;
            rsInterface.type = stream.readUnsignedByte();
            rsInterface.atActionType = stream.readUnsignedByte();
            rsInterface.contentType = stream.readUnsignedWord();
            rsInterface.width = stream.readUnsignedWord();
            rsInterface.height = stream.readUnsignedWord();
            rsInterface.opacity = stream.readUnsignedByte();
            rsInterface.mOverInterToTrigger = stream.readUnsignedByte();
            rsInterface.mOverInterToTrigger = rsInterface.mOverInterToTrigger != 0 ? (rsInterface.mOverInterToTrigger - 1 << 8) + stream.readUnsignedByte() : -1;
            int i1 = stream.readUnsignedByte();
            if (i1 > 0) {
                rsInterface.valueCompareType = new int[i1];
                rsInterface.requiredValues = new int[i1];
                for (int j1 = 0; j1 < i1; ++j1) {
                    rsInterface.valueCompareType[j1] = stream.readUnsignedByte();
                    rsInterface.requiredValues[j1] = stream.readUnsignedWord();
                }
            }
            if ((k1 = stream.readUnsignedByte()) > 0) {
                rsInterface.valueIndexArray = new int[k1][];
                for (int l1 = 0; l1 < k1; ++l1) {
                    int i3 = stream.readUnsignedWord();
                    rsInterface.valueIndexArray[l1] = new int[i3];
                    for (int l4 = 0; l4 < i3; ++l4) {
                        rsInterface.valueIndexArray[l1][l4] = stream.readUnsignedWord();
                    }
                }
            }
            if (rsInterface.type == 0) {
                rsInterface.drawsTransparent = false;
                rsInterface.scrollMax = stream.readUnsignedWord();
                rsInterface.isMouseoverTriggered = stream.readUnsignedByte() == 1;
                int i2 = stream.readUnsignedWord();
                rsInterface.children = new int[i2];
                rsInterface.childX = new int[i2];
                rsInterface.childY = new int[i2];
                for (int j3 = 0; j3 < i2; ++j3) {
                    rsInterface.children[j3] = stream.readUnsignedWord();
                    rsInterface.childX[j3] = stream.readSignedWord();
                    rsInterface.childY[j3] = stream.readSignedWord();
                }
            }
            if (rsInterface.type == 1) {
                stream.readUnsignedWord();
                stream.readUnsignedByte();
            }
            if (rsInterface.type == 2) {
                rsInterface.inv = new int[rsInterface.width * rsInterface.height];
                rsInterface.customName = new String[rsInterface.width * rsInterface.height];
                rsInterface.invStackSizes = new int[rsInterface.width * rsInterface.height];
                rsInterface.aBoolean259 = stream.readUnsignedByte() == 1;
                rsInterface.isInventoryInterface = stream.readUnsignedByte() == 1;
                rsInterface.usableItemInterface = stream.readUnsignedByte() == 1;
                rsInterface.aBoolean235 = stream.readUnsignedByte() == 1;
                rsInterface.invSpritePadX = stream.readUnsignedByte();
                rsInterface.invSpritePadY = stream.readUnsignedByte();
                rsInterface.spritesX = new int[20];
                rsInterface.spritesY = new int[20];
                rsInterface.sprites = new Sprite[20];
                for (int j2 = 0; j2 < 20; ++j2) {
                    int k3 = stream.readUnsignedByte();
                    if (k3 != 1) continue;
                    int TROPHY_SLOT = 11;
                    if (j2 == 11) {
                        rsInterface.spritesX[j2] = stream.readSignedWord() + 41;
                        rsInterface.spritesY[j2] = stream.readSignedWord() - 200;
                    } else {
                        rsInterface.spritesX[j2] = stream.readSignedWord();
                        rsInterface.spritesY[j2] = stream.readSignedWord();
                    }
                    String s1 = stream.readString();
                    if (j2 == 11) {
                        s1 = "wornicons,11";
                    }
                    if (imageArchive == null || s1.length() <= 0) continue;
                    int i5 = s1.lastIndexOf(",");
                    rsInterface.sprites[j2] = RSInterface.loadCachedSprite(Integer.parseInt((String)s1.substring(i5 + 1)), imageArchive, s1.substring(0, i5));
                }
                rsInterface.itemActions = new String[6];
                for (int l3 = 0; l3 < 5; ++l3) {
                    rsInterface.itemActions[l3] = stream.readString();
                    if (rsInterface.parentID == 3822) {
                        rsInterface.itemActions[4] = "Sell All";
                    }
                    if (rsInterface.parentID == 3824) {
                        rsInterface.itemActions[4] = "Buy X";
                    }
                    if (rsInterface.itemActions[l3].length() == 0) {
                        rsInterface.itemActions[l3] = null;
                    }
                    if (rsInterface.parentID != 1644) continue;
                    rsInterface.itemActions[2] = "Operate";
                }
            }
            if (rsInterface.type == 3) {
                boolean bl = rsInterface.aBoolean227 = stream.readUnsignedByte() == 1;
            }
            if (rsInterface.type == 4 || rsInterface.type == 1) {
                rsInterface.center = stream.readUnsignedByte() == 1;
                int k2 = stream.readUnsignedByte();
                if (textDrawingAreas != null) {
                    rsInterface.textDrawingAreas = textDrawingAreas[k2];
                }
                boolean bl = rsInterface.textShadow = stream.readUnsignedByte() == 1;
            }
            if (rsInterface.type == 4) {
                rsInterface.message = stream.readString();
                rsInterface.disabledText = stream.readString();
            }
            if (rsInterface.type == 1 || rsInterface.type == 3 || rsInterface.type == 4) {
                rsInterface.textColor = stream.readDWord();
            }
            if (rsInterface.type == 3 || rsInterface.type == 4) {
                rsInterface.anInt219 = stream.readDWord();
                rsInterface.textHoverColour = stream.readDWord();
                rsInterface.anInt239 = stream.readDWord();
            }
            if (rsInterface.type == 5) {
                rsInterface.drawsTransparent = false;
                String s = stream.readString();
                if (imageArchive != null && s.length() > 0) {
                    int i4 = s.lastIndexOf(",");
                    rsInterface.sprite1 = RSInterface.loadCachedSprite(Integer.parseInt((String)s.substring(i4 + 1)), imageArchive, s.substring(0, i4));
                }
                s = stream.readString();
                if (imageArchive != null && s.length() > 0) {
                    int j4 = s.lastIndexOf(",");
                    rsInterface.sprite2 = RSInterface.loadCachedSprite(Integer.parseInt((String)s.substring(j4 + 1)), imageArchive, s.substring(0, j4));
                }
            }
            if (rsInterface.type == 6) {
                int l = stream.readUnsignedByte();
                if (l != 0) {
                    rsInterface.anInt233 = 1;
                    rsInterface.mediaID = (l - 1 << 8) + stream.readUnsignedByte();
                }
                if ((l = stream.readUnsignedByte()) != 0) {
                    rsInterface.anInt255 = 1;
                    rsInterface.anInt256 = (l - 1 << 8) + stream.readUnsignedByte();
                }
                rsInterface.disabledAnimation = (l = stream.readUnsignedByte()) != 0 ? (l - 1 << 8) + stream.readUnsignedByte() : -1;
                l = stream.readUnsignedByte();
                rsInterface.anInt258 = l != 0 ? (l - 1 << 8) + stream.readUnsignedByte() : -1;
                rsInterface.modelZoom = stream.readUnsignedWord();
                rsInterface.modelRotation1 = stream.readUnsignedWord();
                rsInterface.modelRotation2 = stream.readUnsignedWord();
            }
            if (rsInterface.type == 7) {
                rsInterface.inv = new int[rsInterface.width * rsInterface.height];
                rsInterface.customName = new String[rsInterface.width * rsInterface.height];
                rsInterface.invStackSizes = new int[rsInterface.width * rsInterface.height];
                rsInterface.center = stream.readUnsignedByte() == 1;
                int l2 = stream.readUnsignedByte();
                if (textDrawingAreas != null) {
                    rsInterface.textDrawingAreas = textDrawingAreas[l2];
                }
                rsInterface.textShadow = stream.readUnsignedByte() == 1;
                rsInterface.textColor = stream.readDWord();
                rsInterface.invSpritePadX = stream.readSignedWord();
                rsInterface.invSpritePadY = stream.readSignedWord();
                rsInterface.isInventoryInterface = stream.readUnsignedByte() == 1;
                rsInterface.itemActions = new String[6];
                for (int k4 = 0; k4 < 5; ++k4) {
                    rsInterface.itemActions[k4] = stream.readString();
                    if (rsInterface.itemActions[k4].length() != 0) continue;
                    rsInterface.itemActions[k4] = null;
                }
            }
            if (rsInterface.atActionType == 2 || rsInterface.type == 2) {
                rsInterface.selectedActionName = stream.readString();
                rsInterface.spellName = stream.readString();
                rsInterface.spellUsableOn = stream.readUnsignedWord();
            }
            if (rsInterface.type == 8) {
                rsInterface.message = stream.readString();
            }
            if (rsInterface.atActionType != 1 && rsInterface.atActionType != 4 && rsInterface.atActionType != 5 && rsInterface.atActionType != 6) continue;
            rsInterface.tooltip = stream.readString();
            if (rsInterface.tooltip.length() != 0) continue;
            if (rsInterface.atActionType == 1) {
                rsInterface.tooltip = "Ok";
            }
            if (rsInterface.atActionType == 4) {
                rsInterface.tooltip = "Select";
            }
            if (rsInterface.atActionType == 5) {
                rsInterface.tooltip = "Select";
            }
            if (rsInterface.atActionType != 6) continue;
            rsInterface.tooltip = "Continue";
        } while (true);
    }

    public static void Refer(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addInterface(28300);
        RSInterface.addSprite(28301, 11);
        RSInterface.addHoverButton(28302, 12, 16, 16, "Close", -1, 28303, 1);
        RSInterface.addHoveredButton(28303, 13, 16, 16, 28304);
        RSInterface.addText(28305, "Referral", tda, 2, 16753920, true, true);
        RSInterface.addText(28306, "Name", tda, 1, 16748608, true, true);
        RSInterface.addText(28307, "NPC KC", tda, 1, 16748608, true, true);
        RSInterface.addText(28309, "Referred By:", tda, 1, 16748608, false, true);
        RSInterface.addText(28310, "Player Name", tda, 1, 16753920, true, true);
        RSInterface.addText(28311, "NPC Killcount:", tda, 1, 16748608, false, true);
        RSInterface.addText(28312, "Kills", tda, 1, 16753920, true, true);
        RSInterface.addHoverButton(28295, 17, 99, 23, "Confirm", -1, 28296, 1);
        RSInterface.addHoveredButton(28296, 18, 99, 23, 28297);
        RSInterface.addText(28298, "Confirm", tda, 0, 65280, true, true);
        int x = 10;
        int y = 10;
        tab.totalChildren(16);
        tab.child(0, 28301, x, y);
        tab.child(1, 28302, 464 + x, 4 + y);
        tab.child(2, 28303, 464 + x, 4 + y);
        tab.child(3, 28305, 243 + x, 4 + y);
        tab.child(4, 28315, 13 + x, 49 + y);
        tab.child(5, 28306, 108 + x, 33 + y);
        tab.child(6, 28307, 224 + x, 33 + y);
        tab.child(7, 28308, 81 + x, 265 + y);
        tab.child(8, 28309, 319 + x, 56 + y);
        tab.child(9, 28310, 387 + x, 74 + y);
        tab.child(10, 28311, 319 + x, 112 + y);
        tab.child(11, 28312, 387 + x, 129 + y);
        tab.child(12, 28295, 345 + x, 235 + y);
        tab.child(13, 28296, 345 + x, 235 + y);
        tab.child(14, 28298, 390 + x, 240 + y);
        tab.child(15, 28299, 322 + x, 210 + y);
        RSInterface scroll = RSInterface.addInterface(28315);
        scroll.totalChildren(500);
        int yy = 0;
        int child = 0;
        int sprite = 14;
        int i = 0;
        do {
            if (i >= 100) {
                scroll.width = 270;
                scroll.height = 211;
                scroll.scrollMax = yy;
                RSInterface.addTextInput(28308, 140, 24, 1, "Search for player", tab, new InterfaceTextInput(){

                    @Override
                    public void handleInput() {
                    }
                });
                RSInterface.addTextInput(28299, 140, 18, 1, "Input Referrer Name", tab, new InterfaceTextInput(){

                    @Override
                    public void handleInput() {
                    }
                });
                return;
            }
            RSInterface.addHoverButton(28316 + i, sprite, 286, 16, "Select", -1, 28416 + i, 1);
            RSInterface.addHoveredButton(28416 + i, 15, 286, 16, 28516 + i);
            RSInterface.addText(28616 + i, "" + (i + 1) + ":", tda, 0, 16777215, false, true);
            RSInterface.addText(28716 + i, "Player Name", tda, 0, 16777215, false, true);
            RSInterface.addText(28816 + i, "Npc Kills", tda, 0, 16777215, false, true);
            scroll.child(child++, 28316 + i, 0, yy);
            scroll.child(child++, 28416 + i, 0, yy);
            scroll.child(child++, 28616 + i, 4, yy + 2);
            scroll.child(child++, 28716 + i, 60, yy + 2);
            scroll.child(child++, 28816 + i, 190, yy + 2);
            sprite = sprite == 14 ? 16 : 14;
            yy += 16;
            ++i;
        } while (true);
    }

    public static void CostumeTab(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addInterface(44000);
        int i = 0;
        do {
            if (i >= 8) {
                RSInterface.addCostumeContainer(44009, true);
                RSInterface.addCostumeContainer(44010, true);
                RSInterface.addCostumeContainer(44011, true);
                RSInterface.addCostumeContainer(44012, true);
                RSInterface.addCostumeContainer(44013, true);
                RSInterface.addCostumeContainer(44014, true);
                RSInterface.addCostumeContainer(44015, true);
                RSInterface.addCostumeContainer(44016, true);
                RSInterface.addHoverButton(44017, 129, 40, 39, "Show Armor Tab", -1, 44018, 1);
                RSInterface.addHoveredButton(44018, 130, 40, 39, 44019);
                RSInterface.setChildren(18, tab);
                RSInterface.setBounds(44001, 78, 10, 0, tab);
                RSInterface.setBounds(44002, 28, 50, 1, tab);
                RSInterface.setBounds(44003, 78, 50, 2, tab);
                RSInterface.setBounds(44004, 78, 90, 3, tab);
                RSInterface.setBounds(44005, 128, 90, 4, tab);
                RSInterface.setBounds(44006, 78, 130, 5, tab);
                RSInterface.setBounds(44007, 28, 170, 6, tab);
                RSInterface.setBounds(44008, 78, 170, 7, tab);
                RSInterface.setBounds(44009, 80, 10, 8, tab);
                RSInterface.setBounds(44010, 30, 50, 9, tab);
                RSInterface.setBounds(44011, 80, 50, 10, tab);
                RSInterface.setBounds(44012, 80, 90, 11, tab);
                RSInterface.setBounds(44013, 130, 90, 12, tab);
                RSInterface.setBounds(44014, 80, 130, 13, tab);
                RSInterface.setBounds(44015, 30, 170, 14, tab);
                RSInterface.setBounds(44016, 80, 170, 15, tab);
                RSInterface.setBounds(44017, 76, 215, 16, tab);
                RSInterface.setBounds(44018, 76, 215, 17, tab);
                return;
            }
            RSInterface.addSprite(44001 + i, 55);
            ++i;
        } while (true);
    }

    public static void Zone(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addInterface(41000);
        RSInterface.addSprite(41001, 50);
        RSInterface.addHoverButton(41002, 12, 16, 16, "Close", -1, 41003, 1);
        RSInterface.addHoveredButton(41003, 13, 16, 16, 41004);
        RSInterface.addText(41005, "NPC & Zone Requirements", tda, 2, 16753920, true, true);
        int x = 10;
        int y = 10;
        tab.totalChildren(5);
        tab.child(0, 41001, x, y);
        tab.child(1, 41002, 464 + x, 4 + y);
        tab.child(2, 41003, 464 + x, 4 + y);
        tab.child(3, 41005, 243 + x, 4 + y);
        tab.child(4, 41006, 7 + x, 22 + y);
        RSInterface scroll = RSInterface.addInterface(41006);
        int[] itemsAmounts = new int[]{0, 0, 6, 4, 7, 5, 0, 0, 0, 1, 0, 4, 0, 0, 0, 7, 7, 6, 0, 0, 0, 1, 0};
        int[] ITEM_DISPLAY_AMOUNTS = new int[itemsAmounts.length];
        for (int i = 0; i < itemsAmounts.length; ++i) {
            ITEM_DISPLAY_AMOUNTS[i] = itemsAmounts[i];
        }
        int totalChildren = 6 * itemsAmounts.length;
        for (int i = 0; i < ITEM_DISPLAY_AMOUNTS.length; totalChildren += ITEM_DISPLAY_AMOUNTS[i] * 2, ++i) {
        }
        scroll.totalChildren(totalChildren);
        int child = 0;
        int xx = 5;
        int yy = 5;
        int ss = 14484;
        int dY = 0;
        int item = 0;
        int i = 0;
        do {
            if (i >= ITEM_DISPLAY_AMOUNTS.length) {
                scroll.width = 457;
                scroll.height = 277;
                scroll.scrollMax = yy;
                return;
            }
            RSInterface.addText(41070 + i, "NPC/Zone Name:", tda, 1, 16748608, false, true);
            RSInterface.addText(41170 + i, "Kills Required:", tda, 0, 16748608, false, true);
            if (ITEM_DISPLAY_AMOUNTS[i] == 0) {
                RSInterface.addSprite(41230 + i, 54);
            } else {
                RSInterface.addSprite(41230 + i, 51);
            }
            RSInterface.addHoverButton(41450 + i, 52, 99, 23, "Teleport To Zone", -1, 41560 + i, 1);
            RSInterface.addHoveredButton(41560 + i, 53, 99, 23, 41670 + i);
            RSInterface.addText(41780 + i, "Teleport", tda, 1, 65410, true, true);
            scroll.child(child++, 41230 + i, 0, yy);
            dY = yy;
            scroll.child(child++, 41070 + i, 6, yy += 5);
            scroll.child(child++, 41170 + i, 6, yy += 14);
            if (ITEM_DISPLAY_AMOUNTS[i] != 0) {
                yy += 14;
            }
            for (int j = 0; j < ITEM_DISPLAY_AMOUNTS[i]; ++j) {
                RSInterface.itemGroup(41007 + item, 10, 2, 7, 6);
                RSInterface.addSprite(ss, 55);
                scroll.child(child++, ss++, xx, yy);
                scroll.child(child++, 41007 + item++, xx, yy);
                xx += 39;
                if (j == 9) {
                    xx = 5;
                    yy += 38;
                }
                if (j != ITEM_DISPLAY_AMOUNTS[i] - 1 || j >= 9) continue;
                yy += 38;
            }
            scroll.child(child++, 41450 + i, 293, dY + (ITEM_DISPLAY_AMOUNTS[i] == 0 ? 32 : 84));
            scroll.child(child++, 41560 + i, 293, dY + (ITEM_DISPLAY_AMOUNTS[i] == 0 ? 32 : 84));
            scroll.child(child++, 41780 + i, 342, dY + (ITEM_DISPLAY_AMOUNTS[i] == 0 ? 36 : 88));
            xx = 5;
            yy += 70;
            ++i;
        } while (true);
    }

    public static void OsDropViewer(TextDrawingArea[] tda) {
        int i;
        RSInterface tab = RSInterface.addInterface(33000);
        RSInterface.addSprite(33001, 57);
        RSInterface.addHoverButton(33002, 12, 21, 21, "Close", 0, 33003, 1);
        RSInterface.addHoveredButton(33003, 13, 21, 21, 33004);
        RSInterface.addText(33005, "Monster Drop Viewer", tda, 2, 16753920, true, true);
        RSInterface.addText(33110, "Health: @whi@0", tda, 1, 16748608, false, true);
        RSInterface.addText(33111, "Drop Rate: @whi@0", tda, 1, 16748608, false, true);
        RSInterface.addText(33112, "Max Hit: @whi@0", tda, 1, 16748608, false, true);
        RSInterface.addText(33113, "With DRB: @whi@false", tda, 1, 16748608, false, true);
        int x = 7;
        int y = 7;
        tab.totalChildren(11);
        tab.child(0, 33001, 0 + x, 0 + y);
        tab.child(1, 33002, 472 + x, 7 + y);
        tab.child(2, 33003, 472 + x, 7 + y);
        tab.child(3, 33005, 250 + x, 11 + y);
        tab.child(4, 33006, 8 + x, 37 + y);
        tab.child(5, 33007, 6 + x, 58 + y);
        tab.child(6, 34000, 150 + x, 86 + y);
        tab.child(7, 33110, 250 + x, 40 + y);
        tab.child(8, 33111, 250 + x, 60 + y);
        tab.child(9, 33112, 380 + x, 40 + y);
        tab.child(10, 33113, 380 + x, 60 + y);
        final RSInterface results = RSInterface.addInterface(33007);
        results.width = 122;
        results.height = 258;
        results.scrollMax = 0;
        results.totalChildren(100);
        for (int j = 0; j < 100; ++j) {
            RSInterface.addClickableText(33008 + j, "", "View Drops", tda, 0, 16711680, false, true, 110);
            results.child(j, 33008 + j, 3, 2 + j * 14);
        }
        RSInterface main = RSInterface.addInterface(34000);
        main.totalChildren(720);
        main.width = 328;
        main.height = 230;
        main.scrollMax = 2560;
        RSInterface.addSprite(34001, 58);
        RSInterface.addSprite(34002, 59);
        for (i = 0; i < 40; ++i) {
            main.child(i, 34001, 0, i * 64);
            main.child(i + 40, 34002, 0, 32 + i * 64);
        }
        RSInterface.addText(34003, "Amount:", tda, 0, 16748608, true, true);
        RSInterface.addText(34004, "Rarity:", tda, 0, 16748608, true, true);
        RSInterface.addText(34005, "Chance:", tda, 0, 16748608, true, true);
        i = 0;
        do {
            if (i >= 80) {
                RSInterface.addTextInput(33006, 134, 19, 0, "Search for an NPC", tab, new InterfaceTextInput(){

                    @Override
                    public void handleInput() {
                        try {
                            int amount = 0;
                            results.scrollMax = 0;
                            for (int b = 0; b < 100; ++b) {
                                RSInterface.interfaceCache[33008 + b].message = "";
                            }
                            if (RSInterface.interfaceCache[33006].inputText.equals((Object)"")) return;
                            String[] stringIds = RSInterface.interfaceCache[33006].message.split(",");
                            int b = 0;
                            while (b < stringIds.length) {
                                NPCDefinition e = NPCDefinition.forID(Integer.parseInt((String)stringIds[b]));
                                if (e != null && e.name != null && e.name.toLowerCase().contains((CharSequence)RSInterface.interfaceCache[33006].inputText.toLowerCase())) {
                                    RSInterface.interfaceCache[33008 + amount].message = e.name;
                                    RSInterface.interfaceCache[33008 + amount].npcId = Integer.parseInt((String)stringIds[b]);
                                    results.scrollMax += 14;
                                    if (++amount == 100) {
                                        return;
                                    }
                                }
                                ++b;
                            }
                            return;
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                return;
            }
            RSInterface.itemGroup(34010 + i, 1, 1, 1, 1);
            RSInterface.interfaceCache[34010 + i].inv[0] = -1;
            RSInterface.interfaceCache[34010 + i].invStackSizes[0] = 1;
            RSInterface.addText(34100 + i, "", tda, 0, 16753920, false, true);
            RSInterface.addText(34200 + i, "", tda, 0, 16777215, true, true);
            RSInterface.addText(34300 + i, "", tda, 0, 16777215, true, true);
            RSInterface.addText(34400 + i, "", tda, 0, 16777215, true, true);
            int yy = i * 32;
            main.child(80 + i, 34010 + i, 1, 0 + yy);
            main.child(160 + i, 34100 + i, 39, 6 + yy);
            main.child(240 + i, 34003, 175, 2 + yy);
            main.child(320 + i, 34004, 234, 2 + yy);
            main.child(400 + i, 34005, 293, 2 + yy);
            main.child(480 + i, 34200 + i, 175, 14 + yy);
            main.child(560 + i, 34300 + i, 234, 14 + yy);
            main.child(640 + i, 34400 + i, 293, 14 + yy);
            ++i;
        } while (true);
    }

    public static void itemGroup(int id, int w, int h, int x, int y) {
        RSInterface rsi = RSInterface.addInterface(id);
        rsi.width = w;
        rsi.height = h;
        rsi.inv = new int[w * h];
        rsi.customName = new String[w * h];
        rsi.invStackSizes = new int[w * h];
        rsi.usableItemInterface = false;
        rsi.isInventoryInterface = false;
        rsi.invSpritePadX = x;
        rsi.invSpritePadY = y;
        rsi.spritesX = new int[20];
        rsi.spritesY = new int[20];
        rsi.sprites = new Sprite[20];
        rsi.type = 2;
    }

    public static void addTextInput(int id, int w, int h, int text, String defaultText, RSInterface parent, InterfaceTextInput input) {
        RSInterface i = RSInterface.addInterface(id);
        i.type = 77;
        i.width = w;
        i.height = h;
        i.rsFont = newFonts[text];
        i.textInput = input;
        i.tooltip = "Toggle input";
        i.atActionType = 1;
        i.contentType = 0;
        i.inputText = i.defaultText = defaultText;
        parent.hasInputField = true;
        int b = 0;
        while (b < 20) {
            if (inputFields[b] == null) {
                RSInterface.inputFields[b] = i;
                return;
            }
            ++b;
        }
    }

    public static RSInterface addGambleContainer(int id, boolean type) {
        RSInterface widget = RSInterface.addInterface(id);
        widget.parentID = id;
        widget.type = 2;
        widget.width = 6;
        widget.height = 1;
        widget.sprites = new Sprite[20];
        widget.spritesX = new int[20];
        widget.spritesY = new int[20];
        widget.invSpritePadX = 0;
        widget.invSpritePadY = 0;
        widget.inv = new int[30];
        widget.customName = new String[30];
        widget.invStackSizes = new int[30];
        widget.aBoolean259 = false;
        if (type) {
            widget.itemActions = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X"};
            return widget;
        }
        widget.itemActions = new String[5];
        return widget;
    }

    public static RSInterface addCostumeContainer(int id, boolean type) {
        RSInterface widget = RSInterface.addInterface(id);
        widget.parentID = id;
        widget.type = 2;
        widget.width = 1;
        widget.height = 1;
        widget.sprites = new Sprite[20];
        widget.spritesX = new int[20];
        widget.spritesY = new int[20];
        widget.invSpritePadX = 0;
        widget.invSpritePadY = 0;
        widget.inv = new int[30];
        widget.customName = new String[30];
        widget.invStackSizes = new int[30];
        widget.aBoolean259 = false;
        if (type) {
            widget.itemActions = new String[]{"Remove", null, null, null, null};
            return widget;
        }
        widget.itemActions = new String[5];
        return widget;
    }

    public static void bank(TextDrawingArea[] tda) {
        RSInterface rs = RSInterface.addInterface(5292);
        rs.message = "";
        RSInterface.setChildren(27, rs);
        RSInterface.addSprite(59001, 60);
        RSInterface.addHoverButton(5384, 12, 24, 24, "Close Window", 250, 5380, 3);
        RSInterface.addHoveredButton(5380, 13, 24, 24, 5379);
        RSInterface.addHoverButton(5294, 61, 100, 33, "Set A Bank PIN", 250, 5295, 4);
        RSInterface.addHoveredButton(5295, 62, 100, 33, 5296);
        RSInterface.addBankHover(59002, 4, 59003, 63, 66, 37, 29, 304, 1, "Swap Withdraw Mode", 59004, 65, 64, "BankTab/BANK", 59005, "Switch to insert items \nmode", "Switch to swap items \nmode.", 12, 20);
        RSInterface.addBankHover(59010, 4, 59011, 67, 69, 37, 29, 115, 1, "Swap Note Mode", 59012, 68, 70, "BankTab/BANK", 59013, "Switch to note withdrawal \nmode", "Switch to item withdrawal \nmode", 12, 20);
        RSInterface.addBankHover1(59018, 5, 59019, 71, 37, 29, "Deposit carried items", 59020, 72, "BankTab/BANK", 59021, "Empty your backpack into\nyour bank", 0, 20);
        RSInterface.addBankHover1(59026, 5, 59027, 73, 35, 25, "Deposit worn items", 59028, 74, "BankTab/BANK", 59029, "Empty the items your are\nwearing into your bank", 0, 20);
        for (int i = 0; i < 9; ++i) {
            RSInterface.addInterface(59050 + i);
            if (i == 0) {
                RSInterface.addConfigButton(59031, 5292, 1, 0, "BankTab/TAB", 48, 38, new String[]{"Price Check", "View"}, 1, 700);
            } else {
                RSInterface.addConfigButton(59031 + i, 5292, 4, 2, "BankTab/TAB", 48, 38, new String[]{"Price Check", "Collapse", "View"}, 1, 700 + i);
            }
            RSInterface.addToItemGroup(59040 + i, 1, 1, 0, 0, false, "", "", "");
        }
        RSInterface.addSprite(59060, 75);
        RSInterface.addText(59061, "0", tda, 0, 15108608, true, true);
        RSInterface.addText(59062, "350", tda, 0, 15108608, true, true);
        RSInterface.addText(59065, "Bank", tda, 1, 15108608, true, true);
        RSInterface Interface = interfaceCache[5385];
        Interface.height = 208;
        Interface.width = 481;
        Interface = interfaceCache[5382];
        Interface.searchableContainer = true;
        Interface.width = 10;
        Interface.invSpritePadX = 12;
        Interface.height = 35;
        Interface.itemActions = new String[]{"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw All but one"};
        RSInterface.setBounds(59001, 13, 1, 0, rs);
        RSInterface.setBounds(5384, 475, 10, 1, rs);
        RSInterface.setBounds(5380, 475, 10, 2, rs);
        RSInterface.setBounds(5294, 193, 297, 3, rs);
        RSInterface.setBounds(5295, 193, 297, 4, rs);
        RSInterface.setBounds(59002, 25, 297, 5, rs);
        RSInterface.setBounds(59003, 10, 237, 6, rs);
        RSInterface.setBounds(59010, 67, 297, 7, rs);
        RSInterface.setBounds(59011, 52, 237, 8, rs);
        RSInterface.setBounds(59018, 109, 297, 9, rs);
        RSInterface.setBounds(59019, 94, 237, 10, rs);
        RSInterface.setBounds(59026, 151, 297, 11, rs);
        RSInterface.setBounds(59027, 136, 237, 12, rs);
        RSInterface.setBounds(5385, -3, 76, 13, rs);
        RSInterface.interfaceCache[5385].height = 216;
        int x = 68;
        int i = 0;
        do {
            if (i >= 9) {
                RSInterface.setBounds(59060, 452, 295, 23, rs);
                RSInterface.setBounds(59061, 473, 299, 24, rs);
                RSInterface.setBounds(59062, 473, 310, 25, rs);
                RSInterface.setBounds(59065, 250, 11, 26, rs);
                return;
            }
            RSInterface.setBounds(59050 + i, 0, 0, 14 + i, rs);
            RSInterface rsi = interfaceCache[59050 + i];
            RSInterface.setChildren(2, rsi);
            RSInterface.setBounds(59031 + i, x, 36, 0, rsi);
            RSInterface.setBounds(59040 + i, x + 5, 39, 1, rsi);
            x += 41;
            ++i;
        } while (true);
    }

    public static /* varargs */ RSInterface addToItemGroup(int id, int w, int h, int x, int y, boolean actions, String ... itemActions) {
        RSInterface rsi = RSInterface.addInterface(id);
        rsi.width = w;
        rsi.height = h;
        rsi.inv = new int[w * h];
        rsi.customName = new String[w * h];
        rsi.invStackSizes = new int[w * h];
        rsi.usableItemInterface = false;
        rsi.isInventoryInterface = false;
        rsi.isMouseoverTriggered = false;
        rsi.invSpritePadX = x;
        rsi.invSpritePadY = y;
        rsi.spritesX = new int[20];
        rsi.spritesY = new int[20];
        rsi.sprites = new Sprite[20];
        rsi.itemActions = new String[5];
        if (actions) {
            for (int i = 0; i < itemActions.length; ++i) {
                rsi.itemActions[i] = itemActions[i];
            }
        }
        rsi.type = 2;
        return rsi;
    }

    public static void extraOptions(TextDrawingArea[] TDA) {
        int totalTeleports = 250;
        RSInterface widget = RSInterface.addTabInterface(33600);
        RSInterface.setChildren(7, widget);
        int childId = 33601;
        RSInterface.addText(childId, "Custom Ingame", 16750623, false, true, -1, TDA, 3);
        RSInterface.setBounds(childId, 45, 5, childId - 33601, widget);
        RSInterface.addText(++childId, "Teleports:", 16750623, false, true, -1, TDA, 3);
        RSInterface.setBounds(childId, 70, 25, childId - 33601, widget);
        RSInterface.addSprite(++childId, 0, "Options/LINE");
        RSInterface.setBounds(childId, 0, 50, childId - 33601, widget);
        RSInterface.addSprite(++childId, 0, "Options/LINE");
        RSInterface.setBounds(childId, 0, 234, childId - 33601, widget);
        RSInterface.addButton(++childId, 1, "Options/BUTTON", "Back");
        RSInterface.setBounds(childId, 60, 238, childId - 33601, widget);
        RSInterface.addText(++childId, "Back", 16750623, true, true, -1, TDA, 1);
        RSInterface.setBounds(childId, 101, 241, childId - 33601, widget);
        RSInterface.setBounds(33700, 0, 53, ++childId - 33601, widget);
        RSInterface scrollWidget = RSInterface.addTabInterface(33700);
        RSInterface.setChildren(500, scrollWidget);
        scrollWidget.width = 173;
        scrollWidget.height = 180;
        scrollWidget.scrollMax = 6255;
        childId = 33701;
        int position = 0;
        int yPosition = 5;
        boolean image = false;
        int i = 0;
        while (i < 250) {
            RSInterface.addSprite(childId, image ? 2 : 3, "Options/IMAGE");
            RSInterface.setBounds(childId, 0, yPosition - 4, position++, scrollWidget);
            image = !image;
            RSInterface.addClickableText(++childId, "", "Teleport", TDA, 1, 16751360, false, false, 100);
            RSInterface.setBounds(childId, 5, yPosition, position++, scrollWidget);
            ++childId;
            yPosition += 25;
            ++i;
        }
    }

    public static RSInterface addGambleInventoryContainer(int id, boolean type) {
        RSInterface widget = RSInterface.addInterface(id);
        widget.parentID = id;
        widget.type = 2;
        widget.width = 4;
        widget.height = 7;
        widget.sprites = new Sprite[20];
        widget.spritesX = new int[20];
        widget.spritesY = new int[20];
        widget.invSpritePadX = 10;
        widget.invSpritePadY = 4;
        widget.inv = new int[30];
        widget.customName = new String[30];
        widget.invStackSizes = new int[30];
        widget.aBoolean259 = false;
        if (type) {
            widget.itemActions = new String[]{"Offer 1", "Offer 5", "Offer 10", "Offer All", "Offer X"};
            return widget;
        }
        widget.itemActions = new String[5];
        return widget;
    }

    protected static void addHoverButton(int interfaceId, int spriteId, int width, int height, String text, int contentType, int hoverOver, int actionType, boolean advanced) {
        RSInterface tab = RSInterface.addTabInterface(interfaceId);
        tab.id = interfaceId;
        tab.parentID = interfaceId;
        tab.type = 5;
        tab.atActionType = actionType;
        tab.contentType = contentType;
        tab.opacity = 0;
        tab.mOverInterToTrigger = hoverOver;
        if (spriteId >= 0) {
            tab.sprite1 = Client.cacheSprite[spriteId];
            tab.sprite2 = Client.cacheSprite[spriteId];
        }
        tab.width = width;
        tab.height = height;
        tab.tooltip = text;
        tab.advancedSprite = advanced;
    }

    protected static void addHoveredButton(int i, int j, int w, int h, int IMAGEID, boolean advanced) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.parentID = i;
        tab.id = i;
        tab.type = 0;
        tab.atActionType = 0;
        tab.width = w;
        tab.height = h;
        tab.isMouseoverTriggered = true;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        tab.scrollMax = 0;
        RSInterface.addHoverImage(IMAGEID, j, j);
        tab.totalChildren(1);
        tab.child(0, IMAGEID, 0, 0);
        tab.advancedSprite = advanced;
    }

    private static void addHoverImage(int i, int j, int k) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = 512;
        tab.height = 334;
        tab.opacity = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = Client.cacheSprite[j];
        tab.sprite2 = Client.cacheSprite[k];
    }

    public static void addTransparentSprite(int id, int spriteId, int spriteId2, int op) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 10;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = Client.cacheSprite[spriteId];
        tab.sprite2 = Client.cacheSprite[spriteId2];
        tab.width = 512;
        tab.height = 334;
        tab.opacity = op;
    }

    public static void skillLevel(TextDrawingArea[] tda) {
        String dir = "skillchat";
        RSInterface attack = interfaceCache[6247];
        RSInterface defence = interfaceCache[6253];
        RSInterface str = interfaceCache[6206];
        RSInterface hits = interfaceCache[6216];
        RSInterface rng = interfaceCache[4443];
        RSInterface pray = interfaceCache[6242];
        RSInterface mage = interfaceCache[6211];
        RSInterface cook = interfaceCache[6226];
        RSInterface wood = interfaceCache[4272];
        RSInterface flet = interfaceCache[6231];
        RSInterface fish = interfaceCache[6258];
        RSInterface fire = interfaceCache[4282];
        RSInterface craf = interfaceCache[6263];
        RSInterface smit = interfaceCache[6221];
        RSInterface mine = interfaceCache[4416];
        RSInterface herb = interfaceCache[6237];
        RSInterface agil = interfaceCache[4277];
        RSInterface thie = interfaceCache[4261];
        RSInterface slay = interfaceCache[12122];
        RSInterface farm = RSInterface.addInterface(17903);
        RSInterface rune = interfaceCache[4267];
        RSInterface cons = RSInterface.addInterface(7267);
        RSInterface hunt = RSInterface.addInterface(8267);
        RSInterface summ = RSInterface.addInterface(9267);
        RSInterface dung = RSInterface.addInterface(10267);
        RSInterface.addCachedSprite(17878, 0, dir);
        RSInterface.addCachedSprite(17879, 1, dir);
        RSInterface.addCachedSprite(17880, 2, dir);
        RSInterface.addCachedSprite(17881, 3, dir);
        RSInterface.addCachedSprite(17882, 4, dir);
        RSInterface.addCachedSprite(17883, 5, dir);
        RSInterface.addCachedSprite(17884, 6, dir);
        RSInterface.addCachedSprite(17885, 7, dir);
        RSInterface.addCachedSprite(17886, 8, dir);
        RSInterface.addCachedSprite(17887, 9, dir);
        RSInterface.addCachedSprite(17888, 10, dir);
        RSInterface.addCachedSprite(17889, 11, dir);
        RSInterface.addCachedSprite(17890, 12, dir);
        RSInterface.addCachedSprite(17891, 13, dir);
        RSInterface.addCachedSprite(17892, 14, dir);
        RSInterface.addCachedSprite(17893, 15, dir);
        RSInterface.addCachedSprite(17894, 16, dir);
        RSInterface.addCachedSprite(17895, 17, dir);
        RSInterface.addCachedSprite(17896, 18, dir);
        RSInterface.addCachedSprite(17897, 19, dir);
        RSInterface.addCachedSprite(17898, 20, dir);
        RSInterface.addCachedSprite(17899, 21, dir);
        RSInterface.addCachedSprite(17900, 22, dir);
        RSInterface.addCachedSprite(17901, 23, dir);
        RSInterface.addCachedSprite(17902, 24, dir);
        RSInterface.setChildren(4, attack);
        RSInterface.setBounds(17878, 20, 30, 0, attack);
        RSInterface.setBounds(4268, 80, 15, 1, attack);
        RSInterface.setBounds(4269, 80, 45, 2, attack);
        RSInterface.setBounds(358, 95, 75, 3, attack);
        RSInterface.setChildren(4, defence);
        RSInterface.setBounds(17879, 20, 30, 0, defence);
        RSInterface.setBounds(4268, 80, 15, 1, defence);
        RSInterface.setBounds(4269, 80, 45, 2, defence);
        RSInterface.setBounds(358, 95, 75, 3, defence);
        RSInterface.setChildren(4, str);
        RSInterface.setBounds(17880, 20, 30, 0, str);
        RSInterface.setBounds(4268, 80, 15, 1, str);
        RSInterface.setBounds(4269, 80, 45, 2, str);
        RSInterface.setBounds(358, 95, 75, 3, str);
        RSInterface.setChildren(4, hits);
        RSInterface.setBounds(17881, 20, 30, 0, hits);
        RSInterface.setBounds(4268, 80, 15, 1, hits);
        RSInterface.setBounds(4269, 80, 45, 2, hits);
        RSInterface.setBounds(358, 95, 75, 3, hits);
        RSInterface.setChildren(4, rng);
        RSInterface.setBounds(17882, 20, 30, 0, rng);
        RSInterface.setBounds(4268, 80, 15, 1, rng);
        RSInterface.setBounds(4269, 80, 45, 2, rng);
        RSInterface.setBounds(358, 95, 75, 3, rng);
        RSInterface.setChildren(4, pray);
        RSInterface.setBounds(17883, 20, 30, 0, pray);
        RSInterface.setBounds(4268, 80, 15, 1, pray);
        RSInterface.setBounds(4269, 80, 45, 2, pray);
        RSInterface.setBounds(358, 95, 75, 3, pray);
        RSInterface.setChildren(4, mage);
        RSInterface.setBounds(17884, 20, 30, 0, mage);
        RSInterface.setBounds(4268, 80, 15, 1, mage);
        RSInterface.setBounds(4269, 80, 45, 2, mage);
        RSInterface.setBounds(358, 95, 75, 3, mage);
        RSInterface.setChildren(4, cook);
        RSInterface.setBounds(17885, 20, 30, 0, cook);
        RSInterface.setBounds(4268, 80, 15, 1, cook);
        RSInterface.setBounds(4269, 80, 45, 2, cook);
        RSInterface.setBounds(358, 95, 75, 3, cook);
        RSInterface.setChildren(4, wood);
        RSInterface.setBounds(17886, 20, 30, 0, wood);
        RSInterface.setBounds(4268, 80, 15, 1, wood);
        RSInterface.setBounds(4269, 80, 45, 2, wood);
        RSInterface.setBounds(358, 95, 75, 3, wood);
        RSInterface.setChildren(4, flet);
        RSInterface.setBounds(17887, 20, 30, 0, flet);
        RSInterface.setBounds(4268, 80, 15, 1, flet);
        RSInterface.setBounds(4269, 80, 45, 2, flet);
        RSInterface.setBounds(358, 95, 75, 3, flet);
        RSInterface.setChildren(4, fish);
        RSInterface.setBounds(17888, 20, 30, 0, fish);
        RSInterface.setBounds(4268, 80, 15, 1, fish);
        RSInterface.setBounds(4269, 80, 45, 2, fish);
        RSInterface.setBounds(358, 95, 75, 3, fish);
        RSInterface.setChildren(4, fire);
        RSInterface.setBounds(17889, 20, 30, 0, fire);
        RSInterface.setBounds(4268, 80, 15, 1, fire);
        RSInterface.setBounds(4269, 80, 45, 2, fire);
        RSInterface.setBounds(358, 95, 75, 3, fire);
        RSInterface.setChildren(4, craf);
        RSInterface.setBounds(17890, 20, 30, 0, craf);
        RSInterface.setBounds(4268, 80, 15, 1, craf);
        RSInterface.setBounds(4269, 80, 45, 2, craf);
        RSInterface.setBounds(358, 95, 75, 3, craf);
        RSInterface.setChildren(4, smit);
        RSInterface.setBounds(17891, 20, 30, 0, smit);
        RSInterface.setBounds(4268, 80, 15, 1, smit);
        RSInterface.setBounds(4269, 80, 45, 2, smit);
        RSInterface.setBounds(358, 95, 75, 3, smit);
        RSInterface.setChildren(4, mine);
        RSInterface.setBounds(17892, 20, 30, 0, mine);
        RSInterface.setBounds(4268, 80, 15, 1, mine);
        RSInterface.setBounds(4269, 80, 45, 2, mine);
        RSInterface.setBounds(358, 95, 75, 3, mine);
        RSInterface.setChildren(4, herb);
        RSInterface.setBounds(17893, 20, 30, 0, herb);
        RSInterface.setBounds(4268, 80, 15, 1, herb);
        RSInterface.setBounds(4269, 80, 45, 2, herb);
        RSInterface.setBounds(358, 95, 75, 3, herb);
        RSInterface.setChildren(4, agil);
        RSInterface.setBounds(17894, 20, 30, 0, agil);
        RSInterface.setBounds(4268, 80, 15, 1, agil);
        RSInterface.setBounds(4269, 80, 45, 2, agil);
        RSInterface.setBounds(358, 95, 75, 3, agil);
        RSInterface.setChildren(4, thie);
        RSInterface.setBounds(17895, 20, 30, 0, thie);
        RSInterface.setBounds(4268, 80, 15, 1, thie);
        RSInterface.setBounds(4269, 80, 45, 2, thie);
        RSInterface.setBounds(358, 95, 75, 3, thie);
        RSInterface.setChildren(4, slay);
        RSInterface.setBounds(17896, 20, 30, 0, slay);
        RSInterface.setBounds(4268, 80, 15, 1, slay);
        RSInterface.setBounds(4269, 80, 45, 2, slay);
        RSInterface.setBounds(358, 95, 75, 3, slay);
        RSInterface.setChildren(4, farm);
        RSInterface.setBounds(17897, 20, 30, 0, farm);
        RSInterface.setBounds(4268, 80, 15, 1, farm);
        RSInterface.setBounds(4269, 80, 45, 2, farm);
        RSInterface.setBounds(358, 95, 75, 3, farm);
        RSInterface.setChildren(4, rune);
        RSInterface.setBounds(17898, 20, 30, 0, rune);
        RSInterface.setBounds(4268, 80, 15, 1, rune);
        RSInterface.setBounds(4269, 80, 45, 2, rune);
        RSInterface.setBounds(358, 95, 75, 3, rune);
        RSInterface.setChildren(4, cons);
        RSInterface.setBounds(17899, 20, 30, 0, cons);
        RSInterface.setBounds(4268, 80, 15, 1, cons);
        RSInterface.setBounds(4269, 80, 45, 2, cons);
        RSInterface.setBounds(358, 95, 75, 3, cons);
        RSInterface.setChildren(4, hunt);
        RSInterface.setBounds(17900, 20, 30, 0, hunt);
        RSInterface.setBounds(4268, 80, 15, 1, hunt);
        RSInterface.setBounds(4269, 80, 45, 2, hunt);
        RSInterface.setBounds(358, 95, 75, 3, hunt);
        RSInterface.setChildren(4, summ);
        RSInterface.setBounds(17901, 20, 30, 0, summ);
        RSInterface.setBounds(4268, 80, 15, 1, summ);
        RSInterface.setBounds(4269, 80, 45, 2, summ);
        RSInterface.setBounds(358, 95, 75, 3, summ);
        RSInterface.setChildren(4, dung);
        RSInterface.setBounds(17902, 20, 30, 0, dung);
        RSInterface.setBounds(4268, 80, 15, 1, dung);
        RSInterface.setBounds(4269, 80, 45, 2, dung);
        RSInterface.setBounds(358, 95, 75, 3, dung);
    }

    public static void Skillcapes(TextDrawingArea[] TDA) {
        RSInterface Interface = RSInterface.addInterface(29560);
        RSInterface.setChildren(56, Interface);
        RSInterface.addHoverButton(29561, "Interfaces/Skillcapes/CLOSE", 1, 16, 16, "Close", 0, 29562, 1);
        RSInterface.addHoveredButton(29562, "Interfaces/Skillcapes/CLOSE", 2, 16, 16, 29563);
        RSInterface.addButton(29564, 1, "Interfaces/Skillcapes/SKILLCAPES", 271, 44, "Skillcape Shop", 1);
        RSInterface.addSprite(29565, 0, "Interfaces/Skillcapes/SKILLCAPES");
        RSInterface.addHoverButton(29566, "Interfaces/Skillcapes/HOVER", 1, 25, 40, "Fishing Cape", 0, 29567, 1);
        RSInterface.addHoveredButton(29567, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29568);
        RSInterface.addHoverButton(29569, "Interfaces/Skillcapes/HOVER", 2, 25, 40, "Fletching Cape", 0, 29570, 1);
        RSInterface.addHoveredButton(29570, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29571);
        RSInterface.addHoverButton(29572, "Interfaces/Skillcapes/HOVER", 3, 25, 40, "Firemaking Cape", 0, 29573, 1);
        RSInterface.addHoveredButton(29573, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29574);
        RSInterface.addHoverButton(29575, "Interfaces/Skillcapes/HOVER", 4, 25, 40, "Herblore Cape", 0, 29576, 1);
        RSInterface.addHoveredButton(29576, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29577);
        RSInterface.addHoverButton(29578, "Interfaces/Skillcapes/HOVER", 5, 25, 40, "Hitpoints Cape", 0, 29579, 1);
        RSInterface.addHoveredButton(29579, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29580);
        RSInterface.addHoverButton(29581, "Interfaces/Skillcapes/HOVER", 6, 25, 40, "Hunter Cape", 0, 29582, 1);
        RSInterface.addHoveredButton(29582, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29583);
        RSInterface.addHoverButton(29584, "Interfaces/Skillcapes/HOVER", 7, 25, 40, "Magic Cape", 0, 29585, 1);
        RSInterface.addHoveredButton(29585, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29586);
        RSInterface.addHoverButton(29587, "Interfaces/Skillcapes/HOVER", 8, 25, 40, "Mining Cape", 0, 29588, 1);
        RSInterface.addHoveredButton(29588, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29589);
        RSInterface.addHoverButton(29590, "Interfaces/Skillcapes/HOVER", 9, 25, 40, "Prayer Cape", 0, 29591, 1);
        RSInterface.addHoveredButton(29591, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29592);
        RSInterface.addHoverButton(29593, "Interfaces/Skillcapes/HOVER", 10, 25, 40, "Quest Cape", 0, 29594, 1);
        RSInterface.addHoveredButton(29594, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29595);
        RSInterface.addHoverButton(29596, "Interfaces/Skillcapes/HOVER", 11, 25, 40, "Ranged Cape", 0, 29597, 1);
        RSInterface.addHoveredButton(29597, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29598);
        RSInterface.addHoverButton(29599, "Interfaces/Skillcapes/HOVER", 12, 25, 40, "Runecrafting Cape", 0, 29600, 1);
        RSInterface.addHoveredButton(29600, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29601);
        RSInterface.addHoverButton(29602, "Interfaces/Skillcapes/HOVER", 13, 25, 40, "Slayer Cape", 0, 29603, 1);
        RSInterface.addHoveredButton(29603, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29604);
        RSInterface.addHoverButton(29605, "Interfaces/Skillcapes/HOVER", 14, 25, 40, "Smithing Cape", 0, 29606, 1);
        RSInterface.addHoveredButton(29606, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29607);
        RSInterface.addHoverButton(29608, "Interfaces/Skillcapes/HOVER", 15, 25, 40, "Strength Cape", 0, 29609, 1);
        RSInterface.addHoveredButton(29609, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29610);
        RSInterface.addHoverButton(29611, "Interfaces/Skillcapes/HOVER", 16, 25, 40, "Thieving Cape", 0, 29612, 1);
        RSInterface.addHoveredButton(29612, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29613);
        RSInterface.addHoverButton(29614, "Interfaces/Skillcapes/HOVER", 17, 25, 40, "Woodcutting Cape", 0, 29615, 1);
        RSInterface.addHoveredButton(29615, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29616);
        RSInterface.addHoverButton(29617, "Interfaces/Skillcapes/HOVER", 18, 25, 40, "Agility Cape", 0, 29618, 1);
        RSInterface.addHoveredButton(29618, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29619);
        RSInterface.addHoverButton(29620, "Interfaces/Skillcapes/HOVER", 19, 25, 40, "Attack Cape", 0, 29621, 1);
        RSInterface.addHoveredButton(29621, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29622);
        RSInterface.addHoverButton(29623, "Interfaces/Skillcapes/HOVER", 20, 25, 40, "Dungeoneering Cape", 0, 29624, 1);
        RSInterface.addHoveredButton(29624, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29625);
        RSInterface.addHoverButton(29626, "Interfaces/Skillcapes/HOVER", 21, 25, 40, "Cooking Cape", 0, 29627, 1);
        RSInterface.addHoveredButton(29627, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29628);
        RSInterface.addHoverButton(29629, "Interfaces/Skillcapes/HOVER", 22, 25, 40, "Crafting Cape", 0, 29630, 1);
        RSInterface.addHoveredButton(29630, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29631);
        RSInterface.addHoverButton(29632, "Interfaces/Skillcapes/HOVER", 23, 25, 40, "Defence Cape", 0, 29633, 1);
        RSInterface.addHoveredButton(29633, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29634);
        RSInterface.addHoverButton(29635, "Interfaces/Skillcapes/HOVER", 24, 25, 40, "Herblore Cape", 0, 29636, 1);
        RSInterface.addHoveredButton(29636, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29637);
        RSInterface.addHoverButton(29638, "Interfaces/Skillcapes/HOVER", 25, 25, 40, "Summoning Cape", 0, 29639, 1);
        RSInterface.addHoveredButton(29639, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29640);
        RSInterface.addHoverButton(29641, "Interfaces/Skillcapes/HOVER", 26, 25, 40, "Construction Cape", 0, 29642, 1);
        RSInterface.addHoveredButton(29642, "Interfaces/Skillcapes/HOVERED", 0, 25, 40, 29643);
        RSInterface.setBounds(29561, 474, 11, 1, Interface);
        RSInterface.setBounds(29562, 474, 11, 2, Interface);
        RSInterface.setBounds(29564, 177, 18, 3, Interface);
        RSInterface.setBounds(29565, 10, 5, 0, Interface);
        RSInterface.setBounds(29566, 35, 72, 4, Interface);
        RSInterface.setBounds(29567, 35, 72, 5, Interface);
        RSInterface.setBounds(29569, 116, 72, 6, Interface);
        RSInterface.setBounds(29570, 116, 72, 7, Interface);
        RSInterface.setBounds(29572, 199, 72, 8, Interface);
        RSInterface.setBounds(29573, 199, 72, 9, Interface);
        RSInterface.setBounds(29575, 281, 72, 10, Interface);
        RSInterface.setBounds(29576, 281, 72, 11, Interface);
        RSInterface.setBounds(29578, 363, 72, 12, Interface);
        RSInterface.setBounds(29579, 363, 72, 13, Interface);
        RSInterface.setBounds(29581, 445, 72, 14, Interface);
        RSInterface.setBounds(29582, 445, 72, 15, Interface);
        RSInterface.setBounds(29584, 35, 132, 16, Interface);
        RSInterface.setBounds(29585, 35, 132, 17, Interface);
        RSInterface.setBounds(29587, 116, 132, 18, Interface);
        RSInterface.setBounds(29588, 116, 132, 19, Interface);
        RSInterface.setBounds(29590, 199, 132, 20, Interface);
        RSInterface.setBounds(29591, 199, 132, 21, Interface);
        RSInterface.setBounds(29593, 281, 132, 22, Interface);
        RSInterface.setBounds(29594, 281, 132, 23, Interface);
        RSInterface.setBounds(29596, 363, 132, 24, Interface);
        RSInterface.setBounds(29597, 363, 132, 25, Interface);
        RSInterface.setBounds(29599, 445, 132, 26, Interface);
        RSInterface.setBounds(29600, 445, 132, 27, Interface);
        RSInterface.setBounds(29602, 35, 192, 28, Interface);
        RSInterface.setBounds(29603, 35, 192, 29, Interface);
        RSInterface.setBounds(29605, 116, 192, 30, Interface);
        RSInterface.setBounds(29606, 116, 192, 31, Interface);
        RSInterface.setBounds(29608, 199, 192, 32, Interface);
        RSInterface.setBounds(29609, 199, 192, 33, Interface);
        RSInterface.setBounds(29611, 281, 192, 34, Interface);
        RSInterface.setBounds(29612, 281, 192, 35, Interface);
        RSInterface.setBounds(29614, 363, 192, 36, Interface);
        RSInterface.setBounds(29615, 363, 192, 37, Interface);
        RSInterface.setBounds(29617, 445, 192, 38, Interface);
        RSInterface.setBounds(29618, 445, 192, 39, Interface);
        RSInterface.setBounds(29620, 35, 252, 40, Interface);
        RSInterface.setBounds(29621, 35, 252, 41, Interface);
        RSInterface.setBounds(29623, 116, 252, 42, Interface);
        RSInterface.setBounds(29624, 116, 252, 43, Interface);
        RSInterface.setBounds(29626, 199, 252, 44, Interface);
        RSInterface.setBounds(29627, 199, 252, 45, Interface);
        RSInterface.setBounds(29629, 281, 252, 46, Interface);
        RSInterface.setBounds(29630, 281, 252, 47, Interface);
        RSInterface.setBounds(29632, 363, 252, 48, Interface);
        RSInterface.setBounds(29633, 363, 252, 49, Interface);
        RSInterface.setBounds(29635, 445, 252, 50, Interface);
        RSInterface.setBounds(29636, 445, 252, 51, Interface);
        RSInterface.setBounds(29638, 35, 18, 52, Interface);
        RSInterface.setBounds(29639, 35, 18, 53, Interface);
        RSInterface.setBounds(29641, 116, 18, 54, Interface);
        RSInterface.setBounds(29642, 116, 18, 55, Interface);
    }

    public static void runecraftingTable(TextDrawingArea[] tda) {
        RSInterface Interface = RSInterface.addInterface(27000);
        RSInterface.addSprite(27001, 1, "Hack3r/runecraftingTable/BACKGROUND");
        RSInterface.addHoverButton(27002, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Air Altar", -1, 27002, 1);
        RSInterface.addHoverButton(27003, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Mind Altar", -1, 27003, 1);
        RSInterface.addHoverButton(27004, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Water Altar", -1, 27004, 1);
        RSInterface.addHoverButton(27005, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Earth Altar", -1, 27005, 1);
        RSInterface.addHoverButton(27006, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Fire Altar", -1, 27006, 1);
        RSInterface.addHoverButton(27007, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Cosmic Altar", -1, 27007, 1);
        RSInterface.addHoverButton(27008, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Chaos Altar", -1, 27008, 1);
        RSInterface.addHoverButton(27009, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Astral Altar", -1, 27009, 1);
        RSInterface.addHoverButton(27010, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Nature Altar", -1, 27010, 1);
        RSInterface.addHoverButton(27011, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Law Altar", -1, 27011, 1);
        RSInterface.addHoverButton(27012, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Death Altar", -1, 27012, 1);
        RSInterface.addHoverButton(27013, "Hack3r/runecraftingTable/SPRITE", 1, 82, 76, "Teleport to @gre@Blood Altar", -1, 27013, 1);
        RSInterface.addHoverButton(27014, "Hack3r/runecraftingTable/CLOSE", 1, 25, 25, "Close", -1, 27014, 1);
        RSInterface.setChildren(14, Interface);
        RSInterface.setBounds(27001, 7, 6, 0, Interface);
        RSInterface.setBounds(27002, 45, 61, 1, Interface);
        RSInterface.setBounds(27003, 155, 61, 2, Interface);
        RSInterface.setBounds(27004, 265, 61, 3, Interface);
        RSInterface.setBounds(27005, 388, 61, 4, Interface);
        RSInterface.setBounds(27006, 40, 145, 5, Interface);
        RSInterface.setBounds(27007, 158, 145, 6, Interface);
        RSInterface.setBounds(27008, 266, 145, 7, Interface);
        RSInterface.setBounds(27009, 385, 145, 8, Interface);
        RSInterface.setBounds(27010, 38, 227, 9, Interface);
        RSInterface.setBounds(27011, 158, 227, 10, Interface);
        RSInterface.setBounds(27012, 265, 227, 11, Interface);
        RSInterface.setBounds(27013, 385, 227, 12, Interface);
        RSInterface.setBounds(27014, 477, 10, 13, Interface);
    }

    public static void monsterTele(TextDrawingArea[] tda) {
        RSInterface Interface = RSInterface.addTabInterface(37000);
        RSInterface.addSprite(37001, 1, "Hack3r/monsterTele/BACKGROUND");
        RSInterface.addText(37002, "Monster Teleports", tda, 2, 14056233, true, true);
        RSInterface.addHoverButton(37003, "Hack3r/monsterTele/HOVER", 1, 124, 26, "Teleport to @gre@Rock Crabs", -1, 37004, 1);
        RSInterface.addHoveredButton(37004, "Hack3r/monsterTele/SHADE", 2, 124, 26, 37005);
        RSInterface.addHoverButton(37006, "Hack3r/monsterTele/HOVER", 1, 124, 26, "Teleport to @gre@Taverly Dungeon", -1, 37007, 1);
        RSInterface.addHoveredButton(37007, "Hack3r/monsterTele/SHADE", 2, 124, 26, 37008);
        RSInterface.addHoverButton(37009, "Hack3r/monsterTele/HOVER", 1, 124, 26, "Teleport to @gre@Slayer Tower", -1, 37010, 1);
        RSInterface.addHoveredButton(37010, "Hack3r/monsterTele/SHADE", 2, 124, 26, 37011);
        RSInterface.addHoverButton(37012, "Hack3r/monsterTele/HOVER", 1, 124, 26, "Teleport to @gre@Rock Crabs", -1, 37013, 1);
        RSInterface.addHoveredButton(37013, "Hack3r/monsterTele/SHADE", 2, 124, 26, 37014);
        RSInterface.addText(37015, "Yak's/Rock Crabs", tda, 0, 16777215, true, true);
        RSInterface.addText(37016, "Taverly Dungeon", tda, 0, 16777215, true, true);
        RSInterface.addText(37017, "Slayer Tower", tda, 0, 16777215, true, true);
        RSInterface.addText(37018, "Brimhaven Dungeon", tda, 0, 16777215, true, true);
        RSInterface.addHoverButton(37019, "Hack3r/monsterTele/shadedMageBook", 1, 43, 35, "Back To Your Spell Book", -1, 37020, 1);
        RSInterface.addHoveredButton(37020, "Hack3r/monsterTele/hoveredMageBook", 2, 43, 35, 37021);
        RSInterface.addHoverButton(37022, "Hack3r/monsterTele/shadedArrow", 1, 43, 35, "Next Page", -1, 37023, 1);
        RSInterface.addHoveredButton(37023, "Hack3r/monsterTele/HoveredArrow", 2, 43, 35, 37024);
        RSInterface.setChildren(18, Interface);
        RSInterface.setBounds(37001, 0, 0, 0, Interface);
        RSInterface.setBounds(37002, 95, 7, 1, Interface);
        RSInterface.setBounds(37003, 25, 36, 2, Interface);
        RSInterface.setBounds(37004, 25, 36, 3, Interface);
        RSInterface.setBounds(37006, 25, 86, 4, Interface);
        RSInterface.setBounds(37007, 25, 86, 5, Interface);
        RSInterface.setBounds(37009, 25, 139, 6, Interface);
        RSInterface.setBounds(37010, 25, 139, 7, Interface);
        RSInterface.setBounds(37012, 25, 188, 8, Interface);
        RSInterface.setBounds(37013, 25, 188, 9, Interface);
        RSInterface.setBounds(37015, 87, 43, 10, Interface);
        RSInterface.setBounds(37016, 87, 93, 11, Interface);
        RSInterface.setBounds(37017, 87, 146, 12, Interface);
        RSInterface.setBounds(37018, 87, 195, 13, Interface);
        RSInterface.setBounds(37019, 0, 221, 14, Interface);
        RSInterface.setBounds(37020, 0, 221, 15, Interface);
        RSInterface.setBounds(37022, 147, 221, 16, Interface);
        RSInterface.setBounds(37023, 147, 221, 17, Interface);
    }

    public static void monsterTeleb(TextDrawingArea[] tda) {
        RSInterface Interface = RSInterface.addTabInterface(39000);
        RSInterface.addSprite(39001, 1, "Hack3r/monsterTeleb/BACKGROUND");
        RSInterface.addText(39002, "Monster Teleports", tda, 2, 14056233, true, true);
        RSInterface.addHoverButton(39003, "Hack3r/monsterTeleb/HOVER", 1, 124, 26, "Teleport to @gre@Hill Giants", -1, 39004, 1);
        RSInterface.addHoveredButton(39004, "Hack3r/monsterTeleb/SHADE", 2, 124, 26, 39005);
        RSInterface.addHoverButton(39006, "Hack3r/monsterTeleb/HOVER", 1, 124, 26, "Teleport to @gre@Strykewyrms", -1, 39007, 1);
        RSInterface.addHoveredButton(39007, "Hack3r/monsterTeleb/SHADE", 2, 124, 26, 39008);
        RSInterface.addText(39009, "Hill Giants", tda, 0, 16777215, true, true);
        RSInterface.addText(39010, "Strykewyrms", tda, 0, 16777215, true, true);
        RSInterface.addHoverButton(39011, "Hack3r/monsterTeleb/shadedMageBook", 1, 43, 35, "Back To Your Spell Book", -1, 39012, 1);
        RSInterface.addHoveredButton(39012, "Hack3r/monsterTeleb/hoveredMageBook", 2, 43, 35, 39013);
        RSInterface.addHoverButton(39014, "Hack3r/monsterTeleb/shadedArrow", 1, 43, 35, "Next Page", -1, 39015, 1);
        RSInterface.addHoveredButton(39015, "Hack3r/monsterTeleb/HoveredArrow", 2, 43, 35, 39016);
        RSInterface.setChildren(12, Interface);
        RSInterface.setBounds(39001, 0, 0, 0, Interface);
        RSInterface.setBounds(39002, 95, 7, 1, Interface);
        RSInterface.setBounds(39003, 25, 36, 2, Interface);
        RSInterface.setBounds(39004, 25, 36, 3, Interface);
        RSInterface.setBounds(39006, 25, 86, 4, Interface);
        RSInterface.setBounds(39007, 25, 86, 5, Interface);
        RSInterface.setBounds(39009, 87, 43, 6, Interface);
        RSInterface.setBounds(39010, 87, 93, 7, Interface);
        RSInterface.setBounds(39011, 147, 221, 8, Interface);
        RSInterface.setBounds(39012, 147, 221, 9, Interface);
        RSInterface.setBounds(39014, 0, 221, 10, Interface);
        RSInterface.setBounds(39015, 0, 221, 11, Interface);
    }

    public static void implingCatching(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addScreenInterface(32000);
        RSInterface.addSprite(32001, 0, "Interfaces/Impling/BACKGROUND");
        RSInterface.addHoverButton(32002, "Interfaces/Impling/EXIT", 0, 24, 24, "Exit", -1, 32003, 1);
        RSInterface.addHoveredButton(32003, "Interfaces/Impling/EXIT", 1, 24, 24, 32004);
        RSInterface.addText(32005, "Impling Catching", 16751360, false, true, 34, tda, 1);
        RSInterface.addHoverButton(32006, "Interfaces/Impling/BACK", 0, 35, 39, "Next", -1, 32007, 1);
        RSInterface.addHoveredButton(32007, "Interfaces/Impling/BACK", 1, 35, 39, 32008);
        RSInterface.addHoverButton(32009, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32010, 1);
        RSInterface.addHoveredButton(32010, "Interfaces/Impling/OPTION", 1, 85, 22, 32011);
        RSInterface.addText(32012, "Baby", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32013, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32014, 1);
        RSInterface.addHoveredButton(32014, "Interfaces/Impling/OPTION", 1, 85, 22, 32015);
        RSInterface.addText(32016, "Young", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32017, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32018, 1);
        RSInterface.addHoveredButton(32018, "Interfaces/Impling/OPTION", 1, 85, 22, 32019);
        RSInterface.addText(32020, "Gourmet", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32021, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32022, 1);
        RSInterface.addHoveredButton(32022, "Interfaces/Impling/OPTION", 1, 85, 22, 32023);
        RSInterface.addText(32024, "Earth", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32025, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32026, 1);
        RSInterface.addHoveredButton(32026, "Interfaces/Impling/OPTION", 1, 85, 22, 32027);
        RSInterface.addText(32028, "Essence", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32029, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32030, 1);
        RSInterface.addHoveredButton(32030, "Interfaces/Impling/OPTION", 1, 85, 22, 32031);
        RSInterface.addText(32032, "Eclectic", 16751360, false, true, 20, tda, 1);
        tab.totalChildren(24);
        tab.child(0, 32001, 1, 1);
        tab.child(1, 32002, 465, 12);
        tab.child(2, 32003, 465, 12);
        tab.child(3, 32005, 205, 19);
        tab.child(4, 32006, 450, 225);
        tab.child(5, 32007, 450, 225);
        tab.child(6, 32009, 96, 79);
        tab.child(7, 32010, 96, 79);
        tab.child(8, 32012, 123, 83);
        tab.child(9, 32013, 96, 146);
        tab.child(10, 32014, 96, 146);
        tab.child(11, 32016, 120, 150);
        tab.child(12, 32017, 96, 213);
        tab.child(13, 32018, 96, 213);
        tab.child(14, 32020, 115, 217);
        tab.child(15, 32021, 312, 79);
        tab.child(16, 32022, 312, 79);
        tab.child(17, 32024, 335, 83);
        tab.child(18, 32025, 312, 146);
        tab.child(19, 32026, 312, 146);
        tab.child(20, 32028, 331, 150);
        tab.child(21, 32029, 312, 213);
        tab.child(22, 32030, 312, 213);
        tab.child(23, 32032, 335, 217);
    }

    public static void dropratesInterface(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addScreenInterface(47000);
        RSInterface.addSprite(47001, 0, "Interfaces/BInt/BACKGROUND");
        RSInterface.addText(47002, "Imagine drop rates:", 16751360, false, true, 34, tda, 1);
        RSInterface.addHoverButton(47003, "Interfaces/BInt/EXIT", 0, 16, 16, "Exit", -1, 47004, 1);
        RSInterface.addHoveredButton(47004, "Interfaces/BInt/EXIT", 1, 16, 16, 47005);
        tab.totalChildren(5);
        tab.child(0, 47001, 15, 15);
        tab.child(1, 47002, 65, 18);
        tab.child(2, 47003, 475, 18);
        tab.child(3, 47004, 475, 18);
        tab.child(4, 47015, 30, 45);
        tab = RSInterface.addTabInterface(47015);
        tab.width = 440;
        tab.height = 255;
        tab.scrollMax = 3000;
        for (int i = 47016; i <= 47216; ++i) {
            RSInterface.addText(i, "", tda, 0, 11631159);
        }
        tab.totalChildren(201);
        int Child = 0;
        int Y = 5;
        int i = 47016;
        while (i <= 47216) {
            tab.child(Child, i, 35, Y);
            ++Child;
            Y += 16;
            ++i;
        }
    }

    public static void loyaltyInterface(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addScreenInterface(21850);
        String dir = "loyalty";
        RSInterface.addSprite(21851, 0, "Interfaces/LoyaltyS/BACKGROUND");
        RSInterface.addHoverButton(21852, "Interfaces/LoyaltyS/EXIT", 0, 24, 24, "Exit", -1, 21853, 1);
        RSInterface.addHoveredButton(21853, "Interfaces/LoyaltyS/EXIT", 1, 24, 24, 21854);
        RSInterface.addText(21855, "Loyalty Point Shop", 16751360, false, true, 20, tda, 2);
        RSInterface.addText(21856, "Your Points:", 11631159, false, true, 34, tda, 1);
        RSInterface.addText(21857, "", 11631159, false, true, 34, tda, 1);
        RSInterface.addHoverButton(21858, "Interfaces/LoyaltyS/SPRITE", 591, 117, 24, "Auras tab", -1, 21859, 1);
        RSInterface.addHoveredButton(21859, "Interfaces/LoyaltyS/SPRITE", 592, 117, 24, 21860);
        RSInterface.addHoverButton(21861, "Interfaces/LoyaltyS/SPRITE", 593, 117, 24, "Pets tab", -1, 21862, 1);
        RSInterface.addHoveredButton(21862, "Interfaces/LoyaltyS/SPRITE", 594, 117, 24, 21863);
        RSInterface.addHoverButton(21864, "Interfaces/LoyaltyS/SPRITE", 595, 117, 24, "Cosmetics tab", -1, 21865, 1);
        RSInterface.addHoveredButton(21865, "Interfaces/LoyaltyS/SPRITE", 596, 117, 24, 21866);
        RSInterface.addHoverButton(21867, "Interfaces/LoyaltyS/SPRITE", 597, 117, 24, "Titles tab", -1, 21868, 1);
        RSInterface.addHoveredButton(21868, "Interfaces/LoyaltyS/SPRITE", 598, 117, 24, 21869);
        RSInterface.addHoverButton(21870, "Interfaces/LoyaltyS/SPRITE", 599, 117, 24, "Features tab", -1, 21871, 1);
        RSInterface.addHoveredButton(21871, "Interfaces/LoyaltyS/SPRITE", 600, 117, 24, 21872);
        RSInterface.addHoverButton(21873, "Interfaces/LoyaltyS/SPRITE", 601, 117, 24, "Special offers", -1, 21874, 1);
        RSInterface.addHoveredButton(21874, "Interfaces/LoyaltyS/SPRITE", 602, 117, 24, 21875);
        RSInterface.addText(21876, "Auras", 15122040, false, true, 34, tda, 1);
        RSInterface.addText(21877, "Pets", 15122040, false, true, 34, tda, 1);
        RSInterface.addText(21878, "Cosmetics", 15122040, false, true, 34, tda, 1);
        RSInterface.addText(21879, "Titles", 15122040, false, true, 34, tda, 1);
        RSInterface.addText(21880, "Features", 15122040, false, true, 34, tda, 1);
        RSInterface.addText(21881, "Special offers", 15122040, false, true, 34, tda, 1);
        RSInterface.addHoverButton(21882, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21883, 1);
        RSInterface.addHoveredButton(21883, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21884);
        RSInterface.addHoverButton(21885, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21886, 1);
        RSInterface.addHoveredButton(21886, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21887);
        RSInterface.addHoverButton(21888, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21889, 1);
        RSInterface.addHoveredButton(21889, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21890);
        RSInterface.addHoverButton(21891, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21892, 1);
        RSInterface.addHoveredButton(21892, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21893);
        RSInterface.addHoverButton(21894, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21895, 1);
        RSInterface.addHoveredButton(21895, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21896);
        RSInterface.addHoverButton(21897, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21898, 1);
        RSInterface.addHoveredButton(21898, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21899);
        RSInterface.addHoverButton(21900, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21901, 1);
        RSInterface.addHoveredButton(21901, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21902);
        RSInterface.addHoverButton(21903, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21904, 1);
        RSInterface.addHoveredButton(21904, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21905);
        RSInterface.addHoverButton(21906, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21907, 1);
        RSInterface.addHoveredButton(21907, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21908);
        RSInterface.addHoverButton(21909, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21910, 1);
        RSInterface.addHoveredButton(21910, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21911);
        RSInterface.addHoverButton(21912, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21913, 1);
        RSInterface.addHoveredButton(21913, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21914);
        RSInterface.addHoverButton(21915, "Interfaces/LoyaltyS/SPRITE", 7, 113, 44, "Buy", -1, 21916, 1);
        RSInterface.addHoveredButton(21916, "Interfaces/LoyaltyS/SPRITE", 8, 113, 44, 21917);
        RSInterface.addText(21918, "Buy", tda, 0, 15122040, false, true);
        RSInterface.addText(21919, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21920, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21921, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21922, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21923, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21924, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21925, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21926, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21927, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21928, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21929, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21930, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21931, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21932, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21933, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21934, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21935, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21936, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21937, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21938, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21939, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21940, "", tda, 0, 14389248, false, true);
        RSInterface.addText(21941, "", tda, 0, 15122040, false, true);
        RSInterface.addText(21942, "", tda, 0, 14389248, false, true);
        tab.totalChildren(84);
        tab.child(0, 21851, 1, 1);
        tab.child(1, 21852, 475, 9);
        tab.child(2, 21853, 475, 9);
        tab.child(3, 21855, 160, 9);
        tab.child(4, 21856, 300, 9);
        tab.child(5, 21857, 373, 9);
        tab.child(6, 21858, 7, 70);
        tab.child(7, 21859, 7, 70);
        tab.child(8, 21861, 7, 100);
        tab.child(9, 21862, 7, 100);
        tab.child(10, 21864, 7, 130);
        tab.child(11, 21865, 7, 130);
        tab.child(12, 21867, 7, 160);
        tab.child(13, 21868, 7, 160);
        tab.child(14, 21870, 7, 190);
        tab.child(15, 21871, 7, 190);
        tab.child(16, 21873, 7, 220);
        tab.child(17, 21874, 7, 220);
        tab.child(18, 21876, 42, 74);
        tab.child(19, 21877, 42, 104);
        tab.child(20, 21878, 42, 133);
        tab.child(21, 21879, 42, 163);
        tab.child(22, 21880, 42, 193);
        tab.child(23, 21881, 32, 224);
        tab.child(24, 21882, 133, 73);
        tab.child(25, 21883, 133, 73);
        tab.child(26, 21885, 251, 73);
        tab.child(27, 21886, 251, 73);
        tab.child(28, 21888, 369, 73);
        tab.child(29, 21889, 369, 73);
        tab.child(30, 21891, 133, 123);
        tab.child(31, 21892, 133, 123);
        tab.child(32, 21894, 251, 123);
        tab.child(33, 21895, 251, 123);
        tab.child(34, 21897, 369, 123);
        tab.child(35, 21898, 369, 123);
        tab.child(36, 21900, 133, 173);
        tab.child(37, 21901, 133, 173);
        tab.child(38, 21903, 251, 173);
        tab.child(39, 21904, 251, 173);
        tab.child(40, 21906, 369, 173);
        tab.child(41, 21907, 369, 173);
        tab.child(42, 21909, 133, 223);
        tab.child(43, 21910, 133, 223);
        tab.child(44, 21912, 251, 223);
        tab.child(45, 21913, 251, 223);
        tab.child(46, 21915, 369, 223);
        tab.child(47, 21916, 369, 223);
        tab.child(48, 21918, 200, 106);
        tab.child(49, 21918, 200, 156);
        tab.child(50, 21918, 200, 206);
        tab.child(51, 21918, 318, 106);
        tab.child(52, 21918, 318, 156);
        tab.child(53, 21918, 318, 206);
        tab.child(54, 21918, 436, 106);
        tab.child(55, 21918, 436, 156);
        tab.child(56, 21918, 436, 206);
        tab.child(57, 21918, 200, 256);
        tab.child(58, 21918, 318, 256);
        tab.child(59, 21918, 436, 256);
        tab.child(60, 21919, 173, 81);
        tab.child(61, 21920, 173, 92);
        tab.child(62, 21921, 291, 81);
        tab.child(63, 21922, 291, 92);
        tab.child(64, 21923, 409, 81);
        tab.child(65, 21924, 409, 92);
        tab.child(66, 21925, 173, 131);
        tab.child(67, 21926, 173, 142);
        tab.child(68, 21927, 291, 131);
        tab.child(69, 21928, 291, 142);
        tab.child(70, 21929, 409, 131);
        tab.child(71, 21930, 409, 142);
        tab.child(72, 21931, 173, 181);
        tab.child(73, 21932, 173, 192);
        tab.child(74, 21933, 291, 181);
        tab.child(75, 21934, 291, 192);
        tab.child(76, 21935, 409, 181);
        tab.child(77, 21936, 409, 192);
        tab.child(78, 21937, 173, 231);
        tab.child(79, 21938, 173, 242);
        tab.child(80, 21939, 291, 231);
        tab.child(81, 21940, 291, 242);
        tab.child(82, 21941, 409, 231);
        tab.child(83, 21942, 409, 242);
    }

    public static void implingCatching2(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addScreenInterface(32033);
        RSInterface.addSprite(32034, 1, "Interfaces/Impling/BACKGROUND");
        RSInterface.addHoverButton(32035, "Interfaces/Impling/EXIT", 0, 24, 24, "Exit", -1, 32036, 1);
        RSInterface.addHoveredButton(32036, "Interfaces/Impling/EXIT", 1, 24, 24, 32037);
        RSInterface.addText(32038, "Impling Catching", 16751360, false, true, 34, tda, 1);
        RSInterface.addHoverButton(32065, "Interfaces/Impling/BACK", 0, 35, 39, "Next", -1, 32066, 1);
        RSInterface.addHoveredButton(32066, "Interfaces/Impling/BACK", 1, 35, 39, 32067);
        RSInterface.addHoverButton(32041, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32042, 1);
        RSInterface.addHoveredButton(32042, "Interfaces/Impling/OPTION", 1, 85, 22, 32043);
        RSInterface.addText(32044, "Spirit", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32045, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32046, 1);
        RSInterface.addHoveredButton(32046, "Interfaces/Impling/OPTION", 1, 85, 22, 32047);
        RSInterface.addText(32048, "Nature", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32049, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32050, 1);
        RSInterface.addHoveredButton(32050, "Interfaces/Impling/OPTION", 1, 85, 22, 32051);
        RSInterface.addText(32052, "Magpie", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32053, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32054, 1);
        RSInterface.addHoveredButton(32054, "Interfaces/Impling/OPTION", 1, 85, 22, 32055);
        RSInterface.addText(32056, "Ninja", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32057, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32058, 1);
        RSInterface.addHoveredButton(32058, "Interfaces/Impling/OPTION", 1, 85, 22, 32059);
        RSInterface.addText(32060, "Pirate", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32061, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32062, 1);
        RSInterface.addHoveredButton(32062, "Interfaces/Impling/OPTION", 1, 85, 22, 32063);
        RSInterface.addText(32064, "Divine", 16751360, false, true, 20, tda, 1);
        RSInterface.addText(32092, "*New!*", 16751360, false, true, 20, tda, 2);
        RSInterface.addText(32093, "*New!*", 16751360, false, true, 20, tda, 2);
        tab.totalChildren(26);
        tab.child(0, 32034, 1, 1);
        tab.child(1, 32035, 465, 12);
        tab.child(2, 32036, 465, 12);
        tab.child(3, 32038, 205, 19);
        tab.child(4, 32065, 450, 225);
        tab.child(5, 32066, 450, 225);
        tab.child(6, 32041, 96, 79);
        tab.child(7, 32042, 96, 79);
        tab.child(8, 32044, 118, 83);
        tab.child(9, 32045, 96, 146);
        tab.child(10, 32046, 96, 146);
        tab.child(11, 32048, 118, 150);
        tab.child(12, 32049, 96, 213);
        tab.child(13, 32050, 96, 213);
        tab.child(14, 32052, 112, 217);
        tab.child(15, 32053, 312, 79);
        tab.child(16, 32054, 312, 79);
        tab.child(17, 32056, 335, 83);
        tab.child(18, 32057, 312, 146);
        tab.child(19, 32058, 312, 146);
        tab.child(20, 32060, 334, 150);
        tab.child(24, 32092, 405, 150);
        tab.child(21, 32061, 312, 213);
        tab.child(22, 32062, 312, 213);
        tab.child(23, 32064, 335, 217);
        tab.child(25, 32092, 405, 217);
    }

    public static void implingCatching3(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addScreenInterface(32069);
        RSInterface.addSprite(32070, 2, "Interfaces/Impling/BACKGROUND");
        RSInterface.addHoverButton(32071, "Interfaces/Impling/EXIT", 0, 24, 24, "Exit", -1, 32072, 1);
        RSInterface.addHoveredButton(32072, "Interfaces/Impling/EXIT", 1, 24, 24, 32073);
        RSInterface.addText(32074, "Impling Catching", 16751360, false, true, 34, tda, 1);
        RSInterface.addHoverButton(32075, "Interfaces/Impling/BACK", 0, 35, 39, "Next", -1, 32076, 1);
        RSInterface.addHoveredButton(32076, "Interfaces/Impling/BACK", 1, 35, 39, 32077);
        RSInterface.addHoverButton(32078, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32079, 1);
        RSInterface.addHoveredButton(32079, "Interfaces/Impling/OPTION", 1, 85, 22, 32080);
        RSInterface.addText(32081, "Dragon", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32082, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32083, 1);
        RSInterface.addHoveredButton(32083, "Interfaces/Impling/OPTION", 1, 85, 22, 32084);
        RSInterface.addText(32085, "Zombie", 16751360, false, true, 20, tda, 1);
        RSInterface.addHoverButton(32086, "Interfaces/Impling/OPTION", 0, 85, 22, "Choose", -1, 32087, 1);
        RSInterface.addHoveredButton(32087, "Interfaces/Impling/OPTION", 1, 85, 22, 32088);
        RSInterface.addText(32089, "Kingly", 16751360, false, true, 20, tda, 1);
        RSInterface.addText(32090, "*New!*", 16751360, false, true, 20, tda, 2);
        RSInterface.addText(32091, "*New!*", 16751360, false, true, 20, tda, 2);
        tab.totalChildren(17);
        tab.child(0, 32070, 1, 1);
        tab.child(1, 32071, 465, 12);
        tab.child(2, 32072, 465, 12);
        tab.child(3, 32074, 205, 19);
        tab.child(4, 32075, 450, 225);
        tab.child(5, 32076, 450, 225);
        tab.child(6, 32078, 96, 79);
        tab.child(7, 32079, 96, 79);
        tab.child(8, 32081, 118, 83);
        tab.child(9, 32082, 96, 146);
        tab.child(10, 32083, 96, 146);
        tab.child(11, 32085, 118, 151);
        tab.child(12, 32086, 96, 213);
        tab.child(13, 32087, 96, 213);
        tab.child(14, 32089, 118, 217);
        tab.child(15, 32090, 188, 146);
        tab.child(16, 32091, 188, 217);
    }

    public static void staffTab(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addTabInterface(29000);
        RSInterface.addText(29001, "Useful tab", 16751360, false, true, 34, tda, 1);
        RSInterface.addSprite(29002, 94);
        RSInterface.addHoverButton(29003, "Interfaces/stafftab/SPRITE", 2, 160, 32, "Request assistance", -1, 29004, 1);
        RSInterface.addHoveredButton(29004, "Interfaces/stafftab/SPRITE", 3, 160, 32, 29005);
        RSInterface.addHoverButton(29007, "Interfaces/stafftab/SPRITE", 2, 160, 32, "See updates", -1, 29008, 1);
        RSInterface.addHoveredButton(29008, "Interfaces/stafftab/SPRITE", 3, 160, 32, 29009);
        RSInterface.addHoverButton(29011, "Interfaces/stafftab/SPRITE", 2, 160, 32, "Open the website", -1, 29012, 1);
        RSInterface.addHoveredButton(29012, "Interfaces/stafftab/SPRITE", 3, 160, 32, 29013);
        RSInterface.addHoverButton(29014, "Interfaces/stafftab/SPRITE", 2, 160, 32, "Vote for us", -1, 29015, 1);
        RSInterface.addHoveredButton(29015, "Interfaces/stafftab/SPRITE", 3, 160, 32, 29016);
        RSInterface.addHoverButton(29019, "Interfaces/stafftab/SPRITE", 2, 160, 32, "Open the forum", -1, 29020, 1);
        RSInterface.addHoveredButton(29020, "Interfaces/stafftab/SPRITE", 3, 160, 32, 29021);
        RSInterface.addHoverButton(29023, "Interfaces/stafftab/SPRITE", 2, 160, 32, "Open teleport interface", -1, 29024, 1);
        RSInterface.addHoveredButton(29024, "Interfaces/stafftab/SPRITE", 3, 160, 32, 29025);
        RSInterface.addText(29006, "Call a staff", 16751360, false, true, 34, tda, 1);
        RSInterface.addText(29010, "Latest Updates", 16751360, false, true, 34, tda, 1);
        RSInterface.addText(29017, "Website", 16751360, false, true, 34, tda, 1);
        RSInterface.addText(29018, "Vote for us", 16751360, false, true, 34, tda, 1);
        RSInterface.addText(29022, "Forums", 16751360, false, true, 34, tda, 1);
        RSInterface.addText(29026, "Custom Teleports", 16751360, false, true, 34, tda, 1);
        int xModifier = 15;
        int yModifier = 40;
        tab.totalChildren(20);
        tab.child(0, 29001, 49, 4);
        tab.child(1, 29002, 0, 22);
        tab.child(2, 29023, xModifier, 26);
        tab.child(3, 29024, xModifier, 26);
        tab.child(4, 29019, xModifier, 26 + yModifier);
        tab.child(5, 29020, xModifier, 26 + yModifier);
        tab.child(6, 29014, xModifier, 26 + yModifier + yModifier);
        tab.child(7, 29015, xModifier, 26 + yModifier + yModifier);
        tab.child(8, 29011, xModifier, 26 + yModifier + yModifier + yModifier);
        tab.child(9, 29012, xModifier, 26 + yModifier + yModifier + yModifier);
        tab.child(10, 29007, xModifier, 26 + yModifier + yModifier + yModifier + yModifier);
        tab.child(11, 29008, xModifier, 26 + yModifier + yModifier + yModifier + yModifier);
        tab.child(12, 29003, xModifier, 26 + yModifier + yModifier + yModifier + yModifier + yModifier);
        tab.child(13, 29004, xModifier, 26 + yModifier + yModifier + yModifier + yModifier + yModifier);
        tab.child(14, 29026, 52, 34);
        tab.child(15, 29022, 52, 34 + yModifier);
        tab.child(16, 29018, 52, 34 + yModifier + yModifier);
        tab.child(17, 29017, 52, 34 + yModifier + yModifier + yModifier);
        tab.child(18, 29010, 52, 34 + yModifier + yModifier + yModifier + yModifier);
        tab.child(19, 29006, 59, 34 + yModifier + yModifier + yModifier + yModifier + yModifier);
    }

    public static void addTextButton(int i, String s, String tooltip, boolean centerText, TextDrawingArea[] TDA, int textDrawingAreaIndex, int textWidth, int colorValue) {
        RSInterface rsinterface = RSInterface.addInterface(i);
        rsinterface.parentID = i;
        rsinterface.id = i;
        rsinterface.type = 4;
        rsinterface.atActionType = 1;
        rsinterface.width = textWidth;
        rsinterface.height = 18;
        rsinterface.contentType = 0;
        rsinterface.opacity = 16750623;
        rsinterface.center = centerText;
        rsinterface.textDrawingAreas = TDA[0];
        rsinterface.textDrawingAreas = TDA[textDrawingAreaIndex];
        rsinterface.message = s;
        rsinterface.tooltip = tooltip;
        rsinterface.textColor = colorValue;
    }

    public static void lotteryItem(int i) {
        RSInterface rsinterface = RSInterface.interfaceCache[i] = new RSInterface();
        rsinterface.itemActions = new String[5];
        rsinterface.spritesX = new int[36];
        rsinterface.invStackSizes = new int[36];
        rsinterface.customName = new String[36];
        rsinterface.inv = new int[36];
        rsinterface.spritesY = new int[36];
        rsinterface.children = new int[0];
        rsinterface.childX = new int[0];
        rsinterface.childY = new int[0];
        rsinterface.spritesY[0] = 0;
        rsinterface.spritesY[1] = 0;
        rsinterface.spritesY[2] = 0;
        rsinterface.spritesY[3] = 0;
        rsinterface.spritesY[4] = 0;
        rsinterface.spritesY[5] = 0;
        rsinterface.spritesY[6] = 0;
        rsinterface.spritesY[7] = 0;
        rsinterface.spritesY[8] = 0;
        rsinterface.spritesY[9] = 0;
        rsinterface.spritesY[10] = 0;
        rsinterface.spritesY[11] = 0;
        rsinterface.spritesY[12] = 0;
        rsinterface.spritesY[13] = 0;
        rsinterface.spritesY[14] = 0;
        rsinterface.spritesY[15] = 0;
        rsinterface.spritesY[16] = 0;
        rsinterface.spritesY[17] = 0;
        rsinterface.spritesY[18] = 0;
        rsinterface.spritesY[19] = 0;
        rsinterface.spritesY[20] = 0;
        rsinterface.spritesY[21] = 0;
        rsinterface.spritesY[22] = 0;
        rsinterface.spritesY[23] = 0;
        rsinterface.spritesY[24] = 0;
        rsinterface.spritesY[25] = 0;
        rsinterface.spritesY[26] = 0;
        rsinterface.spritesY[27] = 0;
        rsinterface.spritesY[28] = 0;
        rsinterface.spritesY[29] = 0;
        rsinterface.spritesY[30] = 0;
        rsinterface.spritesY[31] = 0;
        rsinterface.spritesY[32] = 0;
        rsinterface.spritesY[33] = 0;
        rsinterface.spritesY[34] = 0;
        rsinterface.spritesY[35] = 0;
        rsinterface.invStackSizes[0] = 0;
        rsinterface.invStackSizes[1] = 0;
        rsinterface.invStackSizes[2] = 0;
        rsinterface.invStackSizes[3] = 0;
        rsinterface.invStackSizes[4] = 0;
        rsinterface.invStackSizes[5] = 0;
        rsinterface.invStackSizes[6] = 0;
        rsinterface.invStackSizes[7] = 0;
        rsinterface.invStackSizes[8] = 0;
        rsinterface.invStackSizes[9] = 0;
        rsinterface.invStackSizes[10] = 0;
        rsinterface.invStackSizes[11] = 0;
        rsinterface.invStackSizes[12] = 0;
        rsinterface.invStackSizes[13] = 0;
        rsinterface.invStackSizes[14] = 0;
        rsinterface.invStackSizes[15] = 0;
        rsinterface.invStackSizes[16] = 0;
        rsinterface.invStackSizes[17] = 0;
        rsinterface.invStackSizes[18] = 0;
        rsinterface.invStackSizes[19] = 0;
        rsinterface.invStackSizes[20] = 0;
        rsinterface.invStackSizes[21] = 0;
        rsinterface.invStackSizes[22] = 0;
        rsinterface.invStackSizes[23] = 0;
        rsinterface.invStackSizes[24] = 0;
        rsinterface.invStackSizes[25] = 0;
        rsinterface.invStackSizes[26] = 0;
        rsinterface.invStackSizes[27] = 0;
        rsinterface.invStackSizes[28] = 0;
        rsinterface.invStackSizes[29] = 0;
        rsinterface.invStackSizes[30] = 0;
        rsinterface.invStackSizes[31] = 0;
        rsinterface.invStackSizes[32] = 0;
        rsinterface.invStackSizes[33] = 0;
        rsinterface.invStackSizes[34] = 0;
        rsinterface.invStackSizes[35] = 0;
        rsinterface.inv[0] = 0;
        rsinterface.inv[1] = 0;
        rsinterface.inv[2] = 0;
        rsinterface.inv[3] = 0;
        rsinterface.inv[4] = 0;
        rsinterface.inv[5] = 0;
        rsinterface.inv[6] = 0;
        rsinterface.inv[7] = 0;
        rsinterface.inv[8] = 0;
        rsinterface.inv[9] = 0;
        rsinterface.inv[10] = 0;
        rsinterface.inv[11] = 0;
        rsinterface.inv[12] = 0;
        rsinterface.inv[13] = 0;
        rsinterface.inv[14] = 0;
        rsinterface.inv[15] = 0;
        rsinterface.inv[16] = 0;
        rsinterface.inv[17] = 0;
        rsinterface.inv[18] = 0;
        rsinterface.inv[19] = 0;
        rsinterface.inv[20] = 0;
        rsinterface.inv[21] = 0;
        rsinterface.inv[22] = 0;
        rsinterface.inv[23] = 0;
        rsinterface.inv[24] = 0;
        rsinterface.inv[25] = 0;
        rsinterface.inv[26] = 0;
        rsinterface.inv[27] = 0;
        rsinterface.inv[28] = 0;
        rsinterface.inv[29] = 0;
        rsinterface.inv[30] = 0;
        rsinterface.inv[31] = 0;
        rsinterface.inv[32] = 0;
        rsinterface.inv[33] = 0;
        rsinterface.inv[34] = 0;
        rsinterface.inv[35] = 0;
        rsinterface.spritesX[0] = 0;
        rsinterface.spritesX[1] = 0;
        rsinterface.spritesX[2] = 0;
        rsinterface.spritesX[3] = 0;
        rsinterface.spritesX[4] = 0;
        rsinterface.spritesX[5] = 0;
        rsinterface.spritesX[6] = 0;
        rsinterface.spritesX[7] = 0;
        rsinterface.spritesX[8] = 0;
        rsinterface.spritesX[9] = 0;
        rsinterface.spritesX[10] = 0;
        rsinterface.spritesX[11] = 0;
        rsinterface.spritesX[12] = 0;
        rsinterface.spritesX[13] = 0;
        rsinterface.spritesX[14] = 0;
        rsinterface.spritesX[15] = 0;
        rsinterface.spritesX[16] = 0;
        rsinterface.spritesX[17] = 0;
        rsinterface.spritesX[18] = 0;
        rsinterface.spritesX[19] = 0;
        rsinterface.spritesX[20] = 0;
        rsinterface.spritesX[21] = 0;
        rsinterface.spritesX[22] = 0;
        rsinterface.spritesX[23] = 0;
        rsinterface.spritesX[24] = 0;
        rsinterface.spritesX[25] = 0;
        rsinterface.spritesX[26] = 0;
        rsinterface.spritesX[27] = 0;
        rsinterface.spritesX[28] = 0;
        rsinterface.spritesX[29] = 0;
        rsinterface.spritesX[30] = 0;
        rsinterface.spritesX[31] = 0;
        rsinterface.spritesX[32] = 0;
        rsinterface.spritesX[33] = 0;
        rsinterface.spritesX[34] = 0;
        rsinterface.spritesX[35] = 0;
        rsinterface.center = false;
        rsinterface.aBoolean227 = false;
        rsinterface.aBoolean235 = false;
        rsinterface.usableItemInterface = false;
        rsinterface.isInventoryInterface = false;
        rsinterface.usableItemInterface = false;
        rsinterface.aBoolean259 = true;
        rsinterface.isMouseoverTriggered = false;
        rsinterface.textShadow = false;
        rsinterface.width = 8;
        rsinterface.mOverInterToTrigger = -1;
        rsinterface.invSpritePadX = 24;
        rsinterface.parentID = 17827;
        rsinterface.invSpritePadY = 24;
        rsinterface.id = 17824;
        rsinterface.type = 2;
        rsinterface.height = 4;
    }

    public static void LodestoneNetwork(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addTabInterface(26200);
        RSInterface.addSprite(26201, 0, "Hack3r/Lodestones/Main");
        RSInterface.addHoverButton(26202, "Hack3r/Lodestones/Unlock", 14, 40, 40, "Lunar Isle", 250, 26203, 5);
        RSInterface.addHoveredButton(26203, "Hack3r/Lodestones/UnlockHover", 14, 50, 50, 26204);
        RSInterface.addHoverButton(26205, "Hack3r/Lodestones/Unlock", 0, 40, 40, "Lumbridge", 250, 26206, 5);
        RSInterface.addHoveredButton(26206, "Hack3r/Lodestones/UnlockHover", 0, 50, 50, 26207);
        RSInterface.addHoverButton(26208, "Hack3r/Lodestones/Unlock", 5, 40, 40, "Burthorpe", 250, 26209, 5);
        RSInterface.addHoveredButton(26209, "Hack3r/Lodestones/UnlockHover", 5, 50, 50, 26210);
        RSInterface.addHoverButton(26211, "Hack3r/Lodestones/Unlock", 13, 40, 40, "Bandit Camp", 250, 26212, 5);
        RSInterface.addHoveredButton(26212, "Hack3r/Lodestones/UnlockHover", 13, 50, 50, 26213);
        RSInterface.addHoverButton(26214, "Hack3r/Lodestones/Unlock", 4, 40, 40, "Taverley", 250, 26215, 5);
        RSInterface.addHoveredButton(26215, "Hack3r/Lodestones/UnlockHover", 4, 50, 50, 26216);
        RSInterface.addHoverButton(26217, "Hack3r/Lodestones/Unlock", 12, 40, 40, "Al Kharid", 250, 26218, 5);
        RSInterface.addHoveredButton(26218, "Hack3r/Lodestones/UnlockHover", 12, 50, 50, 26219);
        RSInterface.addHoverButton(26220, "Hack3r/Lodestones/Unlock", 1, 40, 40, "Varrock", 250, 26221, 5);
        RSInterface.addHoveredButton(26221, "Hack3r/Lodestones/UnlockHover", 1, 50, 50, 26222);
        RSInterface.addHoverButton(26223, "Hack3r/Lodestones/Unlock", 11, 40, 40, "Edgeville", 250, 26224, 5);
        RSInterface.addHoveredButton(26224, "Hack3r/Lodestones/UnlockHover", 11, 50, 50, 26225);
        RSInterface.addHoverButton(26226, "Hack3r/Lodestones/Unlock", 2, 40, 40, "Falador", 250, 26227, 5);
        RSInterface.addHoveredButton(26227, "Hack3r/Lodestones/UnlockHover", 2, 50, 50, 26228);
        RSInterface.addHoverButton(26229, "Hack3r/Lodestones/Unlock", 8, 40, 40, "Port Sarim", 250, 26230, 5);
        RSInterface.addHoveredButton(26230, "Hack3r/Lodestones/UnlockHover", 8, 50, 50, 26231);
        RSInterface.addHoverButton(26232, "Hack3r/Lodestones/Unlock", 9, 40, 40, "Draynor Village", 250, 26233, 5);
        RSInterface.addHoveredButton(26233, "Hack3r/Lodestones/UnlockHover", 9, 50, 50, 26234);
        RSInterface.addHoverButton(26235, "Hack3r/Lodestones/Unlock", 3, 40, 40, "Ardougne", 250, 26236, 5);
        RSInterface.addHoveredButton(26236, "Hack3r/Lodestones/UnlockHover", 3, 50, 50, 26237);
        RSInterface.addHoverButton(26238, "Hack3r/Lodestones/Unlock", 6, 40, 40, "Catherby", 250, 26239, 5);
        RSInterface.addHoveredButton(26239, "Hack3r/Lodestones/UnlockHover", 6, 50, 50, 26240);
        RSInterface.addHoverButton(26241, "Hack3r/Lodestones/Unlock", 10, 40, 40, "Yanille", 250, 26242, 5);
        RSInterface.addHoveredButton(26242, "Hack3r/Lodestones/UnlockHover", 10, 50, 50, 26243);
        RSInterface.addHoverButton(26244, "Hack3r/Lodestones/Unlock", 7, 40, 40, "Seers' Village", 250, 26245, 5);
        RSInterface.addHoveredButton(26245, "Hack3r/Lodestones/UnlockHover", 7, 50, 50, 26246);
        RSInterface.addHoverButton(26247, "Hack3r/Lodestones/Close", 0, 26, 26, "Seers' Village", 250, 26248, 3);
        RSInterface.addHoveredButton(26248, "Hack3r/Lodestones/Close", 1, 26, 26, 26249);
        tab.totalChildren(33);
        tab.child(0, 26201, 6, 18);
        tab.child(1, 26202, 30, 53);
        tab.child(2, 26203, 25, 48);
        tab.child(3, 26205, 302, 217);
        tab.child(4, 26206, 297, 212);
        tab.child(5, 26208, 230, 120);
        tab.child(6, 26209, 225, 115);
        tab.child(7, 26211, 300, 270);
        tab.child(8, 26212, 295, 265);
        tab.child(9, 26214, 230, 155);
        tab.child(10, 26215, 225, 150);
        tab.child(11, 26217, 340, 200);
        tab.child(12, 26218, 335, 195);
        tab.child(13, 26220, 322, 162);
        tab.child(14, 26221, 317, 157);
        tab.child(15, 26223, 275, 130);
        tab.child(16, 26224, 270, 125);
        tab.child(17, 26226, 256, 181);
        tab.child(18, 26227, 251, 176);
        tab.child(19, 26229, 260, 235);
        tab.child(20, 26230, 255, 230);
        tab.child(21, 26232, 287, 182);
        tab.child(22, 26233, 282, 177);
        tab.child(23, 26235, 145, 185);
        tab.child(24, 26236, 140, 180);
        tab.child(25, 26238, 200, 157);
        tab.child(26, 26239, 195, 153);
        tab.child(27, 26241, 135, 240);
        tab.child(28, 26242, 130, 235);
        tab.child(29, 26244, 172, 135);
        tab.child(30, 26245, 167, 130);
        tab.child(31, 26247, 480, 21);
        tab.child(32, 26248, 480, 21);
    }

    public static void SquealOfFortune(TextDrawingArea[] atextdrawingarea) {
        RSInterface rsinterface = RSInterface.addTabInterface(48500);
        RSInterface.addSprite(48501, 0, "SquealOfFortune/BG");
        RSInterface.addHoverButton(48502, "SquealOfFortune/SPRITE", 0, 156, 62, "Open Squeal of Fortune", -1, 48503, 1);
        RSInterface.addHoveredButton(48503, "SquealOfFortune/SPRITE", 1, 156, 62, 48504);
        RSInterface.addHoverButton(48505, "SquealOfFortune/SPRITE", 0, 156, 62, "Buy Spins", -1, 48506, 1);
        RSInterface.addHoveredButton(48506, "SquealOfFortune/SPRITE", 2, 156, 62, 48507);
        RSInterface.addText(48508, "", 14929103, true, true, 52, 2);
        RSInterface.setChildren(6, rsinterface);
        RSInterface.setBounds(48501, 8, 0, 0, rsinterface);
        RSInterface.setBounds(48502, 25, 81, 1, rsinterface);
        RSInterface.setBounds(48503, 25, 81, 2, rsinterface);
        RSInterface.setBounds(48505, 25, 149, 3, rsinterface);
        RSInterface.setBounds(48506, 25, 149, 4, rsinterface);
        RSInterface.setBounds(48508, 102, 241, 5, rsinterface);
    }

    public static void extraEquipment(TextDrawingArea[] TDA) {
        RSInterface rsinterface = RSInterface.addTabInterface(27720);
        RSInterface.addSprite(27734, 93);
        RSInterface.addSprite(27748, 94);
        RSInterface.addSprite(27721, 24);
        RSInterface.addSprite(27722, 25);
        RSInterface.addSprite(27723, 26);
        RSInterface.addSprite(27727, 33);
        RSInterface.addText(27747, "Donor tab", 16751360, false, true, 34, TDA, 1);
        RSInterface.addHoverButton(27735, 95, 24, 24, "Exit", -1, 27736, 1);
        RSInterface.addHoveredButton(27736, 96, 24, 24, 27737);
        RSInterface.addHoverButton(27738, 97, 160, 32, "Go to", -1, 27739, 1);
        RSInterface.addHoveredButton(27739, 98, 160, 32, 27740);
        RSInterface.addHoverButton(27741, 97, 160, 32, "Go to", -1, 27742, 1);
        RSInterface.addHoveredButton(27742, 98, 160, 32, 27743);
        RSInterface.addHoverButton(27744, 97, 160, 32, "Go to", -1, 27745, 1);
        RSInterface.addHoveredButton(27745, 98, 160, 32, 27746);
        RSInterface.addHoverButton(27749, 97, 160, 32, "Go to", -1, 27750, 1);
        RSInterface.addHoveredButton(27750, 98, 160, 32, 27751);
        RSInterface.addText(27724, "Donor Zone", 16751360, false, true, 34, TDA, 1);
        RSInterface.addText(27725, "Extreme Donor Zone", 16751360, false, true, 34, TDA, 1);
        RSInterface.addText(27726, "V.I.P Zone", 16751360, false, true, 34, TDA, 1);
        RSInterface.addText(27728, "Sponsor Zone", 16751360, false, true, 34, TDA, 1);
        rsinterface.totalChildren(21);
        rsinterface.child(0, 27734, 0, 30);
        rsinterface.child(1, 27748, 0, 30);
        rsinterface.child(2, 27747, 35, 10);
        rsinterface.child(3, 27735, 155, 6);
        rsinterface.child(4, 27736, 155, 6);
        rsinterface.child(5, 27738, 15, 55);
        rsinterface.child(6, 27739, 15, 55);
        rsinterface.child(7, 27741, 15, 95);
        rsinterface.child(8, 27742, 15, 95);
        rsinterface.child(9, 27744, 15, 135);
        rsinterface.child(10, 27745, 15, 135);
        rsinterface.child(11, 27721, 145, 65);
        rsinterface.child(12, 27722, 145, 105);
        rsinterface.child(13, 27723, 145, 145);
        rsinterface.child(14, 27724, 25, 65);
        rsinterface.child(15, 27725, 25, 105);
        rsinterface.child(16, 27726, 25, 145);
        rsinterface.child(17, 27749, 15, 175);
        rsinterface.child(18, 27750, 15, 175);
        rsinterface.child(19, 27727, 145, 185);
        rsinterface.child(20, 27728, 25, 185);
    }

    public static void NewSkillLamp(TextDrawingArea[] paramArrayOfTextDrawingArea) {
        RSInterface localRSInterface = RSInterface.addTabInterface(35000);
        RSInterface.setChildren(61, localRSInterface);
        RSInterface.addSprite(35001, 0, "hack3r/NewSkillLamp/BACKGROUND");
        RSInterface.addHover(35002, 3, 0, 35003, 0, "hack3r/NewSkillLamp/EXIT", 21, 21, "Exit");
        RSInterface.addHovered(35003, 1, "hack3r/NewSkillLamp/EXIT", 21, 21, 35004);
        RSInterface.addSprite(35005, 0, "hack3r/NewSkillLamp/BANNER");
        RSInterface.addText(35006, "Choose XP Type...", paramArrayOfTextDrawingArea, 1, 14929103, true, true);
        RSInterface.addHoverButton(35007, "", 0, 46, 44, "Choose Attack", -1, 35008, 1);
        RSInterface.addHoveredButton(35008, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35009);
        RSInterface.addHoverButton(35010, "", 0, 46, 44, "Choose Magic", -1, 35011, 1);
        RSInterface.addHoveredButton(35011, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35012);
        RSInterface.addHoverButton(35013, "", 0, 46, 44, "Choose Mining", -1, 35014, 1);
        RSInterface.addHoveredButton(35014, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35015);
        RSInterface.addHoverButton(35016, "", 0, 46, 44, "Choose Woodcutting", -1, 35017, 1);
        RSInterface.addHoveredButton(35017, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35018);
        RSInterface.addHoverButton(35019, "", 0, 46, 44, "Choose Agility", -1, 35020, 1);
        RSInterface.addHoveredButton(35020, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35021);
        RSInterface.addHoverButton(35022, "", 0, 46, 44, "Choose Fletching", -1, 35023, 1);
        RSInterface.addHoveredButton(35023, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35024);
        RSInterface.addHoverButton(35025, "", 0, 46, 44, "Choose Thieving", -1, 35026, 1);
        RSInterface.addHoveredButton(35026, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35027);
        RSInterface.addHoverButton(35028, "", 0, 46, 44, "Choose Strength", -1, 35029, 1);
        RSInterface.addHoveredButton(35029, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35030);
        RSInterface.addHoverButton(35031, "", 0, 46, 44, "Choose Ranged", -1, 35032, 1);
        RSInterface.addHoveredButton(35032, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35033);
        RSInterface.addHoverButton(35034, "", 0, 46, 44, "Choose Smithing", -1, 35035, 1);
        RSInterface.addHoveredButton(35035, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35036);
        RSInterface.addHoverButton(35037, "", 0, 46, 44, "Choose Firemaking", -1, 35038, 1);
        RSInterface.addHoveredButton(35038, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35039);
        RSInterface.addHoverButton(35040, "", 0, 46, 44, "Choose Herblore", -1, 35041, 1);
        RSInterface.addHoveredButton(35041, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35042);
        RSInterface.addHoverButton(35043, "", 0, 46, 44, "Choose Slayer", -1, 35044, 1);
        RSInterface.addHoveredButton(35044, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35045);
        RSInterface.addHoverButton(35046, "", 0, 46, 44, "Choose Construction", -1, 35047, 1);
        RSInterface.addHoveredButton(35047, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35048);
        RSInterface.addHoverButton(35049, "", 0, 46, 44, "Choose Defence", -1, 35050, 1);
        RSInterface.addHoveredButton(35050, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35051);
        RSInterface.addHoverButton(35052, "", 0, 46, 44, "Choose Prayer", -1, 35053, 1);
        RSInterface.addHoveredButton(35053, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35054);
        RSInterface.addHoverButton(35055, "", 0, 46, 44, "Choose Fishing", -1, 35056, 1);
        RSInterface.addHoveredButton(35056, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35057);
        RSInterface.addHoverButton(35058, "", 0, 46, 44, "Choose Crafting", -1, 35059, 1);
        RSInterface.addHoveredButton(35059, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35060);
        RSInterface.addHoverButton(35061, "", 0, 46, 44, "Choose Farming", -1, 35062, 1);
        RSInterface.addHoveredButton(35062, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35063);
        RSInterface.addHoverButton(35064, "", 0, 46, 44, "Choose Hunter", -1, 35065, 1);
        RSInterface.addHoveredButton(35065, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35066);
        RSInterface.addHoverButton(35067, "", 0, 46, 44, "Choose Summoning", -1, 35068, 1);
        RSInterface.addHoveredButton(35068, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35069);
        RSInterface.addHoverButton(35070, "", 0, 46, 44, "Choose Constitution", -1, 35071, 1);
        RSInterface.addHoveredButton(35071, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35072);
        RSInterface.addHoverButton(35073, "", 0, 46, 44, "Choose Dungeoneering", -1, 35074, 1);
        RSInterface.addHoveredButton(35074, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35075);
        RSInterface.addHoverButton(35076, "", 0, 46, 44, "Choose Cooking", -1, 35077, 1);
        RSInterface.addHoveredButton(35077, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35078);
        RSInterface.addHoverButton(35079, "", 0, 46, 44, "Choose Runecrafting", -1, 35080, 1);
        RSInterface.addHoveredButton(35080, "hack3r/NewSkillLamp/CIRCLE", 1, 46, 44, 35081);
        RSInterface.addHover(35082, 3, 0, 35083, 0, "hack3r/NewSkillLamp/CANCEL", 127, 21, "");
        RSInterface.addHovered(35083, 1, "hack3r/NewSkillLamp/CANCEL", 127, 21, 35084);
        RSInterface.addHoverButton(35085, "hack3r/NewSkillLamp/CONFIRM", 0, 127, 21, "Confirm", -1, 35086, 1);
        RSInterface.addHoveredButton(35086, "hack3r/NewSkillLamp/CONFIRM", 1, 127, 21, 35087);
        RSInterface.addText(35088, "Confirm", paramArrayOfTextDrawingArea, 1, 14929103, false, true);
        RSInterface.addText(35089, "Not right now", paramArrayOfTextDrawingArea, 1, 14929103, false, true);
        RSInterface.setBounds(35001, 10, 14, 0, localRSInterface);
        RSInterface.setBounds(35002, 470, 20, 1, localRSInterface);
        RSInterface.setBounds(35003, 470, 20, 2, localRSInterface);
        RSInterface.setBounds(35005, 181, 48, 3, localRSInterface);
        RSInterface.setBounds(35006, 255, 52, 4, localRSInterface);
        RSInterface.setBounds(35007, 37, 80, 5, localRSInterface);
        RSInterface.setBounds(35008, 37, 80, 6, localRSInterface);
        RSInterface.setBounds(35010, 102, 80, 7, localRSInterface);
        RSInterface.setBounds(35011, 102, 80, 8, localRSInterface);
        RSInterface.setBounds(35013, 167, 80, 9, localRSInterface);
        RSInterface.setBounds(35014, 167, 80, 10, localRSInterface);
        RSInterface.setBounds(35016, 232, 80, 11, localRSInterface);
        RSInterface.setBounds(35017, 232, 80, 12, localRSInterface);
        RSInterface.setBounds(35019, 297, 80, 13, localRSInterface);
        RSInterface.setBounds(35020, 297, 80, 14, localRSInterface);
        RSInterface.setBounds(35022, 362, 80, 15, localRSInterface);
        RSInterface.setBounds(35023, 362, 80, 16, localRSInterface);
        RSInterface.setBounds(35025, 427, 80, 17, localRSInterface);
        RSInterface.setBounds(35026, 427, 80, 18, localRSInterface);
        RSInterface.setBounds(35028, 37, 138, 19, localRSInterface);
        RSInterface.setBounds(35029, 37, 138, 20, localRSInterface);
        RSInterface.setBounds(35031, 102, 138, 21, localRSInterface);
        RSInterface.setBounds(35032, 102, 138, 22, localRSInterface);
        RSInterface.setBounds(35034, 167, 138, 23, localRSInterface);
        RSInterface.setBounds(35035, 167, 138, 24, localRSInterface);
        RSInterface.setBounds(35037, 232, 138, 25, localRSInterface);
        RSInterface.setBounds(35038, 232, 138, 26, localRSInterface);
        RSInterface.setBounds(35040, 297, 138, 27, localRSInterface);
        RSInterface.setBounds(35041, 297, 138, 28, localRSInterface);
        RSInterface.setBounds(35043, 362, 138, 29, localRSInterface);
        RSInterface.setBounds(35044, 362, 138, 30, localRSInterface);
        RSInterface.setBounds(35046, 427, 138, 31, localRSInterface);
        RSInterface.setBounds(35047, 427, 138, 32, localRSInterface);
        RSInterface.setBounds(35049, 37, 196, 33, localRSInterface);
        RSInterface.setBounds(35050, 37, 196, 34, localRSInterface);
        RSInterface.setBounds(35052, 102, 196, 35, localRSInterface);
        RSInterface.setBounds(35053, 102, 196, 36, localRSInterface);
        RSInterface.setBounds(35055, 167, 196, 37, localRSInterface);
        RSInterface.setBounds(35056, 167, 196, 38, localRSInterface);
        RSInterface.setBounds(35058, 232, 196, 39, localRSInterface);
        RSInterface.setBounds(35059, 232, 196, 40, localRSInterface);
        RSInterface.setBounds(35061, 297, 196, 41, localRSInterface);
        RSInterface.setBounds(35062, 297, 196, 42, localRSInterface);
        RSInterface.setBounds(35064, 362, 196, 43, localRSInterface);
        RSInterface.setBounds(35065, 362, 196, 44, localRSInterface);
        RSInterface.setBounds(35067, 427, 196, 45, localRSInterface);
        RSInterface.setBounds(35068, 427, 196, 46, localRSInterface);
        RSInterface.setBounds(35070, 37, 254, 47, localRSInterface);
        RSInterface.setBounds(35071, 37, 254, 48, localRSInterface);
        RSInterface.setBounds(35073, 102, 254, 49, localRSInterface);
        RSInterface.setBounds(35074, 102, 254, 50, localRSInterface);
        RSInterface.setBounds(35076, 167, 254, 51, localRSInterface);
        RSInterface.setBounds(35077, 167, 254, 52, localRSInterface);
        RSInterface.setBounds(35079, 232, 254, 53, localRSInterface);
        RSInterface.setBounds(35080, 232, 254, 54, localRSInterface);
        RSInterface.setBounds(35082, 322, 280, 55, localRSInterface);
        RSInterface.setBounds(35083, 322, 280, 56, localRSInterface);
        RSInterface.setBounds(35085, 322, 250, 57, localRSInterface);
        RSInterface.setBounds(35086, 322, 250, 58, localRSInterface);
        RSInterface.setBounds(35088, 360, 253, 59, localRSInterface);
        RSInterface.setBounds(35089, 350, 283, 60, localRSInterface);
    }

    public static void settingsInterface(TextDrawingArea[] TDA) {
        RSInterface rsinterface = RSInterface.addTabInterface(26000);
        int x = 168;
        int y = 49;
        RSInterface.addSprite(26001, 0, "interfaces/settings/base");
        RSInterface.addText(26002, "More Options", 14983494, true, true, 52, 2);
        RSInterface.addInAreaHover(26003, "interfaces/summoning/creation/close", 0, 1, 16, 16, "Close", 250, 3);
        RSInterface.addText(26004, "Use the new function keys,\\nuntick to use old.", 14983494, false, true, 52, 0);
        RSInterface.addSprite(26005, 0, "interfaces/settings/split");
        RSInterface.addSprite(26011, 1, "interfaces/settings/split");
        RSInterface.addText(26006, "Use the new style health\\nbars, untick to use old.", 14983494, false, true, 52, 0);
        RSInterface.addText(26009, "Display the new x10 style\\ndamage, untick to use old.", 14983494, false, true, 52, 0);
        RSInterface.addButton(26007, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "Toggle function keys", 650, 1);
        RSInterface.addButton(26008, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "Toggle halth bars", 651, 1);
        RSInterface.addButton(26010, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "Toggle x10 damage", 652, 1);
        RSInterface.addText(26012, "Display Yell messages,\\nshow and hide yell.", 14983494, false, true, 52, 0);
        RSInterface.addText(26013, "Display Yell extras,\\nshow and hide extras.", 14983494, false, true, 52, 0);
        RSInterface.addText(26014, "Display Yell Level,\\ntoggle [Level] & [KC].", 14983494, false, true, 52, 0);
        RSInterface.addButton(26015, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "Toggle Yell", 654, 1);
        RSInterface.addButton(26016, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "Toggle Yell Extras", 655, 1);
        RSInterface.addButton(26017, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "Toggle Level", 656, 1);
        RSInterface.addText(26018, "Yell Assistance\\n", 14983494, false, true, 52, 0);
        RSInterface.addButton(26019, 4, -1, 2, 3, "interfaces/settings/click", 15, 15, "Toggle Yell Assistance", 657, 1);
        RSInterface.setChildren(31, rsinterface);
        int i = 0;
        RSInterface.setBounds(26001, x + 0, y + 0, i++, rsinterface);
        RSInterface.setBounds(26002, x + 89, y + 3, i++, rsinterface);
        RSInterface.setBounds(26003, x + 151, y + 3, i++, rsinterface);
        RSInterface.setBounds(26004, x + 9, y + 25, i++, rsinterface);
        RSInterface.setBounds(26006, x + 9, y + 57, i++, rsinterface);
        RSInterface.setBounds(26007, x + 154, y + 29, i++, rsinterface);
        RSInterface.setBounds(26008, x + 154, y + 61, i++, rsinterface);
        RSInterface.setBounds(26009, x + 9, y + 89, i++, rsinterface);
        RSInterface.setBounds(26005, x + 7, y + 115, i++, rsinterface);
        RSInterface.setBounds(26010, x + 154, y + 93, i++, rsinterface);
        RSInterface.setBounds(26005, x + 7, y + 51, i++, rsinterface);
        RSInterface.setBounds(26005, x + 7, y + 83, i++, rsinterface);
        RSInterface.setBounds(26005, x + 7, y + 115, i++, rsinterface);
        RSInterface.setBounds(26005, x + 7, y + 147, i++, rsinterface);
        RSInterface.setBounds(26005, x + 7, y + 179, i++, rsinterface);
        RSInterface.setBounds(26005, x + 7, y + 211, i++, rsinterface);
        RSInterface.setBounds(26011, x + 151, y + 22, i++, rsinterface);
        RSInterface.setBounds(26011, x + 151, y + 54, i++, rsinterface);
        RSInterface.setBounds(26011, x + 151, y + 86, i++, rsinterface);
        RSInterface.setBounds(26011, x + 151, y + 118, i++, rsinterface);
        RSInterface.setBounds(26011, x + 151, y + 150, i++, rsinterface);
        RSInterface.setBounds(26011, x + 151, y + 182, i++, rsinterface);
        RSInterface.setBounds(26011, x + 151, y + 214, i++, rsinterface);
        RSInterface.setBounds(26012, x + 9, y + 121, i++, rsinterface);
        RSInterface.setBounds(26013, x + 9, y + 153, i++, rsinterface);
        RSInterface.setBounds(26014, x + 9, y + 185, i++, rsinterface);
        RSInterface.setBounds(26015, x + 154, y + 125, i++, rsinterface);
        RSInterface.setBounds(26016, x + 154, y + 157, i++, rsinterface);
        RSInterface.setBounds(26017, x + 154, y + 189, i++, rsinterface);
        RSInterface.setBounds(26018, x + 9, y + 217, i++, rsinterface);
        RSInterface.setBounds(26019, x + 154, y + 221, i++, rsinterface);
    }

    public static void newLamp(TextDrawingArea[] tda) {
        RSInterface rsinterface = RSInterface.addTabInterface(52000);
        RSInterface.addSprite(52001, 1, "Interfaces/Lamp/lamp");
        RSInterface.addButton(52002, 1, "Interfaces/Lamp/X", "Exit");
        RSInterface.addHoverButton(52003, "Interfaces/Lamp/lamp", 2, 74, 22, "Confirm", -1, 52004, 1);
        RSInterface.addHoveredButton(52004, "Interfaces/Lamp/lamp", 3, 74, 22, 52005);
        RSInterface.addButton(52006, 1, "Interfaces/Lamp/attack", "Select Attack");
        RSInterface.addButton(52007, 1, "Interfaces/Lamp/str", "Select Strength");
        RSInterface.addButton(52008, 1, "Interfaces/Lamp/range", "Select Ranged");
        RSInterface.addButton(52009, 1, "Interfaces/Lamp/mage", "Select Magic");
        RSInterface.addButton(52010, 1, "Interfaces/Lamp/def", "Select Defence");
        RSInterface.addButton(52011, 1, "Interfaces/Lamp/craft", "Select Crafting");
        RSInterface.addButton(52012, 1, "Interfaces/Lamp/hp", "Select Hitpoints");
        RSInterface.addButton(52013, 1, "Interfaces/Lamp/pray", "Select Prayer");
        RSInterface.addButton(52014, 1, "Interfaces/Lamp/agility", "Select Agility");
        RSInterface.addButton(52015, 1, "Interfaces/Lamp/herb", "Select Herblore");
        RSInterface.addButton(52016, 1, "Interfaces/Lamp/thiev", "Select Thieving");
        RSInterface.addButton(52017, 1, "Interfaces/Lamp/fish", "Select Fishing");
        RSInterface.addButton(52018, 1, "Interfaces/Lamp/rc", "Select Runecraft");
        RSInterface.addButton(52019, 1, "Interfaces/Lamp/slay", "Select Slayer");
        RSInterface.addButton(52020, 1, "Interfaces/Lamp/farm", "Select Farming");
        RSInterface.addButton(52021, 1, "Interfaces/Lamp/mine", "Select Mining");
        RSInterface.addButton(52022, 1, "Interfaces/Lamp/smith", "Select Smithing");
        RSInterface.addButton(52023, 1, "Interfaces/Lamp/hunt", "Select Hunter");
        RSInterface.addButton(52024, 1, "Interfaces/Lamp/cook", "Select Cooking");
        RSInterface.addButton(52025, 1, "Interfaces/Lamp/fm", "Select Firemaking");
        RSInterface.addButton(52026, 1, "Interfaces/Lamp/wc", "Select Woodcutting");
        RSInterface.addButton(52027, 1, "Interfaces/Lamp/fletch", "Select Fletching");
        RSInterface.addButton(52028, 1, "Interfaces/Lamp/con", "Select Construction");
        RSInterface.addButton(52029, 1, "Interfaces/Lamp/summ", "Select Summoning");
        RSInterface.addButton(52030, 1, "Interfaces/Lamp/dung", "Select Dungeoneering");
        rsinterface.totalChildren(29);
        rsinterface.child(0, 52001, 0, 0);
        rsinterface.child(1, 52002, 431, 11);
        rsinterface.child(2, 52003, 352, 237);
        rsinterface.child(3, 52004, 352, 237);
        rsinterface.child(4, 52006, 60, 60);
        rsinterface.child(5, 52007, 119, 60);
        rsinterface.child(6, 52008, 172, 60);
        rsinterface.child(7, 52009, 230, 60);
        rsinterface.child(8, 52010, 288, 60);
        rsinterface.child(9, 52011, 328, 60);
        rsinterface.child(10, 52012, 380, 60);
        rsinterface.child(11, 52013, 55, 115);
        rsinterface.child(12, 52014, 113, 115);
        rsinterface.child(13, 52015, 168, 115);
        rsinterface.child(14, 52016, 228, 124);
        rsinterface.child(15, 52017, 281, 115);
        rsinterface.child(16, 52018, 330, 115);
        rsinterface.child(17, 52019, 383, 115);
        rsinterface.child(18, 52020, 55, 171);
        rsinterface.child(19, 52021, 113, 171);
        rsinterface.child(20, 52022, 168, 174);
        rsinterface.child(21, 52023, 228, 171);
        rsinterface.child(22, 52024, 281, 171);
        rsinterface.child(23, 52025, 330, 171);
        rsinterface.child(24, 52026, 383, 171);
        rsinterface.child(25, 52027, 113, 227);
        rsinterface.child(26, 52028, 168, 227);
        rsinterface.child(27, 52029, 228, 228);
        rsinterface.child(28, 52030, 281, 227);
    }

    public static void addAura(int i) {
        RSInterface rsinterface = RSInterface.interfaceCache[i] = new RSInterface();
        rsinterface.itemActions = new String[5];
        rsinterface.spritesX = new int[20];
        rsinterface.invStackSizes = new int[30];
        rsinterface.inv = new int[30];
        rsinterface.customName = new String[30];
        rsinterface.spritesY = new int[20];
        rsinterface.children = new int[0];
        rsinterface.childX = new int[0];
        rsinterface.childY = new int[0];
        rsinterface.spritesY[0] = 0;
        rsinterface.spritesY[1] = 0;
        rsinterface.spritesY[2] = 0;
        rsinterface.spritesY[3] = 0;
        rsinterface.spritesY[4] = 0;
        rsinterface.spritesY[5] = 0;
        rsinterface.spritesY[6] = 0;
        rsinterface.spritesY[7] = 0;
        rsinterface.spritesY[8] = 0;
        rsinterface.spritesY[9] = 0;
        rsinterface.spritesY[10] = 0;
        rsinterface.spritesY[11] = 0;
        rsinterface.spritesY[12] = 0;
        rsinterface.spritesY[13] = 0;
        rsinterface.spritesY[14] = 0;
        rsinterface.spritesY[15] = 0;
        rsinterface.spritesY[16] = 0;
        rsinterface.spritesY[17] = 0;
        rsinterface.spritesY[18] = 0;
        rsinterface.spritesY[19] = 0;
        rsinterface.invStackSizes[0] = 0;
        rsinterface.invStackSizes[1] = 0;
        rsinterface.invStackSizes[2] = 0;
        rsinterface.invStackSizes[3] = 0;
        rsinterface.invStackSizes[4] = 0;
        rsinterface.invStackSizes[5] = 0;
        rsinterface.invStackSizes[6] = 0;
        rsinterface.invStackSizes[7] = 0;
        rsinterface.invStackSizes[8] = 0;
        rsinterface.invStackSizes[9] = 0;
        rsinterface.invStackSizes[10] = 0;
        rsinterface.invStackSizes[11] = 0;
        rsinterface.invStackSizes[12] = 0;
        rsinterface.invStackSizes[13] = 0;
        rsinterface.invStackSizes[14] = 0;
        rsinterface.invStackSizes[15] = 0;
        rsinterface.invStackSizes[16] = 0;
        rsinterface.invStackSizes[17] = 0;
        rsinterface.invStackSizes[18] = 0;
        rsinterface.invStackSizes[19] = 0;
        rsinterface.invStackSizes[20] = 0;
        rsinterface.invStackSizes[21] = 0;
        rsinterface.invStackSizes[22] = 0;
        rsinterface.invStackSizes[23] = 0;
        rsinterface.invStackSizes[24] = 0;
        rsinterface.invStackSizes[25] = 0;
        rsinterface.invStackSizes[26] = 0;
        rsinterface.invStackSizes[27] = 0;
        rsinterface.invStackSizes[28] = 0;
        rsinterface.invStackSizes[29] = 0;
        rsinterface.inv[0] = 0;
        rsinterface.inv[1] = 0;
        rsinterface.inv[2] = 0;
        rsinterface.inv[3] = 0;
        rsinterface.inv[4] = 0;
        rsinterface.inv[5] = 0;
        rsinterface.inv[6] = 0;
        rsinterface.inv[7] = 0;
        rsinterface.inv[8] = 0;
        rsinterface.inv[9] = 0;
        rsinterface.inv[10] = 0;
        rsinterface.inv[11] = 0;
        rsinterface.inv[12] = 0;
        rsinterface.inv[13] = 0;
        rsinterface.inv[14] = 0;
        rsinterface.inv[15] = 0;
        rsinterface.inv[16] = 0;
        rsinterface.inv[17] = 0;
        rsinterface.inv[18] = 0;
        rsinterface.inv[19] = 0;
        rsinterface.inv[20] = 0;
        rsinterface.inv[21] = 0;
        rsinterface.inv[22] = 0;
        rsinterface.inv[23] = 0;
        rsinterface.inv[24] = 0;
        rsinterface.inv[25] = 0;
        rsinterface.inv[26] = 0;
        rsinterface.inv[27] = 0;
        rsinterface.inv[28] = 0;
        rsinterface.inv[29] = 0;
        rsinterface.spritesX[0] = 0;
        rsinterface.spritesX[1] = 0;
        rsinterface.spritesX[2] = 0;
        rsinterface.spritesX[3] = 0;
        rsinterface.spritesX[4] = 0;
        rsinterface.spritesX[5] = 0;
        rsinterface.spritesX[6] = 0;
        rsinterface.spritesX[7] = 0;
        rsinterface.spritesX[8] = 0;
        rsinterface.spritesX[9] = 0;
        rsinterface.spritesX[10] = 0;
        rsinterface.spritesX[11] = 0;
        rsinterface.spritesX[12] = 0;
        rsinterface.spritesX[13] = 0;
        rsinterface.spritesX[14] = 0;
        rsinterface.spritesX[15] = 0;
        rsinterface.spritesX[16] = 0;
        rsinterface.spritesX[17] = 0;
        rsinterface.spritesX[18] = 0;
        rsinterface.spritesX[19] = 0;
        rsinterface.itemActions[0] = null;
        rsinterface.itemActions[1] = null;
        rsinterface.itemActions[2] = null;
        rsinterface.itemActions[3] = null;
        rsinterface.itemActions[4] = null;
        rsinterface.center = false;
        rsinterface.aBoolean227 = false;
        rsinterface.aBoolean235 = false;
        rsinterface.usableItemInterface = false;
        rsinterface.isInventoryInterface = false;
        rsinterface.aBoolean259 = true;
        rsinterface.textShadow = false;
        rsinterface.width = 6;
        rsinterface.invSpritePadX = 24;
        rsinterface.parentID = 10794;
        rsinterface.invSpritePadY = 24;
        rsinterface.type = 2;
        rsinterface.height = 5;
    }

    public static void SummonTab(TextDrawingArea[] TDA) {
        RSInterface localRSInterface = RSInterface.addTabInterface(17011);
        RSInterface.addSprite(17012, 6, "SummonTab/SUMMON");
        RSInterface.addButton(17013, 7, "/SummonTab/SUMMON", "Click");
        RSInterface.addSprite(17014, 6, "SummonTab/SUMMON");
        RSInterface.addConfigButton(17015, 17032, 14, 8, "/SummonTab/SUMMON", 20, 30, "Call Familiar", 1, 5, 300);
        RSInterface.addHoverButton(17018, "/SummonTab/SUMMON", 2, 38, 36, "Beast of burden Inventory", -1, 17028, 1);
        RSInterface.addHoveredButton(17028, "/SummonTab/SUMMON", 12, 38, 36, 17029);
        RSInterface.addHoverButton(17022, "/SummonTab/SUMMON", 1, 38, 36, "Call Familiar", -1, 17030, 1);
        RSInterface.addHoveredButton(17030, "/SummonTab/SUMMON", 13, 38, 36, 17031);
        RSInterface.addHoverButton(17023, "/SummonTab/SUMMON", 3, 38, 36, "Dismiss Familiar", -1, 17033, 1);
        RSInterface.addHoveredButton(17033, "/SummonTab/SUMMON", 15, 38, 36, 17034);
        RSInterface.addSprite(17016, 5, "SummonTab/SUMMON");
        RSInterface.addText(17017, "", TDA, 2, 14329120, false, true);
        RSInterface.addSprite(17019, 9, "SummonTab/SUMMON");
        RSInterface.addText(17021, "", TDA, 0, 16753920, false, true);
        RSInterface.addSprite(17020, 10, "SummonTab/SUMMON");
        RSInterface.addSprite(17024, 11, "SummonTab/SUMMON");
        RSInterface.addText(17025, "", TDA, 0, 16753920, false, true);
        RSInterface.addText(17026, "", TDA, 0, 16753920, false, true);
        RSInterface.addHead2(17027, 75, 55, 2000);
        localRSInterface.totalChildren(19);
        localRSInterface.child(0, 17012, 10, 25);
        localRSInterface.child(1, 17013, 24, 7);
        localRSInterface.child(2, 17014, 10, 25);
        localRSInterface.child(3, 17015, 11, 25);
        localRSInterface.child(4, 17016, 15, 140);
        localRSInterface.child(5, 17017, 45, 143);
        localRSInterface.child(6, 17018, 20, 170);
        localRSInterface.child(7, 17019, 115, 167);
        localRSInterface.child(8, 17020, 143, 170);
        localRSInterface.child(9, 17021, 135, 197);
        localRSInterface.child(10, 17022, 20, 213);
        localRSInterface.child(11, 17023, 67, 193);
        localRSInterface.child(12, 17024, 135, 214);
        localRSInterface.child(13, 17025, 135, 240);
        localRSInterface.child(14, 17026, 21, 59);
        localRSInterface.child(15, 17027, 75, 55);
        localRSInterface.child(16, 17028, 20, 170);
        localRSInterface.child(17, 17030, 20, 213);
        localRSInterface.child(18, 17033, 67, 193);
    }

    private static void addHead2(int id, int w, int h, int zoom) {
        RSInterface rsinterface = RSInterface.addInterface(id);
        rsinterface.type = 6;
        rsinterface.anInt233 = 2;
        rsinterface.mediaID = 4000;
        rsinterface.modelZoom = zoom;
        rsinterface.modelRotation1 = 40;
        rsinterface.modelRotation2 = 1900;
        rsinterface.height = h;
        rsinterface.width = w;
    }

    public static void addHoverText(int id, String text, String tooltip, TextDrawingArea[] tda, int idx, int color, boolean center, boolean textShadow, int width) {
        RSInterface rsinterface = RSInterface.addInterface(id);
        rsinterface.id = id;
        rsinterface.parentID = id;
        rsinterface.type = 4;
        rsinterface.atActionType = 1;
        rsinterface.width = width;
        rsinterface.height = 11;
        rsinterface.contentType = 0;
        rsinterface.opacity = 0;
        rsinterface.mOverInterToTrigger = -1;
        rsinterface.center = center;
        rsinterface.textShadow = textShadow;
        rsinterface.textDrawingAreas = tda[idx];
        rsinterface.message = text;
        rsinterface.textColor = color;
        rsinterface.anInt219 = 0;
        rsinterface.anInt239 = 0;
        rsinterface.tooltip = tooltip;
    }

    public static void questTab(TextDrawingArea[] TDA) {
        RSInterface localRSInterface = RSInterface.addInterface(639);
        RSInterface.setChildren(4, localRSInterface);
        RSInterface.addText(39155, "Quests", 16750623, false, true, 52, TDA, 2);
        RSInterface.addButton(39156, 1, "Interfaces/QuestTab/QUEST", 18, 18, "Swap to achievement tab", 1);
        RSInterface.addSprite(39157, 0, "Interfaces/QuestTab/QUEST");
        RSInterface.setBounds(39155, 10, 5, 0, localRSInterface);
        RSInterface.setBounds(39156, 165, 5, 1, localRSInterface);
        RSInterface.setBounds(39157, 3, 24, 2, localRSInterface);
        RSInterface.setBounds(39160, 5, 29, 3, localRSInterface);
        localRSInterface = RSInterface.addInterface(39160);
        localRSInterface.height = 214;
        localRSInterface.width = 165;
        localRSInterface.scrollMax = 1700;
        RSInterface.setChildren(105, localRSInterface);
        RSInterface.addText(39161, "", 16750623, false, true, 52, TDA, 2);
        RSInterface.addHoverText(39162, "", "", TDA, 0, 16711680, false, true, 150);
        RSInterface.addText(39163, "", 16750623, false, true, 52, TDA, 2);
        RSInterface.addHoverText(39164, "", "", TDA, 0, 16711680, false, true, 150);
        RSInterface.addText(39165, "", 16750623, false, true, 52, TDA, 2);
        RSInterface.addHoverText(39166, "", "", TDA, 0, 16711680, false, true, 150);
        RSInterface.setBounds(39161, 4, 4, 0, localRSInterface);
        RSInterface.setBounds(39162, 8, 22, 1, localRSInterface);
        RSInterface.setBounds(39163, 4, 35, 2, localRSInterface);
        RSInterface.setBounds(39164, 8, 53, 3, localRSInterface);
        RSInterface.setBounds(663, 4, 67, 4, localRSInterface);
        int i = 83;
        int j = 5;
        for (int k = 39165; k <= 39264; ++j, ++i, ++k) {
            RSInterface.addHoverText(k, "", "View Quest", TDA, 0, 16711680, false, true, 150);
            RSInterface.setBounds(k, 8, i, j, localRSInterface);
            i += 15;
        }
        localRSInterface = RSInterface.addInterface(39265);
        try {
            RSInterface.setChildren(4, localRSInterface);
            RSInterface.addText(39266, " ", 16750623, false, true, -1, TDA, 2);
            RSInterface.addButton(39267, 3, "Interfaces/QuestTab/QUEST", 18, 18, "Swap to Quest Diary", 1);
            RSInterface.addSprite(39269, 0, "Interfaces/QuestTab/QUEST");
            RSInterface.setBounds(39266, 10, 5, 0, localRSInterface);
            RSInterface.setBounds(39267, 165, 5, 1, localRSInterface);
            RSInterface.setBounds(39269, 3, 24, 2, localRSInterface);
            RSInterface.setBounds(39268, 5, 29, 3, localRSInterface);
            localRSInterface = RSInterface.addInterface(39268);
            localRSInterface.height = 214;
            localRSInterface.width = 165;
            localRSInterface.scrollMax = 1700;
            RSInterface.setChildren(20, localRSInterface);
            RSInterface.setBounds(39295, 8, 4, 0, localRSInterface);
            RSInterface.setBounds(39296, 8, 16, 1, localRSInterface);
            RSInterface.setBounds(39297, 8, 29, 2, localRSInterface);
            RSInterface.setBounds(39298, 8, 42, 3, localRSInterface);
            RSInterface.setBounds(39299, 8, 54, 4, localRSInterface);
            RSInterface.setBounds(39300, 8, 66, 5, localRSInterface);
            RSInterface.setBounds(39301, 8, 78, 6, localRSInterface);
            RSInterface.setBounds(39302, 8, 90, 7, localRSInterface);
            RSInterface.setBounds(39303, 8, 102, 8, localRSInterface);
            RSInterface.setBounds(39304, 8, 114, 9, localRSInterface);
            RSInterface.setBounds(39305, 8, 126, 10, localRSInterface);
            RSInterface.setBounds(39306, 8, 138, 11, localRSInterface);
            RSInterface.setBounds(39307, 8, 150, 12, localRSInterface);
            RSInterface.setBounds(39308, 8, 162, 13, localRSInterface);
            RSInterface.setBounds(39309, 8, 174, 14, localRSInterface);
            RSInterface.setBounds(39310, 8, 186, 15, localRSInterface);
            RSInterface.setBounds(39311, 8, 198, 16, localRSInterface);
            RSInterface.setBounds(39312, 8, 210, 17, localRSInterface);
            RSInterface.setBounds(39313, 8, 222, 18, localRSInterface);
            RSInterface.setBounds(39314, 8, 234, 19, localRSInterface);
            RSInterface.addHoverText(39295, "", "", TDA, 0, 16750623, false, true, 150);
            RSInterface.addHoverText(39296, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39297, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39298, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39299, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39300, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39301, "", "", TDA, 0, 16750623, false, true, 150);
            RSInterface.addHoverText(39302, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39303, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39304, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39305, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39306, "", "", TDA, 0, 16750623, false, true, 150);
            RSInterface.addHoverText(39307, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39308, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39309, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39310, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39311, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39312, " ", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39313, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(39314, "", "", TDA, 0, 16711680, false, true, 150);
        }
        catch (Exception localException) {
            localException.printStackTrace();
        }
        localRSInterface = RSInterface.addInterface(59265);
        try {
            RSInterface.setChildren(4, localRSInterface);
            RSInterface.addText(59266, "Quests", 16750623, false, true, -1, TDA, 2);
            RSInterface.addButton(59267, 3, "", 18, 18, "Swap to Quest Diary", 1);
            RSInterface.addSprite(59269, 0, "Interfaces/QuestTab/QUEST");
            RSInterface.setBounds(59266, 10, 5, 0, localRSInterface);
            RSInterface.setBounds(59267, 165, 5, 1, localRSInterface);
            RSInterface.setBounds(59269, 3, 24, 2, localRSInterface);
            RSInterface.setBounds(59268, 5, 29, 3, localRSInterface);
            localRSInterface = RSInterface.addInterface(59268);
            localRSInterface.height = 214;
            localRSInterface.width = 165;
            localRSInterface.scrollMax = 1700;
            RSInterface.setChildren(20, localRSInterface);
            RSInterface.setBounds(59295, 8, 4, 0, localRSInterface);
            RSInterface.setBounds(59296, 8, 16, 1, localRSInterface);
            RSInterface.setBounds(59297, 8, 29, 2, localRSInterface);
            RSInterface.setBounds(59298, 8, 42, 3, localRSInterface);
            RSInterface.setBounds(59299, 8, 54, 4, localRSInterface);
            RSInterface.setBounds(59300, 8, 66, 5, localRSInterface);
            RSInterface.setBounds(59301, 8, 78, 6, localRSInterface);
            RSInterface.setBounds(59302, 8, 90, 7, localRSInterface);
            RSInterface.setBounds(59303, 8, 102, 8, localRSInterface);
            RSInterface.setBounds(59304, 8, 114, 9, localRSInterface);
            RSInterface.setBounds(59305, 8, 126, 10, localRSInterface);
            RSInterface.setBounds(59306, 8, 138, 11, localRSInterface);
            RSInterface.setBounds(59307, 8, 150, 12, localRSInterface);
            RSInterface.setBounds(59308, 8, 162, 13, localRSInterface);
            RSInterface.setBounds(59309, 8, 174, 14, localRSInterface);
            RSInterface.setBounds(59310, 8, 186, 15, localRSInterface);
            RSInterface.setBounds(59311, 8, 198, 16, localRSInterface);
            RSInterface.setBounds(59312, 8, 210, 17, localRSInterface);
            RSInterface.setBounds(59313, 8, 222, 18, localRSInterface);
            RSInterface.setBounds(59314, 8, 234, 19, localRSInterface);
            RSInterface.addHoverText(59295, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59296, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59297, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59298, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59299, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59300, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59301, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59302, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59303, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59304, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59305, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59306, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59307, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59308, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59309, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59310, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59311, "", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59312, " ", " ", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59313, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(59314, "", "", TDA, 0, 16711680, false, true, 150);
            return;
        }
        catch (Exception localException) {
            localException.printStackTrace();
        }
    }

    public static void dungTab(TextDrawingArea[] TDA) {
        RSInterface Interface = RSInterface.addInterface(638);
        RSInterface.setChildren(4, Interface);
        String dir = "questtab";
        RSInterface.addText(29155, "Quests", 16750623, false, true, 52, TDA, 2);
        RSInterface.addButton(29156, 2, "QuestTab/QUEST", 18, 18, "Swap to Quest Tab", 1);
        RSInterface.addSprite(29157, 0, "Interfaces/QuestTab/QUEST");
        RSInterface.setBounds(29155, 10, 5, 0, Interface);
        RSInterface.setBounds(29156, 165, 5, 1, Interface);
        RSInterface.setBounds(29157, 3, 24, 2, Interface);
        RSInterface.setBounds(29160, 5, 29, 3, Interface);
        Interface = RSInterface.addInterface(29160);
        Interface.height = 214;
        Interface.width = 165;
        Interface.scrollMax = 1700;
        RSInterface.setChildren(105, Interface);
        RSInterface.addText(29161, "", 16750623, false, true, 52, TDA, 2);
        RSInterface.addHoverText(29162, "", "", TDA, 0, 16711680, false, true, 150);
        RSInterface.addText(29163, "", 16750623, false, true, 52, TDA, 2);
        RSInterface.addHoverText(29164, "", "", TDA, 0, 16711680, false, true, 150);
        RSInterface.addText(29165, "", 16750623, false, true, 52, TDA, 2);
        RSInterface.addHoverText(29166, "", "", TDA, 0, 16711680, false, true, 150);
        RSInterface.setBounds(29161, 4, 4, 0, Interface);
        RSInterface.setBounds(29162, 8, 22, 1, Interface);
        RSInterface.setBounds(29163, 4, 35, 2, Interface);
        RSInterface.setBounds(29164, 8, 53, 3, Interface);
        RSInterface.setBounds(663, 4, 67, 4, Interface);
        int Ypos = 83;
        int frameID = 5;
        for (int iD = 29165; iD <= 29264; ++frameID, ++Ypos, ++iD) {
            RSInterface.addHoverText(iD, "", "Continue", TDA, 0, 16711680, false, true, 150);
            RSInterface.setBounds(iD, 8, Ypos, frameID, Interface);
            Ypos += 15;
        }
        Interface = RSInterface.addInterface(29265);
        try {
            RSInterface.setChildren(4, Interface);
            RSInterface.addText(29266, "", 16750623, false, true, -1, TDA, 2);
            RSInterface.addButton(29267, 1, "Interfaces/QuestTab/QUEST", 18, 18, "Swap to Player Info", 1);
            RSInterface.addSprite(29269, 0, "Interfaces/QuestTab/QUEST");
            RSInterface.setBounds(29266, 10, 5, 0, Interface);
            RSInterface.setBounds(29267, 165, 5, 1, Interface);
            RSInterface.setBounds(29269, 3, 24, 2, Interface);
            RSInterface.setBounds(29268, 5, 29, 3, Interface);
            Interface = RSInterface.addInterface(29268);
            Interface.height = 214;
            Interface.width = 165;
            Interface.scrollMax = 1700;
            RSInterface.setChildren(20, Interface);
            RSInterface.setBounds(29295, 8, 4, 0, Interface);
            RSInterface.setBounds(29296, 8, 16, 1, Interface);
            RSInterface.setBounds(29297, 8, 29, 2, Interface);
            RSInterface.setBounds(29298, 8, 42, 3, Interface);
            RSInterface.setBounds(29299, 8, 54, 4, Interface);
            RSInterface.setBounds(29300, 8, 66, 5, Interface);
            RSInterface.setBounds(29301, 8, 78, 6, Interface);
            RSInterface.setBounds(29302, 8, 90, 7, Interface);
            RSInterface.setBounds(29303, 8, 102, 8, Interface);
            RSInterface.setBounds(29304, 8, 114, 9, Interface);
            RSInterface.setBounds(29305, 8, 126, 10, Interface);
            RSInterface.setBounds(29306, 8, 138, 11, Interface);
            RSInterface.setBounds(29307, 8, 150, 12, Interface);
            RSInterface.setBounds(29308, 8, 162, 13, Interface);
            RSInterface.setBounds(29309, 8, 174, 14, Interface);
            RSInterface.setBounds(29310, 8, 186, 15, Interface);
            RSInterface.setBounds(29311, 8, 198, 16, Interface);
            RSInterface.setBounds(29312, 8, 210, 17, Interface);
            RSInterface.setBounds(29313, 8, 222, 18, Interface);
            RSInterface.setBounds(29314, 8, 234, 19, Interface);
            RSInterface.addHoverText(29295, "", "", TDA, 2, 16750623, false, true, 150);
            RSInterface.addHoverText(29296, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29297, "", "", TDA, 1, 16750623, false, true, 150);
            RSInterface.addHoverText(29298, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29299, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29300, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29301, "", "", TDA, 1, 16711680, false, true, 150);
            RSInterface.addHoverText(29302, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29303, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29304, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29305, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29306, "", "", TDA, 1, 16711680, false, true, 150);
            RSInterface.addHoverText(29307, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29308, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29309, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29310, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29311, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29312, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29313, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(29314, "", "", TDA, 0, 16711680, false, true, 150);
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void pkingTab(TextDrawingArea[] TDA) {
        RSInterface Interface = RSInterface.addInterface(648);
        RSInterface.setChildren(4, Interface);
        RSInterface.addText(49155, "PKing Tab", 16750623, false, true, 52, TDA, 2);
        RSInterface.addButton(49156, 2, "QuestTab/QUEST", 18, 18, "PKing Tab", 1);
        RSInterface.addSprite(49157, 0, "Interfaces/QuestTab/QUEST");
        RSInterface.setBounds(49155, 10, 5, 0, Interface);
        RSInterface.setBounds(49156, 165, 5, 1, Interface);
        RSInterface.setBounds(49157, 3, 24, 2, Interface);
        RSInterface.setBounds(49160, 5, 49, 3, Interface);
        Interface = RSInterface.addInterface(49160);
        Interface.height = 214;
        Interface.width = 165;
        Interface.scrollMax = 1700;
        RSInterface.setChildren(105, Interface);
        RSInterface.addText(49161, "", 16750623, false, true, 52, TDA, 2);
        RSInterface.addHoverText(49162, "", "", TDA, 0, 16711680, false, true, 150);
        RSInterface.addText(49163, "", 16750623, false, true, 52, TDA, 2);
        RSInterface.addHoverText(49164, "", "", TDA, 0, 16711680, false, true, 150);
        RSInterface.addText(49165, "", 16750623, false, true, 52, TDA, 2);
        RSInterface.addHoverText(49166, "", "", TDA, 0, 16711680, false, true, 150);
        RSInterface.setBounds(49161, 4, 4, 0, Interface);
        RSInterface.setBounds(49162, 8, 22, 1, Interface);
        RSInterface.setBounds(49163, 4, 35, 2, Interface);
        RSInterface.setBounds(49164, 8, 53, 3, Interface);
        RSInterface.setBounds(663, 4, 67, 4, Interface);
        int Ypos = 83;
        int frameID = 5;
        for (int iD = 49165; iD <= 49264; ++frameID, ++Ypos, ++iD) {
            RSInterface.addHoverText(iD, "", "Continue", TDA, 0, 16711680, false, true, 150);
            RSInterface.setBounds(iD, 8, Ypos, frameID, Interface);
            Ypos += 15;
        }
        Interface = RSInterface.addInterface(49265);
        try {
            RSInterface.setChildren(4, Interface);
            RSInterface.addText(49266, "Coming soon!", 16750623, false, true, -1, TDA, 2);
            RSInterface.addButton(49267, 1, "Interfaces/QuestTab/QUEST", 18, 18, "", 1);
            RSInterface.addSprite(49269, 0, "Interfaces/QuestTab/QUEST");
            RSInterface.setBounds(49266, 10, 5, 0, Interface);
            RSInterface.setBounds(49267, 165, 5, 1, Interface);
            RSInterface.setBounds(49269, 3, 24, 2, Interface);
            RSInterface.setBounds(49268, 5, 49, 3, Interface);
            Interface = RSInterface.addInterface(49268);
            Interface.height = 214;
            Interface.width = 165;
            Interface.scrollMax = 1700;
            RSInterface.setChildren(20, Interface);
            RSInterface.setBounds(49495, 8, 4, 0, Interface);
            RSInterface.setBounds(49496, 8, 16, 1, Interface);
            RSInterface.setBounds(49497, 8, 49, 2, Interface);
            RSInterface.setBounds(49498, 8, 42, 3, Interface);
            RSInterface.setBounds(49499, 8, 54, 4, Interface);
            RSInterface.setBounds(49300, 8, 66, 5, Interface);
            RSInterface.setBounds(49301, 8, 78, 6, Interface);
            RSInterface.setBounds(49302, 8, 90, 7, Interface);
            RSInterface.setBounds(49303, 8, 102, 8, Interface);
            RSInterface.setBounds(49304, 8, 114, 9, Interface);
            RSInterface.setBounds(49305, 8, 126, 10, Interface);
            RSInterface.setBounds(49306, 8, 138, 11, Interface);
            RSInterface.setBounds(49307, 8, 150, 12, Interface);
            RSInterface.setBounds(49308, 8, 162, 13, Interface);
            RSInterface.setBounds(49309, 8, 174, 14, Interface);
            RSInterface.setBounds(49310, 8, 186, 15, Interface);
            RSInterface.setBounds(49311, 8, 498, 16, Interface);
            RSInterface.setBounds(49312, 8, 210, 17, Interface);
            RSInterface.setBounds(49313, 8, 222, 18, Interface);
            RSInterface.setBounds(49314, 8, 234, 19, Interface);
            RSInterface.addHoverText(49495, "Please register at", "Please Register", TDA, 1, 16750623, false, true, 150);
            RSInterface.addHoverText(49496, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49497, "And advertise/vote daily!", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49498, "::vote for more players!", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49499, "More players=More updates!", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49300, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49301, "", "", TDA, 1, 16750623, false, true, 150);
            RSInterface.addHoverText(49302, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49303, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49304, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49305, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49306, "", "", TDA, 1, 16750623, false, true, 150);
            RSInterface.addHoverText(49307, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49308, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49309, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49310, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49311, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49312, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49313, "", "", TDA, 0, 16711680, false, true, 150);
            RSInterface.addHoverText(49314, "", "", TDA, 0, 16711680, false, true, 150);
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void minigame(TextDrawingArea[] TDA) {
        int i;
        RSInterface localRSInterface = RSInterface.addInterface(45200);
        RSInterface.addSprite(45201, 30, "CLICK");
        RSInterface.addHoverButton(45202, "CLICK", 2, 200, 30, "Which Zone?", -1, 45203, 1);
        RSInterface.addHoveredButton(45203, "CLICK", 3, 200, 30, 45204);
        RSInterface.addHoverButton(45205, "CLICK", 2, 200, 30, "Which Zone?", -1, 45206, 1);
        RSInterface.addHoveredButton(45206, "CLICK", 3, 200, 30, 45207);
        RSInterface.addHoverButton(45208, "CLICK", 2, 200, 30, "Which Zone?", -1, 45209, 1);
        RSInterface.addHoveredButton(45209, "CLICK", 3, 200, 30, 45210);
        RSInterface.addHoverButton(45211, "CLICK", 2, 200, 30, "Which Zone?", -1, 45212, 1);
        RSInterface.addHoveredButton(45212, "CLICK", 3, 200, 30, 45213);
        RSInterface.addHoverButton(45214, "CLICK", 2, 200, 30, "Which Zone?", -1, 45215, 1);
        RSInterface.addHoveredButton(45215, "CLICK", 3, 200, 30, 45216);
        RSInterface.addHoverButton(45217, "CLICK", 2, 200, 30, "Which Zone?", -1, 45218, 1);
        RSInterface.addHoveredButton(45218, "CLICK", 3, 200, 30, 45219);
        RSInterface.addHoverButton(45220, "CLICK", 2, 200, 30, "Which Zone?", -1, 45221, 1);
        RSInterface.addHoveredButton(45221, "CLICK", 3, 200, 30, 45222);
        RSInterface.addHoverButton(45223, "CLICK", 1, 200, 30, "Stop Viewing", -1, 45224, 1);
        RSInterface.addHoveredButton(45224, "CLICK", 1, 200, 30, 45225);
        RSInterface.addText(45226, "Duel Arena", TDA, 0, 16750623, false, true);
        RSInterface.addText(45227, "Barrows", TDA, 0, 16750623, false, true);
        RSInterface.addText(45228, "Pest Control", TDA, 0, 16750623, false, true);
        RSInterface.addText(45229, "Tzhaar", TDA, 0, 16750623, false, true);
        RSInterface.addText(45230, "Warriors Guild", TDA, 0, 16750623, false, true);
        RSInterface.addText(45231, "Assault&Dominion", TDA, 0, 16750623, false, true);
        RSInterface.addText(45232, "Nomad&Angry Goblin", TDA, 0, 16750623, false, true);
        localRSInterface.totalChildren(24);
        localRSInterface.child(0, 45201, 0, 0);
        localRSInterface.child(1, 45202, 25, 50);
        localRSInterface.child(2, 45203, 25, 50);
        localRSInterface.child(3, 45205, 25, 75);
        localRSInterface.child(4, 45206, 25, 75);
        localRSInterface.child(5, 45208, 25, 100);
        localRSInterface.child(6, 45209, 25, 100);
        localRSInterface.child(7, 45211, 25, 125);
        localRSInterface.child(8, 45212, 25, 125);
        localRSInterface.child(9, 45214, 25, 150);
        localRSInterface.child(10, 45215, 25, 150);
        localRSInterface.child(11, 45217, 25, 175);
        localRSInterface.child(12, 45218, 25, 175);
        localRSInterface.child(13, 45220, 25, 200);
        localRSInterface.child(14, 45221, 25, 200);
        localRSInterface.child(15, 45223, 38, 236);
        localRSInterface.child(16, 45224, 38, 236);
        localRSInterface.child(17, 45226, 38, 53);
        localRSInterface.child(18, 45227, 38, 78);
        localRSInterface.child(19, 45228, 38, 103);
        localRSInterface.child(20, 45229, 38, 128);
        localRSInterface.child(21, 45230, 38, 153);
        localRSInterface.child(22, 45231, 38, 178);
        localRSInterface.child(23, 45232, 38, 203);
        localRSInterface = RSInterface.addTabInterface(14000);
        localRSInterface.width = 474;
        localRSInterface.height = 213;
        localRSInterface.scrollMax = 305;
        for (i = 14001; i <= 14030; ++i) {
            RSInterface.addText(i, "", TDA, 1, 16777215, false, true);
        }
        localRSInterface.totalChildren(30);
        i = 0;
        int j = 5;
        int k = 14001;
        while (k <= 14030) {
            localRSInterface.child(i, k, 248, j);
            ++i;
            j += 13;
            ++k;
        }
    }

    public static final void wilderness(TextDrawingArea[] TDA) {
        int i;
        RSInterface localRSInterface = RSInterface.addInterface(45600);
        RSInterface.addSprite(45601, 10, "CLICK");
        RSInterface.addHoverButton(45602, "CLICK", 2, 200, 30, "Which Zone?", -1, 45603, 1);
        RSInterface.addHoveredButton(45603, "CLICK", 3, 200, 30, 45604);
        RSInterface.addHoverButton(45605, "CLICK", 2, 200, 30, "Which Zone?", -1, 45606, 1);
        RSInterface.addHoveredButton(45606, "CLICK", 3, 200, 30, 45607);
        RSInterface.addHoverButton(45608, "CLICK", 2, 200, 30, "Which Zone?", -1, 45609, 1);
        RSInterface.addHoveredButton(45609, "CLICK", 3, 200, 30, 45610);
        RSInterface.addHoverButton(45611, "CLICK", 2, 200, 30, "Which Zone?", -1, 45612, 1);
        RSInterface.addHoveredButton(45612, "CLICK", 3, 200, 30, 45613);
        RSInterface.addHoverButton(45614, "CLICK", 2, 200, 30, "Which Zone?", -1, 45615, 1);
        RSInterface.addHoveredButton(45615, "CLICK", 3, 200, 30, 45616);
        RSInterface.addHoverButton(45617, "CLICK", 2, 200, 30, "Which Zone?", -1, 45618, 1);
        RSInterface.addHoveredButton(45618, "CLICK", 3, 200, 30, 45619);
        RSInterface.addHoverButton(45620, "CLICK", 2, 200, 30, "Which Zone?", -1, 45621, 1);
        RSInterface.addHoveredButton(45621, "CLICK", 3, 200, 30, 45622);
        RSInterface.addHoverButton(45623, "CLICK", 1, 200, 30, "Stop Viewing", -1, 45624, 1);
        RSInterface.addHoveredButton(45624, "CLICK", 1, 200, 30, 45625);
        RSInterface.addText(45626, "Mage Bank", TDA, 0, 16750623, false, true);
        RSInterface.addText(45627, "Fun Pk", TDA, 0, 16750623, false, true);
        RSInterface.addText(45628, "Unknown Village (23W)", TDA, 0, 16750623, false, true);
        RSInterface.addText(45629, "Green Dragons", TDA, 0, 16750623, false, true);
        RSInterface.addText(45630, "", TDA, 0, 16750623, false, true);
        RSInterface.addText(45631, "", TDA, 0, 16750623, false, true);
        RSInterface.addText(45632, "", TDA, 0, 16750623, false, true);
        localRSInterface.totalChildren(24);
        localRSInterface.child(0, 45601, 0, 0);
        localRSInterface.child(1, 45602, 25, 50);
        localRSInterface.child(2, 45603, 25, 50);
        localRSInterface.child(3, 45605, 25, 75);
        localRSInterface.child(4, 45606, 25, 75);
        localRSInterface.child(5, 45608, 25, 100);
        localRSInterface.child(6, 45609, 25, 100);
        localRSInterface.child(7, 45611, 25, 125);
        localRSInterface.child(8, 45612, 25, 125);
        localRSInterface.child(9, 45614, 25, 150);
        localRSInterface.child(10, 45615, 25, 150);
        localRSInterface.child(11, 45617, 25, 175);
        localRSInterface.child(12, 45618, 25, 175);
        localRSInterface.child(13, 45620, 25, 200);
        localRSInterface.child(14, 45621, 25, 200);
        localRSInterface.child(15, 45623, 38, 236);
        localRSInterface.child(16, 45624, 38, 236);
        localRSInterface.child(17, 45626, 38, 53);
        localRSInterface.child(18, 45627, 38, 78);
        localRSInterface.child(19, 45628, 38, 103);
        localRSInterface.child(20, 45629, 38, 128);
        localRSInterface.child(21, 45630, 38, 153);
        localRSInterface.child(22, 45631, 38, 178);
        localRSInterface.child(23, 45632, 38, 203);
        localRSInterface = RSInterface.addTabInterface(14000);
        localRSInterface.width = 474;
        localRSInterface.height = 213;
        localRSInterface.scrollMax = 305;
        for (i = 14001; i <= 14030; ++i) {
            RSInterface.addText(i, "", TDA, 1, 16777215, false, true);
        }
        localRSInterface.totalChildren(30);
        i = 0;
        int j = 5;
        int k = 14001;
        while (k <= 14030) {
            localRSInterface.child(i, k, 248, j);
            ++i;
            j += 13;
            ++k;
        }
    }

    public static final void boss(TextDrawingArea[] TDA) {
        int i;
        RSInterface localRSInterface = RSInterface.addInterface(45500);
        RSInterface.addSprite(45501, 10, "CLICK");
        RSInterface.addHoverButton(45502, "CLICK", 2, 200, 30, "Which Zone?", -1, 45503, 1);
        RSInterface.addHoveredButton(45503, "CLICK", 3, 200, 30, 45504);
        RSInterface.addHoverButton(45505, "CLICK", 2, 200, 30, "Which Zone?", -1, 45506, 1);
        RSInterface.addHoveredButton(45506, "CLICK", 3, 200, 30, 45507);
        RSInterface.addHoverButton(45508, "CLICK", 2, 200, 30, "Which Zone?", -1, 45509, 1);
        RSInterface.addHoveredButton(45509, "CLICK", 3, 200, 30, 45510);
        RSInterface.addHoverButton(45511, "CLICK", 2, 200, 30, "Which Zone?", -1, 45512, 1);
        RSInterface.addHoveredButton(45512, "CLICK", 3, 200, 30, 45513);
        RSInterface.addHoverButton(45514, "CLICK", 2, 200, 30, "Which Zone?", -1, 45515, 1);
        RSInterface.addHoveredButton(45515, "CLICK", 3, 200, 30, 45516);
        RSInterface.addHoverButton(45517, "CLICK", 2, 200, 30, "Which Zone?", -1, 45518, 1);
        RSInterface.addHoveredButton(45518, "CLICK", 3, 200, 30, 45519);
        RSInterface.addHoverButton(45520, "CLICK", 2, 200, 30, "Which Zone?", -1, 45521, 1);
        RSInterface.addHoveredButton(45521, "CLICK", 3, 200, 30, 45522);
        RSInterface.addHoverButton(45523, "CLICK", 1, 200, 30, "Stop Viewing", -1, 45524, 1);
        RSInterface.addHoveredButton(45524, "CLICK", 1, 200, 30, 45525);
        RSInterface.addText(45526, "Nex", TDA, 0, 16750623, false, true);
        RSInterface.addText(45527, "King Black Dragon", TDA, 0, 16750623, false, true);
        RSInterface.addText(45528, "Tormented Demons", TDA, 0, 16750623, false, true);
        RSInterface.addText(45529, "Corporal Beast", TDA, 0, 16750623, false, true);
        RSInterface.addText(45530, "Kalphite Queen", TDA, 0, 16750623, false, true);
        RSInterface.addText(45531, "GodWars", TDA, 0, 16750623, false, true);
        RSInterface.addText(45532, "BarrelChest", TDA, 0, 16750623, false, true);
        localRSInterface.totalChildren(24);
        localRSInterface.child(0, 45501, 0, 0);
        localRSInterface.child(1, 45502, 25, 50);
        localRSInterface.child(2, 45503, 25, 50);
        localRSInterface.child(3, 45505, 25, 75);
        localRSInterface.child(4, 45506, 25, 75);
        localRSInterface.child(5, 45508, 25, 100);
        localRSInterface.child(6, 45509, 25, 100);
        localRSInterface.child(7, 45511, 25, 125);
        localRSInterface.child(8, 45512, 25, 125);
        localRSInterface.child(9, 45514, 25, 150);
        localRSInterface.child(10, 45515, 25, 150);
        localRSInterface.child(11, 45517, 25, 175);
        localRSInterface.child(12, 45518, 25, 175);
        localRSInterface.child(13, 45520, 25, 200);
        localRSInterface.child(14, 45521, 25, 200);
        localRSInterface.child(15, 45523, 38, 236);
        localRSInterface.child(16, 45524, 38, 236);
        localRSInterface.child(17, 45526, 38, 53);
        localRSInterface.child(18, 45527, 38, 78);
        localRSInterface.child(19, 45528, 38, 103);
        localRSInterface.child(20, 45529, 38, 128);
        localRSInterface.child(21, 45530, 38, 153);
        localRSInterface.child(22, 45531, 38, 178);
        localRSInterface.child(23, 45532, 38, 203);
        localRSInterface = RSInterface.addTabInterface(14000);
        localRSInterface.width = 474;
        localRSInterface.height = 213;
        localRSInterface.scrollMax = 305;
        for (i = 14001; i <= 14030; ++i) {
            RSInterface.addText(i, "", TDA, 1, 16777215, false, true);
        }
        localRSInterface.totalChildren(30);
        i = 0;
        int j = 5;
        int k = 14001;
        while (k <= 14030) {
            localRSInterface.child(i, k, 248, j);
            ++i;
            j += 13;
            ++k;
        }
    }

    public static void teleport(TextDrawingArea[] TDA) {
        int i;
        RSInterface localRSInterface = RSInterface.addInterface(11650);
        RSInterface.addSprite(11651, 10, "CLICK");
        RSInterface.addHoverButton(11652, "CLICK", 2, 200, 30, "Which Zone?", -1, 11653, 1);
        RSInterface.addHoveredButton(11653, "CLICK", 3, 200, 30, 11654);
        RSInterface.addHoverButton(11655, "CLICK", 2, 200, 30, "Which Zone?", -1, 11656, 1);
        RSInterface.addHoveredButton(11656, "CLICK", 3, 200, 30, 11657);
        RSInterface.addHoverButton(11658, "CLICK", 2, 200, 30, "Which Zone?", -1, 11659, 1);
        RSInterface.addHoveredButton(11659, "CLICK", 3, 200, 30, 11660);
        RSInterface.addHoverButton(11661, "CLICK", 2, 200, 30, "Which Zone?", -1, 11662, 1);
        RSInterface.addHoveredButton(11662, "CLICK", 3, 200, 30, 11663);
        RSInterface.addHoverButton(11664, "CLICK", 2, 200, 30, "Which Zone?", -1, 11665, 1);
        RSInterface.addHoveredButton(11665, "CLICK", 3, 200, 30, 11666);
        RSInterface.addHoverButton(11667, "CLICK", 2, 200, 30, "Which Zone?", -1, 11668, 1);
        RSInterface.addHoveredButton(11668, "CLICK", 3, 200, 30, 11669);
        RSInterface.addHoverButton(11670, "CLICK", 2, 200, 30, "Which Zone?", -1, 11671, 1);
        RSInterface.addHoveredButton(11671, "CLICK", 3, 200, 30, 11672);
        RSInterface.addHoverButton(11673, "CLICK", 1, 200, 30, "Stop Viewing", -1, 11674, 1);
        RSInterface.addHoveredButton(11674, "CLICK", 1, 200, 30, 11675);
        RSInterface.addText(11204, "Yak's/Rock Crabs", TDA, 0, 16750623, false, true);
        RSInterface.addText(11208, "Taverly Dungeon", TDA, 0, 16750623, false, true);
        RSInterface.addText(11212, "Slayer Tower", TDA, 0, 16750623, false, true);
        RSInterface.addText(11216, "Brimhaven Dungeon", TDA, 0, 16750623, false, true);
        RSInterface.addText(11220, "Hill Giants", TDA, 0, 16750623, false, true);
        RSInterface.addText(11224, "Dark Beasts", TDA, 0, 16750623, false, true);
        RSInterface.addText(11228, "Strykeworms", TDA, 0, 16750623, false, true);
        localRSInterface.totalChildren(24);
        localRSInterface.child(0, 11651, 0, 0);
        localRSInterface.child(1, 11652, 25, 50);
        localRSInterface.child(2, 11653, 25, 50);
        localRSInterface.child(3, 11655, 25, 75);
        localRSInterface.child(4, 11656, 25, 75);
        localRSInterface.child(5, 11658, 25, 100);
        localRSInterface.child(6, 11659, 25, 100);
        localRSInterface.child(7, 11661, 25, 125);
        localRSInterface.child(8, 11662, 25, 125);
        localRSInterface.child(9, 11664, 25, 150);
        localRSInterface.child(10, 11665, 25, 150);
        localRSInterface.child(11, 11667, 25, 175);
        localRSInterface.child(12, 11668, 25, 175);
        localRSInterface.child(13, 11670, 25, 200);
        localRSInterface.child(14, 11671, 25, 200);
        localRSInterface.child(15, 11673, 38, 236);
        localRSInterface.child(16, 11674, 38, 236);
        localRSInterface.child(17, 11204, 38, 53);
        localRSInterface.child(18, 11208, 38, 78);
        localRSInterface.child(19, 11212, 38, 103);
        localRSInterface.child(20, 11216, 38, 128);
        localRSInterface.child(21, 11220, 38, 153);
        localRSInterface.child(22, 11224, 38, 178);
        localRSInterface.child(23, 11228, 38, 203);
        localRSInterface = RSInterface.addTabInterface(14000);
        localRSInterface.width = 474;
        localRSInterface.height = 213;
        localRSInterface.scrollMax = 305;
        for (i = 14001; i <= 14030; ++i) {
            RSInterface.addText(i, "", TDA, 1, 16777215, false, true);
        }
        localRSInterface.totalChildren(30);
        i = 0;
        int j = 5;
        int k = 14001;
        while (k <= 14030) {
            localRSInterface.child(i, k, 248, j);
            ++i;
            j += 13;
            ++k;
        }
    }

    public static void summoning(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addTabInterface(25605);
        RSInterface.addSprite(25606, 4, "Summon/SUMMON");
        RSInterface.addSprite(25607, 5, "Summon/SUMMON");
        RSInterface.addSprite(25608, 9, "Summon/SUMMON");
        RSInterface.addButton(25609, 1, "Summon/SUMMON", "Call");
        RSInterface.addButton(25619, 2, "Summon/SUMMON", "Renew");
        RSInterface.addButton(25610, 3, "Summon/SUMMON", "Dismiss");
        RSInterface.addSprite(25611, 7, "Summon/SUMMON");
        RSInterface.addText(25612, "99/99", tda, 1, 12890228, false, true);
        RSInterface.addText(25616, "SA.", tda, 1, 16748608, false, true);
        RSInterface.addText(25614, "Familiar", tda, 2, 13408512, true, true);
        RSInterface.addText(25615, "99.99", tda, 1, 12890228, false, true);
        RSInterface.addButton(25613, 8, "Summon/SUMMON", "Special Move");
        RSInterface.addText(25617, "Special Move 60/60", tda, 1, 16777215, false, true);
        RSInterface.addSprite(25618, 11, "Summon/SUMMON");
        RSInterface.addHead2(25618, 250, 250, 2000);
        tab.totalChildren(14);
        tab.child(0, 25606, 11, 163);
        tab.child(1, 25607, 12, 141);
        tab.child(2, 25608, 9, 29);
        tab.child(3, 25609, 23, 211);
        tab.child(4, 25610, 121, 211);
        tab.child(5, 25611, 20, 10);
        tab.child(6, 25612, 29, 194);
        tab.child(7, 25613, 9, 29);
        tab.child(8, 25614, 97, 144);
        tab.child(9, 25615, 127, 194);
        tab.child(10, 25616, 20, 63);
        tab.child(11, 25617, 35, 10);
        tab.child(12, 25618, 70, 59);
        tab.child(13, 25619, 72, 211);
    }

    public static void pouchCreation(TextDrawingArea[] TDA) {
        int i;
        int totalScrolls = pouchItems.length;
        int xPadding = 53;
        int yPadding = 57;
        int xPos = 13;
        int yPos = 20;
        RSInterface rsinterface = RSInterface.addTabInterface(23471);
        RSInterface.setChildren(7, rsinterface);
        RSInterface.addSprite(23472, 1, "interfaces/summoning/creation/summoning");
        RSInterface.addButton(23475, 0, "interfaces/summoning/creation/tab", "Transform Scolls");
        RSInterface.addSprite(23474, 1, "interfaces/summoning/creation/pouch");
        RSInterface.addSprite(23473, 1, "interfaces/summoning/creation/tab");
        RSInterface.addSprite(23476, 0, "interfaces/summoning/creation/scroll");
        RSInterface.addInAreaHover(23477, "interfaces/summoning/creation/close", 0, 1, 16, 16, "Close", 250, 3);
        RSInterface scroll = RSInterface.addTabInterface(23478);
        RSInterface.setChildren(3 * totalScrolls, scroll);
        for (i = 0; i < totalScrolls; ++i) {
            RSInterface.addInAreaHover(23479 + i * 8, "interfaces/summoning/creation/box", 0, 1, 48, 52, "nothing", -1, 0);
            int[] req = new int[]{1, 2, 3};
            RSInterface.addPouch(23480 + i * 8, req, 1, pouchItems[i], summoningLevelRequirements[i], pouchNames[i], TDA, i, 5);
            RSInterface.addSprite(23485 + i * 8, pouchItems[i], null, 50, 50);
            RSInterface.setBounds(23479 + i * 8, 36 + i % 8 * xPadding, 0 + i / 8 * yPadding, 0 + i * 2, scroll);
            RSInterface.setBounds(23480 + i * 8, 43 + i % 8 * xPadding, 2 + i / 8 * yPadding, 1 + i * 2, scroll);
        }
        i = 0;
        do {
            int drawY;
            if (i >= totalScrolls) {
                scroll.parentID = 23478;
                scroll.id = 23478;
                scroll.atActionType = 0;
                scroll.contentType = 0;
                scroll.width = 474;
                scroll.height = 257;
                scroll.scrollMax = 570;
                RSInterface.setBounds(23472, xPos, yPos, 0, rsinterface);
                RSInterface.setBounds(23473, xPos + 9, yPos + 9, 1, rsinterface);
                RSInterface.setBounds(23474, xPos + 29, yPos + 10, 2, rsinterface);
                RSInterface.setBounds(23475, xPos + 79, yPos + 9, 3, rsinterface);
                RSInterface.setBounds(23476, xPos + 106, yPos + 10, 4, rsinterface);
                RSInterface.setBounds(23477, xPos + 461, yPos + 10, 5, rsinterface);
                RSInterface.setBounds(23478, 0, yPos + 39, 6, rsinterface);
                return;
            }
            int drawX = 5 + i % 8 * xPadding;
            if (drawX > 292) {
                drawX -= 90;
            }
            if ((drawY = 55 + i / 8 * yPadding) > 160) {
                drawY -= 80;
            }
            RSInterface.setBounds(23481 + i * 8, drawX, drawY, 2 + (totalScrolls - 1) * 2 + i, scroll);
            ++i;
        } while (true);
    }

    public static void scrollCreation(TextDrawingArea[] TDA) {
        int i;
        int totalScrolls = pouchItems.length;
        int xPadding = 53;
        int yPadding = 57;
        int xPos = 13;
        int yPos = 20;
        RSInterface rsinterface = RSInterface.addTabInterface(22760);
        RSInterface.setChildren(7, rsinterface);
        RSInterface.addSprite(22761, 0, "interfaces/summoning/creation/summoning");
        RSInterface.addButton(22762, 0, "interfaces/summoning/creation/tab", "Infuse Pouches");
        RSInterface.addSprite(22763, 0, "interfaces/summoning/creation/pouch");
        RSInterface.addSprite(22764, 1, "interfaces/summoning/creation/tab");
        RSInterface.addSprite(22765, 1, "interfaces/summoning/creation/scroll");
        RSInterface.addInAreaHover(22766, "interfaces/summoning/creation/close", 0, 1, 16, 16, "Close", 250, 3);
        RSInterface scroll = RSInterface.addTabInterface(22767);
        RSInterface.setChildren(4 * totalScrolls, scroll);
        for (i = 0; i < totalScrolls; ++i) {
            RSInterface.addInAreaHover(22768 + i * 9, "interfaces/summoning/creation/box", 0, 1, 48, 52, "nothing", -1, 0);
            RSInterface.addScroll(22769 + i * 9, pouchItems[i], 1, scrollItems[i], summoningLevelRequirements[i], scrollNames[i], TDA, i, 5);
            RSInterface.addSprite(22776 + i * 9, pouchItems[i], null, 50, 50);
            RSInterface.setBounds(22768 + i * 9, 36 + i % 8 * xPadding, 0 + i / 8 * yPadding, 0 + i * 3, scroll);
            RSInterface.setBounds(22769 + i * 9, 43 + i % 8 * xPadding, 2 + i / 8 * yPadding, 1 + i * 3, scroll);
            RSInterface.setBounds(22776 + i * 9, 28 + i % 8 * xPadding, 28 + i / 8 * yPadding, 2 + i * 3, scroll);
        }
        i = 0;
        do {
            int drawY;
            if (i >= totalScrolls) {
                scroll.parentID = 22767;
                scroll.id = 22767;
                scroll.atActionType = 0;
                scroll.contentType = 0;
                scroll.width = 474;
                scroll.height = 257;
                scroll.scrollMax = 570;
                RSInterface.setBounds(22761, xPos, yPos, 0, rsinterface);
                RSInterface.setBounds(22762, xPos + 9, yPos + 9, 1, rsinterface);
                RSInterface.setBounds(22763, xPos + 29, yPos + 10, 2, rsinterface);
                RSInterface.setBounds(22764, xPos + 79, yPos + 9, 3, rsinterface);
                RSInterface.setBounds(22765, xPos + 106, yPos + 10, 4, rsinterface);
                RSInterface.setBounds(22766, xPos + 461, yPos + 10, 5, rsinterface);
                RSInterface.setBounds(22767, 0, yPos + 39, 6, rsinterface);
                return;
            }
            int drawX = 5 + i % 8 * xPadding;
            if (drawX > 292) {
                drawX -= 90;
            }
            if ((drawY = 55 + i / 8 * yPadding) > 160) {
                drawY -= 80;
            }
            RSInterface.setBounds(22770 + i * 9, drawX, drawY, 3 + (totalScrolls - 1) * 3 + i, scroll);
            ++i;
        } while (true);
    }

    public static void addScroll(int ID, int r1, int ra1, int r2, int lvl, String name, TextDrawingArea[] TDA, int imageID, int type) {
        RSInterface rsInterface = RSInterface.addTabInterface(ID);
        rsInterface.id = ID;
        rsInterface.parentID = 1151;
        rsInterface.type = 5;
        rsInterface.atActionType = type;
        rsInterface.contentType = 0;
        rsInterface.mOverInterToTrigger = ID + 1;
        rsInterface.width = 32;
        rsInterface.height = 32;
        rsInterface.tooltip = "Transform @or1@" + name;
        rsInterface.spellName = name;
        rsInterface.valueCompareType = new int[2];
        rsInterface.requiredValues = new int[2];
        rsInterface.valueCompareType[0] = 3;
        rsInterface.requiredValues[0] = ra1;
        rsInterface.valueCompareType[1] = 3;
        rsInterface.requiredValues[1] = lvl - 1;
        rsInterface.valueIndexArray = new int[3][];
        rsInterface.valueIndexArray[0] = new int[4];
        rsInterface.valueIndexArray[0][0] = 4;
        rsInterface.valueIndexArray[0][1] = 3214;
        rsInterface.valueIndexArray[0][2] = r1;
        rsInterface.valueIndexArray[0][3] = 0;
        rsInterface.valueIndexArray[1] = new int[3];
        rsInterface.valueIndexArray[1][0] = 1;
        rsInterface.valueIndexArray[1][1] = 6;
        rsInterface.valueIndexArray[1][2] = 0;
        rsInterface.itemSpriteId1 = r2;
        rsInterface.itemSpriteId2 = r2;
        rsInterface.itemSpriteIndex = imageID;
        rsInterface.greyScale = true;
        RSInterface hover = RSInterface.addTabInterface(ID + 1);
        hover.mOverInterToTrigger = -1;
        hover.isMouseoverTriggered = true;
        RSInterface.setChildren(5, hover);
        RSInterface.addSprite(ID + 2, 0, "Lunar/BOX");
        RSInterface.addText(ID + 3, "Level " + lvl + ": " + name, 16750623, true, true, 52, 1);
        RSInterface.addText(ID + 4, "This item requires", 11495962, true, true, 52, 0);
        RSInterface.addRuneText(ID + 5, ra1, r1, TDA);
        RSInterface.addSprite(ID + 6, r1, null);
        RSInterface.setBounds(ID + 2, 0, 0, 0, hover);
        RSInterface.setBounds(ID + 3, 90, 4, 1, hover);
        RSInterface.setBounds(ID + 4, 90, 19, 2, hover);
        RSInterface.setBounds(ID + 5, 87, 66, 3, hover);
        RSInterface.setBounds(ID + 6, 72, 33, 4, hover);
    }

    public static void addPouch(int ID, int[] r1, int ra1, int r2, int lvl, String name, TextDrawingArea[] TDA, int imageID, int type) {
        RSInterface rsInterface = RSInterface.addTabInterface(ID);
        rsInterface.id = ID;
        rsInterface.parentID = 1151;
        rsInterface.type = 5;
        rsInterface.atActionType = type;
        rsInterface.contentType = 0;
        rsInterface.mOverInterToTrigger = ID + 1;
        rsInterface.width = 32;
        rsInterface.height = 32;
        rsInterface.tooltip = "Infuse @or1@" + name;
        rsInterface.spellName = name;
        rsInterface.valueCompareType = new int[2];
        rsInterface.requiredValues = new int[2];
        rsInterface.valueCompareType[0] = 3;
        rsInterface.requiredValues[0] = ra1;
        rsInterface.valueCompareType[1] = 3;
        rsInterface.requiredValues[1] = lvl - 1;
        rsInterface.valueIndexArray = new int[2 + r1.length][];
        int i = 0;
        do {
            if (i >= r1.length) {
                rsInterface.valueIndexArray[1] = new int[3];
                rsInterface.valueIndexArray[1][0] = 1;
                rsInterface.valueIndexArray[1][1] = 6;
                rsInterface.valueIndexArray[1][2] = 0;
                rsInterface.itemSpriteId1 = r2;
                rsInterface.itemSpriteId2 = r2;
                rsInterface.itemSpriteIndex = imageID;
                rsInterface.greyScale = true;
                RSInterface hover = RSInterface.addTabInterface(ID + 1);
                hover.mOverInterToTrigger = -1;
                hover.isMouseoverTriggered = true;
                RSInterface.setChildren(5, hover);
                RSInterface.addSprite(ID + 2, 0, "Lunar/BOX");
                RSInterface.addText(ID + 3, "Level " + lvl + ": " + name, 16750623, true, true, 52, 1);
                RSInterface.addText(ID + 4, "This item requires", 11495962, true, true, 52, 0);
                RSInterface.addRuneText(ID + 5, ra1, r1[0], TDA);
                RSInterface.addSprite(ID + 6, r1[0], null);
                RSInterface.addSprite(ID + 7, r1[1], null);
                RSInterface.addSprite(ID + 8, r1[2], null);
                RSInterface.setBounds(ID + 2, 0, 0, 0, hover);
                RSInterface.setBounds(ID + 3, 90, 4, 1, hover);
                RSInterface.setBounds(ID + 4, 90, 19, 2, hover);
                RSInterface.setBounds(ID + 5, 87, 66, 3, hover);
                RSInterface.setBounds(ID + 6, 14, 33, 4, hover);
                return;
            }
            rsInterface.valueIndexArray[i] = new int[4];
            rsInterface.valueIndexArray[i][0] = 4;
            rsInterface.valueIndexArray[i][1] = 3214;
            rsInterface.valueIndexArray[i][2] = r1[i];
            rsInterface.valueIndexArray[i][3] = 0;
            ++i;
        } while (true);
    }

    public static void skillInterface(TextDrawingArea[] wid) {
        RSInterface rsinterface = RSInterface.addTabInterface(3917);
        RSInterface.skillInterface(19746, 255);
        RSInterface.skillInterface(19749, 52);
        RSInterface.addText(29801, "", wid, 0, 16772659);
        RSInterface.addText(29800, "", wid, 0, 16772659);
        RSInterface.addButton(19747, 51, 27700, "Skill/Skill", 62, 32, "View @lre@Hunter @whi@Guide", 1);
        RSInterface.addButton(19748, 50, 27701, "Skill/Skill", 62, 32, "@lre@Dismiss Summoning Familiar@whi@", 1);
        RSInterface.addText(13984, "Total", wid, 0, 16772659);
        RSInterface.addText(3985, "", wid, 0, 16772659);
        RSInterface.addText(13983, "", wid, 0, 16772659, true, true);
        int k = 0;
        do {
            if (k >= boxIds.length) {
                rsinterface.children = new int[63];
                rsinterface.childX = new int[63];
                rsinterface.childY = new int[63];
                rsinterface.children[0] = 3918;
                rsinterface.childX[0] = 0;
                rsinterface.childY[0] = 0;
                rsinterface.children[1] = 3925;
                rsinterface.childX[1] = 0;
                rsinterface.childY[1] = 31;
                rsinterface.children[2] = 3932;
                rsinterface.childX[2] = 0;
                rsinterface.childY[2] = 62;
                rsinterface.children[3] = 3939;
                rsinterface.childX[3] = 0;
                rsinterface.childY[3] = 93;
                rsinterface.children[4] = 3946;
                rsinterface.childX[4] = 0;
                rsinterface.childY[4] = 124;
                rsinterface.children[5] = 3953;
                rsinterface.childX[5] = 0;
                rsinterface.childY[5] = 155;
                rsinterface.children[6] = 4148;
                rsinterface.childX[6] = 0;
                rsinterface.childY[6] = 186;
                rsinterface.children[7] = 19746;
                rsinterface.childX[7] = 70;
                rsinterface.childY[7] = 69;
                rsinterface.children[8] = 19748;
                rsinterface.childX[8] = 1;
                rsinterface.childY[8] = 219;
                rsinterface.children[9] = 19747;
                rsinterface.childX[9] = 64;
                rsinterface.childY[9] = 219;
                rsinterface.children[10] = 14000;
                rsinterface.childX[10] = 10;
                rsinterface.childY[10] = 219;
                rsinterface.children[11] = 19749;
                rsinterface.childX[11] = 128;
                rsinterface.childY[11] = 220;
                rsinterface.children[12] = 13983;
                rsinterface.childX[12] = 158;
                rsinterface.childY[12] = 238;
                rsinterface.children[13] = 3984;
                rsinterface.childX[13] = 300;
                rsinterface.childY[13] = 225;
                rsinterface.children[14] = 3985;
                rsinterface.childX[14] = 130;
                rsinterface.childY[14] = 238;
                rsinterface.children[15] = 29800;
                rsinterface.childX[15] = 98;
                rsinterface.childY[15] = 220;
                rsinterface.children[16] = 29800;
                rsinterface.childX[16] = 107;
                rsinterface.childY[16] = 235;
                rsinterface.children[17] = 29801;
                rsinterface.childX[17] = 36;
                rsinterface.childY[17] = 220;
                rsinterface.children[18] = 29801;
                rsinterface.childX[18] = 45;
                rsinterface.childY[18] = 235;
                rsinterface.children[19] = 4040;
                rsinterface.childX[19] = 5;
                rsinterface.childY[19] = 20;
                rsinterface.children[20] = 8654;
                rsinterface.childX[20] = 0;
                rsinterface.childY[20] = 2;
                rsinterface.children[21] = 8655;
                rsinterface.childX[21] = 64;
                rsinterface.childY[21] = 2;
                rsinterface.children[22] = 4076;
                rsinterface.childX[22] = 20;
                rsinterface.childY[22] = 20;
                rsinterface.children[23] = 8656;
                rsinterface.childX[23] = 128;
                rsinterface.childY[23] = 2;
                rsinterface.children[24] = 4112;
                rsinterface.childX[24] = 20;
                rsinterface.childY[24] = 20;
                rsinterface.children[25] = 8657;
                rsinterface.childX[25] = 0;
                rsinterface.childY[25] = 33;
                rsinterface.children[26] = 4046;
                rsinterface.childX[26] = 20;
                rsinterface.childY[26] = 50;
                rsinterface.children[27] = 8658;
                rsinterface.childX[27] = 64;
                rsinterface.childY[27] = 33;
                rsinterface.children[28] = 4082;
                rsinterface.childX[28] = 20;
                rsinterface.childY[28] = 50;
                rsinterface.children[29] = 8659;
                rsinterface.childX[29] = 128;
                rsinterface.childY[29] = 33;
                rsinterface.children[30] = 4118;
                rsinterface.childX[30] = 20;
                rsinterface.childY[30] = 50;
                rsinterface.children[31] = 8660;
                rsinterface.childX[31] = 0;
                rsinterface.childY[31] = 70;
                rsinterface.children[32] = 4052;
                rsinterface.childX[32] = 20;
                rsinterface.childY[32] = 83;
                rsinterface.children[33] = 8661;
                rsinterface.childX[33] = 65;
                rsinterface.childY[33] = 70;
                rsinterface.children[34] = 4088;
                rsinterface.childX[34] = 20;
                rsinterface.childY[34] = 83;
                rsinterface.children[35] = 8662;
                rsinterface.childX[35] = 130;
                rsinterface.childY[35] = 70;
                rsinterface.children[36] = 4124;
                rsinterface.childX[36] = 20;
                rsinterface.childY[36] = 83;
                rsinterface.children[37] = 8663;
                rsinterface.childX[37] = 0;
                rsinterface.childY[37] = 100;
                rsinterface.children[38] = 4058;
                rsinterface.childX[38] = 20;
                rsinterface.childY[38] = 120;
                rsinterface.children[39] = 8664;
                rsinterface.childX[39] = 65;
                rsinterface.childY[39] = 100;
                rsinterface.children[40] = 4094;
                rsinterface.childX[40] = 20;
                rsinterface.childY[40] = 120;
                rsinterface.children[41] = 8665;
                rsinterface.childX[41] = 130;
                rsinterface.childY[41] = 100;
                rsinterface.children[42] = 4130;
                rsinterface.childX[42] = 20;
                rsinterface.childY[42] = 120;
                rsinterface.children[43] = 8666;
                rsinterface.childX[43] = 0;
                rsinterface.childY[43] = 130;
                rsinterface.children[44] = 4064;
                rsinterface.childX[44] = 20;
                rsinterface.childY[44] = 150;
                rsinterface.children[45] = 8667;
                rsinterface.childX[45] = 65;
                rsinterface.childY[45] = 130;
                rsinterface.children[46] = 4100;
                rsinterface.childX[46] = 20;
                rsinterface.childY[46] = 150;
                rsinterface.children[47] = 8668;
                rsinterface.childX[47] = 130;
                rsinterface.childY[47] = 130;
                rsinterface.children[48] = 4136;
                rsinterface.childX[48] = 20;
                rsinterface.childY[48] = 150;
                rsinterface.children[49] = 8669;
                rsinterface.childX[49] = 0;
                rsinterface.childY[49] = 160;
                rsinterface.children[50] = 4070;
                rsinterface.childX[50] = 20;
                rsinterface.childY[50] = 180;
                rsinterface.children[51] = 8670;
                rsinterface.childX[51] = 65;
                rsinterface.childY[51] = 160;
                rsinterface.children[52] = 4106;
                rsinterface.childX[52] = 20;
                rsinterface.childY[52] = 180;
                rsinterface.children[53] = 8671;
                rsinterface.childX[53] = 130;
                rsinterface.childY[53] = 160;
                rsinterface.children[54] = 4142;
                rsinterface.childX[54] = 20;
                rsinterface.childY[54] = 180;
                rsinterface.children[55] = 8672;
                rsinterface.childX[55] = 0;
                rsinterface.childY[55] = 190;
                rsinterface.children[56] = 4160;
                rsinterface.childX[56] = 20;
                rsinterface.childY[56] = 150;
                rsinterface.children[57] = 4160;
                rsinterface.childX[57] = 20;
                rsinterface.childY[57] = 150;
                rsinterface.children[58] = 12162;
                rsinterface.childX[58] = 65;
                rsinterface.childY[58] = 190;
                rsinterface.children[59] = 2832;
                rsinterface.childX[59] = 20;
                rsinterface.childY[59] = 150;
                rsinterface.children[60] = 13928;
                rsinterface.childX[60] = 130;
                rsinterface.childY[60] = 190;
                rsinterface.children[61] = 13917;
                rsinterface.childX[61] = 20;
                rsinterface.childY[61] = 150;
                rsinterface.children[62] = 13984;
                rsinterface.childX[62] = 145;
                rsinterface.childY[62] = 225;
                return;
            }
            RSInterface.skillInterface(boxIds[k], 256);
            ++k;
        } while (true);
    }

    public static void skillInterface(int i, int j) {
        RSInterface rsinterface = RSInterface.interfaceCache[i] = new RSInterface();
        rsinterface.id = i;
        rsinterface.parentID = i;
        rsinterface.type = 5;
        rsinterface.atActionType = 0;
        rsinterface.contentType = 0;
        rsinterface.width = 26;
        rsinterface.height = 34;
        rsinterface.opacity = 0;
        rsinterface.mOverInterToTrigger = 0;
        rsinterface.sprite1 = RSInterface.imageLoader(j, "Skill/Skill");
        rsinterface.sprite2 = RSInterface.imageLoader(j, "Skill/Skill");
    }

    public static void addButton(int i, int j, int hoverId, String name, int W, int H, String S, int AT) {
        RSInterface RSInterface2 = RSInterface.addInterface(i);
        RSInterface2.id = i;
        RSInterface2.parentID = i;
        RSInterface2.type = 5;
        RSInterface2.atActionType = AT;
        RSInterface2.opacity = 0;
        RSInterface2.mOverInterToTrigger = hoverId;
        RSInterface2.sprite1 = RSInterface.imageLoader(j, name);
        RSInterface2.sprite2 = RSInterface.imageLoader(j, name);
        RSInterface2.width = W;
        RSInterface2.height = H;
        RSInterface2.tooltip = S;
    }

    public static void addText(int id, String text, TextDrawingArea[] wid, int idx, int color) {
        RSInterface rsinterface = RSInterface.addTabInterface(id);
        rsinterface.id = id;
        rsinterface.parentID = id;
        rsinterface.type = 4;
        rsinterface.atActionType = 0;
        rsinterface.width = 174;
        rsinterface.height = 11;
        rsinterface.contentType = 0;
        rsinterface.opacity = 0;
        rsinterface.mOverInterToTrigger = -1;
        rsinterface.center = false;
        rsinterface.textShadow = true;
        rsinterface.textDrawingAreas = wid[idx];
        rsinterface.message = text;
        rsinterface.textColor = color;
    }

    public static void addHDHoverButton(int i, String imageName, int j, int width, int height, String text, int contentType, int hoverOver, int aT) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 12;
        tab.atActionType = aT;
        tab.contentType = contentType;
        tab.mOverInterToTrigger = hoverOver;
        tab.sprite1 = RSInterface.imageLoader(j, imageName);
        tab.sprite2 = RSInterface.imageLoader(j, imageName);
        tab.width = width;
        tab.height = height;
        tab.tooltip = text;
    }

    public static void addHDHoveredButton(int i, String imageName, int j, int w, int h, int IMAGEID) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.parentID = i;
        tab.id = i;
        tab.type = 0;
        tab.atActionType = 0;
        tab.width = w;
        tab.height = h;
        tab.isMouseoverTriggered = true;
        tab.mOverInterToTrigger = -1;
        tab.scrollMax = 0;
        RSInterface.addHDHoverImage(IMAGEID, j, j, imageName);
        tab.totalChildren(1);
        tab.child(0, IMAGEID, 0, 0);
    }

    public static void addHDHoverImage(int i, int j, int k, String name) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 12;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = 512;
        tab.height = 334;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = RSInterface.imageLoader(j, name);
        tab.sprite2 = RSInterface.imageLoader(k, name);
    }

    public static void itemsOnDeath(TextDrawingArea[] wid) {
        RSInterface rsinterface = RSInterface.addInterface(17100);
        RSInterface.addSprite(17101, 92);
        RSInterface.addHoverButton(17102, 12, 17, 17, "Close Window", 0, 10601, 3);
        RSInterface.addHoveredButton(10601, 13, 17, 17, 10602);
        RSInterface.addText(17103, "", wid, 2, 16750623);
        RSInterface.addText(17104, "Items you will keep on death (if not skulled):", wid, 1, 16750623);
        RSInterface.addText(17105, "Items you will lose on death (if not skulled):", wid, 1, 16750623);
        RSInterface.addText(17106, "Information", wid, 1, 16750623);
        RSInterface.addText(17107, "Max items kept on death:", wid, 1, 16763955);
        RSInterface.addText(17108, "~ 3 ~", wid, 1, 16763955);
        rsinterface.scrollMax = 0;
        rsinterface.isMouseoverTriggered = false;
        rsinterface.children = new int[12];
        rsinterface.childX = new int[12];
        rsinterface.childY = new int[12];
        rsinterface.children[0] = 17101;
        rsinterface.childX[0] = 7;
        rsinterface.childY[0] = 8;
        rsinterface.children[1] = 17102;
        rsinterface.childX[1] = 480;
        rsinterface.childY[1] = 17;
        rsinterface.children[2] = 17103;
        rsinterface.childX[2] = 185;
        rsinterface.childY[2] = 18;
        rsinterface.children[3] = 17104;
        rsinterface.childX[3] = 22;
        rsinterface.childY[3] = 50;
        rsinterface.children[4] = 17105;
        rsinterface.childX[4] = 22;
        rsinterface.childY[4] = 110;
        rsinterface.children[5] = 17106;
        rsinterface.childX[5] = 347;
        rsinterface.childY[5] = 47;
        rsinterface.children[6] = 17107;
        rsinterface.childX[6] = 349;
        rsinterface.childY[6] = 270;
        rsinterface.children[7] = 17108;
        rsinterface.childX[7] = 398;
        rsinterface.childY[7] = 298;
        rsinterface.children[8] = 17115;
        rsinterface.childX[8] = 348;
        rsinterface.childY[8] = 64;
        rsinterface.children[9] = 10494;
        rsinterface.childX[9] = 26;
        rsinterface.childY[9] = 74;
        rsinterface.children[10] = 10600;
        rsinterface.childX[10] = 26;
        rsinterface.childY[10] = 133;
        rsinterface.children[11] = 10601;
        rsinterface.childX[11] = 480;
        rsinterface.childY[11] = 17;
    }

    public static void itemsOnDeathDATA(TextDrawingArea[] wid) {
        RSInterface rsinterface = RSInterface.addInterface(17115);
        RSInterface.addText(17109, "", wid, 0, 16750623);
        RSInterface.addText(17110, "The normal amount of", wid, 0, 16750623);
        RSInterface.addText(17111, "items kept is three.", wid, 0, 16750623);
        RSInterface.addText(17112, "", wid, 0, 16750623);
        RSInterface.addText(17113, "If you are skulled,", wid, 0, 16750623);
        RSInterface.addText(17114, "you will lose all your", wid, 0, 16750623);
        RSInterface.addText(17117, "items, unless an item", wid, 0, 16750623);
        RSInterface.addText(17118, "protecting prayer is", wid, 0, 16750623);
        RSInterface.addText(17119, "used.", wid, 0, 16750623);
        RSInterface.addText(17120, "", wid, 0, 16750623);
        RSInterface.addText(17121, "Item protecting prayers", wid, 0, 16750623);
        RSInterface.addText(17122, "will allow you to keep", wid, 0, 16750623);
        RSInterface.addText(17123, "one extra item.", wid, 0, 16750623);
        RSInterface.addText(17124, "", wid, 0, 16750623);
        RSInterface.addText(17125, "The items kept are", wid, 0, 16750623);
        RSInterface.addText(17126, "selected by the server", wid, 0, 16750623);
        RSInterface.addText(17127, "and include the most", wid, 0, 16750623);
        RSInterface.addText(17128, "expensive items you're", wid, 0, 16750623);
        RSInterface.addText(17129, "carrying.", wid, 0, 16750623);
        RSInterface.addText(17130, "", wid, 0, 16750623);
        rsinterface.parentID = 17115;
        rsinterface.id = 17115;
        rsinterface.type = 0;
        rsinterface.atActionType = 0;
        rsinterface.contentType = 0;
        rsinterface.width = 130;
        rsinterface.height = 197;
        rsinterface.opacity = 0;
        rsinterface.mOverInterToTrigger = -1;
        rsinterface.scrollMax = 280;
        rsinterface.children = new int[20];
        rsinterface.childX = new int[20];
        rsinterface.childY = new int[20];
        rsinterface.children[0] = 17109;
        rsinterface.childX[0] = 0;
        rsinterface.childY[0] = 0;
        rsinterface.children[1] = 17110;
        rsinterface.childX[1] = 0;
        rsinterface.childY[1] = 12;
        rsinterface.children[2] = 17111;
        rsinterface.childX[2] = 0;
        rsinterface.childY[2] = 24;
        rsinterface.children[3] = 17112;
        rsinterface.childX[3] = 0;
        rsinterface.childY[3] = 36;
        rsinterface.children[4] = 17113;
        rsinterface.childX[4] = 0;
        rsinterface.childY[4] = 48;
        rsinterface.children[5] = 17114;
        rsinterface.childX[5] = 0;
        rsinterface.childY[5] = 60;
        rsinterface.children[6] = 17117;
        rsinterface.childX[6] = 0;
        rsinterface.childY[6] = 72;
        rsinterface.children[7] = 17118;
        rsinterface.childX[7] = 0;
        rsinterface.childY[7] = 84;
        rsinterface.children[8] = 17119;
        rsinterface.childX[8] = 0;
        rsinterface.childY[8] = 96;
        rsinterface.children[9] = 17120;
        rsinterface.childX[9] = 0;
        rsinterface.childY[9] = 108;
        rsinterface.children[10] = 17121;
        rsinterface.childX[10] = 0;
        rsinterface.childY[10] = 120;
        rsinterface.children[11] = 17122;
        rsinterface.childX[11] = 0;
        rsinterface.childY[11] = 132;
        rsinterface.children[12] = 17123;
        rsinterface.childX[12] = 0;
        rsinterface.childY[12] = 144;
        rsinterface.children[13] = 17124;
        rsinterface.childX[13] = 0;
        rsinterface.childY[13] = 156;
        rsinterface.children[14] = 17125;
        rsinterface.childX[14] = 0;
        rsinterface.childY[14] = 168;
        rsinterface.children[15] = 17126;
        rsinterface.childX[15] = 0;
        rsinterface.childY[15] = 180;
        rsinterface.children[16] = 17127;
        rsinterface.childX[16] = 0;
        rsinterface.childY[16] = 192;
        rsinterface.children[17] = 17128;
        rsinterface.childX[17] = 0;
        rsinterface.childY[17] = 204;
        rsinterface.children[18] = 17129;
        rsinterface.childX[18] = 0;
        rsinterface.childY[18] = 216;
        rsinterface.children[19] = 17130;
        rsinterface.childX[19] = 0;
        rsinterface.childY[19] = 228;
    }

    public void swapInventoryItems(int i, int j) {
        int k = this.inv[i];
        this.inv[i] = this.inv[j];
        this.inv[j] = k;
        k = this.invStackSizes[i];
        this.invStackSizes[i] = this.invStackSizes[j];
        this.invStackSizes[j] = k;
    }

    public static void Construction(TextDrawingArea[] TDA) {
        RSInterface Interface = RSInterface.addInterface(31250);
        RSInterface.setChildren(53, Interface);
        RSInterface.addHoverButton(29561, "Interfaces/Construction/BUTTON", 0, 16, 16, "Close", 0, 29562, 1);
        RSInterface.addHoveredButton(29562, "Interfaces/Construction/BUTTON", 1, 16, 16, 29563);
        RSInterface.addSprite(31249, 0, "Interfaces/Construction/CONSTRUCTION");
        RSInterface.addButton(31251, 0, "Interfaces/Construction/CONS", "Build @or1@Fern");
        RSInterface.addTooltip(31252, "Fern (lvl 1):\n1x Guam, 1x Logs");
        RSInterface.addButton(31254, 1, "Interfaces/Construction/CONS", "Build @or1@Tree");
        RSInterface.addTooltip(31255, "Tree (lvl 5):\n3x Logs");
        RSInterface.addButton(31257, 2, "Interfaces/Construction/CONS", "Build @or1@Chair");
        RSInterface.addTooltip(31258, "Chair (lvl 19):\n10x Nails, 2x Oak plank");
        RSInterface.addButton(31260, 3, "Interfaces/Construction/CONS", "Build @or1@Bookcase");
        RSInterface.addTooltip(31261, "Bookcase (lvl 29):\n15x Nails, 3x Oak plank");
        RSInterface.addButton(31263, 4, "Interfaces/Construction/CONS", "Build @or1@Greenman's ale");
        RSInterface.addTooltip(31264, "Greenamn's ale (lvl 26):\n15x Nails, 2x Oak plank");
        RSInterface.addButton(31266, 5, "Interfaces/Construction/CONS", "Build @or1@Small oven");
        RSInterface.addTooltip(31267, "Small oven (lvl 24):\n2x Iron bar");
        RSInterface.addButton(31269, 6, "Interfaces/Construction/CONS", "Build @or1@Carved oak bench");
        RSInterface.addTooltip(31270, "Carved oak bench (lvl 31):\n15x Nails, 3x Oak plank");
        RSInterface.addButton(31272, 7, "Interfaces/Construction/CONS", "Build @or1@Painting stand");
        RSInterface.addTooltip(31273, "Painting stand (lvl 41):\n20x Nails, 2x Oak plank");
        RSInterface.addButton(31275, 8, "Interfaces/Construction/CONS", "Build @or1@Bed");
        RSInterface.addTooltip(31276, "Bed (lvl 40):\n20x Nails, 3x Oak plank");
        RSInterface.addButton(31278, 9, "Interfaces/Construction/CONS", "Build @or1@Teak drawers");
        RSInterface.addTooltip(31279, "Teak drawers (lvl 51):\n20x Nails, 2x Teak plank");
        RSInterface.addButton(31281, 10, "Interfaces/Construction/CONS", "Build @or1@Mithril armour");
        RSInterface.addTooltip(31282, "Mithril armour (lvl 28):\n1x Mithril full helm, platebody, platelegs");
        RSInterface.addButton(31284, 11, "Interfaces/Construction/CONS", "Build @or1@Adamant armour");
        RSInterface.addTooltip(31285, "Adamant armour (lvl 28):\n1x Adamant full helm, platebody, platelegs");
        RSInterface.addButton(31287, 12, "Interfaces/Construction/CONS", "Build @or1@Rune armour");
        RSInterface.addTooltip(31288, "Rune armour (lvl 28):\n1x Rune full helm, platebody, platelegs");
        RSInterface.addButton(31290, 13, "Interfaces/Construction/CONS", "Build @or1@Rune display case");
        RSInterface.addTooltip(31291, "Rune display case (lvl 41):\n100x Law rune, 100x Nature rune, 1x Teak plank");
        RSInterface.addButton(31293, 14, "Interfaces/Construction/CONS", "Build @or1@Archery target");
        RSInterface.addTooltip(31294, "Archery target (lvl 81):\n25x Nails, 3x Teak plank");
        RSInterface.addButton(31296, 15, "Interfaces/Construction/CONS", "Build @or1@Combat stone");
        RSInterface.addTooltip(31297, "Combat stone (lvl 59):\n4x Iron bar");
        RSInterface.addButton(31299, 16, "Interfaces/Construction/CONS", "Build @or1@Elemental balance");
        RSInterface.addTooltip(31300, "Elemental balance (lvl 77):\n4x Iron bar");
        RSInterface.addButton(31302, 17, "Interfaces/Construction/CONS", "Build @or1@Mahogany prize chest");
        RSInterface.addTooltip(31303, "Mahogany prize chest (lvl 54):\n20x Nails, 2x Mahogany plank");
        RSInterface.addButton(31305, 18, "Interfaces/Construction/CONS", "Build @or1@Lectern");
        RSInterface.addTooltip(31306, "Lectern (lvl 67):\n40x Nails, 2x Mahogany plank");
        RSInterface.addButton(31308, 19, "Interfaces/Construction/CONS", "Build @or1@Crystal of power");
        RSInterface.addTooltip(31309, "Crystal of power (lvl 66):\n15x Nails, 2x Mahogany plank, 1x Iron bar");
        RSInterface.addButton(31311, 20, "Interfaces/Construction/CONS", "Build @or1@Altar");
        RSInterface.addTooltip(31312, "Altar (lvl 64):\n15x Nails, 2x Mahogany plank, 1x Iron bar");
        RSInterface.addButton(31314, 21, "Interfaces/Construction/CONS", "Build @or1@Intense burners");
        RSInterface.addTooltip(31315, "Intense burners (lvl 61):\n10x Nails, 2x Mahogany plank, 1x Kwuarm");
        RSInterface.addButton(31317, 22, "Interfaces/Construction/CONS", "Build @or1@Hedge");
        RSInterface.addTooltip(31318, "Hedge (lvl 80):\n2x Logs, 2x Kwuarm");
        RSInterface.addButton(31320, 23, "Interfaces/Construction/CONS", "Build @or1@Rocnar");
        RSInterface.addTooltip(31321, "Rocnar (lvl 83):\n2x Adamant bar, 2x Kwuarm");
        RSInterface.addButton(31323, 24, "Interfaces/Construction/CONS", "Build @or1@Bank chest");
        RSInterface.addTooltip(31324, "Bank chest (lvl 92):\n40x Nails, 2x Mahogany plank, 1x Iron bar");
        RSInterface.setBounds(29561, 413, 9, 1, Interface);
        RSInterface.setBounds(29562, 413, 9, 2, Interface);
        RSInterface.setBounds(31249, 69, 3, 0, Interface);
        RSInterface.setBounds(31251, 109, 28, 3, Interface);
        RSInterface.setBounds(31252, 76, 285, 4, Interface);
        RSInterface.setBounds(31254, 172, 28, 5, Interface);
        RSInterface.setBounds(31255, 76, 285, 6, Interface);
        RSInterface.setBounds(31257, 236, 28, 7, Interface);
        RSInterface.setBounds(31258, 76, 285, 8, Interface);
        RSInterface.setBounds(31260, 300, 28, 9, Interface);
        RSInterface.setBounds(31261, 76, 285, 10, Interface);
        RSInterface.setBounds(31263, 364, 28, 11, Interface);
        RSInterface.setBounds(31264, 76, 285, 12, Interface);
        RSInterface.setBounds(31266, 109, 76, 13, Interface);
        RSInterface.setBounds(31267, 76, 285, 14, Interface);
        RSInterface.setBounds(31269, 172, 76, 15, Interface);
        RSInterface.setBounds(31270, 76, 285, 16, Interface);
        RSInterface.setBounds(31272, 236, 76, 17, Interface);
        RSInterface.setBounds(31273, 76, 285, 18, Interface);
        RSInterface.setBounds(31275, 300, 76, 19, Interface);
        RSInterface.setBounds(31276, 76, 285, 20, Interface);
        RSInterface.setBounds(31278, 364, 76, 21, Interface);
        RSInterface.setBounds(31279, 76, 285, 22, Interface);
        RSInterface.setBounds(31281, 109, 124, 23, Interface);
        RSInterface.setBounds(31282, 76, 285, 24, Interface);
        RSInterface.setBounds(31284, 172, 124, 25, Interface);
        RSInterface.setBounds(31285, 76, 285, 26, Interface);
        RSInterface.setBounds(31287, 236, 124, 27, Interface);
        RSInterface.setBounds(31288, 76, 285, 28, Interface);
        RSInterface.setBounds(31290, 300, 124, 29, Interface);
        RSInterface.setBounds(31291, 76, 285, 30, Interface);
        RSInterface.setBounds(31293, 364, 124, 31, Interface);
        RSInterface.setBounds(31294, 76, 285, 32, Interface);
        RSInterface.setBounds(31296, 109, 172, 33, Interface);
        RSInterface.setBounds(31297, 76, 285, 34, Interface);
        RSInterface.setBounds(31299, 172, 172, 35, Interface);
        RSInterface.setBounds(31300, 76, 285, 36, Interface);
        RSInterface.setBounds(31302, 236, 172, 37, Interface);
        RSInterface.setBounds(31303, 76, 285, 38, Interface);
        RSInterface.setBounds(31305, 300, 172, 39, Interface);
        RSInterface.setBounds(31306, 76, 285, 40, Interface);
        RSInterface.setBounds(31308, 364, 172, 41, Interface);
        RSInterface.setBounds(31309, 76, 285, 42, Interface);
        RSInterface.setBounds(31311, 109, 220, 43, Interface);
        RSInterface.setBounds(31312, 76, 285, 44, Interface);
        RSInterface.setBounds(31314, 172, 220, 45, Interface);
        RSInterface.setBounds(31315, 76, 285, 46, Interface);
        RSInterface.setBounds(31317, 236, 220, 47, Interface);
        RSInterface.setBounds(31318, 76, 285, 48, Interface);
        RSInterface.setBounds(31320, 300, 220, 49, Interface);
        RSInterface.setBounds(31321, 76, 285, 50, Interface);
        RSInterface.setBounds(31323, 364, 220, 51, Interface);
        RSInterface.setBounds(31324, 76, 285, 52, Interface);
        Interface = RSInterface.addInterface(31330);
        RSInterface.addSprite(31329, 1, "Interfaces/Construction/CONSTRUCTION");
        RSInterface.addHoverButton(31331, "Interfaces/Construction/BUTTON", 2, 90, 44, "Choose", 0, 31332, 1);
        RSInterface.addHoveredButton(31332, "Interfaces/Construction/BUTTON", 4, 90, 44, 31333);
        RSInterface.addHoverButton(31334, "Interfaces/Construction/BUTTON", 2, 90, 44, "Choose", 0, 31335, 1);
        RSInterface.addHoveredButton(31335, "Interfaces/Construction/BUTTON", 4, 90, 44, 31336);
        RSInterface.addText(31337, "Public", 16772659, false, true, 52, TDA, 2);
        RSInterface.addText(31338, "Private", 16772659, false, true, 52, TDA, 2);
        RSInterface.addHoverButton(29561, "Interfaces/Construction/BUTTON", 0, 16, 16, "Close", 0, 29562, 1);
        RSInterface.addHoveredButton(29562, "Interfaces/Construction/BUTTON", 1, 16, 16, 29563);
        RSInterface.setChildren(9, Interface);
        RSInterface.setBounds(31329, 169, 79, 0, Interface);
        RSInterface.setBounds(31331, 195, 95, 1, Interface);
        RSInterface.setBounds(31332, 195, 95, 2, Interface);
        RSInterface.setBounds(31334, 195, 157, 3, Interface);
        RSInterface.setBounds(31335, 195, 157, 4, Interface);
        RSInterface.setBounds(31337, 210, 108, 5, Interface);
        RSInterface.setBounds(31338, 210, 170, 6, Interface);
        RSInterface.setBounds(29561, 289, 85, 7, Interface);
        RSInterface.setBounds(29562, 289, 85, 8, Interface);
    }

    public static void summoningLevelUp(TextDrawingArea[] wid) {
        RSInterface Interface = RSInterface.addTabInterface(22602);
        RSInterface.setChildren(2, Interface);
        RSInterface.addSprite(22603, 0, "interfaces/summoning/cons2/levelup");
        RSInterface.setBounds(6206, 0, 5, 0, Interface);
        RSInterface.setBounds(22603, 22, 5, 1, Interface);
    }

    public static void Trade(TextDrawingArea[] TDA) {
        RSInterface Interface = RSInterface.addTabInterface(3323);
        RSInterface.setChildren(15, Interface);
        RSInterface.addSprite(3324, 6, "Bank/TRADE");
        RSInterface.addHover(3442, 3, 0, 3325, 1, "Bank/BANK", 17, 17, "Close Window");
        RSInterface.addHovered(3325, 2, "Bank/BANK", 17, 17, 3326);
        RSInterface.addText(3417, "Trading With:", 16750899, true, true, 52, TDA, 2);
        RSInterface.addText(3418, "Trader's Offer", 16750899, false, true, 52, TDA, 1);
        RSInterface.addText(3419, "Your Offer", 16750899, false, true, 52, TDA, 1);
        RSInterface.addText(3421, "Accept", 49152, true, true, 52, TDA, 1);
        RSInterface.addText(3423, "Decline", 12582912, true, true, 52, TDA, 1);
        RSInterface.addText(3431, "Waiting For Other Player", 16777215, true, true, 52, TDA, 1);
        RSInterface.addHover(3420, 1, 0, 3327, 5, "Bank/TRADE", 65, 32, "Accept");
        RSInterface.addHovered(3327, 2, "Bank/TRADE", 65, 32, 3328);
        RSInterface.addHover(3422, 3, 0, 3329, 5, "Bank/TRADE", 65, 32, "Close Window");
        RSInterface.addHovered(3329, 2, "Bank/TRADE", 65, 32, 3330);
        RSInterface.setBounds(3324, 0, 16, 0, Interface);
        RSInterface.setBounds(3442, 485, 24, 1, Interface);
        RSInterface.setBounds(3325, 485, 24, 2, Interface);
        RSInterface.setBounds(3417, 258, 25, 3, Interface);
        RSInterface.setBounds(3418, 355, 51, 4, Interface);
        RSInterface.setBounds(3419, 68, 51, 5, Interface);
        RSInterface.setBounds(3420, 223, 120, 6, Interface);
        RSInterface.setBounds(3327, 223, 120, 7, Interface);
        RSInterface.setBounds(3422, 223, 160, 8, Interface);
        RSInterface.setBounds(3329, 223, 160, 9, Interface);
        RSInterface.setBounds(3421, 256, 127, 10, Interface);
        RSInterface.setBounds(3423, 256, 167, 11, Interface);
        RSInterface.setBounds(3431, 256, 272, 12, Interface);
        RSInterface.setBounds(3415, 12, 64, 13, Interface);
        RSInterface.setBounds(3416, 321, 64, 14, Interface);
        Interface = RSInterface.addTabInterface(3443);
        RSInterface.setChildren(15, Interface);
        RSInterface.addSprite(3444, 3, "Bank/TRADE");
        RSInterface.addButton(3546, 2, "Bank/SHOP", 63, 24, "Accept", 1);
        RSInterface.addButton(3548, 2, "Bank/SHOP", 63, 24, "Decline", 3);
        RSInterface.addText(3547, "Accept", 49152, true, true, 52, TDA, 1);
        RSInterface.addText(3549, "Decline", 12582912, true, true, 52, TDA, 1);
        RSInterface.addText(3450, "Trading With:", 65535, true, true, 52, TDA, 2);
        RSInterface.addText(3451, "Yourself", 65535, true, true, 52, TDA, 2);
        RSInterface.setBounds(3444, 12, 20, 0, Interface);
        RSInterface.setBounds(3442, 470, 32, 1, Interface);
        RSInterface.setBounds(3325, 470, 32, 2, Interface);
        RSInterface.setBounds(3535, 130, 28, 3, Interface);
        RSInterface.setBounds(3536, 105, 47, 4, Interface);
        RSInterface.setBounds(3546, 189, 295, 5, Interface);
        RSInterface.setBounds(3548, 258, 295, 6, Interface);
        RSInterface.setBounds(3547, 220, 299, 7, Interface);
        RSInterface.setBounds(3549, 288, 299, 8, Interface);
        RSInterface.setBounds(3557, 71, 87, 9, Interface);
        RSInterface.setBounds(3558, 315, 87, 10, Interface);
        RSInterface.setBounds(3533, 64, 70, 11, Interface);
        RSInterface.setBounds(3534, 297, 70, 12, Interface);
        RSInterface.setBounds(3450, 95, 289, 13, Interface);
        RSInterface.setBounds(3451, 95, 304, 14, Interface);
    }

    public static void Shop(TextDrawingArea[] TDA) {
        RSInterface rsinterface = RSInterface.addTabInterface(3824);
        RSInterface.setChildren(8, rsinterface);
        RSInterface.addSprite(3825, 0, "Shop/SHOP");
        RSInterface.addHover(3902, 3, 0, 3826, 1, "Shop/CLOSE", 17, 17, "Close Window");
        RSInterface.addHovered(3826, 2, "Shop/CLOSE", 17, 17, 3827);
        RSInterface.addText(19679, "", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(19680, "", 12547357, false, true, 52, TDA, 1);
        RSInterface.addButton(19681, 2, "Shop/SHOP", 0, 0, "", 1);
        RSInterface.addSprite(19687, 1, "Shop/ITEMBG");
        RSInterface.setBounds(3825, 6, 8, 0, rsinterface);
        RSInterface.setBounds(3902, 478, 10, 1, rsinterface);
        RSInterface.setBounds(3826, 478, 10, 2, rsinterface);
        RSInterface.setBounds(3900, 26, 44, 3, rsinterface);
        RSInterface.setBounds(3901, 240, 11, 4, rsinterface);
        RSInterface.setBounds(19679, 42, 54, 5, rsinterface);
        RSInterface.setBounds(19680, 150, 54, 6, rsinterface);
        RSInterface.setBounds(19681, 129, 50, 7, rsinterface);
        rsinterface = interfaceCache[3900];
        RSInterface.setChildren(1, rsinterface);
        RSInterface.setBounds(19687, 6, 15, 0, rsinterface);
        rsinterface.invSpritePadX = 15;
        rsinterface.width = 10;
        rsinterface.height = 4;
        rsinterface.invSpritePadY = 25;
        rsinterface = RSInterface.addTabInterface(19682);
        RSInterface.addSprite(19683, 1, "Shop/SHOP");
        RSInterface.addText(19684, "Main Stock", 12547357, false, true, 52, TDA, 1);
        RSInterface.addText(19685, "Store Info", 16750623, false, true, 52, TDA, 1);
        RSInterface.addButton(19686, 2, "Shop/SHOP", 95, 19, "Main Stock", 1);
        RSInterface.setChildren(7, rsinterface);
        RSInterface.setBounds(19683, 12, 12, 0, rsinterface);
        RSInterface.setBounds(3901, 240, 21, 1, rsinterface);
        RSInterface.setBounds(19684, 42, 54, 2, rsinterface);
        RSInterface.setBounds(19685, 150, 54, 3, rsinterface);
        RSInterface.setBounds(19686, 23, 50, 4, rsinterface);
        RSInterface.setBounds(3902, 471, 22, 5, rsinterface);
        RSInterface.setBounds(3826, 60, 85, 6, rsinterface);
    }

    public static void addBankHover(int interfaceID, int actionType, int hoverid, int spriteId, int spriteId2, int Width, int Height, int configFrame, int configId, String Tooltip, int hoverId2, int hoverSpriteId, int hoverSpriteId2, String hoverSpriteName, int hoverId3, String hoverDisabledText, String hoverEnabledText, int X, int Y) {
        RSInterface hover = RSInterface.addTabInterface(interfaceID);
        hover.id = interfaceID;
        hover.parentID = interfaceID;
        hover.type = 5;
        hover.atActionType = actionType;
        hover.contentType = 0;
        hover.opacity = 0;
        hover.mOverInterToTrigger = hoverid;
        hover.sprite1 = Client.cacheSprite[spriteId];
        hover.sprite2 = Client.cacheSprite[spriteId2];
        hover.width = Width;
        hover.tooltip = Tooltip;
        hover.height = Height;
        hover.valueCompareType = new int[1];
        hover.requiredValues = new int[1];
        hover.valueCompareType[0] = 1;
        hover.requiredValues[0] = configId;
        hover.valueIndexArray = new int[1][3];
        hover.valueIndexArray[0][0] = 5;
        hover.valueIndexArray[0][1] = configFrame;
        hover.valueIndexArray[0][2] = 0;
        hover = RSInterface.addTabInterface(hoverid);
        hover.parentID = hoverid;
        hover.id = hoverid;
        hover.type = 0;
        hover.atActionType = 0;
        hover.width = 550;
        hover.height = 334;
        hover.isMouseoverTriggered = true;
        hover.mOverInterToTrigger = -1;
        RSInterface.addSprite(hoverId2, hoverSpriteId, hoverSpriteId2, hoverSpriteName, configId, configFrame);
        RSInterface.addHoverBox(hoverId3, interfaceID, hoverDisabledText, hoverEnabledText, configId, configFrame);
        RSInterface.setChildren(2, hover);
        RSInterface.setBounds(hoverId2, 15, 60, 0, hover);
        RSInterface.setBounds(hoverId3, X, Y, 1, hover);
    }

    public static void addBankHover1(int interfaceID, int actionType, int hoverid, int spriteId, int Width, int Height, String Tooltip, int hoverId2, int hoverSpriteId, String hoverSpriteName, int hoverId3, String hoverDisabledText, int X, int Y) {
        RSInterface hover = RSInterface.addTabInterface(interfaceID);
        hover.id = interfaceID;
        hover.parentID = interfaceID;
        hover.type = 5;
        hover.atActionType = actionType;
        hover.contentType = 0;
        hover.opacity = 0;
        hover.mOverInterToTrigger = hoverid;
        hover.sprite1 = Client.cacheSprite[spriteId];
        hover.width = Width;
        hover.tooltip = Tooltip;
        hover.height = Height;
        hover = RSInterface.addTabInterface(hoverid);
        hover.parentID = hoverid;
        hover.id = hoverid;
        hover.type = 0;
        hover.atActionType = 0;
        hover.width = 550;
        hover.height = 334;
        hover.isMouseoverTriggered = true;
        hover.mOverInterToTrigger = -1;
        RSInterface.addSprite(hoverId2, hoverSpriteId, hoverSpriteId, hoverSpriteName, 0, 0);
        RSInterface.addHoverBox(hoverId3, interfaceID, hoverDisabledText, hoverDisabledText, 0, 0);
        RSInterface.setChildren(2, hover);
        RSInterface.setBounds(hoverId2, 15, 60, 0, hover);
        RSInterface.setBounds(hoverId3, X, Y, 1, hover);
    }

    public static void addHoverBox(int id, int ParentID, String text, String text2, int configId, int configFrame) {
        RSInterface rsi = RSInterface.addTabInterface(id);
        rsi.id = id;
        rsi.parentID = ParentID;
        rsi.type = 8;
        rsi.disabledText = text;
        rsi.message = text2;
        rsi.valueCompareType = new int[1];
        rsi.requiredValues = new int[1];
        rsi.valueCompareType[0] = 1;
        rsi.requiredValues[0] = configId;
        rsi.valueIndexArray = new int[1][3];
        rsi.valueIndexArray[0][0] = 5;
        rsi.valueIndexArray[0][1] = configFrame;
        rsi.valueIndexArray[0][2] = 0;
    }

    public static void addSprite(int ID, int i, int i2, String name, int configId, int configFrame) {
        RSInterface Tab = RSInterface.addTabInterface(ID);
        Tab.id = ID;
        Tab.parentID = ID;
        Tab.type = 5;
        Tab.atActionType = 0;
        Tab.contentType = 0;
        Tab.width = 512;
        Tab.height = 334;
        Tab.opacity = 0;
        Tab.mOverInterToTrigger = -1;
        Tab.valueCompareType = new int[1];
        Tab.requiredValues = new int[1];
        Tab.valueCompareType[0] = 1;
        Tab.requiredValues[0] = configId;
        Tab.valueIndexArray = new int[1][3];
        Tab.valueIndexArray[0][0] = 5;
        Tab.valueIndexArray[0][1] = configFrame;
        Tab.valueIndexArray[0][2] = 0;
        if (name == null) {
            Tab.itemSpriteZoom1 = -1;
            Tab.itemSpriteId1 = i;
            Tab.itemSpriteZoom2 = 70;
            Tab.itemSpriteId2 = i2;
            return;
        }
        Tab.sprite1 = RSInterface.imageLoader(i, name);
        Tab.sprite2 = RSInterface.imageLoader(i2, name);
    }

    public static void addTransparentSprite(int id, int spriteId, String spriteName, int op) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 10;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = RSInterface.imageLoader(spriteId, spriteName);
        tab.sprite2 = RSInterface.imageLoader(spriteId, spriteName);
        tab.width = 512;
        tab.height = 334;
        tab.opacity = op;
        tab.drawsTransparent = true;
    }

    public static void addPrayerWithTooltip(int i, int configId, int configFrame, int requiredValues, int prayerSpriteID, int Hover, String tooltip) {
        RSInterface Interface = RSInterface.addTabInterface(i);
        Interface.id = i;
        Interface.parentID = 5608;
        Interface.type = 5;
        Interface.atActionType = 4;
        Interface.contentType = 0;
        Interface.opacity = 0;
        Interface.mOverInterToTrigger = Hover;
        Interface.sprite1 = RSInterface.imageLoader(0, "Interfaces/PrayerTab/PRAYERGLOW");
        Interface.sprite2 = RSInterface.imageLoader(1, "Interfaces/PrayerTab/PRAYERGLOW");
        Interface.width = 34;
        Interface.height = 34;
        Interface.valueCompareType = new int[1];
        Interface.requiredValues = new int[1];
        Interface.valueCompareType[0] = 1;
        Interface.requiredValues[0] = configId;
        Interface.valueIndexArray = new int[1][3];
        Interface.valueIndexArray[0][0] = 5;
        Interface.valueIndexArray[0][1] = configFrame;
        Interface.valueIndexArray[0][2] = 0;
        Interface.tooltip = tooltip;
        Interface = RSInterface.addTabInterface(i + 1);
        Interface.id = i + 1;
        Interface.parentID = 5608;
        Interface.type = 5;
        Interface.atActionType = 0;
        Interface.contentType = 0;
        Interface.opacity = 0;
        Interface.sprite1 = RSInterface.imageLoader(prayerSpriteID, "Interfaces/PrayerTab/PRAYERON");
        Interface.sprite2 = RSInterface.imageLoader(prayerSpriteID, "Interfaces/PrayerTab/PRAYEROFF");
        Interface.width = 34;
        Interface.height = 34;
        Interface.valueCompareType = new int[1];
        Interface.requiredValues = new int[1];
        Interface.valueCompareType[0] = 2;
        Interface.requiredValues[0] = requiredValues + 1;
        Interface.valueIndexArray = new int[1][3];
        Interface.valueIndexArray[0][0] = 2;
        Interface.valueIndexArray[0][1] = 5;
        Interface.valueIndexArray[0][2] = 0;
    }

    public static void addPrayer(int i, int configId, int configFrame, int requiredValues, int prayerSpriteID, String PrayerName, int Hover) {
        RSInterface Interface = RSInterface.addTabInterface(i);
        Interface.id = i;
        Interface.parentID = 22500;
        Interface.type = 5;
        Interface.atActionType = 4;
        Interface.contentType = 0;
        Interface.opacity = 0;
        Interface.mOverInterToTrigger = Hover;
        Interface.sprite1 = RSInterface.imageLoader(0, "CurseTab/GLOW");
        Interface.sprite2 = RSInterface.imageLoader(1, "CurseTab/GLOW");
        Interface.width = 34;
        Interface.height = 34;
        Interface.valueCompareType = new int[1];
        Interface.requiredValues = new int[1];
        Interface.valueCompareType[0] = 1;
        Interface.requiredValues[0] = configId;
        Interface.valueIndexArray = new int[1][3];
        Interface.valueIndexArray[0][0] = 5;
        Interface.valueIndexArray[0][1] = configFrame;
        Interface.valueIndexArray[0][2] = 0;
        Interface.tooltip = "Activate@or1@ " + PrayerName;
        Interface = RSInterface.addTabInterface(i + 1);
        Interface.id = i + 1;
        Interface.parentID = 22500;
        Interface.type = 5;
        Interface.atActionType = 0;
        Interface.contentType = 0;
        Interface.opacity = 0;
        Interface.sprite1 = RSInterface.imageLoader(prayerSpriteID, "CurseTab/PRAYON");
        Interface.sprite2 = RSInterface.imageLoader(prayerSpriteID, "CurseTab/PRAYOFF");
        Interface.width = 34;
        Interface.height = 34;
        Interface.valueCompareType = new int[1];
        Interface.requiredValues = new int[1];
        Interface.valueCompareType[0] = 2;
        Interface.requiredValues[0] = requiredValues + 1;
        Interface.valueIndexArray = new int[1][3];
        Interface.valueIndexArray[0][0] = 2;
        Interface.valueIndexArray[0][1] = 5;
        Interface.valueIndexArray[0][2] = 0;
    }

    public static void addSpriteWithHover(int id, int spriteId, String spriteName, int hover) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.type = hover;
        tab.sprite1 = RSInterface.imageLoader(spriteId, spriteName);
        tab.sprite2 = RSInterface.imageLoader(spriteId, spriteName);
        tab.width = 190;
        tab.height = 47;
    }

    public static void Curses(TextDrawingArea[] TDA) {
        RSInterface Interface = RSInterface.addTabInterface(22500);
        int index = 0;
        RSInterface.addText(687, "99/99", 16750623, false, false, -1, TDA, 1);
        RSInterface.addSprite(22502, 0, "CurseTab/ICON");
        RSInterface.addPrayer(22503, 0, 610, 49, 7, "Protect Item", 22582);
        RSInterface.addPrayer(22505, 0, 611, 49, 4, "Sap Warrior", 22544);
        RSInterface.addPrayer(22507, 0, 612, 51, 5, "Sap Ranger", 22546);
        RSInterface.addPrayer(22509, 0, 613, 53, 3, "Sap Mage", 22548);
        RSInterface.addPrayer(22511, 0, 614, 55, 2, "Sap Spirit", 22550);
        RSInterface.addPrayer(22513, 0, 615, 58, 18, "Berserker", 22552);
        RSInterface.addPrayer(22515, 0, 616, 61, 15, "Deflect Summoning", 22554);
        RSInterface.addPrayer(22517, 0, 617, 64, 17, "Deflect Magic", 22556);
        RSInterface.addPrayer(22519, 0, 618, 67, 16, "Deflect Missiles", 22558);
        RSInterface.addPrayer(22521, 0, 619, 70, 6, "Deflect Melee", 22560);
        RSInterface.addPrayer(22523, 0, 620, 73, 9, "Leech Attack", 22562);
        RSInterface.addPrayer(22525, 0, 621, 75, 10, "Leech Ranged", 22564);
        RSInterface.addPrayer(22527, 0, 622, 77, 11, "Leech Magic", 22566);
        RSInterface.addPrayer(22529, 0, 623, 79, 12, "Leech Defence", 22568);
        RSInterface.addPrayer(22531, 0, 624, 81, 13, "Leech Strength", 22570);
        RSInterface.addPrayer(22533, 0, 625, 83, 14, "Leech Energy", 22572);
        RSInterface.addPrayer(22535, 0, 626, 85, 19, "Leech Special Attack", 22574);
        RSInterface.addPrayer(22537, 0, 627, 88, 1, "Wrath", 22576);
        RSInterface.addPrayer(22539, 0, 628, 91, 8, "Soul Split", 22578);
        RSInterface.addPrayer(22541, 0, 629, 94, 20, "Turmoil", 22580);
        RSInterface.addTooltip(22582, "Level 50\nProtect Item\nKeep 1 extra item if you die");
        RSInterface.addTooltip(22544, "Level 50\nSap Warrior\nDrains 10% of enemy Attack,\nStrength and Defence,\nincreasing to 20% over time");
        RSInterface.addTooltip(22546, "Level 52\nSap Ranger\nDrains 10% of enemy Ranged\nand Defence, increasing to 20%\nover time");
        RSInterface.addTooltip(22548, "Level 54\nSap Mage\nDrains 10% of enemy Magic\nand Defence, increasing to 20%\nover time");
        RSInterface.addTooltip(22550, "Level 56\nSap Spirit\nDrains enenmy special attack\nenergy");
        RSInterface.addTooltip(22552, "Level 59\nBerserker\nBoosted stats last 15% longer");
        RSInterface.addTooltip(22554, "Level 62\nDeflect Summoning\nReduces damage dealt from\nSummoning scrolls, prevents the\nuse of a familiar's special\nattack, and can deflect some of\ndamage back to the attacker");
        RSInterface.addTooltip(22556, "Level 65\nDeflect Magic\nProtects against magical attacks\nand can deflect some of the\ndamage back to the attacker");
        RSInterface.addTooltip(22558, "Level 68\nDeflect Missiles\nProtects against ranged attacks\nand can deflect some of the\ndamage back to the attacker");
        RSInterface.addTooltip(22560, "Level 71\nDeflect Melee\nProtects against melee attacks\nand can deflect some of the\ndamage back to the attacker");
        RSInterface.addTooltip(22562, "Level 74\nLeech Attack\nBoosts Attack by 5%, increasing\nto 10% over time, while draining\nenemy Attack by 10%, increasing\nto 25% over time");
        RSInterface.addTooltip(22564, "Level 76\nLeech Ranged\nBoosts Ranged by 5%, increasing\nto 10% over time, while draining\nenemy Ranged by 10%,\nincreasing to 25% over\ntime");
        RSInterface.addTooltip(22566, "Level 78\nLeech Magic\nBoosts Magic by 5%, increasing\nto 10% over time, while draining\nenemy Magic by 10%, increasing\nto 25% over time");
        RSInterface.addTooltip(22568, "Level 80\nLeech Defence\nBoosts Defence by 5%, increasing\nto 10% over time, while draining\n enemy Defence by10%,\nincreasing to 25% over\ntime");
        RSInterface.addTooltip(22570, "Level 82\nLeech Strength\nBoosts Strength by 5%, increasing\nto 10% over time, while draining\nenemy Strength by 10%, increasing\n to 25% over time");
        RSInterface.addTooltip(22572, "Level 84\nLeech Energy\nDrains enemy run energy, while\nincreasing your own");
        RSInterface.addTooltip(22574, "Level 86\nLeech Special Attack\nDrains enemy special attack\nenergy, while increasing your\nown");
        RSInterface.addTooltip(22576, "Level 89\nWrath\nInflicts damage to nearby\ntargets if you die");
        RSInterface.addTooltip(22578, "Level 92\nSoul Split\n1/4 of damage dealt is also removed\nfrom opponent's Prayer and\nadded to your Hitpoints");
        RSInterface.addTooltip(22580, "Level 95\nTurmoil\nIncreases Attack and Defence\nby 15%, plus 15% of enemy's\nlevel, and Strength by 23% plus\n10% of enemy's level");
        RSInterface.setChildren(62, Interface);
        RSInterface.setBounds(687, 85, 241, index, Interface);
        RSInterface.setBounds(22502, 65, 241, ++index, Interface);
        RSInterface.setBounds(22503, 2, 5, ++index, Interface);
        RSInterface.setBounds(22504, 8, 8, ++index, Interface);
        RSInterface.setBounds(22505, 40, 5, ++index, Interface);
        RSInterface.setBounds(22506, 47, 12, ++index, Interface);
        RSInterface.setBounds(22507, 76, 5, ++index, Interface);
        RSInterface.setBounds(22508, 82, 11, ++index, Interface);
        RSInterface.setBounds(22509, 113, 5, ++index, Interface);
        RSInterface.setBounds(22510, 116, 8, ++index, Interface);
        RSInterface.setBounds(22511, 150, 5, ++index, Interface);
        RSInterface.setBounds(22512, 155, 10, ++index, Interface);
        RSInterface.setBounds(22513, 2, 45, ++index, Interface);
        RSInterface.setBounds(22514, 9, 48, ++index, Interface);
        RSInterface.setBounds(22515, 39, 45, ++index, Interface);
        RSInterface.setBounds(22516, 42, 47, ++index, Interface);
        RSInterface.setBounds(22517, 76, 45, ++index, Interface);
        RSInterface.setBounds(22518, 79, 48, ++index, Interface);
        RSInterface.setBounds(22519, 113, 45, ++index, Interface);
        RSInterface.setBounds(22520, 116, 48, ++index, Interface);
        RSInterface.setBounds(22521, 151, 45, ++index, Interface);
        RSInterface.setBounds(22522, 154, 48, ++index, Interface);
        RSInterface.setBounds(22523, 2, 82, ++index, Interface);
        RSInterface.setBounds(22524, 6, 86, ++index, Interface);
        RSInterface.setBounds(22525, 40, 82, ++index, Interface);
        RSInterface.setBounds(22526, 42, 86, ++index, Interface);
        RSInterface.setBounds(22527, 77, 82, ++index, Interface);
        RSInterface.setBounds(22528, 79, 86, ++index, Interface);
        RSInterface.setBounds(22529, 114, 83, ++index, Interface);
        RSInterface.setBounds(22530, 119, 87, ++index, Interface);
        RSInterface.setBounds(22531, 153, 83, ++index, Interface);
        RSInterface.setBounds(22532, 156, 86, ++index, Interface);
        RSInterface.setBounds(22533, 2, 120, ++index, Interface);
        RSInterface.setBounds(22534, 7, 125, ++index, Interface);
        RSInterface.setBounds(22535, 40, 120, ++index, Interface);
        RSInterface.setBounds(22536, 45, 124, ++index, Interface);
        RSInterface.setBounds(22537, 78, 120, ++index, Interface);
        RSInterface.setBounds(22538, 86, 124, ++index, Interface);
        RSInterface.setBounds(22539, 114, 120, ++index, Interface);
        RSInterface.setBounds(22540, 120, 125, ++index, Interface);
        RSInterface.setBounds(22541, 151, 120, ++index, Interface);
        RSInterface.setBounds(22542, 153, 127, ++index, Interface);
        RSInterface.setBounds(22582, 10, 40, ++index, Interface);
        RSInterface.setBounds(22544, 20, 40, ++index, Interface);
        RSInterface.setBounds(22546, 20, 40, ++index, Interface);
        RSInterface.setBounds(22548, 20, 40, ++index, Interface);
        RSInterface.setBounds(22550, 20, 40, ++index, Interface);
        RSInterface.setBounds(22552, 10, 80, ++index, Interface);
        RSInterface.setBounds(22554, 10, 80, ++index, Interface);
        RSInterface.setBounds(22556, 10, 80, ++index, Interface);
        RSInterface.setBounds(22558, 10, 80, ++index, Interface);
        RSInterface.setBounds(22560, 10, 80, ++index, Interface);
        RSInterface.setBounds(22562, 10, 120, ++index, Interface);
        RSInterface.setBounds(22564, 10, 120, ++index, Interface);
        RSInterface.setBounds(22566, 10, 120, ++index, Interface);
        RSInterface.setBounds(22568, 5, 120, ++index, Interface);
        RSInterface.setBounds(22570, 5, 120, ++index, Interface);
        RSInterface.setBounds(22572, 10, 160, ++index, Interface);
        RSInterface.setBounds(22574, 10, 160, ++index, Interface);
        RSInterface.setBounds(22576, 10, 160, ++index, Interface);
        RSInterface.setBounds(22578, 10, 160, ++index, Interface);
        RSInterface.setBounds(22580, 10, 160, ++index, Interface);
        ++index;
    }

    public static void addPrayer2(int i, int configId, int configFrame, int requiredValues, int prayerSpriteID, String PrayerName, int Hover) {
        RSInterface Interface = RSInterface.addTabInterface(i);
        Interface.id = i;
        Interface.parentID = 22500;
        Interface.type = 5;
        Interface.atActionType = 4;
        Interface.contentType = 0;
        Interface.opacity = 0;
        Interface.mOverInterToTrigger = Hover;
        Interface.sprite1 = RSInterface.imageLoader(0, "Curses/GLOW");
        Interface.sprite2 = RSInterface.imageLoader(1, "Curses/GLOW");
        Interface.width = 34;
        Interface.height = 34;
        Interface.valueCompareType = new int[1];
        Interface.requiredValues = new int[1];
        Interface.valueCompareType[0] = 1;
        Interface.requiredValues[0] = configId;
        Interface.valueIndexArray = new int[1][3];
        Interface.valueIndexArray[0][0] = 5;
        Interface.valueIndexArray[0][1] = configFrame;
        Interface.valueIndexArray[0][2] = 0;
        Interface.tooltip = "Activate@lre@ " + PrayerName;
        Interface = RSInterface.addTabInterface(i + 1);
        Interface.id = i + 1;
        Interface.parentID = 22500;
        Interface.type = 5;
        Interface.atActionType = 0;
        Interface.contentType = 0;
        Interface.opacity = 0;
        Interface.sprite1 = RSInterface.imageLoader(prayerSpriteID, "Curses/PRAYON");
        Interface.sprite2 = RSInterface.imageLoader(prayerSpriteID, "Curses/PRAYOFF");
        Interface.width = 34;
        Interface.height = 34;
        Interface.valueCompareType = new int[1];
        Interface.requiredValues = new int[1];
        Interface.valueCompareType[0] = 2;
        Interface.requiredValues[0] = requiredValues + 1;
        Interface.valueIndexArray = new int[1][3];
        Interface.valueIndexArray[0][0] = 2;
        Interface.valueIndexArray[0][1] = 5;
        Interface.valueIndexArray[0][2] = 0;
    }

    public static /* varargs */ void addToItemGroup(RSInterface rsi, int w, int h, int x, int y, String ... acts) {
        rsi.width = w;
        rsi.height = h;
        rsi.inv = new int[w * h];
        rsi.customName = new String[w * h];
        rsi.invStackSizes = new int[w * h];
        rsi.usableItemInterface = false;
        rsi.isInventoryInterface = false;
        rsi.isMouseoverTriggered = true;
        rsi.invSpritePadX = x;
        rsi.invSpritePadY = y;
        rsi.spritesX = new int[20];
        rsi.spritesY = new int[20];
        rsi.sprites = new Sprite[20];
        rsi.actions = acts;
        rsi.type = 2;
        Arrays.fill((int[])rsi.inv, (int)4151);
        Arrays.fill((int[])rsi.invStackSizes, (int)1);
    }

    public static void quickCurses(TextDrawingArea[] TDA) {
        int frame = 0;
        RSInterface tab = RSInterface.addTabInterface(17234);
        RSInterface.addText(17235, "Select your quick curses:", TDA, 0, 16750623, false, true);
        int i = 17202;
        int j = 630;
        do {
            if (i > 17222 && j > 656) {
                RSInterface.addHoverButton(17231, "/Interfaces/QuickPrayer/Sprite", 4, 190, 24, "Confirm Selection", -1, 17232, 1);
                RSInterface.addHoveredButton(17232, "/Interfaces/QuickPrayer/Sprite", 5, 190, 24, 17233);
                RSInterface.setChildren(46, tab);
                RSInterface.setBounds(22504, 5, 28, frame++, tab);
                RSInterface.setBounds(22506, 44, 28, frame++, tab);
                RSInterface.setBounds(22508, 79, 31, frame++, tab);
                RSInterface.setBounds(22510, 116, 30, frame++, tab);
                RSInterface.setBounds(22512, 153, 29, frame++, tab);
                RSInterface.setBounds(22514, 5, 68, frame++, tab);
                RSInterface.setBounds(22516, 44, 67, frame++, tab);
                RSInterface.setBounds(22518, 79, 69, frame++, tab);
                RSInterface.setBounds(22520, 116, 70, frame++, tab);
                RSInterface.setBounds(22522, 154, 70, frame++, tab);
                RSInterface.setBounds(22524, 4, 104, frame++, tab);
                RSInterface.setBounds(22526, 44, 107, frame++, tab);
                RSInterface.setBounds(22528, 81, 105, frame++, tab);
                RSInterface.setBounds(22530, 117, 105, frame++, tab);
                RSInterface.setBounds(22532, 156, 107, frame++, tab);
                RSInterface.setBounds(22534, 5, 145, frame++, tab);
                RSInterface.setBounds(22536, 43, 144, frame++, tab);
                RSInterface.setBounds(22538, 83, 144, frame++, tab);
                RSInterface.setBounds(22540, 115, 141, frame++, tab);
                RSInterface.setBounds(22542, 154, 144, frame++, tab);
                RSInterface.setBounds(17229, 0, 25, frame++, tab);
                RSInterface.setBounds(17201, 0, 22, frame++, tab);
                RSInterface.setBounds(17201, 0, 237, frame++, tab);
                RSInterface.setBounds(17202, 2, 25, frame++, tab);
                RSInterface.setBounds(17203, 41, 25, frame++, tab);
                RSInterface.setBounds(17204, 76, 25, frame++, tab);
                RSInterface.setBounds(17205, 113, 25, frame++, tab);
                RSInterface.setBounds(17206, 150, 25, frame++, tab);
                RSInterface.setBounds(17207, 2, 65, frame++, tab);
                RSInterface.setBounds(17208, 41, 65, frame++, tab);
                RSInterface.setBounds(17209, 76, 65, frame++, tab);
                RSInterface.setBounds(17210, 113, 65, frame++, tab);
                RSInterface.setBounds(17211, 150, 65, frame++, tab);
                RSInterface.setBounds(17212, 2, 102, frame++, tab);
                RSInterface.setBounds(17213, 41, 102, frame++, tab);
                RSInterface.setBounds(17214, 76, 102, frame++, tab);
                RSInterface.setBounds(17215, 113, 102, frame++, tab);
                RSInterface.setBounds(17216, 150, 102, frame++, tab);
                RSInterface.setBounds(17217, 2, 141, frame++, tab);
                RSInterface.setBounds(17218, 41, 141, frame++, tab);
                RSInterface.setBounds(17219, 76, 141, frame++, tab);
                RSInterface.setBounds(17220, 113, 141, frame++, tab);
                RSInterface.setBounds(17221, 150, 141, frame++, tab);
                RSInterface.setBounds(17235, 5, 5, frame++, tab);
                RSInterface.setBounds(17231, 0, 237, frame++, tab);
                RSInterface.setBounds(17232, 0, 237, frame++, tab);
                return;
            }
            RSInterface.addConfigButton(i, 17200, 2, 1, "/Interfaces/QuickPrayer/Sprite", 14, 15, "Select", 0, 1, j);
            ++i;
            ++j;
        } while (true);
    }

    public static void quickPrayers(TextDrawingArea[] TDA) {
        int frame = 0;
        RSInterface tab = RSInterface.addTabInterface(17200);
        RSInterface.addSprite(17201, 3, "/Interfaces/QuickPrayer/Sprite");
        RSInterface.addText(17230, "Select your quick prayers:", TDA, 0, 16750623, false, true);
        RSInterface.addTransparentSprite(17229, 0, "/Interfaces/QuickPrayer/Sprite", 50);
        int i = 17202;
        int j = 630;
        do {
            if (i > 17228 && j > 656) {
                RSInterface.addHoverButton(17231, "/Interfaces/QuickPrayer/Sprite", 4, 190, 24, "Confirm Selection", -1, 17232, 1);
                RSInterface.addHoveredButton(17232, "/Interfaces/QuickPrayer/Sprite", 5, 190, 24, 17233);
                RSInterface.setChildren(58, tab);
                RSInterface.setBounds(25001, 5, 28, frame++, tab);
                RSInterface.setBounds(25003, 44, 28, frame++, tab);
                RSInterface.setBounds(25005, 79, 31, frame++, tab);
                RSInterface.setBounds(25007, 116, 30, frame++, tab);
                RSInterface.setBounds(25009, 153, 29, frame++, tab);
                RSInterface.setBounds(25011, 5, 68, frame++, tab);
                RSInterface.setBounds(25013, 44, 67, frame++, tab);
                RSInterface.setBounds(25015, 79, 69, frame++, tab);
                RSInterface.setBounds(25017, 116, 70, frame++, tab);
                RSInterface.setBounds(25019, 154, 70, frame++, tab);
                RSInterface.setBounds(25021, 4, 104, frame++, tab);
                RSInterface.setBounds(25023, 44, 107, frame++, tab);
                RSInterface.setBounds(25025, 81, 105, frame++, tab);
                RSInterface.setBounds(25027, 117, 105, frame++, tab);
                RSInterface.setBounds(25029, 156, 107, frame++, tab);
                RSInterface.setBounds(25031, 5, 145, frame++, tab);
                RSInterface.setBounds(25033, 43, 144, frame++, tab);
                RSInterface.setBounds(25035, 83, 144, frame++, tab);
                RSInterface.setBounds(25037, 115, 141, frame++, tab);
                RSInterface.setBounds(25039, 154, 144, frame++, tab);
                RSInterface.setBounds(25041, 5, 180, frame++, tab);
                RSInterface.setBounds(25043, 41, 178, frame++, tab);
                RSInterface.setBounds(25045, 79, 183, frame++, tab);
                RSInterface.setBounds(25047, 116, 178, frame++, tab);
                RSInterface.setBounds(25049, 161, 180, frame++, tab);
                RSInterface.setBounds(25051, 4, 219, frame++, tab);
                RSInterface.setBounds(17229, 0, 25, frame++, tab);
                RSInterface.setBounds(17201, 0, 22, frame++, tab);
                RSInterface.setBounds(17201, 0, 237, frame++, tab);
                RSInterface.setBounds(17202, 2, 25, frame++, tab);
                RSInterface.setBounds(17203, 41, 25, frame++, tab);
                RSInterface.setBounds(17204, 76, 25, frame++, tab);
                RSInterface.setBounds(17205, 113, 25, frame++, tab);
                RSInterface.setBounds(17206, 150, 25, frame++, tab);
                RSInterface.setBounds(17207, 2, 65, frame++, tab);
                RSInterface.setBounds(17208, 41, 65, frame++, tab);
                RSInterface.setBounds(17209, 76, 65, frame++, tab);
                RSInterface.setBounds(17210, 113, 65, frame++, tab);
                RSInterface.setBounds(17211, 150, 65, frame++, tab);
                RSInterface.setBounds(17212, 2, 102, frame++, tab);
                RSInterface.setBounds(17213, 41, 102, frame++, tab);
                RSInterface.setBounds(17214, 76, 102, frame++, tab);
                RSInterface.setBounds(17215, 113, 102, frame++, tab);
                RSInterface.setBounds(17216, 150, 102, frame++, tab);
                RSInterface.setBounds(17217, 2, 141, frame++, tab);
                RSInterface.setBounds(17218, 41, 141, frame++, tab);
                RSInterface.setBounds(17219, 76, 141, frame++, tab);
                RSInterface.setBounds(17220, 113, 141, frame++, tab);
                RSInterface.setBounds(17221, 150, 141, frame++, tab);
                RSInterface.setBounds(17222, 2, 177, frame++, tab);
                RSInterface.setBounds(17223, 41, 177, frame++, tab);
                RSInterface.setBounds(17224, 76, 177, frame++, tab);
                RSInterface.setBounds(17225, 113, 177, frame++, tab);
                RSInterface.setBounds(17226, 150, 177, frame++, tab);
                RSInterface.setBounds(17227, 1, 211, frame++, tab);
                RSInterface.setBounds(17230, 5, 5, frame++, tab);
                RSInterface.setBounds(17231, 0, 237, frame++, tab);
                RSInterface.setBounds(17232, 0, 237, frame++, tab);
                return;
            }
            RSInterface.addConfigButton(i, 17200, 2, 1, "/Interfaces/QuickPrayer/Sprite", 14, 15, "Select", 0, 1, j);
            ++i;
            ++j;
        } while (true);
    }

    public static void prayerMenu(TextDrawingArea[] TDA) {
        RSInterface prayerMenu = RSInterface.addInterface(5608);
        int index = 0;
        int prayIndex = 0;
        int firstRowXPos = 10;
        int firstRowYPos = 50;
        int secondRowXPos = 10;
        int secondRowYPos = 86;
        int thirdRowXPos = 10;
        int thirdRowYPos = 122;
        int fourthRowXPos = 10;
        int fourthRowYPos = 159;
        int fifthRowXPos = 10;
        int fifthRowYPos = 86;
        int sixthRowXPos = 1;
        int sixthRowYPos = 52;
        RSInterface.addText(687, "", 16750623, false, true, -1, TDA, 1);
        RSInterface.addSprite(25105, 0, "Interfaces/PrayerTab/PRAYERICON");
        RSInterface.addPrayerWithTooltip(25000, 0, 83, 0, prayIndex, 25052, "Activate @lre@Thick Skin");
        RSInterface.addPrayerWithTooltip(25002, 0, 84, 3, ++prayIndex, 25054, "Activate @lre@Burst of Strength");
        RSInterface.addPrayerWithTooltip(25004, 0, 85, 6, ++prayIndex, 25056, "Activate @lre@Clarity of Thought");
        RSInterface.addPrayerWithTooltip(25006, 0, 601, 7, ++prayIndex, 25058, "Activate @lre@Sharp Eye");
        RSInterface.addPrayerWithTooltip(25008, 0, 602, 8, ++prayIndex, 25060, "Activate @lre@Mystic Will");
        RSInterface.addPrayerWithTooltip(25010, 0, 86, 9, ++prayIndex, 25062, "Activate @lre@Rock Skin");
        RSInterface.addPrayerWithTooltip(25012, 0, 87, 12, ++prayIndex, 25064, "Activate @lre@Superhuman Strength");
        RSInterface.addPrayerWithTooltip(25014, 0, 88, 15, ++prayIndex, 25066, "Activate @lre@Improved Reflexes");
        RSInterface.addPrayerWithTooltip(25016, 0, 89, 18, ++prayIndex, 25068, "Activate @lre@Rapid Restore");
        RSInterface.addPrayerWithTooltip(25018, 0, 90, 21, ++prayIndex, 25070, "Activate @lre@Rapid Heal");
        RSInterface.addPrayerWithTooltip(25020, 0, 91, 24, ++prayIndex, 25072, "Activate @lre@Protect Item");
        RSInterface.addPrayerWithTooltip(25022, 0, 603, 25, ++prayIndex, 25074, "Activate @lre@Hawk Eye");
        RSInterface.addPrayerWithTooltip(25024, 0, 604, 26, ++prayIndex, 25076, "Activate @lre@Mystic Lore");
        RSInterface.addPrayerWithTooltip(25026, 0, 92, 27, ++prayIndex, 25078, "Activate @lre@Steel Skin");
        RSInterface.addPrayerWithTooltip(25028, 0, 93, 30, ++prayIndex, 25080, "Activate @lre@Ultimate Strength");
        RSInterface.addPrayerWithTooltip(25030, 0, 94, 33, ++prayIndex, 25082, "Activate @lre@Incredible Reflexes");
        RSInterface.addPrayerWithTooltip(25032, 0, 95, 36, ++prayIndex, 25084, "Activate @lre@Protect from Magic");
        RSInterface.addPrayerWithTooltip(25034, 0, 96, 39, ++prayIndex, 25086, "Activate @lre@Protect from Missles");
        RSInterface.addPrayerWithTooltip(25036, 0, 97, 42, ++prayIndex, 25088, "Activate @lre@Protect from Melee");
        RSInterface.addPrayerWithTooltip(25038, 0, 605, 43, ++prayIndex, 25090, "Activate @lre@Eagle Eye");
        RSInterface.addPrayerWithTooltip(25040, 0, 606, 44, ++prayIndex, 25092, "Activate @lre@Mystic Might");
        RSInterface.addPrayerWithTooltip(25042, 0, 98, 45, ++prayIndex, 25094, "Activate @lre@Retribution");
        RSInterface.addPrayerWithTooltip(25044, 0, 99, 48, ++prayIndex, 25096, "Activate @lre@Redemption");
        RSInterface.addPrayerWithTooltip(25046, 0, 100, 51, ++prayIndex, 25098, "Activate @lre@Smite");
        RSInterface.addPrayerWithTooltip(25048, 0, 607, 59, ++prayIndex, 25100, "Activate @lre@Chivalry");
        RSInterface.addPrayerWithTooltip(25050, 0, 608, 69, ++prayIndex, 25102, "Activate @lre@Piety");
        ++prayIndex;
        RSInterface.addTooltip(25052, "Level 01\nThick Skin\nIncreases your Defence by 5%");
        RSInterface.addTooltip(25054, "Level 04\nBurst of Strength\nIncreases your Strength by 5%");
        RSInterface.addTooltip(25056, "Level 07\nClarity of Thought\nIncreases your Attack by 5%");
        RSInterface.addTooltip(25058, "Level 08\nSharp Eye\nIncreases your Ranged by 5%");
        RSInterface.addTooltip(25060, "Level 09\nMystic Will\nIncreases your Magic by 5%");
        RSInterface.addTooltip(25062, "Level 10\nRock Skin\nIncreases your Defence by 10%");
        RSInterface.addTooltip(25064, "Level 13\nSuperhuman Strength\nIncreases your Strength by 10%");
        RSInterface.addTooltip(25066, "Level 16\nImproved Reflexes\nIncreases your Attack by 10%");
        RSInterface.addTooltip(25068, "Level 19\nRapid Restore\n2x restore rate for all stats\nexcept Hitpoints, Summoning\nand Prayer");
        RSInterface.addTooltip(25070, "Level 22\nRapid Heal\n2x restore rate for the\nHitpoints stat");
        RSInterface.addTooltip(25072, "Level 25\nProtect Item\nKeep 1 extra item if you die");
        RSInterface.addTooltip(25074, "Level 26\nHawk Eye\nIncreases your Ranged by 10%");
        RSInterface.addTooltip(25076, "Level 27\nMystic Lore\nIncreases your Magic by 10%");
        RSInterface.addTooltip(25078, "Level 28\nSteel Skin\nIncreases your Defence by 15%");
        RSInterface.addTooltip(25080, "Level 31\nUltimate Strength\nIncreases your Strength by 15%");
        RSInterface.addTooltip(25082, "Level 34\nIncredible Reflexes\nIncreases your Attack by 15%");
        RSInterface.addTooltip(25084, "Level 37\nProtect from Magic\nProtection from magical attacks");
        RSInterface.addTooltip(25086, "Level 40\nProtect from Missles\nProtection from ranged attacks");
        RSInterface.addTooltip(25088, "Level 43\nProtect from Melee\nProtection from melee attacks");
        RSInterface.addTooltip(25090, "Level 44\nEagle Eye\nIncreases your Ranged by 15%");
        RSInterface.addTooltip(25092, "Level 45\nMystic Might\nIncreases your Magic by 15%");
        RSInterface.addTooltip(25094, "Level 46\nRetribution\nInflicts damage to nearby\ntargets if you die");
        RSInterface.addTooltip(25096, "Level 49\nRedemption\nHeals you when damaged\nand Hitpoints falls\nbelow 10%");
        RSInterface.addTooltip(25098, "Level 52\nSmite\n1/4 of damage dealt is\nalso removed from\nopponent's Prayer");
        RSInterface.addTooltip(25100, "Level 60\nChivalry\nIncreases your Defence by 20%,\nStrength by 18%, and Attack by\n15%");
        RSInterface.addTooltip(25102, "Level 70\nPiety\nIncreases your Defence by 25%,\nStrength by 23%, and Attack by\n20%");
        RSInterface.setChildren(80, prayerMenu);
        RSInterface.setBounds(687, 85, 241, index, prayerMenu);
        RSInterface.setBounds(25105, 65, 241, ++index, prayerMenu);
        RSInterface.setBounds(25000, 2, 5, ++index, prayerMenu);
        RSInterface.setBounds(25001, 5, 8, ++index, prayerMenu);
        RSInterface.setBounds(25002, 40, 5, ++index, prayerMenu);
        RSInterface.setBounds(25003, 44, 8, ++index, prayerMenu);
        RSInterface.setBounds(25004, 76, 5, ++index, prayerMenu);
        RSInterface.setBounds(25005, 79, 11, ++index, prayerMenu);
        RSInterface.setBounds(25006, 113, 5, ++index, prayerMenu);
        RSInterface.setBounds(25007, 116, 10, ++index, prayerMenu);
        RSInterface.setBounds(25008, 150, 5, ++index, prayerMenu);
        RSInterface.setBounds(25009, 153, 9, ++index, prayerMenu);
        RSInterface.setBounds(25010, 2, 45, ++index, prayerMenu);
        RSInterface.setBounds(25011, 5, 48, ++index, prayerMenu);
        RSInterface.setBounds(25012, 39, 45, ++index, prayerMenu);
        RSInterface.setBounds(25013, 44, 47, ++index, prayerMenu);
        RSInterface.setBounds(25014, 76, 45, ++index, prayerMenu);
        RSInterface.setBounds(25015, 79, 49, ++index, prayerMenu);
        RSInterface.setBounds(25016, 113, 45, ++index, prayerMenu);
        RSInterface.setBounds(25017, 116, 50, ++index, prayerMenu);
        RSInterface.setBounds(25018, 151, 45, ++index, prayerMenu);
        RSInterface.setBounds(25019, 154, 50, ++index, prayerMenu);
        RSInterface.setBounds(25020, 2, 82, ++index, prayerMenu);
        RSInterface.setBounds(25021, 4, 84, ++index, prayerMenu);
        RSInterface.setBounds(25022, 40, 82, ++index, prayerMenu);
        RSInterface.setBounds(25023, 44, 87, ++index, prayerMenu);
        RSInterface.setBounds(25024, 77, 82, ++index, prayerMenu);
        RSInterface.setBounds(25025, 81, 85, ++index, prayerMenu);
        RSInterface.setBounds(25026, 114, 83, ++index, prayerMenu);
        RSInterface.setBounds(25027, 117, 85, ++index, prayerMenu);
        RSInterface.setBounds(25028, 153, 83, ++index, prayerMenu);
        RSInterface.setBounds(25029, 156, 87, ++index, prayerMenu);
        RSInterface.setBounds(25030, 2, 120, ++index, prayerMenu);
        RSInterface.setBounds(25031, 5, 125, ++index, prayerMenu);
        RSInterface.setBounds(25032, 40, 120, ++index, prayerMenu);
        RSInterface.setBounds(25033, 43, 124, ++index, prayerMenu);
        RSInterface.setBounds(25034, 78, 120, ++index, prayerMenu);
        RSInterface.setBounds(25035, 83, 124, ++index, prayerMenu);
        RSInterface.setBounds(25036, 114, 120, ++index, prayerMenu);
        RSInterface.setBounds(25037, 115, 121, ++index, prayerMenu);
        RSInterface.setBounds(25038, 151, 120, ++index, prayerMenu);
        RSInterface.setBounds(25039, 154, 124, ++index, prayerMenu);
        RSInterface.setBounds(25040, 2, 158, ++index, prayerMenu);
        RSInterface.setBounds(25041, 5, 160, ++index, prayerMenu);
        RSInterface.setBounds(25042, 39, 158, ++index, prayerMenu);
        RSInterface.setBounds(25043, 41, 158, ++index, prayerMenu);
        RSInterface.setBounds(25044, 76, 158, ++index, prayerMenu);
        RSInterface.setBounds(25045, 79, 163, ++index, prayerMenu);
        RSInterface.setBounds(25046, 114, 158, ++index, prayerMenu);
        RSInterface.setBounds(25047, 116, 158, ++index, prayerMenu);
        RSInterface.setBounds(25048, 153, 158, ++index, prayerMenu);
        RSInterface.setBounds(25049, 161, 160, ++index, prayerMenu);
        RSInterface.setBounds(25050, 2, 196, ++index, prayerMenu);
        RSInterface.setBounds(25051, 4, 207, ++index, prayerMenu);
        RSInterface.setBoundry(++index, 25052, firstRowXPos - 2, firstRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25054, firstRowXPos - 5, firstRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25056, firstRowXPos, firstRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25058, firstRowXPos, firstRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25060, firstRowXPos, firstRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25062, secondRowXPos - 9, secondRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25064, secondRowXPos - 11, secondRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25066, secondRowXPos, secondRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25068, secondRowXPos, secondRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25070, secondRowXPos + 25, secondRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25072, thirdRowXPos, thirdRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25074, thirdRowXPos - 2, thirdRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25076, thirdRowXPos, thirdRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25078, thirdRowXPos - 7, thirdRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25080, thirdRowXPos - 10, thirdRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25082, fourthRowXPos, fourthRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25084, fourthRowXPos - 8, fourthRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25086, fourthRowXPos - 7, fourthRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25088, fourthRowXPos - 2, fourthRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25090, fourthRowXPos - 2, fourthRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25092, fifthRowXPos, fifthRowYPos, prayerMenu);
        RSInterface.setBoundry(++index, 25094, fifthRowXPos, fifthRowYPos - 20, prayerMenu);
        RSInterface.setBoundry(++index, 25096, fifthRowXPos, fifthRowYPos - 25, prayerMenu);
        RSInterface.setBoundry(++index, 25098, fifthRowXPos + 15, fifthRowYPos - 25, prayerMenu);
        RSInterface.setBoundry(++index, 25100, fifthRowXPos - 12, fifthRowYPos - 20, prayerMenu);
        RSInterface.setBoundry(++index, 25102, sixthRowXPos - 2, sixthRowYPos, prayerMenu);
        ++index;
    }

    public static void setBoundry(int frame, int ID, int X, int Y, RSInterface RSInterface2) {
        RSInterface2.children[frame] = ID;
        RSInterface2.childX[frame] = X;
        RSInterface2.childY[frame] = Y;
    }

    public static void addTooltipBox(int id, String text) {
        RSInterface rsi = RSInterface.addInterface(id);
        rsi.id = id;
        rsi.parentID = id;
        rsi.type = 9;
        rsi.message = text;
    }

    public static void addTooltip(int id, String text, int H, int W) {
        RSInterface rsi = RSInterface.addTabInterface(id);
        rsi.id = id;
        rsi.type = 0;
        rsi.isMouseoverTriggered = true;
        rsi.mOverInterToTrigger = -1;
        RSInterface.addTooltipBox(id + 1, text);
        rsi.totalChildren(1);
        rsi.child(0, id + 1, 0, 0);
        rsi.height = H;
        rsi.width = W;
    }

    public static void setChildren(int total, RSInterface i) {
        i.children = new int[total];
        i.childX = new int[total];
        i.childY = new int[total];
    }

    public static void addTooltip(int id, String text) {
        RSInterface rsinterface = RSInterface.addTabInterface(id);
        rsinterface.parentID = id;
        rsinterface.type = 0;
        rsinterface.isMouseoverTriggered = true;
        rsinterface.mOverInterToTrigger = -1;
        RSInterface.addTooltipBox(id + 1, text);
        rsinterface.totalChildren(1);
        rsinterface.child(0, id + 1, 0, 0);
    }

    public static void magicTab(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addTabInterface(1151);
        RSInterface homeHover = RSInterface.addTabInterface(1196);
        RSInterface spellButtons = interfaceCache[12424];
        spellButtons.scrollMax = 0;
        spellButtons.height = 260;
        spellButtons.width = 190;
        int[] spellButton = new int[]{1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249, 1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324, 1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404, 1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469, 15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512, 1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446, 12456, 6004, 18471};
        tab.totalChildren(63);
        tab.child(0, 12424, 13, 24);
        for (int i1 = 0; i1 < spellButton.length; ++i1) {
            int yPos = i1 <= 34 ? 183 : 8;
            tab.child(1, 1195, 13, 24);
            tab.child(i1 + 2, spellButton[i1], 5, yPos);
            RSInterface.addButton(1195, 1, "Magic/Home", "Cast @gre@Home Teleport");
            RSInterface homeButton = interfaceCache[1195];
            homeButton.mOverInterToTrigger = 1196;
        }
        int i2 = 0;
        do {
            if (i2 >= spellButton.length) {
                homeHover.isMouseoverTriggered = true;
                RSInterface.addText(1197, "Level 0: Home Teleport", tda, 1, 16685087, true, true);
                RSInterface homeLevel = interfaceCache[1197];
                homeLevel.width = 174;
                homeLevel.height = 68;
                RSInterface.addText(1198, "A teleport which requires no", tda, 0, 11495962, true, true);
                RSInterface.addText(18998, "runes and no required level that", tda, 0, 11495962, true, true);
                RSInterface.addText(18999, "teleports you to the main land.", tda, 0, 11495962, true, true);
                homeHover.totalChildren(4);
                homeHover.child(0, 1197, 3, 4);
                homeHover.child(1, 1198, 91, 23);
                homeHover.child(2, 18998, 91, 34);
                homeHover.child(3, 18999, 91, 45);
                return;
            }
            if (i2 < 60) {
                spellButtons.childX[i2] = spellButtons.childX[i2] + 24;
            }
            if (i2 == 6 || i2 == 12 || i2 == 19 || i2 == 35 || i2 == 41 || i2 == 44 || i2 == 49 || i2 == 51) {
                spellButtons.childX[i2] = 0;
            }
            spellButtons.childY[6] = 24;
            spellButtons.childY[12] = 48;
            spellButtons.childY[19] = 72;
            spellButtons.childY[49] = 96;
            spellButtons.childY[44] = 120;
            spellButtons.childY[51] = 144;
            spellButtons.childY[35] = 170;
            spellButtons.childY[41] = 192;
            ++i2;
        } while (true);
    }

    public static void addClickableText(int id, String text, String tooltip, TextDrawingArea[] tda, int idx, int color, boolean center, boolean shadow, int width) {
        RSInterface tab = RSInterface.addTabInterface(id);
        tab.parentID = id;
        tab.id = id;
        tab.type = 4;
        tab.atActionType = 1;
        tab.width = width;
        tab.height = 11;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        tab.center = center;
        tab.textShadow = shadow;
        tab.textDrawingAreas = tda[idx];
        tab.message = text;
        tab.disabledText = "";
        tab.textColor = color;
        tab.anInt219 = 0;
        tab.textHoverColour = 16777215;
        tab.anInt239 = 0;
        tab.tooltip = tooltip;
    }

    public static void ancientMagicTab(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addInterface(12855);
        RSInterface.addButton(12856, 1, "Magic/Home", "Cast @gre@Home Teleport");
        RSInterface homeButton = interfaceCache[12856];
        homeButton.mOverInterToTrigger = 1196;
        int[] itfChildren = new int[]{12856, 12939, 12987, 13035, 12901, 12861, 13045, 12963, 13011, 13053, 12919, 12881, 13061, 12951, 12999, 13069, 12911, 12871, 13079, 12975, 13023, 13087, 12929, 12891, 13095, 1196, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080, 12976, 13024, 13088, 12930, 12892, 13096};
        tab.totalChildren(itfChildren.length);
        int i1 = 0;
        int xPos = 18;
        int yPos = 8;
        while (i1 < itfChildren.length) {
            if (xPos > 175) {
                xPos = 18;
                yPos += 28;
            }
            if (i1 < 25) {
                tab.child(i1, itfChildren[i1], xPos, yPos);
            }
            if (i1 > 24) {
                yPos = i1 >= 41 ? 1 : 181;
                tab.child(i1, itfChildren[i1], 4, yPos);
            }
            ++i1;
            xPos += 45;
        }
    }

    public static void drawBlackBox(int xPos, int yPos) {
        DrawingArea.drawPixels(71, yPos - 1, xPos - 2, 7496785, 1);
        DrawingArea.drawPixels(69, yPos, xPos + 174, 7496785, 1);
        DrawingArea.drawPixels(1, yPos - 2, xPos - 2, 7496785, 178);
        DrawingArea.drawPixels(1, yPos + 68, xPos, 7496785, 174);
        DrawingArea.drawPixels(71, yPos - 1, xPos - 1, 3025699, 1);
        DrawingArea.drawPixels(71, yPos - 1, xPos + 175, 3025699, 1);
        DrawingArea.drawPixels(1, yPos - 1, xPos, 3025699, 175);
        DrawingArea.drawPixels(1, yPos + 69, xPos, 3025699, 175);
        DrawingArea.method335(0, yPos, 174, 68, 220, xPos);
    }

    public static void addButton(int id, int sid, String spriteName, String tooltip) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 1;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = RSInterface.imageLoader(sid, spriteName);
        tab.sprite2 = RSInterface.imageLoader(sid, spriteName);
        tab.width = tab.sprite1.myWidth;
        tab.height = tab.sprite2.myHeight;
        tab.tooltip = tooltip;
    }

    public static void addPrayer(int i, int configId, int configFrame, int requiredValues, int spriteID, String prayerName) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = 5608;
        tab.type = 5;
        tab.atActionType = 4;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        tab.sprite1 = RSInterface.imageLoader(0, "PRAYERGLOW");
        tab.sprite2 = RSInterface.imageLoader(1, "PRAYERGLOW");
        tab.width = 34;
        tab.height = 34;
        tab.valueCompareType = new int[1];
        tab.requiredValues = new int[1];
        tab.valueCompareType[0] = 1;
        tab.requiredValues[0] = configId;
        tab.valueIndexArray = new int[1][3];
        tab.valueIndexArray[0][0] = 5;
        tab.valueIndexArray[0][1] = configFrame;
        tab.valueIndexArray[0][2] = 0;
        tab.tooltip = "Activate@or2@ " + prayerName;
        RSInterface tab2 = RSInterface.addTabInterface(i + 1);
        tab2.id = i + 1;
        tab2.parentID = 5608;
        tab2.type = 5;
        tab2.atActionType = 0;
        tab2.contentType = 0;
        tab2.opacity = 0;
        tab2.mOverInterToTrigger = -1;
        tab2.sprite1 = RSInterface.imageLoader(spriteID, "/PRAYER/PRAYON");
        tab2.sprite2 = RSInterface.imageLoader(spriteID, "/PRAYER/PRAYOFF");
        tab2.width = 34;
        tab2.height = 34;
        tab2.valueCompareType = new int[1];
        tab2.requiredValues = new int[1];
        tab2.valueCompareType[0] = 2;
        tab2.requiredValues[0] = requiredValues + 1;
        tab2.valueIndexArray = new int[1][3];
        tab2.valueIndexArray[0][0] = 2;
        tab2.valueIndexArray[0][1] = 5;
        tab2.valueIndexArray[0][2] = 0;
    }

    public static void friendsTab(TextDrawingArea[] tda) {
        int i;
        RSInterface tab = RSInterface.addTabInterface(5065);
        RSInterface list = interfaceCache[5066];
        RSInterface.addText(5067, "Friends List", tda, 1, 16750899, true, true);
        RSInterface.addText(5070, "Add Friend", tda, 0, 16750899, false, true);
        RSInterface.addText(5071, "Delete Friend", tda, 0, 16750899, false, true);
        RSInterface.addSprite(16126, 4, "/Friends/SPRITE");
        RSInterface.addSprite(16127, 8, "/Friends/SPRITE");
        RSInterface.addHoverButton(5068, "/Friends/SPRITE", 6, 72, 32, "Add Friend", 201, 5072, 1);
        RSInterface.addHoveredButton(5072, "/Friends/SPRITE", 7, 72, 32, 5073);
        RSInterface.addHoverButton(5069, "/Friends/SPRITE", 6, 72, 32, "Delete Friend", 202, 5074, 1);
        RSInterface.addHoveredButton(5074, "/Friends/SPRITE", 7, 72, 32, 5075);
        tab.totalChildren(11);
        tab.child(0, 5067, 95, 4);
        tab.child(1, 16127, 0, 25);
        tab.child(2, 16126, 0, 221);
        tab.child(3, 5066, 0, 24);
        tab.child(4, 16126, 0, 22);
        tab.child(5, 5068, 15, 226);
        tab.child(6, 5072, 15, 226);
        tab.child(7, 5069, 103, 226);
        tab.child(8, 5074, 103, 226);
        tab.child(9, 5070, 25, 237);
        tab.child(10, 5071, 106, 237);
        list.height = 196;
        list.width = 174;
        int id = 5092;
        for (i = 0; id <= 5191 && i <= 99; ++i) {
            list.children[i] = id++;
            list.childX[i] = 3;
            list.childY[i] = list.childY[i] - 7;
        }
        id = 5192;
        i = 100;
        while (id <= 5291) {
            if (i > 199) return;
            list.children[i] = id++;
            list.childX[i] = 131;
            list.childY[i] = list.childY[i] - 7;
            ++i;
        }
    }

    public static void ignoreTab(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addTabInterface(5715);
        RSInterface list = interfaceCache[5716];
        RSInterface.addText(5717, "Ignore List", tda, 1, 16750899, true, true);
        RSInterface.addText(5720, "Add Name", tda, 0, 16750899, false, true);
        RSInterface.addText(5721, "Delete Name", tda, 0, 16750899, false, true);
        RSInterface.addHoverButton(5718, "/Friends/SPRITE", 6, 72, 32, "Add Name", 501, 5722, 1);
        RSInterface.addHoveredButton(5722, "/Friends/SPRITE", 7, 72, 32, 5723);
        RSInterface.addHoverButton(5719, "/Friends/SPRITE", 6, 72, 32, "Delete Name", 502, 5724, 1);
        RSInterface.addHoveredButton(5724, "/Friends/SPRITE", 7, 72, 32, 5725);
        tab.totalChildren(11);
        tab.child(0, 5717, 95, 4);
        tab.child(1, 16127, 0, 25);
        tab.child(2, 16126, 0, 221);
        tab.child(3, 5716, 0, 24);
        tab.child(4, 16126, 0, 22);
        tab.child(5, 5718, 15, 226);
        tab.child(6, 5722, 15, 226);
        tab.child(7, 5719, 103, 226);
        tab.child(8, 5724, 103, 226);
        tab.child(9, 5720, 27, 237);
        tab.child(10, 5721, 108, 237);
        list.height = 196;
        list.width = 174;
        int id = 5742;
        int i = 0;
        while (id <= 5841) {
            if (i > 99) return;
            list.children[i] = id++;
            list.childX[i] = 3;
            list.childY[i] = list.childY[i] - 7;
            ++i;
        }
    }

    private static Sprite CustomSpriteLoader(int id, String s) {
        long l = (TextClass.method585(s) << 8) + (long)id;
        Sprite sprite = (Sprite)aMRUNodes_238.insertFromCache(l);
        if (sprite != null) {
            return sprite;
        }
        try {
            sprite = new Sprite("/Attack/" + id + s);
            aMRUNodes_238.removeFromCache(sprite, l);
            return sprite;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static RSInterface addInterface(int id) {
        RSInterface rsi = RSInterface.interfaceCache[id] = new RSInterface();
        rsi.id = id;
        rsi.parentID = id;
        rsi.width = 512;
        rsi.height = 334;
        return rsi;
    }

    public static void addText(int id, String text, TextDrawingArea[] tda, int idx, int color, boolean centered) {
        RSInterface rsi = RSInterface.interfaceCache[id] = new RSInterface();
        if (centered) {
            rsi.center = true;
        }
        rsi.textShadow = true;
        rsi.textDrawingAreas = tda[idx];
        rsi.message = text;
        rsi.textColor = color;
        rsi.id = id;
        rsi.type = 4;
    }

    public static void textColor(int id, int color) {
        RSInterface rsi = interfaceCache[id];
        rsi.textColor = color;
    }

    public static void textSize(int id, TextDrawingArea[] tda, int idx) {
        RSInterface rsi = interfaceCache[id];
        rsi.textDrawingAreas = tda[idx];
    }

    public static void addCacheSprite(int id, int sprite1, int sprite2, String sprites) {
        RSInterface rsi = RSInterface.interfaceCache[id] = new RSInterface();
        System.out.println((Object)aClass44);
        rsi.sprite1 = RSInterface.loadCachedSprite(sprite1, aClass44, sprites);
        rsi.sprite2 = RSInterface.loadCachedSprite(sprite2, aClass44, sprites);
        rsi.parentID = id;
        rsi.id = id;
        rsi.type = 5;
    }

    public static void sprite1(int id, int sprite) {
        RSInterface class9 = interfaceCache[id];
        class9.sprite1 = RSInterface.CustomSpriteLoader(sprite, "");
    }

    public static void addActionButton(int id, int sprite, int sprite2, int width, int height, String s) {
        RSInterface rsi = RSInterface.interfaceCache[id] = new RSInterface();
        rsi.sprite1 = RSInterface.CustomSpriteLoader(sprite, "");
        rsi.sprite2 = sprite2 == sprite ? RSInterface.CustomSpriteLoader(sprite, "a") : RSInterface.CustomSpriteLoader(sprite2, "");
        rsi.tooltip = s;
        rsi.contentType = 0;
        rsi.atActionType = 1;
        rsi.width = width;
        rsi.mOverInterToTrigger = 52;
        rsi.parentID = id;
        rsi.id = id;
        rsi.type = 5;
        rsi.height = height;
    }

    public static void addToggleButton(int id, int sprite, int setconfig, int width, int height, String s) {
        RSInterface rsi = RSInterface.addInterface(id);
        rsi.sprite1 = RSInterface.CustomSpriteLoader(sprite, "");
        rsi.sprite2 = RSInterface.CustomSpriteLoader(sprite, "a");
        rsi.requiredValues = new int[1];
        rsi.requiredValues[0] = 1;
        rsi.valueCompareType = new int[1];
        rsi.valueCompareType[0] = 1;
        rsi.valueIndexArray = new int[1][3];
        rsi.valueIndexArray[0][0] = 5;
        rsi.valueIndexArray[0][1] = setconfig;
        rsi.valueIndexArray[0][2] = 0;
        rsi.atActionType = 4;
        rsi.width = width;
        rsi.mOverInterToTrigger = -1;
        rsi.parentID = id;
        rsi.id = id;
        rsi.type = 5;
        rsi.height = height;
        rsi.tooltip = s;
    }

    public void totalChildren(int id, int x, int y) {
        this.children = new int[id];
        this.childX = new int[x];
        this.childY = new int[y];
    }

    public static void removeSomething(int id) {
        RSInterface.interfaceCache[id] = new RSInterface();
    }

    public void specialBar(int id) {
        RSInterface.addActionButton(id - 12, 7587, -1, 150, 26, "Use @gre@Special Attack");
        for (int i = id - 11; i < id; ++i) {
            RSInterface.removeSomething(i);
        }
        RSInterface rsi = interfaceCache[id - 12];
        rsi.width = 150;
        rsi.height = 26;
        rsi = interfaceCache[id];
        rsi.width = 150;
        rsi.height = 26;
        rsi.child(0, id - 12, 0, 0);
        rsi.child(12, id + 1, 3, 7);
        rsi.child(23, id + 12, 16, 8);
        int i = 13;
        while (i < 23) {
            int[] arrn = rsi.childY;
            int n = i++;
            arrn[n] = arrn[n] - 1;
        }
        rsi = interfaceCache[id + 1];
        rsi.type = 5;
        rsi.sprite1 = RSInterface.CustomSpriteLoader(7600, "");
        i = id + 2;
        do {
            if (i >= id + 12) {
                RSInterface.sprite1(id + 2, 7601);
                RSInterface.sprite1(id + 3, 7602);
                RSInterface.sprite1(id + 4, 7603);
                RSInterface.sprite1(id + 5, 7604);
                RSInterface.sprite1(id + 6, 7605);
                RSInterface.sprite1(id + 7, 7606);
                RSInterface.sprite1(id + 8, 7607);
                RSInterface.sprite1(id + 9, 7608);
                RSInterface.sprite1(id + 10, 7609);
                RSInterface.sprite1(id + 11, 7610);
                return;
            }
            rsi = interfaceCache[i];
            rsi.type = 5;
            ++i;
        } while (true);
    }

    public static void Sidebar0(TextDrawingArea[] tda) {
        RSInterface.Sidebar0a(1698, 1701, 7499, "Chop", "Hack", "Smash", "Block", 42, 75, 127, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
        RSInterface.Sidebar0a(2276, 2279, 7574, "Stab", "Lunge", "Slash", "Block", 43, 75, 124, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
        RSInterface.Sidebar0a(2423, 2426, 7599, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
        RSInterface.Sidebar0a(3796, 3799, 7624, "Pound", "Pummel", "Spike", "Block", 39, 75, 121, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
        RSInterface.Sidebar0a(4679, 4682, 7674, "Lunge", "Swipe", "Pound", "Block", 40, 75, 124, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
        RSInterface.Sidebar0a(4705, 4708, 7699, "Chop", "Slash", "Smash", "Block", 42, 75, 125, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
        RSInterface.Sidebar0a(5570, 5573, 7724, "Spike", "Impale", "Smash", "Block", 41, 75, 123, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
        RSInterface.Sidebar0a(7762, 7765, 7800, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
        RSInterface.Sidebar0b(776, 779, "Reap", "Chop", "Jab", "Block", 42, 75, 126, 75, 46, 128, 125, 128, 122, 103, 122, 50, 40, 103, 40, 50, tda);
        RSInterface.Sidebar0c(425, 428, 7474, "Pound", "Pummel", "Block", 39, 75, 121, 75, 42, 128, 40, 103, 40, 50, 122, 50, tda);
        RSInterface.Sidebar0c(1749, 1752, 7524, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda);
        RSInterface.Sidebar0c(1764, 1767, 7549, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda);
        RSInterface.Sidebar0c(4446, 4449, 7649, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda);
        RSInterface.Sidebar0c(5855, 5857, 7749, "Punch", "Kick", "Block", 40, 75, 129, 75, 42, 128, 40, 50, 122, 50, 40, 103, tda);
        RSInterface.Sidebar0c(6103, 6132, 6117, "Bash", "Pound", "Block", 43, 75, 124, 75, 42, 128, 40, 103, 40, 50, 122, 50, tda);
        RSInterface.Sidebar0c(8460, 8463, 8493, "Jab", "Swipe", "Fend", 46, 75, 124, 75, 43, 128, 40, 103, 40, 50, 122, 50, tda);
        RSInterface.Sidebar0c(12290, 12293, 12323, "Flick", "Lash", "Deflect", 44, 75, 127, 75, 36, 128, 40, 50, 40, 103, 122, 50, tda);
        RSInterface.Sidebar0d(328, 331, "Bash", "Pound", "Focus", 42, 66, 39, 101, 41, 136, 40, 120, 40, 50, 40, 85, tda);
        RSInterface rsi = RSInterface.addInterface(19300);
        RSInterface.textSize(3983, tda, 0);
        RSInterface.addToggleButton(150, 150, 172, 150, 44, "Auto Retaliate");
        rsi.totalChildren(2, 2, 2);
        rsi.child(0, 3983, 52, 25);
        rsi.child(1, 150, 21, 153);
        rsi = interfaceCache[3983];
        rsi.center = true;
        rsi.textColor = 16750623;
    }

    public static void Sidebar0a(int id, int id2, int id3, String text1, String text2, String text3, String text4, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int str4x, int str4y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, int img4x, int img4y, TextDrawingArea[] tda) {
        RSInterface rsi = RSInterface.addInterface(id);
        RSInterface.addText(id2, "-2", tda, 3, 16750623, true);
        RSInterface.addText(id2 + 11, text1, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 12, text2, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 13, text3, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 14, text4, tda, 0, 16750623, false);
        rsi.specialBar(id3);
        rsi.width = 190;
        rsi.height = 261;
        int last = 15;
        int frame = 0;
        rsi.totalChildren(last, last, last);
        rsi.child(frame, id2 + 3, 21, 46);
        rsi.child(++frame, id2 + 4, 104, 99);
        rsi.child(++frame, id2 + 5, 21, 99);
        rsi.child(++frame, id2 + 6, 105, 46);
        rsi.child(++frame, id2 + 7, img1x, img1y);
        rsi.child(++frame, id2 + 8, img2x, img2y);
        rsi.child(++frame, id2 + 9, img3x, img3y);
        rsi.child(++frame, id2 + 10, img4x, img4y);
        rsi.child(++frame, id2 + 11, str1x, str1y);
        rsi.child(++frame, id2 + 12, str2x, str2y);
        rsi.child(++frame, id2 + 13, str3x, str3y);
        rsi.child(++frame, id2 + 14, str4x, str4y);
        rsi.child(++frame, 19300, 0, 0);
        rsi.child(++frame, id2, 94, 4);
        rsi.child(++frame, id3, 21, 205);
        ++frame;
        int i = id2 + 3;
        while (i < id2 + 7) {
            rsi = interfaceCache[i];
            rsi.sprite1 = RSInterface.CustomSpriteLoader(19301, "");
            rsi.sprite2 = RSInterface.CustomSpriteLoader(19301, "a");
            rsi.width = 68;
            rsi.height = 44;
            ++i;
        }
    }

    public static void Sidebar0b(int id, int id2, String text1, String text2, String text3, String text4, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int str4x, int str4y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, int img4x, int img4y, TextDrawingArea[] tda) {
        RSInterface rsi = RSInterface.addInterface(id);
        RSInterface.addText(id2, "-2", tda, 3, 16750623, true);
        RSInterface.addText(id2 + 11, text1, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 12, text2, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 13, text3, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 14, text4, tda, 0, 16750623, false);
        rsi.width = 190;
        rsi.height = 261;
        int last = 14;
        int frame = 0;
        rsi.totalChildren(last, last, last);
        rsi.child(frame, id2 + 3, 21, 46);
        rsi.child(++frame, id2 + 4, 104, 99);
        rsi.child(++frame, id2 + 5, 21, 99);
        rsi.child(++frame, id2 + 6, 105, 46);
        rsi.child(++frame, id2 + 7, img1x, img1y);
        rsi.child(++frame, id2 + 8, img2x, img2y);
        rsi.child(++frame, id2 + 9, img3x, img3y);
        rsi.child(++frame, id2 + 10, img4x, img4y);
        rsi.child(++frame, id2 + 11, str1x, str1y);
        rsi.child(++frame, id2 + 12, str2x, str2y);
        rsi.child(++frame, id2 + 13, str3x, str3y);
        rsi.child(++frame, id2 + 14, str4x, str4y);
        rsi.child(++frame, 19300, 0, 0);
        rsi.child(++frame, id2, 94, 4);
        ++frame;
        int i = id2 + 3;
        while (i < id2 + 7) {
            rsi = interfaceCache[i];
            rsi.sprite1 = RSInterface.CustomSpriteLoader(19301, "");
            rsi.sprite2 = RSInterface.CustomSpriteLoader(19301, "a");
            rsi.width = 68;
            rsi.height = 44;
            ++i;
        }
    }

    public static void Sidebar0c(int id, int id2, int id3, String text1, String text2, String text3, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, TextDrawingArea[] tda) {
        RSInterface rsi = RSInterface.addInterface(id);
        RSInterface.addText(id2, "-2", tda, 3, 16750623, true);
        RSInterface.addText(id2 + 9, text1, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 10, text2, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 11, text3, tda, 0, 16750623, false);
        rsi.specialBar(id3);
        rsi.width = 190;
        rsi.height = 261;
        int last = 12;
        int frame = 0;
        rsi.totalChildren(last, last, last);
        rsi.child(frame, id2 + 3, 21, 99);
        rsi.child(++frame, id2 + 4, 105, 46);
        rsi.child(++frame, id2 + 5, 21, 46);
        rsi.child(++frame, id2 + 6, img1x, img1y);
        rsi.child(++frame, id2 + 7, img2x, img2y);
        rsi.child(++frame, id2 + 8, img3x, img3y);
        rsi.child(++frame, id2 + 9, str1x, str1y);
        rsi.child(++frame, id2 + 10, str2x, str2y);
        rsi.child(++frame, id2 + 11, str3x, str3y);
        rsi.child(++frame, 19300, 0, 0);
        rsi.child(++frame, id2, 94, 4);
        rsi.child(++frame, id3, 21, 205);
        ++frame;
        int i = id2 + 3;
        while (i < id2 + 6) {
            rsi = interfaceCache[i];
            rsi.sprite1 = RSInterface.CustomSpriteLoader(19301, "");
            rsi.sprite2 = RSInterface.CustomSpriteLoader(19301, "a");
            rsi.width = 68;
            rsi.height = 44;
            ++i;
        }
    }

    public static void Sidebar0d(int id, int id2, String text1, String text2, String text3, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, TextDrawingArea[] tda) {
        RSInterface rsi = RSInterface.addInterface(id);
        RSInterface.addText(id2, "-2", tda, 3, 16750623, true);
        RSInterface.addText(id2 + 9, text1, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 10, text2, tda, 0, 16750623, false);
        RSInterface.addText(id2 + 11, text3, tda, 0, 16750623, false);
        RSInterface.removeSomething(353);
        RSInterface.addText(354, "Spell", tda, 0, 16750623, false);
        RSInterface.addCacheSprite(337, 19, 0, "combaticons");
        RSInterface.addCacheSprite(338, 13, 0, "combaticons2");
        RSInterface.addCacheSprite(339, 14, 0, "combaticons2");
        RSInterface.removeSomething(349);
        RSInterface.addToggleButton(350, 350, 108, 68, 44, "Select");
        rsi.width = 190;
        rsi.height = 261;
        int last = 15;
        int frame = 0;
        rsi.totalChildren(last, last, last);
        rsi.child(frame, id2 + 3, 20, 115);
        rsi.child(++frame, id2 + 4, 20, 80);
        rsi.child(++frame, id2 + 5, 20, 45);
        rsi.child(++frame, id2 + 6, img1x, img1y);
        rsi.child(++frame, id2 + 7, img2x, img2y);
        rsi.child(++frame, id2 + 8, img3x, img3y);
        rsi.child(++frame, id2 + 9, str1x, str1y);
        rsi.child(++frame, id2 + 10, str2x, str2y);
        rsi.child(++frame, id2 + 11, str3x, str3y);
        rsi.child(++frame, 349, 105, 46);
        rsi.child(++frame, 350, 104, 106);
        rsi.child(++frame, 353, 125, 74);
        rsi.child(++frame, 354, 125, 134);
        rsi.child(++frame, 19300, 0, 0);
        rsi.child(++frame, id2, 94, 4);
        ++frame;
    }

    public static void emoteTab() {
        int index;
        RSInterface tab = RSInterface.addTabInterface(147);
        RSInterface scroll = RSInterface.addTabInterface(148);
        tab.totalChildren(1);
        tab.child(0, 148, 0, 1);
        int[] ButtonIDs = new int[]{168, 169, 164, 165, 162, 163, 13370, 171, 167, 170, 13366, 13368, 166, 13363, 13364, 13365, 161, 11100, 13362, 13367, 172, 13369, 13383, 13384, 667, 6503, 6506, 666, 18464, 18465, 15166, 18686, 18689, 18688, 18691, 18692, 18687, 154, 22586, 22587, 22588, 22589, 22590, 22591, 22592, 22593, 22594};
        int[] EmoteX = new int[]{10, 54, 98, 137, 9, 48, 95, 137, 7, 51, 95, 139, 6, 50, 90, 135, 8, 51, 99, 137, 10, 53, 88, 138, 3, 52, 96, 141, 5, 53, 88, 142, 10, 51, 139, 88, 12, 49, 97, 140, 10, 50, 90, 140, 10, 60, 90};
        int[] EmoteY = new int[]{6, 6, 13, 6, 55, 55, 55, 55, 104, 104, 103, 104, 153, 153, 153, 153, 203, 202, 203, 202, 250, 250, 255, 249, 300, 299, 299, 299, 349, 350, 352, 350, 401, 402, 406, 402, 452, 450, 452, 452, 505, 505, 505, 505, 560, 560, 560};
        int[] EmoteIDs = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 33, 34, 35, 36, 28, 29, 30, 37, 31, 32, 38, 39, 40, 41, 42, 43, 44, 45, 46};
        String[] EmoteTooltip = new String[]{"Yes", "No", "Bow", "Angry", "Think", "Wave", "Shrug", "Cheer", "Beckon", "Laugh", "Jump for Joy", "Yawn", "Dance", "Jig", "Spin", "Headbang", "Cry", "Blow Kiss", "Panic", "Raspberry", "Clap", "Salute", "Goblin Bow", "Goblin Salute", "Glass Box", "Climb Rope", "Lean on Air", "Glass Wall", "Idea", "Stomp", "Flap", "Slap Head", "Zombie Walk", "Zombie Dance", "Scared", "Zombie Hand", "Bunny Hop", "Skill Cape", "Snowman Dance", "Air Guitar", "Safety First", "Explore", "Trick", "Freeze & Melt", "Give Thanks", "Around The World In Eggty Days", "Dramatic Point"};
        scroll.totalChildren(ButtonIDs.length);
        for (index = 0; index < ButtonIDs.length; ++index) {
            RSInterface.addButton(ButtonIDs[index], EmoteIDs[index], "Emotes/EMOTE", EmoteTooltip[index]);
        }
        index = 0;
        do {
            if (index >= ButtonIDs.length) {
                scroll.width = 173;
                scroll.height = 260;
                scroll.scrollMax = 610;
                return;
            }
            scroll.child(index, ButtonIDs[index], EmoteX[index], EmoteY[index]);
            ++index;
        } while (true);
    }

    public static void optionTab(TextDrawingArea[] tda) {
        RSInterface Interface = RSInterface.addTabInterface(904);
        RSInterface.setChildren(46, Interface);
        RSInterface.addSprite(25801, 0, "/OptionTab/OPTION");
        RSInterface.addSprite(25802, 1, "/OptionTab/OPTION");
        RSInterface.addSprite(25803, 1, "/OptionTab/OPTION");
        RSInterface.addSprite(25804, 1, "/OptionTab/OPTION");
        RSInterface.setBounds(25801, 49, 17, 0, Interface);
        RSInterface.setBounds(25802, 49, 54, 1, Interface);
        RSInterface.setBounds(25803, 49, 90, 2, Interface);
        RSInterface.setBounds(25804, 49, 127, 3, Interface);
        RSInterface.addButton(25805, 5, -1, 2, 2, "/OptionTab/OPTION", 32, 32, "Adjust Brightness", 166, 1);
        RSInterface.setBounds(25805, 9, 8, 4, Interface);
        RSInterface.addButton(25806, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 166, 1);
        RSInterface.addButton(25807, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 166, 2);
        RSInterface.addButton(25808, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 166, 3);
        RSInterface.addButton(25809, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 166, 4);
        RSInterface.setBounds(25806, 57, 16, 5, Interface);
        RSInterface.setBounds(25807, 88, 16, 6, Interface);
        RSInterface.setBounds(25808, 119, 16, 7, Interface);
        RSInterface.setBounds(25809, 153, 16, 8, Interface);
        RSInterface.addButton(25810, 5, -1, 3, 4, "/OptionTab/OPTION", 32, 32, "Adjust Music Level", 168, 4);
        RSInterface.setBounds(25810, 9, 45, 9, Interface);
        RSInterface.addButton(25811, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 168, 4);
        RSInterface.addButton(25812, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 168, 3);
        RSInterface.addButton(25813, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 168, 2);
        RSInterface.addButton(25814, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 168, 1);
        RSInterface.addButton(25815, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 168, 0);
        RSInterface.setBounds(25811, 54, 53, 10, Interface);
        RSInterface.setBounds(25812, 78, 53, 11, Interface);
        RSInterface.setBounds(25813, 105, 53, 12, Interface);
        RSInterface.setBounds(25814, 131, 53, 13, Interface);
        RSInterface.setBounds(25815, 156, 53, 14, Interface);
        RSInterface.addButton(25816, 5, -1, 5, 6, "/OptionTab/OPTION", 32, 32, "Adjust Sounds", 169, 4);
        RSInterface.setBounds(25816, 9, 81, 15, Interface);
        RSInterface.addButton(25817, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 169, 4);
        RSInterface.addButton(25818, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 169, 3);
        RSInterface.addButton(25819, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 169, 2);
        RSInterface.addButton(25820, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 169, 1);
        RSInterface.addButton(25821, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 169, 0);
        RSInterface.setBounds(25817, 54, 89, 16, Interface);
        RSInterface.setBounds(25818, 78, 89, 17, Interface);
        RSInterface.setBounds(25819, 105, 89, 18, Interface);
        RSInterface.setBounds(25820, 131, 89, 19, Interface);
        RSInterface.setBounds(25821, 156, 89, 20, Interface);
        RSInterface.addButton(25822, 5, -1, 7, 8, "/OptionTab/OPTION", 32, 32, "Adjust Sound Effects", 400, 0);
        RSInterface.setBounds(25822, 10, 119, 21, Interface);
        RSInterface.addButton(25823, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 400, 0);
        RSInterface.addButton(25824, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 400, 1);
        RSInterface.addButton(25825, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 400, 2);
        RSInterface.addButton(25826, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 400, 3);
        RSInterface.addButton(25827, 5, -1, -1, 18, "/OptionTab/OPTION", 16, 16, "Select", 400, 4);
        RSInterface.setBounds(25823, 54, 126, 22, Interface);
        RSInterface.setBounds(25824, 78, 126, 23, Interface);
        RSInterface.setBounds(25825, 105, 126, 24, Interface);
        RSInterface.setBounds(25826, 131, 126, 25, Interface);
        RSInterface.setBounds(25827, 156, 126, 26, Interface);
        RSInterface.addButton(25828, 4, 25829, 9, 10, "/OptionTab/OPTION", 40, 40, "Toggle Mouse Buttons", 170, 1);
        RSInterface.addTooltip(25829, "Toggle Mouse Buttons");
        RSInterface.addButton(25831, 4, 25832, 9, 10, "/OptionTab/OPTION", 40, 40, "Toggle Chat Effects", 171, 1);
        RSInterface.addTooltip(25832, "Toggle Chat Effects");
        RSInterface.addButton(25834, 4, 25835, 9, 10, "/OptionTab/OPTION", 40, 40, "Toggle Split-Level Chat", 287, 1);
        RSInterface.addTooltip(25835, "Toggle Split-Level Chat");
        RSInterface.addButton(25837, 4, 25838, 9, 10, "/OptionTab/OPTION", 40, 40, "Toggle Screen Resize", 427, 0);
        RSInterface.addTooltip(25838, "Toggle Screen Resize");
        RSInterface.addButton(152, 4, 25841, 9, 10, "/OptionTab/OPTION", 40, 40, "Toggle Run Mode", 173, 1);
        RSInterface.addTooltip(25841, "Toggle Run-Mode");
        RSInterface.addButton(25842, 4, 25843, 9, 10, "/OptionTab/OPTION", 40, 40, "More Options", 175, 1);
        RSInterface.addTooltip(25843, "More client options,\\nincluding fullscreen");
        RSInterface.setBounds(25828, 19, 152, 27, Interface);
        RSInterface.setBounds(25831, 75, 152, 28, Interface);
        RSInterface.setBounds(25834, 131, 152, 29, Interface);
        RSInterface.setBounds(25837, 19, 206, 30, Interface);
        RSInterface.setBounds(152, 75, 206, 31, Interface);
        RSInterface.setBounds(25857, 78, 159, 32, Interface);
        RSInterface.setBounds(25858, 136, 158, 33, Interface);
        RSInterface.setBounds(25859, 23, 212, 34, Interface);
        RSInterface.setBounds(25860, 86, 210, 35, Interface);
        RSInterface.setBounds(25856, 23, 159, 36, Interface);
        RSInterface.setBounds(25829, 19, 130, 37, Interface);
        RSInterface.setBounds(25832, 78, 130, 38, Interface);
        RSInterface.setBounds(25835, 71, 130, 39, Interface);
        RSInterface.setBounds(25838, 19, 185, 40, Interface);
        RSInterface.setBounds(25841, 78, 185, 41, Interface);
        RSInterface.setBounds(25842, 131, 206, 42, Interface);
        RSInterface.setBounds(25861, 139, 217, 43, Interface);
        RSInterface.setBounds(25843, 137, 185, 44, Interface);
        RSInterface.addSprite(25856, 11, "/OptionTab/OPTION");
        RSInterface.addSprite(25857, 12, "/OptionTab/OPTION");
        RSInterface.addSprite(25858, 13, "/OptionTab/OPTION");
        RSInterface.addSprite(25859, 14, "/OptionTab/OPTION");
        RSInterface.addSprite(25860, 15, "/OptionTab/OPTION");
        RSInterface.addSprite(25861, 12, "/sideicon/sideicons");
        RSInterface.addText(149, "100%", 16750592, true, true, 52, tda, 1);
        RSInterface.setBounds(149, 94, 230, 45, Interface);
    }

    protected static void addButton(int ID, int type, int hoverID, int dS, int eS, String NAME, int W, int H, String text, int configFrame, int configId) {
        RSInterface rsinterface = RSInterface.addInterface(ID);
        rsinterface.id = ID;
        rsinterface.parentID = ID;
        rsinterface.type = 5;
        rsinterface.atActionType = type;
        rsinterface.opacity = 0;
        rsinterface.mOverInterToTrigger = hoverID;
        rsinterface.sprite1 = RSInterface.imageLoader(dS, NAME);
        rsinterface.sprite2 = RSInterface.imageLoader(eS, NAME);
        rsinterface.width = W;
        rsinterface.height = H;
        rsinterface.tooltip = text;
        rsinterface.isMouseoverTriggered = true;
        rsinterface.valueCompareType = new int[1];
        rsinterface.requiredValues = new int[1];
        rsinterface.valueCompareType[0] = 1;
        rsinterface.requiredValues[0] = configId;
        rsinterface.valueIndexArray = new int[1][3];
        rsinterface.valueIndexArray[0][0] = 5;
        rsinterface.valueIndexArray[0][1] = configFrame;
        rsinterface.valueIndexArray[0][2] = 0;
    }

    public static void clanChatTab(TextDrawingArea[] tda) {
        RSInterface tab = RSInterface.addTabInterface(31528);
        RSInterface.addHoverButton(31529, "/Clan Chat/SPRITE", 6, 72, 32, "Join Chat", 550, 31530, 1);
        RSInterface.addHoveredButton(31530, "/Clan Chat/SPRITE", 7, 72, 32, 31531);
        RSInterface.addHoverButton(31532, "/Clan Chat/SPRITE", 6, 72, 32, "Leave Chat", -1, 31533, 5);
        RSInterface.addHoveredButton(31533, "/Clan Chat/SPRITE", 7, 72, 32, 31534);
        RSInterface.addButton(18250, 0, "/Clan Chat/Lootshare", "Toggle lootshare");
        RSInterface.addText(31535, "Join Chat", tda, 0, 16751360, true, true);
        RSInterface.addText(31536, "Leave Chat", tda, 0, 16751360, true, true);
        RSInterface.addSprite(31537, 37, "/Clan Chat/SPRITE");
        RSInterface.addText(31538, "Clan Chat", tda, 1, 16751360, true, true);
        RSInterface.addText(31539, "Talking in: Not in chat", tda, 0, 16751360, false, true);
        RSInterface.addText(31540, "Owner: None", tda, 0, 16751360, false, true);
        tab.totalChildren(14);
        tab.child(0, 16126, 0, 221);
        tab.child(1, 16126, 0, 59);
        tab.child(2, 31537, 0, 62);
        tab.child(3, 31543, 0, 62);
        tab.child(4, 31529, 15, 226);
        tab.child(5, 31530, 15, 226);
        tab.child(6, 31532, 103, 226);
        tab.child(7, 31533, 103, 226);
        tab.child(8, 31535, 51, 237);
        tab.child(9, 31536, 139, 237);
        tab.child(10, 31538, 95, 1);
        tab.child(11, 31539, 10, 23);
        tab.child(12, 31540, 25, 38);
        tab.child(13, 18250, 145, 15);
        RSInterface list = RSInterface.addTabInterface(31543);
        int size = 500;
        list.totalChildren(500);
        for (int i = 31544; i <= 32044; ++i) {
            RSInterface.addText(i, "", tda, 0, 16777215, false, true);
        }
        int id = 31544;
        for (int i = 0; id <= 32043 && i <= 499; ++id, ++i) {
            list.children[i] = id;
            list.childX[i] = 5;
            int id2 = 31544;
            for (int i2 = 1; id2 <= 32043 && i2 <= 499; ++id2, ++i2) {
                list.childY[0] = 2;
                list.childY[i2] = list.childY[i2 - 1] + 14;
            }
        }
        list.height = 158;
        list.width = 174;
        list.scrollMax = 6405;
    }

    public static void addText(int i, String s, int k, boolean l, boolean m, int a, TextDrawingArea[] TDA, int j) {
        RSInterface RSInterface2 = RSInterface.addInterface(i);
        RSInterface2.parentID = i;
        RSInterface2.id = i;
        RSInterface2.type = 4;
        RSInterface2.atActionType = 0;
        RSInterface2.width = 0;
        RSInterface2.height = 0;
        RSInterface2.contentType = 0;
        RSInterface2.mOverInterToTrigger = a;
        RSInterface2.center = l;
        RSInterface2.textShadow = m;
        RSInterface2.textDrawingAreas = TDA[j];
        RSInterface2.message = s;
        RSInterface2.disabledText = "";
        RSInterface2.textColor = k;
    }

    public static void Pestpanel(TextDrawingArea[] tda) {
        RSInterface RSinterface = RSInterface.addInterface(27119);
        RSInterface.addText(27120, "What", 10066329, false, true, 52, tda, 1);
        RSInterface.addText(27121, "What", 3394560, false, true, 52, tda, 1);
        RSInterface.addText(27122, "(Need 5 to 25 players)", 16763955, false, true, 52, tda, 1);
        RSInterface.addText(27123, "Points", 3394815, false, true, 52, tda, 1);
        int last = 4;
        RSinterface.children = new int[last];
        RSinterface.childX = new int[last];
        RSinterface.childY = new int[last];
        RSInterface.setBounds(27120, 15, 12, 0, RSinterface);
        RSInterface.setBounds(27121, 15, 30, 1, RSinterface);
        RSInterface.setBounds(27122, 15, 48, 2, RSinterface);
        RSInterface.setBounds(27123, 15, 66, 3, RSinterface);
    }

    public static void Pestpanel2(TextDrawingArea[] tda) {
        RSInterface RSinterface = RSInterface.addInterface(21100);
        RSInterface.addSprite(21101, 0, "Interfaces/Pest Control/PEST1");
        RSInterface.addSprite(21102, 1, "Interfaces/Pest Control/PEST1");
        RSInterface.addSprite(21103, 2, "Interfaces/Pest Control/PEST1");
        RSInterface.addSprite(21104, 3, "Interfaces/Pest Control/PEST1");
        RSInterface.addSprite(21105, 4, "Interfaces/Pest Control/PEST1");
        RSInterface.addSprite(21106, 5, "Interfaces/Pest Control/PEST1");
        RSInterface.addText(21107, "", 13369548, false, true, 52, tda, 1);
        RSInterface.addText(21108, "", 255, false, true, 52, tda, 1);
        RSInterface.addText(21109, "", 16777028, false, true, 52, tda, 1);
        RSInterface.addText(21110, "", 13369344, false, true, 52, tda, 1);
        RSInterface.addText(21111, "250", 10092339, false, true, 52, tda, 1);
        RSInterface.addText(21112, "250", 10092339, false, true, 52, tda, 1);
        RSInterface.addText(21113, "250", 10092339, false, true, 52, tda, 1);
        RSInterface.addText(21114, "250", 10092339, false, true, 52, tda, 1);
        RSInterface.addText(21115, "200", 10092339, false, true, 52, tda, 1);
        RSInterface.addText(21116, "0", 10092339, false, true, 52, tda, 1);
        RSInterface.addText(21117, "Time Remaining:", 16777215, false, true, 52, tda, 0);
        RSInterface.addText(21118, "", 16777215, false, true, 52, tda, 0);
        int last = 18;
        RSinterface.children = new int[last];
        RSinterface.childX = new int[last];
        RSinterface.childY = new int[last];
        RSInterface.setBounds(21101, 361, 26, 0, RSinterface);
        RSInterface.setBounds(21102, 396, 26, 1, RSinterface);
        RSInterface.setBounds(21103, 436, 26, 2, RSinterface);
        RSInterface.setBounds(21104, 474, 26, 3, RSinterface);
        RSInterface.setBounds(21105, 3, 21, 4, RSinterface);
        RSInterface.setBounds(21106, 3, 50, 5, RSinterface);
        RSInterface.setBounds(21107, 371, 60, 6, RSinterface);
        RSInterface.setBounds(21108, 409, 60, 7, RSinterface);
        RSInterface.setBounds(21109, 443, 60, 8, RSinterface);
        RSInterface.setBounds(21110, 479, 60, 9, RSinterface);
        RSInterface.setBounds(21111, 362, 10, 10, RSinterface);
        RSInterface.setBounds(21112, 398, 10, 11, RSinterface);
        RSInterface.setBounds(21113, 436, 10, 12, RSinterface);
        RSInterface.setBounds(21114, 475, 10, 13, RSinterface);
        RSInterface.setBounds(21115, 32, 32, 14, RSinterface);
        RSInterface.setBounds(21116, 32, 62, 15, RSinterface);
        RSInterface.setBounds(21117, 8, 88, 16, RSinterface);
        RSInterface.setBounds(21118, 87, 88, 17, RSinterface);
    }

    public static void addHoverBox(int id, String text) {
        RSInterface rsi = interfaceCache[id];
        rsi.id = id;
        rsi.parentID = id;
        rsi.isMouseoverTriggered = true;
        rsi.type = 8;
        rsi.hoverText = text;
    }

    public static void addText(int id, String text, TextDrawingArea[] tda, int idx, int color, boolean center, boolean shadow) {
        RSInterface tab = RSInterface.addTabInterface(id);
        tab.parentID = id;
        tab.id = id;
        tab.type = 4;
        tab.atActionType = 0;
        tab.width = 0;
        tab.height = 11;
        tab.contentType = 0;
        tab.mOverInterToTrigger = -1;
        tab.center = center;
        tab.textShadow = shadow;
        tab.textDrawingAreas = tda[idx];
        tab.message = text;
        tab.disabledText = "";
        tab.textColor = color;
        tab.anInt219 = 0;
        tab.textHoverColour = 0;
        tab.anInt239 = 0;
    }

    public static void addButton(int id, int sid, String spriteName, String tooltip, int w, int h) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 1;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = RSInterface.imageLoader(sid, spriteName);
        tab.sprite2 = RSInterface.imageLoader(sid, spriteName);
        tab.width = w;
        tab.height = h;
        tab.tooltip = tooltip;
    }

    public static void addConfigButton(int ID, int pID, int bID, int bID2, String bName, int width, int height, String tT, int configID, int aT, int configFrame) {
        RSInterface Tab = RSInterface.addTabInterface(ID);
        Tab.parentID = pID;
        Tab.id = ID;
        Tab.type = 5;
        Tab.atActionType = aT;
        Tab.contentType = 0;
        Tab.width = width;
        Tab.height = height;
        Tab.opacity = 0;
        Tab.mOverInterToTrigger = -1;
        Tab.valueCompareType = new int[1];
        Tab.requiredValues = new int[1];
        Tab.valueCompareType[0] = 1;
        Tab.requiredValues[0] = configID;
        Tab.valueIndexArray = new int[1][3];
        Tab.valueIndexArray[0][0] = 5;
        Tab.valueIndexArray[0][1] = configFrame;
        Tab.valueIndexArray[0][2] = 0;
        Tab.sprite1 = RSInterface.imageLoader(bID, bName);
        Tab.sprite2 = RSInterface.imageLoader(bID2, bName);
        Tab.tooltip = tT;
    }

    public static void addConfigButton(int ID, int pID, int bID, int bID2, String bName, int width, int height, String[] tooltips, int configID, int configFrame) {
        RSInterface Tab = RSInterface.addTabInterface(ID);
        Tab.parentID = pID;
        Tab.id = ID;
        Tab.type = 5;
        Tab.atActionType = 8;
        Tab.contentType = 0;
        Tab.width = width;
        Tab.height = height;
        Tab.opacity = 0;
        Tab.mOverInterToTrigger = -1;
        Tab.valueCompareType = new int[1];
        Tab.requiredValues = new int[1];
        Tab.valueCompareType[0] = 1;
        Tab.requiredValues[0] = configID;
        Tab.valueIndexArray = new int[1][3];
        Tab.valueIndexArray = new int[1][3];
        Tab.valueIndexArray[0][0] = 5;
        Tab.valueIndexArray[0][1] = configFrame;
        Tab.valueIndexArray[0][2] = 0;
        Tab.sprite1 = Client.cacheSprite[bID];
        Tab.sprite2 = Client.cacheSprite[bID2];
        Tab.tooltips = tooltips;
    }

    public static void addConfigButton(int ID, int pID, int bID, int bID2, int width, int height, String tooltips, int configID, int aT, int configFrame) {
        RSInterface Tab = RSInterface.addTabInterface(ID);
        Tab.parentID = pID;
        Tab.id = ID;
        Tab.type = 5;
        Tab.atActionType = aT;
        Tab.contentType = 0;
        Tab.width = width;
        Tab.height = height;
        Tab.opacity = 256;
        Tab.mOverInterToTrigger = -1;
        Tab.valueCompareType = new int[1];
        Tab.requiredValues = new int[1];
        Tab.valueCompareType[0] = 1;
        Tab.requiredValues[0] = configID;
        Tab.valueIndexArray = new int[1][3];
        Tab.valueIndexArray = new int[1][3];
        Tab.valueIndexArray[0][0] = 5;
        Tab.valueIndexArray[0][1] = configFrame;
        Tab.valueIndexArray[0][2] = 0;
        Tab.sprite1 = Client.cacheSprite[bID];
        Tab.sprite2 = Client.cacheSprite[bID2];
        Tab.tooltip = tooltips;
    }

    public static void addConfigButton(int ID, int pID, int bID, int bID2, int width, int height, String[] tooltips, int configID, int configFrame) {
        RSInterface Tab = RSInterface.addTabInterface(ID);
        Tab.parentID = pID;
        Tab.id = ID;
        Tab.type = 5;
        Tab.atActionType = 8;
        Tab.contentType = 0;
        Tab.width = width;
        Tab.height = height;
        Tab.opacity = 0;
        Tab.mOverInterToTrigger = -1;
        Tab.valueCompareType = new int[1];
        Tab.requiredValues = new int[1];
        Tab.valueCompareType[0] = 1;
        Tab.requiredValues[0] = configID;
        Tab.valueIndexArray = new int[1][3];
        Tab.valueIndexArray = new int[1][3];
        Tab.valueIndexArray[0][0] = 5;
        Tab.valueIndexArray[0][1] = configFrame;
        Tab.valueIndexArray[0][2] = 0;
        Tab.sprite1 = Client.cacheSprite[bID];
        Tab.sprite2 = Client.cacheSprite[bID2];
        Tab.tooltips = tooltips;
    }

    public static void addSprite(int id, int spriteId, String spriteName) {
        RSInterface.addSprite(id, spriteId, spriteName, -1, -1);
    }

    public static void addSprite(int id, int spriteId) {
        RSInterface.addSprite(id, spriteId, -1, -1);
    }

    public static void addCachedSprite(int id, int spriteId, String spriteName) {
        RSInterface.addCachedSprite(id, spriteId, spriteName, -1, -1);
    }

    public static void addSprite(int id, int spriteId, String spriteName, int zoom1, int zoom2) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = 52;
        if (spriteName == null) {
            tab.itemSpriteZoom1 = zoom1;
            tab.itemSpriteId1 = spriteId;
            tab.itemSpriteZoom2 = zoom2;
            tab.itemSpriteId2 = spriteId;
        } else {
            tab.sprite1 = RSInterface.imageLoader(spriteId, spriteName);
            tab.sprite2 = RSInterface.imageLoader(spriteId, spriteName);
        }
        tab.width = 512;
        tab.height = 334;
    }

    public static void addCachedSprite(int id, int spriteId, String spriteName, int zoom1, int zoom2) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = 52;
        if (spriteName == null) {
            tab.itemSpriteZoom1 = zoom1;
            tab.itemSpriteId1 = spriteId;
            tab.itemSpriteZoom2 = zoom2;
            tab.itemSpriteId2 = spriteId;
        } else {
            tab.sprite1 = RSInterface.loadCachedSprite(spriteId, spriteName);
        }
        tab.width = 512;
        tab.height = 334;
    }

    public static void addSprite(int id, int spriteId, int zoom1, int zoom2) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = Client.cacheSprite[spriteId];
        tab.sprite2 = Client.cacheSprite[spriteId];
        tab.width = 512;
        tab.height = 334;
    }

    public static void addHoverButton(int i, String imageName, int sId, int width, int height, String text, int contentType, int hoverOver, int aT) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = aT;
        tab.contentType = contentType;
        tab.opacity = 0;
        tab.mOverInterToTrigger = hoverOver;
        tab.sprite1 = RSInterface.imageLoader(sId, imageName);
        tab.sprite2 = RSInterface.imageLoader(sId, imageName);
        tab.width = width;
        tab.height = height;
        tab.tooltip = text;
    }

    public static void addCachedHoverButton(int i, String imageName, int sId, int width, int height, String text, int contentType, int hoverOver, int aT) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = aT;
        tab.contentType = contentType;
        tab.opacity = 0;
        tab.mOverInterToTrigger = hoverOver;
        tab.sprite1 = RSInterface.loadCachedSprite(sId, imageName);
        tab.sprite2 = RSInterface.loadCachedSprite(sId, imageName);
        tab.width = width;
        tab.height = height;
        tab.tooltip = text;
    }

    public static void addHoverButton(int i, int sId, int width, int height, String text, int contentType, int hoverOver, int aT) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = aT;
        tab.contentType = contentType;
        tab.opacity = 0;
        tab.mOverInterToTrigger = hoverOver;
        tab.sprite1 = Client.cacheSprite[sId];
        tab.sprite2 = Client.cacheSprite[sId];
        tab.width = width;
        tab.height = height;
        tab.tooltip = text;
    }

    public static void addHoveredButton(int i, String imageName, int j, int w, int h, int IMAGEID) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.parentID = i;
        tab.id = i;
        tab.type = 0;
        tab.atActionType = 0;
        tab.width = w;
        tab.height = h;
        tab.isMouseoverTriggered = true;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        tab.scrollMax = 0;
        RSInterface.addHoverImage(IMAGEID, j, j, imageName);
        tab.totalChildren(1);
        tab.child(0, IMAGEID, 0, 0);
    }

    public static void addCachedHoveredButton(int i, String imageName, int j, int w, int h, int IMAGEID) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.parentID = i;
        tab.id = i;
        tab.type = 0;
        tab.atActionType = 0;
        tab.width = w;
        tab.height = h;
        tab.isMouseoverTriggered = true;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        tab.scrollMax = 0;
        RSInterface.addCachedHoverImage(IMAGEID, j, j, imageName);
        tab.totalChildren(1);
        tab.child(0, IMAGEID, 0, 0);
    }

    public static void addHoveredButton(int i, int j, int w, int h, int IMAGEID) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.parentID = i;
        tab.id = i;
        tab.type = 0;
        tab.atActionType = 0;
        tab.width = w;
        tab.height = h;
        tab.isMouseoverTriggered = true;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        tab.scrollMax = 0;
        RSInterface.addHoverImage(IMAGEID, j, j);
        tab.totalChildren(1);
        tab.child(0, IMAGEID, 0, 0);
    }

    public static void addInAreaHover(int i, String imageName, int sId, int sId2, int w, int h, String text, int contentType, int actionType) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = actionType;
        tab.contentType = contentType;
        tab.opacity = 0;
        tab.mOverInterToTrigger = i;
        if (sId != -1) {
            tab.sprite1 = RSInterface.imageLoader(sId, imageName);
        }
        tab.sprite2 = RSInterface.imageLoader(sId2, imageName);
        tab.width = w;
        tab.height = h;
        tab.tooltip = text;
    }

    public static void addHover(int i, int aT, int contentType, int hoverOver, int sId, String imageName, int width, int height, String text) {
        RSInterface.addHoverButton(i, imageName, sId, width, height, text, contentType, hoverOver, aT);
    }

    public static void addHovered(int i, int j, String imageName, int w, int h, int IMAGEID) {
        RSInterface.addHoveredButton(i, imageName, j, w, h, IMAGEID);
    }

    public static void addHoverImage(int i, int j, int k, String name) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = 512;
        tab.height = 334;
        tab.opacity = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = RSInterface.imageLoader(j, name);
        tab.sprite2 = RSInterface.imageLoader(k, name);
        tab.setSprite = RSInterface.imageLoader(41, "Interfaces/GrandExchange/sprite");
        tab.savedFirstSprite = RSInterface.imageLoader(j, name);
    }

    public static void addCachedHoverImage(int i, int j, int k, String name) {
        RSInterface tab = RSInterface.addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = 512;
        tab.height = 334;
        tab.opacity = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = RSInterface.loadCachedSprite(j, name);
        tab.sprite2 = RSInterface.loadCachedSprite(k, name);
    }

    public static RSInterface addScreenInterface(int id) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 0;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = 512;
        tab.height = 334;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        return tab;
    }

    public static RSInterface addTabInterface(int id) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 0;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = 512;
        tab.height = 700;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        return tab;
    }

    private static Sprite imageLoader(int i, String s) {
        long l = (TextClass.method585(s) << 8) + (long)i;
        Sprite sprite = (Sprite)aMRUNodes_238.insertFromCache(l);
        if (sprite != null) {
            return sprite;
        }
        try {
            sprite = new Sprite(s + " " + i);
            aMRUNodes_238.removeFromCache(sprite, l);
            return sprite;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void child(int id, int interID, int x, int y) {
        this.children[id] = interID;
        this.childX[id] = x;
        this.childY[id] = y;
    }

    public void child(int id, RSInterface inter, int x, int y) {
        this.children[id] = inter.id;
        this.childX[id] = x;
        this.childY[id] = y;
    }

    public void totalChildren(int t) {
        this.children = new int[t];
        this.childX = new int[t];
        this.childY = new int[t];
    }

    private Model method206(int i, int j) {
        Model model = (Model)aMRUNodes_264.insertFromCache((i << 16) + j);
        if (model != null) {
            return model;
        }
        if (i == 1) {
            model = Model.fetchModel(j);
        }
        if (i == 2) {
            model = NPCDefinition.forID(j).getChatHeadModel();
        }
        if (i == 3) {
            model = Client.myPlayer.getChatHeadModel();
        }
        if (i == 4) {
            model = ItemDefinition.forID(j).method202(50);
        }
        if (i == 5) {
            model = null;
        }
        if (model == null) return model;
        aMRUNodes_264.removeFromCache(model, (i << 16) + j);
        return model;
    }

    private static Sprite loadCachedSprite(int id, String archive) {
        return RSInterface.loadCachedSprite(id, aClass44, archive);
    }

    private static Sprite loadCachedSprite(int i, StreamLoader streamLoader, String s) {
        long l = (TextClass.method585(s) << 8) + (long)i;
        Sprite sprite = (Sprite)aMRUNodes_238.insertFromCache(l);
        if (sprite != null) {
            return sprite;
        }
        try {
            sprite = new Sprite(streamLoader, s, i);
            aMRUNodes_238.removeFromCache(sprite, l);
            return sprite;
        }
        catch (Exception _ex) {
            return null;
        }
    }

    public static void method208(boolean flag, Model model) {
        int i = 0;
        int j = 5;
        if (flag) {
            return;
        }
        aMRUNodes_264.unlinkAll();
        if (model == null) return;
        if (j == 4) return;
        aMRUNodes_264.removeFromCache(model, (j << 16) + i);
    }

    public Model method209(int j, int k, boolean flag) {
        Model model = flag ? this.method206(this.anInt255, this.anInt256) : this.method206(this.anInt233, this.mediaID);
        if (model == null) {
            return null;
        }
        if (k == -1 && j == -1 && model.anIntArray1640 == null) {
            return model;
        }
        Model model_1 = new Model(true, FrameReader.method532(k) & FrameReader.method532(j), false, model);
        if (k != -1 || j != -1) {
            model_1.method469();
        }
        if (k != -1) {
            model_1.method470(k);
        }
        if (j != -1) {
            model_1.method470(j);
        }
        model_1.light(64, 768, -50, -10, -50, true);
        return model_1;
    }

    public static void EquipmentTab(TextDrawingArea[] wid) {
        RSInterface Interface = interfaceCache[1644];
        RSInterface.removeSomething(15101);
        RSInterface.removeSomething(15102);
        RSInterface.removeSomething(15109);
        RSInterface.addSprite(15110, 87);
        RSInterface.addSprite(15111, 88);
        RSInterface.removeSomething(15103);
        RSInterface.removeSomething(15104);
        Interface.children[23] = 15110;
        Interface.childX[23] = 120;
        Interface.childY[23] = 3;
        Interface.children[24] = 15111;
        Interface.childX[24] = 127;
        Interface.childY[24] = 11;
        Interface.children[25] = 15109;
        Interface.childX[25] = 39;
        Interface.childY[25] = 240;
        Interface.children[26] = 27650;
        Interface.childX[26] = 0;
        Interface.childY[26] = 0;
        Interface = RSInterface.addInterface(27650);
        RSInterface.addHoverButton(27653, 81, 40, 39, "Show Equipment Stats", -1, 27654, 1);
        RSInterface.addHoveredButton(27654, 83, 40, 39, 27655);
        RSInterface.addHoverButton(27656, 131, 40, 39, "Show Costume Tab", -1, 27657, 1);
        RSInterface.addHoveredButton(27657, 132, 40, 39, 27658);
        RSInterface.addHoverButton(27659, 86, 26, 33, "Donor tab", -1, 27660, 1);
        RSInterface.addHoveredButton(27660, 85, 26, 33, 27661);
        RSInterface.setChildren(6, Interface);
        RSInterface.setBounds(27659, 84, 215, 0, Interface);
        RSInterface.setBounds(27660, 84, 215, 1, Interface);
        RSInterface.setBounds(27653, 29, 205, 2, Interface);
        RSInterface.setBounds(27654, 29, 205, 3, Interface);
        RSInterface.setBounds(27656, 124, 205, 4, Interface);
        RSInterface.setBounds(27657, 124, 205, 5, Interface);
    }

    public static void equipmentScreen(TextDrawingArea[] TDA) {
        RSInterface Interface = RSInterface.addInterface(19148);
        RSInterface.addSprite(19149, 89);
        RSInterface.addHoverButton(19150, 90, 21, 21, "Close", 0, 19151, 3);
        RSInterface.addHoveredButton(19151, 91, 21, 21, 19152);
        RSInterface.addText(19154, "Equip Your Character...", 16750623, false, true, 52, TDA, 2);
        RSInterface.addText(1673, "Attack bonus", 16750623, false, true, 52, TDA, 2);
        RSInterface.addText(1674, "Defense bonus", 16750623, false, true, 52, TDA, 2);
        RSInterface.addText(1685, "Other bonuses", 16750623, false, true, 52, TDA, 2);
        RSInterface.addText(1675, "Stab:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1676, "Slash:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1677, "Crush:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1678, "Magic:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1679, "Ranged:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1680, "Stab:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1681, "Slash:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1682, "Crush:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1683, "Magic:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1684, "Ranged:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1686, "Strength:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(1687, "Prayer:", 16750623, false, true, 52, TDA, 1);
        RSInterface.addText(19155, "0%", 16750623, false, true, 52, TDA, 1);
        RSInterface.addChar(19153);
        RSInterface.addSprite(19146, 1, "Equipment/aura");
        RSInterface.addAura(10794);
        RSInterface.addButton(29145, 2, "Equipment/aura", 36, 36, "Remove", 1);
        int last = 45;
        int frame = 0;
        RSInterface.setChildren(last, Interface);
        RSInterface.setBounds(19149, 12, 20, frame, Interface);
        RSInterface.setBounds(19150, 472, 27, ++frame, Interface);
        RSInterface.setBounds(19151, 472, 27, ++frame, Interface);
        RSInterface.setBounds(19153, 193, 190, ++frame, Interface);
        RSInterface.setBounds(19154, 23, 29, ++frame, Interface);
        RSInterface.setBounds(1673, 365, 71, ++frame, Interface);
        RSInterface.setBounds(1674, 365, 163, ++frame, Interface);
        RSInterface.setBounds(1675, 372, 85, ++frame, Interface);
        RSInterface.setBounds(1676, 372, 99, ++frame, Interface);
        RSInterface.setBounds(1677, 372, 113, ++frame, Interface);
        RSInterface.setBounds(1678, 372, 127, ++frame, Interface);
        RSInterface.setBounds(1679, 372, 141, ++frame, Interface);
        RSInterface.setBounds(1680, 372, 177, ++frame, Interface);
        RSInterface.setBounds(1681, 372, 191, ++frame, Interface);
        RSInterface.setBounds(1682, 372, 205, ++frame, Interface);
        RSInterface.setBounds(1683, 372, 219, ++frame, Interface);
        RSInterface.setBounds(1684, 372, 233, ++frame, Interface);
        RSInterface.setBounds(1685, 365, 253, ++frame, Interface);
        RSInterface.setBounds(1686, 372, 267, ++frame, Interface);
        RSInterface.setBounds(1687, 372, 281, ++frame, Interface);
        RSInterface.setBounds(19155, 94, 286, ++frame, Interface);
        RSInterface.setBounds(1645, 83, 106, ++frame, Interface);
        RSInterface.setBounds(1646, 83, 135, ++frame, Interface);
        RSInterface.setBounds(1647, 83, 172, ++frame, Interface);
        RSInterface.setBounds(1648, 83, 213, ++frame, Interface);
        RSInterface.setBounds(1649, 27, 185, ++frame, Interface);
        RSInterface.setBounds(1650, 27, 221, ++frame, Interface);
        RSInterface.setBounds(1651, 139, 185, ++frame, Interface);
        RSInterface.setBounds(1652, 139, 221, ++frame, Interface);
        RSInterface.setBounds(1653, 53, 148, ++frame, Interface);
        RSInterface.setBounds(1654, 112, 148, ++frame, Interface);
        RSInterface.setBounds(1655, 63, 109, ++frame, Interface);
        RSInterface.setBounds(1656, 117, 108, ++frame, Interface);
        RSInterface.setBounds(1657, 83, 71, ++frame, Interface);
        RSInterface.setBounds(1658, 42, 110, ++frame, Interface);
        RSInterface.setBounds(1659, 83, 110, ++frame, Interface);
        RSInterface.setBounds(1660, 124, 110, ++frame, Interface);
        RSInterface.setBounds(1661, 27, 149, ++frame, Interface);
        RSInterface.setBounds(1662, 83, 149, ++frame, Interface);
        RSInterface.setBounds(1663, 139, 149, ++frame, Interface);
        RSInterface.setBounds(1664, 83, 189, ++frame, Interface);
        RSInterface.setBounds(1665, 83, 229, ++frame, Interface);
        RSInterface.setBounds(1666, 27, 229, ++frame, Interface);
        RSInterface.setBounds(1667, 139, 229, ++frame, Interface);
        RSInterface.setBounds(1688, 29, 111, ++frame, Interface);
        ++frame;
    }

    public static void addButton(int id, int sid, String spriteName, String tooltip, int mOver, int atAction, int width, int height) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = atAction;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = mOver;
        tab.sprite1 = RSInterface.imageLoader(sid, spriteName);
        tab.sprite2 = RSInterface.imageLoader(sid, spriteName);
        tab.width = width;
        tab.height = height;
        tab.tooltip = tooltip;
    }

    public static void addButton(int id, int sid, String tooltip, int mOver, int atAction, int width, int height) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = atAction;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = mOver;
        tab.sprite1 = Client.cacheSprite[sid];
        tab.sprite2 = Client.cacheSprite[sid];
        tab.width = width;
        tab.height = height;
        tab.tooltip = tooltip;
    }

    public static void addChar(int ID) {
        RSInterface t = RSInterface.interfaceCache[ID] = new RSInterface();
        t.id = ID;
        t.parentID = ID;
        t.type = 6;
        t.atActionType = 0;
        t.contentType = 328;
        t.width = 136;
        t.height = 168;
        t.opacity = 0;
        t.mOverInterToTrigger = 0;
        t.modelZoom = 560;
        t.modelRotation1 = 150;
        t.modelRotation2 = 0;
        t.disabledAnimation = -1;
        t.anInt258 = -1;
    }

    public static void addChar1(int ID) {
        RSInterface t = RSInterface.interfaceCache[ID] = new RSInterface();
        t.id = ID;
        t.parentID = ID;
        t.type = 6;
        t.atActionType = 0;
        t.contentType = 328;
        t.width = 115;
        t.height = 145;
        t.opacity = 0;
        t.mOverInterToTrigger = 0;
        t.modelZoom = 560;
        t.modelRotation1 = 150;
        t.modelRotation2 = 0;
        t.disabledAnimation = -1;
        t.anInt258 = -1;
    }

    private static Sprite loadSprite(int i, String s) {
        try {
            Sprite sprite = new Sprite(s + " " + i);
            if (sprite == null) return null;
            return sprite;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void drawRune(int i, int id, String runeName) {
        RSInterface RSInterface2 = RSInterface.addTabInterface(i);
        RSInterface2.type = 5;
        RSInterface2.atActionType = 0;
        RSInterface2.contentType = 0;
        RSInterface2.opacity = 0;
        RSInterface2.mOverInterToTrigger = 52;
        RSInterface2.sprite1 = RSInterface.loadSprite(id, "Lunar/RUNE");
        RSInterface2.width = 500;
        RSInterface2.height = 500;
    }

    public static void addRuneText(int ID, int runeAmount, int RuneID, TextDrawingArea[] font) {
        RSInterface rsInterface = RSInterface.addTabInterface(ID);
        rsInterface.id = ID;
        rsInterface.parentID = 1151;
        rsInterface.type = 4;
        rsInterface.atActionType = 0;
        rsInterface.contentType = 0;
        rsInterface.width = 0;
        rsInterface.height = 14;
        rsInterface.mOverInterToTrigger = -1;
        rsInterface.valueCompareType = new int[1];
        rsInterface.requiredValues = new int[1];
        rsInterface.valueCompareType[0] = 3;
        rsInterface.requiredValues[0] = runeAmount - 1;
        rsInterface.valueIndexArray = new int[1][4];
        rsInterface.valueIndexArray[0][0] = 4;
        rsInterface.valueIndexArray[0][1] = 3214;
        rsInterface.valueIndexArray[0][2] = RuneID;
        rsInterface.valueIndexArray[0][3] = 0;
        rsInterface.center = true;
        rsInterface.textDrawingAreas = font[0];
        rsInterface.textShadow = true;
        rsInterface.message = "%1/" + runeAmount + "";
        rsInterface.disabledText = "";
        rsInterface.textColor = 12582912;
        rsInterface.anInt219 = 49152;
    }

    public static void homeTeleport() {
        RSInterface RSInterface2 = RSInterface.addTabInterface(30000);
        RSInterface2.tooltip = "Cast @gre@Lunar Home Teleport";
        RSInterface2.id = 30000;
        RSInterface2.parentID = 30000;
        RSInterface2.type = 5;
        RSInterface2.atActionType = 5;
        RSInterface2.contentType = 0;
        RSInterface2.opacity = 0;
        RSInterface2.mOverInterToTrigger = 30001;
        RSInterface2.sprite1 = RSInterface.loadSprite(1, "Lunar/SPRITE");
        RSInterface2.width = 20;
        RSInterface2.height = 20;
        RSInterface hover = RSInterface.addTabInterface(30001);
        hover.mOverInterToTrigger = -1;
        hover.isMouseoverTriggered = true;
        RSInterface.setChildren(1, hover);
        RSInterface.addSprite(30002, 0, "Lunar/SPRITE");
        RSInterface.setBounds(30002, 0, 0, 0, hover);
    }

    public static void addLunar2RunesSmallBox(int ID, int r1, int r2, int ra1, int ra2, int rune1, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
        RSInterface rsInterface = RSInterface.addTabInterface(ID);
        rsInterface.id = ID;
        rsInterface.parentID = 1151;
        rsInterface.type = 5;
        rsInterface.atActionType = type;
        rsInterface.contentType = 0;
        rsInterface.mOverInterToTrigger = ID + 1;
        rsInterface.spellUsableOn = suo;
        rsInterface.selectedActionName = "Cast On";
        rsInterface.width = 20;
        rsInterface.height = 20;
        rsInterface.tooltip = "Cast @gre@" + name;
        rsInterface.spellName = name;
        rsInterface.valueCompareType = new int[3];
        rsInterface.requiredValues = new int[3];
        rsInterface.valueCompareType[0] = 3;
        rsInterface.requiredValues[0] = ra1;
        rsInterface.valueCompareType[1] = 3;
        rsInterface.requiredValues[1] = ra2;
        rsInterface.valueCompareType[2] = 3;
        rsInterface.requiredValues[2] = lvl;
        rsInterface.valueIndexArray = new int[3][];
        rsInterface.valueIndexArray[0] = new int[4];
        rsInterface.valueIndexArray[0][0] = 4;
        rsInterface.valueIndexArray[0][1] = 3214;
        rsInterface.valueIndexArray[0][2] = r1;
        rsInterface.valueIndexArray[0][3] = 0;
        rsInterface.valueIndexArray[1] = new int[4];
        rsInterface.valueIndexArray[1][0] = 4;
        rsInterface.valueIndexArray[1][1] = 3214;
        rsInterface.valueIndexArray[1][2] = r2;
        rsInterface.valueIndexArray[1][3] = 0;
        rsInterface.valueIndexArray[2] = new int[3];
        rsInterface.valueIndexArray[2][0] = 1;
        rsInterface.valueIndexArray[2][1] = 6;
        rsInterface.valueIndexArray[2][2] = 0;
        rsInterface.sprite2 = RSInterface.loadSprite(sid, "Lunar/LUNARON");
        rsInterface.sprite1 = RSInterface.loadSprite(sid, "Lunar/LUNAROFF");
        RSInterface hover = RSInterface.addTabInterface(ID + 1);
        hover.mOverInterToTrigger = -1;
        hover.isMouseoverTriggered = true;
        RSInterface.setChildren(7, hover);
        RSInterface.addSprite(ID + 2, 0, "Lunar/BOX");
        RSInterface.setBounds(ID + 2, 0, 0, 0, hover);
        RSInterface.addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 16750623, true, true, 52, 1);
        RSInterface.setBounds(ID + 3, 90, 4, 1, hover);
        RSInterface.addText(ID + 4, descr, 11495962, true, true, 52, 0);
        RSInterface.setBounds(ID + 4, 90, 19, 2, hover);
        RSInterface.setBounds(30016, 37, 35, 3, hover);
        RSInterface.setBounds(rune1, 112, 35, 4, hover);
        RSInterface.addRuneText(ID + 5, ra1 + 1, r1, TDA);
        RSInterface.setBounds(ID + 5, 50, 66, 5, hover);
        RSInterface.addRuneText(ID + 6, ra2 + 1, r2, TDA);
        RSInterface.setBounds(ID + 6, 123, 66, 6, hover);
    }

    public static void addLunar3RunesSmallBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1, int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
        RSInterface rsInterface = RSInterface.addTabInterface(ID);
        rsInterface.id = ID;
        rsInterface.parentID = 1151;
        rsInterface.type = 5;
        rsInterface.atActionType = type;
        rsInterface.contentType = 0;
        rsInterface.mOverInterToTrigger = ID + 1;
        rsInterface.spellUsableOn = suo;
        rsInterface.selectedActionName = "Cast on";
        rsInterface.width = 20;
        rsInterface.height = 20;
        rsInterface.tooltip = "Cast @gre@" + name;
        rsInterface.spellName = name;
        rsInterface.valueCompareType = new int[4];
        rsInterface.requiredValues = new int[4];
        rsInterface.valueCompareType[0] = 3;
        rsInterface.requiredValues[0] = ra1;
        rsInterface.valueCompareType[1] = 3;
        rsInterface.requiredValues[1] = ra2;
        rsInterface.valueCompareType[2] = 3;
        rsInterface.requiredValues[2] = ra3;
        rsInterface.valueCompareType[3] = 3;
        rsInterface.requiredValues[3] = lvl;
        rsInterface.valueIndexArray = new int[4][];
        rsInterface.valueIndexArray[0] = new int[4];
        rsInterface.valueIndexArray[0][0] = 4;
        rsInterface.valueIndexArray[0][1] = 3214;
        rsInterface.valueIndexArray[0][2] = r1;
        rsInterface.valueIndexArray[0][3] = 0;
        rsInterface.valueIndexArray[1] = new int[4];
        rsInterface.valueIndexArray[1][0] = 4;
        rsInterface.valueIndexArray[1][1] = 3214;
        rsInterface.valueIndexArray[1][2] = r2;
        rsInterface.valueIndexArray[1][3] = 0;
        rsInterface.valueIndexArray[2] = new int[4];
        rsInterface.valueIndexArray[2][0] = 4;
        rsInterface.valueIndexArray[2][1] = 3214;
        rsInterface.valueIndexArray[2][2] = r3;
        rsInterface.valueIndexArray[2][3] = 0;
        rsInterface.valueIndexArray[3] = new int[3];
        rsInterface.valueIndexArray[3][0] = 1;
        rsInterface.valueIndexArray[3][1] = 6;
        rsInterface.valueIndexArray[3][2] = 0;
        rsInterface.sprite2 = RSInterface.loadSprite(sid, "Lunar/LUNARON");
        rsInterface.sprite1 = RSInterface.loadSprite(sid, "Lunar/LUNAROFF");
        RSInterface hover = RSInterface.addTabInterface(ID + 1);
        hover.mOverInterToTrigger = -1;
        hover.isMouseoverTriggered = true;
        RSInterface.setChildren(9, hover);
        RSInterface.addSprite(ID + 2, 0, "Lunar/BOX");
        RSInterface.setBounds(ID + 2, 0, 0, 0, hover);
        RSInterface.addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 16750623, true, true, 52, 1);
        RSInterface.setBounds(ID + 3, 90, 4, 1, hover);
        RSInterface.addText(ID + 4, descr, 11495962, true, true, 52, 0);
        RSInterface.setBounds(ID + 4, 90, 19, 2, hover);
        RSInterface.setBounds(30016, 14, 35, 3, hover);
        RSInterface.setBounds(rune1, 74, 35, 4, hover);
        RSInterface.setBounds(rune2, 130, 35, 5, hover);
        RSInterface.addRuneText(ID + 5, ra1 + 1, r1, TDA);
        RSInterface.setBounds(ID + 5, 26, 66, 6, hover);
        RSInterface.addRuneText(ID + 6, ra2 + 1, r2, TDA);
        RSInterface.setBounds(ID + 6, 87, 66, 7, hover);
        RSInterface.addRuneText(ID + 7, ra3 + 1, r3, TDA);
        RSInterface.setBounds(ID + 7, 142, 66, 8, hover);
    }

    public static void addLunar3RunesBigBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1, int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
        RSInterface rsInterface = RSInterface.addTabInterface(ID);
        rsInterface.id = ID;
        rsInterface.parentID = 1151;
        rsInterface.type = 5;
        rsInterface.atActionType = type;
        rsInterface.contentType = 0;
        rsInterface.mOverInterToTrigger = ID + 1;
        rsInterface.spellUsableOn = suo;
        rsInterface.selectedActionName = "Cast on";
        rsInterface.width = 20;
        rsInterface.height = 20;
        rsInterface.tooltip = "Cast @gre@" + name;
        rsInterface.spellName = name;
        rsInterface.valueCompareType = new int[4];
        rsInterface.requiredValues = new int[4];
        rsInterface.valueCompareType[0] = 3;
        rsInterface.requiredValues[0] = ra1;
        rsInterface.valueCompareType[1] = 3;
        rsInterface.requiredValues[1] = ra2;
        rsInterface.valueCompareType[2] = 3;
        rsInterface.requiredValues[2] = ra3;
        rsInterface.valueCompareType[3] = 3;
        rsInterface.requiredValues[3] = lvl;
        rsInterface.valueIndexArray = new int[4][];
        rsInterface.valueIndexArray[0] = new int[4];
        rsInterface.valueIndexArray[0][0] = 4;
        rsInterface.valueIndexArray[0][1] = 3214;
        rsInterface.valueIndexArray[0][2] = r1;
        rsInterface.valueIndexArray[0][3] = 0;
        rsInterface.valueIndexArray[1] = new int[4];
        rsInterface.valueIndexArray[1][0] = 4;
        rsInterface.valueIndexArray[1][1] = 3214;
        rsInterface.valueIndexArray[1][2] = r2;
        rsInterface.valueIndexArray[1][3] = 0;
        rsInterface.valueIndexArray[2] = new int[4];
        rsInterface.valueIndexArray[2][0] = 4;
        rsInterface.valueIndexArray[2][1] = 3214;
        rsInterface.valueIndexArray[2][2] = r3;
        rsInterface.valueIndexArray[2][3] = 0;
        rsInterface.valueIndexArray[3] = new int[3];
        rsInterface.valueIndexArray[3][0] = 1;
        rsInterface.valueIndexArray[3][1] = 6;
        rsInterface.valueIndexArray[3][2] = 0;
        rsInterface.sprite2 = RSInterface.loadSprite(sid, "Lunar/LUNARON");
        rsInterface.sprite1 = RSInterface.loadSprite(sid, "Lunar/LUNAROFF");
        RSInterface hover = RSInterface.addTabInterface(ID + 1);
        hover.mOverInterToTrigger = -1;
        hover.isMouseoverTriggered = true;
        RSInterface.setChildren(9, hover);
        RSInterface.addSprite(ID + 2, 1, "Lunar/BOX");
        RSInterface.setBounds(ID + 2, 0, 0, 0, hover);
        RSInterface.addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 16750623, true, true, 52, 1);
        RSInterface.setBounds(ID + 3, 90, 4, 1, hover);
        RSInterface.addText(ID + 4, descr, 11495962, true, true, 52, 0);
        RSInterface.setBounds(ID + 4, 90, 21, 2, hover);
        RSInterface.setBounds(30016, 14, 48, 3, hover);
        RSInterface.setBounds(rune1, 74, 48, 4, hover);
        RSInterface.setBounds(rune2, 130, 48, 5, hover);
        RSInterface.addRuneText(ID + 5, ra1 + 1, r1, TDA);
        RSInterface.setBounds(ID + 5, 26, 79, 6, hover);
        RSInterface.addRuneText(ID + 6, ra2 + 1, r2, TDA);
        RSInterface.setBounds(ID + 6, 87, 79, 7, hover);
        RSInterface.addRuneText(ID + 7, ra3 + 1, r3, TDA);
        RSInterface.setBounds(ID + 7, 142, 79, 8, hover);
    }

    public static void addLunar3RunesLargeBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1, int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
        RSInterface rsInterface = RSInterface.addTabInterface(ID);
        rsInterface.id = ID;
        rsInterface.parentID = 1151;
        rsInterface.type = 5;
        rsInterface.atActionType = type;
        rsInterface.contentType = 0;
        rsInterface.mOverInterToTrigger = ID + 1;
        rsInterface.spellUsableOn = suo;
        rsInterface.selectedActionName = "Cast on";
        rsInterface.width = 20;
        rsInterface.height = 20;
        rsInterface.tooltip = "Cast @gre@" + name;
        rsInterface.spellName = name;
        rsInterface.valueCompareType = new int[4];
        rsInterface.requiredValues = new int[4];
        rsInterface.valueCompareType[0] = 3;
        rsInterface.requiredValues[0] = ra1;
        rsInterface.valueCompareType[1] = 3;
        rsInterface.requiredValues[1] = ra2;
        rsInterface.valueCompareType[2] = 3;
        rsInterface.requiredValues[2] = ra3;
        rsInterface.valueCompareType[3] = 3;
        rsInterface.requiredValues[3] = lvl;
        rsInterface.valueIndexArray = new int[4][];
        rsInterface.valueIndexArray[0] = new int[4];
        rsInterface.valueIndexArray[0][0] = 4;
        rsInterface.valueIndexArray[0][1] = 3214;
        rsInterface.valueIndexArray[0][2] = r1;
        rsInterface.valueIndexArray[0][3] = 0;
        rsInterface.valueIndexArray[1] = new int[4];
        rsInterface.valueIndexArray[1][0] = 4;
        rsInterface.valueIndexArray[1][1] = 3214;
        rsInterface.valueIndexArray[1][2] = r2;
        rsInterface.valueIndexArray[1][3] = 0;
        rsInterface.valueIndexArray[2] = new int[4];
        rsInterface.valueIndexArray[2][0] = 4;
        rsInterface.valueIndexArray[2][1] = 3214;
        rsInterface.valueIndexArray[2][2] = r3;
        rsInterface.valueIndexArray[2][3] = 0;
        rsInterface.valueIndexArray[3] = new int[3];
        rsInterface.valueIndexArray[3][0] = 1;
        rsInterface.valueIndexArray[3][1] = 6;
        rsInterface.valueIndexArray[3][2] = 0;
        rsInterface.sprite2 = RSInterface.loadSprite(sid, "Lunar/LUNARON");
        rsInterface.sprite1 = RSInterface.loadSprite(sid, "Lunar/LUNAROFF");
        RSInterface hover = RSInterface.addTabInterface(ID + 1);
        hover.isMouseoverTriggered = true;
        hover.mOverInterToTrigger = -1;
        RSInterface.setChildren(9, hover);
        RSInterface.addSprite(ID + 2, 2, "Lunar/BOX");
        RSInterface.setBounds(ID + 2, 0, 0, 0, hover);
        RSInterface.addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 16750623, true, true, 52, 1);
        RSInterface.setBounds(ID + 3, 90, 4, 1, hover);
        RSInterface.addText(ID + 4, descr, 11495962, true, true, 52, 0);
        RSInterface.setBounds(ID + 4, 90, 34, 2, hover);
        RSInterface.setBounds(30016, 14, 61, 3, hover);
        RSInterface.setBounds(rune1, 74, 61, 4, hover);
        RSInterface.setBounds(rune2, 130, 61, 5, hover);
        RSInterface.addRuneText(ID + 5, ra1 + 1, r1, TDA);
        RSInterface.setBounds(ID + 5, 26, 92, 6, hover);
        RSInterface.addRuneText(ID + 6, ra2 + 1, r2, TDA);
        RSInterface.setBounds(ID + 6, 87, 92, 7, hover);
        RSInterface.addRuneText(ID + 7, ra3 + 1, r3, TDA);
        RSInterface.setBounds(ID + 7, 142, 92, 8, hover);
    }

    public static void addBobStorage(int index) {
        RSInterface rsi = RSInterface.interfaceCache[index] = new RSInterface();
        rsi.itemActions = new String[5];
        rsi.spritesX = new int[20];
        rsi.invStackSizes = new int[30];
        rsi.customName = new String[30];
        rsi.inv = new int[30];
        rsi.spritesY = new int[20];
        rsi.children = new int[0];
        rsi.childX = new int[0];
        rsi.childY = new int[0];
        rsi.itemActions[0] = "Take 1";
        rsi.itemActions[1] = "Take 5";
        rsi.itemActions[2] = "Take 10";
        rsi.itemActions[3] = "Take All";
        rsi.center = false;
        rsi.aBoolean227 = false;
        rsi.aBoolean235 = false;
        rsi.usableItemInterface = false;
        rsi.isInventoryInterface = false;
        rsi.aBoolean259 = true;
        rsi.textShadow = false;
        rsi.type = -1;
        rsi.invSpritePadX = 24;
        rsi.invSpritePadY = 24;
        rsi.height = 5;
        rsi.width = 6;
        rsi.parentID = 2702;
        rsi.id = 2700;
        rsi.type = 2;
    }

    public static void bobInterface(TextDrawingArea[] TDA) {
        RSInterface rsi = RSInterface.addTabInterface(2700);
        RSInterface.addSprite(2701, 20, "Interfaces/SummonTab/SUMMON");
        RSInterface.addBobStorage(2702);
        RSInterface.addHoverButton(2703, "Interfaces/Equipment/SPRITE", 1, 21, 21, "Close", 250, 2704, 3);
        RSInterface.addHoveredButton(2704, "Interfaces/Equipment/SPRITE", 3, 21, 21, 2705);
        rsi.totalChildren(4);
        rsi.child(0, 2701, 90, 14);
        rsi.child(1, 2702, 100, 56);
        rsi.child(2, 2703, 431, 23);
        rsi.child(3, 2704, 431, 23);
    }

    public static void addText(int i, String s, int k, boolean l, boolean m, int a, int j) {
        RSInterface rsinterface = RSInterface.addTabInterface(i);
        rsinterface.parentID = i;
        rsinterface.id = i;
        rsinterface.type = 4;
        rsinterface.atActionType = 0;
        rsinterface.width = 0;
        rsinterface.height = 0;
        rsinterface.contentType = 0;
        rsinterface.mOverInterToTrigger = a;
        rsinterface.center = l;
        rsinterface.textShadow = m;
        rsinterface.textDrawingAreas = fonts[j];
        rsinterface.message = s;
        rsinterface.textColor = k;
    }

    public static void configureLunar(TextDrawingArea[] TDA) {
        RSInterface.homeTeleport();
        RSInterface.drawRune(30003, 1, "Fire");
        RSInterface.drawRune(30004, 2, "Water");
        RSInterface.drawRune(30005, 3, "Air");
        RSInterface.drawRune(30006, 4, "Earth");
        RSInterface.drawRune(30007, 5, "Mind");
        RSInterface.drawRune(30008, 6, "Body");
        RSInterface.drawRune(30009, 7, "Death");
        RSInterface.drawRune(30010, 8, "Nature");
        RSInterface.drawRune(30011, 9, "Chaos");
        RSInterface.drawRune(30012, 10, "Law");
        RSInterface.drawRune(30013, 11, "Cosmic");
        RSInterface.drawRune(30014, 12, "Blood");
        RSInterface.drawRune(30015, 13, "Soul");
        RSInterface.drawRune(30016, 14, "Astral");
        RSInterface.addLunar3RunesSmallBox(30017, 9075, 554, 555, 0, 4, 3, 30003, 30004, 64, "Bake Pie", "Bake pies without a stove", TDA, 0, 16, 2);
        RSInterface.addLunar2RunesSmallBox(30025, 9075, 557, 0, 7, 30006, 65, "Cure Plant", "Cure disease on farming patch", TDA, 1, 4, 2);
        RSInterface.addLunar3RunesBigBox(30032, 9075, 564, 558, 0, 0, 0, 30013, 30007, 65, "Monster Examine", "Detect the combat statistics of a\\nmonster", TDA, 2, 2, 2);
        RSInterface.addLunar3RunesSmallBox(30040, 9075, 564, 556, 0, 0, 1, 30013, 30005, 66, "NPC Contact", "Speak with varied NPCs", TDA, 3, 0, 2);
        RSInterface.addLunar3RunesSmallBox(30048, 9075, 563, 557, 0, 0, 9, 30012, 30006, 67, "Cure Other", "Cure poisoned players", TDA, 4, 8, 2);
        RSInterface.addLunar3RunesSmallBox(30056, 9075, 555, 554, 0, 2, 0, 30004, 30003, 67, "Humidify", "fills certain vessels with water", TDA, 5, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30064, 9075, 563, 557, 1, 0, 1, 30012, 30006, 68, "Skill Teleport", "Skill Teleport", TDA, 6, 0, 5);
        RSInterface.addLunar3RunesBigBox(30075, 9075, 563, 557, 1, 0, 3, 30012, 30006, 69, "Minigames", "Barrows & Assault", TDA, 7, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30083, 9075, 563, 557, 1, 0, 5, 30012, 30006, 70, "Boss Teleport", "Boss Teleport", TDA, 8, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012, 70, "Cure Me", "Cures Poison", TDA, 9, 0, 5);
        RSInterface.addLunar2RunesSmallBox(30099, 9075, 557, 1, 1, 30006, 70, "Hunter Kit", "Get a kit of hunting gear", TDA, 10, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30106, 9075, 563, 555, 1, 0, 0, 30012, 30004, 71, "Pk Teleport", "Gives your several of options", TDA, 11, 0, 5);
        RSInterface.addLunar3RunesBigBox(30114, 9075, 563, 555, 1, 0, 4, 30012, 30004, 72, "Monster Teleport", "Monster Teleport", TDA, 12, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012, 73, "Cure Group", "Cures Poison on players", TDA, 13, 0, 5);
        RSInterface.addLunar3RunesBigBox(30130, 9075, 564, 559, 1, 1, 4, 30013, 30008, 74, "Stat Spy", "Cast on another player to see their\\nskill levels", TDA, 14, 8, 2);
        RSInterface.addLunar3RunesBigBox(30138, 9075, 563, 554, 1, 1, 2, 30012, 30003, 74, "Barbarian Teleport", "Teleports you to the Barbarian\\noutpost", TDA, 15, 0, 5);
        RSInterface.addLunar3RunesBigBox(30146, 9075, 563, 554, 1, 1, 5, 30012, 30003, 75, "Tele Group Barbarian", "Teleports players to the Barbarian\\noutpost", TDA, 16, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30154, 9075, 554, 556, 1, 5, 9, 30003, 30005, 76, "Superglass Make", "Make glass without a furnace", TDA, 17, 16, 2);
        RSInterface.addLunar3RunesSmallBox(30162, 9075, 563, 555, 1, 1, 3, 30012, 30004, 77, "Khazard Teleport", "Teleports you to Port khazard", TDA, 18, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30170, 9075, 563, 555, 1, 1, 7, 30012, 30004, 78, "Tele Group Khazard", "Teleports players to Port khazard", TDA, 19, 0, 5);
        RSInterface.addLunar3RunesBigBox(30178, 9075, 564, 559, 1, 0, 4, 30013, 30008, 78, "Dream", "Take a rest and restore hitpoints 3\\n times faster", TDA, 20, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30186, 9075, 557, 555, 1, 9, 4, 30006, 30004, 79, "String Jewellery", "String amulets without wool", TDA, 21, 0, 5);
        RSInterface.addLunar3RunesLargeBox(30194, 9075, 557, 555, 1, 9, 9, 30006, 30004, 80, "Stat Restore Pot\\nShare", "Share a potion with up to 4 nearby\\nplayers", TDA, 22, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30202, 9075, 554, 555, 1, 6, 6, 30003, 30004, 81, "Magic Imbue", "Combine runes without a talisman", TDA, 23, 0, 5);
        RSInterface.addLunar3RunesBigBox(30210, 9075, 561, 557, 2, 1, 14, 30010, 30006, 82, "Fertile Soil", "Fertilise a farming patch with super\\ncompost", TDA, 24, 4, 2);
        RSInterface.addLunar3RunesBigBox(30218, 9075, 557, 555, 2, 11, 9, 30006, 30004, 83, "Boost Potion Share", "Shares a potion with up to 4 nearby\\nplayers", TDA, 25, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30226, 9075, 563, 555, 2, 2, 9, 30012, 30004, 84, "Fishing Guild Teleport", "Teleports you to the fishing guild", TDA, 26, 0, 5);
        RSInterface.addLunar3RunesLargeBox(30234, 9075, 563, 555, 1, 2, 13, 30012, 30004, 85, "Tele Group Fishing\\nGuild", "Teleports players to the Fishing\\nGuild", TDA, 27, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30242, 9075, 557, 561, 2, 14, 0, 30006, 30010, 85, "Plank Make", "Turn Logs into planks", TDA, 28, 16, 5);
        RSInterface.addLunar3RunesSmallBox(30250, 9075, 563, 555, 2, 2, 9, 30012, 30004, 86, "Catherby Teleport", "Teleports you to Catherby", TDA, 29, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30258, 9075, 563, 555, 2, 2, 14, 30012, 30004, 87, "Tele Group Catherby", "Teleports players to Catherby", TDA, 30, 0, 5);
        RSInterface.addLunar3RunesSmallBox(30266, 9075, 563, 555, 2, 2, 7, 30012, 30004, 88, "Ice Plateau Teleport", "Teleports you to Ice Plateau", TDA, 31, 0, 5);
        RSInterface.addLunar3RunesBigBox(30274, 9075, 563, 555, 2, 2, 15, 30012, 30004, 89, "Tele Group Ice\\n Plateau", "Teleports players to Ice Plateau", TDA, 32, 0, 5);
        RSInterface.addLunar3RunesBigBox(30282, 9075, 563, 561, 2, 1, 0, 30012, 30010, 90, "Energy Transfer", "Spend hitpoints and SA Energy to\\n give another player hitpoints and run energy", TDA, 33, 8, 2);
        RSInterface.addLunar3RunesBigBox(30290, 9075, 563, 565, 2, 2, 0, 30012, 30014, 91, "Heal Other", "Transfer up to 75% of hitpoints\\n to another player", TDA, 34, 8, 2);
        RSInterface.addLunar3RunesBigBox(30298, 9075, 560, 557, 2, 1, 9, 30009, 30006, 92, "Vengeance Other", "Allows another player to rebound\\ndamage to an opponent", TDA, 35, 8, 2);
        RSInterface.addLunar3RunesSmallBox(30306, 9075, 560, 557, 3, 1, 9, 30009, 30006, 93, "Vengeance", "Rebound damage to an opponent", TDA, 36, 0, 5);
        RSInterface.addLunar3RunesBigBox(30314, 9075, 565, 563, 3, 2, 5, 30014, 30012, 94, "Heal Group", "Transfer up to 75% of hitpoints to a group", TDA, 37, 0, 5);
        RSInterface.addLunar3RunesBigBox(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95, "Spellbook Swap", "Change to another spellbook for 1\\nspell cast", TDA, 38, 0, 5);
    }

    public static void constructLunar() {
        RSInterface Interface = RSInterface.addTabInterface(29999);
        RSInterface.setChildren(80, Interface);
        RSInterface.setBounds(30000, 11, 10, 0, Interface);
        RSInterface.setBounds(30017, 40, 9, 1, Interface);
        RSInterface.setBounds(30025, 71, 12, 2, Interface);
        RSInterface.setBounds(30032, 103, 10, 3, Interface);
        RSInterface.setBounds(30040, 135, 12, 4, Interface);
        RSInterface.setBounds(30048, 165, 10, 5, Interface);
        RSInterface.setBounds(30056, 8, 38, 6, Interface);
        RSInterface.setBounds(30064, 39, 39, 7, Interface);
        RSInterface.setBounds(30075, 71, 39, 8, Interface);
        RSInterface.setBounds(30083, 103, 39, 9, Interface);
        RSInterface.setBounds(30091, 135, 39, 10, Interface);
        RSInterface.setBounds(30099, 165, 37, 11, Interface);
        RSInterface.setBounds(30106, 12, 68, 12, Interface);
        RSInterface.setBounds(30114, 42, 68, 13, Interface);
        RSInterface.setBounds(30122, 71, 68, 14, Interface);
        RSInterface.setBounds(30130, 103, 68, 15, Interface);
        RSInterface.setBounds(30138, 135, 68, 16, Interface);
        RSInterface.setBounds(30146, 165, 68, 17, Interface);
        RSInterface.setBounds(30154, 14, 97, 18, Interface);
        RSInterface.setBounds(30162, 42, 97, 19, Interface);
        RSInterface.setBounds(30170, 71, 97, 20, Interface);
        RSInterface.setBounds(30178, 101, 97, 21, Interface);
        RSInterface.setBounds(30186, 135, 98, 22, Interface);
        RSInterface.setBounds(30194, 168, 98, 23, Interface);
        RSInterface.setBounds(30202, 11, 125, 24, Interface);
        RSInterface.setBounds(30210, 42, 124, 25, Interface);
        RSInterface.setBounds(30218, 74, 125, 26, Interface);
        RSInterface.setBounds(30226, 103, 125, 27, Interface);
        RSInterface.setBounds(30234, 135, 125, 28, Interface);
        RSInterface.setBounds(30242, 164, 126, 29, Interface);
        RSInterface.setBounds(30250, 10, 155, 30, Interface);
        RSInterface.setBounds(30258, 42, 155, 31, Interface);
        RSInterface.setBounds(30266, 71, 155, 32, Interface);
        RSInterface.setBounds(30274, 103, 155, 33, Interface);
        RSInterface.setBounds(30282, 136, 155, 34, Interface);
        RSInterface.setBounds(30290, 165, 155, 35, Interface);
        RSInterface.setBounds(30298, 13, 185, 36, Interface);
        RSInterface.setBounds(30306, 42, 185, 37, Interface);
        RSInterface.setBounds(30314, 71, 184, 38, Interface);
        RSInterface.setBounds(30322, 104, 184, 39, Interface);
        RSInterface.setBounds(30001, 6, 184, 40, Interface);
        RSInterface.setBounds(30018, 5, 176, 41, Interface);
        RSInterface.setBounds(30026, 5, 176, 42, Interface);
        RSInterface.setBounds(30033, 5, 163, 43, Interface);
        RSInterface.setBounds(30041, 5, 176, 44, Interface);
        RSInterface.setBounds(30049, 5, 176, 45, Interface);
        RSInterface.setBounds(30057, 5, 176, 46, Interface);
        RSInterface.setBounds(30065, 5, 176, 47, Interface);
        RSInterface.setBounds(30076, 5, 163, 48, Interface);
        RSInterface.setBounds(30084, 5, 176, 49, Interface);
        RSInterface.setBounds(30092, 5, 176, 50, Interface);
        RSInterface.setBounds(30100, 5, 176, 51, Interface);
        RSInterface.setBounds(30107, 5, 176, 52, Interface);
        RSInterface.setBounds(30115, 5, 163, 53, Interface);
        RSInterface.setBounds(30123, 5, 176, 54, Interface);
        RSInterface.setBounds(30131, 5, 163, 55, Interface);
        RSInterface.setBounds(30139, 5, 163, 56, Interface);
        RSInterface.setBounds(30147, 5, 163, 57, Interface);
        RSInterface.setBounds(30155, 5, 176, 58, Interface);
        RSInterface.setBounds(30163, 5, 176, 59, Interface);
        RSInterface.setBounds(30171, 5, 176, 60, Interface);
        RSInterface.setBounds(30179, 5, 163, 61, Interface);
        RSInterface.setBounds(30187, 5, 176, 62, Interface);
        RSInterface.setBounds(30195, 5, 149, 63, Interface);
        RSInterface.setBounds(30203, 5, 176, 64, Interface);
        RSInterface.setBounds(30211, 5, 163, 65, Interface);
        RSInterface.setBounds(30219, 5, 163, 66, Interface);
        RSInterface.setBounds(30227, 5, 176, 67, Interface);
        RSInterface.setBounds(30235, 5, 149, 68, Interface);
        RSInterface.setBounds(30243, 5, 176, 69, Interface);
        RSInterface.setBounds(30251, 5, 5, 70, Interface);
        RSInterface.setBounds(30259, 5, 5, 71, Interface);
        RSInterface.setBounds(30267, 5, 5, 72, Interface);
        RSInterface.setBounds(30275, 5, 5, 73, Interface);
        RSInterface.setBounds(30283, 5, 5, 74, Interface);
        RSInterface.setBounds(30291, 5, 5, 75, Interface);
        RSInterface.setBounds(30299, 5, 5, 76, Interface);
        RSInterface.setBounds(30307, 5, 5, 77, Interface);
        RSInterface.setBounds(30323, 5, 5, 78, Interface);
        RSInterface.setBounds(30315, 5, 5, 79, Interface);
    }

    public static void setBounds(int ID, int X, int Y, int frame, RSInterface RSinterface) {
        try {
            RSinterface.children[frame] = ID;
            RSinterface.childX[frame] = X;
            RSinterface.childY[frame] = Y;
            return;
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void addButton(int i, int j, String name, int W, int H, String S, int AT) {
        RSInterface RSInterface2 = RSInterface.addInterface(i);
        RSInterface2.id = i;
        RSInterface2.parentID = i;
        RSInterface2.type = 5;
        RSInterface2.atActionType = AT;
        RSInterface2.contentType = 0;
        RSInterface2.opacity = 0;
        RSInterface2.mOverInterToTrigger = 52;
        RSInterface2.sprite1 = RSInterface.imageLoader(j, name);
        RSInterface2.sprite2 = RSInterface.imageLoader(j, name);
        RSInterface2.width = W;
        RSInterface2.height = H;
        RSInterface2.tooltip = S;
    }

    public RSInterface() {
        this.itemSpriteId1 = -1;
        this.itemSpriteId2 = -1;
        this.itemSpriteZoom1 = -1;
        this.itemSpriteZoom2 = -1;
        this.itemSpriteIndex = 0;
    }

    public RSInterface(int identifier) {
        this.id = identifier;
        RSInterface.interfaceCache[identifier] = this;
    }

    public RSInterface(int identifier, int width, int height) {
        this(identifier);
        this.width = width;
        this.height = height;
    }

    public RSInterface(int identifier, int width, int height, int type, int atActionType) {
        this(identifier);
        this.width = width;
        this.height = height;
        this.type = type;
        this.atActionType = atActionType;
    }

    public static void addActionButton(StreamLoader archive, int id, int sprite, int sprite2, int width, int height, String s) {
        RSInterface rsi = RSInterface.interfaceCache[id] = new RSInterface();
        rsi.sprite1 = RSInterface.loadCachedSprite(sprite, archive, "");
        rsi.sprite2 = sprite2 == sprite ? RSInterface.loadCachedSprite(sprite, archive, "a") : RSInterface.loadCachedSprite(sprite2, archive, "");
        rsi.tooltip = s;
        rsi.contentType = 0;
        rsi.atActionType = 1;
        rsi.width = width;
        rsi.mOverInterToTrigger = 52;
        rsi.parentID = id;
        rsi.id = id;
        rsi.type = 5;
        rsi.height = height;
    }

    public static void addToggleButton(StreamLoader archive, int id, int sprite, int setconfig, int width, int height, String s) {
        RSInterface rsi = RSInterface.addInterface(id);
        rsi.sprite1 = RSInterface.loadCachedSprite(sprite, archive, "");
        rsi.sprite2 = RSInterface.loadCachedSprite(sprite, archive, "a");
        rsi.requiredValues = new int[1];
        rsi.requiredValues[0] = 1;
        rsi.valueCompareType = new int[1];
        rsi.valueCompareType[0] = 1;
        rsi.valueIndexArray = new int[1][3];
        rsi.valueIndexArray[0][0] = 5;
        rsi.valueIndexArray[0][1] = setconfig;
        rsi.valueIndexArray[0][2] = 0;
        rsi.atActionType = 4;
        rsi.width = width;
        rsi.mOverInterToTrigger = -1;
        rsi.parentID = id;
        rsi.id = id;
        rsi.type = 5;
        rsi.height = height;
        rsi.tooltip = s;
    }

    public static void addHoverButton(StreamLoader cacheArchive, int id, String imgName, int imgId, int width, int height, String tooltipText, int contentType, int hoverOver, int actionType) {
        RSInterface tab = RSInterface.addInterface(id);
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = actionType;
        tab.contentType = contentType;
        tab.opacity = 0;
        tab.mOverInterToTrigger = hoverOver;
        tab.sprite1 = RSInterface.loadCachedSprite(imgId, cacheArchive, imgName);
        tab.sprite2 = RSInterface.loadCachedSprite(imgId, cacheArchive, imgName);
        tab.width = width;
        tab.height = height;
        tab.tooltip = tooltipText;
    }

    public static void addHoveredButton(StreamLoader cacheArchive, int id, String imageName, int imageId, int width, int height, int IMAGEID) {
        RSInterface tab = RSInterface.addInterface(id);
        tab.parentID = id;
        tab.id = id;
        tab.type = 0;
        tab.atActionType = 0;
        tab.width = width;
        tab.height = height;
        tab.isMouseoverTriggered = true;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        tab.scrollMax = 0;
        RSInterface.addHoverImage(cacheArchive, IMAGEID, imageId, imageId, imageName);
        tab.totalChildren(1);
        tab.child(0, IMAGEID, 0, 0);
    }

    public static void addHoverImage(StreamLoader cacheArchive, int id, int sprite1, int sprite2, String name) {
        RSInterface tab = RSInterface.addInterface(id);
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = Client.getClientWidth();
        tab.height = Client.getClientHeight();
        tab.opacity = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = RSInterface.loadCachedSprite(sprite1, cacheArchive, name);
        tab.sprite2 = RSInterface.loadCachedSprite(sprite2, cacheArchive, name);
    }

    public static void addHead(int id, int width, int height, int zoom) {
        RSInterface rsinterface = RSInterface.addInterface(id);
        rsinterface.type = 6;
        rsinterface.modelZoom = zoom;
        rsinterface.modelRotation2 = 40;
        rsinterface.modelRotation1 = 1900;
        rsinterface.width = width;
        rsinterface.height = height;
    }

    public static void addTransparentSprite(StreamLoader cacheArchive, int id, int spriteId, String spriteName, int transparency) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.opacity = (byte)transparency;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = RSInterface.loadCachedSprite(spriteId, cacheArchive, spriteName);
        tab.sprite2 = RSInterface.loadCachedSprite(spriteId, cacheArchive, spriteName);
        tab.width = Client.getClientWidth();
        tab.height = Client.getClientHeight();
        tab.drawsTransparent = true;
    }

    public static void addSprite(StreamLoader cacheArchive, int id, int spriteId, String spriteName) {
        RSInterface tab = RSInterface.interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = RSInterface.loadCachedSprite(spriteId, cacheArchive, spriteName);
        tab.sprite2 = RSInterface.loadCachedSprite(spriteId, cacheArchive, spriteName);
        tab.width = Client.getClientWidth();
        tab.height = Client.getClientHeight();
    }

    public static void addButton(StreamLoader archive, int id, int spriteId, String spriteName, String tooltip) {
        RSInterface rsi = RSInterface.interfaceCache[id] = new RSInterface();
        rsi.id = id;
        rsi.parentID = id;
        rsi.type = 5;
        rsi.atActionType = 1;
        rsi.contentType = 0;
        rsi.opacity = 0;
        rsi.mOverInterToTrigger = 52;
        rsi.sprite1 = RSInterface.loadCachedSprite(spriteId, archive, spriteName);
        rsi.sprite2 = RSInterface.loadCachedSprite(spriteId, archive, spriteName);
        rsi.width = rsi.sprite1.myWidth;
        rsi.height = rsi.sprite2.myHeight;
        rsi.tooltip = tooltip;
    }

    public boolean drawInterface(Client client, int widgetDrawX, int widgetDrawY, int superWidgetDrawX, int superWidgetDrawY) {
        return false;
    }

    public boolean handleInterfaceAction(Client client, int mouseX, int mouseY, int widgetDrawX, int widgetDrawY, int scrollPos) {
        return false;
    }

    public static /* varargs */ void addDropMenu(int id, int width, int height, int color, TextDrawingArea tda, MenuItem ... menuItems) {
        RSInterface component = RSInterface.addInterface(id);
        RSInterface.setChildren(1 + menuItems.length, component);
        RSInterface.setBounds(id + 1, 0, 0, 0, component);
        for (int i = 0; i < menuItems.length; ++i) {
            RSInterface.setBounds(id + 2 + i, 0, -1 + height + i * height, 1 + i, component);
        }
        RSInterface menu = RSInterface.addInterface(id + 1);
        menu.parentID = id;
        menu.type = 12;
        menu.opacity = 127;
        menu.atActionType = 9;
        menu.width = width;
        menu.height = height;
        menu.tooltip = "Open";
        menu.textColor = color;
        menu.textDrawingAreas = tda;
        menu.message = menuItems[0].getText();
        menu.defaultMenuItem = menuItems[0];
        int i = 0;
        while (i < menuItems.length) {
            RSInterface menuItem = RSInterface.addInterface(id + 2 + i);
            menuItem.type = 13;
            menuItem.parentID = id + 1;
            menuItem.width = width;
            menuItem.height = height;
            menuItem.opacity = 255;
            menuItem.atActionType = 10;
            menuItem.mOverInterToTrigger = id + 1;
            menuItem.textColor = color;
            Sprite sprite = menuItems[i].getSprite();
            if (sprite != null) {
                if (menuItems[i].getSprite().myHeight > menuItem.height - 2) {
                    sprite = Sprite.getResizedSprite(menuItems[i].getSprite(), width, height);
                }
                menuItem.sprite2 = sprite;
            }
            menuItem.menuItem = menuItems[i];
            menuItem.textDrawingAreas = tda;
            ++i;
        }
    }

    static {
        boxIds = new int[]{4041, 4077, 4113, 4047, 4083, 4119, 4053, 4089, 4125, 4059, 4095, 4131, 4065, 4101, 4137, 4071, 4107, 4143, 4154, 12168, 13918};
        aMRUNodes_264 = new MRUNodes(30);
        summoningLevelRequirements = new int[]{1, 4, 10, 13, 16, 17, 18, 19, 22, 23, 25, 28, 29, 31, 32, 33, 34, 34, 34, 34, 36, 40, 41, 42, 43, 43, 43, 43, 43, 43, 43, 46, 46, 47, 49, 52, 54, 55, 56, 56, 57, 57, 57, 58, 61, 62, 63, 64, 66, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 76, 77, 78, 79, 79, 79, 80, 83, 83, 85, 86, 88, 89, 92, 93, 95, 96, 99};
        pouchItems = new int[]{12047, 12043, 12059, 12019, 12009, 12778, 12049, 12055, 12808, 12067, 12063, 12091, 12800, 12053, 12065, 12021, 12818, 12780, 12798, 12814, 12073, 12087, 12071, 12051, 12095, 12097, 12099, 12101, 12103, 12105, 12107, 12075, 12816, 12041, 12061, 12007, 12035, 12027, 12077, 12531, 12810, 12812, 12784, 12023, 12085, 12037, 12015, 12045, 12079, 12123, 12031, 12029, 12033, 12820, 12057, 14623, 12792, 12069, 12011, 12081, 12782, 12794, 12013, 12802, 12804, 12806, 12025, 12017, 12788, 12776, 12083, 12039, 12786, 12089, 12796, 12822, 12093, 12790};
        scrollItems = new int[]{12425, 12445, 12428, 12459, 12533, 12838, 12460, 12432, 12839, 12430, 12446, 12440, 12834, 12447, 12433, 12429, 12443, 12443, 12443, 12443, 12461, 12431, 12422, 12448, 12458, 12458, 12458, 12458, 12458, 12458, 12458, 12462, 12829, 12426, 12444, 12441, 12454, 12453, 12463, 12424, 12835, 12836, 12840, 12455, 12468, 12427, 12436, 12467, 12464, 12452, 12439, 12438, 12423, 12830, 12451, 14622, 12826, 12449, 12450, 12465, 12841, 12831, 12457, 12824, 12824, 12824, 12442, 12456, 12837, 12832, 12466, 12434, 12833, 12437, 12827, 12828, 12435, 12825};
        scrollNames = new String[]{"Howl", "Dreadfowl Strike", "Egg Spawn", "Slime Spray", "Stony Shell", "Pester", "Electric Lash", "Venom Shot", "Fireball Assault", "Cheese Feast", "Sandstorm", "Generate Compost", "Explode", "Vampire Touch", "Insane Ferocity", "Multichop", "Call of Arms", "Call of Arms", "Call of Arms", "Call of Arms", "Bronze Bull Rush", "Unburden", "Herbcall", "Evil Flames", "Petrifying gaze", "Petrifying gaze", "Petrifying gaze", "Petrifying gaze", "Petrifying gaze", "Petrifying gaze", "Petrifying gaze", "Iron Bull Rush", "Immense Heat", "Thieving Fingers", "Blood Drain", "Tireless Run", "Abyssal Drain", "Dissolve", "Steel Bull Rush", "Fish Rain", "Goad", "Ambush", "Rending", "Doomsphere Device", "Dust Cloud", "Abyssal Stealth", "Ophidian Incubation", "Poisonous Blast", "Mithril Bull Rush", "Toad Bark", "Testudo", "Swallow Whole", "Fruitfall", "Famine", "Arctic Blast", "Rise from the Ashes", "Volcanic Strength", "Crushing Claw", "Mantis Strike", "Adamant Bull Rush", "Inferno", "Deadly Claw", "Acorn Missile", "Titan's Consitution", "Titan's Consitution", "Titan's Consitution", "Regrowth", "Spike Shot", "Ebon Thunder", "Swamp Plague", "Rune Bull Rush", "Healing Aura", "Boil", "Magic Focus", "Essence Shipment", "Iron Within", "Winter Storage", "Steel of Legends"};
        pouchNames = new String[]{"Spirit wolf", "Dreadfowl", "Spirit spider", "Thorny snail", "Granite crab", "Spirit mosquito", "Desert wyrm", "Spirit scorpion", "Spirit tz-kih", "Albino rat", "Spirit kalphite", "Compost mound", "Giant chinchompa", "Vampire bat", "Honey badger", "Beaver", "Void ravager", "Void spinner", "Void torcher", "Void shifter", "Bronze minotaur", "Bull ant", "Macaw", "Evil turnip", "Sp. cockatrice", "Sp. guthatrice", "Sp. saratrice", "Sp. zamatrice", "Sp. pengatrice", "Sp. coraxatrice", "Sp. vulatrice", "Iron minotaur", "Pyrelord", "Magpie", "Bloated leech", "Spirit terrorbird", "Abyssal parasite", "Spirit jelly", "Steel minotaur", "Ibis", "Spirit graahk", "Spirit kyatt", "Spirit larupia", "Karam. overlord", "Smoke devil", "Abyssal lurker", "Spirit cobra", "Stranger plant", "Mithril minotaur", "Barker toad", "War tortoise", "Bunyip", "Fruit bat", "Ravenous locust", "Arctic bear", "Phoenix", "Obsidian golem", "Granite lobster", "Praying mantis", "Adamant minotaur", "Forge regent", "Talon beast", "Giant ent", "Fire titan", "Moss titan", "Ice titan", "Hydra", "Spirit dagannoth", "Lava titan", "Swamp titan", "Rune minotaur", "Unicorn stallion", "Geyser titan", "Wolpertinger", "Abyssal titan", "Iron titan", "Pack yak", "Steel titan"};
    }

}


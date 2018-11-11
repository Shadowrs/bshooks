/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client;

import com.imagineps.client.cache.CacheType;

/*
 * Exception performing whole class analysis ignored.
 */
public class Configuration {
    public static final int VERSION = 39;
    public static boolean newMenu = true;
    public static boolean firstPerson = false;
    public static boolean enterToChat = false;
    public static boolean itemModificationTool = true;
    public static final ClientRunMode clientRunMode = ClientRunMode.LIVE;
    public static boolean SKIP_UPDATING = false;
    public static final int[] PRELOADED_OSRS_MODELS = new int[]{30014};
    public static boolean DEBUG_MODE = false;
    public static boolean ITEM_RARITY_COLOR = true;
    public static boolean DRAW_BUBBLES = true;
    public static boolean REMEMBER_ME = true;
    static final String NAME = "Imagine-PS";
    static final String PREFIX = "";
    static String errorname = "";
    static final String[] LEFT_NAV_LINKS = new String[]{"https://imagine-ps.com", "https://imagine-ps.com", "https://imagine-ps.com"};
    static final String[] RIGHT_NAV_LINKS = new String[]{"https://imagine-ps.com", "https://imagine-ps.com", "https://imagine-ps.com"};
    static String LOADING_MESSAGE;
    static final String[] LOADING_MESSAGES;
    public static final String[] ANNOUNCEMENT;
    public static final String CHAR_PATH;
    public static boolean CHRISTMAS;

    static {
        LOADING_MESSAGES = new String[]{"You can teleport around the map by clicking on the world map.", "Voting will be very rewarding to your account's progression.", "Need help? Ask any staff member or join the 'help' chan channel.", "Being part of a clan will make your progress a lot faster!", "Donating helps us keep the lights on!"};
        ANNOUNCEMENT = new String[]{""};
        CHAR_PATH = CacheType.MAIN_FILE_CACHE.getFullLocation() + "Character";
        CHRISTMAS = false;
    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static enum ClientRunMode {
        LIVE,
        PACKAGED;
        

        private ClientRunMode() {
        }
    }

}


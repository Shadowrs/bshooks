/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.imagineps.client;

import java.util.HashMap;
import java.util.Map;

public enum SkillStringData {
    ATTACK(4004, 4044, 18792),
    DEFENCE(4008, 4056, 18817),
    STRENGTH(4006, 4050, 18798),
    HITPOINTS(4016, 18853, 18859),
    RANGED(4010, 4062, 18822),
    PRAYER(4012, 4068, 18827),
    MAGIC(4014, 18832, 18838),
    COOKING(4034, 19042, 19048),
    WOODCUTTING(4038, 19084, 19090),
    FLETCHING(4026, 18958, 18964),
    FISHING(4032, 19021, 19027),
    FIREMAKING(4036, 19063, 19069),
    CRAFTING(4024, 18937, 18943),
    SMITHING(4030, 19422, 19428),
    MINING(4028, 18979, 18985),
    HERBLORE(4020, 18895, 18901),
    AGILITY(4018, 18874, 18880),
    THIEVING(4022, 18916, 18922),
    SLAYER(18809, 19126, 19132),
    FARMING(18811, 19275, 19281),
    RUNECRAFTING(18807, 19105, 19111),
    SUMMONING(19178, 19232, 19238),
    HUNTER(19176, 19211, 19217),
    CONSTRUCTION(19174, 19190, 19196);
    
    private final int level;
    private final int exp;
    private final int display;
    public static final Map<Integer, SkillStringData> DATA_MAP;

    private SkillStringData(int level, int exp, int display) {
        this.level = level;
        this.exp = exp;
        this.display = display;
    }

    public int getLevel() {
        return this.level;
    }

    public int getExp() {
        return this.exp;
    }

    public int getDisplay() {
        return this.display;
    }

    public static SkillStringData forId(int id) {
        return (SkillStringData)((Object)DATA_MAP.get((Object)id));
    }

    static {
        DATA_MAP = new HashMap();
        SkillStringData[] arrskillStringData = SkillStringData.values();
        int n = arrskillStringData.length;
        int n2 = 0;
        while (n2 < n) {
            SkillStringData d = arrskillStringData[n2];
            DATA_MAP.put((Object)d.ordinal(), (Object)d);
            ++n2;
        }
    }
}


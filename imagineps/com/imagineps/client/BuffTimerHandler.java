/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.EnumSet
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.RSFont;
import com.imagineps.client.definition.ItemDefinition;
import com.imagineps.client.graphics.Sprite;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class BuffTimerHandler
implements Runnable {
    private static ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    private Queue<BuffTimer> buffTimers = new ConcurrentLinkedQueue();
    private final Client client;

    public BuffTimerHandler(Client client) {
        this.client = client;
        executor.scheduleAtFixedRate((Runnable)this, 0L, 1L, TimeUnit.SECONDS);
    }

    public void add(int time, int id) {
        BuffTimers t = BuffTimers.get(id);
        if (t == null) {
            return;
        }
        this.buffTimers.add((Object)new BuffTimer(time, t));
    }

    public void draw() {
        int drawY = Client.clientHeight - (Client.getClientWidth() > 850 ? 25 : 190);
        int drawX = Client.isFixed() ? 490 : Client.getClientWidth() - this.client.tabAreaSprite[0].myWidth - 30;
        Iterator it = this.buffTimers.iterator();
        while (it.hasNext()) {
            BuffTimer t = (BuffTimer)it.next();
            int hours = t.getTime() / 3600;
            int minutes = t.getTime() % 3600 / 60;
            int seconds = t.getTime() % 60;
            String timeString = "";
            timeString = hours > 0 ? String.format((String)"%02d:%02d:%02d", (Object[])new Object[]{hours, minutes, seconds}) : String.format((String)"%02d:%02d", (Object[])new Object[]{minutes, seconds});
            Client.newSmallFont.drawCenteredString(timeString, drawX - 20 - (hours > 0 ? 7 : 0), drawY + 16, 16627712, 0);
            if (t.getTimer().getSpriteId() > -1) {
                Client.cacheSprite[t.getTimer().getSpriteId()].drawAdvancedSprite(drawX, drawY);
            } else {
                Sprite sprite = ItemDefinition.getSpriteScaled(15332, 15332, 0, 20);
                if (sprite != null) {
                    sprite.drawSprite(drawX, drawY);
                }
            }
            drawY -= 22;
        }
    }

    public Queue<BuffTimer> getBuffTimers() {
        return this.buffTimers;
    }

    public void remove(int id) {
        Iterator it = this.buffTimers.iterator();
        while (it.hasNext()) {
            if (((BuffTimer)it.next()).getTimer().getId() != id) continue;
            it.remove();
        }
    }

    public void reset() {
        this.buffTimers.clear();
    }

    public void run() {
        if (!this.client.loggedIn) return;
        if (this.buffTimers.size() == 0) {
            return;
        }
        Iterator it = this.buffTimers.iterator();
        while (it.hasNext()) {
            BuffTimer t = (BuffTimer)it.next();
            t.subtract();
            if (t.getTime() > 0) continue;
            it.remove();
        }
    }

    public static enum BuffTimers {
        STRENGTH_0(0, 122, "Strength Mastery", "1000 Strength Bonus"),
        STRENGTH_1(1, 123, "Toughness", "500 Attack Bonus"),
        ATTACK_0(2, 99, "Adrenalin Mastery", "1000 Attack Bonus for all types"),
        ATTACK_1(3, 100, "Focus Mastery", "Double Attack Bonus for all types"),
        ATTACK_2(4, 101, "Concentrate Attack", "500 Attack Bonus for all types"),
        CONSTITUTION_0(5, 102, "Constitution Mastery", "Increase max HP by 20"),
        CONSTITUTION_1(6, 103, "Giant Body", "If health falls below 25% (Above 0), automatically healed for 10 health"),
        CONSTITUTION_2(7, 104, "Constitution of a Titan", "Increase max HP by 5%"),
        DEBUFF_0(8, 105, "Bellow", "Reduce Defense of NPC you're attacking by 50%"),
        DEBUFF_1(9, 106, "Armor Break", "Ignore NPC defense"),
        DEBUFF_2(10, 107, "Kill on Contact", "Kill anything on next hit"),
        DEBUFF_3(11, 108, "Reflection Shield", "Reflect 30% (multiplied by 1000) back to the NPC"),
        DEFENCE_0(12, 109, "Defense Mastery", "1000 Defense Bonus for all types"),
        DEFENCE_1(13, 110, "Armour of Courage", "500 Defense Bonus for all types"),
        DEFENCE_2(14, 111, "Divine Defense", "750 Defense Bonus for all types"),
        DEFENCE_3(15, 112, "Protection & Betrayal", "5% chance to block and/or increase incoming damage"),
        DEFENCE_4(16, 113, "Defensive Stance", "Get all NPC around you to become aggressive towards you"),
        DAMAGE_0(17, 114, "Deep Wound", "2% chance to inflict double damage"),
        MOVE_0(18, 115, "Move Mastery", "5% chance to dodge incoming attacks"),
        MOVE_1(19, 116, "Uncanny Movement", "7% chance to dodge incoming attacks"),
        RECOVERY_0(20, 117, "Vitality Control", "100% health recovered from soul split"),
        SPECIAL_0(21, 118, "Fighting Spirit", "25% increase in all types for attack & defense, 1% chance to dodge"),
        SPECIAL_1(22, 119, "Devotion", "Triple all attack types and 500 strength increase"),
        SPECIAL_2(23, 120, "Telekinetomyinv ", "Send all drops to inventory"),
        WEAPON_0(24, 121, "Weapon Mastery", "1% chance to do double damage next hit"),
        TERRIBLE_TASTE(25, 124, "Terrible Taste", "Decrease chance of landing next hit by 50%, decrease attack speed by 1"),
        BAD_TASTE(26, 125, "Bad Taste", "Decrease attack speed by 1"),
        OK_TASTE(27, 126, "Ok Taste", "Increase attack speed by 1"),
        GOOD_TASTE(28, 127, "Good Taste", "Increase chance of landing next hit by 50%"),
        HEAVENLY_TASTE(29, 128, "Heavenly Taste", "Increase chance of landing next hit by 75%, increase attack speed by 1"),
        ATTENDANCE(30, 133, "Attendance", "When this expires, you will obtain your daily attendance."),
        DOUBLE_STR_BONUS(31, 134, "Double Str Bonus", "Melee strength bonus is doubled."),
        DOUBLE_SS_EFFECT(32, 135, "Double SS Effect", "Soul Split effect is doubled."),
        DOUBLE_EXP_BONUS(33, 136, "Double EXP Bonus", "Experience gained is doubled."),
        OVERLOAD_POT(34, -1, "Overload", "Overload bonus");
        
        private static Map<Integer, BuffTimers> timers;
        private static final Set<BuffTimers> CACHED;
        private final int id;
        private final int spriteId;
        private final String name;
        private final String description;

        public static BuffTimers get(int id) {
            return (BuffTimers)((Object)timers.get((Object)id));
        }

        private BuffTimers(int id, int spriteId, String name, String description) {
            this.id = id;
            this.spriteId = spriteId;
            this.name = name;
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public int getSpriteId() {
            return this.spriteId;
        }

        static {
            timers = new HashMap();
            CACHED = EnumSet.allOf(BuffTimers.class);
            Iterator iterator = CACHED.iterator();
            while (iterator.hasNext()) {
                BuffTimers t = (BuffTimers)((Object)iterator.next());
                timers.put((Object)t.id, (Object)t);
            }
        }
    }

    public static class BuffTimer {
        private int time;
        private BuffTimers timer;

        public BuffTimer(int time, BuffTimers timer) {
            this.time = time;
            this.timer = timer;
        }

        public int getTime() {
            return this.time;
        }

        public BuffTimers getTimer() {
            return this.timer;
        }

        public void subtract() {
            --this.time;
        }
    }

}


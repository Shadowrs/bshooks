/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.EnumSet
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.function.Consumer
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.TextClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class PlayerSettings {
    private Map<PlayerSetting, Boolean> playerSettings = new HashMap();

    public PlayerSettings() {
        PlayerSetting.PLAYER_SETTINGS.forEach(i -> {
            (Boolean)this.playerSettings.put((Object)i, (Object)false);
        }
        );
    }

    public void toggle(PlayerSetting setting, boolean enabled) {
        this.playerSettings.put((Object)setting, (Object)enabled);
    }

    public List<String> getToggleNames() {
        ArrayList list = new ArrayList();
        PlayerSetting.PLAYER_SETTINGS.forEach(arg_0 -> PlayerSettings.lambda$getToggleNames$1((List)list, arg_0));
        return Collections.unmodifiableList((List)list);
    }

    public boolean isEnabled(PlayerSetting setting) {
        return (Boolean)this.playerSettings.get((Object)setting);
    }

    public Map<PlayerSetting, Boolean> getSettings() {
        return this.playerSettings;
    }

    public void handleToggling(int config, int state) {
        int settingId = config - 1225;
        if (settingId < 0) return;
        if (settingId >= PlayerSetting.PLAYER_SETTINGS.size()) {
            return;
        }
        PlayerSetting setting = (PlayerSetting)((Object)PlayerSetting.PLAYER_SETTINGS.get(settingId));
        this.toggle(setting, state == 1);
        if (setting == PlayerSetting.HD_MINIMAP || setting == PlayerSetting.SMOOTH_SHADING || setting == PlayerSetting.GROUND_BLENDING) {
            Client.instance.method22();
        }
        if (setting != PlayerSetting.INCREASE_RENDER_DISTANCE) return;
        Client.instance.changedRenderDistance = true;
    }

    public void reset() {
        this.playerSettings.clear();
    }

    private static /* synthetic */ void lambda$getToggleNames$1(List list, PlayerSetting i) {
        list.add((Object)i.getName());
    }

    public static enum PlayerSetting {
        X10_DAMAGE,
        NEW_FUNCTION_KEYS,
        NEW_HEALTH_BAR,
        DISPLAY_YELL_MESSAGES,
        DISPLAY_YELL_EXTRAS,
        DISPLAY_YELL_LEVEL,
        YELL_ASSISTANCE,
        DISPLAY_LOOT_NAMES,
        TWEENING,
        FOG,
        GROUND_BLENDING,
        PARTICLES,
        HIDE_NPCS,
        CAMERA_GLIDE,
        SMOOTH_SHADING,
        HD_MINIMAP,
        TOOLTIPS,
        TOGGLE_ROOF,
        INCREASE_RENDER_DISTANCE;
        
        public static final List<PlayerSetting> PLAYER_SETTINGS;

        private PlayerSetting() {
        }

        public String getName() {
            return TextClass.fixName(this.name().toLowerCase().replaceAll("_", " "));
        }

        static {
            PLAYER_SETTINGS = Collections.unmodifiableList((List)new ArrayList((Collection)EnumSet.allOf(PlayerSetting.class)));
        }
    }

}


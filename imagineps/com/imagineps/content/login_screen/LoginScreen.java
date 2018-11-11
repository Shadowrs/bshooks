/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.imagineps.content.login_screen;

import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.graphics.impl.ToggleSprite;
import java.util.HashMap;

public class LoginScreen {
    private static final String DIRECTORY = "login/";
    public static final HashMap<String, Sprite> SPRITE_MAP = new HashMap();

    public static void loadImages() {
        SPRITE_MAP.put((Object)"login_input", (Object)new ToggleSprite("login/login_box_inputfield", "login/login_box_inputfield_hover"));
        SPRITE_MAP.put((Object)"login_button", (Object)new ToggleSprite("login/login_button", "login/login_button_hover"));
        SPRITE_MAP.put((Object)"world", (Object)new Sprite("login/world"));
        SPRITE_MAP.put((Object)"main_screen", (Object)new Sprite("login/new/main_screen"));
        SPRITE_MAP.put((Object)"error_screen", (Object)new Sprite("login/new/error_screen"));
        SPRITE_MAP.put((Object)"login_screen", (Object)new Sprite("login/new/login_screen"));
        SPRITE_MAP.put((Object)"loading_screen", (Object)new Sprite("login/new/loading_screen"));
        SPRITE_MAP.put((Object)"settings_screen", (Object)new Sprite("login/new/settings_screen"));
        SPRITE_MAP.put((Object)"information", (Object)new Sprite("login/new/information"));
        SPRITE_MAP.put((Object)"login_button", (Object)new Sprite("login/new/login_button"));
        SPRITE_MAP.put((Object)"world_select", (Object)new Sprite("login/new/world_select"));
        SPRITE_MAP.put((Object)"discord_button", (Object)new Sprite("login/new/discord_button"));
        SPRITE_MAP.put((Object)"discord_button_hover", (Object)new Sprite("login/new/discord_button_hover"));
        SPRITE_MAP.put((Object)"settings_button", (Object)new Sprite("login/new/settings_button"));
        SPRITE_MAP.put((Object)"back_button", (Object)new Sprite("login/new/back_button"));
        SPRITE_MAP.put((Object)"save_account_unselected", (Object)new Sprite("login/new/save_account_unselected"));
        SPRITE_MAP.put((Object)"save_account_selected", (Object)new Sprite("login/new/save_account_selected"));
        SPRITE_MAP.put((Object)"account_name_hover", (Object)new Sprite("login/new/account_name_hover"));
        SPRITE_MAP.put((Object)"delete_account", (Object)new Sprite("login/new/delete_account"));
        SPRITE_MAP.put((Object)"delete_account_hover", (Object)new Sprite("login/new/delete_account_hover"));
        SPRITE_MAP.put((Object)"empty_account", (Object)new Sprite("login/new/empty_account"));
        SPRITE_MAP.put((Object)"confirmation_screen", (Object)new Sprite("login/new/confirmation_screen"));
        SPRITE_MAP.put((Object)"confirmation_button", (Object)new Sprite("login/new/confirmation_button"));
        SPRITE_MAP.put((Object)"captcha_screen", (Object)new Sprite("login/new/captcha_screen"));
        SPRITE_MAP.put((Object)"account_screen", (Object)new Sprite("login/new/account_screen"));
        SPRITE_MAP.put((Object)"loader_screen", (Object)new Sprite("login/new/loader_screen"));
        SPRITE_MAP.put((Object)"continue_button", (Object)new Sprite("login/new/continue_button"));
        SPRITE_MAP.put((Object)"running_smooth", (Object)new Sprite("login/new/running_smooth"));
        SPRITE_MAP.put((Object)"credits_sale", (Object)new Sprite("login/new/credits_sale"));
        SPRITE_MAP.put((Object)"chinchompa_pet_sale", (Object)new Sprite("login/new/chinchompa_pet_sale"));
        SPRITE_MAP.put((Object)"tyrant_armour_sale", (Object)new Sprite("login/new/tyrant_armour_sale"));
        SPRITE_MAP.put((Object)"vote_button", (Object)new Sprite("login/new/vote_button"));
        SPRITE_MAP.put((Object)"browse_button", (Object)new Sprite("login/new/browse_button"));
    }

    public static Sprite getImage(String spriteName) {
        if (!SPRITE_MAP.containsKey((Object)spriteName)) return null;
        return (Sprite)SPRITE_MAP.get((Object)spriteName);
    }

    public static ToggleSprite getToggleImage(String spriteName) {
        if (!SPRITE_MAP.containsKey((Object)spriteName)) return null;
        if (((Sprite)SPRITE_MAP.get((Object)spriteName)).getClass() != ToggleSprite.class) return null;
        return (ToggleSprite)SPRITE_MAP.get((Object)spriteName);
    }
}


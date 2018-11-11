/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client;

public final class ChatMessage {
    private final String title;
    private final String name;
    private final String message;
    private final ChatType type;

    public ChatMessage(String message, ChatType type) {
        this("", "", message, type);
    }

    public ChatMessage(String title, String name, String message, ChatType type) {
        this.title = title;
        this.name = name;
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public ChatType getType() {
        return this.type;
    }

    public static enum ChatType {
        ZERO(0),
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        URL(9),
        GAMBLE(15),
        CLAN(16),
        YELL(17),
        PMBOT(18),
        YELLBOT(19);
        
        private final int type;

        private ChatType(int type) {
            this.type = type;
        }

        public int getType() {
            return this.type;
        }
    }

}


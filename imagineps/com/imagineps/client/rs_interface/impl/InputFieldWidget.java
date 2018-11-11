/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.imagineps.client.rs_interface.impl;

import com.imagineps.client.Client;
import com.imagineps.client.RSFont;
import com.imagineps.client.Stream;
import com.imagineps.client.TextClass;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.rs_interface.RSInterface;

public class InputFieldWidget
extends RSInterface {
    public static final int DEFAULT_BACKGROUND_COLOR = 5064246;
    public static final int DEFAULT_TEXT_COLOR = 15108608;
    private final int backgroundColor;
    private final boolean updatesEveryInput;
    private final String defaultInputFieldText;
    private final boolean displayAsterisks;
    private final int characterLimit;
    private final String inputRegex = "";
    private boolean isInFocus;
    private boolean isEnabled = true;
    private final boolean numbersOnly;
    private final boolean convertLettersToNumbers;

    public InputFieldWidget(int identifier, int backgroundColor, int characterLimit, int textColor, String message, int width, int height, boolean asterisks, boolean updatesEveryInput, boolean centerText, boolean numbersOnly, boolean convertLettersToNumbers) {
        super(identifier, width, height);
        this.message = message;
        this.characterLimit = characterLimit;
        this.textColor = textColor;
        this.displayAsterisks = asterisks;
        this.defaultInputFieldText = message == null ? "" : message;
        this.tooltips = new String[]{"Edit", "Clear"};
        this.updatesEveryInput = updatesEveryInput;
        this.center = centerText;
        this.backgroundColor = backgroundColor;
        this.numbersOnly = numbersOnly;
        this.convertLettersToNumbers = convertLettersToNumbers;
    }

    public InputFieldWidget(int identity, int backgroundColor, int characterLimit, int textColor, String text, int width, int height, boolean asterisks, boolean updatesEveryInput) {
        this(identity, backgroundColor, characterLimit, textColor, text, width, height, asterisks, updatesEveryInput, false, false, false);
    }

    public InputFieldWidget(int identity, int backgroundColor, int characterLimit, int textColor, String text, int width, int height, boolean asterisks) {
        this(identity, backgroundColor, characterLimit, textColor, text, width, height, asterisks, false, false, false, false);
    }

    @Override
    public boolean drawInterface(Client client, int widgetDrawX, int widgetDrawY, int superWidgetDrawX, int superWidgetDrawY) {
        int xPosition = widgetDrawX;
        int yPosition = widgetDrawY;
        DrawingArea.drawPixels(this.height, yPosition, xPosition, this.backgroundColor, this.width);
        DrawingArea.fillPixels(xPosition, this.width, this.height, 0, yPosition);
        if (!this.isEnabled) {
            DrawingArea.drawAlphaBox(xPosition, yPosition, this.width, this.height, 0, 100);
            return true;
        }
        String message = this.message;
        if (message.isEmpty() && !this.isInFocus) {
            message = this.defaultInputFieldText;
        } else {
            if (this.displayAsterisks) {
                message = TextClass.passwordAsterisks(message);
            }
            if (Client.newRegularFont.getTextWidth(message) > this.width - 10) {
                message = message.substring(message.length() - this.width / 10 - 1, message.length());
            }
            message = "" + message + (this.isInFocus & Client.loopCycle % 40 < 20 ? "|" : "");
        }
        if (this.center) {
            Client.newRegularFont.drawCenteredString(message, xPosition + this.width / 2, yPosition + this.height / 2 + 6, this.textColor, -1);
            return true;
        }
        Client.newRegularFont.drawBasicString(message, xPosition + 4, yPosition + this.height / 2 + 6, this.textColor, -1);
        return true;
    }

    @Override
    public boolean handleInterfaceAction(Client client, int mouseX, int mouseY, int widgetDrawX, int widgetDrawY, int scrollPos) {
        if (!this.isEnabled) {
            return true;
        }
        if (mouseX < widgetDrawX) return true;
        if (mouseX > widgetDrawX + this.width) return true;
        if (mouseY < widgetDrawY) return true;
        if (mouseY > widgetDrawY + this.height) return true;
        int index = this.tooltips.length - 1;
        while (index >= 0) {
            client.addMenuAction(this.tooltips[index], 5003 + index, this.id, -1, -1);
            --index;
        }
        return true;
    }

    public void handleInput(Client client) {
        client.stream.createFrame(142);
        client.stream.writeWordBigEndian(4 + this.message.length() + 1);
        client.stream.writeDWord(this.id);
        client.stream.writeString(this.message);
        client.inputString = "";
        client.promptInput = "";
    }

    public void setInFocus(boolean isInFocus) {
        this.isInFocus = isInFocus;
    }

    public boolean updatesEveryInput() {
        return this.updatesEveryInput;
    }

    public String getDefaultInputFieldText() {
        return this.defaultInputFieldText;
    }

    public int getCharacterLimit() {
        return this.characterLimit;
    }

    public String getInputRegex() {
        return "";
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public boolean isNumbersOnly() {
        return this.numbersOnly;
    }

    public boolean convertLettersToNumbers() {
        return this.convertLettersToNumbers;
    }
}


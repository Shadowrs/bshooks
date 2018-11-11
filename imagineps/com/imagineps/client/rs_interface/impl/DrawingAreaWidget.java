/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client.rs_interface.impl;

import com.imagineps.client.Client;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.rs_interface.RSInterface;

public final class DrawingAreaWidget
extends RSInterface {
    private final DrawingType drawingType;

    public DrawingAreaWidget(int identifier, DrawingType drawingType, int width, int height, int color, int opacity) {
        super(identifier, width, height);
        this.drawingType = drawingType;
        this.textColor = color;
        this.opacity = opacity;
    }

    @Override
    public boolean drawInterface(Client client, int widgetDrawX, int widgetDrawY, int superWidgetDrawX, int superWidgetDrawY) {
        switch (.$SwitchMap$com$imagineps$client$rs_interface$impl$DrawingAreaWidget$DrawingType[this.drawingType.ordinal()]) {
            case 1: {
                DrawingArea.drawLine(widgetDrawX, widgetDrawY, this.width, this.height, this.textColor, this.opacity);
                return true;
            }
            case 2: {
                DrawingArea.drawRectangle(widgetDrawX, widgetDrawY, this.width, this.height, this.textColor, this.opacity);
                return true;
            }
            case 3: {
                DrawingArea.drawRoundedRectangle(widgetDrawX, widgetDrawY, this.width, this.height, this.textColor, this.opacity, true, false);
                break;
            }
        }
        return true;
    }

    @Override
    public boolean handleInterfaceAction(Client client, int mouseX, int mouseY, int widgetDrawX, int widgetDrawY, int scrollPos) {
        return true;
    }

    public static enum DrawingType {
        LINE,
        SQUARE,
        SQUARE_ROUNDED_EDGES;
        

        private DrawingType() {
        }
    }

}


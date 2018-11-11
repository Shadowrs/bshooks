/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Point
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.content.login_screen;

import com.imagineps.client.Client;
import com.imagineps.client.ConnectionStatus;
import com.imagineps.client.RSFont;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.Sprite;
import java.awt.Point;
import org.apache.commons.lang3.StringUtils;

public final class LoginScreenWorldSelector {
    private static final int TEXT_Y_OFFSET = 30;
    private static final int EXPANDING_SPEED = 10;
    private final Sprite worldSprite;
    private final int minimumWidth;
    private final int minimumHeight;
    private int currentWidth;
    private int currentHeight;

    public LoginScreenWorldSelector(Sprite worldSprite) {
        this.worldSprite = worldSprite;
        this.minimumWidth = worldSprite.myWidth + 10;
        this.minimumHeight = worldSprite.myHeight + 10;
        this.currentWidth = this.minimumWidth;
        this.currentHeight = this.minimumHeight;
    }

    private int calculateMaxHeight() {
        return 30 + ConnectionStatus.values().length * 30;
    }

    private int calculateMaxWidth(RSFont font) {
        int maxWidth = font.getTextWidth("World Selector") + this.worldSprite.myWidth + 10;
        ConnectionStatus[] arrconnectionStatus = ConnectionStatus.values();
        int n = arrconnectionStatus.length;
        int n2 = 0;
        while (n2 < n) {
            int width;
            ConnectionStatus status = arrconnectionStatus[n2];
            if (status != null && (width = font.getTextWidth(status.name()) + 10) > maxWidth) {
                maxWidth = width;
            }
            ++n2;
        }
        return maxWidth;
    }

    public void draw(Client client, Point drawingPosition, int mouseX, int mouseY) {
        int maxHeight;
        int maxWidth;
        block15 : {
            int drawY;
            int n;
            int n2;
            ConnectionStatus[] values;
            block16 : {
                block14 : {
                    boolean fullyExtended;
                    boolean mouseWithin = (double)mouseX >= drawingPosition.getX() - (double)this.currentWidth && (double)mouseX <= drawingPosition.getX() && (double)mouseY >= drawingPosition.getY() && (double)mouseY <= drawingPosition.getY() + (double)this.currentHeight;
                    DrawingArea.drawRoundedRectangle((int)drawingPosition.getX() - this.currentWidth, (int)drawingPosition.getY(), this.currentWidth, this.currentHeight, 0, 200, true, false);
                    DrawingArea.drawRoundedRectangle((int)drawingPosition.getX() - this.currentWidth, (int)drawingPosition.getY(), this.currentWidth, this.currentHeight, 16777215, 200, false, false);
                    maxWidth = this.calculateMaxWidth(client.newBoldFont);
                    maxHeight = this.calculateMaxHeight();
                    boolean bl = fullyExtended = this.currentWidth == maxWidth && this.currentHeight == maxHeight;
                    if (fullyExtended) {
                        drawY = 30;
                        client.newBoldFont.drawCenteredString("World Selector", 10 + (int)drawingPosition.getX() - maxWidth / 2 - this.worldSprite.myWidth, drawY + 3, 16777215, 0);
                        DrawingArea.drawHorizontalLine((int)drawingPosition.getX() - this.currentWidth, drawY + 15, this.currentWidth, 16777215, 100);
                        drawY += 35;
                        ConnectionStatus[] arrconnectionStatus = values = ConnectionStatus.values();
                        n = arrconnectionStatus.length;
                        for (int i = 0; i < n; ++i) {
                            ConnectionStatus status = arrconnectionStatus[i];
                            if (status == null) continue;
                            if (Client.connectionStatus == status) {
                                if (status.ordinal() == values.length - 1) {
                                    DrawingArea.drawRoundedRectangle((int)(drawingPosition.getX() - (double)this.currentWidth), drawY - 20, this.currentWidth, 25, 16777215, 200, true, false);
                                } else {
                                    DrawingArea.drawAlphaBox((int)(drawingPosition.getX() - (double)this.currentWidth), drawY - 19, this.currentWidth, 29, 16777215, 200);
                                }
                            }
                            client.newBoldFont.drawCenteredString(StringUtils.capitalize(status.name().toLowerCase().replace((CharSequence)"_", (CharSequence)" ")), (int)drawingPosition.getX() - maxWidth / 2, drawY, 16777215, 0);
                            if (drawY < this.currentHeight) {
                                DrawingArea.drawHorizontalLine((int)drawingPosition.getX() - this.currentWidth, drawY + 10, this.currentWidth, 16777215, 100);
                            }
                            drawY += 30;
                        }
                    }
                    this.worldSprite.drawAdvancedSprite((int)drawingPosition.getX() - this.worldSprite.myWidth - 5, (int)drawingPosition.getY() + 5);
                    if (!mouseWithin) break block14;
                    drawY = 35 + (int)drawingPosition.getY();
                    if (client.clickMode3 != 1) break block15;
                    values = ConnectionStatus.values();
                    n2 = values.length;
                    break block16;
                }
                if (this.currentWidth > this.minimumWidth) {
                    this.currentWidth -= 10;
                }
                if (this.currentHeight > this.minimumHeight) {
                    this.currentHeight -= 10;
                }
                if (this.currentWidth < this.minimumWidth) {
                    this.currentWidth = this.minimumWidth;
                }
                if (this.currentHeight >= this.minimumHeight) return;
                this.currentHeight = this.minimumHeight;
                return;
            }
            for (n = 0; n < n2; ++n) {
                ConnectionStatus status = values[n];
                if (status == null) continue;
                if (mouseY >= drawY && mouseY < drawY + 30) {
                    Client.connectionStatus = status;
                    client.createCenteredPopUpMessage("Now using world:\n" + StringUtils.capitalize(status.name().toLowerCase().replaceAll("_", " ")));
                    break;
                }
                drawY += 30;
            }
        }
        if (this.currentWidth < maxWidth) {
            this.currentWidth += 10;
        }
        if (this.currentHeight < maxHeight) {
            this.currentHeight += 10;
        }
        if (this.currentWidth > maxWidth) {
            this.currentWidth = maxWidth;
        }
        if (this.currentHeight <= maxHeight) return;
        this.currentHeight = maxHeight;
    }
}


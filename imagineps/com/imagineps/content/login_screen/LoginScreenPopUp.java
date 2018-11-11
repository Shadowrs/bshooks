/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 */
package com.imagineps.content.login_screen;

import com.imagineps.client.Client;
import com.imagineps.client.RSFont;
import com.imagineps.client.graphics.DrawingArea;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;

public final class LoginScreenPopUp {
    private final StopWatch timer = StopWatch.createStarted();
    private final String message;
    private final int xPosition;
    private final int yPosition;
    private final int displayDuration;
    private final boolean centered;

    public LoginScreenPopUp(String message, int xPosition, int yPosition, int displayDuration, boolean centered) {
        this.message = message;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.displayDuration = displayDuration;
        this.centered = centered;
    }

    public void draw(Client client) {
        if (this.message == null) return;
        if (this.message.isEmpty()) return;
        if (this.timer.getTime(TimeUnit.SECONDS) > (long)this.displayDuration) {
            return;
        }
        String[] toDisplay = this.message.split("\n");
        int displayWidth = 20;
        int displayHeight = client.newBoldFont.baseCharacterHeight * toDisplay.length + 20;
        for (String s2 : toDisplay) {
            if (displayWidth >= client.newBoldFont.getTextWidth(s2)) continue;
            displayWidth = client.newBoldFont.getTextWidth(s2);
        }
        displayWidth += 20;
        int drawX = this.xPosition;
        int drawY = this.yPosition;
        if (this.centered) {
            drawX -= displayWidth / 2;
            drawY -= displayHeight / 2;
        }
        DrawingArea.method338(drawY + 2, displayHeight - 4, 250, 7367262, displayWidth, drawX);
        DrawingArea.method338(drawY + 1, displayHeight - 2, 250, 7367262, displayWidth - 2, drawX + 1);
        DrawingArea.method338(drawY, displayHeight, 200, 7367262, displayWidth - 4, drawX + 2);
        DrawingArea.method338(drawY + 1, displayHeight - 2, 250, 2959394, displayWidth - 6, drawX + 3);
        DrawingArea.method338(drawY + 2, displayHeight - 4, 250, 2959394, displayWidth - 4, drawX + 2);
        DrawingArea.method338(drawY + 3, displayHeight - 6, 250, 2959394, displayWidth - 2, drawX + 1);
        DrawingArea.method335(0, drawY + 3, displayWidth - 6, displayHeight - 6, 180, drawX + 3);
        int yOffset = 10 + (drawY + displayHeight / 2) - toDisplay.length * client.newBoldFont.baseCharacterHeight / 2;
        String[] s2 = toDisplay;
        int n = s2.length;
        int n2 = 0;
        while (n2 < n) {
            String s3 = s2[n2];
            client.newBoldFont.drawCenteredString(s3, drawX + displayWidth / 2, yOffset, 16777215, 0);
            yOffset += client.newBoldFont.baseCharacterHeight;
            ++n2;
        }
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 */
package com.imagineps.client.rs_interface.impl;

import com.imagineps.client.Client;
import com.imagineps.client.RSFont;
import com.imagineps.client.rs_interface.RSInterface;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.lang3.time.StopWatch;

public final class CountDownTimerWidget
extends RSInterface {
    private final StopWatch stopWatch = StopWatch.createStarted();
    private int timer;
    private boolean isHidden;

    public CountDownTimerWidget(int identifier, int textColor, boolean center) {
        super(identifier);
        this.textColor = textColor;
        this.center = center;
    }

    @Override
    public boolean drawInterface(Client client, int widgetDrawX, int widgetDrawY, int superWidgetDrawX, int superWidgetDrawY) {
        int displayColor;
        if (this.isHidden) {
            return true;
        }
        widgetDrawY += 10;
        String toDisplay = this.hasReachedZero() ? "Ended" : this.getRemainingTime();
        int n = displayColor = this.hasReachedZero() ? 16711680 : this.textColor;
        if (this.center) {
            Client.newSmallFont.drawCenteredString(toDisplay, widgetDrawX, widgetDrawY, displayColor, 0);
            return true;
        }
        Client.newSmallFont.drawBasicString(toDisplay, widgetDrawX, widgetDrawY, displayColor, 0);
        return true;
    }

    public void setTimer(int seconds) {
        this.timer = seconds;
        this.stopWatch.reset();
        this.stopWatch.start();
    }

    private String getRemainingTime() {
        long remainingTime = this.getRemainingMillis();
        if (remainingTime >= 0L) return DurationFormatUtils.formatDuration(remainingTime, "HH:mm:ss");
        remainingTime = 0L;
        return DurationFormatUtils.formatDuration(remainingTime, "HH:mm:ss");
    }

    private boolean hasReachedZero() {
        if (this.getRemainingMillis() > 0L) return false;
        return true;
    }

    private long getRemainingMillis() {
        return TimeUnit.SECONDS.toMillis((long)this.timer) - this.stopWatch.getTime();
    }

    public void setHidden(boolean hidden) {
        this.isHidden = hidden;
    }
}


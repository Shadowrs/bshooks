/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Graphics
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.image.BufferedImage
 *  java.awt.image.ImageObserver
 *  java.io.IOException
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URL
 *  javax.imageio.ImageIO
 */
package com.imagineps.client.capatcha;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public enum Theme {
    RED,
    WHITE,
    BLACKGLASS;
    
    BufferedImage back;
    BufferedImage reloadButton;
    BufferedImage audioChallenge;
    BufferedImage textChallenge;
    BufferedImage helpButton;
    private boolean loaded;

    private Theme() {
    }

    public Image getBack() {
        if (this.loaded) return this.back;
        this.load();
        return this.back;
    }

    public Image getReloadButton() {
        if (this.loaded) return this.reloadButton;
        this.load();
        return this.reloadButton;
    }

    public Image getAudioChallenge() {
        if (this.loaded) return this.audioChallenge;
        this.load();
        return this.audioChallenge;
    }

    public Image getTextChallenge() {
        if (this.loaded) return this.textChallenge;
        this.load();
        return this.textChallenge;
    }

    public Image getHelpButton() {
        if (this.loaded) return this.helpButton;
        this.load();
        return this.helpButton;
    }

    private void load() {
        try {
            String urlBase = "http://www.google.com/recaptcha/api/img/" + this.name().toLowerCase();
            BufferedImage bufferedImage = ImageIO.read((URL)new URL(urlBase + "/sprite.png"));
            this.back = new BufferedImage(318, 129, 2);
            Graphics2D graphics2D = (Graphics2D)this.back.getGraphics();
            graphics2D.drawImage((Image)bufferedImage.getSubimage(0, 63, 318, 9), 0, 0, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(18, 0, 9, 57), 0, 9, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(27, 0, 9, 57), 309, 9, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(0, 0, 9, 63), 0, 66, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(18, 57, 300, 6), 9, 66, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(9, 0, 9, 63), 309, 66, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(43, 0, 171, 49), 9, 72, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(36, 0, 7, 57), 180, 72, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(214, 0, 97, 57), 212, 72, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(43, 49, 171, 8), 9, 121, null);
            graphics2D.drawImage((Image)bufferedImage.getSubimage(43, 49, 25, 8), 187, 121, null);
            this.reloadButton = ImageIO.read((URL)new URL(urlBase + "/refresh.gif"));
            this.audioChallenge = ImageIO.read((URL)new URL(urlBase + "/audio.gif"));
            this.textChallenge = ImageIO.read((URL)new URL(urlBase + "/text.gif"));
            this.helpButton = ImageIO.read((URL)new URL(urlBase + "/help.gif"));
            this.loaded = true;
            return;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}


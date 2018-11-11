/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.Sprite;
import java.awt.Color;
import java.io.PrintStream;
import org.apache.commons.lang3.ArrayUtils;

public class RSFont
extends DrawingArea {
    private static Sprite[] chatImages;
    private static Sprite[] clanImages;
    private static String aRSString_4135;
    private static String startTransparency;
    private static String startDefaultShadow;
    private static String endShadow;
    private static String endEffect;
    private static String endStrikethrough;
    private static String aRSString_4147;
    private static String startColor;
    private static String lineBreak;
    private static String startStrikethrough;
    private static String endColor;
    private static String startImage;
    private static String startClanImage;
    private static String endUnderline;
    private static String defaultStrikethrough;
    private static String startShadow;
    private static String startEffect;
    private static String aRSString_4162;
    private static String aRSString_4163;
    private static String endTransparency;
    private static String aRSString_4165;
    private static String startUnderline;
    private static String startDefaultUnderline;
    private static String aRSString_4169;
    private static int defaultColor;
    private static int textShadowColor;
    private static int strikethroughColor;
    private static int defaultTransparency;
    private static int anInt4175;
    private static int underlineColor;
    private static int defaultShadow;
    private static int anInt4178;
    private static int transparency;
    private static int textColor;
    public int baseCharacterHeight;
    private int[] characterDrawYOffsets;
    private int[] characterHeights;
    private int[] characterDrawXOffsets;
    private int[] characterWidths;
    private byte[][] fontPixels;
    private int[] characterScreenWidths;

    private static void createCharacterPixels(int[] is, byte[] is_24_, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
        int i_31_ = - (i_27_ >> 2);
        i_27_ = - (i_27_ & 3);
        int i_32_ = - i_28_;
        while (i_32_ < 0) {
            for (int i_33_ = i_31_; i_33_ < 0; ++i_33_) {
                if (is_24_[i_25_++] != 0) {
                    is[i_26_++] = i;
                } else {
                    ++i_26_;
                }
                if (is_24_[i_25_++] != 0) {
                    is[i_26_++] = i;
                } else {
                    ++i_26_;
                }
                if (is_24_[i_25_++] != 0) {
                    is[i_26_++] = i;
                } else {
                    ++i_26_;
                }
                if (is_24_[i_25_++] != 0) {
                    is[i_26_++] = i;
                    continue;
                }
                ++i_26_;
            }
            for (int i_34_ = i_27_; i_34_ < 0; ++i_34_) {
                if (is_24_[i_25_++] != 0) {
                    is[i_26_++] = i;
                    continue;
                }
                ++i_26_;
            }
            i_26_ += i_29_;
            i_25_ += i_30_;
            ++i_32_;
        }
    }

    private static void createTransparentCharacterPixels(int[] is, byte[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        i = ((i & 16711935) * i_7_ & -16711936) + ((i & 65280) * i_7_ & 16711680) >> 8;
        i_7_ = 256 - i_7_;
        int i_8_ = - i_4_;
        while (i_8_ < 0) {
            for (int i_9_ = - i_3_; i_9_ < 0; ++i_9_) {
                if (is_0_[i_1_++] != 0) {
                    int i_10_ = is[i_2_];
                    is[i_2_++] = (((i_10_ & 16711935) * i_7_ & -16711936) + ((i_10_ & 65280) * i_7_ & 16711680) >> 8) + i;
                    continue;
                }
                ++i_2_;
            }
            i_2_ += i_5_;
            i_1_ += i_6_;
            ++i_8_;
        }
    }

    /*
     * Exception decompiling
     */
    public static int getTagColor(String s) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:251)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:215)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:25)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:96)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:839)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:191)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:136)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:369)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:770)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:702)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        // the.bytecode.club.bytecodeviewer.decompilers.CFRDecompiler.decompileToZip(CFRDecompiler.java:263)
        // the.bytecode.club.bytecodeviewer.gui.MainViewerGUI$18$1$3.run(MainViewerGUI.java:1122)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public RSFont(boolean TypeFont, String s, StreamLoader archive) {
        block15 : {
            block16 : {
                super();
                this.baseCharacterHeight = 0;
                try {
                    length = s.equals((Object)"regularhit") != false || s.equals((Object)"bighit") != false ? 58 : 256;
                    this.fontPixels = new byte[length][];
                    this.characterWidths = new int[length];
                    this.characterHeights = new int[length];
                    this.characterDrawXOffsets = new int[length];
                    this.characterDrawYOffsets = new int[length];
                    this.characterScreenWidths = new int[length];
                    stream = new Stream(archive.getDataForName(s + ".dat"));
                    stream_1 = new Stream(archive.getDataForName("index.dat"));
                    stream_1.currentOffset = stream.readUnsignedWord() + 4;
                    k = stream_1.readUnsignedByte();
                    if (k > 0) {
                        stream_1.currentOffset += 3 * (k - 1);
                    }
                    l = 0;
lbl18: // 2 sources:
                    if (l < length) {
                        this.characterDrawXOffsets[l] = stream_1.readUnsignedByte();
                        this.characterDrawYOffsets[l] = stream_1.readUnsignedByte();
                        i1 = this.characterWidths[l] = stream_1.readUnsignedWord();
                        j1 = this.characterHeights[l] = stream_1.readUnsignedWord();
                        k1 = stream_1.readUnsignedByte();
                        l1 = i1 * j1;
                        this.fontPixels[l] = new byte[l1];
                        if (k1 == 0) {
                            for (i2 = 0; i2 < l1; ++i2) {
                                this.fontPixels[l][i2] = stream.readSignedByte();
                            }
                            break block15;
                        }
                        if (k1 != 1) break block15;
                        break block16;
                    }
                    if (TypeFont) {
                        this.characterScreenWidths[32] = this.characterScreenWidths[73];
                        return;
                    }
                    this.characterScreenWidths[32] = this.characterScreenWidths[105];
                    return;
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
            for (j2 = 0; j2 < i1; ++j2) {
                for (l2 = 0; l2 < j1; ++l2) {
                    this.fontPixels[l][j2 + l2 * i1] = stream.readSignedByte();
                }
            }
        }
        if (j1 > this.baseCharacterHeight && l < 128) {
            this.baseCharacterHeight = j1;
        }
        this.characterDrawXOffsets[l] = 1;
        this.characterScreenWidths[l] = i1 + 2;
        k2 = 0;
        for (i3 = j1 / 7; i3 < j1; k2 += this.fontPixels[l][i3 * i1], ++i3) {
        }
        if (k2 <= j1 / 7) {
            v0 = this.characterScreenWidths;
            v1 = l;
            v0[v1] = v0[v1] - 1;
            this.characterDrawXOffsets[l] = 0;
        }
        k2 = 0;
        for (j3 = j1 / 7; j3 < j1; k2 += this.fontPixels[l][i1 - 1 + j3 * i1], ++j3) {
        }
        if (k2 <= j1 / 7) {
            v2 = this.characterScreenWidths;
            v3 = l;
            v2[v3] = v2[v3] - 1;
        }
        ++l;
        ** GOTO lbl18
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public void drawBasicString(String string, int drawX, int drawY) {
        drawY -= this.baseCharacterHeight;
        startIndex = -1;
        currentCharacter = 0;
        while (currentCharacter < string.length()) {
            block32 : {
                block40 : {
                    block39 : {
                        block38 : {
                            block37 : {
                                block36 : {
                                    block35 : {
                                        block34 : {
                                            block33 : {
                                                block31 : {
                                                    character = string.charAt(currentCharacter);
                                                    if (character != 64 || currentCharacter + 4 >= string.length() || string.charAt(currentCharacter + 4) != '@') break block31;
                                                    tagColor = RSFont.getTagColor(string.substring(currentCharacter + 1, currentCharacter + 4));
                                                    if (tagColor != -1) {
                                                        RSFont.textColor = tagColor;
                                                    }
                                                    currentCharacter += 4;
                                                    break block32;
                                                }
                                                if (character > 255) {
                                                    character = 32;
                                                }
                                                if (character != 60) break block33;
                                                startIndex = currentCharacter;
                                                break block32;
                                            }
                                            if (character != 62 || startIndex == -1) ** GOTO lbl87
                                            effectString = string.substring(startIndex + 1, currentCharacter);
                                            startIndex = -1;
                                            if (!effectString.equals((Object)RSFont.startEffect)) break block34;
                                            System.out.println(effectString);
                                            character = 60;
                                            ** GOTO lbl87
                                        }
                                        if (!effectString.equals((Object)RSFont.endEffect)) break block35;
                                        character = 62;
                                        ** GOTO lbl87
                                    }
                                    if (!effectString.equals((Object)RSFont.aRSString_4135)) break block36;
                                    character = 160;
                                    ** GOTO lbl87
                                }
                                if (!effectString.equals((Object)RSFont.aRSString_4162)) break block37;
                                character = 173;
                                ** GOTO lbl87
                            }
                            if (!effectString.equals((Object)RSFont.aRSString_4165)) break block38;
                            character = 215;
                            ** GOTO lbl87
                        }
                        if (!effectString.equals((Object)RSFont.aRSString_4147)) break block39;
                        character = 128;
                        ** GOTO lbl87
                    }
                    if (!effectString.equals((Object)RSFont.aRSString_4163)) break block40;
                    character = 169;
                    ** GOTO lbl87
                }
                if (!effectString.equals((Object)RSFont.aRSString_4169)) {
                    if (effectString.startsWith(RSFont.startImage)) {
                        try {
                            imageId = Integer.valueOf((String)effectString.substring(4));
                            icon = RSFont.chatImages[imageId];
                            iconModY = icon.myHeight;
                            if (ArrayUtils.contains(Client.excepSprite, imageId)) {
                                icon.drawAdvancedSprite(drawX, drawY + this.baseCharacterHeight - iconModY);
                            } else if (RSFont.transparency == 256) {
                                icon.drawSprite(drawX, drawY + this.baseCharacterHeight - iconModY);
                            } else {
                                icon.drawSprite(drawX, drawY + this.baseCharacterHeight - iconModY, RSFont.transparency);
                            }
                            drawX += icon.myWidth;
                        }
                        catch (Exception imageId) {}
                    } else if (effectString.startsWith(RSFont.startClanImage)) {
                        try {
                            imageId = Integer.valueOf((String)effectString.substring(5));
                            icon = RSFont.clanImages[imageId];
                            iconModY = icon.myHeight + icon.anInt1443 + 1;
                            if (ArrayUtils.contains(Client.excepSprite, imageId)) {
                                icon.drawAdvancedSprite(drawX, drawY + this.baseCharacterHeight - iconModY);
                            } else if (RSFont.transparency == 256) {
                                icon.drawSprite(drawX, drawY + this.baseCharacterHeight - iconModY);
                            } else {
                                icon.drawSprite(drawX, drawY + this.baseCharacterHeight - iconModY, RSFont.transparency);
                            }
                            drawX += 11;
                        }
                        catch (Exception imageId) {}
                    } else {
                        this.setTextEffects(effectString);
                    }
                } else {
                    character = 174;
lbl87: // 9 sources:
                    if (startIndex == -1) {
                        width = this.characterWidths[character];
                        height = this.characterHeights[character];
                        if (character != 32) {
                            if (RSFont.transparency == 256) {
                                if (RSFont.textShadowColor != -1) {
                                    this.drawCharacter(character, drawX + this.characterDrawXOffsets[character] + 1, drawY + this.characterDrawYOffsets[character] + 1, width, height, RSFont.textShadowColor, true);
                                }
                                this.drawCharacter(character, drawX + this.characterDrawXOffsets[character], drawY + this.characterDrawYOffsets[character], width, height, RSFont.textColor, false);
                            } else {
                                if (RSFont.textShadowColor != -1) {
                                    this.drawTransparentCharacter(character, drawX + this.characterDrawXOffsets[character] + 1, drawY + this.characterDrawYOffsets[character] + 1, width, height, RSFont.textShadowColor, RSFont.transparency, true);
                                }
                                this.drawTransparentCharacter(character, drawX + this.characterDrawXOffsets[character], drawY + this.characterDrawYOffsets[character], width, height, RSFont.textColor, RSFont.transparency, false);
                            }
                        } else if (RSFont.anInt4178 > 0) {
                            drawX += (RSFont.anInt4175 += RSFont.anInt4178) >> 8;
                            RSFont.anInt4175 &= 255;
                        }
                        lineWidth = this.characterScreenWidths[character];
                        if (RSFont.strikethroughColor != -1) {
                            DrawingArea.drawHorizontalLine(drawX, drawY + (int)((double)this.baseCharacterHeight * 0.7), lineWidth, RSFont.strikethroughColor);
                        }
                        if (RSFont.underlineColor != -1) {
                            DrawingArea.drawHorizontalLine(drawX, drawY + this.baseCharacterHeight, lineWidth, RSFont.underlineColor);
                        }
                        drawX += lineWidth;
                    }
                }
            }
            ++currentCharacter;
        }
    }

    public void drawBasicString(String string, int drawX, int drawY, int color, int shadow) {
        if (string == null) return;
        this.setColorAndShadow(color, shadow);
        this.drawBasicString(string, drawX, drawY);
    }

    public void drawCenteredString(String s, int i, int j) {
        if (s == null) return;
        this.drawBasicString(s, i - this.getTextWidth(s) / 2, j);
    }

    public void drawCenteredString(String string, int drawX, int drawY, int color, int shadow) {
        if (string == null) return;
        this.setColorAndShadow(color, shadow);
        this.drawBasicString(string, drawX - this.getTextWidth(string) / 2, drawY);
    }

    public void drawCenteredString(String string, int drawX, int drawY, int color, int shadow, int trans) {
        if (trans < 0 || trans > 256) {
            trans = defaultTransparency;
        }
        transparency = trans;
        this.drawCenteredString(string, drawX, drawY, color, shadow);
    }

    private void drawCharacter(int character, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, boolean bool) {
        int i_40_ = i_35_ + i_36_ * DrawingArea.width;
        int i_41_ = DrawingArea.width - i_37_;
        int i_42_ = 0;
        int i_43_ = 0;
        if (i_36_ < DrawingArea.topY) {
            int i_44_ = DrawingArea.topY - i_36_;
            i_38_ -= i_44_;
            i_36_ = DrawingArea.topY;
            i_43_ += i_44_ * i_37_;
            i_40_ += i_44_ * DrawingArea.width;
        }
        if (i_36_ + i_38_ > DrawingArea.bottomY) {
            i_38_ -= i_36_ + i_38_ - DrawingArea.bottomY;
        }
        if (i_35_ < DrawingArea.topX) {
            int i_45_ = DrawingArea.topX - i_35_;
            i_37_ -= i_45_;
            i_35_ = DrawingArea.topX;
            i_43_ += i_45_;
            i_40_ += i_45_;
            i_42_ += i_45_;
            i_41_ += i_45_;
        }
        if (i_35_ + i_37_ > DrawingArea.bottomX) {
            int i_46_ = i_35_ + i_37_ - DrawingArea.bottomX;
            i_37_ -= i_46_;
            i_42_ += i_46_;
            i_41_ += i_46_;
        }
        if (i_37_ <= 0) return;
        if (i_38_ <= 0) return;
        try {
            RSFont.createCharacterPixels(DrawingArea.pixels, this.fontPixels[character], i_39_, i_43_, i_40_, i_37_, i_38_, i_41_, i_42_);
            return;
        }
        catch (Exception i_46_) {
            // empty catch block
        }
    }

    private void drawTransparentCharacter(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool) {
        int i_17_ = i_11_ + i_12_ * DrawingArea.width;
        int i_18_ = DrawingArea.width - i_13_;
        int i_19_ = 0;
        int i_20_ = 0;
        if (i_12_ < DrawingArea.topY) {
            int i_21_ = DrawingArea.topY - i_12_;
            i_14_ -= i_21_;
            i_12_ = DrawingArea.topY;
            i_20_ += i_21_ * i_13_;
            i_17_ += i_21_ * DrawingArea.width;
        }
        if (i_12_ + i_14_ > DrawingArea.bottomY) {
            i_14_ -= i_12_ + i_14_ - DrawingArea.bottomY;
        }
        if (i_11_ < DrawingArea.topX) {
            int i_22_ = DrawingArea.topX - i_11_;
            i_13_ -= i_22_;
            i_11_ = DrawingArea.topX;
            i_20_ += i_22_;
            i_17_ += i_22_;
            i_19_ += i_22_;
            i_18_ += i_22_;
        }
        if (i_11_ + i_13_ > DrawingArea.bottomX) {
            int i_23_ = i_11_ + i_13_ - DrawingArea.bottomX;
            i_13_ -= i_23_;
            i_19_ += i_23_;
            i_18_ += i_23_;
        }
        if (i_13_ <= 0) return;
        if (i_14_ <= 0) return;
        RSFont.createTransparentCharacterPixels(DrawingArea.pixels, this.fontPixels[i], i_15_, i_20_, i_17_, i_13_, i_14_, i_18_, i_19_, i_16_);
    }

    public void drawRAString(String string, int drawX, int drawY, int color, int shadow) {
        if (string == null) return;
        this.setColorAndShadow(color, shadow);
        this.drawString(string, drawX - this.getTextWidth(string), drawY);
    }

    public void drawString(String string, int drawX, int drawY) {
        this.drawString(string, drawX, drawY);
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public int getTextWidth(String string) {
        if (string == null) {
            return 0;
        }
        startIndex = -1;
        finalWidth = 0;
        currentCharacter = 0;
        while (currentCharacter < string.length()) {
            block11 : {
                block20 : {
                    block19 : {
                        block18 : {
                            block17 : {
                                block16 : {
                                    block15 : {
                                        block14 : {
                                            block13 : {
                                                block12 : {
                                                    block10 : {
                                                        if (string.charAt(currentCharacter) != '@' || currentCharacter + 4 >= string.length() || string.charAt(currentCharacter + 4) != '@') break block10;
                                                        currentCharacter += 4;
                                                        break block11;
                                                    }
                                                    character = string.charAt(currentCharacter);
                                                    if (character != 64 || currentCharacter + 4 >= string.length() || string.charAt(currentCharacter + 4) != '@') break block12;
                                                    tagColor = RSFont.getTagColor(string.substring(currentCharacter + 1, currentCharacter + 4));
                                                    if (tagColor != -1) {
                                                        RSFont.textColor = tagColor;
                                                    }
                                                    currentCharacter += 4;
                                                    break block11;
                                                }
                                                if (character > 255) {
                                                    character = 32;
                                                }
                                                if (character != 60) break block13;
                                                startIndex = currentCharacter;
                                                break block11;
                                            }
                                            if (character != 62 || startIndex == -1) ** GOTO lbl65
                                            effectString = string.substring(startIndex + 1, currentCharacter);
                                            startIndex = -1;
                                            if (!effectString.equals((Object)RSFont.startEffect)) break block14;
                                            character = 60;
                                            ** GOTO lbl65
                                        }
                                        if (!effectString.equals((Object)RSFont.endEffect)) break block15;
                                        character = 62;
                                        ** GOTO lbl65
                                    }
                                    if (!effectString.equals((Object)RSFont.aRSString_4135)) break block16;
                                    character = 160;
                                    ** GOTO lbl65
                                }
                                if (!effectString.equals((Object)RSFont.aRSString_4162)) break block17;
                                character = 173;
                                ** GOTO lbl65
                            }
                            if (!effectString.equals((Object)RSFont.aRSString_4165)) break block18;
                            character = 215;
                            ** GOTO lbl65
                        }
                        if (!effectString.equals((Object)RSFont.aRSString_4147)) break block19;
                        character = 128;
                        ** GOTO lbl65
                    }
                    if (!effectString.equals((Object)RSFont.aRSString_4163)) break block20;
                    character = 169;
                    ** GOTO lbl65
                }
                if (!effectString.equals((Object)RSFont.aRSString_4169)) {
                    if (effectString.startsWith(RSFont.startImage)) {
                        try {
                            iconId = Integer.valueOf((String)effectString.substring(4));
                            finalWidth += RSFont.chatImages[iconId].myWidth;
                        }
                        catch (Exception iconId) {}
                    }
                } else {
                    character = 174;
lbl65: // 9 sources:
                    if (startIndex == -1) {
                        finalWidth += this.characterScreenWidths[character];
                    }
                }
            }
            ++currentCharacter;
        }
        return finalWidth;
    }

    private void setColorAndShadow(int color, int shadow) {
        strikethroughColor = -1;
        underlineColor = -1;
        textShadowColor = RSFont.defaultShadow = shadow;
        textColor = RSFont.defaultColor = color;
        defaultTransparency = 256;
        transparency = 256;
        anInt4178 = 0;
        anInt4175 = 0;
    }

    private void setDefaultTextEffectValues(int color, int shadow, int trans) {
        strikethroughColor = -1;
        underlineColor = -1;
        textShadowColor = RSFont.defaultShadow = shadow;
        textColor = RSFont.defaultColor = color;
        transparency = RSFont.defaultTransparency = trans;
        anInt4178 = 0;
        anInt4175 = 0;
    }

    public void setTextEffects(String string) {
        try {
            if (string.startsWith(startColor)) {
                String color = string.substring(4);
                textColor = color.length() < 6 ? Color.decode((String)color).getRGB() : Integer.parseInt((String)color, (int)16);
                return;
            }
            if (string.equals((Object)endColor)) {
                textColor = defaultColor;
                return;
            }
            if (string.startsWith(startTransparency)) {
                transparency = Integer.valueOf((String)string.substring(6));
                return;
            }
            if (string.equals((Object)endTransparency)) {
                transparency = defaultTransparency;
                return;
            }
            if (string.startsWith(startStrikethrough)) {
                String color = string.substring(4);
                strikethroughColor = color.length() < 6 ? Color.decode((String)color).getRGB() : Integer.parseInt((String)color, (int)16);
                return;
            }
            if (string.equals((Object)defaultStrikethrough)) {
                strikethroughColor = 8388608;
                return;
            }
            if (string.equals((Object)endStrikethrough)) {
                strikethroughColor = -1;
                return;
            }
            if (string.startsWith(startUnderline)) {
                String color = string.substring(2);
                underlineColor = color.length() < 6 ? Color.decode((String)color).getRGB() : Integer.parseInt((String)color, (int)16);
                return;
            }
            if (string.equals((Object)startDefaultUnderline)) {
                underlineColor = 0;
                return;
            }
            if (string.equals((Object)endUnderline)) {
                underlineColor = -1;
                return;
            }
            if (string.startsWith(startShadow)) {
                String color = string.substring(5);
                textShadowColor = color.length() < 6 ? Color.decode((String)color).getRGB() : Integer.parseInt((String)color, (int)16);
                return;
            }
            if (string.equals((Object)startDefaultShadow)) {
                textShadowColor = 0;
                return;
            }
            if (string.equals((Object)endShadow)) {
                textShadowColor = defaultShadow;
                return;
            }
            if (!string.equals((Object)lineBreak)) {
                return;
            }
            this.setDefaultTextEffectValues(defaultColor, defaultShadow, defaultTransparency);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void unpackChatImages(Sprite[] icons) {
        chatImages = icons;
    }

    static {
        endShadow = "/shad";
        endStrikethrough = "/str";
        startTransparency = "trans=";
        startStrikethrough = "str=";
        startDefaultShadow = "shad";
        startColor = "col=";
        lineBreak = "br";
        defaultStrikethrough = "str";
        endUnderline = "/u";
        startImage = "img=";
        startClanImage = "clan=";
        startShadow = "shad=";
        startUnderline = "u=";
        endColor = "/col";
        startDefaultUnderline = "u";
        endTransparency = "/trans";
        aRSString_4135 = "nbsp";
        aRSString_4169 = "reg";
        aRSString_4165 = "times";
        aRSString_4162 = "shy";
        aRSString_4163 = "copy";
        endEffect = "gt";
        aRSString_4147 = "euro";
        startEffect = "lt";
        defaultTransparency = 256;
        defaultShadow = -1;
        anInt4175 = 0;
        textShadowColor = -1;
        textColor = 0;
        defaultColor = 0;
        strikethroughColor = -1;
        underlineColor = -1;
        anInt4178 = 0;
        transparency = 256;
    }
}


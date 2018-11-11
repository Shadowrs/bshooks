/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client.definition;

import com.imagineps.client.FileOperations;
import com.imagineps.client.Stream;
import com.imagineps.client.cache.CacheType;
import java.io.PrintStream;

public class FloorUnderlay {
    public static FloorUnderlay[] floors;
    public int rgb;
    public int textureId = -1;
    public boolean shadowing = true;
    public int hue;
    public int saturation;
    public int luminance;
    public int hueAdj;
    public int chroma;
    public int color;

    private FloorUnderlay() {
    }

    public static void unpackConfig() {
        Stream stream = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "flo.dat"));
        int cacheSize = stream.readUnsignedWord();
        if (floors == null) {
            floors = new FloorUnderlay[cacheSize];
        }
        int j = 0;
        while (j < cacheSize) {
            if (floors[j] == null) {
                FloorUnderlay.floors[j] = new FloorUnderlay();
            }
            floors[j].decode(stream);
            ++j;
        }
    }

    private void decode(Stream stream) {
        int opcode;
        while ((opcode = stream.readUnsignedByte()) != 0) {
            if (opcode == 1) {
                this.rgb = stream.read3Bytes();
                this.blend(this.rgb);
                continue;
            }
            if (opcode == 2) {
                this.textureId = stream.readUnsignedByte();
                continue;
            }
            if (opcode == 3) continue;
            if (opcode == 5) {
                this.shadowing = false;
                continue;
            }
            if (opcode == 6) {
                stream.readString();
                continue;
            }
            if (opcode == 7) {
                int hue = this.hue;
                int saturation = this.saturation;
                int luminance = this.luminance;
                int i1 = this.hueAdj;
                int minimapRGB = stream.read3Bytes();
                this.blend(minimapRGB);
                this.hue = hue;
                this.saturation = saturation;
                this.luminance = luminance;
                this.hueAdj = i1;
                this.chroma = i1;
                continue;
            }
            System.out.println("Error unrecognised floor underlay config code: " + opcode);
        }
        return;
    }

    private void blend(int color) {
        double brightness;
        double r = (double)(color >> 16 & 255) / 256.0;
        double g = (double)(color >> 8 & 255) / 256.0;
        double b = (double)(color & 255) / 256.0;
        double darkness = r;
        if (g < darkness) {
            darkness = g;
        }
        if (b < darkness) {
            darkness = b;
        }
        if (g > (brightness = r)) {
            brightness = g;
        }
        if (b > brightness) {
            brightness = b;
        }
        double hue = 0.0;
        double saturation = 0.0;
        double luminance = (darkness + brightness) / 2.0;
        if (darkness != brightness) {
            if (luminance < 0.5) {
                saturation = (brightness - darkness) / (brightness + darkness);
            }
            if (luminance >= 0.5) {
                saturation = (brightness - darkness) / (2.0 - brightness - darkness);
            }
            if (r == brightness) {
                hue = (g - b) / (brightness - darkness);
            } else if (g == brightness) {
                hue = 2.0 + (b - r) / (brightness - darkness);
            } else if (b == brightness) {
                hue = 4.0 + (r - g) / (brightness - darkness);
            }
        }
        this.hue = (int)((hue /= 6.0) * 256.0);
        this.saturation = (int)(saturation * 256.0);
        this.luminance = (int)(luminance * 256.0);
        if (this.saturation < 0) {
            this.saturation = 0;
        } else if (this.saturation > 255) {
            this.saturation = 255;
        }
        if (this.luminance < 0) {
            this.luminance = 0;
        } else if (this.luminance > 255) {
            this.luminance = 255;
        }
        this.chroma = luminance > 0.5 ? (int)((1.0 - luminance) * saturation * 512.0) : (int)(luminance * saturation * 512.0);
        if (this.chroma < 1) {
            this.chroma = 1;
        }
        this.hueAdj = (int)(hue * (double)this.chroma);
        this.color = FloorUnderlay.encode(this.hue, this.saturation, this.luminance);
    }

    public static int encode(int hue, int saturation, int lightness) {
        if (lightness > 179) {
            return ((hue >> 2 & 63) << 10) + ((saturation >>= 1) >> 5 << 7) + (lightness >> 1);
        }
        if (lightness > 192) {
            return ((hue >> 2 & 63) << 10) + ((saturation >>= 2) >> 5 << 7) + (lightness >> 1);
        }
        if (lightness > 217) {
            return ((hue >> 2 & 63) << 10) + ((saturation >>= 3) >> 5 << 7) + (lightness >> 1);
        }
        if (lightness <= 243) return ((hue >> 2 & 63) << 10) + (saturation >> 5 << 7) + (lightness >> 1);
        saturation >>= 4;
        return ((hue >> 2 & 63) << 10) + (saturation >> 5 << 7) + (lightness >> 1);
    }
}


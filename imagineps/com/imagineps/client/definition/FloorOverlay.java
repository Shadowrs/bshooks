/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.nio.ByteBuffer
 */
package com.imagineps.client.definition;

import com.imagineps.client.FileOperations;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.cache.CacheType;
import java.io.PrintStream;
import java.nio.ByteBuffer;

public class FloorOverlay {
    public static FloorOverlay[] cache;
    public int textureId = -1;
    public int rgb;
    public boolean boolean_5;
    public int int_7;
    public int int_9;
    public boolean boolean_10;
    public int int_11;
    public boolean boolean_12;
    public int int_13;
    public int int_14;
    public int int_15;
    public int int_16;
    public int anInt394;
    public int anInt395;
    public int anInt396;
    public int anInt397;
    public int anInt398;
    public int anInt399;

    public static void unpackConfig(StreamLoader stream) {
        ByteBuffer buffer = ByteBuffer.wrap((byte[])FileOperations.readFile(CacheType.DATA.getFullLocation() + "flo2.dat"));
        int count = buffer.getShort();
        cache = new FloorOverlay[count];
        int i = 0;
        while (i < count) {
            if (cache[i] == null) {
                FloorOverlay.cache[i] = new FloorOverlay();
            }
            cache[i].readValues(buffer);
            ++i;
        }
    }

    private void readValues(ByteBuffer buffer) {
        byte opcode;
        while ((opcode = buffer.get()) != 0) {
            if (opcode == 1) {
                this.rgb = ((buffer.get() & 255) << 16) + ((buffer.get() & 255) << 8) + (buffer.get() & 255);
                this.method262(this.rgb);
                continue;
            }
            if (opcode == 2) {
                this.textureId = buffer.get() & 255;
                continue;
            }
            if (opcode == 3) {
                this.textureId = buffer.getShort() & 65535;
                if (this.textureId != 65535) continue;
                this.textureId = -1;
                continue;
            }
            if (opcode == 4) continue;
            if (opcode == 5) {
                this.boolean_5 = false;
                continue;
            }
            if (opcode == 6) continue;
            if (opcode == 7) {
                this.int_7 = ((buffer.get() & 255) << 16) + ((buffer.get() & 255) << 8) + (buffer.get() & 255);
                continue;
            }
            if (opcode == 8) continue;
            if (opcode == 9) {
                this.int_9 = buffer.getShort() & 65535;
                continue;
            }
            if (opcode == 10) {
                this.boolean_10 = false;
                continue;
            }
            if (opcode == 11) {
                this.int_11 = buffer.get() & 255;
                continue;
            }
            if (opcode == 12) {
                this.boolean_12 = true;
                continue;
            }
            if (opcode == 13) {
                this.int_13 = ((buffer.get() & 255) << 16) + ((buffer.get() & 255) << 8) + (buffer.get() & 255);
                continue;
            }
            if (opcode == 14) {
                this.int_14 = buffer.get() & 255;
                continue;
            }
            if (opcode == 15) {
                this.int_15 = buffer.getShort() & 65535;
                if (this.int_15 != 65535) continue;
                this.int_15 = -1;
                continue;
            }
            if (opcode == 16) {
                this.int_16 = buffer.get() & 255;
                continue;
            }
            System.err.println("[FloorOverlay] Missing AttributeId: " + opcode);
        }
        return;
    }

    private void method262(int arg0) {
        double d_8_;
        double d = (double)(arg0 >> 16 & 255) / 256.0;
        double d_5_ = (double)(arg0 >> 8 & 255) / 256.0;
        double d_6_ = (double)(arg0 & 255) / 256.0;
        double d_7_ = d;
        if (d_5_ < d_7_) {
            d_7_ = d_5_;
        }
        if (d_6_ < d_7_) {
            d_7_ = d_6_;
        }
        if (d_5_ > (d_8_ = d)) {
            d_8_ = d_5_;
        }
        if (d_6_ > d_8_) {
            d_8_ = d_6_;
        }
        double d_9_ = 0.0;
        double d_10_ = 0.0;
        double d_11_ = (d_7_ + d_8_) / 2.0;
        if (d_7_ != d_8_) {
            if (d_11_ < 0.5) {
                d_10_ = (d_8_ - d_7_) / (d_8_ + d_7_);
            }
            if (d_11_ >= 0.5) {
                d_10_ = (d_8_ - d_7_) / (2.0 - d_8_ - d_7_);
            }
            if (d == d_8_) {
                d_9_ = (d_5_ - d_6_) / (d_8_ - d_7_);
            } else if (d_5_ == d_8_) {
                d_9_ = 2.0 + (d_6_ - d) / (d_8_ - d_7_);
            } else if (d_6_ == d_8_) {
                d_9_ = 4.0 + (d - d_5_) / (d_8_ - d_7_);
            }
        }
        this.anInt394 = (int)((d_9_ /= 6.0) * 256.0);
        this.anInt395 = (int)(d_10_ * 256.0);
        this.anInt396 = (int)(d_11_ * 256.0);
        if (this.anInt395 < 0) {
            this.anInt395 = 0;
        } else if (this.anInt395 > 255) {
            this.anInt395 = 255;
        }
        if (this.anInt396 < 0) {
            this.anInt396 = 0;
        } else if (this.anInt396 > 255) {
            this.anInt396 = 255;
        }
        this.anInt398 = d_11_ > 0.5 ? (int)((1.0 - d_11_) * d_10_ * 512.0) : (int)(d_11_ * d_10_ * 512.0);
        if (this.anInt398 < 1) {
            this.anInt398 = 1;
        }
        this.anInt397 = (int)(d_9_ * (double)this.anInt398);
        int i = this.anInt394;
        int i_12_ = this.anInt395;
        int i_13_ = this.anInt396;
        this.anInt399 = this.method263(i, i_12_, i_13_);
    }

    private final int method263(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 <= 243) return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
        arg1 /= 2;
        return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
    }
}


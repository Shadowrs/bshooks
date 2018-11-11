/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client;

import com.imagineps.client.Stream;

final class Class29 {
    private int anInt535;
    private int[] anIntArray536;
    private int[] anIntArray537;
    int anInt538;
    int anInt539;
    int anInt540;
    private int anInt541;
    private int anInt542;
    private int anInt543;
    private int anInt544;
    private int anInt545;
    public static int anInt546;

    public void method325(Stream stream) {
        this.anInt540 = stream.readUnsignedByte();
        this.anInt538 = stream.readDWord();
        this.anInt539 = stream.readDWord();
        this.method326(stream);
    }

    public void method326(Stream stream) {
        this.anInt535 = stream.readUnsignedByte();
        this.anIntArray536 = new int[this.anInt535];
        this.anIntArray537 = new int[this.anInt535];
        int i = 0;
        while (i < this.anInt535) {
            this.anIntArray536[i] = stream.readUnsignedWord();
            this.anIntArray537[i] = stream.readUnsignedWord();
            ++i;
        }
    }

    void resetValues() {
        this.anInt541 = 0;
        this.anInt542 = 0;
        this.anInt543 = 0;
        this.anInt544 = 0;
        this.anInt545 = 0;
    }

    int method328(int i) {
        if (this.anInt545 >= this.anInt541) {
            this.anInt544 = this.anIntArray537[this.anInt542++] << 15;
            if (this.anInt542 >= this.anInt535) {
                this.anInt542 = this.anInt535 - 1;
            }
            this.anInt541 = (int)((double)this.anIntArray536[this.anInt542] / 65536.0 * (double)i);
            if (this.anInt541 > this.anInt545) {
                this.anInt543 = ((this.anIntArray537[this.anInt542] << 15) - this.anInt544) / (this.anInt541 - this.anInt545);
            }
        }
        this.anInt544 += this.anInt543;
        ++this.anInt545;
        return this.anInt544 - this.anInt543 >> 15;
    }
}


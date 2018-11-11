/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.file.Path
 */
package com.imagineps.client.updater;

import com.google.gson.annotations.SerializedName;
import com.imagineps.client.updater.Updater;
import java.io.File;
import java.nio.file.Path;

public final class CacheFile {
    @SerializedName(value="name")
    final String name;
    @SerializedName(value="dir")
    String dir;
    @SerializedName(value="size")
    final int size;
    @SerializedName(value="crc")
    final String crc;
    public transient Path original;

    public CacheFile(String name, String dir, int size, String crc) {
        this.name = name;
        this.dir = dir;
        this.size = size;
        this.crc = crc;
    }

    public String key() {
        return this.dir + File.separator + this.name;
    }

    public String getDir() {
        return this.dir;
    }

    public int getSize() {
        return this.size;
    }

    public String getCrc() {
        return this.crc;
    }

    public String getName() {
        return this.name;
    }

    public Path path() {
        Path path = Updater.CACHE_DIRECTORY;
        if (this.dir.isEmpty()) return path;
        return path.resolve(this.dir);
    }
}


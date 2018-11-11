/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.imagineps.client.cache;

import com.imagineps.client.signlink.Signlink;
import java.io.File;

public enum CacheType {
    MAIN_FILE_CACHE("main_file_cache", "http://imagine-ps.com/download/main_file_cache.zip"),
    SPRITES("sprites", "http://imagine-ps.com/download/sprites.zip"),
    DATA("data", "http://imagine-ps.com/download/data.zip"),
    RAW("raw", "http://imagine-ps.com/download/raw.zip");
    
    private final String subFolder;
    private final String updateURL;

    private CacheType(String subFolder, String updateURL) {
        this.subFolder = subFolder;
        this.updateURL = updateURL;
    }

    public void checkDirectory() {
        File directory = new File(this.getFullLocation());
        if (directory.exists()) return;
        directory.mkdirs();
    }

    public String getFullLocation() {
        String location = Signlink.getDirectory() + this.subFolder + File.separator;
        File directory = new File(location);
        if (directory.exists()) return location;
        directory.mkdirs();
        return location;
    }

    public String getFolderLocation() {
        return Signlink.getDirectory() + this.subFolder;
    }

    public String getSubFolder() {
        return this.subFolder;
    }

    public String getUpdateURL() {
        return this.updateURL;
    }

    public String toString() {
        return this.name().toLowerCase().replaceAll("_", " ");
    }
}


/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.DataInputStream
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.PrintStream
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.zip.GZIPInputStream
 */
package com.imagineps.client;

import com.imagineps.client.FileOperations;
import com.imagineps.client.Stream;
import com.imagineps.client.cache.CacheType;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.signlink.Signlink;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.zip.GZIPInputStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class SpriteLoader {
    private static final String FOLDER_NAME = "image_dump";
    private static final boolean DUMP_SPRITE_ARCHIVE = false;
    private static final String DIRECTORY = Signlink.getDirectory() + File.separator;
    private static final ReadType READ_TYPE = ReadType.ARCHIVE;
    public static SpriteLoader[] cache;
    public static Sprite[] sprites;
    public static int totalSprites;
    public String name = "name";
    public int id = -1;
    public int drawOffsetX = 0;
    public int drawOffsetY = 0;
    public byte[] spriteData = null;

    public static void createSprite(SpriteLoader sprite) {
        SpriteLoader.sprites[sprite.id] = new Sprite(sprite.spriteData);
        SpriteLoader.sprites[sprite.id].anInt1442 = sprite.drawOffsetX;
        SpriteLoader.sprites[sprite.id].anInt1443 = sprite.drawOffsetY;
    }

    public static String getName(int index) {
        if (SpriteLoader.cache[index].name == null) return "null";
        return SpriteLoader.cache[index].name;
    }

    public static int getOffsetX(int index) {
        return SpriteLoader.cache[index].drawOffsetX;
    }

    public static int getOffsetY(int index) {
        return SpriteLoader.cache[index].drawOffsetY;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void loadSprites() {
        if (READ_TYPE == ReadType.ARCHIVE) {
            DataInputStream indexFile = null;
            DataInputStream dataFile = null;
            try {
                Stream index = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "sprites.idx"));
                Stream data = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "sprites.dat"));
                indexFile = new DataInputStream((InputStream)new GZIPInputStream((InputStream)new ByteArrayInputStream(index.buffer)));
                dataFile = new DataInputStream((InputStream)new GZIPInputStream((InputStream)new ByteArrayInputStream(data.buffer)));
                int totalSprites = indexFile.readInt();
                if (cache == null) {
                    cache = new SpriteLoader[totalSprites];
                    sprites = new Sprite[totalSprites];
                }
                for (int i = 0; i < totalSprites; ++i) {
                    int id = indexFile.readInt();
                    if (cache[id] == null) {
                        SpriteLoader.cache[id] = new SpriteLoader();
                    }
                    cache[id].readValues(dataFile, indexFile);
                    SpriteLoader.createSprite(cache[id]);
                }
                indexFile.close();
                dataFile.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                try {
                    if (indexFile != null) {
                        indexFile.close();
                    }
                    if (dataFile != null) {
                        dataFile.close();
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (READ_TYPE == ReadType.LOCAL) {
            File directory = new File(DIRECTORY, "image_dump");
            if (!directory.exists()) {
                directory.mkdir();
            }
            File[] file = directory.listFiles();
            int size = file.length;
            sprites = new Sprite[size];
            for (int i = 0; i < size; ++i) {
                SpriteLoader.sprites[i] = Sprite.createCustomSprite(DIRECTORY + "image_dump", "" + i);
            }
        }
        System.out.println("Loaded a total of " + sprites.length + " cache sprites.");
    }

    public void readValues(DataInputStream data, DataInputStream indexFile) throws IOException {
        byte opCode;
        while ((opCode = data.readByte()) != 0) {
            if (opCode == 1) {
                this.id = data.readShort();
                continue;
            }
            if (opCode == 2) {
                this.name = data.readUTF();
                continue;
            }
            if (opCode == 3) {
                this.drawOffsetX = data.readShort();
                continue;
            }
            if (opCode == 4) {
                this.drawOffsetY = data.readShort();
                continue;
            }
            if (opCode != 5) continue;
            byte[] dataread = new byte[indexFile.readInt()];
            data.readFully(dataread);
            this.spriteData = dataread;
        }
        return;
    }

    static {
        sprites = null;
    }

    /*
     * Exception performing whole class analysis ignored.
     */
    private static enum ReadType {
        ARCHIVE,
        LOCAL;
        

        private ReadType() {
        }
    }

}


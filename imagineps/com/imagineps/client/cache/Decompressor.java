/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.channels.FileChannel
 */
package com.imagineps.client.cache;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class Decompressor {
    private static final int IDX_BLOCK_LEN = 6;
    private static final int HEADER_LEN = 8;
    private static final int EXPANDED_HEADER_LEN = 10;
    private static final int BLOCK_LEN = 512;
    private static final int EXPANDED_BLOCK_LEN = 510;
    private static final int TOTAL_BLOCK_LEN = 520;
    private static ByteBuffer tempBuffer = ByteBuffer.allocateDirect((int)520);
    private final int index;
    private final FileChannel indexChannel;
    private final FileChannel dataChannel;
    private final int maxSize;

    public Decompressor(int index, FileChannel dataChannel, FileChannel indexChannel, int maxSize) {
        this.index = index;
        this.dataChannel = dataChannel;
        this.indexChannel = indexChannel;
        this.maxSize = maxSize;
    }

    public int getFileCount() {
        try {
            return (int)(this.indexChannel.size() / 6L);
        }
        catch (IOException ex) {
            return 0;
        }
    }

    public ByteBuffer get(int file) {
        try {
            int headerLen;
            if ((long)(file * 6 + 6) > this.indexChannel.size()) {
                return null;
            }
            tempBuffer.position(0).limit(6);
            this.indexChannel.read(tempBuffer, (long)(file * 6));
            tempBuffer.flip();
            int size = Decompressor.getMediumInt(tempBuffer);
            int block = Decompressor.getMediumInt(tempBuffer);
            if (size < 0) return null;
            if (size > this.maxSize) {
                return null;
            }
            if (block <= 0) return null;
            if ((long)block > this.dataChannel.size() / 520L) {
                return null;
            }
            ByteBuffer fileBuffer = ByteBuffer.allocate((int)size);
            int remaining = size;
            int chunk = 0;
            int blockLen = file <= 65535 ? 512 : 510;
            int n = headerLen = file <= 65535 ? 8 : 10;
            do {
                int currentIndex;
                int currentChunk;
                int currentFile;
                int nextBlock;
                if (remaining <= 0) {
                    fileBuffer.position(0);
                    return fileBuffer;
                }
                if (block == 0) {
                    return null;
                }
                int blockSize = remaining > blockLen ? blockLen : remaining;
                tempBuffer.position(0).limit(blockSize + headerLen);
                this.dataChannel.read(tempBuffer, (long)(block * 520));
                tempBuffer.flip();
                if (file <= 65535) {
                    currentFile = tempBuffer.getShort() & 65535;
                    currentChunk = tempBuffer.getShort() & 65535;
                    nextBlock = Decompressor.getMediumInt(tempBuffer);
                    currentIndex = tempBuffer.get() & 255;
                } else {
                    currentFile = tempBuffer.getInt();
                    currentChunk = tempBuffer.getShort() & 65535;
                    nextBlock = Decompressor.getMediumInt(tempBuffer);
                    currentIndex = tempBuffer.get() & 255;
                }
                if (file != currentFile) return null;
                if (chunk != currentChunk) return null;
                if (this.index != currentIndex) {
                    return null;
                }
                if (nextBlock < 0) return null;
                if ((long)nextBlock > this.dataChannel.size() / 520L) {
                    return null;
                }
                int rem = tempBuffer.remaining();
                for (int i = 0; i < rem; ++i) {
                    fileBuffer.put(tempBuffer.get());
                }
                remaining -= blockSize;
                block = nextBlock;
                ++chunk;
            } while (true);
        }
        catch (IOException ex) {
            return null;
        }
    }

    public byte[] getBytes(int file) {
        if (this.get(file) != null) return this.get(file).array();
        return null;
    }

    public boolean put(int file, byte[] data) {
        return this.put(file, ByteBuffer.wrap((byte[])data), data.length);
    }

    public boolean put(int file, ByteBuffer data, int size) {
        if (size < 0) throw new IllegalArgumentException("File too big: " + file + " size: " + size);
        if (size > this.maxSize) {
            throw new IllegalArgumentException("File too big: " + file + " size: " + size);
        }
        boolean success = this.put(file, data, size, true);
        if (success) return success;
        return this.put(file, data, size, false);
    }

    private boolean put(int file, ByteBuffer data, int size, boolean exists) {
        try {
            int block;
            if (exists) {
                if ((long)(file * 6 + 6) > this.indexChannel.size()) {
                    return false;
                }
                tempBuffer.position(0).limit(6);
                this.indexChannel.read(tempBuffer, (long)(file * 6));
                tempBuffer.flip().position(3);
                block = Decompressor.getMediumInt(tempBuffer);
                if (block <= 0) return false;
                if ((long)block > this.dataChannel.size() / 520L) {
                    return false;
                }
            } else {
                block = (int)(this.dataChannel.size() + 520L - 1L) / 520;
                if (block == 0) {
                    block = 1;
                }
            }
            tempBuffer.position(0);
            Decompressor.putMediumInt(tempBuffer, size);
            Decompressor.putMediumInt(tempBuffer, block);
            tempBuffer.flip();
            this.indexChannel.write(tempBuffer, (long)(file * 6));
            int remaining = size;
            int chunk = 0;
            int blockLen = file <= 65535 ? 512 : 510;
            int headerLen = file <= 65535 ? 8 : 10;
            while (remaining > 0) {
                int nextBlock = 0;
                if (exists) {
                    int currentIndex;
                    int currentChunk;
                    int currentFile;
                    tempBuffer.position(0).limit(headerLen);
                    this.dataChannel.read(tempBuffer, (long)(block * 520));
                    tempBuffer.flip();
                    if (file <= 65535) {
                        currentFile = tempBuffer.getShort() & 65535;
                        currentChunk = tempBuffer.getShort() & 65535;
                        nextBlock = Decompressor.getMediumInt(tempBuffer);
                        currentIndex = tempBuffer.get() & 255;
                    } else {
                        currentFile = tempBuffer.getInt();
                        currentChunk = tempBuffer.getShort() & 65535;
                        nextBlock = Decompressor.getMediumInt(tempBuffer);
                        currentIndex = tempBuffer.get() & 255;
                    }
                    if (file != currentFile) return false;
                    if (chunk != currentChunk) return false;
                    if (this.index != currentIndex) {
                        return false;
                    }
                    if (nextBlock < 0) return false;
                    if ((long)nextBlock > this.dataChannel.size() / 520L) {
                        return false;
                    }
                }
                if (nextBlock == 0) {
                    exists = false;
                    nextBlock = (int)((this.dataChannel.size() + 520L - 1L) / 520L);
                    if (nextBlock == 0) {
                        nextBlock = 1;
                    }
                    if (nextBlock == block) {
                        ++nextBlock;
                    }
                }
                if (remaining <= blockLen) {
                    nextBlock = 0;
                }
                tempBuffer.position(0).limit(520);
                if (file <= 65535) {
                    tempBuffer.putShort((short)file);
                    tempBuffer.putShort((short)(chunk ? 1 : 0));
                    Decompressor.putMediumInt(tempBuffer, nextBlock);
                    tempBuffer.put((byte)this.index);
                } else {
                    tempBuffer.putInt(file);
                    tempBuffer.putShort((short)(chunk ? 1 : 0));
                    Decompressor.putMediumInt(tempBuffer, nextBlock);
                    tempBuffer.put((byte)this.index);
                }
                int blockSize = remaining > blockLen ? blockLen : remaining;
                data.limit(data.position() + blockSize);
                tempBuffer.put(data);
                tempBuffer.flip();
                this.dataChannel.write(tempBuffer, (long)(block * 520));
                remaining -= blockSize;
                block = nextBlock;
                ++chunk;
            }
            return true;
        }
        catch (IOException ex) {
            return false;
        }
    }

    private static int getMediumInt(ByteBuffer buffer) {
        return (buffer.get() & 255) << 16 | (buffer.get() & 255) << 8 | buffer.get() & 255;
    }

    private static void putMediumInt(ByteBuffer buffer, int val) {
        buffer.put((byte)(val >> 16));
        buffer.put((byte)(val >> 8));
        buffer.put((byte)val);
    }

    public void close() {
        try {
            this.dataChannel.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        try {
            this.indexChannel.close();
            return;
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}


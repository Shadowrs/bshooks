/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.net.Socket
 *  java.util.zip.CRC32
 *  java.util.zip.GZIPInputStream
 */
package com.imagineps.client.cache;

import com.imagineps.client.Client;
import com.imagineps.client.Node;
import com.imagineps.client.NodeList;
import com.imagineps.client.NodeSub;
import com.imagineps.client.NodeSubList;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.cache.Decompressor;
import com.imagineps.client.cache.OnDemandData;
import com.imagineps.client.cache.OnDemandFetcherParent;
import com.imagineps.client.signlink.Signlink;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

public final class OnDemandFetcher
extends OnDemandFetcherParent
implements Runnable {
    private int totalFiles;
    private final NodeList requested = new NodeList();
    private int anInt1332;
    public String statusString = "";
    private int writeLoopCycle;
    private long openSocketTime;
    private int[] mapIndices3;
    private final byte[] ioBuffer;
    public int onDemandCycle;
    private final byte[][] fileStatus;
    private Client clientInstance;
    private final NodeList aClass19_1344;
    private int completedSize;
    private int expectedSize;
    private int[] anIntArray1348;
    public int anInt1349;
    private int[] mapIndices2;
    private int filesLoaded;
    private boolean running;
    private OutputStream outputStream;
    private boolean waiting;
    private final NodeList aClass19_1358;
    private final byte[] gzipInputBuffer;
    private final NodeSubList nodeSubList;
    private InputStream inputStream;
    private Socket socket;
    private final int[][] versions;
    private int uncompletedCount;
    private int completedCount;
    private final NodeList aClass19_1368;
    private OnDemandData current;
    private final NodeList aClass19_1370;
    private int[] mapIndices1;
    private int loopCycle;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void readData() {
        try {
            int j = this.inputStream.available();
            if (this.expectedSize == 0 && j >= 6) {
                this.waiting = true;
                for (int k = 0; k < 6; k += this.inputStream.read((byte[])this.ioBuffer, (int)k, (int)(6 - k))) {
                }
                int l = this.ioBuffer[0] & 255;
                int j1 = ((this.ioBuffer[1] & 255) << 8) + (this.ioBuffer[2] & 255);
                int l1 = ((this.ioBuffer[3] & 255) << 8) + (this.ioBuffer[4] & 255);
                int i2 = this.ioBuffer[5] & 255;
                this.current = null;
                Object onDemandData = (OnDemandData)this.requested.reverseGetFirst();
                while (onDemandData != null) {
                    if (onDemandData.dataType == l && onDemandData.ID == j1) {
                        this.current = onDemandData;
                    }
                    if (this.current != null) {
                        onDemandData.loopCycle = 0;
                    }
                    onDemandData = (OnDemandData)this.requested.reverseGetNext();
                }
                if (this.current != null) {
                    this.loopCycle = 0;
                    if (l1 == 0) {
                        Signlink.reporterror("Rej: " + l + "," + j1);
                        this.current.buffer = null;
                        if (this.current.incomplete) {
                            onDemandData = this.aClass19_1358;
                            synchronized (onDemandData) {
                                this.aClass19_1358.insertHead(this.current);
                            }
                        } else {
                            this.current.unlink();
                        }
                        this.current = null;
                    } else {
                        if (this.current.buffer == null && i2 == 0) {
                            this.current.buffer = new byte[l1];
                        }
                        if (this.current.buffer == null && i2 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.completedSize = i2 * 500;
                this.expectedSize = 500;
                if (this.expectedSize > l1 - i2 * 500) {
                    this.expectedSize = l1 - i2 * 500;
                }
            }
            if (this.expectedSize <= 0) return;
            if (j < this.expectedSize) return;
            this.waiting = true;
            byte[] abyte0 = this.ioBuffer;
            int i1 = 0;
            if (this.current != null) {
                abyte0 = this.current.buffer;
                i1 = this.completedSize;
            }
            for (int k1 = 0; k1 < this.expectedSize; k1 += this.inputStream.read((byte[])abyte0, (int)(k1 + i1), (int)(this.expectedSize - k1))) {
            }
            if (this.expectedSize + this.completedSize >= abyte0.length && this.current != null) {
                if (this.clientInstance.decompressors[0] != null) {
                    this.clientInstance.decompressors[this.current.dataType + 1].put(this.current.ID, abyte0);
                }
                if (!this.current.incomplete && this.current.dataType == 3) {
                    this.current.incomplete = true;
                    this.current.dataType = 93;
                }
                if (this.current.incomplete) {
                    NodeList k1 = this.aClass19_1358;
                    synchronized (k1) {
                        this.aClass19_1358.insertHead(this.current);
                    }
                } else {
                    this.current.unlink();
                }
            }
            this.expectedSize = 0;
            return;
        }
        catch (IOException ioexception) {
            try {
                this.socket.close();
            }
            catch (Exception abyte0) {
                // empty catch block
            }
            this.socket = null;
            this.inputStream = null;
            this.outputStream = null;
            this.expectedSize = 0;
        }
    }

    public void start(StreamLoader streamLoader, Client client) {
        byte[] fileData = streamLoader.getDataForName("map_index");
        Stream stream = new Stream(fileData);
        int size = fileData.length / 6;
        this.mapIndices1 = new int[size + 9];
        this.mapIndices2 = new int[size + 9];
        this.mapIndices3 = new int[size + 9];
        for (int index = 0; index < size; ++index) {
            this.mapIndices1[index] = stream.readUnsignedWord();
            this.mapIndices2[index] = stream.readUnsignedWord();
            this.mapIndices3[index] = stream.readUnsignedWord();
        }
        this.mapIndices1[index] = 5731;
        this.mapIndices2[index] = 7174;
        this.mapIndices3[index] = 7175;
        this.mapIndices1[++index] = 5931;
        this.mapIndices2[index] = 2034;
        this.mapIndices3[index] = 2035;
        this.mapIndices1[++index] = 4919;
        this.mapIndices2[index] = 2820;
        this.mapIndices3[index] = 2821;
        this.mapIndices1[++index] = 10023;
        this.mapIndices2[index] = 1646;
        this.mapIndices3[index] = 1647;
        this.mapIndices1[++index] = 10024;
        this.mapIndices2[index] = 1648;
        this.mapIndices3[index] = 1649;
        this.mapIndices1[++index] = 10279;
        this.mapIndices2[index] = 1662;
        this.mapIndices3[index] = 1663;
        this.mapIndices1[++index] = 10025;
        this.mapIndices2[index] = 1650;
        this.mapIndices3[index] = 1651;
        this.mapIndices1[++index] = 10026;
        this.mapIndices2[index] = 1652;
        this.mapIndices3[index] = 1653;
        this.mapIndices1[++index] = 10027;
        this.mapIndices2[index] = 1654;
        this.mapIndices3[index] = 1655;
        fileData = streamLoader.getDataForName("midi_index");
        stream = new Stream(fileData);
        size = fileData.length;
        this.anIntArray1348 = new int[size];
        int k2 = 0;
        do {
            if (k2 >= size) {
                this.clientInstance = client;
                this.running = true;
                this.clientInstance.startRunnable(this, 2);
                return;
            }
            this.anIntArray1348[k2] = stream.readUnsignedByte();
            ++k2;
        } while (true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getNodeCount() {
        NodeSubList nodeSubList = this.nodeSubList;
        synchronized (nodeSubList) {
            return this.nodeSubList.getNodeCount();
        }
    }

    public void disable() {
        this.running = false;
    }

    public int getVersionCount(int j) {
        return 65535;
    }

    private void closeRequest(OnDemandData onDemandData) {
        try {
            if (this.socket == null) {
                long l2 = System.currentTimeMillis();
                if (l2 - this.openSocketTime < 4000L) {
                    return;
                }
                this.openSocketTime = l2;
                this.socket = this.clientInstance.openSocket(43594 + Client.portOff);
                this.inputStream = this.socket.getInputStream();
                this.outputStream = this.socket.getOutputStream();
                this.outputStream.write(15);
                for (int j = 0; j < 8; ++j) {
                    this.inputStream.read();
                }
                this.loopCycle = 0;
            }
            this.ioBuffer[0] = (byte)onDemandData.dataType;
            this.ioBuffer[1] = (byte)(onDemandData.ID >> 8);
            this.ioBuffer[2] = (byte)onDemandData.ID;
            this.ioBuffer[3] = onDemandData.incomplete ? 2 : (!this.clientInstance.loggedIn ? 1 : 0);
            this.outputStream.write(this.ioBuffer, 0, 4);
            this.writeLoopCycle = 0;
            this.anInt1349 = -10000;
            return;
        }
        catch (IOException l2) {
            try {
                this.socket.close();
            }
            catch (Exception l2) {
                // empty catch block
            }
            this.socket = null;
            this.inputStream = null;
            this.outputStream = null;
            this.expectedSize = 0;
            ++this.anInt1349;
            return;
        }
    }

    public int getModelCount() {
        return 80000;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void loadMandatory(int index, int id) {
        NodeSubList nodeSubList = this.nodeSubList;
        synchronized (nodeSubList) {
            OnDemandData onDemandData = (OnDemandData)this.nodeSubList.reverseGetFirst();
            while (onDemandData != null) {
                if (onDemandData.dataType == index && onDemandData.ID == id) {
                    return;
                }
                onDemandData = (OnDemandData)this.nodeSubList.reverseGetNext();
            }
            OnDemandData onDemandRequest = new OnDemandData();
            onDemandRequest.dataType = index;
            onDemandRequest.ID = id;
            onDemandRequest.incomplete = true;
            NodeList nodeList = this.aClass19_1370;
            synchronized (nodeList) {
                this.aClass19_1370.insertHead(onDemandRequest);
            }
            this.nodeSubList.insertHead(onDemandRequest);
            return;
        }
    }

    public int getModelIndex(int i) {
        return 80000;
    }

    public void run() {
        try {
            while (this.running) {
                ++this.onDemandCycle;
                int i = 20;
                if (this.anInt1332 == 0 && this.clientInstance.decompressors[0] != null) {
                    i = 50;
                }
                try {
                    Thread.sleep((long)i);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.waiting = true;
                for (int j = 0; j < 100 && this.waiting; ++j) {
                    this.waiting = false;
                    this.checkReceived();
                    this.handleFailed();
                    if (this.uncompletedCount == 0 && j >= 5) break;
                    this.method568();
                    if (this.inputStream == null) continue;
                    this.readData();
                }
                boolean flag = false;
                OnDemandData onDemandData = (OnDemandData)this.requested.reverseGetFirst();
                while (onDemandData != null) {
                    if (onDemandData.incomplete) {
                        flag = true;
                        ++onDemandData.loopCycle;
                        if (onDemandData.loopCycle > 50) {
                            onDemandData.loopCycle = 0;
                            this.closeRequest(onDemandData);
                        }
                    }
                    onDemandData = (OnDemandData)this.requested.reverseGetNext();
                }
                if (!flag) {
                    OnDemandData onDemandData_1 = (OnDemandData)this.requested.reverseGetFirst();
                    while (onDemandData_1 != null) {
                        flag = true;
                        ++onDemandData_1.loopCycle;
                        if (onDemandData_1.loopCycle > 50) {
                            onDemandData_1.loopCycle = 0;
                            this.closeRequest(onDemandData_1);
                        }
                        onDemandData_1 = (OnDemandData)this.requested.reverseGetNext();
                    }
                }
                if (flag) {
                    ++this.loopCycle;
                    if (this.loopCycle > 750) {
                        try {
                            this.socket.close();
                        }
                        catch (Exception onDemandData_1) {
                            // empty catch block
                        }
                        this.socket = null;
                        this.inputStream = null;
                        this.outputStream = null;
                        this.expectedSize = 0;
                    }
                } else {
                    this.loopCycle = 0;
                    this.statusString = "";
                }
                if (!this.clientInstance.loggedIn || this.socket == null || this.outputStream == null || this.anInt1332 <= 0 && this.clientInstance.decompressors[0] != null) continue;
                ++this.writeLoopCycle;
                if (this.writeLoopCycle <= 500) continue;
                this.writeLoopCycle = 0;
                this.ioBuffer[0] = 0;
                this.ioBuffer[1] = 0;
                this.ioBuffer[2] = 0;
                this.ioBuffer[3] = 10;
                try {
                    this.outputStream.write(this.ioBuffer, 0, 4);
                }
                catch (IOException _ex) {
                    this.loopCycle = 5000;
                }
            }
            return;
        }
        catch (Exception exception) {
            Signlink.reporterror("od_ex " + exception.getMessage());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void method560(int i, int j) {
        if (this.clientInstance.decompressors[0] == null) {
            return;
        }
        if (this.anInt1332 == 0) {
            return;
        }
        OnDemandData onDemandData = new OnDemandData();
        onDemandData.dataType = j;
        onDemandData.ID = i;
        onDemandData.incomplete = false;
        NodeList nodeList = this.aClass19_1344;
        synchronized (nodeList) {
            this.aClass19_1344.insertHead(onDemandData);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public OnDemandData getNextNode() {
        OnDemandData onDemandData;
        Object object = this.aClass19_1358;
        synchronized (object) {
            onDemandData = (OnDemandData)this.aClass19_1358.popHead();
        }
        if (onDemandData == null) {
            return null;
        }
        object = this.nodeSubList;
        synchronized (object) {
            onDemandData.unlinkSub();
        }
        if (onDemandData.buffer == null) {
            return onDemandData;
        }
        int i = 0;
        try {
            GZIPInputStream gzipinputstream = new GZIPInputStream((InputStream)new ByteArrayInputStream(onDemandData.buffer));
            do {
                if (i == this.gzipInputBuffer.length) {
                    throw new RuntimeException("buffer overflow!");
                }
                int k = gzipinputstream.read(this.gzipInputBuffer, i, this.gzipInputBuffer.length - i);
                if (k != -1) {
                    i += k;
                    continue;
                }
                break;
            } while (true);
        }
        catch (IOException _ex) {
            System.out.println("Failed to unzip model [" + onDemandData.ID + "] type = " + onDemandData.dataType);
            _ex.printStackTrace();
            return null;
        }
        onDemandData.buffer = new byte[i];
        System.arraycopy((Object)this.gzipInputBuffer, (int)0, (Object)onDemandData.buffer, (int)0, (int)i);
        return onDemandData;
    }

    public int method562(int i, int k, int l) {
        int i1 = (l << 8) + k;
        int j1 = 0;
        while (j1 < this.mapIndices1.length) {
            if (this.mapIndices1[j1] == i1) {
                if (i != 0) return this.mapIndices3[j1];
                return this.mapIndices2[j1];
            }
            ++j1;
        }
        return -1;
    }

    @Override
    public void fetch(int id, int cacheIndex) {
        this.loadMandatory(cacheIndex - 1, id);
    }

    public void method563(byte byte0, int i, int j) {
        if (this.clientInstance.decompressors[0] == null) {
            return;
        }
        if (this.versions[i][j] == 0) {
            return;
        }
        this.clientInstance.decompressors[i + 1].getBytes(j);
        this.fileStatus[i][j] = byte0;
        if (byte0 > this.anInt1332) {
            this.anInt1332 = byte0;
        }
        ++this.totalFiles;
    }

    public boolean method564(int i) {
        int k = 0;
        while (k < this.mapIndices1.length) {
            if (this.mapIndices3[k] == i) {
                return true;
            }
            ++k;
        }
        return false;
    }

    private void handleFailed() {
        this.uncompletedCount = 0;
        this.completedCount = 0;
        OnDemandData onDemandData = (OnDemandData)this.requested.reverseGetFirst();
        while (onDemandData != null) {
            if (onDemandData.incomplete) {
                ++this.uncompletedCount;
                System.out.println("Error: model is incomplete or missing  [ type = " + onDemandData.dataType + "]  [id = " + onDemandData.ID + "]");
            } else {
                ++this.completedCount;
            }
            onDemandData = (OnDemandData)this.requested.reverseGetNext();
        }
        while (this.uncompletedCount < 10) {
            OnDemandData onDemandData_1 = (OnDemandData)this.aClass19_1368.popHead();
            if (onDemandData_1 == null) {
                return;
            }
            try {
                if (this.fileStatus[onDemandData_1.dataType][onDemandData_1.ID] != 0) {
                    ++this.filesLoaded;
                }
                this.fileStatus[onDemandData_1.dataType][onDemandData_1.ID] = 0;
                this.requested.insertHead(onDemandData_1);
                ++this.uncompletedCount;
                this.closeRequest(onDemandData_1);
                this.waiting = true;
                System.out.println("Error: file is missing  [ type = " + onDemandData_1.dataType + "]  [id = " + onDemandData_1.ID + "]");
            }
            catch (Exception _ex) {
                System.out.println("missing: type: " + onDemandData_1.dataType + " ID: " + onDemandData_1.ID);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void method566() {
        NodeList nodeList = this.aClass19_1344;
        synchronized (nodeList) {
            this.aClass19_1344.removeAll();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void checkReceived() {
        OnDemandData onDemandData;
        NodeList nodeList = this.aClass19_1370;
        synchronized (nodeList) {
            onDemandData = (OnDemandData)this.aClass19_1370.popHead();
        }
        while (onDemandData != null) {
            this.waiting = true;
            byte[] abyte0 = null;
            if (this.clientInstance.decompressors[0] != null) {
                if (this.clientInstance.decompressors[onDemandData.dataType + 1] != null && this.clientInstance.decompressors[onDemandData.dataType + 1].getBytes(onDemandData.ID) != null) {
                    abyte0 = this.clientInstance.decompressors[onDemandData.dataType + 1].getBytes(onDemandData.ID);
                } else {
                    System.out.println("Missing file: " + onDemandData.ID + " in index: " + onDemandData.dataType);
                }
            }
            NodeList nodeList2 = this.aClass19_1370;
            synchronized (nodeList2) {
                if (abyte0 == null) {
                    this.aClass19_1368.insertHead(onDemandData);
                } else {
                    onDemandData.buffer = abyte0;
                    NodeList nodeList3 = this.aClass19_1358;
                    synchronized (nodeList3) {
                        this.aClass19_1358.insertHead(onDemandData);
                    }
                }
                onDemandData = (OnDemandData)this.aClass19_1370.popHead();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void method568() {
        block6 : while (this.uncompletedCount == 0) {
            OnDemandData onDemandData;
            if (this.completedCount >= 10) return;
            if (this.anInt1332 == 0) {
                return;
            }
            NodeList nodeList = this.aClass19_1344;
            synchronized (nodeList) {
                onDemandData = (OnDemandData)this.aClass19_1344.popHead();
            }
            while (onDemandData != null) {
                if (this.fileStatus[onDemandData.dataType][onDemandData.ID] != 0) {
                    this.fileStatus[onDemandData.dataType][onDemandData.ID] = 0;
                    this.requested.insertHead(onDemandData);
                    this.closeRequest(onDemandData);
                    this.waiting = true;
                    if (this.filesLoaded < this.totalFiles) {
                        ++this.filesLoaded;
                    }
                    this.statusString = "Loading extra files - " + this.filesLoaded * 100 / this.totalFiles + "%";
                    ++this.completedCount;
                    if (this.completedCount == 10) {
                        return;
                    }
                }
                nodeList = this.aClass19_1344;
                synchronized (nodeList) {
                    onDemandData = (OnDemandData)this.aClass19_1344.popHead();
                }
            }
            int j = 0;
            do {
                byte[] abyte0;
                int k;
                if (j < 4) {
                    abyte0 = this.fileStatus[j];
                    k = abyte0.length;
                } else {
                    --this.anInt1332;
                    continue block6;
                }
                for (int l = 0; l < k; ++l) {
                    if (abyte0[l] != this.anInt1332) continue;
                    abyte0[l] = 0;
                    OnDemandData onDemandData_1 = new OnDemandData();
                    onDemandData_1.dataType = j;
                    onDemandData_1.ID = l;
                    onDemandData_1.incomplete = false;
                    this.requested.insertHead(onDemandData_1);
                    this.closeRequest(onDemandData_1);
                    this.waiting = true;
                    if (this.filesLoaded < this.totalFiles) {
                        ++this.filesLoaded;
                    }
                    this.statusString = "Loading extra files - " + this.filesLoaded * 100 / this.totalFiles + "%";
                    ++this.completedCount;
                    if (this.completedCount != 10) continue;
                    return;
                }
                ++j;
            } while (true);
            break;
        }
        return;
    }

    public boolean method569(int i) {
        if (this.anIntArray1348[i] != 1) return false;
        return true;
    }

    public OnDemandFetcher() {
        new CRC32();
        this.ioBuffer = new byte[500];
        this.fileStatus = new byte[4][];
        this.aClass19_1344 = new NodeList();
        this.running = true;
        this.waiting = false;
        this.aClass19_1358 = new NodeList();
        this.gzipInputBuffer = new byte[465000];
        this.nodeSubList = new NodeSubList();
        this.versions = new int[4][];
        this.aClass19_1368 = new NodeList();
        this.aClass19_1370 = new NodeList();
    }
}


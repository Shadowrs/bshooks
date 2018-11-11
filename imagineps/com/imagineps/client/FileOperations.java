/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.BufferedInputStream
 *  java.io.DataInputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class FileOperations {
    public static final byte[] readFile(String s) {
        return FileOperations.readFile(new File(s));
    }

    public static final byte[] readFile(File file) {
        try {
            int fileSize = (int)file.length();
            byte[] fileData = new byte[fileSize];
            DataInputStream datainputstream = new DataInputStream((InputStream)new BufferedInputStream((InputStream)new FileInputStream(file)));
            datainputstream.readFully(fileData, 0, fileSize);
            datainputstream.close();
            return fileData;
        }
        catch (Exception exception) {
            System.out.println("Error reading file: " + file.getAbsolutePath());
            exception.printStackTrace();
            return null;
        }
    }

    public static final void writeFile(String fileLocation, byte[] fileData) {
        try {
            new File(new File(fileLocation).getParent()).mkdirs();
            FileOutputStream fileoutputstream = new FileOutputStream(fileLocation);
            fileoutputstream.write(fileData, 0, fileData.length);
            fileoutputstream.close();
            return;
        }
        catch (Exception e) {
            System.out.println("Error writing file: " + fileLocation);
            e.printStackTrace();
        }
    }

    public static boolean fileExists(String file) {
        return new File(file).exists();
    }
}


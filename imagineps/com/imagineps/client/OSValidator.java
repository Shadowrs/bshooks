/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client;

import java.io.PrintStream;

public class OSValidator {
    private static String OS = System.getProperty((String)"os.name").toLowerCase();

    public static void main() {
        System.out.println(OS);
        if (OSValidator.isWindows()) {
            System.out.println("This is Windows");
            return;
        }
        if (OSValidator.isMac()) {
            System.out.println("This is Mac");
            return;
        }
        if (OSValidator.isUnix()) {
            System.out.println("This is Unix or Linux");
            return;
        }
        if (OSValidator.isSolaris()) {
            System.out.println("This is Solaris");
            return;
        }
        System.out.println("Your OS is not support!!");
    }

    public static boolean isWindows() {
        if (OS.indexOf("win") < 0) return false;
        return true;
    }

    public static boolean isMac() {
        if (OS.indexOf("mac") < 0) return false;
        return true;
    }

    public static boolean isUnix() {
        if (OS.indexOf("nix") >= 0) return true;
        if (OS.indexOf("nux") >= 0) return true;
        if (OS.indexOf("aix") > 0) return true;
        return false;
    }

    public static boolean isSolaris() {
        if (OS.indexOf("sunos") < 0) return false;
        return true;
    }
}


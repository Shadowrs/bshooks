/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package com.imagineps.content;

import java.util.Arrays;

public class Account {
    private String userName;
    private String userPassword;
    private int xPosition;
    private int yPosition;
    private boolean isFemale;
    private int[] equipment = new int[12];

    public Account(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getXPosition() {
        return this.xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return this.yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public String toString() {
        return "Account[userName: " + this.userName + ", userPassword: " + this.userPassword + ", isFemale: " + this.isFemale + ", equipment: " + Arrays.toString((int[])this.equipment) + "]";
    }

    public boolean isFemale() {
        return this.isFemale;
    }

    public void setFemale(boolean isFemale) {
        this.isFemale = isFemale;
    }

    public int[] getEquipment() {
        return this.equipment;
    }

    public void setEquipment(int[] equipment) {
        this.equipment = equipment;
    }
}


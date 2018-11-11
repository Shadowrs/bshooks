/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package afu.org.checkerframework.checker.units;

public class UnitsTools {
    public static final int mPERs2 = 1;
    public static final double rad = 1.0;
    public static final double deg = 1.0;
    public static final int mm2 = 1;
    public static final int m2 = 1;
    public static final int km2 = 1;
    public static final int A = 1;
    public static final int cd = 1;
    public static final int mm = 1;
    public static final int m = 1;
    public static final int km = 1;
    public static final int g = 1;
    public static final int kg = 1;
    public static final int mPERs = 1;
    public static final int kmPERh = 1;
    public static final int mol = 1;
    public static final int K = 1;
    public static final int C = 1;
    public static final int s = 1;
    public static final int min = 1;
    public static final int h = 1;

    public static double toRadians(double angdeg) {
        return Math.toRadians((double)angdeg);
    }

    public static double toDegrees(double angrad) {
        return Math.toDegrees((double)angrad);
    }

    public static int fromMilliMeterToMeter(int mm3) {
        return mm3 / 1000;
    }

    public static int fromMeterToMilliMeter(int m3) {
        return m3 * 1000;
    }

    public static int fromMeterToKiloMeter(int m3) {
        return m3 / 1000;
    }

    public static int fromKiloMeterToMeter(int km3) {
        return km3 * 1000;
    }

    public static int fromGramToKiloGram(int g2) {
        return g2 / 1000;
    }

    public static int fromKiloGramToGram(int kg2) {
        return kg2 * 1000;
    }

    public static double fromMeterPerSecondToKiloMeterPerHour(double mps) {
        return mps * 3.6;
    }

    public static double fromKiloMeterPerHourToMeterPerSecond(double kmph) {
        return kmph / 3.6;
    }

    public static int fromKelvinToCelsius(int k) {
        return k - 273;
    }

    public static int fromCelsiusToKelvin(int c) {
        return c + 273;
    }

    public static int fromSecondToMinute(int s2) {
        return s2 / 60;
    }

    public static int fromMinuteToSecond(int min2) {
        return min2 * 60;
    }

    public static int fromMinuteToHour(int min2) {
        return min2 / 60;
    }

    public static int fromHourToMinute(int h2) {
        return h2 * 60;
    }
}


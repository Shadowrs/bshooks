/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Image
 *  java.awt.image.BufferedImage
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.PrintStream
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Process
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.math.BigDecimal
 *  java.math.RoundingMode
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.text.NumberFormat
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Random
 *  javax.imageio.ImageIO
 */
package com.imagineps.client;

import com.imagineps.client.Configuration;
import com.imagineps.client.particles.ParticleDefinition;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.imageio.ImageIO;

public class Utility {
    public static String formatDigits(int amount) {
        return NumberFormat.getInstance().format((long)amount);
    }

    public static String formatDigits(long amount) {
        return NumberFormat.getInstance().format(amount);
    }

    public static String formatDigits(double amount) {
        return NumberFormat.getInstance().format(amount);
    }

    public static String formatBoolean(boolean flag) {
        if (!flag) return "<col=ED3E3E>Off";
        return "<col=64E838>On";
    }

    public static String booleanPrefix(boolean flag) {
        String string;
        if (flag) {
            string = "<col=4DE024>";
            return "" + string;
        }
        string = "<col=D61E30>";
        return "" + string;
    }

    public static String formatName(String name) {
        if (name.length() <= 0) return name;
        char first = name.charAt(0);
        StringBuilder fixed = new StringBuilder("" + Character.toUpperCase((char)first));
        int index = 1;
        while (index < name.length()) {
            char character = name.charAt(index);
            if (character == '_' || character == ' ') {
                character = ' ';
                fixed.append(character);
                if (index + 1 < name.length() && name.charAt(index + 1) >= 'a' && name.charAt(index + 1) <= 'z') {
                    fixed.append(Character.toUpperCase((char)name.charAt(index + 1)));
                    ++index;
                }
            } else {
                fixed.append(character);
            }
            ++index;
        }
        return fixed.toString();
    }

    public static String getRank(int rank) {
        switch (rank) {
            case 0: {
                return "Donator";
            }
            case 1: {
                return "Super Donator";
            }
            case 2: {
                return "Extreme Donator";
            }
            case 12: {
                return "Legendary Donator";
            }
            case 19: {
                return "Divine Donator";
            }
            case 20: {
                return "V.I.P";
            }
            case 9: {
                return "Sponsor";
            }
            case 5: {
                return "Moderator";
            }
            case 11: {
                return "Veteran";
            }
            case 8: {
                return "Youtuber";
            }
            case 4: {
                return "Support";
            }
            case 6: {
                return "Administrator";
            }
            case 7: {
                return "Developer";
            }
            case 13: {
                return "Ironman";
            }
            case 14: {
                return "Hardcore Ironman";
            }
            case 17: {
                return "Elite";
            }
        }
        return "Player";
    }

    public static String getDropColor(int type) {
        if (!Configuration.ITEM_RARITY_COLOR) {
            return "<col=FF9040>";
        }
        if (type == 0) {
            return "<col=FF9040>";
        }
        if (type == 1) {
            return "<col=ed322f>";
        }
        if (type != 2) return "<col=FF9040>";
        return "<col=1f81dd>";
    }

    public static int dropColor(int type) {
        if (!Configuration.ITEM_RARITY_COLOR) {
            return 16777215;
        }
        if (type == 0) {
            return 16777215;
        }
        if (type == 1) {
            return 15544879;
        }
        if (type != 2) return 16777215;
        return 2064861;
    }

    public static int getProgressColor(int percent) {
        if (percent <= 15) {
            return 8421504;
        }
        if (percent <= 45) {
            return 8355584;
        }
        if (percent <= 65) {
            return 10066176;
        }
        if (percent <= 75) {
            return 11710976;
        }
        if (percent > 90) return 31744;
        return 32512;
    }

    public static int getPrefix(boolean flag) {
        if (!flag) return 15547966;
        return 6613048;
    }

    public static String getDate() {
        return new SimpleDateFormat("EE MMM dd yyyy").format(new Date());
    }

    public static String getTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
        return dateFormat.format(new Date());
    }

    public static String getTime(long period) {
        return new SimpleDateFormat("m:ss").format((Object)(System.currentTimeMillis() - period));
    }

    public static boolean staff(int right) {
        if (right <= 0) return false;
        if (right >= 5) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String capitalizeSentence(String string) {
        StringBuilder sb = new StringBuilder(string);
        try {
            boolean capitalize = true;
            for (int pos = 0; pos < sb.length(); ++pos) {
                if (sb.charAt(pos) == '.') {
                    capitalize = true;
                    continue;
                }
                if (!capitalize || Character.isWhitespace((char)sb.charAt(pos))) continue;
                sb.setCharAt(pos, Character.toUpperCase((char)sb.charAt(pos)));
                capitalize = false;
            }
            String string2 = sb.toString();
            return string2;
        }
        finally {
            sb.setLength(0);
            sb = null;
        }
    }

    public static boolean validConnection() {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection conn = url.openConnection();
            conn.connect();
            return true;
        }
        catch (MalformedURLException e) {
            throw new RuntimeException((Throwable)e);
        }
        catch (IOException e) {
            return false;
        }
    }

    public static void reporterror(String s) {
        System.err.println("Error: " + s);
    }

    public static String getAOrAn(String nextWord) {
        String s = "a";
        char c = nextWord.toUpperCase().charAt(0);
        if (c == 'A') return "an";
        if (c == 'E') return "an";
        if (c == 'I') return "an";
        if (c == 'O') return "an";
        if (c != 'U') return s;
        return "an";
    }

    public static final String intToKOrMilLongName(int i) {
        String s = "" + i;
        for (int k = s.length() - 3; k > 0; k -= 3) {
            s = s.substring(0, k) + "," + s.substring(k);
        }
        if (s.length() > 8) {
            s = "<col=475154>" + s.substring(0, s.length() - 8) + " million <col=ffffff>(" + s + ")";
            return " " + s;
        }
        if (s.length() <= 4) return " " + s;
        s = "<col=65535>" + s.substring(0, s.length() - 4) + "K <col=ffffff>(" + s + ")";
        return " " + s;
    }

    public static final String methodR(int j) {
        if (j >= 0 && j < 10000) {
            return "" + j;
        }
        if (j >= 10000 && j < 10000000) {
            return "" + j / 1000 + "K";
        }
        if (j >= 10000000 && j < 999999999) {
            return "" + j / 1000000 + "M";
        }
        if (j < 999999999) return "?";
        return "*";
    }

    public static String getFileNameWithoutExtension(String fileName) {
        File tmpFile = new File(fileName);
        tmpFile.getName();
        int whereDot = tmpFile.getName().lastIndexOf(46);
        if (0 >= whereDot) return "";
        if (whereDot > tmpFile.getName().length() - 2) return "";
        return tmpFile.getName().substring(0, whereDot);
    }

    public static Image loadURLImage(String name) {
        BufferedImage img = new BufferedImage(1, 1, 2);
        try {
            return ImageIO.read((URL)new URL(name));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return img;
    }

    public static void launchURL(String url) {
        String osName = System.getProperty((String)"os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class fileMgr = Class.forName((String)"com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[]{String.class});
                openURL.invoke((Object)null, new Object[]{url});
                return;
            }
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
                return;
            }
            String[] browsers = new String[]{"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
            String browser = null;
            for (int count = 0; count < browsers.length && browser == null; ++count) {
                if (Runtime.getRuntime().exec(new String[]{"which", browsers[count]}).waitFor() != 0) continue;
                browser = browsers[count];
            }
            if (browser == null) {
                throw new Exception("Could not find web browser");
            }
            Runtime.getRuntime().exec(new String[]{browser, url});
            return;
        }
        catch (Exception e) {
            System.out.println("Failed to open URL.");
        }
    }

    public static String getFormattedTime(int time) {
        String string;
        int seconds = time / 50;
        if (seconds < 60) {
            return "0:" + seconds + "";
        }
        int mins = seconds / 60;
        int remainderSecs = seconds - mins * 60;
        if (mins < 60) {
            String string2;
            if (remainderSecs < 10) {
                string2 = "0";
                return "" + mins + ":" + string2 + remainderSecs + "";
            }
            string2 = "";
            return "" + mins + ":" + string2 + remainderSecs + "";
        }
        int hours = mins / 60;
        int remainderMins = mins - hours * 60;
        String string3 = hours < 10 ? "0" : "";
        String string4 = remainderMins < 10 ? "0" : "";
        if (remainderSecs < 10) {
            string = "0";
            return string3 + hours + "h " + string4 + remainderMins + "m " + string + remainderSecs + "s";
        }
        string = "";
        return string3 + hours + "h " + string4 + remainderMins + "m " + string + remainderSecs + "s";
    }

    public static String[] getTweets(String username, int count) {
        try {
            URL url = new URL("http://api.twitter.com/1/statuses/user_timeline/" + username + ".xml?count=" + count);
            BufferedReader in = new BufferedReader((Reader)new InputStreamReader(url.openStream()));
            String line = "";
            String[] tweets = new String[count];
            int index = 0;
            while ((line = in.readLine()) != null) {
                if (!line.contains((CharSequence)"<text>") || index >= count) continue;
                line = line.replace((CharSequence)"<text>", (CharSequence)"");
                line = line.replace((CharSequence)"</text>", (CharSequence)"");
                tweets[index] = line = line.replace((CharSequence)"    ", (CharSequence)"");
                ++index;
            }
            in.close();
            if (tweets[0] != null) {
                if (index != 0) return tweets;
            }
            tweets[0] = "There are no tweets!";
            return tweets;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void deleteFile(File directory) {
        if (!directory.isDirectory()) return;
        File[] arrfile = directory.listFiles();
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            File file = arrfile[n2];
            if (!file.getName().equalsIgnoreCase("Character")) {
                file.delete();
            }
            ++n2;
        }
    }

    public static String getCurrentVersion(String url) {
        try {
            BufferedReader br = new BufferedReader((Reader)new InputStreamReader((InputStream)new FileInputStream(url)));
            String version = br.readLine();
            br.close();
            return version;
        }
        catch (Exception e) {
            return "0.1";
        }
    }

    public static String getNewestVersion(String url) {
        try {
            URL tmp = new URL(url);
            BufferedReader br = new BufferedReader((Reader)new InputStreamReader(tmp.openStream()));
            return br.readLine();
        }
        catch (Exception e) {
            return "-1";
        }
    }

    public static int random(int bound) {
        return Utility.random(0, bound, false);
    }

    public static int random(int lowerBound, int upperBound) {
        return Utility.random(lowerBound, upperBound, false);
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static int random(int lowerBound, int upperBound, boolean inclusive) {
        int n;
        if (lowerBound >= upperBound) {
            throw new IllegalArgumentException("The lower bound cannot be larger than or equal to the upper bound!");
        }
        if (inclusive) {
            n = 1;
            return lowerBound + ParticleDefinition.RANDOM.nextInt(upperBound - lowerBound) + n;
        }
        n = 0;
        return lowerBound + ParticleDefinition.RANDOM.nextInt(upperBound - lowerBound) + n;
    }

    public static <T> T randomElement(T[] array) {
        return array[(int)(ParticleDefinition.RANDOM.nextDouble() * (double)array.length)];
    }
}


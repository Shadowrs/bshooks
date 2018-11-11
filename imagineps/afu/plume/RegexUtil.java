/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  java.util.regex.PatternSyntaxException
 */
package afu.plume;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class RegexUtil {
    private RegexUtil() {
        throw new Error("do not instantiate");
    }

    public static boolean isRegex(String s2) {
        return RegexUtil.isRegex(s2, 0);
    }

    public static boolean isRegex(String s2, int groups) {
        Pattern p;
        try {
            p = Pattern.compile((String)s2);
        }
        catch (PatternSyntaxException e) {
            return false;
        }
        if (RegexUtil.getGroupCount(p) < groups) return false;
        return true;
    }

    public static boolean isRegex(char c) {
        return RegexUtil.isRegex(Character.toString((char)c));
    }

    public static String regexError(String s2) {
        return RegexUtil.regexError(s2, 0);
    }

    public static String regexError(String s2, int groups) {
        try {
            Pattern p = Pattern.compile((String)s2);
            int actualGroups = RegexUtil.getGroupCount(p);
            if (actualGroups >= groups) return null;
            return RegexUtil.regexErrorMessage(s2, groups, actualGroups);
        }
        catch (PatternSyntaxException e) {
            return e.getMessage();
        }
    }

    public static PatternSyntaxException regexException(String s2) {
        return RegexUtil.regexException(s2, 0);
    }

    public static PatternSyntaxException regexException(String s2, int groups) {
        try {
            Pattern p = Pattern.compile((String)s2);
            int actualGroups = RegexUtil.getGroupCount(p);
            if (actualGroups >= groups) return null;
            return new PatternSyntaxException(RegexUtil.regexErrorMessage(s2, groups, actualGroups), s2, -1);
        }
        catch (PatternSyntaxException pse) {
            return pse;
        }
    }

    public static String asRegex(String s2) {
        return RegexUtil.asRegex(s2, 0);
    }

    public static String asRegex(String s2, int groups) {
        try {
            Pattern p = Pattern.compile((String)s2);
            int actualGroups = RegexUtil.getGroupCount(p);
            if (actualGroups >= groups) return s2;
            throw new Error(RegexUtil.regexErrorMessage(s2, groups, actualGroups));
        }
        catch (PatternSyntaxException e) {
            throw new Error((Throwable)e);
        }
    }

    private static String regexErrorMessage(String s2, int expectedGroups, int actualGroups) {
        return "regex \"" + s2 + "\" has " + actualGroups + " groups, but " + expectedGroups + " groups are needed.";
    }

    private static int getGroupCount(Pattern p) {
        return p.matcher((CharSequence)"").groupCount();
    }

    public static class CheckedPatternSyntaxException
    extends Exception {
        private static final long serialVersionUID = 6266881831979001480L;
        private final PatternSyntaxException pse;

        public CheckedPatternSyntaxException(PatternSyntaxException pse) {
            this.pse = pse;
        }

        public CheckedPatternSyntaxException(String desc, String regex, int index) {
            this(new PatternSyntaxException(desc, regex, index));
        }

        public String getDescription() {
            return this.pse.getDescription();
        }

        public int getIndex() {
            return this.pse.getIndex();
        }

        public String getMessage() {
            return this.pse.getMessage();
        }

        public String getPattern() {
            return this.pse.getPattern();
        }
    }

}


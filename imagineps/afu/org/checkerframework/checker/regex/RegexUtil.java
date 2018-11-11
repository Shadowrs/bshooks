/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  afu.org.checkerframework.checker.regex.qual.Regex
 *  afu.org.checkerframework.dataflow.qual.Pure
 *  afu.org.checkerframework.dataflow.qual.SideEffectFree
 *  afu.org.checkerframework.framework.qual.EnsuresQualifierIf
 *  afu.org.checkerframework.framework.qual.EnsuresQualifiersIf
 *  java.lang.AssertionError
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
package afu.org.checkerframework.checker.regex;

import afu.org.checkerframework.checker.regex.qual.Regex;
import afu.org.checkerframework.dataflow.qual.Pure;
import afu.org.checkerframework.dataflow.qual.SideEffectFree;
import afu.org.checkerframework.framework.qual.EnsuresQualifierIf;
import afu.org.checkerframework.framework.qual.EnsuresQualifiersIf;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexUtil {
    private RegexUtil() {
        throw new AssertionError((Object)"Class RegexUtil shouldn't be instantiated");
    }

    @Pure
    @EnsuresQualifiersIf(value={@EnsuresQualifierIf(result=true, expression={"#1"}, qualifier=Regex.class)})
    public static boolean isRegex(String s) {
        return RegexUtil.isRegex(s, 0);
    }

    @Pure
    public static boolean isRegex(String s, int groups) {
        Pattern p;
        try {
            p = Pattern.compile((String)s);
        }
        catch (PatternSyntaxException e) {
            return false;
        }
        if (RegexUtil.getGroupCount(p) < groups) return false;
        return true;
    }

    @Pure
    @EnsuresQualifiersIf(value={@EnsuresQualifierIf(result=true, expression={"#1"}, qualifier=Regex.class)})
    public static boolean isRegex(char c) {
        return RegexUtil.isRegex(Character.toString((char)c));
    }

    @SideEffectFree
    public static String regexError(String s) {
        return RegexUtil.regexError(s, 0);
    }

    @SideEffectFree
    public static String regexError(String s, int groups) {
        try {
            Pattern p = Pattern.compile((String)s);
            int actualGroups = RegexUtil.getGroupCount(p);
            if (actualGroups >= groups) return null;
            return RegexUtil.regexErrorMessage(s, groups, actualGroups);
        }
        catch (PatternSyntaxException e) {
            return e.getMessage();
        }
    }

    @SideEffectFree
    public static PatternSyntaxException regexException(String s) {
        return RegexUtil.regexException(s, 0);
    }

    @SideEffectFree
    public static PatternSyntaxException regexException(String s, int groups) {
        try {
            Pattern p = Pattern.compile((String)s);
            int actualGroups = RegexUtil.getGroupCount(p);
            if (actualGroups >= groups) return null;
            return new PatternSyntaxException(RegexUtil.regexErrorMessage(s, groups, actualGroups), s, -1);
        }
        catch (PatternSyntaxException pse) {
            return pse;
        }
    }

    @SideEffectFree
    public static String asRegex(String s) {
        return RegexUtil.asRegex(s, 0);
    }

    @SideEffectFree
    public static String asRegex(String s, int groups) {
        try {
            Pattern p = Pattern.compile((String)s);
            int actualGroups = RegexUtil.getGroupCount(p);
            if (actualGroups >= groups) return s;
            throw new Error(RegexUtil.regexErrorMessage(s, groups, actualGroups));
        }
        catch (PatternSyntaxException e) {
            throw new Error((Throwable)e);
        }
    }

    private static String regexErrorMessage(String s, int expectedGroups, int actualGroups) {
        return "regex \"" + s + "\" has " + actualGroups + " groups, but " + expectedGroups + " groups are needed.";
    }

    @Pure
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


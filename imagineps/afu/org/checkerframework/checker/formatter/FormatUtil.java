/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  afu.org.checkerframework.checker.formatter.qual.ConversionCategory
 *  afu.org.checkerframework.checker.formatter.qual.ReturnsFormat
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.IllegalFormatConversionException
 *  java.util.IllegalFormatException
 *  java.util.MissingFormatArgumentException
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package afu.org.checkerframework.checker.formatter;

import afu.org.checkerframework.checker.formatter.qual.ConversionCategory;
import afu.org.checkerframework.checker.formatter.qual.ReturnsFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatException;
import java.util.MissingFormatArgumentException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtil {
    private static final String formatSpecifier = "%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])";
    private static Pattern fsPattern = Pattern.compile((String)"%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])");

    @ReturnsFormat
    public static /* varargs */ String asFormat(String format, ConversionCategory ... cc) throws IllegalFormatException {
        ConversionCategory[] fcc = FormatUtil.formatParameterCategories(format);
        if (fcc.length != cc.length) {
            throw new ExcessiveOrMissingFormatArgumentException(cc.length, fcc.length);
        }
        int i = 0;
        while (i < cc.length) {
            if (cc[i] != fcc[i]) {
                throw new IllegalFormatConversionCategoryException(cc[i], fcc[i]);
            }
            ++i;
        }
        return format;
    }

    public static void tryFormatSatisfiability(String format) throws IllegalFormatException {
        String.format((String)format, (Object[])null);
    }

    /*
     * Unable to fully structure code
     */
    public static ConversionCategory[] formatParameterCategories(String format) throws IllegalFormatException {
        FormatUtil.tryFormatSatisfiability(format);
        last = -1;
        lasto = -1;
        maxindex = -1;
        cs = FormatUtil.parse(format);
        conv = new HashMap();
        for (Conversion c : cs) {
            index = c.index();
            switch (index) {
                case -1: {
                    ** break;
                }
                case 0: {
                    last = ++lasto;
                    ** break;
                }
            }
            last = index - 1;
lbl16: // 3 sources:
            maxindex = Math.max((int)maxindex, (int)last);
            conv.put((Object)last, (Object)ConversionCategory.intersect((ConversionCategory)(conv.containsKey((Object)last) != false ? (ConversionCategory)conv.get((Object)last) : ConversionCategory.UNUSED), (ConversionCategory)c.category()));
        }
        res = new ConversionCategory[maxindex + 1];
        i = 0;
        while (i <= maxindex) {
            res[i] = conv.containsKey((Object)i) != false ? (ConversionCategory)conv.get((Object)i) : ConversionCategory.UNUSED;
            ++i;
        }
        return res;
    }

    private static int indexFromFormat(Matcher m) {
        String s = m.group(1);
        if (s != null) {
            return Integer.parseInt((String)s.substring(0, s.length() - 1));
        }
        if (m.group(2) == null) return 0;
        if (!m.group(2).contains((CharSequence)String.valueOf((char)'<'))) return 0;
        return -1;
    }

    private static char conversionCharFromFormat(Matcher m) {
        String dt = m.group(5);
        if (dt != null) return dt.charAt(0);
        return m.group(6).charAt(0);
    }

    private static Conversion[] parse(String format) {
        ArrayList cs = new ArrayList();
        Matcher m = fsPattern.matcher((CharSequence)format);
        block3 : while (m.find()) {
            char c = FormatUtil.conversionCharFromFormat(m);
            switch (c) {
                case '%': 
                case 'n': {
                    continue block3;
                }
            }
            cs.add((Object)new Conversion(c, FormatUtil.indexFromFormat(m)));
        }
        return (Conversion[])cs.toArray((Object[])new Conversion[cs.size()]);
    }

    public static class IllegalFormatConversionCategoryException
    extends IllegalFormatConversionException {
        private static final long serialVersionUID = 17000126L;
        private final ConversionCategory expected;
        private final ConversionCategory found;

        public IllegalFormatConversionCategoryException(ConversionCategory expected, ConversionCategory found) {
            super(expected.chars.length() == 0 ? '-' : (char)expected.chars.charAt(0), found.types == null ? Object.class : found.types[0]);
            this.expected = expected;
            this.found = found;
        }

        public ConversionCategory getExpected() {
            return this.expected;
        }

        public ConversionCategory getFound() {
            return this.found;
        }

        public String getMessage() {
            return String.format((String)"Expected category %s but found %s.", (Object[])new Object[]{this.expected, this.found});
        }
    }

    public static class ExcessiveOrMissingFormatArgumentException
    extends MissingFormatArgumentException {
        private static final long serialVersionUID = 17000126L;
        private final int expected;
        private final int found;

        public ExcessiveOrMissingFormatArgumentException(int expected, int found) {
            super("-");
            this.expected = expected;
            this.found = found;
        }

        public int getExpected() {
            return this.expected;
        }

        public int getFound() {
            return this.found;
        }

        public String getMessage() {
            return String.format((String)"Expected %d arguments but found %d.", (Object[])new Object[]{this.expected, this.found});
        }
    }

    private static class Conversion {
        private final int index;
        private final ConversionCategory cath;

        public Conversion(char c, int index) {
            this.index = index;
            this.cath = ConversionCategory.fromConversionChar((char)c);
        }

        int index() {
            return this.index;
        }

        ConversionCategory category() {
            return this.cath;
        }
    }

}


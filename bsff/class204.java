import java.util.Calendar;
import java.util.TimeZone;

public class class204 {
   public static String[][] field2608 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
   public static String[] field2607 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   public static Calendar field2609;
   static int[] field2613;

   static {
      Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
      field2609 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }
}

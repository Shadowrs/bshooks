import java.util.Comparator;

public class class149 implements Comparator {
   static int field2123;
   boolean field2122;

   public class149(boolean var1) {
      this.field2122 = var1;
   }

   int method3118(class301 var1, class301 var2, int var3) {
      return this.field2122 ? var1.field3839 - var2.field3839 : var2.field3839 - var1.field3839;
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method3118((class301)var1, (class301)var2, -180636979);
   }

   public static String method3123(CharSequence var0, int var1) {
      String var2 = class82.method1798(class259.method4543(var0, -1681793276));
      if (var2 == null) {
         var2 = "";
      }

      return var2;
   }
}

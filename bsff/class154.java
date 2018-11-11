public class class154 extends class297 {
   public static class261 field2136;
   public static boolean field2134;
   boolean field2135;

   public class154(boolean var1) {
      this.field2135 = var1;
   }

   int method3159(class301 var1, class301 var2, int var3) {
      if (var1.field3840 != 0) {
         if (var2.field3840 == 0) {
            return this.field2135 ? -1 : 1;
         }
      } else if (var2.field3840 != 0) {
         return this.field2135 ? 1 : -1;
      }

      return this.method5288(var1, var2, -272103064);
   }

   public int compare(Object var1, Object var2) {
      return this.method3159((class301)var1, (class301)var2, -1898531544);
   }

   public static void method3158(class261 var0, int var1) {
      class271.field3483 = var0;
   }
}

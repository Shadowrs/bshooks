public class class183 {
   public static class183 field2484 = new class183(2);
   public static class183 field2489 = new class183(4);
   public static class183 field2482 = new class183(7);
   public static class183 field2490 = new class183(4);
   public static class183 field2481 = new class183(6);
   public static class183 field2485 = new class183(15);
   public static class183 field2486 = new class183(5);
   public static class183 field2487 = new class183(14);
   public static class183 field2488 = new class183(5);
   public static class183 field2483 = new class183(3);
   static int[] field2480;

   class183(int var1) {
   }

   public static int method3426(CharSequence var0, byte var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + class70.method1133(var0.charAt(var4), -813664787);
      }

      return var3;
   }
}

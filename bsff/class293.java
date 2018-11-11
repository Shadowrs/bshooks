public class class293 {
   public static class293 field3793 = new class293("9", "9");
   public static class293 field3804 = new class293("13", "13");
   public static class293 field3805 = new class293("5", "5");
   public static class293 field3800 = new class293("11", "11");
   public static class293 field3806 = new class293("2", "2");
   public static class293 field3797 = new class293("14", "14");
   public static class293 field3802 = new class293("10", "10");
   public static class293 field3794 = new class293("12", "12");
   public static class293 field3795 = new class293("4", "4");
   public static class293 field3796 = new class293("16", "16");
   public static class293 field3801 = new class293("6", "6");
   public static class293 field3807 = new class293("1", "1");
   public static class293 field3803 = new class293("7", "7");
   public static class293 field3792 = new class293("15", "15");
   public static class293 field3798 = new class293("3", "3");
   public static class293 field3799 = new class293("8", "8");
   public String field3808;

   class293(String var1, String var2) {
      this.field3808 = var2;
   }

   static class331[] method5208(class261 var0, int var1, int var2, byte var3) {
      if (!class288.method5204(var0, var1, var2, (byte)70)) {
         return null;
      } else {
         class331[] var4 = new class331[class12.field263];

         for(int var5 = 0; var5 < class12.field263; ++var5) {
            class331 var6 = var4[var5] = new class331();
            var6.field3982 = class332.field3991;
            var6.field3984 = class81.field1280;
            var6.field3980 = class54.field633[var5];
            var6.field3977 = class332.field3990[var5];
            var6.field3978 = class25.field358[var5];
            var6.field3979 = class332.field3989[var5];
            int var7 = var6.field3979 * var6.field3978;
            byte[] var8 = class332.field3993[var5];
            var6.field3986 = new int[var7];

            for(int var9 = 0; var9 < var7; ++var9) {
               var6.field3986[var9] = class332.field3992[var8[var9] & 255];
            }
         }

         class259.method4544(-1796536325);
         return var4;
      }
   }
}

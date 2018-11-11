public class class20 {
   static class331[] field317;
   public static int field319;

   static final void method169(class330 var0, int var1) {
      short var2 = 256;

      int var3;
      for(var3 = 0; var3 < class4.field30.length; ++var3) {
         class4.field30[var3] = 0;
      }

      int var4;
      for(var3 = 0; var3 < 5000; ++var3) {
         var4 = (int)(Math.random() * 128.0D * (double)var2);
         class4.field30[var4] = (int)(Math.random() * 256.0D);
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var4 = 1; var4 < var2 - 1; ++var4) {
            for(var5 = 1; var5 < 127; ++var5) {
               var6 = var5 + (var4 << 7);
               class5.field34[var6] = (class4.field30[var6 + 128] + class4.field30[var6 - 128] + class4.field30[var6 + 1] + class4.field30[var6 - 1]) / 4;
            }
         }

         int[] var7 = class4.field30;
         class4.field30 = class5.field34;
         class5.field34 = var7;
      }

      if (var0 != null) {
         var3 = 0;

         for(var4 = 0; var4 < var0.field3972; ++var4) {
            for(var5 = 0; var5 < var0.field3971; ++var5) {
               if (var0.field3973[var3++] != 0) {
                  var6 = var5 + var0.field3969 + 16;
                  int var9 = var4 + var0.field3976 + 16;
                  int var8 = var6 + (var9 << 7);
                  class4.field30[var8] = 0;
               }
            }
         }
      }

   }

   static class70 method170(int var0, short var1) {
      return (class70)class95.field1432.method3907((long)var0);
   }
}

public class class197 {
   static int[] field2589 = new int[2048];
   static int[] field2590 = new int[2048];

   static final void method3754(int var0, int var1) {
      short var2 = 256;
      class90.field1349 += var0 * 128;
      int var3;
      if (class90.field1349 > class4.field30.length) {
         class90.field1349 -= class4.field30.length;
         var3 = (int)(Math.random() * 12.0D);
         class20.method169(class90.field1347[var3], 1209692311);
      }

      var3 = 0;
      int var4 = var0 * 128;
      int var5 = (var2 - var0) * 128;

      int var6;
      int var7;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = class90.field1362[var4 + var3] - var0 * class4.field30[var3 + class90.field1349 & class4.field30.length - 1] / 6;
         if (var7 < 0) {
            var7 = 0;
         }

         class90.field1362[var3++] = var7;
      }

      int var8;
      int var9;
      for(var6 = var2 - var0; var6 < var2; ++var6) {
         var7 = var6 * 128;

         for(var8 = 0; var8 < 128; ++var8) {
            var9 = (int)(Math.random() * 100.0D);
            if (var9 < 50 && var8 > 10 && var8 < 118) {
               class90.field1362[var7 + var8] = 255;
            } else {
               class90.field1362[var7 + var8] = 0;
            }
         }
      }

      if (class90.field1346 > 0) {
         class90.field1346 -= var0 * 4;
      }

      if (class90.field1357 > 0) {
         class90.field1357 -= var0 * 4;
      }

      if (class90.field1346 == 0 && class90.field1357 == 0) {
         var6 = (int)(Math.random() * (double)(2000 / var0));
         if (var6 == 0) {
            class90.field1346 = 1024;
         }

         if (var6 == 1) {
            class90.field1357 = 1024;
         }
      }

      for(var6 = 0; var6 < var2 - var0; ++var6) {
         class90.field1360[var6] = class90.field1360[var0 + var6];
      }

      for(var6 = var2 - var0; var6 < var2; ++var6) {
         class90.field1360[var6] = (int)(Math.sin((double)class90.field1352 / 14.0D) * 16.0D + Math.sin((double)class90.field1352 / 15.0D) * 14.0D + Math.sin((double)class90.field1352 / 16.0D) * 12.0D);
         ++class90.field1352;
      }

      class90.field1365 += var0;
      var6 = (var0 + (client.field866 & 1)) / 2;
      if (var6 > 0) {
         for(var7 = 0; var7 < class90.field1365 * 100; ++var7) {
            var8 = (int)(Math.random() * 124.0D) + 2;
            var9 = (int)(Math.random() * 128.0D) + 128;
            class90.field1362[var8 + (var9 << 7)] = 192;
         }

         class90.field1365 = 0;

         int var10;
         for(var7 = 0; var7 < var2; ++var7) {
            var8 = 0;
            var9 = var7 * 128;

            for(var10 = -var6; var10 < 128; ++var10) {
               if (var6 + var10 < 128) {
                  var8 += class90.field1362[var9 + var10 + var6];
               }

               if (var10 - (var6 + 1) >= 0) {
                  var8 -= class90.field1362[var10 + var9 - (var6 + 1)];
               }

               if (var10 >= 0) {
                  class164.field2181[var10 + var9] = var8 / (var6 * 2 + 1);
               }
            }
         }

         for(var7 = 0; var7 < 128; ++var7) {
            var8 = 0;

            for(var9 = -var6; var9 < var2; ++var9) {
               var10 = var9 * 128;
               if (var9 + var6 < var2) {
                  var8 += class164.field2181[var7 + var10 + var6 * 128];
               }

               if (var9 - (var6 + 1) >= 0) {
                  var8 -= class164.field2181[var10 + var7 - (var6 + 1) * 128];
               }

               if (var9 >= 0) {
                  class90.field1362[var7 + var10] = var8 / (var6 * 2 + 1);
               }
            }
         }
      }

   }

   public static void method3753(class261 var0, int var1) {
      class267.field3438 = var0;
   }

   static {
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field2589[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
         field2590[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
      }

   }
}

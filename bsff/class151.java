public class class151 extends class297 {
   static class263 field2128;
   static class330 field2127;
   boolean field2126;

   public class151(boolean var1) {
      this.field2126 = var1;
   }

   int method3135(class301 var1, class301 var2, byte var3) {
      if (client.field857 == var1.field3840) {
         if (var2.field3840 != client.field857) {
            return this.field2126 ? -1 : 1;
         }
      } else if (var2.field3840 == client.field857) {
         return this.field2126 ? 1 : -1;
      }

      return this.method5288(var1, var2, -2014309815);
   }

   public int compare(Object var1, Object var2) {
      return this.method3135((class301)var1, (class301)var2, (byte)-27);
   }

   static final void method3140(int var0) {
      short var1 = 256;
      int var2;
      if (class90.field1346 > 0) {
         for(var2 = 0; var2 < 256; ++var2) {
            if (class90.field1346 > 768) {
               class92.field1408[var2] = class98.method2023(class38.field489[var2], class7.field231[var2], 1024 - class90.field1346, (byte)4);
            } else if (class90.field1346 > 256) {
               class92.field1408[var2] = class7.field231[var2];
            } else {
               class92.field1408[var2] = class98.method2023(class7.field231[var2], class38.field489[var2], 256 - class90.field1346, (byte)4);
            }
         }
      } else if (class90.field1357 > 0) {
         for(var2 = 0; var2 < 256; ++var2) {
            if (class90.field1357 > 768) {
               class92.field1408[var2] = class98.method2023(class38.field489[var2], class36.field480[var2], 1024 - class90.field1357, (byte)4);
            } else if (class90.field1357 > 256) {
               class92.field1408[var2] = class36.field480[var2];
            } else {
               class92.field1408[var2] = class98.method2023(class36.field480[var2], class38.field489[var2], 256 - class90.field1357, (byte)4);
            }
         }
      } else {
         for(var2 = 0; var2 < 256; ++var2) {
            class92.field1408[var2] = class38.field489[var2];
         }
      }

      class327.method5733(class90.field1338, 9, class90.field1338 + 128, var1 + 7);
      class317.field3926.method5868(class90.field1338, 0);
      class327.method5732();
      var2 = 0;
      int var3 = class324.field3941.field3960 * 9 + class90.field1338;

      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var4 = 1; var4 < var1 - 1; ++var4) {
         var5 = class90.field1360[var4] * (var1 - var4) / var1;
         var6 = var5 + 22;
         if (var6 < 0) {
            var6 = 0;
         }

         var2 += var6;

         for(var7 = var6; var7 < 128; ++var7) {
            var8 = class90.field1362[var2++];
            if (var8 != 0) {
               var9 = var8;
               var10 = 256 - var8;
               var8 = class92.field1408[var8];
               var11 = class324.field3941.field3961[var3];
               class324.field3941.field3961[var3++] = ((var11 & 16711935) * var10 + (var8 & 16711935) * var9 & -16711936) + (var9 * (var8 & '\uff00') + var10 * (var11 & '\uff00') & 16711680) >> 8;
            } else {
               ++var3;
            }
         }

         var3 += var6 + class324.field3941.field3960 - 128;
      }

      class327.method5733(class90.field1338 + 765 - 128, 9, class90.field1338 + 765, var1 + 7);
      class61.field715.method5868(class90.field1338 + 382, 0);
      class327.method5732();
      var2 = 0;
      var3 = class324.field3941.field3960 * 9 + class90.field1338 + 637 + 24;

      for(var4 = 1; var4 < var1 - 1; ++var4) {
         var5 = class90.field1360[var4] * (var1 - var4) / var1;
         var6 = 103 - var5;
         var3 += var5;

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = class90.field1362[var2++];
            if (var8 != 0) {
               var9 = var8;
               var10 = 256 - var8;
               var8 = class92.field1408[var8];
               var11 = class324.field3941.field3961[var3];
               class324.field3941.field3961[var3++] = ((var11 & 16711935) * var10 + (var8 & 16711935) * var9 & -16711936) + (var10 * (var11 & '\uff00') + var9 * (var8 & '\uff00') & 16711680) >> 8;
            } else {
               ++var3;
            }
         }

         var2 += 128 - var6;
         var3 += class324.field3941.field3960 - var6 - var5;
      }

   }
}

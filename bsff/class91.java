public final class class91 extends class139 {
   static class165 field1402;
   int field1385;
   boolean field1388 = false;
   int field1397;
   int field1384;
   double field1389;
   double field1394;
   int field1400 = 0;
   int field1379;
   int field1378 = 0;
   int field1381;
   double field1392;
   int field1386;
   double field1393;
   int field1399;
   double field1398;
   double field1395;
   double field1396;
   int field1390;
   int field1383;
   double field1380;
   int field1391;
   int field1387;
   int field1382;
   int field1377;
   class287 field1401;

   class91(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field1385 = var1;
      this.field1399 = var2;
      this.field1397 = var3;
      this.field1379 = var4;
      this.field1390 = var5;
      this.field1383 = var6;
      this.field1384 = var7;
      this.field1391 = var8;
      this.field1386 = var9;
      this.field1387 = var10;
      this.field1382 = var11;
      this.field1388 = false;
      int var12 = class249.method4518(this.field1385, -2115136367).field3494;
      if (var12 != -1) {
         this.field1401 = class202.method3839(var12, (byte)18);
      } else {
         this.field1401 = null;
      }

   }

   protected final class131 vmethod3067(byte var1) {
      class272 var2 = class249.method4518(this.field1385, -1200052445);
      class131 var3 = var2.method4795(this.field1400, -181484998);
      if (var3 == null) {
         return null;
      } else {
         var3.method2756(this.field1381);
         return var3;
      }
   }

   final void method1913(int var1, int var2, int var3, int var4, byte var5) {
      double var6;
      if (!this.field1388) {
         var6 = (double)(var1 - this.field1397);
         double var8 = (double)(var2 - this.field1379);
         double var10 = Math.sqrt(var6 * var6 + var8 * var8);
         this.field1389 = (double)this.field1386 * var6 / var10 + (double)this.field1397;
         this.field1392 = (double)this.field1386 * var8 / var10 + (double)this.field1379;
         this.field1398 = (double)this.field1390;
      }

      var6 = (double)(this.field1384 + 1 - var4);
      this.field1394 = ((double)var1 - this.field1389) / var6;
      this.field1393 = ((double)var2 - this.field1392) / var6;
      this.field1380 = Math.sqrt(this.field1393 * this.field1393 + this.field1394 * this.field1394);
      if (!this.field1388) {
         this.field1395 = -this.field1380 * Math.tan((double)this.field1391 * 0.02454369D);
      }

      this.field1396 = ((double)var3 - this.field1398 - this.field1395 * var6) * 2.0D / (var6 * var6);
   }

   final void method1914(int var1, int var2) {
      this.field1388 = true;
      this.field1389 += this.field1394 * (double)var1;
      this.field1392 += (double)var1 * this.field1393;
      this.field1398 += (double)var1 * this.field1395 + this.field1396 * 0.5D * (double)var1 * (double)var1;
      this.field1395 += this.field1396 * (double)var1;
      this.field1377 = (int)(Math.atan2(this.field1394, this.field1393) * 325.949D) + 1024 & 2047;
      this.field1381 = (int)(Math.atan2(this.field1395, this.field1380) * 325.949D) & 2047;
      if (this.field1401 != null) {
         this.field1378 += var1;

         while(true) {
            do {
               do {
                  if (this.field1378 <= this.field1401.field3763[this.field1400]) {
                     return;
                  }

                  this.field1378 -= this.field1401.field3763[this.field1400];
                  ++this.field1400;
               } while(this.field1400 < this.field1401.field3750.length);

               this.field1400 -= this.field1401.field3754;
            } while(this.field1400 >= 0 && this.field1400 < this.field1401.field3750.length);

            this.field1400 = 0;
         }
      }
   }

   public static int method1916(String var0, int var1) {
      return var0.length() + 1;
   }

   static final void method1921(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      if (var6 < 0) {
         var6 = 0;
      } else if (var6 > 100) {
         var6 = 100;
      }

      int var7 = (client.field1106 - client.field1105) * var6 / 100 + client.field1105;
      int var8 = var3 * var7 * 512 / (var2 * 334);
      int var9;
      int var10;
      short var11;
      if (var8 < client.field1111) {
         var11 = client.field1111;
         var7 = var11 * var2 * 334 / (var3 * 512);
         if (var7 > client.field881) {
            var7 = client.field881;
            var9 = var3 * var7 * 512 / (var11 * 334);
            var10 = (var2 - var9) / 2;
            if (var4) {
               class327.method5732();
               class327.method5810(var0, var1, var10, var3, -16777216);
               class327.method5810(var0 + var2 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if (var8 > client.field1112) {
         var11 = client.field1112;
         var7 = var11 * var2 * 334 / (var3 * 512);
         if (var7 < client.field926) {
            var7 = client.field926;
            var9 = var11 * var2 * 334 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if (var4) {
               class327.method5732();
               class327.method5810(var0, var1, var2, var10, -16777216);
               class327.method5810(var0, var3 + var1 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      var9 = (client.field1108 - client.field876) * var6 / 100 + client.field876;
      client.field1092 = var3 * var7 * var9 / 85504 << 1;
      if (var2 != client.field943 || var3 != client.field906) {
         int[] var12 = new int[9];

         for(int var13 = 0; var13 < 9; ++var13) {
            int var14 = var13 * 32 + 15 + 128;
            int var15 = var14 * 3 + 600;
            int var16 = class134.field1955[var14];
            var12[var13] = var15 * var16 >> 16;
         }

         class137.method3017(var12, 500, 800, var2, var3);
      }

      client.field1113 = var0;
      client.field1114 = var1;
      client.field943 = var2;
      client.field906 = var3;
   }

   static class96 method1920(byte[] var0, byte var1) {
      class96 var2 = new class96();
      class194 var3 = new class194(var0);
      var3.field2565 = var3.field2566.length - 2;
      int var4 = var3.getUShort(-1208216487);
      int var5 = var3.field2566.length - 2 - var4 - 12;
      var3.field2565 = var5;
      int var6 = var3.getInt(-1817376731);
      var2.field1448 = var3.getUShort(-1208216487);
      var2.field1445 = var3.getUShort(-1208216487);
      var2.field1453 = var3.getUShort(-1208216487);
      var2.field1450 = var3.getUShort(-1208216487);
      int var7 = var3.getUByte(737396704);
      int var8;
      int var9;
      if (var7 > 0) {
         var2.field1451 = var2.method2009(var7, 1575567631);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.getUShort(-1208216487);
            class209 var10 = new class209(var9 > 0 ? class140.method3075(var9, (short)-8019) : 1);
            var2.field1451[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.getInt(-1817376731);
               int var12 = var3.getInt(-1817376731);
               var10.method3914(new class223(var12), (long)var11);
            }
         }
      }

      var3.field2565 = 0;
      var3.getString3(1549911515);
      var2.field1444 = new int[var6];
      var2.field1443 = new int[var6];
      var2.field1446 = new String[var6];

      for(var8 = 0; var3.field2565 < var5; var2.field1444[var8++] = var9) {
         var9 = var3.getUShort(-1208216487);
         if (var9 == 3) {
            var2.field1446[var8] = var3.getString1(-778927800);
         } else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
            var2.field1443[var8] = var3.getInt(-1817376731);
         } else {
            var2.field1443[var8] = var3.getUByte(1481474066);
         }
      }

      return var2;
   }
}

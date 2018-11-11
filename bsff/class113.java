public class class113 {
   int field1600 = class104.method2154(8);
   int field1597 = class104.method2154(24);
   int field1598 = class104.method2154(16);
   int field1596 = class104.method2154(24);
   int field1595 = class104.method2154(24) + 1;
   int[] field1601;
   int field1599 = class104.method2154(6) + 1;

   class113() {
      int[] var1 = new int[this.field1599];

      int var2;
      for(var2 = 0; var2 < this.field1599; ++var2) {
         int var3 = 0;
         int var4 = class104.method2154(3);
         boolean var5 = class104.method2146() != 0;
         if (var5) {
            var3 = class104.method2154(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.field1601 = new int[this.field1599 * 8];

      for(var2 = 0; var2 < this.field1599 * 8; ++var2) {
         this.field1601[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? class104.method2154(8) : -1;
      }

   }

   void method2282(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = class104.field1520[this.field1600].field1495;
         int var5 = this.field1597 - this.field1596;
         int var6 = var5 / this.field1595;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = class104.field1520[this.field1600].method2101();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field1599;
                     }

                     var10 /= this.field1599;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field1601[var8 + var11 * 8];
                  if (var12 >= 0) {
                     int var13 = var9 * this.field1595 + this.field1596;
                     class102 var14 = class104.field1520[var12];
                     int var15;
                     if (this.field1598 == 0) {
                        var15 = this.field1595 / var14.field1495;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.method2102();

                           for(int var18 = 0; var18 < var14.field1495; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field1595) {
                           float[] var16 = var14.method2102();

                           for(int var17 = 0; var17 < var14.field1495; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }
      }

   }
}

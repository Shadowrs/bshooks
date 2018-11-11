public class class102 {
   float[][] field1492;
   int field1496;
   int[] field1493;
   int[] field1491;
   int field1495;
   int[] field1494;

   class102() {
      class104.method2154(24);
      this.field1495 = class104.method2154(16);
      this.field1496 = class104.method2154(24);
      this.field1491 = new int[this.field1496];
      boolean var1 = class104.method2146() != 0;
      int var2;
      int var3;
      int var4;
      if (var1) {
         var2 = 0;

         for(var3 = class104.method2154(5) + 1; var2 < this.field1496; ++var3) {
            int var5 = class104.method2154(class15.method99(this.field1496 - var2, -1264538177));

            for(var4 = 0; var4 < var5; ++var4) {
               this.field1491[var2++] = var3;
            }
         }
      } else {
         boolean var15 = class104.method2146() != 0;

         for(var3 = 0; var3 < this.field1496; ++var3) {
            if (var15 && class104.method2146() == 0) {
               this.field1491[var3] = 0;
            } else {
               this.field1491[var3] = class104.method2154(5) + 1;
            }
         }
      }

      this.method2104();
      var2 = class104.method2154(4);
      if (var2 > 0) {
         float var16 = class104.method2127(class104.method2154(32));
         float var6 = class104.method2127(class104.method2154(32));
         var4 = class104.method2154(4) + 1;
         boolean var7 = class104.method2146() != 0;
         int var8;
         if (var2 == 1) {
            var8 = method2112(this.field1496, this.field1495);
         } else {
            var8 = this.field1496 * this.field1495;
         }

         this.field1494 = new int[var8];

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            this.field1494[var9] = class104.method2154(var4);
         }

         this.field1492 = new float[this.field1496][this.field1495];
         float var10;
         int var11;
         int var12;
         if (var2 == 1) {
            for(var9 = 0; var9 < this.field1496; ++var9) {
               var10 = 0.0F;
               var11 = 1;

               for(var12 = 0; var12 < this.field1495; ++var12) {
                  int var13 = var9 / var11 % var8;
                  float var14 = (float)this.field1494[var13] * var6 + var16 + var10;
                  this.field1492[var9][var12] = var14;
                  if (var7) {
                     var10 = var14;
                  }

                  var11 *= var8;
               }
            }
         } else {
            for(var9 = 0; var9 < this.field1496; ++var9) {
               var10 = 0.0F;
               var11 = var9 * this.field1495;

               for(var12 = 0; var12 < this.field1495; ++var12) {
                  float var17 = (float)this.field1494[var11] * var6 + var16 + var10;
                  this.field1492[var9][var12] = var17;
                  if (var7) {
                     var10 = var17;
                  }

                  ++var11;
               }
            }
         }
      }

   }

   int method2101() {
      int var1;
      for(var1 = 0; this.field1493[var1] >= 0; var1 = class104.method2146() != 0 ? this.field1493[var1] : var1 + 1) {
         ;
      }

      return ~this.field1493[var1];
   }

   float[] method2102() {
      return this.field1492[this.method2101()];
   }

   void method2104() {
      int[] var1 = new int[this.field1496];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var3 = 0; var3 < this.field1496; ++var3) {
         var4 = this.field1491[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var10 = var2[var8];
                  if (var10 != var6) {
                     break;
                  }

                  var9 = 1 << 32 - var8;
                  if ((var10 & var9) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var10 | var9;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var10 = var2[var8];
               if (var10 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field1493 = new int[8];
      var10 = 0;

      for(var3 = 0; var3 < this.field1496; ++var3) {
         var4 = this.field1491[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.field1493[var6] == 0) {
                     this.field1493[var6] = var10;
                  }

                  var6 = this.field1493[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.field1493.length) {
                  int[] var11 = new int[this.field1493.length * 2];

                  for(var9 = 0; var9 < this.field1493.length; ++var9) {
                     var11[var9] = this.field1493[var9];
                  }

                  this.field1493 = var11;
               }

               var8 >>>= 1;
            }

            this.field1493[var6] = ~var3;
            if (var6 >= var10) {
               var10 = var6 + 1;
            }
         }
      }

   }

   static int method2112(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var3 = var2;
         int var4 = var1;

         int var5;
         for(var5 = 1; var4 > 1; var4 >>= 1) {
            if ((var4 & 1) != 0) {
               var5 *= var3;
            }

            var3 *= var3;
         }

         int var6;
         if (var4 == 1) {
            var6 = var5 * var3;
         } else {
            var6 = var5;
         }

         if (var6 <= var0) {
            return var2;
         }

         --var2;
      }
   }
}

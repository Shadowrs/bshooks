public class class114 {
   int[][] field1608;
   int field1607;
   int field1602;

   public class114(int var1, int var2) {
      if (var2 != var1) {
         int var3 = var1;
         int var4 = var2;
         if (var2 > var1) {
            var3 = var2;
            var4 = var1;
         }

         int var5;
         while(var4 != 0) {
            var5 = var3 % var4;
            var3 = var4;
            var4 = var5;
         }

         var1 /= var3;
         var2 /= var3;
         this.field1602 = var1;
         this.field1607 = var2;
         this.field1608 = new int[var1][14];

         for(var5 = 0; var5 < var1; ++var5) {
            int[] var6 = this.field1608[var5];
            double var7 = 6.0D + (double)var5 / (double)var1;
            int var9 = (int)Math.floor(1.0D + (var7 - 7.0D));
            if (var9 < 0) {
               var9 = 0;
            }

            int var10 = (int)Math.ceil(7.0D + var7);
            if (var10 > 14) {
               var10 = 14;
            }

            for(double var11 = (double)var2 / (double)var1; var9 < var10; ++var9) {
               double var13 = 3.141592653589793D * ((double)var9 - var7);
               double var15 = var11;
               if (var13 < -1.0E-4D || var13 > 1.0E-4D) {
                  var15 = var11 * (Math.sin(var13) / var13);
               }

               var15 *= 0.54D + 0.46D * Math.cos(((double)var9 - var7) * 0.2243994752564138D);
               var6[var9] = (int)Math.floor(65536.0D * var15 + 0.5D);
            }
         }
      }

   }

   byte[] method2285(byte[] var1, int var2) {
      if (this.field1608 != null) {
         int var3 = (int)((long)var1.length * (long)this.field1607 / (long)this.field1602) + 14;
         int[] var4 = new int[var3];
         int var5 = 0;
         int var6 = 0;

         int var7;
         for(var7 = 0; var7 < var1.length; ++var7) {
            byte var8 = var1[var7];
            int[] var9 = this.field1608[var6];

            int var10;
            for(var10 = 0; var10 < 14; ++var10) {
               var4[var5 + var10] += var8 * var9[var10];
            }

            var6 += this.field1607;
            var10 = var6 / this.field1602;
            var5 += var10;
            var6 -= var10 * this.field1602;
         }

         var1 = new byte[var3];

         for(var7 = 0; var7 < var3; ++var7) {
            int var11 = var4[var7] + '\u8000' >> 16;
            if (var11 < -128) {
               var1[var7] = -128;
            } else if (var11 > 127) {
               var1[var7] = 127;
            } else {
               var1[var7] = (byte)var11;
            }
         }
      }

      return var1;
   }

   int method2286(int var1, short var2) {
      if (this.field1608 != null) {
         var1 = (int)((long)var1 * (long)this.field1607 / (long)this.field1602);
      }

      return var1;
   }

   int method2290(int var1, int var2) {
      if (this.field1608 != null) {
         var1 = (int)((long)var1 * (long)this.field1607 / (long)this.field1602) + 6;
      }

      return var1;
   }

   static int method2295(int var0, int var1, int var2, int var3) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var4;
   }
}

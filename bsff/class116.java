public class class116 {
   static float[][] field1631 = new float[2][8];
   static int[][] field1633 = new int[2][8];
   static float field1626;
   static int field1634;
   int[][][] field1628 = new int[2][2][4];
   int[][][] field1629 = new int[2][2][4];
   int[] field1635 = new int[2];
   int[] field1632 = new int[2];

   float method2450(int var1, int var2, float var3) {
      float var4 = (float)this.field1629[var1][0][var2] + var3 * (float)(this.field1629[var1][1][var2] - this.field1629[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   float method2452(int var1, int var2, float var3) {
      float var4 = (float)this.field1628[var1][0][var2] + var3 * (float)(this.field1628[var1][1][var2] - this.field1628[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method2451(var4);
   }

   int method2469(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.field1635[0] + (float)(this.field1635[1] - this.field1635[0]) * var2;
         var3 *= 0.0030517578F;
         field1626 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field1634 = (int)(field1626 * 65536.0F);
      }

      if (this.field1632[var1] == 0) {
         return 0;
      } else {
         var3 = this.method2450(var1, 0, var2);
         field1631[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method2452(var1, 0, var2));
         field1631[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.field1632[var1]; ++var4) {
            var3 = this.method2450(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method2452(var1, var4, var2));
            float var6 = var3 * var3;
            field1631[var1][var4 * 2 + 1] = field1631[var1][var4 * 2 - 1] * var6;
            field1631[var1][var4 * 2] = field1631[var1][var4 * 2 - 1] * var5 + field1631[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               field1631[var1][var7] += field1631[var1][var7 - 1] * var5 + field1631[var1][var7 - 2] * var6;
            }

            field1631[var1][1] += field1631[var1][0] * var5 + var6;
            field1631[var1][0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.field1632[0] * 2; ++var4) {
               field1631[0][var4] *= field1626;
            }
         }

         for(var4 = 0; var4 < this.field1632[var1] * 2; ++var4) {
            field1633[var1][var4] = (int)(field1631[var1][var4] * 65536.0F);
         }

         return this.field1632[var1] * 2;
      }
   }

   final void method2454(class194 var1, class108 var2) {
      int var3 = var1.getUByte(-2075542895);
      this.field1632[0] = var3 >> 4;
      this.field1632[1] = var3 & 15;
      if (var3 != 0) {
         this.field1635[0] = var1.getUShort(-1208216487);
         this.field1635[1] = var1.getUShort(-1208216487);
         int var4 = var1.getUByte(1409804288);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field1632[var5]; ++var6) {
               this.field1628[var5][0][var6] = var1.getUShort(-1208216487);
               this.field1629[var5][0][var6] = var1.getUShort(-1208216487);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field1632[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field1628[var5][1][var6] = var1.getUShort(-1208216487);
                  this.field1629[var5][1][var6] = var1.getUShort(-1208216487);
               } else {
                  this.field1628[var5][1][var6] = this.field1628[var5][0][var6];
                  this.field1629[var5][1][var6] = this.field1629[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.field1635[1] != this.field1635[0]) {
            var2.method2244(var1);
         }
      } else {
         int[] var7 = this.field1635;
         this.field1635[1] = 0;
         var7[0] = 0;
      }

   }

   static float method2451(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}

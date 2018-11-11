public final class class330 extends class327 {
   public int field3969;
   public int[] field3974;
   public int field3971;
   public int field3975;
   public int field3972;
   public int field3976;
   public int field3970;
   public byte[] field3973;

   public void method5843() {
      if (this.field3971 != this.field3975 || this.field3972 != this.field3970) {
         byte[] var1 = new byte[this.field3975 * this.field3970];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field3972; ++var3) {
            for(int var4 = 0; var4 < this.field3971; ++var4) {
               var1[var4 + (var3 + this.field3976) * this.field3975 + this.field3969] = this.field3973[var2++];
            }
         }

         this.field3973 = var1;
         this.field3971 = this.field3975;
         this.field3972 = this.field3970;
         this.field3969 = 0;
         this.field3976 = 0;
      }

   }

   public void method5842(int var1, int var2) {
      var1 += this.field3969;
      var2 += this.field3976;
      int var3 = var1 + var2 * class327.field3954;
      int var4 = 0;
      int var5 = this.field3972;
      int var6 = this.field3971;
      int var7 = class327.field3954 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class327.field3955) {
         var9 = class327.field3955 - var2;
         var5 -= var9;
         var2 = class327.field3955;
         var4 += var9 * var6;
         var3 += var9 * class327.field3954;
      }

      if (var5 + var2 > class327.field3956) {
         var5 -= var5 + var2 - class327.field3956;
      }

      if (var1 < class327.field3952) {
         var9 = class327.field3952 - var1;
         var6 -= var9;
         var1 = class327.field3952;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 + var1 > class327.field3953) {
         var9 = var6 + var1 - class327.field3953;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method5851(class327.field3958, this.field3973, this.field3974, var4, var3, var6, var5, var7, var8);
      }

   }

   public void method5844(int var1, int var2, int var3, int var4) {
      int var5 = this.field3971;
      int var6 = this.field3972;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field3975;
      int var10 = this.field3970;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.field3969 > 0) {
         var13 = (var11 + (this.field3969 << 16) - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field3969 << 16);
      }

      if (this.field3976 > 0) {
         var13 = (var12 + (this.field3976 << 16) - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field3976 << 16);
      }

      if (var5 < var9) {
         var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
      }

      if (var6 < var10) {
         var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
      }

      var13 = var1 + var2 * class327.field3954;
      int var14 = class327.field3954 - var3;
      if (var2 + var4 > class327.field3956) {
         var4 -= var2 + var4 - class327.field3956;
      }

      int var15;
      if (var2 < class327.field3955) {
         var15 = class327.field3955 - var2;
         var4 -= var15;
         var13 += var15 * class327.field3954;
         var8 += var12 * var15;
      }

      if (var3 + var1 > class327.field3953) {
         var15 = var3 + var1 - class327.field3953;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < class327.field3952) {
         var15 = class327.field3952 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method5845(class327.field3958, this.field3973, this.field3974, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   public void method5857(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field3974.length; ++var4) {
         int var5 = this.field3974[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field3974[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field3974[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.field3974[var4] = var7 + (var6 << 8) + (var5 << 16);
      }

   }

   static void method5851(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5845(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }
}

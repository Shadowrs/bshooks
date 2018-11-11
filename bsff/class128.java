public class class128 extends class216 {
   static int[] field1804;
   int[] field1796;
   int[] field1802;
   boolean field1793;
   boolean field1803 = false;
   int field1790;
   int field1794;
   int field1801;
   int[] field1799;
   int[] field1797;
   int[] field1800;

   class128(class194 var1) {
      this.field1794 = var1.getUShort(-1208216487);
      this.field1793 = var1.getUByte(-1000082436) == 1;
      int var2 = var1.getUByte(-1488966757);
      if (var2 >= 1 && var2 <= 4) {
         this.field1796 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field1796[var3] = var1.getUShort(-1208216487);
         }

         if (var2 > 1) {
            this.field1797 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1797[var3] = var1.getUByte(739781193);
            }
         }

         if (var2 > 1) {
            this.field1800 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1800[var3] = var1.getUByte(-253193273);
            }
         }

         this.field1799 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field1799[var3] = var1.getInt(-1817376731);
         }

         this.field1790 = var1.getUByte(1463347542);
         this.field1801 = var1.getUByte(806234431);
         this.field1802 = null;
      } else {
         throw new RuntimeException();
      }
   }

   void method2670() {
      this.field1802 = null;
   }

   boolean method2671(double var1, int var3, class261 var4) {
      int var5;
      for(var5 = 0; var5 < this.field1796.length; ++var5) {
         if (var4.method4560(this.field1796[var5], -1369072870) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field1802 = new int[var5];

      for(int var6 = 0; var6 < this.field1796.length; ++var6) {
         int var7 = this.field1796[var6];
         class330 var8;
         if (!class93.method1941(var4, var7, 1816915677)) {
            var8 = null;
         } else {
            var8 = class62.method1088((byte)-112);
         }

         var8.method5843();
         byte[] var9 = var8.field3973;
         int[] var10 = var8.field3974;
         int var11 = this.field1799[var6];
         if ((var11 & -16777216) == 16777216) {
            ;
         }

         if ((var11 & -16777216) == 33554432) {
            ;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         if ((var11 & -16777216) == 50331648) {
            var12 = var11 & 16711935;
            var13 = var11 >> 8 & 255;

            for(var14 = 0; var14 < var10.length; ++var14) {
               var15 = var10[var14];
               if (var15 >> 8 == (var15 & '\uffff')) {
                  var15 &= 255;
                  var10[var14] = var12 * var15 >> 8 & 16711935 | var13 * var15 & '\uff00';
               }
            }
         }

         for(var12 = 0; var12 < var10.length; ++var12) {
            var10[var12] = class134.method2799(var10[var12], var1);
         }

         if (var6 == 0) {
            var12 = 0;
         } else {
            var12 = this.field1797[var6 - 1];
         }

         if (var12 == 0) {
            if (var3 == var8.field3971) {
               for(var13 = 0; var13 < var5; ++var13) {
                  this.field1802[var13] = var10[var9[var13] & 255];
               }
            } else if (var8.field3971 == 64 && var3 == 128) {
               var13 = 0;

               for(var14 = 0; var14 < var3; ++var14) {
                  for(var15 = 0; var15 < var3; ++var15) {
                     this.field1802[var13++] = var10[var9[(var14 >> 1 << 6) + (var15 >> 1)] & 255];
                  }
               }
            } else {
               if (var8.field3971 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var13 = 0;

               for(var14 = 0; var14 < var3; ++var14) {
                  for(var15 = 0; var15 < var3; ++var15) {
                     this.field1802[var13++] = var10[var9[(var15 << 1) + (var14 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var12 == 1) {
            ;
         }

         if (var12 == 2) {
            ;
         }

         if (var12 == 3) {
            ;
         }
      }

      return true;
   }

   void method2668(int var1) {
      if (this.field1802 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var8;
         if (this.field1790 == 1 || this.field1790 == 3) {
            if (field1804 == null || field1804.length < this.field1802.length) {
               field1804 = new int[this.field1802.length];
            }

            if (this.field1802.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1802.length;
            var4 = var2 * this.field1801 * var1;
            var5 = var3 - 1;
            if (this.field1790 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field1804[var6] = this.field1802[var7];
            }

            var8 = this.field1802;
            this.field1802 = field1804;
            field1804 = var8;
         }

         if (this.field1790 == 2 || this.field1790 == 4) {
            if (field1804 == null || field1804.length < this.field1802.length) {
               field1804 = new int[this.field1802.length];
            }

            if (this.field1802.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1802.length;
            var4 = this.field1801 * var1;
            var5 = var2 - 1;
            if (this.field1790 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var9 = var6 + var7;
                  int var10 = var6 + (var7 + var4 & var5);
                  field1804[var9] = this.field1802[var10];
               }
            }

            var8 = this.field1802;
            this.field1802 = field1804;
            field1804 = var8;
         }
      }

   }
}

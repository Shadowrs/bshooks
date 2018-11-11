public class class269 extends class218 {
   public static class269[] field3471;
   public static class212 field3451 = new class212(256);
   public static class261 field3456;
   static int field3472;
   static int field3457;
   public static int field3450;
   public int field3470 = -1;
   int[] field3453;
   public int field3452;
   public String field3455;
   public class284 field3466;
   int field3454 = -1;
   public int field3459;
   int field3462 = Integer.MAX_VALUE;
   public int field3449 = 0;
   public class266 field3467;
   public String[] field3461 = new String[5];
   int field3468 = Integer.MIN_VALUE;
   public int field3463;
   int field3448 = Integer.MAX_VALUE;
   public String field3460;
   int field3465 = Integer.MIN_VALUE;
   int[] field3464;
   byte[] field3469;

   public class269(int var1) {
      this.field3466 = class284.field3690;
      this.field3467 = class266.field3435;
      this.field3463 = -1;
      this.field3452 = var1;
   }

   public class331 method4753(boolean var1, int var2) {
      int var3 = this.field3470;
      return this.method4754(var3, -1662932257);
   }

   class331 method4754(int var1, int var2) {
      if (var1 < 0) {
         return null;
      } else {
         class331 var3 = (class331)field3451.method3929((long)var1);
         if (var3 != null) {
            return var3;
         } else {
            var3 = class328.method5831(field3456, var1, 0, 2140062871);
            if (var3 != null) {
               field3451.method3932(var3, (long)var1);
            }

            return var3;
         }
      }
   }

   void method4752(class194 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3470 = var1.getBigSmart(-1980867540);
      } else if (var2 == 2) {
         this.field3454 = var1.getBigSmart(1298858350);
      } else if (var2 == 3) {
         this.field3455 = var1.getString1(-778927800);
      } else if (var2 == 4) {
         this.field3459 = var1.get24Int((byte)-16);
      } else if (var2 == 5) {
         var1.get24Int((byte)-3);
      } else if (var2 == 6) {
         this.field3449 = var1.getUByte(514651633);
      } else {
         int var4;
         if (var2 == 7) {
            var4 = var1.getUByte(-1053597253);
            if ((var4 & 1) == 0) {
               ;
            }

            if ((var4 & 2) == 2) {
               ;
            }
         } else if (var2 == 8) {
            var1.getUByte(-1969932054);
         } else if (var2 >= 10 && var2 <= 14) {
            this.field3461[var2 - 10] = var1.getString1(-778927800);
         } else if (var2 == 15) {
            var4 = var1.getUByte(-1377118447);
            this.field3453 = new int[var4 * 2];

            int var5;
            for(var5 = 0; var5 < var4 * 2; ++var5) {
               this.field3453[var5] = var1.getShort(997392590);
            }

            var1.getInt(-1817376731);
            var5 = var1.getUByte(954580864);
            this.field3464 = new int[var5];

            int var6;
            for(var6 = 0; var6 < this.field3464.length; ++var6) {
               this.field3464[var6] = var1.getInt(-1817376731);
            }

            this.field3469 = new byte[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               this.field3469[var6] = var1.getByte(133345029);
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.field3460 = var1.getString1(-778927800);
            } else if (var2 == 18) {
               var1.getBigSmart(1103359527);
            } else if (var2 == 19) {
               this.field3463 = var1.getUShort(-1208216487);
            } else if (var2 == 21) {
               var1.getInt(-1817376731);
            } else if (var2 == 22) {
               var1.getInt(-1817376731);
            } else if (var2 == 23) {
               var1.getUByte(214330217);
               var1.getUByte(-324809862);
               var1.getUByte(-971163372);
            } else if (var2 == 24) {
               var1.getShort(997392590);
               var1.getShort(997392590);
            } else if (var2 == 25) {
               var1.getBigSmart(1359228785);
            } else if (var2 == 28) {
               var1.getUByte(623366495);
            } else if (var2 == 29) {
               this.field3466 = (class284)class44.method660(class82.method1805(851676325), var1.getUByte(-320662956), -1027611572);
            } else if (var2 == 30) {
               this.field3467 = (class266)class44.method660(class256.method4534(1287517039), var1.getUByte(1117407738), -369721496);
            }
         }
      }

   }

   public int method4755(int var1) {
      return this.field3452;
   }

   public void method4751(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(-2146274846);
         if (var3 == 0) {
            return;
         }

         this.method4752(var1, var3, 2122282097);
      }
   }

   public void method4756(byte var1) {
      if (this.field3453 != null) {
         for(int var2 = 0; var2 < this.field3453.length; var2 += 2) {
            if (this.field3453[var2] < this.field3462) {
               this.field3462 = this.field3453[var2];
            } else if (this.field3453[var2] > this.field3468) {
               this.field3468 = this.field3453[var2];
            }

            if (this.field3453[var2 + 1] < this.field3448) {
               this.field3448 = this.field3453[var2 + 1];
            } else if (this.field3453[var2 + 1] > this.field3465) {
               this.field3465 = this.field3453[var2 + 1];
            }
         }
      }

   }

   public static class311 method4772(byte[] var0, int var1) {
      if (var0 == null) {
         return null;
      } else {
         class311 var2 = new class311(var0, class54.field633, class332.field3990, class25.field358, class332.field3989, class332.field3992, class332.field3993);
         class259.method4544(2139530522);
         return var2;
      }
   }

   public static final int method4771(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (0.0D != var2) {
         double var12;
         if (var4 < 0.5D) {
            var12 = var4 * (var2 + 1.0D);
         } else {
            var12 = var2 + var4 - var2 * var4;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = var0 + 0.3333333333333333D;
         if (var16 > 1.0D) {
            --var16;
         }

         double var18 = var0 - 0.3333333333333333D;
         if (var18 < 0.0D) {
            ++var18;
         }

         if (var16 * 6.0D < 1.0D) {
            var6 = var14 + (var12 - var14) * 6.0D * var16;
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0D < 1.0D) {
            var8 = var14 + var0 * 6.0D * (var12 - var14);
         } else if (2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if (var0 * 3.0D < 2.0D) {
            var8 = 6.0D * (0.6666666666666666D - var0) * (var12 - var14) + var14;
         } else {
            var8 = var14;
         }

         if (var18 * 6.0D < 1.0D) {
            var10 = var18 * (var12 - var14) * 6.0D + var14;
         } else if (2.0D * var18 < 1.0D) {
            var10 = var12;
         } else if (3.0D * var18 < 2.0D) {
            var10 = var14 + 6.0D * (0.6666666666666666D - var18) * (var12 - var14);
         } else {
            var10 = var14;
         }
      }

      int var20 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var21 = (int)(256.0D * var10);
      int var15 = var21 + (var13 << 8) + (var20 << 16);
      return var15;
   }
}

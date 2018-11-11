public class class104 extends class216 {
   static boolean field1518 = false;
   static byte[] field1507;
   static int field1508;
   static int field1509;
   static class102[] field1520;
   static int field1501;
   static int[] field1517;
   static int field1510;
   static float[] field1519;
   static boolean[] field1524;
   static class118[] field1515;
   static float[] field1525;
   static float[] field1526;
   static float[] field1505;
   static float[] field1528;
   static float[] field1523;
   static float[] field1529;
   static class106[] field1513;
   static int[] field1530;
   static int[] field1531;
   static class113[] field1514;
   byte[][] field1512;
   byte[] field1503;
   int field1527;
   int field1534;
   int field1502;
   float[] field1516;
   int field1506;
   int field1533;
   int field1504;
   int field1511;
   boolean field1532;
   boolean field1522;
   int field1521;

   class104(byte[] var1) {
      this.method2128(var1);
   }

   void method2128(byte[] var1) {
      class194 var2 = new class194(var1);
      this.field1502 = var2.getInt(-1817376731);
      this.field1506 = var2.getInt(-1817376731);
      this.field1504 = var2.getInt(-1817376731);
      this.field1511 = var2.getInt(-1817376731);
      if (this.field1511 < 0) {
         this.field1511 = ~this.field1511;
         this.field1532 = true;
      }

      int var3 = var2.getInt(-1817376731);
      this.field1512 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.getUByte(-1347781254);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.getBytes(var7, 0, var5, 1466541123);
         this.field1512[var4] = var7;
      }

   }

   class105 method2152(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field1503 == null) {
            this.field1527 = 0;
            this.field1516 = new float[field1501];
            this.field1503 = new byte[this.field1506];
            this.field1533 = 0;
            this.field1534 = 0;
         }

         for(; this.field1534 < this.field1512.length; ++this.field1534) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method2130(this.field1534);
            if (var2 != null) {
               int var3 = this.field1533;
               int var4 = var2.length;
               if (var4 > this.field1506 - var3) {
                  var4 = this.field1506 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field1503[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field1533;
               }

               this.field1533 = var3;
            }
         }

         this.field1516 = null;
         byte[] var7 = this.field1503;
         this.field1503 = null;
         return new class105(this.field1502, var7, this.field1504, this.field1511, this.field1532);
      }
   }

   float[] method2130(int var1) {
      method2126(this.field1512[var1], 0);
      method2146();
      int var2 = method2154(class15.method99(field1517.length - 1, -1264538177));
      boolean var3 = field1524[var2];
      int var4 = var3 ? field1501 : field1510;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method2146() != 0;
         var6 = method2146() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field1510 >> 2);
         var9 = (field1510 >> 2) + (var4 >> 2);
         var10 = field1510 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field1510 >> 2);
         var12 = (field1510 >> 2) + (var4 - (var4 >> 2));
         var13 = field1510 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class118 var14 = field1515[field1517[var2]];
      int var15 = var14.field1645;
      int var16 = var14.field1644[var15];
      boolean var17 = !field1513[var16].method2174();
      boolean var18 = var17;

      for(var16 = 0; var16 < var14.field1642; ++var16) {
         class113 var19 = field1514[var14.field1643[var16]];
         float[] var20 = field1519;
         var19.method2282(var20, var4 >> 1, var18);
      }

      int var48;
      if (!var17) {
         var16 = var14.field1645;
         var48 = var14.field1644[var16];
         field1513[var48].method2169(field1519, var4 >> 1);
      }

      float[] var21;
      int var22;
      int var49;
      if (var17) {
         for(var16 = var4 >> 1; var16 < var4; ++var16) {
            field1519[var16] = 0.0F;
         }
      } else {
         var16 = var4 >> 1;
         var48 = var4 >> 2;
         var49 = var4 >> 3;
         var21 = field1519;

         for(var22 = 0; var22 < var16; ++var22) {
            var21[var22] *= 0.5F;
         }

         for(var22 = var16; var22 < var4; ++var22) {
            var21[var22] = -var21[var4 - var22 - 1];
         }

         float[] var23 = var3 ? field1525 : field1526;
         float[] var24 = var3 ? field1528 : field1505;
         float[] var25 = var3 ? field1529 : field1523;
         int[] var26 = var3 ? field1531 : field1530;

         int var27;
         float var28;
         float var29;
         float var30;
         float var31;
         for(var27 = 0; var27 < var48; ++var27) {
            var28 = var21[var27 * 4] - var21[var4 - var27 * 4 - 1];
            var29 = var21[var27 * 4 + 2] - var21[var4 - var27 * 4 - 3];
            var30 = var23[var27 * 2];
            var31 = var23[var27 * 2 + 1];
            var21[var4 - var27 * 4 - 1] = var28 * var30 - var29 * var31;
            var21[var4 - var27 * 4 - 3] = var28 * var31 + var29 * var30;
         }

         float var32;
         float var33;
         for(var27 = 0; var27 < var49; ++var27) {
            var28 = var21[var16 + var27 * 4 + 3];
            var29 = var21[var16 + var27 * 4 + 1];
            var30 = var21[var27 * 4 + 3];
            var31 = var21[var27 * 4 + 1];
            var21[var16 + var27 * 4 + 3] = var28 + var30;
            var21[var16 + var27 * 4 + 1] = var29 + var31;
            var32 = var23[var16 - 4 - var27 * 4];
            var33 = var23[var16 - 3 - var27 * 4];
            var21[var27 * 4 + 3] = (var28 - var30) * var32 - (var29 - var31) * var33;
            var21[var27 * 4 + 1] = (var29 - var31) * var32 + (var28 - var30) * var33;
         }

         var27 = class15.method99(var4 - 1, -1264538177);

         int var34;
         int var35;
         int var36;
         int var37;
         for(var34 = 0; var34 < var27 - 3; ++var34) {
            var35 = var4 >> var34 + 2;
            var36 = 8 << var34;

            for(var37 = 0; var37 < 2 << var34; ++var37) {
               int var38 = var4 - var35 * var37 * 2;
               int var39 = var4 - var35 * (var37 * 2 + 1);

               for(int var40 = 0; var40 < var4 >> var34 + 4; ++var40) {
                  int var41 = var40 * 4;
                  float var42 = var21[var38 - 1 - var41];
                  float var43 = var21[var38 - 3 - var41];
                  float var44 = var21[var39 - 1 - var41];
                  float var45 = var21[var39 - 3 - var41];
                  var21[var38 - 1 - var41] = var42 + var44;
                  var21[var38 - 3 - var41] = var43 + var45;
                  float var46 = var23[var40 * var36];
                  float var47 = var23[var40 * var36 + 1];
                  var21[var39 - 1 - var41] = (var42 - var44) * var46 - (var43 - var45) * var47;
                  var21[var39 - 3 - var41] = (var43 - var45) * var46 + (var42 - var44) * var47;
               }
            }
         }

         for(var34 = 1; var34 < var49 - 1; ++var34) {
            var35 = var26[var34];
            if (var34 < var35) {
               var36 = var34 * 8;
               var37 = var35 * 8;
               var32 = var21[var36 + 1];
               var21[var36 + 1] = var21[var37 + 1];
               var21[var37 + 1] = var32;
               var32 = var21[var36 + 3];
               var21[var36 + 3] = var21[var37 + 3];
               var21[var37 + 3] = var32;
               var32 = var21[var36 + 5];
               var21[var36 + 5] = var21[var37 + 5];
               var21[var37 + 5] = var32;
               var32 = var21[var36 + 7];
               var21[var36 + 7] = var21[var37 + 7];
               var21[var37 + 7] = var32;
            }
         }

         for(var34 = 0; var34 < var16; ++var34) {
            var21[var34] = var21[var34 * 2 + 1];
         }

         for(var34 = 0; var34 < var49; ++var34) {
            var21[var4 - 1 - var34 * 2] = var21[var34 * 4];
            var21[var4 - 2 - var34 * 2] = var21[var34 * 4 + 1];
            var21[var4 - var48 - 1 - var34 * 2] = var21[var34 * 4 + 2];
            var21[var4 - var48 - 2 - var34 * 2] = var21[var34 * 4 + 3];
         }

         for(var34 = 0; var34 < var49; ++var34) {
            var29 = var25[var34 * 2];
            var30 = var25[var34 * 2 + 1];
            var31 = var21[var16 + var34 * 2];
            var32 = var21[var16 + var34 * 2 + 1];
            var33 = var21[var4 - 2 - var34 * 2];
            float var51 = var21[var4 - 1 - var34 * 2];
            float var52 = var30 * (var31 - var33) + var29 * (var32 + var51);
            var21[var16 + var34 * 2] = (var31 + var33 + var52) * 0.5F;
            var21[var4 - 2 - var34 * 2] = (var31 + var33 - var52) * 0.5F;
            var52 = var30 * (var32 + var51) - var29 * (var31 - var33);
            var21[var16 + var34 * 2 + 1] = (var32 - var51 + var52) * 0.5F;
            var21[var4 - 1 - var34 * 2] = (-var32 + var51 + var52) * 0.5F;
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var34] = var21[var16 + var34 * 2] * var24[var34 * 2] + var21[var16 + var34 * 2 + 1] * var24[var34 * 2 + 1];
            var21[var16 - 1 - var34] = var21[var16 + var34 * 2] * var24[var34 * 2 + 1] - var21[var16 + var34 * 2 + 1] * var24[var34 * 2];
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var34 + (var4 - var48)] = -var21[var34];
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var34] = var21[var48 + var34];
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var48 + var34] = -var21[var48 - var34 - 1];
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var16 + var34] = var21[var4 - var34 - 1];
         }

         for(var34 = var8; var34 < var9; ++var34) {
            var29 = (float)Math.sin(((double)(var34 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field1519[var34] *= (float)Math.sin(1.5707963267948966D * (double)var29 * (double)var29);
         }

         for(var34 = var11; var34 < var12; ++var34) {
            var29 = (float)Math.sin(((double)(var34 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field1519[var34] *= (float)Math.sin(1.5707963267948966D * (double)var29 * (double)var29);
         }
      }

      var21 = null;
      if (this.field1527 > 0) {
         var48 = var4 + this.field1527 >> 2;
         var21 = new float[var48];
         if (!this.field1522) {
            for(var49 = 0; var49 < this.field1521; ++var49) {
               var22 = var49 + (this.field1527 >> 1);
               var21[var49] += this.field1516[var22];
            }
         }

         if (!var17) {
            for(var49 = var8; var49 < var4 >> 1; ++var49) {
               var22 = var21.length - (var4 >> 1) + var49;
               var21[var22] += field1519[var49];
            }
         }
      }

      float[] var50 = this.field1516;
      this.field1516 = field1519;
      field1519 = var50;
      this.field1527 = var4;
      this.field1521 = var12 - (var4 >> 1);
      this.field1522 = var17;
      return var21;
   }

   static int method2146() {
      int var0 = field1507[field1508] >> field1509 & 1;
      ++field1509;
      field1508 += field1509 >> 3;
      field1509 &= 7;
      return var0;
   }

   static int method2154(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field1509; var0 -= var3) {
         var3 = 8 - field1509;
         int var4 = (1 << var3) - 1;
         var1 += (field1507[field1508] >> field1509 & var4) << var2;
         field1509 = 0;
         ++field1508;
         var2 += var3;
      }

      if (var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field1507[field1508] >> field1509 & var3) << var2;
         field1509 += var0;
      }

      return var1;
   }

   static void method2126(byte[] var0, int var1) {
      field1507 = var0;
      field1508 = var1;
      field1509 = 0;
   }

   static boolean method2131(class261 var0) {
      if (!field1518) {
         byte[] var1 = var0.method4551(0, 0, -528183066);
         if (var1 == null) {
            return false;
         }

         method2129(var1);
         field1518 = true;
      }

      return true;
   }

   static class104 method2135(class261 var0, int var1, int var2) {
      if (!method2131(var0)) {
         var0.method4570(var1, var2, (byte)70);
         return null;
      } else {
         byte[] var3 = var0.method4551(var1, var2, 1441324727);
         return var3 == null ? null : new class104(var3);
      }
   }

   static void method2129(byte[] var0) {
      method2126(var0, 0);
      field1510 = 1 << method2154(4);
      field1501 = 1 << method2154(4);
      field1519 = new float[field1501];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0 ? field1501 : field1510;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
            var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
         }

         float[] var13 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var13[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
            var13[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
         }

         float[] var14 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var14[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
            var14[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var15 = new int[var5];
         int var10 = class15.method99(var5 - 1, -1264538177);

         for(int var11 = 0; var11 < var5; ++var11) {
            var15[var11] = class27.method239(var11, var10, -1345664638);
         }

         if (var1 != 0) {
            field1525 = var6;
            field1528 = var13;
            field1529 = var14;
            field1531 = var15;
         } else {
            field1526 = var6;
            field1505 = var13;
            field1523 = var14;
            field1530 = var15;
         }
      }

      var1 = method2154(8) + 1;
      field1520 = new class102[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field1520[var2] = new class102();
      }

      var2 = method2154(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method2154(16);
      }

      var2 = method2154(6) + 1;
      field1513 = new class106[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field1513[var3] = new class106();
      }

      var3 = method2154(6) + 1;
      field1514 = new class113[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field1514[var4] = new class113();
      }

      var4 = method2154(6) + 1;
      field1515 = new class118[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field1515[var5] = new class118();
      }

      var5 = method2154(6) + 1;
      field1524 = new boolean[var5];
      field1517 = new int[var5];

      for(int var12 = 0; var12 < var5; ++var12) {
         field1524[var12] = method2146() != 0;
         method2154(16);
         method2154(16);
         field1517[var12] = method2154(8);
      }

   }

   static float method2127(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }
}

public class class233 extends class216 {
   int[] field2749 = new int[128];
   class105[] field2751 = new class105[128];
   short[] field2752 = new short[128];
   byte[] field2750 = new byte[128];
   byte[] field2753 = new byte[128];
   class228[] field2754 = new class228[128];
   byte[] field2755 = new byte[128];
   int field2756;

   class233(byte[] var1) {
      class194 var2 = new class194(var1);

      int var3;
      for(var3 = 0; var2.field2566[var3 + var2.field2565] != 0; ++var3) {
         ;
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.getByte(1453550491);
      }

      ++var2.field2565;
      ++var3;
      var5 = var2.field2565;
      var2.field2565 += var3;

      int var6;
      for(var6 = 0; var2.field2566[var6 + var2.field2565] != 0; ++var6) {
         ;
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.getByte(-440530450);
      }

      ++var2.field2565;
      ++var6;
      var8 = var2.field2565;
      var2.field2565 += var6;

      int var9;
      for(var9 = 0; var2.field2566[var9 + var2.field2565] != 0; ++var9) {
         ;
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.getByte(-19397037);
      }

      ++var2.field2565;
      ++var9;
      byte[] var42 = new byte[var9];
      int var12;
      int var13;
      if (var9 > 1) {
         var42[1] = 1;
         int var14 = 1;
         var12 = 2;

         for(var13 = 2; var13 < var9; ++var13) {
            int var15 = var2.getUByte(1302690621);
            if (var15 == 0) {
               var14 = var12++;
            } else {
               if (var15 <= var14) {
                  --var15;
               }

               var14 = var15;
            }

            var42[var13] = (byte)var14;
         }
      } else {
         var12 = var9;
      }

      class228[] var43 = new class228[var12];

      class228 var44;
      for(var13 = 0; var13 < var43.length; ++var13) {
         var44 = var43[var13] = new class228();
         int var16 = var2.getUByte(1091724557);
         if (var16 > 0) {
            var44.field2674 = new byte[var16 * 2];
         }

         var16 = var2.getUByte(431927465);
         if (var16 > 0) {
            var44.field2668 = new byte[var16 * 2 + 2];
            var44.field2668[1] = 64;
         }
      }

      var13 = var2.getUByte(1478389355);
      byte[] var45 = var13 > 0 ? new byte[var13 * 2] : null;
      var13 = var2.getUByte(269635572);
      byte[] var17 = var13 > 0 ? new byte[var13 * 2] : null;

      int var18;
      for(var18 = 0; var2.field2566[var18 + var2.field2565] != 0; ++var18) {
         ;
      }

      byte[] var19 = new byte[var18];

      int var20;
      for(var20 = 0; var20 < var18; ++var20) {
         var19[var20] = var2.getByte(526353105);
      }

      ++var2.field2565;
      ++var18;
      var20 = 0;

      int var21;
      for(var21 = 0; var21 < 128; ++var21) {
         var20 += var2.getUByte(291023229);
         this.field2752[var21] = (short)var20;
      }

      var20 = 0;

      for(var21 = 0; var21 < 128; ++var21) {
         var20 += var2.getUByte(18915235);
         this.field2752[var21] = (short)(this.field2752[var21] + (var20 << 8));
      }

      var21 = 0;
      int var22 = 0;
      int var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if (var21 == 0) {
            if (var22 < var19.length) {
               var21 = var19[var22++];
            } else {
               var21 = -1;
            }

            var23 = var2.method3536(-78174248);
         }

         this.field2752[var24] = (short)(this.field2752[var24] + ((var23 - 1 & 2) << 14));
         this.field2749[var24] = var23;
         --var21;
      }

      var21 = 0;
      var22 = 0;
      var24 = 0;

      int var25;
      for(var25 = 0; var25 < 128; ++var25) {
         if (this.field2749[var25] != 0) {
            if (var21 == 0) {
               if (var22 < var4.length) {
                  var21 = var4[var22++];
               } else {
                  var21 = -1;
               }

               var24 = var2.field2566[var5++] - 1;
            }

            this.field2755[var25] = (byte)var24;
            --var21;
         }
      }

      var21 = 0;
      var22 = 0;
      var25 = 0;

      for(int var26 = 0; var26 < 128; ++var26) {
         if (this.field2749[var26] != 0) {
            if (var21 == 0) {
               if (var22 < var7.length) {
                  var21 = var7[var22++];
               } else {
                  var21 = -1;
               }

               var25 = var2.field2566[var8++] + 16 << 2;
            }

            this.field2753[var26] = (byte)var25;
            --var21;
         }
      }

      var21 = 0;
      var22 = 0;
      class228 var46 = null;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if (this.field2749[var27] != 0) {
            if (var21 == 0) {
               var46 = var43[var42[var22]];
               if (var22 < var10.length) {
                  var21 = var10[var22++];
               } else {
                  var21 = -1;
               }
            }

            this.field2754[var27] = var46;
            --var21;
         }
      }

      var21 = 0;
      var22 = 0;
      var27 = 0;

      int var28;
      for(var28 = 0; var28 < 128; ++var28) {
         if (var21 == 0) {
            if (var22 < var19.length) {
               var21 = var19[var22++];
            } else {
               var21 = -1;
            }

            if (this.field2749[var28] > 0) {
               var27 = var2.getUByte(-905655955) + 1;
            }
         }

         this.field2750[var28] = (byte)var27;
         --var21;
      }

      this.field2756 = var2.getUByte(1477140552) + 1;

      class228 var29;
      int var30;
      for(var28 = 0; var28 < var12; ++var28) {
         var29 = var43[var28];
         if (var29.field2674 != null) {
            for(var30 = 1; var30 < var29.field2674.length; var30 += 2) {
               var29.field2674[var30] = var2.getByte(145761609);
            }
         }

         if (var29.field2668 != null) {
            for(var30 = 3; var30 < var29.field2668.length - 2; var30 += 2) {
               var29.field2668[var30] = var2.getByte(1150354676);
            }
         }
      }

      if (var45 != null) {
         for(var28 = 1; var28 < var45.length; var28 += 2) {
            var45[var28] = var2.getByte(-2033977865);
         }
      }

      if (var17 != null) {
         for(var28 = 1; var28 < var17.length; var28 += 2) {
            var17[var28] = var2.getByte(410359067);
         }
      }

      for(var28 = 0; var28 < var12; ++var28) {
         var29 = var43[var28];
         if (var29.field2668 != null) {
            var20 = 0;

            for(var30 = 2; var30 < var29.field2668.length; var30 += 2) {
               var20 = var20 + 1 + var2.getUByte(-525887506);
               var29.field2668[var30] = (byte)var20;
            }
         }
      }

      for(var28 = 0; var28 < var12; ++var28) {
         var29 = var43[var28];
         if (var29.field2674 != null) {
            var20 = 0;

            for(var30 = 2; var30 < var29.field2674.length; var30 += 2) {
               var20 = 1 + var20 + var2.getUByte(-1613180604);
               var29.field2674[var30] = (byte)var20;
            }
         }
      }

      byte var31;
      int var32;
      int var33;
      int var34;
      int var35;
      byte var36;
      if (var45 != null) {
         var20 = var2.getUByte(1305076792);
         var45[0] = (byte)var20;

         for(var28 = 2; var28 < var45.length; var28 += 2) {
            var20 = var20 + 1 + var2.getUByte(-621305045);
            var45[var28] = (byte)var20;
         }

         var36 = var45[0];
         byte var37 = var45[1];

         for(var30 = 0; var30 < var36; ++var30) {
            this.field2750[var30] = (byte)(var37 * this.field2750[var30] + 32 >> 6);
         }

         for(var30 = 2; var30 < var45.length; var30 += 2) {
            var31 = var45[var30];
            byte var38 = var45[var30 + 1];
            var32 = var37 * (var31 - var36) + (var31 - var36) / 2;

            for(var33 = var36; var33 < var31; ++var33) {
               var34 = class144.method3095(var32, var31 - var36, (byte)-66);
               this.field2750[var33] = (byte)(var34 * this.field2750[var33] + 32 >> 6);
               var32 += var38 - var37;
            }

            var36 = var31;
            var37 = var38;
         }

         for(var35 = var36; var35 < 128; ++var35) {
            this.field2750[var35] = (byte)(var37 * this.field2750[var35] + 32 >> 6);
         }

         var44 = null;
      }

      if (var17 != null) {
         var20 = var2.getUByte(-1672603821);
         var17[0] = (byte)var20;

         for(var28 = 2; var28 < var17.length; var28 += 2) {
            var20 = var20 + 1 + var2.getUByte(-457210401);
            var17[var28] = (byte)var20;
         }

         var36 = var17[0];
         int var47 = var17[1] << 1;

         for(var30 = 0; var30 < var36; ++var30) {
            var35 = var47 + (this.field2753[var30] & 255);
            if (var35 < 0) {
               var35 = 0;
            }

            if (var35 > 128) {
               var35 = 128;
            }

            this.field2753[var30] = (byte)var35;
         }

         int var48;
         for(var30 = 2; var30 < var17.length; var30 += 2) {
            var31 = var17[var30];
            var48 = var17[var30 + 1] << 1;
            var32 = var47 * (var31 - var36) + (var31 - var36) / 2;

            for(var33 = var36; var33 < var31; ++var33) {
               int var39 = var31 - var36;
               int var40 = var32 >>> 31;
               var34 = (var40 + var32) / var39 - var40;
               int var41 = var34 + (this.field2753[var33] & 255);
               if (var41 < 0) {
                  var41 = 0;
               }

               if (var41 > 128) {
                  var41 = 128;
               }

               this.field2753[var33] = (byte)var41;
               var32 += var48 - var47;
            }

            var36 = var31;
            var47 = var48;
         }

         for(var35 = var36; var35 < 128; ++var35) {
            var48 = var47 + (this.field2753[var35] & 255);
            if (var48 < 0) {
               var48 = 0;
            }

            if (var48 > 128) {
               var48 = 128;
            }

            this.field2753[var35] = (byte)var48;
         }

         Object var49 = null;
      }

      for(var28 = 0; var28 < var12; ++var28) {
         var43[var28].field2669 = var2.getUByte(550138501);
      }

      for(var28 = 0; var28 < var12; ++var28) {
         var29 = var43[var28];
         if (var29.field2674 != null) {
            var29.field2670 = var2.getUByte(144272501);
         }

         if (var29.field2668 != null) {
            var29.field2675 = var2.getUByte(-1458730696);
         }

         if (var29.field2669 > 0) {
            var29.field2672 = var2.getUByte(1017110965);
         }
      }

      for(var28 = 0; var28 < var12; ++var28) {
         var43[var28].field2667 = var2.getUByte(-1215057477);
      }

      for(var28 = 0; var28 < var12; ++var28) {
         var29 = var43[var28];
         if (var29.field2667 > 0) {
            var29.field2673 = var2.getUByte(-639709799);
         }
      }

      for(var28 = 0; var28 < var12; ++var28) {
         var29 = var43[var28];
         if (var29.field2673 > 0) {
            var29.field2671 = var2.getUByte(-1867782084);
         }
      }

   }

   void method4328(int var1) {
      this.field2749 = null;
   }

   boolean method4327(class110 var1, byte[] var2, int[] var3, int var4) {
      boolean var5 = true;
      int var6 = 0;
      class105 var7 = null;

      for(int var8 = 0; var8 < 128; ++var8) {
         if (var2 == null || var2[var8] != 0) {
            int var9 = this.field2749[var8];
            if (var9 != 0) {
               if (var6 != var9) {
                  var6 = var9--;
                  if ((var9 & 1) == 0) {
                     var7 = var1.method2264(var9 >> 2, var3, -290857524);
                  } else {
                     var7 = var1.method2268(var9 >> 2, var3, 1479750415);
                  }

                  if (var7 == null) {
                     var5 = false;
                  }
               }

               if (var7 != null) {
                  this.field2751[var8] = var7;
                  this.field2749[var8] = 0;
               }
            }
         }
      }

      return var5;
   }

   static void method4333(int var0, int var1) {
      for(class223 var2 = (class223)client.field986.method3962(); var2 != null; var2 = (class223)client.field986.method3965()) {
         if ((var2.field2644 >> 48 & 65535L) == (long)var0) {
            var2.method4014();
         }
      }

   }

   static void method4334(int var0) {
      int var1 = class93.field1414;
      int[] var2 = class93.field1415;

      for(int var3 = 0; var3 < var1; ++var3) {
         if (var2[var3] != client.field982 && var2[var3] != client.field1000) {
            class37.method523(client.field971[var2[var3]], true, (byte)14);
         }
      }

   }
}

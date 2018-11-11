public class class327 extends class218 {
   public static int field3955 = 0;
   public static int field3952 = 0;
   public static int[] field3958;
   public static int field3954;
   public static int field3957;
   public static int field3956 = 0;
   protected static int field3953 = 0;

   public static void method5771(int[] var0) {
      var0[0] = field3952;
      var0[1] = field3955;
      var0[2] = field3953;
      var0[3] = field3956;
   }

   public static void method5731(int[] var0, int var1, int var2) {
      field3958 = var0;
      field3954 = var1;
      field3957 = var2;
      method5733(0, 0, var1, var2);
   }

   public static void method5752(int var0, int var1, int var2, int var3) {
      if (var0 >= field3952 && var0 < field3953) {
         if (var1 < field3955) {
            var2 -= field3955 - var1;
            var1 = field3955;
         }

         if (var2 + var1 > field3956) {
            var2 = field3956 - var1;
         }

         int var4 = var0 + field3954 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field3958[var4 + var5 * field3954] = var3;
         }
      }

   }

   public static void method5810(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < field3952) {
         var2 -= field3952 - var0;
         var0 = field3952;
      }

      if (var1 < field3955) {
         var3 -= field3955 - var1;
         var1 = field3955;
      }

      if (var0 + var2 > field3953) {
         var2 = field3953 - var0;
      }

      if (var3 + var1 > field3956) {
         var3 = field3956 - var1;
      }

      int var5 = field3954 - var2;
      int var6 = var0 + field3954 * var1;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field3958[var6++] = var4;
         }

         var6 += var5;
      }

   }

   public static void method5756(int var0, int var1, int var2, int var3) {
      if (var1 >= field3955 && var1 < field3956) {
         if (var0 < field3952) {
            var2 -= field3952 - var0;
            var0 = field3952;
         }

         if (var0 + var2 > field3953) {
            var2 = field3953 - var0;
         }

         int var4 = var0 + field3954 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field3958[var4 + var5] = var3;
         }
      }

   }

   public static void method5733(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > field3954) {
         var2 = field3954;
      }

      if (var3 > field3957) {
         var3 = field3957;
      }

      field3952 = var0;
      field3955 = var1;
      field3953 = var2;
      field3956 = var3;
   }

   public static void method5739(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            method5738(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = var4 * (var3 & 255);
            int var9 = var1 - var2;
            if (var9 < field3955) {
               var9 = field3955;
            }

            int var10 = var2 + var1 + 1;
            if (var10 > field3956) {
               var10 = field3956;
            }

            int var11 = var9;
            int var12 = var2 * var2;
            int var13 = 0;
            int var14 = var1 - var9;
            int var15 = var14 * var14;
            int var16 = var15 - var14;
            if (var1 > var10) {
               var1 = var10;
            }

            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var11 < var1) {
               while(var16 <= var12 || var15 <= var12) {
                  var15 = var15 + var13 + var13;
                  var16 += var13++ + var13;
               }

               var17 = var0 - var13 + 1;
               if (var17 < field3952) {
                  var17 = field3952;
               }

               var18 = var0 + var13;
               if (var18 > field3953) {
                  var18 = field3953;
               }

               var19 = var17 + var11 * field3954;

               for(var20 = var17; var20 < var18; ++var20) {
                  var21 = var5 * (field3958[var19] >> 16 & 255);
                  var22 = (field3958[var19] >> 8 & 255) * var5;
                  var23 = var5 * (field3958[var19] & 255);
                  var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                  field3958[var19++] = var24;
               }

               ++var11;
               var15 -= var14-- + var14;
               var16 -= var14 + var14;
            }

            var13 = var2;
            var14 = -var14;
            var16 = var12 + var14 * var14;
            var15 = var16 - var2;

            for(var16 -= var14; var11 < var10; var15 += var14++ + var14) {
               while(var16 > var12 && var15 > var12) {
                  var16 -= var13-- + var13;
                  var15 -= var13 + var13;
               }

               var17 = var0 - var13;
               if (var17 < field3952) {
                  var17 = field3952;
               }

               var18 = var0 + var13;
               if (var18 > field3953 - 1) {
                  var18 = field3953 - 1;
               }

               var19 = var17 + var11 * field3954;

               for(var20 = var17; var20 <= var18; ++var20) {
                  var21 = var5 * (field3958[var19] >> 16 & 255);
                  var22 = (field3958[var19] >> 8 & 255) * var5;
                  var23 = var5 * (field3958[var19] & 255);
                  var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                  field3958[var19++] = var24;
               }

               ++var11;
               var16 = var16 + var14 + var14;
            }
         }
      }

   }

   public static void method5748(int var0, int var1, int var2, int var3, int var4) {
      method5756(var0, var1, var2, var4);
      method5756(var0, var3 + var1 - 1, var2, var4);
      method5752(var0, var1, var3, var4);
      method5752(var0 + var2 - 1, var1, var3, var4);
   }

   public static void method5747(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var3 + var1 >= 0 && var0 < field3954 && var1 < field3957) {
         int var9 = 0;
         int var10 = 0;
         if (var0 < 0) {
            var9 -= var0;
            var2 += var0;
         }

         if (var1 < 0) {
            var10 -= var1;
            var3 += var1;
         }

         if (var0 + var2 > field3954) {
            var2 = field3954 - var0;
         }

         if (var3 + var1 > field3957) {
            var3 = field3957 - var1;
         }

         int var11 = var6.length / var7;
         int var12 = field3954 - var2;
         int var13 = var4 >>> 24;
         int var14 = var5 >>> 24;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         if (var13 == 255 && var14 == 255) {
            var15 = var0 + var9 + (var10 + var1) * field3954;

            for(var16 = var10 + var1; var16 < var3 + var10 + var1; ++var16) {
               for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                  var18 = (var16 - var1) % var11;
                  var19 = (var17 - var0) % var7;
                  if (var6[var19 + var18 * var7] != 0) {
                     field3958[var15++] = var5;
                  } else {
                     field3958[var15++] = var4;
                  }
               }

               var15 += var12;
            }
         } else {
            var15 = var0 + var9 + (var10 + var1) * field3954;

            for(var16 = var10 + var1; var16 < var3 + var10 + var1; ++var16) {
               for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                  var18 = (var16 - var1) % var11;
                  var19 = (var17 - var0) % var7;
                  int var20 = var4;
                  if (var6[var19 + var18 * var7] != 0) {
                     var20 = var5;
                  }

                  int var21 = var20 >>> 24;
                  int var22 = 255 - var21;
                  int var23 = field3958[var15];
                  int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + (var21 * (var20 & '\uff00') + var22 * (var23 & '\uff00') & 16711680) >> 8;
                  field3958[var15++] = var24;
               }

               var15 += var12;
            }
         }
      }

   }

   static void method5738(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         method5805(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < field3955) {
            var4 = field3955;
         }

         int var5 = var2 + var1 + 1;
         if (var5 > field3956) {
            var5 = field3956;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 = var10 + var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if (var12 < field3952) {
               var12 = field3952;
            }

            var13 = var0 + var8;
            if (var13 > field3953) {
               var13 = field3953;
            }

            var14 = var12 + var6 * field3954;

            for(var15 = var12; var15 < var13; ++var15) {
               field3958[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var7 + var9 * var9;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if (var12 < field3952) {
               var12 = field3952;
            }

            var13 = var0 + var8;
            if (var13 > field3953 - 1) {
               var13 = field3953 - 1;
            }

            var14 = var12 + var6 * field3954;

            for(var15 = var12; var15 <= var13; ++var15) {
               field3958[var14++] = var3;
            }

            ++var6;
            var11 = var11 + var9 + var9;
         }
      }

   }

   public static void method5732() {
      field3952 = 0;
      field3955 = 0;
      field3953 = field3954;
      field3956 = field3957;
   }

   public static void method5754(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            method5756(var0, var1, var2 + 1, var4);
         } else {
            method5756(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            method5752(var0, var1, var3 + 1, var4);
         } else {
            method5752(var0, var3 + var1, -var3 + 1, var4);
         }
      } else {
         if (var3 + var2 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if (var0 < field3952) {
               var1 += var5 * (field3952 - var0);
               var0 = field3952;
            }

            if (var2 >= field3953) {
               var2 = field3953 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= field3955 && var6 < field3956) {
                  field3958[var0 + var6 * field3954] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < field3955) {
               var0 += (field3955 - var1) * var5;
               var1 = field3955;
            }

            if (var3 >= field3956) {
               var3 = field3956 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= field3952 && var6 < field3953) {
                  field3958[var6 + field3954 * var1] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }
      }

   }

   public static void method5740(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < field3952) {
         var2 -= field3952 - var0;
         var0 = field3952;
      }

      if (var1 < field3955) {
         var3 -= field3955 - var1;
         var1 = field3955;
      }

      if (var0 + var2 > field3953) {
         var2 = field3953 - var0;
      }

      if (var3 + var1 > field3956) {
         var3 = field3956 - var1;
      }

      var4 = (var5 * (var4 & 16711935) >> 8 & 16711935) + (var5 * (var4 & '\uff00') >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = field3954 - var2;
      int var8 = var0 + field3954 * var1;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field3958[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + (var6 * (var11 & '\uff00') >> 8 & '\uff00');
            field3958[var8++] = var11 + var4;
         }

         var8 += var7;
      }

   }

   static void method5805(int var0, int var1, int var2) {
      if (var0 >= field3952 && var1 >= field3955 && var0 < field3953 && var1 < field3956) {
         field3958[var0 + field3954 * var1] = var2;
      }

   }

   public static void method5736(int[] var0) {
      field3952 = var0[0];
      field3955 = var0[1];
      field3953 = var0[2];
      field3956 = var0[3];
   }

   public static void method5746(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < field3952) {
            var2 -= field3952 - var0;
            var0 = field3952;
         }

         if (var1 < field3955) {
            var6 += (field3955 - var1) * var7;
            var3 -= field3955 - var1;
            var1 = field3955;
         }

         if (var0 + var2 > field3953) {
            var2 = field3953 - var0;
         }

         if (var3 + var1 > field3956) {
            var3 = field3956 - var1;
         }

         int var8 = field3954 - var2;
         int var9 = var0 + field3954 * var1;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = (var12 * (var5 & 16711935) + var11 * (var4 & 16711935) & -16711936) + (var12 * (var5 & '\uff00') + var11 * (var4 & '\uff00') & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field3958[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }
      }

   }

   public static void method5759(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + field3954 * var1;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field3958[var6++] = var2;
         }

         var5 += field3954;
      }

   }

   public static void method5749(int var0, int var1, int var2, int var3, int var4, int var5) {
      method5751(var0, var1, var2, var4, var5);
      method5751(var0, var3 + var1 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method5753(var0, var1 + 1, var3 - 2, var4, var5);
         method5753(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void method5734(int var0, int var1, int var2, int var3) {
      if (field3952 < var0) {
         field3952 = var0;
      }

      if (field3955 < var1) {
         field3955 = var1;
      }

      if (field3953 > var2) {
         field3953 = var2;
      }

      if (field3956 > var3) {
         field3956 = var3;
      }

   }

   public static void method5742(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = var5 == var4 && var7 == var6 ? -1 : 65536 / var3;
         int var10 = var6;
         int var11 = 256 - var6;
         int var12 = var4;
         if (var0 < field3952) {
            var2 -= field3952 - var0;
            var0 = field3952;
         }

         if (var1 < field3955) {
            var8 += (field3955 - var1) * var9;
            var3 -= field3955 - var1;
            var1 = field3955;
         }

         if (var0 + var2 > field3953) {
            var2 = field3953 - var0;
         }

         if (var3 + var1 > field3956) {
            var3 = field3956 - var1;
         }

         int var13 = field3954 - var2;
         int var14 = var0 + field3954 * var1;

         for(int var15 = -var3; var15 < 0; ++var15) {
            int var16;
            int var17;
            for(var16 = -var2; var16 < 0; ++var16) {
               var17 = field3958[var14];
               int var18 = var12 + var17;
               int var19 = (var12 & 16711935) + (var17 & 16711935);
               int var20 = (var19 & 16777472) + (var18 - var19 & 65536);
               if (var11 == 0) {
                  field3958[var14++] = var18 - var20 | var20 - (var20 >>> 8);
               } else {
                  int var21 = var18 - var20 | var20 - (var20 >>> 8);
                  field3958[var14++] = ((var21 & 16711935) * var10 >> 8 & 16711935) + ((var17 & 16711935) * var11 >> 8 & 16711935) + (var10 * (var21 & '\uff00') >> 8 & '\uff00') + (var11 * (var17 & '\uff00') >> 8 & '\uff00');
               }
            }

            if (var9 > 0) {
               var8 += var9;
               var16 = 65536 - var8 >> 8;
               var17 = var8 >> 8;
               if (var7 != var6) {
                  var10 = (65536 - var8) * var6 + var8 * var7 >> 16;
                  var11 = 256 - var10;
               }

               if (var5 != var4) {
                  var12 = (var17 * (var5 & 16711935) + var16 * (var4 & 16711935) & -16711936) + (var17 * (var5 & '\uff00') + var16 * (var4 & '\uff00') & 16711680) >>> 8;
               }
            }

            var14 += var13;
         }
      }

   }

   public static void method5743(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = var5 == var4 && var7 == var6 ? -1 : 65536 / var3;
         int var10 = var6;
         int var11 = 256 - var6;
         if (var0 < field3952) {
            var2 -= field3952 - var0;
            var0 = field3952;
         }

         if (var1 < field3955) {
            var8 += (field3955 - var1) * var9;
            var3 -= field3955 - var1;
            var1 = field3955;
         }

         if (var0 + var2 > field3953) {
            var2 = field3953 - var0;
         }

         if (var3 + var1 > field3956) {
            var3 = field3956 - var1;
         }

         int var12 = var4 >> 16;
         int var13 = (var4 & '\uff00') >> 8;
         int var14 = var4 & 255;
         int var15 = field3954 - var2;
         int var16 = var0 + field3954 * var1;

         for(int var17 = 0; var17 < var3; ++var17) {
            int var18;
            int var19;
            int var20;
            for(var18 = -var2; var18 < 0; ++var18) {
               var19 = field3958[var16];
               var20 = var19 >> 16;
               int var21 = (var19 & '\uff00') >> 8;
               int var22 = var19 & 255;
               int var23;
               int var24;
               int var25;
               if (var11 == 0) {
                  var23 = var20 < 127 ? var12 * var20 >> 7 : 255 - ((255 - var12) * (255 - var20) >> 7);
                  var24 = var21 < 127 ? var13 * var21 >> 7 : 255 - ((255 - var13) * (255 - var21) >> 7);
                  var25 = var22 < 127 ? var14 * var22 >> 7 : 255 - ((255 - var14) * (255 - var22) >> 7);
               } else {
                  var23 = var20 < 127 ? var20 * var11 + (var12 * var20 * var10 >> 7) >> 8 : var10 * (255 - ((255 - var12) * (255 - var20) >> 7)) + var20 * var11 >> 8;
                  var24 = var21 < 127 ? var21 * var11 + (var13 * var21 * var10 >> 7) >> 8 : var10 * (255 - ((255 - var13) * (255 - var21) >> 7)) + var21 * var11 >> 8;
                  var25 = var22 < 127 ? var22 * var11 + (var14 * var22 * var10 >> 7) >> 8 : var10 * (255 - ((255 - var14) * (255 - var22) >> 7)) + var22 * var11 >> 8;
               }

               field3958[var16++] = var25 + (var24 << 8) + (var23 << 16);
            }

            if (var9 > 0) {
               var8 += var9;
               var18 = 65536 - var8 >> 8;
               var19 = var8 >> 8;
               if (var7 != var6) {
                  var10 = (65536 - var8) * var6 + var8 * var7 >> 16;
                  var11 = 256 - var10;
               }

               if (var5 != var4) {
                  var20 = (var19 * (var5 & 16711935) + var18 * (var4 & 16711935) & -16711936) + (var19 * (var5 & '\uff00') + var18 * (var4 & '\uff00') & 16711680) >>> 8;
                  var12 = var20 >> 16;
                  var13 = (var20 & '\uff00') >> 8;
                  var14 = var20 & 255;
               }
            }

            var16 += var15;
         }
      }

   }

   public static void method5744(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         int var10 = var6;
         int var11 = 256 - var6;
         if (var0 < field3952) {
            var2 -= field3952 - var0;
            var0 = field3952;
         }

         if (var1 < field3955) {
            var8 += (field3955 - var1) * var9;
            var3 -= field3955 - var1;
            var1 = field3955;
         }

         if (var0 + var2 > field3953) {
            var2 = field3953 - var0;
         }

         if (var3 + var1 > field3956) {
            var3 = field3956 - var1;
         }

         int var12 = var4 & 16711680;
         int var13 = var4 & '\uff00';
         int var14 = var4 & 255;
         int var15 = var12 * var6 >> 8;
         int var16 = var13 * var6 >> 8;
         int var17 = var14 * var6 >> 8;
         int var18 = field3954 - var2;
         int var19 = var0 + field3954 * var1;

         for(int var20 = 0; var20 < var3; ++var20) {
            int var21;
            int var22;
            int var23;
            for(var21 = -var2; var21 < 0; ++var21) {
               var22 = field3958[var19];
               var23 = var22 & 16711680;
               int var24 = var23 <= var12 ? var23 : (var11 == 0 ? var12 : var15 + (var23 * var11 >> 8) & 16711680);
               int var25 = var22 & '\uff00';
               int var26 = var25 <= var13 ? var25 : (var11 == 0 ? var13 : var16 + (var25 * var11 >> 8) & '\uff00');
               int var27 = var22 & 255;
               int var28 = var27 <= var14 ? var27 : (var11 == 0 ? var14 : var17 + (var27 * var11 >> 8));
               field3958[var19++] = var24 + var26 + var28;
            }

            if (var9 > 0) {
               var8 += var9;
               var21 = 65536 - var8 >> 8;
               var22 = var8 >> 8;
               if (var7 != var6) {
                  var10 = (65536 - var8) * var6 + var8 * var7 >> 16;
                  var11 = 256 - var10;
               }

               if (var5 != var4) {
                  var23 = (var22 * (var5 & 16711935) + var21 * (var4 & 16711935) & -16711936) + (var22 * (var5 & '\uff00') + var21 * (var4 & '\uff00') & 16711680) >>> 8;
                  var12 = var23 & 16711680;
                  var13 = var23 & '\uff00';
                  var14 = var23 & 255;
                  var15 = var12 * var10 >> 8;
                  var16 = var13 * var10 >> 8;
                  var17 = var14 * var10 >> 8;
               }
            }

            var19 += var18;
         }
      }

   }

   public static void method5773(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var3 > 0 && var2 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         int var10 = var6;
         int var11 = 256 - var6;
         if (var0 < field3952) {
            var2 -= field3952 - var0;
            var0 = field3952;
         }

         if (var1 < field3955) {
            var8 += (field3955 - var1) * var9;
            var3 -= field3955 - var1;
            var1 = field3955;
         }

         if (var0 + var2 > field3953) {
            var2 = field3953 - var0;
         }

         if (var3 + var1 > field3956) {
            var3 = field3956 - var1;
         }

         int var12 = var4 & 16711680;
         int var13 = var4 & '\uff00';
         int var14 = var4 & 255;
         int var15 = var12 * var6 >> 8;
         int var16 = var13 * var6 >> 8;
         int var17 = var14 * var6 >> 8;
         int var18 = field3954 - var2;
         int var19 = var0 + field3954 * var1;

         for(int var20 = 0; var20 < var3; ++var20) {
            int var21;
            int var22;
            int var23;
            for(var21 = -var2; var21 < 0; ++var21) {
               var22 = field3958[var19];
               var23 = var22 & 16711680;
               int var24 = var23 >= var12 ? var23 : (var11 == 0 ? var12 : var15 + (var23 * var11 >> 8) & 16711680);
               int var25 = var22 & '\uff00';
               int var26 = var25 >= var13 ? var25 : (var11 == 0 ? var13 : var16 + (var25 * var11 >> 8) & '\uff00');
               int var27 = var22 & 255;
               int var28 = var27 >= var14 ? var27 : (var11 == 0 ? var14 : var17 + (var27 * var11 >> 8));
               field3958[var19++] = var24 + var26 + var28;
            }

            if (var9 > 0) {
               var8 += var9;
               var21 = 65536 - var8 >> 8;
               var22 = var8 >> 8;
               if (var7 != var6) {
                  var10 = (65536 - var8) * var6 + var8 * var7 >> 16;
                  var11 = 256 - var10;
               }

               if (var5 != var4) {
                  var23 = (var22 * (var5 & 16711935) + var21 * (var4 & 16711935) & -16711936) + (var22 * (var5 & '\uff00') + var21 * (var4 & '\uff00') & 16711680) >>> 8;
                  var12 = var23 & 16711680;
                  var13 = var23 & '\uff00';
                  var14 = var23 & 255;
                  var15 = var12 * var10 >> 8;
                  var16 = var13 * var10 >> 8;
                  var17 = var14 * var10 >> 8;
               }
            }

            var19 += var18;
         }
      }

   }

   static void method5751(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field3955 && var1 < field3956) {
         if (var0 < field3952) {
            var2 -= field3952 - var0;
            var0 = field3952;
         }

         if (var0 + var2 > field3953) {
            var2 = field3953 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var9 = var0 + field3954 * var1;

         for(int var10 = 0; var10 < var2; ++var10) {
            int var11 = var5 * (field3958[var9] >> 16 & 255);
            int var12 = (field3958[var9] >> 8 & 255) * var5;
            int var13 = var5 * (field3958[var9] & 255);
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3958[var9++] = var14;
         }
      }

   }

   static void method5753(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field3952 && var0 < field3953) {
         if (var1 < field3955) {
            var2 -= field3955 - var1;
            var1 = field3955;
         }

         if (var2 + var1 > field3956) {
            var2 = field3956 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var9 = var0 + field3954 * var1;

         for(int var10 = 0; var10 < var2; ++var10) {
            int var11 = var5 * (field3958[var9] >> 16 & 255);
            int var12 = (field3958[var9] >> 8 & 255) * var5;
            int var13 = var5 * (field3958[var9] & 255);
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3958[var9] = var14;
            var9 += field3954;
         }
      }

   }

   public static void method5798() {
      int var0 = 0;

      int var1;
      for(var1 = field3954 * field3957 - 7; var0 < var1; field3958[var0++] = 0) {
         field3958[var0++] = 0;
         field3958[var0++] = 0;
         field3958[var0++] = 0;
         field3958[var0++] = 0;
         field3958[var0++] = 0;
         field3958[var0++] = 0;
         field3958[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field3958[var0++] = 0) {
         ;
      }

   }
}

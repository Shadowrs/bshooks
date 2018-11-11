public final class class188 {
   static class193 field2518 = new class193();

   public static int method3460(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      class193 var5 = field2518;
      synchronized(var5) {
         field2518.field2552 = var2;
         field2518.field2535 = var4;
         field2518.field2536 = var0;
         field2518.field2537 = 0;
         field2518.field2550 = var1;
         field2518.field2532 = 0;
         field2518.field2542 = 0;
         field2518.field2527 = 0;
         field2518.field2539 = 0;
         method3477(field2518);
         var1 -= field2518.field2550;
         field2518.field2552 = null;
         field2518.field2536 = null;
         return var1;
      }
   }

   static void method3477(class193 var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      int var19 = 0;
      int[] var20 = null;
      int[] var21 = null;
      int[] var22 = null;
      var0.field2544 = 1;
      if (class183.field2480 == null) {
         class183.field2480 = new int[var0.field2544 * 100000];
      }

      boolean var23 = true;

      while(true) {
         while(var23) {
            byte var24 = method3463(var0);
            if (var24 == 23) {
               return;
            }

            var24 = method3463(var0);
            var24 = method3463(var0);
            var24 = method3463(var0);
            var24 = method3463(var0);
            var24 = method3463(var0);
            var24 = method3463(var0);
            var24 = method3463(var0);
            var24 = method3463(var0);
            var24 = method3463(var0);
            var24 = method3464(var0);
            if (var24 != 0) {
               ;
            }

            var0.field2534 = 0;
            var24 = method3463(var0);
            var0.field2534 = var0.field2534 << 8 | var24 & 255;
            var24 = method3463(var0);
            var0.field2534 = var0.field2534 << 8 | var24 & 255;
            var24 = method3463(var0);
            var0.field2534 = var0.field2534 << 8 | var24 & 255;

            int var25;
            for(var25 = 0; var25 < 16; ++var25) {
               var24 = method3464(var0);
               if (var24 == 1) {
                  var0.field2553[var25] = true;
               } else {
                  var0.field2553[var25] = false;
               }
            }

            for(var25 = 0; var25 < 256; ++var25) {
               var0.field2543[var25] = false;
            }

            int var26;
            for(var25 = 0; var25 < 16; ++var25) {
               if (var0.field2553[var25]) {
                  for(var26 = 0; var26 < 16; ++var26) {
                     var24 = method3464(var0);
                     if (var24 == 1) {
                        var0.field2543[var26 + var25 * 16] = true;
                     }
                  }
               }
            }

            method3468(var0);
            int var27 = var0.field2563 + 2;
            int var28 = method3476(3, var0);
            int var29 = method3476(15, var0);

            for(var25 = 0; var25 < var29; ++var25) {
               var26 = 0;

               while(true) {
                  var24 = method3464(var0);
                  if (var24 == 0) {
                     var0.field2558[var25] = (byte)var26;
                     break;
                  }

                  ++var26;
               }
            }

            byte[] var30 = new byte[6];

            byte var31;
            for(var31 = 0; var31 < var28; var30[var31] = var31++) {
               ;
            }

            for(var25 = 0; var25 < var29; ++var25) {
               var31 = var0.field2558[var25];

               byte var32;
               for(var32 = var30[var31]; var31 > 0; --var31) {
                  var30[var31] = var30[var31 - 1];
               }

               var30[0] = var32;
               var0.field2557[var25] = var32;
            }

            int var33;
            int var50;
            for(var50 = 0; var50 < var28; ++var50) {
               var33 = method3476(5, var0);

               for(var25 = 0; var25 < var27; ++var25) {
                  while(true) {
                     var24 = method3464(var0);
                     if (var24 == 0) {
                        var0.field2559[var50][var25] = (byte)var33;
                        break;
                     }

                     var24 = method3464(var0);
                     if (var24 == 0) {
                        ++var33;
                     } else {
                        --var33;
                     }
                  }
               }
            }

            for(var50 = 0; var50 < var28; ++var50) {
               byte var51 = 32;
               byte var34 = 0;

               for(var25 = 0; var25 < var27; ++var25) {
                  if (var0.field2559[var50][var25] > var34) {
                     var34 = var0.field2559[var50][var25];
                  }

                  if (var0.field2559[var50][var25] < var51) {
                     var51 = var0.field2559[var50][var25];
                  }
               }

               method3467(var0.field2549[var50], var0.field2561[var50], var0.field2562[var50], var0.field2559[var50], var51, var34, var27);
               var0.field2533[var50] = var51;
            }

            var33 = var0.field2563 + 1;
            int var52 = -1;
            byte var35 = 0;

            for(var25 = 0; var25 <= 255; ++var25) {
               var0.field2548[var25] = 0;
            }

            int var36 = 4095;

            int var37;
            int var38;
            for(var37 = 15; var37 >= 0; --var37) {
               for(var38 = 15; var38 >= 0; --var38) {
                  var0.field2555[var36] = (byte)(var38 + var37 * 16);
                  --var36;
               }

               var0.field2556[var37] = var36 + 1;
            }

            int var39 = 0;
            byte var40;
            if (var35 == 0) {
               ++var52;
               var35 = 50;
               var40 = var0.field2557[var52];
               var19 = var0.field2533[var40];
               var20 = var0.field2549[var40];
               var22 = var0.field2562[var40];
               var21 = var0.field2561[var40];
            }

            int var41 = var35 - 1;
            int var42 = var19;

            int var43;
            byte var44;
            for(var43 = method3476(var19, var0); var43 > var20[var42]; var43 = var43 << 1 | var44) {
               ++var42;
               var44 = method3464(var0);
            }

            int var45 = var22[var43 - var21[var42]];

            while(true) {
               while(var45 != var33) {
                  int var46;
                  int var47;
                  if (var45 != 0 && var45 != 1) {
                     var46 = var45 - 1;
                     int var48;
                     if (var46 < 16) {
                        var47 = var0.field2556[0];

                        for(var24 = var0.field2555[var47 + var46]; var46 > 3; var46 -= 4) {
                           var48 = var47 + var46;
                           var0.field2555[var48] = var0.field2555[var48 - 1];
                           var0.field2555[var48 - 1] = var0.field2555[var48 - 2];
                           var0.field2555[var48 - 2] = var0.field2555[var48 - 3];
                           var0.field2555[var48 - 3] = var0.field2555[var48 - 4];
                        }

                        while(var46 > 0) {
                           var0.field2555[var47 + var46] = var0.field2555[var47 + var46 - 1];
                           --var46;
                        }

                        var0.field2555[var47] = var24;
                     } else {
                        var48 = var46 / 16;
                        int var49 = var46 % 16;
                        var47 = var0.field2556[var48] + var49;

                        for(var24 = var0.field2555[var47]; var47 > var0.field2556[var48]; --var47) {
                           var0.field2555[var47] = var0.field2555[var47 - 1];
                        }

                        ++var0.field2556[var48];

                        while(var48 > 0) {
                           --var0.field2556[var48];
                           var0.field2555[var0.field2556[var48]] = var0.field2555[var0.field2556[var48 - 1] + 16 - 1];
                           --var48;
                        }

                        --var0.field2556[0];
                        var0.field2555[var0.field2556[0]] = var24;
                        if (var0.field2556[0] == 0) {
                           var36 = 4095;

                           for(var37 = 15; var37 >= 0; --var37) {
                              for(var38 = 15; var38 >= 0; --var38) {
                                 var0.field2555[var36] = var0.field2555[var0.field2556[var37] + var38];
                                 --var36;
                              }

                              var0.field2556[var37] = var36 + 1;
                           }
                        }
                     }

                     ++var0.field2548[var0.field2538[var24 & 255] & 255];
                     class183.field2480[var39] = var0.field2538[var24 & 255] & 255;
                     ++var39;
                     if (var41 == 0) {
                        ++var52;
                        var41 = 50;
                        var40 = var0.field2557[var52];
                        var19 = var0.field2533[var40];
                        var20 = var0.field2549[var40];
                        var22 = var0.field2562[var40];
                        var21 = var0.field2561[var40];
                     }

                     --var41;
                     var42 = var19;

                     for(var43 = method3476(var19, var0); var43 > var20[var42]; var43 = var43 << 1 | var44) {
                        ++var42;
                        var44 = method3464(var0);
                     }

                     var45 = var22[var43 - var21[var42]];
                  } else {
                     var46 = -1;
                     var47 = 1;

                     do {
                        if (var45 == 0) {
                           var46 += var47;
                        } else if (var45 == 1) {
                           var46 += var47 * 2;
                        }

                        var47 *= 2;
                        if (var41 == 0) {
                           ++var52;
                           var41 = 50;
                           var40 = var0.field2557[var52];
                           var19 = var0.field2533[var40];
                           var20 = var0.field2549[var40];
                           var22 = var0.field2562[var40];
                           var21 = var0.field2561[var40];
                        }

                        --var41;
                        var42 = var19;

                        for(var43 = method3476(var19, var0); var43 > var20[var42]; var43 = var43 << 1 | var44) {
                           ++var42;
                           var44 = method3464(var0);
                        }

                        var45 = var22[var43 - var21[var42]];
                     } while(var45 == 0 || var45 == 1);

                     ++var46;
                     var24 = var0.field2538[var0.field2555[var0.field2556[0]] & 255];

                     for(var0.field2548[var24 & 255] += var46; var46 > 0; --var46) {
                        class183.field2480[var39] = var24 & 255;
                        ++var39;
                     }
                  }
               }

               var0.field2541 = 0;
               var0.field2540 = 0;
               var0.field2545[0] = 0;

               for(var25 = 1; var25 <= 256; ++var25) {
                  var0.field2545[var25] = var0.field2548[var25 - 1];
               }

               for(var25 = 1; var25 <= 256; ++var25) {
                  var0.field2545[var25] += var0.field2545[var25 - 1];
               }

               for(var25 = 0; var25 < var39; ++var25) {
                  var24 = (byte)(class183.field2480[var25] & 255);
                  class183.field2480[var0.field2545[var24 & 255]] |= var25 << 8;
                  ++var0.field2545[var24 & 255];
               }

               var0.field2554 = class183.field2480[var0.field2534] >> 8;
               var0.field2546 = 0;
               var0.field2554 = class183.field2480[var0.field2554];
               var0.field2547 = (byte)(var0.field2554 & 255);
               var0.field2554 >>= 8;
               ++var0.field2546;
               var0.field2564 = var39;
               method3461(var0);
               if (var0.field2564 + 1 == var0.field2546 && var0.field2541 == 0) {
                  var23 = true;
                  break;
               }

               var23 = false;
               break;
            }
         }

         return;
      }
   }

   static byte method3463(class193 var0) {
      return (byte)method3476(8, var0);
   }

   static int method3476(int var0, class193 var1) {
      while(var1.field2532 < var0) {
         var1.field2542 = var1.field2542 << 8 | var1.field2552[var1.field2535] & 255;
         var1.field2532 += 8;
         ++var1.field2535;
         ++var1.field2527;
         if (var1.field2527 == 0) {
            ;
         }
      }

      int var2 = var1.field2542 >> var1.field2532 - var0 & (1 << var0) - 1;
      var1.field2532 -= var0;
      return var2;
   }

   static byte method3464(class193 var0) {
      return (byte)method3476(1, var0);
   }

   static void method3468(class193 var0) {
      var0.field2563 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.field2543[var1]) {
            var0.field2538[var0.field2563] = (byte)var1;
            ++var0.field2563;
         }
      }

   }

   static void method3467(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      int var9;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            if (var8 == var3[var9]) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      var9 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var9 += var1[var8 + 1] - var1[var8];
         var0[var8] = var9 - 1;
         var9 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   static void method3461(class193 var0) {
      byte var1 = var0.field2540;
      int var2 = var0.field2541;
      int var3 = var0.field2546;
      int var4 = var0.field2547;
      int[] var5 = class183.field2480;
      int var6 = var0.field2554;
      byte[] var7 = var0.field2536;
      int var8 = var0.field2537;
      int var9 = var0.field2550;
      int var10 = var0.field2564 + 1;

      label65:
      while(true) {
         if (var2 > 0) {
            while(true) {
               if (var9 == 0) {
                  break label65;
               }

               if (var2 == 1) {
                  if (var9 == 0) {
                     var2 = 1;
                     break label65;
                  }

                  var7[var8] = var1;
                  ++var8;
                  --var9;
                  break;
               }

               var7[var8] = var1;
               --var2;
               ++var8;
               --var9;
            }
         }

         boolean var11 = true;

         byte var12;
         while(var11) {
            var11 = false;
            if (var3 == var10) {
               var2 = 0;
               break label65;
            }

            var1 = (byte)var4;
            var6 = var5[var6];
            var12 = (byte)(var6 & 255);
            var6 >>= 8;
            ++var3;
            if (var12 != var4) {
               var4 = var12;
               if (var9 == 0) {
                  var2 = 1;
                  break label65;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
               var11 = true;
            } else if (var3 == var10) {
               if (var9 == 0) {
                  var2 = 1;
                  break label65;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
               var11 = true;
            }
         }

         var2 = 2;
         var6 = var5[var6];
         var12 = (byte)(var6 & 255);
         var6 >>= 8;
         ++var3;
         if (var3 != var10) {
            if (var12 != var4) {
               var4 = var12;
            } else {
               var2 = 3;
               var6 = var5[var6];
               var12 = (byte)(var6 & 255);
               var6 >>= 8;
               ++var3;
               if (var3 != var10) {
                  if (var12 != var4) {
                     var4 = var12;
                  } else {
                     var6 = var5[var6];
                     var12 = (byte)(var6 & 255);
                     var6 >>= 8;
                     ++var3;
                     var2 = (var12 & 255) + 4;
                     var6 = var5[var6];
                     var4 = (byte)(var6 & 255);
                     var6 >>= 8;
                     ++var3;
                  }
               }
            }
         }
      }

      int var13 = var0.field2539;
      var0.field2539 += var9 - var9;
      if (var0.field2539 < var13) {
         ;
      }

      var0.field2540 = var1;
      var0.field2541 = var2;
      var0.field2546 = var3;
      var0.field2547 = var4;
      class183.field2480 = var5;
      var0.field2554 = var6;
      var0.field2536 = var7;
      var0.field2537 = var8;
      var0.field2550 = var9;
   }
}

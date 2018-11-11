public class class235 extends class216 {
   class214 field2762;
   byte[] field2761;

   class235(class194 var1) {
      var1.field2565 = var1.field2566.length - 3;
      int var2 = var1.getUByte(494334245);
      int var3 = var1.getUShort(-1208216487);
      int var4 = var2 * 10 + 14;
      var1.field2565 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      int var13;
      int var14;
      int var15;
      for(var13 = 0; var13 < var2; ++var13) {
         var14 = -1;

         while(true) {
            var15 = var1.getUByte(-869491887);
            if (var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if (var15 == 7) {
               break;
            }

            if (var15 == 23) {
               ++var5;
            } else if (var14 == 0) {
               ++var7;
            } else if (var14 == 1) {
               ++var8;
            } else if (var14 == 2) {
               ++var6;
            } else if (var14 == 3) {
               ++var9;
            } else if (var14 == 4) {
               ++var10;
            } else if (var14 == 5) {
               ++var11;
            } else {
               if (var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 += var5 * 5;
      var4 += (var7 + var8 + var6 + var9 + var11) * 2;
      var4 = var4 + var10 + var12;
      var13 = var1.field2565;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.method3536(1338749703);
      }

      var4 += var1.field2565 - var13;
      var15 = var1.field2565;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + var1.getUByte(-1708444624) & 127;
         if (var28 != 0 && var28 != 32) {
            if (var28 == 1) {
               ++var16;
            } else if (var28 == 33) {
               ++var17;
            } else if (var28 == 7) {
               ++var18;
            } else if (var28 == 39) {
               ++var19;
            } else if (var28 == 10) {
               ++var20;
            } else if (var28 == 42) {
               ++var21;
            } else if (var28 == 99) {
               ++var22;
            } else if (var28 == 98) {
               ++var23;
            } else if (var28 == 101) {
               ++var24;
            } else if (var28 == 100) {
               ++var25;
            } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = var1.field2565;
      var1.field2565 += var26;
      int var31 = var1.field2565;
      var1.field2565 += var11;
      int var32 = var1.field2565;
      var1.field2565 += var10;
      int var33 = var1.field2565;
      var1.field2565 += var9;
      int var34 = var1.field2565;
      var1.field2565 += var16;
      int var35 = var1.field2565;
      var1.field2565 += var18;
      int var36 = var1.field2565;
      var1.field2565 += var20;
      int var37 = var1.field2565;
      var1.field2565 += var7 + var8 + var11;
      int var38 = var1.field2565;
      var1.field2565 += var7;
      int var39 = var1.field2565;
      var1.field2565 += var27;
      int var40 = var1.field2565;
      var1.field2565 += var8;
      int var41 = var1.field2565;
      var1.field2565 += var17;
      int var42 = var1.field2565;
      var1.field2565 += var19;
      int var43 = var1.field2565;
      var1.field2565 += var21;
      int var44 = var1.field2565;
      var1.field2565 += var12;
      int var45 = var1.field2565;
      var1.field2565 += var9;
      int var46 = var1.field2565;
      var1.field2565 += var22;
      int var47 = var1.field2565;
      var1.field2565 += var23;
      int var48 = var1.field2565;
      var1.field2565 += var24;
      int var49 = var1.field2565;
      var1.field2565 += var25;
      int var50 = var1.field2565;
      var1.field2565 += var5 * 3;
      this.field2761 = new byte[var4];
      class194 var51 = new class194(this.field2761);
      var51.addInt(1297377380, (byte)42);
      var51.addInt(6, (byte)126);
      var51.addShort(var2 > 1 ? 1 : 0, 2065255249);
      var51.addShort(var2, 244410323);
      var51.addShort(var3, -12492932);
      var1.field2565 = var13;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;

      label222:
      for(int var60 = 0; var60 < var2; ++var60) {
         var51.addInt(1297379947, (byte)8);
         var51.field2565 += 4;
         int var61 = var51.field2565;
         int var62 = -1;

         while(true) {
            while(true) {
               int var63 = var1.method3536(-1963331319);
               var51.method3518(var63, 999914319);
               int var64 = var1.field2566[var29++] & 255;
               boolean var65 = var64 != var62;
               var62 = var64 & 15;
               if (var64 == 7) {
                  if (var65) {
                     var51.addByte(255, (byte)-18);
                  }

                  var51.addByte(47, (byte)-115);
                  var51.addByte(0, (byte)-41);
                  var51.setInt(var51.field2565 - var61, (byte)70);
                  continue label222;
               }

               if (var64 == 23) {
                  if (var65) {
                     var51.addByte(255, (byte)-123);
                  }

                  var51.addByte(81, (byte)-58);
                  var51.addByte(3, (byte)-107);
                  var51.addByte(var1.field2566[var50++], (byte)-108);
                  var51.addByte(var1.field2566[var50++], (byte)-89);
                  var51.addByte(var1.field2566[var50++], (byte)-74);
               } else {
                  var52 ^= var64 >> 4;
                  if (var62 == 0) {
                     if (var65) {
                        var51.addByte(var52 + 144, (byte)-59);
                     }

                     var53 += var1.field2566[var37++];
                     var54 += var1.field2566[var38++];
                     var51.addByte(var53 & 127, (byte)-61);
                     var51.addByte(var54 & 127, (byte)-94);
                  } else if (var62 == 1) {
                     if (var65) {
                        var51.addByte(var52 + 128, (byte)-118);
                     }

                     var53 += var1.field2566[var37++];
                     var55 += var1.field2566[var40++];
                     var51.addByte(var53 & 127, (byte)-69);
                     var51.addByte(var55 & 127, (byte)-116);
                  } else if (var62 == 2) {
                     if (var65) {
                        var51.addByte(var52 + 176, (byte)-119);
                     }

                     var28 = var28 + var1.field2566[var15++] & 127;
                     var51.addByte(var28, (byte)-120);
                     byte var66;
                     if (var28 != 0 && var28 != 32) {
                        if (var28 == 1) {
                           var66 = var1.field2566[var34++];
                        } else if (var28 == 33) {
                           var66 = var1.field2566[var41++];
                        } else if (var28 == 7) {
                           var66 = var1.field2566[var35++];
                        } else if (var28 == 39) {
                           var66 = var1.field2566[var42++];
                        } else if (var28 == 10) {
                           var66 = var1.field2566[var36++];
                        } else if (var28 == 42) {
                           var66 = var1.field2566[var43++];
                        } else if (var28 == 99) {
                           var66 = var1.field2566[var46++];
                        } else if (var28 == 98) {
                           var66 = var1.field2566[var47++];
                        } else if (var28 == 101) {
                           var66 = var1.field2566[var48++];
                        } else if (var28 == 100) {
                           var66 = var1.field2566[var49++];
                        } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                           var66 = var1.field2566[var39++];
                        } else {
                           var66 = var1.field2566[var30++];
                        }
                     } else {
                        var66 = var1.field2566[var44++];
                     }

                     int var67 = var66 + var59[var28];
                     var59[var28] = var67;
                     var51.addByte(var67 & 127, (byte)-83);
                  } else if (var62 == 3) {
                     if (var65) {
                        var51.addByte(var52 + 224, (byte)-5);
                     }

                     var56 += var1.field2566[var45++];
                     var56 += var1.field2566[var33++] << 7;
                     var51.addByte(var56 & 127, (byte)-83);
                     var51.addByte(var56 >> 7 & 127, (byte)-64);
                  } else if (var62 == 4) {
                     if (var65) {
                        var51.addByte(var52 + 208, (byte)-56);
                     }

                     var57 += var1.field2566[var32++];
                     var51.addByte(var57 & 127, (byte)-15);
                  } else if (var62 == 5) {
                     if (var65) {
                        var51.addByte(var52 + 160, (byte)-93);
                     }

                     var53 += var1.field2566[var37++];
                     var58 += var1.field2566[var31++];
                     var51.addByte(var53 & 127, (byte)-72);
                     var51.addByte(var58 & 127, (byte)-124);
                  } else {
                     if (var62 != 6) {
                        throw new RuntimeException();
                     }

                     if (var65) {
                        var51.addByte(var52 + 192, (byte)-13);
                     }

                     var51.addByte(var1.field2566[var44++], (byte)-65);
                  }
               }
            }
         }
      }

   }

   void method4370() {
      if (this.field2762 == null) {
         this.field2762 = new class214(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         class232 var3 = new class232(this.field2761);
         int var4 = var3.method4278();

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            var3.method4268(var5);
            var3.method4271(var5);
            var3.method4269(var5);
         }

         label56:
         do {
            while(true) {
               var5 = var3.method4267();
               int var6 = var3.field2739[var5];

               while(var6 == var3.field2739[var5]) {
                  var3.method4268(var5);
                  int var7 = var3.method4293(var5);
                  if (var7 == 1) {
                     var3.method4270();
                     var3.method4269(var5);
                     continue label56;
                  }

                  int var8 = var7 & 240;
                  int var9;
                  int var10;
                  int var11;
                  if (var8 == 176) {
                     var9 = var7 & 15;
                     var10 = var7 >> 8 & 127;
                     var11 = var7 >> 16 & 127;
                     if (var10 == 0) {
                        var1[var9] = (var11 << 14) + (var1[var9] & -2080769);
                     }

                     if (var10 == 32) {
                        var1[var9] = (var1[var9] & -16257) + (var11 << 7);
                     }
                  }

                  if (var8 == 192) {
                     var9 = var7 & 15;
                     var10 = var7 >> 8 & 127;
                     var2[var9] = var10 + var1[var9];
                  }

                  if (var8 == 144) {
                     var9 = var7 & 15;
                     var10 = var7 >> 8 & 127;
                     var11 = var7 >> 16 & 127;
                     if (var11 > 0) {
                        int var12 = var2[var9];
                        class225 var13 = (class225)this.field2762.method3981((long)var12);
                        if (var13 == null) {
                           var13 = new class225(new byte[128]);
                           this.field2762.method3972(var13, (long)var12);
                        }

                        var13.field2661[var10] = 1;
                     }
                  }

                  var3.method4271(var5);
                  var3.method4269(var5);
               }
            }
         } while(!var3.method4277());
      }

   }

   void method4361() {
      this.field2762 = null;
   }

   public static class235 method4363(class261 var0, int var1, int var2) {
      byte[] var3 = var0.method4551(var1, var2, 58322538);
      return var3 == null ? null : new class235(new class194(var3));
   }
}

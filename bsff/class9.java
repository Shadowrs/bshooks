public abstract class class9 extends class216 {
   static client field239;

   abstract void vmethod63(int var1);

   static final void method61(int var0, int var1, int var2, boolean var3, int var4) {
      if (class305.method5452(var0, -1009820586)) {
         class130.method2679(class189.field2519[var0], -1, var1, var2, var3, -1589097289);
      }

   }

   static final void method58(class183 var0, int var1) {
      class201 var2 = client.field902.field1476;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      if (class183.field2489 == var0) {
         var3 = var2.getUByte(-433149598);
         var10 = (var3 >> 4 & 7) + class42.field533;
         var4 = (var3 & 7) + class59.field673;
         var5 = var2.getUShort128(872259248);
         var6 = var2.getUByte(-1866147657);
         var7 = var6 >> 2;
         var8 = var6 & 3;
         var9 = client.field1058[var7];
         if (var10 >= 0 && var4 >= 0 && var10 < 103 && var4 < 103) {
            if (var9 == 0) {
               class140 var12 = class308.field3867.method2996(class237.field2769, var10, var4);
               if (var12 != null) {
                  var11 = var12.field2050 >> 14 & 32767;
                  if (var7 == 2) {
                     var12.field2049 = new class97(var11, 2, var8 + 4, class237.field2769, var10, var4, var5, false, var12.field2049);
                     var12.field2044 = new class97(var11, 2, var8 + 1 & 3, class237.field2769, var10, var4, var5, false, var12.field2044);
                  } else {
                     var12.field2049 = new class97(var11, var7, var8, class237.field2769, var10, var4, var5, false, var12.field2049);
                  }
               }
            }

            if (var9 == 1) {
               class145 var34 = class308.field3867.method2899(class237.field2769, var10, var4);
               if (var34 != null) {
                  var11 = var34.field2093 >> 14 & 32767;
                  if (var7 != 4 && var7 != 5) {
                     if (var7 == 6) {
                        var34.field2085 = new class97(var11, 4, var8 + 4, class237.field2769, var10, var4, var5, false, var34.field2085);
                     } else if (var7 == 7) {
                        var34.field2085 = new class97(var11, 4, (var8 + 2 & 3) + 4, class237.field2769, var10, var4, var5, false, var34.field2085);
                     } else if (var7 == 8) {
                        var34.field2085 = new class97(var11, 4, var8 + 4, class237.field2769, var10, var4, var5, false, var34.field2085);
                        var34.field2092 = new class97(var11, 4, (var8 + 2 & 3) + 4, class237.field2769, var10, var4, var5, false, var34.field2092);
                     }
                  } else {
                     var34.field2085 = new class97(var11, 4, var8, class237.field2769, var10, var4, var5, false, var34.field2085);
                  }
               }
            }

            if (var9 == 2) {
               class146 var35 = class308.field3867.method2900(class237.field2769, var10, var4);
               if (var7 == 11) {
                  var7 = 10;
               }

               if (var35 != null) {
                  var35.field2109 = new class97(var35.field2110 >> 14 & 32767, var7, var8, class237.field2769, var10, var4, var5, false, var35.field2109);
               }
            }

            if (var9 == 3) {
               class127 var36 = class308.field3867.method2901(class237.field2769, var10, var4);
               if (var36 != null) {
                  var36.field1783 = new class97(var36.field1780 >> 14 & 32767, 22, var8, class237.field2769, var10, var4, var5, false, var36.field1783);
               }
            }
         }
      } else {
         int var13;
         int var14;
         int var15;
         byte var16;
         byte var17;
         int var37;
         if (class183.field2487 == var0) {
            var3 = var2.getUShort(-1208216487);
            var16 = var2.getByte(219995152);
            var4 = var2.getUReversedByte((byte)108);
            var5 = var4 >> 2;
            var6 = var4 & 3;
            var7 = client.field1058[var5];
            var8 = var2.getUByte128(-1639873121);
            var9 = (var8 >> 4 & 7) + class42.field533;
            var37 = (var8 & 7) + class59.field673;
            var17 = var2.getReversedByte(518724032);
            var13 = var2.getUShort(-1208216487);
            var14 = var2.getUShortLE(-1114400981);
            var15 = var2.getUShortLE(-1114400981);
            byte var18 = var2.get128Byte((byte)64);
            byte var19 = var2.getReversedByte(518724032);
            class72 var20;
            if (var14 == client.field1000) {
               var20 = class12.field259;
            } else {
               var20 = client.field971[var14];
            }

            if (var20 != null) {
               class282 var21 = class260.method4546(var15, -1625834110);
               int var22;
               int var23;
               if (var6 != 1 && var6 != 3) {
                  var22 = var21.field3601;
                  var23 = var21.field3602;
               } else {
                  var22 = var21.field3602;
                  var23 = var21.field3601;
               }

               int var24 = var9 + (var22 >> 1);
               int var25 = var9 + (var22 + 1 >> 1);
               int var26 = var37 + (var23 >> 1);
               int var27 = var37 + (var23 + 1 >> 1);
               int[][] var28 = class62.field728[class237.field2769];
               int var29 = var28[var25][var27] + var28[var24][var26] + var28[var25][var26] + var28[var24][var27] >> 2;
               int var30 = (var9 << 7) + (var22 << 6);
               int var31 = (var37 << 7) + (var23 << 6);
               class131 var32 = var21.method5005(var5, var6, var28, var30, var29, var31, 325447528);
               if (var32 != null) {
                  class231.method4260(class237.field2769, var9, var37, var7, -1, 0, 0, var13 + 1, var3 + 1, -2034954348);
                  var20.field844 = var13 + client.field866;
                  var20.field829 = var3 + client.field866;
                  var20.field834 = var32;
                  var20.field831 = var9 * 128 + var22 * 64;
                  var20.field833 = var37 * 128 + var23 * 64;
                  var20.field821 = var29;
                  byte var33;
                  if (var16 > var18) {
                     var33 = var16;
                     var16 = var18;
                     var18 = var33;
                  }

                  if (var19 > var17) {
                     var33 = var19;
                     var19 = var17;
                     var17 = var33;
                  }

                  var20.field835 = var9 + var16;
                  var20.field848 = var9 + var18;
                  var20.field826 = var37 + var19;
                  var20.field838 = var37 + var17;
               }
            }
         }

         if (class183.field2481 == var0) {
            var3 = var2.getUShortLE128(-1914378692);
            var10 = var2.getUReversedByte((byte)113);
            var4 = (var10 >> 4 & 7) + class42.field533;
            var5 = (var10 & 7) + class59.field673;
            var6 = var2.getUByte128(-2029521589);
            var7 = var2.getUShortLE(-1114400981);
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               var4 = var4 * 128 + 64;
               var5 = var5 * 128 + 64;
               class82 var38 = new class82(var3, class237.field2769, var4, var5, class5.method16(var4, var5, class237.field2769, -1453085921) - var6, var7, client.field866);
               client.field977.method4020(var38);
            }
         } else if (class183.field2482 == var0) {
            var3 = var2.getUReversedByte((byte)95);
            var10 = (var3 >> 4 & 7) + class42.field533;
            var4 = (var3 & 7) + class59.field673;
            var5 = var2.getUShortLE128(-646324308);
            var6 = var2.getUShortLE(-1114400981);
            var7 = var2.getUShort(-1208216487);
            if (var10 >= 0 && var4 >= 0 && var10 < 104 && var4 < 104) {
               class217 var39 = client.field983[class237.field2769][var10][var4];
               if (var39 != null) {
                  for(class92 var40 = (class92)var39.method4027(); var40 != null; var40 = (class92)var39.method4026()) {
                     if ((var7 & 32767) == var40.field1404 && var5 == var40.field1405) {
                        var40.field1405 = var6;
                        break;
                     }
                  }

                  class12.method82(var10, var4, -1552408928);
               }
            }
         } else {
            if (class183.field2488 == var0) {
               var3 = var2.getU128Byte((byte)-91);
               var10 = (var3 >> 4 & 7) + class42.field533;
               var4 = (var3 & 7) + class59.field673;
               var5 = var2.getUByte128(1428750790);
               var6 = var2.getUShort(-1208216487);
               var7 = var2.getUByte(677383215);
               var8 = var7 >> 4 & 15;
               var9 = var7 & 7;
               if (var10 >= 0 && var4 >= 0 && var10 < 104 && var4 < 104) {
                  var37 = var8 + 1;
                  if (class12.field259.field1188[0] >= var10 - var37 && class12.field259.field1188[0] <= var37 + var10 && class12.field259.field1206[0] >= var4 - var37 && class12.field259.field1206[0] <= var37 + var4 && client.field1034 != 0 && var9 > 0 && client.field1093 < 50) {
                     client.field885[client.field1093] = var6;
                     client.field919[client.field1093] = var9;
                     client.field1096[client.field1093] = var5;
                     client.field1098[client.field1093] = null;
                     client.field1097[client.field1093] = var8 + (var4 << 8) + (var10 << 16);
                     ++client.field1093;
                  }
               }
            }

            if (class183.field2485 == var0) {
               var16 = var2.get128Byte((byte)49);
               var10 = var2.getU128Byte((byte)-78) * 4;
               var4 = var2.getShortLE(883238168);
               var5 = var2.getU128Byte((byte)-67);
               var6 = (var5 >> 4 & 7) + class42.field533;
               var7 = (var5 & 7) + class59.field673;
               var8 = var2.getUByte(-2077220167);
               var9 = var2.getUByte(-1171040499) * 4;
               var37 = var2.getUByte(124273200);
               var11 = var2.getUShortLE128(-1722283000);
               var17 = var2.getByte128(847182371);
               var14 = var2.getUShort(-1208216487);
               var15 = var2.getUShort(-1208216487);
               var3 = var16 + var6;
               var13 = var17 + var7;
               if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var3 >= 0 && var13 >= 0 && var3 < 104 && var13 < 104 && var15 != 65535) {
                  var6 = var6 * 128 + 64;
                  var7 = var7 * 128 + 64;
                  var3 = var3 * 128 + 64;
                  var13 = var13 * 128 + 64;
                  class91 var42 = new class91(var15, class237.field2769, var6, var7, class5.method16(var6, var7, class237.field2769, -1453085921) - var9, var11 + client.field866, var14 + client.field866, var8, var37, var4, var10);
                  var42.method1913(var3, var13, class5.method16(var3, var13, class237.field2769, -1453085921) - var10, var11 + client.field866, (byte)21);
                  client.field985.method4020(var42);
               }
            } else {
               class92 var41;
               if (class183.field2486 == var0) {
                  var3 = var2.getUShort128(597229880);
                  var10 = var2.getUShortLE128(-1498222106);
                  var4 = var2.getUReversedByte((byte)123);
                  var5 = (var4 >> 4 & 7) + class42.field533;
                  var6 = (var4 & 7) + class59.field673;
                  if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                     var41 = new class92();
                     var41.field1404 = var3;
                     var41.field1405 = var10;
                     if (client.field983[class237.field2769][var5][var6] == null) {
                        client.field983[class237.field2769][var5][var6] = new class217();
                     }

                     client.field983[class237.field2769][var5][var6].method4020(var41);
                     class12.method82(var5, var6, -1691543402);
                  }
               } else if (class183.field2484 == var0) {
                  var3 = var2.getUByte128(1813074299);
                  var10 = (var3 >> 4 & 7) + class42.field533;
                  var4 = (var3 & 7) + class59.field673;
                  var5 = var2.getUReversedByte((byte)106);
                  var6 = var5 >> 2;
                  var7 = var5 & 3;
                  var8 = client.field1058[var6];
                  if (var10 >= 0 && var4 >= 0 && var10 < 104 && var4 < 104) {
                     class231.method4260(class237.field2769, var10, var4, var8, -1, var6, var7, 0, -1, -337417163);
                  }
               } else if (class183.field2490 == var0) {
                  var3 = var2.getUByte128(-990312861);
                  var10 = (var3 >> 4 & 7) + class42.field533;
                  var4 = (var3 & 7) + class59.field673;
                  var5 = var2.getUShortLE128(-11658027);
                  var6 = var2.getU128Byte((byte)-42);
                  var7 = var6 >> 2;
                  var8 = var6 & 3;
                  var9 = client.field1058[var7];
                  if (var10 >= 0 && var4 >= 0 && var10 < 104 && var4 < 104) {
                     class231.method4260(class237.field2769, var10, var4, var9, var5, var7, var8, 0, -1, -1553941051);
                  }
               } else if (class183.field2483 == var0) {
                  var3 = var2.getUShort128(-168263218);
                  var10 = var2.getUReversedByte((byte)123);
                  var4 = (var10 >> 4 & 7) + class42.field533;
                  var5 = (var10 & 7) + class59.field673;
                  if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                     class217 var43 = client.field983[class237.field2769][var4][var5];
                     if (var43 != null) {
                        for(var41 = (class92)var43.method4027(); var41 != null; var41 = (class92)var43.method4026()) {
                           if ((var3 & 32767) == var41.field1404) {
                              var41.method4014();
                              break;
                           }
                        }

                        if (var43.method4027() == null) {
                           client.field983[class237.field2769][var4][var5] = null;
                        }

                        class12.method82(var4, var5, -519106556);
                     }
                  }
               }
            }
         }
      }

   }

   static void method57(byte var0) {
      class35.field470.method3954();
      class35.field458.method3954();
   }

   public static void method60(class261 var0, class261 var1, class261 var2, class261 var3, int var4) {
      class17.field295 = var0;
      class242.field2805 = var1;
      class242.field2917 = var2;
      class242.field2807 = var3;
      class189.field2519 = new class242[class17.field295.method4565(-69437090)][];
      class314.field3913 = new boolean[class17.field295.method4565(-934357757)];
   }

   static int method53(int var0, class96 var1, boolean var2, int var3) {
      int var4;
      int var5;
      class242 var7;
      if (var0 == 100) {
         class135.field1964 -= 3;
         var4 = class81.field1272[class135.field1964];
         var5 = class81.field1272[class135.field1964 + 1];
         int var10 = class81.field1272[class135.field1964 + 2];
         if (var5 == 0) {
            throw new RuntimeException();
         } else {
            var7 = class3.method2(var4, 2052488542);
            if (var7.field2938 == null) {
               var7.field2938 = new class242[var10 + 1];
            }

            if (var7.field2938.length <= var10) {
               class242[] var8 = new class242[var10 + 1];

               for(int var9 = 0; var9 < var7.field2938.length; ++var9) {
                  var8[var9] = var7.field2938[var9];
               }

               var7.field2938 = var8;
            }

            if (var10 > 0 && var7.field2938[var10 - 1] == null) {
               throw new RuntimeException("" + (var10 - 1));
            } else {
               class242 var11 = new class242();
               var11.field2850 = var5;
               var11.field2885 = var11.field2814 = var7.field2814;
               var11.field2815 = var10;
               var11.field2813 = true;
               var7.field2938[var10] = var11;
               if (var2) {
                  class336.field4073 = var11;
               } else {
                  class61.field713 = var11;
               }

               class30.method274(var7, -1620319874);
               return 1;
            }
         }
      } else {
         class242 var6;
         if (var0 == 101) {
            var6 = var2 ? class336.field4073 : class61.field713;
            var7 = class3.method2(var6.field2814, 2090279313);
            var7.field2938[var6.field2815] = null;
            class30.method274(var7, -921762045);
            return 1;
         } else if (var0 == 102) {
            var6 = class3.method2(class81.field1272[--class135.field1964], 2140181255);
            var6.field2938 = null;
            class30.method274(var6, 2121836933);
            return 1;
         } else if (var0 != 200) {
            if (var0 == 201) {
               var6 = class3.method2(class81.field1272[--class135.field1964], 2121554713);
               if (var6 != null) {
                  class81.field1272[++class135.field1964 - 1] = 1;
                  if (var2) {
                     class336.field4073 = var6;
                  } else {
                     class61.field713 = var6;
                  }
               } else {
                  class81.field1272[++class135.field1964 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class135.field1964 -= 2;
            var4 = class81.field1272[class135.field1964];
            var5 = class81.field1272[class135.field1964 + 1];
            var7 = class181.method3420(var4, var5, 455212239);
            if (var7 != null && var5 != -1) {
               class81.field1272[++class135.field1964 - 1] = 1;
               if (var2) {
                  class336.field4073 = var7;
               } else {
                  class61.field713 = var7;
               }
            } else {
               class81.field1272[++class135.field1964 - 1] = 0;
            }

            return 1;
         }
      }
   }
}

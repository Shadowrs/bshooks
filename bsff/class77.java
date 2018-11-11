public class class77 {
   static int field1222 = 0;
   static int field1223 = 0;
   static int[] field1224 = new int[]{1, 1, 1, 1};
   static int[] field1220 = new int[]{0, 1, 2, 3};
   static int field1233;
   int field1218;
   int field1232;
   int field1228;
   String field1227;
   int field1230;
   String field1225;
   int field1231;

   boolean method1614(int var1) {
      return (1 & this.field1218) != 0;
   }

   boolean method1613(int var1) {
      return (33554432 & this.field1218) != 0;
   }

   boolean method1612(int var1) {
      return (536870912 & this.field1218) != 0;
   }

   boolean method1610(int var1) {
      return (4 & this.field1218) != 0;
   }

   boolean method1624(byte var1) {
      return (8 & this.field1218) != 0;
   }

   boolean method1609(byte var1) {
      return (2 & this.field1218) != 0;
   }

   static final void method1643(int var0) {
      for(int var1 = 0; var1 < client.field898; ++var1) {
         int var2 = client.field899[var1];
         class84 var3 = client.field897[var2];
         if (var3 != null) {
            class30.method300(var3, var3.field1300.field3702, 1211234871);
         }
      }

   }

   static final void method1644(class75 var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      if (var0 != null && var0.vmethod1824(1348015434)) {
         if (var0 instanceof class84) {
            class285 var7 = ((class84)var0).field1300;
            if (var7.field3718 != null) {
               var7 = var7.method5136(1517721565);
            }

            if (var7 == null) {
               return;
            }
         }

         int var78 = class93.field1414;
         int[] var8 = class93.field1415;
         byte var9 = 0;
         class72 var10;
         if (var1 < var78 && var0.field1154 == client.field866) {
            var10 = (class72)var0;
            boolean var11;
            if (client.field975 == 0) {
               var11 = false;
            } else if (var10 != class12.field259) {
               boolean var12 = (client.field975 & 4) != 0;
               boolean var13 = var12;
               boolean var14;
               if (!var12) {
                  var14 = (client.field975 & 1) != 0;
                  var13 = var14 && var10.method1141(-2042767576);
               }

               var14 = var13;
               if (!var13) {
                  boolean var15 = (client.field975 & 2) != 0;
                  var14 = var15 && var10.method1144(1411388525);
               }

               var11 = var14;
            } else {
               var11 = class237.method4379((byte)121);
            }

            if (var11) {
               class72 var80 = (class72)var0;
               if (var1 < var78) {
                  class107.method2240(var0, var0.field1200 + 15, (byte)100);
                  class312 var82 = (class312)client.field907.get(class309.field3874);
                  byte var85 = 9;
                  var82.method5524(var80.field823.method5436(-2018503401), var2 + client.field954, var3 + client.field864 - var85, 16777215, 0);
                  var9 = 18;
               }
            }
         }

         int var79 = -2;
         int var25;
         int var26;
         int var81;
         int var83;
         int var86;
         if (!var0.field1175.method4002()) {
            class107.method2240(var0, var0.field1200 + 15, (byte)31);

            for(class83 var84 = (class83)var0.field1175.method3988(); var84 != null; var84 = (class83)var0.field1175.method4003()) {
               class76 var16 = var84.method1811(client.field866, 445097597);
               if (var16 == null) {
                  if (var84.method1810((short)-17630)) {
                     var84.method4014();
                  }
               } else {
                  class275 var17 = var84.field1297;
                  class331 var18 = var17.method4873((byte)0);
                  class331 var19 = var17.method4860((byte)69);
                  int var20 = 0;
                  if (var18 != null && var19 != null) {
                     if (var17.field3528 * 2 < var19.field3978) {
                        var20 = var17.field3528;
                     }

                     var81 = var19.field3978 - var20 * 2;
                  } else {
                     var81 = var17.field3527;
                  }

                  int var21 = 255;
                  boolean var22 = true;
                  int var23 = client.field866 - var16.field1217;
                  int var24 = var81 * var16.field1213 / var17.field3527;
                  if (var16.field1211 > var23) {
                     var25 = var17.field3517 == 0 ? 0 : var17.field3517 * (var23 / var17.field3517);
                     var83 = var81 * var16.field1212 / var17.field3527;
                     var26 = var25 * (var24 - var83) / var16.field1211 + var83;
                  } else {
                     var26 = var24;
                     var25 = var17.field3524 + var16.field1211 - var23;
                     if (var17.field3522 >= 0) {
                        var21 = (var25 << 8) / (var17.field3524 - var17.field3522);
                     }
                  }

                  if (var16.field1213 > 0 && var26 < 1) {
                     var26 = 1;
                  }

                  if (var18 != null && var19 != null) {
                     if (var26 == var81) {
                        var26 += var20 * 2;
                     } else {
                        var26 += var20;
                     }

                     var25 = var18.field3979;
                     var79 += var25;
                     var83 = var2 + client.field954 - (var81 >> 1);
                     var86 = var3 + client.field864 - var79;
                     var83 -= var20;
                     if (var21 >= 0 && var21 < 255) {
                        var18.method5875(var83, var86, var21);
                        class327.method5734(var83, var86, var83 + var26, var86 + var25);
                        var19.method5875(var83, var86, var21);
                     } else {
                        var18.method5865(var83, var86);
                        class327.method5734(var83, var86, var83 + var26, var25 + var86);
                        var19.method5865(var83, var86);
                     }

                     class327.method5733(var2, var3, var2 + var4, var3 + var5);
                     var79 += 2;
                  } else {
                     var79 += 5;
                     if (client.field954 > -1) {
                        var25 = var2 + client.field954 - (var81 >> 1);
                        var83 = var3 + client.field864 - var79;
                        class327.method5810(var25, var83, var26, 5, 65280);
                        class327.method5810(var25 + var26, var83, var81 - var26, 5, 16711680);
                     }

                     var79 += 2;
                  }
               }
            }
         }

         if (var79 == -2) {
            var79 += 7;
         }

         var79 += var9;
         if (var1 < var78) {
            var10 = (class72)var0;
            if (var10.field836) {
               return;
            }

            if (var10.field822 != -1 || var10.field830 != -1) {
               class107.method2240(var0, var0.field1200 + 15, (byte)73);
               if (client.field954 > -1) {
                  if (var10.field822 != -1) {
                     var79 += 25;
                     class20.field317[var10.field822].method5865(var2 + client.field954 - 12, var3 + client.field864 - var79);
                  }

                  if (var10.field830 != -1) {
                     var79 += 25;
                     class86.field1310[var10.field830].method5865(var2 + client.field954 - 12, var3 + client.field864 - var79);
                  }
               }
            }

            if (var1 >= 0 && client.field874 == 10 && var8[var1] == client.field1036) {
               class107.method2240(var0, var0.field1200 + 15, (byte)-25);
               if (client.field954 > -1) {
                  var79 += class47.field569[1].field3979;
                  class47.field569[1].method5865(var2 + client.field954 - 12, var3 + client.field864 - var79);
               }
            }
         } else {
            class285 var87 = ((class84)var0).field1300;
            if (var87.field3718 != null) {
               var87 = var87.method5136(389910679);
            }

            if (var87.field3724 >= 0 && var87.field3724 < class86.field1310.length) {
               class107.method2240(var0, var0.field1200 + 15, (byte)-56);
               if (client.field954 > -1) {
                  class86.field1310[var87.field3724].method5865(var2 + client.field954 - 12, var3 + client.field864 - 30);
               }
            }

            if (client.field874 == 1 && client.field899[var1 - var78] == client.field875 && client.field866 % 20 < 10) {
               class107.method2240(var0, var0.field1200 + 15, (byte)37);
               if (client.field954 > -1) {
                  class47.field569[0].method5865(var2 + client.field954 - 12, var3 + client.field864 - 28);
               }
            }
         }

         if (var0.field1152 != null && (var1 >= var78 || !var0.field1179 && (client.field1071 == 4 || !var0.field1167 && (client.field1071 == 0 || client.field1071 == 3 || client.field1071 == 1 && ((class72)var0).method1141(-2062035295))))) {
            class107.method2240(var0, var0.field1200, (byte)-37);
            if (client.field954 > -1 && client.field942 < client.field962) {
               client.field947[client.field942] = class228.field2676.method5590(var0.field1152) / 2;
               client.field946[client.field942] = class228.field2676.field3891;
               client.field944[client.field942] = client.field954;
               client.field945[client.field942] = client.field864;
               client.field1073[client.field942] = var0.field1207;
               client.field984[client.field942] = var0.field1168;
               client.field950[client.field942] = var0.field1166;
               client.field951[client.field942] = var0.field1152;
               ++client.field942;
            }
         }

         for(int var89 = 0; var89 < 4; ++var89) {
            int var88 = var0.field1205[var89];
            int var90 = var0.field1170[var89];
            class281 var91 = null;
            int var92 = 0;
            if (var90 >= 0) {
               if (var88 <= client.field866) {
                  continue;
               }

               var91 = class8.method49(var0.field1170[var89], (byte)73);
               var92 = var91.field3572;
               if (var91 != null && var91.field3569 != null) {
                  var91 = var91.method4993(-367203073);
                  if (var91 == null) {
                     var0.field1205[var89] = -1;
                     continue;
                  }
               }
            } else if (var88 < 0) {
               continue;
            }

            var81 = var0.field1150[var89];
            class281 var93 = null;
            if (var81 >= 0) {
               var93 = class8.method49(var81, (byte)116);
               if (var93 != null && var93.field3569 != null) {
                  var93 = var93.method4993(-367203073);
               }
            }

            if (var88 - var92 <= client.field866) {
               if (var91 == null) {
                  var0.field1205[var89] = -1;
               } else {
                  class107.method2240(var0, var0.field1200 / 2, (byte)19);
                  if (client.field954 > -1) {
                     if (var89 == 1) {
                        client.field864 -= 20;
                     }

                     if (var89 == 2) {
                        client.field954 -= 15;
                        client.field864 -= 10;
                     }

                     if (var89 == 3) {
                        client.field954 += 15;
                        client.field864 -= 10;
                     }

                     class331 var94 = null;
                     class331 var95 = null;
                     class331 var96 = null;
                     class331 var97 = null;
                     var83 = 0;
                     var86 = 0;
                     var25 = 0;
                     var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     class331 var31 = null;
                     class331 var32 = null;
                     class331 var33 = null;
                     class331 var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var94 = var91.method4988(805969697);
                     int var44;
                     if (var94 != null) {
                        var83 = var94.field3978;
                        var44 = var94.field3979;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var27 = var94.field3980;
                     }

                     var95 = var91.method4983(-265034843);
                     if (var95 != null) {
                        var86 = var95.field3978;
                        var44 = var95.field3979;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var28 = var95.field3980;
                     }

                     var96 = var91.method4968(962141704);
                     if (var96 != null) {
                        var25 = var96.field3978;
                        var44 = var96.field3979;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var29 = var96.field3980;
                     }

                     var97 = var91.method4969((byte)3);
                     if (var97 != null) {
                        var26 = var97.field3978;
                        var44 = var97.field3979;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var30 = var97.field3980;
                     }

                     if (var93 != null) {
                        var31 = var93.method4988(-1122582435);
                        if (var31 != null) {
                           var35 = var31.field3978;
                           var44 = var31.field3979;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var39 = var31.field3980;
                        }

                        var32 = var93.method4983(2121653655);
                        if (var32 != null) {
                           var36 = var32.field3978;
                           var44 = var32.field3979;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.field3980;
                        }

                        var33 = var93.method4968(1411817477);
                        if (var33 != null) {
                           var37 = var33.field3978;
                           var44 = var33.field3979;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var41 = var33.field3980;
                        }

                        var34 = var93.method4969((byte)3);
                        if (var34 != null) {
                           var38 = var34.field3978;
                           var44 = var34.field3979;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.field3980;
                        }
                     }

                     class311 var45 = var91.method4984(2031625934);
                     if (var45 == null) {
                        var45 = class2.field15;
                     }

                     class311 var46;
                     if (var93 != null) {
                        var46 = var93.method4984(2098057983);
                        if (var46 == null) {
                           var46 = class2.field15;
                        }
                     } else {
                        var46 = class2.field15;
                     }

                     String var47 = null;
                     String var48 = null;
                     boolean var49 = false;
                     int var50 = 0;
                     var47 = var91.method4965(var0.field1171[var89], 340668312);
                     int var51 = var45.method5590(var47);
                     if (var93 != null) {
                        var48 = var93.method4965(var0.field1174[var89], -471065568);
                        var50 = var46.method5590(var48);
                     }

                     int var52 = 0;
                     int var53 = 0;
                     if (var86 > 0) {
                        if (var96 == null && var97 == null) {
                           var52 = 1;
                        } else {
                           var52 = var51 / var86 + 1;
                        }
                     }

                     if (var93 != null && var36 > 0) {
                        if (var33 == null && var34 == null) {
                           var53 = 1;
                        } else {
                           var53 = var50 / var36 + 1;
                        }
                     }

                     int var54 = 0;
                     int var55 = var54;
                     if (var83 > 0) {
                        var54 += var83;
                     }

                     var54 += 2;
                     int var56 = var54;
                     if (var25 > 0) {
                        var54 += var25;
                     }

                     int var57 = var54;
                     int var58 = var54;
                     int var59;
                     if (var86 > 0) {
                        var59 = var52 * var86;
                        var54 += var59;
                        var58 += (var59 - var51) / 2;
                     } else {
                        var54 += var51;
                     }

                     var59 = var54;
                     if (var26 > 0) {
                        var54 += var26;
                     }

                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63 = 0;
                     int var64 = 0;
                     int var65;
                     if (var93 != null) {
                        var54 += 2;
                        var60 = var54;
                        if (var35 > 0) {
                           var54 += var35;
                        }

                        var54 += 2;
                        var61 = var54;
                        if (var37 > 0) {
                           var54 += var37;
                        }

                        var62 = var54;
                        var64 = var54;
                        if (var36 > 0) {
                           var65 = var36 * var53;
                           var54 += var65;
                           var64 += (var65 - var50) / 2;
                        } else {
                           var54 += var50;
                        }

                        var63 = var54;
                        if (var38 > 0) {
                           var54 += var38;
                        }
                     }

                     var65 = var0.field1205[var89] - client.field866;
                     int var66 = var91.field3577 - var65 * var91.field3577 / var91.field3572;
                     int var67 = var65 * var91.field3578 / var91.field3572 + -var91.field3578;
                     int var68 = var66 + (var2 + client.field954 - (var54 >> 1));
                     int var69 = var3 + client.field864 - 12 + var67;
                     int var70 = var69;
                     int var71 = var43 + var69;
                     int var72 = var69 + var91.field3582 + 15;
                     int var73 = var72 - var45.field3899;
                     int var74 = var72 + var45.field3893;
                     if (var73 < var69) {
                        var70 = var73;
                     }

                     if (var74 > var71) {
                        var71 = var74;
                     }

                     int var75 = 0;
                     int var76;
                     int var77;
                     if (var93 != null) {
                        var75 = var69 + var93.field3582 + 15;
                        var76 = var75 - var46.field3899;
                        var77 = var75 + var46.field3893;
                        if (var76 < var70) {
                           ;
                        }

                        if (var77 > var71) {
                           ;
                        }
                     }

                     var76 = 255;
                     if (var91.field3579 >= 0) {
                        var76 = (var65 << 8) / (var91.field3572 - var91.field3579);
                     }

                     if (var76 >= 0 && var76 < 255) {
                        if (var94 != null) {
                           var94.method5875(var55 + var68 - var27, var69, var76);
                        }

                        if (var96 != null) {
                           var96.method5875(var68 + var56 - var29, var69, var76);
                        }

                        if (var95 != null) {
                           for(var77 = 0; var77 < var52; ++var77) {
                              var95.method5875(var86 * var77 + (var57 + var68 - var28), var69, var76);
                           }
                        }

                        if (var97 != null) {
                           var97.method5875(var68 + var59 - var30, var69, var76);
                        }

                        var45.method5586(var47, var68 + var58, var72, var91.field3571, 0, var76);
                        if (var93 != null) {
                           if (var31 != null) {
                              var31.method5875(var68 + var60 - var39, var69, var76);
                           }

                           if (var33 != null) {
                              var33.method5875(var68 + var61 - var41, var69, var76);
                           }

                           if (var32 != null) {
                              for(var77 = 0; var77 < var53; ++var77) {
                                 var32.method5875(var36 * var77 + (var68 + var62 - var40), var69, var76);
                              }
                           }

                           if (var34 != null) {
                              var34.method5875(var63 + var68 - var42, var69, var76);
                           }

                           var46.method5586(var48, var64 + var68, var75, var93.field3571, 0, var76);
                        }
                     } else {
                        if (var94 != null) {
                           var94.method5865(var68 + var55 - var27, var69);
                        }

                        if (var96 != null) {
                           var96.method5865(var56 + var68 - var29, var69);
                        }

                        if (var95 != null) {
                           for(var77 = 0; var77 < var52; ++var77) {
                              var95.method5865(var77 * var86 + (var68 + var57 - var28), var69);
                           }
                        }

                        if (var97 != null) {
                           var97.method5865(var59 + var68 - var30, var69);
                        }

                        var45.method5521(var47, var58 + var68, var72, var91.field3571 | -16777216, 0);
                        if (var93 != null) {
                           if (var31 != null) {
                              var31.method5865(var68 + var60 - var39, var69);
                           }

                           if (var33 != null) {
                              var33.method5865(var61 + var68 - var41, var69);
                           }

                           if (var32 != null) {
                              for(var77 = 0; var77 < var53; ++var77) {
                                 var32.method5865(var36 * var77 + (var62 + var68 - var40), var69);
                              }
                           }

                           if (var34 != null) {
                              var34.method5865(var68 + var63 - var42, var69);
                           }

                           var46.method5521(var48, var64 + var68, var75, var93.field3571 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static int method1642(class201 var0, int var1) {
      int var2 = var0.getBits(2, -351506366);
      int var3;
      if (var2 == 0) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var0.getBits(5, -1372876562);
      } else if (var2 == 2) {
         var3 = var0.getBits(8, 1437344423);
      } else {
         var3 = var0.getBits(11, 491151139);
      }

      return var3;
   }
}

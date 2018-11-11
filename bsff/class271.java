public class class271 extends class218 {
   public static class212 field3478 = new class212(64);
   public static class261 field3483;
   public boolean field3482 = false;

   void method4783(class194 var1, int var2, int var3) {
      if (var2 == 2) {
         this.field3482 = true;
      }

   }

   public void method4782(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(912889655);
         if (var3 == 0) {
            return;
         }

         this.method4783(var1, var3, -1402607986);
      }
   }

   public static class274 method4781(int var0, int var1) {
      class274 var2 = (class274)class274.field3507.method3929((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class274.field3506.method4551(3, var0, 1631600966);
         var2 = new class274();
         if (var3 != null) {
            var2.method4832(new class194(var3), 209084414);
         }

         class274.field3507.method3932(var2, (long)var0);
         return var2;
      }
   }

   static final void method4784(class242[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class327.method5733(var2, var3, var4, var5);
      class134.method2792();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         class242 var11 = var0[var10];
         if (var11 != null && (var11.field2885 == var1 || var1 == -1412584499 && var11 == client.field1027)) {
            int var12;
            if (var8 == -1) {
               client.field1063[client.field967] = var11.field2947 + var6;
               client.field860[client.field967] = var7 + var11.field2828;
               client.field1122[client.field967] = var11.field2826;
               client.field1066[client.field967] = var11.field2887;
               var12 = ++client.field967 - 1;
            } else {
               var12 = var8;
            }

            var11.field2945 = var12;
            var11.field2946 = client.field866;
            if (!var11.field2813 || !class157.method3183(var11, 2106864368)) {
               if (var11.field2818 > 0) {
                  class184.method3437(var11, -1857951930);
               }

               int var13 = var11.field2947 + var6;
               int var14 = var7 + var11.field2828;
               int var15 = var11.field2845;
               int var16;
               int var17;
               if (var11 == client.field1027) {
                  if (var1 != -1412584499 && !var11.field2871) {
                     client.field1095 = var0;
                     class42.field537 = var6;
                     class109.field1582 = var7;
                     continue;
                  }

                  if (client.field1038 && client.field1032) {
                     var16 = class60.field700;
                     var17 = class60.field693;
                     var16 -= client.field1029;
                     var17 -= client.field1030;
                     if (var16 < client.field1033) {
                        var16 = client.field1033;
                     }

                     if (var16 + var11.field2826 > client.field1033 + client.field1028.field2826) {
                        var16 = client.field1033 + client.field1028.field2826 - var11.field2826;
                     }

                     if (var17 < client.field980) {
                        var17 = client.field980;
                     }

                     if (var17 + var11.field2887 > client.field980 + client.field1028.field2887) {
                        var17 = client.field980 + client.field1028.field2887 - var11.field2887;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if (!var11.field2871) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (var11.field2850 == 2) {
                  var16 = var2;
                  var17 = var3;
                  var18 = var4;
                  var19 = var5;
               } else if (var11.field2850 == 9) {
                  var20 = var13;
                  var21 = var14;
                  var22 = var13 + var11.field2826;
                  var23 = var14 + var11.field2887;
                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  if (var23 < var14) {
                     var21 = var23;
                     var23 = var14;
                  }

                  ++var22;
                  ++var23;
                  var16 = var20 > var2 ? var20 : var2;
                  var17 = var21 > var3 ? var21 : var3;
                  var18 = var22 < var4 ? var22 : var4;
                  var19 = var23 < var5 ? var23 : var5;
               } else {
                  var20 = var13 + var11.field2826;
                  var21 = var14 + var11.field2887;
                  var16 = var13 > var2 ? var13 : var2;
                  var17 = var14 > var3 ? var14 : var3;
                  var18 = var20 < var4 ? var20 : var4;
                  var19 = var21 < var5 ? var21 : var5;
               }

               if (!var11.field2813 || var16 < var18 && var17 < var19) {
                  int var24;
                  int var25;
                  int var26;
                  int var27;
                  int var28;
                  int var29;
                  int var30;
                  int var31;
                  int var32;
                  int var33;
                  int var34;
                  int var35;
                  int var36;
                  int var37;
                  int var38;
                  int var39;
                  int var40;
                  int var41;
                  int var42;
                  int var43;
                  int var44;
                  int var45;
                  String var49;
                  boolean var52;
                  boolean var59;
                  if (var11.field2818 != 0) {
                     if (var11.field2818 == 1336) {
                        if (client.field922) {
                           var14 += 15;
                           class186.field2506.method5544("Fps:" + class59.field666, var13 + var11.field2826, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var55 = Runtime.getRuntime();
                           var21 = (int)((var55.totalMemory() - var55.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if (var21 > 327680 && !client.field862) {
                              var22 = 16711680;
                           }

                           class186.field2506.method5544("Mem:" + var21 + "k", var13 + var11.field2826, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if (var11.field2818 == 1337) {
                        client.field1004 = var13;
                        client.field1088 = var14;
                        var22 = var11.field2826;
                        var23 = var11.field2887;
                        ++client.field953;
                        if (class12.field259.field1185 >> 7 == client.field1085 && class12.field259.field1209 >> 7 == client.field1005) {
                           client.field1085 = 0;
                        }

                        if (client.field974) {
                           class37.method523(class12.field259, false, (byte)93);
                        }

                        class19.method166(1636068339);
                        class201.method3820(true, (byte)3);
                        class233.method4334(1019669159);
                        class201.method3820(false, (byte)3);
                        class48.method746((byte)-90);
                        class305.method5437(1796319239);
                        class91.method1921(var13, var14, var22, var23, true, 1420915019);
                        var20 = client.field1113;
                        var21 = client.field1114;
                        var22 = client.field943;
                        var23 = client.field906;
                        class327.method5733(var20, var21, var20 + var22, var23 + var21);
                        class134.method2792();
                        if (!client.field1099) {
                           var24 = client.field880;
                           if (client.field941 / 256 > var24) {
                              var24 = client.field941 / 256;
                           }

                           if (client.field901[4] && client.field861[4] + 128 > var24) {
                              var24 = client.field861[4] + 128;
                           }

                           var25 = client.field925 & 2047;
                           var26 = class190.field2522;
                           var27 = class269.field3457;
                           var28 = class99.field1474;
                           var29 = var24 * 3 + 600;
                           var30 = 2048 - var24 & 2047;
                           var31 = 2048 - var25 & 2047;
                           var32 = 0;
                           var33 = 0;
                           var34 = var29;
                           if (var30 != 0) {
                              var35 = class134.field1955[var30];
                              var36 = class134.field1933[var30];
                              var37 = var33 * var36 - var29 * var35 >> 16;
                              var34 = var29 * var36 + var33 * var35 >> 16;
                              var33 = var37;
                           }

                           if (var31 != 0) {
                              var35 = class134.field1955[var31];
                              var36 = class134.field1933[var31];
                              var37 = var36 * var32 + var34 * var35 >> 16;
                              var34 = var36 * var34 - var35 * var32 >> 16;
                              var32 = var37;
                           }

                           class287.field3766 = var26 - var32;
                           class269.field3472 = var27 - var33;
                           class98.field1468 = var28 - var34;
                           class10.field241 = var24;
                           class181.field2453 = var25;
                           if (client.field930 == 1 && client.field1023 >= 2 && client.field866 % 50 == 0 && (class190.field2522 >> 7 != class12.field259.field1185 >> 7 || class99.field1474 >> 7 != class12.field259.field1209 >> 7)) {
                              var35 = class12.field259.field842;
                              var36 = (class190.field2522 >> 7) + class184.field2498;
                              var37 = (class99.field1474 >> 7) + class4.field28;
                              class16.method125(var36, var37, var35, true, 2066232354);
                           }
                        }

                        if (!client.field1099) {
                           var24 = class180.method3419(114597872);
                        } else {
                           var24 = class198.method3756(766674059);
                        }

                        var25 = class287.field3766;
                        var26 = class269.field3472;
                        var27 = class98.field1468;
                        var28 = class10.field241;
                        var29 = class181.field2453;

                        for(var30 = 0; var30 < 5; ++var30) {
                           if (client.field901[var30]) {
                              var31 = (int)(Math.random() * (double)(client.field1101[var30] * 2 + 1) - (double)client.field1101[var30] + Math.sin((double)client.field1103[var30] / 100.0D * (double)client.field1104[var30]) * (double)client.field861[var30]);
                              if (var30 == 0) {
                                 class287.field3766 += var31;
                              }

                              if (var30 == 1) {
                                 class269.field3472 += var31;
                              }

                              if (var30 == 2) {
                                 class98.field1468 += var31;
                              }

                              if (var30 == 3) {
                                 class181.field2453 = var31 + class181.field2453 & 2047;
                              }

                              if (var30 == 4) {
                                 class10.field241 += var31;
                                 if (class10.field241 < 128) {
                                    class10.field241 = 128;
                                 }

                                 if (class10.field241 > 383) {
                                    class10.field241 = 383;
                                 }
                              }
                           }
                        }

                        var30 = class60.field700;
                        var31 = class60.field693;
                        if (class60.field708 != 0) {
                           var30 = class60.field711;
                           var31 = class60.field710;
                        }

                        if (var30 >= var20 && var30 < var22 + var20 && var31 >= var21 && var31 < var21 + var23) {
                           class46.method696(var30 - var20, var31 - var21, 1996295249);
                        } else {
                           class132.field1916 = false;
                           class132.field1913 = 0;
                        }

                        class33.method384(-911822819);
                        class327.method5810(var20, var21, var22, var23, 0);
                        class33.method384(-1889121980);
                        var32 = class134.field1941;
                        class134.field1941 = client.field1092;
                        class308.field3867.method2917(class287.field3766, class269.field3472, class98.field1468, class10.field241, class181.field2453, var24);
                        class81.method1796(1812522594);
                        class134.field1941 = var32;
                        class33.method384(-1275664705);
                        class308.field3867.method2890();
                        client.field942 = 0;
                        var52 = false;
                        var34 = -1;
                        var35 = -1;
                        var36 = class93.field1414;
                        int[] var67 = class93.field1415;

                        for(var38 = 0; var38 < var36 + client.field898; ++var38) {
                           Object var63;
                           if (var38 < var36) {
                              var63 = client.field971[var67[var38]];
                              if (var67[var38] == client.field982) {
                                 var52 = true;
                                 var34 = var38;
                                 continue;
                              }

                              if (var63 == class12.field259) {
                                 var35 = var38;
                                 continue;
                              }
                           } else {
                              var63 = client.field897[client.field899[var38 - var36]];
                           }

                           class77.method1644((class75)var63, var38, var20, var21, var22, var23, (byte)15);
                        }

                        if (client.field974 && var35 != -1) {
                           class77.method1644(class12.field259, var35, var20, var21, var22, var23, (byte)80);
                        }

                        if (var52) {
                           class77.method1644(client.field971[client.field982], var34, var20, var21, var22, var23, (byte)74);
                        }

                        for(var38 = 0; var38 < client.field942; ++var38) {
                           var39 = client.field944[var38];
                           var40 = client.field945[var38];
                           var41 = client.field947[var38];
                           var42 = client.field946[var38];
                           var59 = true;

                           while(var59) {
                              var59 = false;

                              for(var43 = 0; var43 < var38; ++var43) {
                                 if (var40 + 2 > client.field945[var43] - client.field946[var43] && var40 - var42 < client.field945[var43] + 2 && var39 - var41 < client.field944[var43] + client.field947[var43] && var39 + var41 > client.field944[var43] - client.field947[var43] && client.field945[var43] - client.field946[var43] < var40) {
                                    var40 = client.field945[var43] - client.field946[var43];
                                    var59 = true;
                                 }
                              }
                           }

                           client.field954 = client.field944[var38];
                           client.field864 = client.field945[var38] = var40;
                           var49 = client.field951[var38];
                           if (client.field1018 == 0) {
                              var44 = 16776960;
                              if (client.field1073[var38] < 6) {
                                 var44 = client.field1070[client.field1073[var38]];
                              }

                              if (client.field1073[var38] == 6) {
                                 var44 = client.field953 % 20 < 10 ? 16711680 : 16776960;
                              }

                              if (client.field1073[var38] == 7) {
                                 var44 = client.field953 % 20 < 10 ? 255 : '\uffff';
                              }

                              if (client.field1073[var38] == 8) {
                                 var44 = client.field953 % 20 < 10 ? '\ub000' : 8454016;
                              }

                              if (client.field1073[var38] == 9) {
                                 var45 = 150 - client.field950[var38];
                                 if (var45 < 50) {
                                    var44 = var45 * 1280 + 16711680;
                                 } else if (var45 < 100) {
                                    var44 = 16776960 - (var45 - 50) * 327680;
                                 } else if (var45 < 150) {
                                    var44 = (var45 - 100) * 5 + '\uff00';
                                 }
                              }

                              if (client.field1073[var38] == 10) {
                                 var45 = 150 - client.field950[var38];
                                 if (var45 < 50) {
                                    var44 = var45 * 5 + 16711680;
                                 } else if (var45 < 100) {
                                    var44 = 16711935 - (var45 - 50) * 327680;
                                 } else if (var45 < 150) {
                                    var44 = (var45 - 100) * 327680 + 255 - (var45 - 100) * 5;
                                 }
                              }

                              if (client.field1073[var38] == 11) {
                                 var45 = 150 - client.field950[var38];
                                 if (var45 < 50) {
                                    var44 = 16777215 - var45 * 327685;
                                 } else if (var45 < 100) {
                                    var44 = (var45 - 50) * 327685 + '\uff00';
                                 } else if (var45 < 150) {
                                    var44 = 16777215 - (var45 - 100) * 327680;
                                 }
                              }

                              if (client.field984[var38] == 0) {
                                 class228.field2676.method5524(var49, var20 + client.field954, var21 + client.field864, var44, 0);
                              }

                              if (client.field984[var38] == 1) {
                                 class228.field2676.method5526(var49, var20 + client.field954, var21 + client.field864, var44, 0, client.field953);
                              }

                              if (client.field984[var38] == 2) {
                                 class228.field2676.method5527(var49, var20 + client.field954, var21 + client.field864, var44, 0, client.field953);
                              }

                              if (client.field984[var38] == 3) {
                                 class228.field2676.method5528(var49, var20 + client.field954, var21 + client.field864, var44, 0, client.field953, 150 - client.field950[var38]);
                              }

                              if (client.field984[var38] == 4) {
                                 var45 = (150 - client.field950[var38]) * (class228.field2676.method5590(var49) + 100) / 150;
                                 class327.method5734(var20 + client.field954 - 50, var21, var20 + client.field954 + 50, var23 + var21);
                                 class228.field2676.method5521(var49, var20 + client.field954 + 50 - var45, var21 + client.field864, var44, 0);
                                 class327.method5733(var20, var21, var20 + var22, var21 + var23);
                              }

                              if (client.field984[var38] == 5) {
                                 var45 = 150 - client.field950[var38];
                                 int var65 = 0;
                                 if (var45 < 25) {
                                    var65 = var45 - 25;
                                 } else if (var45 > 125) {
                                    var65 = var45 - 125;
                                 }

                                 class327.method5734(var20, var21 + client.field864 - class228.field2676.field3891 - 1, var22 + var20, var21 + client.field864 + 5);
                                 class228.field2676.method5524(var49, var20 + client.field954, var21 + var65 + client.field864, var44, 0);
                                 class327.method5733(var20, var21, var20 + var22, var21 + var23);
                              }
                           } else {
                              class228.field2676.method5524(var49, var20 + client.field954, var21 + client.field864, 16776960, 0);
                           }
                        }

                        class22.method187(var20, var21, 583198239);
                        ((class123)class134.field1944).method2562(client.field893, 1299945036);
                        class37.method524(var20, var21, var22, var23, 1514463203);
                        class287.field3766 = var25;
                        class269.field3472 = var26;
                        class98.field1468 = var27;
                        class10.field241 = var28;
                        class181.field2453 = var29;
                        if (client.field865) {
                           byte var68 = 0;
                           var34 = var68 + class264.field3404 + class264.field3403;
                           if (var34 == 0) {
                              client.field865 = false;
                           }
                        }

                        if (client.field865) {
                           class327.method5810(var20, var21, var22, var23, 0);
                           class133.method2787("Loading - please wait.", false, -881761524);
                        }

                        client.field1060[var11.field2945] = true;
                        class327.method5733(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2818 == 1338) {
                        class28.method268(var11, var13, var14, var12, -1019322065);
                        class327.method5733(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2818 == 1339) {
                        class62.method1068(var11, var13, var14, var12, -2037169622);
                        class327.method5733(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2818 == 1400) {
                        class63.field742.method6015(var13, var14, var11.field2826, var11.field2887, client.field866, -160617335);
                     }

                     if (var11.field2818 == 1401) {
                        class63.field742.method6032(var13, var14, var11.field2826, var11.field2887, 327416106);
                     }
                  }

                  if (var11.field2850 == 0) {
                     if (!var11.field2813 && class157.method3183(var11, 2094207233) && var11 != class238.field2775) {
                        continue;
                     }

                     if (!var11.field2813) {
                        if (var11.field2836 > var11.field2838 - var11.field2887) {
                           var11.field2836 = var11.field2838 - var11.field2887;
                        }

                        if (var11.field2836 < 0) {
                           var11.field2836 = 0;
                        }
                     }

                     method4784(var0, var11.field2814, var16, var17, var18, var19, var13 - var11.field2835, var14 - var11.field2836, var12, -2038327281);
                     if (var11.field2938 != null) {
                        method4784(var11.field2938, var11.field2814, var16, var17, var18, var19, var13 - var11.field2835, var14 - var11.field2836, var12, -2098579668);
                     }

                     class67 var46 = (class67)client.field1017.method3981((long)var11.field2814);
                     if (var46 != null) {
                        class17.method138(var46.field773, var16, var17, var18, var19, var13, var14, var12, 1636312694);
                     }

                     class327.method5733(var2, var3, var4, var5);
                     class134.method2792();
                  }

                  if (client.field1069 || client.field1062[var12] || client.field1067 > 1) {
                     if (var11.field2850 == 0 && !var11.field2813 && var11.field2838 > var11.field2887) {
                        var20 = var13 + var11.field2826;
                        var21 = var11.field2836;
                        var22 = var11.field2887;
                        var23 = var11.field2838;
                        class74.field1144[0].method5842(var20, var14);
                        class74.field1144[1].method5842(var20, var22 + var14 - 16);
                        class327.method5810(var20, var14 + 16, 16, var22 - 32, client.field918);
                        var24 = var22 * (var22 - 32) / var23;
                        if (var24 < 8) {
                           var24 = 8;
                        }

                        var25 = var21 * (var22 - 32 - var24) / (var23 - var22);
                        class327.method5810(var20, var25 + var14 + 16, 16, var24, client.field895);
                        class327.method5752(var20, var14 + var25 + 16, var24, client.field921);
                        class327.method5752(var20 + 1, var14 + var25 + 16, var24, client.field921);
                        class327.method5756(var20, var14 + var25 + 16, 16, client.field921);
                        class327.method5756(var20, var25 + var14 + 17, 16, client.field921);
                        class327.method5752(var20 + 15, var14 + var25 + 16, var24, client.field920);
                        class327.method5752(var20 + 14, var25 + var14 + 17, var24 - 1, client.field920);
                        class327.method5756(var20, var14 + var25 + var24 + 15, 16, client.field920);
                        class327.method5756(var20 + 1, var14 + var25 + var24 + 14, 15, client.field920);
                     }

                     if (var11.field2850 != 1) {
                        if (var11.field2850 == 2) {
                           var20 = 0;

                           for(var21 = 0; var21 < var11.field2889; ++var21) {
                              for(var22 = 0; var22 < var11.field2825; ++var22) {
                                 var23 = var13 + var22 * (var11.field2880 + 32);
                                 var24 = var21 * (var11.field2881 + 32) + var14;
                                 if (var20 < 20) {
                                    var23 += var11.field2832[var20];
                                    var24 += var11.field2883[var20];
                                 }

                                 if (var11.field2878[var20] <= 0) {
                                    if (var11.field2884 != null && var20 < 20) {
                                       class331 var53 = var11.method4454(var20, -1825188932);
                                       if (var53 != null) {
                                          var53.method5865(var23, var24);
                                       } else if (class242.field2812) {
                                          class30.method274(var11, 997957892);
                                       }
                                    }
                                 } else {
                                    var52 = false;
                                    boolean var66 = false;
                                    var27 = var11.field2878[var20] - 1;
                                    if (var23 + 32 > var2 && var23 < var4 && var24 + 32 > var3 && var24 < var5 || var11 == class157.field2149 && var20 == client.field1080) {
                                       class331 var61;
                                       if (client.field923 == 1 && var20 == class49.field589 && var11.field2814 == client.field900) {
                                          var61 = class93.method1945(var27, var11.field2933[var20], 2, 0, 2, false, 1877659601);
                                       } else {
                                          var61 = class93.method1945(var27, var11.field2933[var20], 1, 3153952, 2, false, 1056794628);
                                       }

                                       if (var61 != null) {
                                          if (var11 == class157.field2149 && var20 == client.field1080) {
                                             var25 = class60.field700 - client.field964;
                                             var26 = class60.field693 - client.field1056;
                                             if (var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if (var26 < 5 && var26 > -5) {
                                                var26 = 0;
                                             }

                                             if (client.field968 < 5) {
                                                var25 = 0;
                                                var26 = 0;
                                             }

                                             var61.method5875(var25 + var23, var26 + var24, 128);
                                             if (var1 != -1) {
                                                class242 var69 = var0[var1 & '\uffff'];
                                                if (var24 + var26 < class327.field3955 && var69.field2836 > 0) {
                                                   var30 = (class327.field3955 - var24 - var26) * client.field893 / 3;
                                                   if (var30 > client.field893 * 10) {
                                                      var30 = client.field893 * 10;
                                                   }

                                                   if (var30 > var69.field2836) {
                                                      var30 = var69.field2836;
                                                   }

                                                   var69.field2836 -= var30;
                                                   client.field1056 += var30;
                                                   class30.method274(var69, 1010617161);
                                                }

                                                if (var24 + var26 + 32 > class327.field3956 && var69.field2836 < var69.field2838 - var69.field2887) {
                                                   var30 = (var24 + var26 + 32 - class327.field3956) * client.field893 / 3;
                                                   if (var30 > client.field893 * 10) {
                                                      var30 = client.field893 * 10;
                                                   }

                                                   if (var30 > var69.field2838 - var69.field2887 - var69.field2836) {
                                                      var30 = var69.field2838 - var69.field2887 - var69.field2836;
                                                   }

                                                   var69.field2836 += var30;
                                                   client.field1056 -= var30;
                                                   class30.method274(var69, 42420746);
                                                }
                                             }
                                          } else if (var11 == class64.field750 && var20 == client.field909) {
                                             var61.method5875(var23, var24, 128);
                                          } else {
                                             var61.method5865(var23, var24);
                                          }
                                       } else {
                                          class30.method274(var11, -169561601);
                                       }
                                    }
                                 }

                                 ++var20;
                              }
                           }
                        } else if (var11.field2850 == 3) {
                           if (class167.method3248(var11, (byte)70)) {
                              var20 = var11.field2920;
                              if (var11 == class238.field2775 && var11.field2842 != 0) {
                                 var20 = var11.field2842;
                              }
                           } else {
                              var20 = var11.field2839;
                              if (var11 == class238.field2775 && var11.field2841 != 0) {
                                 var20 = var11.field2841;
                              }
                           }

                           if (var11.field2843) {
                              switch(var11.field2896.field3967) {
                              case 1:
                                 class327.method5742(var13, var14, var11.field2826, var11.field2887, var11.field2839, var11.field2920, 256 - (var11.field2845 & 255), 256 - (var11.field2846 & 255));
                                 break;
                              case 2:
                                 class327.method5743(var13, var14, var11.field2826, var11.field2887, var11.field2839, var11.field2920, 256 - (var11.field2845 & 255), 256 - (var11.field2846 & 255));
                                 break;
                              case 3:
                                 class327.method5744(var13, var14, var11.field2826, var11.field2887, var11.field2839, var11.field2920, 256 - (var11.field2845 & 255), 256 - (var11.field2846 & 255));
                                 break;
                              case 4:
                                 class327.method5773(var13, var14, var11.field2826, var11.field2887, var11.field2839, var11.field2920, 256 - (var11.field2845 & 255), 256 - (var11.field2846 & 255));
                                 break;
                              default:
                                 if (var15 == 0) {
                                    class327.method5810(var13, var14, var11.field2826, var11.field2887, var20);
                                 } else {
                                    class327.method5740(var13, var14, var11.field2826, var11.field2887, var20, 256 - (var15 & 255));
                                 }
                              }
                           } else if (var15 == 0) {
                              class327.method5748(var13, var14, var11.field2826, var11.field2887, var20);
                           } else {
                              class327.method5749(var13, var14, var11.field2826, var11.field2887, var20, 256 - (var15 & 255));
                           }
                        } else {
                           class311 var51;
                           if (var11.field2850 == 4) {
                              var51 = var11.method4453(2131072648);
                              if (var51 == null) {
                                 if (class242.field2812) {
                                    class30.method274(var11, 235749958);
                                 }
                              } else {
                                 String var56 = var11.field2876;
                                 if (class167.method3248(var11, (byte)-58)) {
                                    var21 = var11.field2920;
                                    if (var11 == class238.field2775 && var11.field2842 != 0) {
                                       var21 = var11.field2842;
                                    }

                                    if (var11.field2875.length() > 0) {
                                       var56 = var11.field2875;
                                    }
                                 } else {
                                    var21 = var11.field2839;
                                    if (var11 == class238.field2775 && var11.field2841 != 0) {
                                       var21 = var11.field2841;
                                    }
                                 }

                                 if (var11.field2813 && var11.field2934 != -1) {
                                    class283 var60 = class146.method3099(var11.field2934, (byte)98);
                                    var56 = var60.field3644;
                                    if (var56 == null) {
                                       var56 = "null";
                                    }

                                    if ((var60.field3665 == 1 || var11.field2935 != 1) && var11.field2935 != -1) {
                                       var56 = class173.method3342(16748608, (byte)-110) + var56 + "</col> " + 'x' + class242.method4503(var11.field2935, (byte)0);
                                    }
                                 }

                                 if (var11 == client.field1102) {
                                    var56 = "Please wait...";
                                    var21 = var11.field2839;
                                 }

                                 if (!var11.field2813) {
                                    var56 = class310.method5500(var56, var11, 2131412867);
                                 }

                                 var51.method5525(var56, var13, var14, var11.field2826, var11.field2887, var21, var11.field2879 ? 0 : -1, var11.field2877, var11.field2929, var11.field2804);
                              }
                           } else if (var11.field2850 == 5) {
                              class331 var54;
                              if (!var11.field2813) {
                                 var54 = var11.method4452(class167.method3248(var11, (byte)66), (byte)82);
                                 if (var54 != null) {
                                    var54.method5865(var13, var14);
                                 } else if (class242.field2812) {
                                    class30.method274(var11, 1370071893);
                                 }
                              } else {
                                 if (var11.field2934 != -1) {
                                    var54 = class93.method1945(var11.field2934, var11.field2935, var11.field2853, var11.field2874, var11.field2872, false, 1568359095);
                                 } else {
                                    var54 = var11.method4452(false, (byte)-37);
                                 }

                                 if (var54 == null) {
                                    if (class242.field2812) {
                                       class30.method274(var11, -1855336784);
                                    }
                                 } else {
                                    var21 = var54.field3982;
                                    var22 = var54.field3984;
                                    if (!var11.field2852) {
                                       var23 = var11.field2826 * 4096 / var21;
                                       if (var11.field2851 != 0) {
                                          var54.method5906(var11.field2826 / 2 + var13, var11.field2887 / 2 + var14, var11.field2851, var23);
                                       } else if (var15 != 0) {
                                          var54.method5877(var13, var14, var11.field2826, var11.field2887, 256 - (var15 & 255));
                                       } else if (var21 == var11.field2826 && var22 == var11.field2887) {
                                          var54.method5865(var13, var14);
                                       } else {
                                          var54.method5871(var13, var14, var11.field2826, var11.field2887);
                                       }
                                    } else {
                                       class327.method5734(var13, var14, var13 + var11.field2826, var14 + var11.field2887);
                                       var23 = (var21 - 1 + var11.field2826) / var21;
                                       var24 = (var22 - 1 + var11.field2887) / var22;

                                       for(var25 = 0; var25 < var23; ++var25) {
                                          for(var26 = 0; var26 < var24; ++var26) {
                                             if (var11.field2851 != 0) {
                                                var54.method5906(var21 / 2 + var13 + var25 * var21, var22 / 2 + var14 + var22 * var26, var11.field2851, 4096);
                                             } else if (var15 != 0) {
                                                var54.method5875(var13 + var25 * var21, var14 + var22 * var26, 256 - (var15 & 255));
                                             } else {
                                                var54.method5865(var13 + var25 * var21, var14 + var26 * var22);
                                             }
                                          }
                                       }

                                       class327.method5733(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              class283 var47;
                              if (var11.field2850 == 6) {
                                 var59 = class167.method3248(var11, (byte)16);
                                 if (var59) {
                                    var21 = var11.field2862;
                                 } else {
                                    var21 = var11.field2831;
                                 }

                                 class131 var62 = null;
                                 var23 = 0;
                                 if (var11.field2934 != -1) {
                                    var47 = class146.method3099(var11.field2934, (byte)80);
                                    if (var47 != null) {
                                       var47 = var47.method5062(var11.field2935, 2130026432);
                                       var62 = var47.method5061(1, -449200602);
                                       if (var62 != null) {
                                          var62.method2687();
                                          var23 = var62.field2042 / 2;
                                       } else {
                                          class30.method274(var11, 146654281);
                                       }
                                    }
                                 } else if (var11.field2857 == 5) {
                                    if (var11.field2923 == 0) {
                                       var62 = client.field1118.method4413((class287)null, -1, (class287)null, -1, 980120878);
                                    } else {
                                       var62 = class12.field259.vmethod3067((byte)-83);
                                    }
                                 } else if (var21 == -1) {
                                    var62 = var11.method4486((class287)null, -1, var59, class12.field259.field820, (byte)59);
                                    if (var62 == null && class242.field2812) {
                                       class30.method274(var11, 1150069164);
                                    }
                                 } else {
                                    class287 var64 = class202.method3839(var21, (byte)31);
                                    var62 = var11.method4486(var64, var11.field2837, var59, class12.field259.field820, (byte)80);
                                    if (var62 == null && class242.field2812) {
                                       class30.method274(var11, 1832531062);
                                    }
                                 }

                                 class134.method2795(var11.field2826 / 2 + var13, var11.field2887 / 2 + var14);
                                 var24 = class134.field1955[var11.field2865] * var11.field2868 >> 16;
                                 var25 = class134.field1933[var11.field2865] * var11.field2868 >> 16;
                                 if (var62 != null) {
                                    if (!var11.field2813) {
                                       var62.method2700(0, var11.field2866, 0, var11.field2865, 0, var24, var25);
                                    } else {
                                       var62.method2687();
                                       if (var11.field2829) {
                                          var62.method2701(0, var11.field2866, var11.field2824, var11.field2865, var11.field2854, var24 + var23 + var11.field2864, var25 + var11.field2864, var11.field2868);
                                       } else {
                                          var62.method2700(0, var11.field2866, var11.field2824, var11.field2865, var11.field2854, var24 + var23 + var11.field2864, var25 + var11.field2864);
                                       }
                                    }
                                 }

                                 class134.method2836();
                              } else {
                                 if (var11.field2850 == 7) {
                                    var51 = var11.method4453(1246620216);
                                    if (var51 == null) {
                                       if (class242.field2812) {
                                          class30.method274(var11, 1953997467);
                                       }
                                       continue;
                                    }

                                    var21 = 0;

                                    for(var22 = 0; var22 < var11.field2889; ++var22) {
                                       for(var23 = 0; var23 < var11.field2825; ++var23) {
                                          if (var11.field2878[var21] > 0) {
                                             var47 = class146.method3099(var11.field2878[var21] - 1, (byte)27);
                                             String var48;
                                             if (var47.field3665 != 1 && var11.field2933[var21] == 1) {
                                                var48 = class173.method3342(16748608, (byte)-21) + var47.field3644 + "</col>";
                                             } else {
                                                var48 = class173.method3342(16748608, (byte)-16) + var47.field3644 + "</col> " + 'x' + class242.method4503(var11.field2933[var21], (byte)0);
                                             }

                                             var26 = var23 * (var11.field2880 + 115) + var13;
                                             var27 = var14 + (var11.field2881 + 12) * var22;
                                             if (var11.field2877 == 0) {
                                                var51.method5521(var48, var26, var27, var11.field2839, var11.field2879 ? 0 : -1);
                                             } else if (var11.field2877 == 1) {
                                                var51.method5524(var48, var11.field2826 / 2 + var26, var27, var11.field2839, var11.field2879 ? 0 : -1);
                                             } else {
                                                var51.method5544(var48, var26 + var11.field2826 - 1, var27, var11.field2839, var11.field2879 ? 0 : -1);
                                             }
                                          }

                                          ++var21;
                                       }
                                    }
                                 }

                                 if (var11.field2850 == 8 && var11 == class23.field331 && client.field1007 == client.field1006) {
                                    var20 = 0;
                                    var21 = 0;
                                    class311 var57 = class186.field2506;
                                    var49 = var11.field2876;

                                    String var50;
                                    for(var49 = class310.method5500(var49, var11, -1065979143); var49.length() > 0; var21 = var21 + var57.field3891 + 1) {
                                       var25 = var49.indexOf("<br>");
                                       if (var25 != -1) {
                                          var50 = var49.substring(0, var25);
                                          var49 = var49.substring(var25 + 4);
                                       } else {
                                          var50 = var49;
                                          var49 = "";
                                       }

                                       var26 = var57.method5590(var50);
                                       if (var26 > var20) {
                                          var20 = var26;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var25 = var13 + var11.field2826 - 5 - var20;
                                    var26 = var14 + var11.field2887 + 5;
                                    if (var25 < var13 + 5) {
                                       var25 = var13 + 5;
                                    }

                                    if (var20 + var25 > var4) {
                                       var25 = var4 - var20;
                                    }

                                    if (var21 + var26 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    class327.method5810(var25, var26, var20, var21, 16777120);
                                    class327.method5748(var25, var26, var20, var21, 0);
                                    var49 = var11.field2876;
                                    var27 = var26 + var57.field3891 + 2;

                                    for(var49 = class310.method5500(var49, var11, 1790587965); var49.length() > 0; var27 = var27 + var57.field3891 + 1) {
                                       var28 = var49.indexOf("<br>");
                                       if (var28 != -1) {
                                          var50 = var49.substring(0, var28);
                                          var49 = var49.substring(var28 + 4);
                                       } else {
                                          var50 = var49;
                                          var49 = "";
                                       }

                                       var57.method5521(var50, var25 + 3, var27, 0, -1);
                                    }
                                 }

                                 if (var11.field2850 == 9) {
                                    if (var11.field2897) {
                                       var20 = var13;
                                       var21 = var14 + var11.field2887;
                                       var22 = var13 + var11.field2826;
                                       var23 = var14;
                                    } else {
                                       var20 = var13;
                                       var21 = var14;
                                       var22 = var13 + var11.field2826;
                                       var23 = var14 + var11.field2887;
                                    }

                                    if (var11.field2847 == 1) {
                                       class327.method5754(var20, var21, var22, var23, var11.field2839);
                                    } else {
                                       var26 = var11.field2839;
                                       var27 = var11.field2847;
                                       var28 = var22 - var20;
                                       var29 = var23 - var21;
                                       var30 = var28 >= 0 ? var28 : -var28;
                                       var31 = var29 >= 0 ? var29 : -var29;
                                       var32 = var30;
                                       if (var30 < var31) {
                                          var32 = var31;
                                       }

                                       if (var32 != 0) {
                                          var33 = (var28 << 16) / var32;
                                          var34 = (var29 << 16) / var32;
                                          if (var34 <= var33) {
                                             var33 = -var33;
                                          } else {
                                             var34 = -var34;
                                          }

                                          var35 = var34 * var27 >> 17;
                                          var36 = var34 * var27 + 1 >> 17;
                                          var37 = var27 * var33 >> 17;
                                          var38 = var33 * var27 + 1 >> 17;
                                          var24 = var20 - class327.field3952;
                                          var25 = var21 - class327.field3955;
                                          var39 = var35 + var24;
                                          var40 = var24 - var36;
                                          var41 = var24 + var28 - var36;
                                          var42 = var28 + var24 + var35;
                                          int var58 = var25 + var37;
                                          var43 = var25 - var38;
                                          var44 = var29 + var25 - var38;
                                          var45 = var29 + var25 + var37;
                                          class134.method2800(var39, var40, var41);
                                          class134.method2803(var58, var43, var44, var39, var40, var41, var26);
                                          class134.method2800(var39, var41, var42);
                                          class134.method2803(var58, var44, var45, var39, var41, var42, var26);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public static int method4791(int var0, int var1) {
      return var0 >> 17 & 7;
   }
}

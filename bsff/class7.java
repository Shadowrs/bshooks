import java.io.File;

public class class7 {
   public static boolean field228 = false;
   public static boolean field225 = false;
   public static boolean field227 = false;
   public static class11 field230;
   static class215 field229;
   static class310 field226;
   static int[] field231;

   public static void method31(int var0) {
      if (class51.field622 != null) {
         class51 var1 = class51.field622;
         synchronized(var1) {
            class51.field622 = null;
         }
      }

   }

   public static void method41(File var0, int var1) {
      class52.field624 = var0;
      if (!class52.field624.exists()) {
         throw new RuntimeException("");
      } else {
         class170.field2220 = true;
      }
   }

   static final void method40(class242[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         class242 var10 = var0[var9];
         if (var10 != null && (!var10.field2813 || var10.field2850 == 0 || var10.field2937 || class45.method662(var10, 2078246674) != 0 || var10 == client.field1028 || var10.field2818 == 1338) && var10.field2885 == var1 && (!var10.field2813 || !class157.method3183(var10, 2042086833))) {
            int var11 = var10.field2947 + var6;
            int var12 = var7 + var10.field2828;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var10.field2850 == 2) {
               var13 = var2;
               var14 = var3;
               var15 = var4;
               var16 = var5;
            } else if (var10.field2850 == 9) {
               var17 = var11;
               var18 = var12;
               int var20 = var11 + var10.field2826;
               var19 = var12 + var10.field2887;
               if (var20 < var11) {
                  var17 = var20;
                  var20 = var11;
               }

               if (var19 < var12) {
                  var18 = var19;
                  var19 = var12;
               }

               ++var20;
               ++var19;
               var13 = var17 > var2 ? var17 : var2;
               var14 = var18 > var3 ? var18 : var3;
               var15 = var20 < var4 ? var20 : var4;
               var16 = var19 < var5 ? var19 : var5;
            } else {
               var17 = var11 + var10.field2826;
               var18 = var12 + var10.field2887;
               var13 = var11 > var2 ? var11 : var2;
               var14 = var12 > var3 ? var12 : var3;
               var15 = var17 < var4 ? var17 : var4;
               var16 = var18 < var5 ? var18 : var5;
            }

            if (var10 == client.field1027) {
               client.field877 = true;
               client.field1124 = var11;
               client.field1037 = var12;
            }

            if (!var10.field2813 || var13 < var15 && var14 < var16) {
               var17 = class60.field700;
               var18 = class60.field693;
               if (class60.field708 != 0) {
                  var17 = class60.field711;
                  var18 = class60.field710;
               }

               boolean var41 = var17 >= var13 && var18 >= var14 && var17 < var15 && var18 < var16;
               if (var10.field2818 == 1337) {
                  if (!client.field865 && !client.field991 && var41) {
                     class201.method3821(var17, var18, var13, var14, (short)255);
                  }
               } else if (var10.field2818 == 1338) {
                  class276.method4884(var10, var11, var12, (byte)8);
               } else {
                  if (var10.field2818 == 1400) {
                     class63.field742.method6166(class60.field700, class60.field693, var41, var11, var12, var10.field2826, var10.field2887, 1355157211);
                  }

                  int var21;
                  int var22;
                  int var23;
                  int var24;
                  int var25;
                  int var26;
                  boolean var27;
                  boolean var43;
                  if (!client.field991 && var41) {
                     if (var10.field2818 == 1400) {
                        class63.field742.method6064(var11, var12, var10.field2826, var10.field2887, var17, var18, -1946246363);
                     } else {
                        var19 = var17 - var11;
                        var21 = var18 - var12;
                        if (var10.field2817 == 1) {
                           class164.method3228(var10.field2931, "", 24, 0, 0, var10.field2814, (byte)-78);
                        }

                        String var28;
                        if (var10.field2817 == 2 && !client.field1011) {
                           var22 = class45.method662(var10, 2081706591);
                           var23 = var22 >> 11 & 63;
                           if (var23 == 0) {
                              var28 = null;
                           } else if (var10.field2863 != null && var10.field2863.trim().length() != 0) {
                              var28 = var10.field2863;
                           } else {
                              var28 = null;
                           }

                           if (var28 != null) {
                              class164.method3228(var28, class173.method3342(65280, (byte)-11) + var10.field2930, 25, 0, -1, var10.field2814, (byte)-77);
                           }
                        }

                        if (var10.field2817 == 3) {
                           class164.method3228("Close", "", 26, 0, 0, var10.field2814, (byte)-69);
                        }

                        if (var10.field2817 == 4) {
                           class164.method3228(var10.field2931, "", 28, 0, 0, var10.field2814, (byte)-114);
                        }

                        if (var10.field2817 == 5) {
                           class164.method3228(var10.field2931, "", 29, 0, 0, var10.field2814, (byte)-79);
                        }

                        if (var10.field2817 == 6 && client.field1102 == null) {
                           class164.method3228(var10.field2931, "", 30, 0, -1, var10.field2814, (byte)-99);
                        }

                        if (var10.field2850 == 2) {
                           var24 = 0;

                           for(var23 = 0; var23 < var10.field2887; ++var23) {
                              for(var22 = 0; var22 < var10.field2826; ++var22) {
                                 var25 = var22 * (var10.field2880 + 32);
                                 var26 = var23 * (var10.field2881 + 32);
                                 if (var24 < 20) {
                                    var25 += var10.field2832[var24];
                                    var26 += var10.field2883[var24];
                                 }

                                 if (var19 >= var25 && var21 >= var26 && var19 < var25 + 32 && var21 < var26 + 32) {
                                    client.field1086 = var24;
                                    class123.field1701 = var10;
                                    if (var10.field2878[var24] > 0) {
                                       label1042: {
                                          class283 var29 = class146.method3099(var10.field2878[var24] - 1, (byte)48);
                                          int var30;
                                          boolean var31;
                                          if (client.field923 == 1) {
                                             var30 = class45.method662(var10, 2129923301);
                                             var31 = (var30 >> 30 & 1) != 0;
                                             if (var31) {
                                                if (var10.field2814 != client.field900 || var24 != class49.field589) {
                                                   class164.method3228("Use", client.field1010 + " -> " + class173.method3342(16748608, (byte)-54) + var29.field3644, 31, var29.field3642, var24, var10.field2814, (byte)-18);
                                                }
                                                break label1042;
                                             }
                                          }

                                          if (client.field1011) {
                                             var30 = class45.method662(var10, 2079697681);
                                             var31 = (var30 >> 30 & 1) != 0;
                                             if (var31) {
                                                if ((class241.field2799 & 16) == 16) {
                                                   class164.method3228(client.field956, client.field1015 + " -> " + class173.method3342(16748608, (byte)-7) + var29.field3644, 32, var29.field3642, var24, var10.field2814, (byte)-42);
                                                }
                                                break label1042;
                                             }
                                          }

                                          String[] var32 = var29.field3659;
                                          var30 = -1;
                                          boolean var33;
                                          if (client.field1001) {
                                             var33 = client.field1002 || class51.field607[81];
                                             if (var33) {
                                                var30 = var29.method5069(2048414108);
                                             }
                                          }

                                          int var34 = class45.method662(var10, 2072594095);
                                          var33 = (var34 >> 30 & 1) != 0;
                                          int var35;
                                          if (var33) {
                                             for(var35 = 4; var35 >= 3; --var35) {
                                                if (var35 != var30) {
                                                   class187.method3457(var10, var29, var24, var35, false, 211423775);
                                                }
                                             }
                                          }

                                          var35 = class45.method662(var10, 2102684277);
                                          boolean var36 = (var35 >> 31 & 1) != 0;
                                          if (var36) {
                                             class164.method3228("Use", class173.method3342(16748608, (byte)2) + var29.field3644, 38, var29.field3642, var24, var10.field2814, (byte)-5);
                                          }

                                          int var37 = class45.method662(var10, 2104724665);
                                          boolean var38 = (var37 >> 30 & 1) != 0;
                                          int var39;
                                          if (var38) {
                                             for(var39 = 2; var39 >= 0; --var39) {
                                                if (var30 != var39) {
                                                   class187.method3457(var10, var29, var24, var39, false, -798059269);
                                                }
                                             }

                                             if (var30 >= 0) {
                                                class187.method3457(var10, var29, var24, var30, true, -786342594);
                                             }
                                          }

                                          var32 = var10.field2909;
                                          if (var32 != null) {
                                             for(var39 = 4; var39 >= 0; --var39) {
                                                if (var32[var39] != null) {
                                                   byte var40 = 0;
                                                   if (var39 == 0) {
                                                      var40 = 39;
                                                   }

                                                   if (var39 == 1) {
                                                      var40 = 40;
                                                   }

                                                   if (var39 == 2) {
                                                      var40 = 41;
                                                   }

                                                   if (var39 == 3) {
                                                      var40 = 42;
                                                   }

                                                   if (var39 == 4) {
                                                      var40 = 43;
                                                   }

                                                   class164.method3228(var32[var39], class173.method3342(16748608, (byte)-57) + var29.field3644, var40, var29.field3642, var24, var10.field2814, (byte)0);
                                                }
                                             }
                                          }

                                          class164.method3228("Examine", class173.method3342(16748608, (byte)-93) + var29.field3644, 1005, var29.field3642, var24, var10.field2814, (byte)-110);
                                       }
                                    }
                                 }

                                 ++var24;
                              }
                           }
                        }

                        if (var10.field2813) {
                           if (client.field1011) {
                              var23 = class45.method662(var10, 2037214549);
                              var27 = (var23 >> 21 & 1) != 0;
                              if (var27 && (class241.field2799 & 32) == 32) {
                                 class164.method3228(client.field956, client.field1015 + " -> " + var10.field2882, 58, 0, var10.field2815, var10.field2814, (byte)-123);
                              }
                           } else {
                              String var42;
                              for(var24 = 9; var24 >= 5; --var24) {
                                 var42 = class38.method529(var10, var24, (short)-1598);
                                 if (var42 != null) {
                                    class164.method3228(var42, var10.field2882, 1007, var24 + 1, var10.field2815, var10.field2814, (byte)-33);
                                 }
                              }

                              var22 = class45.method662(var10, 2086192594);
                              var23 = var22 >> 11 & 63;
                              if (var23 == 0) {
                                 var28 = null;
                              } else if (var10.field2863 != null && var10.field2863.trim().length() != 0) {
                                 var28 = var10.field2863;
                              } else {
                                 var28 = null;
                              }

                              if (var28 != null) {
                                 class164.method3228(var28, var10.field2882, 25, 0, var10.field2815, var10.field2814, (byte)-3);
                              }

                              for(var22 = 4; var22 >= 0; --var22) {
                                 var42 = class38.method529(var10, var22, (short)-23091);
                                 if (var42 != null) {
                                    class164.method3228(var42, var10.field2882, 57, var22 + 1, var10.field2815, var10.field2814, (byte)-43);
                                 }
                              }

                              var25 = class45.method662(var10, 2073785002);
                              var43 = (var25 & 1) != 0;
                              if (var43) {
                                 class164.method3228("Continue", "", 30, 0, var10.field2815, var10.field2814, (byte)-35);
                              }
                           }
                        }
                     }
                  }

                  if (var10.field2850 == 0) {
                     if (!var10.field2813 && class157.method3183(var10, 2107727109) && var10 != class238.field2775) {
                        continue;
                     }

                     method40(var0, var10.field2814, var13, var14, var15, var16, var11 - var10.field2835, var12 - var10.field2836, -580834752);
                     if (var10.field2938 != null) {
                        method40(var10.field2938, var10.field2814, var13, var14, var15, var16, var11 - var10.field2835, var12 - var10.field2836, -1923790577);
                     }

                     class67 var45 = (class67)client.field1017.method3981((long)var10.field2814);
                     if (var45 != null) {
                        if (var45.field774 == 0 && class60.field700 >= var13 && class60.field693 >= var14 && class60.field700 < var15 && class60.field693 < var16 && !client.field991) {
                           for(class68 var44 = (class68)client.field1054.method4027(); var44 != null; var44 = (class68)client.field1054.method4026()) {
                              if (var44.field779) {
                                 var44.method4014();
                                 var44.field780.field2939 = false;
                              }
                           }

                           if (class35.field453 == 0) {
                              client.field1027 = null;
                              client.field1028 = null;
                           }

                           if (!client.field991) {
                              class16.method124((byte)98);
                           }
                        }

                        var21 = var45.field773;
                        if (class305.method5452(var21, -1009820586)) {
                           method40(class189.field2519[var21], -1, var13, var14, var15, var16, var11, var12, -664756114);
                        }
                     }
                  }

                  if (var10.field2813) {
                     class68 var46;
                     if (!var10.field2867) {
                        if (var10.field2948 && class60.field700 >= var13 && class60.field693 >= var14 && class60.field700 < var15 && class60.field693 < var16) {
                           for(var46 = (class68)client.field1054.method4027(); var46 != null; var46 = (class68)client.field1054.method4026()) {
                              if (var46.field779 && var46.field780.field2915 == var46.field782) {
                                 var46.method4014();
                              }
                           }
                        }
                     } else if (class60.field700 >= var13 && class60.field693 >= var14 && class60.field700 < var15 && class60.field693 < var16) {
                        for(var46 = (class68)client.field1054.method4027(); var46 != null; var46 = (class68)client.field1054.method4026()) {
                           if (var46.field779) {
                              var46.method4014();
                              var46.field780.field2939 = false;
                           }
                        }

                        if (class35.field453 == 0) {
                           client.field1027 = null;
                           client.field1028 = null;
                        }

                        if (!client.field991) {
                           class16.method124((byte)106);
                        }
                     }

                     if (class60.field700 >= var13 && class60.field693 >= var14 && class60.field700 < var15 && class60.field693 < var16) {
                        var41 = true;
                     } else {
                        var41 = false;
                     }

                     var43 = false;
                     if ((class60.field701 == 1 || !class32.field440 && class60.field701 == 4) && var41) {
                        var43 = true;
                     }

                     boolean var48 = false;
                     if ((class60.field708 == 1 || !class32.field440 && class60.field708 == 4) && class60.field711 >= var13 && class60.field710 >= var14 && class60.field711 < var15 && class60.field710 < var16) {
                        var48 = true;
                     }

                     if (var48) {
                        class231.method4258(var10, class60.field711 - var11, class60.field710 - var12, (byte)24);
                     }

                     if (var10.field2818 == 1400) {
                        class63.field742.method6013(var17, var18, var41 & var43, var41 & var48, 1640258053);
                     }

                     if (client.field1027 != null && var10 != client.field1027 && var41) {
                        var23 = class45.method662(var10, 2124285206);
                        var27 = (var23 >> 20 & 1) != 0;
                        if (var27) {
                           client.field1031 = var10;
                        }
                     }

                     if (var10 == client.field1028) {
                        client.field1032 = true;
                        client.field1033 = var11;
                        client.field980 = var12;
                     }

                     if (var10.field2937) {
                        class68 var47;
                        if (var41 && client.field1053 != 0 && var10.field2915 != null) {
                           var47 = new class68();
                           var47.field779 = true;
                           var47.field780 = var10;
                           var47.field778 = client.field1053;
                           var47.field782 = var10.field2915;
                           client.field1054.method4020(var47);
                        }

                        if (client.field1027 != null || class157.field2149 != null || client.field991) {
                           var48 = false;
                           var43 = false;
                           var41 = false;
                        }

                        if (!var10.field2940 && var48) {
                           var10.field2940 = true;
                           if (var10.field2827 != null) {
                              var47 = new class68();
                              var47.field779 = true;
                              var47.field780 = var10;
                              var47.field783 = class60.field711 - var11;
                              var47.field778 = class60.field710 - var12;
                              var47.field782 = var10.field2827;
                              client.field1054.method4020(var47);
                           }
                        }

                        if (var10.field2940 && var43 && var10.field2833 != null) {
                           var47 = new class68();
                           var47.field779 = true;
                           var47.field780 = var10;
                           var47.field783 = class60.field700 - var11;
                           var47.field778 = class60.field693 - var12;
                           var47.field782 = var10.field2833;
                           client.field1054.method4020(var47);
                        }

                        if (var10.field2940 && !var43) {
                           var10.field2940 = false;
                           if (var10.field2898 != null) {
                              var47 = new class68();
                              var47.field779 = true;
                              var47.field780 = var10;
                              var47.field783 = class60.field700 - var11;
                              var47.field778 = class60.field693 - var12;
                              var47.field782 = var10.field2898;
                              client.field1129.method4020(var47);
                           }
                        }

                        if (var43 && var10.field2899 != null) {
                           var47 = new class68();
                           var47.field779 = true;
                           var47.field780 = var10;
                           var47.field783 = class60.field700 - var11;
                           var47.field778 = class60.field693 - var12;
                           var47.field782 = var10.field2899;
                           client.field1054.method4020(var47);
                        }

                        if (!var10.field2939 && var41) {
                           var10.field2939 = true;
                           if (var10.field2900 != null) {
                              var47 = new class68();
                              var47.field779 = true;
                              var47.field780 = var10;
                              var47.field783 = class60.field700 - var11;
                              var47.field778 = class60.field693 - var12;
                              var47.field782 = var10.field2900;
                              client.field1054.method4020(var47);
                           }
                        }

                        if (var10.field2939 && var41 && var10.field2844 != null) {
                           var47 = new class68();
                           var47.field779 = true;
                           var47.field780 = var10;
                           var47.field783 = class60.field700 - var11;
                           var47.field778 = class60.field693 - var12;
                           var47.field782 = var10.field2844;
                           client.field1054.method4020(var47);
                        }

                        if (var10.field2939 && !var41) {
                           var10.field2939 = false;
                           if (var10.field2902 != null) {
                              var47 = new class68();
                              var47.field779 = true;
                              var47.field780 = var10;
                              var47.field783 = class60.field700 - var11;
                              var47.field778 = class60.field693 - var12;
                              var47.field782 = var10.field2902;
                              client.field1129.method4020(var47);
                           }
                        }

                        if (var10.field2859 != null) {
                           var47 = new class68();
                           var47.field780 = var10;
                           var47.field782 = var10.field2859;
                           client.field970.method4020(var47);
                        }

                        class68 var50;
                        if (var10.field2907 != null && client.field1042 > var10.field2942) {
                           if (var10.field2908 != null && client.field1042 - var10.field2942 <= 32) {
                              label723:
                              for(var24 = var10.field2942; var24 < client.field1042; ++var24) {
                                 var23 = client.field988[var24 & 31];

                                 for(var22 = 0; var22 < var10.field2908.length; ++var22) {
                                    if (var23 == var10.field2908[var22]) {
                                       var50 = new class68();
                                       var50.field780 = var10;
                                       var50.field782 = var10.field2907;
                                       client.field1054.method4020(var50);
                                       break label723;
                                    }
                                 }
                              }
                           } else {
                              var47 = new class68();
                              var47.field780 = var10;
                              var47.field782 = var10.field2907;
                              client.field1054.method4020(var47);
                           }

                           var10.field2942 = client.field1042;
                        }

                        if (var10.field2870 != null && client.field1119 > var10.field2932) {
                           if (var10.field2861 != null && client.field1119 - var10.field2932 <= 32) {
                              label699:
                              for(var24 = var10.field2932; var24 < client.field1119; ++var24) {
                                 var23 = client.field1043[var24 & 31];

                                 for(var22 = 0; var22 < var10.field2861.length; ++var22) {
                                    if (var23 == var10.field2861[var22]) {
                                       var50 = new class68();
                                       var50.field780 = var10;
                                       var50.field782 = var10.field2870;
                                       client.field1054.method4020(var50);
                                       break label699;
                                    }
                                 }
                              }
                           } else {
                              var47 = new class68();
                              var47.field780 = var10;
                              var47.field782 = var10.field2870;
                              client.field1054.method4020(var47);
                           }

                           var10.field2932 = client.field1119;
                        }

                        if (var10.field2911 != null && client.field1046 > var10.field2944) {
                           if (var10.field2912 != null && client.field1046 - var10.field2944 <= 32) {
                              label675:
                              for(var24 = var10.field2944; var24 < client.field1046; ++var24) {
                                 var23 = client.field1045[var24 & 31];

                                 for(var22 = 0; var22 < var10.field2912.length; ++var22) {
                                    if (var23 == var10.field2912[var22]) {
                                       var50 = new class68();
                                       var50.field780 = var10;
                                       var50.field782 = var10.field2911;
                                       client.field1054.method4020(var50);
                                       break label675;
                                    }
                                 }
                              }
                           } else {
                              var47 = new class68();
                              var47.field780 = var10;
                              var47.field782 = var10.field2911;
                              client.field1054.method4020(var47);
                           }

                           var10.field2944 = client.field1046;
                        }

                        if (client.field1051 > var10.field2816 && var10.field2916 != null) {
                           var47 = new class68();
                           var47.field780 = var10;
                           var47.field782 = var10.field2916;
                           client.field1054.method4020(var47);
                        }

                        if (client.field1048 > var10.field2816 && var10.field2830 != null) {
                           var47 = new class68();
                           var47.field780 = var10;
                           var47.field782 = var10.field2830;
                           client.field1054.method4020(var47);
                        }

                        if (client.field1049 > var10.field2816 && var10.field2919 != null) {
                           var47 = new class68();
                           var47.field780 = var10;
                           var47.field782 = var10.field2919;
                           client.field1054.method4020(var47);
                        }

                        if (client.field1008 > var10.field2816 && var10.field2924 != null) {
                           var47 = new class68();
                           var47.field780 = var10;
                           var47.field782 = var10.field2924;
                           client.field1054.method4020(var47);
                        }

                        if (client.field879 > var10.field2816 && var10.field2925 != null) {
                           var47 = new class68();
                           var47.field780 = var10;
                           var47.field782 = var10.field2925;
                           client.field1054.method4020(var47);
                        }

                        if (client.field1052 > var10.field2816 && var10.field2860 != null) {
                           var47 = new class68();
                           var47.field780 = var10;
                           var47.field782 = var10.field2860;
                           client.field1054.method4020(var47);
                        }

                        var10.field2816 = client.field1040;
                        if (var10.field2918 != null) {
                           for(var24 = 0; var24 < client.field1076; ++var24) {
                              class68 var51 = new class68();
                              var51.field780 = var10;
                              var51.field785 = client.field949[var24];
                              var51.field786 = client.field1077[var24];
                              var51.field782 = var10.field2918;
                              client.field1054.method4020(var51);
                           }
                        }
                     }
                  }

                  if (!var10.field2813 && client.field1027 == null && class157.field2149 == null && !client.field991) {
                     if ((var10.field2936 >= 0 || var10.field2841 != 0) && class60.field700 >= var13 && class60.field693 >= var14 && class60.field700 < var15 && class60.field693 < var16) {
                        if (var10.field2936 >= 0) {
                           class238.field2775 = var0[var10.field2936];
                        } else {
                           class238.field2775 = var10;
                        }
                     }

                     if (var10.field2850 == 8 && class60.field700 >= var13 && class60.field693 >= var14 && class60.field700 < var15 && class60.field693 < var16) {
                        class23.field331 = var10;
                     }

                     if (var10.field2838 > var10.field2887) {
                        var19 = var11 + var10.field2826;
                        var21 = var10.field2887;
                        var24 = var10.field2838;
                        var23 = class60.field700;
                        var22 = class60.field693;
                        if (client.field927) {
                           client.field1064 = 32;
                        } else {
                           client.field1064 = 0;
                        }

                        client.field927 = false;
                        if (class60.field701 == 1 || !class32.field440 && class60.field701 == 4) {
                           if (var23 >= var19 && var23 < var19 + 16 && var22 >= var12 && var22 < var12 + 16) {
                              var10.field2836 -= 4;
                              class30.method274(var10, 714919243);
                           } else if (var23 >= var19 && var23 < var19 + 16 && var22 >= var21 + var12 - 16 && var22 < var12 + var21) {
                              var10.field2836 += 4;
                              class30.method274(var10, 1566393312);
                           } else if (var23 >= var19 - client.field1064 && var23 < var19 + client.field1064 + 16 && var22 >= var12 + 16 && var22 < var12 + var21 - 16) {
                              var25 = var21 * (var21 - 32) / var24;
                              if (var25 < 8) {
                                 var25 = 8;
                              }

                              var26 = var22 - var12 - 16 - var25 / 2;
                              int var49 = var21 - 32 - var25;
                              var10.field2836 = var26 * (var24 - var21) / var49;
                              class30.method274(var10, -1022483037);
                              client.field927 = true;
                           }
                        }

                        if (client.field1053 != 0) {
                           var25 = var10.field2826;
                           if (var23 >= var19 - var25 && var22 >= var12 && var23 < var19 + 16 && var22 <= var21 + var12) {
                              var10.field2836 += client.field1053 * 45;
                              class30.method274(var10, -834805267);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method39(int var0) {
      if (class63.field742 != null) {
         class63.field742.method6021(class237.field2769, (class12.field259.field1185 >> 7) + class184.field2498, (class12.field259.field1209 >> 7) + class4.field28, false, -1211581182);
         class63.field742.method6108((short)256);
      }

   }

   public static String method43(CharSequence[] var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var9 = var0[var1];
         return var9 == null ? "null" : var9.toString();
      } else {
         int var4 = var2 + var1;
         int var5 = 0;

         for(int var6 = var1; var6 < var4; ++var6) {
            CharSequence var7 = var0[var6];
            if (var7 == null) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var10 = new StringBuilder(var5);

         for(int var11 = var1; var11 < var4; ++var11) {
            CharSequence var8 = var0[var11];
            if (var8 == null) {
               var10.append("null");
            } else {
               var10.append(var8);
            }
         }

         return var10.toString();
      }
   }

   static int method42(int var0, class96 var1, boolean var2, int var3) {
      class242 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class3.method2(class81.field1272[--class135.field1964], 2128650148);
      } else {
         var4 = var2 ? class336.field4073 : class61.field713;
      }

      class30.method274(var4, -489154951);
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var4.field2857 = 2;
            var4.field2923 = class81.field1272[--class135.field1964];
            return 1;
         } else if (var0 == 1202) {
            var4.field2857 = 3;
            var4.field2923 = class12.field259.field820.method4416(-1325879282);
            return 1;
         } else {
            return 2;
         }
      } else {
         class135.field1964 -= 2;
         int var5 = class81.field1272[class135.field1964];
         int var6 = class81.field1272[class135.field1964 + 1];
         var4.field2934 = var5;
         var4.field2935 = var6;
         class283 var7 = class146.method3099(var5, (byte)89);
         var4.field2865 = var7.field3668;
         var4.field2866 = var7.field3640;
         var4.field2824 = var7.field3647;
         var4.field2854 = var7.field3653;
         var4.field2864 = var7.field3654;
         var4.field2868 = var7.field3649;
         if (var0 == 1205) {
            var4.field2872 = 0;
         } else if (var0 == 1212 | 1 == var7.field3665) {
            var4.field2872 = 1;
         } else {
            var4.field2872 = 2;
         }

         if (var4.field2869 > 0) {
            var4.field2868 = var4.field2868 * 32 / var4.field2869;
         } else if (var4.field2825 > 0) {
            var4.field2868 = var4.field2868 * 32 / var4.field2825;
         }

         return 1;
      }
   }

   static {
      field230 = class11.field254;
      field229 = new class215();
   }
}

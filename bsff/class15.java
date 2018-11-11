import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Comparator;

final class class15 implements Comparator {
   int method106(class14 var1, class14 var2, int var3) {
      return var1.field274.field286 < var2.field274.field286 ? -1 : (var2.field274.field286 == var1.field274.field286 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method106((class14)var1, (class14)var2, -39397794);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static int method99(int var0, int var1) {
      int var2 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var0 + var2;
   }

   static void method108(class59 var0, int var1) {
      if (class90.field1370) {
         class194.method3738(var0, -925721515);
      } else {
         int var2;
         if ((class60.field708 == 1 || !class32.field440 && class60.field708 == 4) && class60.field711 >= class90.field1338 + 765 - 50 && class60.field710 >= 453) {
            class46.field564.field1242 = !class46.field564.field1242;
            class46.method694(642291735);
            if (!class46.field564.field1242) {
               class263 var3 = class1.field12;
               int var4 = var3.method4606("scape main", 1095053888);
               var2 = var3.method4568(var4, "", (short)-7848);
               class95.method2007(var3, var4, var2, 255, false, (byte)-8);
            } else {
               class229.field2679.method4150(236410494);
               class229.field2680 = 1;
               class61.field714 = null;
            }
         }

         if (client.field872 != 5) {
            if (-1L == class90.field1373) {
               class90.field1373 = class6.method28(1358803598) + 1000L;
            }

            long var18 = class6.method28(1358803598);
            if (method98(-2021010123) && class90.field1359 == -1L) {
               class90.field1359 = var18;
               if (class90.field1359 > class90.field1373) {
                  class90.field1373 = class90.field1359;
               }
            }

            ++class90.field1351;
            if (client.field872 == 10 || client.field872 == 11) {
               if (client.field863 == 0) {
                  if (class60.field708 == 1 || !class32.field440 && class60.field708 == 4) {
                     var2 = class90.field1338 + 5;
                     short var5 = 463;
                     byte var6 = 100;
                     byte var7 = 35;
                     if (class60.field711 >= var2 && class60.field711 <= var6 + var2 && class60.field710 >= var5 && class60.field710 <= var7 + var5) {
                        if (class265.method4724(811295531)) {
                           class90.field1370 = true;
                        }

                        return;
                     }
                  }

                  if (class21.field324 != null && class265.method4724(-168217883)) {
                     class90.field1370 = true;
                  }
               }

               var2 = class60.field708;
               int var19 = class60.field711;
               int var20 = class60.field710;
               if (var2 == 0) {
                  var19 = class60.field700;
                  var20 = class60.field693;
               }

               if (!class32.field440 && var2 == 4) {
                  var2 = 1;
               }

               short var8;
               int var21;
               if (class90.field1355 == 0) {
                  boolean var9 = false;

                  while(class35.method519((byte)-33)) {
                     if (class130.field1839 == 84) {
                        var9 = true;
                     }
                  }

                  var21 = class54.field630 - 80;
                  var8 = 291;
                  if (var2 == 1 && var19 >= var21 - 75 && var19 <= var21 + 75 && var20 >= var8 - 20 && var20 <= var8 + 20) {
                     label676: {
                        String var10 = class181.method3421("secure", true, 924419787) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                           try {
                              var10 = "http://www.battle-scape.com/register";
                              Desktop.getDesktop().browse(new URI(var10));
                              break label676;
                           } catch (Exception var17) {
                              ;
                           }
                        }

                        if (class57.field646.startsWith("win")) {
                           class124.method2580(var10, 0, 2065823381);
                        } else if (class57.field646.startsWith("mac")) {
                           class39.method553(var10, 1, "openjs", (byte)8);
                        } else {
                           class124.method2580(var10, 2, -16184112);
                        }
                     }
                  }

                  var21 = class54.field630 + 80;
                  if (var2 == 1 && var19 >= var21 - 75 && var19 <= var21 + 75 && var20 >= var8 - 20 && var20 <= var8 + 20 || var9) {
                     if ((client.field858 & 33554432) != 0) {
                        class90.field1356 = "";
                        class90.field1371 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class90.field1358 = "Your normal account will not be affected.";
                        class90.field1343 = "";
                        class90.field1355 = 1;
                        class25.method200(1929042985);
                     } else if ((client.field858 & 4) != 0) {
                        if ((client.field858 & 1024) != 0) {
                           class90.field1371 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class90.field1358 = "Players can attack each other almost everywhere";
                           class90.field1343 = "and the Protect Item prayer won't work.";
                        } else {
                           class90.field1371 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class90.field1358 = "Players can attack each other";
                           class90.field1343 = "almost everywhere.";
                        }

                        class90.field1356 = "Warning!";
                        class90.field1355 = 1;
                        class25.method200(1929042985);
                     } else if ((client.field858 & 1024) != 0) {
                        class90.field1371 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class90.field1358 = "The Protect Item prayer will";
                        class90.field1343 = "not work on this world.";
                        class90.field1356 = "Warning!";
                        class90.field1355 = 1;
                        class25.method200(1929042985);
                     } else {
                        class198.method3767(false, 1217484121);
                     }
                  }
               } else {
                  int var22;
                  short var23;
                  if (class90.field1355 != 1) {
                     short var11;
                     boolean var12;
                     int var13;
                     if (class90.field1355 == 2) {
                        var11 = 201;
                        var22 = var11 + 52;
                        if (var2 == 1 && var20 >= var22 - 12 && var20 < var22 + 2) {
                           class90.field1367 = 0;
                        }

                        var22 += 15;
                        if (var2 == 1 && var20 >= var22 - 12 && var20 < var22 + 2) {
                           class90.field1367 = 1;
                        }

                        var22 += 15;
                        var11 = 361;
                        if (var2 == 1 && var20 >= var11 - 15 && var20 < var11) {
                           class33.method385("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.", 1637554704);
                           class90.field1355 = 5;
                           return;
                        }

                        var21 = class54.field630 - 80;
                        var8 = 321;
                        if (var2 == 1 && var19 >= var21 - 75 && var19 <= var21 + 75 && var20 >= var8 - 20 && var20 <= var8 + 20) {
                           class90.field1374 = class90.field1374.trim();
                           if (class90.field1374.length() == 0) {
                              class33.method385("", "Please enter your username/email address.", "", 638968924);
                              return;
                           }

                           if (class90.field1350.length() == 0) {
                              class33.method385("", "Please enter your password.", "", -649927884);
                              return;
                           }

                           class33.method385("", "Connecting to server...", "", 1503699);
                           class61.method1058(false, (byte)14);
                           class48.method748(20, 948479995);
                           return;
                        }

                        var21 = class90.field1337 + 180 + 80;
                        if (var2 == 1 && var19 >= var21 - 75 && var19 <= var21 + 75 && var20 >= var8 - 20 && var20 <= var8 + 20) {
                           class90.field1355 = 0;
                           class90.field1374 = "";
                           class90.field1350 = "";
                           class74.field1145 = 0;
                           class41.field520 = "";
                           class90.field1344 = true;
                        }

                        var21 = class54.field630 + -117;
                        var8 = 277;
                        class90.field1364 = var19 >= var21 && var19 < var21 + class90.field1363 && var20 >= var8 && var20 < var8 + class30.field415;
                        if (var2 == 1 && class90.field1364) {
                           class90.field1361 = !class90.field1361;
                           if (!class90.field1361 && class46.field564.field1234 != null) {
                              class46.field564.field1234 = null;
                              class46.method694(1145094955);
                           }
                        }

                        var21 = class54.field630 + 24;
                        var8 = 277;
                        class90.field1340 = var19 >= var21 && var19 < var21 + class90.field1363 && var20 >= var8 && var20 < var8 + class30.field415;
                        if (var2 == 1 && class90.field1340) {
                           class46.field564.field1240 = !class46.field564.field1240;
                           if (!class46.field564.field1240) {
                              class90.field1374 = "";
                              class46.field564.field1234 = null;
                              class25.method200(1929042985);
                           }

                           class46.method694(1271673524);
                        }

                        while(true) {
                           while(class35.method519((byte)-38)) {
                              var12 = false;

                              for(var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
                                 if (class257.field3346 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
                                    var12 = true;
                                    break;
                                 }
                              }

                              if (class130.field1839 == 13) {
                                 class90.field1355 = 0;
                                 class90.field1374 = "";
                                 class90.field1350 = "";
                                 class74.field1145 = 0;
                                 class41.field520 = "";
                                 class90.field1344 = true;
                              } else if (class90.field1367 == 0) {
                                 if (class130.field1839 == 85 && class90.field1374.length() > 0) {
                                    class90.field1374 = class90.field1374.substring(0, class90.field1374.length() - 1);
                                 }

                                 if (class130.field1839 == 84 || class130.field1839 == 80) {
                                    class90.field1367 = 1;
                                 }

                                 if (var12 && class90.field1374.length() < 320) {
                                    class90.field1374 = class90.field1374 + class257.field3346;
                                 }
                              } else if (class90.field1367 == 1) {
                                 if (class130.field1839 == 85 && class90.field1350.length() > 0) {
                                    class90.field1350 = class90.field1350.substring(0, class90.field1350.length() - 1);
                                 }

                                 if (class130.field1839 == 84 || class130.field1839 == 80) {
                                    class90.field1367 = 0;
                                 }

                                 if (class130.field1839 == 84) {
                                    class90.field1374 = class90.field1374.trim();
                                    if (class90.field1374.length() == 0) {
                                       class33.method385("", "Please enter your username/email address.", "", -1017972094);
                                       return;
                                    }

                                    if (class90.field1350.length() == 0) {
                                       class33.method385("", "Please enter your password.", "", -751088291);
                                       return;
                                    }

                                    class33.method385("", "Connecting to server...", "", -873175890);
                                    class61.method1058(false, (byte)14);
                                    class48.method748(20, -729152275);
                                    return;
                                 }

                                 if (var12 && class90.field1350.length() < 20) {
                                    class90.field1350 = class90.field1350 + class257.field3346;
                                 }
                              }
                           }

                           return;
                        }
                     }

                     if (class90.field1355 == 3) {
                        var22 = class90.field1337 + 180;
                        var23 = 276;
                        if (var2 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                           class198.method3767(false, 1967109414);
                        }

                        var22 = class90.field1337 + 180;
                        var23 = 326;
                        if (var2 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                           class33.method385("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.", 611401544);
                           class90.field1355 = 5;
                           return;
                        }
                     } else if (class90.field1355 == 4) {
                        var22 = class90.field1337 + 180 - 80;
                        var23 = 321;
                        if (var2 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                           class41.field520.trim();
                           if (class41.field520.length() != 6) {
                              class33.method385("", "Please enter a 6-digit PIN.", "", 275363443);
                              return;
                           }

                           class74.field1145 = Integer.parseInt(class41.field520);
                           class41.field520 = "";
                           class61.method1058(true, (byte)14);
                           class33.method385("", "Connecting to server...", "", 1322942243);
                           class48.method748(20, -2097848619);
                           return;
                        }

                        if (var2 == 1 && var19 >= class90.field1337 + 180 - 9 && var19 <= class90.field1337 + 180 + 130 && var20 >= 263 && var20 <= 296) {
                           class90.field1344 = !class90.field1344;
                        }

                        if (var2 == 1 && var19 >= class90.field1337 + 180 - 34 && var19 <= class90.field1337 + 34 + 180 && var20 >= 351 && var20 <= 363) {
                           label689: {
                              String var14 = class181.method3421("secure", true, 1040627283) + "m=totp-authenticator/disableTOTPRequest";
                              if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                 try {
                                    Desktop.getDesktop().browse(new URI(var14));
                                    break label689;
                                 } catch (Exception var16) {
                                    ;
                                 }
                              }

                              if (class57.field646.startsWith("win")) {
                                 class124.method2580(var14, 0, 1492014854);
                              } else if (class57.field646.startsWith("mac")) {
                                 class39.method553(var14, 1, "openjs", (byte)8);
                              } else {
                                 class124.method2580(var14, 2, 2009901640);
                              }
                           }
                        }

                        var22 = class90.field1337 + 180 + 80;
                        if (var2 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                           class90.field1355 = 0;
                           class90.field1374 = "";
                           class90.field1350 = "";
                           class74.field1145 = 0;
                           class41.field520 = "";
                        }

                        while(class35.method519((byte)-7)) {
                           var12 = false;

                           for(var13 = 0; var13 < "1234567890".length(); ++var13) {
                              if (class257.field3346 == "1234567890".charAt(var13)) {
                                 var12 = true;
                                 break;
                              }
                           }

                           if (class130.field1839 == 13) {
                              class90.field1355 = 0;
                              class90.field1374 = "";
                              class90.field1350 = "";
                              class74.field1145 = 0;
                              class41.field520 = "";
                           } else {
                              if (class130.field1839 == 85 && class41.field520.length() > 0) {
                                 class41.field520 = class41.field520.substring(0, class41.field520.length() - 1);
                              }

                              if (class130.field1839 == 84) {
                                 class41.field520.trim();
                                 if (class41.field520.length() != 6) {
                                    class33.method385("", "Please enter a 6-digit PIN.", "", 1927322564);
                                    return;
                                 }

                                 class74.field1145 = Integer.parseInt(class41.field520);
                                 class41.field520 = "";
                                 class61.method1058(true, (byte)14);
                                 class33.method385("", "Connecting to server...", "", 1976749050);
                                 class48.method748(20, 1260587853);
                                 return;
                              }

                              if (var12 && class41.field520.length() < 6) {
                                 class41.field520 = class41.field520 + class257.field3346;
                              }
                           }
                        }
                     } else if (class90.field1355 == 5) {
                        var22 = class90.field1337 + 180 - 80;
                        var23 = 321;
                        if (var2 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                           class278.method4922(-398888946);
                           return;
                        }

                        var22 = class90.field1337 + 180 + 80;
                        if (var2 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                           class198.method3767(true, -156466408);
                        }

                        while(class35.method519((byte)-28)) {
                           var12 = false;

                           for(var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
                              if (class257.field3346 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
                                 var12 = true;
                                 break;
                              }
                           }

                           if (class130.field1839 == 13) {
                              class198.method3767(true, 231486401);
                           } else {
                              if (class130.field1839 == 85 && class90.field1374.length() > 0) {
                                 class90.field1374 = class90.field1374.substring(0, class90.field1374.length() - 1);
                              }

                              if (class130.field1839 == 84) {
                                 class278.method4922(-1289793974);
                                 return;
                              }

                              if (var12 && class90.field1374.length() < 320) {
                                 class90.field1374 = class90.field1374 + class257.field3346;
                              }
                           }
                        }
                     } else if (class90.field1355 == 6) {
                        while(true) {
                           do {
                              if (!class35.method519((byte)-42)) {
                                 var11 = 321;
                                 if (var2 == 1 && var20 >= var11 - 20 && var20 <= var11 + 20) {
                                    class198.method3767(true, -499318033);
                                 }

                                 return;
                              }
                           } while(class130.field1839 != 84 && class130.field1839 != 13);

                           class198.method3767(true, -987854603);
                        }
                     }
                  } else {
                     while(class35.method519((byte)-72)) {
                        if (class130.field1839 == 84) {
                           class198.method3767(false, -516218991);
                        } else if (class130.field1839 == 13) {
                           class90.field1355 = 0;
                        }
                     }

                     var22 = class54.field630 - 80;
                     var23 = 321;
                     if (var2 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                        class198.method3767(false, 1389898064);
                     }

                     var22 = class54.field630 + 80;
                     if (var2 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                        class90.field1355 = 0;
                     }
                  }
               }
            }
         }
      }

   }

   static boolean method98(int var0) {
      if (client.field1125 != null && client.field1126 < client.field1125.size()) {
         while(client.field1126 < client.field1125.size()) {
            class64 var1 = (class64)client.field1125.get(client.field1126);
            if (!var1.method1089((byte)-98)) {
               return false;
            }

            ++client.field1126;
         }

         return true;
      } else {
         return true;
      }
   }
}

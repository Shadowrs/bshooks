public class class21 {
   public static class101 field322;
   static class148 field324;

   static void method174(class311 var0, class311 var1, class311 var2, boolean var3, int var4) {
      if (var3) {
         class90.field1338 = (class287.field3765 - 765) / 2;
         class90.field1337 = class90.field1338 + 202;
         class54.field630 = class90.field1337 + 180;
      }

      if (class90.field1370) {
         class88.method1852(var0, var1, -80484770);
      } else {
         if (var3) {
            class317.field3926.method5868(class90.field1338, 0);
            class61.field715.method5868(class90.field1338 + 382, 0);
            class90.field1341.method5842(class90.field1338 + 382 - class90.field1341.field3971 / 2, 18);
         }

         int var5;
         if (client.field872 == 0 || client.field872 == 5) {
            byte var6 = 20;
            var0.method5524("RuneScape is loading - please wait...", class90.field1337 + 180, 245 - var6, 16777215, -1);
            var5 = 253 - var6;
            class327.method5748(class90.field1337 + 180 - 152, var5, 304, 34, 9179409);
            class327.method5748(class90.field1337 + 180 - 151, var5 + 1, 302, 32, 0);
            class327.method5810(class90.field1337 + 180 - 150, var5 + 2, class90.field1353 * 3, 30, 9179409);
            class327.method5810(class90.field1337 + 180 - 150 + class90.field1353 * 3, var5 + 2, 300 - class90.field1353 * 3, 30, 0);
            var0.method5524(class90.field1354, class90.field1337 + 180, 276 - var6, 16777215, -1);
         }

         String var7;
         String var8;
         String var9;
         String var10;
         short var11;
         int var12;
         short var13;
         String var19;
         if (client.field872 == 20) {
            class90.field1339.method5842(class90.field1337 + 180 - class90.field1339.field3971 / 2, 271 - class90.field1339.field3972 / 2);
            var11 = 201;
            var0.method5524(class90.field1371, class90.field1337 + 180, var11, 16776960, 0);
            var12 = var11 + 15;
            var0.method5524(class90.field1358, class90.field1337 + 180, var12, 16776960, 0);
            var12 += 15;
            var0.method5524(class90.field1343, class90.field1337 + 180, var12, 16776960, 0);
            var12 += 15;
            var12 += 7;
            if (class90.field1355 != 4) {
               var0.method5521("Login: ", class90.field1337 + 180 - 110, var12, 16777215, 0);
               var13 = 200;
               var19 = class46.field564.field1240 ? client.method1580(class90.field1374, -1705583030) : class90.field1374;

               for(var7 = var19; var0.method5590(var7) > var13; var7 = var7.substring(0, var7.length() - 1)) {
                  ;
               }

               var0.method5521(class312.method5520(var7), class90.field1337 + 180 - 70, var12, 16777215, 0);
               var12 += 15;
               var8 = "Password: ";
               var9 = class90.field1350;
               var10 = class294.method5232('*', var9.length(), 1405503077);
               var0.method5521(var8 + var10, class90.field1337 + 180 - 108, var12, 16777215, 0);
               var12 += 15;
            }
         }

         if (client.field872 == 10 || client.field872 == 11) {
            class90.field1339.method5842(class90.field1337, 171);
            short var14;
            if (class90.field1355 == 0) {
               var11 = 251;
               var0.method5524("Welcome to RuneScape", class90.field1337 + 180, var11, 16776960, 0);
               var12 = var11 + 30;
               var5 = class90.field1337 + 180 - 80;
               var14 = 291;
               class203.field2605.method5842(var5 - 73, var14 - 20);
               var0.method5525("New User", var5 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = class90.field1337 + 180 + 80;
               class203.field2605.method5842(var5 - 73, var14 - 20);
               var0.method5525("Existing User", var5 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class90.field1355 == 1) {
               var0.method5524(class90.field1356, class90.field1337 + 180, 201, 16776960, 0);
               var11 = 236;
               var0.method5524(class90.field1371, class90.field1337 + 180, var11, 16777215, 0);
               var12 = var11 + 15;
               var0.method5524(class90.field1358, class90.field1337 + 180, var12, 16777215, 0);
               var12 += 15;
               var0.method5524(class90.field1343, class90.field1337 + 180, var12, 16777215, 0);
               var12 += 15;
               var5 = class90.field1337 + 180 - 80;
               var14 = 321;
               class203.field2605.method5842(var5 - 73, var14 - 20);
               var0.method5524("Continue", var5, var14 + 5, 16777215, 0);
               var5 = class90.field1337 + 180 + 80;
               class203.field2605.method5842(var5 - 73, var14 - 20);
               var0.method5524("Cancel", var5, var14 + 5, 16777215, 0);
            } else {
               int var15;
               int var22;
               if (class90.field1355 == 2) {
                  var11 = 201;
                  var0.method5524(class90.field1371, class54.field630, var11, 16776960, 0);
                  var12 = var11 + 15;
                  var0.method5524(class90.field1358, class54.field630, var12, 16776960, 0);
                  var12 += 15;
                  var0.method5524(class90.field1343, class54.field630, var12, 16776960, 0);
                  var12 += 15;
                  var12 += 7;
                  var0.method5521("Login: ", class54.field630 - 110, var12, 16777215, 0);
                  var13 = 200;
                  var19 = class46.field564.field1240 ? client.method1580(class90.field1374, -2096833382) : class90.field1374;

                  for(var7 = var19; var0.method5590(var7) > var13; var7 = var7.substring(1)) {
                     ;
                  }

                  var0.method5521(class312.method5520(var7) + (class90.field1367 == 0 & client.field866 % 40 < 20 ? class173.method3342(16776960, (byte)-65) + "|" : ""), class54.field630 - 70, var12, 16777215, 0);
                  var12 += 15;
                  var8 = "Password: ";
                  var9 = class90.field1350;
                  var10 = class294.method5232('*', var9.length(), -1692931689);
                  var0.method5521(var8 + var10 + (class90.field1367 == 1 & client.field866 % 40 < 20 ? class173.method3342(16776960, (byte)-100) + "|" : ""), class54.field630 - 108, var12, 16777215, 0);
                  var12 += 15;
                  var11 = 277;
                  var15 = class54.field630 + -117;
                  class330 var21 = class309.method5499(class90.field1361, class90.field1364, (byte)56);
                  var21.method5842(var15, var11);
                  var15 = var15 + var21.field3971 + 5;
                  var1.method5521("Remember username", var15, var11 + 13, 16776960, 0);
                  var15 = class54.field630 + 24;
                  var21 = class309.method5499(class46.field564.field1240, class90.field1340, (byte)14);
                  var21.method5842(var15, var11);
                  var15 = var15 + var21.field3971 + 5;
                  var1.method5521("Hide username", var15, var11 + 13, 16776960, 0);
                  var12 = var11 + 15;
                  var22 = class54.field630 - 80;
                  short var24 = 321;
                  class203.field2605.method5842(var22 - 73, var24 - 20);
                  var0.method5524("Login", var22, var24 + 5, 16777215, 0);
                  var22 = class54.field630 + 80;
                  class203.field2605.method5842(var22 - 73, var24 - 20);
                  var0.method5524("Cancel", var22, var24 + 5, 16777215, 0);
                  var11 = 357;
                  var1.method5524("Forgotten your password? <col=ffffff>Click here.", class54.field630, var11, 16776960, 0);
               } else if (class90.field1355 == 3) {
                  var11 = 201;
                  var0.method5524("Invalid username or password.", class90.field1337 + 180, var11, 16776960, 0);
                  var12 = var11 + 20;
                  var1.method5524("For accounts created after 24th November 2010, please use your", class90.field1337 + 180, var12, 16776960, 0);
                  var12 += 15;
                  var1.method5524("email address to login. Otherwise please login with your username.", class90.field1337 + 180, var12, 16776960, 0);
                  var12 += 15;
                  var5 = class90.field1337 + 180;
                  var14 = 276;
                  class203.field2605.method5842(var5 - 73, var14 - 20);
                  var2.method5524("Try again", var5, var14 + 5, 16777215, 0);
                  var5 = class90.field1337 + 180;
                  var14 = 326;
                  class203.field2605.method5842(var5 - 73, var14 - 20);
                  var2.method5524("Forgotten password?", var5, var14 + 5, 16777215, 0);
               } else {
                  short var16;
                  if (class90.field1355 == 4) {
                     var0.method5524("Authenticator", class90.field1337 + 180, 201, 16776960, 0);
                     var11 = 236;
                     var0.method5524(class90.field1371, class90.field1337 + 180, var11, 16777215, 0);
                     var12 = var11 + 15;
                     var0.method5524(class90.field1358, class90.field1337 + 180, var12, 16777215, 0);
                     var12 += 15;
                     var0.method5524(class90.field1343, class90.field1337 + 180, var12, 16777215, 0);
                     var12 += 15;
                     var0.method5521("PIN: " + client.method1580(class41.field520, 994259472) + (client.field866 % 40 < 20 ? class173.method3342(16776960, (byte)-72) + "|" : ""), class90.field1337 + 180 - 108, var12, 16777215, 0);
                     var12 -= 8;
                     var0.method5521("Trust this computer", class90.field1337 + 180 - 9, var12, 16776960, 0);
                     var12 += 15;
                     var0.method5521("for 30 days: ", class90.field1337 + 180 - 9, var12, 16776960, 0);
                     var5 = class90.field1337 + 180 - 9 + var0.method5590("for 30 days: ") + 15;
                     var22 = var12 - var0.field3891;
                     class330 var18;
                     if (class90.field1344) {
                        var18 = class151.field2127;
                     } else {
                        var18 = class123.field1691;
                     }

                     var18.method5842(var5, var22);
                     var12 += 15;
                     var15 = class90.field1337 + 180 - 80;
                     var16 = 321;
                     class203.field2605.method5842(var15 - 73, var16 - 20);
                     var0.method5524("Continue", var15, var16 + 5, 16777215, 0);
                     var15 = class90.field1337 + 180 + 80;
                     class203.field2605.method5842(var15 - 73, var16 - 20);
                     var0.method5524("Cancel", var15, var16 + 5, 16777215, 0);
                     var1.method5524("<u=ff>Can't Log In?</u>", class90.field1337 + 180, var16 + 36, 255, 0);
                  } else if (class90.field1355 != 5) {
                     if (class90.field1355 == 6) {
                        var11 = 201;
                        var0.method5524(class90.field1371, class90.field1337 + 180, var11, 16776960, 0);
                        var12 = var11 + 15;
                        var0.method5524(class90.field1358, class90.field1337 + 180, var12, 16776960, 0);
                        var12 += 15;
                        var0.method5524(class90.field1343, class90.field1337 + 180, var12, 16776960, 0);
                        var12 += 15;
                        var5 = class90.field1337 + 180;
                        var14 = 321;
                        class203.field2605.method5842(var5 - 73, var14 - 20);
                        var0.method5524("Back", var5, var14 + 5, 16777215, 0);
                     }
                  } else {
                     var0.method5524("Forgotten your password?", class90.field1337 + 180, 201, 16776960, 0);
                     var11 = 221;
                     var2.method5524(class90.field1371, class90.field1337 + 180, var11, 16776960, 0);
                     var12 = var11 + 15;
                     var2.method5524(class90.field1358, class90.field1337 + 180, var12, 16776960, 0);
                     var12 += 15;
                     var2.method5524(class90.field1343, class90.field1337 + 180, var12, 16776960, 0);
                     var12 += 15;
                     var12 += 14;
                     var0.method5521("Username/email: ", class90.field1337 + 180 - 145, var12, 16777215, 0);
                     var13 = 174;
                     if (class46.field564.field1240) {
                        var8 = class90.field1374;
                        String var17 = class294.method5232('*', var8.length(), -458869367);
                        var7 = var17;
                     } else {
                        var7 = class90.field1374;
                     }

                     for(var7 = var7; var0.method5590(var7) > var13; var7 = var7.substring(1)) {
                        ;
                     }

                     var0.method5521(class312.method5520(var7) + (client.field866 % 40 < 20 ? class173.method3342(16776960, (byte)-94) + "|" : ""), class90.field1337 + 180 - 34, var12, 16777215, 0);
                     var12 += 15;
                     var15 = class90.field1337 + 180 - 80;
                     var16 = 321;
                     class203.field2605.method5842(var15 - 73, var16 - 20);
                     var0.method5524("Recover", var15, var16 + 5, 16777215, 0);
                     var15 = class90.field1337 + 180 + 80;
                     class203.field2605.method5842(var15 - 73, var16 - 20);
                     var0.method5524("Back", var15, var16 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (class90.field1351 > 0) {
            class197.method3754(class90.field1351, -1144178325);
            class90.field1351 = 0;
         }

         class151.method3140(111995210);
         class38.field491[class46.field564.field1242 ? 1 : 0].method5842(class90.field1338 + 765 - 40, 463);
         if (client.field872 > 5 && client.field863 == 0) {
            if (class287.field3764 != null) {
               var12 = class90.field1338 + 5;
               var13 = 463;
               byte var20 = 100;
               byte var23 = 35;
               class287.field3764.method5842(var12, var13);
               var0.method5524("World " + client.field857, var20 / 2 + var12, var23 / 2 + var13 - 2, 16777215, 0);
               if (field324 != null) {
                  var1.method5524("Loading...", var20 / 2 + var12, var23 / 2 + var13 + 12, 16777215, 0);
               } else {
                  var1.method5524("Click to switch", var20 / 2 + var12, var23 / 2 + var13 + 12, 16777215, 0);
               }
            } else {
               class287.field3764 = class44.method654(class44.field549, "sl_button", "", (byte)-54);
            }
         }
      }

   }
}

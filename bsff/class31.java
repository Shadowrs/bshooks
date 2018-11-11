public class class31 {
   static class165 field422;
   int field420;
   int field418;
   int field419;

   class31(int var1, int var2, int var3) {
      this.field420 = var1;
      this.field418 = var2;
      this.field419 = var3;
   }

   static final void method303(int var0) {
      for(int var1 = 0; var1 < class93.field1414; ++var1) {
         class72 var2 = client.field971[class93.field1415[var1]];
         var2.method1145((byte)-114);
      }

   }

   static final void method302(class285 var0, int var1, int var2, int var3, byte var4) {
      if (client.field992 < 400) {
         if (var0.field3718 != null) {
            var0 = var0.method5136(1835663668);
         }

         if (var0 != null && var0.field3729 && (!var0.field3731 || client.field1055 == var1)) {
            String var5 = var0.field3701;
            int var6;
            int var7;
            int var8;
            if (var0.field3715 != 0) {
               var6 = var0.field3715;
               var7 = class12.field259.field832;
               var8 = var7 - var6;
               String var9;
               if (var8 < -9) {
                  var9 = class173.method3342(16711680, (byte)5);
               } else if (var8 < -6) {
                  var9 = class173.method3342(16723968, (byte)-16);
               } else if (var8 < -3) {
                  var9 = class173.method3342(16740352, (byte)-75);
               } else if (var8 < 0) {
                  var9 = class173.method3342(16756736, (byte)-13);
               } else if (var8 > 9) {
                  var9 = class173.method3342(65280, (byte)-2);
               } else if (var8 > 6) {
                  var9 = class173.method3342(4259584, (byte)-30);
               } else if (var8 > 3) {
                  var9 = class173.method3342(8453888, (byte)-44);
               } else if (var8 > 0) {
                  var9 = class173.method3342(12648192, (byte)4);
               } else {
                  var9 = class173.method3342(16776960, (byte)-2);
               }

               var5 = var5 + var9 + "  (level-" + var0.field3715 + ")";
            }

            if (var0.field3731 && client.field1094) {
               class164.method3228("Examine", class173.method3342(16776960, (byte)-74) + var5, 1003, var1, var2, var3, (byte)-28);
            }

            if (client.field923 == 1) {
               class164.method3228("Use", client.field1010 + " -> " + class173.method3342(16776960, (byte)-116) + var5, 7, var1, var2, var3, (byte)-35);
            } else if (client.field1011) {
               if ((class241.field2799 & 2) == 2) {
                  class164.method3228(client.field956, client.field1015 + " -> " + class173.method3342(16776960, (byte)-121) + var5, 8, var1, var2, var3, (byte)-87);
               }
            } else {
               var8 = var0.field3731 && client.field1094 ? 2000 : 0;
               String[] var11 = var0.field3720;
               if (var11 != null) {
                  for(var6 = 4; var6 >= 0; --var6) {
                     if (var11[var6] != null && !var11[var6].equalsIgnoreCase("Attack")) {
                        var7 = 0;
                        if (var6 == 0) {
                           var7 = var8 + 9;
                        }

                        if (var6 == 1) {
                           var7 = var8 + 10;
                        }

                        if (var6 == 2) {
                           var7 = var8 + 11;
                        }

                        if (var6 == 3) {
                           var7 = var8 + 12;
                        }

                        if (var6 == 4) {
                           var7 = var8 + 13;
                        }

                        class164.method3228(var11[var6], class173.method3342(16776960, (byte)-125) + var5, var7, var1, var2, var3, (byte)-68);
                     }
                  }
               }

               if (var11 != null) {
                  for(var6 = 4; var6 >= 0; --var6) {
                     if (var11[var6] != null && var11[var6].equalsIgnoreCase("Attack")) {
                        short var10 = 0;
                        if (class89.field1334 != client.field883) {
                           if (client.field883 == class89.field1332 || client.field883 == class89.field1336 && var0.field3715 > class12.field259.field832) {
                              var10 = 2000;
                           }

                           var7 = 0;
                           if (var6 == 0) {
                              var7 = var10 + 9;
                           }

                           if (var6 == 1) {
                              var7 = var10 + 10;
                           }

                           if (var6 == 2) {
                              var7 = var10 + 11;
                           }

                           if (var6 == 3) {
                              var7 = var10 + 12;
                           }

                           if (var6 == 4) {
                              var7 = var10 + 13;
                           }

                           class164.method3228(var11[var6], class173.method3342(16776960, (byte)-58) + var5, var7, var1, var2, var3, (byte)-103);
                        }
                     }
                  }
               }

               if (!var0.field3731 || !client.field1094) {
                  class164.method3228("Examine", class173.method3342(16776960, (byte)-75) + var5, 1003, var1, var2, var3, (byte)-110);
               }
            }
         }
      }

   }
}

import java.util.LinkedList;

public abstract class class28 {
   int field386;
   int field389;
   short[][][] field388;
   int field391;
   class31[][][][] field396;
   short[][][] field393;
   int field392;
   byte[][][] field394;
   int field390;
   int field387;
   byte[][][] field395;

   class28() {
      new LinkedList();
   }

   int method264(int var1, int var2, byte var3) {
      return var1 >= 0 && var2 >= 0 ? (var1 < 64 && var2 < 64 ? this.field388[0][var1][var2] - 1 : -1) : -1;
   }

   void method243(int var1, int var2, class194 var3, int var4, int var5) {
      boolean var6 = (var4 & 2) != 0;
      if (var6) {
         this.field393[0][var1][var2] = (short)var3.getUByte(-1653595944);
      }

      this.field388[0][var1][var2] = (short)var3.getUByte(-1707093643);
   }

   void method244(int var1, int var2, class194 var3, int var4, int var5) {
      int var6 = ((var4 & 24) >> 3) + 1;
      boolean var7 = (var4 & 2) != 0;
      boolean var8 = (var4 & 4) != 0;
      this.field388[0][var1][var2] = (short)var3.getUByte(85466062);
      int var9;
      int var10;
      int var11;
      if (var7) {
         var9 = var3.getUByte(-454758792);

         for(var10 = 0; var10 < var9; ++var10) {
            int var12 = var3.getUByte(1475036163);
            if (var12 != 0) {
               this.field393[var10][var1][var2] = (short)var12;
               var11 = var3.getUByte(-1309943267);
               this.field394[var10][var1][var2] = (byte)(var11 >> 2);
               this.field395[var10][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.getUByte(962288809);
            if (var10 != 0) {
               class31[] var15 = this.field396[var9][var1][var2] = new class31[var10];

               for(var11 = 0; var11 < var10; ++var11) {
                  int var13 = var3.getBigSmart(-1000806689);
                  int var14 = var3.getUByte(-349220167);
                  var15[var11] = new class31(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   int method260(int var1) {
      return this.field386;
   }

   int method247(int var1) {
      return this.field389;
   }

   void method241(int var1, int var2, class194 var3, int var4) {
      int var5 = var3.getUByte(925666856);
      if (var5 != 0) {
         if ((var5 & 1) != 0) {
            this.method243(var1, var2, var3, var5, -439600063);
         } else {
            this.method244(var1, var2, var3, var5, -1570259589);
         }
      }

   }

   static final void method268(class242 var0, int var1, int var2, int var3, int var4) {
      class33.method384(-1761463007);
      class236 var5 = var0.method4475(false, (byte)7);
      if (var5 != null) {
         class327.method5733(var1, var2, var5.field2765 + var1, var2 + var5.field2763);
         if (client.field1087 != 2 && client.field1087 != 5) {
            int var6 = client.field925 & 2047;
            int var7 = class12.field259.field1185 / 32 + 48;
            int var8 = 464 - class12.field259.field1209 / 32;
            class180.field2371.method5886(var1, var2, var5.field2765, var5.field2763, var7, var8, var6, 256, var5.field2766, var5.field2768);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < client.field1081; ++var9) {
               var10 = client.field1082[var9] * 4 + 2 - class12.field259.field1185 / 32;
               var11 = client.field1083[var9] * 4 + 2 - class12.field259.field1209 / 32;
               class4.method8(var1, var2, var10, var11, client.field1084[var9], var5, -1666033635);
            }

            var9 = 0;

            while(true) {
               int var12;
               int var13;
               if (var9 >= 104) {
                  for(var9 = 0; var9 < client.field898; ++var9) {
                     class84 var18 = client.field897[client.field899[var9]];
                     if (var18 != null && var18.vmethod1824(1286323541)) {
                        class285 var15 = var18.field1300;
                        if (var15 != null && var15.field3718 != null) {
                           var15 = var15.method5136(1279132359);
                        }

                        if (var15 != null && var15.field3717 && var15.field3729) {
                           var12 = var18.field1185 / 32 - class12.field259.field1185 / 32;
                           var13 = var18.field1209 / 32 - class12.field259.field1209 / 32;
                           class4.method8(var1, var2, var12, var13, class135.field1966[1], var5, -1666033635);
                        }
                     }
                  }

                  var9 = class93.field1414;
                  int[] var19 = class93.field1415;

                  class72 var20;
                  for(var11 = 0; var11 < var9; ++var11) {
                     var20 = client.field971[var19[var11]];
                     if (var20 != null && var20.vmethod1824(1859897197) && !var20.field836 && var20 != class12.field259) {
                        var13 = var20.field1185 / 32 - class12.field259.field1185 / 32;
                        int var16 = var20.field1209 / 32 - class12.field259.field1209 / 32;
                        boolean var17 = false;
                        if (class12.field259.field840 != 0 && var20.field840 != 0 && var20.field840 == class12.field259.field840) {
                           var17 = true;
                        }

                        if (var20.method1141(-2048748265)) {
                           class4.method8(var1, var2, var13, var16, class135.field1966[3], var5, -1666033635);
                        } else if (var17) {
                           class4.method8(var1, var2, var13, var16, class135.field1966[4], var5, -1666033635);
                        } else if (var20.method1144(484217974)) {
                           class4.method8(var1, var2, var13, var16, class135.field1966[5], var5, -1666033635);
                        } else {
                           class4.method8(var1, var2, var13, var16, class135.field1966[2], var5, -1666033635);
                        }
                     }
                  }

                  if (client.field874 != 0 && client.field866 % 20 < 10) {
                     if (client.field874 == 1 && client.field875 >= 0 && client.field875 < client.field897.length) {
                        class84 var21 = client.field897[client.field875];
                        if (var21 != null) {
                           var12 = var21.field1185 / 32 - class12.field259.field1185 / 32;
                           var13 = var21.field1209 / 32 - class12.field259.field1209 / 32;
                           class166.method3245(var1, var2, var12, var13, class64.field748[1], var5, -148931943);
                        }
                     }

                     if (client.field874 == 2) {
                        var11 = client.field1078 * 4 - class184.field2498 * 4 + 2 - class12.field259.field1185 / 32;
                        var12 = client.field878 * 4 - class4.field28 * 4 + 2 - class12.field259.field1209 / 32;
                        class166.method3245(var1, var2, var11, var12, class64.field748[1], var5, -148931943);
                     }

                     if (client.field874 == 10 && client.field1036 >= 0 && client.field1036 < client.field971.length) {
                        var20 = client.field971[client.field1036];
                        if (var20 != null) {
                           var12 = var20.field1185 / 32 - class12.field259.field1185 / 32;
                           var13 = var20.field1209 / 32 - class12.field259.field1209 / 32;
                           class166.method3245(var1, var2, var12, var13, class64.field748[1], var5, -148931943);
                        }
                     }
                  }

                  if (client.field1085 != 0) {
                     var11 = client.field1085 * 4 + 2 - class12.field259.field1185 / 32;
                     var12 = client.field1005 * 4 + 2 - class12.field259.field1209 / 32;
                     class4.method8(var1, var2, var11, var12, class64.field748[0], var5, -1666033635);
                  }

                  if (!class12.field259.field836) {
                     class327.method5810(var5.field2765 / 2 + var1 - 1, var5.field2763 / 2 + var2 - 1, 3, 3, 16777215);
                  }
                  break;
               }

               for(var10 = 0; var10 < 104; ++var10) {
                  class217 var14 = client.field983[class237.field2769][var9][var10];
                  if (var14 != null) {
                     var12 = var9 * 4 + 2 - class12.field259.field1185 / 32;
                     var13 = var10 * 4 + 2 - class12.field259.field1209 / 32;
                     class4.method8(var1, var2, var12, var13, class135.field1966[0], var5, -1666033635);
                  }
               }

               ++var9;
            }
         } else {
            class327.method5759(var1, var2, 0, var5.field2766, var5.field2768);
         }

         client.field1061[var3] = true;
      }

   }
}

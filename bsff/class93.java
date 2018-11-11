public class class93 {
   static byte[] field1411 = new byte[2048];
   static byte[] field1409 = new byte[2048];
   static class194[] field1413 = new class194[2048];
   static int field1414 = 0;
   static int[] field1415 = new int[2048];
   static int field1416 = 0;
   static int[] field1418 = new int[2048];
   static int[] field1420 = new int[2048];
   static int[] field1419 = new int[2048];
   static int[] field1412 = new int[2048];
   static int field1421 = 0;
   static int[] field1422 = new int[2048];
   static class194 field1423 = new class194(new byte[5000]);

   public static int method1928(CharSequence var0, int var1, short var2) {
      return class136.method2876(var0, var1, true, 1202994242);
   }

   public static boolean method1941(class261 var0, int var1, int var2) {
      byte[] var3 = var0.method4612(var1, 1525658175);
      if (var3 == null) {
         return false;
      } else {
         class277.method4902(var3, -1481069516);
         return true;
      }
   }

   public static final class331 method1945(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var7 = ((long)var4 << 40) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var3 << 42);
      class331 var9;
      if (!var5) {
         var9 = (class331)class283.field3643.method3929(var7);
         if (var9 != null) {
            return var9;
         }
      }

      class283 var10 = class146.method3099(var0, (byte)74);
      if (var1 > 1 && var10.field3673 != null) {
         int var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if (var1 >= var10.field3680[var12] && var10.field3680[var12] != 0) {
               var11 = var10.field3673[var12];
            }
         }

         if (var11 != -1) {
            var10 = class146.method3099(var11, (byte)116);
         }
      }

      class131 var22 = var10.method5061(1, 125549227);
      if (var22 == null) {
         return null;
      } else {
         class331 var23 = null;
         if (var10.field3676 != -1) {
            var23 = method1945(var10.field3684, 10, 1, 0, 0, true, 1005788921);
            if (var23 == null) {
               return null;
            }
         } else if (var10.field3650 != -1) {
            var23 = method1945(var10.field3685, var1, var2, var3, 0, false, 1790034115);
            if (var23 == null) {
               return null;
            }
         } else if (var10.field3636 != -1) {
            var23 = method1945(var10.field3687, var1, 0, 0, 0, false, 883732843);
            if (var23 == null) {
               return null;
            }
         }

         int[] var13 = class327.field3958;
         int var14 = class327.field3954;
         int var15 = class327.field3957;
         int[] var16 = new int[4];
         class327.method5771(var16);
         var9 = new class331(36, 32);
         class327.method5731(var9.field3986, 36, 32);
         class327.method5798();
         class134.method2792();
         class134.method2795(16, 16);
         class134.field1930 = false;
         if (var10.field3636 != -1) {
            var23.method5865(0, 0);
         }

         int var17 = var10.field3649;
         if (var5) {
            var17 = (int)((double)var17 * 1.5D);
         } else if (var2 == 2) {
            var17 = (int)((double)var17 * 1.04D);
         }

         int var18 = var17 * class134.field1955[var10.field3668] >> 16;
         int var19 = var17 * class134.field1933[var10.field3668] >> 16;
         var22.method2687();
         var22.method2700(0, var10.field3640, var10.field3647, var10.field3668, var10.field3653, var22.field2042 / 2 + var18 + var10.field3654, var19 + var10.field3654);
         if (var10.field3650 != -1) {
            var23.method5865(0, 0);
         }

         if (var2 >= 1) {
            var9.method5866(1);
         }

         if (var2 >= 2) {
            var9.method5866(16777215);
         }

         if (var3 != 0) {
            var9.method5863(var3);
         }

         class327.method5731(var9.field3986, 36, 32);
         if (var10.field3676 != -1) {
            var23.method5865(0, 0);
         }

         if (var4 == 1 || var4 == 2 && var10.field3665 == 1) {
            class311 var20 = class236.field2767;
            String var21;
            if (var1 < 100000) {
               var21 = "<col=ffff00>" + var1 + "</col>";
            } else if (var1 < 10000000) {
               var21 = "<col=ffffff>" + var1 / 1000 + "K</col>";
            } else {
               var21 = "<col=00ff80>" + var1 / 1000000 + "M</col>";
            }

            var20.method5521(var21, 0, 9, 16776960, 1);
         }

         if (!var5) {
            class283.field3643.method3932(var9, var7);
         }

         class327.method5731(var13, var14, var15);
         class327.method5736(var16);
         class134.method2792();
         class134.field1930 = true;
         return var9;
      }
   }

   static final void method1950(int var0, int var1) {
      class30.method298(2036922738);
      class153.method3155((byte)108);
      int var2 = class260.method4547(var0, (byte)106).field3444;
      if (var2 != 0) {
         int var3 = class237.field2770[var0];
         if (var2 == 1) {
            if (var3 == 1) {
               class134.method2797(0.9D);
               ((class123)class134.field1944).method2574(0.9D);
            }

            if (var3 == 2) {
               class134.method2797(0.8D);
               ((class123)class134.field1944).method2574(0.8D);
            }

            if (var3 == 3) {
               class134.method2797(0.7D);
               ((class123)class134.field1944).method2574(0.7D);
            }

            if (var3 == 4) {
               class134.method2797(0.6D);
               ((class123)class134.field1944).method2574(0.6D);
            }

            class152.method3141(1347687077);
         }

         if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
               var4 = 255;
            }

            if (var3 == 1) {
               var4 = 192;
            }

            if (var3 == 2) {
               var4 = 128;
            }

            if (var3 == 3) {
               var4 = 64;
            }

            if (var3 == 4) {
               var4 = 0;
            }

            if (var4 != client.field1044) {
               if (client.field1044 == 0 && client.field1089 != -1) {
                  class95.method2007(class1.field12, client.field1089, 0, var4, false, (byte)7);
                  client.field1090 = false;
               } else if (var4 == 0) {
                  class229.field2679.method4150(544982965);
                  class229.field2680 = 1;
                  class61.field714 = null;
                  client.field1090 = false;
               } else {
                  class95.method2008(var4, -1248620206);
               }

               client.field1044 = var4;
            }
         }

         if (var2 == 4) {
            if (var3 == 0) {
               client.field1091 = 127;
            }

            if (var3 == 1) {
               client.field1091 = 96;
            }

            if (var3 == 2) {
               client.field1091 = 64;
            }

            if (var3 == 3) {
               client.field1091 = 32;
            }

            if (var3 == 4) {
               client.field1091 = 0;
            }
         }

         if (var2 == 5) {
            client.field884 = var3;
         }

         if (var2 == 6) {
            client.field1018 = var3;
         }

         if (var2 == 9) {
            client.field1019 = var3;
         }

         if (var2 == 10) {
            if (var3 == 0) {
               client.field1034 = 127;
            }

            if (var3 == 1) {
               client.field1034 = 96;
            }

            if (var3 == 2) {
               client.field1034 = 64;
            }

            if (var3 == 3) {
               client.field1034 = 32;
            }

            if (var3 == 4) {
               client.field1034 = 0;
            }
         }

         if (var2 == 17) {
            client.field1055 = var3 & '\uffff';
         }

         if (var2 == 18) {
            client.field882 = (class89)class44.method660(class175.method3365(1602843149), var3, -1481775804);
            if (client.field882 == null) {
               client.field882 = class89.field1336;
            }
         }

         if (var2 == 19) {
            if (var3 == -1) {
               client.field982 = -1;
            } else {
               client.field982 = var3 & 2047;
            }
         }

         if (var2 == 22) {
            client.field883 = (class89)class44.method660(class175.method3365(516622617), var3, -869055950);
            if (client.field883 == null) {
               client.field883 = class89.field1336;
            }
         }
      }

   }
}

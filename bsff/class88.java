import java.math.BigInteger;

public class class88 {
   static BigInteger field1330 = new BigInteger("10001", 16);
   static BigInteger field1326 = new BigInteger("972ec975ec994121fc43ba6a1869a9ed0d590a506ffc75333d270677fadd618bb97e15839ae201cf23bd48dc25cc44cd14936ae07aab269c372fa8ae1a6fd14d6b69b97ed51eb1a00de131d0ecb92afea4e6fa34cf3b796ca432c190ff59a203fa84a44ce6f5c1bcc99dcb15069a1ef73b6b44869669df4775ba3443b7543149", 16);

   public static int method1853(int var0, int var1) {
      class277 var2 = class290.method5206(var0, -2133273790);
      int var3 = var2.field3535;
      int var4 = var2.field3538;
      int var5 = var2.field3539;
      int var6 = class237.field2771[var5 - var4];
      return class237.field2770[var3] >> var4 & var6;
   }

   static void method1852(class311 var0, class311 var1, int var2) {
      if (class25.field356 == null) {
         class25.field356 = class316.method5639(class44.field549, "sl_back", "", -1617190575);
      }

      if (class90.field1348 == null) {
         class90.field1348 = class199.method3774(class44.field549, "sl_flags", "", (byte)0);
      }

      if (class107.field1569 == null) {
         class107.field1569 = class199.method3774(class44.field549, "sl_arrows", "", (byte)0);
      }

      if (class157.field2145 == null) {
         class157.field2145 = class199.method3774(class44.field549, "sl_stars", "", (byte)0);
      }

      class327.method5810(class90.field1338, 23, 765, 480, 0);
      class327.method5746(class90.field1338, 0, 125, 23, 12425273, 9135624);
      class327.method5746(class90.field1338 + 125, 0, 640, 23, 5197647, 2697513);
      var0.method5524("Select a world", class90.field1338 + 62, 15, 0, -1);
      if (class157.field2145 != null) {
         class157.field2145[1].method5842(class90.field1338 + 140, 1);
         var1.method5521("Members only world", class90.field1338 + 152, 10, 16777215, -1);
         class157.field2145[0].method5842(class90.field1338 + 140, 12);
         var1.method5521("Free world", class90.field1338 + 152, 21, 16777215, -1);
      }

      int var3;
      int var4;
      if (class107.field1569 != null) {
         int var5 = class90.field1338 + 280;
         if (class77.field1220[0] == 0 && class77.field1224[0] == 0) {
            class107.field1569[2].method5842(var5, 4);
         } else {
            class107.field1569[0].method5842(var5, 4);
         }

         if (class77.field1220[0] == 0 && class77.field1224[0] == 1) {
            class107.field1569[3].method5842(var5 + 15, 4);
         } else {
            class107.field1569[1].method5842(var5 + 15, 4);
         }

         var0.method5521("World", var5 + 32, 17, 16777215, -1);
         int var6 = class90.field1338 + 390;
         if (class77.field1220[0] == 1 && class77.field1224[0] == 0) {
            class107.field1569[2].method5842(var6, 4);
         } else {
            class107.field1569[0].method5842(var6, 4);
         }

         if (class77.field1220[0] == 1 && class77.field1224[0] == 1) {
            class107.field1569[3].method5842(var6 + 15, 4);
         } else {
            class107.field1569[1].method5842(var6 + 15, 4);
         }

         var0.method5521("Players", var6 + 32, 17, 16777215, -1);
         var3 = class90.field1338 + 500;
         if (class77.field1220[0] == 2 && class77.field1224[0] == 0) {
            class107.field1569[2].method5842(var3, 4);
         } else {
            class107.field1569[0].method5842(var3, 4);
         }

         if (class77.field1220[0] == 2 && class77.field1224[0] == 1) {
            class107.field1569[3].method5842(var3 + 15, 4);
         } else {
            class107.field1569[1].method5842(var3 + 15, 4);
         }

         var0.method5521("Location", var3 + 32, 17, 16777215, -1);
         var4 = class90.field1338 + 610;
         if (class77.field1220[0] == 3 && class77.field1224[0] == 0) {
            class107.field1569[2].method5842(var4, 4);
         } else {
            class107.field1569[0].method5842(var4, 4);
         }

         if (class77.field1220[0] == 3 && class77.field1224[0] == 1) {
            class107.field1569[3].method5842(var4 + 15, 4);
         } else {
            class107.field1569[1].method5842(var4 + 15, 4);
         }

         var0.method5521("Type", var4 + 32, 17, 16777215, -1);
      }

      class327.method5810(class90.field1338 + 708, 4, 50, 16, 0);
      var1.method5524("Cancel", class90.field1338 + 708 + 25, 16, 16777215, -1);
      class90.field1372 = -1;
      if (class25.field356 != null) {
         byte var21 = 88;
         byte var22 = 19;
         var3 = 765 / (var21 + 1);
         var4 = 480 / (var22 + 1);

         int var7;
         int var8;
         do {
            var7 = var4;
            var8 = var3;
            if (var4 * (var3 - 1) >= class77.field1222) {
               --var3;
            }

            if (var3 * (var4 - 1) >= class77.field1222) {
               --var4;
            }

            if (var3 * (var4 - 1) >= class77.field1222) {
               --var4;
            }
         } while(var4 != var7 || var8 != var3);

         var7 = (765 - var21 * var3) / (var3 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         var8 = (480 - var4 * var22) / (var4 + 1);
         if (var8 > 5) {
            var8 = 5;
         }

         int var9 = (765 - var21 * var3 - var7 * (var3 - 1)) / 2;
         int var10 = (480 - var4 * var22 - var8 * (var4 - 1)) / 2;
         int var11 = var10 + 23;
         int var12 = var9 + class90.field1338;
         int var13 = 0;
         boolean var14 = false;

         int var15;
         for(var15 = 0; var15 < class77.field1222; ++var15) {
            class77 var16 = class141.field2058[var15];
            boolean var17 = true;
            String var18 = Integer.toString(var16.field1228);
            if (var16.field1228 == -1) {
               var18 = "OFF";
               var17 = false;
            } else if (var16.field1228 > 1980) {
               var18 = "FULL";
               var17 = false;
            }

            int var19 = 0;
            byte var20;
            if (var16.method1613(1286673565)) {
               if (var16.method1614(867548888)) {
                  var20 = 7;
               } else {
                  var20 = 6;
               }
            } else if (var16.method1612(-1734975376)) {
               var19 = 16711680;
               if (var16.method1614(867548888)) {
                  var20 = 5;
               } else {
                  var20 = 4;
               }
            } else if (var16.method1610(-2141269269)) {
               if (var16.method1614(867548888)) {
                  var20 = 3;
               } else {
                  var20 = 2;
               }
            } else if (var16.method1614(867548888)) {
               var20 = 1;
            } else {
               var20 = 0;
            }

            if (class60.field700 >= var12 && class60.field693 >= var11 && class60.field700 < var12 + var21 && class60.field693 < var22 + var11 && var17) {
               class90.field1372 = var15;
               class25.field356[var20].method5873(var12, var11, 128, 16777215);
               var14 = true;
            } else {
               class25.field356[var20].method5868(var12, var11);
            }

            if (class90.field1348 != null) {
               class90.field1348[(var16.method1614(867548888) ? 8 : 0) + var16.field1231].method5842(var12 + 29, var11);
            }

            var0.method5524(Integer.toString(var16.field1230), var12 + 15, var22 / 2 + var11 + 5, var19, -1);
            var1.method5524(var18, var12 + 60, var22 / 2 + var11 + 5, 268435455, -1);
            var11 = var11 + var22 + var8;
            ++var13;
            if (var13 >= var4) {
               var11 = var10 + 23;
               var12 = var12 + var7 + var21;
               var13 = 0;
            }
         }

         if (var14) {
            var15 = var1.method5590(class141.field2058[class90.field1372].field1225) + 6;
            int var23 = var1.field3891 + 8;
            class327.method5810(class60.field700 - var15 / 2, class60.field693 + 20 + 5, var15, var23, 16777120);
            class327.method5748(class60.field700 - var15 / 2, class60.field693 + 20 + 5, var15, var23, 0);
            var1.method5524(class141.field2058[class90.field1372].field1225, class60.field700, class60.field693 + var1.field3891 + 20 + 5 + 4, 0, -1);
         }
      }

      class324.field3941.vmethod5824(0, 0, 1343960302);
   }
}

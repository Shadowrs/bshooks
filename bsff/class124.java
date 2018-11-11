public final class class124 {
   class139 field1706;
   int field1708;
   int field1705;
   int field1703;
   int field1704;
   class139 field1707;
   class139 field1709;
   int field1710;

   public static boolean method2580(String var0, int var1, int var2) {
      return class39.method553(var0, var1, "openjs", (byte)8);
   }

   static final void method2581(class194 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8;
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class62.field720[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.getUByte(-1180690956);
            if (var8 == 0) {
               if (var1 == 0) {
                  int[] var13 = class62.field728[0][var2];
                  int var10 = var2 + var4 + 932731;
                  int var11 = var3 + var5 + 556238;
                  int var12 = class22.method184('\ub135' + var10, var11 + 91923, 4, 609703079) - 128 + (class22.method184(10294 + var10, var11 + '\u93bd', 2, 753711858) - 128 >> 1) + (class22.method184(var10, var11, 1, 1963545633) - 128 >> 2);
                  var12 = (int)((double)var12 * 0.3D) + 35;
                  if (var12 < 10) {
                     var12 = 10;
                  } else if (var12 > 60) {
                     var12 = 60;
                  }

                  var13[var3] = -var12 * 8;
               } else {
                  class62.field728[var1][var2][var3] = class62.field728[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var8 == 1) {
               int var9 = var0.getUByte(-1412906493);
               if (var9 == 1) {
                  var9 = 0;
               }

               if (var1 == 0) {
                  class62.field728[0][var2][var3] = -var9 * 8;
               } else {
                  class62.field728[var1][var2][var3] = class62.field728[var1 - 1][var2][var3] - var9 * 8;
               }
               break;
            }

            if (var8 <= 49) {
               class62.field729[var1][var2][var3] = var0.getByte(-349109194);
               class62.field724[var1][var2][var3] = (byte)((var8 - 2) / 4);
               class164.field2183[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if (var8 <= 81) {
               class62.field720[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               class62.field733[var1][var2][var3] = (byte)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var0.getUByte(597591274);
            if (var8 == 0) {
               break;
            }

            if (var8 == 1) {
               var0.getUByte(-953371735);
               break;
            }

            if (var8 <= 49) {
               var0.getUByte(-104161426);
            }
         }
      }

   }
}

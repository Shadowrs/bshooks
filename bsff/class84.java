public final class class84 extends class75 {
   class285 field1300;

   protected final class131 vmethod3067(byte var1) {
      if (this.field1300 == null) {
         return null;
      } else {
         class287 var2 = super.field1182 != -1 && super.field1164 == 0 ? class202.method3839(super.field1182, (byte)127) : null;
         class287 var3 = super.field1173 == -1 || super.field1155 == super.field1173 && var2 != null ? null : class202.method3839(super.field1173, (byte)34);
         class131 var4 = this.field1300.method5125(var2, super.field1183, var3, super.field1180, 674325363);
         if (var4 == null) {
            return null;
         } else {
            var4.method2687();
            super.field1200 = var4.field2042;
            if (super.field1187 != -1 && super.field1159 != -1) {
               class131 var5 = class249.method4518(super.field1187, -1255857318).method4795(super.field1159, -1523300954);
               if (var5 != null) {
                  var5.method2698(0, -super.field1191, 0);
                  class131[] var6 = new class131[]{var4, var5};
                  var4 = new class131(var6, 2);
               }
            }

            if (this.field1300.field3702 == 1) {
               var4.field1850 = true;
            }

            return var4;
         }
      }
   }

   final boolean vmethod1824(int var1) {
      return this.field1300 != null;
   }

   final void method1825(int var1, byte var2, int var3) {
      int var4 = super.field1188[0];
      int var5 = super.field1206[0];
      if (var1 == 0) {
         --var4;
         ++var5;
      }

      if (var1 == 1) {
         ++var5;
      }

      if (var1 == 2) {
         ++var4;
         ++var5;
      }

      if (var1 == 3) {
         --var4;
      }

      if (var1 == 4) {
         ++var4;
      }

      if (var1 == 5) {
         --var4;
         --var5;
      }

      if (var1 == 6) {
         --var5;
      }

      if (var1 == 7) {
         ++var4;
         --var5;
      }

      if (super.field1182 != -1 && class202.method3839(super.field1182, (byte)84).field3762 == 1) {
         super.field1182 = -1;
      }

      if (super.field1204 < 9) {
         ++super.field1204;
      }

      for(int var6 = super.field1204; var6 > 0; --var6) {
         super.field1188[var6] = super.field1188[var6 - 1];
         super.field1206[var6] = super.field1206[var6 - 1];
         super.field1176[var6] = super.field1176[var6 - 1];
      }

      super.field1188[0] = var4;
      super.field1206[0] = var5;
      super.field1176[0] = var2;
   }

   final void method1827(int var1, int var2, boolean var3, int var4) {
      if (super.field1182 != -1 && class202.method3839(super.field1182, (byte)81).field3762 == 1) {
         super.field1182 = -1;
      }

      if (!var3) {
         int var5 = var1 - super.field1188[0];
         int var6 = var2 - super.field1206[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (super.field1204 < 9) {
               ++super.field1204;
            }

            for(int var7 = super.field1204; var7 > 0; --var7) {
               super.field1188[var7] = super.field1188[var7 - 1];
               super.field1206[var7] = super.field1206[var7 - 1];
               super.field1176[var7] = super.field1176[var7 - 1];
            }

            super.field1188[0] = var1;
            super.field1206[0] = var2;
            super.field1176[0] = 1;
            return;
         }
      }

      super.field1204 = 0;
      super.field1194 = 0;
      super.field1208 = 0;
      super.field1188[0] = var1;
      super.field1206[0] = var2;
      super.field1185 = super.field1153 * 64 + super.field1188[0] * 128;
      super.field1209 = super.field1153 * 64 + super.field1206[0] * 128;
   }

   public static char method1838(byte var0, int var1) {
      int var2 = var0 & 255;
      if (var2 == 0) {
         throw new IllegalArgumentException("");
      } else {
         if (var2 >= 128 && var2 < 160) {
            char var3 = class314.field3912[var2 - 128];
            if (var3 == 0) {
               var3 = '?';
            }

            var2 = var3;
         }

         return (char)var2;
      }
   }

   static final void method1839(int var0, int var1, int var2, int var3, byte var4) {
      for(int var5 = var1; var5 <= var3 + var1; ++var5) {
         for(int var6 = var0; var6 <= var0 + var2; ++var6) {
            if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               class62.field725[0][var6][var5] = 127;
               if (var0 == var6 && var6 > 0) {
                  class62.field728[0][var6][var5] = class62.field728[0][var6 - 1][var5];
               }

               if (var0 + var2 == var6 && var6 < 103) {
                  class62.field728[0][var6][var5] = class62.field728[0][var6 + 1][var5];
               }

               if (var5 == var1 && var5 > 0) {
                  class62.field728[0][var6][var5] = class62.field728[0][var6][var5 - 1];
               }

               if (var5 == var3 + var1 && var5 < 103) {
                  class62.field728[0][var6][var5] = class62.field728[0][var6][var5 + 1];
               }
            }
         }
      }

   }
}

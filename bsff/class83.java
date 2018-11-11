public class class83 extends class216 {
   class215 field1299 = new class215();
   class275 field1297;

   class83(class275 var1) {
      this.field1297 = var1;
   }

   void method1818(int var1, int var2, int var3, int var4, int var5) {
      class76 var6 = null;
      int var7 = 0;

      for(class76 var8 = (class76)this.field1299.method3988(); var8 != null; var8 = (class76)this.field1299.method4003()) {
         ++var7;
         if (var8.field1217 == var1) {
            var8.method1603(var1, var2, var3, var4, -556137649);
            return;
         }

         if (var8.field1217 <= var1) {
            var6 = var8;
         }
      }

      if (var6 == null) {
         if (var7 < 4) {
            this.field1299.method4009(new class76(var1, var2, var3, var4));
         }
      } else {
         class215.method3986(new class76(var1, var2, var3, var4), var6);
         if (var7 >= 4) {
            this.field1299.method3988().method4014();
         }
      }

   }

   class76 method1811(int var1, int var2) {
      class76 var3 = (class76)this.field1299.method3988();
      if (var3 != null && var3.field1217 <= var1) {
         for(class76 var4 = (class76)this.field1299.method4003(); var4 != null && var4.field1217 <= var1; var4 = (class76)this.field1299.method4003()) {
            var3.method4014();
            var3 = var4;
         }

         if (this.field1297.field3524 + var3.field1211 + var3.field1217 > var1) {
            return var3;
         } else {
            var3.method4014();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean method1810(short var1) {
      return this.field1299.method4002();
   }

   static final void method1823(class75 var0, int var1) {
      var0.field1173 = var0.field1155;
      if (var0.field1204 == 0) {
         var0.field1208 = 0;
      } else {
         if (var0.field1182 != -1 && var0.field1164 == 0) {
            class287 var2 = class202.method3839(var0.field1182, (byte)59);
            if (var0.field1194 > 0 && var2.field3761 == 0) {
               ++var0.field1208;
               return;
            }

            if (var0.field1194 <= 0 && var2.field3762 == 0) {
               ++var0.field1208;
               return;
            }
         }

         int var11 = var0.field1185;
         int var3 = var0.field1209;
         int var4 = var0.field1188[var0.field1204 - 1] * 128 + var0.field1153 * 64;
         int var5 = var0.field1206[var0.field1204 - 1] * 128 + var0.field1153 * 64;
         if (var11 < var4) {
            if (var3 < var5) {
               var0.field1201 = 1280;
            } else if (var3 > var5) {
               var0.field1201 = 1792;
            } else {
               var0.field1201 = 1536;
            }
         } else if (var11 > var4) {
            if (var3 < var5) {
               var0.field1201 = 768;
            } else if (var3 > var5) {
               var0.field1201 = 256;
            } else {
               var0.field1201 = 512;
            }
         } else if (var3 < var5) {
            var0.field1201 = 1024;
         } else if (var3 > var5) {
            var0.field1201 = 0;
         }

         byte var6 = var0.field1176[var0.field1204 - 1];
         if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
            int var7 = var0.field1201 - var0.field1151 & 2047;
            if (var7 > 1024) {
               var7 -= 2048;
            }

            int var8 = var0.field1172;
            if (var7 >= -256 && var7 <= 256) {
               var8 = var0.field1158;
            } else if (var7 >= 256 && var7 < 768) {
               var8 = var0.field1161;
            } else if (var7 >= -768 && var7 <= -256) {
               var8 = var0.field1160;
            }

            if (var8 == -1) {
               var8 = var0.field1158;
            }

            var0.field1173 = var8;
            int var9 = 4;
            boolean var10 = true;
            if (var0 instanceof class84) {
               var10 = ((class84)var0).field1300.field3730;
            }

            if (var10) {
               if (var0.field1151 != var0.field1201 && var0.field1190 == -1 && var0.field1203 != 0) {
                  var9 = 2;
               }

               if (var0.field1204 > 2) {
                  var9 = 6;
               }

               if (var0.field1204 > 3) {
                  var9 = 8;
               }

               if (var0.field1208 > 0 && var0.field1204 > 1) {
                  var9 = 8;
                  --var0.field1208;
               }
            } else {
               if (var0.field1204 > 1) {
                  var9 = 6;
               }

               if (var0.field1204 > 2) {
                  var9 = 8;
               }

               if (var0.field1208 > 0 && var0.field1204 > 1) {
                  var9 = 8;
                  --var0.field1208;
               }
            }

            if (var6 == 2) {
               var9 <<= 1;
            }

            if (var9 >= 8 && var0.field1173 == var0.field1158 && var0.field1162 != -1) {
               var0.field1173 = var0.field1162;
            }

            if (var11 != var4 || var5 != var3) {
               if (var11 < var4) {
                  var0.field1185 += var9;
                  if (var0.field1185 > var4) {
                     var0.field1185 = var4;
                  }
               } else if (var11 > var4) {
                  var0.field1185 -= var9;
                  if (var0.field1185 < var4) {
                     var0.field1185 = var4;
                  }
               }

               if (var3 < var5) {
                  var0.field1209 += var9;
                  if (var0.field1209 > var5) {
                     var0.field1209 = var5;
                  }
               } else if (var3 > var5) {
                  var0.field1209 -= var9;
                  if (var0.field1209 < var5) {
                     var0.field1209 = var5;
                  }
               }
            }

            if (var4 == var0.field1185 && var5 == var0.field1209) {
               --var0.field1204;
               if (var0.field1194 > 0) {
                  --var0.field1194;
               }
            }
         } else {
            var0.field1185 = var4;
            var0.field1209 = var5;
            --var0.field1204;
            if (var0.field1194 > 0) {
               --var0.field1194;
            }
         }
      }

   }
}

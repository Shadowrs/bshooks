import javax.imageio.ImageIO;

public class class55 {
   public static class261 field639;
   static class263 field635;
   static int[] field640;

   static void method829(byte var0) {
      Object var1 = class262.field3386;
      synchronized(var1) {
         if (class262.field3389 == 0) {
            class262.field3391 = new Thread(new class262());
            class262.field3391.setDaemon(true);
            class262.field3391.start();
            class262.field3391.setPriority(5);
         }

         class262.field3389 = 600;
      }
   }

   static final void method828(class75 var0, int var1) {
      var0.field1181 = false;
      class287 var2;
      if (var0.field1173 != -1) {
         var2 = class202.method3839(var0.field1173, (byte)23);
         if (var2 != null && var2.field3750 != null) {
            ++var0.field1163;
            if (var0.field1180 < var2.field3750.length && var0.field1163 > var2.field3763[var0.field1180]) {
               var0.field1163 = 1;
               ++var0.field1180;
               class38.method528(var2, var0.field1180, var0.field1185, var0.field1209, -503372841);
            }

            if (var0.field1180 >= var2.field3750.length) {
               var0.field1163 = 0;
               var0.field1180 = 0;
               class38.method528(var2, var0.field1180, var0.field1185, var0.field1209, -699606595);
            }
         } else {
            var0.field1173 = -1;
         }
      }

      if (var0.field1187 != -1 && client.field866 >= var0.field1189) {
         if (var0.field1159 < 0) {
            var0.field1159 = 0;
         }

         int var3 = class249.method4518(var0.field1187, -1470634068).field3494;
         if (var3 != -1) {
            class287 var4 = class202.method3839(var3, (byte)24);
            if (var4 != null && var4.field3750 != null) {
               ++var0.field1156;
               if (var0.field1159 < var4.field3750.length && var0.field1156 > var4.field3763[var0.field1159]) {
                  var0.field1156 = 1;
                  ++var0.field1159;
                  class38.method528(var4, var0.field1159, var0.field1185, var0.field1209, -818775871);
               }

               if (var0.field1159 >= var4.field3750.length && (var0.field1159 < 0 || var0.field1159 >= var4.field3750.length)) {
                  var0.field1187 = -1;
               }
            } else {
               var0.field1187 = -1;
            }
         } else {
            var0.field1187 = -1;
         }
      }

      if (var0.field1182 != -1 && var0.field1164 <= 1) {
         var2 = class202.method3839(var0.field1182, (byte)97);
         if (var2.field3761 == 1 && var0.field1194 > 0 && var0.field1196 <= client.field866 && var0.field1197 < client.field866) {
            var0.field1164 = 1;
            return;
         }
      }

      if (var0.field1182 != -1 && var0.field1164 == 0) {
         var2 = class202.method3839(var0.field1182, (byte)64);
         if (var2 != null && var2.field3750 != null) {
            ++var0.field1184;
            if (var0.field1183 < var2.field3750.length && var0.field1184 > var2.field3763[var0.field1183]) {
               var0.field1184 = 1;
               ++var0.field1183;
               class38.method528(var2, var0.field1183, var0.field1185, var0.field1209, -2146333323);
            }

            if (var0.field1183 >= var2.field3750.length) {
               var0.field1183 -= var2.field3754;
               ++var0.field1186;
               if (var0.field1186 >= var2.field3760) {
                  var0.field1182 = -1;
               } else if (var0.field1183 >= 0 && var0.field1183 < var2.field3750.length) {
                  class38.method528(var2, var0.field1183, var0.field1185, var0.field1209, -672797930);
               } else {
                  var0.field1182 = -1;
               }
            }

            var0.field1181 = var2.field3746;
         } else {
            var0.field1182 = -1;
         }
      }

      if (var0.field1164 > 0) {
         --var0.field1164;
      }

   }

   static final void method827(int var0) {
      client.field969 = 0;
      int var1 = (class12.field259.field1185 >> 7) + class184.field2498;
      int var2 = (class12.field259.field1209 >> 7) + class4.field28;
      if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
         client.field969 = 1;
      }

      if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
         client.field969 = 1;
      }

      if (client.field969 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
         client.field969 = 0;
      }

   }

   static {
      ImageIO.setUseCache(false);
   }
}

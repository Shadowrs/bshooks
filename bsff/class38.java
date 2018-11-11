public class class38 {
   static class69 field490;
   static int[] field489;
   static class330[] field491;

   static synchronized void method531(byte[] var0, int var1) {
      if (var0.length == 100 && class195.field2572 < 1000) {
         class195.field2575[++class195.field2572 - 1] = var0;
      } else if (var0.length == 5000 && class195.field2577 < 250) {
         class195.field2576[++class195.field2577 - 1] = var0;
      } else if (var0.length == 30000 && class195.field2574 < 50) {
         class195.field2573[++class195.field2574 - 1] = var0;
      } else if (class195.field2578 != null) {
         for(int var2 = 0; var2 < class184.field2491.length; ++var2) {
            if (var0.length == class184.field2491[var2] && class13.field265[var2] < class195.field2578[var2].length) {
               class195.field2578[var2][class13.field265[var2]++] = var0;
               return;
            }
         }
      }

   }

   static void method528(class287 var0, int var1, int var2, int var3, int var4) {
      if (client.field1093 < 50 && client.field1034 != 0 && var0.field3759 != null && var1 < var0.field3759.length) {
         int var5 = var0.field3759[var1];
         if (var5 != 0) {
            int var6 = var5 >> 8;
            int var7 = var5 >> 4 & 7;
            int var8 = var5 & 15;
            client.field885[client.field1093] = var6;
            client.field919[client.field1093] = var7;
            client.field1096[client.field1093] = 0;
            client.field1098[client.field1093] = null;
            int var9 = (var2 - 64) / 128;
            int var10 = (var3 - 64) / 128;
            client.field1097[client.field1093] = var8 + (var10 << 8) + (var9 << 16);
            ++client.field1093;
         }
      }

   }

   static String method529(class242 var0, int var1, short var2) {
      int var3 = class45.method662(var0, 2093730269);
      boolean var4 = (var3 >> var1 + 1 & 1) != 0;
      return !var4 && var0.field2914 == null ? null : (var0.field2888 != null && var0.field2888.length > var1 && var0.field2888[var1] != null && var0.field2888[var1].trim().length() != 0 ? var0.field2888[var1] : null);
   }
}

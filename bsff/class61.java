public final class class61 {
   public static class261 field714;
   static class331 field715;
   static class330[] field718;
   static class242 field713;

   public static Object method1059(byte[] var0, boolean var1, short var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var0.length > 136 && !class198.field2592) {
            try {
               class192 var3 = new class192();
               var3.vmethod3771(var0, (byte)71);
               return var3;
            } catch (Throwable var4) {
               class198.field2592 = true;
            }
         }

         return var0;
      }
   }

   static final void method1055(int var0, int var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < client.field967; ++var5) {
         if (client.field1122[var5] + client.field1063[var5] > var0 && client.field1063[var5] < var0 + var2 && client.field860[var5] + client.field1066[var5] > var1 && client.field860[var5] < var3 + var1) {
            client.field1060[var5] = true;
         }
      }

   }

   static final void method1058(boolean var0, byte var1) {
      if (var0) {
         client.field1041 = class90.field1344 ? class158.field2150 : class158.field2156;
      } else {
         client.field1041 = class46.field564.field1241.containsKey(class135.method2873(class90.field1374, 1551059774)) ? class158.field2157 : class158.field2153;
      }

   }
}

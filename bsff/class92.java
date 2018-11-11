public final class class92 extends class139 {
   static int field1406;
   static int[] field1408;
   int field1404;
   int field1405;

   protected final class131 vmethod3067(byte var1) {
      return class146.method3099(this.field1404, (byte)123).method5061(this.field1405, 1200518400);
   }

   public static boolean method1927(int var0) {
      return class229.field2680 != 0 ? true : class229.field2679.method4169(-1595771254);
   }

   public static String method1925(String var0, byte var1) {
      int var2 = var0.length();
      char[] var3 = new char[var2];
      byte var4 = 2;

      for(int var5 = 0; var5 < var2; ++var5) {
         char var6 = var0.charAt(var5);
         if (var4 == 0) {
            var6 = Character.toLowerCase(var6);
         } else if (var4 == 2 || Character.isUpperCase(var6)) {
            char var7;
            if (var6 != '\u00b5' && var6 != '\u0083') {
               var7 = Character.toTitleCase(var6);
            } else {
               var7 = var6;
            }

            var6 = var7;
         }

         if (Character.isLetter(var6)) {
            var4 = 0;
         } else if (var6 != '.' && var6 != '?' && var6 != '!') {
            if (Character.isSpaceChar(var6)) {
               if (var4 != 2) {
                  var4 = 1;
               }
            } else {
               var4 = 1;
            }
         } else {
            var4 = 2;
         }

         var3[var5] = var6;
      }

      return new String(var3);
   }

   public static class279 method1926(int var0, int var1) {
      class279 var2 = (class279)class279.field3550.method3929((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class279.field3549.method4551(34, var0, 1461400038);
         var2 = new class279();
         if (var3 != null) {
            var2.method4925(new class194(var3), -140742979);
         }

         var2.method4924((byte)-49);
         class279.field3550.method3932(var2, (long)var0);
         return var2;
      }
   }
}

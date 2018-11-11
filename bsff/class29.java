public final class class29 {
   class42 this$0;
   int field403;
   int field400;
   int field402;
   int field401;

   class29(class42 var1) {
      this.this$0 = var1;
   }

   static synchronized byte[] method271(int var0, byte var1) {
      return class195.method3742(var0, false, (byte)3);
   }

   public static void method272(int var0) {
      class278.field3545.method3933();
   }

   public static Class method270(String var0, byte var1) throws ClassNotFoundException {
      return var0.equals("B") ? Byte.TYPE : (var0.equals("I") ? Integer.TYPE : (var0.equals("S") ? Short.TYPE : (var0.equals("J") ? Long.TYPE : (var0.equals("Z") ? Boolean.TYPE : (var0.equals("F") ? Float.TYPE : (var0.equals("D") ? Double.TYPE : (var0.equals("C") ? Character.TYPE : (var0.equals("void") ? Void.TYPE : Class.forName(var0)))))))));
   }

   static void method269(int var0, int var1, int var2, class282 var3, int var4, byte var5) {
      class80 var6 = new class80();
      var6.field1265 = var0;
      var6.field1264 = var1 * 128;
      var6.field1255 = var2 * 128;
      int var7 = var3.field3601;
      int var8 = var3.field3602;
      if (var4 == 1 || var4 == 3) {
         var7 = var3.field3602;
         var8 = var3.field3601;
      }

      var6.field1256 = (var7 + var1) * 128;
      var6.field1257 = (var8 + var2) * 128;
      var6.field1259 = var3.field3630;
      var6.field1258 = var3.field3622 * 128;
      var6.field1266 = var3.field3589;
      var6.field1262 = var3.field3633;
      var6.field1263 = var3.field3634;
      if (var3.field3627 != null) {
         var6.field1252 = var3;
         var6.method1732(-1638708764);
      }

      class80.field1261.method4020(var6);
      if (var6.field1263 != null) {
         var6.field1253 = var6.field1266 + (int)(Math.random() * (double)(var6.field1262 - var6.field1266));
      }

   }
}

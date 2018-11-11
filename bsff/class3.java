final class class3 implements class0 {
   public static class256[] method6(short var0) {
      return new class256[]{class256.field3331, class256.field3336, class256.field3337, class256.field3332, class256.field3328, class256.field3330};
   }

   public static class242 method2(int var0, int var1) {
      int var2 = var0 >> 16;
      int var3 = var0 & '\uffff';
      if (class189.field2519[var2] == null || class189.field2519[var2][var3] == null) {
         boolean var4 = class305.method5452(var2, -1009820586);
         if (!var4) {
            return null;
         }
      }

      return class189.field2519[var2][var3];
   }

   static void method3(int var0) {
      class93.field1414 = 0;

      for(int var1 = 0; var1 < 2048; ++var1) {
         class93.field1413[var1] = null;
         class93.field1409[var1] = 1;
      }

   }

   static final void method5(int var0) {
      for(class74 var1 = (class74)client.field1115.method4027(); var1 != null; var1 = (class74)client.field1115.method4026()) {
         if (var1.field1136 == -1) {
            var1.field1143 = 0;
            class289.method5205(var1, -573699795);
         } else {
            var1.method4014();
         }
      }

   }

   static void method4(int var0) {
      if (client.field1011) {
         class242 var1 = class181.method3420(class52.field623, client.field1012, -549504244);
         if (var1 != null && var1.field2943 != null) {
            class68 var2 = new class68();
            var2.field780 = var1;
            var2.field782 = var1.field2943;
            class198.method3757(var2, -109507492, false);
         }

         client.field1011 = false;
         class30.method274(var1, 1460180432);
      }

   }
}

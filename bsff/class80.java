public final class class80 extends class216 {
   static class217 field1261 = new class217();
   int field1259;
   class282 field1252;
   int field1258;
   int field1266;
   int field1262;
   int[] field1263;
   class115 field1260;
   int field1256;
   int field1264;
   int field1257;
   int field1255;
   int field1265;
   class115 field1254;
   int field1253;

   void method1732(int var1) {
      int var2 = this.field1259;
      class282 var3 = this.field1252.method5008((byte)-38);
      if (var3 != null) {
         this.field1259 = var3.field3630;
         this.field1258 = var3.field3622 * 128;
         this.field1266 = var3.field3589;
         this.field1262 = var3.field3633;
         this.field1263 = var3.field3634;
      } else {
         this.field1259 = -1;
         this.field1258 = 0;
         this.field1266 = 0;
         this.field1262 = 0;
         this.field1263 = null;
      }

      if (var2 != this.field1259 && this.field1260 != null) {
         class54.field632.method2062(this.field1260);
         this.field1260 = null;
      }

   }

   static void method1727(class77 var0, int var1) {
      if (var0.method1614(867548888) != client.field855) {
         client.field855 = var0.method1614(867548888);
         boolean var2 = var0.method1614(867548888);
         if (var2 != class154.field2134) {
            class47.method745(87368901);
            class154.field2134 = var2;
         }
      }

      client.field1065 = var0.field1227;
      client.field857 = var0.field1230;
      client.field858 = var0.field1218;
      class35.field461 = client.field955 == 0 ? '\uaa4a' : var0.field1230 + '\u9c40';
      class309.field3878 = client.field955 == 0 ? 443 : var0.field1230 + '\uc350';
      class72.field849 = class35.field461;
   }

   static void method1735(int var0) {
      class62.field733 = (byte[][][])null;
      class62.field729 = (byte[][][])null;
      class62.field724 = (byte[][][])null;
      class164.field2183 = (byte[][][])null;
      class62.field721 = (int[][][])null;
      class62.field725 = (byte[][][])null;
      class62.field719 = (int[][])null;
      class89.field1333 = null;
      class1.field9 = null;
      class204.field2613 = null;
      class57.field648 = null;
      class136.field1973 = null;
   }
}

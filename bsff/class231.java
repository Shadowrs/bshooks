public class class231 extends class216 {
   int field2723;
   class228 field2717;
   class233 field2715;
   class105 field2716;
   class115 field2732;
   int field2724;
   int field2725;
   int field2722;
   int field2728;
   int field2714;
   int field2721;
   int field2718;
   int field2720;
   int field2734;
   int field2719;
   int field2731;
   int field2726;
   int field2733;
   int field2727;
   int field2730;
   int field2729;

   void method4259(byte var1) {
      this.field2715 = null;
      this.field2716 = null;
      this.field2717 = null;
      this.field2732 = null;
   }

   static void method4261(int var0) {
      for(class80 var1 = (class80)class80.field1261.method4027(); var1 != null; var1 = (class80)class80.field1261.method4026()) {
         if (var1.field1260 != null) {
            class54.field632.method2062(var1.field1260);
            var1.field1260 = null;
         }

         if (var1.field1254 != null) {
            class54.field632.method2062(var1.field1254);
            var1.field1254 = null;
         }
      }

      class80.field1261.method4019();
   }

   static final void method4260(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class74 var10 = null;

      for(class74 var11 = (class74)client.field1115.method4027(); var11 != null; var11 = (class74)client.field1115.method4026()) {
         if (var0 == var11.field1139 && var11.field1148 == var1 && var2 == var11.field1140 && var3 == var11.field1135) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new class74();
         var10.field1139 = var0;
         var10.field1135 = var3;
         var10.field1148 = var1;
         var10.field1140 = var2;
         class289.method5205(var10, -573699795);
         client.field1115.method4020(var10);
      }

      var10.field1133 = var4;
      var10.field1142 = var5;
      var10.field1141 = var6;
      var10.field1143 = var7;
      var10.field1136 = var8;
   }

   static final void method4258(class242 var0, int var1, int var2, byte var3) {
      if (client.field1027 == null && !client.field991 && var0 != null) {
         class242 var4 = class99.method2045(var0, (byte)82);
         if (var4 == null) {
            var4 = var0.field2913;
         }

         if (var4 != null) {
            client.field1027 = var0;
            var4 = class99.method2045(var0, (byte)82);
            if (var4 == null) {
               var4 = var0.field2913;
            }

            client.field1028 = var4;
            client.field1029 = var1;
            client.field1030 = var2;
            class35.field453 = 0;
            client.field1038 = false;
            int var5 = class36.method520(151765542);
            if (var5 != -1) {
               class11.method68(var5, -1239220833);
            }

            return;
         }
      }

   }
}

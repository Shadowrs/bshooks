public class class257 {
   static class257 field3340 = new class257("LIVE", 0);
   static class257 field3339 = new class257("BUILDLIVE", 3);
   static class257 field3341 = new class257("RC", 1);
   static class257 field3342 = new class257("WIP", 2);
   public static char field3346;
   public String field3343;
   int field3344;

   class257(String var1, int var2) {
      this.field3343 = var1;
      this.field3344 = var2;
   }

   static void method4537(int var0, int var1, int var2, int var3, String var4, int var5) {
      class242 var6 = class181.method3420(var1, var2, -69569581);
      if (var6 != null) {
         if (var6.field2914 != null) {
            class68 var7 = new class68();
            var7.field780 = var6;
            var7.field791 = var0;
            var7.field787 = var4;
            var7.field782 = var6.field2914;
            class198.method3757(var7, 228052643, false);
         }

         boolean var12 = true;
         if (var6.field2818 > 0) {
            var12 = class240.method4437(var6, (byte)2);
         }

         if (var12) {
            int var8 = class45.method662(var6, 2022829471);
            int var9 = var0 - 1;
            boolean var10 = (var8 >> var9 + 1 & 1) != 0;
            if (var10) {
               class184 var11;
               if (var0 == 1) {
                  var11 = class141.method3078(class181.field2386, client.field902.field1475, (byte)-93);
                  var11.field2500.addInt(var1, (byte)84);
                  var11.field2500.addShort(var2, 2145591235);
                  var11.field2500.addShort(var3, 779736300);
                  client.field902.method2036(var11, (byte)124);
               }

               if (var0 == 2) {
                  var11 = class141.method3078(class181.field2434, client.field902.field1475, (byte)-110);
                  var11.field2500.addInt(var1, (byte)96);
                  var11.field2500.addShort(var2, 46585854);
                  var11.field2500.addShort(var3, 1035677721);
                  client.field902.method2036(var11, (byte)49);
               }

               if (var0 == 3) {
                  var11 = class141.method3078(class181.field2455, client.field902.field1475, (byte)-119);
                  var11.field2500.addInt(var1, (byte)75);
                  var11.field2500.addShort(var2, 100327812);
                  var11.field2500.addShort(var3, 974794339);
                  client.field902.method2036(var11, (byte)34);
               }

               if (var0 == 4) {
                  var11 = class141.method3078(class181.field2395, client.field902.field1475, (byte)-41);
                  var11.field2500.addInt(var1, (byte)90);
                  var11.field2500.addShort(var2, 106361228);
                  var11.field2500.addShort(var3, 76999699);
                  client.field902.method2036(var11, (byte)24);
               }

               if (var0 == 5) {
                  var11 = class141.method3078(class181.field2424, client.field902.field1475, (byte)-106);
                  var11.field2500.addInt(var1, (byte)20);
                  var11.field2500.addShort(var2, 169502997);
                  var11.field2500.addShort(var3, -26657041);
                  client.field902.method2036(var11, (byte)70);
               }

               if (var0 == 6) {
                  var11 = class141.method3078(class181.field2467, client.field902.field1475, (byte)-112);
                  var11.field2500.addInt(var1, (byte)62);
                  var11.field2500.addShort(var2, 1851674928);
                  var11.field2500.addShort(var3, 847975222);
                  client.field902.method2036(var11, (byte)22);
               }

               if (var0 == 7) {
                  var11 = class141.method3078(class181.field2400, client.field902.field1475, (byte)-122);
                  var11.field2500.addInt(var1, (byte)24);
                  var11.field2500.addShort(var2, 327561483);
                  var11.field2500.addShort(var3, 316703784);
                  client.field902.method2036(var11, (byte)93);
               }

               if (var0 == 8) {
                  var11 = class141.method3078(class181.field2451, client.field902.field1475, (byte)-43);
                  var11.field2500.addInt(var1, (byte)122);
                  var11.field2500.addShort(var2, 1912124540);
                  var11.field2500.addShort(var3, 749451192);
                  client.field902.method2036(var11, (byte)85);
               }

               if (var0 == 9) {
                  var11 = class141.method3078(class181.field2374, client.field902.field1475, (byte)-1);
                  var11.field2500.addInt(var1, (byte)29);
                  var11.field2500.addShort(var2, 831682115);
                  var11.field2500.addShort(var3, 1847080465);
                  client.field902.method2036(var11, (byte)89);
               }

               if (var0 == 10) {
                  var11 = class141.method3078(class181.field2401, client.field902.field1475, (byte)-52);
                  var11.field2500.addInt(var1, (byte)26);
                  var11.field2500.addShort(var2, -353106088);
                  var11.field2500.addShort(var3, 1620667664);
                  client.field902.method2036(var11, (byte)20);
               }
            }
         }
      }

   }
}

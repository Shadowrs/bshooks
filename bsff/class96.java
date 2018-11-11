public class class96 extends class218 {
   static class212 field1449 = new class212(128);
   int[] field1444;
   int[] field1443;
   int field1448;
   int field1445;
   String[] field1446;
   int field1453;
   class209[] field1451;
   int field1450;

   class209[] method2009(int var1, int var2) {
      return new class209[var1];
   }

   static int method2018(int var0, class96 var1, boolean var2, short var3) {
      int var4 = -1;
      class242 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class81.field1272[--class135.field1964];
         var5 = class3.method2(var4, 2114990459);
      } else {
         var5 = var2 ? class336.field4073 : class61.field713;
      }

      if (var0 == 1000) {
         class135.field1964 -= 4;
         var5.field2823 = class81.field1272[class135.field1964];
         var5.field2803 = class81.field1272[class135.field1964 + 1];
         var5.field2819 = class81.field1272[class135.field1964 + 2];
         var5.field2820 = class81.field1272[class135.field1964 + 3];
         class30.method274(var5, 213269144);
         class9.field239.method1214(var5, 1899107538);
         if (var4 != -1 && var5.field2850 == 0) {
            class40.method578(class189.field2519[var4 >> 16], var5, false, 1241869359);
         }

         return 1;
      } else if (var0 == 1001) {
         class135.field1964 -= 4;
         var5.field2825 = class81.field1272[class135.field1964];
         var5.field2889 = class81.field1272[class135.field1964 + 1];
         var5.field2821 = class81.field1272[class135.field1964 + 2];
         var5.field2822 = class81.field1272[class135.field1964 + 3];
         class30.method274(var5, 1556280237);
         class9.field239.method1214(var5, 1668426333);
         if (var4 != -1 && var5.field2850 == 0) {
            class40.method578(class189.field2519[var4 >> 16], var5, false, 1611971925);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var6 = class81.field1272[--class135.field1964] == 1;
         if (var6 != var5.field2834) {
            var5.field2834 = var6;
            class30.method274(var5, 647332060);
         }

         return 1;
      } else if (var0 == 1005) {
         var5.field2867 = class81.field1272[--class135.field1964] == 1;
         return 1;
      } else if (var0 == 1006) {
         var5.field2948 = class81.field1272[--class135.field1964] == 1;
         return 1;
      } else {
         return 2;
      }
   }
}

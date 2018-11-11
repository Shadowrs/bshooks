public class class150 extends class297 {
   boolean field2125;

   public class150(boolean var1) {
      this.field2125 = var1;
   }

   int method3128(class301 var1, class301 var2, byte var3) {
      return client.field857 == var1.field3840 && var2.field3840 == client.field857 ? (this.field2125 ? var1.method5260(1291806181).method5441(var2.method5260(1291806181), (byte)-18) : var2.method5260(1291806181).method5441(var1.method5260(1291806181), (byte)-9)) : this.method5288(var1, var2, 1526437592);
   }

   public int compare(Object var1, Object var2) {
      return this.method3128((class301)var1, (class301)var2, (byte)-68);
   }

   static final void method3132(int var0) {
      if (client.field903 > 0) {
         class79.method1722(-1672555473);
      } else {
         client.field1050.method5211(698005078);
         class48.method748(40, -298613712);
         class87.field1324 = client.field902.method2052(2023708862);
         client.field902.method2038((short)14125);
      }

   }

   static int method3133(int var0, class96 var1, boolean var2, byte var3) {
      if (var0 == 3200) {
         class135.field1964 -= 3;
         class256.method4531(class81.field1272[class135.field1964], class81.field1272[class135.field1964 + 1], class81.field1272[class135.field1964 + 2], 405243915);
         return 1;
      } else if (var0 != 3201) {
         if (var0 == 3202) {
            class135.field1964 -= 2;
            class95.method2006(class81.field1272[class135.field1964], class81.field1272[class135.field1964 + 1], 184766083);
            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class81.field1272[--class135.field1964];
         if (var4 == -1 && !client.field1090) {
            class229.field2679.method4150(1306502787);
            class229.field2680 = 1;
            class61.field714 = null;
         } else if (var4 != -1 && var4 != client.field1089 && client.field1044 != 0 && !client.field1090) {
            class121.method2509(2, class1.field12, var4, 0, client.field1044, false, (byte)-85);
         }

         client.field1089 = var4;
         return 1;
      }
   }

   static class334 method3134(byte var0) {
      return class63.field742;
   }
}

public class class251 {
   static class320 field3296;

   static void method4521(int var0, String var1, String var2, String var3, int var4) {
      class98 var5 = (class98)class95.field1440.get(var0);
      if (var5 == null) {
         var5 = new class98();
         class95.field1440.put(var0, var5);
      }

      class70 var6 = var5.method2026(var0, var1, var2, var3, -406297879);
      class95.field1432.method3914(var6, (long)var6.field811);
      class95.field1434.method4096(var6);
      client.field1051 = client.field1040;
   }

   static final void method4522(class242[] var0, int var1, byte var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class242 var4 = var0[var3];
         if (var4 != null) {
            if (var4.field2850 == 0) {
               if (var4.field2938 != null) {
                  method4522(var4.field2938, var1, (byte)-67);
               }

               class67 var5 = (class67)client.field1017.method3981((long)var4.field2814);
               if (var5 != null) {
                  class193.method3500(var5.field773, var1, (byte)35);
               }
            }

            class68 var7;
            if (var1 == 0 && var4.field2921 != null) {
               var7 = new class68();
               var7.field780 = var4;
               var7.field782 = var4.field2921;
               class198.method3757(var7, 433265008, false);
            }

            if (var1 == 1 && var4.field2922 != null) {
               if (var4.field2815 >= 0) {
                  class242 var6 = class3.method2(var4.field2814, 2097585726);
                  if (var6 == null || var6.field2938 == null || var4.field2815 >= var6.field2938.length || var4 != var6.field2938[var4.field2815]) {
                     continue;
                  }
               }

               var7 = new class68();
               var7.field780 = var4;
               var7.field782 = var4.field2922;
               class198.method3757(var7, 1201528280, false);
            }
         }
      }

   }

   static final void method4520(int var0, int var1) {
      if (class305.method5452(var0, -1009820586)) {
         class242[] var2 = class189.field2519[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class242 var4 = var2[var3];
            if (var4 != null) {
               var4.field2837 = 0;
               var4.field2806 = 0;
            }
         }
      }

   }
}

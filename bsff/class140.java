public final class class140 {
   public int field2050 = 0;
   int field2052 = 0;
   int field2045;
   int field2046;
   public class139 field2049;
   int field2051;
   public class139 field2044;
   int field2047;
   int field2053;

   public static int method3075(int var0, short var1) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   static void method3074(int var0) {
      class157.field2146 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var3;
      for(byte var4 = 12; var1 < 16; var2 -= var4) {
         var3 = class269.method4771((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var1 / 16.0F));
         class157.field2146[var1] = var3;
         ++var1;
      }

      var2 = 48;

      for(int var6 = var2 / 6; var1 < class157.field2146.length; var2 -= var6) {
         var3 = var1 * 2;

         for(int var5 = class269.method4771((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var3 && var1 < class157.field2146.length; ++var1) {
            class157.field2146[var1] = var5;
         }
      }

   }
}

public class class98 {
   static class87 field1465;
   static int field1470;
   static int field1468;
   class70[] field1466 = new class70[100];
   int field1467;

   class70 method2026(int var1, String var2, String var3, String var4, int var5) {
      class70 var6 = this.field1466[99];

      for(int var7 = this.field1467; var7 > 0; --var7) {
         if (var7 != 100) {
            this.field1466[var7] = this.field1466[var7 - 1];
         }
      }

      if (var6 == null) {
         var6 = new class70(var1, var2, var4, var3);
      } else {
         var6.method4014();
         var6.method4051();
         var6.method1108(var1, var2, var4, var3, (byte)124);
      }

      this.field1466[0] = var6;
      if (this.field1467 < 100) {
         ++this.field1467;
      }

      return var6;
   }

   class70 method2025(int var1, byte var2) {
      return var1 >= 0 && var1 < this.field1467 ? this.field1466[var1] : null;
   }

   int method2032(int var1) {
      return this.field1467;
   }

   static final int method2023(int var0, int var1, int var2, byte var3) {
      int var4 = 256 - var2;
      return ((var1 & 16711935) * var2 + var4 * (var0 & 16711935) & -16711936) + ((var0 & '\uff00') * var4 + (var1 & '\uff00') * var2 & 16711680) >> 8;
   }
}

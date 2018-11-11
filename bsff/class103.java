public class class103 {
   int field1500;
   class119[] field1498 = new class119[10];
   int field1497;

   class103(class194 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.getUByte(-1272808718);
         if (var3 != 0) {
            --var1.field2565;
            this.field1498[var2] = new class119();
            this.field1498[var2].method2497(var1);
         }
      }

      this.field1500 = var1.getUShort(-1208216487);
      this.field1497 = var1.getUShort(-1208216487);
   }

   final byte[] method2114() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field1498[var2] != null && this.field1498[var2].field1661 + this.field1498[var2].field1664 > var1) {
            var1 = this.field1498[var2].field1661 + this.field1498[var2].field1664;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field1498[var4] != null) {
               int var5 = this.field1498[var4].field1661 * 22050 / 1000;
               int var6 = this.field1498[var4].field1664 * 22050 / 1000;
               int[] var7 = this.field1498[var4].method2498(var5, this.field1498[var4].field1661);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = (var7[var8] >> 8) + var3[var8 + var6];
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public class105 method2115() {
      byte[] var1 = this.method2114();
      return new class105(22050, var1, this.field1500 * 22050 / 1000, this.field1497 * 22050 / 1000);
   }

   public final int method2116() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field1498[var2] != null && this.field1498[var2].field1664 / 20 < var1) {
            var1 = this.field1498[var2].field1664 / 20;
         }
      }

      if (this.field1500 < this.field1497 && this.field1500 / 20 < var1) {
         var1 = this.field1500 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field1498[var2] != null) {
               this.field1498[var2].field1664 -= var1 * 20;
            }
         }

         if (this.field1500 < this.field1497) {
            this.field1500 -= var1 * 20;
            this.field1497 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public static class103 method2121(class261 var0, int var1, int var2) {
      byte[] var3 = var0.method4551(var1, var2, -506267092);
      return var3 == null ? null : new class103(new class194(var3));
   }
}

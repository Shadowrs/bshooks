public final class class8 extends class9 {
   int field236;
   int field234;
   int field235;
   int field233;
   int field237;

   class8(int var1, int var2, int var3, int var4, int var5) {
      this.field236 = var1;
      this.field234 = var2;
      this.field235 = var3;
      this.field233 = var4;
      this.field237 = var5;
   }

   final void vmethod63(int var1) {
      class327.method5748(this.field236 + class327.field3952, this.field234 + class327.field3955, this.field235 - this.field236, this.field233 - this.field234, this.field237);
   }

   public static class281 method49(int var0, byte var1) {
      class281 var2 = (class281)class281.field3566.method3929((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class281.field3576.method4551(32, var0, 76881792);
         var2 = new class281();
         if (var3 != null) {
            var2.method4977(new class194(var3), 1655332470);
         }

         class281.field3566.method3932(var2, (long)var0);
         return var2;
      }
   }

   public static class184 method44(int var0) {
      class184 var1;
      if (class184.field2496 == 0) {
         var1 = new class184();
      } else {
         var1 = class184.field2495[--class184.field2496];
      }

      var1.field2499 = null;
      var1.field2492 = 0;
      var1.field2500 = new class201(5000);
      return var1;
   }
}

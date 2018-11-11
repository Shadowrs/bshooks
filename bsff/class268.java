public class class268 extends class218 {
   public static class212 field3442 = new class212(64);
   public static int field3445;
   public static class261 field3447;
   static int field3441;
   public int field3444 = 0;

   void method4741(class194 var1, int var2, int var3) {
      if (var2 == 5) {
         this.field3444 = var1.getUShort(-1208216487);
      }

   }

   public void method4740(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(-1491042050);
         if (var3 == 0) {
            return;
         }

         this.method4741(var1, var3, 1841418787);
      }
   }

   public static class286 method4742(int var0, int var1) {
      class286 var2 = (class286)class286.field3739.method3929((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class286.field3737.method4551(4, var0, 1978629631);
         var2 = new class286();
         if (var3 != null) {
            var2.method5159(new class194(var3), var0, (byte)-54);
         }

         var2.method5166(-2024482612);
         class286.field3739.method3932(var2, (long)var0);
         return var2;
      }
   }
}

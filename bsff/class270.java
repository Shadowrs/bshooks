public class class270 extends class218 {
   static class212 field3474 = new class212(64);
   public static class261 field3473;
   public boolean field3475 = false;

   void method4773(class194 var1, int var2, byte var3) {
      if (var2 == 2) {
         this.field3475 = true;
      }

   }

   void method4774(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(341135736);
         if (var3 == 0) {
            return;
         }

         this.method4773(var1, var3, (byte)12);
      }
   }
}

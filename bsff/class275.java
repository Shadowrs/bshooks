public class class275 extends class218 {
   public static class212 field3525 = new class212(64);
   public static class212 field3518 = new class212(64);
   static int field3523;
   int field3519 = -1;
   int field3526 = -1;
   public int field3520 = 255;
   public int field3521 = 255;
   public int field3522 = -1;
   public int field3529;
   public int field3524 = 70;
   public int field3517 = 1;
   public int field3527 = 30;
   public int field3528 = 0;

   void method4859(class194 var1, int var2, int var3) {
      if (var2 == 1) {
         var1.getUShort(-1208216487);
      } else if (var2 == 2) {
         this.field3520 = var1.getUByte(-1034613107);
      } else if (var2 == 3) {
         this.field3521 = var1.getUByte(268707036);
      } else if (var2 == 4) {
         this.field3522 = 0;
      } else if (var2 == 5) {
         this.field3524 = var1.getUShort(-1208216487);
      } else if (var2 == 6) {
         var1.getUByte(-2099219398);
      } else if (var2 == 7) {
         this.field3519 = var1.getBigSmart(-116500504);
      } else if (var2 == 8) {
         this.field3526 = var1.getBigSmart(-1550497935);
      } else if (var2 == 11) {
         this.field3522 = var1.getUShort(-1208216487);
      } else if (var2 == 14) {
         this.field3527 = var1.getUByte(1196731938);
      } else if (var2 == 15) {
         this.field3528 = var1.getUByte(-1982141140);
      }

   }

   void method4866(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(768655916);
         if (var3 == 0) {
            return;
         }

         this.method4859(var1, var3, -1540761505);
      }
   }

   public class331 method4873(byte var1) {
      if (this.field3526 < 0) {
         return null;
      } else {
         class331 var2 = (class331)field3518.method3929((long)this.field3526);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class328.method5831(class316.field3919, this.field3526, 0, 1618026201);
            if (var2 != null) {
               field3518.method3932(var2, (long)this.field3526);
            }

            return var2;
         }
      }
   }

   public class331 method4860(byte var1) {
      if (this.field3519 < 0) {
         return null;
      } else {
         class331 var2 = (class331)field3518.method3929((long)this.field3519);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class328.method5831(class316.field3919, this.field3519, 0, 1512963384);
            if (var2 != null) {
               field3518.method3932(var2, (long)this.field3519);
            }

            return var2;
         }
      }
   }
}

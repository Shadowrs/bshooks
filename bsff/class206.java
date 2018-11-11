public final class class206 {
   class218 field2614 = new class218();

   public class206() {
      this.field2614.field2648 = this.field2614;
      this.field2614.field2649 = this.field2614;
   }

   void method3882() {
      while(true) {
         class218 var1 = this.field2614.field2648;
         if (var1 == this.field2614) {
            return;
         }

         var1.method4051();
      }
   }

   class218 method3880() {
      class218 var1 = this.field2614.field2648;
      if (var1 == this.field2614) {
         return null;
      } else {
         var1.method4051();
         return var1;
      }
   }

   public void method3891(class218 var1) {
      if (var1.field2649 != null) {
         var1.method4051();
      }

      var1.field2649 = this.field2614.field2649;
      var1.field2648 = this.field2614;
      var1.field2649.field2648 = var1;
      var1.field2648.field2649 = var1;
   }

   public void method3878(class218 var1) {
      if (var1.field2649 != null) {
         var1.method4051();
      }

      var1.field2649 = this.field2614;
      var1.field2648 = this.field2614.field2648;
      var1.field2649.field2648 = var1;
      var1.field2648.field2649 = var1;
   }

   public class218 method3881() {
      class218 var1 = this.field2614.field2648;
      return var1 == this.field2614 ? null : var1;
   }

   static void method3879(class218 var0, class218 var1) {
      if (var0.field2649 != null) {
         var0.method4051();
      }

      var0.field2649 = var1;
      var0.field2648 = var1.field2648;
      var0.field2649.field2648 = var0;
      var0.field2648.field2649 = var0;
   }
}

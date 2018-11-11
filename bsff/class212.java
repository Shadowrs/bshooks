public final class class212 {
   int field2629;
   class214 field2630;
   class206 field2626 = new class206();
   class218 field2628 = new class218();
   int field2627;

   public class212(int var1) {
      this.field2627 = var1;
      this.field2629 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.field2630 = new class214(var2);
   }

   public class218 method3929(long var1) {
      class218 var3 = (class218)this.field2630.method3981(var1);
      if (var3 != null) {
         this.field2626.method3891(var3);
      }

      return var3;
   }

   public void method3932(class218 var1, long var2) {
      if (this.field2629 == 0) {
         class218 var4 = this.field2626.method3880();
         var4.method4014();
         var4.method4051();
         if (var4 == this.field2628) {
            var4 = this.field2626.method3880();
            var4.method4014();
            var4.method4051();
         }
      } else {
         --this.field2629;
      }

      this.field2630.method3972(var1, var2);
      this.field2626.method3891(var1);
   }

   public void method3933() {
      this.field2626.method3882();
      this.field2630.method3963();
      this.field2628 = new class218();
      this.field2629 = this.field2627;
   }

   public void method3931(long var1) {
      class218 var3 = (class218)this.field2630.method3981(var1);
      if (var3 != null) {
         var3.method4014();
         var3.method4051();
         ++this.field2629;
      }

   }
}

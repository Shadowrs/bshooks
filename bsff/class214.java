public final class class214 {
   int field2637;
   class216[] field2636;
   int field2635 = 0;
   class216 field2638;
   class216 field2639;

   public class214(int var1) {
      this.field2637 = var1;
      this.field2636 = new class216[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class216 var3 = this.field2636[var2] = new class216();
         var3.field2642 = var3;
         var3.field2643 = var3;
      }

   }

   public class216 method3962() {
      this.field2635 = 0;
      return this.method3965();
   }

   public class216 method3981(long var1) {
      class216 var3 = this.field2636[(int)(var1 & (long)(this.field2637 - 1))];

      for(this.field2639 = var3.field2642; var3 != this.field2639; this.field2639 = this.field2639.field2642) {
         if (this.field2639.field2644 == var1) {
            class216 var4 = this.field2639;
            this.field2639 = this.field2639.field2642;
            return var4;
         }
      }

      this.field2639 = null;
      return null;
   }

   public class216 method3965() {
      class216 var1;
      if (this.field2635 > 0 && this.field2636[this.field2635 - 1] != this.field2638) {
         var1 = this.field2638;
         this.field2638 = var1.field2642;
         return var1;
      } else {
         while(this.field2635 < this.field2637) {
            var1 = this.field2636[this.field2635++].field2642;
            if (var1 != this.field2636[this.field2635 - 1]) {
               this.field2638 = var1.field2642;
               return var1;
            }
         }

         return null;
      }
   }

   void method3963() {
      for(int var1 = 0; var1 < this.field2637; ++var1) {
         class216 var2 = this.field2636[var1];

         while(true) {
            class216 var3 = var2.field2642;
            if (var3 == var2) {
               break;
            }

            var3.method4014();
         }
      }

      this.field2639 = null;
      this.field2638 = null;
   }

   public void method3972(class216 var1, long var2) {
      if (var1.field2643 != null) {
         var1.method4014();
      }

      class216 var4 = this.field2636[(int)(var2 & (long)(this.field2637 - 1))];
      var1.field2643 = var4.field2643;
      var1.field2642 = var4;
      var1.field2643.field2642 = var1;
      var1.field2642.field2643 = var1;
      var1.field2644 = var2;
   }
}

public class class100 extends class117 {
   class217 field1487 = new class217();
   class217 field1490 = new class217();
   int field1488 = -1;
   int field1489 = 0;

   void method2068(int[] var1, int var2, int var3) {
      for(class117 var4 = (class117)this.field1487.method4027(); var4 != null; var4 = (class117)this.field1487.method4026()) {
         var4.method2487(var1, var2, var3);
      }

   }

   void method2070(int var1) {
      for(class117 var2 = (class117)this.field1487.method4027(); var2 != null; var2 = (class117)this.field1487.method4026()) {
         var2.vmethod4340(var1);
      }

   }

   public final synchronized void vmethod4339(int[] var1, int var2, int var3) {
      do {
         if (this.field1488 < 0) {
            this.method2068(var1, var2, var3);
            return;
         }

         if (var3 + this.field1489 < this.field1488) {
            this.field1489 += var3;
            this.method2068(var1, var2, var3);
            return;
         }

         int var4 = this.field1488 - this.field1489;
         this.method2068(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1489 += var4;
         this.method2061();
         class112 var5 = (class112)this.field1490.method4027();
         synchronized(var5) {
            int var7 = var5.method2281(this);
            if (var7 < 0) {
               var5.field1594 = 0;
               this.method2063(var5);
            } else {
               var5.field1594 = var7;
               this.method2058(var5.field2642, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void vmethod4340(int var1) {
      do {
         if (this.field1488 < 0) {
            this.method2070(var1);
            return;
         }

         if (this.field1489 + var1 < this.field1488) {
            this.field1489 += var1;
            this.method2070(var1);
            return;
         }

         int var2 = this.field1488 - this.field1489;
         this.method2070(var2);
         var1 -= var2;
         this.field1489 += var2;
         this.method2061();
         class112 var3 = (class112)this.field1490.method4027();
         synchronized(var3) {
            int var5 = var3.method2281(this);
            if (var5 < 0) {
               var3.field1594 = 0;
               this.method2063(var3);
            } else {
               var3.field1594 = var5;
               this.method2058(var3.field2642, var3);
            }
         }
      } while(var1 != 0);

   }

   protected class117 vmethod4337() {
      return (class117)this.field1487.method4026();
   }

   void method2061() {
      if (this.field1489 > 0) {
         for(class112 var1 = (class112)this.field1490.method4027(); var1 != null; var1 = (class112)this.field1490.method4026()) {
            var1.field1594 -= this.field1489;
         }

         this.field1488 -= this.field1489;
         this.field1489 = 0;
      }

   }

   public final synchronized void method2085(class117 var1) {
      this.field1487.method4021(var1);
   }

   protected class117 vmethod4336() {
      return (class117)this.field1487.method4027();
   }

   public final synchronized void method2062(class117 var1) {
      var1.method4014();
   }

   void method2063(class112 var1) {
      var1.method4014();
      var1.method2275();
      class216 var2 = this.field1490.field2646.field2642;
      if (var2 == this.field1490.field2646) {
         this.field1488 = -1;
      } else {
         this.field1488 = ((class112)var2).field1594;
      }

   }

   void method2058(class216 var1, class112 var2) {
      while(this.field1490.field2646 != var1 && ((class112)var1).field1594 <= var2.field1594) {
         var1 = var1.field2642;
      }

      class217.method4045(var2, var1);
      this.field1488 = ((class112)this.field1490.field2646.field2642).field1594;
   }

   protected int vmethod4338() {
      return 0;
   }
}

public final class class213 {
   int field2631;
   class209 field2633;
   class227 field2634 = new class227();
   int field2632;

   public class213(int var1, int var2) {
      this.field2631 = var1;
      this.field2632 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field2633 = new class209(var3);
   }

   public void method3943(Object var1, long var2, int var4) {
      if (var4 > this.field2631) {
         throw new IllegalStateException();
      } else {
         this.method3941(var2);
         this.field2632 -= var4;

         while(this.field2632 < 0) {
            class224 var5 = (class224)this.field2634.method4103();
            this.method3940(var5);
         }

         class208 var6 = new class208(var1, var4);
         this.field2633.method3914(var6, var2);
         this.field2634.method4096(var6);
         var6.field2647 = 0L;
      }
   }

   public void method3944(int var1) {
      for(class224 var2 = (class224)this.field2634.method4100(); var2 != null; var2 = (class224)this.field2634.method4098()) {
         if (var2.vmethod4088()) {
            if (var2.vmethod4085() == null) {
               var2.method4014();
               var2.method4051();
               this.field2632 += var2.field2660;
            }
         } else if (++var2.field2647 > (long)var1) {
            class219 var3 = new class219(var2.vmethod4085(), var2.field2660);
            this.field2633.method3914(var3, var2.field2644);
            class206.method3879(var3, var2);
            var2.method4014();
            var2.method4051();
         }
      }

   }

   public Object method3945(long var1) {
      class224 var3 = (class224)this.field2633.method3907(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod4085();
         if (var4 == null) {
            var3.method4014();
            var3.method4051();
            this.field2632 += var3.field2660;
            return null;
         } else {
            if (var3.vmethod4088()) {
               class208 var5 = new class208(var4, var3.field2660);
               this.field2633.method3914(var5, var3.field2644);
               this.field2634.method4096(var5);
               var5.field2647 = 0L;
               var3.method4014();
               var3.method4051();
            } else {
               this.field2634.method4096(var3);
               var3.field2647 = 0L;
            }

            return var4;
         }
      }
   }

   void method3941(long var1) {
      class224 var3 = (class224)this.field2633.method3907(var1);
      this.method3940(var3);
   }

   void method3940(class224 var1) {
      if (var1 != null) {
         var1.method4014();
         var1.method4051();
         this.field2632 += var1.field2660;
      }

   }

   public void method3953(Object var1, long var2) {
      this.method3943(var1, var2, 1);
   }

   public void method3954() {
      this.field2634.method4097();
      this.field2633.method3904();
      this.field2632 = this.field2631;
   }
}

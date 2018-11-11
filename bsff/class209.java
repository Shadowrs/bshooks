import java.util.Iterator;

public final class class209 implements Iterable {
   int field2621;
   int field2617 = 0;
   class216[] field2618;
   class216 field2620;
   class216 field2619;

   public class209(int var1) {
      this.field2621 = var1;
      this.field2618 = new class216[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class216 var3 = this.field2618[var2] = new class216();
         var3.field2642 = var3;
         var3.field2643 = var3;
      }

   }

   public class216 method3907(long var1) {
      class216 var3 = this.field2618[(int)(var1 & (long)(this.field2621 - 1))];

      for(this.field2619 = var3.field2642; var3 != this.field2619; this.field2619 = this.field2619.field2642) {
         if (this.field2619.field2644 == var1) {
            class216 var4 = this.field2619;
            this.field2619 = this.field2619.field2642;
            return var4;
         }
      }

      this.field2619 = null;
      return null;
   }

   public class216 method3901() {
      class216 var1;
      if (this.field2617 > 0 && this.field2618[this.field2617 - 1] != this.field2620) {
         var1 = this.field2620;
         this.field2620 = var1.field2642;
         return var1;
      } else {
         while(this.field2617 < this.field2621) {
            var1 = this.field2618[this.field2617++].field2642;
            if (var1 != this.field2618[this.field2617 - 1]) {
               this.field2620 = var1.field2642;
               return var1;
            }
         }

         return null;
      }
   }

   public void method3904() {
      for(int var1 = 0; var1 < this.field2621; ++var1) {
         class216 var2 = this.field2618[var1];

         while(true) {
            class216 var3 = var2.field2642;
            if (var3 == var2) {
               break;
            }

            var3.method4014();
         }
      }

      this.field2619 = null;
      this.field2620 = null;
   }

   public Iterator iterator() {
      return new class222(this);
   }

   public void method3914(class216 var1, long var2) {
      if (var1.field2643 != null) {
         var1.method4014();
      }

      class216 var4 = this.field2618[(int)(var2 & (long)(this.field2621 - 1))];
      var1.field2643 = var4.field2643;
      var1.field2642 = var4;
      var1.field2643.field2642 = var1;
      var1.field2642.field2643 = var1;
      var1.field2644 = var2;
   }

   public class216 method3910() {
      this.field2617 = 0;
      return this.method3901();
   }
}

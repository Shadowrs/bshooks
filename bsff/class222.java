import java.util.Iterator;

public class class222 implements Iterator {
   class216 field2658 = null;
   class216 field2657;
   class209 field2656;
   int field2655;

   class222(class209 var1) {
      this.field2656 = var1;
      this.method4081();
   }

   void method4081() {
      this.field2657 = this.field2656.field2618[0].field2642;
      this.field2655 = 1;
      this.field2658 = null;
   }

   public boolean hasNext() {
      if (this.field2656.field2618[this.field2655 - 1] != this.field2657) {
         return true;
      } else {
         while(this.field2655 < this.field2656.field2621) {
            if (this.field2656.field2618[this.field2655++].field2642 != this.field2656.field2618[this.field2655 - 1]) {
               this.field2657 = this.field2656.field2618[this.field2655 - 1].field2642;
               return true;
            }

            this.field2657 = this.field2656.field2618[this.field2655 - 1];
         }

         return false;
      }
   }

   public Object next() {
      class216 var1;
      if (this.field2656.field2618[this.field2655 - 1] != this.field2657) {
         var1 = this.field2657;
         this.field2657 = var1.field2642;
         this.field2658 = var1;
         return var1;
      } else {
         while(this.field2655 < this.field2656.field2621) {
            var1 = this.field2656.field2618[this.field2655++].field2642;
            if (var1 != this.field2656.field2618[this.field2655 - 1]) {
               this.field2657 = var1.field2642;
               this.field2658 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   public void remove() {
      if (this.field2658 == null) {
         throw new IllegalStateException();
      } else {
         this.field2658.method4014();
         this.field2658 = null;
      }
   }
}

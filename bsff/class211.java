import java.util.Iterator;

public class class211 implements Iterator {
   class216 field2624;
   class216 field2623 = null;
   class215 field2625;

   class211(class215 var1) {
      this.field2625 = var1;
      this.field2624 = this.field2625.field2640.field2642;
      this.field2623 = null;
   }

   public Object next() {
      class216 var1 = this.field2624;
      if (var1 == this.field2625.field2640) {
         var1 = null;
         this.field2624 = null;
      } else {
         this.field2624 = var1.field2642;
      }

      this.field2623 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field2625.field2640 != this.field2624;
   }

   public void remove() {
      if (this.field2623 == null) {
         throw new IllegalStateException();
      } else {
         this.field2623.method4014();
         this.field2623 = null;
      }
   }
}

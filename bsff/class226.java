import java.util.Iterator;

public class class226 implements Iterator {
   class218 field2663;
   class218 field2664 = null;
   class227 field2662;

   class226(class227 var1) {
      this.field2662 = var1;
      this.field2663 = this.field2662.field2666.field2648;
      this.field2664 = null;
   }

   public Object next() {
      class218 var1 = this.field2663;
      if (var1 == this.field2662.field2666) {
         var1 = null;
         this.field2663 = null;
      } else {
         this.field2663 = var1.field2648;
      }

      this.field2664 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field2662.field2666 != this.field2663;
   }

   public void remove() {
      if (this.field2664 == null) {
         throw new IllegalStateException();
      } else {
         this.field2664.method4051();
         this.field2664 = null;
      }
   }
}

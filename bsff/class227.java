import java.util.Iterator;

public class class227 implements Iterable {
   class218 field2665;
   public class218 field2666 = new class218();

   public class227() {
      this.field2666.field2648 = this.field2666;
      this.field2666.field2649 = this.field2666;
   }

   class218 method4101(class218 var1) {
      class218 var2;
      if (var1 == null) {
         var2 = this.field2666.field2648;
      } else {
         var2 = var1;
      }

      if (var2 == this.field2666) {
         this.field2665 = null;
         return null;
      } else {
         this.field2665 = var2.field2648;
         return var2;
      }
   }

   class218 method4100() {
      return this.method4101((class218)null);
   }

   public void method4097() {
      while(this.field2666.field2648 != this.field2666) {
         this.field2666.field2648.method4051();
      }

   }

   class218 method4103() {
      class218 var1 = this.field2666.field2648;
      if (var1 == this.field2666) {
         return null;
      } else {
         var1.method4051();
         return var1;
      }
   }

   class218 method4098() {
      class218 var1 = this.field2665;
      if (var1 == this.field2666) {
         this.field2665 = null;
         return null;
      } else {
         this.field2665 = var1.field2648;
         return var1;
      }
   }

   public void method4096(class218 var1) {
      if (var1.field2649 != null) {
         var1.method4051();
      }

      var1.field2649 = this.field2666.field2649;
      var1.field2648 = this.field2666;
      var1.field2649.field2648 = var1;
      var1.field2648.field2649 = var1;
   }

   public Iterator iterator() {
      return new class226(this);
   }
}

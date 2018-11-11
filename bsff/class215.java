import java.util.Iterator;

public class class215 implements Iterable {
   class216 field2641;
   class216 field2640 = new class216();

   public class215() {
      this.field2640.field2642 = this.field2640;
      this.field2640.field2643 = this.field2640;
   }

   class216 method3994(class216 var1) {
      class216 var2;
      if (var1 == null) {
         var2 = this.field2640.field2642;
      } else {
         var2 = var1;
      }

      if (var2 == this.field2640) {
         this.field2641 = null;
         return null;
      } else {
         this.field2641 = var2.field2642;
         return var2;
      }
   }

   public void method3983() {
      while(this.field2640.field2642 != this.field2640) {
         this.field2640.field2642.method4014();
      }

   }

   public boolean method4002() {
      return this.field2640.field2642 == this.field2640;
   }

   public class216 method3988() {
      return this.method3994((class216)null);
   }

   public void method3984(class216 var1) {
      if (var1.field2643 != null) {
         var1.method4014();
      }

      var1.field2643 = this.field2640.field2643;
      var1.field2642 = this.field2640;
      var1.field2643.field2642 = var1;
      var1.field2642.field2643 = var1;
   }

   public class216 method4003() {
      class216 var1 = this.field2641;
      if (var1 == this.field2640) {
         this.field2641 = null;
         return null;
      } else {
         this.field2641 = var1.field2642;
         return var1;
      }
   }

   public void method4009(class216 var1) {
      if (var1.field2643 != null) {
         var1.method4014();
      }

      var1.field2643 = this.field2640;
      var1.field2642 = this.field2640.field2642;
      var1.field2643.field2642 = var1;
      var1.field2642.field2643 = var1;
   }

   public class216 method4006() {
      class216 var1 = this.field2640.field2642;
      if (var1 == this.field2640) {
         return null;
      } else {
         var1.method4014();
         return var1;
      }
   }

   public Iterator iterator() {
      return new class211(this);
   }

   public static void method3986(class216 var0, class216 var1) {
      if (var0.field2643 != null) {
         var0.method4014();
      }

      var0.field2643 = var1;
      var0.field2642 = var1.field2642;
      var0.field2643.field2642 = var0;
      var0.field2642.field2643 = var0;
   }
}

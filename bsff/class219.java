import java.lang.ref.SoftReference;

public class class219 extends class224 {
   SoftReference field2650;

   class219(Object var1, int var2) {
      super(var2);
      this.field2650 = new SoftReference(var1);
   }

   boolean vmethod4088() {
      return true;
   }

   Object vmethod4085() {
      return this.field2650.get();
   }
}

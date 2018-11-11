import java.util.Comparator;

public abstract class class297 implements Comparator {
   Comparator field3826;

   protected final int method5288(class296 var1, class296 var2, int var3) {
      return this.field3826 == null ? 0 : this.field3826.compare(var1, var2);
   }

   final void method5287(Comparator var1, int var2) {
      if (this.field3826 == null) {
         this.field3826 = var1;
      } else if (this.field3826 instanceof class297) {
         ((class297)this.field3826).method5287(var1, 663412895);
      }

   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method5286(int var0) {
      class137.field2026 = false;
      client.field862 = false;
   }
}

import java.util.Comparator;

public class class321 implements Comparator {
   boolean field3933;

   public class321(boolean var1) {
      this.field3933 = var1;
   }

   int method5674(class296 var1, class296 var2, byte var3) {
      return this.field3933 ? var1.vmethod5454(var2, (byte)0) : var2.vmethod5454(var1, (byte)0);
   }

   public int compare(Object var1, Object var2) {
      return this.method5674((class296)var1, (class296)var2, (byte)81);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}

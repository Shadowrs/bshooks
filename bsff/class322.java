import java.util.Comparator;

public class class322 implements Comparator {
   boolean field3934;

   public class322(boolean var1) {
      this.field3934 = var1;
   }

   int method5683(class296 var1, class296 var2, int var3) {
      return this.field3934 ? var1.method5260(1291806181).method5441(var2.method5260(1291806181), (byte)-75) : var2.method5260(1291806181).method5441(var1.method5260(1291806181), (byte)-116);
   }

   public int compare(Object var1, Object var2) {
      return this.method5683((class296)var1, (class296)var2, -989864560);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}

public class class161 extends class172 {
   long field2161 = System.nanoTime();

   public int vmethod3312(int var1, int var2, byte var3) {
      long var4 = 1000000L * (long)var2;
      long var6 = this.field2161 - System.nanoTime();
      if (var6 < var4) {
         var6 = var4;
      }

      class163.method3223(var6 / 1000000L);
      long var8 = System.nanoTime();

      int var10;
      for(var10 = 0; var10 < 10 && (var10 < 1 || this.field2161 < var8); this.field2161 += 1000000L * (long)var1) {
         ++var10;
      }

      if (this.field2161 < var8) {
         this.field2161 = var8;
      }

      return var10;
   }

   public void vmethod3302(int var1) {
      this.field2161 = System.nanoTime();
   }
}

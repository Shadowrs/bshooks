public class class236 extends class218 {
   public static class311 field2767;
   public int[] field2766;
   public int field2765;
   public int field2763;
   public int[] field2768;

   class236(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field2765 = var1;
      this.field2763 = var2;
      this.field2768 = var3;
      this.field2766 = var4;
   }

   public boolean method4374(int var1, int var2, int var3) {
      if (var2 >= 0 && var2 < this.field2766.length) {
         int var4 = this.field2766[var2];
         if (var1 >= var4 && var1 <= var4 + this.field2768[var2]) {
            return true;
         }
      }

      return false;
   }
}

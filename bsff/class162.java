public class class162 extends class172 {
   int field2164 = 256;
   long[] field2163 = new long[10];
   int field2162 = 1;
   int field2166 = 0;
   long field2165 = class6.method28(1358803598);
   int field2167;

   class162() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field2163[var1] = this.field2165;
      }

   }

   public int vmethod3312(int var1, int var2, byte var3) {
      int var4 = this.field2164;
      int var5 = this.field2162;
      this.field2164 = 300;
      this.field2162 = 1;
      this.field2165 = class6.method28(1358803598);
      if (0L == this.field2163[this.field2167]) {
         this.field2164 = var4;
         this.field2162 = var5;
      } else if (this.field2165 > this.field2163[this.field2167]) {
         this.field2164 = (int)((long)(var1 * 2560) / (this.field2165 - this.field2163[this.field2167]));
      }

      if (this.field2164 < 25) {
         this.field2164 = 25;
      }

      if (this.field2164 > 256) {
         this.field2164 = 256;
         this.field2162 = (int)((long)var1 - (this.field2165 - this.field2163[this.field2167]) / 10L);
      }

      if (this.field2162 > var1) {
         this.field2162 = var1;
      }

      this.field2163[this.field2167] = this.field2165;
      this.field2167 = (this.field2167 + 1) % 10;
      int var6;
      if (this.field2162 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if (this.field2163[var6] != 0L) {
               this.field2163[var6] += (long)this.field2162;
            }
         }
      }

      if (this.field2162 < var2) {
         this.field2162 = var2;
      }

      class163.method3223((long)this.field2162);

      for(var6 = 0; this.field2166 < 256; this.field2166 += this.field2164) {
         ++var6;
      }

      this.field2166 &= 255;
      return var6;
   }

   public void vmethod3302(int var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.field2163[var2] = 0L;
      }

   }
}

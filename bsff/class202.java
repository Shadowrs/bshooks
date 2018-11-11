public final class class202 {
   static class194 field2604;
   int field2598;
   int field2602;
   int field2599;
   int[] field2600 = new int[256];
   int[] field2597 = new int[256];
   int field2601;

   public class202(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field2597[var2] = var1[var2];
      }

      this.method3826(1347687077);
   }

   final void method3825(int var1) {
      this.field2602 += ++this.field2599;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.field2600[var2];
         if ((var2 & 2) == 0) {
            if ((var2 & 1) == 0) {
               this.field2601 ^= this.field2601 << 13;
            } else {
               this.field2601 ^= this.field2601 >>> 6;
            }
         } else if ((var2 & 1) == 0) {
            this.field2601 ^= this.field2601 << 2;
         } else {
            this.field2601 ^= this.field2601 >>> 16;
         }

         this.field2601 += this.field2600[128 + var2 & 255];
         int var4;
         this.field2600[var2] = var4 = this.field2600[(var3 & 1020) >> 2] + this.field2602 + this.field2601;
         this.field2597[var2] = this.field2602 = this.field2600[(var4 >> 8 & 1020) >> 2] + var3;
      }

   }

   final int method3824(int var1) {
      if (this.field2598 == 0) {
         this.method3825(-1535505928);
         this.field2598 = 256;
      }

      return 0;
   }

   final void method3826(int var1) {
      int var2 = -1640531527;
      int var3 = -1640531527;
      int var4 = -1640531527;
      int var5 = -1640531527;
      int var6 = -1640531527;
      int var7 = -1640531527;
      int var8 = -1640531527;
      int var9 = -1640531527;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         var9 ^= var8 << 11;
         var6 += var9;
         var8 += var7;
         var8 ^= var7 >>> 2;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 << 8;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 >>> 16;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 << 10;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 >>> 4;
         var9 += var4;
         var3 += var2;
         var3 ^= var2 << 8;
         var8 += var3;
         var2 += var9;
         var2 ^= var9 >>> 9;
         var7 += var2;
         var9 += var8;
      }

      for(var10 = 0; var10 < 256; var10 += 8) {
         var9 += this.field2597[var10];
         var8 += this.field2597[var10 + 1];
         var7 += this.field2597[var10 + 2];
         var6 += this.field2597[var10 + 3];
         var5 += this.field2597[var10 + 4];
         var4 += this.field2597[var10 + 5];
         var3 += this.field2597[var10 + 6];
         var2 += this.field2597[var10 + 7];
         var9 ^= var8 << 11;
         var6 += var9;
         var8 += var7;
         var8 ^= var7 >>> 2;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 << 8;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 >>> 16;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 << 10;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 >>> 4;
         var9 += var4;
         var3 += var2;
         var3 ^= var2 << 8;
         var8 += var3;
         var2 += var9;
         var2 ^= var9 >>> 9;
         var7 += var2;
         var9 += var8;
         this.field2600[var10] = var9;
         this.field2600[var10 + 1] = var8;
         this.field2600[var10 + 2] = var7;
         this.field2600[var10 + 3] = var6;
         this.field2600[var10 + 4] = var5;
         this.field2600[var10 + 5] = var4;
         this.field2600[var10 + 6] = var3;
         this.field2600[var10 + 7] = var2;
      }

      for(var10 = 0; var10 < 256; var10 += 8) {
         var9 += this.field2600[var10];
         var8 += this.field2600[var10 + 1];
         var7 += this.field2600[var10 + 2];
         var6 += this.field2600[var10 + 3];
         var5 += this.field2600[var10 + 4];
         var4 += this.field2600[var10 + 5];
         var3 += this.field2600[var10 + 6];
         var2 += this.field2600[var10 + 7];
         var9 ^= var8 << 11;
         var6 += var9;
         var8 += var7;
         var8 ^= var7 >>> 2;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 << 8;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 >>> 16;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 << 10;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 >>> 4;
         var9 += var4;
         var3 += var2;
         var3 ^= var2 << 8;
         var8 += var3;
         var2 += var9;
         var2 ^= var9 >>> 9;
         var7 += var2;
         var9 += var8;
         this.field2600[var10] = var9;
         this.field2600[var10 + 1] = var8;
         this.field2600[var10 + 2] = var7;
         this.field2600[var10 + 3] = var6;
         this.field2600[var10 + 4] = var5;
         this.field2600[var10 + 5] = var4;
         this.field2600[var10 + 6] = var3;
         this.field2600[var10 + 7] = var2;
      }

      this.method3825(-1074465153);
      this.field2598 = 256;
   }

   final int method3823(byte var1) {
      if (0 == --this.field2598 + 1) {
         this.method3825(-1983918959);
         this.field2598 = 255;
      }

      return 0;
   }

   public static class287 method3839(int var0, byte var1) {
      class287 var2 = (class287)class287.field3751.method3929((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class17.field299.method4551(12, var0, -638966989);
         var2 = new class287();
         if (var3 != null) {
            var2.method5175(new class194(var3), -944928397);
         }

         var2.method5180(-1645234562);
         class287.field3751.method3932(var2, (long)var0);
         return var2;
      }
   }
}

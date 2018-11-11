public class class273 extends class218 {
   static class212 field3502 = new class212(64);
   int field3500 = 0;
   public int field3501;
   public int field3503;
   public int field3499;
   public int field3504;

   void method4815(int var1, int var2) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var5 = (double)(var1 >> 8 & 255) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var11 + var9) / 2.0D;
      if (var9 != var11) {
         if (var17 < 0.5D) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if (var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var11 == var5) {
            var13 = 2.0D + (var7 - var3) / (var11 - var9);
         } else if (var11 == var7) {
            var13 = (var3 - var5) / (var11 - var9) + 4.0D;
         }
      }

      var13 /= 6.0D;
      this.field3501 = (int)(256.0D * var15);
      this.field3503 = (int)(256.0D * var17);
      if (this.field3501 < 0) {
         this.field3501 = 0;
      } else if (this.field3501 > 255) {
         this.field3501 = 255;
      }

      if (this.field3503 < 0) {
         this.field3503 = 0;
      } else if (this.field3503 > 255) {
         this.field3503 = 255;
      }

      if (var17 > 0.5D) {
         this.field3504 = (int)((1.0D - var17) * var15 * 512.0D);
      } else {
         this.field3504 = (int)(var15 * var17 * 512.0D);
      }

      if (this.field3504 < 1) {
         this.field3504 = 1;
      }

      this.field3499 = (int)(var13 * (double)this.field3504);
   }

   void method4826(class194 var1, int var2, int var3, int var4) {
      if (var2 == 1) {
         this.field3500 = var1.get24Int((byte)-87);
      }

   }

   void method4813(int var1) {
      this.method4815(this.field3500, -1751452789);
   }

   void method4814(class194 var1, int var2, int var3) {
      while(true) {
         int var4 = var1.getUByte(564080973);
         if (var4 == 0) {
            return;
         }

         this.method4826(var1, var4, var2, -625533610);
      }
   }
}

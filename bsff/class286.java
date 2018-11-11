public class class286 extends class218 {
   public static class212 field3739 = new class212(64);
   static class261 field3737;
   public int field3738 = -1;
   public int field3735 = 0;
   public boolean field3733 = true;
   public int field3736 = -1;
   public int field3743;
   public int field3742;
   public int field3740;
   public int field3741;
   public int field3745;
   public int field3744;

   void method5165(class194 var1, int var2, int var3, byte var4) {
      if (var2 == 1) {
         this.field3735 = var1.get24Int((byte)-66);
      } else if (var2 == 2) {
         this.field3736 = var1.getUByte(-1599665292);
      } else if (var2 == 5) {
         this.field3733 = false;
      } else if (var2 == 7) {
         this.field3738 = var1.get24Int((byte)-55);
      } else if (var2 == 8) {
         ;
      }

   }

   void method5161(int var1, int var2) {
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
      double var17 = (var9 + var11) / 2.0D;
      if (var9 != var11) {
         if (var17 < 0.5D) {
            var15 = (var11 - var9) / (var11 + var9);
         }

         if (var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if (var11 == var3) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var5 == var11) {
            var13 = 2.0D + (var7 - var3) / (var11 - var9);
         } else if (var7 == var11) {
            var13 = (var3 - var5) / (var11 - var9) + 4.0D;
         }
      }

      var13 /= 6.0D;
      this.field3743 = (int)(256.0D * var13);
      this.field3740 = (int)(256.0D * var15);
      this.field3745 = (int)(256.0D * var17);
      if (this.field3740 < 0) {
         this.field3740 = 0;
      } else if (this.field3740 > 255) {
         this.field3740 = 255;
      }

      if (this.field3745 < 0) {
         this.field3745 = 0;
      } else if (this.field3745 > 255) {
         this.field3745 = 255;
      }

   }

   void method5166(int var1) {
      if (this.field3738 != -1) {
         this.method5161(this.field3738, 1627905684);
         this.field3742 = this.field3743;
         this.field3741 = this.field3740;
         this.field3744 = this.field3745;
      }

      this.method5161(this.field3735, 880591075);
   }

   void method5159(class194 var1, int var2, byte var3) {
      while(true) {
         int var4 = var1.getUByte(330795207);
         if (var4 == 0) {
            return;
         }

         this.method5165(var1, var4, var2, (byte)-39);
      }
   }
}

public class class123 implements class143 {
   static class242 field1701;
   static class330 field1691;
   int field1698 = 128;
   double field1696 = 1.0D;
   class128[] field1702;
   class217 field1692 = new class217();
   int field1694 = 0;
   int field1693;
   class261 field1697;

   public class123(class261 var1, class261 var2, int var3, double var4, int var6) {
      this.field1697 = var2;
      this.field1693 = var3;
      this.field1694 = this.field1693;
      this.field1696 = var4;
      this.field1698 = var6;
      int[] var7 = var1.method4562(0, -1000298570);
      int var8 = var7.length;
      this.field1702 = new class128[var1.method4563(0, 912805313)];

      for(int var9 = 0; var9 < var8; ++var9) {
         class194 var10 = new class194(var1.method4551(0, var7[var9], -789532827));
         this.field1702[var7[var9]] = new class128(var10);
      }

   }

   public void method2561(int var1) {
      for(int var2 = 0; var2 < this.field1702.length; ++var2) {
         if (this.field1702[var2] != null) {
            this.field1702[var2].method2670();
         }
      }

      this.field1692 = new class217();
      this.field1694 = this.field1693;
   }

   public int vmethod3084(int var1, int var2) {
      return this.field1702[var1] != null ? this.field1702[var1].field1794 : 0;
   }

   public int method2555(int var1) {
      int var2 = 0;
      int var3 = 0;
      class128[] var4 = this.field1702;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class128 var6 = var4[var5];
         if (var6 != null && var6.field1796 != null) {
            var2 += var6.field1796.length;
            int[] var7 = var6.field1796;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               int var9 = var7[var8];
               if (this.field1697.method4630(var9, 711680903)) {
                  ++var3;
               }
            }
         }
      }

      if (var2 == 0) {
         return 0;
      } else {
         return var3 * 100 / var2;
      }
   }

   public int[] vmethod3094(int var1, short var2) {
      class128 var3 = this.field1702[var1];
      if (var3 != null) {
         if (var3.field1802 != null) {
            this.field1692.method4021(var3);
            var3.field1803 = true;
            return var3.field1802;
         }

         boolean var4 = var3.method2671(this.field1696, this.field1698, this.field1697);
         if (var4) {
            if (this.field1694 == 0) {
               class128 var5 = (class128)this.field1692.method4024();
               var5.method2670();
            } else {
               --this.field1694;
            }

            this.field1692.method4021(var3);
            var3.field1803 = true;
            return var3.field1802;
         }
      }

      return null;
   }

   public boolean vmethod3086(int var1, int var2) {
      return this.field1698 == 64;
   }

   public boolean vmethod3087(int var1, int var2) {
      return this.field1702[var1].field1793;
   }

   public void method2574(double var1) {
      this.field1696 = var1;
      this.method2561(-567202708);
   }

   public void method2562(int var1, int var2) {
      for(int var3 = 0; var3 < this.field1702.length; ++var3) {
         class128 var4 = this.field1702[var3];
         if (var4 != null && var4.field1790 != 0 && var4.field1803) {
            var4.method2668(var1);
            var4.field1803 = false;
         }
      }

   }
}

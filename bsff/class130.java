public final class class130 extends class216 {
   static class107 field1824;
   public static int field1839;
   class146[] field1827 = new class146[5];
   int[] field1828 = new int[5];
   class124 field1825;
   class135 field1820;
   class145 field1819;
   class140 field1838;
   class127 field1823;
   int field1826;
   int field1829 = 0;
   class126 field1816;
   boolean field1832;
   int field1840;
   int field1830;
   int field1817;
   int field1822;
   int field1837;
   class130 field1835;
   boolean field1831;
   int field1834;
   boolean field1833;
   int field1818;
   int field1821;
   int field1836;

   class130(int var1, int var2, int var3) {
      this.field1822 = this.field1840 = var1;
      this.field1817 = var2;
      this.field1837 = var3;
   }

   static void method2679(class242[] var0, int var1, int var2, int var3, boolean var4, int var5) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         class242 var7 = var0[var6];
         if (var7 != null && var7.field2885 == var1) {
            class24.method191(var7, var2, var3, var4, (byte)14);
            class292.method5207(var7, var2, var3, (byte)102);
            if (var7.field2835 > var7.field2849 - var7.field2826) {
               var7.field2835 = var7.field2849 - var7.field2826;
            }

            if (var7.field2835 < 0) {
               var7.field2835 = 0;
            }

            if (var7.field2836 > var7.field2838 - var7.field2887) {
               var7.field2836 = var7.field2838 - var7.field2887;
            }

            if (var7.field2836 < 0) {
               var7.field2836 = 0;
            }

            if (var7.field2850 == 0) {
               class40.method578(var0, var7, var4, 1591564826);
            }
         }
      }

   }
}

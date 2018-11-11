public class class129 {
   static int[] field1813 = new int[500];
   static int[] field1805 = new int[500];
   static int[] field1807 = new int[500];
   static int[] field1808 = new int[500];
   class136 field1814 = null;
   boolean field1815 = false;
   int field1806 = -1;
   int[] field1811;
   int[] field1812;
   int[] field1809;
   int[] field1810;

   class129(byte[] var1, class136 var2) {
      this.field1814 = var2;
      class194 var3 = new class194(var1);
      class194 var4 = new class194(var1);
      var3.field2565 = 2;
      int var5 = var3.getUByte(1123342738);
      int var6 = -1;
      int var7 = 0;
      var4.field2565 = var5 + var3.field2565;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.getUByte(578088622);
         if (var9 > 0) {
            if (this.field1814.field1975[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.field1814.field1975[var10] == 0) {
                     field1813[var7] = var10;
                     field1805[var7] = 0;
                     field1807[var7] = 0;
                     field1808[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field1813[var7] = var8;
            short var11 = 0;
            if (this.field1814.field1975[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field1805[var7] = var4.getSmart(764027762);
            } else {
               field1805[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field1807[var7] = var4.getSmart(764027762);
            } else {
               field1807[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field1808[var7] = var4.getSmart(764027762);
            } else {
               field1808[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.field1814.field1975[var8] == 5) {
               this.field1815 = true;
            }
         }
      }

      if (var1.length != var4.field2565) {
         throw new RuntimeException();
      } else {
         this.field1806 = var7;
         this.field1811 = new int[var7];
         this.field1812 = new int[var7];
         this.field1809 = new int[var7];
         this.field1810 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field1811[var8] = field1813[var8];
            this.field1812[var8] = field1805[var8];
            this.field1809[var8] = field1807[var8];
            this.field1810[var8] = field1808[var8];
         }

      }
   }
}

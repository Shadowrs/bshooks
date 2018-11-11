public final class class135 {
   static class331[] field1966;
   static int field1964;
   boolean field1962 = true;
   int field1957;
   int field1958;
   int field1965;
   int field1959;
   int field1960;
   int field1961;

   class135(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field1957 = var1;
      this.field1958 = var2;
      this.field1959 = var3;
      this.field1960 = var4;
      this.field1961 = var5;
      this.field1965 = var6;
      this.field1962 = var7;
   }

   static int method2872(int var0) {
      return ++class95.field1435 - 1;
   }

   public static int method2873(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + var0.charAt(var4);
      }

      return var3;
   }
}

public class class309 {
   public static class309 field3872 = new class309("VERDANA11", "verdana_11pt_regular");
   public static class309 field3871 = new class309("PLAIN11", "p11_full");
   public static class309 field3873 = new class309("VERDANA13", "verdana_13pt_regular");
   public static class309 field3880 = new class309("VERDANA15", "verdana_15pt_regular");
   public static class309 field3874 = new class309("PLAIN12", "p12_full");
   static int field3878;
   public static class309 field3877 = new class309("BOLD12", "b12_full");
   static int[] field3870;
   String field3869;
   String field3876;

   class309(String var1, String var2) {
      this.field3869 = var1;
      this.field3876 = var2;
   }

   public static class309[] method5498(byte var0) {
      return new class309[]{field3872, field3871, field3873, field3874, field3880, field3877};
   }

   static class330 method5499(boolean var0, boolean var1, byte var2) {
      return var0 ? (var1 ? class304.field3848 : class151.field2127) : (var1 ? class90.field1342 : class123.field1691);
   }

   static void method5496(class72 var0, int var1, int var2, byte var3) {
      if (var0.field1182 == var1 && var1 != -1) {
         int var4 = class202.method3839(var1, (byte)102).field3749;
         if (var4 == 1) {
            var0.field1183 = 0;
            var0.field1184 = 0;
            var0.field1164 = var2;
            var0.field1186 = 0;
         }

         if (var4 == 2) {
            var0.field1186 = 0;
         }
      } else if (var1 == -1 || var0.field1182 == -1 || class202.method3839(var1, (byte)118).field3757 >= class202.method3839(var0.field1182, (byte)121).field3757) {
         var0.field1182 = var1;
         var0.field1183 = 0;
         var0.field1184 = 0;
         var0.field1164 = var2;
         var0.field1186 = 0;
         var0.field1194 = var0.field1204;
      }

   }
}

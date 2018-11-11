public class class237 {
   static int[] field2771 = new int[32];
   public static int[] field2772;
   public static int[] field2770;
   static int field2769;

   public static boolean method4377(byte var0) {
      return client.field1023 >= 2;
   }

   static boolean method4379(byte var0) {
      return (client.field975 & 8) != 0;
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2771[var1] = var0 - 1;
         var0 += var0;
      }

      field2772 = new int[2000];
      field2770 = new int[2000];
   }
}

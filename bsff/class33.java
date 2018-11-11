import java.io.IOException;

public final class class33 {
   static class307 field443;
   static class261 field441;
   int[] field444 = new int[4096];

   final int method376(int var1, int var2, int var3) {
      return this.field444[var1 * 64 + var2];
   }

   final void method377(class44 var1, int var2) {
      for(int var3 = 0; var3 < 64; ++var3) {
         for(int var4 = 0; var4 < 64; ++var4) {
            this.field444[var3 * 64 + var4] = var1.method659(var3, var4, (byte)98) | -16777216;
         }
      }

   }

   static void method385(String var0, String var1, String var2, int var3) {
      class90.field1371 = var0;
      class90.field1358 = var1;
      class90.field1343 = var2;
   }

   static final void method384(int var0) {
      if (class130.field1824 != null) {
         class130.field1824.method2222(-542446473);
      }

      if (class73.field852 != null) {
         class73.field852.method2222(-121270707);
      }

   }

   static final void method379(int var0, byte var1) {
      if (var0 >= 0) {
         int var2 = client.field993[var0];
         int var3 = client.field994[var0];
         int var4 = client.field871[var0];
         int var5 = client.field996[var0];
         String var6 = client.field997[var0];
         String var7 = client.field998[var0];
         class177.method3409(var2, var3, var4, var5, var6, var7, class60.field711, class60.field710, -590715707);
      }

   }

   public static byte[] method378(int var0) {
      byte[] var1 = new byte[24];

      try {
         class167.field2204.method2505(0L);
         class167.field2204.method2506(var1, 93647544);

         int var2;
         for(var2 = 0; var2 < 24 && var1[var2] == 0; ++var2) {
            ;
         }

         if (var2 >= 24) {
            throw new IOException();
         }
      } catch (Exception var4) {
         for(int var3 = 0; var3 < 24; ++var3) {
            var1[var3] = -1;
         }
      }

      return var1;
   }
}

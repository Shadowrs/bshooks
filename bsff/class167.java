import java.io.File;

public class class167 {
   public static class121 field2204 = null;
   public static File field2206;
   public static class121 field2211 = null;
   public static class121 field2212 = null;
   public static class121[] field2213;
   public static String[] field2214;
   static File field2205;

   static final void method3256(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[] var8 = class137.method2929(var0, var1, var2);
      int[] var9 = class137.method2929(var3, var4, var5);
      class327.method5754(var8[0], var8[1], var9[0], var9[1], var6);
   }

   static final boolean method3248(class242 var0, byte var1) {
      if (var0.field2927 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.field2927.length; ++var2) {
            int var3 = class47.method713(var0, var2, 1673032722);
            int var4 = var0.field2928[var2];
            if (var0.field2927[var2] == 2) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var0.field2927[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var0.field2927[var2] == 4) {
               if (var4 == var3) {
                  return false;
               }
            } else if (var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   public static void method3254(class261 var0, int var1) {
      class279.field3549 = var0;
   }

   static void method3253(byte[] var0, int var1, int var2) {
      if (client.field896 == null) {
         client.field896 = new byte[24];
      }

      class205.method3845(var0, var1, client.field896, 0, 24);
   }
}

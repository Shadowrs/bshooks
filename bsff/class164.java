import java.applet.Applet;

public class class164 extends RuntimeException {
   public static class79 field2182;
   public static int field2179;
   public static Applet field2178;
   static class172 field2177;
   public static String field2176;
   static byte[][][] field2183;
   static int[] field2181;
   String field2184;
   Throwable field2180;

   static boolean method3229(CharSequence var0, int var1, boolean var2, int var3) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (var8 == 0) {
               if (var9 == '-') {
                  var4 = true;
                  continue;
               }

               if (var9 == '+') {
                  continue;
               }
            }

            int var10;
            if (var9 >= '0' && var9 <= '9') {
               var10 = var9 - 48;
            } else if (var9 >= 'A' && var9 <= 'Z') {
               var10 = var9 - 55;
            } else {
               if (var9 < 'a' || var9 > 'z') {
                  return false;
               }

               var10 = var9 - 87;
            }

            if (var10 >= var1) {
               return false;
            }

            if (var4) {
               var10 = -var10;
            }

            int var11 = var6 * var1 + var10;
            if (var11 / var1 != var6) {
               return false;
            }

            var6 = var11;
            var5 = true;
         }

         return var5;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   public static final void method3228(String var0, String var1, int var2, int var3, int var4, int var5, byte var6) {
      boolean var7 = false;
      if (!client.field991 && client.field992 < 500) {
         client.field997[client.field992] = var0;
         client.field998[client.field992] = var1;
         client.field871[client.field992] = var2;
         client.field996[client.field992] = var3;
         client.field993[client.field992] = var4;
         client.field994[client.field992] = var5;
         client.field999[client.field992] = var7;
         ++client.field992;
      }

   }
}

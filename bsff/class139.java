import java.io.File;
import java.io.IOException;

public abstract class class139 extends class218 {
   static class263 field2043;
   public int field2042 = 1000;

   protected class131 vmethod3067(byte var1) {
      return null;
   }

   void vmethod3066(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class131 var10 = this.vmethod3067((byte)-65);
      if (var10 != null) {
         this.field2042 = var10.field2042;
         var10.vmethod3066(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   public static class122 method3072(String var0, String var1, boolean var2, int var3) {
      File var4 = new File(class167.field2206, "preferences" + var0 + ".dat");
      if (var4.exists()) {
         try {
            class122 var12 = new class122(var4, "rw", 10000L);
            return var12;
         } catch (IOException var11) {
            ;
         }
      }

      String var5 = "";
      if (class74.field1146 == 33) {
         var5 = "_rc";
      } else if (class74.field1146 == 34) {
         var5 = "_wip";
      }

      File var6 = new File(class22.field327, "battlescape/oldschool/jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      class122 var7;
      if (!var2 && var6.exists()) {
         try {
            var7 = new class122(var6, "rw", 10000L);
            return var7;
         } catch (IOException var10) {
            ;
         }
      }

      try {
         var7 = new class122(var4, "rw", 10000L);
         return var7;
      } catch (IOException var9) {
         var9.printStackTrace();
         throw new RuntimeException();
      }
   }

   static final String method3069(int var0, byte var1) {
      return var0 < 999999999 ? Integer.toString(var0) : "*";
   }
}

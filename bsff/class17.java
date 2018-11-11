import java.util.Comparator;

final class class17 implements Comparator {
   public static boolean field297;
   public static class261 field295;
   public static class261 field299;
   static int field294;

   int method126(class14 var1, class14 var2, int var3) {
      return var1.field274.field290 < var2.field274.field290 ? -1 : (var2.field274.field290 == var1.field274.field290 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method126((class14)var1, (class14)var2, 215643968);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static int method139(String var0, int var1) {
      return var0.length() + 2;
   }

   static final void method138(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (class305.method5452(var0, -1009820586)) {
         client.field1095 = null;
         class271.method4784(class189.field2519[var0], -1, var1, var2, var3, var4, var5, var6, var7, -1723704151);
         if (client.field1095 != null) {
            class271.method4784(client.field1095, -1412584499, var1, var2, var3, var4, class42.field537, class109.field1582, var7, -1785478948);
            client.field1095 = null;
         }
      } else if (var7 != -1) {
         client.field1060[var7] = true;
      } else {
         for(int var9 = 0; var9 < 100; ++var9) {
            client.field1060[var9] = true;
         }
      }

   }

   public static void method140(int var0) {
      class242.field2808.method3933();
      class242.field2809.method3933();
      class242.field2810.method3933();
      class242.field2858.method3933();
   }

   public static void method128(class261 var0, int var1) {
      class280.field3553 = var0;
   }
}

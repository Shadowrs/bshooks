import java.awt.Image;

public class class24 {
   static Image field348;
   public static class24 field347 = new class24("SMALL", 0, 0, 4);
   public static class24 field346 = new class24("MEDIUM", 2, 1, 2);
   public static class24 field344 = new class24("LARGE", 1, 2, 0);
   static int[] field350;
   static int[][] field343;
   int field342;
   String field345;
   int field349;
   int field352;

   class24(String var1, int var2, int var3, int var4) {
      this.field345 = var1;
      this.field349 = var2;
      this.field352 = var3;
      this.field342 = var4;
   }

   boolean method192(float var1, byte var2) {
      return var1 >= (float)this.field342;
   }

   static class331 method194(int var0, int var1, int var2, int var3) {
      class213 var4 = class35.field470;
      long var5 = (long)(var2 << 16 | var0 << 8 | var1);
      return (class331)var4.method3945(var5);
   }

   static void method191(class242 var0, int var1, int var2, boolean var3, byte var4) {
      int var5 = var0.field2826;
      int var6 = var0.field2887;
      if (var0.field2821 == 0) {
         var0.field2826 = var0.field2825;
      } else if (var0.field2821 == 1) {
         var0.field2826 = var1 - var0.field2825;
      } else if (var0.field2821 == 2) {
         var0.field2826 = var0.field2825 * var1 >> 14;
      }

      if (var0.field2822 == 0) {
         var0.field2887 = var0.field2889;
      } else if (var0.field2822 == 1) {
         var0.field2887 = var2 - var0.field2889;
      } else if (var0.field2822 == 2) {
         var0.field2887 = var2 * var0.field2889 >> 14;
      }

      if (var0.field2821 == 4) {
         var0.field2826 = var0.field2901 * var0.field2887 / var0.field2892;
      }

      if (var0.field2822 == 4) {
         var0.field2887 = var0.field2826 * var0.field2892 / var0.field2901;
      }

      if (var0.field2818 == 1337) {
         client.field1026 = var0;
      }

      if (var3 && var0.field2894 != null && (var5 != var0.field2826 || var6 != var0.field2887)) {
         class68 var7 = new class68();
         var7.field780 = var0;
         var7.field782 = var0.field2894;
         client.field1054.method4020(var7);
      }

   }

   static class24 method199(int var0, int var1) {
      class24[] var2 = new class24[]{field347, field346, field344};
      class24[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class24 var5 = var3[var4];
         if (var0 == var5.field352) {
            return var5;
         }
      }

      return null;
   }
}

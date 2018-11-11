public class class4 implements class200 {
   static class4 field31 = new class4(0, 0, Integer.class, new class2());
   static class4 field23 = new class4(2, 1, Long.class, new class3());
   static class4 field25 = new class4(1, 2, String.class, new class5());
   static int field28;
   static int[] field30;
   int field27;
   int field26;

   class4(int var1, int var2, Class var3, class0 var4) {
      this.field26 = var1;
      this.field27 = var2;
   }

   public int vmethod5837(int var1) {
      return this.field27;
   }

   static final void method11(class242[] var0, int var1, int var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class242 var4 = var0[var3];
         if (var4 != null && var4.field2885 == var1 && (!var4.field2813 || !class157.method3183(var4, 2109845745))) {
            if (var4.field2850 == 0) {
               if (!var4.field2813 && class157.method3183(var4, 2089600073) && var4 != class238.field2775) {
                  continue;
               }

               method11(var0, var4.field2814, -974304014);
               if (var4.field2938 != null) {
                  method11(var4.field2938, var4.field2814, -974304014);
               }

               class67 var5 = (class67)client.field1017.method3981((long)var4.field2814);
               if (var5 != null) {
                  class181.method3422(var5.field773, (byte)-62);
               }
            }

            if (var4.field2850 == 6) {
               int var8;
               if (var4.field2831 != -1 || var4.field2862 != -1) {
                  boolean var6 = class167.method3248(var4, (byte)112);
                  if (var6) {
                     var8 = var4.field2862;
                  } else {
                     var8 = var4.field2831;
                  }

                  if (var8 != -1) {
                     class287 var7 = class202.method3839(var8, (byte)84);

                     for(var4.field2806 += client.field893; var4.field2806 > var7.field3763[var4.field2837]; class30.method274(var4, -951763546)) {
                        var4.field2806 -= var7.field3763[var4.field2837];
                        ++var4.field2837;
                        if (var4.field2837 >= var7.field3750.length) {
                           var4.field2837 -= var7.field3754;
                           if (var4.field2837 < 0 || var4.field2837 >= var7.field3750.length) {
                              var4.field2837 = 0;
                           }
                        }
                     }
                  }
               }

               if (var4.field2906 != 0 && !var4.field2813) {
                  int var9 = var4.field2906 >> 16;
                  var8 = var4.field2906 << 16 >> 16;
                  var9 *= client.field893;
                  var8 *= client.field893;
                  var4.field2865 = var9 + var4.field2865 & 2047;
                  var4.field2866 = var8 + var4.field2866 & 2047;
                  class30.method274(var4, 45672929);
               }
            }
         }
      }

   }

   public static String method13(class194 var0, int var1, int var2) {
      try {
         int var3 = var0.getUSmart(877489472);
         if (var3 > var1) {
            var3 = var1;
         }

         byte[] var4 = new byte[var3];
         var0.field2565 += class313.field3907.method3444(var0.field2566, var0.field2565, var4, 0, var3, 1420059126);
         String var5 = class176.method3392(var4, 0, var3, (byte)56);
         return var5;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }

   static final void method8(int var0, int var1, int var2, int var3, class331 var4, class236 var5, int var6) {
      if (var4 != null) {
         int var7 = client.field925 & 2047;
         int var8 = var3 * var3 + var2 * var2;
         if (var8 <= 6400) {
            int var9 = class134.field1955[var7];
            int var10 = class134.field1933[var7];
            int var11 = var10 * var2 + var3 * var9 >> 16;
            int var12 = var3 * var10 - var9 * var2 >> 16;
            if (var8 > 2500) {
               var4.method5885(var11 + var5.field2765 / 2 - var4.field3982 / 2, var5.field2763 / 2 - var12 - var4.field3984 / 2, var0, var1, var5.field2765, var5.field2763, var5.field2766, var5.field2768);
            } else {
               var4.method5865(var0 + var11 + var5.field2765 / 2 - var4.field3982 / 2, var5.field2763 / 2 + var1 - var12 - var4.field3984 / 2);
            }
         }
      }

   }

   static final int method12(int var0, int var1, int var2) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }
}

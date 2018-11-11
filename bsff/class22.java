public class class22 extends class28 {
   public static String field327;

   void method176(class194 var1, class194 var2, int var3) {
      int var4 = var2.getUByte(1489864795);
      if (var4 != class37.field481.field483) {
         throw new IllegalStateException("");
      } else {
         super.field392 = var2.getUByte(-1024415932);
         super.field391 = var2.getUByte(1513622690);
         super.field390 = var2.getUShort(-1208216487);
         super.field387 = var2.getUShort(-1208216487);
         super.field386 = var2.getUShort(-1208216487);
         super.field389 = var2.getUShort(-1208216487);
         super.field391 = Math.min(super.field391, 4);
         super.field388 = new short[1][64][64];
         super.field393 = new short[super.field391][64][64];
         super.field394 = new byte[super.field391][64][64];
         super.field395 = new byte[super.field391][64][64];
         super.field396 = new class31[super.field391][64][64][];
         if (var1.field2566.length != 0) {
            var4 = var1.getUByte(-363147139);
            if (var4 != class36.field477.field474) {
               throw new IllegalStateException("");
            } else {
               int var5 = var1.getUByte(1109575663);
               int var6 = var1.getUByte(-721141194);
               if (var5 == super.field386 && var6 == super.field389) {
                  for(int var7 = 0; var7 < 64; ++var7) {
                     for(int var8 = 0; var8 < 64; ++var8) {
                        this.method241(var7, var8, var1, -668155890);
                     }
                  }

               } else {
                  throw new IllegalStateException("");
               }
            }
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class22)) {
         return false;
      } else {
         class22 var2 = (class22)var1;
         return super.field386 == var2.field386 && var2.field389 == super.field389;
      }
   }

   public int hashCode() {
      return super.field386 | super.field389 << 8;
   }

   static String method186(int var0, byte var1) {
      return "<img=" + var0 + ">";
   }

   static final int method184(int var0, int var1, int var2, int var3) {
      int var4 = var0 / var2;
      int var5 = var0 & var2 - 1;
      int var6 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var8 = class44.method649(var4, var6, -1758857283);
      int var9 = class44.method649(var4 + 1, var6, -1758857283);
      int var10 = class44.method649(var4, var6 + 1, -1758857283);
      int var11 = class44.method649(var4 + 1, var6 + 1, -1758857283);
      int var12 = 65536 - class134.field1933[var5 * 1024 / var2] >> 1;
      int var13 = ((65536 - var12) * var8 >> 16) + (var9 * var12 >> 16);
      int var14 = 65536 - class134.field1933[var5 * 1024 / var2] >> 1;
      int var15 = ((65536 - var14) * var10 >> 16) + (var14 * var11 >> 16);
      int var16 = 65536 - class134.field1933[var7 * 1024 / var2] >> 1;
      int var17 = ((65536 - var16) * var13 >> 16) + (var16 * var15 >> 16);
      return var17;
   }

   static int method185(int var0, class96 var1, boolean var2, byte var3) {
      class242 var4 = var2 ? class336.field4073 : class61.field713;
      if (var0 == 1700) {
         class81.field1272[++class135.field1964 - 1] = var4.field2934;
         return 1;
      } else if (var0 == 1701) {
         if (var4.field2934 != -1) {
            class81.field1272[++class135.field1964 - 1] = var4.field2935;
         } else {
            class81.field1272[++class135.field1964 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         class81.field1272[++class135.field1964 - 1] = var4.field2815;
         return 1;
      } else {
         return 2;
      }
   }

   static final void method187(int var0, int var1, int var2) {
      if (client.field874 == 2) {
         class72.method1182((client.field1078 - class184.field2498 << 7) + client.field1014, (client.field878 - class4.field28 << 7) + client.field1123, client.field1074 * 2, (byte)75);
         if (client.field954 > -1 && client.field866 % 20 < 10) {
            class47.field569[0].method5865(var0 + client.field954 - 12, client.field864 + var1 - 28);
         }
      }

   }
}

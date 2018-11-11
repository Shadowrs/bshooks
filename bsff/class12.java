import java.util.Comparator;

final class class12 implements Comparator {
   static class72 field259;
   public static class110 field260;
   static int field263;
   static class331[] field257;
   static int field261;

   int method80(class14 var1, class14 var2, int var3) {
      return var1.field273 < var2.field273 ? -1 : (var2.field273 == var1.field273 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method80((class14)var1, (class14)var2, -645015399);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static class270 method81(int var0, int var1) {
      class270 var2 = (class270)class270.field3474.method3929((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class270.field3473.method4551(19, var0, 1686957905);
         var2 = new class270();
         if (var3 != null) {
            var2.method4774(new class194(var3), -719711696);
         }

         class270.field3474.method3932(var2, (long)var0);
         return var2;
      }
   }

   static final void method82(int var0, int var1, int var2) {
      class217 var3 = client.field983[class237.field2769][var0][var1];
      if (var3 == null) {
         class308.field3867.method2897(class237.field2769, var0, var1);
      } else {
         long var4 = -99999999L;
         class92 var6 = null;

         class92 var7;
         for(var7 = (class92)var3.method4027(); var7 != null; var7 = (class92)var3.method4026()) {
            class283 var8 = class146.method3099(var7.field1404, (byte)125);
            long var9 = (long)var8.field3656;
            if (var8.field3665 == 1) {
               var9 *= (long)(var7.field1405 + 1);
            }

            if (var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if (var6 == null) {
            class308.field3867.method2897(class237.field2769, var0, var1);
         } else {
            var3.method4021(var6);
            class92 var11 = null;
            class92 var12 = null;

            for(var7 = (class92)var3.method4027(); var7 != null; var7 = (class92)var3.method4026()) {
               if (var6.field1404 != var7.field1404) {
                  if (var11 == null) {
                     var11 = var7;
                  }

                  if (var7.field1404 != var11.field1404 && var12 == null) {
                     var12 = var7;
                  }
               }
            }

            int var10 = var0 + (var1 << 7) + 1610612736;
            class308.field3867.method2883(class237.field2769, var0, var1, class5.method16(var0 * 128 + 64, var1 * 128 + 64, class237.field2769, -1453085921), var6, var10, var11, var12);
         }
      }

   }

   static void method75(String var0, boolean var1, int var2) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < class20.field319; ++var5) {
         class283 var6 = class146.method3099(var5, (byte)103);
         if ((!var1 || var6.field3651) && var6.field3676 == -1 && var6.field3644.toLowerCase().indexOf(var0) != -1) {
            if (var4 >= 250) {
               class127.field1789 = -1;
               class23.field340 = null;
               return;
            }

            if (var4 >= var3.length) {
               short[] var7 = new short[var3.length * 2];

               for(int var8 = 0; var8 < var4; ++var8) {
                  var7[var8] = var3[var8];
               }

               var3 = var7;
            }

            var3[var4++] = (short)var5;
         }
      }

      class23.field340 = var3;
      class78.field1243 = 0;
      class127.field1789 = var4;
      String[] var9 = new String[class127.field1789];

      for(int var10 = 0; var10 < class127.field1789; ++var10) {
         var9[var10] = class146.method3099(var3[var10], (byte)32).field3644;
      }

      class173.method3341(var9, class23.field340, 1682574293);
   }
}

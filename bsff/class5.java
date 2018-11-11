final class class5 implements class0 {
   static long field35;
   static int[] field34;

   static final byte[] method14(byte[] var0, int var1) {
      class194 var2 = new class194(var0);
      int var3 = var2.getUByte(-1115045247);
      int var4 = var2.getInt(-1817376731);
      if (var4 >= 0 && (class261.field3383 == 0 || var4 <= class261.field3383)) {
         if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.getBytes(var7, 0, var4, 269090564);
            return var7;
         } else {
            int var5 = var2.getInt(-1817376731);
            if (var5 < 0 || var5 > 16000000 || class261.field3383 != 0 && var5 > class261.field3383) {
               return new byte[1];
            } else {
               byte[] var6 = new byte[var5];
               if (var3 == 1) {
                  class188.method3460(var6, var5, var0, var4, 9);
               } else {
                  class261.field3379.method3454(var2, var6, 271625445);
               }

               return var6;
            }
         }
      } else {
         return new byte[1];
      }
   }

   static final int method16(int var0, int var1, int var2, int var3) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var2;
         if (var2 < 3 && (class62.field720[1][var4][var5] & 2) == 2) {
            var6 = var2 + 1;
         }

         int var7 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = class62.field728[var6][var4 + 1][var5] * var7 + (128 - var7) * class62.field728[var6][var4][var5] >> 7;
         int var10 = class62.field728[var6][var4][var5 + 1] * (128 - var7) + var7 * class62.field728[var6][var4 + 1][var5 + 1] >> 7;
         return var8 * var10 + var9 * (128 - var8) >> 7;
      } else {
         return 0;
      }
   }

   static final void method15(class201 var0, short var1) {
      var0.method3793((byte)-59);
      int var2 = client.field1000;
      class72 var3 = class12.field259 = client.field971[var2] = new class72();
      var3.field843 = var2;
      int var4 = var0.getBits(30, 128205369);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.field1188[0] = var6 - class184.field2498;
      var3.field1185 = (var3.field1188[0] << 7) + (var3.method1168(1344122807) << 6);
      var3.field1206[0] = var7 - class4.field28;
      var3.field1209 = (var3.field1206[0] << 7) + (var3.method1168(1525688576) << 6);
      class237.field2769 = var3.field842 = var5;
      if (class93.field1413[var2] != null) {
         var3.method1140(class93.field1413[var2], -2010554176);
      }

      class93.field1414 = 0;
      class93.field1415[++class93.field1414 - 1] = var2;
      class93.field1411[var2] = 0;
      class93.field1416 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var8 != var2) {
            int var9 = var0.getBits(18, 1039836744);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            class93.field1420[var8] = (var11 << 14) + var12 + (var10 << 28);
            class93.field1419[var8] = 0;
            class93.field1412[var8] = -1;
            class93.field1418[++class93.field1416 - 1] = var8;
            class93.field1411[var8] = 0;
         }
      }

      var0.method3795(831892280);
   }
}

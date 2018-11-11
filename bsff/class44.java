public class class44 {
   static class263 field549;
   static class263 field552;
   static class263 field548;
   static class330[] field545;
   int field540;
   int field541;
   int[][] field542;
   int[][] field544;
   int[][] field543;
   int[][] field547;

   class44(int var1, int var2) {
      this.field540 = var1;
      this.field541 = var2;
      this.field542 = new int[var1][var2];
      this.field543 = new int[var1][var2];
      this.field544 = new int[var1][var2];
      this.field547 = new int[var1][var2];
   }

   int method659(int var1, int var2, byte var3) {
      if (var1 >= 0 && var2 >= 0 && var1 < this.field540 && var2 < this.field541) {
         if (this.field544[var1][var2] == 0) {
            return 0;
         } else {
            int var4 = this.field542[var1][var2] / this.field547[var1][var2];
            int var5 = this.field543[var1][var2] / this.field547[var1][var2];
            int var6 = this.field544[var1][var2] / this.field547[var1][var2];
            return class269.method4771((double)var4 / 256.0D, (double)var5 / 256.0D, (double)var6 / 256.0D);
         }
      } else {
         return 0;
      }
   }

   void method650(int var1, int var2, int var3, class273 var4, int var5) {
      if (var4 != null && var3 + var1 >= 0 && var3 + var2 >= 0 && var1 - var3 <= this.field540 && var2 - var3 <= this.field541) {
         int var6 = Math.max(0, var1 - var3);
         int var7 = Math.min(this.field540, var3 + var1);
         int var8 = Math.max(0, var2 - var3);
         int var9 = Math.min(this.field541, var3 + var2);

         for(int var10 = var6; var10 < var7; ++var10) {
            for(int var11 = var8; var11 < var9; ++var11) {
               this.field542[var10][var11] += var4.field3499 * 256 / var4.field3504;
               this.field543[var10][var11] += var4.field3501;
               this.field544[var10][var11] += var4.field3503;
               ++this.field547[var10][var11];
            }
         }
      }

   }

   public static class200 method660(class200[] var0, int var1, int var2) {
      class200[] var3 = var0;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class200 var5 = var3[var4];
         if (var1 == var5.vmethod5837(-1780726447)) {
            return var5;
         }
      }

      return null;
   }

   static final void method658(class67 var0, boolean var1, int var2) {
      int var3 = var0.field773;
      int var4 = (int)var0.field2644;
      var0.method4014();
      if (var1 && var3 != -1 && class314.field3913[var3]) {
         class17.field295.method4566(var3, (byte)79);
         if (class189.field2519[var3] != null) {
            boolean var5 = true;

            for(int var6 = 0; var6 < class189.field2519[var3].length; ++var6) {
               if (class189.field2519[var3][var6] != null) {
                  if (class189.field2519[var3][var6].field2850 != 2) {
                     class189.field2519[var3][var6] = null;
                  } else {
                     var5 = false;
                  }
               }
            }

            if (var5) {
               class189.field2519[var3] = null;
            }

            class314.field3913[var3] = false;
         }
      }

      class233.method4333(var3, 417274940);
      class242 var7 = class3.method2(var4, 2057904345);
      if (var7 != null) {
         class30.method274(var7, 31986976);
      }

      class10.method62((byte)85);
      if (client.field1016 != -1) {
         class193.method3500(client.field1016, 1, (byte)53);
      }

   }

   static final void method661(class75 var0, int var1) {
      if (var0.field1197 == client.field866 || var0.field1182 == -1 || var0.field1164 != 0 || var0.field1184 + 1 > class202.method3839(var0.field1182, (byte)104).field3763[var0.field1183]) {
         int var2 = var0.field1197 - var0.field1196;
         int var3 = client.field866 - var0.field1196;
         int var4 = var0.field1192 * 128 + var0.field1153 * 64;
         int var5 = var0.field1202 * 128 + var0.field1153 * 64;
         int var6 = var0.field1193 * 128 + var0.field1153 * 64;
         int var7 = var0.field1178 * 128 + var0.field1153 * 64;
         var0.field1185 = (var6 * var3 + var4 * (var2 - var3)) / var2;
         var0.field1209 = (var3 * var7 + var5 * (var2 - var3)) / var2;
      }

      var0.field1208 = 0;
      var0.field1201 = var0.field1198;
      var0.field1151 = var0.field1201;
   }

   public static class330 method654(class261 var0, String var1, String var2, byte var3) {
      int var4 = var0.method4606(var1, 1096519029);
      int var5 = var0.method4568(var4, var2, (short)-1107);
      class330 var6;
      if (!class288.method5204(var0, var4, var5, (byte)17)) {
         var6 = null;
      } else {
         var6 = class62.method1088((byte)-32);
      }

      return var6;
   }

   static final int method649(int var0, int var1, int var2) {
      int var3 = class109.method2260(var0 - 1, var1 - 1, -593472705) + class109.method2260(var0 + 1, var1 - 1, -593472705) + class109.method2260(var0 - 1, var1 + 1, -593472705) + class109.method2260(var0 + 1, var1 + 1, -593472705);
      int var4 = class109.method2260(var0 - 1, var1, -593472705) + class109.method2260(1 + var0, var1, -593472705) + class109.method2260(var0, var1 - 1, -593472705) + class109.method2260(var0, var1 + 1, -593472705);
      int var5 = class109.method2260(var0, var1, -593472705);
      return var3 / 16 + var4 / 8 + var5 / 4;
   }
}

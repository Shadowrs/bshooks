public final class class82 extends class139 {
   static class260 field1294;
   static String field1292;
   int field1282;
   boolean field1283 = false;
   int field1290 = 0;
   int field1289 = 0;
   class287 field1288;
   int field1284;
   int field1285;
   int field1286;
   int field1293;
   int field1287;

   class82(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1282 = var1;
      this.field1284 = var2;
      this.field1285 = var3;
      this.field1286 = var4;
      this.field1293 = var5;
      this.field1287 = var7 + var6;
      int var8 = class249.method4518(this.field1282, -2061278090).field3494;
      if (var8 != -1) {
         this.field1283 = false;
         this.field1288 = class202.method3839(var8, (byte)46);
      } else {
         this.field1283 = true;
      }

   }

   protected final class131 vmethod3067(byte var1) {
      class272 var2 = class249.method4518(this.field1282, -1873739539);
      class131 var3;
      if (!this.field1283) {
         var3 = var2.method4795(this.field1289, -1815529613);
      } else {
         var3 = var2.method4795(-1, -379551321);
      }

      return var3 == null ? null : var3;
   }

   final void method1804(int var1, byte var2) {
      if (!this.field1283) {
         this.field1290 += var1;

         while(this.field1290 > this.field1288.field3763[this.field1289]) {
            this.field1290 -= this.field1288.field3763[this.field1289];
            ++this.field1289;
            if (this.field1289 >= this.field1288.field3750.length) {
               this.field1283 = true;
               break;
            }
         }
      }

   }

   public static String method1798(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            char var4;
            StringBuilder var8;
            for(var8 = new StringBuilder(var2); var0 != 0L; var8.append(var4)) {
               long var5 = var0;
               var0 /= 37L;
               var4 = class316.field3922[(int)(var5 - var0 * 37L)];
               if (var4 == '_') {
                  int var7 = var8.length() - 1;
                  var8.setCharAt(var7, Character.toUpperCase(var8.charAt(var7)));
                  var4 = '\u00a0';
               }
            }

            var8.reverse();
            var8.setCharAt(0, Character.toUpperCase(var8.charAt(0)));
            return var8.toString();
         }
      } else {
         return null;
      }
   }

   static class284[] method1805(int var0) {
      return new class284[]{class284.field3694, class284.field3690, class284.field3691};
   }

   static int method1797(int var0, class96 var1, boolean var2, int var3) {
      class242 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class3.method2(class81.field1272[--class135.field1964], 2109310838);
      } else {
         var4 = var2 ? class336.field4073 : class61.field713;
      }

      if (var0 == 1927) {
         if (class81.field1278 >= 10) {
            throw new RuntimeException();
         } else if (var4.field2894 == null) {
            return 0;
         } else {
            class68 var5 = new class68();
            var5.field780 = var4;
            var5.field782 = var4.field2894;
            var5.field788 = class81.field1278 + 1;
            client.field1054.method4020(var5);
            return 1;
         }
      } else {
         return 2;
      }
   }
}

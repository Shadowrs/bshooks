public final class class74 extends class216 {
   public static int field1146;
   static class263 field1147;
   static class330[] field1144;
   static int field1145;
   int field1143 = 0;
   int field1136 = -1;
   int field1137;
   int field1139;
   int field1134;
   int field1135;
   int field1148;
   int field1140;
   int field1138;
   int field1133;
   int field1142;
   int field1141;

   public static class172 method1581(byte var0) {
      try {
         return new class161();
      } catch (Throwable var2) {
         return new class162();
      }
   }

   static int method1582(int var0, class96 var1, boolean var2, int var3) {
      class242 var4 = class3.method2(class81.field1272[--class135.field1964], 2104335828);
      if (var0 == 2800) {
         int[] var9 = class81.field1272;
         int var6 = ++class135.field1964 - 1;
         int var7 = class45.method662(var4, 2128881965);
         int var8 = var7 >> 11 & 63;
         var9[var6] = var8;
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var4.field2882 == null) {
               class81.field1281[++class77.field1233 - 1] = "";
            } else {
               class81.field1281[++class77.field1233 - 1] = var4.field2882;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class81.field1272[--class135.field1964];
         --var5;
         if (var4.field2888 != null && var5 < var4.field2888.length && var4.field2888[var5] != null) {
            class81.field1281[++class77.field1233 - 1] = var4.field2888[var5];
         } else {
            class81.field1281[++class77.field1233 - 1] = "";
         }

         return 1;
      }
   }
}

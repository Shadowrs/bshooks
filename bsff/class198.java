public abstract class class198 {
   static boolean field2592 = false;

   abstract byte[] vmethod3763(int var1);

   abstract void vmethod3771(byte[] var1, byte var2);

   public static int method3755(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var7 + var1);
         if ((var8 <= 0 || var8 >= '\u0080') && (var8 < '\u00a0' || var8 > '\u00ff')) {
            if (var8 == '\u20ac') {
               var3[var7 + var4] = -128;
            } else if (var8 == '\u201a') {
               var3[var7 + var4] = -126;
            } else if (var8 == '\u0192') {
               var3[var7 + var4] = -125;
            } else if (var8 == '\u201e') {
               var3[var7 + var4] = -124;
            } else if (var8 == '\u2026') {
               var3[var7 + var4] = -123;
            } else if (var8 == '\u2020') {
               var3[var7 + var4] = -122;
            } else if (var8 == '\u2021') {
               var3[var7 + var4] = -121;
            } else if (var8 == '\u02c6') {
               var3[var7 + var4] = -120;
            } else if (var8 == '\u2030') {
               var3[var7 + var4] = -119;
            } else if (var8 == '\u0160') {
               var3[var7 + var4] = -118;
            } else if (var8 == '\u2039') {
               var3[var7 + var4] = -117;
            } else if (var8 == '\u0152') {
               var3[var7 + var4] = -116;
            } else if (var8 == '\u017d') {
               var3[var7 + var4] = -114;
            } else if (var8 == '\u2018') {
               var3[var7 + var4] = -111;
            } else if (var8 == '\u2019') {
               var3[var7 + var4] = -110;
            } else if (var8 == '\u201c') {
               var3[var7 + var4] = -109;
            } else if (var8 == '\u201d') {
               var3[var7 + var4] = -108;
            } else if (var8 == '\u2022') {
               var3[var7 + var4] = -107;
            } else if (var8 == '\u2013') {
               var3[var7 + var4] = -106;
            } else if (var8 == '\u2014') {
               var3[var7 + var4] = -105;
            } else if (var8 == '\u02dc') {
               var3[var7 + var4] = -104;
            } else if (var8 == '\u2122') {
               var3[var7 + var4] = -103;
            } else if (var8 == '\u0161') {
               var3[var7 + var4] = -102;
            } else if (var8 == '\u203a') {
               var3[var7 + var4] = -101;
            } else if (var8 == '\u0153') {
               var3[var7 + var4] = -100;
            } else if (var8 == '\u017e') {
               var3[var7 + var4] = -98;
            } else if (var8 == '\u0178') {
               var3[var7 + var4] = -97;
            } else {
               var3[var7 + var4] = 63;
            }
         } else {
            var3[var7 + var4] = (byte)var8;
         }
      }

      return var6;
   }

   public static void method3757(class68 var0, int var1, boolean var2) {
      var2 = false;
      if (var2) {
         System.out.println("Start: " + var1);
      }

      class23.method188(var0, 500000, (byte)1, var2);
      if (var2) {
         System.out.println("End");
      }

   }

   static void method3773(class331 var0, int var1, int var2, int var3, int var4) {
      class213 var5 = class35.field470;
      long var6 = (long)(var3 << 16 | var1 << 8 | var2);
      var5.method3943(var0, var6, var0.field3986.length * 4);
   }

   static void method3767(boolean var0, int var1) {
      class90.field1371 = "";
      class90.field1358 = "Enter your username/email & password.";
      class90.field1343 = "";
      class90.field1355 = 2;
      if (var0) {
         class90.field1350 = "";
      }

      if (class90.field1374 == null || class90.field1374.length() <= 0) {
         if (class46.field564.field1234 != null) {
            class90.field1374 = class46.field564.field1234;
            class90.field1361 = true;
         } else {
            class90.field1361 = false;
         }
      }

      class25.method200(1929042985);
   }

   static final int method3756(int var0) {
      if (class46.field564.field1236) {
         return class237.field2769;
      } else {
         int var1 = class5.method16(class287.field3766, class98.field1468, class237.field2769, -1453085921);
         return var1 - class269.field3472 < 800 && (class62.field720[class237.field2769][class287.field3766 >> 7][class98.field1468 >> 7] & 4) != 0 ? class237.field2769 : 3;
      }
   }
}

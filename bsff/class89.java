public class class89 implements class200 {
   static class89 field1336 = new class89(0);
   static class89 field1332 = new class89(1);
   static class89 field1331 = new class89(2);
   static class89 field1334 = new class89(3);
   static int[] field1333;
   int field1335;

   class89(int var1) {
      this.field1335 = var1;
   }

   public int vmethod5837(int var1) {
      return this.field1335;
   }

   static void method1859(int var0, int var1) {
      client.field1068 = 0L;
      if (var0 >= 2) {
         client.field1069 = true;
      } else {
         client.field1069 = false;
      }

      int var2 = client.field1069 ? 2 : 1;
      if (var2 == 1) {
         class9.field239.method899(765, 503, (byte)33);
      } else {
         class9.field239.method899(7680, 2160, (byte)71);
      }

      if (client.field872 >= 25) {
         class256.method4535((byte)61);
      }

   }

   static final void method1860(class201 var0, int var1) {
      for(int var2 = 0; var2 < class93.field1421; ++var2) {
         int var3 = class93.field1422[var2];
         class72 var4 = client.field971[var3];
         int var5 = var0.getUByte(-1734633317);
         if ((var5 & 32) != 0) {
            var5 += var0.getUByte(1552137987) << 8;
         }

         class267.method4730(var0, var3, var4, var5, -2123634847);
      }

   }
}

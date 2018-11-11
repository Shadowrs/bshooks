public class class245 implements class244 {
   public static class245 field2950 = new class245("", 10);
   public static class245 field2958;
   public static class245 field2951 = new class245("", 11);
   public static class245 field2949 = new class245("", 13);
   public static class245 field2953 = new class245("", 14);
   public static class245 field2959 = new class245("", 12);
   public static class245 field2952;
   public static class245 field2955;
   public static class245 field2956;
   static class245 field2957;
   static byte[][] field2960;
   public int field2954;

   class245(String var1, int var2) {
      this(var1, var2, false, (class6[])null, false, (class6[])null);
   }

   class245(String var1, int var2, boolean var3, class6[] var4, boolean var5, class6[] var6) {
      this.field2954 = var2;
   }

   class245(String var1, int var2, class6[] var3, class6[] var4) {
      this(var1, var2, var3 != null, var3, null != var4, var4);
   }

   class245(String var1, int var2, boolean var3, boolean var4) {
      this(var1, var2, var3, (class6[])null, var4, (class6[])null);
   }

   public int vmethod5837(int var1) {
      return this.field2954;
   }

   static final class209 method4509(class194 var0, class209 var1, int var2) {
      int var3 = var0.getUByte(1542493214);
      int var4;
      if (var1 == null) {
         var4 = class140.method3075(var3, (short)-10176);
         var1 = new class209(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.getUByte(1220630598) == 1;
         int var6 = var0.get24Int((byte)-66);
         Object var7;
         if (var5) {
            var7 = new class207(var0.getString1(-778927800));
         } else {
            var7 = new class223(var0.getInt(-1817376731));
         }

         var1.method3914((class216)var7, (long)var6);
      }

      return var1;
   }

   public static void method4508(int var0) {
      class272.field3485.method3933();
      class272.field3486.method3933();
   }

   static void method4505(int var0) {
      client.field867 = 1L;
      client.field870 = -1;
      class38.field490.field794 = 0;
      class40.field508 = true;
      client.field1117 = true;
      client.field1079 = -1L;
      class326.field3951 = new class215();
      client.field902.method2033(-76825632);
      client.field902.field1476.field2565 = 0;
      client.field902.field1477 = null;
      client.field902.field1485 = null;
      client.field902.field1473 = null;
      client.field902.field1471 = null;
      client.field902.field1478 = 0;
      client.field902.field1480 = 0;
      client.field873 = 0;
      client.field903 = 0;
      client.field874 = 0;
      class45.method670(-1110574450);
      class60.field697 = 0;
      class95.field1440.clear();
      class95.field1432.method3904();
      class95.field1434.method4097();
      class95.field1435 = 0;
      client.field923 = 0;
      client.field1011 = false;
      client.field1093 = 0;
      client.field925 = 0;
      client.field930 = 0;
      client.field1132 = null;
      client.field1087 = 0;
      client.field1100 = -1;
      client.field1085 = 0;
      client.field1005 = 0;
      client.field882 = class89.field1334;
      client.field883 = class89.field1334;
      client.field898 = 0;
      class3.method3(-1880206451);

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         client.field971[var1] = null;
      }

      for(var1 = 0; var1 < 32768; ++var1) {
         client.field897[var1] = null;
      }

      client.field982 = -1;
      client.field985.method4019();
      client.field977.method4019();

      int var2;
      for(var1 = 0; var1 < 4; ++var1) {
         for(int var3 = 0; var3 < 104; ++var3) {
            for(var2 = 0; var2 < 104; ++var2) {
               client.field983[var1][var3][var2] = null;
            }
         }
      }

      client.field1115 = new class217();
      class164.field2182.method1661((byte)11);

      for(var1 = 0; var1 < class268.field3445; ++var1) {
         class268 var6 = (class268)class268.field3442.method3929((long)var1);
         class268 var4;
         if (var6 != null) {
            var4 = var6;
         } else {
            byte[] var5 = class268.field3447.method4551(16, var1, 822283404);
            var6 = new class268();
            if (var5 != null) {
               var6.method4740(new class194(var5), -128974306);
            }

            class268.field3442.method3932(var6, (long)var1);
            var4 = var6;
         }

         if (var4 != null) {
            class237.field2772[var1] = 0;
            class237.field2770[var1] = 0;
         }
      }

      class158.field2151.method1968(-1101714714);
      client.field1055 = -1;
      if (client.field1016 != -1) {
         var1 = client.field1016;
         if (var1 != -1 && class314.field3913[var1]) {
            class17.field295.method4566(var1, (byte)101);
            if (class189.field2519[var1] != null) {
               boolean var7 = true;

               for(var2 = 0; var2 < class189.field2519[var1].length; ++var2) {
                  if (class189.field2519[var1][var2] != null) {
                     if (class189.field2519[var1][var2].field2850 != 2) {
                        class189.field2519[var1][var2] = null;
                     } else {
                        var7 = false;
                     }
                  }
               }

               if (var7) {
                  class189.field2519[var1] = null;
               }

               class314.field3913[var1] = false;
            }
         }
      }

      for(class67 var8 = (class67)client.field1017.method3962(); var8 != null; var8 = (class67)client.field1017.method3965()) {
         class44.method658(var8, true, 226626639);
      }

      client.field1016 = -1;
      client.field1017 = new class214(8);
      client.field1102 = null;
      class45.method670(-2037057795);
      client.field1118.method4408((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1, (byte)59);

      for(var1 = 0; var1 < 8; ++var1) {
         client.field979[var1] = null;
         client.field963[var1] = false;
      }

      class229.method4142(-183321219);
      client.field865 = true;

      for(var1 = 0; var1 < 100; ++var1) {
         client.field1060[var1] = true;
      }

      class256.method4535((byte)3);
      class33.field443 = null;

      for(var1 = 0; var1 < 8; ++var1) {
         client.field1121[var1] = new class16();
      }

      client.field888 = null;
   }

   static {
      field2952 = new class245("", 15, new class6[]{class6.field37, class6.field37}, (class6[])null);
      field2955 = new class245("", 16, new class6[]{class6.field37, class6.field37}, (class6[])null);
      field2956 = new class245("", 17, new class6[]{class6.field37, class6.field37}, (class6[])null);
      field2957 = new class245("", 73, true, true);
      field2958 = new class245("", 76, true, false);
   }
}

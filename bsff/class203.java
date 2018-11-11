public class class203 {
   static class330 field2605;

   static final void method3842(int var0) {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      if (client.field930 == 0) {
         var1 = class12.field259.field1185;
         var2 = class12.field259.field1209;
         if (class190.field2522 - var1 < -500 || class190.field2522 - var1 > 500 || class99.field1474 - var2 < -500 || class99.field1474 - var2 > 500) {
            class190.field2522 = var1;
            class99.field1474 = var2;
         }

         if (var1 != class190.field2522) {
            class190.field2522 += (var1 - class190.field2522) / 16;
         }

         if (var2 != class99.field1474) {
            class99.field1474 += (var2 - class99.field1474) / 16;
         }

         var3 = class190.field2522 >> 7;
         var4 = class99.field1474 >> 7;
         var5 = class5.method16(class190.field2522, class99.field1474, class237.field2769, -1453085921);
         var6 = 0;
         int var7;
         if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for(var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
               for(int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                  int var9 = class237.field2769;
                  if (var9 < 3 && (class62.field720[1][var7][var8] & 2) == 2) {
                     ++var9;
                  }

                  int var10 = var5 - class62.field728[var9][var7][var8];
                  if (var10 > var6) {
                     var6 = var10;
                  }
               }
            }
         }

         var7 = var6 * 192;
         if (var7 > 98048) {
            var7 = 98048;
         }

         if (var7 < 32768) {
            var7 = 32768;
         }

         if (var7 > client.field941) {
            client.field941 += (var7 - client.field941) / 24;
         } else if (var7 < client.field941) {
            client.field941 += (var7 - client.field941) / 80;
         }

         class269.field3457 = class5.method16(class12.field259.field1185, class12.field259.field1209, class237.field2769, -1453085921) - client.field931;
      } else if (client.field930 == 1) {
         if (client.field938 && class12.field259 != null) {
            var1 = class12.field259.field1188[0];
            var2 = class12.field259.field1206[0];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
               class190.field2522 = class12.field259.field1185;
               var3 = class5.method16(class12.field259.field1185, class12.field259.field1209, class237.field2769, -1453085921) - client.field931;
               if (var3 < class269.field3457) {
                  class269.field3457 = var3;
               }

               class99.field1474 = class12.field259.field1209;
               client.field938 = false;
            }
         }

         short var12 = -1;
         if (class51.field607[33]) {
            var12 = 0;
         } else if (class51.field607[49]) {
            var12 = 1024;
         }

         if (class51.field607[48]) {
            if (var12 == 0) {
               var12 = 1792;
            } else if (var12 == 1024) {
               var12 = 1280;
            } else {
               var12 = 1536;
            }
         } else if (class51.field607[50]) {
            if (var12 == 0) {
               var12 = 256;
            } else if (var12 == 1024) {
               var12 = 768;
            } else {
               var12 = 512;
            }
         }

         byte var11 = 0;
         if (class51.field607[35]) {
            var11 = -1;
         } else if (class51.field607[51]) {
            var11 = 1;
         }

         var3 = 0;
         if (var12 >= 0 || var11 != 0) {
            var3 = class51.field607[81] ? client.field936 : client.field935;
            var3 *= 16;
            client.field933 = var12;
            client.field934 = var11;
         }

         if (client.field932 < var3) {
            client.field932 += var3 / 8;
            if (client.field932 > var3) {
               client.field932 = var3;
            }
         } else if (client.field932 > var3) {
            client.field932 = client.field932 * 9 / 10;
         }

         if (client.field932 > 0) {
            var4 = client.field932 / 16;
            if (client.field933 >= 0) {
               var1 = client.field933 - class181.field2453 & 2047;
               var5 = class134.field1955[var1];
               var6 = class134.field1933[var1];
               class190.field2522 += var5 * var4 / 65536;
               class99.field1474 += var4 * var6 / 65536;
            }

            if (client.field934 != 0) {
               class269.field3457 += var4 * client.field934;
               if (class269.field3457 > 0) {
                  class269.field3457 = 0;
               }
            }
         } else {
            client.field933 = -1;
            client.field934 = -1;
         }

         if (class51.field607[13]) {
            class141.method3076((byte)87);
         }
      }

      if (class60.field701 == 4 && class32.field440) {
         var1 = class60.field693 - client.field929;
         client.field1116 = var1 * 2;
         client.field929 = var1 != -1 && var1 != 1 ? (client.field929 + class60.field693) / 2 : class60.field693;
         var2 = client.field928 - class60.field700;
         client.field913 = var2 * 2;
         client.field928 = var2 != -1 && var2 != 1 ? (client.field928 + class60.field700) / 2 : class60.field700;
      } else {
         if (class51.field607[96]) {
            client.field913 += (-24 - client.field913) / 2;
         } else if (class51.field607[97]) {
            client.field913 += (24 - client.field913) / 2;
         } else {
            client.field913 /= 2;
         }

         if (class51.field607[98]) {
            client.field1116 += (12 - client.field1116) / 2;
         } else if (class51.field607[99]) {
            client.field1116 += (-12 - client.field1116) / 2;
         } else {
            client.field1116 /= 2;
         }

         client.field929 = class60.field693;
         client.field928 = class60.field700;
      }

      client.field925 = client.field913 / 2 + client.field925 & 2047;
      client.field880 += client.field1116 / 2;
      if (client.field880 < 128) {
         client.field880 = 128;
      }

      if (client.field880 > 383) {
         client.field880 = 383;
      }

   }

   static final void method3843(int var0) {
      class184 var1 = class141.method3078(class181.field2417, client.field902.field1475, (byte)-11);
      var1.field2500.addByte(0, (byte)-22);
      client.field902.method2036(var1, (byte)77);
   }
}

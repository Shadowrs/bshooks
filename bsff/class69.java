public class class69 implements Runnable {
   static class331 field796;
   boolean field797 = true;
   Object field795 = new Object();
   int field794 = 0;
   int[] field793 = new int[500];
   int[] field798 = new int[500];

   public void run() {
      for(; this.field797; class163.method3223(50L)) {
         Object var1 = this.field795;
         synchronized(var1) {
            if (this.field794 < 500) {
               this.field793[this.field794] = class60.field700;
               this.field798[this.field794] = class60.field693;
               ++this.field794;
            }
         }
      }

   }

   static final void method1106(boolean var0, class201 var1, short var2) {
      client.field914 = var0;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (!client.field914) {
         int var9 = var1.getUShortLE(-1114400981);
         var3 = var1.getUShort(-1208216487);
         var4 = var1.getUShort(-1208216487);
         class24.field343 = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               class24.field343[var5][var6] = var1.getInt(-1817376731);
            }
         }

         class24.field350 = new int[var4];
         class309.field3870 = new int[var4];
         class185.field2503 = new int[var4];
         class136.field1970 = new byte[var4][];
         class245.field2960 = new byte[var4][];
         boolean var10 = false;
         if ((var3 / 8 == 48 || var3 / 8 == 49) && var9 / 8 == 48) {
            var10 = true;
         }

         if (var3 / 8 == 48 && var9 / 8 == 148) {
            var10 = true;
         }

         var4 = 0;

         for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
            for(var7 = (var9 - 6) / 8; var7 <= (var9 + 6) / 8; ++var7) {
               var8 = var7 + (var6 << 8);
               if (!var10 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
                  class24.field350[var4] = var8;
                  class309.field3870[var4] = class1.field11.method4606("m" + var6 + "_" + var7, 1307868102);
                  class185.field2503[var4] = class1.field11.method4606("l" + var6 + "_" + var7, -851571637);
                  ++var4;
               }
            }
         }

         class6.method20(var3, var9, true, 398189360);
      } else {
         boolean var16 = var1.getUByte128(1361105865) == 1;
         var3 = var1.getUShortLE128(-1359071214);
         var4 = var1.getUShort128(1354693913);
         var5 = var1.getUShort(-1208216487);
         var1.method3793((byte)-5);

         int var17;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var17 = var1.getBits(1, 1583548960);
                  if (var17 == 1) {
                     client.field915[var6][var7][var8] = var1.getBits(26, 1703985507);
                  } else {
                     client.field915[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.method3795(995341058);
         class24.field343 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class24.field343[var6][var7] = var1.getInt(-1817376731);
            }
         }

         class24.field350 = new int[var5];
         class309.field3870 = new int[var5];
         class185.field2503 = new int[var5];
         class136.field1970 = new byte[var5][];
         class245.field2960 = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var17 = client.field915[var6][var7][var8];
                  if (var17 != -1) {
                     int var11 = var17 >> 14 & 1023;
                     int var12 = var17 >> 3 & 2047;
                     int var13 = (var11 / 8 << 8) + var12 / 8;

                     int var14;
                     for(var14 = 0; var14 < var5; ++var14) {
                        if (class24.field350[var14] == var13) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        class24.field350[var5] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        class309.field3870[var5] = class1.field11.method4606("m" + var14 + "_" + var15, 954186250);
                        class185.field2503[var5] = class1.field11.method4606("l" + var14 + "_" + var15, 1248566037);
                        ++var5;
                     }
                  }
               }
            }
         }

         class6.method20(var4, var3, !var16, -2056633234);
      }

   }

   static int method1105(int var0, class96 var1, boolean var2, int var3) {
      class242 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class3.method2(class81.field1272[--class135.field1964], 2086622881);
      } else {
         var4 = var2 ? class336.field4073 : class61.field713;
      }

      int var5;
      if (var0 == 1300) {
         var5 = class81.field1272[--class135.field1964] - 1;
         if (var5 >= 0 && var5 <= 9) {
            var4.method4457(var5, class81.field1281[--class77.field1233], -25366500);
            return 1;
         } else {
            --class77.field1233;
            return 1;
         }
      } else if (var0 == 1301) {
         class135.field1964 -= 2;
         var5 = class81.field1272[class135.field1964];
         int var6 = class81.field1272[class135.field1964 + 1];
         var4.field2913 = class181.method3420(var5, var6, 898340844);
         return 1;
      } else if (var0 == 1302) {
         var4.field2871 = class81.field1272[--class135.field1964] == 1;
         return 1;
      } else if (var0 == 1303) {
         var4.field2890 = class81.field1272[--class135.field1964];
         return 1;
      } else if (var0 == 1304) {
         var4.field2891 = class81.field1272[--class135.field1964];
         return 1;
      } else if (var0 == 1305) {
         var4.field2882 = class81.field1281[--class77.field1233];
         return 1;
      } else if (var0 == 1306) {
         var4.field2863 = class81.field1281[--class77.field1233];
         return 1;
      } else if (var0 == 1307) {
         var4.field2888 = null;
         return 1;
      } else {
         return 2;
      }
   }
}

public class class180 {
   public static class180 field2302 = new class180(0, -2);
   public static class180 field2286 = new class180(1, 7);
   public static class180 field2360 = new class180(2, 6);
   public static class180 field2332 = new class180(3, 0);
   public static class180 field2310 = new class180(4, 2);
   public static class180 field2300 = new class180(5, 10);
   public static class180 field2291 = new class180(6, -2);
   public static class180 field2289 = new class180(7, 8);
   public static class180 field2293 = new class180(8, 5);
   public static class180 field2294 = new class180(9, 5);
   public static class180 field2295 = new class180(10, 3);
   public static class180 field2316 = new class180(11, 2);
   public static class180 field2288 = new class180(37, 5);
   public static class180 field2297 = new class180(12, -1);
   public static class180 field2298 = new class180(13, 4);
   public static class180 field2309 = new class180(40, 6);
   public static class180 field2299 = new class180(14, 4);
   public static class180 field2333 = new class180(48, 5);
   public static class180 field2356 = new class180(15, -2);
   public static class180 field2301 = new class180(16, 6);
   public static class180 field2320 = new class180(35, 2);
   public static class180 field2361 = new class180(17, 1);
   public static class180 field2313 = new class180(25, 4);
   public static class180 field2334 = new class180(18, -1);
   public static class180 field2304 = new class180(19, -2);
   public static class180 field2350 = new class180(30, 8);
   public static class180 field2305 = new class180(20, 6);
   public static class180 field2322 = new class180(21, -2);
   public static class180 field2364 = new class180(79, -1);
   public static class180 field2307 = new class180(22, -1);
   public static class180 field2314 = new class180(29, 1);
   public static class180 field2308 = new class180(23, 2);
   static class331 field2371;
   public static class180 field2341 = new class180(24, 5);
   public static class180 field2290 = new class180(26, 1);
   public static class180 field2312 = new class180(27, 2);
   public static class180 field2292 = new class180(47, 6);
   public static class180 field2342 = new class180(28, 0);
   public static class180 field2355 = new class180(70, 0);
   public static class180 field2285 = new class180(31, -2);
   public static class180 field2344 = new class180(59, 4);
   public static class180 field2317 = new class180(32, 7);
   public static class180 field2339 = new class180(54, 6);
   public static class180 field2346 = new class180(33, 6);
   public static class180 field2319 = new class180(34, -2);
   public static class180 field2345 = new class180(60, 15);
   public static class180 field2321 = new class180(36, 6);
   public static class180 field2335 = new class180(50, 12);
   public static class180 field2323 = new class180(38, -2);
   public static class180 field2324 = new class180(39, 4);
   public static class180 field2331 = new class180(46, 2);
   public static class180 field2326 = new class180(41, -2);
   public static class180 field2327 = new class180(42, 2);
   public static class180 field2296 = new class180(43, -2);
   public static class180 field2303 = new class180(75, -2);
   public static class180 field2329 = new class180(44, 14);
   public static class180 field2330 = new class180(45, -2);
   public static class180 field2352 = new class180(67, 10);
   public static class180 field2306 = new class180(49, 8);
   public static class180 field2336 = new class180(51, 4);
   public static class180 field2349 = new class180(64, 6);
   public static class180 field2337 = new class180(52, -2);
   public static class180 field2363 = new class180(53, 2);
   public static class180 field2340 = new class180(55, 20);
   public static class180 field2366 = new class180(71, 0);
   public static class180 field2287 = new class180(56, -2);
   public static class180 field2367 = new class180(82, -2);
   public static class180 field2315 = new class180(57, -2);
   public static class180 field2343 = new class180(58, 0);
   public static class180 field2325 = new class180(61, -1);
   public static class180 field2347 = new class180(62, 0);
   public static class180 field2348 = new class180(63, 28);
   public static class180 field2328 = new class180(65, 2);
   public static class180 field2351 = new class180(66, 4);
   public static class180 field2362 = new class180(77, 1);
   public static class180 field2353 = new class180(68, 1);
   public static class180 field2354 = new class180(69, -2);
   public static class180 field2357 = new class180(72, -2);
   public static class180 field2358 = new class180(73, -1);
   public static class180 field2359 = new class180(74, 0);
   public static class180 field2368 = new class180(83, 6);
   public static class180 field2318 = new class180(76, 2);
   public static class180 field2311 = new class180(78, 8);
   public static class180 field2365 = new class180(80, 6);
   public static class180 field2338 = new class180(81, 3);
   public static class180 packet84 = new class180(84, -2);
   public int field2369;
   public int field2370;

   class180(int var1, int var2) {
      this.field2369 = var1;
      this.field2370 = var2;
   }

   static final void method3416(boolean var0, class201 var1, int var2) {
      client.field976 = 0;
      client.field1039 = 0;
      class201 var3 = client.field902.field1476;
      var3.method3793((byte)-20);
      int var4 = var3.getBits(8, 953968916);
      int var5;
      if (var4 < client.field898) {
         for(var5 = var4; var5 < client.field898; ++var5) {
            client.field995[++client.field976 - 1] = client.field899[var5];
         }
      }

      if (var4 > client.field898) {
         throw new RuntimeException("");
      } else {
         client.field898 = 0;

         int var6;
         int var7;
         int var8;
         int var9;
         for(var5 = 0; var5 < var4; ++var5) {
            var6 = client.field899[var5];
            class84 var10 = client.field897[var6];
            var7 = var3.getBits(1, 1415661665);
            if (var7 == 0) {
               client.field899[++client.field898 - 1] = var6;
               var10.field1199 = client.field866;
            } else {
               var8 = var3.getBits(2, 250817839);
               if (var8 == 0) {
                  client.field899[++client.field898 - 1] = var6;
                  var10.field1199 = client.field866;
                  client.field1024[++client.field1039 - 1] = var6;
               } else {
                  int var11;
                  if (var8 == 1) {
                     client.field899[++client.field898 - 1] = var6;
                     var10.field1199 = client.field866;
                     var9 = var3.getBits(3, -920769061);
                     var10.method1825(var9, (byte)1, -1919876101);
                     var11 = var3.getBits(1, 1846469801);
                     if (var11 == 1) {
                        client.field1024[++client.field1039 - 1] = var6;
                     }
                  } else if (var8 == 2) {
                     client.field899[++client.field898 - 1] = var6;
                     var10.field1199 = client.field866;
                     var9 = var3.getBits(3, -1894451344);
                     var10.method1825(var9, (byte)2, 1827631441);
                     var11 = var3.getBits(3, 1491701547);
                     var10.method1825(var11, (byte)2, 1604627344);
                     int var12 = var3.getBits(1, -953017323);
                     if (var12 == 1) {
                        client.field1024[++client.field1039 - 1] = var6;
                     }
                  } else if (var8 == 3) {
                     client.field995[++client.field976 - 1] = var6;
                  }
               }
            }
         }

         int var14;
         while(var1.getBitSize(client.field902.field1478, 1043325065) >= 27) {
            var14 = var1.getBits(15, 993764318);
            if (var14 == 32767) {
               break;
            }

            boolean var15 = false;
            if (client.field897[var14] == null) {
               client.field897[var14] = new class84();
               var15 = true;
            }

            class84 var16 = client.field897[var14];
            client.field899[++client.field898 - 1] = var14;
            var16.field1199 = client.field866;
            var6 = var1.getBits(1, 399253676);
            int var13;
            if (var0) {
               var13 = var1.getBits(8, 1764255870);
               if (var13 > 127) {
                  var13 -= 256;
               }
            } else {
               var13 = var1.getBits(5, 293203344);
               if (var13 > 15) {
                  var13 -= 32;
               }
            }

            var16.field1300 = class68.method1100(var1.getBits(14, 813607271), (byte)-52);
            var7 = client.field981[var1.getBits(3, 265219362)];
            if (var15) {
               var16.field1201 = var16.field1151 = var7;
            }

            if (var0) {
               var8 = var1.getBits(8, 353559206);
               if (var8 > 127) {
                  var8 -= 256;
               }
            } else {
               var8 = var1.getBits(5, 636519260);
               if (var8 > 15) {
                  var8 -= 32;
               }
            }

            var9 = var1.getBits(1, -960959991);
            if (var9 == 1) {
               client.field1024[++client.field1039 - 1] = var14;
            }

            var16.field1153 = var16.field1300.field3702;
            var16.field1203 = var16.field1300.field3728;
            if (var16.field1203 == 0) {
               var16.field1151 = 0;
            }

            var16.field1158 = var16.field1300.field3707;
            var16.field1172 = var16.field1300.field3709;
            var16.field1160 = var16.field1300.field3710;
            var16.field1161 = var16.field1300.field3711;
            var16.field1155 = var16.field1300.field3716;
            var16.field1195 = var16.field1300.field3706;
            var16.field1157 = var16.field1300.field3721;
            var16.method1827(class12.field259.field1188[0] + var8, class12.field259.field1206[0] + var13, var6 == 1, 1641490636);
         }

         var1.method3795(11083765);
         class23.method189(var1, -974259551);

         for(var14 = 0; var14 < client.field976; ++var14) {
            var4 = client.field995[var14];
            if (client.field897[var4].field1199 != client.field866) {
               client.field897[var4].field1300 = null;
               client.field897[var4] = null;
            }
         }

         if (var1.field2565 != client.field902.field1478) {
            throw new RuntimeException(var1.field2565 + "," + client.field902.field1478);
         } else {
            for(var14 = 0; var14 < client.field898; ++var14) {
               if (client.field897[client.field899[var14]] == null) {
                  throw new RuntimeException(var14 + "," + client.field898);
               }
            }

         }
      }
   }

   static final int method3419(int var0) {
      if (class46.field564.field1236) {
         return class237.field2769;
      } else {
         int var1 = 3;
         if (class10.field241 < 310) {
            int var2;
            int var3;
            if (client.field930 == 1) {
               var2 = class190.field2522 >> 7;
               var3 = class99.field1474 >> 7;
            } else {
               var2 = class12.field259.field1185 >> 7;
               var3 = class12.field259.field1209 >> 7;
            }

            int var4 = class287.field3766 >> 7;
            int var5 = class98.field1468 >> 7;
            if (var4 < 0 || var5 < 0 || var4 >= 104 || var5 >= 104) {
               return class237.field2769;
            }

            if (var2 < 0 || var3 < 0 || var2 >= 104 || var3 >= 104) {
               return class237.field2769;
            }

            if ((class62.field720[class237.field2769][var4][var5] & 4) != 0) {
               var1 = class237.field2769;
            }

            int var6;
            if (var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            if (var3 > var5) {
               var7 = var3 - var5;
            } else {
               var7 = var5 - var3;
            }

            int var8;
            int var9;
            if (var6 > var7) {
               var8 = var7 * 65536 / var6;
               var9 = 32768;

               while(var2 != var4) {
                  if (var4 < var2) {
                     ++var4;
                  } else if (var4 > var2) {
                     --var4;
                  }

                  if ((class62.field720[class237.field2769][var4][var5] & 4) != 0) {
                     var1 = class237.field2769;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var5 < var3) {
                        ++var5;
                     } else if (var5 > var3) {
                        --var5;
                     }

                     if ((class62.field720[class237.field2769][var4][var5] & 4) != 0) {
                        var1 = class237.field2769;
                     }
                  }
               }
            } else if (var7 > 0) {
               var8 = var6 * 65536 / var7;
               var9 = 32768;

               while(var5 != var3) {
                  if (var5 < var3) {
                     ++var5;
                  } else if (var5 > var3) {
                     --var5;
                  }

                  if ((class62.field720[class237.field2769][var4][var5] & 4) != 0) {
                     var1 = class237.field2769;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if ((class62.field720[class237.field2769][var4][var5] & 4) != 0) {
                        var1 = class237.field2769;
                     }
                  }
               }
            }
         }

         if (class12.field259.field1185 >= 0 && class12.field259.field1209 >= 0 && class12.field259.field1185 < 13312 && class12.field259.field1209 < 13312) {
            if ((class62.field720[class237.field2769][class12.field259.field1185 >> 7][class12.field259.field1209 >> 7] & 4) != 0) {
               var1 = class237.field2769;
            }

            return var1;
         } else {
            return class237.field2769;
         }
      }
   }
}

public class class177 {
   static int[][] field2274 = new int[128][128];
   static int[][] field2275 = new int[128][128];
   static int[] field2272 = new int[4096];
   static int[] field2276 = new int[4096];
   static int field2277;

   static final void method3409(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      class184 var9;
      if (var2 == 1) {
         client.field961 = var6;
         client.field957 = var7;
         client.field959 = 2;
         client.field958 = 0;
         client.field1085 = var0;
         client.field1005 = var1;
         var9 = class141.method3078(class181.field2422, client.field902.field1475, (byte)-73);
         var9.field2500.addShortLE128(class4.field28 + var1, (byte)-6);
         var9.field2500.addShortLE(class49.field589, 1845110764);
         var9.field2500.addIntLE(client.field900, (byte)0);
         var9.field2500.addShortLE128(class70.field813, (byte)29);
         var9.field2500.addByte(class51.field607[82] ? 1 : 0, (byte)-29);
         var9.field2500.addShort128(var3 >> 14 & 32767, 388520418);
         var9.field2500.addShort(var0 + class184.field2498, 728135254);
         client.field902.method2036(var9, (byte)45);
      } else if (var2 == 2) {
         client.field961 = var6;
         client.field957 = var7;
         client.field959 = 2;
         client.field958 = 0;
         client.field1085 = var0;
         client.field1005 = var1;
         var9 = class141.method3078(class181.field2420, client.field902.field1475, (byte)-103);
         var9.field2500.addShort128(client.field1012, 1122626933);
         var9.field2500.addShortLE(var3 >> 14 & 32767, 1743147265);
         var9.field2500.addIntV3(class52.field623, 943676253);
         var9.field2500.addShortLE128(var0 + class184.field2498, (byte)15);
         var9.field2500.add128Byte(class51.field607[82] ? 1 : 0, -1949003016);
         var9.field2500.addShort(class4.field28 + var1, 1732460340);
         client.field902.method2036(var9, (byte)27);
      } else if (var2 == 3) {
         client.field961 = var6;
         client.field957 = var7;
         client.field959 = 2;
         client.field958 = 0;
         client.field1085 = var0;
         client.field1005 = var1;
         var9 = class141.method3078(class181.field2419, client.field902.field1475, (byte)-79);
         var9.field2500.addShortLE128(var0 + class184.field2498, (byte)-84);
         var9.field2500.addShortLE128(var3 >> 14 & 32767, (byte)-60);
         var9.field2500.addShortLE(class4.field28 + var1, 2009735736);
         var9.field2500.addByte(class51.field607[82] ? 1 : 0, (byte)-36);
         client.field902.method2036(var9, (byte)48);
      } else if (var2 == 4) {
         client.field961 = var6;
         client.field957 = var7;
         client.field959 = 2;
         client.field958 = 0;
         client.field1085 = var0;
         client.field1005 = var1;
         var9 = class141.method3078(class181.field2381, client.field902.field1475, (byte)-114);
         var9.field2500.addShort(var0 + class184.field2498, 817694878);
         var9.field2500.addShort(var3 >> 14 & 32767, 1633795133);
         var9.field2500.addShortLE128(class4.field28 + var1, (byte)7);
         var9.field2500.addReversedByte(class51.field607[82] ? 1 : 0, 1241462767);
         client.field902.method2036(var9, (byte)105);
      } else if (var2 == 5) {
         client.field961 = var6;
         client.field957 = var7;
         client.field959 = 2;
         client.field958 = 0;
         client.field1085 = var0;
         client.field1005 = var1;
         var9 = class141.method3078(class181.field2415, client.field902.field1475, (byte)-29);
         var9.field2500.addShort(var3 >> 14 & 32767, 1394029796);
         var9.field2500.addShortLE128(var0 + class184.field2498, (byte)-50);
         var9.field2500.addReversedByte(class51.field607[82] ? 1 : 0, 834705522);
         var9.field2500.addShort(class4.field28 + var1, 539896391);
         client.field902.method2036(var9, (byte)77);
      } else if (var2 == 6) {
         client.field961 = var6;
         client.field957 = var7;
         client.field959 = 2;
         client.field958 = 0;
         client.field1085 = var0;
         client.field1005 = var1;
         var9 = class141.method3078(class181.field2448, client.field902.field1475, (byte)-83);
         var9.field2500.addShort(class4.field28 + var1, 69722652);
         var9.field2500.addShort128(var0 + class184.field2498, 7602177);
         var9.field2500.addReversedByte(class51.field607[82] ? 1 : 0, 872784314);
         var9.field2500.addShortLE128(var3 >> 14 & 32767, (byte)-69);
         client.field902.method2036(var9, (byte)99);
      } else {
         class184 var10;
         class84 var11;
         if (var2 == 7) {
            var11 = client.field897[var3];
            if (var11 != null) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var10 = class141.method3078(class181.field2452, client.field902.field1475, (byte)-93);
               var10.field2500.addShortLE128(class49.field589, (byte)69);
               var10.field2500.addByte(class51.field607[82] ? 1 : 0, (byte)-67);
               var10.field2500.addIntLE(client.field900, (byte)0);
               var10.field2500.addShort(class70.field813, 478053627);
               var10.field2500.addShort(var3, 1834018830);
               client.field902.method2036(var10, (byte)38);
            }
         } else if (var2 == 8) {
            var11 = client.field897[var3];
            if (var11 != null) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var10 = class141.method3078(class181.field2392, client.field902.field1475, (byte)-38);
               var10.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)53);
               var10.field2500.addIntLE(class52.field623, (byte)0);
               var10.field2500.addShortLE(client.field1012, 2115225282);
               var10.field2500.addShort128(var3, -819882325);
               client.field902.method2036(var10, (byte)39);
            }
         } else if (var2 == 9) {
            var11 = client.field897[var3];
            if (var11 != null) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var10 = class141.method3078(class181.field2472, client.field902.field1475, (byte)-103);
               var10.field2500.addShort(var3, 1030448550);
               var10.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)-26);
               client.field902.method2036(var10, (byte)94);
            }
         } else if (var2 == 10) {
            var11 = client.field897[var3];
            if (var11 != null) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var10 = class141.method3078(class181.field2404, client.field902.field1475, (byte)-9);
               var10.field2500.addReversedByte(class51.field607[82] ? 1 : 0, 1909055591);
               var10.field2500.addShortLE128(var3, (byte)-68);
               client.field902.method2036(var10, (byte)26);
            }
         } else if (var2 == 11) {
            var11 = client.field897[var3];
            if (var11 != null) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var10 = class141.method3078(class181.field2406, client.field902.field1475, (byte)-9);
               var10.field2500.addByte(class51.field607[82] ? 1 : 0, (byte)-55);
               var10.field2500.addShortLE128(var3, (byte)-47);
               client.field902.method2036(var10, (byte)55);
            }
         } else if (var2 == 12) {
            var11 = client.field897[var3];
            if (var11 != null) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var10 = class141.method3078(class181.field2387, client.field902.field1475, (byte)-106);
               var10.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)3);
               var10.field2500.addShortLE(var3, 1953148462);
               client.field902.method2036(var10, (byte)124);
            }
         } else if (var2 == 13) {
            var11 = client.field897[var3];
            if (var11 != null) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var10 = class141.method3078(class181.field2418, client.field902.field1475, (byte)-6);
               var10.field2500.addByte(class51.field607[82] ? 1 : 0, (byte)-111);
               var10.field2500.addShortLE(var3, 1981962493);
               client.field902.method2036(var10, (byte)51);
            }
         } else {
            class72 var12;
            if (var2 == 14) {
               var12 = client.field971[var3];
               if (var12 != null) {
                  client.field961 = var6;
                  client.field957 = var7;
                  client.field959 = 2;
                  client.field958 = 0;
                  client.field1085 = var0;
                  client.field1005 = var1;
                  var10 = class141.method3078(class181.field2426, client.field902.field1475, (byte)-11);
                  var10.field2500.addIntV2(client.field900, (byte)45);
                  var10.field2500.addShortLE128(class49.field589, (byte)18);
                  var10.field2500.addShort128(class70.field813, -600263186);
                  var10.field2500.addShortLE(var3, 1709246493);
                  var10.field2500.add128Byte(class51.field607[82] ? 1 : 0, -1941987272);
                  client.field902.method2036(var10, (byte)36);
               }
            } else if (var2 == 15) {
               var12 = client.field971[var3];
               if (var12 != null) {
                  client.field961 = var6;
                  client.field957 = var7;
                  client.field959 = 2;
                  client.field958 = 0;
                  client.field1085 = var0;
                  client.field1005 = var1;
                  var10 = class141.method3078(class181.field2446, client.field902.field1475, (byte)-88);
                  var10.field2500.addShort(var3, 1027210621);
                  var10.field2500.addIntLE(class52.field623, (byte)0);
                  var10.field2500.addShort(client.field1012, 1257505894);
                  var10.field2500.addReversedByte(class51.field607[82] ? 1 : 0, 1828623453);
                  client.field902.method2036(var10, (byte)66);
               }
            } else if (var2 == 16) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var9 = class141.method3078(class181.field2372, client.field902.field1475, (byte)-16);
               var9.field2500.addShortLE128(class49.field589, (byte)-37);
               var9.field2500.addShort128(var0 + class184.field2498, -437401643);
               var9.field2500.addShortLE(var3, 2002790292);
               var9.field2500.addShortLE(class4.field28 + var1, 1783718176);
               var9.field2500.addReversedByte(class51.field607[82] ? 1 : 0, 1569153907);
               var9.field2500.addIntV2(client.field900, (byte)-86);
               var9.field2500.addShortLE(class70.field813, 1997675691);
               client.field902.method2036(var9, (byte)71);
            } else if (var2 == 17) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var9 = class141.method3078(class181.field2460, client.field902.field1475, (byte)-43);
               var9.field2500.addIntV3(class52.field623, -400548471);
               var9.field2500.addShort(client.field1012, 1076201900);
               var9.field2500.addShortLE128(var0 + class184.field2498, (byte)64);
               var9.field2500.addShortLE128(class4.field28 + var1, (byte)-1);
               var9.field2500.addShortLE128(var3, (byte)-27);
               var9.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)29);
               client.field902.method2036(var9, (byte)33);
            } else if (var2 == 18) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var9 = class141.method3078(class181.field2388, client.field902.field1475, (byte)-59);
               var9.field2500.addShortLE128(var0 + class184.field2498, (byte)21);
               var9.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)55);
               var9.field2500.addShort(class4.field28 + var1, 1565823265);
               var9.field2500.addShort128(var3, -55984571);
               client.field902.method2036(var9, (byte)80);
            } else if (var2 == 19) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var9 = class141.method3078(class181.field2447, client.field902.field1475, (byte)-101);
               var9.field2500.addShort(var3, 1840293330);
               var9.field2500.addShortLE(class4.field28 + var1, 1971666075);
               var9.field2500.addShortLE128(var0 + class184.field2498, (byte)-50);
               var9.field2500.addReversedByte(class51.field607[82] ? 1 : 0, 1527870957);
               client.field902.method2036(var9, (byte)100);
            } else if (var2 == 20) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var9 = class141.method3078(class181.field2458, client.field902.field1475, (byte)-55);
               var9.field2500.addShortLE128(var0 + class184.field2498, (byte)1);
               var9.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)66);
               var9.field2500.addShortLE128(var3, (byte)73);
               var9.field2500.addShort(class4.field28 + var1, 1346354494);
               client.field902.method2036(var9, (byte)101);
            } else if (var2 == 21) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var9 = class141.method3078(class181.field2456, client.field902.field1475, (byte)-41);
               var9.field2500.addShortLE128(var0 + class184.field2498, (byte)-23);
               var9.field2500.add128Byte(class51.field607[82] ? 1 : 0, -925057932);
               var9.field2500.addShort128(class4.field28 + var1, 794462504);
               var9.field2500.addShort(var3, 465864689);
               client.field902.method2036(var9, (byte)79);
            } else if (var2 == 22) {
               client.field961 = var6;
               client.field957 = var7;
               client.field959 = 2;
               client.field958 = 0;
               client.field1085 = var0;
               client.field1005 = var1;
               var9 = class141.method3078(class181.field2375, client.field902.field1475, (byte)-52);
               var9.field2500.addShort(class4.field28 + var1, -124180647);
               var9.field2500.addShortLE(var3, 1675488215);
               var9.field2500.addShort(var0 + class184.field2498, 1216363052);
               var9.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)-61);
               client.field902.method2036(var9, (byte)76);
            } else if (var2 == 23) {
               if (client.field991) {
                  class308.field3867.method3061();
               } else {
                  class308.field3867.method3046(class237.field2769, var0, var1, true);
               }
            } else {
               class184 var13;
               class242 var14;
               if (var2 == 24) {
                  var14 = class3.method2(var1, 2067193540);
                  boolean var15 = true;
                  if (var14.field2818 > 0) {
                     var15 = class240.method4437(var14, (byte)2);
                  }

                  if (var15) {
                     var13 = class141.method3078(class181.field2421, client.field902.field1475, (byte)-69);
                     var13.field2500.addInt(var1, (byte)90);
                     client.field902.method2036(var13, (byte)78);
                  }
               } else {
                  int var22;
                  if (var2 == 25) {
                     var14 = class181.method3420(var1, var0, -2107724768);
                     if (var14 != null) {
                        class3.method4(63610416);
                        var22 = class45.method662(var14, 2128446087);
                        int var21 = var22 >> 11 & 63;
                        class18.method156(var1, var0, var21, var14.field2934, -1536846702);
                        client.field923 = 0;
                        int var23 = class45.method662(var14, 2088700391);
                        int var18 = var23 >> 11 & 63;
                        String var19;
                        if (var18 == 0) {
                           var19 = null;
                        } else if (var14.field2863 != null && var14.field2863.trim().length() != 0) {
                           var19 = var14.field2863;
                        } else {
                           var19 = null;
                        }

                        client.field956 = var19;
                        if (client.field956 == null) {
                           client.field956 = "Null";
                        }

                        if (var14.field2813) {
                           client.field1015 = var14.field2882 + class173.method3342(16777215, (byte)-93);
                        } else {
                           client.field1015 = class173.method3342(65280, (byte)-31) + var14.field2930 + class173.method3342(16777215, (byte)-3);
                        }
                     }

                     return;
                  }

                  if (var2 == 26) {
                     var9 = class141.method3078(class181.field2403, client.field902.field1475, (byte)-17);
                     client.field902.method2036(var9, (byte)87);

                     for(class67 var20 = (class67)client.field1017.method3962(); var20 != null; var20 = (class67)client.field1017.method3965()) {
                        if (var20.field774 == 0 || var20.field774 == 3) {
                           class44.method658(var20, true, 226626639);
                        }
                     }

                     if (client.field1102 != null) {
                        class30.method274(client.field1102, -1952289051);
                        client.field1102 = null;
                     }
                  } else {
                     class242 var16;
                     if (var2 == 28) {
                        var9 = class141.method3078(class181.field2421, client.field902.field1475, (byte)-120);
                        var9.field2500.addInt(var1, (byte)15);
                        client.field902.method2036(var9, (byte)82);
                        var16 = class3.method2(var1, 2137524569);
                        if (var16.field2926 != null && var16.field2926[0][0] == 5) {
                           var22 = var16.field2926[0][1];
                           class237.field2770[var22] = 1 - class237.field2770[var22];
                           class93.method1950(var22, -1118087758);
                        }
                     } else if (var2 == 29) {
                        var9 = class141.method3078(class181.field2421, client.field902.field1475, (byte)-72);
                        var9.field2500.addInt(var1, (byte)50);
                        client.field902.method2036(var9, (byte)95);
                        var16 = class3.method2(var1, 2115647926);
                        if (var16.field2926 != null && var16.field2926[0][0] == 5) {
                           var22 = var16.field2926[0][1];
                           if (class237.field2770[var22] != var16.field2928[0]) {
                              class237.field2770[var22] = var16.field2928[0];
                              class93.method1950(var22, -2130803906);
                           }
                        }
                     } else if (var2 == 30) {
                        if (client.field1102 == null) {
                           class97.method2019(var1, var0, -460983189);
                           client.field1102 = class181.method3420(var1, var0, 386429858);
                           class30.method274(client.field1102, -1258370935);
                        }
                     } else if (var2 == 31) {
                        var9 = class141.method3078(class181.field2423, client.field902.field1475, (byte)-84);
                        var9.field2500.addShortLE128(var3, (byte)-63);
                        var9.field2500.addShortLE128(class49.field589, (byte)-71);
                        var9.field2500.addInt(var1, (byte)61);
                        var9.field2500.addIntV3(client.field900, 569847711);
                        var9.field2500.addShortLE(class70.field813, 1863356939);
                        var9.field2500.addShort128(var0, 647882574);
                        client.field902.method2036(var9, (byte)121);
                        client.field987 = 0;
                        class64.field750 = class3.method2(var1, 2066176487);
                        client.field909 = var0;
                     } else if (var2 == 32) {
                        var9 = class141.method3078(class181.field2461, client.field902.field1475, (byte)-33);
                        var9.field2500.addShortLE(var3, 1848937222);
                        var9.field2500.addInt(var1, (byte)28);
                        var9.field2500.addShortLE128(var0, (byte)31);
                        var9.field2500.addInt(class52.field623, (byte)55);
                        var9.field2500.addShort128(client.field1012, -990691204);
                        client.field902.method2036(var9, (byte)49);
                        client.field987 = 0;
                        class64.field750 = class3.method2(var1, 2116185396);
                        client.field909 = var0;
                     } else if (var2 == 33) {
                        var9 = class141.method3078(class181.field2466, client.field902.field1475, (byte)-106);
                        var9.field2500.addShort(var0, 2070570680);
                        var9.field2500.addIntV3(var1, 749275266);
                        var9.field2500.addShort(var3, 1771091811);
                        client.field902.method2036(var9, (byte)96);
                        client.field987 = 0;
                        class64.field750 = class3.method2(var1, 2071796164);
                        client.field909 = var0;
                     } else if (var2 == 34) {
                        var9 = class141.method3078(class181.field2430, client.field902.field1475, (byte)-50);
                        var9.field2500.addIntV2(var1, (byte)-32);
                        var9.field2500.addShortLE128(var0, (byte)82);
                        var9.field2500.addShort(var3, 412969357);
                        client.field902.method2036(var9, (byte)104);
                        client.field987 = 0;
                        class64.field750 = class3.method2(var1, 2080564612);
                        client.field909 = var0;
                     } else if (var2 == 35) {
                        var9 = class141.method3078(class181.field2391, client.field902.field1475, (byte)-19);
                        var9.field2500.addShortLE128(var0, (byte)-6);
                        var9.field2500.addShortLE(var3, 2094927203);
                        var9.field2500.addIntV3(var1, -1059907557);
                        client.field902.method2036(var9, (byte)72);
                        client.field987 = 0;
                        class64.field750 = class3.method2(var1, 2104341234);
                        client.field909 = var0;
                     } else if (var2 == 36) {
                        var9 = class141.method3078(class181.field2376, client.field902.field1475, (byte)-22);
                        var9.field2500.addShort(var3, 1879350283);
                        var9.field2500.addIntV3(var1, 237223443);
                        var9.field2500.addShort128(var0, -593337372);
                        client.field902.method2036(var9, (byte)127);
                        client.field987 = 0;
                        class64.field750 = class3.method2(var1, 2060488883);
                        client.field909 = var0;
                     } else if (var2 == 37) {
                        var9 = class141.method3078(class181.field2409, client.field902.field1475, (byte)-65);
                        var9.field2500.addShort128(var3, -1842203083);
                        var9.field2500.addShort(var0, 94127439);
                        var9.field2500.addInt(var1, (byte)104);
                        client.field902.method2036(var9, (byte)109);
                        client.field987 = 0;
                        class64.field750 = class3.method2(var1, 2087647841);
                        client.field909 = var0;
                     } else {
                        if (var2 == 38) {
                           class3.method4(63610416);
                           var14 = class3.method2(var1, 2138593796);
                           client.field923 = 1;
                           class49.field589 = var0;
                           client.field900 = var1;
                           class70.field813 = var3;
                           class30.method274(var14, -637670688);
                           client.field1010 = class173.method3342(16748608, (byte)-58) + class146.method3099(var3, (byte)77).field3644 + class173.method3342(16777215, (byte)-8);
                           if (client.field1010 == null) {
                              client.field1010 = "null";
                           }

                           return;
                        }

                        if (var2 == 39) {
                           var9 = class141.method3078(class181.field2378, client.field902.field1475, (byte)-59);
                           var9.field2500.addShort(var0, 157465568);
                           var9.field2500.addInt(var1, (byte)72);
                           var9.field2500.addShort128(var3, -1317714389);
                           client.field902.method2036(var9, (byte)116);
                           client.field987 = 0;
                           class64.field750 = class3.method2(var1, 2146830231);
                           client.field909 = var0;
                        } else if (var2 == 40) {
                           var9 = class141.method3078(class181.field2410, client.field902.field1475, (byte)-6);
                           var9.field2500.addIntV3(var1, -706380439);
                           var9.field2500.addShort128(var3, -1615100677);
                           var9.field2500.addShortLE128(var0, (byte)6);
                           client.field902.method2036(var9, (byte)83);
                           client.field987 = 0;
                           class64.field750 = class3.method2(var1, 2135269316);
                           client.field909 = var0;
                        } else if (var2 == 41) {
                           var9 = class141.method3078(class181.field2436, client.field902.field1475, (byte)-60);
                           var9.field2500.addShortLE128(var3, (byte)45);
                           var9.field2500.addInt(var1, (byte)39);
                           var9.field2500.addShortLE(var0, 2047488356);
                           client.field902.method2036(var9, (byte)82);
                           client.field987 = 0;
                           class64.field750 = class3.method2(var1, 2110559067);
                           client.field909 = var0;
                        } else if (var2 == 42) {
                           var9 = class141.method3078(class181.field2437, client.field902.field1475, (byte)-106);
                           var9.field2500.addShortLE128(var3, (byte)6);
                           var9.field2500.addIntV3(var1, -547091074);
                           var9.field2500.addShort128(var0, 919021859);
                           client.field902.method2036(var9, (byte)112);
                           client.field987 = 0;
                           class64.field750 = class3.method2(var1, 2141076308);
                           client.field909 = var0;
                        } else if (var2 == 43) {
                           var9 = class141.method3078(class181.field2432, client.field902.field1475, (byte)-124);
                           var9.field2500.addShortLE(var0, 1897727890);
                           var9.field2500.addIntV2(var1, (byte)70);
                           var9.field2500.addShort128(var3, -715283053);
                           client.field902.method2036(var9, (byte)91);
                           client.field987 = 0;
                           class64.field750 = class3.method2(var1, 2083867982);
                           client.field909 = var0;
                        } else if (var2 == 44) {
                           var12 = client.field971[var3];
                           if (var12 != null) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              client.field1085 = var0;
                              client.field1005 = var1;
                              var10 = class141.method3078(class181.field2431, client.field902.field1475, (byte)-52);
                              var10.field2500.addShortLE128(var3, (byte)-40);
                              var10.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)-64);
                              client.field902.method2036(var10, (byte)78);
                           }
                        } else if (var2 == 45) {
                           var12 = client.field971[var3];
                           if (var12 != null) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              client.field1085 = var0;
                              client.field1005 = var1;
                              var10 = class141.method3078(class181.field2402, client.field902.field1475, (byte)-103);
                              var10.field2500.addShort128(var3, -615877956);
                              var10.field2500.addReversedByte(class51.field607[82] ? 1 : 0, 1231067927);
                              client.field902.method2036(var10, (byte)60);
                           }
                        } else if (var2 == 46) {
                           var12 = client.field971[var3];
                           if (var12 != null) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              client.field1085 = var0;
                              client.field1005 = var1;
                              var10 = class141.method3078(class181.field2405, client.field902.field1475, (byte)-74);
                              var10.field2500.addShortLE128(var3, (byte)3);
                              var10.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)-103);
                              client.field902.method2036(var10, (byte)93);
                           }
                        } else if (var2 == 47) {
                           var12 = client.field971[var3];
                           if (var12 != null) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              client.field1085 = var0;
                              client.field1005 = var1;
                              var10 = class141.method3078(class181.field2468, client.field902.field1475, (byte)-41);
                              var10.field2500.addShort128(var3, -407924956);
                              var10.field2500.add128Byte(class51.field607[82] ? 1 : 0, -1660393910);
                              client.field902.method2036(var10, (byte)20);
                           }
                        } else if (var2 == 48) {
                           var12 = client.field971[var3];
                           if (var12 != null) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              client.field1085 = var0;
                              client.field1005 = var1;
                              var10 = class141.method3078(class181.field2393, client.field902.field1475, (byte)-106);
                              var10.field2500.addShort(var3, 1724611512);
                              var10.field2500.add128Byte(class51.field607[82] ? 1 : 0, -1672940704);
                              client.field902.method2036(var10, (byte)94);
                           }
                        } else if (var2 == 49) {
                           var12 = client.field971[var3];
                           if (var12 != null) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              client.field1085 = var0;
                              client.field1005 = var1;
                              var10 = class141.method3078(class181.field2377, client.field902.field1475, (byte)-105);
                              var10.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)43);
                              var10.field2500.addShort(var3, 1627239604);
                              client.field902.method2036(var10, (byte)101);
                           }
                        } else if (var2 == 50) {
                           var12 = client.field971[var3];
                           if (var12 != null) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              client.field1085 = var0;
                              client.field1005 = var1;
                              var10 = class141.method3078(class181.field2435, client.field902.field1475, (byte)-24);
                              var10.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)10);
                              var10.field2500.addShortLE(var3, 1718145123);
                              client.field902.method2036(var10, (byte)85);
                           }
                        } else if (var2 == 51) {
                           var12 = client.field971[var3];
                           if (var12 != null) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              client.field1085 = var0;
                              client.field1005 = var1;
                              var10 = class141.method3078(class181.field2469, client.field902.field1475, (byte)-14);
                              var10.field2500.addReversedByte(class51.field607[82] ? 1 : 0, 1248813127);
                              var10.field2500.addShort128(var3, 499610488);
                              client.field902.method2036(var10, (byte)57);
                           }
                        } else if (var2 != 1007 && var2 != 57) {
                           if (var2 == 58) {
                              var14 = class181.method3420(var1, var0, -543826195);
                              if (var14 != null) {
                                 var10 = class141.method3078(class181.field2438, client.field902.field1475, (byte)-35);
                                 var10.field2500.addShort128(var14.field2934, 388705311);
                                 var10.field2500.addInt(class52.field623, (byte)70);
                                 var10.field2500.addShort128(client.field1012, 1100784915);
                                 var10.field2500.addIntV3(var1, -650653778);
                                 var10.field2500.addShort128(client.field1013, -1201725722);
                                 var10.field2500.addShortLE128(var0, (byte)-25);
                                 client.field902.method2036(var10, (byte)35);
                              }
                           } else if (var2 == 1001) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              client.field1085 = var0;
                              client.field1005 = var1;
                              var9 = class141.method3078(class181.field2442, client.field902.field1475, (byte)-52);
                              var9.field2500.addShort(class4.field28 + var1, 1046620651);
                              var9.field2500.addShortLE128(var3 >> 14 & 32767, (byte)-57);
                              var9.field2500.addShortLE128(var0 + class184.field2498, (byte)8);
                              var9.field2500.addByte128(class51.field607[82] ? 1 : 0, (byte)28);
                              client.field902.method2036(var9, (byte)98);
                           } else if (var2 == 1002) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              var9 = class141.method3078(class181.field2429, client.field902.field1475, (byte)-114);
                              var9.field2500.addShort128(var3 >> 14 & 32767, -1278470530);
                              client.field902.method2036(var9, (byte)120);
                           } else if (var2 == 1003) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              var11 = client.field897[var3];
                              if (var11 != null) {
                                 class285 var17 = var11.field1300;
                                 if (var17.field3718 != null) {
                                    var17 = var17.method5136(1576606985);
                                 }

                                 if (var17 != null) {
                                    var13 = class141.method3078(class181.field2471, client.field902.field1475, (byte)-86);
                                    var13.field2500.addShortLE128(var17.field3700, (byte)-37);
                                    client.field902.method2036(var13, (byte)65);
                                 }
                              }
                           } else if (var2 == 1004) {
                              client.field961 = var6;
                              client.field957 = var7;
                              client.field959 = 2;
                              client.field958 = 0;
                              var9 = class141.method3078(class181.field2443, client.field902.field1475, (byte)-123);
                              var9.field2500.addShort128(var3, -1094803177);
                              client.field902.method2036(var9, (byte)44);
                           } else if (var2 == 1005) {
                              var14 = class3.method2(var1, 2106986536);
                              if (var14 != null && var14.field2933[var0] >= 100000) {
                                 class189.method3483(27, "", var14.field2933[var0] + " x " + class146.method3099(var3, (byte)100).field3644, (byte)74);
                              } else {
                                 var10 = class141.method3078(class181.field2443, client.field902.field1475, (byte)-32);
                                 var10.field2500.addShort128(var3, 1145837139);
                                 client.field902.method2036(var10, (byte)85);
                              }

                              client.field987 = 0;
                              class64.field750 = class3.method2(var1, 2093418153);
                              client.field909 = var0;
                           } else if (var2 == 1011 || var2 == 1009 || var2 == 1010 || var2 == 1008 || var2 == 1012) {
                              class63.field742.method6043(var2, var3, new class238(var0), new class238(var1), (short)-4323);
                           }
                        } else {
                           var14 = class181.method3420(var1, var0, -1525729791);
                           if (var14 != null) {
                              class257.method4537(var3, var1, var0, var14.field2934, var5, -1821515728);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (client.field923 != 0) {
         client.field923 = 0;
         class30.method274(class3.method2(client.field900, 2046531157), -291534751);
      }

      if (client.field1011) {
         class3.method4(63610416);
      }

      if (class64.field750 != null && client.field987 == 0) {
         class30.method274(class64.field750, -1912103701);
      }

   }
}

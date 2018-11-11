public class class37 {
   static class37 field481 = new class37(0);
   static class37 field482 = new class37(1);
   static int field485;
   int field483;

   class37(int var1) {
      this.field483 = var1;
   }

   static void method523(class72 var0, boolean var1, byte var2) {
      if (var0 != null && var0.vmethod1824(1437529783) && !var0.field836) {
         int var3 = var0.field843 << 14;
         var0.field839 = false;
         if ((client.field862 && class93.field1414 > 50 || class93.field1414 > 200) && var1 && var0.field1155 == var0.field1173) {
            var0.field839 = true;
         }

         int var4 = var0.field1185 >> 7;
         int var5 = var0.field1209 >> 7;
         if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
            if (var0.field834 != null && client.field866 >= var0.field844 && client.field866 < var0.field829) {
               var0.field839 = false;
               var0.field828 = class5.method16(var0.field1185, var0.field1209, class237.field2769, -1453085921);
               var0.field1154 = client.field866;
               class308.field3867.method2888(class237.field2769, var0.field1185, var0.field1209, var0.field828, 60, var0, var0.field1151, var3, var0.field835, var0.field826, var0.field848, var0.field838);
            } else {
               if ((var0.field1185 & 127) == 64 && (var0.field1209 & 127) == 64) {
                  if (client.field952[var4][var5] == client.field953) {
                     return;
                  }

                  client.field952[var4][var5] = client.field953;
               }

               var0.field828 = class5.method16(var0.field1185, var0.field1209, class237.field2769, -1453085921);
               var0.field1154 = client.field866;
               class308.field3867.method3006(class237.field2769, var0.field1185, var0.field1209, var0.field828, 60, var0, var0.field1151, var3, var0.field1181);
            }
         }
      }

   }

   static final void method522(class72 var0, int var1, int var2, int var3, byte var4) {
      if (class12.field259 != var0 && client.field992 < 400) {
         int var5;
         String var6;
         if (var0.field827 == 0) {
            String var7 = var0.field825[0] + var0.field823 + var0.field825[1];
            var5 = var0.field832;
            int var8 = class12.field259.field832;
            int var9 = var8 - var5;
            String var10;
            if (var9 < -9) {
               var10 = class173.method3342(16711680, (byte)-89);
            } else if (var9 < -6) {
               var10 = class173.method3342(16723968, (byte)-58);
            } else if (var9 < -3) {
               var10 = class173.method3342(16740352, (byte)-93);
            } else if (var9 < 0) {
               var10 = class173.method3342(16756736, (byte)-103);
            } else if (var9 > 9) {
               var10 = class173.method3342(65280, (byte)8);
            } else if (var9 > 6) {
               var10 = class173.method3342(4259584, (byte)-63);
            } else if (var9 > 3) {
               var10 = class173.method3342(8453888, (byte)-57);
            } else if (var9 > 0) {
               var10 = class173.method3342(12648192, (byte)-72);
            } else {
               var10 = class173.method3342(16776960, (byte)-115);
            }

            var6 = var7 + var10 + "  (level-" + var0.field832 + ")" + var0.field825[2];
         } else {
            var6 = var0.field825[0] + var0.field823 + var0.field825[1] + "  (skill-" + var0.field827 + ")" + var0.field825[2];
         }

         int var11;
         if (client.field923 == 1) {
            class164.method3228("Use", client.field1010 + " -> " + class173.method3342(16777215, (byte)-80) + var6, 14, var1, var2, var3, (byte)-61);
         } else if (client.field1011) {
            if ((class241.field2799 & 8) == 8) {
               class164.method3228(client.field956, client.field1015 + " -> " + class173.method3342(16777215, (byte)-83) + var6, 15, var1, var2, var3, (byte)-70);
            }
         } else {
            for(var11 = 7; var11 >= 0; --var11) {
               if (client.field979[var11] != null) {
                  short var12 = 0;
                  if (client.field979[var11].equalsIgnoreCase("Attack")) {
                     if (class89.field1334 == client.field882) {
                        continue;
                     }

                     if (class89.field1332 == client.field882 || client.field882 == class89.field1336 && var0.field832 > class12.field259.field832) {
                        var12 = 2000;
                     }

                     if (class12.field259.field840 != 0 && var0.field840 != 0) {
                        if (var0.field840 == class12.field259.field840) {
                           var12 = 2000;
                        } else {
                           var12 = 0;
                        }
                     }
                  } else if (client.field963[var11]) {
                     var12 = 2000;
                  }

                  boolean var13 = false;
                  var5 = client.field868[var11] + var12;
                  class164.method3228(client.field979[var11], class173.method3342(16777215, (byte)-96) + var6, var5, var1, var2, var3, (byte)-36);
               }
            }
         }

         for(var11 = 0; var11 < client.field992; ++var11) {
            if (client.field871[var11] == 23) {
               client.field998[var11] = class173.method3342(16777215, (byte)-2) + var6;
               break;
            }
         }
      }

   }

   static int method521(int var0, class96 var1, boolean var2, int var3) {
      int var4;
      if (var0 == 6600) {
         var4 = class237.field2769;
         int var18 = (class12.field259.field1185 >> 7) + class184.field2498;
         int var21 = (class12.field259.field1209 >> 7) + class4.field28;
         class150.method3134((byte)23).method6021(var4, var18, var21, true, -1528203411);
         return 1;
      } else {
         class32 var5;
         if (var0 == 6601) {
            var4 = class81.field1272[--class135.field1964];
            String var19 = "";
            var5 = class150.method3134((byte)-27).method6023(var4, (byte)-29);
            if (var5 != null) {
               var19 = var5.method320((byte)58);
            }

            class81.field1281[++class77.field1233 - 1] = var19;
            return 1;
         } else if (var0 == 6602) {
            var4 = class81.field1272[--class135.field1964];
            class150.method3134((byte)35).method6026(var4, 2097660034);
            return 1;
         } else if (var0 == 6603) {
            class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)12).method6036(-1560261993);
            return 1;
         } else if (var0 == 6604) {
            var4 = class81.field1272[--class135.field1964];
            class150.method3134((byte)54).method6133(var4, (byte)-19);
            return 1;
         } else if (var0 == 6605) {
            class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)76).method6038((byte)10) ? 1 : 0;
            return 1;
         } else {
            class238 var6;
            if (var0 == 6606) {
               var6 = new class238(class81.field1272[--class135.field1964]);
               class150.method3134((byte)-17).method6097(var6.field2774, var6.field2776, 823215735);
               return 1;
            } else if (var0 == 6607) {
               var6 = new class238(class81.field1272[--class135.field1964]);
               class150.method3134((byte)-79).method6143(var6.field2774, var6.field2776, -129635329);
               return 1;
            } else if (var0 == 6608) {
               var6 = new class238(class81.field1272[--class135.field1964]);
               class150.method3134((byte)-113).method6042(var6.field2779, var6.field2774, var6.field2776, 1279331054);
               return 1;
            } else if (var0 == 6609) {
               var6 = new class238(class81.field1272[--class135.field1964]);
               class150.method3134((byte)47).method6196(var6.field2779, var6.field2774, var6.field2776, -1285173091);
               return 1;
            } else if (var0 == 6610) {
               class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)-83).method6181(-2128919966);
               class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)-30).method6081((byte)0);
               return 1;
            } else {
               class32 var7;
               if (var0 == 6611) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = class150.method3134((byte)-59).method6023(var4, (byte)-71);
                  if (var7 == null) {
                     class81.field1272[++class135.field1964 - 1] = 0;
                  } else {
                     class81.field1272[++class135.field1964 - 1] = var7.method357(-1301380918).method4382((byte)-20);
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = class150.method3134((byte)-30).method6023(var4, (byte)-40);
                  if (var7 == null) {
                     class81.field1272[++class135.field1964 - 1] = 0;
                     class81.field1272[++class135.field1964 - 1] = 0;
                  } else {
                     class81.field1272[++class135.field1964 - 1] = (var7.method319(-357714868) - var7.method318((byte)0) + 1) * 64;
                     class81.field1272[++class135.field1964 - 1] = (var7.method313(-249777036) - var7.method373(-304907419) + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = class150.method3134((byte)61).method6023(var4, (byte)-20);
                  if (var7 == null) {
                     class81.field1272[++class135.field1964 - 1] = 0;
                     class81.field1272[++class135.field1964 - 1] = 0;
                     class81.field1272[++class135.field1964 - 1] = 0;
                     class81.field1272[++class135.field1964 - 1] = 0;
                  } else {
                     class81.field1272[++class135.field1964 - 1] = var7.method318((byte)0) * 64;
                     class81.field1272[++class135.field1964 - 1] = var7.method373(-238736094) * 64;
                     class81.field1272[++class135.field1964 - 1] = var7.method319(-357714868) * 64 + 64 - 1;
                     class81.field1272[++class135.field1964 - 1] = var7.method313(1830950544) * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = class150.method3134((byte)-4).method6023(var4, (byte)-56);
                  if (var7 == null) {
                     class81.field1272[++class135.field1964 - 1] = -1;
                  } else {
                     class81.field1272[++class135.field1964 - 1] = var7.method352(-1822856889);
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var6 = class150.method3134((byte)-14).method6053(-1324206859);
                  if (var6 == null) {
                     class81.field1272[++class135.field1964 - 1] = -1;
                     class81.field1272[++class135.field1964 - 1] = -1;
                  } else {
                     class81.field1272[++class135.field1964 - 1] = var6.field2774;
                     class81.field1272[++class135.field1964 - 1] = var6.field2776;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)-92).method6131(539586463);
                  return 1;
               } else if (var0 == 6617) {
                  var6 = new class238(class81.field1272[--class135.field1964]);
                  var7 = class150.method3134((byte)-112).method6024(-1864187490);
                  if (var7 == null) {
                     class81.field1272[++class135.field1964 - 1] = -1;
                     class81.field1272[++class135.field1964 - 1] = -1;
                     return 1;
                  } else {
                     int[] var20 = var7.method309(var6.field2779, var6.field2774, var6.field2776, 924008245);
                     if (var20 == null) {
                        class81.field1272[++class135.field1964 - 1] = -1;
                        class81.field1272[++class135.field1964 - 1] = -1;
                     } else {
                        class81.field1272[++class135.field1964 - 1] = var20[0];
                        class81.field1272[++class135.field1964 - 1] = var20[1];
                     }

                     return 1;
                  }
               } else {
                  class238 var8;
                  if (var0 == 6618) {
                     var6 = new class238(class81.field1272[--class135.field1964]);
                     var7 = class150.method3134((byte)-27).method6024(-1953926908);
                     if (var7 == null) {
                        class81.field1272[++class135.field1964 - 1] = -1;
                        class81.field1272[++class135.field1964 - 1] = -1;
                        return 1;
                     } else {
                        var8 = var7.method354(var6.field2774, var6.field2776, 1095448979);
                        if (var8 == null) {
                           class81.field1272[++class135.field1964 - 1] = -1;
                        } else {
                           class81.field1272[++class135.field1964 - 1] = var8.method4382((byte)-78);
                        }

                        return 1;
                     }
                  } else {
                     int var9;
                     int var10;
                     int var11;
                     class238 var12;
                     class238 var13;
                     if (var0 == 6619) {
                        class135.field1964 -= 2;
                        var4 = class81.field1272[class135.field1964];
                        var13 = new class238(class81.field1272[class135.field1964 + 1]);
                        var5 = class150.method3134((byte)-47).method6023(var4, (byte)-26);
                        var9 = class12.field259.field842;
                        var10 = (class12.field259.field1185 >> 7) + class184.field2498;
                        var11 = (class12.field259.field1209 >> 7) + class4.field28;
                        var12 = new class238(var9, var10, var11);
                        class150.method3134((byte)122).method6202(var5, var12, var13, false, (byte)90);
                        return 1;
                     } else if (var0 == 6620) {
                        class135.field1964 -= 2;
                        var4 = class81.field1272[class135.field1964];
                        var13 = new class238(class81.field1272[class135.field1964 + 1]);
                        var5 = class150.method3134((byte)-57).method6023(var4, (byte)-127);
                        var9 = class12.field259.field842;
                        var10 = (class12.field259.field1185 >> 7) + class184.field2498;
                        var11 = (class12.field259.field1209 >> 7) + class4.field28;
                        var12 = new class238(var9, var10, var11);
                        class150.method3134((byte)-20).method6202(var5, var12, var13, true, (byte)74);
                        return 1;
                     } else if (var0 == 6621) {
                        class135.field1964 -= 2;
                        var4 = class81.field1272[class135.field1964];
                        var13 = new class238(class81.field1272[class135.field1964 + 1]);
                        var5 = class150.method3134((byte)87).method6023(var4, (byte)-34);
                        if (var5 == null) {
                           class81.field1272[++class135.field1964 - 1] = 0;
                           return 1;
                        } else {
                           class81.field1272[++class135.field1964 - 1] = var5.method307(var13.field2779, var13.field2774, var13.field2776, (byte)-45) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)59).method6173(-931620287);
                        class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)36).method6084(-500206409);
                        return 1;
                     } else if (var0 == 6623) {
                        var6 = new class238(class81.field1272[--class135.field1964]);
                        var7 = class150.method3134((byte)-97).method6020(var6.field2779, var6.field2774, var6.field2776, (byte)34);
                        if (var7 == null) {
                           class81.field1272[++class135.field1964 - 1] = -1;
                        } else {
                           class81.field1272[++class135.field1964 - 1] = var7.method321(-1306418936);
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        class150.method3134((byte)75).method6030(class81.field1272[--class135.field1964], -112301360);
                        return 1;
                     } else if (var0 == 6625) {
                        class150.method3134((byte)91).method6050((byte)4);
                        return 1;
                     } else if (var0 == 6626) {
                        class150.method3134((byte)-39).method6051(class81.field1272[--class135.field1964], 518060547);
                        return 1;
                     } else if (var0 == 6627) {
                        class150.method3134((byte)-111).method6052((byte)10);
                        return 1;
                     } else {
                        boolean var14;
                        if (var0 == 6628) {
                           var14 = class81.field1272[--class135.field1964] == 1;
                           class150.method3134((byte)-67).method6066(var14, 2145323297);
                           return 1;
                        } else if (var0 == 6629) {
                           var4 = class81.field1272[--class135.field1964];
                           class150.method3134((byte)82).method6054(var4, 2065525415);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = class81.field1272[--class135.field1964];
                           class150.method3134((byte)62).method6075(var4, 1901239654);
                           return 1;
                        } else if (var0 == 6631) {
                           class150.method3134((byte)12).method6056(17274531);
                           return 1;
                        } else if (var0 == 6632) {
                           var14 = class81.field1272[--class135.field1964] == 1;
                           class150.method3134((byte)-54).method6057(var14, 1170625294);
                           return 1;
                        } else {
                           boolean var15;
                           if (var0 == 6633) {
                              class135.field1964 -= 2;
                              var4 = class81.field1272[class135.field1964];
                              var15 = class81.field1272[class135.field1964 + 1] == 1;
                              class150.method3134((byte)1).method6058(var4, var15, (byte)63);
                              return 1;
                           } else if (var0 == 6634) {
                              class135.field1964 -= 2;
                              var4 = class81.field1272[class135.field1964];
                              var15 = class81.field1272[class135.field1964 + 1] == 1;
                              class150.method3134((byte)76).method6059(var4, var15, 554929871);
                              return 1;
                           } else if (var0 == 6635) {
                              class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)57).method6060(1596985739) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var4 = class81.field1272[--class135.field1964];
                              class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)25).method6061(var4, -185339468) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var4 = class81.field1272[--class135.field1964];
                              class81.field1272[++class135.field1964 - 1] = class150.method3134((byte)73).method6062(var4, -1565500085) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class135.field1964 -= 2;
                              var4 = class81.field1272[class135.field1964];
                              var13 = new class238(class81.field1272[class135.field1964 + 1]);
                              var8 = class150.method3134((byte)-8).method6065(var4, var13, -881888672);
                              if (var8 == null) {
                                 class81.field1272[++class135.field1964 - 1] = -1;
                              } else {
                                 class81.field1272[++class135.field1964 - 1] = var8.method4382((byte)-7);
                              }

                              return 1;
                           } else {
                              class40 var16;
                              if (var0 == 6639) {
                                 var16 = class150.method3134((byte)36).method6080(1311190374);
                                 if (var16 == null) {
                                    class81.field1272[++class135.field1964 - 1] = -1;
                                    class81.field1272[++class135.field1964 - 1] = -1;
                                 } else {
                                    class81.field1272[++class135.field1964 - 1] = var16.field510;
                                    class81.field1272[++class135.field1964 - 1] = var16.field512.method4382((byte)-118);
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var16 = class150.method3134((byte)-2).method6068(-1978457448);
                                 if (var16 == null) {
                                    class81.field1272[++class135.field1964 - 1] = -1;
                                    class81.field1272[++class135.field1964 - 1] = -1;
                                 } else {
                                    class81.field1272[++class135.field1964 - 1] = var16.field510;
                                    class81.field1272[++class135.field1964 - 1] = var16.field512.method4382((byte)-20);
                                 }

                                 return 1;
                              } else {
                                 class269 var17;
                                 if (var0 == 6693) {
                                    var4 = class81.field1272[--class135.field1964];
                                    var17 = class269.field3471[var4];
                                    if (var17.field3455 == null) {
                                       class81.field1281[++class77.field1233 - 1] = "";
                                    } else {
                                       class81.field1281[++class77.field1233 - 1] = var17.field3455;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = class81.field1272[--class135.field1964];
                                    var17 = class269.field3471[var4];
                                    class81.field1272[++class135.field1964 - 1] = var17.field3449;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var4 = class81.field1272[--class135.field1964];
                                    var17 = class269.field3471[var4];
                                    if (var17 == null) {
                                       class81.field1272[++class135.field1964 - 1] = -1;
                                    } else {
                                       class81.field1272[++class135.field1964 - 1] = var17.field3463;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var4 = class81.field1272[--class135.field1964];
                                    var17 = class269.field3471[var4];
                                    if (var17 == null) {
                                       class81.field1272[++class135.field1964 - 1] = -1;
                                    } else {
                                       class81.field1272[++class135.field1964 - 1] = var17.field3470;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    class81.field1272[++class135.field1964 - 1] = class36.field478.field573;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    class81.field1272[++class135.field1964 - 1] = class36.field478.field576.method4382((byte)-7);
                                    return 1;
                                 } else if (var0 == 6699) {
                                    class81.field1272[++class135.field1964 - 1] = class36.field478.field574.method4382((byte)-30);
                                    return 1;
                                 } else {
                                    return 2;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static final void method524(int var0, int var1, int var2, int var3, int var4) {
      if (client.field937) {
         if (client.field959 == 1) {
            class12.field257[client.field958 / 100].method5865(client.field961 - 8, client.field957 - 8);
         }

         if (client.field959 == 2) {
            class12.field257[client.field958 / 100 + 4].method5865(client.field961 - 8, client.field957 - 8);
         }
      }

      class55.method827(1326421108);
   }
}

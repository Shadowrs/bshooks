import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Iterator;

public final class class54 extends Canvas {
   public static short[][] field629;
   static int[] field633;
   static class100 field632;
   static String field627;
   static int field630;
   static class174 field628;
   Component field631;

   class54(Component var1) {
      this.field631 = var1;
   }

   public final void update(Graphics var1) {
      this.field631.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field631.paint(var1);
   }

   static void method824(int var0) {
      Iterator var1 = class95.field1432.iterator();

      while(var1.hasNext()) {
         class70 var2 = (class70)var1.next();
         var2.method1131(1953083949);
      }

   }

   static final void method826(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (client.field862 && var0 != class237.field2769) {
            return;
         }

         int var8 = 0;
         boolean var9 = true;
         boolean var10 = false;
         boolean var11 = false;
         if (var1 == 0) {
            var8 = class308.field3867.method2987(var0, var2, var3);
         }

         if (var1 == 1) {
            var8 = class308.field3867.method2903(var0, var2, var3);
         }

         if (var1 == 2) {
            var8 = class308.field3867.method2904(var0, var2, var3);
         }

         if (var1 == 3) {
            var8 = class308.field3867.method2905(var0, var2, var3);
         }

         int var12;
         if (var8 != 0) {
            var12 = class308.field3867.method3041(var0, var2, var3, var8);
            int var13 = var8 >> 14 & 32767;
            int var14 = var12 & 31;
            int var15 = var12 >> 6 & 3;
            class282 var16;
            if (var1 == 0) {
               class308.field3867.method2963(var0, var2, var3);
               var16 = class260.method4546(var13, 1488555300);
               if (var16.field3586 != 0) {
                  client.field1047[var0].method3374(var2, var3, var14, var15, var16.field3604, -216603749);
               }
            }

            if (var1 == 1) {
               class308.field3867.method2894(var0, var2, var3);
            }

            if (var1 == 2) {
               class308.field3867.method2974(var0, var2, var3);
               var16 = class260.method4546(var13, 2015066166);
               if (var2 + var16.field3601 > 103 || var3 + var16.field3601 > 103 || var2 + var16.field3602 > 103 || var3 + var16.field3602 > 103) {
                  return;
               }

               if (var16.field3586 != 0) {
                  client.field1047[var0].method3375(var2, var3, var16.field3601, var16.field3602, var15, var16.field3604, -1469175466);
               }
            }

            if (var1 == 3) {
               class308.field3867.method3011(var0, var2, var3);
               var16 = class260.method4546(var13, -2068440506);
               if (var16.field3586 == 1) {
                  client.field1047[var0].method3376(var2, var3, -1667264964);
               }
            }
         }

         if (var4 >= 0) {
            var12 = var0;
            if (var0 < 3 && (class62.field720[1][var2][var3] & 2) == 2) {
               var12 = var0 + 1;
            }

            class137 var34 = class308.field3867;
            class176 var35 = client.field1047[var0];
            class282 var36 = class260.method4546(var4, -117008373);
            int var17;
            int var37;
            if (var5 != 1 && var5 != 3) {
               var37 = var36.field3601;
               var17 = var36.field3602;
            } else {
               var37 = var36.field3602;
               var17 = var36.field3601;
            }

            int var18;
            int var19;
            if (var37 + var2 <= 104) {
               var18 = (var37 >> 1) + var2;
               var19 = var2 + (var37 + 1 >> 1);
            } else {
               var18 = var2;
               var19 = var2 + 1;
            }

            int var20;
            int var21;
            if (var3 + var17 <= 104) {
               var20 = var3 + (var17 >> 1);
               var21 = var3 + (var17 + 1 >> 1);
            } else {
               var20 = var3;
               var21 = var3 + 1;
            }

            int[][] var22 = class62.field728[var12];
            int var23 = var22[var19][var21] + var22[var18][var21] + var22[var19][var20] + var22[var18][var20] >> 2;
            int var24 = (var2 << 7) + (var37 << 6);
            int var25 = (var3 << 7) + (var17 << 6);
            int var26 = (var3 << 7) + var2 + (var4 << 14) + 1073741824;
            if (var36.field3612 == 0) {
               var26 -= Integer.MIN_VALUE;
            }

            int var27 = (var5 << 6) + var6;
            if (var36.field3618 == 1) {
               var27 += 256;
            }

            Object var28;
            if (var6 == 22) {
               if (var36.field3592 == -1 && var36.field3627 == null) {
                  var28 = var36.method5005(22, var5, var22, var24, var23, var25, -771632370);
               } else {
                  var28 = new class97(var4, 22, var5, var12, var2, var3, var36.field3592, true, (class139)null);
               }

               var34.method2965(var0, var2, var3, var23, (class139)var28, var26, var27);
               if (var36.field3586 == 1) {
                  var35.method3399(var2, var3, -1316079695);
               }
            } else if (var6 != 10 && var6 != 11) {
               if (var6 >= 12) {
                  if (var36.field3592 == -1 && var36.field3627 == null) {
                     var28 = var36.method5005(var6, var5, var22, var24, var23, var25, -786872482);
                  } else {
                     var28 = new class97(var4, var6, var5, var12, var2, var3, var36.field3592, true, (class139)null);
                  }

                  var34.method2896(var0, var2, var3, var23, 1, 1, (class139)var28, 0, var26, var27);
                  if (var36.field3586 != 0) {
                     var35.method3369(var2, var3, var37, var17, var36.field3604, (byte)-20);
                  }
               } else if (var6 == 0) {
                  if (var36.field3592 == -1 && var36.field3627 == null) {
                     var28 = var36.method5005(0, var5, var22, var24, var23, var25, 1515328882);
                  } else {
                     var28 = new class97(var4, 0, var5, var12, var2, var3, var36.field3592, true, (class139)null);
                  }

                  var34.method2884(var0, var2, var3, var23, (class139)var28, (class139)null, class62.field727[var5], 0, var26, var27);
                  if (var36.field3586 != 0) {
                     var35.method3385(var2, var3, var6, var5, var36.field3604, (byte)-18);
                  }
               } else if (var6 == 1) {
                  if (var36.field3592 == -1 && var36.field3627 == null) {
                     var28 = var36.method5005(1, var5, var22, var24, var23, var25, 506515502);
                  } else {
                     var28 = new class97(var4, 1, var5, var12, var2, var3, var36.field3592, true, (class139)null);
                  }

                  var34.method2884(var0, var2, var3, var23, (class139)var28, (class139)null, class62.field731[var5], 0, var26, var27);
                  if (var36.field3586 != 0) {
                     var35.method3385(var2, var3, var6, var5, var36.field3604, (byte)-31);
                  }
               } else {
                  int var29;
                  Object var30;
                  if (var6 == 2) {
                     var29 = var5 + 1 & 3;
                     Object var31;
                     if (var36.field3592 == -1 && var36.field3627 == null) {
                        var31 = var36.method5005(2, var5 + 4, var22, var24, var23, var25, -336560878);
                        var30 = var36.method5005(2, var29, var22, var24, var23, var25, -588012410);
                     } else {
                        var31 = new class97(var4, 2, var5 + 4, var12, var2, var3, var36.field3592, true, (class139)null);
                        var30 = new class97(var4, 2, var29, var12, var2, var3, var36.field3592, true, (class139)null);
                     }

                     var34.method2884(var0, var2, var3, var23, (class139)var31, (class139)var30, class62.field727[var5], class62.field727[var29], var26, var27);
                     if (var36.field3586 != 0) {
                        var35.method3385(var2, var3, var6, var5, var36.field3604, (byte)-58);
                     }
                  } else if (var6 == 3) {
                     if (var36.field3592 == -1 && var36.field3627 == null) {
                        var28 = var36.method5005(3, var5, var22, var24, var23, var25, -807736828);
                     } else {
                        var28 = new class97(var4, 3, var5, var12, var2, var3, var36.field3592, true, (class139)null);
                     }

                     var34.method2884(var0, var2, var3, var23, (class139)var28, (class139)null, class62.field731[var5], 0, var26, var27);
                     if (var36.field3586 != 0) {
                        var35.method3385(var2, var3, var6, var5, var36.field3604, (byte)-10);
                     }
                  } else if (var6 == 9) {
                     if (var36.field3592 == -1 && var36.field3627 == null) {
                        var28 = var36.method5005(var6, var5, var22, var24, var23, var25, 1860967904);
                     } else {
                        var28 = new class97(var4, var6, var5, var12, var2, var3, var36.field3592, true, (class139)null);
                     }

                     var34.method2896(var0, var2, var3, var23, 1, 1, (class139)var28, 0, var26, var27);
                     if (var36.field3586 != 0) {
                        var35.method3369(var2, var3, var37, var17, var36.field3604, (byte)-39);
                     }
                  } else if (var6 == 4) {
                     if (var36.field3592 == -1 && var36.field3627 == null) {
                        var28 = var36.method5005(4, var5, var22, var24, var23, var25, -219552494);
                     } else {
                        var28 = new class97(var4, 4, var5, var12, var2, var3, var36.field3592, true, (class139)null);
                     }

                     var34.method2885(var0, var2, var3, var23, (class139)var28, (class139)null, class62.field727[var5], 0, 0, 0, var26, var27);
                  } else {
                     int var38;
                     if (var6 == 5) {
                        var29 = 16;
                        var38 = var34.method2987(var0, var2, var3);
                        if (var38 != 0) {
                           var29 = class260.method4546(var38 >> 14 & 32767, -1250436949).field3610;
                        }

                        if (var36.field3592 == -1 && var36.field3627 == null) {
                           var30 = var36.method5005(4, var5, var22, var24, var23, var25, 1006173989);
                        } else {
                           var30 = new class97(var4, 4, var5, var12, var2, var3, var36.field3592, true, (class139)null);
                        }

                        var34.method2885(var0, var2, var3, var23, (class139)var30, (class139)null, class62.field727[var5], 0, var29 * class62.field730[var5], var29 * class62.field726[var5], var26, var27);
                     } else if (var6 == 6) {
                        var29 = 8;
                        var38 = var34.method2987(var0, var2, var3);
                        if (var38 != 0) {
                           var29 = class260.method4546(var38 >> 14 & 32767, 473427534).field3610 / 2;
                        }

                        if (var36.field3592 == -1 && var36.field3627 == null) {
                           var30 = var36.method5005(4, var5 + 4, var22, var24, var23, var25, 593237618);
                        } else {
                           var30 = new class97(var4, 4, var5 + 4, var12, var2, var3, var36.field3592, true, (class139)null);
                        }

                        var34.method2885(var0, var2, var3, var23, (class139)var30, (class139)null, 256, var5, var29 * class62.field723[var5], var29 * class62.field732[var5], var26, var27);
                     } else if (var6 == 7) {
                        var38 = var5 + 2 & 3;
                        if (var36.field3592 == -1 && var36.field3627 == null) {
                           var28 = var36.method5005(4, var38 + 4, var22, var24, var23, var25, 889803778);
                        } else {
                           var28 = new class97(var4, 4, var38 + 4, var12, var2, var3, var36.field3592, true, (class139)null);
                        }

                        var34.method2885(var0, var2, var3, var23, (class139)var28, (class139)null, 256, var38, 0, 0, var26, var27);
                     } else if (var6 == 8) {
                        var29 = 8;
                        var38 = var34.method2987(var0, var2, var3);
                        if (var38 != 0) {
                           var29 = class260.method4546(var38 >> 14 & 32767, 960858506).field3610 / 2;
                        }

                        int var32 = var5 + 2 & 3;
                        Object var33;
                        if (var36.field3592 == -1 && var36.field3627 == null) {
                           var30 = var36.method5005(4, var5 + 4, var22, var24, var23, var25, 382281489);
                           var33 = var36.method5005(4, var32 + 4, var22, var24, var23, var25, -382995422);
                        } else {
                           var30 = new class97(var4, 4, var5 + 4, var12, var2, var3, var36.field3592, true, (class139)null);
                           var33 = new class97(var4, 4, var32 + 4, var12, var2, var3, var36.field3592, true, (class139)null);
                        }

                        var34.method2885(var0, var2, var3, var23, (class139)var30, (class139)var33, 256, var5, var29 * class62.field723[var5], var29 * class62.field732[var5], var26, var27);
                     }
                  }
               }
            } else {
               if (var36.field3592 == -1 && var36.field3627 == null) {
                  var28 = var36.method5005(10, var5, var22, var24, var23, var25, -1080008);
               } else {
                  var28 = new class97(var4, 10, var5, var12, var2, var3, var36.field3592, true, (class139)null);
               }

               if (var28 != null) {
                  var34.method2896(var0, var2, var3, var23, var37, var17, (class139)var28, var6 == 11 ? 256 : 0, var26, var27);
               }

               if (var36.field3586 != 0) {
                  var35.method3369(var2, var3, var37, var17, var36.field3604, (byte)24);
               }
            }
         }
      }

   }

   public static void method819(int var0, int var1, int var2) {
      class277 var3 = class290.method5206(var0, -796164819);
      int var4 = var3.field3535;
      int var5 = var3.field3538;
      int var6 = var3.field3539;
      int var7 = class237.field2771[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      class237.field2770[var4] = class237.field2770[var4] & ~var7 | var1 << var5 & var7;
   }
}

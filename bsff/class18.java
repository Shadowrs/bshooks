import java.util.Comparator;

final class class18 implements Comparator {
   static class263 field303;
   static int field306;

   int method145(class14 var1, class14 var2, int var3) {
      return var1.method92(1319147053).compareTo(var2.method92(1796086983));
   }

   public int compare(Object var1, Object var2) {
      return this.method145((class14)var1, (class14)var2, -1200787787);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method155(int var0) {
      class286.field3739.method3933();
      class81.method1763(-501563263);
      class57.method859(822151177);
      class282.field3600.method3933();
      class282.field3609.method3933();
      class282.field3590.method3933();
      class282.field3591.method3933();
      class250.method4519(-2020284291);
      class47.method745(1151572383);
      class287.field3751.method3933();
      class287.field3752.method3933();
      class245.method4508(585193291);
      class145.method3096((byte)28);
      class272.method4810((byte)39);
      class127.method2667(-2035506082);
      class275.field3525.method3933();
      class275.field3518.method3933();
      class76.method1606(-1483104103);
      class29.method272(-1197141515);
      class269.field3451.method3933();
      class239.field2785.method3933();
      class17.method140(-913678176);
      ((class123)class134.field1944).method2561(179534492);
      class96.field1449.method3933();
      class169.field2218.method4567((short)-23737);
      class19.field311.method4567((short)10085);
      class55.field635.method4567((short)-1074);
      class44.field552.method4567((short)2509);
      class1.field11.method4567((short)-5941);
      class1.field12.method4567((short)23334);
      class44.field548.method4567((short)-14310);
      class44.field549.method4567((short)5317);
      class74.field1147.method4567((short)7342);
      client.field1003.method4567((short)11021);
      class157.field2147.method4567((short)4935);
      class34.field445.method4567((short)-24727);
   }

   public static int method144(int var0, int var1, int var2, class178 var3, class176 var4, boolean var5, int[] var6, int[] var7, byte var8) {
      int var9;
      int var10;
      for(var10 = 0; var10 < 128; ++var10) {
         for(var9 = 0; var9 < 128; ++var9) {
            class177.field2274[var10][var9] = 0;
            class177.field2275[var10][var9] = 99999999;
         }
      }

      int var11;
      byte var12;
      byte var13;
      int var14;
      int var15;
      byte var16;
      int var17;
      int[][] var18;
      int var19;
      int var20;
      int var21;
      boolean var22;
      boolean var23;
      int var24;
      int var25;
      int var26;
      if (var2 == 1) {
         var10 = var0;
         var11 = var1;
         var12 = 64;
         var13 = 64;
         var14 = var0 - var12;
         var15 = var1 - var13;
         class177.field2274[var12][var13] = 99;
         class177.field2275[var12][var13] = 0;
         var16 = 0;
         var17 = 0;
         class177.field2272[var16] = var0;
         var26 = var16 + 1;
         class177.field2276[var16] = var1;
         var18 = var4.field2270;

         label336: {
            while(var17 != var26) {
               var10 = class177.field2272[var17];
               var11 = class177.field2276[var17];
               var17 = var17 + 1 & 4095;
               var24 = var10 - var14;
               var25 = var11 - var15;
               var19 = var10 - var4.field2266;
               var20 = var11 - var4.field2267;
               if (var3.vmethod3410(1, var10, var11, var4, (byte)78)) {
                  class122.field1686 = var10;
                  class177.field2277 = var11;
                  var23 = true;
                  break label336;
               }

               var21 = class177.field2275[var24][var25] + 1;
               if (var24 > 0 && class177.field2274[var24 - 1][var25] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) {
                  class177.field2272[var26] = var10 - 1;
                  class177.field2276[var26] = var11;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 - 1][var25] = 2;
                  class177.field2275[var24 - 1][var25] = var21;
               }

               if (var24 < 127 && class177.field2274[var24 + 1][var25] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) {
                  class177.field2272[var26] = var10 + 1;
                  class177.field2276[var26] = var11;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 + 1][var25] = 8;
                  class177.field2275[var24 + 1][var25] = var21;
               }

               if (var25 > 0 && class177.field2274[var24][var25 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
                  class177.field2272[var26] = var10;
                  class177.field2276[var26] = var11 - 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24][var25 - 1] = 1;
                  class177.field2275[var24][var25 - 1] = var21;
               }

               if (var25 < 127 && class177.field2274[var24][var25 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
                  class177.field2272[var26] = var10;
                  class177.field2276[var26] = var11 + 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24][var25 + 1] = 4;
                  class177.field2275[var24][var25 + 1] = var21;
               }

               if (var24 > 0 && var25 > 0 && class177.field2274[var24 - 1][var25 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
                  class177.field2272[var26] = var10 - 1;
                  class177.field2276[var26] = var11 - 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 - 1][var25 - 1] = 3;
                  class177.field2275[var24 - 1][var25 - 1] = var21;
               }

               if (var24 < 127 && var25 > 0 && class177.field2274[var24 + 1][var25 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
                  class177.field2272[var26] = var10 + 1;
                  class177.field2276[var26] = var11 - 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 + 1][var25 - 1] = 9;
                  class177.field2275[var24 + 1][var25 - 1] = var21;
               }

               if (var24 > 0 && var25 < 127 && class177.field2274[var24 - 1][var25 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
                  class177.field2272[var26] = var10 - 1;
                  class177.field2276[var26] = var11 + 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 - 1][var25 + 1] = 6;
                  class177.field2275[var24 - 1][var25 + 1] = var21;
               }

               if (var24 < 127 && var25 < 127 && class177.field2274[var24 + 1][var25 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
                  class177.field2272[var26] = var10 + 1;
                  class177.field2276[var26] = var11 + 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 + 1][var25 + 1] = 12;
                  class177.field2275[var24 + 1][var25 + 1] = var21;
               }
            }

            class122.field1686 = var10;
            class177.field2277 = var11;
            var23 = false;
         }

         var22 = var23;
      } else if (var2 == 2) {
         var10 = var0;
         var11 = var1;
         var12 = 64;
         var13 = 64;
         var14 = var0 - var12;
         var15 = var1 - var13;
         class177.field2274[var12][var13] = 99;
         class177.field2275[var12][var13] = 0;
         var16 = 0;
         var17 = 0;
         class177.field2272[var16] = var0;
         var26 = var16 + 1;
         class177.field2276[var16] = var1;
         var18 = var4.field2270;

         label325: {
            while(var26 != var17) {
               var10 = class177.field2272[var17];
               var11 = class177.field2276[var17];
               var17 = var17 + 1 & 4095;
               var24 = var10 - var14;
               var25 = var11 - var15;
               var19 = var10 - var4.field2266;
               var20 = var11 - var4.field2267;
               if (var3.vmethod3410(2, var10, var11, var4, (byte)78)) {
                  class122.field1686 = var10;
                  class177.field2277 = var11;
                  var23 = true;
                  break label325;
               }

               var21 = class177.field2275[var24][var25] + 1;
               if (var24 > 0 && class177.field2274[var24 - 1][var25] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0) {
                  class177.field2272[var26] = var10 - 1;
                  class177.field2276[var26] = var11;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 - 1][var25] = 2;
                  class177.field2275[var24 - 1][var25] = var21;
               }

               if (var24 < 126 && class177.field2274[var24 + 1][var25] == 0 && (var18[var19 + 2][var20] & 19136899) == 0 && (var18[var19 + 2][var20 + 1] & 19136992) == 0) {
                  class177.field2272[var26] = var10 + 1;
                  class177.field2276[var26] = var11;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 + 1][var25] = 8;
                  class177.field2275[var24 + 1][var25] = var21;
               }

               if (var25 > 0 && class177.field2274[var24][var25 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0) {
                  class177.field2272[var26] = var10;
                  class177.field2276[var26] = var11 - 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24][var25 - 1] = 1;
                  class177.field2275[var24][var25 - 1] = var21;
               }

               if (var25 < 126 && class177.field2274[var24][var25 + 1] == 0 && (var18[var19][var20 + 2] & 19136824) == 0 && (var18[var19 + 1][var20 + 2] & 19136992) == 0) {
                  class177.field2272[var26] = var10;
                  class177.field2276[var26] = var11 + 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24][var25 + 1] = 4;
                  class177.field2275[var24][var25 + 1] = var21;
               }

               if (var24 > 0 && var25 > 0 && class177.field2274[var24 - 1][var25 - 1] == 0 && (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19][var20 - 1] & 19136911) == 0) {
                  class177.field2272[var26] = var10 - 1;
                  class177.field2276[var26] = var11 - 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 - 1][var25 - 1] = 3;
                  class177.field2275[var24 - 1][var25 - 1] = var21;
               }

               if (var24 < 126 && var25 > 0 && class177.field2274[var24 + 1][var25 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136911) == 0 && (var18[var19 + 2][var20 - 1] & 19136899) == 0 && (var18[var19 + 2][var20] & 19136995) == 0) {
                  class177.field2272[var26] = var10 + 1;
                  class177.field2276[var26] = var11 - 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 + 1][var25 - 1] = 9;
                  class177.field2275[var24 + 1][var25 - 1] = var21;
               }

               if (var24 > 0 && var25 < 126 && class177.field2274[var24 - 1][var25 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136830) == 0 && (var18[var19 - 1][var20 + 2] & 19136824) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) {
                  class177.field2272[var26] = var10 - 1;
                  class177.field2276[var26] = var11 + 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 - 1][var25 + 1] = 6;
                  class177.field2275[var24 - 1][var25 + 1] = var21;
               }

               if (var24 < 126 && var25 < 126 && class177.field2274[var24 + 1][var25 + 1] == 0 && (var18[var19 + 1][var20 + 2] & 19137016) == 0 && (var18[var19 + 2][var20 + 2] & 19136992) == 0 && (var18[var19 + 2][var20 + 1] & 19136995) == 0) {
                  class177.field2272[var26] = var10 + 1;
                  class177.field2276[var26] = var11 + 1;
                  var26 = var26 + 1 & 4095;
                  class177.field2274[var24 + 1][var25 + 1] = 12;
                  class177.field2275[var24 + 1][var25 + 1] = var21;
               }
            }

            class122.field1686 = var10;
            class177.field2277 = var11;
            var23 = false;
         }

         var22 = var23;
      } else {
         var22 = class46.method697(var0, var1, var2, var3, var4, 1960360835);
      }

      var9 = var0 - 64;
      var10 = var1 - 64;
      var11 = class122.field1686;
      var24 = class177.field2277;
      if (!var22) {
         var25 = Integer.MAX_VALUE;
         var14 = Integer.MAX_VALUE;
         byte var27 = 10;
         var26 = var3.field2283;
         var17 = var3.field2282;
         int var28 = var3.field2280;
         var19 = var3.field2281;

         for(var20 = var26 - var27; var20 <= var27 + var26; ++var20) {
            for(var21 = var17 - var27; var21 <= var17 + var27; ++var21) {
               int var29 = var20 - var9;
               int var30 = var21 - var10;
               if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class177.field2275[var29][var30] < 100) {
                  int var31 = 0;
                  if (var20 < var26) {
                     var31 = var26 - var20;
                  } else if (var20 > var28 + var26 - 1) {
                     var31 = var20 - (var28 + var26 - 1);
                  }

                  int var32 = 0;
                  if (var21 < var17) {
                     var32 = var17 - var21;
                  } else if (var21 > var19 + var17 - 1) {
                     var32 = var21 - (var17 + var19 - 1);
                  }

                  int var33 = var32 * var32 + var31 * var31;
                  if (var33 < var25 || var33 == var25 && class177.field2275[var29][var30] < var14) {
                     var25 = var33;
                     var14 = class177.field2275[var29][var30];
                     var11 = var20;
                     var24 = var21;
                  }
               }
            }
         }

         if (var25 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var11 && var24 == var1) {
         return 0;
      } else {
         var13 = 0;
         class177.field2272[var13] = var11;
         var25 = var13 + 1;
         class177.field2276[var13] = var24;

         for(var14 = var15 = class177.field2274[var11 - var9][var24 - var10]; var0 != var11 || var24 != var1; var14 = class177.field2274[var11 - var9][var24 - var10]) {
            if (var15 != var14) {
               var15 = var14;
               class177.field2272[var25] = var11;
               class177.field2276[var25++] = var24;
            }

            if ((var14 & 2) != 0) {
               ++var11;
            } else if ((var14 & 8) != 0) {
               --var11;
            }

            if ((var14 & 1) != 0) {
               ++var24;
            } else if ((var14 & 4) != 0) {
               --var24;
            }
         }

         var26 = 0;

         while(var25-- > 0) {
            var6[var26] = class177.field2272[var25];
            var7[var26++] = class177.field2276[var25];
            if (var26 >= var6.length) {
               break;
            }
         }

         return var26;
      }
   }

   static void method156(int var0, int var1, int var2, int var3, int var4) {
      class242 var5 = class181.method3420(var0, var1, 1557077525);
      if (var5 != null && var5.field2905 != null) {
         class68 var6 = new class68();
         var6.field780 = var5;
         var6.field782 = var5.field2905;
         class198.method3757(var6, 1826027637, false);
      }

      client.field1013 = var3;
      client.field1011 = true;
      class52.field623 = var0;
      client.field1012 = var1;
      class241.field2799 = var2;
      class30.method274(var5, -1463324822);
   }
}

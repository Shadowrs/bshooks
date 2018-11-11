public class class46 extends class28 {
   static class78 field564;
   int field561;
   int field562;
   int field559;
   int field560;

   int method687(int var1) {
      return this.field559;
   }

   boolean method674(int var1, int var2, int var3) {
      return var1 < this.field559 * 8 ? false : (var2 < this.field560 * 8 ? false : (var1 >= this.field559 * 8 + 8 ? false : var2 < this.field560 * 8 + 8));
   }

   int method679(byte var1) {
      return this.field560;
   }

   void method673(class194 var1, class194 var2, byte var3) {
      int var4 = var2.getUByte(514520751);
      if (var4 != class37.field482.field483) {
         throw new IllegalStateException("");
      } else {
         super.field392 = var2.getUByte(-84588763);
         super.field391 = var2.getUByte(-1463852580);
         super.field390 = var2.getUShort(-1208216487);
         super.field387 = var2.getUShort(-1208216487);
         this.field562 = var2.getUByte(-185629002);
         this.field561 = var2.getUByte(964656632);
         super.field386 = var2.getUShort(-1208216487);
         super.field389 = var2.getUShort(-1208216487);
         this.field559 = var2.getUByte(403480602);
         this.field560 = var2.getUByte(1321667750);
         super.field391 = Math.min(super.field391, 4);
         super.field388 = new short[1][64][64];
         super.field393 = new short[super.field391][64][64];
         super.field394 = new byte[super.field391][64][64];
         super.field395 = new byte[super.field391][64][64];
         super.field396 = new class31[super.field391][64][64][];
         if (var1.field2566.length != 0) {
            var4 = var1.getUByte(-1486167476);
            if (var4 != class36.field475.field474) {
               throw new IllegalStateException("");
            } else {
               int var5 = var1.getUByte(373383076);
               int var6 = var1.getUByte(-794060936);
               int var7 = var1.getUByte(-605719909);
               int var8 = var1.getUByte(1449993843);
               if (var5 == super.field386 && var6 == super.field389 && var7 == this.field559 && var8 == this.field560) {
                  for(int var9 = 0; var9 < 8; ++var9) {
                     for(int var10 = 0; var10 < 8; ++var10) {
                        this.method241(var9 + this.field559 * 8, var10 + this.field560 * 8, var1, 642814993);
                     }
                  }

               } else {
                  throw new IllegalStateException("");
               }
            }
         }
      }
   }

   int method676(byte var1) {
      return this.field562;
   }

   int method677(byte var1) {
      return this.field561;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class46)) {
         return false;
      } else {
         class46 var2 = (class46)var1;
         return super.field386 == var2.field386 && super.field389 == var2.field389 ? var2.field559 == this.field559 && this.field560 == var2.field560 : false;
      }
   }

   public int hashCode() {
      return super.field386 | super.field389 << 8 | this.field559 << 16 | this.field560 << 24;
   }

   static final boolean method697(int var0, int var1, int var2, class178 var3, class176 var4, int var5) {
      int var6 = var0;
      int var7 = var1;
      byte var8 = 64;
      byte var9 = 64;
      int var10 = var0 - var8;
      int var11 = var1 - var9;
      class177.field2274[var8][var9] = 99;
      class177.field2275[var8][var9] = 0;
      byte var12 = 0;
      int var13 = 0;
      class177.field2272[var12] = var0;
      int var14 = var12 + 1;
      class177.field2276[var12] = var1;
      int[][] var15 = var4.field2270;

      label204:
      while(var14 != var13) {
         var6 = class177.field2272[var13];
         var7 = class177.field2276[var13];
         var13 = var13 + 1 & 4095;
         int var20 = var6 - var10;
         int var21 = var7 - var11;
         int var16 = var6 - var4.field2266;
         int var17 = var7 - var4.field2267;
         if (var3.vmethod3410(var2, var6, var7, var4, (byte)116)) {
            class122.field1686 = var6;
            class177.field2277 = var7;
            return true;
         }

         int var18 = class177.field2275[var20][var21] + 1;
         int var19;
         if (var20 > 0 && class177.field2274[var20 - 1][var21] == 0 && (var15[var16 - 1][var17] & 19136782) == 0 && (var15[var16 - 1][var17 + var2 - 1] & 19136824) == 0) {
            var19 = 1;

            while(true) {
               if (var19 >= var2 - 1) {
                  class177.field2272[var14] = var6 - 1;
                  class177.field2276[var14] = var7;
                  var14 = var14 + 1 & 4095;
                  class177.field2274[var20 - 1][var21] = 2;
                  class177.field2275[var20 - 1][var21] = var18;
                  break;
               }

               if ((var15[var16 - 1][var17 + var19] & 19136830) != 0) {
                  break;
               }

               ++var19;
            }
         }

         if (var20 < 128 - var2 && class177.field2274[var20 + 1][var21] == 0 && (var15[var16 + var2][var17] & 19136899) == 0 && (var15[var16 + var2][var17 + var2 - 1] & 19136992) == 0) {
            var19 = 1;

            while(true) {
               if (var19 >= var2 - 1) {
                  class177.field2272[var14] = var6 + 1;
                  class177.field2276[var14] = var7;
                  var14 = var14 + 1 & 4095;
                  class177.field2274[var20 + 1][var21] = 8;
                  class177.field2275[var20 + 1][var21] = var18;
                  break;
               }

               if ((var15[var16 + var2][var19 + var17] & 19136995) != 0) {
                  break;
               }

               ++var19;
            }
         }

         if (var21 > 0 && class177.field2274[var20][var21 - 1] == 0 && (var15[var16][var17 - 1] & 19136782) == 0 && (var15[var16 + var2 - 1][var17 - 1] & 19136899) == 0) {
            var19 = 1;

            while(true) {
               if (var19 >= var2 - 1) {
                  class177.field2272[var14] = var6;
                  class177.field2276[var14] = var7 - 1;
                  var14 = var14 + 1 & 4095;
                  class177.field2274[var20][var21 - 1] = 1;
                  class177.field2275[var20][var21 - 1] = var18;
                  break;
               }

               if ((var15[var19 + var16][var17 - 1] & 19136911) != 0) {
                  break;
               }

               ++var19;
            }
         }

         if (var21 < 128 - var2 && class177.field2274[var20][var21 + 1] == 0 && (var15[var16][var17 + var2] & 19136824) == 0 && (var15[var16 + var2 - 1][var17 + var2] & 19136992) == 0) {
            var19 = 1;

            while(true) {
               if (var19 >= var2 - 1) {
                  class177.field2272[var14] = var6;
                  class177.field2276[var14] = var7 + 1;
                  var14 = var14 + 1 & 4095;
                  class177.field2274[var20][var21 + 1] = 4;
                  class177.field2275[var20][var21 + 1] = var18;
                  break;
               }

               if ((var15[var19 + var16][var17 + var2] & 19137016) != 0) {
                  break;
               }

               ++var19;
            }
         }

         if (var20 > 0 && var21 > 0 && class177.field2274[var20 - 1][var21 - 1] == 0 && (var15[var16 - 1][var17 - 1] & 19136782) == 0) {
            var19 = 1;

            while(true) {
               if (var19 >= var2) {
                  class177.field2272[var14] = var6 - 1;
                  class177.field2276[var14] = var7 - 1;
                  var14 = var14 + 1 & 4095;
                  class177.field2274[var20 - 1][var21 - 1] = 3;
                  class177.field2275[var20 - 1][var21 - 1] = var18;
                  break;
               }

               if ((var15[var16 - 1][var19 + (var17 - 1)] & 19136830) != 0 || (var15[var19 + (var16 - 1)][var17 - 1] & 19136911) != 0) {
                  break;
               }

               ++var19;
            }
         }

         if (var20 < 128 - var2 && var21 > 0 && class177.field2274[var20 + 1][var21 - 1] == 0 && (var15[var16 + var2][var17 - 1] & 19136899) == 0) {
            var19 = 1;

            while(true) {
               if (var19 >= var2) {
                  class177.field2272[var14] = var6 + 1;
                  class177.field2276[var14] = var7 - 1;
                  var14 = var14 + 1 & 4095;
                  class177.field2274[var20 + 1][var21 - 1] = 9;
                  class177.field2275[var20 + 1][var21 - 1] = var18;
                  break;
               }

               if ((var15[var16 + var2][var19 + (var17 - 1)] & 19136995) != 0 || (var15[var16 + var19][var17 - 1] & 19136911) != 0) {
                  break;
               }

               ++var19;
            }
         }

         if (var20 > 0 && var21 < 128 - var2 && class177.field2274[var20 - 1][var21 + 1] == 0 && (var15[var16 - 1][var17 + var2] & 19136824) == 0) {
            var19 = 1;

            while(true) {
               if (var19 >= var2) {
                  class177.field2272[var14] = var6 - 1;
                  class177.field2276[var14] = var7 + 1;
                  var14 = var14 + 1 & 4095;
                  class177.field2274[var20 - 1][var21 + 1] = 6;
                  class177.field2275[var20 - 1][var21 + 1] = var18;
                  break;
               }

               if ((var15[var16 - 1][var17 + var19] & 19136830) != 0 || (var15[var19 + (var16 - 1)][var17 + var2] & 19137016) != 0) {
                  break;
               }

               ++var19;
            }
         }

         if (var20 < 128 - var2 && var21 < 128 - var2 && class177.field2274[var20 + 1][var21 + 1] == 0 && (var15[var16 + var2][var17 + var2] & 19136992) == 0) {
            for(var19 = 1; var19 < var2; ++var19) {
               if ((var15[var19 + var16][var17 + var2] & 19137016) != 0 || (var15[var16 + var2][var17 + var19] & 19136995) != 0) {
                  continue label204;
               }
            }

            class177.field2272[var14] = var6 + 1;
            class177.field2276[var14] = var7 + 1;
            var14 = var14 + 1 & 4095;
            class177.field2274[var20 + 1][var21 + 1] = 12;
            class177.field2275[var20 + 1][var21 + 1] = var18;
         }
      }

      class122.field1686 = var6;
      class177.field2277 = var7;
      return false;
   }

   static void method694(int var0) {
      class122 var1 = null;

      try {
         var1 = class139.method3072("", class71.field816.field3353, true, 836492420);
         class194 var2 = field564.method1651(717909734);
         var1.method2534(var2.field2566, 0, var2.field2565, 1610585635);
      } catch (Exception var4) {
         ;
      }

      try {
         if (var1 != null) {
            var1.method2539(true, 400362957);
         }
      } catch (Exception var3) {
         ;
      }

   }

   static class96 method688(class245 var0, int var1, int var2, int var3) {
      int var4 = (var1 << 8) + var0.field2954;
      class96 var5 = (class96)class96.field1449.method3929((long)(var4 << 16));
      class96 var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         String var7 = String.valueOf(var4);
         int var8 = class34.field445.method4606(var7, -1503583040);
         if (var8 == -1) {
            var6 = null;
         } else {
            label57: {
               byte[] var9 = class34.field445.method4612(var8, 81252152);
               if (var9 != null) {
                  if (var9.length <= 1) {
                     var6 = null;
                     break label57;
                  }

                  var5 = class91.method1920(var9, (byte)-9);
                  if (var5 != null) {
                     class96.field1449.method3932(var5, (long)(var4 << 16));
                     var6 = var5;
                     break label57;
                  }
               }

               var6 = null;
            }
         }
      }

      if (var6 != null) {
         return var6;
      } else {
         int var13 = var0.field2954 + (var2 + '\u9c40' << 8);
         class96 var14 = (class96)class96.field1449.method3929((long)(var13 << 16));
         class96 var15;
         if (var14 != null) {
            var15 = var14;
         } else {
            String var10 = String.valueOf(var13);
            int var11 = class34.field445.method4606(var10, 1820460505);
            if (var11 == -1) {
               var15 = null;
            } else {
               byte[] var12 = class34.field445.method4612(var11, 763661177);
               if (var12 != null) {
                  if (var12.length <= 1) {
                     var15 = null;
                     return var15 != null ? var15 : null;
                  }

                  var14 = class91.method1920(var12, (byte)-40);
                  if (var14 != null) {
                     class96.field1449.method3932(var14, (long)(var13 << 16));
                     return var14 != null ? var14 : null;
                  }
               }

               var15 = null;
            }
         }

         return var15 != null ? var15 : null;
      }
   }

   public static final void method696(int var0, int var1, int var2) {
      class132.field1912 = var0;
      class132.field1919 = var1;
      class132.field1916 = true;
      class132.field1913 = 0;
      class132.field1914 = false;
   }
}

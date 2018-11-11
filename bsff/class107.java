public class class107 {
   static class330[] field1569;
   static int field1570;
   class117[] field1567 = new class117[8];
   protected int[] field1561;
   class117 field1558;
   int field1565 = 0;
   boolean field1564 = true;
   int field1556;
   int field1554 = 32;
   class117[] field1566 = new class117[8];
   long field1559 = 0L;
   long field1552 = class6.method28(1358803598);
   int field1560 = 0;
   int field1553 = 0;
   int field1555 = 0;
   int field1557;
   long field1562 = 0L;
   int field1568;

   protected void vmethod2220(short var1) throws Exception {
   }

   protected void vmethod2200(int var1) {
   }

   public final synchronized void method2222(int var1) {
      if (this.field1561 != null) {
         long var2 = class6.method28(1358803598);

         try {
            if (this.field1559 != 0L) {
               if (var2 < this.field1559) {
                  return;
               }

               this.vmethod2201(this.field1556, -744225460);
               this.field1559 = 0L;
               this.field1564 = true;
            }

            int var4 = this.vmethod2199(612355067);
            if (this.field1553 - var4 > this.field1560) {
               this.field1560 = this.field1553 - var4;
            }

            int var5 = this.field1557 + this.field1568;
            if (var5 + 256 > 16384) {
               var5 = 16128;
            }

            if (var5 + 256 > this.field1556) {
               this.field1556 += 1024;
               if (this.field1556 > 16384) {
                  this.field1556 = 16384;
               }

               this.vmethod2200(-864185879);
               this.vmethod2201(this.field1556, 1217716284);
               var4 = 0;
               this.field1564 = true;
               if (var5 + 256 > this.field1556) {
                  var5 = this.field1556 - 256;
                  this.field1568 = var5 - this.field1557;
               }
            }

            while(var4 < var5) {
               this.method2233(this.field1561, 256);
               this.vmethod2203();
               var4 += 256;
            }

            if (var2 > this.field1562) {
               if (!this.field1564) {
                  if (this.field1560 == 0 && this.field1555 == 0) {
                     this.vmethod2200(-1263100525);
                     this.field1559 = var2 + 2000L;
                     return;
                  }

                  this.field1568 = Math.min(this.field1555, this.field1560);
                  this.field1555 = this.field1560;
               } else {
                  this.field1564 = false;
               }

               this.field1560 = 0;
               this.field1562 = var2 + 2000L;
            }

            this.field1553 = var4;
         } catch (Exception var7) {
            this.vmethod2200(-1735771835);
            this.field1559 = var2 + 2000L;
         }

         try {
            if (var2 > this.field1552 + 500000L) {
               var2 = this.field1552;
            }

            while(var2 > this.field1552 + 5000L) {
               this.method2194(256, (byte)8);
               this.field1552 += (long)(256000 / class317.field3927);
            }
         } catch (Exception var6) {
            this.field1552 = var2;
         }
      }

   }

   protected int vmethod2199(int var1) throws Exception {
      return this.field1556;
   }

   protected void vmethod2201(int var1, int var2) throws Exception {
   }

   public final synchronized void method2192(int var1) {
      this.field1564 = true;

      try {
         this.vmethod2220((short)21985);
      } catch (Exception var3) {
         this.vmethod2200(998726440);
         this.field1559 = class6.method28(1358803598) + 2000L;
      }

   }

   final void method2194(int var1, byte var2) {
      this.field1565 -= var1;
      if (this.field1565 < 0) {
         this.field1565 = 0;
      }

      if (this.field1558 != null) {
         this.field1558.vmethod4340(var1);
      }

   }

   public final synchronized void method2219(int var1) {
      if (class27.field382 != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (this == class27.field382.field1583[var3]) {
               class27.field382.field1583[var3] = null;
            }

            if (class27.field382.field1583[var3] != null) {
               var2 = false;
            }
         }

         if (var2) {
            class57.field654.shutdownNow();
            class57.field654 = null;
            class27.field382 = null;
         }
      }

      this.vmethod2200(1017716731);
      this.field1561 = null;
   }

   final void method2196(class117 var1, int var2, int var3) {
      int var4 = var2 >> 5;
      class117 var5 = this.field1567[var4];
      if (var5 == null) {
         this.field1566[var4] = var1;
      } else {
         var5.field1639 = var1;
      }

      this.field1567[var4] = var1;
      var1.field1640 = var2;
   }

   public final void method2191(int var1) {
      this.field1564 = true;
   }

   final void method2233(int[] var1, int var2) {
      int var3 = var2;
      if (class17.field297) {
         var3 = var2 << 1;
      }

      class205.method3854(var1, 0, var3);
      this.field1565 -= var2;
      if (this.field1558 != null && this.field1565 <= 0) {
         this.field1565 += class317.field3927 >> 4;
         class85.method1842(this.field1558, -2057926383);
         this.method2196(this.field1558, this.field1558.vmethod2472(), -1325832273);
         int var4 = 0;
         int var5 = 255;

         int var6;
         class117 var7;
         label106:
         for(var6 = 7; var5 != 0; --var6) {
            int var8;
            int var9;
            if (var6 < 0) {
               var8 = var6 & 3;
               var9 = -(var6 >> 2);
            } else {
               var8 = var6;
               var9 = 0;
            }

            for(int var10 = var5 >>> var8 & 286331153; var10 != 0; var10 >>>= 4) {
               if ((var10 & 1) != 0) {
                  var5 &= ~(1 << var8);
                  var7 = null;
                  class117 var11 = this.field1566[var8];

                  label100:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label100;
                        }

                        class120 var12 = var11.field1641;
                        if (var12 != null && var12.field1672 > var9) {
                           var5 |= 1 << var8;
                           var7 = var11;
                           var11 = var11.field1639;
                        } else {
                           var11.field1638 = true;
                           int var13 = var11.vmethod4338();
                           var4 += var13;
                           if (var12 != null) {
                              var12.field1672 += var13;
                           }

                           if (var4 >= this.field1554) {
                              break label106;
                           }

                           class117 var14 = var11.vmethod4336();
                           if (var14 != null) {
                              for(int var15 = var11.field1640; var14 != null; var14 = var11.vmethod4337()) {
                                 this.method2196(var14, var15 * var14.vmethod2472() >> 8, -1623919664);
                              }
                           }

                           class117 var18 = var11.field1639;
                           var11.field1639 = null;
                           if (var7 == null) {
                              this.field1566[var8] = var18;
                           } else {
                              var7.field1639 = var18;
                           }

                           if (var18 == null) {
                              this.field1567[var8] = var7;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var8 += 4;
               ++var9;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class117 var16 = this.field1566[var6];
            class117[] var17 = this.field1566;
            this.field1567[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var7) {
               var7 = var16.field1639;
               var16.field1639 = null;
            }
         }
      }

      if (this.field1565 < 0) {
         this.field1565 = 0;
      }

      if (this.field1558 != null) {
         this.field1558.vmethod4339(var1, 0, var2);
      }

      this.field1552 = class6.method28(1358803598);
   }

   protected void vmethod2203() throws Exception {
   }

   public final synchronized void method2189(class117 var1, int var2) {
      this.field1558 = var1;
   }

   protected void vmethod2197(int var1) throws Exception {
   }

   static void method2241(class263 var0, int var1, int var2) {
      if (class264.field3418 != null) {
         class264.field3418.field2565 = var1 * 8 + 5;
         int var3 = class264.field3418.getInt(-1817376731);
         int var4 = class264.field3418.getInt(-1817376731);
         var0.method4688(var3, var4, 1910813960);
      } else {
         class142.method3082((class263)null, 255, 255, 0, (byte)0, true, (byte)113);
         class264.field3419[var1] = var0;
      }

   }

   static int method2188(int var0, class96 var1, boolean var2, int var3) {
      if (var0 == 5630) {
         client.field903 = 250;
         return 1;
      } else {
         return 2;
      }
   }

   public static class329[] method2198(int var0) {
      return new class329[]{class329.field3966, class329.field3965, class329.field3963, class329.field3964, class329.field3962};
   }

   static final void method2240(class75 var0, int var1, byte var2) {
      class72.method1182(var0.field1185, var0.field1209, var1, (byte)84);
   }
}

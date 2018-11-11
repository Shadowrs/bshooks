import java.util.Random;

public class class119 {
   static int[] field1655 = new int['\u8000'];
   static int[] field1646;
   static int[] field1652;
   static int[] field1662;
   static int[] field1668;
   static int[] field1648;
   static int[] field1665;
   static int[] field1669;
   class108 field1659;
   int[] field1667 = new int[]{0, 0, 0, 0, 0};
   int field1661 = 500;
   int field1664 = 0;
   class108 field1647;
   int[] field1671 = new int[]{0, 0, 0, 0, 0};
   class108 field1654;
   class108 field1650;
   class108 field1649;
   int[] field1656 = new int[]{0, 0, 0, 0, 0};
   class108 field1651;
   int field1657 = 0;
   int field1658 = 100;
   class108 field1663;
   class108 field1653;
   class116 field1670;
   class108 field1660;

   final void method2497(class194 var1) {
      this.field1659 = new class108();
      this.field1659.method2248(var1);
      this.field1647 = new class108();
      this.field1647.method2248(var1);
      int var2 = var1.getUByte(81932541);
      if (var2 != 0) {
         --var1.field2565;
         this.field1654 = new class108();
         this.field1654.method2248(var1);
         this.field1649 = new class108();
         this.field1649.method2248(var1);
      }

      var2 = var1.getUByte(-1590085512);
      if (var2 != 0) {
         --var1.field2565;
         this.field1650 = new class108();
         this.field1650.method2248(var1);
         this.field1651 = new class108();
         this.field1651.method2248(var1);
      }

      var2 = var1.getUByte(-474984204);
      if (var2 != 0) {
         --var1.field2565;
         this.field1663 = new class108();
         this.field1663.method2248(var1);
         this.field1653 = new class108();
         this.field1653.method2248(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.getUSmart(764595043);
         if (var4 == 0) {
            break;
         }

         this.field1667[var3] = var4;
         this.field1671[var3] = var1.getSmart(764027762);
         this.field1656[var3] = var1.getUSmart(1552207685);
      }

      this.field1657 = var1.getUSmart(1948814777);
      this.field1658 = var1.getUSmart(1440815010);
      this.field1661 = var1.getUShort(-1208216487);
      this.field1664 = var1.getUShort(-1208216487);
      this.field1670 = new class116();
      this.field1660 = new class108();
      this.field1670.method2454(var1, this.field1660);
   }

   final int[] method2498(int var1, int var2) {
      class205.method3854(field1646, 0, var1);
      if (var2 < 10) {
         return field1646;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field1659.method2246();
         this.field1647.method2246();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field1654 != null) {
            this.field1654.method2246();
            this.field1649.method2246();
            var5 = (int)((double)(this.field1654.field1576 - this.field1654.field1574) * 32.768D / var3);
            var6 = (int)((double)this.field1654.field1574 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field1650 != null) {
            this.field1650.method2246();
            this.field1651.method2246();
            var8 = (int)((double)(this.field1650.field1576 - this.field1650.field1574) * 32.768D / var3);
            var9 = (int)((double)this.field1650.field1574 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field1667[var11] != 0) {
               field1662[var11] = 0;
               field1668[var11] = (int)((double)this.field1656[var11] * var3);
               field1648[var11] = (this.field1667[var11] << 14) / 100;
               field1665[var11] = (int)((double)(this.field1659.field1576 - this.field1659.field1574) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1671[var11]) / var3);
               field1669[var11] = (int)((double)this.field1659.field1574 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field1659.method2245(var1);
            var13 = this.field1647.method2245(var1);
            if (this.field1654 != null) {
               var14 = this.field1654.method2245(var1);
               var15 = this.field1649.method2245(var1);
               var12 += this.method2496(var7, var15, this.field1654.field1575) >> 1;
               var7 = var7 + var6 + (var14 * var5 >> 16);
            }

            if (this.field1650 != null) {
               var14 = this.field1650.method2245(var1);
               var15 = this.field1651.method2245(var1);
               var13 = var13 * ((this.method2496(var10, var15, this.field1650.field1575) >> 1) + '\u8000') >> 15;
               var10 = var10 + var9 + (var14 * var8 >> 16);
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field1667[var14] != 0) {
                  var15 = field1668[var14] + var11;
                  if (var15 < var1) {
                     field1646[var15] += this.method2496(field1662[var14], var13 * field1648[var14] >> 15, this.field1659.field1575);
                     field1662[var14] += (var12 * field1665[var14] >> 16) + field1669[var14];
                  }
               }
            }
         }

         int var16;
         if (this.field1663 != null) {
            this.field1663.method2246();
            this.field1653.method2246();
            var11 = 0;
            boolean var17 = false;
            boolean var18 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field1663.method2245(var1);
               var16 = this.field1653.method2245(var1);
               if (var18) {
                  var12 = (var15 * (this.field1663.field1576 - this.field1663.field1574) >> 8) + this.field1663.field1574;
               } else {
                  var12 = (var16 * (this.field1663.field1576 - this.field1663.field1574) >> 8) + this.field1663.field1574;
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var18 = !var18;
               }

               if (var18) {
                  field1646[var14] = 0;
               }
            }
         }

         if (this.field1657 > 0 && this.field1658 > 0) {
            var11 = (int)((double)this.field1657 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field1646[var12] += field1646[var12 - var11] * this.field1658 / 100;
            }
         }

         if (this.field1670.field1632[0] > 0 || this.field1670.field1632[1] > 0) {
            this.field1660.method2246();
            var11 = this.field1660.method2245(var1 + 1);
            var12 = this.field1670.method2469(0, (float)var11 / 65536.0F);
            var13 = this.field1670.method2469(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var19;
               while(var14 < var15) {
                  var16 = (int)((long)field1646[var14 + var12] * (long)class116.field1634 >> 16);

                  for(var19 = 0; var19 < var12; ++var19) {
                     var16 += (int)((long)field1646[var14 + var12 - 1 - var19] * (long)class116.field1633[0][var19] >> 16);
                  }

                  for(var19 = 0; var19 < var14; ++var19) {
                     var16 -= (int)((long)field1646[var14 - 1 - var19] * (long)class116.field1633[1][var19] >> 16);
                  }

                  field1646[var14] = var16;
                  var11 = this.field1660.method2245(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var20;
                  while(var14 < var15) {
                     var19 = (int)((long)field1646[var14 + var12] * (long)class116.field1634 >> 16);

                     for(var20 = 0; var20 < var12; ++var20) {
                        var19 += (int)((long)field1646[var14 + var12 - 1 - var20] * (long)class116.field1633[0][var20] >> 16);
                     }

                     for(var20 = 0; var20 < var13; ++var20) {
                        var19 -= (int)((long)field1646[var14 - 1 - var20] * (long)class116.field1633[1][var20] >> 16);
                     }

                     field1646[var14] = var19;
                     var11 = this.field1660.method2245(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var19 = 0;

                        for(var20 = var14 + var12 - var1; var20 < var12; ++var20) {
                           var19 += (int)((long)field1646[var14 + var12 - 1 - var20] * (long)class116.field1633[0][var20] >> 16);
                        }

                        for(var20 = 0; var20 < var13; ++var20) {
                           var19 -= (int)((long)field1646[var14 - 1 - var20] * (long)class116.field1633[1][var20] >> 16);
                        }

                        field1646[var14] = var19;
                        this.field1660.method2245(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field1670.method2469(0, (float)var11 / 65536.0F);
                  var13 = this.field1670.method2469(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field1646[var11] < -32768) {
               field1646[var11] = -32768;
            }

            if (field1646[var11] > 32767) {
               field1646[var11] = 32767;
            }
         }

         return field1646;
      }
   }

   final int method2496(int var1, int var2, int var3) {
      return var3 == 1 ? ((var1 & 32767) < 16384 ? var2 : -var2) : (var3 == 2 ? field1652[var1 & 32767] * var2 >> 14 : (var3 == 3 ? (var2 * (var1 & 32767) >> 14) - var2 : (var3 == 4 ? var2 * field1655[var1 / 2607 & 32767] : 0)));
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field1655[var1] = (var0.nextInt() & 2) - 1;
      }

      field1652 = new int['\u8000'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field1652[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1646 = new int[220500];
      field1662 = new int[5];
      field1668 = new int[5];
      field1648 = new int[5];
      field1665 = new int[5];
      field1669 = new int[5];
   }
}

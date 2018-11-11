public class class137 {
   public static boolean field2026 = true;
   static boolean field2013 = false;
   static int[] field2017;
   static int field1982;
   static int field1988;
   static class217 field2021;
   static int field1991 = 0;
   static int field2016 = 4;
   static int field1990 = 0;
   public static int field2011 = -1;
   static class144[] field2020;
   static int field2000;
   static class144[][] field2018;
   static boolean field2007 = false;
   static int field1992;
   static class146[] field2006 = new class146[100];
   static int field2008 = 0;
   static int field2003;
   static int field2009 = 0;
   static int field2002;
   static int field2004;
   static int field2010 = 0;
   static int field2025;
   static int field1997;
   static int field2038;
   public static int field2012 = -1;
   static int field1998;
   static int field1993;
   static boolean[][][][] field2031;
   static int field1994;
   static int field1976;
   static int field1986;
   static boolean[][] field2032;
   static int[] field2022;
   static int[] field1999;
   static int[] field2024;
   static int[] field2001;
   static int field2035;
   static int field2036;
   static int field2037;
   static int field2014;
   static int field2033;
   static int[] field1987;
   static int field2034;
   static int[] field2027;
   static int[] field2028;
   int field1996 = 0;
   int field2023 = 0;
   int[][][] field1985;
   int field1978;
   int field1977;
   class130[][][] field1981;
   class146[] field1984 = new class146[5000];
   int field1979;
   int[][][] field1980;
   int[][] field2029 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] field2030 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};

   public class137(int var1, int var2, int var3, int[][][] var4) {
      this.field1977 = var1;
      this.field1978 = var2;
      this.field1979 = var3;
      this.field1981 = new class130[var1][var2][var3];
      this.field1985 = new int[var1][var2 + 1][var3 + 1];
      this.field1980 = var4;
      this.method2878();
   }

   boolean method2924(int var1, int var2, int var3) {
      int var4 = this.field1985[var1][var2][var3];
      if (var4 == -field1992) {
         return false;
      } else if (var4 == field1992) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method2928(var5 + 1, this.field1980[var1][var2][var3], var6 + 1) && this.method2928(var5 + 128 - 1, this.field1980[var1][var2 + 1][var3], var6 + 1) && this.method2928(var5 + 128 - 1, this.field1980[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method2928(var5 + 1, this.field1980[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field1985[var1][var2][var3] = field1992;
            return true;
         } else {
            this.field1985[var1][var2][var3] = -field1992;
            return false;
         }
      }
   }

   boolean method2889(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class139 var9, int var10, boolean var11, int var12, int var13) {
      int var14;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var14 = var3; var14 < var3 + var5; ++var14) {
            if (var15 < 0 || var14 < 0 || var15 >= this.field1978 || var14 >= this.field1979) {
               return false;
            }

            class130 var16 = this.field1981[var1][var15][var14];
            if (var16 != null && var16.field1826 >= 5) {
               return false;
            }
         }
      }

      class146 var19 = new class146();
      var19.field2110 = var12;
      var19.field2111 = var13;
      var19.field2105 = var1;
      var19.field2100 = var6;
      var19.field2103 = var7;
      var19.field2099 = var8;
      var19.field2109 = var9;
      var19.field2106 = var10;
      var19.field2104 = var2;
      var19.field2102 = var3;
      var19.field2101 = var2 + var4 - 1;
      var19.field2107 = var3 + var5 - 1;

      for(var14 = var2; var14 < var2 + var4; ++var14) {
         for(int var20 = var3; var20 < var3 + var5; ++var20) {
            int var17 = 0;
            if (var14 > var2) {
               ++var17;
            }

            if (var14 < var2 + var4 - 1) {
               var17 += 4;
            }

            if (var20 > var3) {
               var17 += 8;
            }

            if (var20 < var3 + var5 - 1) {
               var17 += 2;
            }

            for(int var18 = var1; var18 >= 0; --var18) {
               if (this.field1981[var18][var14][var20] == null) {
                  this.field1981[var18][var14][var20] = new class130(var18, var14, var20);
               }
            }

            class130 var21 = this.field1981[var1][var14][var20];
            var21.field1827[var21.field1826] = var19;
            var21.field1828[var21.field1826] = var17;
            var21.field1829 |= var17;
            ++var21.field1826;
         }
      }

      if (var11) {
         this.field1984[this.field2023++] = var19;
      }

      return true;
   }

   void method2891(class146 var1) {
      for(int var2 = var1.field2104; var2 <= var1.field2101; ++var2) {
         for(int var3 = var1.field2102; var3 <= var1.field2107; ++var3) {
            class130 var4 = this.field1981[var1.field2105][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field1826; ++var5) {
                  if (var4.field1827[var5] == var1) {
                     --var4.field1826;

                     for(int var6 = var5; var6 < var4.field1826; ++var6) {
                        var4.field1827[var6] = var4.field1827[var6 + 1];
                        var4.field1828[var6] = var4.field1828[var6 + 1];
                     }

                     var4.field1827[var4.field1826] = null;
                     break;
                  }
               }

               var4.field1829 = 0;

               for(var5 = 0; var5 < var4.field1826; ++var5) {
                  var4.field1829 |= var4.field1828[var5];
               }
            }
         }
      }

   }

   boolean method2928(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field1982; ++var4) {
         class144 var5 = field2020[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field2077 == 1) {
            var6 = var5.field2079 - var1;
            if (var6 > 0) {
               var7 = (var6 * var5.field2080 >> 8) + var5.field2073;
               var8 = (var6 * var5.field2081 >> 8) + var5.field2074;
               var9 = (var6 * var5.field2082 >> 8) + var5.field2078;
               var10 = (var6 * var5.field2070 >> 8) + var5.field2066;
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2077 == 2) {
            var6 = var1 - var5.field2079;
            if (var6 > 0) {
               var7 = (var6 * var5.field2080 >> 8) + var5.field2073;
               var8 = (var6 * var5.field2081 >> 8) + var5.field2074;
               var9 = (var6 * var5.field2082 >> 8) + var5.field2078;
               var10 = (var6 * var5.field2070 >> 8) + var5.field2066;
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2077 == 3) {
            var6 = var5.field2073 - var3;
            if (var6 > 0) {
               var7 = (var6 * var5.field2071 >> 8) + var5.field2079;
               var8 = (var6 * var5.field2068 >> 8) + var5.field2083;
               var9 = (var6 * var5.field2082 >> 8) + var5.field2078;
               var10 = (var6 * var5.field2070 >> 8) + var5.field2066;
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2077 == 4) {
            var6 = var3 - var5.field2073;
            if (var6 > 0) {
               var7 = (var6 * var5.field2071 >> 8) + var5.field2079;
               var8 = (var6 * var5.field2068 >> 8) + var5.field2083;
               var9 = (var6 * var5.field2082 >> 8) + var5.field2078;
               var10 = (var6 * var5.field2070 >> 8) + var5.field2066;
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2077 == 5) {
            var6 = var2 - var5.field2078;
            if (var6 > 0) {
               var7 = (var6 * var5.field2071 >> 8) + var5.field2079;
               var8 = (var6 * var5.field2068 >> 8) + var5.field2083;
               var9 = (var6 * var5.field2080 >> 8) + var5.field2073;
               var10 = (var6 * var5.field2081 >> 8) + var5.field2074;
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   void method3029(class125 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.field1977) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field1978) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field1979 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        class130 var15 = this.field1981[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.field1980[var12][var13 + 1][var14] + this.field1980[var12][var13 + 1][var14 + 1] + this.field1980[var12][var13][var14] + this.field1980[var12][var13][var14 + 1]) / 4 - (this.field1980[var2][var3 + 1][var4] + this.field1980[var2][var3][var4] + this.field1980[var2][var3 + 1][var4 + 1] + this.field1980[var2][var3][var4 + 1]) / 4;
                           class140 var17 = var15.field1838;
                           if (var17 != null) {
                              class125 var18;
                              if (var17.field2049 instanceof class125) {
                                 var18 = (class125)var17.field2049;
                                 class125.method2602(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field2044 instanceof class125) {
                                 var18 = (class125)var17.field2044;
                                 class125.method2602(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field1826; ++var23) {
                              class146 var19 = var15.field1827[var23];
                              if (var19 != null && var19.field2109 instanceof class125) {
                                 class125 var20 = (class125)var19.field2109;
                                 int var21 = var19.field2101 - var19.field2104 + 1;
                                 int var22 = var19.field2107 - var19.field2102 + 1;
                                 class125.method2602(var1, var20, (var21 - var5) * 64 + (var19.field2104 - var3) * 128, var16, (var19.field2102 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   public void method3046(int var1, int var2, int var3, boolean var4) {
      if (!method2915() || var4) {
         field2007 = true;
         field2013 = var4;
         field2008 = var1;
         field2009 = var2;
         field2010 = var3;
         field2011 = -1;
         field2012 = -1;
      }

   }

   boolean method2925(int var1, int var2, int var3, int var4) {
      if (!this.method2924(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field1980[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > field1988) {
                  if (!this.method2928(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method2928(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method2928(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method2928(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method2928(var5, var9, var6)) {
                  return false;
               }

               if (!this.method2928(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < field2000) {
                  if (!this.method2928(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method2928(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method2928(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method2928(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method2928(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method2928(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < field1988) {
                  if (!this.method2928(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method2928(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method2928(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method2928(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method2928(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method2928(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > field2000) {
                  if (!this.method2928(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method2928(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method2928(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method2928(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method2928(var5, var9, var6)) {
                  return false;
               }

               if (!this.method2928(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method2928(var5 + 64, var10, var6 + 64) ? false : (var4 == 16 ? this.method2928(var5, var9, var6 + 128) : (var4 == 32 ? this.method2928(var5 + 128, var9, var6 + 128) : (var4 == 64 ? this.method2928(var5 + 128, var9, var6) : (var4 == 128 ? this.method2928(var5, var9, var6) : true))));
      }
   }

   void method2968(class135 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field1988;
      int var11;
      int var12 = var11 = (var8 << 7) - field2000;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field1980[var2][var7][var8] - field2003;
      int var18 = this.field1980[var2][var7 + 1][var8] - field2003;
      int var19 = this.field1980[var2][var7 + 1][var8 + 1] - field2003;
      int var20 = this.field1980[var2][var7][var8 + 1] - field2003;
      int var21 = var10 * var6 + var5 * var12 >> 16;
      var12 = var12 * var6 - var5 * var10 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var3 * var12 >> 16;
      var12 = var3 * var17 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var14 * var6 + var5 * var11 >> 16;
         var11 = var11 * var6 - var5 * var14 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var3 * var11 >> 16;
         var11 = var3 * var18 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var13 * var6 + var5 * var16 >> 16;
            var16 = var16 * var6 - var5 * var13 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var3 * var16 >> 16;
            var16 = var3 * var19 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var9 * var6 + var5 * var15 >> 16;
               var15 = var15 * var6 - var5 * var9 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var3 * var15 >> 16;
               var15 = var3 * var20 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = var10 * class134.field1941 / var12 + class134.field1942;
                  int var23 = var17 * class134.field1941 / var12 + class134.field1943;
                  int var24 = var14 * class134.field1941 / var11 + class134.field1942;
                  int var25 = var18 * class134.field1941 / var11 + class134.field1943;
                  int var26 = var13 * class134.field1941 / var16 + class134.field1942;
                  int var27 = var19 * class134.field1941 / var16 + class134.field1943;
                  int var28 = var9 * class134.field1941 / var15 + class134.field1942;
                  int var29 = var21 * class134.field1941 / var15 + class134.field1943;
                  class134.field1934 = 0;
                  int var30;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class134.field1940 = false;
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > class134.field1948 || var28 > class134.field1948 || var24 > class134.field1948) {
                        class134.field1940 = true;
                     }

                     if (field2007 && method2991(field2009, field2010, var27, var29, var25, var26, var28, var24)) {
                        field2011 = var7;
                        field2012 = var8;
                     }

                     if (var1.field1961 == -1) {
                        if (var1.field1959 != 12345678) {
                           class134.method2801(var27, var29, var25, var26, var28, var24, var1.field1959, var1.field1960, var1.field1958);
                        }
                     } else if (!field2026) {
                        if (var1.field1962) {
                           class134.method2806(var27, var29, var25, var26, var28, var24, var1.field1959, var1.field1960, var1.field1958, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1961);
                        } else {
                           class134.method2806(var27, var29, var25, var26, var28, var24, var1.field1959, var1.field1960, var1.field1958, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field1961);
                        }
                     } else {
                        var30 = class134.field1944.vmethod3084(var1.field1961, 1310347929);
                        class134.method2801(var27, var29, var25, var26, var28, var24, method2921(var30, var1.field1959), method2921(var30, var1.field1960), method2921(var30, var1.field1958));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class134.field1940 = false;
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > class134.field1948 || var24 > class134.field1948 || var28 > class134.field1948) {
                        class134.field1940 = true;
                     }

                     if (field2007 && method2991(field2009, field2010, var23, var25, var29, var22, var24, var28)) {
                        field2011 = var7;
                        field2012 = var8;
                     }

                     if (var1.field1961 == -1) {
                        if (var1.field1957 != 12345678) {
                           class134.method2801(var23, var25, var29, var22, var24, var28, var1.field1957, var1.field1958, var1.field1960);
                        }
                     } else if (!field2026) {
                        class134.method2806(var23, var25, var29, var22, var24, var28, var1.field1957, var1.field1958, var1.field1960, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1961);
                     } else {
                        var30 = class134.field1944.vmethod3084(var1.field1961, 1893429249);
                        class134.method2801(var23, var25, var29, var22, var24, var28, method2921(var30, var1.field1957), method2921(var30, var1.field1958), method2921(var30, var1.field1960));
                     }
                  }
               }
            }
         }
      }

   }

   void method2920(class126 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field1769.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1769[var9] - field1988;
         var11 = var1.field1759[var9] - field2003;
         var12 = var1.field1760[var9] - field2000;
         var13 = var12 * var4 + var5 * var10 >> 16;
         var12 = var5 * var12 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var3 * var11 - var12 * var2 >> 16;
         var12 = var11 * var2 + var3 * var12 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.field1761 != null) {
            class126.field1775[var9] = var10;
            class126.field1778[var9] = var13;
            class126.field1767[var9] = var12;
         }

         class126.field1762[var9] = var10 * class134.field1941 / var12 + class134.field1942;
         class126.field1774[var9] = var13 * class134.field1941 / var12 + class134.field1943;
      }

      class134.field1934 = 0;
      var8 = var1.field1764.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1764[var9];
         var11 = var1.field1765[var9];
         var12 = var1.field1766[var9];
         var13 = class126.field1762[var10];
         int var14 = class126.field1762[var11];
         int var15 = class126.field1762[var12];
         int var16 = class126.field1774[var10];
         int var17 = class126.field1774[var11];
         int var18 = class126.field1774[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class134.field1940 = false;
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > class134.field1948 || var14 > class134.field1948 || var15 > class134.field1948) {
               class134.field1940 = true;
            }

            if (field2007 && method2991(field2009, field2010, var16, var17, var18, var13, var14, var15)) {
               field2011 = var6;
               field2012 = var7;
            }

            if (var1.field1761 != null && var1.field1761[var9] != -1) {
               if (!field2026) {
                  if (var1.field1768) {
                     class134.method2806(var16, var17, var18, var13, var14, var15, var1.field1773[var9], var1.field1763[var9], var1.field1776[var9], class126.field1775[0], class126.field1775[1], class126.field1775[3], class126.field1778[0], class126.field1778[1], class126.field1778[3], class126.field1767[0], class126.field1767[1], class126.field1767[3], var1.field1761[var9]);
                  } else {
                     class134.method2806(var16, var17, var18, var13, var14, var15, var1.field1773[var9], var1.field1763[var9], var1.field1776[var9], class126.field1775[var10], class126.field1775[var11], class126.field1775[var12], class126.field1778[var10], class126.field1778[var11], class126.field1778[var12], class126.field1767[var10], class126.field1767[var11], class126.field1767[var12], var1.field1761[var9]);
                  }
               } else {
                  int var19 = class134.field1944.vmethod3084(var1.field1761[var9], 1338318367);
                  class134.method2801(var16, var17, var18, var13, var14, var15, method2921(var19, var1.field1773[var9]), method2921(var19, var1.field1763[var9]), method2921(var19, var1.field1776[var9]));
               }
            } else if (var1.field1773[var9] != 12345678) {
               class134.method2801(var16, var17, var18, var13, var14, var15, var1.field1773[var9], var1.field1763[var9], var1.field1776[var9]);
            }
         }
      }

   }

   void method2934(class125 var1, int var2, int var3, int var4) {
      class130 var5;
      class125 var6;
      if (var3 < this.field1978) {
         var5 = this.field1981[var2][var3 + 1][var4];
         if (var5 != null && var5.field1823 != null && var5.field1823.field1783 instanceof class125) {
            var6 = (class125)var5.field1823.field1783;
            class125.method2602(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.field1978) {
         var5 = this.field1981[var2][var3][var4 + 1];
         if (var5 != null && var5.field1823 != null && var5.field1823.field1783 instanceof class125) {
            var6 = (class125)var5.field1823.field1783;
            class125.method2602(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.field1978 && var4 < this.field1979) {
         var5 = this.field1981[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.field1823 != null && var5.field1823.field1783 instanceof class125) {
            var6 = (class125)var5.field1823.field1783;
            class125.method2602(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.field1978 && var4 > 0) {
         var5 = this.field1981[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.field1823 != null && var5.field1823.field1783 instanceof class125) {
            var6 = (class125)var5.field1823.field1783;
            class125.method2602(var1, var6, 128, 0, -128, true);
         }
      }

   }

   public void method2878() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field1977; ++var1) {
         for(var2 = 0; var2 < this.field1978; ++var2) {
            for(int var3 = 0; var3 < this.field1979; ++var3) {
               this.field1981[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field2016; ++var1) {
         for(var2 = 0; var2 < field2017[var1]; ++var2) {
            field2018[var1][var2] = null;
         }

         field2017[var1] = 0;
      }

      for(var1 = 0; var1 < this.field2023; ++var1) {
         this.field1984[var1] = null;
      }

      this.field2023 = 0;

      for(var1 = 0; var1 < field2006.length; ++var1) {
         field2006[var1] = null;
      }

   }

   boolean method2919(int var1, int var2, int var3, int var4) {
      if (!this.method2924(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method2928(var5 + 1, this.field1980[var1][var2][var3] - var4, var6 + 1) && this.method2928(var5 + 128 - 1, this.field1980[var1][var2 + 1][var3] - var4, var6 + 1) && this.method2928(var5 + 128 - 1, this.field1980[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method2928(var5 + 1, this.field1980[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   public class140 method2996(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      return var4 == null ? null : var4.field1838;
   }

   boolean method2877(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var3 == var2 && var5 == var4) {
         if (!this.method2924(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method2928(var7 + 1, this.field1980[var1][var2][var4] - var6, var8 + 1) && this.method2928(var7 + 128 - 1, this.field1980[var1][var2 + 1][var4] - var6, var8 + 1) && this.method2928(var7 + 128 - 1, this.field1980[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method2928(var7 + 1, this.field1980[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.field1985[var1][var7][var8] == -field1992) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field1980[var1][var2][var4] - var6;
         if (!this.method2928(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method2928(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method2928(var7, var9, var11)) {
                  return false;
               } else if (!this.method2928(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   void method2923() {
      int var1 = field2017[field1991];
      class144[] var2 = field2018[field1991];
      field1982 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class144 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var8;
         boolean var9;
         if (var4.field2072 == 1) {
            var5 = var4.field2075 - field1997 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2076 - field1998 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2069 - field1998 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var9 = false;

               while(var6 <= var7) {
                  if (field2032[var5][var6++]) {
                     var9 = true;
                     break;
                  }
               }

               if (var9) {
                  var8 = field1988 - var4.field2079;
                  if (var8 > 32) {
                     var4.field2077 = 1;
                  } else {
                     if (var8 >= -32) {
                        continue;
                     }

                     var4.field2077 = 2;
                     var8 = -var8;
                  }

                  var4.field2080 = (var4.field2073 - field2000 << 8) / var8;
                  var4.field2081 = (var4.field2074 - field2000 << 8) / var8;
                  var4.field2082 = (var4.field2078 - field2003 << 8) / var8;
                  var4.field2070 = (var4.field2066 - field2003 << 8) / var8;
                  field2020[field1982++] = var4;
               }
            }
         } else if (var4.field2072 == 2) {
            var5 = var4.field2076 - field1998 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2075 - field1997 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2067 - field1997 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var9 = false;

               while(var6 <= var7) {
                  if (field2032[var6++][var5]) {
                     var9 = true;
                     break;
                  }
               }

               if (var9) {
                  var8 = field2000 - var4.field2073;
                  if (var8 > 32) {
                     var4.field2077 = 3;
                  } else {
                     if (var8 >= -32) {
                        continue;
                     }

                     var4.field2077 = 4;
                     var8 = -var8;
                  }

                  var4.field2071 = (var4.field2079 - field1988 << 8) / var8;
                  var4.field2068 = (var4.field2083 - field1988 << 8) / var8;
                  var4.field2082 = (var4.field2078 - field2003 << 8) / var8;
                  var4.field2070 = (var4.field2066 - field2003 << 8) / var8;
                  field2020[field1982++] = var4;
               }
            }
         } else if (var4.field2072 == 4) {
            var5 = var4.field2078 - field2003;
            if (var5 > 128) {
               var6 = var4.field2076 - field1998 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2069 - field1998 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var10 = var4.field2075 - field1997 + 25;
                  if (var10 < 0) {
                     var10 = 0;
                  }

                  var8 = var4.field2067 - field1997 + 25;
                  if (var8 > 50) {
                     var8 = 50;
                  }

                  boolean var11 = false;

                  label140:
                  for(int var12 = var10; var12 <= var8; ++var12) {
                     for(int var13 = var6; var13 <= var7; ++var13) {
                        if (field2032[var12][var13]) {
                           var11 = true;
                           break label140;
                        }
                     }
                  }

                  if (var11) {
                     var4.field2077 = 5;
                     var4.field2071 = (var4.field2079 - field1988 << 8) / var5;
                     var4.field2068 = (var4.field2083 - field1988 << 8) / var5;
                     var4.field2080 = (var4.field2073 - field2000 << 8) / var5;
                     var4.field2081 = (var4.field2074 - field2000 << 8) / var5;
                     field2020[field1982++] = var4;
                  }
               }
            }
         }
      }

   }

   public class145 method2899(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      return var4 == null ? null : var4.field1819;
   }

   public void method2897(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      if (var4 != null) {
         var4.field1825 = null;
      }

   }

   public class146 method2900(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field1826; ++var5) {
            class146 var6 = var4.field1827[var5];
            if ((var6.field2110 >> 29 & 3) == 2 && var2 == var6.field2104 && var3 == var6.field2102) {
               return var6;
            }
         }

         return null;
      }
   }

   public void method2883(int var1, int var2, int var3, int var4, class139 var5, int var6, class139 var7, class139 var8) {
      class124 var9 = new class124();
      var9.field1706 = var5;
      var9.field1708 = var2 * 128 + 64;
      var9.field1705 = var3 * 128 + 64;
      var9.field1703 = var4;
      var9.field1704 = var6;
      var9.field1707 = var7;
      var9.field1709 = var8;
      int var10 = 0;
      class130 var11 = this.field1981[var1][var2][var3];
      if (var11 != null) {
         for(int var12 = 0; var12 < var11.field1826; ++var12) {
            if ((var11.field1827[var12].field2111 & 256) == 256 && var11.field1827[var12].field2109 instanceof class131) {
               class131 var13 = (class131)var11.field1827[var12].field2109;
               var13.method2687();
               if (var13.field2042 > var10) {
                  var10 = var13.field2042;
               }
            }
         }
      }

      var9.field1710 = var10;
      if (this.field1981[var1][var2][var3] == null) {
         this.field1981[var1][var2][var3] = new class130(var1, var2, var3);
      }

      this.field1981[var1][var2][var3].field1825 = var9;
   }

   void method2918(class130 var1, boolean var2) {
      field2021.method4020(var1);

      while(true) {
         class130 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class130[][] var8;
         class130 var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              class140 var16;
                              class146 var17;
                              boolean var18;
                              int var19;
                              int var20;
                              int var21;
                              class130 var22;
                              while(true) {
                                 do {
                                    var3 = (class130)field2021.method4022();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field1832);

                                 var4 = var3.field1817;
                                 var5 = var3.field1837;
                                 var6 = var3.field1840;
                                 var7 = var3.field1822;
                                 var8 = this.field1981[var6];
                                 if (!var3.field1831) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.field1981[var6 - 1][var4][var5];
                                       if (var9 != null && var9.field1832) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= field1997 && var4 > field1993) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.field1832 && (var9.field1831 || (var3.field1829 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= field1997 && var4 < field1994 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.field1832 && (var9.field1831 || (var3.field1829 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= field1998 && var5 > field1976) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.field1832 && (var9.field1831 || (var3.field1829 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= field1998 && var5 < field1986 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.field1832 && (var9.field1831 || (var3.field1829 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field1831 = false;
                                 if (var3.field1835 != null) {
                                    var9 = var3.field1835;
                                    if (var9.field1820 != null) {
                                       if (!this.method2924(0, var4, var5)) {
                                          this.method2968(var9.field1820, 0, field2002, field2038, field2004, field2025, var4, var5);
                                       }
                                    } else if (var9.field1816 != null && !this.method2924(0, var4, var5)) {
                                       this.method2920(var9.field1816, field2002, field2038, field2004, field2025, var4, var5);
                                    }

                                    var16 = var9.field1838;
                                    if (var16 != null) {
                                       var16.field2049.vmethod3066(0, field2002, field2038, field2004, field2025, var16.field2045 - field1988, var16.field2051 - field2003, var16.field2046 - field2000, var16.field2050);
                                    }

                                    for(var10 = 0; var10 < var9.field1826; ++var10) {
                                       var17 = var9.field1827[var10];
                                       if (var17 != null) {
                                          var17.field2109.vmethod3066(var17.field2106, field2002, field2038, field2004, field2025, var17.field2100 - field1988, var17.field2099 - field2003, var17.field2103 - field2000, var17.field2110);
                                       }
                                    }
                                 }

                                 var18 = false;
                                 if (var3.field1820 != null) {
                                    if (!this.method2924(var7, var4, var5)) {
                                       var18 = true;
                                       if (var3.field1820.field1959 != 12345678 || field2007 && var6 <= field2008) {
                                          this.method2968(var3.field1820, var7, field2002, field2038, field2004, field2025, var4, var5);
                                       }
                                    }
                                 } else if (var3.field1816 != null && !this.method2924(var7, var4, var5)) {
                                    var18 = true;
                                    this.method2920(var3.field1816, field2002, field2038, field2004, field2025, var4, var5);
                                 }

                                 var19 = 0;
                                 var10 = 0;
                                 class140 var23 = var3.field1838;
                                 class145 var24 = var3.field1819;
                                 if (var23 != null || var24 != null) {
                                    if (var4 == field1997) {
                                       ++var19;
                                    } else if (field1997 < var4) {
                                       var19 += 2;
                                    }

                                    if (var5 == field1998) {
                                       var19 += 3;
                                    } else if (field1998 > var5) {
                                       var19 += 6;
                                    }

                                    var10 = field2022[var19];
                                    var3.field1821 = field2024[var19];
                                 }

                                 if (var23 != null) {
                                    if ((var23.field2047 & field1999[var19]) != 0) {
                                       if (var23.field2047 == 16) {
                                          var3.field1834 = 3;
                                          var3.field1818 = field2001[var19];
                                          var3.field1836 = 3 - var3.field1818;
                                       } else if (var23.field2047 == 32) {
                                          var3.field1834 = 6;
                                          var3.field1818 = field1987[var19];
                                          var3.field1836 = 6 - var3.field1818;
                                       } else if (var23.field2047 == 64) {
                                          var3.field1834 = 12;
                                          var3.field1818 = field2027[var19];
                                          var3.field1836 = 12 - var3.field1818;
                                       } else {
                                          var3.field1834 = 9;
                                          var3.field1818 = field2028[var19];
                                          var3.field1836 = 9 - var3.field1818;
                                       }
                                    } else {
                                       var3.field1834 = 0;
                                    }

                                    if ((var23.field2047 & var10) != 0 && !this.method2925(var7, var4, var5, var23.field2047)) {
                                       var23.field2049.vmethod3066(0, field2002, field2038, field2004, field2025, var23.field2045 - field1988, var23.field2051 - field2003, var23.field2046 - field2000, var23.field2050);
                                    }

                                    if ((var23.field2053 & var10) != 0 && !this.method2925(var7, var4, var5, var23.field2053)) {
                                       var23.field2044.vmethod3066(0, field2002, field2038, field2004, field2025, var23.field2045 - field1988, var23.field2051 - field2003, var23.field2046 - field2000, var23.field2050);
                                    }
                                 }

                                 if (var24 != null && !this.method2919(var7, var4, var5, var24.field2085.field2042)) {
                                    if ((var24.field2090 & var10) != 0) {
                                       var24.field2085.vmethod3066(0, field2002, field2038, field2004, field2025, var24.field2091 - field1988 + var24.field2089, var24.field2087 - field2003, var24.field2084 - field2000 + var24.field2086, var24.field2093);
                                    } else if (var24.field2090 == 256) {
                                       var11 = var24.field2091 - field1988;
                                       var12 = var24.field2087 - field2003;
                                       var13 = var24.field2084 - field2000;
                                       var20 = var24.field2088;
                                       if (var20 != 1 && var20 != 2) {
                                          var21 = var11;
                                       } else {
                                          var21 = -var11;
                                       }

                                       int var25;
                                       if (var20 != 2 && var20 != 3) {
                                          var25 = var13;
                                       } else {
                                          var25 = -var13;
                                       }

                                       if (var25 < var21) {
                                          var24.field2085.vmethod3066(0, field2002, field2038, field2004, field2025, var11 + var24.field2089, var12, var13 + var24.field2086, var24.field2093);
                                       } else if (var24.field2092 != null) {
                                          var24.field2092.vmethod3066(0, field2002, field2038, field2004, field2025, var11, var12, var13, var24.field2093);
                                       }
                                    }
                                 }

                                 if (var18) {
                                    class127 var34 = var3.field1823;
                                    if (var34 != null) {
                                       var34.field1783.vmethod3066(0, field2002, field2038, field2004, field2025, var34.field1781 - field1988, var34.field1782 - field2003, var34.field1787 - field2000, var34.field1780);
                                    }

                                    class124 var26 = var3.field1825;
                                    if (var26 != null && var26.field1710 == 0) {
                                       if (var26.field1707 != null) {
                                          var26.field1707.vmethod3066(0, field2002, field2038, field2004, field2025, var26.field1708 - field1988, var26.field1703 - field2003, var26.field1705 - field2000, var26.field1704);
                                       }

                                       if (var26.field1709 != null) {
                                          var26.field1709.vmethod3066(0, field2002, field2038, field2004, field2025, var26.field1708 - field1988, var26.field1703 - field2003, var26.field1705 - field2000, var26.field1704);
                                       }

                                       if (var26.field1706 != null) {
                                          var26.field1706.vmethod3066(0, field2002, field2038, field2004, field2025, var26.field1708 - field1988, var26.field1703 - field2003, var26.field1705 - field2000, var26.field1704);
                                       }
                                    }
                                 }

                                 var11 = var3.field1829;
                                 if (var11 != 0) {
                                    if (var4 < field1997 && (var11 & 4) != 0) {
                                       var22 = var8[var4 + 1][var5];
                                       if (var22 != null && var22.field1832) {
                                          field2021.method4020(var22);
                                       }
                                    }

                                    if (var5 < field1998 && (var11 & 2) != 0) {
                                       var22 = var8[var4][var5 + 1];
                                       if (var22 != null && var22.field1832) {
                                          field2021.method4020(var22);
                                       }
                                    }

                                    if (var4 > field1997 && (var11 & 1) != 0) {
                                       var22 = var8[var4 - 1][var5];
                                       if (var22 != null && var22.field1832) {
                                          field2021.method4020(var22);
                                       }
                                    }

                                    if (var5 > field1998 && (var11 & 8) != 0) {
                                       var22 = var8[var4][var5 - 1];
                                       if (var22 != null && var22.field1832) {
                                          field2021.method4020(var22);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.field1834 != 0) {
                                 var18 = true;

                                 for(var19 = 0; var19 < var3.field1826; ++var19) {
                                    if (var3.field1827[var19].field2098 != field1992 && (var3.field1828[var19] & var3.field1834) == var3.field1818) {
                                       var18 = false;
                                       break;
                                    }
                                 }

                                 if (var18) {
                                    var16 = var3.field1838;
                                    if (!this.method2925(var7, var4, var5, var16.field2047)) {
                                       var16.field2049.vmethod3066(0, field2002, field2038, field2004, field2025, var16.field2045 - field1988, var16.field2051 - field2003, var16.field2046 - field2000, var16.field2050);
                                    }

                                    var3.field1834 = 0;
                                 }
                              }

                              if (!var3.field1833) {
                                 break;
                              }

                              try {
                                 int var32 = var3.field1826;
                                 var3.field1833 = false;
                                 var19 = 0;

                                 label562:
                                 for(var10 = 0; var10 < var32; ++var10) {
                                    var17 = var3.field1827[var10];
                                    if (var17.field2098 != field1992) {
                                       for(var14 = var17.field2104; var14 <= var17.field2101; ++var14) {
                                          for(var11 = var17.field2102; var11 <= var17.field2107; ++var11) {
                                             var22 = var8[var14][var11];
                                             if (var22.field1831) {
                                                var3.field1833 = true;
                                                continue label562;
                                             }

                                             if (var22.field1834 != 0) {
                                                var13 = 0;
                                                if (var14 > var17.field2104) {
                                                   ++var13;
                                                }

                                                if (var14 < var17.field2101) {
                                                   var13 += 4;
                                                }

                                                if (var11 > var17.field2102) {
                                                   var13 += 8;
                                                }

                                                if (var11 < var17.field2107) {
                                                   var13 += 2;
                                                }

                                                if ((var13 & var22.field1834) == var3.field1836) {
                                                   var3.field1833 = true;
                                                   continue label562;
                                                }
                                             }
                                          }
                                       }

                                       field2006[var19++] = var17;
                                       var14 = field1997 - var17.field2104;
                                       var11 = var17.field2101 - field1997;
                                       if (var11 > var14) {
                                          var14 = var11;
                                       }

                                       var12 = field1998 - var17.field2102;
                                       var13 = var17.field2107 - field1998;
                                       if (var13 > var12) {
                                          var17.field2108 = var14 + var13;
                                       } else {
                                          var17.field2108 = var14 + var12;
                                       }
                                    }
                                 }

                                 while(var19 > 0) {
                                    var10 = -50;
                                    var15 = -1;

                                    class146 var33;
                                    for(var14 = 0; var14 < var19; ++var14) {
                                       var33 = field2006[var14];
                                       if (var33.field2098 != field1992) {
                                          if (var33.field2108 > var10) {
                                             var10 = var33.field2108;
                                             var15 = var14;
                                          } else if (var10 == var33.field2108) {
                                             var12 = var33.field2100 - field1988;
                                             var13 = var33.field2103 - field2000;
                                             var20 = field2006[var15].field2100 - field1988;
                                             var21 = field2006[var15].field2103 - field2000;
                                             if (var12 * var12 + var13 * var13 > var20 * var20 + var21 * var21) {
                                                var15 = var14;
                                             }
                                          }
                                       }
                                    }

                                    if (var15 == -1) {
                                       break;
                                    }

                                    var33 = field2006[var15];
                                    var33.field2098 = field1992;
                                    if (!this.method2877(var7, var33.field2104, var33.field2101, var33.field2102, var33.field2107, var33.field2109.field2042)) {
                                       var33.field2109.vmethod3066(var33.field2106, field2002, field2038, field2004, field2025, var33.field2100 - field1988, var33.field2099 - field2003, var33.field2103 - field2000, var33.field2110);
                                    }

                                    for(var11 = var33.field2104; var11 <= var33.field2101; ++var11) {
                                       for(var12 = var33.field2102; var12 <= var33.field2107; ++var12) {
                                          class130 var35 = var8[var11][var12];
                                          if (var35.field1834 != 0) {
                                             field2021.method4020(var35);
                                          } else if ((var11 != var4 || var12 != var5) && var35.field1832) {
                                             field2021.method4020(var35);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.field1833) {
                                    break;
                                 }
                              } catch (Exception var27) {
                                 var3.field1833 = false;
                                 break;
                              }
                           }
                        } while(!var3.field1832);
                     } while(var3.field1834 != 0);

                     if (var4 > field1997 || var4 <= field1993) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field1832);

                  if (var4 < field1997 || var4 >= field1994 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field1832);

               if (var5 > field1998 || var5 <= field1976) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field1832);

            if (var5 < field1998 || var5 >= field1986 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field1832);

         var3.field1832 = false;
         --field1990;
         class124 var28 = var3.field1825;
         if (var28 != null && var28.field1710 != 0) {
            if (var28.field1707 != null) {
               var28.field1707.vmethod3066(0, field2002, field2038, field2004, field2025, var28.field1708 - field1988, var28.field1703 - field2003 - var28.field1710, var28.field1705 - field2000, var28.field1704);
            }

            if (var28.field1709 != null) {
               var28.field1709.vmethod3066(0, field2002, field2038, field2004, field2025, var28.field1708 - field1988, var28.field1703 - field2003 - var28.field1710, var28.field1705 - field2000, var28.field1704);
            }

            if (var28.field1706 != null) {
               var28.field1706.vmethod3066(0, field2002, field2038, field2004, field2025, var28.field1708 - field1988, var28.field1703 - field2003 - var28.field1710, var28.field1705 - field2000, var28.field1704);
            }
         }

         if (var3.field1821 != 0) {
            class145 var29 = var3.field1819;
            if (var29 != null && !this.method2919(var7, var4, var5, var29.field2085.field2042)) {
               if ((var29.field2090 & var3.field1821) != 0) {
                  var29.field2085.vmethod3066(0, field2002, field2038, field2004, field2025, var29.field2091 - field1988 + var29.field2089, var29.field2087 - field2003, var29.field2084 - field2000 + var29.field2086, var29.field2093);
               } else if (var29.field2090 == 256) {
                  var10 = var29.field2091 - field1988;
                  var15 = var29.field2087 - field2003;
                  var14 = var29.field2084 - field2000;
                  var11 = var29.field2088;
                  if (var11 != 1 && var11 != 2) {
                     var12 = var10;
                  } else {
                     var12 = -var10;
                  }

                  if (var11 != 2 && var11 != 3) {
                     var13 = var14;
                  } else {
                     var13 = -var14;
                  }

                  if (var13 >= var12) {
                     var29.field2085.vmethod3066(0, field2002, field2038, field2004, field2025, var10 + var29.field2089, var15, var14 + var29.field2086, var29.field2093);
                  } else if (var29.field2092 != null) {
                     var29.field2092.vmethod3066(0, field2002, field2038, field2004, field2025, var10, var15, var14, var29.field2093);
                  }
               }
            }

            class140 var31 = var3.field1838;
            if (var31 != null) {
               if ((var31.field2053 & var3.field1821) != 0 && !this.method2925(var7, var4, var5, var31.field2053)) {
                  var31.field2044.vmethod3066(0, field2002, field2038, field2004, field2025, var31.field2045 - field1988, var31.field2051 - field2003, var31.field2046 - field2000, var31.field2050);
               }

               if ((var31.field2047 & var3.field1821) != 0 && !this.method2925(var7, var4, var5, var31.field2047)) {
                  var31.field2049.vmethod3066(0, field2002, field2038, field2004, field2025, var31.field2045 - field1988, var31.field2051 - field2003, var31.field2046 - field2000, var31.field2050);
               }
            }
         }

         class130 var30;
         if (var6 < this.field1977 - 1) {
            var30 = this.field1981[var6 + 1][var4][var5];
            if (var30 != null && var30.field1832) {
               field2021.method4020(var30);
            }
         }

         if (var4 < field1997) {
            var30 = var8[var4 + 1][var5];
            if (var30 != null && var30.field1832) {
               field2021.method4020(var30);
            }
         }

         if (var5 < field1998) {
            var30 = var8[var4][var5 + 1];
            if (var30 != null && var30.field1832) {
               field2021.method4020(var30);
            }
         }

         if (var4 > field1997) {
            var30 = var8[var4 - 1][var5];
            if (var30 != null && var30.field1832) {
               field2021.method4020(var30);
            }
         }

         if (var5 > field1998) {
            var30 = var8[var4][var5 - 1];
            if (var30 != null && var30.field1832) {
               field2021.method4020(var30);
            }
         }
      }
   }

   public class127 method2901(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      return var4 != null && var4.field1823 != null ? var4.field1823 : null;
   }

   public void method2910(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class130 var7 = this.field1981[var4][var5][var6];
      if (var7 != null) {
         class135 var8 = var7.field1820;
         int var9;
         if (var8 != null) {
            int var10 = var8.field1965;
            if (var10 != 0) {
               for(var9 = 0; var9 < 4; ++var9) {
                  var1[var2] = var10;
                  var1[var2 + 1] = var10;
                  var1[var2 + 2] = var10;
                  var1[var2 + 3] = var10;
                  var2 += var3;
               }
            }
         } else {
            class126 var18 = var7.field1816;
            if (var18 != null) {
               var9 = var18.field1777;
               int var11 = var18.field1770;
               int var12 = var18.field1771;
               int var13 = var18.field1772;
               int[] var14 = this.field2029[var9];
               int[] var15 = this.field2030[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }
            }
         }
      }

   }

   public int method2987(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      return var4 != null && var4.field1838 != null ? var4.field1838.field2050 : 0;
   }

   public int method2905(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      return var4 != null && var4.field1823 != null ? var4.field1823.field1780 : 0;
   }

   public int method2903(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      return var4 != null && var4.field1819 != null ? var4.field1819.field2093 : 0;
   }

   public int method3041(int var1, int var2, int var3, int var4) {
      class130 var5 = this.field1981[var1][var2][var3];
      if (var5 == null) {
         return -1;
      } else if (var5.field1838 != null && var5.field1838.field2050 == var4) {
         return var5.field1838.field2052 & 255;
      } else if (var5.field1819 != null && var5.field1819.field2093 == var4) {
         return var5.field1819.field2094 & 255;
      } else if (var5.field1823 != null && var5.field1823.field1780 == var4) {
         return var5.field1823.field1785 & 255;
      } else {
         for(int var6 = 0; var6 < var5.field1826; ++var6) {
            if (var4 == var5.field1827[var6].field2110) {
               return var5.field1827[var6].field2111 & 255;
            }
         }

         return -1;
      }
   }

   public int method2904(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      if (var4 == null) {
         return 0;
      } else {
         for(int var5 = 0; var5 < var4.field1826; ++var5) {
            class146 var6 = var4.field1827[var5];
            if ((var6.field2110 >> 29 & 3) == 2 && var2 == var6.field2104 && var3 == var6.field2102) {
               return var6.field2110;
            }
         }

         return 0;
      }
   }

   public void method2963(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      if (var4 != null) {
         var4.field1838 = null;
      }

   }

   public void method2894(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      if (var4 != null) {
         var4.field1819 = null;
      }

   }

   public void method2974(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.field1826; ++var5) {
            class146 var6 = var4.field1827[var5];
            if ((var6.field2110 >> 29 & 3) == 2 && var2 == var6.field2104 && var3 == var6.field2102) {
               this.method2891(var6);
               return;
            }
         }
      }

   }

   public void method3011(int var1, int var2, int var3) {
      class130 var4 = this.field1981[var1][var2][var3];
      if (var4 != null) {
         var4.field1823 = null;
      }

   }

   public boolean method3006(int var1, int var2, int var3, int var4, int var5, class139 var6, int var7, int var8, boolean var9) {
      if (var6 == null) {
         return true;
      } else {
         int var10 = var2 - var5;
         int var11 = var3 - var5;
         int var12 = var5 + var2;
         int var13 = var3 + var5;
         if (var9) {
            if (var7 > 640 && var7 < 1408) {
               var13 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var12 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var11 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var10 -= 128;
            }
         }

         var10 /= 128;
         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         return this.method2889(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean method2888(int var1, int var2, int var3, int var4, int var5, class139 var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      return var6 == null ? true : this.method2889(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   public void method2965(int var1, int var2, int var3, int var4, class139 var5, int var6, int var7) {
      if (var5 != null) {
         class127 var8 = new class127();
         var8.field1783 = var5;
         var8.field1781 = var2 * 128 + 64;
         var8.field1787 = var3 * 128 + 64;
         var8.field1782 = var4;
         var8.field1780 = var6;
         var8.field1785 = var7;
         if (this.field1981[var1][var2][var3] == null) {
            this.field1981[var1][var2][var3] = new class130(var1, var2, var3);
         }

         this.field1981[var1][var2][var3].field1823 = var8;
      }

   }

   public boolean method2896(int var1, int var2, int var3, int var4, int var5, int var6, class139 var7, int var8, int var9, int var10) {
      if (var7 == null) {
         return true;
      } else {
         int var11 = var5 * 64 + var2 * 128;
         int var12 = var6 * 64 + var3 * 128;
         return this.method2889(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
      }
   }

   public void method2884(int var1, int var2, int var3, int var4, class139 var5, class139 var6, int var7, int var8, int var9, int var10) {
      if (var5 != null || var6 != null) {
         class140 var11 = new class140();
         var11.field2050 = var9;
         var11.field2052 = var10;
         var11.field2045 = var2 * 128 + 64;
         var11.field2046 = var3 * 128 + 64;
         var11.field2051 = var4;
         var11.field2049 = var5;
         var11.field2044 = var6;
         var11.field2047 = var7;
         var11.field2053 = var8;

         for(int var12 = var1; var12 >= 0; --var12) {
            if (this.field1981[var12][var2][var3] == null) {
               this.field1981[var12][var2][var3] = new class130(var12, var2, var3);
            }
         }

         this.field1981[var1][var2][var3].field1838 = var11;
      }

   }

   public void method2885(int var1, int var2, int var3, int var4, class139 var5, class139 var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      if (var5 != null) {
         class145 var13 = new class145();
         var13.field2093 = var11;
         var13.field2094 = var12;
         var13.field2091 = var2 * 128 + 64;
         var13.field2084 = var3 * 128 + 64;
         var13.field2087 = var4;
         var13.field2085 = var5;
         var13.field2092 = var6;
         var13.field2090 = var7;
         var13.field2088 = var8;
         var13.field2089 = var9;
         var13.field2086 = var10;

         for(int var14 = var1; var14 >= 0; --var14) {
            if (this.field1981[var14][var2][var3] == null) {
               this.field1981[var14][var2][var3] = new class130(var14, var2, var3);
            }
         }

         this.field1981[var1][var2][var3].field1819 = var13;
      }

   }

   public void method2907(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1977; ++var4) {
         for(int var5 = 0; var5 < this.field1978; ++var5) {
            for(int var6 = 0; var6 < this.field1979; ++var6) {
               class130 var7 = this.field1981[var4][var5][var6];
               if (var7 != null) {
                  class140 var8 = var7.field1838;
                  class125 var9;
                  if (var8 != null && var8.field2049 instanceof class125) {
                     class125 var10 = (class125)var8.field2049;
                     this.method3029(var10, var4, var5, var6, 1, 1);
                     if (var8.field2044 instanceof class125) {
                        var9 = (class125)var8.field2044;
                        this.method3029(var9, var4, var5, var6, 1, 1);
                        class125.method2602(var10, var9, 0, 0, 0, false);
                        var8.field2044 = var9.method2596(var9.field1749, var9.field1746, var1, var2, var3);
                     }

                     var8.field2049 = var10.method2596(var10.field1749, var10.field1746, var1, var2, var3);
                  }

                  for(int var13 = 0; var13 < var7.field1826; ++var13) {
                     class146 var11 = var7.field1827[var13];
                     if (var11 != null && var11.field2109 instanceof class125) {
                        class125 var12 = (class125)var11.field2109;
                        this.method3029(var12, var4, var5, var6, var11.field2101 - var11.field2104 + 1, var11.field2107 - var11.field2102 + 1);
                        var11.field2109 = var12.method2596(var12.field1749, var12.field1746, var1, var2, var3);
                     }
                  }

                  class127 var14 = var7.field1823;
                  if (var14 != null && var14.field1783 instanceof class125) {
                     var9 = (class125)var14.field1783;
                     this.method2934(var9, var4, var5, var6);
                     var14.field1783 = var9.method2596(var9.field1749, var9.field1746, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public void method3009(int var1, int var2) {
      class130 var3 = this.field1981[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class130 var5 = this.field1981[var4][var1][var2] = this.field1981[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.field1840;

            for(int var6 = 0; var6 < var5.field1826; ++var6) {
               class146 var7 = var5.field1827[var6];
               if ((var7.field2110 >> 29 & 3) == 2 && var7.field2104 == var1 && var2 == var7.field2102) {
                  --var7.field2105;
               }
            }
         }
      }

      if (this.field1981[0][var1][var2] == null) {
         this.field1981[0][var1][var2] = new class130(0, var1, var2);
      }

      this.field1981[0][var1][var2].field1835 = var3;
      this.field1981[3][var1][var2] = null;
   }

   public void method2881(int var1, int var2, int var3, int var4) {
      class130 var5 = this.field1981[var1][var2][var3];
      if (var5 != null) {
         this.field1981[var1][var2][var3].field1830 = var4;
      }

   }

   public void method2879(int var1) {
      this.field1996 = var1;

      for(int var2 = 0; var2 < this.field1978; ++var2) {
         for(int var3 = 0; var3 < this.field1979; ++var3) {
            if (this.field1981[var1][var2][var3] == null) {
               this.field1981[var1][var2][var3] = new class130(var1, var2, var3);
            }
         }
      }

   }

   public void method2917(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field1978 * 128) {
         var1 = this.field1978 * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field1979 * 128) {
         var3 = this.field1979 * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++field1992;
      field2002 = class134.field1955[var4];
      field2038 = class134.field1933[var4];
      field2004 = class134.field1955[var5];
      field2025 = class134.field1933[var5];
      field2032 = field2031[(var4 - 128) / 32][var5 / 64];
      field1988 = var1;
      field2003 = var2;
      field2000 = var3;
      field1997 = var1 / 128;
      field1998 = var3 / 128;
      field1991 = var6;
      field1993 = field1997 - 25;
      if (field1993 < 0) {
         field1993 = 0;
      }

      field1976 = field1998 - 25;
      if (field1976 < 0) {
         field1976 = 0;
      }

      field1994 = field1997 + 25;
      if (field1994 > this.field1978) {
         field1994 = this.field1978;
      }

      field1986 = field1998 + 25;
      if (field1986 > this.field1979) {
         field1986 = this.field1979;
      }

      this.method2923();
      field1990 = 0;

      int var7;
      class130[][] var8;
      int var9;
      int var10;
      for(var7 = this.field1996; var7 < this.field1977; ++var7) {
         var8 = this.field1981[var7];

         for(var9 = field1993; var9 < field1994; ++var9) {
            for(var10 = field1976; var10 < field1986; ++var10) {
               class130 var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.field1830 > var6 || !field2032[var9 - field1997 + 25][var10 - field1998 + 25] && this.field1980[var7][var9][var10] - var2 < 2000) {
                     var11.field1831 = false;
                     var11.field1832 = false;
                     var11.field1834 = 0;
                  } else {
                     var11.field1831 = true;
                     var11.field1832 = true;
                     if (var11.field1826 > 0) {
                        var11.field1833 = true;
                     } else {
                        var11.field1833 = false;
                     }

                     ++field1990;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class130 var15;
      int var16;
      for(var7 = this.field1996; var7 < this.field1977; ++var7) {
         var8 = this.field1981[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + field1997;
            var16 = field1997 - var9;
            if (var10 >= field1993 || var16 < field1994) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = var12 + field1998;
                  var14 = field1998 - var12;
                  if (var10 >= field1993) {
                     if (var13 >= field1976) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field1831) {
                           this.method2918(var15, true);
                        }
                     }

                     if (var14 < field1986) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field1831) {
                           this.method2918(var15, true);
                        }
                     }
                  }

                  if (var16 < field1994) {
                     if (var13 >= field1976) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field1831) {
                           this.method2918(var15, true);
                        }
                     }

                     if (var14 < field1986) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field1831) {
                           this.method2918(var15, true);
                        }
                     }
                  }

                  if (field1990 == 0) {
                     field2007 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field1996; var7 < this.field1977; ++var7) {
         var8 = this.field1981[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + field1997;
            var16 = field1997 - var9;
            if (var10 >= field1993 || var16 < field1994) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = var12 + field1998;
                  var14 = field1998 - var12;
                  if (var10 >= field1993) {
                     if (var13 >= field1976) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field1831) {
                           this.method2918(var15, false);
                        }
                     }

                     if (var14 < field1986) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field1831) {
                           this.method2918(var15, false);
                        }
                     }
                  }

                  if (var16 < field1994) {
                     if (var13 >= field1976) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field1831) {
                           this.method2918(var15, false);
                        }
                     }

                     if (var14 < field1986) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field1831) {
                           this.method2918(var15, false);
                        }
                     }
                  }

                  if (field1990 == 0) {
                     field2007 = false;
                     return;
                  }
               }
            }
         }
      }

      field2007 = false;
   }

   public void method2890() {
      for(int var1 = 0; var1 < this.field2023; ++var1) {
         class146 var2 = this.field1984[var1];
         this.method2891(var2);
         this.field1984[var1] = null;
      }

      this.field2023 = 0;
   }

   public void method2892(int var1, int var2, int var3, int var4) {
      class130 var5 = this.field1981[var1][var2][var3];
      if (var5 != null) {
         class145 var6 = var5.field1819;
         if (var6 != null) {
            var6.field2089 = var4 * var6.field2089 / 16;
            var6.field2086 = var4 * var6.field2086 / 16;
         }
      }

   }

   public void method2882(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class135 var21;
      int var22;
      if (var4 == 0) {
         var21 = new class135(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field1981[var22][var2][var3] == null) {
               this.field1981[var22][var2][var3] = new class130(var22, var2, var3);
            }
         }

         this.field1981[var1][var2][var3].field1820 = var21;
      } else if (var4 != 1) {
         class126 var23 = new class126(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field1981[var22][var2][var3] == null) {
               this.field1981[var22][var2][var3] = new class130(var22, var2, var3);
            }
         }

         this.field1981[var1][var2][var3].field1816 = var23;
      } else {
         var21 = new class135(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field1981[var22][var2][var3] == null) {
               this.field1981[var22][var2][var3] = new class130(var22, var2, var3);
            }
         }

         this.field1981[var1][var2][var3].field1820 = var21;
      }

   }

   public void method3061() {
      field2013 = true;
   }

   public static boolean method2915() {
      return field2013 && field2011 != -1;
   }

   public static final int[] method2929(int var0, int var1, int var2) {
      int var3 = var0 * field2025 + var2 * field2004 >> 16;
      var2 = var2 * field2025 - var0 * field2004 >> 16;
      var0 = var3;
      var3 = field2038 * var1 - var2 * field2002 >> 16;
      var2 = field2002 * var1 + var2 * field2038 >> 16;
      var2 |= 1;
      int var4 = var0 * class134.field1941 / var2 + class134.field1942 + class327.field3952;
      int var5 = class134.field1941 * var3 / var2 + class134.field1943 + class327.field3955;
      return new int[]{var4, var5};
   }

   static boolean method2991(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
         int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
         return var8 == 0 ? (var9 != 0 ? (var9 < 0 ? var10 <= 0 : var10 >= 0) : true) : (var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0);
      }
   }

   public static void method3017(int[] var0, int var1, int var2, int var3, int var4) {
      field2035 = 0;
      field2036 = 0;
      field2037 = var3;
      field2014 = var4;
      field2033 = var3 / 2;
      field2034 = var4 / 2;
      boolean[][][][] var5 = new boolean[9][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var6 = 128; var6 <= 384; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field2002 = class134.field1955[var6];
            field2038 = class134.field1933[var6];
            field2004 = class134.field1955[var7];
            field2025 = class134.field1933[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var12 = -26; var12 <= 26; ++var12) {
               for(var10 = -26; var10 <= 26; ++var10) {
                  var11 = var12 * 128;
                  int var13 = var10 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (method2912(var11, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var12 + 1 + 25][var10 + 1 + 25] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for(var10 = -1; var10 <= 1; ++var10) {
                     for(var11 = -1; var11 <= 1; ++var11) {
                        if (var5[var6][var7][var8 + var10 + 1 + 25][var9 + var11 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var10 + 1 + 25][var9 + var11 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][var7][var8 + var10 + 1 + 25][var9 + var11 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var10 + 1 + 25][var9 + var11 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  field2031[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   static final int method2921(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static boolean method2912(int var0, int var1, int var2) {
      int var3 = var0 * field2025 + var2 * field2004 >> 16;
      int var4 = var2 * field2025 - var0 * field2004 >> 16;
      int var5 = var4 * field2038 + field2002 * var1 >> 16;
      int var6 = field2038 * var1 - var4 * field2002 >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = var3 * 390 / var5 + field2033;
         int var8 = var6 * 390 / var5 + field2034;
         return var7 >= field2035 && var7 <= field2037 && var8 >= field2036 && var8 <= field2014;
      } else {
         return false;
      }
   }

   public static void method3048() {
      field2011 = -1;
      field2013 = false;
   }

   public static void method2979(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class144 var8 = new class144();
      var8.field2075 = var2 / 128;
      var8.field2067 = var3 / 128;
      var8.field2076 = var4 / 128;
      var8.field2069 = var5 / 128;
      var8.field2072 = var1;
      var8.field2079 = var2;
      var8.field2083 = var3;
      var8.field2073 = var4;
      var8.field2074 = var5;
      var8.field2078 = var6;
      var8.field2066 = var7;
      field2018[var0][field2017[var0]++] = var8;
   }

   static {
      field2017 = new int[field2016];
      field2018 = new class144[field2016][500];
      field1982 = 0;
      field2020 = new class144[500];
      field2021 = new class217();
      field2022 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field1999 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field2024 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field2001 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field1987 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field2027 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field2028 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field2031 = new boolean[8][32][51][51];
   }
}

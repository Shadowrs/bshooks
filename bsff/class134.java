public class class134 extends class327 {
   static boolean field1940 = false;
   static int field1942;
   static int field1943;
   static int field1934 = 0;
   static boolean field1931 = false;
   static boolean field1932 = false;
   public static boolean field1930 = true;
   public static int[] field1955 = new int[2048];
   public static int[] field1933 = new int[2048];
   public static int field1941 = 512;
   static int[] field1954 = new int[1024];
   public static int[] field1937 = new int[65536];
   static int[] field1953 = new int[512];
   public static class143 field1944;
   static int[] field1951 = new int[2048];
   static int field1947;
   static int field1946;
   static int field1945;
   static int field1948;
   static int field1949;
   static int field1952;

   static final int method2809(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var3 * var1 >> 16;
   }

   static final int method2810(int var0, int var1, int var2, int var3) {
      return var2 * var1 - var3 * var0 >> 16;
   }

   static int method2799(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var7 = (double)(var0 & 255) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0D);
      int var10 = (int)(var5 * 256.0D);
      int var11 = (int)(var7 * 256.0D);
      return var11 + (var10 << 8) + (var9 << 16);
   }

   public static final void method2803(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if (var0 != var1) {
         var7 = (var4 - var3 << 14) / (var1 - var0);
      }

      int var8 = 0;
      if (var2 != var1) {
         var8 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var9 = 0;
      if (var0 != var2) {
         var9 = (var3 - var5 << 14) / (var0 - var2);
      }

      if (var0 <= var1 && var0 <= var2) {
         if (var0 < field1952) {
            if (var1 > field1952) {
               var1 = field1952;
            }

            if (var2 > field1952) {
               var2 = field1952;
            }

            if (var1 < var2) {
               var5 = var3 <<= 14;
               if (var0 < 0) {
                  var5 -= var0 * var9;
                  var3 -= var0 * var7;
                  var0 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               if ((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = field1954[var0];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method2804(class327.field3958, var0, var6, 0, var4 >> 14, var5 >> 14);
                           var5 += var9;
                           var4 += var8;
                           var0 += class327.field3954;
                        }
                     }

                     method2804(class327.field3958, var0, var6, 0, var3 >> 14, var5 >> 14);
                     var5 += var9;
                     var3 += var7;
                     var0 += class327.field3954;
                  }
               }

               var2 -= var1;
               var1 -= var0;
               var0 = field1954[var0];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        method2804(class327.field3958, var0, var6, 0, var5 >> 14, var4 >> 14);
                        var5 += var9;
                        var4 += var8;
                        var0 += class327.field3954;
                     }
                  }

                  method2804(class327.field3958, var0, var6, 0, var5 >> 14, var3 >> 14);
                  var5 += var9;
                  var3 += var7;
                  var0 += class327.field3954;
               }
            }

            var4 = var3 <<= 14;
            if (var0 < 0) {
               var4 -= var0 * var9;
               var3 -= var0 * var7;
               var0 = 0;
            }

            var5 <<= 14;
            if (var2 < 0) {
               var5 -= var8 * var2;
               var2 = 0;
            }

            if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
               var1 -= var2;
               var2 -= var0;
               var0 = field1954[var0];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method2804(class327.field3958, var0, var6, 0, var5 >> 14, var3 >> 14);
                        var5 += var8;
                        var3 += var7;
                        var0 += class327.field3954;
                     }
                  }

                  method2804(class327.field3958, var0, var6, 0, var4 >> 14, var3 >> 14);
                  var4 += var9;
                  var3 += var7;
                  var0 += class327.field3954;
               }
            }

            var1 -= var2;
            var2 -= var0;
            var0 = field1954[var0];

            while(true) {
               --var2;
               if (var2 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        return;
                     }

                     method2804(class327.field3958, var0, var6, 0, var3 >> 14, var5 >> 14);
                     var5 += var8;
                     var3 += var7;
                     var0 += class327.field3954;
                  }
               }

               method2804(class327.field3958, var0, var6, 0, var3 >> 14, var4 >> 14);
               var4 += var9;
               var3 += var7;
               var0 += class327.field3954;
            }
         }
      } else if (var1 <= var2) {
         if (var1 < field1952) {
            if (var2 > field1952) {
               var2 = field1952;
            }

            if (var0 > field1952) {
               var0 = field1952;
            }

            if (var2 < var0) {
               var3 = var4 <<= 14;
               if (var1 < 0) {
                  var3 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var9 * var2;
                  var2 = 0;
               }

               if ((var2 == var1 || var7 >= var8) && (var2 != var1 || var7 <= var9)) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = field1954[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method2804(class327.field3958, var1, var6, 0, var5 >> 14, var3 >> 14);
                           var3 += var7;
                           var5 += var9;
                           var1 += class327.field3954;
                        }
                     }

                     method2804(class327.field3958, var1, var6, 0, var4 >> 14, var3 >> 14);
                     var3 += var7;
                     var4 += var8;
                     var1 += class327.field3954;
                  }
               }

               var0 -= var2;
               var2 -= var1;
               var1 = field1954[var1];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        method2804(class327.field3958, var1, var6, 0, var3 >> 14, var5 >> 14);
                        var3 += var7;
                        var5 += var9;
                        var1 += class327.field3954;
                     }
                  }

                  method2804(class327.field3958, var1, var6, 0, var3 >> 14, var4 >> 14);
                  var3 += var7;
                  var4 += var8;
                  var1 += class327.field3954;
               }
            }

            var5 = var4 <<= 14;
            if (var1 < 0) {
               var5 -= var7 * var1;
               var4 -= var8 * var1;
               var1 = 0;
            }

            var3 <<= 14;
            if (var0 < 0) {
               var3 -= var0 * var9;
               var0 = 0;
            }

            if (var7 < var8) {
               var2 -= var0;
               var0 -= var1;
               var1 = field1954[var1];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        method2804(class327.field3958, var1, var6, 0, var3 >> 14, var4 >> 14);
                        var3 += var9;
                        var4 += var8;
                        var1 += class327.field3954;
                     }
                  }

                  method2804(class327.field3958, var1, var6, 0, var5 >> 14, var4 >> 14);
                  var5 += var7;
                  var4 += var8;
                  var1 += class327.field3954;
               }
            }

            var2 -= var0;
            var0 -= var1;
            var1 = field1954[var1];

            while(true) {
               --var0;
               if (var0 < 0) {
                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        return;
                     }

                     method2804(class327.field3958, var1, var6, 0, var4 >> 14, var3 >> 14);
                     var3 += var9;
                     var4 += var8;
                     var1 += class327.field3954;
                  }
               }

               method2804(class327.field3958, var1, var6, 0, var4 >> 14, var5 >> 14);
               var5 += var7;
               var4 += var8;
               var1 += class327.field3954;
            }
         }
      } else if (var2 < field1952) {
         if (var0 > field1952) {
            var0 = field1952;
         }

         if (var1 > field1952) {
            var1 = field1952;
         }

         if (var0 < var1) {
            var4 = var5 <<= 14;
            if (var2 < 0) {
               var4 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var3 <<= 14;
            if (var0 < 0) {
               var3 -= var0 * var7;
               var0 = 0;
            }

            if (var8 < var9) {
               var1 -= var0;
               var0 -= var2;
               var2 = field1954[var2];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method2804(class327.field3958, var2, var6, 0, var4 >> 14, var3 >> 14);
                        var4 += var8;
                        var3 += var7;
                        var2 += class327.field3954;
                     }
                  }

                  method2804(class327.field3958, var2, var6, 0, var4 >> 14, var5 >> 14);
                  var4 += var8;
                  var5 += var9;
                  var2 += class327.field3954;
               }
            }

            var1 -= var0;
            var0 -= var2;
            var2 = field1954[var2];

            while(true) {
               --var0;
               if (var0 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        return;
                     }

                     method2804(class327.field3958, var2, var6, 0, var3 >> 14, var4 >> 14);
                     var4 += var8;
                     var3 += var7;
                     var2 += class327.field3954;
                  }
               }

               method2804(class327.field3958, var2, var6, 0, var5 >> 14, var4 >> 14);
               var4 += var8;
               var5 += var9;
               var2 += class327.field3954;
            }
         }

         var3 = var5 <<= 14;
         if (var2 < 0) {
            var3 -= var8 * var2;
            var5 -= var9 * var2;
            var2 = 0;
         }

         var4 <<= 14;
         if (var1 < 0) {
            var4 -= var7 * var1;
            var1 = 0;
         }

         if (var8 < var9) {
            var0 -= var1;
            var1 -= var2;
            var2 = field1954[var2];

            while(true) {
               --var1;
               if (var1 < 0) {
                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        return;
                     }

                     method2804(class327.field3958, var2, var6, 0, var4 >> 14, var5 >> 14);
                     var4 += var7;
                     var5 += var9;
                     var2 += class327.field3954;
                  }
               }

               method2804(class327.field3958, var2, var6, 0, var3 >> 14, var5 >> 14);
               var3 += var8;
               var5 += var9;
               var2 += class327.field3954;
            }
         }

         var0 -= var1;
         var1 -= var2;
         var2 = field1954[var2];

         while(true) {
            --var1;
            if (var1 < 0) {
               while(true) {
                  --var0;
                  if (var0 < 0) {
                     return;
                  }

                  method2804(class327.field3958, var2, var6, 0, var5 >> 14, var4 >> 14);
                  var4 += var7;
                  var5 += var9;
                  var2 += class327.field3954;
               }
            }

            method2804(class327.field3958, var2, var6, 0, var5 >> 14, var3 >> 14);
            var3 += var8;
            var5 += var9;
            var2 += class327.field3954;
         }
      }

   }

   static final void method2801(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var4 - var3;
      int var10 = var1 - var0;
      int var11 = var5 - var3;
      int var12 = var2 - var0;
      int var13 = var7 - var6;
      int var14 = var8 - var6;
      int var15;
      if (var2 != var1) {
         var15 = (var5 - var4 << 14) / (var2 - var1);
      } else {
         var15 = 0;
      }

      int var16;
      if (var0 != var1) {
         var16 = (var9 << 14) / var10;
      } else {
         var16 = 0;
      }

      int var17;
      if (var0 != var2) {
         var17 = (var11 << 14) / var12;
      } else {
         var17 = 0;
      }

      int var18 = var9 * var12 - var11 * var10;
      if (var18 != 0) {
         int var19 = (var13 * var12 - var14 * var10 << 8) / var18;
         int var20 = (var14 * var9 - var13 * var11 << 8) / var18;
         if (var0 <= var1 && var0 <= var2) {
            if (var0 < field1952) {
               if (var1 > field1952) {
                  var1 = field1952;
               }

               if (var2 > field1952) {
                  var2 = field1952;
               }

               var6 = var19 + ((var6 << 8) - var3 * var19);
               if (var1 < var2) {
                  var5 = var3 <<= 14;
                  if (var0 < 0) {
                     var5 -= var0 * var17;
                     var3 -= var0 * var16;
                     var6 -= var0 * var20;
                     var0 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var15 * var1;
                     var1 = 0;
                  }

                  if (var0 != var1 && var17 < var16 || var0 == var1 && var17 > var15) {
                     var2 -= var1;
                     var1 -= var0;
                     var0 = field1954[var0];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              method2816(class327.field3958, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19);
                              var5 += var17;
                              var4 += var15;
                              var6 += var20;
                              var0 += class327.field3954;
                           }
                        }

                        method2816(class327.field3958, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
                        var5 += var17;
                        var3 += var16;
                        var6 += var20;
                        var0 += class327.field3954;
                     }
                  }

                  var2 -= var1;
                  var1 -= var0;
                  var0 = field1954[var0];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method2816(class327.field3958, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19);
                           var5 += var17;
                           var4 += var15;
                           var6 += var20;
                           var0 += class327.field3954;
                        }
                     }

                     method2816(class327.field3958, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
                     var5 += var17;
                     var3 += var16;
                     var6 += var20;
                     var0 += class327.field3954;
                  }
               }

               var4 = var3 <<= 14;
               if (var0 < 0) {
                  var4 -= var0 * var17;
                  var3 -= var0 * var16;
                  var6 -= var0 * var20;
                  var0 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var15 * var2;
                  var2 = 0;
               }

               if ((var0 == var2 || var17 >= var16) && (var0 != var2 || var15 <= var16)) {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = field1954[var0];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method2816(class327.field3958, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
                           var5 += var15;
                           var3 += var16;
                           var6 += var20;
                           var0 += class327.field3954;
                        }
                     }

                     method2816(class327.field3958, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19);
                     var4 += var17;
                     var3 += var16;
                     var6 += var20;
                     var0 += class327.field3954;
                  }
               }

               var1 -= var2;
               var2 -= var0;
               var0 = field1954[var0];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method2816(class327.field3958, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
                        var5 += var15;
                        var3 += var16;
                        var6 += var20;
                        var0 += class327.field3954;
                     }
                  }

                  method2816(class327.field3958, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19);
                  var4 += var17;
                  var3 += var16;
                  var6 += var20;
                  var0 += class327.field3954;
               }
            }
         } else if (var1 <= var2) {
            if (var1 < field1952) {
               if (var2 > field1952) {
                  var2 = field1952;
               }

               if (var0 > field1952) {
                  var0 = field1952;
               }

               var7 = var19 + ((var7 << 8) - var19 * var4);
               if (var2 < var0) {
                  var3 = var4 <<= 14;
                  if (var1 < 0) {
                     var3 -= var16 * var1;
                     var4 -= var15 * var1;
                     var7 -= var20 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var17 * var2;
                     var2 = 0;
                  }

                  if (var2 != var1 && var16 < var15 || var2 == var1 && var16 > var17) {
                     var0 -= var2;
                     var2 -= var1;
                     var1 = field1954[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var0;
                              if (var0 < 0) {
                                 return;
                              }

                              method2816(class327.field3958, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19);
                              var3 += var16;
                              var5 += var17;
                              var7 += var20;
                              var1 += class327.field3954;
                           }
                        }

                        method2816(class327.field3958, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
                        var3 += var16;
                        var4 += var15;
                        var7 += var20;
                        var1 += class327.field3954;
                     }
                  }

                  var0 -= var2;
                  var2 -= var1;
                  var1 = field1954[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method2816(class327.field3958, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19);
                           var3 += var16;
                           var5 += var17;
                           var7 += var20;
                           var1 += class327.field3954;
                        }
                     }

                     method2816(class327.field3958, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
                     var3 += var16;
                     var4 += var15;
                     var7 += var20;
                     var1 += class327.field3954;
                  }
               }

               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var16 * var1;
                  var4 -= var15 * var1;
                  var7 -= var20 * var1;
                  var1 = 0;
               }

               var3 <<= 14;
               if (var0 < 0) {
                  var3 -= var0 * var17;
                  var0 = 0;
               }

               if (var16 < var15) {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = field1954[var1];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method2816(class327.field3958, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
                           var3 += var17;
                           var4 += var15;
                           var7 += var20;
                           var1 += class327.field3954;
                        }
                     }

                     method2816(class327.field3958, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19);
                     var5 += var16;
                     var4 += var15;
                     var7 += var20;
                     var1 += class327.field3954;
                  }
               }

               var2 -= var0;
               var0 -= var1;
               var1 = field1954[var1];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        method2816(class327.field3958, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
                        var3 += var17;
                        var4 += var15;
                        var7 += var20;
                        var1 += class327.field3954;
                     }
                  }

                  method2816(class327.field3958, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19);
                  var5 += var16;
                  var4 += var15;
                  var7 += var20;
                  var1 += class327.field3954;
               }
            }
         } else if (var2 < field1952) {
            if (var0 > field1952) {
               var0 = field1952;
            }

            if (var1 > field1952) {
               var1 = field1952;
            }

            var8 = var19 + ((var8 << 8) - var5 * var19);
            if (var0 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var15 * var2;
                  var5 -= var17 * var2;
                  var8 -= var20 * var2;
                  var2 = 0;
               }

               var3 <<= 14;
               if (var0 < 0) {
                  var3 -= var0 * var16;
                  var0 = 0;
               }

               if (var15 < var17) {
                  var1 -= var0;
                  var0 -= var2;
                  var2 = field1954[var2];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method2816(class327.field3958, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19);
                           var4 += var15;
                           var3 += var16;
                           var8 += var20;
                           var2 += class327.field3954;
                        }
                     }

                     method2816(class327.field3958, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
                     var4 += var15;
                     var5 += var17;
                     var8 += var20;
                     var2 += class327.field3954;
                  }
               }

               var1 -= var0;
               var0 -= var2;
               var2 = field1954[var2];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method2816(class327.field3958, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19);
                        var4 += var15;
                        var3 += var16;
                        var8 += var20;
                        var2 += class327.field3954;
                     }
                  }

                  method2816(class327.field3958, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
                  var4 += var15;
                  var5 += var17;
                  var8 += var20;
                  var2 += class327.field3954;
               }
            }

            var3 = var5 <<= 14;
            if (var2 < 0) {
               var3 -= var15 * var2;
               var5 -= var17 * var2;
               var8 -= var20 * var2;
               var2 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var16 * var1;
               var1 = 0;
            }

            if (var15 < var17) {
               var0 -= var1;
               var1 -= var2;
               var2 = field1954[var2];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        method2816(class327.field3958, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
                        var4 += var16;
                        var5 += var17;
                        var8 += var20;
                        var2 += class327.field3954;
                     }
                  }

                  method2816(class327.field3958, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19);
                  var3 += var15;
                  var5 += var17;
                  var8 += var20;
                  var2 += class327.field3954;
               }
            }

            var0 -= var1;
            var1 -= var2;
            var2 = field1954[var2];

            while(true) {
               --var1;
               if (var1 < 0) {
                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        return;
                     }

                     method2816(class327.field3958, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
                     var4 += var16;
                     var5 += var17;
                     var8 += var20;
                     var2 += class327.field3954;
                  }
               }

               method2816(class327.field3958, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19);
               var3 += var15;
               var5 += var17;
               var8 += var20;
               var2 += class327.field3954;
            }
         }
      }

   }

   public static final void method2792() {
      method2793(class327.field3952, class327.field3955, class327.field3953, class327.field3956);
   }

   static final void method2793(int var0, int var1, int var2, int var3) {
      field1948 = var2 - var0;
      field1952 = var3 - var1;
      method2836();
      if (field1954.length < field1952) {
         field1954 = new int[class140.method3075(field1952, (short)-31723)];
      }

      int var4 = var0 + class327.field3954 * var1;

      for(int var5 = 0; var5 < field1952; ++var5) {
         field1954[var5] = var4;
         var4 += class327.field3954;
      }

   }

   public static final void method2836() {
      field1942 = field1948 / 2;
      field1943 = field1952 / 2;
      field1946 = -field1942;
      field1947 = field1948 - field1942;
      field1945 = -field1943;
      field1949 = field1952 - field1943;
   }

   static final void method2844(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      int[] var19 = field1944.vmethod3094(var18, (short)1306);
      int var20;
      if (var19 == null) {
         var20 = field1944.vmethod3084(var18, 1286677911);
         method2801(var0, var1, var2, var3, var4, var5, method2852(var20, var6), method2852(var20, var7), method2852(var20, var8));
      } else {
         field1932 = field1944.vmethod3086(var18, 1414793833);
         field1931 = field1944.vmethod3087(var18, 2076570310);
         var20 = var4 - var3;
         int var21 = var1 - var0;
         int var22 = var5 - var3;
         int var23 = var2 - var0;
         int var24 = var7 - var6;
         int var25 = var8 - var6;
         int var26 = 0;
         if (var0 != var1) {
            var26 = (var4 - var3 << 14) / (var1 - var0);
         }

         int var27 = 0;
         if (var2 != var1) {
            var27 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var28 = 0;
         if (var0 != var2) {
            var28 = (var3 - var5 << 14) / (var0 - var2);
         }

         int var29 = var20 * var23 - var22 * var21;
         if (var29 != 0) {
            int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
            int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var32 = var11 * var12 - var9 * var14 << 14;
            int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 3 << 14) / (long)field1941);
            int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)field1941);
            int var35 = var10 * var12 - var13 * var9 << 14;
            int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)field1941);
            int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)field1941);
            int var38 = var13 * var11 - var10 * var14 << 14;
            int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)field1941);
            int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)field1941);
            int var41;
            if (var0 <= var1 && var0 <= var2) {
               if (var0 < field1952) {
                  if (var1 > field1952) {
                     var1 = field1952;
                  }

                  if (var2 > field1952) {
                     var2 = field1952;
                  }

                  var6 = var30 + ((var6 << 9) - var3 * var30);
                  if (var1 < var2) {
                     var5 = var3 <<= 14;
                     if (var0 < 0) {
                        var5 -= var0 * var28;
                        var3 -= var0 * var26;
                        var6 -= var0 * var31;
                        var0 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var27 * var1;
                        var1 = 0;
                     }

                     var41 = var0 - field1943;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = field1954[var0];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method2853(class327.field3958, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var28;
                                 var4 += var27;
                                 var6 += var31;
                                 var0 += class327.field3954;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method2853(class327.field3958, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     var2 -= var1;
                     var1 -= var0;
                     var0 = field1954[var0];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              method2853(class327.field3958, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                              var5 += var28;
                              var4 += var27;
                              var6 += var31;
                              var0 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2853(class327.field3958, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                        var5 += var28;
                        var3 += var26;
                        var6 += var31;
                        var0 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var4 = var3 <<= 14;
                  if (var0 < 0) {
                     var4 -= var0 * var28;
                     var3 -= var0 * var26;
                     var6 -= var0 * var31;
                     var0 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var27 * var2;
                     var2 = 0;
                  }

                  var41 = var0 - field1943;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var0 != var2 && var28 < var26 || var0 == var2 && var27 > var26) {
                     var1 -= var2;
                     var2 -= var0;
                     var0 = field1954[var0];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method2853(class327.field3958, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                              var5 += var27;
                              var3 += var26;
                              var6 += var31;
                              var0 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2853(class327.field3958, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var28;
                        var3 += var26;
                        var6 += var31;
                        var0 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var1 -= var2;
                  var2 -= var0;
                  var0 = field1954[var0];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method2853(class327.field3958, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var27;
                           var3 += var26;
                           var6 += var31;
                           var0 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     method2853(class327.field3958, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                     var4 += var28;
                     var3 += var26;
                     var6 += var31;
                     var0 += class327.field3954;
                     var32 += var34;
                     var35 += var37;
                     var38 += var40;
                  }
               }
            } else if (var1 <= var2) {
               if (var1 < field1952) {
                  if (var2 > field1952) {
                     var2 = field1952;
                  }

                  if (var0 > field1952) {
                     var0 = field1952;
                  }

                  var7 = var30 + ((var7 << 9) - var30 * var4);
                  if (var2 < var0) {
                     var3 = var4 <<= 14;
                     if (var1 < 0) {
                        var3 -= var26 * var1;
                        var4 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var28 * var2;
                        var2 = 0;
                     }

                     var41 = var1 - field1943;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var2 != var1 && var26 < var27 || var2 == var1 && var26 > var28) {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = field1954[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var0;
                                 if (var0 < 0) {
                                    return;
                                 }

                                 method2853(class327.field3958, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var26;
                                 var5 += var28;
                                 var7 += var31;
                                 var1 += class327.field3954;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method2853(class327.field3958, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     var0 -= var2;
                     var2 -= var1;
                     var1 = field1954[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var0;
                              if (var0 < 0) {
                                 return;
                              }

                              method2853(class327.field3958, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                              var3 += var26;
                              var5 += var28;
                              var7 += var31;
                              var1 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2853(class327.field3958, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var26;
                        var4 += var27;
                        var7 += var31;
                        var1 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var26 * var1;
                     var4 -= var27 * var1;
                     var7 -= var31 * var1;
                     var1 = 0;
                  }

                  var3 <<= 14;
                  if (var0 < 0) {
                     var3 -= var0 * var28;
                     var0 = 0;
                  }

                  var41 = var1 - field1943;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var26 < var27) {
                     var2 -= var0;
                     var0 -= var1;
                     var1 = field1954[var1];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              method2853(class327.field3958, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                              var3 += var28;
                              var4 += var27;
                              var7 += var31;
                              var1 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2853(class327.field3958, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                        var5 += var26;
                        var4 += var27;
                        var7 += var31;
                        var1 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var2 -= var0;
                  var0 -= var1;
                  var1 = field1954[var1];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method2853(class327.field3958, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var28;
                           var4 += var27;
                           var7 += var31;
                           var1 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     method2853(class327.field3958, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                     var5 += var26;
                     var4 += var27;
                     var7 += var31;
                     var1 += class327.field3954;
                     var32 += var34;
                     var35 += var37;
                     var38 += var40;
                  }
               }
            } else if (var2 < field1952) {
               if (var0 > field1952) {
                  var0 = field1952;
               }

               if (var1 > field1952) {
                  var1 = field1952;
               }

               var8 = (var8 << 9) - var5 * var30 + var30;
               if (var0 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var27 * var2;
                     var5 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var3 <<= 14;
                  if (var0 < 0) {
                     var3 -= var0 * var26;
                     var0 = 0;
                  }

                  var41 = var2 - field1943;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var27 < var28) {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = field1954[var2];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method2853(class327.field3958, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var27;
                              var3 += var26;
                              var8 += var31;
                              var2 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2853(class327.field3958, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var1 -= var0;
                  var0 -= var2;
                  var2 = field1954[var2];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method2853(class327.field3958, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var27;
                           var3 += var26;
                           var8 += var31;
                           var2 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     method2853(class327.field3958, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                     var4 += var27;
                     var5 += var28;
                     var8 += var31;
                     var2 += class327.field3954;
                     var32 += var34;
                     var35 += var37;
                     var38 += var40;
                  }
               }

               var3 = var5 <<= 14;
               if (var2 < 0) {
                  var3 -= var27 * var2;
                  var5 -= var28 * var2;
                  var8 -= var31 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var26 * var1;
                  var1 = 0;
               }

               var41 = var2 - field1943;
               var32 += var34 * var41;
               var35 += var37 * var41;
               var38 += var40 * var41;
               if (var27 < var28) {
                  var0 -= var1;
                  var1 -= var2;
                  var2 = field1954[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method2853(class327.field3958, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var26;
                           var5 += var28;
                           var8 += var31;
                           var2 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     method2853(class327.field3958, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                     var3 += var27;
                     var5 += var28;
                     var8 += var31;
                     var2 += class327.field3954;
                     var32 += var34;
                     var35 += var37;
                     var38 += var40;
                  }
               }

               var0 -= var1;
               var1 -= var2;
               var2 = field1954[var2];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        method2853(class327.field3958, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var26;
                        var5 += var28;
                        var8 += var31;
                        var2 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  method2853(class327.field3958, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                  var3 += var27;
                  var5 += var28;
                  var8 += var31;
                  var2 += class327.field3954;
                  var32 += var34;
                  var35 += var37;
                  var38 += var40;
               }
            }
         }
      }

   }

   static final void method2804(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      if (field1940) {
         if (var5 > field1948) {
            var5 = field1948;
         }

         if (var4 < 0) {
            var4 = 0;
         }
      }

      if (var4 < var5) {
         var1 += var4;
         var3 = var5 - var4 >> 2;
         if (field1934 != 0) {
            if (field1934 == 254) {
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     var3 = var5 - var4 & 3;

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           return;
                        }

                        var0[var1++] = var0[var1];
                     }
                  }

                  var0[var1++] = var0[var1];
                  var0[var1++] = var0[var1];
                  var0[var1++] = var0[var1];
                  var0[var1++] = var0[var1];
               }
            } else {
               int var6 = field1934;
               int var7 = 256 - field1934;
               var2 = (var7 * (var2 & '\uff00') >> 8 & '\uff00') + (var7 * (var2 & 16711935) >> 8 & 16711935);

               while(true) {
                  --var3;
                  int var8;
                  if (var3 < 0) {
                     var3 = var5 - var4 & 3;

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           return;
                        }

                        var8 = var0[var1];
                        var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & '\uff00') >> 8 & '\uff00');
                     }
                  }

                  var8 = var0[var1];
                  var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & '\uff00') >> 8 & '\uff00');
                  var8 = var0[var1];
                  var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & '\uff00') >> 8 & '\uff00');
                  var8 = var0[var1];
                  var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & '\uff00') >> 8 & '\uff00');
                  var8 = var0[var1];
                  var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & '\uff00') >> 8 & '\uff00');
               }
            }
         } else {
            while(true) {
               --var3;
               if (var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        return;
                     }

                     var0[var1++] = var2;
                  }
               }

               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
            }
         }
      }
   }

   static final int method2813(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var3 * var1 >> 16;
   }

   public static final void method2796(class143 var0) {
      field1944 = var0;
   }

   static final int method2814(int var0, int var1, int var2, int var3) {
      return var2 * var1 - var3 * var0 >> 16;
   }

   static final int method2852(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static final void method2798(double var0, int var2, int var3) {
      int var4 = var2 * 128;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
         double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0D;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0D) {
               double var19;
               if (var11 < 0.5D) {
                  var19 = var11 * (1.0D + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0D * var11 - var19;
               double var23 = var6 + 0.3333333333333333D;
               if (var23 > 1.0D) {
                  --var23;
               }

               double var25 = var6 - 0.3333333333333333D;
               if (var25 < 0.0D) {
                  ++var25;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var21 + (var19 - var21) * 6.0D * var23;
               } else if (2.0D * var23 < 1.0D) {
                  var13 = var19;
               } else if (3.0D * var23 < 2.0D) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
               } else {
                  var13 = var21;
               }

               if (6.0D * var6 < 1.0D) {
                  var15 = var21 + (var19 - var21) * 6.0D * var6;
               } else if (2.0D * var6 < 1.0D) {
                  var15 = var19;
               } else if (3.0D * var6 < 2.0D) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
               } else {
                  var15 = var21;
               }

               if (6.0D * var25 < 1.0D) {
                  var17 = var21 + (var19 - var21) * 6.0D * var25;
               } else if (2.0D * var25 < 1.0D) {
                  var17 = var19;
               } else if (3.0D * var25 < 2.0D) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666D - var25) * 6.0D;
               } else {
                  var17 = var21;
               }
            }

            int var28 = (int)(var13 * 256.0D);
            int var20 = (int)(var15 * 256.0D);
            int var27 = (int)(var17 * 256.0D);
            int var22 = var27 + (var20 << 8) + (var28 << 16);
            var22 = method2799(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            field1937[var4++] = var22;
         }
      }

   }

   public static final void method2797(double var0) {
      method2798(var0, 0, 512);
   }

   static final void method2806(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      int[] var19 = field1944.vmethod3094(var18, (short)1306);
      int var20;
      if (var19 == null) {
         var20 = field1944.vmethod3084(var18, 1970508384);
         method2801(var0, var1, var2, var3, var4, var5, method2852(var20, var6), method2852(var20, var7), method2852(var20, var8));
      } else {
         field1932 = field1944.vmethod3086(var18, 583682207);
         field1931 = field1944.vmethod3087(var18, 1901285645);
         var20 = var4 - var3;
         int var21 = var1 - var0;
         int var22 = var5 - var3;
         int var23 = var2 - var0;
         int var24 = var7 - var6;
         int var25 = var8 - var6;
         int var26 = 0;
         if (var0 != var1) {
            var26 = (var4 - var3 << 14) / (var1 - var0);
         }

         int var27 = 0;
         if (var2 != var1) {
            var27 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var28 = 0;
         if (var0 != var2) {
            var28 = (var3 - var5 << 14) / (var0 - var2);
         }

         int var29 = var20 * var23 - var22 * var21;
         if (var29 != 0) {
            int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
            int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var32 = var11 * var12 - var9 * var14 << 14;
            int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 14) / (long)field1941);
            int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)field1941);
            int var35 = var10 * var12 - var13 * var9 << 14;
            int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)field1941);
            int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)field1941);
            int var38 = var13 * var11 - var10 * var14 << 14;
            int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)field1941);
            int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)field1941);
            int var41;
            if (var0 <= var1 && var0 <= var2) {
               if (var0 < field1952) {
                  if (var1 > field1952) {
                     var1 = field1952;
                  }

                  if (var2 > field1952) {
                     var2 = field1952;
                  }

                  var6 = var30 + ((var6 << 9) - var3 * var30);
                  if (var1 < var2) {
                     var5 = var3 <<= 14;
                     if (var0 < 0) {
                        var5 -= var0 * var28;
                        var3 -= var0 * var26;
                        var6 -= var0 * var31;
                        var0 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var27 * var1;
                        var1 = 0;
                     }

                     var41 = var0 - field1943;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = field1954[var0];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 method2807(class327.field3958, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                 var5 += var28;
                                 var4 += var27;
                                 var6 += var31;
                                 var0 += class327.field3954;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method2807(class327.field3958, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var3 += var26;
                           var6 += var31;
                           var0 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     var2 -= var1;
                     var1 -= var0;
                     var0 = field1954[var0];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              method2807(class327.field3958, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                              var5 += var28;
                              var4 += var27;
                              var6 += var31;
                              var0 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2807(class327.field3958, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                        var5 += var28;
                        var3 += var26;
                        var6 += var31;
                        var0 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var4 = var3 <<= 14;
                  if (var0 < 0) {
                     var4 -= var0 * var28;
                     var3 -= var0 * var26;
                     var6 -= var0 * var31;
                     var0 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var27 * var2;
                     var2 = 0;
                  }

                  var41 = var0 - field1943;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var0 != var2 && var28 < var26 || var0 == var2 && var27 > var26) {
                     var1 -= var2;
                     var2 -= var0;
                     var0 = field1954[var0];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method2807(class327.field3958, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                              var5 += var27;
                              var3 += var26;
                              var6 += var31;
                              var0 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2807(class327.field3958, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var28;
                        var3 += var26;
                        var6 += var31;
                        var0 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var1 -= var2;
                  var2 -= var0;
                  var0 = field1954[var0];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method2807(class327.field3958, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var27;
                           var3 += var26;
                           var6 += var31;
                           var0 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     method2807(class327.field3958, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                     var4 += var28;
                     var3 += var26;
                     var6 += var31;
                     var0 += class327.field3954;
                     var32 += var34;
                     var35 += var37;
                     var38 += var40;
                  }
               }
            } else if (var1 <= var2) {
               if (var1 < field1952) {
                  if (var2 > field1952) {
                     var2 = field1952;
                  }

                  if (var0 > field1952) {
                     var0 = field1952;
                  }

                  var7 = var30 + ((var7 << 9) - var30 * var4);
                  if (var2 < var0) {
                     var3 = var4 <<= 14;
                     if (var1 < 0) {
                        var3 -= var26 * var1;
                        var4 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var28 * var2;
                        var2 = 0;
                     }

                     var41 = var1 - field1943;
                     var32 += var34 * var41;
                     var35 += var37 * var41;
                     var38 += var40 * var41;
                     if (var2 != var1 && var26 < var27 || var2 == var1 && var26 > var28) {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = field1954[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var0;
                                 if (var0 < 0) {
                                    return;
                                 }

                                 method2807(class327.field3958, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                 var3 += var26;
                                 var5 += var28;
                                 var7 += var31;
                                 var1 += class327.field3954;
                                 var32 += var34;
                                 var35 += var37;
                                 var38 += var40;
                              }
                           }

                           method2807(class327.field3958, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var4 += var27;
                           var7 += var31;
                           var1 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     var0 -= var2;
                     var2 -= var1;
                     var1 = field1954[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var0;
                              if (var0 < 0) {
                                 return;
                              }

                              method2807(class327.field3958, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                              var3 += var26;
                              var5 += var28;
                              var7 += var31;
                              var1 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2807(class327.field3958, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var26;
                        var4 += var27;
                        var7 += var31;
                        var1 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var26 * var1;
                     var4 -= var27 * var1;
                     var7 -= var31 * var1;
                     var1 = 0;
                  }

                  var3 <<= 14;
                  if (var0 < 0) {
                     var3 -= var0 * var28;
                     var0 = 0;
                  }

                  var41 = var1 - field1943;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var26 < var27) {
                     var2 -= var0;
                     var0 -= var1;
                     var1 = field1954[var1];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              method2807(class327.field3958, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                              var3 += var28;
                              var4 += var27;
                              var7 += var31;
                              var1 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2807(class327.field3958, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                        var5 += var26;
                        var4 += var27;
                        var7 += var31;
                        var1 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var2 -= var0;
                  var0 -= var1;
                  var1 = field1954[var1];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method2807(class327.field3958, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var28;
                           var4 += var27;
                           var7 += var31;
                           var1 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     method2807(class327.field3958, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                     var5 += var26;
                     var4 += var27;
                     var7 += var31;
                     var1 += class327.field3954;
                     var32 += var34;
                     var35 += var37;
                     var38 += var40;
                  }
               }
            } else if (var2 < field1952) {
               if (var0 > field1952) {
                  var0 = field1952;
               }

               if (var1 > field1952) {
                  var1 = field1952;
               }

               var8 = (var8 << 9) - var5 * var30 + var30;
               if (var0 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var27 * var2;
                     var5 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var3 <<= 14;
                  if (var0 < 0) {
                     var3 -= var0 * var26;
                     var0 = 0;
                  }

                  var41 = var2 - field1943;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var27 < var28) {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = field1954[var2];

                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              method2807(class327.field3958, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                              var4 += var27;
                              var3 += var26;
                              var8 += var31;
                              var2 += class327.field3954;
                              var32 += var34;
                              var35 += var37;
                              var38 += var40;
                           }
                        }

                        method2807(class327.field3958, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  var1 -= var0;
                  var0 -= var2;
                  var2 = field1954[var2];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           method2807(class327.field3958, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var27;
                           var3 += var26;
                           var8 += var31;
                           var2 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     method2807(class327.field3958, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                     var4 += var27;
                     var5 += var28;
                     var8 += var31;
                     var2 += class327.field3954;
                     var32 += var34;
                     var35 += var37;
                     var38 += var40;
                  }
               }

               var3 = var5 <<= 14;
               if (var2 < 0) {
                  var3 -= var27 * var2;
                  var5 -= var28 * var2;
                  var8 -= var31 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var26 * var1;
                  var1 = 0;
               }

               var41 = var2 - field1943;
               var32 += var34 * var41;
               var35 += var37 * var41;
               var38 += var40 * var41;
               if (var27 < var28) {
                  var0 -= var1;
                  var1 -= var2;
                  var2 = field1954[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method2807(class327.field3958, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var26;
                           var5 += var28;
                           var8 += var31;
                           var2 += class327.field3954;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }

                     method2807(class327.field3958, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                     var3 += var27;
                     var5 += var28;
                     var8 += var31;
                     var2 += class327.field3954;
                     var32 += var34;
                     var35 += var37;
                     var38 += var40;
                  }
               }

               var0 -= var1;
               var1 -= var2;
               var2 = field1954[var2];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        method2807(class327.field3958, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var26;
                        var5 += var28;
                        var8 += var31;
                        var2 += class327.field3954;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }

                  method2807(class327.field3958, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                  var3 += var27;
                  var5 += var28;
                  var8 += var31;
                  var2 += class327.field3954;
                  var32 += var34;
                  var35 += var37;
                  var38 += var40;
               }
            }
         }
      }

   }

   static final void method2816(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (field1940) {
         if (var5 > field1948) {
            var5 = field1948;
         }

         if (var4 < 0) {
            var4 = 0;
         }
      }

      if (var4 < var5) {
         var1 += var4;
         var6 += var4 * var7;
         int var8;
         int var9;
         int var10;
         if (field1930) {
            var3 = var5 - var4 >> 2;
            var7 <<= 2;
            if (field1934 == 0) {
               if (var3 > 0) {
                  do {
                     var2 = field1937[var6 >> 8];
                     var6 += var7;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     --var3;
                  } while(var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if (var3 > 0) {
                  var2 = field1937[var6 >> 8];

                  do {
                     var0[var1++] = var2;
                     --var3;
                  } while(var3 > 0);
               }
            } else {
               var8 = field1934;
               var9 = 256 - field1934;
               if (var3 > 0) {
                  do {
                     var2 = field1937[var6 >> 8];
                     var6 += var7;
                     var2 = (var9 * (var2 & '\uff00') >> 8 & '\uff00') + (var9 * (var2 & 16711935) >> 8 & 16711935);
                     var10 = var0[var1];
                     var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & '\uff00') >> 8 & '\uff00');
                     var10 = var0[var1];
                     var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & '\uff00') >> 8 & '\uff00');
                     var10 = var0[var1];
                     var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & '\uff00') >> 8 & '\uff00');
                     var10 = var0[var1];
                     var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & '\uff00') >> 8 & '\uff00');
                     --var3;
                  } while(var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if (var3 > 0) {
                  var2 = field1937[var6 >> 8];
                  var2 = (var9 * (var2 & '\uff00') >> 8 & '\uff00') + (var9 * (var2 & 16711935) >> 8 & 16711935);

                  do {
                     var10 = var0[var1];
                     var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & '\uff00') >> 8 & '\uff00');
                     --var3;
                  } while(var3 > 0);
               }
            }
         } else {
            var3 = var5 - var4;
            if (field1934 == 0) {
               do {
                  var0[var1++] = field1937[var6 >> 8];
                  var6 += var7;
                  --var3;
               } while(var3 > 0);
            } else {
               var8 = field1934;
               var9 = 256 - field1934;

               do {
                  var2 = field1937[var6 >> 8];
                  var6 += var7;
                  var2 = (var9 * (var2 & '\uff00') >> 8 & '\uff00') + (var9 * (var2 & 16711935) >> 8 & 16711935);
                  var10 = var0[var1];
                  var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & '\uff00') >> 8 & '\uff00');
                  --var3;
               } while(var3 > 0);
            }
         }
      }

   }

   static final int method2811(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var3 * var1 >> 16;
   }

   static final int method2812(int var0, int var1, int var2, int var3) {
      return var3 * var0 + var2 * var1 >> 16;
   }

   public static final void method2795(int var0, int var1) {
      int var2 = field1954[0];
      int var3 = var2 / class327.field3954;
      int var4 = var2 - var3 * class327.field3954;
      field1942 = var0 - var4;
      field1943 = var1 - var3;
      field1946 = -field1942;
      field1947 = field1948 - field1942;
      field1945 = -field1943;
      field1949 = field1952 - field1943;
   }

   public static void method2800(int var0, int var1, int var2) {
      field1940 = var0 < 0 || var0 > field1948 || var1 < 0 || var1 > field1948 || var2 < 0 || var2 > field1948;
   }

   static final void method2853(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if (field1940) {
         if (var6 > field1948) {
            var6 = field1948;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var4 += var5;
         var7 += var5 * var8;
         int var15 = var6 - var5;
         int var16;
         int var10000;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (field1932) {
            var16 = var5 - field1942;
            var9 += var16 * (var12 >> 3);
            var10 += (var13 >> 3) * var16;
            var11 += var16 * (var14 >> 3);
            var18 = var11 >> 12;
            if (var18 != 0) {
               var19 = var9 / var18;
               var20 = var10 / var18;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 4032) {
                  var19 = 4032;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var18 = var11 >> 12;
            if (var18 != 0) {
               var21 = var9 / var18;
               var22 = var10 / var18;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 4032) {
                  var21 = 4032;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var2 = (var19 << 20) + var20;
            var23 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 20);
            var15 >>= 3;
            var8 <<= 3;
            var24 = var7 >> 8;
            if (field1931) {
               if (var15 > 0) {
                  do {
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var10000 = var23 + var2;
                     var19 = var21;
                     var20 = var22;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var18 = var11 >> 12;
                     if (var18 != 0) {
                        var21 = var9 / var18;
                        var22 = var10 / var18;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var2 = (var19 << 20) + var20;
                     var23 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 20);
                     var7 += var8;
                     var24 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if (var15 > 0) {
                  do {
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     --var15;
                  } while(var15 > 0);
               }
            } else {
               if (var15 > 0) {
                  do {
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var10000 = var23 + var2;
                     var19 = var21;
                     var20 = var22;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var18 = var11 >> 12;
                     if (var18 != 0) {
                        var21 = var9 / var18;
                        var22 = var10 / var18;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var2 = (var19 << 20) + var20;
                     var23 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 20);
                     var7 += var8;
                     var24 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if (var15 > 0) {
                  do {
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     --var15;
                  } while(var15 > 0);
               }
            }
         } else {
            var16 = var5 - field1942;
            var9 += var16 * (var12 >> 3);
            var10 += (var13 >> 3) * var16;
            var11 += var16 * (var14 >> 3);
            var18 = var11 >> 14;
            if (var18 != 0) {
               var19 = var9 / var18;
               var20 = var10 / var18;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 16256) {
                  var19 = 16256;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var18 = var11 >> 14;
            if (var18 != 0) {
               var21 = var9 / var18;
               var22 = var10 / var18;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 16256;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var2 = (var19 << 18) + var20;
            var23 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18);
            var15 >>= 3;
            var8 <<= 3;
            var24 = var7 >> 8;
            if (field1931) {
               if (var15 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var10000 = var23 + var2;
                     var19 = var21;
                     var20 = var22;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var18 = var11 >> 14;
                     if (var18 != 0) {
                        var21 = var9 / var18;
                        var22 = var10 / var18;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var2 = (var19 << 18) + var20;
                     var23 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18);
                     var7 += var8;
                     var24 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if (var15 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     var2 += var23;
                     --var15;
                  } while(var15 > 0);
               }
            } else {
               if (var15 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var10000 = var23 + var2;
                     var19 = var21;
                     var20 = var22;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var18 = var11 >> 14;
                     if (var18 != 0) {
                        var21 = var9 / var18;
                        var22 = var10 / var18;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var2 = (var19 << 18) + var20;
                     var23 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18);
                     var7 += var8;
                     var24 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if (var15 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var24 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var24 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var23;
                     --var15;
                  } while(var15 > 0);
               }
            }
         }
      }

   }

   static final void method2807(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if (field1940) {
         if (var6 > field1948) {
            var6 = field1948;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var4 += var5;
         var7 += var5 * var8;
         int var15 = var6 - var5;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         if (field1932) {
            var16 = var5 - field1942;
            var9 += var16 * var12;
            var10 += var13 * var16;
            var11 += var16 * var14;
            var17 = var11 >> 12;
            if (var17 != 0) {
               var18 = var9 / var17;
               var19 = var10 / var17;
            } else {
               var18 = 0;
               var19 = 0;
            }

            var9 += var15 * var12;
            var10 += var13 * var15;
            var11 += var15 * var14;
            var17 = var11 >> 12;
            if (var17 != 0) {
               var20 = var9 / var17;
               var21 = var10 / var17;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var2 = (var18 << 20) + var19;
            var22 = (var21 - var19) / var15 + ((var20 - var18) / var15 << 20);
            var15 >>= 3;
            var8 <<= 3;
            var23 = var7 >> 8;
            if (field1931) {
               if (var15 > 0) {
                  do {
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var7 += var8;
                     var23 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if (var15 > 0) {
                  do {
                     var3 = var1[(var2 >>> 26) + (var2 & 4032)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     --var15;
                  } while(var15 > 0);
               }
            } else {
               if (var15 > 0) {
                  do {
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     var7 += var8;
                     var23 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if (var15 > 0) {
                  do {
                     if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     --var15;
                  } while(var15 > 0);
               }
            }
         } else {
            var16 = var5 - field1942;
            var9 += var16 * var12;
            var10 += var13 * var16;
            var11 += var16 * var14;
            var17 = var11 >> 14;
            if (var17 != 0) {
               var18 = var9 / var17;
               var19 = var10 / var17;
            } else {
               var18 = 0;
               var19 = 0;
            }

            var9 += var15 * var12;
            var10 += var13 * var15;
            var11 += var15 * var14;
            var17 = var11 >> 14;
            if (var17 != 0) {
               var20 = var9 / var17;
               var21 = var10 / var17;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var2 = (var18 << 18) + var19;
            var22 = (var21 - var19) / var15 + ((var20 - var18) / var15 << 18);
            var15 >>= 3;
            var8 <<= 3;
            var23 = var7 >> 8;
            if (field1931) {
               if (var15 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     var7 += var8;
                     var23 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if (var15 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     var2 += var22;
                     --var15;
                  } while(var15 > 0);
               }
            } else {
               if (var15 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     var7 += var8;
                     var23 = var7 >> 8;
                     --var15;
                  } while(var15 > 0);
               }

               var15 = var6 - var5 & 7;
               if (var15 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = (var23 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var23 & -16711936) >> 8;
                     }

                     ++var4;
                     var2 += var22;
                     --var15;
                  } while(var15 > 0);
               }
            }
         }
      }

   }

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         field1953[var0] = '\u8000' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         field1951[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         field1955[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
         field1933[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
      }

   }
}

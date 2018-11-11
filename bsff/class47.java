public class class47 {
   static class331[] field569;
   byte[][][] field570;
   int field567;

   class47(int var1) {
      this.field567 = var1;
   }

   void method723(int var1) {
      byte[] var2 = new byte[this.field567 * this.field567];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[0][0] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[0][1] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[0][2] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[0][3] = var2;
   }

   int method700(int var1, int var2, int var3) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   void method719(int var1) {
      byte[] var2 = new byte[this.field567 * this.field567];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[1][0] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var3 >= 0 && var3 < var2.length) {
               if (var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            } else {
               ++var3;
            }
         }
      }

      this.field570[1][1] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = this.field567 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[1][2] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = this.field567 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[1][3] = var2;
   }

   int method701(int var1, int var2) {
      return var1 != 9 && var1 != 10 ? (var1 == 11 ? 8 : var1) : 1;
   }

   void method705(int var1) {
      byte[] var2 = new byte[this.field567 * this.field567];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = this.field567 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[2][0] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[2][1] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[2][2] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = this.field567 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[2][3] = var2;
   }

   void method706(byte var1) {
      byte[] var2 = new byte[this.field567 * this.field567];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[3][0] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[3][1] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = this.field567 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[3][2] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = this.field567 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[3][3] = var2;
   }

   void method707(byte var1) {
      byte[] var2 = new byte[this.field567 * this.field567];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = this.field567 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[4][0] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = this.field567 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[4][1] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = 0; var5 < this.field567; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[4][2] = var2;
      var2 = new byte[this.field567 * this.field567];
      var3 = 0;

      for(var4 = 0; var4 < this.field567; ++var4) {
         for(var5 = this.field567 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field570[4][3] = var2;
   }

   void method708(int var1) {
      byte[] var2 = new byte[this.field567 * this.field567];
      boolean var3 = false;
      var2 = new byte[this.field567 * this.field567];
      int var4 = 0;

      int var5;
      int var6;
      for(var5 = 0; var5 < this.field567; ++var5) {
         for(var6 = 0; var6 < this.field567; ++var6) {
            if (var6 <= this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[5][0] = var2;
      var2 = new byte[this.field567 * this.field567];
      var4 = 0;

      for(var5 = 0; var5 < this.field567; ++var5) {
         for(var6 = 0; var6 < this.field567; ++var6) {
            if (var5 <= this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[5][1] = var2;
      var2 = new byte[this.field567 * this.field567];
      var4 = 0;

      for(var5 = 0; var5 < this.field567; ++var5) {
         for(var6 = 0; var6 < this.field567; ++var6) {
            if (var6 >= this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[5][2] = var2;
      var2 = new byte[this.field567 * this.field567];
      var4 = 0;

      for(var5 = 0; var5 < this.field567; ++var5) {
         for(var6 = 0; var6 < this.field567; ++var6) {
            if (var5 >= this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[5][3] = var2;
   }

   void method736(int var1) {
      byte[] var2 = new byte[this.field567 * this.field567];
      boolean var3 = false;
      var2 = new byte[this.field567 * this.field567];
      int var4 = 0;

      int var5;
      int var6;
      for(var5 = 0; var5 < this.field567; ++var5) {
         for(var6 = 0; var6 < this.field567; ++var6) {
            if (var6 <= var5 - this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[6][0] = var2;
      var2 = new byte[this.field567 * this.field567];
      var4 = 0;

      for(var5 = this.field567 - 1; var5 >= 0; --var5) {
         for(var6 = 0; var6 < this.field567; ++var6) {
            if (var6 <= var5 - this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[6][1] = var2;
      var2 = new byte[this.field567 * this.field567];
      var4 = 0;

      for(var5 = this.field567 - 1; var5 >= 0; --var5) {
         for(var6 = this.field567 - 1; var6 >= 0; --var6) {
            if (var6 <= var5 - this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[6][2] = var2;
      var2 = new byte[this.field567 * this.field567];
      var4 = 0;

      for(var5 = 0; var5 < this.field567; ++var5) {
         for(var6 = this.field567 - 1; var6 >= 0; --var6) {
            if (var6 <= var5 - this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[6][3] = var2;
   }

   void method709(byte var1) {
      byte[] var2 = new byte[this.field567 * this.field567];
      boolean var3 = false;
      var2 = new byte[this.field567 * this.field567];
      int var4 = 0;

      int var5;
      int var6;
      for(var5 = 0; var5 < this.field567; ++var5) {
         for(var6 = 0; var6 < this.field567; ++var6) {
            if (var6 >= var5 - this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[7][0] = var2;
      var2 = new byte[this.field567 * this.field567];
      var4 = 0;

      for(var5 = this.field567 - 1; var5 >= 0; --var5) {
         for(var6 = 0; var6 < this.field567; ++var6) {
            if (var6 >= var5 - this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[7][1] = var2;
      var2 = new byte[this.field567 * this.field567];
      var4 = 0;

      for(var5 = this.field567 - 1; var5 >= 0; --var5) {
         for(var6 = this.field567 - 1; var6 >= 0; --var6) {
            if (var6 >= var5 - this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[7][2] = var2;
      var2 = new byte[this.field567 * this.field567];
      var4 = 0;

      for(var5 = 0; var5 < this.field567; ++var5) {
         for(var6 = this.field567 - 1; var6 >= 0; --var6) {
            if (var6 >= var5 - this.field567 / 2) {
               var2[var4] = -1;
            }

            ++var4;
         }
      }

      this.field570[7][3] = var2;
   }

   void method740(byte var1) {
      if (this.field570 == null) {
         this.field570 = new byte[8][4][];
         this.method723(516463769);
         this.method719(2055008837);
         this.method705(-336561981);
         this.method706((byte)85);
         this.method707((byte)-36);
         this.method708(-140861178);
         this.method736(-394836092);
         this.method709((byte)-36);
      }

   }

   void method699(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      if (var7 != 0 && this.field567 != 0 && this.field570 != null) {
         var8 = this.method700(var8, var7, -1759550487);
         var7 = this.method701(var7, -792514335);
         class327.method5747(var1, var2, var5, var6, var3, var4, this.field570[var7 - 1][var8], this.field567, true);
      }

   }

   static final void method743(String var0, int var1) {
      class189.method3483(30, "", var0, (byte)-64);
   }

   static final int method713(class242 var0, int var1, int var2) {
      if (var0.field2926 != null && var1 < var0.field2926.length) {
         try {
            int[] var3 = var0.field2926[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if (var7 == 0) {
                  return var4;
               }

               if (var7 == 1) {
                  var8 = client.field1120[var3[var5++]];
               }

               if (var7 == 2) {
                  var8 = client.field916[var3[var5++]];
               }

               if (var7 == 3) {
                  var8 = client.field917[var3[var5++]];
               }

               int var10;
               class242 var11;
               int var12;
               int var13;
               if (var7 == 4) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class3.method2(var10, 2142286779);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class146.method3099(var12, (byte)74).field3657 || client.field855)) {
                     for(var13 = 0; var13 < var11.field2878.length; ++var13) {
                        if (var12 + 1 == var11.field2878[var13]) {
                           var8 += var11.field2933[var13];
                        }
                     }
                  }
               }

               if (var7 == 5) {
                  var8 = class237.field2770[var3[var5++]];
               }

               if (var7 == 6) {
                  var8 = class248.field2998[client.field916[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = class237.field2770[var3[var5++]] * 100 / '\ub71b';
               }

               if (var7 == 8) {
                  var8 = class12.field259.field832;
               }

               if (var7 == 9) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if (class248.field3000[var10]) {
                        var8 += client.field916[var10];
                     }
                  }
               }

               if (var7 == 10) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class3.method2(var10, 2102484773);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class146.method3099(var12, (byte)86).field3657 || client.field855)) {
                     for(var13 = 0; var13 < var11.field2878.length; ++var13) {
                        if (var12 + 1 == var11.field2878[var13]) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var7 == 11) {
                  var8 = client.field1021;
               }

               if (var7 == 12) {
                  var8 = client.field1022;
               }

               if (var7 == 13) {
                  var10 = class237.field2770[var3[var5++]];
                  int var14 = var3[var5++];
                  var8 = (var10 & 1 << var14) != 0 ? 1 : 0;
               }

               if (var7 == 14) {
                  var10 = var3[var5++];
                  var8 = class88.method1853(var10, -266065184);
               }

               if (var7 == 15) {
                  var9 = 1;
               }

               if (var7 == 16) {
                  var9 = 2;
               }

               if (var7 == 17) {
                  var9 = 3;
               }

               if (var7 == 18) {
                  var8 = (class12.field259.field1185 >> 7) + class184.field2498;
               }

               if (var7 == 19) {
                  var8 = (class12.field259.field1209 >> 7) + class4.field28;
               }

               if (var7 == 20) {
                  var8 = var3[var5++];
               }

               if (var9 == 0) {
                  if (var6 == 0) {
                     var4 += var8;
                  }

                  if (var6 == 1) {
                     var4 -= var8;
                  }

                  if (var6 == 2 && var8 != 0) {
                     var4 /= var8;
                  }

                  if (var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var15) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   public static void method745(int var0) {
      class283.field3639.method3933();
      class283.field3663.method3933();
      class283.field3643.method3933();
   }
}

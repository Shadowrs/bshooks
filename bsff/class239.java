public class class239 {
   static int[] field2789 = new int[]{8, 11, 4, 6, 9, 7, 10};
   public static class212 field2785 = new class212(260);
   public static short[] field2788;
   public static short[][] field2780;
   public static short[] field2787;
   static int field2791;
   public int field2783;
   int[] field2790;
   public boolean field2782;
   long field2784;
   int[] field2781;
   long field2786;

   public void method4408(int[] var1, int[] var2, boolean var3, int var4, byte var5) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var6 = 0; var6 < 7; ++var6) {
            for(int var7 = 0; var7 < class274.field3512; ++var7) {
               class274 var8 = class271.method4781(var7, -1803411668);
               if (var8 != null && !var8.field3508 && var8.field3509 == var6 + (var3 ? 7 : 0)) {
                  var1[field2789[var6]] = var7 + 256;
                  break;
               }
            }
         }
      }

      this.field2781 = var1;
      this.field2790 = var2;
      this.field2782 = var3;
      this.field2783 = var4;
      this.method4414((byte)-1);
   }

   void method4414(byte var1) {
      long var2 = this.field2784;
      int var4 = this.field2781[5];
      int var5 = this.field2781[9];
      this.field2781[5] = var5;
      this.field2781[9] = var4;
      this.field2784 = 0L;

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         this.field2784 <<= 4;
         if (this.field2781[var6] >= 256) {
            this.field2784 += (long)(this.field2781[var6] - 256);
         }
      }

      if (this.field2781[0] >= 256) {
         this.field2784 += (long)(this.field2781[0] - 256 >> 4);
      }

      if (this.field2781[1] >= 256) {
         this.field2784 += (long)(this.field2781[1] - 256 >> 8);
      }

      for(var6 = 0; var6 < 5; ++var6) {
         this.field2784 <<= 3;
         this.field2784 += (long)this.field2790[var6];
      }

      this.field2784 <<= 1;
      this.field2784 += (long)(this.field2782 ? 1 : 0);
      this.field2781[5] = var4;
      this.field2781[9] = var5;
      if (var2 != 0L && var2 != this.field2784) {
         field2785.method3931(var2);
      }

   }

   public class131 method4413(class287 var1, int var2, class287 var3, int var4, int var5) {
      if (this.field2783 != -1) {
         return class68.method1100(this.field2783, (byte)-101).method5125(var1, var2, var3, var4, -365349015);
      } else {
         long var6 = this.field2784;
         int[] var8 = this.field2781;
         if (var1 != null && (var1.field3758 >= 0 || var1.field3756 >= 0)) {
            var8 = new int[12];

            for(int var9 = 0; var9 < 12; ++var9) {
               var8[var9] = this.field2781[var9];
            }

            if (var1.field3758 >= 0) {
               var6 += (long)(var1.field3758 - this.field2781[5] << 8);
               var8[5] = var1.field3758;
            }

            if (var1.field3756 >= 0) {
               var6 += (long)(var1.field3756 - this.field2781[3] << 16);
               var8[3] = var1.field3756;
            }
         }

         class131 var16 = (class131)field2785.method3929(var6);
         if (var16 == null) {
            boolean var10 = false;

            int var11;
            for(int var12 = 0; var12 < 12; ++var12) {
               var11 = var8[var12];
               if (var11 >= 256 && var11 < 512 && !class271.method4781(var11 - 256, -1803411668).method4833(-621565051)) {
                  var10 = true;
               }

               if (var11 >= 512 && !class146.method3099(var11 - 512, (byte)77).method5063(this.field2782, 1486897919)) {
                  var10 = true;
               }
            }

            if (var10) {
               if (-1L != this.field2786) {
                  var16 = (class131)field2785.method3929(this.field2786);
               }

               if (var16 == null) {
                  return null;
               }
            }

            if (var16 == null) {
               class125[] var18 = new class125[12];
               var11 = 0;

               int var13;
               for(int var14 = 0; var14 < 12; ++var14) {
                  var13 = var8[var14];
                  class125 var15;
                  if (var13 >= 256 && var13 < 512) {
                     var15 = class271.method4781(var13 - 256, -1803411668).method4834((byte)24);
                     if (var15 != null) {
                        var18[var11++] = var15;
                     }
                  }

                  if (var13 >= 512) {
                     var15 = class146.method3099(var13 - 512, (byte)32).method5079(this.field2782, (byte)-10);
                     if (var15 != null) {
                        var18[var11++] = var15;
                     }
                  }
               }

               class125 var19 = new class125(var18, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.field2790[var13] < class54.field629[var13].length) {
                     var19.method2595(field2788[var13], class54.field629[var13][this.field2790[var13]]);
                  }

                  if (this.field2790[var13] < field2780[var13].length) {
                     var19.method2595(field2787[var13], field2780[var13][this.field2790[var13]]);
                  }
               }

               var16 = var19.method2596(64, 850, -30, -50, -30);
               field2785.method3932(var16, var6);
               this.field2786 = var6;
            }
         }

         if (var1 == null && var3 == null) {
            return var16;
         } else {
            class131 var17;
            if (var1 != null && var3 != null) {
               var17 = var1.method5183(var16, var2, var3, var4, 1501538762);
            } else if (var1 != null) {
               var17 = var1.method5178(var16, var2, -154817742);
            } else {
               var17 = var3.method5178(var16, var4, 222423885);
            }

            return var17;
         }
      }
   }

   class125 method4434(int var1) {
      if (this.field2783 != -1) {
         return class68.method1100(this.field2783, (byte)-95).method5126(1022801171);
      } else {
         boolean var2 = false;

         int var3;
         for(int var4 = 0; var4 < 12; ++var4) {
            var3 = this.field2781[var4];
            if (var3 >= 256 && var3 < 512 && !class271.method4781(var3 - 256, -1803411668).method4835(576991862)) {
               var2 = true;
            }

            if (var3 >= 512 && !class146.method3099(var3 - 512, (byte)66).method5064(this.field2782, 1135958136)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            class125[] var8 = new class125[12];
            var3 = 0;

            int var5;
            for(int var6 = 0; var6 < 12; ++var6) {
               var5 = this.field2781[var6];
               class125 var7;
               if (var5 >= 256 && var5 < 512) {
                  var7 = class271.method4781(var5 - 256, -1803411668).method4836(-2064635094);
                  if (var7 != null) {
                     var8[var3++] = var7;
                  }
               }

               if (var5 >= 512) {
                  var7 = class146.method3099(var5 - 512, (byte)74).method5066(this.field2782, -1197043790);
                  if (var7 != null) {
                     var8[var3++] = var7;
                  }
               }
            }

            class125 var9 = new class125(var8, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.field2790[var5] < class54.field629[var5].length) {
                  var9.method2595(field2788[var5], class54.field629[var5][this.field2790[var5]]);
               }

               if (this.field2790[var5] < field2780[var5].length) {
                  var9.method2595(field2787[var5], field2780[var5][this.field2790[var5]]);
               }
            }

            return var9;
         }
      }
   }

   public int method4416(int var1) {
      return this.field2783 == -1 ? (this.field2781[0] << 15) + this.field2781[1] + (this.field2781[11] << 5) + (this.field2781[8] << 10) + (this.field2790[0] << 25) + (this.field2790[4] << 20) : 305419896 + class68.method1100(this.field2783, (byte)-113).field3700;
   }

   public void method4409(int var1, boolean var2, byte var3) {
      if (var1 != 1 || !this.field2782) {
         int var4 = this.field2781[field2789[var1]];
         if (var4 != 0) {
            var4 -= 256;

            class274 var5;
            do {
               do {
                  do {
                     if (!var2) {
                        --var4;
                        if (var4 < 0) {
                           var4 = class274.field3512 - 1;
                        }
                     } else {
                        ++var4;
                        if (var4 >= class274.field3512) {
                           var4 = 0;
                        }
                     }

                     var5 = class271.method4781(var4, -1803411668);
                  } while(var5 == null);
               } while(var5.field3508);
            } while(var5.field3509 != (this.field2782 ? 7 : 0) + var1);

            this.field2781[field2789[var1]] = var4 + 256;
            this.method4414((byte)-1);
         }
      }

   }

   public void method4410(int var1, boolean var2, byte var3) {
      int var4 = this.field2790[var1];
      if (!var2) {
         do {
            --var4;
            if (var4 < 0) {
               var4 = class54.field629[var1].length - 1;
            }
         } while(!class261.method4595(var1, var4, 1992735230));
      } else {
         do {
            ++var4;
            if (var4 >= class54.field629[var1].length) {
               var4 = 0;
            }
         } while(!class261.method4595(var1, var4, 1472203086));
      }

      this.field2790[var1] = var4;
      this.method4414((byte)-1);
   }

   public void method4411(boolean var1, byte var2) {
      if (this.field2782 != var1) {
         this.method4408((int[])null, this.field2790, var1, -1, (byte)111);
      }

   }

   public void method4412(class194 var1, byte var2) {
      var1.addByte(this.field2782 ? 1 : 0, (byte)-97);

      int var3;
      for(var3 = 0; var3 < 7; ++var3) {
         int var4 = this.field2781[field2789[var3]];
         if (var4 == 0) {
            var1.addByte(-1, (byte)-48);
         } else {
            var1.addByte(var4 - 256, (byte)-114);
         }
      }

      for(var3 = 0; var3 < 5; ++var3) {
         var1.addByte(this.field2790[var3], (byte)-47);
      }

   }

   static void method4436(int var0, class174 var1, class263 var2, byte var3) {
      byte[] var4 = null;
      class217 var5 = class262.field3387;
      synchronized(var5) {
         for(class259 var7 = (class259)class262.field3387.method4027(); var7 != null; var7 = (class259)class262.field3387.method4026()) {
            if ((long)var0 == var7.field2644 && var1 == var7.field3358 && var7.field3359 == 0) {
               var4 = var7.field3356;
               break;
            }
         }
      }

      if (var4 != null) {
         var2.method4666(var1, var0, var4, true, 1163215431);
      } else {
         byte[] var6 = var1.method3344(var0, 589720681);
         var2.method4666(var1, var0, var6, true, 759660192);
      }

   }

   static int method4435(int var0, class96 var1, boolean var2, byte var3) {
      class242 var4;
      if (var0 == 2700) {
         var4 = class3.method2(class81.field1272[--class135.field1964], 2096988293);
         class81.field1272[++class135.field1964 - 1] = var4.field2934;
         return 1;
      } else if (var0 == 2701) {
         var4 = class3.method2(class81.field1272[--class135.field1964], 2090051911);
         if (var4.field2934 != -1) {
            class81.field1272[++class135.field1964 - 1] = var4.field2935;
         } else {
            class81.field1272[++class135.field1964 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var5 = class81.field1272[--class135.field1964];
         class67 var6 = (class67)client.field1017.method3981((long)var5);
         if (var6 != null) {
            class81.field1272[++class135.field1964 - 1] = 1;
         } else {
            class81.field1272[++class135.field1964 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2706) {
         class81.field1272[++class135.field1964 - 1] = client.field1016;
         return 1;
      } else {
         return 2;
      }
   }
}

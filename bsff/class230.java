public class class230 extends class117 {
   int field2708;
   int field2692 = 256;
   int[] field2699 = new int[16];
   int[] field2695 = new int[16];
   class214 field2686 = new class214(128);
   int[] field2693 = new int[16];
   int[] field2712 = new int[16];
   int[] field2690 = new int[16];
   class231[][] field2694 = new class231[16][128];
   int[] field2698 = new int[16];
   class232 field2706 = new class232();
   class234 field2697 = new class234(this);
   int[] field2689 = new int[16];
   int[] field2691 = new int[16];
   int field2709;
   int[] field2703 = new int[16];
   int[] field2702 = new int[16];
   long field2711;
   int[] field2701 = new int[16];
   int[] field2700 = new int[16];
   int field2688 = 1000000;
   boolean field2707;
   class231[][] field2705 = new class231[16][128];
   int[] field2687 = new int[16];
   long field2710;
   int[] field2696 = new int[16];
   int[] field2704 = new int[16];

   public class230() {
      this.method4191(-1023223227);
   }

   void method4237(int var1, int var2, int var3) {
      this.field2693[var1] = var2;
      this.field2702[var1] = var2 & -128;
      this.method4229(var1, var2, (byte)-81);
   }

   void method4156(int var1, int var2, int var3, byte var4) {
      class231 var5 = this.field2694[var1][var2];
      if (var5 != null) {
         this.field2694[var1][var2] = null;
         if ((this.field2698[var1] & 2) != 0) {
            for(class231 var6 = (class231)this.field2697.field2757.method4027(); var6 != null; var6 = (class231)this.field2697.field2757.method4026()) {
               if (var6.field2725 == var5.field2725 && var6.field2728 < 0 && var6 != var5) {
                  var5.field2728 = 0;
                  break;
               }
            }
         } else {
            var5.field2728 = 0;
         }
      }

   }

   void method4160(int var1, byte var2) {
      for(class231 var3 = (class231)this.field2697.field2757.method4027(); var3 != null; var3 = (class231)this.field2697.field2757.method4026()) {
         if (var1 < 0 || var3.field2725 == var1) {
            if (var3.field2732 != null) {
               var3.field2732.method2314(class317.field3927 / 100);
               if (var3.field2732.method2318()) {
                  this.field2697.field2760.method2085(var3.field2732);
               }

               var3.method4259((byte)96);
            }

            if (var3.field2728 < 0) {
               this.field2694[var3.field2725][var3.field2719] = null;
            }

            var3.method4014();
         }
      }

   }

   public synchronized void method4150(int var1) {
      this.field2706.method4265();
      this.method4191(-1023223227);
   }

   void method4245(int var1, byte var2) {
      if (var1 >= 0) {
         this.field2689[var1] = 12800;
         this.field2690[var1] = 8192;
         this.field2691[var1] = 16383;
         this.field2695[var1] = 8192;
         this.field2696[var1] = 0;
         this.field2687[var1] = 8192;
         this.method4164(var1, (byte)42);
         this.method4165(var1, 1846926532);
         this.field2698[var1] = 0;
         this.field2704[var1] = 32767;
         this.field2700[var1] = 256;
         this.field2701[var1] = 0;
         this.method4167(var1, 8192, 634074011);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method4245(var1, (byte)28);
         }
      }

   }

   void method4154(int var1, int var2, int var3, int var4) {
   }

   void method4197(int var1, int var2, int var3, byte var4) {
      this.method4156(var1, var2, 64, (byte)1);
      if ((this.field2698[var1] & 2) != 0) {
         for(class231 var5 = (class231)this.field2697.field2757.method4032(); var5 != null; var5 = (class231)this.field2697.field2757.method4046()) {
            if (var5.field2725 == var1 && var5.field2728 < 0) {
               this.field2694[var1][var5.field2719] = null;
               this.field2694[var1][var2] = var5;
               int var6 = (var5.field2723 * var5.field2724 >> 12) + var5.field2722;
               var5.field2722 += var2 - var5.field2719 << 8;
               var5.field2723 = var6 - var5.field2722;
               var5.field2724 = 4096;
               var5.field2719 = var2;
               return;
            }
         }
      }

      class233 var9 = (class233)this.field2686.method3981((long)this.field2712[var1]);
      if (var9 != null) {
         class105 var10 = var9.field2751[var2];
         if (var10 != null) {
            class231 var7 = new class231();
            var7.field2725 = var1;
            var7.field2715 = var9;
            var7.field2716 = var10;
            var7.field2717 = var9.field2754[var2];
            var7.field2718 = var9.field2755[var2];
            var7.field2719 = var2;
            var7.field2720 = var3 * var3 * var9.field2750[var2] * var9.field2756 + 1024 >> 11;
            var7.field2721 = var9.field2753[var2] & 255;
            var7.field2722 = (var2 << 8) - (var9.field2752[var2] & 32767);
            var7.field2731 = 0;
            var7.field2726 = 0;
            var7.field2727 = 0;
            var7.field2728 = -1;
            var7.field2729 = 0;
            if (this.field2701[var1] == 0) {
               var7.field2732 = class115.method2446(var10, this.method4168(var7, (short)-29116), this.method4194(var7, 1237234824), this.method4170(var7, -1538141014));
            } else {
               var7.field2732 = class115.method2446(var10, this.method4168(var7, (short)-11264), 0, this.method4170(var7, -1894938876));
               this.method4219(var7, var9.field2752[var2] < 0, -1765722956);
            }

            if (var9.field2752[var2] < 0) {
               var7.field2732.method2303(-1);
            }

            if (var7.field2718 >= 0) {
               class231 var8 = this.field2705[var1][var7.field2718];
               if (var8 != null && var8.field2728 < 0) {
                  this.field2694[var1][var8.field2719] = null;
                  var8.field2728 = 0;
               }

               this.field2705[var1][var7.field2718] = var7;
            }

            this.field2697.field2757.method4020(var7);
            this.field2694[var1][var2] = var7;
         }
      }

   }

   void method4191(int var1) {
      this.method4160(-1, (byte)-121);
      this.method4245(-1, (byte)28);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.field2712[var2] = this.field2693[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.field2702[var2] = this.field2693[var2] & -128;
      }

   }

   void method4229(int var1, int var2, byte var3) {
      if (var2 != this.field2712[var1]) {
         this.field2712[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.field2705[var1][var4] = null;
         }
      }

   }

   protected synchronized void vmethod4339(int[] var1, int var2, int var3) {
      if (this.field2706.method4266()) {
         int var4 = this.field2706.field2736 * this.field2688 / class317.field3927;

         do {
            long var5 = (long)var4 * (long)var3 + this.field2710;
            if (this.field2711 - var5 >= 0L) {
               this.field2710 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field2711 - this.field2710) - 1L) / (long)var4);
            this.field2710 += (long)var7 * (long)var4;
            this.field2697.vmethod4339(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method4176(1177668007);
         } while(this.field2706.method4266());
      }

      this.field2697.vmethod4339(var1, var2, var3);
   }

   protected synchronized void vmethod4340(int var1) {
      if (this.field2706.method4266()) {
         int var2 = this.field2706.field2736 * this.field2688 / class317.field3927;

         do {
            long var3 = (long)var1 * (long)var2 + this.field2710;
            if (this.field2711 - var3 >= 0L) {
               this.field2710 = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.field2711 - this.field2710) - 1L) / (long)var2);
            this.field2710 += (long)var5 * (long)var2;
            this.field2697.vmethod4340(var5);
            var1 -= var5;
            this.method4176(1177668007);
         } while(this.field2706.method4266());
      }

      this.field2697.vmethod4340(var1);
   }

   void method4158(int var1, int var2, int var3) {
   }

   void method4159(int var1, int var2, int var3) {
      this.field2695[var1] = var2;
   }

   int method4168(class231 var1, short var2) {
      int var3 = (var1.field2723 * var1.field2724 >> 12) + var1.field2722;
      var3 += (this.field2695[var1.field2725] - 8192) * this.field2700[var1.field2725] >> 12;
      class228 var4 = var1.field2717;
      int var5;
      if (var4.field2667 > 0 && (var4.field2673 > 0 || this.field2696[var1.field2725] > 0)) {
         var5 = var4.field2673 << 2;
         int var6 = var4.field2671 << 1;
         if (var1.field2733 < var6) {
            var5 = var5 * var1.field2733 / var6;
         }

         var5 += this.field2696[var1.field2725] >> 7;
         double var7 = Math.sin(0.01227184630308513D * (double)(var1.field2730 & 511));
         var3 += (int)(var7 * (double)var5);
      }

      var5 = (int)((double)(var1.field2716.field1536 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)class317.field3927 + 0.5D);
      return var5 < 1 ? 1 : var5;
   }

   protected synchronized class117 vmethod4337() {
      return null;
   }

   public synchronized boolean method4146(class235 var1, class261 var2, class110 var3, int var4, int var5) {
      var1.method4370();
      boolean var6 = true;
      int[] var7 = null;
      if (var4 > 0) {
         var7 = new int[]{var4};
      }

      for(class225 var8 = (class225)var1.field2762.method3962(); var8 != null; var8 = (class225)var1.field2762.method3965()) {
         int var9 = (int)var8.field2644;
         class233 var10 = (class233)this.field2686.method3981((long)var9);
         if (var10 == null) {
            byte[] var11 = var2.method4612(var9, 2015929210);
            class233 var12;
            if (var11 == null) {
               var12 = null;
            } else {
               var12 = new class233(var11);
            }

            var10 = var12;
            if (var12 == null) {
               var6 = false;
               continue;
            }

            this.field2686.method3972(var12, (long)var9);
         }

         if (!var10.method4327(var3, var8.field2661, var7, -223867136)) {
            var6 = false;
         }
      }

      if (var6) {
         var1.method4361();
      }

      return var6;
   }

   boolean method4177(class231 var1, int var2) {
      if (var1.field2732 == null) {
         if (var1.field2728 >= 0) {
            var1.method4014();
            if (var1.field2718 > 0 && var1 == this.field2705[var1.field2725][var1.field2718]) {
               this.field2705[var1.field2725][var1.field2718] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void method4164(int var1, byte var2) {
      if ((this.field2698[var1] & 2) != 0) {
         for(class231 var3 = (class231)this.field2697.field2757.method4027(); var3 != null; var3 = (class231)this.field2697.field2757.method4026()) {
            if (var3.field2725 == var1 && this.field2694[var1][var3.field2719] == null && var3.field2728 < 0) {
               var3.field2728 = 0;
            }
         }
      }

   }

   int method4145(short var1) {
      return this.field2692;
   }

   void method4165(int var1, int var2) {
      if ((this.field2698[var1] & 4) != 0) {
         for(class231 var3 = (class231)this.field2697.field2757.method4027(); var3 != null; var3 = (class231)this.field2697.field2757.method4026()) {
            if (var3.field2725 == var1) {
               var3.field2734 = 0;
            }
         }
      }

   }

   void method4230(int var1, int var2) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method4156(var4, var5, var6, (byte)1);
      } else if (var3 == 144) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var6 > 0) {
            this.method4197(var4, var5, var6, (byte)-10);
         } else {
            this.method4156(var4, var5, 64, (byte)1);
         }
      } else if (var3 == 160) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method4154(var4, var5, var6, -2053494938);
      } else if (var3 == 176) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var5 == 0) {
            this.field2702[var4] = (var6 << 14) + (this.field2702[var4] & -2080769);
         }

         if (var5 == 32) {
            this.field2702[var4] = (var6 << 7) + (this.field2702[var4] & -16257);
         }

         if (var5 == 1) {
            this.field2696[var4] = (var6 << 7) + (this.field2696[var4] & -16257);
         }

         if (var5 == 33) {
            this.field2696[var4] = var6 + (this.field2696[var4] & -128);
         }

         if (var5 == 5) {
            this.field2687[var4] = (var6 << 7) + (this.field2687[var4] & -16257);
         }

         if (var5 == 37) {
            this.field2687[var4] = var6 + (this.field2687[var4] & -128);
         }

         if (var5 == 7) {
            this.field2689[var4] = (var6 << 7) + (this.field2689[var4] & -16257);
         }

         if (var5 == 39) {
            this.field2689[var4] = var6 + (this.field2689[var4] & -128);
         }

         if (var5 == 10) {
            this.field2690[var4] = (var6 << 7) + (this.field2690[var4] & -16257);
         }

         if (var5 == 42) {
            this.field2690[var4] = var6 + (this.field2690[var4] & -128);
         }

         if (var5 == 11) {
            this.field2691[var4] = (var6 << 7) + (this.field2691[var4] & -16257);
         }

         if (var5 == 43) {
            this.field2691[var4] = var6 + (this.field2691[var4] & -128);
         }

         if (var5 == 64) {
            if (var6 >= 64) {
               this.field2698[var4] |= 1;
            } else {
               this.field2698[var4] &= -2;
            }
         }

         if (var5 == 65) {
            if (var6 >= 64) {
               this.field2698[var4] |= 2;
            } else {
               this.method4164(var4, (byte)80);
               this.field2698[var4] &= -3;
            }
         }

         if (var5 == 99) {
            this.field2704[var4] = (var6 << 7) + (this.field2704[var4] & 127);
         }

         if (var5 == 98) {
            this.field2704[var4] = (this.field2704[var4] & 16256) + var6;
         }

         if (var5 == 101) {
            this.field2704[var4] = (var6 << 7) + (this.field2704[var4] & 127) + 16384;
         }

         if (var5 == 100) {
            this.field2704[var4] = (this.field2704[var4] & 16256) + var6 + 16384;
         }

         if (var5 == 120) {
            this.method4160(var4, (byte)-118);
         }

         if (var5 == 121) {
            this.method4245(var4, (byte)28);
         }

         if (var5 == 123) {
            this.method4162(var4, 1927531403);
         }

         int var7;
         if (var5 == 6) {
            var7 = this.field2704[var4];
            if (var7 == 16384) {
               this.field2700[var4] = (var6 << 7) + (this.field2700[var4] & -16257);
            }
         }

         if (var5 == 38) {
            var7 = this.field2704[var4];
            if (var7 == 16384) {
               this.field2700[var4] = var6 + (this.field2700[var4] & -128);
            }
         }

         if (var5 == 16) {
            this.field2701[var4] = (var6 << 7) + (this.field2701[var4] & -16257);
         }

         if (var5 == 48) {
            this.field2701[var4] = var6 + (this.field2701[var4] & -128);
         }

         if (var5 == 81) {
            if (var6 >= 64) {
               this.field2698[var4] |= 4;
            } else {
               this.method4165(var4, 1747370889);
               this.field2698[var4] &= -5;
            }
         }

         if (var5 == 17) {
            this.method4167(var4, (var6 << 7) + (this.field2699[var4] & -16257), -124737627);
         }

         if (var5 == 49) {
            this.method4167(var4, var6 + (this.field2699[var4] & -128), 1673907105);
         }
      } else if (var3 == 192) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method4229(var4, var5 + this.field2702[var4], (byte)-49);
      } else if (var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method4158(var4, var5, -1309201412);
      } else if (var3 == 224) {
         var4 = var1 & 15;
         var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method4159(var4, var5, -888245021);
      } else {
         var3 = var1 & 255;
         if (var3 == 255) {
            this.method4191(-1023223227);
         }
      }

   }

   synchronized boolean method4169(int var1) {
      return this.field2706.method4266();
   }

   public synchronized void method4172(byte var1) {
      for(class233 var2 = (class233)this.field2686.method3962(); var2 != null; var2 = (class233)this.field2686.method3965()) {
         var2.method4328(-1727373217);
      }

   }

   synchronized void method4148(int var1) {
      for(class233 var2 = (class233)this.field2686.method3962(); var2 != null; var2 = (class233)this.field2686.method3965()) {
         var2.method4014();
      }

   }

   boolean method4199(class231 var1, int[] var2, int var3, int var4, int var5) {
      var1.field2714 = class317.field3927 / 100;
      if (var1.field2728 < 0 || var1.field2732 != null && !var1.field2732.method2317()) {
         int var6 = var1.field2724;
         if (var6 > 0) {
            var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2687[var1.field2725]) + 0.5D);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.field2724 = var6;
         }

         var1.field2732.method2315(this.method4168(var1, (short)-22501));
         class228 var7 = var1.field2717;
         boolean var8 = false;
         ++var1.field2733;
         var1.field2730 += var7.field2667;
         double var9 = 5.086263020833333E-6D * (double)((var1.field2719 - 60 << 8) + (var1.field2724 * var1.field2723 >> 12));
         if (var7.field2669 > 0) {
            if (var7.field2672 > 0) {
               var1.field2731 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2672 * var9) + 0.5D);
            } else {
               var1.field2731 += 128;
            }
         }

         if (var7.field2674 != null) {
            if (var7.field2670 > 0) {
               var1.field2726 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2670 * var9) + 0.5D);
            } else {
               var1.field2726 += 128;
            }

            while(var1.field2727 < var7.field2674.length - 2 && var1.field2726 > (var7.field2674[var1.field2727 + 2] & 255) << 8) {
               var1.field2727 += 2;
            }

            if (var7.field2674.length - 2 == var1.field2727 && var7.field2674[var1.field2727 + 1] == 0) {
               var8 = true;
            }
         }

         if (var1.field2728 >= 0 && var7.field2668 != null && (this.field2698[var1.field2725] & 1) == 0 && (var1.field2718 < 0 || var1 != this.field2705[var1.field2725][var1.field2718])) {
            if (var7.field2675 > 0) {
               var1.field2728 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2675 * var9) + 0.5D);
            } else {
               var1.field2728 += 128;
            }

            while(var1.field2729 < var7.field2668.length - 2 && var1.field2728 > (var7.field2668[var1.field2729 + 2] & 255) << 8) {
               var1.field2729 += 2;
            }

            if (var7.field2668.length - 2 == var1.field2729) {
               var8 = true;
            }
         }

         if (var8) {
            var1.field2732.method2314(var1.field2714);
            if (var2 != null) {
               var1.field2732.vmethod4339(var2, var3, var4);
            } else {
               var1.field2732.vmethod4340(var4);
            }

            if (var1.field2732.method2318()) {
               this.field2697.field2760.method2085(var1.field2732);
            }

            var1.method4259((byte)87);
            if (var1.field2728 >= 0) {
               var1.method4014();
               if (var1.field2718 > 0 && var1 == this.field2705[var1.field2725][var1.field2718]) {
                  this.field2705[var1.field2725][var1.field2718] = null;
               }
            }

            return true;
         } else {
            var1.field2732.method2313(var1.field2714, this.method4194(var1, 1053159091), this.method4170(var1, -2089465605));
            return false;
         }
      } else {
         var1.method4259((byte)-115);
         var1.method4014();
         if (var1.field2718 > 0 && var1 == this.field2705[var1.field2725][var1.field2718]) {
            this.field2705[var1.field2725][var1.field2718] = null;
         }

         return true;
      }
   }

   public synchronized void method4144(int var1, int var2) {
      this.field2692 = var1;
   }

   protected synchronized class117 vmethod4336() {
      return this.field2697;
   }

   void method4167(int var1, int var2, int var3) {
      this.field2699[var1] = var2;
      this.field2703[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   public synchronized void method4174(class235 var1, boolean var2, int var3) {
      this.method4150(1065565639);
      this.field2706.method4264(var1.field2761);
      this.field2707 = var2;
      this.field2710 = 0L;
      int var4 = this.field2706.method4278();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field2706.method4268(var5);
         this.field2706.method4271(var5);
         this.field2706.method4269(var5);
      }

      this.field2708 = this.field2706.method4267();
      this.field2709 = this.field2706.field2739[this.field2708];
      this.field2711 = this.field2706.method4275(this.field2709);
   }

   void method4176(int var1) {
      int var2 = this.field2708;
      int var3 = this.field2709;

      long var4;
      for(var4 = this.field2711; var3 == this.field2709; var4 = this.field2706.method4275(var3)) {
         while(var3 == this.field2706.field2739[var2]) {
            this.field2706.method4268(var2);
            int var6 = this.field2706.method4293(var2);
            if (var6 == 1) {
               this.field2706.method4270();
               this.field2706.method4269(var2);
               if (this.field2706.method4277()) {
                  if (!this.field2707 || var3 == 0) {
                     this.method4191(-1023223227);
                     this.field2706.method4265();
                     return;
                  }

                  this.field2706.method4280(var4);
               }
               break;
            }

            if ((var6 & 128) != 0) {
               this.method4230(var6, -471781276);
            }

            this.field2706.method4271(var2);
            this.field2706.method4269(var2);
         }

         var2 = this.field2706.method4267();
         var3 = this.field2706.field2739[var2];
      }

      this.field2708 = var2;
      this.field2709 = var3;
      this.field2711 = var4;
   }

   void method4219(class231 var1, boolean var2, int var3) {
      int var4 = var1.field2716.field1535.length;
      int var5;
      if (var2 && var1.field2716.field1539) {
         int var6 = var4 + var4 - var1.field2716.field1537;
         var5 = (int)((long)var6 * (long)this.field2701[var1.field2725] >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.field2732.method2310(true);
         }
      } else {
         var5 = (int)((long)var4 * (long)this.field2701[var1.field2725] >> 6);
      }

      var1.field2732.method2323(var5);
   }

   protected synchronized int vmethod4338() {
      return 0;
   }

   int method4194(class231 var1, int var2) {
      class228 var3 = var1.field2717;
      int var4 = this.field2691[var1.field2725] * this.field2689[var1.field2725] + 4096 >> 13;
      var4 = var4 * var4 + 16384 >> 15;
      var4 = var4 * var1.field2720 + 16384 >> 15;
      var4 = var4 * this.field2692 + 128 >> 8;
      if (var3.field2669 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5D, (double)var3.field2669 * 1.953125E-5D * (double)var1.field2731) + 0.5D);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if (var3.field2674 != null) {
         var5 = var1.field2726;
         var6 = var3.field2674[var1.field2727 + 1];
         if (var1.field2727 < var3.field2674.length - 2) {
            var7 = (var3.field2674[var1.field2727] & 255) << 8;
            var8 = (var3.field2674[var1.field2727 + 2] & 255) << 8;
            var6 += (var5 - var7) * (var3.field2674[var1.field2727 + 3] - var6) / (var8 - var7);
         }

         var4 = var4 * var6 + 32 >> 6;
      }

      if (var1.field2728 > 0 && var3.field2668 != null) {
         var5 = var1.field2728;
         var6 = var3.field2668[var1.field2729 + 1];
         if (var1.field2729 < var3.field2668.length - 2) {
            var7 = (var3.field2668[var1.field2729] & 255) << 8;
            var8 = (var3.field2668[var1.field2729 + 2] & 255) << 8;
            var6 += (var5 - var7) * (var3.field2668[var1.field2729 + 3] - var6) / (var8 - var7);
         }

         var4 = var4 * var6 + 32 >> 6;
      }

      return var4;
   }

   int method4170(class231 var1, int var2) {
      int var3 = this.field2690[var1.field2725];
      return var3 < 8192 ? var3 * var1.field2721 + 32 >> 6 : 16384 - ((128 - var1.field2721) * (16384 - var3) + 32 >> 6);
   }

   public synchronized void method4152(int var1, int var2, int var3) {
      this.method4237(var1, var2, -2046720671);
   }

   void method4162(int var1, int var2) {
      for(class231 var3 = (class231)this.field2697.field2757.method4027(); var3 != null; var3 = (class231)this.field2697.field2757.method4026()) {
         if ((var1 < 0 || var3.field2725 == var1) && var3.field2728 < 0) {
            this.field2694[var3.field2725][var3.field2719] = null;
            var3.field2728 = 0;
         }
      }

   }

   static class142 method4257(int var0, int var1) {
      class142 var2 = (class142)class287.field3752.method3929((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         class261 var3 = class287.field3747;
         class261 var4 = class287.field3753;
         boolean var5 = true;
         int[] var6 = var3.method4562(var0, -1756613559);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.method4559(var0, var6[var7], (byte)-17);
            if (var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.method4559(var9, 0, (byte)-128);
               if (var10 == null) {
                  var5 = false;
               }
            }
         }

         class142 var12;
         if (!var5) {
            var12 = null;
         } else {
            try {
               var12 = new class142(var3, var4, var0, false);
            } catch (Exception var11) {
               var12 = null;
            }
         }

         if (var12 != null) {
            class287.field3752.method3932(var12, (long)var0);
         }

         return var12;
      }
   }
}

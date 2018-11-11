public class class283 extends class218 {
   static class212 field3639 = new class212(64);
   public static class261 field3688;
   static class212 field3663 = new class212(50);
   static class212 field3643 = new class212(200);
   int field3661 = -1;
   int field3669 = -1;
   int field3686;
   int[] field3673;
   int field3660 = -2;
   class209 field3683;
   int field3641 = -1;
   int field3670 = -1;
   int field3667 = -1;
   public String[] field3659 = new String[]{null, null, null, null, "Drop"};
   public String field3644 = "null";
   int field3671 = -1;
   public int field3649 = 2000;
   public int field3642;
   int field3664 = -1;
   int field3672 = -1;
   int[] field3680;
   int field3655 = -1;
   int field3648 = -1;
   public int field3668 = 0;
   int field3658 = 128;
   public int field3640 = 0;
   public int field3653 = 0;
   public int field3665 = 0;
   int field3678 = 128;
   public int field3654 = 0;
   public int field3647 = 0;
   public boolean field3657 = false;
   public int field3656 = 1;
   int field3679 = 128;
   short[] field3645;
   int field3638 = 0;
   public int field3676 = -1;
   public String[] field3674 = new String[]{null, null, "Take", null, null};
   int field3666 = 0;
   short[] field3646;
   public boolean field3651 = false;
   public int field3684 = -1;
   public int field3652 = 0;
   short[] field3675;
   int field3650 = -1;
   short[] field3662;
   public int field3681 = 0;
   public int field3682 = 0;
   public int field3636 = -1;
   int field3685 = -1;
   public int field3687 = -1;

   void method5056(class194 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3686 = var1.getUShort(-1208216487);
      } else if (var2 == 2) {
         this.field3644 = var1.getString1(-778927800);
      } else if (var2 == 4) {
         this.field3649 = var1.getUShort(-1208216487);
      } else if (var2 == 5) {
         this.field3668 = var1.getUShort(-1208216487);
      } else if (var2 == 6) {
         this.field3640 = var1.getUShort(-1208216487);
      } else if (var2 == 7) {
         this.field3653 = var1.getUShort(-1208216487);
         if (this.field3653 > 32767) {
            this.field3653 -= 65536;
         }
      } else if (var2 == 8) {
         this.field3654 = var1.getUShort(-1208216487);
         if (this.field3654 > 32767) {
            this.field3654 -= 65536;
         }
      } else if (var2 == 11) {
         this.field3665 = 1;
      } else if (var2 == 12) {
         this.field3656 = var1.getInt(-1817376731);
      } else if (var2 == 16) {
         this.field3657 = true;
      } else if (var2 == 23) {
         this.field3661 = var1.getUShort(-1208216487);
         this.field3638 = var1.getUByte(-1907923727);
      } else if (var2 == 24) {
         this.field3641 = var1.getUShort(-1208216487);
      } else if (var2 == 25) {
         this.field3664 = var1.getUShort(-1208216487);
         this.field3666 = var1.getUByte(-452491601);
      } else if (var2 == 26) {
         this.field3655 = var1.getUShort(-1208216487);
      } else if (var2 >= 30 && var2 < 35) {
         this.field3674[var2 - 30] = var1.getString1(-778927800);
         if (this.field3674[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3674[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.field3659[var2 - 35] = var1.getString1(-778927800);
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.getUByte(-422451462);
            this.field3645 = new short[var4];
            this.field3675 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3645[var5] = (short)var1.getUShort(-1208216487);
               this.field3675[var5] = (short)var1.getUShort(-1208216487);
            }
         } else if (var2 == 41) {
            var4 = var1.getUByte(-545497400);
            this.field3646 = new short[var4];
            this.field3662 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3646[var5] = (short)var1.getUShort(-1208216487);
               this.field3662[var5] = (short)var1.getUShort(-1208216487);
            }
         } else if (var2 == 42) {
            this.field3660 = var1.getByte(-929898617);
         } else if (var2 == 65) {
            this.field3651 = true;
         } else if (var2 == 78) {
            this.field3667 = var1.getUShort(-1208216487);
         } else if (var2 == 79) {
            this.field3648 = var1.getUShort(-1208216487);
         } else if (var2 == 90) {
            this.field3669 = var1.getUShort(-1208216487);
         } else if (var2 == 91) {
            this.field3671 = var1.getUShort(-1208216487);
         } else if (var2 == 92) {
            this.field3670 = var1.getUShort(-1208216487);
         } else if (var2 == 93) {
            this.field3672 = var1.getUShort(-1208216487);
         } else if (var2 == 95) {
            this.field3647 = var1.getUShort(-1208216487);
         } else if (var2 == 97) {
            this.field3684 = var1.getUShort(-1208216487);
         } else if (var2 == 98) {
            this.field3676 = var1.getUShort(-1208216487);
         } else if (var2 >= 100 && var2 < 110) {
            if (this.field3673 == null) {
               this.field3673 = new int[10];
               this.field3680 = new int[10];
            }

            this.field3673[var2 - 100] = var1.getUShort(-1208216487);
            this.field3680[var2 - 100] = var1.getUShort(-1208216487);
         } else if (var2 == 110) {
            this.field3658 = var1.getUShort(-1208216487);
         } else if (var2 == 111) {
            this.field3678 = var1.getUShort(-1208216487);
         } else if (var2 == 112) {
            this.field3679 = var1.getUShort(-1208216487);
         } else if (var2 == 113) {
            this.field3652 = var1.getByte(-1663515282);
         } else if (var2 == 114) {
            this.field3681 = var1.getByte(-730460645) * 5;
         } else if (var2 == 115) {
            this.field3682 = var1.getUByte(-1975580548);
         } else if (var2 == 139) {
            this.field3685 = var1.getUShort(-1208216487);
         } else if (var2 == 140) {
            this.field3650 = var1.getUShort(-1208216487);
         } else if (var2 == 148) {
            this.field3687 = var1.getUShort(-1208216487);
         } else if (var2 == 149) {
            this.field3636 = var1.getUShort(-1208216487);
         } else if (var2 == 249) {
            this.field3683 = class245.method4509(var1, this.field3683, 127735665);
         }
      }

   }

   public final class131 method5061(int var1, int var2) {
      if (this.field3673 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field3680[var4] && this.field3680[var4] != 0) {
               var3 = this.field3673[var4];
            }
         }

         if (var3 != -1) {
            return class146.method3099(var3, (byte)67).method5061(1, 1328972181);
         }
      }

      class131 var6 = (class131)field3663.method3929((long)this.field3642);
      if (var6 != null) {
         return var6;
      } else {
         class125 var7 = class125.method2583(field3688, this.field3686, 0);
         if (var7 == null) {
            return null;
         } else {
            if (this.field3658 != 128 || this.field3678 != 128 || this.field3679 != 128) {
               var7.method2644(this.field3658, this.field3678, this.field3679);
            }

            int var5;
            if (this.field3645 != null) {
               for(var5 = 0; var5 < this.field3645.length; ++var5) {
                  var7.method2595(this.field3645[var5], this.field3675[var5]);
               }
            }

            if (this.field3646 != null) {
               for(var5 = 0; var5 < this.field3646.length; ++var5) {
                  var7.method2660(this.field3646[var5], this.field3662[var5]);
               }
            }

            var6 = var7.method2596(this.field3652 + 64, this.field3681 + 768, -50, -10, -50);
            var6.field1850 = true;
            field3663.method3932(var6, (long)this.field3642);
            return var6;
         }
      }
   }

   public final class125 method5057(int var1, byte var2) {
      int var3;
      if (this.field3673 != null && var1 > 1) {
         int var4 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.field3680[var3] && this.field3680[var3] != 0) {
               var4 = this.field3673[var3];
            }
         }

         if (var4 != -1) {
            return class146.method3099(var4, (byte)26).method5057(1, (byte)-7);
         }
      }

      class125 var5 = class125.method2583(field3688, this.field3686, 0);
      if (var5 == null) {
         return null;
      } else {
         if (this.field3658 != 128 || this.field3678 != 128 || this.field3679 != 128) {
            var5.method2644(this.field3658, this.field3678, this.field3679);
         }

         if (this.field3645 != null) {
            for(var3 = 0; var3 < this.field3645.length; ++var3) {
               var5.method2595(this.field3645[var3], this.field3675[var3]);
            }
         }

         if (this.field3646 != null) {
            for(var3 = 0; var3 < this.field3646.length; ++var3) {
               var5.method2660(this.field3646[var3], this.field3662[var3]);
            }
         }

         return var5;
      }
   }

   void method5054(int var1) {
   }

   public final boolean method5064(boolean var1, int var2) {
      int var3 = this.field3669;
      int var4 = this.field3670;
      if (var1) {
         var3 = this.field3671;
         var4 = this.field3672;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!field3688.method4570(var3, 0, (byte)70)) {
            var5 = false;
         }

         if (var4 != -1 && !field3688.method4570(var4, 0, (byte)70)) {
            var5 = false;
         }

         return var5;
      }
   }

   void method5102(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(-1491552078);
         if (var3 == 0) {
            return;
         }

         this.method5056(var1, var3, 84979127);
      }
   }

   public final class125 method5066(boolean var1, int var2) {
      int var3 = this.field3669;
      int var4 = this.field3670;
      if (var1) {
         var3 = this.field3671;
         var4 = this.field3672;
      }

      if (var3 == -1) {
         return null;
      } else {
         class125 var5 = class125.method2583(field3688, var3, 0);
         if (var4 != -1) {
            class125 var6 = class125.method2583(field3688, var4, 0);
            class125[] var7 = new class125[]{var5, var6};
            var5 = new class125(var7, 2);
         }

         int var8;
         if (this.field3645 != null) {
            for(var8 = 0; var8 < this.field3645.length; ++var8) {
               var5.method2595(this.field3645[var8], this.field3675[var8]);
            }
         }

         if (this.field3646 != null) {
            for(var8 = 0; var8 < this.field3646.length; ++var8) {
               var5.method2660(this.field3646[var8], this.field3662[var8]);
            }
         }

         return var5;
      }
   }

   public final boolean method5063(boolean var1, int var2) {
      int var3 = this.field3661;
      int var4 = this.field3641;
      int var5 = this.field3667;
      if (var1) {
         var3 = this.field3664;
         var4 = this.field3655;
         var5 = this.field3648;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if (!field3688.method4570(var3, 0, (byte)70)) {
            var6 = false;
         }

         if (var4 != -1 && !field3688.method4570(var4, 0, (byte)70)) {
            var6 = false;
         }

         if (var5 != -1 && !field3688.method4570(var5, 0, (byte)70)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final class125 method5079(boolean var1, byte var2) {
      int var3 = this.field3661;
      int var4 = this.field3641;
      int var5 = this.field3667;
      if (var1) {
         var3 = this.field3664;
         var4 = this.field3655;
         var5 = this.field3648;
      }

      if (var3 == -1) {
         return null;
      } else {
         class125 var6 = class125.method2583(field3688, var3, 0);
         if (var4 != -1) {
            class125 var7 = class125.method2583(field3688, var4, 0);
            if (var5 != -1) {
               class125 var8 = class125.method2583(field3688, var5, 0);
               class125[] var9 = new class125[]{var6, var7, var8};
               var6 = new class125(var9, 3);
            } else {
               class125[] var11 = new class125[]{var6, var7};
               var6 = new class125(var11, 2);
            }
         }

         if (!var1 && this.field3638 != 0) {
            var6.method2647(0, this.field3638, 0);
         }

         if (var1 && this.field3666 != 0) {
            var6.method2647(0, this.field3666, 0);
         }

         int var10;
         if (this.field3645 != null) {
            for(var10 = 0; var10 < this.field3645.length; ++var10) {
               var6.method2595(this.field3645[var10], this.field3675[var10]);
            }
         }

         if (this.field3646 != null) {
            for(var10 = 0; var10 < this.field3646.length; ++var10) {
               var6.method2660(this.field3646[var10], this.field3662[var10]);
            }
         }

         return var6;
      }
   }

   void method5053(class283 var1, class283 var2, short var3) {
      this.field3686 = var1.field3686;
      this.field3649 = var1.field3649;
      this.field3668 = var1.field3668;
      this.field3640 = var1.field3640;
      this.field3647 = var1.field3647;
      this.field3653 = var1.field3653;
      this.field3654 = var1.field3654;
      this.field3645 = var1.field3645;
      this.field3675 = var1.field3675;
      this.field3646 = var1.field3646;
      this.field3662 = var1.field3662;
      this.field3644 = var2.field3644;
      this.field3657 = var2.field3657;
      this.field3656 = var2.field3656;
      this.field3665 = 1;
   }

   void method5058(class283 var1, class283 var2, int var3) {
      this.field3686 = var1.field3686;
      this.field3649 = var1.field3649;
      this.field3668 = var1.field3668;
      this.field3640 = var1.field3640;
      this.field3647 = var1.field3647;
      this.field3653 = var1.field3653;
      this.field3654 = var1.field3654;
      this.field3645 = var2.field3645;
      this.field3675 = var2.field3675;
      this.field3646 = var2.field3646;
      this.field3662 = var2.field3662;
      this.field3644 = var2.field3644;
      this.field3657 = var2.field3657;
      this.field3665 = var2.field3665;
      this.field3661 = var2.field3661;
      this.field3641 = var2.field3641;
      this.field3667 = var2.field3667;
      this.field3664 = var2.field3664;
      this.field3655 = var2.field3655;
      this.field3648 = var2.field3648;
      this.field3669 = var2.field3669;
      this.field3670 = var2.field3670;
      this.field3671 = var2.field3671;
      this.field3672 = var2.field3672;
      this.field3682 = var2.field3682;
      this.field3674 = var2.field3674;
      this.field3659 = new String[5];
      if (var2.field3659 != null) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.field3659[var4] = var2.field3659[var4];
         }
      }

      this.field3659[4] = "Discard";
      this.field3656 = 0;
   }

   void method5059(class283 var1, class283 var2, int var3) {
      this.field3686 = var1.field3686;
      this.field3649 = var1.field3649;
      this.field3668 = var1.field3668;
      this.field3640 = var1.field3640;
      this.field3647 = var1.field3647;
      this.field3653 = var1.field3653;
      this.field3654 = var1.field3654;
      this.field3645 = var1.field3645;
      this.field3675 = var1.field3675;
      this.field3646 = var1.field3646;
      this.field3662 = var1.field3662;
      this.field3665 = var1.field3665;
      this.field3644 = var2.field3644;
      this.field3656 = 0;
      this.field3657 = false;
      this.field3651 = false;
   }

   public class283 method5062(int var1, int var2) {
      if (this.field3673 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field3680[var4] && this.field3680[var4] != 0) {
               var3 = this.field3673[var4];
            }
         }

         if (var3 != -1) {
            return class146.method3099(var3, (byte)126);
         }
      }

      return this;
   }

   public int method5069(int var1) {
      return this.field3660 != -1 && this.field3659 != null ? (this.field3660 >= 0 ? (this.field3659[this.field3660] != null ? this.field3660 : -1) : ("Drop".equalsIgnoreCase(this.field3659[4]) ? 4 : -1)) : -1;
   }

   public int method5067(int var1, int var2, int var3) {
      return class23.method190(this.field3683, var1, var2, (byte)-5);
   }

   public String method5068(int var1, String var2, int var3) {
      return class155.method3172(this.field3683, var1, var2, -1738562914);
   }

   public static int method5113(class194 var0, String var1, int var2) {
      int var3 = var0.field2565;
      int var4 = var1.length();
      byte[] var5 = new byte[var4];

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var1.charAt(var6);
         if ((var7 <= 0 || var7 >= '\u0080') && (var7 < '\u00a0' || var7 > '\u00ff')) {
            if (var7 == '\u20ac') {
               var5[var6] = -128;
            } else if (var7 == '\u201a') {
               var5[var6] = -126;
            } else if (var7 == '\u0192') {
               var5[var6] = -125;
            } else if (var7 == '\u201e') {
               var5[var6] = -124;
            } else if (var7 == '\u2026') {
               var5[var6] = -123;
            } else if (var7 == '\u2020') {
               var5[var6] = -122;
            } else if (var7 == '\u2021') {
               var5[var6] = -121;
            } else if (var7 == '\u02c6') {
               var5[var6] = -120;
            } else if (var7 == '\u2030') {
               var5[var6] = -119;
            } else if (var7 == '\u0160') {
               var5[var6] = -118;
            } else if (var7 == '\u2039') {
               var5[var6] = -117;
            } else if (var7 == '\u0152') {
               var5[var6] = -116;
            } else if (var7 == '\u017d') {
               var5[var6] = -114;
            } else if (var7 == '\u2018') {
               var5[var6] = -111;
            } else if (var7 == '\u2019') {
               var5[var6] = -110;
            } else if (var7 == '\u201c') {
               var5[var6] = -109;
            } else if (var7 == '\u201d') {
               var5[var6] = -108;
            } else if (var7 == '\u2022') {
               var5[var6] = -107;
            } else if (var7 == '\u2013') {
               var5[var6] = -106;
            } else if (var7 == '\u2014') {
               var5[var6] = -105;
            } else if (var7 == '\u02dc') {
               var5[var6] = -104;
            } else if (var7 == '\u2122') {
               var5[var6] = -103;
            } else if (var7 == '\u0161') {
               var5[var6] = -102;
            } else if (var7 == '\u203a') {
               var5[var6] = -101;
            } else if (var7 == '\u0153') {
               var5[var6] = -100;
            } else if (var7 == '\u017e') {
               var5[var6] = -98;
            } else if (var7 == '\u0178') {
               var5[var6] = -97;
            } else {
               var5[var6] = 63;
            }
         } else {
            var5[var6] = (byte)var7;
         }
      }

      var0.addSmart(var5.length, (byte)-45);
      var0.field2565 += class313.field3907.method3445(var5, 0, var5.length, var0.field2566, var0.field2565, -16711936);
      return var0.field2565 - var3;
   }
}

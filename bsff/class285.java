public class class285 extends class218 {
   static class212 field3705 = new class212(50);
   static class212 field3698 = new class212(64);
   public static class261 field3714;
   public static class261 field3727;
   class209 field3732;
   int field3726 = -1;
   public int[] field3718;
   public String field3701 = "null";
   int[] field3704;
   int field3708 = -1;
   int[] field3703;
   public int field3700;
   public int field3702 = 1;
   public int field3716 = -1;
   public int field3707 = -1;
   public int field3706 = -1;
   public int field3721 = -1;
   public String[] field3720 = new String[5];
   int field3719 = 128;
   short[] field3712;
   public boolean field3717 = true;
   int field3697 = 128;
   short[] field3696;
   short[] field3713;
   public int field3709 = -1;
   short[] field3725;
   public int field3710 = -1;
   public int field3715 = -1;
   public boolean field3699 = false;
   public int field3711 = -1;
   int field3722 = 0;
   int field3723 = 0;
   public int field3724 = -1;
   public int field3728 = 32;
   public boolean field3729 = true;
   public boolean field3730 = true;
   public boolean field3731 = false;

   public final class285 method5136(int var1) {
      int var2 = -1;
      if (this.field3726 != -1) {
         var2 = class88.method1853(this.field3726, 607428886);
      } else if (this.field3708 != -1) {
         var2 = class237.field2770[this.field3708];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field3718.length - 1) {
         var3 = this.field3718[var2];
      } else {
         var3 = this.field3718[this.field3718.length - 1];
      }

      return var3 != -1 ? class68.method1100(var3, (byte)-73) : null;
   }

   void method5146(class194 var1, int var2, int var3) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.getUByte(-1957545066);
         this.field3703 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3703[var5] = var1.getUShort(-1208216487);
         }
      } else if (var2 == 2) {
         this.field3701 = var1.getString1(-778927800);
      } else if (var2 == 12) {
         this.field3702 = var1.getUByte(-2064270283);
      } else if (var2 == 13) {
         this.field3716 = var1.getUShort(-1208216487);
      } else if (var2 == 14) {
         this.field3707 = var1.getUShort(-1208216487);
      } else if (var2 == 15) {
         this.field3706 = var1.getUShort(-1208216487);
      } else if (var2 == 16) {
         this.field3721 = var1.getUShort(-1208216487);
      } else if (var2 == 17) {
         this.field3707 = var1.getUShort(-1208216487);
         this.field3709 = var1.getUShort(-1208216487);
         this.field3710 = var1.getUShort(-1208216487);
         this.field3711 = var1.getUShort(-1208216487);
      } else if (var2 >= 30 && var2 < 35) {
         this.field3720[var2 - 30] = var1.getString1(-778927800);
         if (this.field3720[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3720[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.getUByte(-1943345524);
         this.field3712 = new short[var4];
         this.field3713 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3712[var5] = (short)var1.getUShort(-1208216487);
            this.field3713[var5] = (short)var1.getUShort(-1208216487);
         }
      } else if (var2 == 41) {
         var4 = var1.getUByte(507896033);
         this.field3696 = new short[var4];
         this.field3725 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3696[var5] = (short)var1.getUShort(-1208216487);
            this.field3725[var5] = (short)var1.getUShort(-1208216487);
         }
      } else if (var2 == 60) {
         var4 = var1.getUByte(-980847558);
         this.field3704 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3704[var5] = var1.getUShort(-1208216487);
         }
      } else if (var2 == 93) {
         this.field3717 = false;
      } else if (var2 == 95) {
         this.field3715 = var1.getUShort(-1208216487);
      } else if (var2 == 97) {
         this.field3719 = var1.getUShort(-1208216487);
      } else if (var2 == 98) {
         this.field3697 = var1.getUShort(-1208216487);
      } else if (var2 == 99) {
         this.field3699 = true;
      } else if (var2 == 100) {
         this.field3722 = var1.getByte(-1342631868);
      } else if (var2 == 101) {
         this.field3723 = var1.getByte(-1715314827) * 5;
      } else if (var2 == 102) {
         this.field3724 = var1.getUShort(-1208216487);
      } else if (var2 == 103) {
         this.field3728 = var1.getUShort(-1208216487);
      } else if (var2 != 106 && var2 != 118) {
         if (var2 == 107) {
            this.field3729 = false;
         } else if (var2 == 109) {
            this.field3730 = false;
         } else if (var2 == 111) {
            this.field3731 = true;
         } else if (var2 == 249) {
            this.field3732 = class245.method4509(var1, this.field3732, 979277528);
         }
      } else {
         this.field3726 = var1.getUShort(-1208216487);
         if (this.field3726 == 65535) {
            this.field3726 = -1;
         }

         this.field3708 = var1.getUShort(-1208216487);
         if (this.field3708 == 65535) {
            this.field3708 = -1;
         }

         var4 = -1;
         if (var2 == 118) {
            var4 = var1.getUShort(-1208216487);
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         var5 = var1.getUByte(1014722897);
         this.field3718 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3718[var6] = var1.getUShort(-1208216487);
            if (this.field3718[var6] == 65535) {
               this.field3718[var6] = -1;
            }
         }

         this.field3718[var5 + 1] = var4;
      }

   }

   public final class125 method5126(int var1) {
      if (this.field3718 != null) {
         class285 var6 = this.method5136(1989321154);
         return var6 == null ? null : var6.method5126(1022801171);
      } else if (this.field3704 == null) {
         return null;
      } else {
         boolean var2 = false;

         for(int var3 = 0; var3 < this.field3704.length; ++var3) {
            if (!field3714.method4570(this.field3704[var3], 0, (byte)70)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            class125[] var7 = new class125[this.field3704.length];

            for(int var4 = 0; var4 < this.field3704.length; ++var4) {
               var7[var4] = class125.method2583(field3714, this.field3704[var4], 0);
            }

            class125 var8;
            if (var7.length == 1) {
               var8 = var7[0];
            } else {
               var8 = new class125(var7, var7.length);
            }

            int var5;
            if (this.field3712 != null) {
               for(var5 = 0; var5 < this.field3712.length; ++var5) {
                  var8.method2595(this.field3712[var5], this.field3713[var5]);
               }
            }

            if (this.field3696 != null) {
               for(var5 = 0; var5 < this.field3696.length; ++var5) {
                  var8.method2660(this.field3696[var5], this.field3725[var5]);
               }
            }

            return var8;
         }
      }
   }

   public final class131 method5125(class287 var1, int var2, class287 var3, int var4, int var5) {
      if (this.field3718 != null) {
         class285 var12 = this.method5136(640575751);
         return var12 == null ? null : var12.method5125(var1, var2, var3, var4, -610005859);
      } else {
         class131 var6 = (class131)field3705.method3929((long)this.field3700);
         if (var6 == null) {
            boolean var7 = false;

            for(int var8 = 0; var8 < this.field3703.length; ++var8) {
               if (!field3714.method4570(this.field3703[var8], 0, (byte)70)) {
                  var7 = true;
               }
            }

            if (var7) {
               return null;
            }

            class125[] var13 = new class125[this.field3703.length];

            int var9;
            for(var9 = 0; var9 < this.field3703.length; ++var9) {
               var13[var9] = class125.method2583(field3714, this.field3703[var9], 0);
            }

            class125 var10;
            if (var13.length == 1) {
               var10 = var13[0];
            } else {
               var10 = new class125(var13, var13.length);
            }

            if (this.field3712 != null) {
               for(var9 = 0; var9 < this.field3712.length; ++var9) {
                  var10.method2595(this.field3712[var9], this.field3713[var9]);
               }
            }

            if (this.field3696 != null) {
               for(var9 = 0; var9 < this.field3696.length; ++var9) {
                  var10.method2660(this.field3696[var9], this.field3725[var9]);
               }
            }

            var6 = var10.method2596(this.field3722 + 64, this.field3723 + 850, -30, -50, -30);
            field3705.method3932(var6, (long)this.field3700);
         }

         class131 var11;
         if (var1 != null && var3 != null) {
            var11 = var1.method5183(var6, var2, var3, var4, 547076559);
         } else if (var1 != null) {
            var11 = var1.method5178(var6, var2, 1499906179);
         } else if (var3 != null) {
            var11 = var3.method5178(var6, var4, -196554996);
         } else {
            var11 = var6.method2763(true);
         }

         if (this.field3719 != 128 || this.field3697 != 128) {
            var11.method2680(this.field3719, this.field3697, this.field3719);
         }

         return var11;
      }
   }

   void method5122(byte var1) {
   }

   void method5123(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(1333462216);
         if (var3 == 0) {
            return;
         }

         this.method5146(var1, var3, -22346527);
      }
   }

   public boolean method5134(int var1) {
      if (this.field3718 == null) {
         return true;
      } else {
         int var2 = -1;
         if (this.field3726 != -1) {
            var2 = class88.method1853(this.field3726, 752729297);
         } else if (this.field3708 != -1) {
            var2 = class237.field2770[this.field3708];
         }

         return var2 >= 0 && var2 < this.field3718.length ? this.field3718[var2] != -1 : this.field3718[this.field3718.length - 1] != -1;
      }
   }

   public int method5129(int var1, int var2, int var3) {
      return class23.method190(this.field3732, var1, var2, (byte)-47);
   }

   public String method5130(int var1, String var2, byte var3) {
      return class155.method3172(this.field3732, var1, var2, -1738562914);
   }
}

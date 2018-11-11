import java.io.File;
import java.io.IOException;

public class class282 extends class218 {
   public static boolean field3616 = false;
   public static class212 field3600 = new class212(4096);
   public static class261 field3587;
   public static class212 field3591 = new class212(30);
   public static class212 field3590 = new class212(30);
   public static class212 field3609 = new class212(500);
   static class125[] field3603 = new class125[4];
   class209 field3635;
   int field3628 = -1;
   public int field3612 = -1;
   int[] field3626;
   int[] field3595;
   public int[] field3627;
   public String field3596 = "null";
   public int field3630 = -1;
   int field3629 = -1;
   public int field3618 = -1;
   public int field3593;
   public int field3614 = -1;
   public int[] field3634;
   public int field3601 = 1;
   public int field3586 = 2;
   boolean field3608 = false;
   public int field3602 = 1;
   public boolean field3604 = true;
   public int field3622 = 0;
   boolean field3607 = false;
   int field3605 = -1;
   public int field3589 = 0;
   public boolean field3594 = false;
   int field3611 = 0;
   int field3617 = 128;
   int field3588 = 0;
   public String[] field3613 = new String[5];
   public int field3633 = 0;
   boolean field3625 = false;
   public int field3592 = -1;
   public int field3610 = 16;
   int field3632 = 128;
   short[] field3597;
   public boolean field3631 = true;
   short[] field3599;
   short[] field3598;
   int field3620 = 128;
   short[] field3606;
   int field3621 = 0;
   public int field3615 = -1;
   int field3624 = 0;
   int field3623 = 0;
   public boolean field3619 = false;

   public final class282 method5008(byte var1) {
      int var2 = -1;
      if (this.field3628 != -1) {
         var2 = class88.method1853(this.field3628, 1960730749);
      } else if (this.field3629 != -1) {
         var2 = class237.field2770[this.field3629];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field3627.length - 1) {
         var3 = this.field3627[var2];
      } else {
         var3 = this.field3627[this.field3627.length - 1];
      }

      return var3 != -1 ? class260.method4546(var3, 1335045149) : null;
   }

   void method5001(class194 var1, int var2, int var3) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.getUByte(-157388611);
         if (var4 > 0) {
            if (this.field3626 != null && !field3616) {
               var1.field2565 += 3 * var4;
            } else {
               this.field3595 = new int[var4];
               this.field3626 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3626[var5] = var1.getUShort(-1208216487);
                  this.field3595[var5] = var1.getUByte(-77885529);
               }
            }
         }
      } else if (var2 == 2) {
         this.field3596 = var1.getString1(-778927800);
      } else if (var2 == 5) {
         var4 = var1.getUByte(48125895);
         if (var4 > 0) {
            if (this.field3626 != null && !field3616) {
               var1.field2565 += var4 * 2;
            } else {
               this.field3595 = null;
               this.field3626 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3626[var5] = var1.getUShort(-1208216487);
               }
            }
         }
      } else if (var2 == 14) {
         this.field3601 = var1.getUByte(-1391776432);
      } else if (var2 == 15) {
         this.field3602 = var1.getUByte(733343947);
      } else if (var2 == 17) {
         this.field3586 = 0;
         this.field3604 = false;
      } else if (var2 == 18) {
         this.field3604 = false;
      } else if (var2 == 19) {
         this.field3612 = var1.getUByte(35061474);
      } else if (var2 == 21) {
         this.field3605 = 0;
      } else if (var2 == 22) {
         this.field3607 = true;
      } else if (var2 == 23) {
         this.field3594 = true;
      } else if (var2 == 24) {
         this.field3592 = var1.getUShort(-1208216487);
         if (this.field3592 == 65535) {
            this.field3592 = -1;
         }
      } else if (var2 == 27) {
         this.field3586 = 1;
      } else if (var2 == 28) {
         this.field3610 = var1.getUByte(-1257530333);
      } else if (var2 == 29) {
         this.field3611 = var1.getByte(-2091766897);
      } else if (var2 == 39) {
         this.field3588 = var1.getByte(-731130747) * 25;
      } else if (var2 >= 30 && var2 < 35) {
         this.field3613[var2 - 30] = var1.getString1(-778927800);
         if (this.field3613[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3613[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.getUByte(1399568464);
         this.field3597 = new short[var4];
         this.field3598 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3597[var5] = (short)var1.getUShort(-1208216487);
            this.field3598[var5] = (short)var1.getUShort(-1208216487);
         }
      } else if (var2 == 41) {
         var4 = var1.getUByte(1077564238);
         this.field3599 = new short[var4];
         this.field3606 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3599[var5] = (short)var1.getUShort(-1208216487);
            this.field3606[var5] = (short)var1.getUShort(-1208216487);
         }
      } else if (var2 == 62) {
         this.field3608 = true;
      } else if (var2 == 64) {
         this.field3631 = false;
      } else if (var2 == 65) {
         this.field3617 = var1.getUShort(-1208216487);
      } else if (var2 == 66) {
         this.field3632 = var1.getUShort(-1208216487);
      } else if (var2 == 67) {
         this.field3620 = var1.getUShort(-1208216487);
      } else if (var2 == 68) {
         this.field3615 = var1.getUShort(-1208216487);
      } else if (var2 == 69) {
         var1.getUByte(-1817374645);
      } else if (var2 == 70) {
         this.field3621 = var1.getShort(997392590);
      } else if (var2 == 71) {
         this.field3624 = var1.getShort(997392590);
      } else if (var2 == 72) {
         this.field3623 = var1.getShort(997392590);
      } else if (var2 == 73) {
         this.field3619 = true;
      } else if (var2 == 74) {
         this.field3625 = true;
      } else if (var2 == 75) {
         this.field3618 = var1.getUByte(1457877832);
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.field3630 = var1.getUShort(-1208216487);
            this.field3622 = var1.getUByte(1036277025);
         } else if (var2 == 79) {
            this.field3589 = var1.getUShort(-1208216487);
            this.field3633 = var1.getUShort(-1208216487);
            this.field3622 = var1.getUByte(799368035);
            var4 = var1.getUByte(8501402);
            this.field3634 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3634[var5] = var1.getUShort(-1208216487);
            }
         } else if (var2 == 81) {
            this.field3605 = var1.getUByte(-1946829116) * 256;
         } else if (var2 == 82) {
            this.field3614 = var1.getUShort(-1208216487);
         } else if (var2 == 249) {
            this.field3635 = class245.method4509(var1, this.field3635, 1245672568);
         }
      } else {
         this.field3628 = var1.getUShort(-1208216487);
         if (this.field3628 == 65535) {
            this.field3628 = -1;
         }

         this.field3629 = var1.getUShort(-1208216487);
         if (this.field3629 == 65535) {
            this.field3629 = -1;
         }

         var4 = -1;
         if (var2 == 92) {
            var4 = var1.getUShort(-1208216487);
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         var5 = var1.getUByte(862435952);
         this.field3627 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3627[var6] = var1.getUShort(-1208216487);
            if (this.field3627[var6] == 65535) {
               this.field3627[var6] = -1;
            }
         }

         this.field3627[var5 + 1] = var4;
      }

   }

   final class125 method5007(int var1, int var2, int var3) {
      class125 var4 = null;
      boolean var5;
      int var6;
      int var7;
      int var8;
      if (this.field3595 == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.field3626 == null) {
            return null;
         }

         var5 = this.field3608;
         if (var1 == 2 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.field3626.length;

         for(var8 = 0; var8 < var6; ++var8) {
            var7 = this.field3626[var8];
            if (var5) {
               var7 += 65536;
            }

            var4 = (class125)field3609.method3929((long)var7);
            if (var4 == null) {
               var4 = class125.method2583(field3587, var7 & '\uffff', 0);
               if (var4 == null) {
                  return null;
               }

               if (var5) {
                  var4.method2626();
               }

               field3609.method3932(var4, (long)var7);
            }

            if (var6 > 1) {
               field3603[var8] = var4;
            }
         }

         if (var6 > 1) {
            var4 = new class125(field3603, var6);
         }
      } else {
         var8 = -1;

         for(var6 = 0; var6 < this.field3595.length; ++var6) {
            if (this.field3595[var6] == var1) {
               var8 = var6;
               break;
            }
         }

         if (var8 == -1) {
            return null;
         }

         var6 = this.field3626[var8];
         boolean var9 = this.field3608 ^ var2 > 3;
         if (var9) {
            var6 += 65536;
         }

         var4 = (class125)field3609.method3929((long)var6);
         if (var4 == null) {
            var4 = class125.method2583(field3587, var6 & '\uffff', 0);
            if (var4 == null) {
               return null;
            }

            if (var9) {
               var4.method2626();
            }

            field3609.method3932(var4, (long)var6);
         }
      }

      if (this.field3617 == 128 && this.field3632 == 128 && this.field3620 == 128) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var11;
      if (this.field3621 == 0 && this.field3624 == 0 && this.field3623 == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      class125 var10 = new class125(var4, var2 == 0 && !var5 && !var11, null == this.field3597, null == this.field3599, true);
      if (var1 == 4 && var2 > 3) {
         var10.method2593(256);
         var10.method2647(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var10.method2590();
      } else if (var2 == 2) {
         var10.method2591();
      } else if (var2 == 3) {
         var10.method2592();
      }

      if (this.field3597 != null) {
         for(var7 = 0; var7 < this.field3597.length; ++var7) {
            var10.method2595(this.field3597[var7], this.field3598[var7]);
         }
      }

      if (this.field3599 != null) {
         for(var7 = 0; var7 < this.field3599.length; ++var7) {
            var10.method2660(this.field3599[var7], this.field3606[var7]);
         }
      }

      if (var5) {
         var10.method2644(this.field3617, this.field3632, this.field3620);
      }

      if (var11) {
         var10.method2647(this.field3621, this.field3624, this.field3623);
      }

      return var10;
   }

   void method4999(int var1) {
      if (this.field3612 == -1) {
         this.field3612 = 0;
         if (this.field3626 != null && (this.field3595 == null || this.field3595[0] == 10)) {
            this.field3612 = 1;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if (this.field3613[var2] != null) {
               this.field3612 = 1;
            }
         }
      }

      if (this.field3618 == -1) {
         this.field3618 = this.field3586 != 0 ? 1 : 0;
      }

   }

   void method5023(class194 var1, byte var2) {
      while(true) {
         int var3 = var1.getUByte(-1543624486);
         if (var3 == 0) {
            return;
         }

         this.method5001(var1, var3, -754133915);
      }
   }

   public final class131 method5006(int var1, int var2, int[][] var3, int var4, int var5, int var6, class287 var7, int var8, int var9) {
      long var10;
      if (this.field3595 == null) {
         var10 = (long)(var2 + (this.field3593 << 10));
      } else {
         var10 = (long)(var2 + (var1 << 3) + (this.field3593 << 10));
      }

      class131 var12 = (class131)field3591.method3929(var10);
      if (var12 == null) {
         class125 var13 = this.method5007(var1, var2, 979763817);
         if (var13 == null) {
            return null;
         }

         var12 = var13.method2596(this.field3611 + 64, this.field3588 + 768, -50, -10, -50);
         field3591.method3932(var12, var10);
      }

      if (var7 == null && this.field3605 == -1) {
         return var12;
      } else {
         if (var7 != null) {
            var12 = var7.method5179(var12, var8, var2, 2129475365);
         } else {
            var12 = var12.method2763(true);
         }

         if (this.field3605 >= 0) {
            var12 = var12.method2682(var3, var4, var5, var6, false, this.field3605);
         }

         return var12;
      }
   }

   public final class131 method5005(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      long var8;
      if (this.field3595 == null) {
         var8 = (long)(var2 + (this.field3593 << 10));
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field3593 << 10));
      }

      class131 var10 = (class131)field3591.method3929(var8);
      if (var10 == null) {
         class125 var11 = this.method5007(var1, var2, 979763817);
         if (var11 == null) {
            return null;
         }

         var10 = var11.method2596(this.field3611 + 64, this.field3588 + 768, -50, -10, -50);
         field3591.method3932(var10, var8);
      }

      if (this.field3605 >= 0) {
         var10 = var10.method2682(var3, var4, var5, var6, true, this.field3605);
      }

      return var10;
   }

   public final boolean method5002(int var1, int var2) {
      if (this.field3595 != null) {
         for(int var5 = 0; var5 < this.field3595.length; ++var5) {
            if (this.field3595[var5] == var1) {
               return field3587.method4570(this.field3626[var5] & '\uffff', 0, (byte)70);
            }
         }

         return true;
      } else if (this.field3626 == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.field3626.length; ++var4) {
            var3 &= field3587.method4570(this.field3626[var4] & '\uffff', 0, (byte)70);
         }

         return var3;
      }
   }

   public final boolean method5003(int var1) {
      if (this.field3626 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3626.length; ++var3) {
            var2 &= field3587.method4570(this.field3626[var3] & '\uffff', 0, (byte)70);
         }

         return var2;
      }
   }

   public boolean method5011(byte var1) {
      if (this.field3627 == null) {
         return this.field3630 != -1 || this.field3634 != null;
      } else {
         for(int var2 = 0; var2 < this.field3627.length; ++var2) {
            if (this.field3627[var2] != -1) {
               class282 var3 = class260.method4546(this.field3627[var2], 1396668753);
               if (var3.field3630 != -1 || var3.field3634 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public final class139 method5031(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      long var8;
      if (this.field3595 == null) {
         var8 = (long)(var2 + (this.field3593 << 10));
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field3593 << 10));
      }

      Object var10 = (class139)field3590.method3929(var8);
      if (var10 == null) {
         class125 var11 = this.method5007(var1, var2, 979763817);
         if (var11 == null) {
            return null;
         }

         if (!this.field3607) {
            var10 = var11.method2596(this.field3611 + 64, this.field3588 + 768, -50, -10, -50);
         } else {
            var11.field1749 = (short)(this.field3611 + 64);
            var11.field1746 = (short)(this.field3588 + 768);
            var11.method2599();
            var10 = var11;
         }

         field3590.method3932((class218)var10, var8);
      }

      if (this.field3607) {
         var10 = ((class125)var10).method2587();
      }

      if (this.field3605 >= 0) {
         if (var10 instanceof class131) {
            var10 = ((class131)var10).method2682(var3, var4, var5, var6, true, this.field3605);
         } else if (var10 instanceof class125) {
            var10 = ((class125)var10).method2588(var3, var4, var5, var6, true, this.field3605);
         }
      }

      return (class139)var10;
   }

   public int method5009(int var1, int var2, byte var3) {
      return class23.method190(this.field3635, var1, var2, (byte)-16);
   }

   public String method5010(int var1, String var2, byte var3) {
      return class155.method3172(this.field3635, var1, var2, -1738562914);
   }

   static void method5052(File var0, File var1, byte var2) {
      try {
         class122 var3 = new class122(class167.field2205, "rw", 10000L);
         class194 var4 = new class194(500);
         var4.addByte(3, (byte)-47);
         var4.addByte(var1 != null ? 1 : 0, (byte)-8);
         var4.method3602(var0.getPath(), (byte)-115);
         if (var1 != null) {
            var4.method3602(var1.getPath(), (byte)93);
         }

         var3.method2534(var4.field2566, 0, var4.field2565, 2059838255);
         var3.method2535((byte)-96);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }
}

public class class287 extends class218 {
   public static int field3765;
   public static class212 field3752 = new class212(100);
   public static class212 field3751 = new class212(64);
   public static class261 field3747;
   public static class261 field3753;
   static int field3766;
   static class330 field3764;
   public int field3761 = -1;
   public int[] field3750;
   int[] field3755;
   public int field3762 = -1;
   public int field3754 = -1;
   public int[] field3763;
   public boolean field3746 = false;
   public int field3758 = -1;
   public int field3757 = 5;
   public int field3756 = -1;
   int[] field3748;
   public int field3760 = 99;
   public int field3749 = 2;
   public int[] field3759;

   void method5176(class194 var1, int var2, int var3) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.getUShort(-1208216487);
         this.field3763 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3763[var5] = var1.getUShort(-1208216487);
         }

         this.field3750 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3750[var5] = var1.getUShort(-1208216487);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3750[var5] += var1.getUShort(-1208216487) << 16;
         }
      } else if (var2 == 2) {
         this.field3754 = var1.getUShort(-1208216487);
      } else if (var2 == 3) {
         var4 = var1.getUByte(404754364);
         this.field3755 = new int[var4 + 1];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3755[var5] = var1.getUByte(-314168228);
         }

         this.field3755[var4] = 9999999;
      } else if (var2 == 4) {
         this.field3746 = true;
      } else if (var2 == 5) {
         this.field3757 = var1.getUByte(-2001795356);
      } else if (var2 == 6) {
         this.field3758 = var1.getUShort(-1208216487);
      } else if (var2 == 7) {
         this.field3756 = var1.getUShort(-1208216487);
      } else if (var2 == 8) {
         this.field3760 = var1.getUByte(-505185218);
      } else if (var2 == 9) {
         this.field3761 = var1.getUByte(856216277);
      } else if (var2 == 10) {
         this.field3762 = var1.getUByte(791520627);
      } else if (var2 == 11) {
         this.field3749 = var1.getUByte(1278304524);
      } else if (var2 == 12) {
         var4 = var1.getUByte(-1366844829);
         this.field3748 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3748[var5] = var1.getUShort(-1208216487);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3748[var5] += var1.getUShort(-1208216487) << 16;
         }
      } else if (var2 == 13) {
         var4 = var1.getUByte(-1039052927);
         this.field3759 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3759[var5] = var1.get24Int((byte)43);
         }
      }

   }

   public class131 method5178(class131 var1, int var2, int var3) {
      var2 = this.field3750[var2];
      class142 var4 = class230.method4257(var2 >> 16, -2115891116);
      var2 &= 65535;
      if (var4 == null) {
         return var1.method2763(true);
      } else {
         class131 var5 = var1.method2763(!var4.method3079(var2, 1944805564));
         var5.method2759(var4, var2);
         return var5;
      }
   }

   public class131 method5183(class131 var1, int var2, class287 var3, int var4, int var5) {
      var2 = this.field3750[var2];
      class142 var6 = class230.method4257(var2 >> 16, -1210246303);
      var2 &= 65535;
      if (var6 == null) {
         return var3.method5178(var1, var4, -1236349666);
      } else {
         var4 = var3.field3750[var4];
         class142 var7 = class230.method4257(var4 >> 16, 526799404);
         var4 &= 65535;
         class131 var8;
         if (var7 == null) {
            var8 = var1.method2763(!var6.method3079(var2, 1944805564));
            var8.method2759(var6, var2);
            return var8;
         } else {
            var8 = var1.method2763(!var6.method3079(var2, 1944805564) & !var7.method3079(var4, 1944805564));
            var8.method2692(var6, var2, var7, var4, this.field3755);
            return var8;
         }
      }
   }

   class131 method5179(class131 var1, int var2, int var3, int var4) {
      var2 = this.field3750[var2];
      class142 var5 = class230.method4257(var2 >> 16, -1867696806);
      var2 &= 65535;
      if (var5 == null) {
         return var1.method2763(true);
      } else {
         class131 var6 = var1.method2763(!var5.method3079(var2, 1944805564));
         var3 &= 3;
         if (var3 == 1) {
            var6.method2745();
         } else if (var3 == 2) {
            var6.method2695();
         } else if (var3 == 3) {
            var6.method2694();
         }

         var6.method2759(var5, var2);
         if (var3 == 1) {
            var6.method2694();
         } else if (var3 == 2) {
            var6.method2695();
         } else if (var3 == 3) {
            var6.method2745();
         }

         return var6;
      }
   }

   class131 method5184(class131 var1, int var2, int var3) {
      var2 = this.field3750[var2];
      class142 var4 = class230.method4257(var2 >> 16, -1462465783);
      var2 &= 65535;
      if (var4 == null) {
         return var1.method2715(true);
      } else {
         class131 var5 = var1.method2715(!var4.method3079(var2, 1944805564));
         var5.method2759(var4, var2);
         return var5;
      }
   }

   public class131 method5182(class131 var1, int var2, byte var3) {
      int var4 = this.field3750[var2];
      class142 var5 = class230.method4257(var4 >> 16, -2075247307);
      var4 &= 65535;
      if (var5 == null) {
         return var1.method2763(true);
      } else {
         class142 var6 = null;
         int var7 = 0;
         if (this.field3748 != null && var2 < this.field3748.length) {
            var7 = this.field3748[var2];
            var6 = class230.method4257(var7 >> 16, -766792351);
            var7 &= 65535;
         }

         class131 var8;
         if (var6 != null && var7 != 65535) {
            var8 = var1.method2763(!var5.method3079(var4, 1944805564) & !var6.method3079(var7, 1944805564));
            var8.method2759(var5, var4);
            var8.method2759(var6, var7);
            return var8;
         } else {
            var8 = var1.method2763(!var5.method3079(var4, 1944805564));
            var8.method2759(var5, var4);
            return var8;
         }
      }
   }

   void method5180(int var1) {
      if (this.field3761 == -1) {
         if (this.field3755 != null) {
            this.field3761 = 2;
         } else {
            this.field3761 = 0;
         }
      }

      if (this.field3762 == -1) {
         if (this.field3755 != null) {
            this.field3762 = 2;
         } else {
            this.field3762 = 0;
         }
      }

   }

   void method5175(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(1296328761);
         if (var3 == 0) {
            return;
         }

         this.method5176(var1, var3, 796592874);
      }
   }
}

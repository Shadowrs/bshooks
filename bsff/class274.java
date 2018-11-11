public class class274 extends class218 {
   public static int field3512;
   static class212 field3507 = new class212(64);
   public static class261 field3505;
   public static class261 field3506;
   int[] field3510;
   int[] field3515 = new int[]{-1, -1, -1, -1, -1};
   public int field3509 = -1;
   short[] field3511;
   public boolean field3508 = false;
   short[] field3513;
   short[] field3516;
   short[] field3514;

   void method4830(class194 var1, int var2, byte var3) {
      if (var2 == 1) {
         this.field3509 = var1.getUByte(308695877);
      } else {
         int var4;
         int var5;
         if (var2 == 2) {
            var4 = var1.getUByte(-321254407);
            this.field3510 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3510[var5] = var1.getUShort(-1208216487);
            }
         } else if (var2 == 3) {
            this.field3508 = true;
         } else if (var2 == 40) {
            var4 = var1.getUByte(-1663537383);
            this.field3511 = new short[var4];
            this.field3516 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3511[var5] = (short)var1.getUShort(-1208216487);
               this.field3516[var5] = (short)var1.getUShort(-1208216487);
            }
         } else if (var2 == 41) {
            var4 = var1.getUByte(-160352453);
            this.field3513 = new short[var4];
            this.field3514 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3513[var5] = (short)var1.getUShort(-1208216487);
               this.field3514[var5] = (short)var1.getUShort(-1208216487);
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field3515[var2 - 60] = var1.getUShort(-1208216487);
         }
      }

   }

   public boolean method4835(int var1) {
      boolean var2 = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.field3515[var3] != -1 && !field3505.method4570(this.field3515[var3], 0, (byte)70)) {
            var2 = false;
         }
      }

      return var2;
   }

   public class125 method4836(int var1) {
      class125[] var2 = new class125[5];
      int var3 = 0;

      for(int var4 = 0; var4 < 5; ++var4) {
         if (this.field3515[var4] != -1) {
            var2[var3++] = class125.method2583(field3505, this.field3515[var4], 0);
         }
      }

      class125 var6 = new class125(var2, var3);
      int var5;
      if (this.field3511 != null) {
         for(var5 = 0; var5 < this.field3511.length; ++var5) {
            var6.method2595(this.field3511[var5], this.field3516[var5]);
         }
      }

      if (this.field3513 != null) {
         for(var5 = 0; var5 < this.field3513.length; ++var5) {
            var6.method2660(this.field3513[var5], this.field3514[var5]);
         }
      }

      return var6;
   }

   public boolean method4833(int var1) {
      if (this.field3510 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3510.length; ++var3) {
            if (!field3505.method4570(this.field3510[var3], 0, (byte)70)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   void method4832(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(74413818);
         if (var3 == 0) {
            return;
         }

         this.method4830(var1, var3, (byte)-7);
      }
   }

   public class125 method4834(byte var1) {
      if (this.field3510 == null) {
         return null;
      } else {
         class125[] var2 = new class125[this.field3510.length];

         for(int var3 = 0; var3 < this.field3510.length; ++var3) {
            var2[var3] = class125.method2583(field3505, this.field3510[var3], 0);
         }

         class125 var5;
         if (var2.length == 1) {
            var5 = var2[0];
         } else {
            var5 = new class125(var2, var2.length);
         }

         int var4;
         if (this.field3511 != null) {
            for(var4 = 0; var4 < this.field3511.length; ++var4) {
               var5.method2595(this.field3511[var4], this.field3516[var4]);
            }
         }

         if (this.field3513 != null) {
            for(var4 = 0; var4 < this.field3513.length; ++var4) {
               var5.method2660(this.field3513[var4], this.field3514[var4]);
            }
         }

         return var5;
      }
   }
}

import java.awt.Component;

public class class272 extends class218 {
   static class212 field3486 = new class212(30);
   static class212 field3485 = new class212(64);
   static class261 field3489;
   int field3493;
   public int field3494 = -1;
   int field3488;
   int field3497 = 128;
   int field3495 = 128;
   int field3496 = 0;
   int field3484 = 0;
   int field3498 = 0;
   short[] field3490;
   short[] field3492;
   short[] field3491;
   short[] field3487;

   void method4794(class194 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3488 = var1.getUShort(-1208216487);
      } else if (var2 == 2) {
         this.field3494 = var1.getUShort(-1208216487);
      } else if (var2 == 4) {
         this.field3497 = var1.getUShort(-1208216487);
      } else if (var2 == 5) {
         this.field3495 = var1.getUShort(-1208216487);
      } else if (var2 == 6) {
         this.field3496 = var1.getUShort(-1208216487);
      } else if (var2 == 7) {
         this.field3484 = var1.getUByte(-2115689238);
      } else if (var2 == 8) {
         this.field3498 = var1.getUByte(-1632608265);
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.getUByte(1020672455);
            this.field3490 = new short[var4];
            this.field3491 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3490[var5] = (short)var1.getUShort(-1208216487);
               this.field3491[var5] = (short)var1.getUShort(-1208216487);
            }
         } else if (var2 == 41) {
            var4 = var1.getUByte(-1836297597);
            this.field3492 = new short[var4];
            this.field3487 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3492[var5] = (short)var1.getUShort(-1208216487);
               this.field3487[var5] = (short)var1.getUShort(-1208216487);
            }
         }
      }

   }

   public final class131 method4795(int var1, int var2) {
      class131 var3 = (class131)field3486.method3929((long)this.field3493);
      if (var3 == null) {
         class125 var4 = class125.method2583(class142.field2061, this.field3488, 0);
         if (var4 == null) {
            return null;
         }

         int var5;
         if (this.field3490 != null) {
            for(var5 = 0; var5 < this.field3490.length; ++var5) {
               var4.method2595(this.field3490[var5], this.field3491[var5]);
            }
         }

         if (this.field3492 != null) {
            for(var5 = 0; var5 < this.field3492.length; ++var5) {
               var4.method2660(this.field3492[var5], this.field3487[var5]);
            }
         }

         var3 = var4.method2596(this.field3484 + 64, this.field3498 + 850, -30, -50, -30);
         field3486.method3932(var3, (long)this.field3493);
      }

      class131 var6;
      if (this.field3494 != -1 && var1 != -1) {
         var6 = class202.method3839(this.field3494, (byte)118).method5184(var3, var1, -814049924);
      } else {
         var6 = var3.method2715(true);
      }

      if (this.field3497 != 128 || this.field3495 != 128) {
         var6.method2680(this.field3497, this.field3495, this.field3497);
      }

      if (this.field3496 != 0) {
         if (this.field3496 == 90) {
            var6.method2694();
         }

         if (this.field3496 == 180) {
            var6.method2694();
            var6.method2694();
         }

         if (this.field3496 == 270) {
            var6.method2694();
            var6.method2694();
            var6.method2694();
         }
      }

      return var6;
   }

   void method4805(class194 var1, byte var2) {
      while(true) {
         int var3 = var1.getUByte(-518280704);
         if (var3 == 0) {
            return;
         }

         this.method4794(var1, var3, 1872578810);
      }
   }

   static void method4799(Component var0, byte var1) {
      var0.addMouseListener(class60.field696);
      var0.addMouseMotionListener(class60.field696);
      var0.addFocusListener(class60.field696);
   }

   public static void method4810(byte var0) {
      class268.field3442.method3933();
   }
}

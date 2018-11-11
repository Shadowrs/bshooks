public class class232 {
   static byte[] field2742 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   long field2744;
   int[] field2738;
   class194 field2743 = new class194((byte[])null);
   int field2741;
   int[] field2737;
   int[] field2739;
   int field2736;
   int[] field2735;

   class232(byte[] var1) {
      this.method4264(var1);
   }

   class232() {
   }

   int method4298(int var1) {
      byte var2 = this.field2743.field2566[this.field2743.field2565];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field2735[var1] = var3;
         ++this.field2743.field2565;
      } else {
         var3 = this.field2735[var1];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method4304(var1, var3);
      } else {
         int var4 = this.field2743.method3536(864780789);
         if (var3 == 247 && var4 > 0) {
            int var5 = this.field2743.field2566[this.field2743.field2565] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.field2743.field2565;
               this.field2735[var1] = var5;
               return this.method4304(var1, var5);
            }
         }

         this.field2743.field2565 += var4;
         return 0;
      }
   }

   void method4265() {
      this.field2743.field2566 = null;
      this.field2737 = null;
      this.field2738 = null;
      this.field2739 = null;
      this.field2735 = null;
   }

   boolean method4266() {
      return this.field2743.field2566 != null;
   }

   void method4264(byte[] var1) {
      this.field2743.field2566 = var1;
      this.field2743.field2565 = 10;
      int var2 = this.field2743.getUShort(-1208216487);
      this.field2736 = this.field2743.getUShort(-1208216487);
      this.field2741 = 500000;
      this.field2737 = new int[var2];

      int var3;
      int var4;
      for(var3 = 0; var3 < var2; this.field2743.field2565 += var4) {
         int var5 = this.field2743.getInt(-1817376731);
         var4 = this.field2743.getInt(-1817376731);
         if (var5 == 1297379947) {
            this.field2737[var3] = this.field2743.field2565;
            ++var3;
         }
      }

      this.field2744 = 0L;
      this.field2738 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field2738[var3] = this.field2737[var3];
      }

      this.field2739 = new int[var2];
      this.field2735 = new int[var2];
   }

   void method4268(int var1) {
      this.field2743.field2565 = this.field2738[var1];
   }

   int method4267() {
      int var1 = this.field2738.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field2738[var4] >= 0 && this.field2739[var4] < var3) {
            var2 = var4;
            var3 = this.field2739[var4];
         }
      }

      return var2;
   }

   int method4278() {
      return this.field2738.length;
   }

   int method4293(int var1) {
      int var2 = this.method4298(var1);
      return var2;
   }

   void method4271(int var1) {
      int var2 = this.field2743.method3536(1813164612);
      this.field2739[var1] += var2;
   }

   int method4304(int var1, int var2) {
      int var3;
      if (var2 == 255) {
         int var7 = this.field2743.getUByte(1517164474);
         var3 = this.field2743.method3536(-535599625);
         if (var7 == 47) {
            this.field2743.field2565 += var3;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.field2743.get24Int((byte)2);
            var3 -= 3;
            int var6 = this.field2739[var1];
            this.field2744 += (long)var6 * (long)(this.field2741 - var5);
            this.field2741 = var5;
            this.field2743.field2565 += var3;
            return 2;
         } else {
            this.field2743.field2565 += var3;
            return 3;
         }
      } else {
         byte var4 = field2742[var2 - 128];
         var3 = var2;
         if (var4 >= 1) {
            var3 = var2 | this.field2743.getUByte(54243261) << 8;
         }

         if (var4 >= 2) {
            var3 |= this.field2743.getUByte(-210944938) << 16;
         }

         return var3;
      }
   }

   void method4270() {
      this.field2743.field2565 = -1;
   }

   void method4269(int var1) {
      this.field2738[var1] = this.field2743.field2565;
   }

   boolean method4277() {
      int var1 = this.field2738.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field2738[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   long method4275(int var1) {
      return this.field2744 + (long)var1 * (long)this.field2741;
   }

   void method4280(long var1) {
      this.field2744 = var1;
      int var3 = this.field2738.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2739[var4] = 0;
         this.field2735[var4] = 0;
         this.field2743.field2565 = this.field2737[var4];
         this.method4271(var4);
         this.field2738[var4] = this.field2743.field2565;
      }

   }
}

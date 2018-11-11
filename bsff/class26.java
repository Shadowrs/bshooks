public class class26 implements class43 {
   int field374;
   int field370;
   int field365;
   int field362;
   int field373;
   int field367;
   int field361;
   int field368;
   int field366;
   int field369;
   int field372;
   int field371;
   int field364;
   int field376;

   public boolean vmethod758(int var1, int var2, short var3) {
      return var1 >= (this.field365 << 6) + (this.field374 << 3) && var1 <= (this.field365 << 6) + (this.field373 << 3) + 7 && var2 >= (this.field366 << 6) + (this.field368 << 3) && var2 <= (this.field366 << 6) + (this.field372 << 3) + 7;
   }

   public boolean vmethod753(int var1, int var2, int var3, int var4) {
      return var1 >= this.field370 && var1 < this.field362 + this.field370 ? var2 >= (this.field361 << 6) + (this.field367 << 3) && var2 <= (this.field361 << 6) + (this.field369 << 3) + 7 && var3 >= (this.field364 << 6) + (this.field371 << 3) && var3 <= (this.field364 << 6) + (this.field376 << 3) + 7 : false;
   }

   public void vmethod751(class32 var1, int var2) {
      if (var1.field433 > this.field365) {
         var1.field433 = this.field365;
      }

      if (var1.field431 < this.field365) {
         var1.field431 = this.field365;
      }

      if (var1.field434 > this.field366) {
         var1.field434 = this.field366;
      }

      if (var1.field436 < this.field366) {
         var1.field436 = this.field366;
      }

   }

   public class238 vmethod777(int var1, int var2, byte var3) {
      if (!this.vmethod758(var1, var2, (short)7683)) {
         return null;
      } else {
         int var4 = this.field361 * 64 - this.field365 * 64 + (this.field367 * 8 - this.field374 * 8) + var1;
         int var5 = this.field364 * 64 - this.field366 * 64 + var2 + (this.field371 * 8 - this.field368 * 8);
         return new class238(this.field370, var4, var5);
      }
   }

   public int[] vmethod754(int var1, int var2, int var3, int var4) {
      if (!this.vmethod753(var1, var2, var3, -63898520)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field365 * 64 - this.field361 * 64 + var2 + (this.field374 * 8 - this.field367 * 8), var3 + (this.field366 * 64 - this.field364 * 64) + (this.field368 * 8 - this.field371 * 8)};
         return var5;
      }
   }

   public void vmethod756(class194 var1, int var2) {
      this.field370 = var1.getUByte(-1848434122);
      this.field362 = var1.getUByte(-2136309815);
      this.field361 = var1.getUShort(-1208216487);
      this.field367 = var1.getUByte(-769465500);
      this.field369 = var1.getUByte(824250864);
      this.field364 = var1.getUShort(-1208216487);
      this.field371 = var1.getUByte(-1256532330);
      this.field376 = var1.getUByte(303312248);
      this.field365 = var1.getUShort(-1208216487);
      this.field374 = var1.getUByte(165617464);
      this.field373 = var1.getUByte(1522966833);
      this.field366 = var1.getUShort(-1208216487);
      this.field368 = var1.getUByte(-143492433);
      this.field372 = var1.getUByte(-1021557694);
      this.method209((byte)78);
   }

   void method209(byte var1) {
   }
}

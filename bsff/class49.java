public class class49 implements class43 {
   static class168 field579;
   static int field578;
   static int field589;
   int field587;
   int field586;
   int field582;
   int field580;
   int field585;
   int field588;
   int field590;
   int field584;
   int field581;
   int field583;

   public boolean vmethod758(int var1, int var2, short var3) {
      return var1 >= (this.field582 << 6) + (this.field586 << 3) && var1 <= (this.field582 << 6) + (this.field586 << 3) + 7 && var2 >= (this.field590 << 6) + (this.field584 << 3) && var2 <= (this.field590 << 6) + (this.field584 << 3) + 7;
   }

   public boolean vmethod753(int var1, int var2, int var3, int var4) {
      return var1 >= this.field587 && var1 < this.field587 + this.field580 ? var2 >= (this.field585 << 6) + (this.field588 << 3) && var2 <= (this.field585 << 6) + (this.field588 << 3) + 7 && var3 >= (this.field581 << 6) + (this.field583 << 3) && var3 <= (this.field581 << 6) + (this.field583 << 3) + 7 : false;
   }

   public void vmethod751(class32 var1, int var2) {
      if (var1.field433 > this.field582) {
         var1.field433 = this.field582;
      }

      if (var1.field431 < this.field582) {
         var1.field431 = this.field582;
      }

      if (var1.field434 > this.field590) {
         var1.field434 = this.field590;
      }

      if (var1.field436 < this.field590) {
         var1.field436 = this.field590;
      }

   }

   public class238 vmethod777(int var1, int var2, byte var3) {
      if (!this.vmethod758(var1, var2, (short)24394)) {
         return null;
      } else {
         int var4 = this.field585 * 64 - this.field582 * 64 + (this.field588 * 8 - this.field586 * 8) + var1;
         int var5 = this.field581 * 64 - this.field590 * 64 + var2 + (this.field583 * 8 - this.field584 * 8);
         return new class238(this.field587, var4, var5);
      }
   }

   public int[] vmethod754(int var1, int var2, int var3, int var4) {
      if (!this.vmethod753(var1, var2, var3, 1996549590)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field582 * 64 - this.field585 * 64 + var2 + (this.field586 * 8 - this.field588 * 8), var3 + (this.field590 * 64 - this.field581 * 64) + (this.field584 * 8 - this.field583 * 8)};
         return var5;
      }
   }

   public void vmethod756(class194 var1, int var2) {
      this.field587 = var1.getUByte(879820507);
      this.field580 = var1.getUByte(94401125);
      this.field585 = var1.getUShort(-1208216487);
      this.field588 = var1.getUByte(310732447);
      this.field581 = var1.getUShort(-1208216487);
      this.field583 = var1.getUByte(-446675964);
      this.field582 = var1.getUShort(-1208216487);
      this.field586 = var1.getUByte(-835132055);
      this.field590 = var1.getUShort(-1208216487);
      this.field584 = var1.getUByte(-704691625);
      this.method757(-854639313);
   }

   void method757(int var1) {
   }

   static final void method778(String var0, int var1) {
      class47.method743(var0 + " is already on your ignore list", 144382401);
   }
}

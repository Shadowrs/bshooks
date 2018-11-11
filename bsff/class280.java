public class class280 extends class218 {
   public static class212 field3556 = new class212(64);
   public static class261 field3553;
   public int field3561 = 0;
   public String field3558 = "null";
   public char field3554;
   public char field3555;
   public int field3557;
   public int[] field3559;
   public String[] field3552;
   public int[] field3560;

   void method4953(class194 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3554 = (char)var1.getUByte(-659998993);
      } else if (var2 == 2) {
         this.field3555 = (char)var1.getUByte(1100379850);
      } else if (var2 == 3) {
         this.field3558 = var1.getString1(-778927800);
      } else if (var2 == 4) {
         this.field3557 = var1.getInt(-1817376731);
      } else {
         int var4;
         if (var2 == 5) {
            this.field3561 = var1.getUShort(-1208216487);
            this.field3559 = new int[this.field3561];
            this.field3552 = new String[this.field3561];

            for(var4 = 0; var4 < this.field3561; ++var4) {
               this.field3559[var4] = var1.getInt(-1817376731);
               this.field3552[var4] = var1.getString1(-778927800);
            }
         } else if (var2 == 6) {
            this.field3561 = var1.getUShort(-1208216487);
            this.field3559 = new int[this.field3561];
            this.field3560 = new int[this.field3561];

            for(var4 = 0; var4 < this.field3561; ++var4) {
               this.field3559[var4] = var1.getInt(-1817376731);
               this.field3560[var4] = var1.getInt(-1817376731);
            }
         }
      }

   }

   public int method4949(int var1) {
      return this.field3561;
   }

   public void method4954(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(-1295772775);
         if (var3 == 0) {
            return;
         }

         this.method4953(var1, var3, 1608594237);
      }
   }
}

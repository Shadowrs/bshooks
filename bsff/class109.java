public class class109 implements Runnable {
   static int field1582;
   volatile class107[] field1583 = new class107[2];

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class107 var2 = this.field1583[var1];
            if (var2 != null) {
               var2.method2222(-117231693);
            }
         }
      } catch (Exception var3) {
         class148.method3113((String)null, var3, (byte)-48);
      }

   }

   public static void method2259(class261 var0, byte var1) {
      class277.field3537 = var0;
   }

   static final int method2260(int var0, int var1, int var2) {
      int var3 = var0 + var1 * 57;
      var3 ^= var3 << 13;
      int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }
}

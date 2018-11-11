public class class142 extends class218 {
   static class261 field2061;
   static int field2064;
   class129[] field2063;

   public class142(class261 var1, class261 var2, int var3, boolean var4) {
      class217 var5 = new class217();
      int var6 = var1.method4563(var3, 131017490);
      this.field2063 = new class129[var6];
      int[] var7 = var1.method4562(var3, 475737651);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method4551(var3, var7[var8], 1495799733);
         class136 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class136 var12 = (class136)var5.method4027(); var12 != null; var12 = (class136)var5.method4026()) {
            if (var11 == var12.field1969) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13 = var2.method4559(var11, 0, (byte)-69);
            var10 = new class136(var11, var13);
            var5.method4020(var10);
         }

         this.field2063[var7[var8]] = new class129(var9, var10);
      }

   }

   public boolean method3079(int var1, int var2) {
      return this.field2063[var1].field1815;
   }

   static void method3082(class263 var0, int var1, int var2, int var3, byte var4, boolean var5, byte var6) {
      long var7 = (long)((var1 << 16) + var2);
      class260 var9 = (class260)class264.field3406.method3981(var7);
      if (var9 == null) {
         var9 = (class260)class264.field3408.method3981(var7);
         if (var9 == null) {
            var9 = (class260)class264.field3421.method3981(var7);
            if (var9 != null) {
               if (var5) {
                  var9.method4051();
                  class264.field3406.method3972(var9, var7);
                  --class264.field3409;
                  ++class264.field3404;
               }
            } else {
               if (!var5) {
                  var9 = (class260)class264.field3407.method3981(var7);
                  if (var9 != null) {
                     return;
                  }
               }

               var9 = new class260();
               var9.field3362 = var0;
               var9.field3361 = var3;
               var9.field3363 = var4;
               if (var5) {
                  class264.field3406.method3972(var9, var7);
                  ++class264.field3404;
               } else {
                  class264.field3411.method3891(var9);
                  class264.field3421.method3972(var9, var7);
                  ++class264.field3409;
               }
            }
         }
      }

   }
}

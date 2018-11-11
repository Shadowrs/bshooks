public class class304 extends class299 {
   static class330 field3848;
   public class220 field3847 = new class220();
   int field3846 = 1;
   class335 field3845;

   public class304(class335 var1) {
      super(400);
      this.field3845 = var1;
   }

   public void method5420(class194 var1, int var2, int var3) {
      while(true) {
         if (var1.field2565 < var2) {
            boolean var4 = var1.getUByte(-1928912088) == 1;
            class305 var5 = new class305(var1.getString1(-778927800), this.field3845);
            class305 var6 = new class305(var1.getString1(-778927800), this.field3845);
            int var7 = var1.getUShort(-1208216487);
            int var8 = var1.getUByte(-1463043292);
            int var9 = var1.getUByte(-75799703);
            boolean var10 = (var9 & 2) != 0;
            boolean var11 = (var9 & 1) != 0;
            if (var7 > 0) {
               var1.getString1(-778927800);
               var1.getUByte(-28580434);
               var1.getInt(-1817376731);
            }

            var1.getString1(-778927800);
            if (var5 != null && var5.method5450((byte)0)) {
               class306 var12 = (class306)this.method5319(var5, 689405551);
               if (var4) {
                  class306 var13 = (class306)this.method5319(var6, 1576677091);
                  if (var13 != null) {
                     if (var12 != null) {
                        this.method5321(var13, -1759523016);
                     } else {
                        var12 = var13;
                     }
                  }
               }

               if (var12 != null) {
                  this.method5326(var12, var5, var6, 1066099262);
                  if (var7 != var12.field3840) {
                     boolean var15 = true;

                     for(class308 var14 = (class308)this.field3847.method4061(); var14 != null; var14 = (class308)this.field3847.method4062()) {
                        if (var14.field3865.equals(var5)) {
                           if (var7 != 0 && var14.field3866 == 0) {
                              var14.method4069();
                              var15 = false;
                           } else if (var7 == 0 && var14.field3866 != 0) {
                              var14.method4069();
                              var15 = false;
                           }
                        }
                     }

                     if (var15) {
                        this.field3847.method4067(new class308(var5, var7));
                     }
                  }
               } else {
                  if (this.method5314(968751458) >= 400) {
                     continue;
                  }

                  var12 = (class306)this.method5323(var5, var6, (byte)34);
               }

               if (var7 != var12.field3840) {
                  var12.field3839 = ++this.field3846 - 1;
                  if (var12.field3840 == -1 && var7 == 0) {
                     var12.field3839 = -(var12.field3839 * 1320922141) * 806385205;
                  }

                  var12.field3840 = var7;
               }

               var12.field3838 = var8;
               var12.field3854 = var10;
               var12.field3855 = var11;
               continue;
            }
         }

         this.method5333((byte)-8);
         return;
      }
   }

   class296 vmethod5462(int var1) {
      return new class306();
   }

   public boolean method5415(class305 var1, boolean var2, int var3) {
      class306 var4 = (class306)this.method5317(var1, -1671660530);
      return var4 == null ? false : !var2 || var4.field3840 != 0;
   }

   class296[] vmethod5463(int var1, int var2) {
      return new class306[var1];
   }

   public static int method5427(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = 0; var4 < var1; ++var4) {
         var3 = var3 >>> 8 ^ class194.field2567[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }
}

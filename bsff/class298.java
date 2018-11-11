public class class298 extends class299 {
   class335 field3829;

   public class298(class335 var1) {
      super(400);
      this.field3829 = var1;
   }

   class296 vmethod5462(int var1) {
      return new class300();
   }

   class296[] vmethod5463(int var1, int var2) {
      return new class300[var1];
   }

   public void method5310(class194 var1, int var2, byte var3) {
      while(true) {
         if (var1.field2565 < var2) {
            int var4 = var1.getUByte(-894052017);
            boolean var5 = (var4 & 1) == 1;
            class305 var6 = new class305(var1.getString1(-778927800), this.field3829);
            class305 var7 = new class305(var1.getString1(-778927800), this.field3829);
            var1.getString1(-778927800);
            if (var6 != null && var6.method5450((byte)0)) {
               class300 var8 = (class300)this.method5319(var6, 1565981457);
               if (var5) {
                  class300 var9 = (class300)this.method5319(var7, 35807970);
                  if (var9 != null) {
                     if (var8 != null) {
                        this.method5321(var9, -2023066402);
                     } else {
                        var8 = var9;
                     }
                  }
               }

               if (var8 != null) {
                  this.method5326(var8, var6, var7, -1981507025);
                  continue;
               }

               if (this.method5314(-1726610153) < 400) {
                  int var10 = this.method5314(-75294191);
                  var8 = (class300)this.method5323(var6, var7, (byte)9);
                  var8.field3837 = var10;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }
}

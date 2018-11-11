public class class110 {
   static int field1590;
   class261 field1585;
   class261 field1586;
   class214 field1588 = new class214(256);
   class214 field1587 = new class214(256);

   public class110(class261 var1, class261 var2) {
      this.field1586 = var1;
      this.field1585 = var2;
   }

   class105 method2261(int var1, int var2, int[] var3, int var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5;
      class105 var8 = (class105)this.field1588.method3981(var6);
      if (var8 != null) {
         return var8;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class103 var9 = class103.method2121(this.field1586, var1, var2);
         if (var9 == null) {
            return null;
         } else {
            var8 = var9.method2115();
            this.field1588.method3972(var8, var6);
            if (var3 != null) {
               var3[0] -= var8.field1535.length;
            }

            return var8;
         }
      }
   }

   class105 method2263(int var1, int var2, int[] var3, int var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      class105 var8 = (class105)this.field1588.method3981(var6);
      if (var8 != null) {
         return var8;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class104 var9 = (class104)this.field1587.method3981(var6);
         if (var9 == null) {
            var9 = class104.method2135(this.field1585, var1, var2);
            if (var9 == null) {
               return null;
            }

            this.field1587.method3972(var9, var6);
         }

         var8 = var9.method2152(var3);
         if (var8 == null) {
            return null;
         } else {
            var9.method4014();
            this.field1588.method3972(var8, var6);
            return var8;
         }
      }
   }

   public class105 method2264(int var1, int[] var2, int var3) {
      if (this.field1586.method4565(-1388553551) == 1) {
         return this.method2261(0, var1, var2, -2086664220);
      } else if (this.field1586.method4563(var1, -108854728) == 1) {
         return this.method2261(var1, 0, var2, -686408916);
      } else {
         throw new RuntimeException();
      }
   }

   public class105 method2268(int var1, int[] var2, int var3) {
      if (this.field1585.method4565(1144031) == 1) {
         return this.method2263(0, var1, var2, -452702840);
      } else if (this.field1585.method4563(var1, 179078651) == 1) {
         return this.method2263(var1, 0, var2, 70848397);
      } else {
         throw new RuntimeException();
      }
   }

   public static boolean method2262(int var0, int var1) {
      return var0 >= class247.field2982.field2996 && var0 <= class247.field2976.field2996 || var0 == class247.field2977.field2996;
   }
}

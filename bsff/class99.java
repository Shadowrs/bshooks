import java.io.IOException;

public class class99 {
   static int field1474;
   class169 field1486;
   class215 field1472 = new class215();
   class201 field1476 = new class201(40000);
   int field1483 = 0;
   class194 field1484 = new class194(5000);
   class180 field1477 = null;
   boolean field1479 = true;
   int field1478 = 0;
   class180 field1473;
   class180 field1471;
   public class202 field1475;
   int field1480 = 0;
   int field1481 = 0;
   class180 field1485;

   class169 method2052(int var1) {
      return this.field1486;
   }

   void method2037(byte var1) {
      if (this.field1486 != null) {
         this.field1486.vmethod3325(-2038041329);
         this.field1486 = null;
      }

   }

   void method2038(short var1) {
      this.field1486 = null;
   }

   final void method2033(int var1) {
      this.field1472.method3983();
      this.field1483 = 0;
   }

   public final void method2036(class184 var1, byte var2) {
      this.field1472.method3984(var1);
      var1.field2494 = var1.field2500.field2565;
      var1.field2500.field2565 = 0;
      this.field1483 += var1.field2494;
   }

   final void method2035(int var1) throws IOException {
      if (this.field1486 != null && this.field1483 > 0) {
         this.field1484.field2565 = 0;

         while(true) {
            class184 var2 = (class184)this.field1472.method3988();
            if (var2 == null || var2.field2494 > this.field1484.field2566.length - this.field1484.field2565) {
               this.field1486.vmethod3320(this.field1484.field2566, 0, this.field1484.field2565, -1130563356);
               this.field1481 = 0;
               break;
            }

            this.field1484.addBytes(var2.field2500.field2566, 0, var2.field2494, (byte)-26);
            this.field1483 -= var2.field2494;
            var2.method4014();
            var2.field2500.method3502(-891684981);
            var2.method3431(-353960817);
         }
      }

   }

   void method2043(class169 var1, int var2) {
      this.field1486 = var1;
   }

   static class242 method2045(class242 var0, byte var1) {
      int var2 = class271.method4791(class45.method662(var0, 2047311190), 2131160825);
      if (var2 == 0) {
         return null;
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = class3.method2(var0.field2885, 2117172679);
            if (var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }
}

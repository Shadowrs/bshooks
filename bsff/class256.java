public class class256 implements class200 {
   static class256 field3336 = new class256(0, -1, true, false, true);
   static class256 field3328 = new class256(1, 0, true, true, true);
   static class256 field3330 = new class256(2, 1, true, true, false);
   static class256 field3337 = new class256(3, 2, false, false, true);
   static class256 field3331 = new class256(4, 3, false, false, true);
   static class256 field3332 = new class256(5, 10, false, false, true);
   int field3333;
   public int field3334;
   public boolean field3335;
   public boolean field3327;

   class256(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.field3333 = var1;
      this.field3334 = var2;
      this.field3335 = var4;
      this.field3327 = var5;
   }

   public int vmethod5837(int var1) {
      return this.field3333;
   }

   static class266[] method4534(int var0) {
      return new class266[]{class266.field3435, class266.field3434, class266.field3432};
   }

   static void method4535(byte var0) {
      class184 var1 = class141.method3078(class181.field2407, client.field902.field1475, (byte)-94);
      class201 var2 = var1.field2500;
      int var3 = client.field1069 ? 2 : 1;
      var2.addByte(var3, (byte)-5);
      var1.field2500.addShort(class287.field3765, 1293755936);
      var1.field2500.addShort(class45.field553, 550507139);
      client.field902.method2036(var1, (byte)67);
   }

   static void method4531(int var0, int var1, int var2, int var3) {
      if (client.field1091 != 0 && var1 != 0 && client.field1093 < 50) {
         client.field885[client.field1093] = var0;
         client.field919[client.field1093] = var1;
         client.field1096[client.field1093] = var2;
         client.field1098[client.field1093] = null;
         client.field1097[client.field1093] = 0;
         ++client.field1093;
      }

   }
}

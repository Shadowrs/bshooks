public class class16 {
   public static class235 field292;
   byte field285;
   public int field286;
   public int field290;
   public int field284;
   public int field287;
   public int field283;

   public class16() {
   }

   public class16(class194 var1, boolean var2) {
      this.field285 = var1.getByte(-1481574242);
      this.field284 = var1.getUShort(-1208216487);
      this.field290 = var1.getInt(-1817376731);
      this.field286 = var1.getInt(-1817376731);
      this.field287 = var1.getInt(-1817376731);
      this.field283 = var1.getInt(-1817376731);
   }

   void method114(int var1, byte var2) {
      this.field285 &= -8;
      this.field285 = (byte)(this.field285 | var1 & 7);
   }

   void method115(int var1, int var2) {
      this.field285 &= -9;
      if (var1 == 1) {
         this.field285 = (byte)(this.field285 | 8);
      }

   }

   public int method113(byte var1) {
      return (this.field285 & 8) == 8 ? 1 : 0;
   }

   public int method112(int var1) {
      return this.field285 & 7;
   }

   static void method124(byte var0) {
      class45.method670(-1248179694);
      client.field997[0] = "Cancel";
      client.field998[0] = "";
      client.field871[0] = 1006;
      client.field999[0] = false;
      client.field992 = 1;
   }

   public static void method125(int var0, int var1, int var2, boolean var3, int var4) {
      class184 var5 = class141.method3078(class181.field2373, client.field902.field1475, (byte)-126);
      var5.field2500.addIntLE(var3 ? client.field1009 : 0, (byte)0);
      var5.field2500.addByte128(var2, (byte)-6);
      var5.field2500.addShort128(var1, 364154480);
      var5.field2500.addShort128(var0, -1725810617);
      client.field902.method2036(var5, (byte)95);
   }
}

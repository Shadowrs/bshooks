public class class276 {
   static final void method4884(class242 var0, int var1, int var2, byte var3) {
      if ((client.field1087 == 0 || client.field1087 == 3) && (class60.field708 == 1 || !class32.field440 && class60.field708 == 4)) {
         class236 var4 = var0.method4475(true, (byte)7);
         if (var4 == null) {
            return;
         }

         int var5 = class60.field711 - var1;
         int var6 = class60.field710 - var2;
         if (var4.method4374(var5, var6, -411649183)) {
            var5 -= var4.field2765 / 2;
            var6 -= var4.field2763 / 2;
            int var7 = client.field925 & 2047;
            int var8 = class134.field1955[var7];
            int var9 = class134.field1933[var7];
            int var10 = var9 * var5 + var6 * var8 >> 11;
            int var11 = var6 * var9 - var8 * var5 >> 11;
            int var12 = var10 + class12.field259.field1185 >> 7;
            int var13 = class12.field259.field1209 - var11 >> 7;
            class184 var14 = class141.method3078(class181.field2385, client.field902.field1475, (byte)-28);
            var14.field2500.addByte(18, (byte)-113);
            var14.field2500.add128Byte(class51.field607[82] ? (class51.field607[81] ? 2 : 1) : 0, -1163835774);
            var14.field2500.addShort(var13 + class4.field28, 1010139294);
            var14.field2500.addShortLE128(var12 + class184.field2498, (byte)32);
            var14.field2500.addByte(var5, (byte)-73);
            var14.field2500.addByte(var6, (byte)-15);
            var14.field2500.addShort(client.field925, 569649053);
            var14.field2500.addByte(57, (byte)-53);
            var14.field2500.addByte(0, (byte)-85);
            var14.field2500.addByte(0, (byte)-8);
            var14.field2500.addByte(89, (byte)-97);
            var14.field2500.addShort(class12.field259.field1185, -289355007);
            var14.field2500.addShort(class12.field259.field1209, 2025220473);
            var14.field2500.addByte(63, (byte)-90);
            client.field902.method2036(var14, (byte)89);
            client.field1085 = var12;
            client.field1005 = var13;
         }
      }

   }
}

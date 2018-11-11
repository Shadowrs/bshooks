public final class class10 extends class9 {
   static int field249;
   static int field241;
   int field242;
   int field244;
   int field245;
   int field250;
   int field243;
   int field246;
   int field247;

   class10(class131 var1, int var2, int var3, int var4, int var5) {
      this.field242 = var2 + var1.field1873 - var1.field1876;
      this.field245 = var3 + var1.field1874 - var1.field1877;
      this.field243 = var4 + var1.field1875 - var1.field1878;
      this.field244 = var2 + var1.field1876 + var1.field1873;
      this.field250 = var3 + var1.field1877 + var1.field1874;
      this.field246 = var4 + var1.field1878 + var1.field1875;
      this.field247 = var5;
   }

   final void vmethod63(int var1) {
      for(int var2 = 0; var2 < 8; ++var2) {
         int var3 = (var2 & 1) == 0 ? this.field242 : this.field244;
         int var4 = (var2 & 2) == 0 ? this.field245 : this.field250;
         int var5 = (var2 & 4) == 0 ? this.field243 : this.field246;
         if ((var2 & 1) == 0) {
            class167.method3256(var3, var4, var5, this.field244, var4, var5, this.field247, -787694628);
         }

         if ((var2 & 2) == 0) {
            class167.method3256(var3, var4, var5, var3, this.field250, var5, this.field247, -787694628);
         }

         if ((var2 & 4) == 0) {
            class167.method3256(var3, var4, var5, var3, var4, this.field246, this.field247, -787694628);
         }
      }

   }

   static void method62(byte var0) {
      for(int var1 = 0; var1 < client.field992; ++var1) {
         if (class133.method2790(client.field871[var1], (byte)-2)) {
            if (var1 < client.field992 - 1) {
               for(int var2 = var1; var2 < client.field992 - 1; ++var2) {
                  client.field997[var2] = client.field997[var2 + 1];
                  client.field998[var2] = client.field998[var2 + 1];
                  client.field871[var2] = client.field871[var2 + 1];
                  client.field996[var2] = client.field996[var2 + 1];
                  client.field993[var2] = client.field993[var2 + 1];
                  client.field994[var2] = client.field994[var2 + 1];
                  client.field999[var2] = client.field999[var2 + 1];
               }
            }

            --client.field992;
         }
      }

   }
}

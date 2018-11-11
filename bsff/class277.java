public class class277 extends class218 {
   static class212 field3536 = new class212(64);
   static class261 field3537;
   public int field3535;
   public int field3538;
   public int field3539;

   void method4898(class194 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3535 = var1.getUShort(-1208216487);
         this.field3538 = var1.getUByte(-364254731);
         this.field3539 = var1.getUByte(-752966475);
      }

   }

   void method4886(class194 var1, byte var2) {
      while(true) {
         int var3 = var1.getUByte(-1411763816);
         if (var3 == 0) {
            return;
         }

         this.method4898(var1, var3, 561727843);
      }
   }

   static void method4902(byte[] var0, int var1) {
      class194 var2 = new class194(var0);
      var2.field2565 = var0.length - 2;
      class12.field263 = var2.getUShort(-1208216487);
      class54.field633 = new int[class12.field263];
      class332.field3990 = new int[class12.field263];
      class25.field358 = new int[class12.field263];
      class332.field3989 = new int[class12.field263];
      class332.field3993 = new byte[class12.field263][];
      var2.field2565 = var0.length - 7 - class12.field263 * 8;
      class332.field3991 = var2.getUShort(-1208216487);
      class81.field1280 = var2.getUShort(-1208216487);
      int var3 = (var2.getUByte(1537046744) & 255) + 1;

      int var4;
      for(var4 = 0; var4 < class12.field263; ++var4) {
         class54.field633[var4] = var2.getUShort(-1208216487);
      }

      for(var4 = 0; var4 < class12.field263; ++var4) {
         class332.field3990[var4] = var2.getUShort(-1208216487);
      }

      for(var4 = 0; var4 < class12.field263; ++var4) {
         class25.field358[var4] = var2.getUShort(-1208216487);
      }

      for(var4 = 0; var4 < class12.field263; ++var4) {
         class332.field3989[var4] = var2.getUShort(-1208216487);
      }

      var2.field2565 = var0.length - 7 - class12.field263 * 8 - (var3 - 1) * 3;
      class332.field3992 = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         class332.field3992[var4] = var2.get24Int((byte)49);
         if (class332.field3992[var4] == 0) {
            class332.field3992[var4] = 1;
         }
      }

      var2.field2565 = 0;

      for(var4 = 0; var4 < class12.field263; ++var4) {
         int var5 = class25.field358[var4];
         int var6 = class332.field3989[var4];
         int var7 = var6 * var5;
         byte[] var8 = new byte[var7];
         class332.field3993[var4] = var8;
         int var9 = var2.getUByte(-1373448646);
         int var10;
         if (var9 == 0) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.getByte(-806694313);
            }
         } else if (var9 == 1) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var10 + var11 * var5] = var2.getByte(-582110248);
               }
            }
         }
      }

   }
}

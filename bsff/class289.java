public class class289 {
   static final void method5205(class74 var0, int var1) {
      int var2 = 0;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var0.field1135 == 0) {
         var2 = class308.field3867.method2987(var0.field1139, var0.field1148, var0.field1140);
      }

      if (var0.field1135 == 1) {
         var2 = class308.field3867.method2903(var0.field1139, var0.field1148, var0.field1140);
      }

      if (var0.field1135 == 2) {
         var2 = class308.field3867.method2904(var0.field1139, var0.field1148, var0.field1140);
      }

      if (var0.field1135 == 3) {
         var2 = class308.field3867.method2905(var0.field1139, var0.field1148, var0.field1140);
      }

      if (var2 != 0) {
         int var6 = class308.field3867.method3041(var0.field1139, var0.field1148, var0.field1140, var2);
         var3 = var2 >> 14 & 32767;
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.field1137 = var3;
      var0.field1134 = var4;
      var0.field1138 = var5;
   }
}

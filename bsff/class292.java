public class class292 {
   static void method5207(class242 var0, int var1, int var2, byte var3) {
      if (var0.field2819 == 0) {
         var0.field2947 = var0.field2823;
      } else if (var0.field2819 == 1) {
         var0.field2947 = var0.field2823 + (var1 - var0.field2826) / 2;
      } else if (var0.field2819 == 2) {
         var0.field2947 = var1 - var0.field2826 - var0.field2823;
      } else if (var0.field2819 == 3) {
         var0.field2947 = var0.field2823 * var1 >> 14;
      } else if (var0.field2819 == 4) {
         var0.field2947 = (var1 - var0.field2826) / 2 + (var0.field2823 * var1 >> 14);
      } else {
         var0.field2947 = var1 - var0.field2826 - (var0.field2823 * var1 >> 14);
      }

      if (var0.field2820 == 0) {
         var0.field2828 = var0.field2803;
      } else if (var0.field2820 == 1) {
         var0.field2828 = (var2 - var0.field2887) / 2 + var0.field2803;
      } else if (var0.field2820 == 2) {
         var0.field2828 = var2 - var0.field2887 - var0.field2803;
      } else if (var0.field2820 == 3) {
         var0.field2828 = var2 * var0.field2803 >> 14;
      } else if (var0.field2820 == 4) {
         var0.field2828 = (var2 - var0.field2887) / 2 + (var2 * var0.field2803 >> 14);
      } else {
         var0.field2828 = var2 - var0.field2887 - (var2 * var0.field2803 >> 14);
      }

   }
}

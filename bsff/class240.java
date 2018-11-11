public class class240 {
   public static short[] field2793 = new short[]{6798, 8741, 25238, 4626, 4550};
   public static short[][] field2795 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -1, -1, -1, -1, 968, 9191, -16422, 20323}};
   public static short[] field2794 = new short[]{-10304, 9104, -1, -1, -1};
   public static short[][] field2792 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};

   static final void method4441(int var0) {
      class47.method743("You can't add yourself to your own friend list", 751364761);
   }

   static final boolean method4437(class242 var0, byte var1) {
      int var2 = var0.field2818;
      if (var2 == 205) {
         client.field903 = 250;
         return true;
      } else {
         int var3;
         int var4;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            client.field1118.method4409(var3, var4 == 1, (byte)124);
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            client.field1118.method4410(var3, var4 == 1, (byte)4);
         }

         if (var2 == 324) {
            client.field1118.method4411(false, (byte)-33);
         }

         if (var2 == 325) {
            client.field1118.method4411(true, (byte)-82);
         }

         if (var2 == 326) {
            class184 var5 = class141.method3078(class181.field2463, client.field902.field1475, (byte)-127);
            client.field1118.method4412(var5.field2500, (byte)1);
            client.field902.method2036(var5, (byte)121);
            return true;
         } else {
            return false;
         }
      }
   }
}

public final class class146 {
   int field2104;
   public int field2110 = 0;
   int field2101;
   int field2111 = 0;
   int field2102;
   int field2107;
   int field2105;
   int field2100;
   int field2103;
   int field2099;
   public class139 field2109;
   int field2106;
   int field2098;
   int field2108;

   public static class283 method3099(int var0, byte var1) {
      class283 var2 = (class283)class283.field3639.method3929((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class156.field2142.method4551(10, var0, -795917506);
         var2 = new class283();
         var2.field3642 = var0;
         if (var3 != null) {
            var2.method5102(new class194(var3), 16711680);
         }

         var2.method5054(-2098822871);
         if (var2.field3676 != -1) {
            var2.method5053(method3099(var2.field3676, (byte)124), method3099(var2.field3684, (byte)30), (short)9846);
         }

         if (var2.field3650 != -1) {
            var2.method5058(method3099(var2.field3650, (byte)43), method3099(var2.field3685, (byte)93), -1370035097);
         }

         if (var2.field3636 != -1) {
            var2.method5059(method3099(var2.field3636, (byte)82), method3099(var2.field3687, (byte)87), 335647948);
         }

         if (!class154.field2134 && var2.field3657) {
            var2.field3644 = "Members object";
            var2.field3651 = false;
            var2.field3674 = null;
            var2.field3659 = null;
            var2.field3660 = -1;
            var2.field3682 = 0;
            if (var2.field3683 != null) {
               boolean var4 = false;

               for(class216 var5 = var2.field3683.method3910(); var5 != null; var5 = var2.field3683.method3901()) {
                  class278 var6 = client.method1577((int)var5.field2644, (byte)-37);
                  if (var6.field3547) {
                     var5.method4014();
                  } else {
                     var4 = true;
                  }
               }

               if (!var4) {
                  var2.field3683 = null;
               }
            }
         }

         class283.field3639.method3932(var2, (long)var0);
         return var2;
      }
   }

   static int method3098(int var0, int var1) {
      class70 var2 = (class70)class95.field1432.method3907((long)var0);
      return var2 == null ? -1 : (var2.field2649 == class95.field1434.field2666 ? -1 : ((class70)var2.field2649).field811);
   }
}

public class class195 {
   static int field2572 = 0;
   static int field2577 = 0;
   static int field2574 = 0;
   static byte[][] field2575 = new byte[1000][];
   public static byte[][][] field2578;
   static byte[][] field2576 = new byte[250][];
   static byte[][] field2573 = new byte[50][];

   static synchronized byte[] method3742(int var0, boolean var1, byte var2) {
      byte[] var3;
      if (var0 != 100) {
         if (var0 < 100) {
            ;
         }
      } else if (field2572 > 0) {
         var3 = field2575[--field2572];
         field2575[field2572] = null;
         return var3;
      }

      if (var0 != 5000) {
         if (var0 < 5000) {
            ;
         }
      } else if (field2577 > 0) {
         var3 = field2576[--field2577];
         field2576[field2577] = null;
         return var3;
      }

      if (var0 != 30000) {
         if (var0 < 30000) {
            ;
         }
      } else if (field2574 > 0) {
         var3 = field2573[--field2574];
         field2573[field2574] = null;
         return var3;
      }

      if (field2578 != null) {
         for(int var4 = 0; var4 < class184.field2491.length; ++var4) {
            if (class184.field2491[var4] != var0) {
               if (var0 < class184.field2491[var4]) {
                  ;
               }
            } else if (class13.field265[var4] > 0) {
               byte[] var5 = field2578[var4][--class13.field265[var4]];
               field2578[var4][class13.field265[var4]] = null;
               return var5;
            }
         }
      }

      return new byte[var0];
   }

   static void method3750(int var0, int var1, byte var2) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if (class77.field1220[var6] != var0) {
            var3[var5] = class77.field1220[var6];
            var4[var5] = class77.field1224[var6];
            ++var5;
         }
      }

      class77.field1220 = var3;
      class77.field1224 = var4;
      class40.method574(class141.field2058, 0, class141.field2058.length - 1, class77.field1220, class77.field1224, (byte)-59);
   }
}

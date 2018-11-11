public class class262 implements Runnable {
   public static class217 field3387 = new class217();
   public static class217 field3385 = new class217();
   public static Object field3386 = new Object();
   public static int field3389 = 0;
   static Thread field3391;
   static boolean field3388;
   static boolean field3392;

   public void run() {
      try {
         while(true) {
            class217 var1 = field3387;
            class259 var2;
            synchronized(var1) {
               var2 = (class259)field3387.method4027();
            }

            Object var3;
            if (var2 != null) {
               if (var2.field3359 == 0) {
                  var2.field3358.method3345((int)var2.field2644, var2.field3356, var2.field3356.length, 278561773);
                  var1 = field3387;
                  synchronized(var1) {
                     var2.method4014();
                  }
               } else if (var2.field3359 == 1) {
                  var2.field3356 = var2.field3358.method3344((int)var2.field2644, 674251084);
                  var1 = field3387;
                  synchronized(var1) {
                     field3385.method4020(var2);
                  }
               }

               var3 = field3386;
               synchronized(var3) {
                  if (field3389 <= 1) {
                     field3389 = 0;
                     field3386.notifyAll();
                     return;
                  }

                  field3389 = 600;
               }
            } else {
               class163.method3223(100L);
               var3 = field3386;
               synchronized(var3) {
                  if (field3389 <= 1) {
                     field3389 = 0;
                     field3386.notifyAll();
                     return;
                  }

                  --field3389;
               }
            }
         }
      } catch (Exception var14) {
         class148.method3113((String)null, var14, (byte)-61);
      }
   }

   public static void method4660(int var0, int var1) {
      class229.field2680 = 1;
      class61.field714 = null;
      class229.field2682 = -1;
      class152.field2129 = -1;
      class94.field1431 = 0;
      class313.field3910 = false;
      class10.field249 = var0;
   }
}

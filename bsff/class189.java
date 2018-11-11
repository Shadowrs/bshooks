import java.io.IOException;
import java.util.HashMap;

public class class189 {
   public static class242[][] field2519;

   static void method3483(int var0, String var1, String var2, byte var3) {
      class251.method4521(var0, var1, var2, (String)null, 376803636);
   }

   public static void method3481(boolean var0, int var1) {
      if (class264.field3412 != null) {
         try {
            class194 var2 = new class194(4);
            var2.addByte(var0 ? 2 : 3, (byte)-122);
            var2.add24Int(0, (byte)83);
            class264.field3412.vmethod3320(var2.field2566, 0, 4, -1130563356);
         } catch (IOException var5) {
            try {
               class264.field3412.vmethod3325(-1792998238);
            } catch (Exception var4) {
               ;
            }

            ++class264.field3422;
            class264.field3412 = null;
         }
      }

   }

   static class330[] method3485(int var0) {
      class330[] var1 = new class330[class12.field263];

      for(int var2 = 0; var2 < class12.field263; ++var2) {
         class330 var3 = var1[var2] = new class330();
         var3.field3975 = class332.field3991;
         var3.field3970 = class81.field1280;
         var3.field3969 = class54.field633[var2];
         var3.field3976 = class332.field3990[var2];
         var3.field3971 = class25.field358[var2];
         var3.field3972 = class332.field3989[var2];
         var3.field3974 = class332.field3992;
         var3.field3973 = class332.field3993[var2];
      }

      class259.method4544(-2123541592);
      return var1;
   }

   static final int method3482(int var0, int var1, int var2, int var3) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var4;
   }

   static {
      new HashMap();
   }
}

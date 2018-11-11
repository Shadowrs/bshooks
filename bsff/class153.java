public class class153 extends class297 {
   boolean field2131;

   public class153(boolean var1) {
      this.field2131 = var1;
   }

   int method3151(class301 var1, class301 var2, int var3) {
      return var1.field3840 != 0 && var2.field3840 != 0 ? (this.field2131 ? var1.field3839 - var2.field3839 : var2.field3839 - var1.field3839) : this.method5288(var1, var2, -492196343);
   }

   public int compare(Object var1, Object var2) {
      return this.method3151((class301)var1, (class301)var2, -1176040343);
   }

   static void method3155(byte var0) {
      for(class80 var1 = (class80)class80.field1261.method4027(); var1 != null; var1 = (class80)class80.field1261.method4026()) {
         if (var1.field1252 != null) {
            var1.method1732(1469513726);
         }
      }

   }

   static final int method3156(int var0, int var1, int var2) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }
}

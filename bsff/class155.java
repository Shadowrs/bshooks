public class class155 extends class297 {
   boolean field2138;

   public class155(boolean var1) {
      this.field2138 = var1;
   }

   int method3165(class301 var1, class301 var2, byte var3) {
      return var2.field3840 != var1.field3840 ? (this.field2138 ? var1.field3840 - var2.field3840 : var2.field3840 - var1.field3840) : this.method5288(var1, var2, 2112610185);
   }

   public int compare(Object var1, Object var2) {
      return this.method3165((class301)var1, (class301)var2, (byte)15);
   }

   static String method3172(class209 var0, int var1, String var2, int var3) {
      if (var0 == null) {
         return var2;
      } else {
         class207 var4 = (class207)var0.method3907((long)var1);
         return var4 == null ? var2 : (String)var4.field2615;
      }
   }
}

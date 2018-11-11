public class class68 extends class216 {
   static class263 field790;
   class245 field789;
   Object[] field782;
   class242 field780;
   int field783;
   int field778;
   class242 field784;
   int field788;
   String field787;
   int field791;
   int field785;
   int field786;
   boolean field779;

   public class68() {
      this.field789 = class245.field2958;
   }

   public void method1102(Object[] var1, byte var2) {
      this.field782 = var1;
   }

   public void method1099(class245 var1, int var2) {
      this.field789 = var1;
   }

   public static class285 method1100(int var0, byte var1) {
      class285 var2 = (class285)class285.field3698.method3929((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class285.field3727.method4551(9, var0, 1508027270);
         var2 = new class285();
         var2.field3700 = var0;
         if (var3 != null) {
            var2.method5123(new class194(var3), 1008043309);
         }

         var2.method5122((byte)-77);
         class285.field3698.method3932(var2, (long)var0);
         return var2;
      }
   }

   public static class320 method1103(int var0, int var1) {
      class320[] var2 = new class320[]{class320.field3932, class320.field3931, class320.field3930};
      class320[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class320 var5 = var3[var4];
         if (var0 == var5.field3929) {
            return var5;
         }
      }

      return null;
   }
}

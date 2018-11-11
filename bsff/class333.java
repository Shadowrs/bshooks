public class class333 {
   boolean field4001 = false;
   int field3995 = 0;
   class261 field4000;
   String field3998;

   class333(class261 var1) {
      this.field4000 = var1;
   }

   int method5995(int var1) {
      if (this.field3995 < 25) {
         if (!this.field4000.method4637(class41.field514.field513, this.field3998, -645378985)) {
            return this.field3995;
         }

         this.field3995 = 25;
      }

      if (this.field3995 == 25) {
         if (!this.field4000.method4637(this.field3998, class41.field516.field513, 2096937468)) {
            return 25 + this.field4000.method4576(this.field3998, 1367646361) * 25 / 100;
         }

         this.field3995 = 50;
      }

      if (this.field3995 == 50) {
         if (this.field4000.method4571(class41.field517.field513, this.field3998, (byte)-59) && !this.field4000.method4637(class41.field517.field513, this.field3998, 1154554118)) {
            return 50;
         }

         this.field3995 = 75;
      }

      if (this.field3995 == 75) {
         if (!this.field4000.method4637(this.field3998, class41.field518.field513, 2134855453)) {
            return 75;
         }

         this.field3995 = 100;
         this.field4001 = true;
      }

      return this.field3995;
   }

   boolean method5999(int var1) {
      return this.field4001;
   }

   void method5994(String var1, int var2) {
      if (var1 != null && !var1.isEmpty() && var1 != this.field3998) {
         this.field3998 = var1;
         this.field3995 = 0;
         this.field4001 = false;
         this.method5995(40278320);
      }

   }

   int method5997(int var1) {
      return this.field3995;
   }
}

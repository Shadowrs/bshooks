public class class323 {
   public int field3939;
   public int field3938;
   public int field3936;
   public int field3937;

   public class323(int var1, int var2, int var3, int var4) {
      this.method5716(var1, var2, (byte)-17);
      this.method5694(var3, var4, -2118317902);
   }

   public class323(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   void method5697(class323 var1, class323 var2, byte var3) {
      var2.field3939 = this.field3939;
      var2.field3936 = this.field3936;
      if (this.field3939 < var1.field3939) {
         var2.field3936 -= var1.field3939 - this.field3939;
         var2.field3939 = var1.field3939;
      }

      if (var2.method5699(-648229316) > var1.method5699(1198844105)) {
         var2.field3936 -= var2.method5699(-1296832209) - var1.method5699(1132370928);
      }

      if (var2.field3936 < 0) {
         var2.field3936 = 0;
      }

   }

   public void method5716(int var1, int var2, byte var3) {
      this.field3939 = var1;
      this.field3938 = var2;
   }

   void method5692(class323 var1, class323 var2, int var3) {
      var2.field3938 = this.field3938;
      var2.field3937 = this.field3937;
      if (this.field3938 < var1.field3938) {
         var2.field3937 -= var1.field3938 - this.field3938;
         var2.field3938 = var1.field3938;
      }

      if (var2.method5708(1559885291) > var1.method5708(-662502445)) {
         var2.field3937 -= var2.method5708(602247596) - var1.method5708(1417046088);
      }

      if (var2.field3937 < 0) {
         var2.field3937 = 0;
      }

   }

   public void method5694(int var1, int var2, int var3) {
      this.field3936 = var1;
      this.field3937 = var2;
   }

   int method5699(int var1) {
      return this.field3936 + this.field3939;
   }

   int method5708(int var1) {
      return this.field3938 + this.field3937;
   }

   public void method5693(class323 var1, class323 var2, int var3) {
      this.method5697(var1, var2, (byte)-31);
      this.method5692(var1, var2, -1507993064);
   }

   public String toString() {
      return null;
   }
}

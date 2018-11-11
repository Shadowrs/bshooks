public class class64 {
   static class331[] field748;
   static class242 field750;
   int field744 = 0;
   int field747;
   class263 field745;

   class64(class263 var1, String var2) {
      this.field745 = var1;
      this.field747 = var1.method4565(-140825525);
   }

   boolean method1089(byte var1) {
      this.field744 = 0;

      for(int var2 = 0; var2 < this.field747; ++var2) {
         if (!this.field745.method4690(var2, (byte)1) || this.field745.method4675(var2, 1121534647)) {
            ++this.field744;
         }
      }

      return this.field744 >= this.field747;
   }
}

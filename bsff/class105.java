public class class105 extends class120 {
   public byte[] field1535;
   public int field1536;
   public boolean field1539;
   public int field1537;
   int field1538;

   class105(int var1, byte[] var2, int var3, int var4) {
      this.field1536 = var1;
      this.field1535 = var2;
      this.field1537 = var3;
      this.field1538 = var4;
   }

   class105(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field1536 = var1;
      this.field1535 = var2;
      this.field1537 = var3;
      this.field1538 = var4;
      this.field1539 = var5;
   }

   public class105 method2163(class114 var1) {
      this.field1535 = var1.method2285(this.field1535, -1285236461);
      this.field1536 = var1.method2286(this.field1536, (short)4117);
      if (this.field1537 == this.field1538) {
         this.field1537 = this.field1538 = var1.method2290(this.field1537, 201385874);
      } else {
         this.field1537 = var1.method2290(this.field1537, -1522142897);
         this.field1538 = var1.method2290(this.field1538, -184947121);
         if (this.field1537 == this.field1538) {
            --this.field1537;
         }
      }

      return this;
   }
}

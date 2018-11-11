public class class108 {
   int field1577;
   int field1571;
   int field1581 = 2;
   int field1575;
   int field1578;
   int[] field1572 = new int[2];
   int[] field1573 = new int[2];
   int field1580;
   int field1579;
   int field1574;
   int field1576;

   class108() {
      this.field1572[0] = 0;
      this.field1572[1] = 65535;
      this.field1573[0] = 0;
      this.field1573[1] = 65535;
   }

   final void method2248(class194 var1) {
      this.field1575 = var1.getUByte(720716264);
      this.field1574 = var1.getInt(-1817376731);
      this.field1576 = var1.getInt(-1817376731);
      this.method2244(var1);
   }

   final void method2246() {
      this.field1577 = 0;
      this.field1578 = 0;
      this.field1579 = 0;
      this.field1580 = 0;
      this.field1571 = 0;
   }

   final void method2244(class194 var1) {
      this.field1581 = var1.getUByte(1077619035);
      this.field1572 = new int[this.field1581];
      this.field1573 = new int[this.field1581];

      for(int var2 = 0; var2 < this.field1581; ++var2) {
         this.field1572[var2] = var1.getUShort(-1208216487);
         this.field1573[var2] = var1.getUShort(-1208216487);
      }

   }

   final int method2245(int var1) {
      if (this.field1571 >= this.field1577) {
         this.field1580 = this.field1573[this.field1578++] << 15;
         if (this.field1578 >= this.field1581) {
            this.field1578 = this.field1581 - 1;
         }

         this.field1577 = (int)((double)this.field1572[this.field1578] / 65536.0D * (double)var1);
         if (this.field1577 > this.field1571) {
            this.field1579 = ((this.field1573[this.field1578] << 15) - this.field1580) / (this.field1577 - this.field1571);
         }
      }

      this.field1580 += this.field1579;
      ++this.field1571;
      return this.field1580 - this.field1579 >> 15;
   }
}

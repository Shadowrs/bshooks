public class class238 {
   static class242 field2775;
   public static int field2777;
   public int field2779;
   public int field2774;
   public int field2776;

   public class238(class238 var1) {
      this.field2779 = var1.field2779;
      this.field2774 = var1.field2774;
      this.field2776 = var1.field2776;
   }

   public class238(int var1, int var2, int var3) {
      this.field2779 = var1;
      this.field2774 = var2;
      this.field2776 = var3;
   }

   public class238() {
      this.field2779 = -1;
   }

   public class238(int var1) {
      if (var1 == -1) {
         this.field2779 = -1;
      } else {
         this.field2779 = var1 >> 28 & 3;
         this.field2774 = var1 >> 14 & 16383;
         this.field2776 = var1 & 16383;
      }

   }

   String method4385(String var1, byte var2) {
      return this.field2779 + var1 + (this.field2774 >> 6) + var1 + (this.field2776 >> 6) + var1 + (this.field2774 & 63) + var1 + (this.field2776 & 63);
   }

   public int method4382(byte var1) {
      return this.field2779 << 28 | this.field2774 << 14 | this.field2776;
   }

   public void method4381(int var1, int var2, int var3, byte var4) {
      this.field2779 = var1;
      this.field2774 = var2;
      this.field2776 = var3;
   }

   boolean method4388(class238 var1, int var2) {
      return this.field2779 != var1.field2779 ? false : (this.field2774 != var1.field2774 ? false : this.field2776 == var1.field2776);
   }

   public int hashCode() {
      return this.method4382((byte)-65);
   }

   public String toString() {
      return this.method4385(",", (byte)-20);
   }

   public boolean equals(Object var1) {
      return this == var1 ? true : (!(var1 instanceof class238) ? false : this.method4388((class238)var1, 5422244));
   }
}

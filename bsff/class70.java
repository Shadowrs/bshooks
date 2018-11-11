public class class70 extends class218 {
   static int field813;
   String field806;
   class303 field808;
   class303 field809;
   class305 field803;
   int field811;
   int field814;
   int field805;
   String field807;
   String field812;

   class70(int var1, String var2, String var3, String var4) {
      this.field808 = class303.field3842;
      this.field809 = class303.field3842;
      this.field811 = class135.method2872(-178352703);
      this.field814 = client.field866;
      this.field805 = var1;
      this.field806 = var2;
      this.method1115(-839214170);
      this.field807 = var3;
      this.field812 = var4;
   }

   void method1111(int var1) {
      this.field808 = class164.field2182.field1250.method5316(this.field803, (byte)19) ? class303.field3841 : class303.field3843;
   }

   void method1114(int var1) {
      this.field809 = class164.field2182.field1249.method5316(this.field803, (byte)76) ? class303.field3841 : class303.field3843;
   }

   void method1108(int var1, String var2, String var3, String var4, byte var5) {
      this.field811 = class135.method2872(-178352703);
      this.field814 = client.field866;
      this.field805 = var1;
      this.field806 = var2;
      this.method1115(1046159369);
      this.field807 = var3;
      this.field812 = var4;
   }

   void method1131(int var1) {
      this.field808 = class303.field3842;
   }

   final void method1115(int var1) {
      if (this.field806 != null) {
         this.field803 = new class305(class48.method747(this.field806, -2144606885), client.field1107);
      } else {
         this.field803 = null;
      }

   }

   void method1107(int var1) {
      this.field809 = class303.field3842;
   }

   final boolean method1110(int var1) {
      if (this.field808 == class303.field3842) {
         this.method1111(1432437519);
      }

      return this.field808 == class303.field3841;
   }

   final boolean method1113(byte var1) {
      if (this.field809 == class303.field3842) {
         this.method1114(-359402641);
      }

      return this.field809 == class303.field3841;
   }

   public static byte method1133(char var0, int var1) {
      byte var2;
      if ((var0 <= 0 || var0 >= '\u0080') && (var0 < '\u00a0' || var0 > '\u00ff')) {
         if (var0 == '\u20ac') {
            var2 = -128;
         } else if (var0 == '\u201a') {
            var2 = -126;
         } else if (var0 == '\u0192') {
            var2 = -125;
         } else if (var0 == '\u201e') {
            var2 = -124;
         } else if (var0 == '\u2026') {
            var2 = -123;
         } else if (var0 == '\u2020') {
            var2 = -122;
         } else if (var0 == '\u2021') {
            var2 = -121;
         } else if (var0 == '\u02c6') {
            var2 = -120;
         } else if (var0 == '\u2030') {
            var2 = -119;
         } else if (var0 == '\u0160') {
            var2 = -118;
         } else if (var0 == '\u2039') {
            var2 = -117;
         } else if (var0 == '\u0152') {
            var2 = -116;
         } else if (var0 == '\u017d') {
            var2 = -114;
         } else if (var0 == '\u2018') {
            var2 = -111;
         } else if (var0 == '\u2019') {
            var2 = -110;
         } else if (var0 == '\u201c') {
            var2 = -109;
         } else if (var0 == '\u201d') {
            var2 = -108;
         } else if (var0 == '\u2022') {
            var2 = -107;
         } else if (var0 == '\u2013') {
            var2 = -106;
         } else if (var0 == '\u2014') {
            var2 = -105;
         } else if (var0 == '\u02dc') {
            var2 = -104;
         } else if (var0 == '\u2122') {
            var2 = -103;
         } else if (var0 == '\u0161') {
            var2 = -102;
         } else if (var0 == '\u203a') {
            var2 = -101;
         } else if (var0 == '\u0153') {
            var2 = -100;
         } else if (var0 == '\u017e') {
            var2 = -98;
         } else if (var0 == '\u0178') {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }
}

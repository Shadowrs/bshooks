public class class295 extends class301 {
   class303 field3820;
   class303 field3821;

   class295() {
      this.field3820 = class303.field3842;
      this.field3821 = class303.field3842;
   }

   void method5250(int var1) {
      this.field3821 = class164.field2182.field1249.method5316(super.field3823, (byte)70) ? class303.field3841 : class303.field3843;
   }

   void method5256(byte var1) {
      this.field3820 = class164.field2182.field1250.method5316(super.field3823, (byte)100) ? class303.field3841 : class303.field3843;
   }

   void method5236(int var1) {
      this.field3820 = class303.field3842;
   }

   void method5239(int var1) {
      this.field3821 = class303.field3842;
   }

   public final boolean method5237(byte var1) {
      if (this.field3820 == class303.field3842) {
         this.method5256((byte)3);
      }

      return this.field3820 == class303.field3841;
   }

   public final boolean method5240(int var1) {
      if (this.field3821 == class303.field3842) {
         this.method5250(-1537827834);
      }

      return this.field3821 == class303.field3841;
   }

   public static String method5258(CharSequence var0, int var1) {
      int var2 = var0.length();
      StringBuilder var3 = new StringBuilder(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
            if (var5 == ' ') {
               var3.append('+');
            } else {
               byte var6 = class70.method1133(var5, -1253492448);
               var3.append('%');
               int var7 = var6 >> 4 & 15;
               if (var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }

               var7 = var6 & 15;
               if (var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }
            }
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }
}

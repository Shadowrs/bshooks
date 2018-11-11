public class class296 implements Comparable {
   class305 field3822;
   class305 field3823;

   public int vmethod5454(class296 var1, byte var2) {
      return this.field3823.method5441(var1.field3823, (byte)-52);
   }

   public class305 method5260(int var1) {
      return this.field3823;
   }

   void method5263(class305 var1, class305 var2, byte var3) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field3823 = var1;
         this.field3822 = var2;
      }
   }

   public String method5278(int var1) {
      return this.field3823 == null ? "" : this.field3823.method5436(571856650);
   }

   public String method5262(byte var1) {
      return this.field3822 == null ? "" : this.field3822.method5436(-26813010);
   }

   public int compareTo(Object var1) {
      return this.vmethod5454((class296)var1, (byte)0);
   }

   public static boolean method5280(CharSequence var0, byte var1) {
      return class164.method3229(var0, 10, true, -1595135244);
   }

   public static char method5284(char var0, int var1, int var2) {
      if (var0 >= '\u00c0' && var0 <= '\u00ff') {
         if (var0 >= '\u00c0' && var0 <= '\u00c6') {
            return 'A';
         }

         if (var0 == '\u00c7') {
            return 'C';
         }

         if (var0 >= '\u00c8' && var0 <= '\u00cb') {
            return 'E';
         }

         if (var0 >= '\u00cc' && var0 <= '\u00cf') {
            return 'I';
         }

         if (var0 >= '\u00d2' && var0 <= '\u00d6') {
            return 'O';
         }

         if (var0 >= '\u00d9' && var0 <= '\u00dc') {
            return 'U';
         }

         if (var0 == '\u00dd') {
            return 'Y';
         }

         if (var0 == '\u00df') {
            return 's';
         }

         if (var0 >= '\u00e0' && var0 <= '\u00e6') {
            return 'a';
         }

         if (var0 == '\u00e7') {
            return 'c';
         }

         if (var0 >= '\u00e8' && var0 <= '\u00eb') {
            return 'e';
         }

         if (var0 >= '\u00ec' && var0 <= '\u00ef') {
            return 'i';
         }

         if (var0 >= '\u00f2' && var0 <= '\u00f6') {
            return 'o';
         }

         if (var0 >= '\u00f9' && var0 <= '\u00fc') {
            return 'u';
         }

         if (var0 == '\u00fd' || var0 == '\u00ff') {
            return 'y';
         }
      }

      return var0 == '\u0152' ? 'O' : (var0 == '\u0153' ? 'o' : (var0 == '\u0178' ? 'Y' : var0));
   }
}

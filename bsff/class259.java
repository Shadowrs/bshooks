public class class259 extends class216 {
   int field3359;
   public class174 field3358;
   public byte[] field3356;
   public class263 field3357;

   static long method4543(CharSequence var0, int var1) {
      long var2 = 0L;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if (var6 >= 'A' && var6 <= 'Z') {
            var2 += (long)(var6 + 1 - 65);
         } else if (var6 >= 'a' && var6 <= 'z') {
            var2 += (long)(var6 + 1 - 97);
         } else if (var6 >= '0' && var6 <= '9') {
            var2 += (long)(var6 + 27 - 48);
         }

         if (var2 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var2 % 37L && 0L != var2) {
         var2 /= 37L;
      }

      return var2;
   }

   public static char method4542(char var0, int var1) {
      switch(var0) {
      case ' ':
      case '-':
      case '_':
      case '\u00a0':
         return '_';
      case '#':
      case '[':
      case ']':
         return var0;
      case '\u00c0':
      case '\u00c1':
      case '\u00c2':
      case '\u00c3':
      case '\u00c4':
      case '\u00e0':
      case '\u00e1':
      case '\u00e2':
      case '\u00e3':
      case '\u00e4':
         return 'a';
      case '\u00c7':
      case '\u00e7':
         return 'c';
      case '\u00c8':
      case '\u00c9':
      case '\u00ca':
      case '\u00cb':
      case '\u00e8':
      case '\u00e9':
      case '\u00ea':
      case '\u00eb':
         return 'e';
      case '\u00cd':
      case '\u00ce':
      case '\u00cf':
      case '\u00ed':
      case '\u00ee':
      case '\u00ef':
         return 'i';
      case '\u00d1':
      case '\u00f1':
         return 'n';
      case '\u00d2':
      case '\u00d3':
      case '\u00d4':
      case '\u00d5':
      case '\u00d6':
      case '\u00f2':
      case '\u00f3':
      case '\u00f4':
      case '\u00f5':
      case '\u00f6':
         return 'o';
      case '\u00d9':
      case '\u00da':
      case '\u00db':
      case '\u00dc':
      case '\u00f9':
      case '\u00fa':
      case '\u00fb':
      case '\u00fc':
         return 'u';
      case '\u00df':
         return 'b';
      case '\u00ff':
      case '\u0178':
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }

   static void method4544(int var0) {
      class54.field633 = null;
      class332.field3990 = null;
      class25.field358 = null;
      class332.field3989 = null;
      class332.field3992 = null;
      class332.field3993 = (byte[][])null;
   }

   static final void method4541(int var0, int var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < client.field967; ++var5) {
         if (client.field1063[var5] + client.field1122[var5] > var0 && client.field1063[var5] < var0 + var2 && client.field1066[var5] + client.field860[var5] > var1 && client.field860[var5] < var3 + var1) {
            client.field1061[var5] = true;
         }
      }

   }
}

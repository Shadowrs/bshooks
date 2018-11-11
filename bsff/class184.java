public class class184 extends class216 {
   static class184[] field2495 = new class184[300];
   static int field2496 = 0;
   public static int[] field2491;
   static int field2498;
   public class201 field2500;
   public int field2494;
   class181 field2499;
   int field2492;

   public void method3431(int var1) {
      if (field2496 < field2495.length) {
         field2495[++field2496 - 1] = this;
      }

   }

   static String method3438(int var0, byte var1) {
      return var0 < 0 ? "" : (client.field998[var0].length() > 0 ? client.field997[var0] + " " + client.field998[var0] : client.field997[var0]);
   }

   static final void method3437(class242 var0, int var1) {
      int var2 = var0.field2818;
      if (var2 == 324) {
         if (client.field1072 == -1) {
            client.field1072 = var0.field2893;
            client.field924 = var0.field2855;
         }

         if (client.field1118.field2782) {
            var0.field2893 = client.field1072;
         } else {
            var0.field2893 = client.field924;
         }
      } else if (var2 == 325) {
         if (client.field1072 == -1) {
            client.field1072 = var0.field2893;
            client.field924 = var0.field2855;
         }

         if (client.field1118.field2782) {
            var0.field2893 = client.field924;
         } else {
            var0.field2893 = client.field1072;
         }
      } else if (var2 == 327) {
         var0.field2865 = 150;
         var0.field2866 = (int)(Math.sin((double)client.field866 / 40.0D) * 256.0D) & 2047;
         var0.field2857 = 5;
         var0.field2923 = 0;
      } else if (var2 == 328) {
         var0.field2865 = 150;
         var0.field2866 = (int)(Math.sin((double)client.field866 / 40.0D) * 256.0D) & 2047;
         var0.field2857 = 5;
         var0.field2923 = 1;
      }

   }

   public static boolean method3430(char var0, byte var1) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}

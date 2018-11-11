public class class190 {
   public static String field2521;
   static int field2522;

   static final void method3487(int var0) {
      for(int var1 = 0; var1 < class93.field1414; ++var1) {
         class72 var2 = client.field971[class93.field1415[var1]];
         var2.method1166(1870402229);
      }

      class54.method824(231267082);
      if (class33.field443 != null) {
         class33.field443.method5468(1611451307);
      }

   }

   public static void method3486(byte var0) {
      class51 var1 = class51.field622;
      synchronized(var1) {
         ++class51.field611;
         class51.field615 = class51.field617;
         class51.field593 = 0;
         int var3;
         if (class51.field610 < 0) {
            for(var3 = 0; var3 < 112; ++var3) {
               class51.field607[var3] = false;
            }

            class51.field610 = class51.field609;
         } else {
            while(class51.field609 != class51.field610) {
               var3 = class51.field616[class51.field609];
               class51.field609 = class51.field609 + 1 & 127;
               if (var3 < 0) {
                  class51.field607[~var3] = false;
               } else {
                  if (!class51.field607[var3] && class51.field593 < class51.field613.length - 1) {
                     class51.field613[++class51.field593 - 1] = var3;
                  }

                  class51.field607[var3] = true;
               }
            }
         }

         if (class51.field593 > 0) {
            class51.field611 = 0;
         }

         class51.field617 = class51.field606;
      }
   }
}

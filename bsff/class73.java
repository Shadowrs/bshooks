import java.util.Comparator;

public class class73 implements Comparator {
   static class107 field852;
   boolean field854;

   int method1183(class14 var1, class14 var2, int var3) {
      if (var2.field273 == var1.field273) {
         return 0;
      } else {
         if (this.field854) {
            if (client.field857 == var1.field273) {
               return -1;
            }

            if (var2.field273 == client.field857) {
               return 1;
            }
         }

         return var1.field273 < var2.field273 ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1183((class14)var1, (class14)var2, -654494058);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}

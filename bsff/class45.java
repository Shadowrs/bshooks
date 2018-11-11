import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class45 extends class32 {
   protected static int field553;
   List field555;
   HashSet field557;
   HashSet field554;

   void method664(class194 var1, boolean var2, int var3) {
      this.field555 = new LinkedList();
      if (var1.field2566.length != 0) {
         int var4 = var1.getUShort(-1208216487);

         for(int var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.getBigSmart(-1945408062);
            class238 var7 = new class238(var1.getInt(-1817376731));
            boolean var8 = var1.getUByte(440213899) == 1;
            if (var2 || !var8) {
               this.field555.add(new class25(var6, var7));
            }
         }

      }
   }

   void method663(class194 var1, class194 var2, class194 var3, int var4, boolean var5, int var6) {
      this.method305(var1, var4, (byte)-15);
      int var7 = var3.getUShort(-1208216487);
      this.field557 = new HashSet(var7);

      int var8;
      for(var8 = 0; var8 < var7; ++var8) {
         class22 var9 = new class22();

         try {
            var9.method176(var2, var3, -1880953807);
         } catch (IllegalStateException var13) {
            continue;
         }

         this.field557.add(var9);
      }

      var8 = var3.getUShort(-1208216487);
      this.field554 = new HashSet(var8);

      for(int var14 = 0; var14 < var8; ++var14) {
         class46 var10 = new class46();

         try {
            var10.method673(var2, var3, (byte)7);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field554.add(var10);
      }

      this.method664(var2, var5, 1505623943);
   }

   static void method670(int var0) {
      client.field992 = 0;
      client.field991 = false;
   }

   static int method662(class242 var0, int var1) {
      class223 var2 = (class223)client.field986.method3981((long)var0.field2815 + ((long)var0.field2814 << 32));
      return var2 != null ? var2.field2659 : var0.field2886;
   }
}

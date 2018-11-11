import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class13 {
   public static Comparator field271 = new class19();
   public static Comparator field267;
   public static int[] field265;
   public static Comparator field268;
   static int field266;
   public static Comparator field270;
   public List field269;

   public class13(class194 var1, boolean var2) {
      int var3 = var1.getUShort(-1208216487);
      boolean var4 = var1.getUByte(7346092) == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.getUShort(-1208216487);
      this.field269 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field269.add(new class14(var1, var5, var3));
      }

   }

   public void method85(Comparator var1, boolean var2, int var3) {
      if (var2) {
         Collections.sort(this.field269, var1);
      } else {
         Collections.sort(this.field269, Collections.reverseOrder(var1));
      }

   }

   public static boolean method86(int var0, int var1) {
      return var0 >= class247.field2991.field2996 && var0 <= class247.field2994.field2996;
   }

   static final boolean method84(byte[] var0, int var1, int var2, int var3) {
      boolean var4 = true;
      class194 var5 = new class194(var0);
      int var6 = -1;

      label71:
      while(true) {
         int var7 = var5.getUSmart(1874948195);
         if (var7 == 0) {
            return var4;
         }

         var6 += var7;
         int var8 = 0;
         boolean var9 = false;

         while(true) {
            int var13;
            class282 var16;
            do {
               int var14;
               int var15;
               do {
                  do {
                     do {
                        do {
                           int var10;
                           while(var9) {
                              var10 = var5.getUSmart(1556425540);
                              if (var10 == 0) {
                                 continue label71;
                              }

                              var5.getUByte(779737257);
                           }

                           var10 = var5.getUSmart(1068321549);
                           if (var10 == 0) {
                              continue label71;
                           }

                           var8 += var10 - 1;
                           int var11 = var8 & 63;
                           int var12 = var8 >> 6 & 63;
                           var13 = var5.getUByte(707428681) >> 2;
                           var14 = var12 + var1;
                           var15 = var11 + var2;
                        } while(var14 <= 0);
                     } while(var15 <= 0);
                  } while(var14 >= 103);
               } while(var15 >= 103);

               var16 = class260.method4546(var6, 23657318);
            } while(var13 == 22 && client.field862 && var16.field3612 == 0 && var16.field3586 != 1 && !var16.field3619);

            if (!var16.method5003(-2021547021)) {
               ++client.field910;
               var4 = false;
            }

            var9 = true;
         }
      }
   }

   static {
      new class12();
      field267 = new class17();
      field268 = new class18();
      field270 = new class15();
   }
}

import java.util.Iterator;
import java.util.LinkedList;

public class class32 {
   static boolean field440;
   String field429;
   int field430 = -1;
   boolean field437 = false;
   int field438 = -1;
   String field432;
   int field439 = -1;
   class238 field428 = null;
   int field431 = 0;
   LinkedList field435;
   int field436 = 0;
   int field433 = Integer.MAX_VALUE;
   int field434 = Integer.MAX_VALUE;

   public void method305(class194 var1, int var2, byte var3) {
      this.field438 = var2;
      this.field432 = var1.getString1(-778927800);
      this.field429 = var1.getString1(-778927800);
      this.field428 = new class238(var1.getInt(-1817376731));
      this.field430 = var1.getInt(-1817376731);
      var1.getUByte(-2023281221);
      this.field437 = var1.getUByte(1077549570) == 1;
      this.field439 = var1.getUByte(1187418260);
      int var4 = var1.getUByte(650814576);
      this.field435 = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field435.add(this.method306(var1, 1849374991));
      }

      this.method315((byte)-18);
   }

   public String method355(byte var1) {
      return this.field432;
   }

   public boolean method308(int var1, int var2, byte var3) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if (var4 >= this.field433 && var4 <= this.field431) {
         if (var5 >= this.field434 && var5 <= this.field436) {
            Iterator var6 = this.field435.iterator();

            while(var6.hasNext()) {
               class43 var7 = (class43)var6.next();
               if (var7.vmethod758(var1, var2, (short)14935)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] method309(int var1, int var2, int var3, int var4) {
      Iterator var5 = this.field435.iterator();

      while(var5.hasNext()) {
         class43 var6 = (class43)var5.next();
         if (var6.vmethod753(var1, var2, var3, 520265099)) {
            return var6.vmethod754(var1, var2, var3, 174791792);
         }
      }

      return null;
   }

   public int method321(int var1) {
      return this.field438;
   }

   public int method318(byte var1) {
      return this.field433;
   }

   public int method373(int var1) {
      return this.field434;
   }

   public boolean method307(int var1, int var2, int var3, byte var4) {
      Iterator var5 = this.field435.iterator();

      while(var5.hasNext()) {
         class43 var6 = (class43)var5.next();
         if (var6.vmethod753(var1, var2, var3, 1194185187)) {
            return true;
         }
      }

      return false;
   }

   public class238 method354(int var1, int var2, int var3) {
      Iterator var4 = this.field435.iterator();

      while(var4.hasNext()) {
         class43 var5 = (class43)var4.next();
         if (var5.vmethod758(var1, var2, (short)9376)) {
            return var5.vmethod777(var1, var2, (byte)-64);
         }
      }

      return null;
   }

   public int method323(byte var1) {
      return this.field428.field2779;
   }

   public int method322(byte var1) {
      return this.field428.field2774;
   }

   public int method324(int var1) {
      return this.field428.field2776;
   }

   public int method352(int var1) {
      return this.field439;
   }

   void method315(byte var1) {
      Iterator var2 = this.field435.iterator();

      while(var2.hasNext()) {
         class43 var3 = (class43)var2.next();
         var3.vmethod751(this, 269119455);
      }

   }

   class43 method306(class194 var1, int var2) {
      int var3 = var1.getUByte(-95919070);
      class27 var4 = (class27)class44.method660(class27.method238((byte)-2), var3, -1193228196);
      Object var5 = null;
      switch(var4.field381) {
      case 0:
         var5 = new class30();
         break;
      case 1:
         var5 = new class26();
         break;
      case 2:
         var5 = new class39();
         break;
      case 3:
         var5 = new class49();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class43)var5).vmethod756(var1, -314407075);
      return (class43)var5;
   }

   public boolean method374(int var1) {
      return this.field437;
   }

   public int method319(int var1) {
      return this.field431;
   }

   public int method313(int var1) {
      return this.field436;
   }

   int method316(int var1) {
      return this.field430;
   }

   public String method320(byte var1) {
      return this.field429;
   }

   public class238 method357(int var1) {
      return new class238(this.field428);
   }

   static int method347(int var0, class96 var1, boolean var2, int var3) {
      int var4;
      int var5;
      class280 var6;
      class280 var7;
      byte[] var8;
      int var13;
      if (var0 == 3400) {
         class135.field1964 -= 2;
         var4 = class81.field1272[class135.field1964];
         var5 = class81.field1272[class135.field1964 + 1];
         var7 = (class280)class280.field3556.method3929((long)var4);
         if (var7 != null) {
            var6 = var7;
         } else {
            var8 = class280.field3553.method4551(8, var4, 1454554697);
            var7 = new class280();
            if (var8 != null) {
               var7.method4954(new class194(var8), -52449897);
            }

            class280.field3556.method3932(var7, (long)var4);
            var6 = var7;
         }

         var7 = var6;
         if (var6.field3555 != 's') {
            ;
         }

         for(var13 = 0; var13 < var7.field3561; ++var13) {
            if (var5 == var7.field3559[var13]) {
               class81.field1281[++class77.field1233 - 1] = var7.field3552[var13];
               var7 = null;
               break;
            }
         }

         if (var7 != null) {
            class81.field1281[++class77.field1233 - 1] = var7.field3558;
         }

         return 1;
      } else if (var0 == 3408) {
         class135.field1964 -= 4;
         var4 = class81.field1272[class135.field1964];
         var5 = class81.field1272[class135.field1964 + 1];
         int var12 = class81.field1272[class135.field1964 + 2];
         var13 = class81.field1272[class135.field1964 + 3];
         class280 var9 = (class280)class280.field3556.method3929((long)var12);
         class280 var10;
         if (var9 != null) {
            var10 = var9;
         } else {
            byte[] var11 = class280.field3553.method4551(8, var12, 1492999700);
            var9 = new class280();
            if (var11 != null) {
               var9.method4954(new class194(var11), -1539203144);
            }

            class280.field3556.method3932(var9, (long)var12);
            var10 = var9;
         }

         var9 = var10;
         if (var4 == var10.field3554 && var5 == var10.field3555) {
            for(int var14 = 0; var14 < var9.field3561; ++var14) {
               if (var13 == var9.field3559[var14]) {
                  if (var5 == 115) {
                     class81.field1281[++class77.field1233 - 1] = var9.field3552[var14];
                  } else {
                     class81.field1272[++class135.field1964 - 1] = var9.field3560[var14];
                  }

                  var9 = null;
                  break;
               }
            }

            if (var9 != null) {
               if (var5 == 115) {
                  class81.field1281[++class77.field1233 - 1] = var9.field3558;
               } else {
                  class81.field1272[++class135.field1964 - 1] = var9.field3557;
               }
            }

            return 1;
         } else {
            if (var5 == 115) {
               class81.field1281[++class77.field1233 - 1] = "null";
            } else {
               class81.field1272[++class135.field1964 - 1] = 0;
            }

            return 1;
         }
      } else if (var0 == 3411) {
         var4 = class81.field1272[--class135.field1964];
         var6 = (class280)class280.field3556.method3929((long)var4);
         if (var6 != null) {
            var7 = var6;
         } else {
            var8 = class280.field3553.method4551(8, var4, -125527028);
            var6 = new class280();
            if (var8 != null) {
               var6.method4954(new class194(var8), 132757405);
            }

            class280.field3556.method3932(var6, (long)var4);
            var7 = var6;
         }

         class81.field1272[++class135.field1964 - 1] = var7.method4949(575314488);
         return 1;
      } else {
         return 2;
      }
   }
}

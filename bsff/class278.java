public class class278 extends class218 {
   static class212 field3545 = new class212(64);
   public static class261 field3542;
   char field3544;
   boolean field3547 = true;
   public int field3543;
   public String field3546;

   void method4909(class194 var1, int var2, byte var3) {
      if (var2 == 1) {
         this.field3544 = class84.method1838(var1.getByte(234675183), 41649249);
      } else if (var2 == 2) {
         this.field3543 = var1.getInt(-1817376731);
      } else if (var2 == 4) {
         this.field3547 = false;
      } else if (var2 == 5) {
         this.field3546 = var1.getString1(-778927800);
      }

   }

   public boolean method4907(int var1) {
      return this.field3544 == 's';
   }

   void method4903(int var1) {
   }

   void method4905(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(49212259);
         if (var3 == 0) {
            return;
         }

         this.method4909(var1, var3, (byte)9);
      }
   }

   static void method4922(int var0) {
      class90.field1374 = class90.field1374.trim();
      if (class90.field1374.length() == 0) {
         class33.method385("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.", 552134877);
      } else {
         long var1 = class34.method387((byte)1);
         int var3;
         if (var1 == 0L) {
            var3 = 5;
         } else {
            var3 = class234.method4359(var1, class90.field1374, (byte)-54);
         }

         switch(var3) {
         case 2:
            class33.method385("", "Page has opened in a new window.", "(Please check your popup blocker.)", 1068613106);
            class90.field1355 = 6;
            break;
         case 3:
            class33.method385("", "Error connecting to server.", "", -524141550);
            break;
         case 4:
            class33.method385("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.", 1048032432);
            break;
         case 5:
            class33.method385("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.", -1898415135);
            break;
         case 6:
            class33.method385("", "Error connecting to server.", "", -1064913228);
            break;
         case 7:
            class33.method385("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.", 422976515);
         }
      }

   }
}

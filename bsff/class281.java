public class class281 extends class218 {
   static class212 field3568 = new class212(20);
   static class212 field3566 = new class212(64);
   static class212 field3567 = new class212(64);
   public static class261 field3576;
   public static class261 field3564;
   public static class261 field3565;
   String field3563 = "";
   int field3585 = -1;
   int field3570 = -1;
   int field3573 = -1;
   int field3575 = -1;
   int field3580 = -1;
   int field3583 = -1;
   int field3574 = -1;
   public int field3581 = -1;
   public int field3571 = 16777215;
   public int field3572 = 70;
   public int[] field3569;
   public int field3577 = 0;
   public int field3579 = -1;
   public int field3578 = 0;
   public int field3582 = 0;

   void method4963(class194 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3570 = var1.getBigSmart(-1683747047);
      } else if (var2 == 2) {
         this.field3571 = var1.get24Int((byte)2);
      } else if (var2 == 3) {
         this.field3573 = var1.getBigSmart(661044691);
      } else if (var2 == 4) {
         this.field3580 = var1.getBigSmart(649829998);
      } else if (var2 == 5) {
         this.field3583 = var1.getBigSmart(-1629740053);
      } else if (var2 == 6) {
         this.field3575 = var1.getBigSmart(507127672);
      } else if (var2 == 7) {
         this.field3577 = var1.getShort(997392590);
      } else if (var2 == 8) {
         this.field3563 = var1.getString2(221760728);
      } else if (var2 == 9) {
         this.field3572 = var1.getUShort(-1208216487);
      } else if (var2 == 10) {
         this.field3578 = var1.getShort(997392590);
      } else if (var2 == 11) {
         this.field3579 = 0;
      } else if (var2 == 12) {
         this.field3581 = var1.getUByte(245442811);
      } else if (var2 == 13) {
         this.field3582 = var1.getShort(997392590);
      } else if (var2 == 14) {
         this.field3579 = var1.getUShort(-1208216487);
      } else if (var2 == 17 || var2 == 18) {
         this.field3585 = var1.getUShort(-1208216487);
         if (this.field3585 == 65535) {
            this.field3585 = -1;
         }

         this.field3574 = var1.getUShort(-1208216487);
         if (this.field3574 == 65535) {
            this.field3574 = -1;
         }

         int var4 = -1;
         if (var2 == 18) {
            var4 = var1.getUShort(-1208216487);
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         int var5 = var1.getUByte(-1404008227);
         this.field3569 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3569[var6] = var1.getUShort(-1208216487);
            if (this.field3569[var6] == 65535) {
               this.field3569[var6] = -1;
            }
         }

         this.field3569[var5 + 1] = var4;
      }

   }

   void method4977(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(-245126642);
         if (var3 == 0) {
            return;
         }

         this.method4963(var1, var3, 1184230555);
      }
   }

   public final class281 method4993(int var1) {
      int var2 = -1;
      if (this.field3585 != -1) {
         var2 = class88.method1853(this.field3585, 1988781689);
      } else if (this.field3574 != -1) {
         var2 = class237.field2770[this.field3574];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field3569.length - 1) {
         var3 = this.field3569[var2];
      } else {
         var3 = this.field3569[this.field3569.length - 1];
      }

      return var3 != -1 ? class8.method49(var3, (byte)71) : null;
   }

   public class331 method4988(int var1) {
      if (this.field3573 < 0) {
         return null;
      } else {
         class331 var2 = (class331)field3567.method3929((long)this.field3573);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class328.method5831(field3564, this.field3573, 0, 1814499909);
            if (var2 != null) {
               field3567.method3932(var2, (long)this.field3573);
            }

            return var2;
         }
      }
   }

   public class331 method4983(int var1) {
      if (this.field3583 < 0) {
         return null;
      } else {
         class331 var2 = (class331)field3567.method3929((long)this.field3583);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class328.method5831(field3564, this.field3583, 0, 1685204828);
            if (var2 != null) {
               field3567.method3932(var2, (long)this.field3583);
            }

            return var2;
         }
      }
   }

   public class331 method4968(int var1) {
      if (this.field3580 < 0) {
         return null;
      } else {
         class331 var2 = (class331)field3567.method3929((long)this.field3580);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class328.method5831(field3564, this.field3580, 0, 1549940916);
            if (var2 != null) {
               field3567.method3932(var2, (long)this.field3580);
            }

            return var2;
         }
      }
   }

   public class331 method4969(byte var1) {
      if (this.field3575 < 0) {
         return null;
      } else {
         class331 var2 = (class331)field3567.method3929((long)this.field3575);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class328.method5831(field3564, this.field3575, 0, 1998621406);
            if (var2 != null) {
               field3567.method3932(var2, (long)this.field3575);
            }

            return var2;
         }
      }
   }

   public class311 method4984(int var1) {
      if (this.field3570 == -1) {
         return null;
      } else {
         class311 var2 = (class311)field3568.method3929((long)this.field3570);
         if (var2 != null) {
            return var2;
         } else {
            class261 var3 = field3564;
            class261 var4 = field3565;
            int var5 = this.field3570;
            class311 var6;
            if (!class288.method5204(var3, var5, 0, (byte)126)) {
               var6 = null;
            } else {
               var6 = class269.method4772(var4.method4551(var5, 0, 1674267595), 422585817);
            }

            if (var6 != null) {
               field3568.method3932(var6, (long)this.field3570);
            }

            return var6;
         }
      }
   }

   public String method4965(int var1, int var2) {
      String var3 = this.field3563;

      while(true) {
         int var4 = var3.indexOf("%1");
         if (var4 < 0) {
            return var3;
         }

         String var5 = var3.substring(0, var4);
         String var6 = Integer.toString(var1);
         var3 = var5 + var6 + var3.substring(var4 + 2);
      }
   }
}

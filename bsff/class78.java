import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class class78 {
   static int field1237 = 6;
   static int field1243;
   int field1239 = 1;
   String field1234 = null;
   boolean field1236;
   boolean field1240 = false;
   LinkedHashMap field1241 = new LinkedHashMap();
   boolean field1242;

   class78() {
      this.method1646(true, -1727294059);
   }

   class78(class194 var1) {
      if (var1 != null && var1.field2566 != null) {
         int var2 = var1.getUByte(729751230);
         if (var2 >= 0 && var2 <= field1237) {
            if (var1.getUByte(608267562) == 1) {
               this.field1236 = true;
            }

            if (var2 > 1) {
               this.field1242 = var1.getUByte(1337417704) == 1;
            }

            if (var2 > 3) {
               this.field1239 = var1.getUByte(-159001742);
            }

            if (var2 > 2) {
               int var3 = var1.getUByte(931497610);

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.getInt(-1817376731);
                  int var6 = var1.getInt(-1817376731);
                  this.field1241.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field1234 = var1.getString3(1024059047);
            }

            if (var2 > 5) {
               this.field1240 = var1.getBoolean(-57594751);
            }
         } else {
            this.method1646(true, 1508519228);
         }
      } else {
         this.method1646(true, 2055131013);
      }

   }

   void method1646(boolean var1, int var2) {
   }

   class194 method1651(int var1) {
      class194 var2 = new class194(100);
      var2.addByte(field1237, (byte)-29);
      var2.addByte(this.field1236 ? 1 : 0, (byte)-79);
      var2.addByte(this.field1242 ? 1 : 0, (byte)-127);
      var2.addByte(this.field1239, (byte)-57);
      var2.addByte(this.field1241.size(), (byte)-128);
      Iterator var3 = this.field1241.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var2.addInt(((Integer)var4.getKey()).intValue(), (byte)27);
         var2.addInt(((Integer)var4.getValue()).intValue(), (byte)85);
      }

      var2.addString1(this.field1234 != null ? this.field1234 : "", 22779042);
      var2.addBoolean(this.field1240, -1432777546);
      return var2;
   }

   static final void method1655(int var0, int var1, int var2, int var3, int var4, byte var5) {
      int var6 = class308.field3867.method2987(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      class330 var15;
      if (var6 != 0) {
         var7 = class308.field3867.method3041(var0, var1, var2, var6);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         if (var6 > 0) {
            var10 = var4;
         }

         int[] var13 = class180.field2371.field3986;
         var11 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var12 = var6 >> 14 & 32767;
         class282 var14 = class260.method4546(var12, 652651450);
         if (var14.field3615 != -1) {
            var15 = class61.field718[var14.field3615];
            if (var15 != null) {
               int var16 = (var14.field3601 * 4 - var15.field3971) / 2;
               int var17 = (var14.field3602 * 4 - var15.field3972) / 2;
               var15.method5842(var16 + var1 * 4 + 48, (104 - var2 - var14.field3602) * 4 + var17 + 48);
            }
         } else {
            if (var9 == 0 || var9 == 2) {
               if (var8 == 0) {
                  var13[var11] = var10;
                  var13[var11 + 512] = var10;
                  var13[var11 + 1024] = var10;
                  var13[var11 + 1536] = var10;
               } else if (var8 == 1) {
                  var13[var11] = var10;
                  var13[var11 + 1] = var10;
                  var13[var11 + 2] = var10;
                  var13[var11 + 3] = var10;
               } else if (var8 == 2) {
                  var13[var11 + 3] = var10;
                  var13[var11 + 512 + 3] = var10;
                  var13[var11 + 1024 + 3] = var10;
                  var13[var11 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var13[var11 + 1536] = var10;
                  var13[var11 + 1536 + 1] = var10;
                  var13[var11 + 1536 + 2] = var10;
                  var13[var11 + 1536 + 3] = var10;
               }
            }

            if (var9 == 3) {
               if (var8 == 0) {
                  var13[var11] = var10;
               } else if (var8 == 1) {
                  var13[var11 + 3] = var10;
               } else if (var8 == 2) {
                  var13[var11 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var13[var11 + 1536] = var10;
               }
            }

            if (var9 == 2) {
               if (var8 == 3) {
                  var13[var11] = var10;
                  var13[var11 + 512] = var10;
                  var13[var11 + 1024] = var10;
                  var13[var11 + 1536] = var10;
               } else if (var8 == 0) {
                  var13[var11] = var10;
                  var13[var11 + 1] = var10;
                  var13[var11 + 2] = var10;
                  var13[var11 + 3] = var10;
               } else if (var8 == 1) {
                  var13[var11 + 3] = var10;
                  var13[var11 + 512 + 3] = var10;
                  var13[var11 + 1024 + 3] = var10;
                  var13[var11 + 1536 + 3] = var10;
               } else if (var8 == 2) {
                  var13[var11 + 1536] = var10;
                  var13[var11 + 1536 + 1] = var10;
                  var13[var11 + 1536 + 2] = var10;
                  var13[var11 + 1536 + 3] = var10;
               }
            }
         }
      }

      var6 = class308.field3867.method2904(var0, var1, var2);
      class282 var18;
      if (var6 != 0) {
         var7 = class308.field3867.method3041(var0, var1, var2, var6);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var6 >> 14 & 32767;
         var18 = class260.method4546(var10, 870070063);
         int var19;
         if (var18.field3615 != -1) {
            var15 = class61.field718[var18.field3615];
            if (var15 != null) {
               var12 = (var18.field3601 * 4 - var15.field3971) / 2;
               var19 = (var18.field3602 * 4 - var15.field3972) / 2;
               var15.method5842(var12 + var1 * 4 + 48, var19 + (104 - var2 - var18.field3602) * 4 + 48);
            }
         } else if (var9 == 9) {
            var11 = 15658734;
            if (var6 > 0) {
               var11 = 15597568;
            }

            int[] var21 = class180.field2371.field3986;
            var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if (var8 != 0 && var8 != 2) {
               var21[var19] = var11;
               var21[var19 + 1 + 512] = var11;
               var21[var19 + 1024 + 2] = var11;
               var21[var19 + 1536 + 3] = var11;
            } else {
               var21[var19 + 1536] = var11;
               var21[var19 + 1 + 1024] = var11;
               var21[var19 + 512 + 2] = var11;
               var21[var19 + 3] = var11;
            }
         }
      }

      var6 = class308.field3867.method2905(var0, var1, var2);
      if (var6 != 0) {
         var7 = var6 >> 14 & 32767;
         var18 = class260.method4546(var7, -1057381823);
         if (var18.field3615 != -1) {
            class330 var20 = class61.field718[var18.field3615];
            if (var20 != null) {
               var10 = (var18.field3601 * 4 - var20.field3971) / 2;
               int var22 = (var18.field3602 * 4 - var20.field3972) / 2;
               var20.method5842(var10 + var1 * 4 + 48, var22 + (104 - var2 - var18.field3602) * 4 + 48);
            }
         }
      }

   }

   static int method1645(int var0, int var1, int var2) {
      class65 var3 = (class65)class65.field753.method3981((long)var0);
      return var3 == null ? 0 : (var1 >= 0 && var1 < var3.field752.length ? var3.field752[var1] : 0);
   }
}

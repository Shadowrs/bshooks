import java.util.zip.Inflater;

public class class187 {
   Inflater field2510;

   class187(int var1, int var2, int var3) {
   }

   public class187() {
      this(-1, 1000000, 1000000);
   }

   public void method3454(class194 var1, byte[] var2, int var3) {
      if (var1.field2566[var1.field2565] == 31 && var1.field2566[var1.field2565 + 1] == -117) {
         if (this.field2510 == null) {
            this.field2510 = new Inflater(true);
         }

         try {
            this.field2510.setInput(var1.field2566, var1.field2565 + 10, var1.field2566.length - (var1.field2565 + 8 + 10));
            this.field2510.inflate(var2);
         } catch (Exception var5) {
            this.field2510.reset();
            throw new RuntimeException("");
         }

         this.field2510.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   static final void method3453(int var0) {
      boolean var1 = false;

      while(!var1) {
         var1 = true;

         for(int var2 = 0; var2 < client.field992 - 1; ++var2) {
            if (client.field871[var2] < 1000 && client.field871[var2 + 1] > 1000) {
               String var3 = client.field998[var2];
               client.field998[var2] = client.field998[var2 + 1];
               client.field998[var2 + 1] = var3;
               String var4 = client.field997[var2];
               client.field997[var2] = client.field997[var2 + 1];
               client.field997[var2 + 1] = var4;
               int var5 = client.field871[var2];
               client.field871[var2] = client.field871[var2 + 1];
               client.field871[var2 + 1] = var5;
               var5 = client.field993[var2];
               client.field993[var2] = client.field993[var2 + 1];
               client.field993[var2 + 1] = var5;
               var5 = client.field994[var2];
               client.field994[var2] = client.field994[var2 + 1];
               client.field994[var2 + 1] = var5;
               var5 = client.field996[var2];
               client.field996[var2] = client.field996[var2 + 1];
               client.field996[var2 + 1] = var5;
               boolean var6 = client.field999[var2];
               client.field999[var2] = client.field999[var2 + 1];
               client.field999[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

   }

   static final void method3458(int var0) {
      for(int var1 = 0; var1 < client.field1093; ++var1) {
         --client.field1096[var1];
         if (client.field1096[var1] >= -10) {
            class103 var10 = client.field1098[var1];
            if (var10 == null) {
               Object var3 = null;
               var10 = class103.method2121(class44.field552, client.field885[var1], 0);
               if (var10 == null) {
                  continue;
               }

               client.field1096[var1] += var10.method2116();
               client.field1098[var1] = var10;
            }

            if (client.field1096[var1] < 0) {
               int var11;
               if (client.field1097[var1] != 0) {
                  int var4 = (client.field1097[var1] & 255) * 128;
                  int var5 = client.field1097[var1] >> 16 & 255;
                  int var6 = var5 * 128 + 64 - class12.field259.field1185;
                  if (var6 < 0) {
                     var6 = -var6;
                  }

                  int var7 = client.field1097[var1] >> 8 & 255;
                  int var8 = var7 * 128 + 64 - class12.field259.field1209;
                  if (var8 < 0) {
                     var8 = -var8;
                  }

                  int var9 = var8 + var6 - 128;
                  if (var9 > var4) {
                     client.field1096[var1] = -100;
                     continue;
                  }

                  if (var9 < 0) {
                     var9 = 0;
                  }

                  var11 = (var4 - var9) * client.field1034 / var4;
               } else {
                  var11 = client.field1091;
               }

               if (var11 > 0) {
                  class105 var12 = var10.method2115().method2163(class194.field2571);
                  class115 var13 = class115.method2300(var12, 100, var11);
                  var13.method2303(client.field919[var1] - 1);
                  class54.field632.method2085(var13);
               }

               client.field1096[var1] = -100;
            }
         } else {
            --client.field1093;

            for(int var2 = var1; var2 < client.field1093; ++var2) {
               client.field885[var2] = client.field885[var2 + 1];
               client.field1098[var2] = client.field1098[var2 + 1];
               client.field919[var2] = client.field919[var2 + 1];
               client.field1096[var2] = client.field1096[var2 + 1];
               client.field1097[var2] = client.field1097[var2 + 1];
            }

            --var1;
         }
      }

      if (client.field1090 && !class92.method1927(1063167102)) {
         if (client.field1044 != 0 && client.field1089 != -1) {
            class95.method2007(class1.field12, client.field1089, 0, client.field1044, false, (byte)55);
         }

         client.field1090 = false;
      }

   }

   static final void method3457(class242 var0, class283 var1, int var2, int var3, boolean var4, int var5) {
      String[] var6 = var1.field3659;
      byte var7 = -1;
      String var8 = null;
      if (var6 != null && var6[var3] != null) {
         if (var3 == 0) {
            var7 = 33;
         } else if (var3 == 1) {
            var7 = 34;
         } else if (var3 == 2) {
            var7 = 35;
         } else if (var3 == 3) {
            var7 = 36;
         } else {
            var7 = 37;
         }

         var8 = var6[var3];
      } else if (var3 == 4) {
         var7 = 37;
         var8 = "Drop";
      }

      if (var7 != -1 && var8 != null) {
         String var9 = class173.method3342(16748608, (byte)-8) + var1.field3644;
         int var10 = var1.field3642;
         int var11 = var0.field2814;
         if (!client.field991 && client.field992 < 500) {
            client.field997[client.field992] = var8;
            client.field998[client.field992] = var9;
            client.field871[client.field992] = var7;
            client.field996[client.field992] = var10;
            client.field993[client.field992] = var2;
            client.field994[client.field992] = var11;
            client.field999[client.field992] = var4;
            ++client.field992;
         }
      }

   }
}

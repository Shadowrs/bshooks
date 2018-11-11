import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class class148 {
   volatile byte[] field2121;
   volatile boolean field2120;
   URL field2119;

   class148(URL var1) {
      this.field2119 = var1;
   }

   public boolean method3109(int var1) {
      return this.field2120;
   }

   public byte[] method3110(byte var1) {
      return this.field2121;
   }

   public static void method3113(String var0, Throwable var1, byte var2) {
      try {
         String var3 = "";
         if (var1 != null) {
            Throwable var4 = var1;
            String var5;
            if (var1 instanceof class164) {
               class164 var6 = (class164)var1;
               var5 = var6.field2184 + " | ";
               var4 = var6.field2180;
            } else {
               var5 = "";
            }

            StringWriter var18 = new StringWriter();
            PrintWriter var7 = new PrintWriter(var18);
            var4.printStackTrace(var7);
            var7.close();
            String var8 = var18.toString();
            BufferedReader var9 = new BufferedReader(new StringReader(var8));
            String var10 = var9.readLine();

            while(true) {
               String var11 = var9.readLine();
               if (var11 == null) {
                  var5 = var5 + "| " + var10;
                  var3 = var5;
                  break;
               }

               int var12 = var11.indexOf(40);
               int var13 = var11.indexOf(41, var12 + 1);
               if (var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(var12 + 1, var13);
                  int var15 = var14.indexOf(".java:");
                  if (var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
                     var5 = var5 + var14 + ' ';
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(32) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var5 = var5 + var11 + ' ';
            }
         }

         if (var0 != null) {
            if (var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         var1.printStackTrace();
         if (class164.field2178 == null) {
            return;
         }

         URL var17 = new URL(class164.field2178.getCodeBase(), "clienterror.ws?c=" + class164.field2179 + "&u=" + class164.field2176 + "&v1=" + class241.field2800 + "&v2=" + class166.field2195 + "&e=" + var3);
         DataInputStream var19 = new DataInputStream(var17.openStream());
         var19.read();
         var19.close();
      } catch (Exception var16) {
         ;
      }

   }

   public static void method3108(int var0) {
      try {
         if (class229.field2680 == 1) {
            int var1 = class229.field2679.method4145((short)30593);
            if (var1 > 0 && class229.field2679.method4169(-511562746)) {
               var1 -= class10.field249;
               if (var1 < 0) {
                  var1 = 0;
               }

               class229.field2679.method4144(var1, 833556516);
               return;
            }

            class229.field2679.method4150(512267976);
            class229.field2679.method4148(2106255181);
            if (class61.field714 != null) {
               class229.field2680 = 2;
            } else {
               class229.field2680 = 0;
            }

            class16.field292 = null;
            class12.field260 = null;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class229.field2679.method4150(1707249340);
         class229.field2680 = 0;
         class16.field292 = null;
         class12.field260 = null;
         class61.field714 = null;
      }

   }
}

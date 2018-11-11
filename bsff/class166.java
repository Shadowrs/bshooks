import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class166 implements Runnable {
   public static String field2195;
   boolean field2198 = false;
   class165 field2200 = null;
   Thread field2197;
   class165 field2196 = null;

   public class166() {
      class241.field2800 = "Unknown";
      field2195 = "1.6";

      try {
         class241.field2800 = System.getProperty("java.vendor");
         field2195 = System.getProperty("java.version");
      } catch (Exception var2) {
         ;
      }

      this.field2198 = false;
      this.field2197 = new Thread(this);
      this.field2197.setPriority(10);
      this.field2197.setDaemon(true);
      this.field2197.start();
   }

   final class165 method3232(int var1, int var2, int var3, Object var4, byte var5) {
      class165 var6 = new class165();
      var6.field2190 = var1;
      var6.field2185 = var2;
      var6.field2192 = var4;
      synchronized(this) {
         if (this.field2196 != null) {
            this.field2196.field2187 = var6;
            this.field2196 = var6;
         } else {
            this.field2196 = this.field2200 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final class165 method3230(Runnable var1, int var2, byte var3) {
      return this.method3232(2, var2, 0, var1, (byte)121);
   }

   public final void method3231(int var1) {
      synchronized(this) {
         this.field2198 = true;
         this.notifyAll();
      }

      try {
         this.field2197.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public final class165 method3243(String var1, int var2, int var3) {
      return this.method3232(1, var2, 0, var1, (byte)101);
   }

   public final void run() {
      while(true) {
         class165 var1;
         synchronized(this) {
            while(true) {
               if (this.field2198) {
                  return;
               }

               if (this.field2200 != null) {
                  var1 = this.field2200;
                  this.field2200 = this.field2200.field2187;
                  if (this.field2200 == null) {
                     this.field2196 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
                  ;
               }
            }
         }

         try {
            int var2 = var1.field2190;
            if (var2 == 1) {
               var1.field2193 = new Socket(InetAddress.getByName((String)var1.field2192), var1.field2185);
            } else if (var2 == 2) {
               Thread var3 = new Thread((Runnable)var1.field2192);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field2185);
               var1.field2193 = var3;
            } else if (var2 == 4) {
               var1.field2193 = new DataInputStream(((URL)var1.field2192).openStream());
            }

            var1.field2189 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field2189 = 2;
         }
      }
   }

   static final void method3246(byte var0) {
      if (!class132.field1914) {
         int var1 = class137.field2002;
         int var2 = class137.field2038;
         int var3 = class137.field2004;
         int var4 = class137.field2025;
         byte var5 = 50;
         short var6 = 3500;
         int var7 = (class132.field1912 - class134.field1942) * var5 / class134.field1941;
         int var8 = (class132.field1919 - class134.field1943) * var5 / class134.field1941;
         int var9 = (class132.field1912 - class134.field1942) * var6 / class134.field1941;
         int var10 = (class132.field1919 - class134.field1943) * var6 / class134.field1941;
         int var11 = class134.method2813(var8, var5, var2, var1);
         int var12 = class134.method2814(var8, var5, var2, var1);
         var8 = var11;
         var11 = class134.method2813(var10, var6, var2, var1);
         int var13 = class134.method2814(var10, var6, var2, var1);
         var10 = var11;
         var11 = class134.method2811(var7, var12, var4, var3);
         var12 = class134.method2812(var7, var12, var4, var3);
         var7 = var11;
         var11 = class134.method2811(var9, var13, var4, var3);
         var13 = class134.method2812(var9, var13, var4, var3);
         class132.field1915 = (var7 + var11) / 2;
         class107.field1570 = (var8 + var10) / 2;
         class132.field1918 = (var13 + var12) / 2;
         class18.field306 = (var11 - var7) / 2;
         class92.field1406 = (var10 - var8) / 2;
         class132.field1917 = (var13 - var12) / 2;
         class25.field357 = Math.abs(class18.field306);
         class98.field1470 = Math.abs(class92.field1406);
         class175.field2258 = Math.abs(class132.field1917);
      }

   }

   static final void method3245(int var0, int var1, int var2, int var3, class331 var4, class236 var5, int var6) {
      int var7 = var3 * var3 + var2 * var2;
      if (var7 > 4225 && var7 < 90000) {
         int var8 = client.field925 & 2047;
         int var9 = class134.field1955[var8];
         int var10 = class134.field1933[var8];
         int var11 = var10 * var2 + var3 * var9 >> 16;
         int var12 = var3 * var10 - var9 * var2 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.field2765 / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         class34.field447.method5887(var16 + (var0 + var5.field2765 / 2 - var18 / 2), var5.field2763 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         class4.method8(var0, var1, var2, var3, var4, var5, -1666033635);
      }

   }
}

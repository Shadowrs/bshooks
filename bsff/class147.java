import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class class147 implements Runnable {
   volatile boolean field2112;
   Queue field2114 = new LinkedList();
   Thread field2116 = new Thread(this);

   public class147() {
      this.field2116.setPriority(1);
      this.field2116.start();
   }

   public void method3102(int var1) {
      this.field2112 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field2116.join();
      } catch (InterruptedException var5) {
         ;
      }

   }

   public class148 method3101(URL var1, short var2) {
      class148 var3 = new class148(var1);
      synchronized(this) {
         this.field2114.add(var3);
         this.notify();
         return var3;
      }
   }

   public void run() {
      while(!this.field2112) {
         try {
            class148 var1;
            synchronized(this) {
               var1 = (class148)this.field2114.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var13) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;
            boolean var4 = false;

            try {
               try {
                  var4 = true;
                  var3 = var1.field2119.openConnection();
                  var3.setConnectTimeout(5000);
                  var3.setReadTimeout(5000);
                  var3.setUseCaches(false);
                  var3.setRequestProperty("Connection", "close");
                  int var5 = var3.getContentLength();
                  if (var5 >= 0) {
                     byte[] var6 = new byte[var5];
                     var2 = new DataInputStream(var3.getInputStream());
                     var2.readFully(var6);
                     var1.field2121 = var6;
                  }

                  var1.field2120 = true;
               } catch (IOException var14) {
                  var1.field2120 = true;
                  if (var2 != null) {
                     var2.close();
                  }

                  if (var3 != null) {
                     if (var3 instanceof HttpURLConnection) {
                        ((HttpURLConnection)var3).disconnect();
                        var4 = false;
                        continue;
                     }

                     var4 = false;
                     continue;
                  }

                  var4 = false;
                  continue;
               }

               if (var2 != null) {
                  var2.close();
               }

               if (var3 != null) {
                  if (var3 instanceof HttpURLConnection) {
                     ((HttpURLConnection)var3).disconnect();
                     var4 = false;
                  } else {
                     var4 = false;
                  }
               } else {
                  var4 = false;
               }
            } finally {
               if (var4) {
                  if (var2 != null) {
                     var2.close();
                  }

                  if (var3 != null && var3 instanceof HttpURLConnection) {
                     ((HttpURLConnection)var3).disconnect();
                  }
               }

            }
         } catch (Exception var17) {
            class148.method3113((String)null, var17, (byte)-103);
         }
      }

   }

   public static class169 method3107(Socket var0, int var1, int var2, int var3) throws IOException {
      return new class171(var0, var1, var2);
   }
}

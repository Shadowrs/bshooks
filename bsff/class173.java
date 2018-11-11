import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class class173 extends class169 implements Runnable {
   static int field2242;
   int field2243 = 0;
   boolean field2229 = false;
   int field2236 = 0;
   boolean field2238 = false;
   InputStream field2231;
   byte[] field2230;
   class165 field2232;
   int field2239;
   OutputStream field2234;
   class166 field2233;
   Socket field2235;
   int field2240;

   public class173(Socket var1, class166 var2, int var3) throws IOException {
      this.field2233 = var2;
      this.field2235 = var1;
      this.field2239 = var3;
      this.field2240 = var3 - 100;
      this.field2235.setSoTimeout(30000);
      this.field2235.setTcpNoDelay(true);
      this.field2235.setReceiveBufferSize(65536);
      this.field2235.setSendBufferSize(65536);
      this.field2231 = this.field2235.getInputStream();
      this.field2234 = this.field2235.getOutputStream();
   }

   void method3319(byte[] var1, int var2, int var3, byte var4) throws IOException {
      if (!this.field2229) {
         if (this.field2238) {
            this.field2238 = false;
            throw new IOException();
         }

         if (this.field2230 == null) {
            this.field2230 = new byte[this.field2239];
         }

         synchronized(this) {
            for(int var6 = 0; var6 < var3; ++var6) {
               this.field2230[this.field2243] = var1[var6 + var2];
               this.field2243 = (this.field2243 + 1) % this.field2239;
               if ((this.field2240 + this.field2236) % this.field2239 == this.field2243) {
                  throw new IOException();
               }
            }

            if (this.field2232 == null) {
               this.field2232 = this.field2233.method3230(this, 3, (byte)-7);
            }

            this.notifyAll();
         }
      }

   }

   public void vmethod3325(int var1) {
      if (!this.field2229) {
         synchronized(this) {
            this.field2229 = true;
            this.notifyAll();
         }

         if (this.field2232 != null) {
            while(this.field2232.field2189 == 0) {
               class163.method3223(1L);
            }

            if (this.field2232.field2189 == 1) {
               try {
                  ((Thread)this.field2232.field2193).join();
               } catch (InterruptedException var4) {
                  ;
               }
            }
         }

         this.field2232 = null;
      }

   }

   public boolean vmethod3338(int var1, byte var2) throws IOException {
      return this.field2229 ? false : this.field2231.available() >= var1;
   }

   public int vmethod3318(byte[] var1, int var2, int var3, int var4) throws IOException {
      if (this.field2229) {
         return 0;
      } else {
         int var5;
         int var6;
         for(var5 = var3; var3 > 0; var3 -= var6) {
            var6 = this.field2231.read(var1, var2, var3);
            if (var6 <= 0) {
               throw new EOFException();
            }

            var2 += var6;
         }

         return var5;
      }
   }

   public void vmethod3320(byte[] var1, int var2, int var3, int var4) throws IOException {
      this.method3319(var1, var2, var3, (byte)32);
   }

   public int vmethod3316(int var1) throws IOException {
      return this.field2229 ? 0 : this.field2231.available();
   }

   public int vmethod3315(int var1) throws IOException {
      return this.field2229 ? 0 : this.field2231.read();
   }

   protected void finalize() {
      this.vmethod3325(-2129176068);
   }

   public void run() {
      try {
         while(true) {
            label84: {
               int var1;
               int var2;
               synchronized(this) {
                  if (this.field2243 == this.field2236) {
                     if (this.field2229) {
                        break label84;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var9) {
                        ;
                     }
                  }

                  var1 = this.field2236;
                  if (this.field2243 >= this.field2236) {
                     var2 = this.field2243 - this.field2236;
                  } else {
                     var2 = this.field2239 - this.field2236;
                  }
               }

               if (var2 <= 0) {
                  continue;
               }

               try {
                  this.field2234.write(this.field2230, var1, var2);
               } catch (IOException var8) {
                  this.field2238 = true;
               }

               this.field2236 = (var2 + this.field2236) % this.field2239;

               try {
                  if (this.field2243 == this.field2236) {
                     this.field2234.flush();
                  }
               } catch (IOException var7) {
                  this.field2238 = true;
               }
               continue;
            }

            try {
               if (this.field2231 != null) {
                  this.field2231.close();
               }

               if (this.field2234 != null) {
                  this.field2234.close();
               }

               if (this.field2235 != null) {
                  this.field2235.close();
               }
            } catch (IOException var6) {
               ;
            }

            this.field2230 = null;
            break;
         }
      } catch (Exception var11) {
         class148.method3113((String)null, var11, (byte)-55);
      }

   }

   static String method3342(int var0, byte var1) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   static final void method3339(boolean var0, int var1) {
      class33.method384(-925697843);
      ++client.field902.field1481;
      if (client.field902.field1481 >= 50 || var0) {
         client.field902.field1481 = 0;
         if (!client.field904 && client.field902.method2052(1059636680) != null) {
            class184 var2 = class141.method3078(class181.field2412, client.field902.field1475, (byte)-16);
            client.field902.method2036(var2, (byte)69);

            try {
               client.field902.method2035(1299317042);
            } catch (IOException var4) {
               client.field904 = true;
            }
         }
      }

   }

   public static void method3341(String[] var0, short[] var1, int var2) {
      class138.method3065(var0, var1, 0, var0.length - 1, (byte)1);
   }

   public static int method3340(char var0, int var1, byte var2) {
      int var3 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = (var0 << 4) + 1;
      }

      return var3;
   }
}

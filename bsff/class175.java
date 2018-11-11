import java.io.IOException;
import java.io.OutputStream;

public class class175 implements Runnable {
   static int field2258;
   boolean field2257;
   IOException field2254;
   int field2251 = 0;
   OutputStream field2250;
   Thread field2256;
   int field2255 = 0;
   int field2252;
   byte[] field2253;

   class175(OutputStream var1, int var2) {
      this.field2250 = var1;
      this.field2252 = var2 + 1;
      this.field2253 = new byte[this.field2252];
      this.field2256 = new Thread(this);
      this.field2256.setDaemon(true);
      this.field2256.start();
   }

   void method3355(byte[] var1, int var2, int var3, int var4) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (this.field2254 != null) {
               throw new IOException(this.field2254.toString());
            } else {
               int var6;
               if (this.field2251 <= this.field2255) {
                  var6 = this.field2252 - this.field2255 + this.field2251 - 1;
               } else {
                  var6 = this.field2251 - this.field2255 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + this.field2255 <= this.field2252) {
                     System.arraycopy(var1, var2, this.field2253, this.field2255, var3);
                  } else {
                     int var7 = this.field2252 - this.field2255;
                     System.arraycopy(var1, var2, this.field2253, this.field2255, var7);
                     System.arraycopy(var1, var7 + var2, this.field2253, 0, var3 - var7);
                  }

                  this.field2255 = (var3 + this.field2255) % this.field2252;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method3353(int var1) {
      synchronized(this) {
         this.field2257 = true;
         this.notifyAll();
      }

      try {
         this.field2256.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   boolean method3354(int var1) {
      if (this.field2257) {
         try {
            this.field2250.close();
            if (this.field2254 == null) {
               this.field2254 = new IOException("");
            }
         } catch (IOException var3) {
            if (this.field2254 == null) {
               this.field2254 = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      while(true) {
         synchronized(this){}

         while(true) {
            boolean var13 = false;

            int var1;
            try {
               var13 = true;
               if (this.field2254 != null) {
                  return;
               }

               if (this.field2251 <= this.field2255) {
                  var1 = this.field2255 - this.field2251;
               } else {
                  var1 = this.field2252 - this.field2251 + this.field2255;
               }

               if (var1 <= 0) {
                  try {
                     this.field2250.flush();
                  } catch (IOException var17) {
                     this.field2254 = var17;
                     return;
                  }

                  if (this.method3354(1670459788)) {
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var18) {
                     ;
                  }
                  continue;
               }

               var13 = false;
            } finally {
               if (var13) {
                  ;
               }
            }

            try {
               if (var1 + this.field2251 <= this.field2252) {
                  this.field2250.write(this.field2253, this.field2251, var1);
               } else {
                  int var2 = this.field2252 - this.field2251;
                  this.field2250.write(this.field2253, this.field2251, var2);
                  this.field2250.write(this.field2253, 0, var1 - var2);
               }
            } catch (IOException var16) {
               IOException var3 = var16;
               synchronized(this) {
                  this.field2254 = var3;
                  return;
               }
            }

            synchronized(this) {
               this.field2251 = (var1 + this.field2251) % this.field2252;
            }

            if (!this.method3354(1670459788)) {
               break;
            }

            return;
         }
      }
   }

   public static class180[] method3366(int var0) {
      return new class180[]{class180.field2302, class180.field2286, class180.field2360, class180.field2332, class180.field2310, class180.field2300, class180.field2291, class180.field2289, class180.field2293, class180.field2294, class180.field2295, class180.field2316, class180.field2297, class180.field2298, class180.field2299, class180.field2356, class180.field2301, class180.field2361, class180.field2334, class180.field2304, class180.field2305, class180.field2322, class180.field2307, class180.field2308, class180.field2341, class180.field2313, class180.field2290, class180.field2312, class180.field2342, class180.field2314, class180.field2350, class180.field2285, class180.field2317, class180.field2346, class180.field2319, class180.field2320, class180.field2321, class180.field2288, class180.field2323, class180.field2324, class180.field2309, class180.field2326, class180.field2327, class180.field2296, class180.field2329, class180.field2330, class180.field2331, class180.field2292, class180.field2333, class180.field2306, class180.field2335, class180.field2336, class180.field2337, class180.field2363, class180.field2339, class180.field2340, class180.field2287, class180.field2315, class180.field2343, class180.field2344, class180.field2345, class180.field2325, class180.field2347, class180.field2348, class180.field2349, class180.field2328, class180.field2351, class180.field2352, class180.field2353, class180.field2354, class180.field2355, class180.field2366, class180.field2357, class180.field2358, class180.field2359, class180.field2303, class180.field2318, class180.field2362, class180.field2311, class180.field2364, class180.field2365, class180.field2338, class180.field2367, class180.field2368, class180.packet84};
   }

   static class89[] method3365(int var0) {
      return new class89[]{class89.field1331, class89.field1336, class89.field1334, class89.field1332};
   }
}

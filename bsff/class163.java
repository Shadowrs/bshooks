import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class163 implements Runnable {
   IOException field2174;
   int field2168 = 0;
   int field2172 = 0;
   int field2170;
   byte[] field2173;
   InputStream field2169;
   Thread field2171;

   class163(InputStream var1, int var2) {
      this.field2169 = var1;
      this.field2170 = var2 + 1;
      this.field2173 = new byte[this.field2170];
      this.field2171 = new Thread(this);
      this.field2171.setDaemon(true);
      this.field2171.start();
   }

   boolean method3207(int var1, short var2) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.field2170) {
         synchronized(this) {
            int var4;
            if (this.field2172 <= this.field2168) {
               var4 = this.field2168 - this.field2172;
            } else {
               var4 = this.field2170 - this.field2172 + this.field2168;
            }

            if (var4 < var1) {
               if (this.field2174 != null) {
                  throw new IOException(this.field2174.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method3211(int var1) throws IOException {
      synchronized(this) {
         if (this.field2168 == this.field2172) {
            if (this.field2174 != null) {
               throw new IOException(this.field2174.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.field2173[this.field2172] & 255;
            this.field2172 = (this.field2172 + 1) % this.field2170;
            this.notifyAll();
            return var3;
         }
      }
   }

   int method3208(int var1) throws IOException {
      synchronized(this) {
         int var3;
         if (this.field2172 <= this.field2168) {
            var3 = this.field2168 - this.field2172;
         } else {
            var3 = this.field2170 - this.field2172 + this.field2168;
         }

         if (var3 <= 0 && this.field2174 != null) {
            throw new IOException(this.field2174.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   int method3210(byte[] var1, int var2, int var3, int var4) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var6;
            if (this.field2172 <= this.field2168) {
               var6 = this.field2168 - this.field2172;
            } else {
               var6 = this.field2170 - this.field2172 + this.field2168;
            }

            if (var3 > var6) {
               var3 = var6;
            }

            if (var3 == 0 && this.field2174 != null) {
               throw new IOException(this.field2174.toString());
            } else {
               if (var3 + this.field2172 <= this.field2170) {
                  System.arraycopy(this.field2173, this.field2172, var1, var2, var3);
               } else {
                  int var7 = this.field2170 - this.field2172;
                  System.arraycopy(this.field2173, this.field2172, var1, var2, var7);
                  System.arraycopy(this.field2173, 0, var1, var7 + var2, var3 - var7);
               }

               this.field2172 = (var3 + this.field2172) % this.field2170;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method3222(int var1) {
      synchronized(this) {
         if (this.field2174 == null) {
            this.field2174 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field2171.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field2174 != null) {
                  return;
               }

               if (this.field2172 == 0) {
                  var1 = this.field2170 - this.field2168 - 1;
               } else if (this.field2172 <= this.field2168) {
                  var1 = this.field2170 - this.field2168;
               } else {
                  var1 = this.field2172 - this.field2168 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
                  ;
               }
            }
         }

         int var2;
         try {
            var2 = this.field2169.read(this.field2173, this.field2168, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var4 = var11;
            synchronized(this) {
               this.field2174 = var4;
               return;
            }
         }

         synchronized(this) {
            this.field2168 = (var2 + this.field2168) % this.field2170;
         }
      }
   }

   public static final void method3223(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            class193.method3499(var0 - 1L);
            class193.method3499(1L);
         } else {
            class193.method3499(var0);
         }
      }

   }

   static class182[] method3220(int var0) {
      return new class182[]{class182.field2477, class182.field2474, class182.field2473, class182.field2475};
   }

   public static void method3224(class169 var0, boolean var1, int var2) {
      if (class264.field3412 != null) {
         try {
            class264.field3412.vmethod3325(-1714058500);
         } catch (Exception var8) {
            ;
         }

         class264.field3412 = null;
      }

      class264.field3412 = var0;
      class189.method3481(var1, 1337667639);
      class264.field3415.field2565 = 0;
      class82.field1294 = null;
      class202.field2604 = null;
      class264.field3416 = 0;

      while(true) {
         class260 var3 = (class260)class264.field3408.method3962();
         if (var3 == null) {
            while(true) {
               var3 = (class260)class264.field3407.method3962();
               if (var3 == null) {
                  if (class264.field3420 != 0) {
                     try {
                        class194 var4 = new class194(4);
                        var4.addByte(4, (byte)-76);
                        var4.addByte(class264.field3420, (byte)-63);
                        var4.addShort(0, 563780204);
                        class264.field3412.vmethod3320(var4.field2566, 0, 4, -1130563356);
                     } catch (IOException var7) {
                        try {
                           class264.field3412.vmethod3325(-2018790027);
                        } catch (Exception var6) {
                           ;
                        }

                        ++class264.field3422;
                        class264.field3412 = null;
                     }
                  }

                  class264.field3410 = 0;
                  class264.field3413 = class6.method28(1358803598);
                  return;
               }

               class264.field3411.method3878(var3);
               class264.field3421.method3972(var3, var3.field2644);
               ++class264.field3409;
               --class264.field3414;
            }
         }

         class264.field3406.method3972(var3, var3.field2644);
         ++class264.field3404;
         --class264.field3403;
      }
   }
}

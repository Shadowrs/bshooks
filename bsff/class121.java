import java.awt.FontMetrics;
import java.io.EOFException;
import java.io.IOException;

public class class121 {
   static FontMetrics field1676;
   long field1682;
   int field1681;
   long field1683;
   long field1678 = -1L;
   long field1674;
   long field1675 = -1L;
   class122 field1684;
   int field1679 = 0;
   byte[] field1677;
   byte[] field1673;
   long field1680;

   public class121(class122 var1, int var2, int var3) throws IOException {
      this.field1684 = var1;
      this.field1682 = this.field1680 = var1.method2537(-1746347508);
      this.field1673 = new byte[var2];
      this.field1677 = new byte[var3];
      this.field1674 = 0L;
   }

   public void method2507(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != this.field1678 && this.field1674 >= this.field1678 && (long)var3 + this.field1674 <= this.field1678 + (long)this.field1679) {
            System.arraycopy(this.field1677, (int)(this.field1674 - this.field1678), var1, var2, var3);
            this.field1674 += (long)var3;
            return;
         }

         long var5 = this.field1674;
         int var7 = var3;
         int var8;
         if (this.field1674 >= this.field1675 && this.field1674 < (long)this.field1681 + this.field1675) {
            var8 = (int)((long)this.field1681 - (this.field1674 - this.field1675));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field1673, (int)(this.field1674 - this.field1675), var1, var2, var8);
            this.field1674 += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.field1673.length) {
            this.field1684.method2533(this.field1674);

            for(this.field1683 = this.field1674; var3 > 0; var3 -= var8) {
               var8 = this.field1684.method2538(var1, var2, var3, (byte)0);
               if (var8 == -1) {
                  break;
               }

               this.field1683 += (long)var8;
               this.field1674 += (long)var8;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.method2520(-1038370147);
            var8 = var3;
            if (var3 > this.field1681) {
               var8 = this.field1681;
            }

            System.arraycopy(this.field1673, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field1674 += (long)var8;
         }

         if (-1L != this.field1678) {
            if (this.field1678 > this.field1674 && var3 > 0) {
               var8 = var2 + (int)(this.field1678 - this.field1674);
               if (var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field1674;
               }
            }

            long var9 = -1L;
            long var11 = -1L;
            if (this.field1678 >= var5 && this.field1678 < var5 + (long)var7) {
               var9 = this.field1678;
            } else if (var5 >= this.field1678 && var5 < this.field1678 + (long)this.field1679) {
               var9 = var5;
            }

            if (this.field1678 + (long)this.field1679 > var5 && (long)this.field1679 + this.field1678 <= var5 + (long)var7) {
               var11 = (long)this.field1679 + this.field1678;
            } else if ((long)var7 + var5 > this.field1678 && (long)var7 + var5 <= (long)this.field1679 + this.field1678) {
               var11 = (long)var7 + var5;
            }

            if (var9 > -1L && var11 > var9) {
               int var13 = (int)(var11 - var9);
               System.arraycopy(this.field1677, (int)(var9 - this.field1678), var1, (int)(var9 - var5) + var2, var13);
               if (var11 > this.field1674) {
                  var3 = (int)((long)var3 - (var11 - this.field1674));
                  this.field1674 = var11;
               }
            }
         }
      } catch (IOException var14) {
         this.field1683 = -1L;
         throw var14;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void method2510(int var1) throws IOException {
      if (-1L != this.field1678) {
         if (this.field1678 != this.field1683) {
            this.field1684.method2533(this.field1678);
            this.field1683 = this.field1678;
         }

         this.field1684.method2534(this.field1677, 0, this.field1679, 1843411947);
         this.field1683 += 1544591387L * (long)(this.field1679 * -1627028973);
         if (this.field1683 > this.field1680) {
            this.field1680 = this.field1683;
         }

         long var2 = -1L;
         long var4 = -1L;
         if (this.field1678 >= this.field1675 && this.field1678 < (long)this.field1681 + this.field1675) {
            var2 = this.field1678;
         } else if (this.field1675 >= this.field1678 && this.field1675 < this.field1678 + (long)this.field1679) {
            var2 = this.field1675;
         }

         if ((long)this.field1679 + this.field1678 > this.field1675 && (long)this.field1679 + this.field1678 <= this.field1675 + (long)this.field1681) {
            var4 = this.field1678 + (long)this.field1679;
         } else if (this.field1675 + (long)this.field1681 > this.field1678 && (long)this.field1681 + this.field1675 <= (long)this.field1679 + this.field1678) {
            var4 = (long)this.field1681 + this.field1675;
         }

         if (var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.field1677, (int)(var2 - this.field1678), this.field1673, (int)(var2 - this.field1675), var6);
         }

         this.field1678 = -1L;
         this.field1679 = 0;
      }

   }

   public long method2531(int var1) {
      return this.field1682;
   }

   public void method2505(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field1674 = var1;
      }
   }

   public void method2508(byte[] var1, int var2, int var3, short var4) throws IOException {
      try {
         if (this.field1674 + (long)var3 > this.field1682) {
            this.field1682 = (long)var3 + this.field1674;
         }

         if (this.field1678 != -1L && (this.field1674 < this.field1678 || this.field1674 > this.field1678 + (long)this.field1679)) {
            this.method2510(-1804046235);
         }

         if (-1L != this.field1678 && (long)var3 + this.field1674 > this.field1678 + (long)this.field1677.length) {
            int var5 = (int)((long)this.field1677.length - (this.field1674 - this.field1678));
            System.arraycopy(var1, var2, this.field1677, (int)(this.field1674 - this.field1678), var5);
            this.field1674 += (long)var5;
            var2 += var5;
            var3 -= var5;
            this.field1679 = this.field1677.length;
            this.method2510(44277687);
         }

         if (var3 <= this.field1677.length) {
            if (var3 > 0) {
               if (this.field1678 == -1L) {
                  this.field1678 = this.field1674;
               }

               System.arraycopy(var1, var2, this.field1677, (int)(this.field1674 - this.field1678), var3);
               this.field1674 += (long)var3;
               if (this.field1674 - this.field1678 > (long)this.field1679) {
                  this.field1679 = (int)(this.field1674 - this.field1678);
               }
            }
         } else {
            if (this.field1674 != this.field1683) {
               this.field1684.method2533(this.field1674);
               this.field1683 = this.field1674;
            }

            this.field1684.method2534(var1, var2, var3, 1898524874);
            this.field1683 += (long)var3;
            if (this.field1683 > this.field1680) {
               this.field1680 = this.field1683;
            }

            long var11 = -1L;
            long var7 = -1L;
            if (this.field1674 >= this.field1675 && this.field1674 < (long)this.field1681 + this.field1675) {
               var11 = this.field1674;
            } else if (this.field1675 >= this.field1674 && this.field1675 < this.field1674 + (long)var3) {
               var11 = this.field1675;
            }

            if (this.field1674 + (long)var3 > this.field1675 && this.field1674 + (long)var3 <= (long)this.field1681 + this.field1675) {
               var7 = (long)var3 + this.field1674;
            } else if ((long)this.field1681 + this.field1675 > this.field1674 && this.field1675 + (long)this.field1681 <= (long)var3 + this.field1674) {
               var7 = (long)this.field1681 + this.field1675;
            }

            if (var11 > -1L && var7 > var11) {
               int var9 = (int)(var7 - var11);
               System.arraycopy(var1, (int)((long)var2 + var11 - this.field1674), this.field1673, (int)(var11 - this.field1675), var9);
            }

            this.field1674 += (long)var3;
         }

      } catch (IOException var10) {
         this.field1683 = -1L;
         throw var10;
      }
   }

   void method2520(int var1) throws IOException {
      this.field1681 = 0;
      if (this.field1683 != this.field1674) {
         this.field1684.method2533(this.field1674);
         this.field1683 = this.field1674;
      }

      int var2;
      for(this.field1675 = this.field1674; this.field1681 < this.field1673.length; this.field1681 += var2) {
         var2 = this.field1684.method2538(this.field1673, this.field1681, this.field1673.length - this.field1681, (byte)0);
         if (var2 == -1) {
            break;
         }

         this.field1683 += (long)var2;
      }

   }

   public void method2504(int var1) throws IOException {
      this.method2510(-692910301);
      this.field1684.method2535((byte)-39);
   }

   public void method2506(byte[] var1, int var2) throws IOException {
      this.method2507(var1, 0, var1.length, 2091856872);
   }

   public static void method2509(int var0, class261 var1, int var2, int var3, int var4, boolean var5, byte var6) {
      class229.field2680 = 1;
      class61.field714 = var1;
      class229.field2682 = var2;
      class152.field2129 = var3;
      class94.field1431 = var4;
      class313.field3910 = var5;
      class10.field249 = var0;
   }
}

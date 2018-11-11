import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class122 {
   static int field1686;
   long field1687;
   RandomAccessFile field1688;
   long field1689;

   public class122(File var1, String var2, long var3) throws IOException {
      if (-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() >= var3) {
         var1.delete();
      }

      this.field1688 = new RandomAccessFile(var1, var2);
      this.field1689 = var3;
      this.field1687 = 0L;
      int var5 = this.field1688.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field1688.seek(0L);
         this.field1688.write(var5);
      }

      this.field1688.seek(0L);
   }

   public final void method2539(boolean var1, int var2) throws IOException {
      if (this.field1688 != null) {
         if (var1) {
            try {
               this.field1688.getFD().sync();
            } catch (SyncFailedException var4) {
               ;
            }
         }

         this.field1688.close();
         this.field1688 = null;
      }

   }

   public final long method2537(int var1) throws IOException {
      return this.field1688.length();
   }

   public final void method2535(byte var1) throws IOException {
      this.method2539(false, -1001371329);
   }

   public final int method2538(byte[] var1, int var2, int var3, byte var4) throws IOException {
      int var5 = this.field1688.read(var1, var2, var3);
      if (var5 > 0) {
         this.field1687 += (long)var5;
      }

      return var5;
   }

   final void method2533(long var1) throws IOException {
      this.field1688.seek(var1);
      this.field1687 = var1;
   }

   public final void method2534(byte[] var1, int var2, int var3, int var4) throws IOException {
      if (this.field1687 + (long)var3 > this.field1689) {
         this.field1688.seek(this.field1689 + 1L);
         this.field1688.write(1);
         throw new EOFException();
      } else {
         this.field1688.write(var1, var2, var3);
         this.field1687 += (long)var3;
      }
   }

   protected void finalize() throws Throwable {
      if (this.field1688 != null) {
         System.out.println("");
         this.method2535((byte)-66);
      }

   }
}

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.Inflater;

public class GZIPDecompressor {

   static byte[][][] underlayFloorIds;
   Inflater anInflater639;


   GZIPDecompressor(int var1, int var2, int var3) {}

   public void method666(RSByteBuffer var1, byte[] var2, byte var3) {
      if(var1.buf[var1.position * 798331555] == 31 && -117 == var1.buf[var1.position * 798331555 + 1]) {
         if(this.anInflater639 == null) {
            this.anInflater639 = new Inflater(true);
         }

         try {
            this.anInflater639.setInput(var1.buf, var1.position * 798331555 + 10, var1.buf.length - (8 + 10 + var1.position * 798331555));
            this.anInflater639.inflate(var2);
         } catch (Exception var5) {
            this.anInflater639.reset();
            throw new RuntimeException("");
         }

         this.anInflater639.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   public GZIPDecompressor() {
      this(-1, 1000000, 1000000);
   }

   public static boolean method670(File var0, boolean var1, int var2) {
      try {
         RandomAccessFile raf = new RandomAccessFile(var0, "rw");
         int var4 = raf.read();
         raf.seek(0L);
         raf.write(var4);
         raf.seek(0L);
         raf.close();
         if(var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var5) {
         return false;
      }
   }
}

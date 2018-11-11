import java.io.File;
import java.io.RandomAccessFile;

public class class27 implements class200 {
   static class109 field382;
   static class27 field383 = new class27(0, (byte)0);
   static class27 field385 = new class27(3, (byte)3);
   static class27 field378 = new class27(2, (byte)1);
   static class27 field379 = new class27(1, (byte)2);
   public static String[] field380;
   byte field384;
   int field381;

   class27(int var1, byte var2) {
      this.field381 = var1;
      this.field384 = var2;
   }

   public int vmethod5837(int var1) {
      return this.field384;
   }

   public static int method240(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 <= '\u007f') {
            ++var3;
         } else if (var5 <= '\u07ff') {
            var3 += 2;
         } else {
            var3 += 3;
         }
      }

      return var3;
   }

   static class27[] method238(byte var0) {
      return new class27[]{field385, field383, field378, field379};
   }

   public static int method239(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }

   static final boolean method237(class131 var0, int var1, int var2, int var3, int var4) {
      boolean var5 = class132.field1916;
      if (!var5) {
         return false;
      } else {
         class166.method3246((byte)-32);
         int var6 = var0.field1873 + var1;
         int var7 = var2 + var0.field1874;
         int var8 = var3 + var0.field1875;
         int var9 = var0.field1876;
         int var10 = var0.field1877;
         int var11 = var0.field1878;
         int var12 = class132.field1915 - var6;
         int var13 = class107.field1570 - var7;
         int var14 = class132.field1918 - var8;
         return Math.abs(var12) > var9 + class25.field357 ? false : (Math.abs(var13) > var10 + class98.field1470 ? false : (Math.abs(var14) > var11 + class175.field2258 ? false : (Math.abs(var14 * class92.field1406 - var13 * class132.field1917) > var10 * class175.field2258 + var11 * class98.field1470 ? false : (Math.abs(var12 * class132.field1917 - var14 * class18.field306) > var11 * class25.field357 + var9 * class175.field2258 ? false : Math.abs(var13 * class18.field306 - var12 * class92.field1406) <= var9 * class98.field1470 + var10 * class25.field357))));
      }
   }

   public static File method229(String var0, byte var1) {
      if (!class170.field2220) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)class170.field2219.get(var0);
         if (var2 != null) {
            return var2;
         } else {
            File var3 = new File(class52.field624, var0);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if (!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  class170.field2219.put(var0, var3);
                  return var3;
               }
            } catch (Exception var8) {
               try {
                  if (var4 != null) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   static void method232(class263 var0, String var1, int var2) {
      class64 var3 = new class64(var0, var1);
      client.field1125.add(var3);
   }
}

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Loader$Unpacker {
   public Hashtable<String, byte[]> classBytes = new Hashtable();

   public Loader$Unpacker() {
   }

   public Loader$Unpacker(String var1, String var2) throws IOException {
      File var3 = new File(var2);
      var3.mkdirs();
      File var4 = new File(var1);
      ZipInputStream var5 = new ZipInputStream(new BufferedInputStream(new FileInputStream(var4)));
      byte[] var6 = new byte[262144];

      while(true) {
         while(true) {
            ZipEntry var7 = var5.getNextEntry();
            if (var7 == null) {
               var5.close();
               return;
            }

            String var8 = var7.getName();
            File var9 = new File(var3, var8);
            if (var7.isDirectory()) {
               var9.mkdirs();
            } else {
               BufferedOutputStream var10 = new BufferedOutputStream(new FileOutputStream(var9));

               while(true) {
                  int var11 = var5.read(var6);
                  if (var11 == -1) {
                     var10.close();
                     break;
                  }

                  var10.write(var6, 0, var11);
               }
            }
         }
      }
   }

   public Loader$Unpacker addArchive(byte[] var1) throws IOException {
      if (var1 == null) {
         return this;
      } else {
         ZipInputStream var2 = new ZipInputStream(new ByteArrayInputStream(var1));
         byte[] var3 = new byte[1024];

         while(true) {
            String var5;
            do {
               ZipEntry var4 = var2.getNextEntry();
               if (var4 == null) {
                  var2.close();
                  return this;
               }

               var5 = var4.getName();
            } while(!var5.endsWith(".class"));

            var5 = var5.substring(0, var5.length() - 6);
            var5 = var5.replace('/', '.');
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();

            while(true) {
               int var7 = var2.read(var3, 0, var3.length);
               if (var7 == -1) {
                  byte[] var8 = var6.toByteArray();
                  var6.close();
                  this.classBytes.put(var5, var8);
                  break;
               }

               var6.write(var3, 0, var7);
            }
         }
      }
   }

   public byte[] getClassBytes(String var1) {
      return (byte[])this.classBytes.remove(var1);
   }
}

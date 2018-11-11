import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.CRC32;

public class Loader$Download {
   public static final String CLIENT_ZIP = "osclient.dat";
   public static final String DATA_URL = "http://game.battle-scape.com/";

   public static byte[] get(String var0, String var1, String var2) throws IOException {
      HttpURLConnection var3 = null;
      BufferedInputStream var4 = null;
      Object var5 = null;

      byte[] var25;
      try {
         var3 = getURLConnetion(var0);
         int var6 = var3.getContentLength();
         if (var1 != null) {
            var1 = "Loading";
            var1 = var0.substring(var0.lastIndexOf("/"));
         }

         boolean var7 = var2 != null;
         var4 = new BufferedInputStream(var3.getInputStream());
         var5 = var7 ? new FileOutputStream(var2) : new ByteArrayOutputStream(var6);
         byte[] var8 = new byte[1024];

         int var9;
         String var12;
         for(int var10 = 0; (var9 = var4.read(var8)) != -1; drawText(var12)) {
            var10 += var9;
            ((OutputStream)var5).write(var8, 0, var9);
            int var11 = (int)((double)(var10 / var6) * 100.0D);
            if (var10 == var6) {
               drawText(var1 + " - Finished");
               break;
            }

            if (var6 / 1048576 > 1) {
               var12 = var1 + " - " + var11 + "% (" + var10 / 1048576 + "MB of " + var6 / 1048576 + "MB)";
            } else {
               var12 = var1 + " - " + var11 + "% (" + var10 / 1024 + "KB of " + var6 / 1024 + "KB)";
            }
         }

         var25 = !var7 ? ((ByteArrayOutputStream)var5).toByteArray() : null;
      } catch (IOException var23) {
         var23.printStackTrace();
         throw var23;
      } finally {
         try {
            var4.close();
         } catch (Exception var22) {
            ;
         }

         try {
            ((OutputStream)var5).close();
         } catch (Exception var21) {
            ;
         }

         if (var3 != null) {
            var3.disconnect();
         }

      }

      return var25;
   }

   public static byte[] checkFileVersion(String var0, String var1, String var2, boolean var3) {
      return checkFileVersion(var0, var1, var1, var2, var3);
   }

   public static byte[] checkFileVersion(String var0, String var1, String var2, String var3, boolean var4) {
      String var5 = var0 + var1;
      byte[] var6 = readFile(var5);
      String var7 = "http://game.battle-scape.com/" + var2;
      int var8 = 0;
      if (var6 != null) {
         CRC32 var9 = new CRC32();
         var9.update(var6);
         var8 = (int)var9.getValue();
      }

      int var14 = -1;

      try {
         var14 = getCurrentCRC(var7);
      } catch (Exception var13) {
         var13.printStackTrace();
         Loader.showMessageDialog("Unable to load CRC from website: " + var13.getMessage());
      }

      if (var14 != -1 && var8 != var14) {
         try {
            byte[] var10 = get(var7, var3, (String)null);
            var6 = new byte[var10.length - 4];
            System.arraycopy(var10, 4, var6, 0, var6.length);
            writeFile(var5, var6);
            if (var4) {
               String var11 = var5.replace(".zip", "").replace(".dat", "");
               deleteDir(new File(var11));
               new Loader$Unpacker(var5, var0);
            }
         } catch (Exception var12) {
            var12.printStackTrace();
            Loader.showMessageDialog("Unable to download " + var2 + ": " + var12.getMessage());
         }
      }

      return var6;
   }

   public static int getCurrentCRC(String var0) throws IOException {
      HttpURLConnection var1 = null;
      BufferedInputStream var2 = null;

      int var4;
      try {
         var1 = getURLConnetion(var0);
         var2 = new BufferedInputStream(var1.getInputStream());
         byte[] var3 = new byte[4];
         var2.read(var3, 0, var3.length);
         var2.close();
         var4 = ((var3[0] & 255) << 24) + ((var3[1] & 255) << 16) + ((var3[2] & 255) << 8) + (var3[3] & 255);
      } catch (Exception var13) {
         var13.printStackTrace();
         throw new IOException("Unable to load CRC version from website");
      } finally {
         try {
            var2.close();
         } catch (Exception var12) {
            ;
         }

         if (var1 != null) {
            var1.disconnect();
         }

      }

      return var4;
   }

   public static HttpURLConnection getURLConnetion(String var0) throws IOException {
      URL var1 = new URL(var0);
      HttpURLConnection var2 = (HttpURLConnection)var1.openConnection();
      var2.setRequestMethod("GET");
      var2.setRequestProperty("Connection", "close");
      var2.setConnectTimeout(15000);
      var2.setReadTimeout(15000);
      var2.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:49.0) Gecko/20100101 Firefox/49.0");
      var2.connect();
      int var3 = var2.getResponseCode();
      if (var3 != 200) {
         System.out.println("Invalid response code from website: " + var3);
      }

      return var2;
   }

   public static File findDir(String var0, String var1) {
      File[] var2 = (new File(var0)).listFiles();
      File[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         File var6 = var3[var5];
         if (var6.getName().startsWith(var1)) {
            return var6;
         }
      }

      return null;
   }

   public static byte[] readFile(String var0) {
      return readFile(new File(var0));
   }

   public static byte[] readFile(File var0) {
      DataInputStream var1 = null;

      try {
         var1 = new DataInputStream(new BufferedInputStream(new FileInputStream(var0)));
         byte[] var2 = new byte[(int)var0.length()];
         var1.readFully(var2);
         var1.close();
         byte[] var3 = var2;
         return var3;
      } catch (Exception var13) {
         ;
      } finally {
         try {
            var1.close();
         } catch (Exception var12) {
            ;
         }

      }

      return null;
   }

   public static void writeFile(String var0, byte[] var1) {
      DataOutputStream var2 = null;

      try {
         var2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(var0))));
         var2.write(var1);
         var2.close();
      } catch (Exception var12) {
         var12.printStackTrace();
      } finally {
         try {
            var2.close();
         } catch (Exception var11) {
            ;
         }

      }

   }

   public static void deleteDir(File var0) {
      File[] var1 = var0.listFiles();
      if (var1 != null) {
         File[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            File var5 = var2[var4];
            deleteDir(var5);
         }
      }

      var0.delete();
   }

   public static void drawText(String var0) {
      Font var1 = new Font("Helvetica", 1, 13);
      FontMetrics var2 = Loader.instance.getFontMetrics(var1);
      Graphics var3 = Loader.instance.getGraphics();
      if (var3 != null) {
         var3.setColor(Color.black);
         var3.fillRect(0, 0, Loader.instance.getSize().width, Loader.instance.getSize().height);
         var3.setColor(new Color(9179409));
         var3.drawRect(Loader.instance.getSize().width / 2 - 152, Loader.instance.getSize().height / 2 - 18, 303, 33);
         var3.setFont(var1);
         var3.setColor(Color.white);
         var3.drawString(var0, (Loader.instance.getSize().width - var2.stringWidth(var0)) / 2, Loader.instance.getSize().height / 2 + 4);
         var3.dispose();
      }

   }
}

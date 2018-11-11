import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.Dimension;
import java.awt.Frame;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.JOptionPane;

public class Loader extends Applet implements AppletStub, Runnable {
   public static final int LOADER_VERSION = 3;
   public static final boolean LOCAL_LOADER = true;
   public static final boolean CONNECT_OSRS = false;
   public static final Dimension DEFAULT_SIZE = new Dimension(765, 503);
   private static final Map<String, String> PARAMS = new Hashtable();
   public static Frame frame;
   public static Loader instance;
   public static Applet clientApplet;

   public Loader() {
      instance = this;
      this.setStub(instance);
      this.setPreferredSize(DEFAULT_SIZE);
   }

   public String getParameter(String var1) {
      return (String)PARAMS.get(var1);
   }

   public URL getDocumentBase() {
      return this.getCodeBase();
   }

   public URL getCodeBase() {
      try {
         return new URL("http://127.0.0.1");
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   public void appletResize(int var1, int var2) {
   }

   public AppletContext getAppletContext() {
      return null;
   }

   public boolean isActive() {
      return true;
   }

   public void run() {
      while(super.getWidth() == 0 || super.getHeight() == 0) {
         ;
      }

      this.startClient();
   }

   public void init() {
      (new Thread(this)).start();
   }

   public void startClient() {
      try {
         Object var1 = null;
         String var2 = findCacheDir();
         if (var2 == null) {
            showMessageDialog("Unable to setup a cache directory!");
            return;
         }

         Class var3 = Class.forName("client");
         clientApplet = (Applet)var3.newInstance();
         clientApplet.setStub(instance);
         clientApplet.setPreferredSize(DEFAULT_SIZE);
         if (frame != null) {
            frame.setVisible(false);
            frame.remove(instance);
            frame.add(clientApplet);
            frame.pack();
            frame.setVisible(true);
         } else {
            this.add(clientApplet);
         }

         clientApplet.init();
         clientApplet.start();
      } catch (Exception var4) {
         var4.printStackTrace();
         showMessageDialog("SC Error: " + var4.getMessage());
      }

   }

   public static String getOSName() {
      String var0;
      try {
         var0 = System.getProperty("os.name");
      } catch (Exception var2) {
         var2.printStackTrace();
         var0 = "Unknown";
      }

      var0 = var0.toLowerCase();
      return var0;
   }

   public static String findCacheDir() {
      String var0 = getOSName();
      String var1 = null;

      try {
         var1 = System.getProperty("user.home");
      } catch (Exception var5) {
         ;
      }

      try {
         if (var0.startsWith("win")) {
            if (var1 == null) {
               var1 = System.getenv("USERPROFILE");
            }
         } else if (var1 == null) {
            var1 = System.getenv("HOME");
         }
      } catch (Exception var4) {
         ;
      }

      if (var1 == null) {
         var1 = "~/";
      }

      if (var1 != null && !var1.endsWith(Character.toString(File.separatorChar))) {
         var1 = var1 + File.separatorChar;
      }

      String var2 = null;
      if (var2 == null) {
         var2 = var1 + "battlescape" + File.separatorChar + "oldschool" + File.separatorChar + "LIVE" + File.separatorChar;
      }

      File var3 = new File(var2);
      if (!var3.exists()) {
         var3.mkdirs();
      }

      return var2;
   }

   public static boolean redeployed() {
      try {
         String var0 = getOSName();
         String var1 = (new File(Loader.class.getProtectionDomain().getCodeSource().getLocation().getPath())).getName();
         var1 = var1.replace("%20", " ");
         String[] var2 = new String[]{"java"};
         String var3 = System.getProperty("java.home");
         if (var0.startsWith("win") && var3 != null && var3.length() > 0) {
            var2 = new String[]{var3 + "/bin/java.exe"};
         }

         if (var2 != null) {
            String var4 = "-Xmx512m -Xss2m -Dsun.java2d.noddraw=true -Dsun.java2d.dpiaware=false -XX:CompileThreshold=1500 -XX:+UseConcMarkSweepGC -XX:+UseParNewGC";
            String[] var5 = var4.split(" ");
            String[] var6 = new String[var2.length + var5.length + 3];
            System.arraycopy(var2, 0, var6, 0, var2.length);
            System.arraycopy(var5, 0, var6, var2.length, var5.length);
            var6[var6.length - 3] = "-jar";
            var6[var6.length - 2] = var1;
            var6[var6.length - 1] = "-redeployed";
            Process var7 = Runtime.getRuntime().exec(var6);
            InputStream var8 = var7.getInputStream();
            int var9 = 0;

            while(var8.available() < 10 && var9++ < 50) {
               try {
                  Thread.sleep(50L);
               } catch (Exception var12) {
                  ;
               }
            }

            if (var8.available() <= 0) {
               throw new Exception("Nothing available from new process");
            }

            byte[] var10 = new byte[var8.available()];
            var8.read(var10);
            String var11 = new String(var10);
            if (!var11.contains("-deployed-")) {
               showMessageDialog("Opt. Error 1:" + var11);
               return false;
            }

            return true;
         }

         showMessageDialog("Opt. Error 2:" + var0);
      } catch (Exception var13) {
         var13.printStackTrace();
         showMessageDialog("Opt. Error 2: " + var13.getMessage());
      }

      return false;
   }

   public static void showMessageDialog(String var0) {
      if (frame.isVisible()) {
         JOptionPane.showMessageDialog(frame, var0);
      }

   }

   public static void writeTextFile(String var0, String... var1) {
      BufferedWriter var2 = null;

      try {
         var2 = new BufferedWriter(new FileWriter(new File(var0)));
         String[] var3 = var1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            var2.write(var6);
            var2.newLine();
         }
      } catch (IOException var15) {
         ;
      } finally {
         try {
            var2.close();
         } catch (Exception var14) {
            ;
         }

      }

   }

   public static synchronized void log(String var0) {
      try {
         System.out.println(var0);
         BufferedWriter var1 = new BufferedWriter(new FileWriter("./log.txt", true));
         var1.write(var0);
         var1.newLine();
         var1.close();
      } catch (IOException var2) {
         ;
      }

   }

   public static void main(String[] var0) {
      if (var0 != null && var0.length != 0 && !var0[0].equals("-redeployed")) {
         ;
      }

      System.out.println("-deployed-");
      frame = new Frame("BattleScape");
      frame.addWindowListener(new Loader$1());
      Loader var1 = new Loader();
      frame.setResizable(true);
      frame.add(var1);
      frame.pack();
      frame.setVisible(true);
      var1.init();
      var1.start();
   }

   static {
      PARAMS.put("11", "0");
      PARAMS.put("12", "true");
      PARAMS.put("13", "");
      PARAMS.put("14", "1");
      PARAMS.put("15", "0");
      PARAMS.put("16", "true");
      PARAMS.put("1", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
      PARAMS.put("2", "49669");
      PARAMS.put("3", "p1cxIGuofoIQPDzvIFDOawIZao205SgI4JDOroxQCWpmVFS9SHJwhA");
      PARAMS.put("4", "5");
      PARAMS.put("5", ".runescape.com");
      PARAMS.put("6", "33");
      PARAMS.put("7", "0");
      PARAMS.put("8", "1");
      PARAMS.put("9", "true");
      PARAMS.put("10", "0");
   }
}

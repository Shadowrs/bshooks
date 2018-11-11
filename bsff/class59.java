import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;

public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {
   static volatile boolean field687 = true;
   static class59 field658 = null;
   static boolean field686 = false;
   static int field661 = 0;
   static long field671 = 0L;
   static int field684 = 20;
   static long[] field664 = new long[32];
   static int field663 = 1;
   static long[] field667 = new long[32];
   protected static class166 field683;
   protected static int field666 = 0;
   static int field680 = 500;
   static long field689 = -1L;
   static long field690 = -1L;
   static int field668;
   static int field673;
   static GarbageCollectorMXBean field688;
   Clipboard field685;
   EventQueue field679;
   int field675;
   boolean field681 = false;
   class50 field659;
   int field660 = 0;
   boolean field662 = false;
   Frame field677;
   Canvas field678;
   int field657 = 0;
   int field676;
   protected int field669;
   volatile boolean field692 = true;
   int field672;
   protected int field670;
   int field674;
   volatile long field665 = 0L;
   volatile boolean field682 = false;

   protected class59() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.field679 = var1;
      class52 var2 = new class52();
      class21.field322 = var2;
   }

   public final void destroy() {
      if (this == field658 && !field686) {
         field671 = class6.method28(1358803598);
         class163.method3223(5000L);
         this.method894(-16711936);
      }

   }

   protected final boolean method989(int var1) {
      return true;
   }

   public final synchronized void paint(Graphics var1) {
      if (this == field658 && !field686) {
         this.field692 = true;
         if (class6.method28(1358803598) - this.field665 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= class287.field3765 && var2.height >= class45.field553) {
               this.field682 = true;
            }
         }
      }

   }

   class323 method903(int var1) {
      Container var2 = this.method895((byte)16);
      int var3 = Math.max(var2.getWidth(), this.field672);
      int var4 = Math.max(var2.getHeight(), this.field674);
      if (this.field677 != null) {
         Insets var5 = this.field677.getInsets();
         var3 -= var5.left + var5.right;
         var4 -= var5.bottom + var5.top;
      }

      return new class323(var3, var4);
   }

   Container method895(byte var1) {
      return (Container)(this.field677 != null ? this.field677 : this);
   }

   protected void method908(String var1, int var2) {
      if (!this.field662) {
         this.field662 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
            ;
         }
      }

   }

   final void method893(int var1) {
      this.field681 = true;
   }

   final synchronized void method894(int var1) {
      if (!field686) {
         field686 = true;

         try {
            this.field678.removeFocusListener(this);
         } catch (Exception var6) {
            ;
         }

         try {
            this.vmethod1200(-1577184348);
         } catch (Exception var5) {
            ;
         }

         if (this.field677 != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
               ;
            }
         }

         if (field683 != null) {
            try {
               field683.method3231(-1671380125);
            } catch (Exception var3) {
               ;
            }
         }

         this.vmethod1332((byte)5);
      }

   }

   final synchronized void method888(int var1) {
      Container var2 = this.method895((byte)103);
      if (this.field678 != null) {
         this.field678.removeFocusListener(this);
         var2.remove(this.field678);
      }

      class287.field3765 = Math.max(var2.getWidth(), this.field672);
      class45.field553 = Math.max(var2.getHeight(), this.field674);
      Insets var3;
      if (this.field677 != null) {
         var3 = this.field677.getInsets();
         class287.field3765 -= var3.right + var3.left;
         class45.field553 -= var3.bottom + var3.top;
      }

      this.field678 = new class54(this);
      var2.add(this.field678);
      this.field678.setSize(class287.field3765, class45.field553);
      this.field678.setVisible(true);
      this.field678.setBackground(Color.BLACK);
      if (var2 == this.field677) {
         var3 = this.field677.getInsets();
         this.field678.setLocation(this.field660 + var3.left, this.field657 + var3.top);
      } else {
         this.field678.setLocation(this.field660, this.field657);
      }

      this.field678.addFocusListener(this);
      this.field678.requestFocus();
      this.field692 = true;
      if (class324.field3941 != null && class287.field3765 == class324.field3941.field3960 && class45.field553 == class324.field3941.field3959) {
         ((class58)class324.field3941).method861(this.field678, -425265358);
         class324.field3941.vmethod5824(0, 0, 1667435857);
      } else {
         class324.field3941 = new class58(class287.field3765, class45.field553, this.field678);
      }

      this.field682 = false;
      this.field665 = class6.method28(1358803598);
   }

   protected abstract void vmethod1200(int var1);

   protected abstract void vmethod1197(int var1);

   final void method883(int var1) {
      Container var2 = this.method895((byte)96);
      if (var2 != null) {
         class323 var3 = this.method903(39023697);
         this.field669 = Math.max(var3.field3936, this.field672);
         this.field670 = Math.max(var3.field3937, this.field674);
         if (this.field669 <= 0) {
            this.field669 = 1;
         }

         if (this.field670 <= 0) {
            this.field670 = 1;
         }

         class287.field3765 = Math.min(this.field669, this.field675);
         class45.field553 = Math.min(this.field670, this.field676);
         this.field660 = (this.field669 - class287.field3765) / 2;
         this.field657 = 0;
         this.field678.setSize(class287.field3765, class45.field553);
         class324.field3941 = new class58(class287.field3765, class45.field553, this.field678);
         if (var2 == this.field677) {
            Insets var4 = this.field677.getInsets();
            this.field678.setLocation(var4.left + this.field660, this.field657 + var4.top);
         } else {
            this.field678.setLocation(this.field660, this.field657);
         }

         this.field692 = true;
         this.vmethod1266(779213061);
      }

   }

   protected abstract void vmethod1332(byte var1);

   protected final void method907(int var1) {
      class24.field348 = null;
      class174.field2249 = null;
      class121.field1676 = null;
   }

   void method891(int var1) {
      Container var2 = this.method895((byte)72);
      long var3 = class6.method28(1358803598);
      long var5 = field667[class173.field2242];
      field667[class173.field2242] = var3;
      class173.field2242 = class173.field2242 + 1 & 31;
      if (0L != var5 && var3 > var5) {
         int var7 = (int)(var3 - var5);
         field666 = ((var7 >> 1) + 32000) / var7;
      }

      if (++field680 - 1 > 50) {
         field680 -= 50;
         this.field692 = true;
         this.field678.setSize(class287.field3765, class45.field553);
         this.field678.setVisible(true);
         if (var2 == this.field677) {
            Insets var8 = this.field677.getInsets();
            this.field678.setLocation(var8.left + this.field660, var8.top + this.field657);
         } else {
            this.field678.setLocation(this.field660, this.field657);
         }
      }

      if (this.field682) {
         this.method921(2120795827);
      }

      this.method892(-1244876463);
      this.vmethod1199(this.field692, 1270270830);
      if (this.field692) {
         this.method885(2114903280);
      }

      this.field692 = false;
   }

   protected abstract void vmethod1198(int var1);

   protected final void method884(int var1, String var2, boolean var3, int var4) {
      try {
         Graphics var5 = this.field678.getGraphics();
         if (class174.field2249 == null) {
            class174.field2249 = new Font("Helvetica", 1, 13);
            class121.field1676 = this.field678.getFontMetrics(class174.field2249);
         }

         if (var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class287.field3765, class45.field553);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (class24.field348 == null) {
               class24.field348 = this.field678.createImage(304, 34);
            }

            Graphics var7 = class24.field348.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var7.setFont(class174.field2249);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class121.field1676.stringWidth(var2)) / 2, 22);
            var5.drawImage(class24.field348, class287.field3765 / 2 - 152, class45.field553 / 2 - 18, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = class287.field3765 / 2 - 152;
            int var9 = class45.field553 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, var9 + 1, 301, 31);
            var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
            var5.setFont(class174.field2249);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class121.field1676.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field678.repaint();
      }

   }

   void method927(int var1) {
      long var2 = class6.method28(1358803598);
      long var4 = field664[class79.field1251];
      field664[class79.field1251] = var2;
      class79.field1251 = class79.field1251 + 1 & 31;
      if (0L != var4 && var2 > var4) {
         ;
      }

      synchronized(this) {
         class40.field508 = field687;
      }

      this.vmethod1198(-299387202);
   }

   final void method877(Object var1, int var2) {
      if (this.field679 != null) {
         for(int var3 = 0; var3 < 50 && this.field679.peekEvent() != null; ++var3) {
            class163.method3223(1L);
         }

         if (var1 != null) {
            this.field679.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }
      }

   }

   protected final void method881(int var1) {
      if (class241.field2800.toLowerCase().indexOf("microsoft") != -1) {
         class51.field619[186] = 57;
         class51.field619[187] = 27;
         class51.field619[188] = 71;
         class51.field619[189] = 26;
         class51.field619[190] = 72;
         class51.field619[191] = 73;
         class51.field619[192] = 58;
         class51.field619[219] = 42;
         class51.field619[220] = 74;
         class51.field619[221] = 43;
         class51.field619[222] = 59;
         class51.field619[223] = 28;
      } else {
         class51.field619[44] = 71;
         class51.field619[45] = 26;
         class51.field619[46] = 72;
         class51.field619[47] = 73;
         class51.field619[59] = 57;
         class51.field619[61] = 27;
         class51.field619[91] = 42;
         class51.field619[92] = 74;
         class51.field619[93] = 43;
         class51.field619[192] = 28;
         class51.field619[222] = 58;
         class51.field619[520] = 59;
      }

      Canvas var2 = this.field678;
      var2.setFocusTraversalKeysEnabled(false);
      var2.addKeyListener(class51.field622);
      var2.addFocusListener(class51.field622);
   }

   protected final void method898(int var1) {
      class272.method4799(this.field678, (byte)12);
   }

   final void method921(int var1) {
      Canvas var2 = this.field678;
      var2.removeKeyListener(class51.field622);
      var2.removeFocusListener(class51.field622);
      class51.field610 = -1;
      class66.method1096(this.field678, (byte)0);
      if (this.field659 != null) {
         this.field659.method780(this.field678, -1973568755);
      }

      this.method888(-1310358534);
      Canvas var3 = this.field678;
      var3.setFocusTraversalKeysEnabled(false);
      var3.addKeyListener(class51.field622);
      var3.addFocusListener(class51.field622);
      class272.method4799(this.field678, (byte)-98);
      if (this.field659 != null) {
         this.field659.method781(this.field678, (byte)-96);
      }

      this.method893(-276359656);
   }

   protected class168 method878(int var1) {
      if (this.field659 == null) {
         this.field659 = new class50();
         this.field659.method781(this.field678, (byte)-112);
      }

      return this.field659;
   }

   final void method892(int var1) {
      class323 var2 = this.method903(-36406200);
      if (this.field669 != var2.field3936 || var2.field3937 != this.field670 || this.field681) {
         this.method883(1359016038);
         this.field681 = false;
      }

   }

   protected final void method899(int var1, int var2, byte var3) {
      if (this.field675 != var1 || var2 != this.field676) {
         this.method893(721886805);
      }

      this.field675 = var1;
      this.field676 = var2;
   }

   protected final void method887(int var1, int var2, int var3, byte var4) {
      try {
         if (field658 != null) {
            ++field661;
            if (field661 >= 3) {
               this.method908("alreadyloaded", -86437991);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field658 = this;
         class287.field3765 = var1;
         class45.field553 = var2;
         class164.field2179 = var3;
         class164.field2178 = this;
         if (field683 == null) {
            field683 = new class166();
         }

         field683.method3230(this, 1, (byte)-27);
      } catch (Exception var6) {
         class148.method3113((String)null, var6, (byte)-118);
         this.method908("crash", 433827828);
      }

   }

   protected abstract void vmethod1199(boolean var1, int var2);

   protected void method879(int var1) {
      this.field685 = this.getToolkit().getSystemClipboard();
   }

   protected abstract void vmethod1266(int var1);

   void method885(int var1) {
      int var2 = this.field660;
      int var3 = this.field657;
      int var4 = this.field669 - class287.field3765 - var2;
      int var5 = this.field670 - class45.field553 - var3;
      if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.method895((byte)59);
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.field677) {
               Insets var9 = this.field677.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if (var2 > 0) {
               var11.fillRect(var7, var8, var2, this.field670);
            }

            if (var3 > 0) {
               var11.fillRect(var7, var8, this.field669, var3);
            }

            if (var4 > 0) {
               var11.fillRect(var7 + this.field669 - var4, var8, var4, this.field670);
            }

            if (var5 > 0) {
               var11.fillRect(var7, var8 + this.field670 - var5, this.field669, var5);
            }
         } catch (Exception var10) {
            ;
         }
      }

   }

   protected void method902(String var1, byte var2) {
      this.field685.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected final boolean method988(int var1) {
      return this.field677 != null;
   }

   public void run() {
      try {
         if (class241.field2800 != null) {
            String var1 = class241.field2800.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class166.field2195;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method908("wrongjava", -1241225209);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class1.method0(var2.charAt(var3), (byte)-1); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if (class296.method5280(var4, (byte)0)) {
                     int var5 = class136.method2876(var4, 10, true, 1753435949);
                     if (var5 < 10) {
                        this.method908("wrongjava", 26503537);
                        return;
                     }
                  }
               }

               field663 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method888(-645526426);
         this.vmethod1197(-1009107514);
         class164.field2177 = class74.method1581((byte)-115);

         while(field671 == 0L || class6.method28(1358803598) < field671) {
            field668 = class164.field2177.vmethod3312(field684, field663, (byte)112);

            for(int var7 = 0; var7 < field668; ++var7) {
               this.method927(-1903590145);
            }

            this.method891(-1141037424);
            this.method877(this.field678, 533953574);
         }
      } catch (Exception var6) {
         class148.method3113((String)null, var6, (byte)-68);
         this.method908("crash", -1720412513);
      }

      this.method894(-16711936);
   }

   public final void stop() {
      if (this == field658 && !field686) {
         field671 = class6.method28(1358803598) + 4000L;
      }

   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void focusGained(FocusEvent var1) {
      field687 = true;
      this.field692 = true;
   }

   public final void focusLost(FocusEvent var1) {
      field687 = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public abstract void init();

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void start() {
      if (this == field658 && !field686) {
         field671 = 0L;
      }

   }
}

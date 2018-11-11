import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class60 implements MouseListener, MouseMotionListener, FocusListener {
   public static class60 field696 = new class60();
   public static volatile int field697 = 0;
   public static volatile int field702 = 0;
   public static volatile int field699 = -1;
   public static volatile int field705 = 0;
   public static int field708 = 0;
   public static volatile int field695 = -1;
   public static int field700 = 0;
   public static volatile int field706 = 0;
   public static int field693 = 0;
   public static int field701 = 0;
   public static int field711 = 0;
   public static int field710 = 0;
   public static volatile int field698 = 0;
   public static volatile long field707 = 0L;
   public static long field704 = 0L;

   final int method1029(MouseEvent var1, int var2) {
      int var3 = var1.getButton();
      return !var1.isAltDown() && var3 != 2 ? (!var1.isMetaDown() && var3 != 3 ? 1 : 2) : 4;
   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (field696 != null) {
         field697 = 0;
         field702 = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if (field696 != null) {
         field697 = 0;
         field699 = var1.getX();
         field695 = var1.getY();
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (field696 != null) {
         field697 = 0;
         field705 = var1.getX();
         field706 = var1.getY();
         field707 = class6.method28(1358803598);
         field698 = this.method1029(var1, -1985431927);
         if (field698 != 0) {
            field702 = field698;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if (field696 != null) {
         field697 = 0;
         field699 = var1.getX();
         field695 = var1.getY();
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (field696 != null) {
         field697 = 0;
         field699 = var1.getX();
         field695 = var1.getY();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field696 != null) {
         field702 = 0;
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (field696 != null) {
         field697 = 0;
         field699 = -1;
         field695 = -1;
      }

   }
}

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class50 implements class168, MouseWheelListener {
   int field592 = 0;

   void method781(Component var1, byte var2) {
      var1.addMouseWheelListener(this);
   }

   void method780(Component var1, int var2) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int vmethod3259(int var1) {
      int var2 = this.field592;
      this.field592 = 0;
      return var2;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field592 += var1.getWheelRotation();
   }
}

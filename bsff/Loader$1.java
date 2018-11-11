import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class Loader$1 extends WindowAdapter {
   public void windowClosing(WindowEvent var1) {
      Loader.frame.dispose();
      System.exit(0);
   }
}

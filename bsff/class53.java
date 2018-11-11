import java.applet.Applet;
import netscape.javascript.JSObject;

public class class53 {
   public static Object method815(Applet var0, String var1, Object[] var2, int var3) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   public static void method813(Applet var0, String var1, int var2) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }
}

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class class34 {
   static class331 field447;
   static class263 field445;
   static int field451;
   String field449;
   class24 field448;
   int field446;
   int field452;

   class34(String var1, int var2, int var3, class24 var4) {
      this.field449 = var1;
      this.field446 = var2;
      this.field452 = var3;
      this.field448 = var4;
   }

   static int method388(class261 var0, class261 var1, byte var2) {
      int var3 = 0;
      if (var0.method4637("title.jpg", "", -605638105)) {
         ++var3;
      }

      if (var1.method4637("logo", "", 1509368761)) {
         ++var3;
      }

      if (var1.method4637("logo_deadman_mode", "", 1810823109)) {
         ++var3;
      }

      if (var1.method4637("titlebox", "", 1257430984)) {
         ++var3;
      }

      if (var1.method4637("titlebutton", "", 1429185824)) {
         ++var3;
      }

      if (var1.method4637("runes", "", -465613524)) {
         ++var3;
      }

      if (var1.method4637("title_mute", "", 182502503)) {
         ++var3;
      }

      if (var1.method4637("options_radio_buttons,0", "", 596142902)) {
         ++var3;
      }

      if (var1.method4637("options_radio_buttons,2", "", 1375938541)) {
         ++var3;
      }

      if (var1.method4637("options_radio_buttons,4", "", 1617204899)) {
         ++var3;
      }

      if (var1.method4637("options_radio_buttons,6", "", 1736704516)) {
         ++var3;
      }

      var1.method4637("sl_back", "", -286276418);
      var1.method4637("sl_flags", "", 711244253);
      var1.method4637("sl_arrows", "", 2126936363);
      var1.method4637("sl_stars", "", 1148710);
      var1.method4637("sl_button", "", 993963337);
      return var3;
   }

   static long method387(byte var0) {
      try {
         URL var1 = new URL(class181.method3421("services", false, -1387746379) + "m=accountappeal/login.ws");
         URLConnection var2 = var1.openConnection();
         var2.setRequestProperty("connection", "close");
         var2.setDoInput(true);
         var2.setDoOutput(true);
         var2.setConnectTimeout(5000);
         OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
         var3.write("data1=req");
         var3.flush();
         InputStream var4 = var2.getInputStream();
         class194 var5 = new class194(new byte[1000]);

         do {
            int var6 = var4.read(var5.field2566, var5.field2565, 1000 - var5.field2565);
            if (var6 == -1) {
               var5.field2565 = 0;
               long var7 = var5.getLong(-1453443270);
               return var7;
            }

            var5.field2565 += var6;
         } while(var5.field2565 < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }
}

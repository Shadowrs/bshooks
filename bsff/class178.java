import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public abstract class class178 {
   public int field2283;
   public int field2282;
   public int field2280;
   public int field2281;

   protected abstract boolean vmethod3410(int var1, int var2, int var3, class176 var4, byte var5);

   static void method3415(class261 var0, class261 var1, boolean var2, int var3, int var4) {
      if (class90.field1345) {
         if (var3 == 4) {
            class90.field1355 = 4;
         }
      } else {
         class90.field1355 = var3;
         class327.method5798();
         byte[] var5 = var0.method4572("title.jpg", "", -103129885);
         BufferedImage var6 = null;

         class331 var7;
         int var8;
         label143: {
            try {
               var6 = ImageIO.read(new ByteArrayInputStream(var5));
               var8 = var6.getWidth();
               int var9 = var6.getHeight();
               int[] var10 = new int[var9 * var8];
               PixelGrabber var11 = new PixelGrabber(var6, 0, 0, var8, var9, var10, 0, var8);
               var11.grabPixels();
               var7 = new class331(var10, var8, var9);
               break label143;
            } catch (IOException var12) {
               ;
            } catch (InterruptedException var13) {
               ;
            }

            var7 = new class331(0, 0);
         }

         class317.field3926 = var7;
         class61.field715 = class317.field3926.method5924();
         if ((client.field858 & 536870912) != 0) {
            class90.field1341 = class44.method654(var1, "logo_deadman_mode", "", (byte)-8);
         } else {
            class90.field1341 = class44.method654(var1, "logo", "", (byte)-16);
         }

         class90.field1339 = class44.method654(var1, "titlebox", "", (byte)-57);
         class203.field2605 = class44.method654(var1, "titlebutton", "", (byte)-30);
         class90.field1347 = class199.method3774(var1, "runes", "", (byte)0);
         class38.field491 = class199.method3774(var1, "title_mute", "", (byte)0);
         class123.field1691 = class44.method654(var1, "options_radio_buttons,0", "", (byte)-60);
         class90.field1342 = class44.method654(var1, "options_radio_buttons,4", "", (byte)-12);
         class151.field2127 = class44.method654(var1, "options_radio_buttons,2", "", (byte)-6);
         class304.field3848 = class44.method654(var1, "options_radio_buttons,6", "", (byte)-123);
         class90.field1363 = class123.field1691.field3971;
         class30.field415 = class123.field1691.field3972;
         class38.field489 = new int[256];

         for(var8 = 0; var8 < 64; ++var8) {
            class38.field489[var8] = var8 * 262144;
         }

         for(var8 = 0; var8 < 64; ++var8) {
            class38.field489[var8 + 64] = var8 * 1024 + 16711680;
         }

         for(var8 = 0; var8 < 64; ++var8) {
            class38.field489[var8 + 128] = var8 * 4 + 16776960;
         }

         for(var8 = 0; var8 < 64; ++var8) {
            class38.field489[var8 + 192] = 16777215;
         }

         class7.field231 = new int[256];

         for(var8 = 0; var8 < 64; ++var8) {
            class7.field231[var8] = var8 * 1024;
         }

         for(var8 = 0; var8 < 64; ++var8) {
            class7.field231[var8 + 64] = var8 * 4 + '\uff00';
         }

         for(var8 = 0; var8 < 64; ++var8) {
            class7.field231[var8 + 128] = var8 * 262144 + '\uffff';
         }

         for(var8 = 0; var8 < 64; ++var8) {
            class7.field231[var8 + 192] = 16777215;
         }

         class36.field480 = new int[256];

         for(var8 = 0; var8 < 64; ++var8) {
            class36.field480[var8] = var8 * 4;
         }

         for(var8 = 0; var8 < 64; ++var8) {
            class36.field480[var8 + 64] = var8 * 262144 + 255;
         }

         for(var8 = 0; var8 < 64; ++var8) {
            class36.field480[var8 + 128] = var8 * 1024 + 16711935;
         }

         for(var8 = 0; var8 < 64; ++var8) {
            class36.field480[var8 + 192] = 16777215;
         }

         class92.field1408 = new int[256];
         class4.field30 = new int['\u8000'];
         class5.field34 = new int['\u8000'];
         class20.method169((class330)null, 1209692311);
         class90.field1362 = new int['\u8000'];
         class164.field2181 = new int['\u8000'];
         if (var2) {
            class90.field1374 = "";
            class90.field1350 = "";
         }

         class74.field1145 = 0;
         class41.field520 = "";
         class90.field1344 = true;
         class90.field1370 = false;
         if (!class46.field564.field1242) {
            class158.method3185(2, class1.field12, "scape main", "", 255, false, -248685038);
         } else {
            class262.method4660(2, 985642245);
         }

         class189.method3481(false, 1611084027);
         class90.field1345 = true;
         class90.field1338 = (class287.field3765 - 765) / 2;
         class90.field1337 = class90.field1338 + 202;
         class54.field630 = class90.field1337 + 180;
         class317.field3926.method5868(class90.field1338, 0);
         class61.field715.method5868(class90.field1338 + 382, 0);
         class90.field1341.method5842(class90.field1338 + 382 - class90.field1341.field3971 / 2, 18);
      }

   }
}

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class class58 extends class328 {
   Image field655;
   Component field656;

   class58(int var1, int var2, Component var3) {
      super.field3960 = var1;
      super.field3959 = var2;
      super.field3961 = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.field3961, super.field3961.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field3960, super.field3959), var4, (Point)null);
      this.field655 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method861(var3, -770432587);
      this.method5832(-905436369);
   }

   final void method865(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field655, 0, 0, this.field656);
         var1.setClip(var7);
      } catch (Exception var8) {
         this.field656.repaint();
      }

   }

   final void method864(Graphics var1, int var2, int var3, int var4) {
      try {
         var1.drawImage(this.field655, var2, var3, this.field656);
      } catch (Exception var6) {
         this.field656.repaint();
      }

   }

   final void method861(Component var1, int var2) {
      this.field656 = var1;
   }

   public final void vmethod5824(int var1, int var2, int var3) {
      this.method864(this.field656.getGraphics(), var1, var2, 2068630880);
   }

   public final void vmethod5825(int var1, int var2, int var3, int var4, int var5) {
      this.method865(this.field656.getGraphics(), var1, var2, var3, var4, 1026383004);
   }
}

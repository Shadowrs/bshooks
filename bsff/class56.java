import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class56 extends class107 {
   AudioFormat field642;
   int field641;
   SourceDataLine field643;
   byte[] field644;

   protected void vmethod2220(short var1) {
      this.field643.flush();
   }

   protected void vmethod2200(int var1) {
      if (this.field643 != null) {
         this.field643.close();
         this.field643 = null;
      }

   }

   protected int vmethod2199(int var1) {
      return this.field641 - (this.field643.available() >> (class17.field297 ? 2 : 1));
   }

   protected void vmethod2201(int var1, int var2) throws LineUnavailableException {
      try {
         Info var3 = new Info(SourceDataLine.class, this.field642, var1 << (class17.field297 ? 2 : 1));
         this.field643 = (SourceDataLine)AudioSystem.getLine(var3);
         this.field643.open();
         this.field643.start();
         this.field641 = var1;
      } catch (LineUnavailableException var6) {
         int var4 = (var1 >>> 1 & 1431655765) + (var1 & 1431655765);
         var4 = (var4 >>> 2 & 858993459) + (var4 & 858993459);
         var4 = (var4 >>> 4) + var4 & 252645135;
         var4 += var4 >>> 8;
         var4 += var4 >>> 16;
         int var5 = var4 & 255;
         if (var5 == 1) {
            this.field643 = null;
            throw var6;
         }

         this.vmethod2201(class140.method3075(var1, (short)-26914), -949100269);
      }

   }

   protected void vmethod2203() {
      int var1 = 256;
      if (class17.field297) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field1561[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field644[var2 * 2] = (byte)(var3 >> 8);
         this.field644[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field643.write(this.field644, 0, var1 << 1);
   }

   protected void vmethod2197(int var1) {
      this.field642 = new AudioFormat((float)class317.field3927, 16, class17.field297 ? 2 : 1, true, false);
      this.field644 = new byte[256 << (class17.field297 ? 2 : 1)];
   }
}

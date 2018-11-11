import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class299 {
   HashMap field3830;
   class296[] field3832;
   int field3834 = 0;
   Comparator field3835 = null;
   int field3833;
   HashMap field3831;

   class299(int var1) {
      this.field3833 = var1;
      this.field3832 = this.vmethod5463(var1, -1281183690);
      this.field3830 = new HashMap(var1 / 8);
      this.field3831 = new HashMap(var1 / 8);
   }

   public class296 method5317(class305 var1, int var2) {
      class296 var3 = this.method5319(var1, 858217999);
      return var3 != null ? var3 : this.method5359(var1, 1058550691);
   }

   class296 method5323(class305 var1, class305 var2, byte var3) {
      if (this.method5319(var1, 197662175) != null) {
         throw new IllegalStateException();
      } else {
         class296 var4 = this.vmethod5462(437342171);
         var4.method5263(var1, var2, (byte)1);
         this.method5372(var4, (byte)60);
         this.method5329(var4, (byte)68);
         return var4;
      }
   }

   final int method5327(class296 var1, int var2) {
      for(int var3 = 0; var3 < this.field3834; ++var3) {
         if (this.field3832[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   final void method5328(class296 var1, short var2) {
      if (this.field3830.remove(var1.field3823) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field3822 != null) {
            this.field3831.remove(var1.field3822);
         }

      }
   }

   class296 method5319(class305 var1, int var2) {
      return !var1.method5450((byte)0) ? null : (class296)this.field3830.get(var1);
   }

   public int method5314(int var1) {
      return this.field3834;
   }

   public boolean method5315(int var1) {
      return this.field3834 == this.field3833;
   }

   public final void method5333(byte var1) {
      if (this.field3835 == null) {
         Arrays.sort(this.field3832, 0, this.field3834);
      } else {
         Arrays.sort(this.field3832, 0, this.field3834, this.field3835);
      }

   }

   public boolean method5316(class305 var1, byte var2) {
      return !var1.method5450((byte)0) ? false : (this.field3830.containsKey(var1) ? true : this.field3831.containsKey(var1));
   }

   class296 method5359(class305 var1, int var2) {
      return !var1.method5450((byte)0) ? null : (class296)this.field3831.get(var1);
   }

   abstract class296 vmethod5462(int var1);

   final void method5346(int var1, byte var2) {
      --this.field3834;
      if (var1 < this.field3834) {
         System.arraycopy(this.field3832, var1 + 1, this.field3832, var1, this.field3834 - var1);
      }

   }

   public void method5351(int var1) {
      this.field3834 = 0;
      Arrays.fill(this.field3832, (Object)null);
      this.field3830.clear();
      this.field3831.clear();
   }

   final void method5321(class296 var1, int var2) {
      int var3 = this.method5327(var1, -666196517);
      if (var3 != -1) {
         this.method5346(var3, (byte)41);
         this.method5328(var1, (short)-12156);
      }

   }

   public final class296 method5350(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3834) {
         return this.field3832[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   final void method5329(class296 var1, byte var2) {
      this.field3830.put(var1.field3823, var1);
      if (var1.field3822 != null) {
         class296 var3 = (class296)this.field3831.put(var1.field3822, var1);
         if (var3 != null && var3 != var1) {
            var3.field3822 = null;
         }
      }

   }

   abstract class296[] vmethod5463(int var1, int var2);

   public final boolean method5345(class305 var1, int var2) {
      class296 var3 = this.method5319(var1, 740721079);
      if (var3 == null) {
         return false;
      } else {
         this.method5321(var3, -2133257435);
         return true;
      }
   }

   final void method5372(class296 var1, byte var2) {
      this.field3832[++this.field3834 - 1] = var1;
   }

   class296 method5322(class305 var1, int var2) {
      return this.method5323(var1, (class305)null, (byte)27);
   }

   final void method5326(class296 var1, class305 var2, class305 var3, int var4) {
      this.method5328(var1, (short)19752);
      var1.method5263(var2, var3, (byte)1);
      this.method5329(var1, (byte)118);
   }

   public final void method5334(int var1) {
      this.field3835 = null;
   }

   public final void method5377(Comparator var1, int var2) {
      if (this.field3835 == null) {
         this.field3835 = var1;
      } else if (this.field3835 instanceof class297) {
         ((class297)this.field3835).method5287(var1, 2095282396);
      }

   }
}

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

public class class39 implements class43 {
   static class263 field502;
   int field498;
   int field503;
   int field499;
   int field495;
   int field496;
   int field497;

   public boolean vmethod758(int var1, int var2, short var3) {
      return var1 >> 6 == this.field503 && var2 >> 6 == this.field499;
   }

   public boolean vmethod753(int var1, int var2, int var3, int var4) {
      return var1 >= this.field498 && var1 < this.field498 + this.field495 ? var2 >> 6 == this.field496 && var3 >> 6 == this.field497 : false;
   }

   public void vmethod751(class32 var1, int var2) {
      if (var1.field433 > this.field503) {
         var1.field433 = this.field503;
      }

      if (var1.field431 < this.field503) {
         var1.field431 = this.field503;
      }

      if (var1.field434 > this.field499) {
         var1.field434 = this.field499;
      }

      if (var1.field436 < this.field499) {
         var1.field436 = this.field499;
      }

   }

   public class238 vmethod777(int var1, int var2, byte var3) {
      if (!this.vmethod758(var1, var2, (short)4930)) {
         return null;
      } else {
         int var4 = this.field496 * 64 - this.field503 * 64 + var1;
         int var5 = this.field497 * 64 - this.field499 * 64 + var2;
         return new class238(this.field498, var4, var5);
      }
   }

   public int[] vmethod754(int var1, int var2, int var3, int var4) {
      if (!this.vmethod753(var1, var2, var3, 725568925)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field503 * 64 - this.field496 * 64 + var2, var3 + (this.field499 * 64 - this.field497 * 64)};
         return var5;
      }
   }

   void method538(byte var1) {
   }

   public void vmethod756(class194 var1, int var2) {
      this.field498 = var1.getUByte(1488384169);
      this.field495 = var1.getUByte(-1872985166);
      this.field496 = var1.getUShort(-1208216487);
      this.field497 = var1.getUShort(-1208216487);
      this.field503 = var1.getUShort(-1208216487);
      this.field499 = var1.getUShort(-1208216487);
      this.method538((byte)-7);
   }

   public static boolean method553(String var0, int var1, String var2, byte var3) {
      if (var1 == 0) {
         try {
            if (!class57.field646.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < var0.length(); ++var5) {
                  if (var12.indexOf(var0.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Object var11 = class53.method815(class57.field652, var2, new Object[]{(new URL(class57.field652.getCodeBase(), var0)).toString()}, 1825166945);
            return var11 != null;
         } catch (Throwable var7) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class57.field652.getAppletContext().showDocument(new URL(class57.field652.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            Applet var4 = class57.field652;
            JSObject.getWindow(var4).call("loggedout", (Object[])null);
         } catch (Throwable var10) {
            ;
         }

         try {
            class57.field652.getAppletContext().showDocument(new URL(class57.field652.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method548(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class305.method5452(var0, -1009820586)) {
         class7.method40(class189.field2519[var0], -1, var1, var2, var3, var4, var5, var6, 1794637949);
      }

   }
}

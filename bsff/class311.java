public final class class311 extends class312 {
   public class311(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class311(byte[] var1) {
      super(var1);
   }

   final void vmethod5582(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var3 * class327.field3954 + var2;
      int var8 = class327.field3954 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < class327.field3955) {
         var11 = class327.field3955 - var3;
         var5 -= var11;
         var3 = class327.field3955;
         var10 += var11 * var4;
         var7 += var11 * class327.field3954;
      }

      if (var3 + var5 > class327.field3956) {
         var5 -= var3 + var5 - class327.field3956;
      }

      if (var2 < class327.field3952) {
         var11 = class327.field3952 - var2;
         var4 -= var11;
         var2 = class327.field3952;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var2 + var4 > class327.field3953) {
         var11 = var2 + var4 - class327.field3953;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         class312.method5523(class327.field3958, var1, var6, var10, var7, var4, var5, var8, var9);
      }

   }

   final void vmethod5536(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 * class327.field3954 + var2;
      int var9 = class327.field3954 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < class327.field3955) {
         var12 = class327.field3955 - var3;
         var5 -= var12;
         var3 = class327.field3955;
         var11 += var12 * var4;
         var8 += var12 * class327.field3954;
      }

      if (var3 + var5 > class327.field3956) {
         var5 -= var3 + var5 - class327.field3956;
      }

      if (var2 < class327.field3952) {
         var12 = class327.field3952 - var2;
         var4 -= var12;
         var2 = class327.field3952;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > class327.field3953) {
         var12 = var2 + var4 - class327.field3953;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         class312.method5605(class327.field3958, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }

   }
}

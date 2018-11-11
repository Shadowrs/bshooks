import java.net.URL;
import java.util.HashMap;

public class class265 {
   static long field3431;
   HashMap field3426 = new HashMap();
   int field3428 = 0;
   int[] field3425 = new int[2048];
   int[] field3427 = new int[2048];
   class323 field3430 = new class323(0, 0);

   public class265() {
      class140.method3074(-875562035);
   }

   class331 method4706(int var1, byte var2) {
      if (!this.field3426.containsKey(var1)) {
         this.method4707(var1, (byte)-71);
      }

      return (class331)this.field3426.get(var1);
   }

   void method4707(int var1, byte var2) {
      int var3 = var1 * 2 + 1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = var1 * 2 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      double var10;
      for(int var9 = 0; var8 <= var1; ++var9) {
         var10 = class263.method4664((double)(var8 - 0) / var4) / var4;
         var7[var9] = var10;
         ++var8;
      }

      double[] var17 = var7;
      var10 = var7[var1] * var7[var1];
      int[] var12 = new int[var3 * var3];
      boolean var13 = false;

      for(int var14 = 0; var14 < var3; ++var14) {
         for(int var15 = 0; var15 < var3; ++var15) {
            int var16 = var12[var15 + var3 * var14] = (int)(256.0D * (var17[var15] * var17[var14] / var10));
            if (!var13 && var16 > 0) {
               var13 = true;
            }
         }
      }

      class331 var18 = new class331(var12, var3, var3);
      this.field3426.put(var1, var18);
   }

   void method4712(class331 var1, class331 var2, class323 var3, int var4) {
      if (var3.field3936 != 0 && var3.field3937 != 0) {
         int var5 = 0;
         int var6 = 0;
         if (var3.field3939 == 0) {
            var5 = var1.field3978 - var3.field3936;
         }

         if (var3.field3938 == 0) {
            var6 = var1.field3979 - var3.field3937;
         }

         int var7 = var5 + var6 * var1.field3978;
         int var8 = var3.field3939 + var2.field3978 * var3.field3938;

         for(int var9 = 0; var9 < var3.field3937; ++var9) {
            for(int var10 = 0; var10 < var3.field3936; ++var10) {
               int var11 = var8++;
               var2.field3986[var11] += var1.field3986[var7++];
            }

            var7 += var1.field3978 - var3.field3936;
            var8 += var2.field3978 - var3.field3936;
         }
      }

   }

   public final void method4711(int var1, int var2, class331 var3, float var4, int var5) {
      int var6 = (int)(18.0F * var4);
      class331 var7 = this.method4706(var6, (byte)8);
      int var8 = var6 * 2 + 1;
      class323 var9 = new class323(0, 0, var3.field3978, var3.field3979);
      class323 var10 = new class323(0, 0);
      this.field3430.method5694(var8, var8, -1991994934);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < this.field3428; ++var11) {
         var12 = this.field3425[var11];
         var13 = this.field3427[var11];
         int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
         int var15 = (int)((float)var3.field3979 - var4 * (float)(var13 - var2)) - var6;
         this.field3430.method5716(var14, var15, (byte)12);
         this.field3430.method5693(var9, var10, 1083239693);
         this.method4712(var7, var3, var10, 1668310923);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.field3986.length; ++var11) {
         if (var3.field3986[var11] == 0) {
            var3.field3986[var11] = -16777216;
         } else {
            var12 = (var3.field3986[var11] + 64 - 1) / 256;
            if (var12 <= 0) {
               var3.field3986[var11] = -16777216;
            } else {
               if (var12 > class157.field2146.length) {
                  var12 = class157.field2146.length;
               }

               var13 = class157.field2146[var12 - 1];
               var3.field3986[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }

   public final void method4710(int var1) {
      this.field3428 = 0;
   }

   public final void method4709(int var1, int var2, int var3) {
      if (this.field3428 < this.field3425.length) {
         this.field3425[this.field3428] = var1;
         this.field3427[this.field3428] = var2;
         ++this.field3428;
      }

   }

   static boolean method4724(int var0) {
      try {
         if (class21.field324 == null) {
            class21.field324 = class48.field577.method3101(new URL(class54.field627), (short)1536);
         } else if (class21.field324.method3109(853197112)) {
            byte[] var1 = class21.field324.method3110((byte)30);
            class194 var2 = new class194(var1);
            var2.getInt(-1817376731);
            class77.field1222 = var2.getUShort(-1208216487);
            class141.field2058 = new class77[class77.field1222];

            class77 var3;
            for(int var4 = 0; var4 < class77.field1222; var3.field1232 = var4++) {
               var3 = class141.field2058[var4] = new class77();
               var3.field1230 = var2.getUShort(-1208216487);
               var3.field1218 = var2.getInt(-1817376731);
               var3.field1227 = var2.getString1(-778927800);
               var3.field1225 = var2.getString1(-778927800);
               var3.field1231 = var2.getUByte(-399860944);
               var3.field1228 = var2.getShort(997392590);
            }

            class40.method574(class141.field2058, 0, class141.field2058.length - 1, class77.field1220, class77.field1224, (byte)107);
            class21.field324 = null;
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         class21.field324 = null;
      }

      return false;
   }
}

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class class97 extends class139 {
   class287 field1454;
   int field1464;
   int field1458;
   int field1462;
   int field1456;
   int field1457;
   int field1461;
   int field1455;
   int field1459;

   class97(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class139 var9) {
      this.field1464 = var1;
      this.field1462 = var2;
      this.field1456 = var3;
      this.field1457 = var4;
      this.field1455 = var5;
      this.field1459 = var6;
      if (var7 != -1) {
         this.field1454 = class202.method3839(var7, (byte)22);
         this.field1461 = 0;
         this.field1458 = client.field866 - 1;
         if (this.field1454.field3749 == 0 && var9 != null && var9 instanceof class97) {
            class97 var10 = (class97)var9;
            if (var10.field1454 == this.field1454) {
               this.field1461 = var10.field1461;
               this.field1458 = var10.field1458;
               return;
            }
         }

         if (var8 && this.field1454.field3754 != -1) {
            this.field1461 = (int)(Math.random() * (double)this.field1454.field3750.length);
            this.field1458 -= (int)(Math.random() * (double)this.field1454.field3763[this.field1461]);
         }
      }

   }

   protected final class131 vmethod3067(byte var1) {
      if (this.field1454 != null) {
         int var2 = client.field866 - this.field1458;
         if (var2 > 100 && this.field1454.field3754 > 0) {
            var2 = 100;
         }

         label47: {
            do {
               do {
                  if (var2 <= this.field1454.field3763[this.field1461]) {
                     break label47;
                  }

                  var2 -= this.field1454.field3763[this.field1461];
                  ++this.field1461;
               } while(this.field1461 < this.field1454.field3750.length);

               this.field1461 -= this.field1454.field3754;
            } while(this.field1461 >= 0 && this.field1461 < this.field1454.field3750.length);

            this.field1454 = null;
         }

         this.field1458 = client.field866 - var2;
      }

      class282 var13 = class260.method4546(this.field1464, 646219284);
      if (var13.field3627 != null) {
         var13 = var13.method5008((byte)-94);
      }

      if (var13 == null) {
         return null;
      } else {
         int var3;
         int var4;
         if (this.field1456 != 1 && this.field1456 != 3) {
            var3 = var13.field3601;
            var4 = var13.field3602;
         } else {
            var3 = var13.field3602;
            var4 = var13.field3601;
         }

         int var5 = (var3 >> 1) + this.field1455;
         int var6 = (var3 + 1 >> 1) + this.field1455;
         int var7 = (var4 >> 1) + this.field1459;
         int var8 = (var4 + 1 >> 1) + this.field1459;
         int[][] var9 = class62.field728[this.field1457];
         int var10 = var9[var6][var8] + var9[var6][var7] + var9[var5][var7] + var9[var5][var8] >> 2;
         int var11 = (this.field1455 << 7) + (var3 << 6);
         int var12 = (this.field1459 << 7) + (var4 << 6);
         return var13.method5006(this.field1462, this.field1456, var9, var11, var10, var12, this.field1454, this.field1461, -2015399076);
      }
   }

   public static final class107 method2022(class166 var0, int var1, int var2, byte var3) {
      if (class317.field3927 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            class107 var4 = class21.field322.vmethod2095(-2054148329);
            var4.field1561 = new int[256 * (class17.field297 ? 2 : 1)];
            var4.field1557 = var2;
            var4.vmethod2197(-107585878);
            var4.field1556 = (var2 & -1024) + 1024;
            if (var4.field1556 > 16384) {
               var4.field1556 = 16384;
            }

            var4.vmethod2201(var4.field1556, 1295104351);
            if (class238.field2777 > 0 && class27.field382 == null) {
               class27.field382 = new class109();
               class57.field654 = Executors.newScheduledThreadPool(1);
               class57.field654.scheduleAtFixedRate(class27.field382, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class27.field382 != null) {
               if (class27.field382.field1583[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class27.field382.field1583[var1] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new class107();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static void method2019(int var0, int var1, int var2) {
      class184 var3 = class141.method3078(class181.field2382, client.field902.field1475, (byte)-94);
      var3.field2500.addShortLE128(var1, (byte)-23);
      var3.field2500.addInt(var0, (byte)34);
      client.field902.method2036(var3, (byte)120);
   }
}

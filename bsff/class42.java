import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.ImageIO;

public final class class42 {
   static int field533;
   static int field537;
   boolean field523 = false;
   class331 field534;
   boolean field539 = false;
   HashMap field526;
   class35[][] field527;
   int field531;
   public int field535 = 0;
   int field525;
   HashMap field528 = new HashMap();
   class330[] field529;
   HashMap field522;
   class45 field524;
   int field536;
   int field538;

   public class42(class330[] var1, HashMap var2) {
      this.field529 = var1;
      this.field522 = var2;
   }

   void method590(int var1) {
      if (this.field526 == null) {
         this.field526 = new HashMap();
      }

      this.field526.clear();

      for(int var2 = 0; var2 < this.field527.length; ++var2) {
         for(int var3 = 0; var3 < this.field527[var2].length; ++var3) {
            List var4 = this.field527[var2][var3].method426(-2012315534);
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               class40 var6 = (class40)var5.next();
               if (!this.field526.containsKey(var6.field510)) {
                  LinkedList var7 = new LinkedList();
                  var7.add(var6);
                  this.field526.put(var6.field510, var7);
               } else {
                  List var8 = (List)this.field526.get(var6.field510);
                  var8.add(var6);
               }
            }
         }
      }

   }

   class29 method587(int var1, int var2, int var3, int var4, byte var5) {
      class29 var6 = new class29(this);
      int var7 = this.field531 + var1;
      int var8 = var2 + this.field525;
      int var9 = var3 + this.field531;
      int var10 = var4 + this.field525;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      int var14 = var10 / 64;
      var6.field400 = var13 - var11 + 1;
      var6.field401 = var14 - var12 + 1;
      var6.field403 = var11 - this.field524.method318((byte)0);
      var6.field402 = var12 - this.field524.method373(-1281584232);
      if (var6.field403 < 0) {
         var6.field400 += var6.field403;
         var6.field403 = 0;
      }

      if (var6.field403 > this.field527.length - var6.field400) {
         var6.field400 = this.field527.length - var6.field403;
      }

      if (var6.field402 < 0) {
         var6.field401 += var6.field402;
         var6.field402 = 0;
      }

      if (var6.field402 > this.field527[0].length - var6.field401) {
         var6.field401 = this.field527[0].length - var6.field402;
      }

      var6.field400 = Math.min(var6.field400, this.field527.length);
      var6.field401 = Math.min(var6.field401, this.field527[0].length);
      return var6;
   }

   float method591(int var1, int var2, int var3) {
      float var4 = (float)var1 / (float)var2;
      if (var4 > 8.0F) {
         return 8.0F;
      } else if (var4 < 1.0F) {
         return 1.0F;
      } else {
         int var5 = Math.round(var4);
         return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
      }
   }

   public boolean method588(int var1) {
      return this.field539;
   }

   public HashMap method589(int var1) {
      this.method590(1164489898);
      return this.field526;
   }

   public void method620(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, int var8) {
      if (this.field534 != null) {
         this.field534.method5871(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field526 == null) {
               this.method590(1446693813);
            }

            Iterator var9 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var9.hasNext()) {
                     return;
                  }

                  int var11 = ((Integer)var9.next()).intValue();
                  var10 = (List)this.field526.get(var11);
               } while(var10 == null);

               Iterator var15 = var10.iterator();

               while(var15.hasNext()) {
                  class40 var12 = (class40)var15.next();
                  int var13 = var3 * (var12.field512.field2774 - this.field531) / this.field536;
                  int var14 = var4 - (var12.field512.field2776 - this.field525) * var4 / this.field538;
                  class327.method5739(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }

   }

   public void method580(class261 var1, String var2, boolean var3, int var4) {
      if (!this.field523) {
         this.field539 = false;
         this.field523 = true;
         System.nanoTime();
         int var5 = var1.method4606(class41.field515.field513, -1805419850);
         int var6 = var1.method4568(var5, var2, (short)11805);
         class194 var7 = new class194(var1.method4572(class41.field515.field513, var2, -1952298557));
         class194 var8 = new class194(var1.method4572(class41.field514.field513, var2, -174194782));
         class194 var9 = new class194(var1.method4572(var2, class41.field516.field513, -1849692186));
         System.nanoTime();
         System.nanoTime();
         this.field524 = new class45();

         try {
            this.field524.method663(var7, var9, var8, var6, var3, 891609718);
         } catch (IllegalStateException var20) {
            return;
         }

         this.field524.method322((byte)-114);
         this.field524.method323((byte)73);
         this.field524.method324(1300977520);
         this.field531 = this.field524.method318((byte)0) * 64;
         this.field525 = this.field524.method373(139953948) * 64;
         this.field536 = (this.field524.method319(-357714868) - this.field524.method318((byte)0) + 1) * 64;
         this.field538 = (this.field524.method313(-1478783830) - this.field524.method373(-1283232586) + 1) * 64;
         int var10 = this.field524.method319(-357714868) - this.field524.method318((byte)0) + 1;
         int var11 = this.field524.method313(-2093630886) - this.field524.method373(-2005141882) + 1;
         System.nanoTime();
         System.nanoTime();
         class9.method57((byte)0);
         this.field527 = new class35[var10][var11];
         Iterator var12 = this.field524.field557.iterator();

         int var13;
         int var14;
         int var16;
         while(var12.hasNext()) {
            class22 var15 = (class22)var12.next();
            var16 = var15.field390;
            var13 = var15.field387;
            var14 = var16 - this.field524.method318((byte)0);
            int var17 = var13 - this.field524.method373(-1652476687);
            this.field527[var14][var17] = new class35(var16, var13, this.field524.method316(-1057752141), this.field522);
            this.field527[var14][var17].method508(var15, this.field524.field555, -875631561);
         }

         for(int var23 = 0; var23 < var10; ++var23) {
            for(var16 = 0; var16 < var11; ++var16) {
               if (this.field527[var23][var16] == null) {
                  this.field527[var23][var16] = new class35(this.field524.method318((byte)0) + var23, this.field524.method373(-1601501751) + var16, this.field524.method316(441175448), this.field522);
                  this.field527[var23][var16].method392(this.field524.field554, this.field524.field555, 1320872508);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method4571(class41.field517.field513, var2, (byte)-24)) {
            byte[] var24 = var1.method4572(class41.field517.field513, var2, -877883925);
            BufferedImage var25 = null;

            class331 var26;
            label44: {
               try {
                  var25 = ImageIO.read(new ByteArrayInputStream(var24));
                  var13 = var25.getWidth();
                  var14 = var25.getHeight();
                  int[] var18 = new int[var14 * var13];
                  PixelGrabber var19 = new PixelGrabber(var25, 0, 0, var13, var14, var18, 0, var13);
                  var19.grabPixels();
                  var26 = new class331(var18, var13, var14);
                  break label44;
               } catch (IOException var21) {
                  ;
               } catch (InterruptedException var22) {
                  ;
               }

               var26 = new class331(0, 0);
            }

            this.field534 = var26;
         }

         System.nanoTime();
         var1.method4556(2114805572);
         var1.method4567((short)-9480);
         this.field539 = true;
      }

   }

   public List method586(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, byte var11) {
      LinkedList var12 = new LinkedList();
      if (!this.field539) {
         return var12;
      } else {
         class29 var13 = this.method587(var1, var2, var3, var4, (byte)52);
         float var14 = this.method591(var7, var3 - var1, 1403116933);
         int var15 = (int)(64.0F * var14);
         int var16 = this.field531 + var1;
         int var17 = var2 + this.field525;

         for(int var18 = var13.field403; var18 < var13.field403 + var13.field400; ++var18) {
            for(int var19 = var13.field402; var19 < var13.field401 + var13.field402; ++var19) {
               List var20 = this.field527[var18][var19].method425(var5 + var15 * (this.field527[var18][var19].field459 * 64 - var16) / 64, var8 + var6 - var15 * (this.field527[var18][var19].field456 * 64 - var17 + 64) / 64, var15, var9, var10, -1174225388);
               if (!var20.isEmpty()) {
                  var12.addAll(var20);
               }
            }
         }

         return var12;
      }
   }

   public final void method619(int var1) {
      this.field526 = null;
   }

   void method584(int var1, int var2, class35[] var3, int var4) {
      boolean var5 = var1 <= 0;
      boolean var6 = var1 >= this.field527.length - 1;
      boolean var7 = var2 <= 0;
      boolean var8 = var2 >= this.field527[0].length - 1;
      if (var8) {
         var3[class254.field3316.vmethod5837(-1810073140)] = null;
      } else {
         var3[class254.field3316.vmethod5837(-1674970055)] = this.field527[var1][var2 + 1];
      }

      var3[class254.field3312.vmethod5837(-1657041170)] = !var8 && !var6 ? this.field527[var1 + 1][var2 + 1] : null;
      var3[class254.field3318.vmethod5837(-1874477318)] = !var8 && !var5 ? this.field527[var1 - 1][var2 + 1] : null;
      var3[class254.field3313.vmethod5837(-2124718487)] = var6 ? null : this.field527[var1 + 1][var2];
      var3[class254.field3320.vmethod5837(-1735836466)] = var5 ? null : this.field527[var1 - 1][var2];
      var3[class254.field3315.vmethod5837(-1767019498)] = var7 ? null : this.field527[var1][var2 - 1];
      var3[class254.field3314.vmethod5837(-1880472754)] = !var7 && !var6 ? this.field527[var1 + 1][var2 - 1] : null;
      var3[class254.field3311.vmethod5837(-1763649899)] = !var7 && !var5 ? this.field527[var1 - 1][var2 - 1] : null;
   }

   public final void method582(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      int[] var10 = class327.field3958;
      int var11 = class327.field3954;
      int var12 = class327.field3957;
      int[] var13 = new int[4];
      class327.method5771(var13);
      class29 var14 = this.method587(var1, var2, var3, var4, (byte)85);
      float var15 = this.method591(var7 - var5, var3 - var1, -882538555);
      int var16 = (int)Math.ceil((double)var15);
      this.field535 = var16;
      if (!this.field528.containsKey(var16)) {
         class47 var17 = new class47(var16);
         var17.method740((byte)87);
         this.field528.put(var16, var17);
      }

      class35[] var23 = new class35[8];

      int var18;
      int var19;
      for(var18 = var14.field403; var18 < var14.field403 + var14.field400; ++var18) {
         for(var19 = var14.field402; var19 < var14.field402 + var14.field401; ++var19) {
            this.method584(var18, var19, var23, 218581327);
            this.field527[var18][var19].method395(var16, (class47)this.field528.get(var16), var23, this.field529, (byte)-51);
         }
      }

      class327.method5731(var10, var11, var12);
      class327.method5736(var13);
      var18 = (int)(64.0F * var15);
      var19 = this.field531 + var1;
      int var20 = var2 + this.field525;

      for(int var21 = var14.field403; var21 < var14.field403 + var14.field400; ++var21) {
         for(int var22 = var14.field402; var22 < var14.field402 + var14.field401; ++var22) {
            this.field527[var21][var22].method390(var5 + var18 * (this.field527[var21][var22].field459 * 64 - var19) / 64, var8 - var18 * (this.field527[var21][var22].field456 * 64 - var20 + 64) / 64, var18, -35002468);
         }
      }

   }

   public final void method583(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13, int var14) {
      class29 var15 = this.method587(var1, var2, var3, var4, (byte)124);
      float var16 = this.method591(var7 - var5, var3 - var1, -16953104);
      int var17 = (int)(var16 * 64.0F);
      int var18 = this.field531 + var1;
      int var19 = var2 + this.field525;

      int var20;
      int var21;
      for(var20 = var15.field403; var20 < var15.field403 + var15.field400; ++var20) {
         for(var21 = var15.field402; var21 < var15.field402 + var15.field401; ++var21) {
            if (var13) {
               this.field527[var20][var21].method442(2021721969);
            }

            this.field527[var20][var21].method414(var5 + var17 * (this.field527[var20][var21].field459 * 64 - var18) / 64, var8 - var17 * (this.field527[var20][var21].field456 * 64 - var19 + 64) / 64, var17, var9, 962214860);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var20 = var15.field403; var20 < var15.field400 + var15.field403; ++var20) {
            for(var21 = var15.field402; var21 < var15.field401 + var15.field402; ++var21) {
               this.field527[var20][var21].method397(var10, var11, var12, -1472148153);
            }
         }
      }

   }

   static class178 method605(int var0, int var1, int var2) {
      client.field1127.field2283 = var0;
      client.field1127.field2282 = var1;
      client.field1127.field2280 = 1;
      client.field1127.field2281 = 1;
      return client.field1127;
   }

   static final int method617(int var0) {
      return class132.field1919;
   }

   static int method624(int var0, class96 var1, boolean var2, int var3) {
      class242 var4 = class3.method2(class81.field1272[--class135.field1964], 2054847338);
      if (var0 == 2600) {
         class81.field1272[++class135.field1964 - 1] = var4.field2835;
         return 1;
      } else if (var0 == 2601) {
         class81.field1272[++class135.field1964 - 1] = var4.field2836;
         return 1;
      } else if (var0 == 2602) {
         class81.field1281[++class77.field1233 - 1] = var4.field2876;
         return 1;
      } else if (var0 == 2603) {
         class81.field1272[++class135.field1964 - 1] = var4.field2849;
         return 1;
      } else if (var0 == 2604) {
         class81.field1272[++class135.field1964 - 1] = var4.field2838;
         return 1;
      } else if (var0 == 2605) {
         class81.field1272[++class135.field1964 - 1] = var4.field2868;
         return 1;
      } else if (var0 == 2606) {
         class81.field1272[++class135.field1964 - 1] = var4.field2865;
         return 1;
      } else if (var0 == 2607) {
         class81.field1272[++class135.field1964 - 1] = var4.field2824;
         return 1;
      } else if (var0 == 2608) {
         class81.field1272[++class135.field1964 - 1] = var4.field2866;
         return 1;
      } else if (var0 == 2609) {
         class81.field1272[++class135.field1964 - 1] = var4.field2845;
         return 1;
      } else if (var0 == 2610) {
         class81.field1272[++class135.field1964 - 1] = var4.field2846;
         return 1;
      } else if (var0 == 2611) {
         class81.field1272[++class135.field1964 - 1] = var4.field2839;
         return 1;
      } else if (var0 == 2612) {
         class81.field1272[++class135.field1964 - 1] = var4.field2920;
         return 1;
      } else if (var0 == 2613) {
         class81.field1272[++class135.field1964 - 1] = var4.field2896.vmethod5837(-1776372734);
         return 1;
      } else {
         return 2;
      }
   }
}

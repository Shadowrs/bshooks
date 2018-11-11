import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class334 {
   static class309 field4021;
   static class309 field4008;
   static class309 field4009;
   class330[] field4012;
   boolean field4031 = false;
   HashSet field4044 = new HashSet();
   int field4035 = 3;
   int field4038 = -1;
   HashSet field4043 = new HashSet();
   int field4017 = -1;
   int field4025 = -1;
   boolean field4047 = false;
   HashSet field4029 = new HashSet();
   int field4030 = 50;
   class261 field4022;
   HashSet field4032 = null;
   HashMap field4046;
   class333 field4018;
   Iterator field4051;
   int field4058 = -1;
   float field4024;
   int field4019;
   class331 field4055;
   class32 field4015;
   class32 field4014;
   int field4037 = -1;
   int field4007 = -1;
   class238 field4040 = null;
   int field4020;
   float field4002;
   class42 field4023;
   HashMap field4011;
   int field4027 = -1;
   int field4033 = -1;
   class32 field4013;
   class311 field4010;
   int field4036 = -1;
   int field4034 = -1;
   HashSet field4045 = new HashSet();
   int field4016 = -1;
   int field4056;
   int field4028 = -1;
   int field4059 = -1;
   List field4050;
   int field4057 = -1;
   int field4039 = -1;
   boolean field4042 = true;
   int[] field4049 = new int[]{1008, 1009, 1010, 1011, 1012};
   HashSet field4052 = new HashSet();
   int field4026;
   int field4041;
   int field4048 = 0;
   long field4006;
   public boolean field4054 = false;

   boolean method6019(int var1) {
      return this.field4058 != -1 && this.field4007 != -1;
   }

   public class32 method6020(int var1, int var2, int var3, byte var4) {
      Iterator var5 = this.field4046.values().iterator();

      while(var5.hasNext()) {
         class32 var6 = (class32)var5.next();
         if (var6.method307(var1, var2, var3, (byte)-14)) {
            return var6;
         }
      }

      return null;
   }

   public class32 method6023(int var1, byte var2) {
      Iterator var3 = this.field4046.values().iterator();

      while(var3.hasNext()) {
         class32 var4 = (class32)var3.next();
         if (var4.method321(-804210934) == var1) {
            return var4;
         }
      }

      return null;
   }

   float method6035(int var1, int var2) {
      return var1 == 25 ? 1.0F : (var1 == 37 ? 1.5F : (var1 == 50 ? 2.0F : (var1 == 75 ? 3.0F : (var1 == 100 ? 4.0F : 8.0F))));
   }

   void method6174(class32 var1, int var2) {
      this.field4015 = var1;
      this.field4023 = new class42(this.field4012, this.field4011);
      this.field4018.method5994(this.field4015.method355((byte)16), -452363258);
   }

   void method6039(class32 var1, int var2) {
      if (this.field4015 == null || var1 != this.field4015) {
         this.method6174(var1, -123985502);
         this.method6144(-1, -1, -1, (byte)12);
      }

   }

   public int method6181(int var1) {
      return this.field4015 == null ? -1 : this.field4019 + this.field4015.method318((byte)0) * 64;
   }

   void method6153(int var1) {
      if (client.field1132 != null) {
         this.field4002 = this.field4024;
      } else {
         if (this.field4002 < this.field4024) {
            this.field4002 = Math.min(this.field4024, this.field4002 / 30.0F + this.field4002);
         }

         if (this.field4002 > this.field4024) {
            this.field4002 = Math.max(this.field4024, this.field4002 - this.field4002 / 30.0F);
         }
      }

   }

   void method6063(int var1) {
      this.field4029.clear();
      this.field4029.addAll(this.field4043);
      this.field4029.addAll(this.field4045);
   }

   void method6144(int var1, int var2, int var3, byte var4) {
      if (this.field4015 != null) {
         int[] var5 = this.field4015.method309(var1, var2, var3, 694724857);
         if (var5 == null) {
            var5 = this.field4015.method309(this.field4015.method323((byte)46), this.field4015.method322((byte)-98), this.field4015.method324(-1011483246), 1363550878);
         }

         this.method6017(var5[0] - this.field4015.method318((byte)0) * 64, var5[1] - this.field4015.method373(-352981885) * 64, true, -86174702);
         this.field4058 = -1;
         this.field4007 = -1;
         this.field4002 = this.method6035(this.field4015.method352(-1822856889), 1023835628);
         this.field4024 = this.field4002;
         this.field4050 = null;
         this.field4051 = null;
         this.field4023.method619(300248511);
      }

   }

   public int method6173(int var1) {
      return this.field4025;
   }

   public int method6081(byte var1) {
      return this.field4015 == null ? -1 : this.field4020 + this.field4015.method373(-70080843) * 64;
   }

   void method6016(int var1) {
      if (this.method6019(1775740116)) {
         int var2 = this.field4058 - this.field4019;
         int var3 = this.field4007 - this.field4020;
         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if (var3 != 0) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.method6017(var2 + this.field4019, var3 + this.field4020, true, 354722679);
         if (this.field4019 == this.field4058 && this.field4020 == this.field4007) {
            this.field4058 = -1;
            this.field4007 = -1;
         }
      }

   }

   final void method6018(byte var1) {
      this.field4038 = -1;
      this.field4037 = -1;
      this.field4036 = -1;
      this.field4016 = -1;
   }

   public void method6097(int var1, int var2, int var3) {
      if (this.field4015 != null && this.field4015.method308(var1, var2, (byte)124)) {
         this.field4058 = var1 - this.field4015.method318((byte)0) * 64;
         this.field4007 = var2 - this.field4015.method373(822497697) * 64;
      }

   }

   public void method6143(int var1, int var2, int var3) {
      if (this.field4015 != null) {
         this.method6017(var1 - this.field4015.method318((byte)0) * 64, var2 - this.field4015.method373(1149698415) * 64, true, 633754473);
         this.field4058 = -1;
         this.field4007 = -1;
      }

   }

   void method6014(int var1, int var2, boolean var3, long var4) {
      if (this.field4015 != null) {
         int var6 = (int)((float)this.field4019 + ((float)(var1 - this.field4027) - (float)this.method6173(-1750330915) * this.field4002 / 2.0F) / this.field4002);
         int var7 = (int)((float)this.field4020 - ((float)(var2 - this.field4028) - (float)this.method6084(-500206409) * this.field4002 / 2.0F) / this.field4002);
         this.field4040 = this.field4015.method354(var6 + this.field4015.method318((byte)0) * 64, var7 + this.field4015.method373(367146566) * 64, 1095448979);
         if (this.field4040 != null && var3) {
            if (class237.method4377((byte)113) && class51.field607[82] && class51.field607[81]) {
               class16.method125(this.field4040.field2774, this.field4040.field2776, this.field4040.field2779, false, 2066232354);
            } else {
               boolean var8 = true;
               if (this.field4042) {
                  int var9 = var1 - this.field4026;
                  int var10 = var2 - this.field4041;
                  if (var4 - this.field4006 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if (var8) {
                  class184 var11 = class141.method3078(class181.field2457, client.field902.field1475, (byte)-26);
                  var11.field2500.addIntV2(this.field4040.method4382((byte)-128), (byte)34);
                  client.field902.method2036(var11, (byte)59);
                  this.field4006 = 0L;
               }
            }
         }
      } else {
         this.field4040 = null;
      }

   }

   final void method6017(int var1, int var2, boolean var3, int var4) {
      this.field4019 = var1;
      this.field4020 = var2;
      class6.method28(1358803598);
      if (var3) {
         this.method6018((byte)91);
      }

   }

   public int method6084(int var1) {
      return this.field4017;
   }

   public class40 method6068(int var1) {
      return this.field4051 == null ? null : (!this.field4051.hasNext() ? null : (class40)this.field4051.next());
   }

   boolean method6029(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return this.field4055 == null ? true : (this.field4055.field3978 == var1 && this.field4055.field3979 == var2 ? (this.field4023.field535 != this.field4056 ? true : (this.field4059 != client.field972 ? true : (var3 <= 0 && var4 <= 0 ? var3 + var1 < var5 || var2 + var4 < var6 : true))) : true);
   }

   void method6034(int var1, int var2, int var3, int var4, int var5, int var6) {
      byte var7 = 20;
      int var8 = var3 / 2 + var1;
      int var9 = var4 / 2 + var2 - 18 - var7;
      class327.method5810(var1, var2, var3, var4, -16777216);
      class327.method5748(var8 - 152, var9, 304, 34, -65536);
      class327.method5810(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
      this.field4010.method5524("Loading...", var8, var9 + var7, -1, -1);
   }

   void method6031(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      if (client.field1132 != null) {
         int var8 = 512 / (this.field4023.field535 * 2);
         int var9 = var3 + 512;
         int var10 = var4 + 512;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.method6181(-2091918634) - var5 / 2 - var8;
         int var13 = this.method6081((byte)0) - var6 / 2 - var8;
         int var14 = var1 - (var12 + var8 - this.field4057) * this.field4023.field535;
         int var15 = var2 - this.field4023.field535 * (var8 - (var13 - this.field4039));
         if (this.method6029(var9, var10, var14, var15, var3, var4, -938179055)) {
            if (this.field4055 != null && this.field4055.field3978 == var9 && this.field4055.field3979 == var10) {
               Arrays.fill(this.field4055.field3986, 0);
            } else {
               this.field4055 = new class331(var9, var10);
            }

            this.field4057 = this.method6181(-2102242950) - var5 / 2 - var8;
            this.field4039 = this.method6081((byte)0) - var6 / 2 - var8;
            this.field4056 = this.field4023.field535;
            client.field1132.method4711(this.field4057, this.field4039, this.field4055, (float)this.field4056 / var11, -2130305339);
            this.field4059 = client.field972;
            var14 = var1 - (var8 + var12 - this.field4057) * this.field4023.field535;
            var15 = var2 - this.field4023.field535 * (var8 - (var13 - this.field4039));
         }

         class327.method5740(var1, var2, var3, var4, 0, 128);
         if (1.0F == var11) {
            this.field4055.method5879(var14, var15, 192);
         } else {
            this.field4055.method5939(var14, var15, (int)(var11 * (float)var9), (int)(var11 * (float)var10), 192);
         }
      }

   }

   public int method6010(byte var1) {
      return this.field4022.method4637(this.field4014.method355((byte)16), class41.field516.field513, -439580923) ? 100 : this.field4022.method4576(this.field4014.method355((byte)16), 1720893752);
   }

   public void method6011(byte var1) {
      class35.field470.method3944(5);
      class35.field458.method3944(5);
   }

   public void method6049(class261 var1, class311 var2, HashMap var3, class330[] var4, int var5) {
      this.field4012 = var4;
      this.field4022 = var1;
      this.field4010 = var2;
      this.field4011 = new HashMap();
      this.field4011.put(class24.field347, var3.get(field4021));
      this.field4011.put(class24.field346, var3.get(field4008));
      this.field4011.put(class24.field344, var3.get(field4009));
      this.field4018 = new class333(var1);
      int var6 = this.field4022.method4606(class41.field515.field513, -115857428);
      int[] var7 = this.field4022.method4562(var6, -1204734541);
      this.field4046 = new HashMap(var7.length);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         class194 var9 = new class194(this.field4022.method4551(var6, var7[var8], 1294569847));
         class32 var10 = new class32();
         var10.method305(var9, var7[var8], (byte)39);
         this.field4046.put(var10.method355((byte)16), var10);
         if (var10.method374(-2120745005)) {
            this.field4014 = var10;
         }
      }

      this.method6039(this.field4014, 960749060);
      this.field4013 = null;
   }

   public void method6015(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = new int[4];
      class327.method5771(var7);
      class327.method5733(var1, var2, var3 + var1, var2 + var4);
      class327.method5810(var1, var2, var3, var4, -16777216);
      int var8 = this.field4018.method5997(-924662176);
      if (var8 < 100) {
         this.method6034(var1, var2, var3, var4, var8, 718919850);
      } else {
         if (!this.field4023.method588(-1131758784)) {
            this.field4023.method580(this.field4022, this.field4015.method355((byte)16), client.field855, -263697855);
            if (!this.field4023.method588(-129922714)) {
               return;
            }
         }

         if (this.field4032 != null) {
            ++this.field4034;
            if (this.field4034 % this.field4030 == 0) {
               this.field4034 = 0;
               ++this.field4033;
            }

            if (this.field4033 >= this.field4035 && !this.field4031) {
               this.field4032 = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.field4002));
         int var10 = (int)Math.ceil((double)((float)var4 / this.field4002));
         this.field4023.method582(this.field4019 - var9 / 2, this.field4020 - var10 / 2, var9 / 2 + this.field4019, var10 / 2 + this.field4020, var1, var2, var3 + var1, var2 + var4, (byte)121);
         if (!this.field4047) {
            boolean var11 = false;
            if (var5 - this.field4048 > 100) {
               this.field4048 = var5;
               var11 = true;
            }

            this.field4023.method583(this.field4019 - var9 / 2, this.field4020 - var10 / 2, var9 / 2 + this.field4019, var10 / 2 + this.field4020, var1, var2, var3 + var1, var2 + var4, this.field4029, this.field4032, this.field4034, this.field4030, var11, 1816619576);
         }

         this.method6031(var1, var2, var3, var4, var9, var10, (byte)48);
         if (class237.method4377((byte)59) && this.field4054 && this.field4040 != null) {
            this.field4010.method5521("Coord: " + this.field4040, class327.field3952 + 10, class327.field3955 + 20, 16776960, -1);
         }

         this.field4025 = var9;
         this.field4017 = var10;
         this.field4027 = var1;
         this.field4028 = var2;
         class327.method5736(var7);
      }

   }

   public void method6032(int var1, int var2, int var3, int var4, int var5) {
      if (this.field4018.method5999(-918766689)) {
         if (!this.field4023.method588(-1177249993)) {
            this.field4023.method580(this.field4022, this.field4015.method355((byte)16), client.field855, -263697855);
            if (!this.field4023.method588(479941220)) {
               return;
            }
         }

         this.field4023.method620(var1, var2, var3, var4, this.field4032, this.field4034, this.field4030, 1679589986);
      }

   }

   public void method6021(int var1, int var2, int var3, boolean var4, int var5) {
      class32 var6 = this.method6020(var1, var2, var3, (byte)29);
      if (var6 == null) {
         if (!var4) {
            return;
         }

         var6 = this.field4014;
      }

      boolean var7 = false;
      if (var6 != this.field4013 || var4) {
         this.field4013 = var6;
         this.method6039(var6, 681392391);
         var7 = true;
      }

      if (var7 || var4) {
         this.method6144(var1, var2, var3, (byte)42);
      }

   }

   public void method6108(short var1) {
      this.field4018.method5995(344420033);
   }

   public void method6166(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field4018.method5999(-1758694332)) {
         this.method6153(-408085666);
         this.method6016(102037237);
         if (var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.field4002));
            int var10 = (int)Math.ceil((double)((float)var7 / this.field4002));
            List var11 = this.field4023.method586(this.field4019 - var9 / 2 - 1, this.field4020 - var10 / 2 - 1, var9 / 2 + this.field4019 + 1, var10 / 2 + this.field4020 + 1, var4, var5, var6, var7, var1, var2, (byte)0);
            HashSet var12 = new HashSet();

            Iterator var13;
            class40 var14;
            class68 var15;
            class48 var16;
            for(var13 = var11.iterator(); var13.hasNext(); class198.method3757(var15, 2018684895, false)) {
               var14 = (class40)var13.next();
               var12.add(var14);
               var15 = new class68();
               var16 = new class48(var14.field510, var14.field506, var14.field512);
               var15.method1102(new Object[]{var16, var1, var2}, (byte)-9);
               if (this.field4052.contains(var14)) {
                  var15.method1099(class245.field2956, -1705286435);
               } else {
                  var15.method1099(class245.field2952, -1705286435);
               }
            }

            var13 = this.field4052.iterator();

            while(var13.hasNext()) {
               var14 = (class40)var13.next();
               if (!var12.contains(var14)) {
                  var15 = new class68();
                  var16 = new class48(var14.field510, var14.field506, var14.field512);
                  var15.method1102(new Object[]{var16, var1, var2}, (byte)-6);
                  var15.method1099(class245.field2955, -1705286435);
                  class198.method3757(var15, 1326922092, false);
               }
            }

            this.field4052 = var12;
         }
      }

   }

   public void method6064(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.field4018.method5999(-1906469028)) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.field4002));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field4002));
         List var10 = this.field4023.method586(this.field4019 - var8 / 2 - 1, this.field4020 - var9 / 2 - 1, var8 / 2 + this.field4019 + 1, var9 / 2 + this.field4020 + 1, var1, var2, var3, var4, var5, var6, (byte)0);
         if (!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var12;
            do {
               if (!var11.hasNext()) {
                  return;
               }

               class40 var13 = (class40)var11.next();
               class269 var14 = class269.field3471[var13.field510];
               var12 = false;

               for(int var15 = this.field4049.length - 1; var15 >= 0; --var15) {
                  if (var14.field3461[var15] != null) {
                     class164.method3228(var14.field3461[var15], var14.field3460, this.field4049[var15], var13.field510, var13.field506.method4382((byte)-61), var13.field512.method4382((byte)-46), (byte)-31);
                     var12 = true;
                  }
               }
            } while(!var12);
         }
      }

   }

   public void method6013(int var1, int var2, boolean var3, boolean var4, int var5) {
      long var6 = class6.method28(1358803598);
      this.method6014(var1, var2, var4, var6);
      if (this.method6019(1847675345) || !var4 && !var3) {
         this.method6018((byte)13);
      } else {
         if (var4) {
            this.field4037 = var1;
            this.field4038 = var2;
            this.field4016 = this.field4019;
            this.field4036 = this.field4020;
         }

         if (this.field4016 != -1) {
            int var8 = var1 - this.field4037;
            int var9 = var2 - this.field4038;
            this.method6017(this.field4016 - (int)((float)var8 / this.field4024), (int)((float)var9 / this.field4024) + this.field4036, false, 1588231386);
         }
      }

      if (var4) {
         this.field4006 = var6;
         this.field4026 = var1;
         this.field4041 = var2;
      }

   }

   public void method6026(int var1, int var2) {
      class32 var3 = this.method6023(var1, (byte)-45);
      if (var3 != null) {
         this.method6039(var3, 1885699546);
      }

   }

   public int method6036(int var1) {
      return 1.0D == (double)this.field4024 ? 25 : (1.5D == (double)this.field4024 ? 37 : (2.0D == (double)this.field4024 ? 50 : ((double)this.field4024 == 3.0D ? 75 : ((double)this.field4024 == 4.0D ? 100 : 200))));
   }

   public void method6133(int var1, byte var2) {
      this.field4024 = this.method6035(var1, 1920641508);
   }

   public boolean method6038(byte var1) {
      return this.field4018.method5999(-1121327766);
   }

   public class238 method6053(int var1) {
      return this.field4015 == null ? null : this.field4015.method354(this.method6181(-2100800982), this.method6081((byte)0), 1095448979);
   }

   public void method6042(int var1, int var2, int var3, int var4) {
      if (this.field4015 != null) {
         int[] var5 = this.field4015.method309(var1, var2, var3, -260069970);
         if (var5 != null) {
            this.method6097(var5[0], var5[1], 1869399836);
         }
      }

   }

   public void method6196(int var1, int var2, int var3, int var4) {
      if (this.field4015 != null) {
         int[] var5 = this.field4015.method309(var1, var2, var3, -185892667);
         if (var5 != null) {
            this.method6143(var5[0], var5[1], -129635329);
         }
      }

   }

   public int method6131(int var1) {
      return this.field4015 == null ? -1 : this.field4015.method321(1505429007);
   }

   public void method6050(byte var1) {
      this.field4035 = 3;
   }

   public class32 method6024(int var1) {
      return this.field4015;
   }

   public void method6052(byte var1) {
      this.field4030 = 50;
   }

   public void method6030(int var1, int var2) {
      if (var1 >= 1) {
         this.field4035 = var1;
      }

   }

   public void method6056(int var1) {
      this.field4032 = null;
   }

   public void method6051(int var1, int var2) {
      if (var1 >= 1) {
         this.field4030 = var1;
      }

   }

   public void method6054(int var1, int var2) {
      this.field4032 = new HashSet();
      this.field4032.add(var1);
      this.field4033 = 0;
      this.field4034 = 0;
   }

   public void method6066(boolean var1, int var2) {
      this.field4031 = var1;
   }

   public void method6075(int var1, int var2) {
      this.field4032 = new HashSet();
      this.field4033 = 0;
      this.field4034 = 0;

      for(int var3 = 0; var3 < class269.field3471.length; ++var3) {
         if (class269.field3471[var3] != null && class269.field3471[var3].field3463 == var1) {
            this.field4032.add(class269.field3471[var3].field3452);
         }
      }

   }

   public class40 method6080(int var1) {
      if (!this.field4018.method5999(-1731277696)) {
         return null;
      } else if (!this.field4023.method588(-1650935302)) {
         return null;
      } else {
         HashMap var2 = this.field4023.method589(-1521817553);
         this.field4050 = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.field4050.addAll(var4);
         }

         this.field4051 = this.field4050.iterator();
         return this.method6068(-2048576770);
      }
   }

   public void method6057(boolean var1, int var2) {
      this.field4047 = !var1;
   }

   public boolean method6060(int var1) {
      return !this.field4047;
   }

   public void method6058(int var1, boolean var2, byte var3) {
      if (!var2) {
         this.field4043.add(var1);
      } else {
         this.field4043.remove(var1);
      }

      this.method6063(-127819397);
   }

   public void method6059(int var1, boolean var2, int var3) {
      if (!var2) {
         this.field4044.add(var1);
      } else {
         this.field4044.remove(var1);
      }

      for(int var4 = 0; var4 < class269.field3471.length; ++var4) {
         if (class269.field3471[var4] != null && class269.field3471[var4].field3463 == var1) {
            int var5 = class269.field3471[var4].field3452;
            if (!var2) {
               this.field4045.add(var5);
            } else {
               this.field4045.remove(var5);
            }
         }
      }

      this.method6063(-127819397);
   }

   public boolean method6061(int var1, int var2) {
      return !this.field4043.contains(var1);
   }

   public void method6202(class32 var1, class238 var2, class238 var3, boolean var4, byte var5) {
      if (var1 != null) {
         if (this.field4015 == null || var1 != this.field4015) {
            this.method6174(var1, 1200956661);
         }

         if (!var4 && this.field4015.method307(var2.field2779, var2.field2774, var2.field2776, (byte)-4)) {
            this.method6144(var2.field2779, var2.field2774, var2.field2776, (byte)-49);
         } else {
            this.method6144(var3.field2779, var3.field2774, var3.field2776, (byte)48);
         }
      }

   }

   public boolean method6062(int var1, int var2) {
      return !this.field4044.contains(var1);
   }

   public class238 method6065(int var1, class238 var2, int var3) {
      if (!this.field4018.method5999(-1376084163)) {
         return null;
      } else if (!this.field4023.method588(553829488)) {
         return null;
      } else if (!this.field4015.method308(var2.field2774, var2.field2776, (byte)103)) {
         return null;
      } else {
         HashMap var4 = this.field4023.method589(-1521817553);
         List var5 = (List)var4.get(var1);
         if (var5 != null && !var5.isEmpty()) {
            class40 var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(var8.hasNext()) {
               class40 var9 = (class40)var8.next();
               int var11 = var9.field512.field2774 - var2.field2774;
               int var12 = var9.field512.field2776 - var2.field2776;
               int var10 = var11 * var11 + var12 * var12;
               if (var10 == 0) {
                  return var9.field512;
               }

               if (var10 < var7 || var6 == null) {
                  var6 = var9;
                  var7 = var10;
               }
            }

            return var6.field512;
         } else {
            return null;
         }
      }
   }

   public void method6043(int var1, int var2, class238 var3, class238 var4, short var5) {
      class68 var6 = new class68();
      class48 var7 = new class48(var2, var3, var4);
      var6.method1102(new Object[]{var7}, (byte)-54);
      switch(var1) {
      case 1008:
         var6.method1099(class245.field2950, -1705286435);
         break;
      case 1009:
         var6.method1099(class245.field2951, -1705286435);
         break;
      case 1010:
         var6.method1099(class245.field2959, -1705286435);
         break;
      case 1011:
         var6.method1099(class245.field2949, -1705286435);
         break;
      case 1012:
         var6.method1099(class245.field2953, -1705286435);
      }

      class198.method3757(var6, -72599682, false);
   }

   static {
      field4021 = class309.field3872;
      field4008 = class309.field3873;
      field4009 = class309.field3880;
   }
}

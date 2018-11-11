public class class307 extends class299 {
   class302 field3858;
   public String field3857 = null;
   class335 field3861;
   public String field3856 = null;
   int field3863 = 1;
   public int field3862;
   public byte field3860;

   public class307(class335 var1, class302 var2) {
      super(100);
      this.field3861 = var1;
      this.field3858 = var2;
   }

   final void method5465(String var1, int var2) {
      this.field3856 = class149.method3123(var1, -2026906917);
   }

   class296 vmethod5462(int var1) {
      return new class295();
   }

   final void method5464(String var1, int var2) {
      this.field3857 = class149.method3123(var1, -2062959657);
   }

   class296[] vmethod5463(int var1, int var2) {
      return new class295[var1];
   }

   public final void method5468(int var1) {
      for(int var2 = 0; var2 < this.method5314(534322497); ++var2) {
         ((class295)this.method5350(var2, -1112734190)).method5236(1888442137);
      }

   }

   public final void method5469(int var1) {
      for(int var2 = 0; var2 < this.method5314(-1975984435); ++var2) {
         ((class295)this.method5350(var2, -1380247516)).method5239(-686329144);
      }

   }

   final void method5466(class295 var1, int var2) {
      if (var1.method5260(1291806181).equals(this.field3858.vmethod5410((byte)24))) {
         this.field3862 = var1.field3838;
      }

   }

   public final void method5490(class194 var1, int var2) {
      class305 var3 = new class305(var1.getString1(-778927800), this.field3861);
      int var4 = var1.getUShort(-1208216487);
      byte var5 = var1.getByte(43643779);
      boolean var6 = false;
      if (var5 == -128) {
         var6 = true;
      }

      class295 var7;
      if (var6) {
         if (this.method5314(1687613697) == 0) {
            return;
         }

         var7 = (class295)this.method5319(var3, 432345360);
         if (var7 != null && var7.method5400(-1960925756) == var4) {
            this.method5321(var7, -1873841802);
         }
      } else {
         var1.getString1(-778927800);
         var7 = (class295)this.method5319(var3, 964474628);
         if (var7 == null) {
            if (this.method5314(1898873083) > super.field3833) {
               return;
            }

            var7 = (class295)this.method5322(var3, 1156446856);
         }

         var7.method5395(var4, ++this.field3863 - 1, 86941883);
         var7.field3838 = var5;
         this.method5466(var7, 1201553057);
      }

   }

   public final void method5492(class194 var1, short var2) {
      this.method5465(var1.getString1(-778927800), -467536568);
      long var3 = var1.getLong(-66839765);
      long var5 = var3;
      String var7;
      int var8;
      if (var3 > 0L && var3 < 6582952005840035281L) {
         if (var3 % 37L == 0L) {
            var7 = null;
         } else {
            var8 = 0;

            for(long var9 = var3; 0L != var9; var9 /= 37L) {
               ++var8;
            }

            StringBuilder var12 = new StringBuilder(var8);

            while(0L != var5) {
               long var10 = var5;
               var5 /= 37L;
               var12.append(class316.field3922[(int)(var10 - var5 * 37L)]);
            }

            var7 = var12.reverse().toString();
         }
      } else {
         var7 = null;
      }

      this.method5464(var7, -490804797);
      this.field3860 = var1.getByte(1584279807);
      var8 = var1.getUByte(-1164269691);
      if (var8 != 255) {
         this.method5351(1949425142);

         for(int var13 = 0; var13 < var8; ++var13) {
            class295 var14 = (class295)this.method5322(new class305(var1.getString1(-778927800), this.field3861), 1905349849);
            int var11 = var1.getUShort(-1208216487);
            var14.method5395(var11, ++this.field3863 - 1, 1682454489);
            var14.field3838 = var1.getByte(952250458);
            var1.getString1(-778927800);
            this.method5466(var14, -430296050);
         }
      }

   }

   public static final int method5491(class335 var0, int var1) {
      if (var0 == null) {
         return 12;
      } else {
         switch(var0.field4070) {
         case 7:
            return 20;
         default:
            return 12;
         }
      }
   }

   static void method5483(byte var0) {
      if (class90.field1345) {
         class90.field1339 = null;
         class203.field2605 = null;
         class90.field1347 = null;
         class317.field3926 = null;
         class61.field715 = null;
         class90.field1341 = null;
         class38.field491 = null;
         class123.field1691 = null;
         class151.field2127 = null;
         class25.field356 = null;
         class90.field1348 = null;
         class107.field1569 = null;
         class157.field2145 = null;
         class287.field3764 = null;
         class38.field489 = null;
         class7.field231 = null;
         class36.field480 = null;
         class92.field1408 = null;
         class4.field30 = null;
         class5.field34 = null;
         class90.field1362 = null;
         class164.field2181 = null;
         class262.method4660(2, 985642245);
         class189.method3481(true, 1562669962);
         class90.field1345 = false;
      }

   }
}

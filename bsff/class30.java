public class class30 implements class43 {
   static int field415;
   int field411;
   int field406;
   int field408;
   int field414;
   int field412;
   int field407;
   int field413;
   int field405;
   int field409;
   int field410;

   public boolean vmethod758(int var1, int var2, short var3) {
      return var1 >> 6 >= this.field411 && var1 >> 6 <= this.field408 && var2 >> 6 >= this.field412 && var2 >> 6 <= this.field413;
   }

   public boolean vmethod753(int var1, int var2, int var3, int var4) {
      return var1 >= this.field406 && var1 < this.field406 + this.field414 ? var2 >> 6 >= this.field407 && var2 >> 6 <= this.field405 && var3 >> 6 >= this.field409 && var3 >> 6 <= this.field410 : false;
   }

   public void vmethod751(class32 var1, int var2) {
      if (var1.field433 > this.field411) {
         var1.field433 = this.field411;
      }

      if (var1.field431 < this.field408) {
         var1.field431 = this.field408;
      }

      if (var1.field434 > this.field412) {
         var1.field434 = this.field412;
      }

      if (var1.field436 < this.field413) {
         var1.field436 = this.field413;
      }

   }

   public class238 vmethod777(int var1, int var2, byte var3) {
      if (!this.vmethod758(var1, var2, (short)9934)) {
         return null;
      } else {
         int var4 = this.field407 * 64 - this.field411 * 64 + var1;
         int var5 = this.field409 * 64 - this.field412 * 64 + var2;
         return new class238(this.field406, var4, var5);
      }
   }

   public int[] vmethod754(int var1, int var2, int var3, int var4) {
      if (!this.vmethod753(var1, var2, var3, 1374848126)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field411 * 64 - this.field407 * 64 + var2, var3 + (this.field412 * 64 - this.field409 * 64)};
         return var5;
      }
   }

   public void vmethod756(class194 var1, int var2) {
      this.field406 = var1.getUByte(776359062);
      this.field414 = var1.getUByte(-2112436687);
      this.field407 = var1.getUShort(-1208216487);
      this.field409 = var1.getUShort(-1208216487);
      this.field405 = var1.getUShort(-1208216487);
      this.field410 = var1.getUShort(-1208216487);
      this.field411 = var1.getUShort(-1208216487);
      this.field412 = var1.getUShort(-1208216487);
      this.field408 = var1.getUShort(-1208216487);
      this.field413 = var1.getUShort(-1208216487);
      this.method294((byte)-14);
   }

   void method294(byte var1) {
   }

   static void method274(class242 var0, int var1) {
      if (var0.field2946 == client.field1059) {
         client.field1060[var0.field2945] = true;
      }

   }

   static void method298(int var0) {
      for(class67 var1 = (class67)client.field1017.method3962(); var1 != null; var1 = (class67)client.field1017.method3965()) {
         int var2 = var1.field773;
         if (class305.method5452(var2, -1009820586)) {
            boolean var3 = true;
            class242[] var4 = class189.field2519[var2];

            int var5;
            for(var5 = 0; var5 < var4.length; ++var5) {
               if (var4[var5] != null) {
                  var3 = var4[var5].field2813;
                  break;
               }
            }

            if (!var3) {
               var5 = (int)var1.field2644;
               class242 var6 = class3.method2(var5, 2100447056);
               if (var6 != null) {
                  method274(var6, 1437371222);
               }
            }
         }
      }

   }

   static final void method300(class75 var0, int var1, int var2) {
      int var3;
      int var4;
      int var5;
      if (var0.field1196 > client.field866) {
         var3 = var0.field1196 - client.field866;
         var4 = var0.field1192 * 128 + var0.field1153 * 64;
         var5 = var0.field1202 * 128 + var0.field1153 * 64;
         var0.field1185 += (var4 - var0.field1185) / var3;
         var0.field1209 += (var5 - var0.field1209) / var3;
         var0.field1208 = 0;
         var0.field1201 = var0.field1198;
      } else if (var0.field1197 >= client.field866) {
         class44.method661(var0, -2014876400);
      } else {
         class83.method1823(var0, 666301995);
      }

      if (var0.field1185 < 128 || var0.field1209 < 128 || var0.field1185 >= 13184 || var0.field1209 >= 13184) {
         var0.field1182 = -1;
         var0.field1187 = -1;
         var0.field1196 = 0;
         var0.field1197 = 0;
         var0.field1185 = var0.field1188[0] * 128 + var0.field1153 * 64;
         var0.field1209 = var0.field1206[0] * 128 + var0.field1153 * 64;
         var0.method1589(-200057315);
      }

      if (class12.field259 == var0 && (var0.field1185 < 1536 || var0.field1209 < 1536 || var0.field1185 >= 11776 || var0.field1209 >= 11776)) {
         var0.field1182 = -1;
         var0.field1187 = -1;
         var0.field1196 = 0;
         var0.field1197 = 0;
         var0.field1185 = var0.field1188[0] * 128 + var0.field1153 * 64;
         var0.field1209 = var0.field1206[0] * 128 + var0.field1153 * 64;
         var0.method1589(-531122825);
      }

      if (var0.field1203 != 0) {
         if (var0.field1190 != -1) {
            Object var6 = null;
            if (var0.field1190 < 32768) {
               var6 = client.field897[var0.field1190];
            } else if (var0.field1190 >= 32768) {
               var6 = client.field971[var0.field1190 - '\u8000'];
            }

            if (var6 != null) {
               var4 = var0.field1185 - ((class75)var6).field1185;
               var5 = var0.field1209 - ((class75)var6).field1209;
               if (var4 != 0 || var5 != 0) {
                  var0.field1201 = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
               }
            } else if (var0.field1177) {
               var0.field1190 = -1;
               var0.field1177 = false;
            }
         }

         if (var0.field1165 != -1 && (var0.field1204 == 0 || var0.field1208 > 0)) {
            var0.field1201 = var0.field1165;
            var0.field1165 = -1;
         }

         var3 = var0.field1201 - var0.field1151 & 2047;
         if (var3 == 0 && var0.field1177) {
            var0.field1190 = -1;
            var0.field1177 = false;
         }

         if (var3 != 0) {
            ++var0.field1149;
            boolean var7;
            if (var3 > 1024) {
               var0.field1151 -= var0.field1203;
               var7 = true;
               if (var3 < var0.field1203 || var3 > 2048 - var0.field1203) {
                  var0.field1151 = var0.field1201;
                  var7 = false;
               }

               if (var0.field1173 == var0.field1155 && (var0.field1149 > 25 || var7)) {
                  if (var0.field1195 != -1) {
                     var0.field1173 = var0.field1195;
                  } else {
                     var0.field1173 = var0.field1158;
                  }
               }
            } else {
               var0.field1151 += var0.field1203;
               var7 = true;
               if (var3 < var0.field1203 || var3 > 2048 - var0.field1203) {
                  var0.field1151 = var0.field1201;
                  var7 = false;
               }

               if (var0.field1155 == var0.field1173 && (var0.field1149 > 25 || var7)) {
                  if (var0.field1157 != -1) {
                     var0.field1173 = var0.field1157;
                  } else {
                     var0.field1173 = var0.field1158;
                  }
               }
            }

            var0.field1151 &= 2047;
         } else {
            var0.field1149 = 0;
         }
      }

      class55.method828(var0, -613266263);
   }

   static int method278(class77 var0, class77 var1, int var2, boolean var3, int var4) {
      if (var2 == 1) {
         int var5 = var0.field1228;
         int var6 = var1.field1228;
         if (!var3) {
            if (var5 == -1) {
               var5 = 2001;
            }

            if (var6 == -1) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else {
         return var2 == 2 ? var0.field1231 - var1.field1231 : (var2 == 3 ? (var0.field1225.equals("-") ? (var1.field1225.equals("-") ? 0 : (var3 ? -1 : 1)) : (var1.field1225.equals("-") ? (var3 ? 1 : -1) : var0.field1225.compareTo(var1.field1225))) : (var2 == 4 ? (var0.method1624((byte)102) ? (var1.method1624((byte)104) ? 0 : 1) : (var1.method1624((byte)40) ? -1 : 0)) : (var2 == 5 ? (var0.method1609((byte)100) ? (var1.method1609((byte)100) ? 0 : 1) : (var1.method1609((byte)100) ? -1 : 0)) : (var2 == 6 ? (var0.method1610(-1549430903) ? (var1.method1610(-1539846217) ? 0 : 1) : (var1.method1610(-1366260347) ? -1 : 0)) : (var2 == 7 ? (var0.method1614(867548888) ? (var1.method1614(867548888) ? 0 : 1) : (var1.method1614(867548888) ? -1 : 0)) : var0.field1230 - var1.field1230)))));
      }
   }
}

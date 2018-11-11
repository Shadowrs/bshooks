public class class141 {
   static class77[] field2058;
   int field2059;
   int field2056;
   int field2057;

   public static class184 method3078(class181 var0, class202 var1, byte var2) {
      class184 var3;
      if (class184.field2496 == 0) {
         var3 = new class184();
      } else {
         var3 = class184.field2495[--class184.field2496];
      }

      var3.field2499 = var0;
      var3.field2492 = var0.field2428;
      if (var3.field2492 == -1) {
         var3.field2500 = new class201(260);
      } else if (var3.field2492 == -2) {
         var3.field2500 = new class201(10000);
      } else if (var3.field2492 <= 18) {
         var3.field2500 = new class201(20);
      } else if (var3.field2492 <= 98) {
         var3.field2500 = new class201(100);
      } else {
         var3.field2500 = new class201(260);
      }

      var3.field2500.method3816(var1, -204900323);
      var3.field2500.method3790(var3.field2499.field2470, 1234455582);
      var3.field2494 = 0;
      return var3;
   }

   static int method3077(int var0, class96 var1, boolean var2, byte var3) {
      int var4;
      if (var0 == 3903) {
         var4 = class81.field1272[--class135.field1964];
         class81.field1272[++class135.field1964 - 1] = client.field1121[var4].method113((byte)64);
         return 1;
      } else if (var0 == 3904) {
         var4 = class81.field1272[--class135.field1964];
         class81.field1272[++class135.field1964 - 1] = client.field1121[var4].field284;
         return 1;
      } else if (var0 == 3905) {
         var4 = class81.field1272[--class135.field1964];
         class81.field1272[++class135.field1964 - 1] = client.field1121[var4].field290;
         return 1;
      } else if (var0 == 3906) {
         var4 = class81.field1272[--class135.field1964];
         class81.field1272[++class135.field1964 - 1] = client.field1121[var4].field286;
         return 1;
      } else if (var0 == 3907) {
         var4 = class81.field1272[--class135.field1964];
         class81.field1272[++class135.field1964 - 1] = client.field1121[var4].field287;
         return 1;
      } else if (var0 == 3908) {
         var4 = class81.field1272[--class135.field1964];
         class81.field1272[++class135.field1964 - 1] = client.field1121[var4].field283;
         return 1;
      } else {
         int var5;
         if (var0 == 3910) {
            var4 = class81.field1272[--class135.field1964];
            var5 = client.field1121[var4].method112(-2098724091);
            class81.field1272[++class135.field1964 - 1] = var5 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var4 = class81.field1272[--class135.field1964];
            var5 = client.field1121[var4].method112(-1155569115);
            class81.field1272[++class135.field1964 - 1] = var5 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var4 = class81.field1272[--class135.field1964];
            var5 = client.field1121[var4].method112(1104832543);
            class81.field1272[++class135.field1964 - 1] = var5 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var4 = class81.field1272[--class135.field1964];
            var5 = client.field1121[var4].method112(-1817894932);
            class81.field1272[++class135.field1964 - 1] = var5 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var6;
            if (var0 == 3914) {
               var6 = class81.field1272[--class135.field1964] == 1;
               if (client.field888 != null) {
                  client.field888.method85(class13.field268, var6, 65533);
               }

               return 1;
            } else if (var0 == 3915) {
               var6 = class81.field1272[--class135.field1964] == 1;
               if (client.field888 != null) {
                  client.field888.method85(class13.field267, var6, 65533);
               }

               return 1;
            } else if (var0 == 3916) {
               class135.field1964 -= 2;
               var6 = class81.field1272[class135.field1964] == 1;
               boolean var14 = class81.field1272[class135.field1964 + 1] == 1;
               if (client.field888 != null) {
                  client.field1057.field854 = var14;
                  client.field888.method85(client.field1057, var6, 65533);
               }

               return 1;
            } else if (var0 == 3917) {
               var6 = class81.field1272[--class135.field1964] == 1;
               if (client.field888 != null) {
                  client.field888.method85(class13.field271, var6, 65533);
               }

               return 1;
            } else if (var0 == 3918) {
               var6 = class81.field1272[--class135.field1964] == 1;
               if (client.field888 != null) {
                  client.field888.method85(class13.field270, var6, 65533);
               }

               return 1;
            } else if (var0 == 3919) {
               class81.field1272[++class135.field1964 - 1] = client.field888 == null ? 0 : client.field888.field269.size();
               return 1;
            } else {
               class14 var7;
               if (var0 == 3920) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = (class14)client.field888.field269.get(var4);
                  class81.field1272[++class135.field1964 - 1] = var7.field273;
                  return 1;
               } else if (var0 == 3921) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = (class14)client.field888.field269.get(var4);
                  class81.field1281[++class77.field1233 - 1] = var7.method92(62474252);
                  return 1;
               } else if (var0 == 3922) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = (class14)client.field888.field269.get(var4);
                  class81.field1281[++class77.field1233 - 1] = var7.method88(553728684);
                  return 1;
               } else if (var0 == 3923) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = (class14)client.field888.field269.get(var4);
                  long var8 = class6.method28(1358803598) - class265.field3431 - var7.field278;
                  int var10 = (int)(var8 / 3600000L);
                  int var11 = (int)((var8 - (long)(var10 * 3600000)) / 60000L);
                  int var12 = (int)((var8 - (long)(var10 * 3600000) - (long)(var11 * '\uea60')) / 1000L);
                  String var13 = var10 + ":" + var11 / 10 + var11 % 10 + ":" + var12 / 10 + var12 % 10;
                  class81.field1281[++class77.field1233 - 1] = var13;
                  return 1;
               } else if (var0 == 3924) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = (class14)client.field888.field269.get(var4);
                  class81.field1272[++class135.field1964 - 1] = var7.field274.field286;
                  return 1;
               } else if (var0 == 3925) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = (class14)client.field888.field269.get(var4);
                  class81.field1272[++class135.field1964 - 1] = var7.field274.field290;
                  return 1;
               } else if (var0 == 3926) {
                  var4 = class81.field1272[--class135.field1964];
                  var7 = (class14)client.field888.field269.get(var4);
                  class81.field1272[++class135.field1964 - 1] = var7.field274.field284;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static void method3076(byte var0) {
      client.field902.method2036(method3078(class181.field2380, client.field902.field1475, (byte)-48), (byte)115);
      client.field930 = 0;
   }
}

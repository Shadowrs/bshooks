public class class136 extends class216 {
   static byte[][] field1970;
   static int[] field1973;
   int field1969;
   int field1972;
   int[] field1975;
   int[][] field1971;

   class136(int var1, byte[] var2) {
      this.field1969 = var1;
      class194 var3 = new class194(var2);
      this.field1972 = var3.getUByte(-1317626561);
      this.field1975 = new int[this.field1972];
      this.field1971 = new int[this.field1972][];

      int var4;
      for(var4 = 0; var4 < this.field1972; ++var4) {
         this.field1975[var4] = var3.getUByte(210961939);
      }

      for(var4 = 0; var4 < this.field1972; ++var4) {
         this.field1971[var4] = new int[var3.getUByte(-1871875335)];
      }

      for(var4 = 0; var4 < this.field1972; ++var4) {
         for(int var5 = 0; var5 < this.field1971[var4].length; ++var5) {
            this.field1971[var4][var5] = var3.getUByte(-1774967184);
         }
      }

   }

   public static int method2876(CharSequence var0, int var1, boolean var2, int var3) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (var8 == 0) {
               if (var9 == '-') {
                  var4 = true;
                  continue;
               }

               if (var9 == '+') {
                  continue;
               }
            }

            int var10;
            if (var9 >= '0' && var9 <= '9') {
               var10 = var9 - 48;
            } else if (var9 >= 'A' && var9 <= 'Z') {
               var10 = var9 - 55;
            } else {
               if (var9 < 'a' || var9 > 'z') {
                  throw new NumberFormatException();
               }

               var10 = var9 - 87;
            }

            if (var10 >= var1) {
               throw new NumberFormatException();
            }

            if (var4) {
               var10 = -var10;
            }

            int var11 = var10 + var6 * var1;
            if (var11 / var1 != var6) {
               throw new NumberFormatException();
            }

            var6 = var11;
            var5 = true;
         }

         if (!var5) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }

   static int method2874(int var0, class96 var1, boolean var2, int var3) {
      int var4 = -1;
      class242 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class81.field1272[--class135.field1964];
         var5 = class3.method2(var4, 2114103837);
      } else {
         var5 = var2 ? class336.field4073 : class61.field713;
      }

      if (var0 == 1100) {
         class135.field1964 -= 2;
         var5.field2835 = class81.field1272[class135.field1964];
         if (var5.field2835 > var5.field2849 - var5.field2826) {
            var5.field2835 = var5.field2849 - var5.field2826;
         }

         if (var5.field2835 < 0) {
            var5.field2835 = 0;
         }

         var5.field2836 = class81.field1272[class135.field1964 + 1];
         if (var5.field2836 > var5.field2838 - var5.field2887) {
            var5.field2836 = var5.field2838 - var5.field2887;
         }

         if (var5.field2836 < 0) {
            var5.field2836 = 0;
         }

         class30.method274(var5, -1445519211);
         return 1;
      } else if (var0 == 1101) {
         var5.field2839 = class81.field1272[--class135.field1964];
         class30.method274(var5, -47407910);
         return 1;
      } else if (var0 == 1102) {
         var5.field2843 = class81.field1272[--class135.field1964] == 1;
         class30.method274(var5, 860922777);
         return 1;
      } else if (var0 == 1103) {
         var5.field2845 = class81.field1272[--class135.field1964];
         class30.method274(var5, 1581616328);
         return 1;
      } else if (var0 == 1104) {
         var5.field2847 = class81.field1272[--class135.field1964];
         class30.method274(var5, -1913860630);
         return 1;
      } else if (var0 == 1105) {
         var5.field2893 = class81.field1272[--class135.field1964];
         class30.method274(var5, 966292371);
         return 1;
      } else if (var0 == 1106) {
         var5.field2851 = class81.field1272[--class135.field1964];
         class30.method274(var5, 1608858262);
         return 1;
      } else if (var0 == 1107) {
         var5.field2852 = class81.field1272[--class135.field1964] == 1;
         class30.method274(var5, 1847233394);
         return 1;
      } else if (var0 == 1108) {
         var5.field2857 = 1;
         var5.field2923 = class81.field1272[--class135.field1964];
         class30.method274(var5, -506795104);
         return 1;
      } else if (var0 == 1109) {
         class135.field1964 -= 6;
         var5.field2854 = class81.field1272[class135.field1964];
         var5.field2864 = class81.field1272[class135.field1964 + 1];
         var5.field2865 = class81.field1272[class135.field1964 + 2];
         var5.field2866 = class81.field1272[class135.field1964 + 3];
         var5.field2824 = class81.field1272[class135.field1964 + 4];
         var5.field2868 = class81.field1272[class135.field1964 + 5];
         class30.method274(var5, 1493152115);
         return 1;
      } else {
         int var6;
         if (var0 == 1110) {
            var6 = class81.field1272[--class135.field1964];
            if (var6 != var5.field2831) {
               var5.field2831 = var6;
               var5.field2837 = 0;
               var5.field2806 = 0;
               class30.method274(var5, 731654153);
            }

            return 1;
         } else if (var0 == 1111) {
            var5.field2829 = class81.field1272[--class135.field1964] == 1;
            class30.method274(var5, -731964912);
            return 1;
         } else if (var0 == 1112) {
            String var9 = class81.field1281[--class77.field1233];
            if (!var9.equals(var5.field2876)) {
               var5.field2876 = var9;
               class30.method274(var5, 190851813);
            }

            return 1;
         } else if (var0 == 1113) {
            var5.field2873 = class81.field1272[--class135.field1964];
            class30.method274(var5, 937737915);
            return 1;
         } else if (var0 == 1114) {
            class135.field1964 -= 3;
            var5.field2877 = class81.field1272[class135.field1964];
            var5.field2929 = class81.field1272[class135.field1964 + 1];
            var5.field2804 = class81.field1272[class135.field1964 + 2];
            class30.method274(var5, -1842039961);
            return 1;
         } else if (var0 == 1115) {
            var5.field2879 = class81.field1272[--class135.field1964] == 1;
            class30.method274(var5, 16913517);
            return 1;
         } else if (var0 == 1116) {
            var5.field2853 = class81.field1272[--class135.field1964];
            class30.method274(var5, -1385527820);
            return 1;
         } else if (var0 == 1117) {
            var5.field2874 = class81.field1272[--class135.field1964];
            class30.method274(var5, 1655282491);
            return 1;
         } else if (var0 == 1118) {
            var5.field2848 = class81.field1272[--class135.field1964] == 1;
            class30.method274(var5, -2079396301);
            return 1;
         } else if (var0 == 1119) {
            var5.field2856 = class81.field1272[--class135.field1964] == 1;
            class30.method274(var5, 130668256);
            return 1;
         } else if (var0 == 1120) {
            class135.field1964 -= 2;
            var5.field2849 = class81.field1272[class135.field1964];
            var5.field2838 = class81.field1272[class135.field1964 + 1];
            class30.method274(var5, 2131841563);
            if (var4 != -1 && var5.field2850 == 0) {
               class40.method578(class189.field2519[var4 >> 16], var5, false, 1694531407);
            }

            return 1;
         } else if (var0 == 1121) {
            class97.method2019(var5.field2814, var5.field2815, 266103207);
            client.field1102 = var5;
            class30.method274(var5, 1215643732);
            return 1;
         } else if (var0 == 1122) {
            var5.field2855 = class81.field1272[--class135.field1964];
            class30.method274(var5, 2081744386);
            return 1;
         } else if (var0 == 1123) {
            var5.field2920 = class81.field1272[--class135.field1964];
            class30.method274(var5, -118636462);
            return 1;
         } else if (var0 == 1124) {
            var5.field2846 = class81.field1272[--class135.field1964];
            class30.method274(var5, 1643090356);
            return 1;
         } else if (var0 == 1125) {
            var6 = class81.field1272[--class135.field1964];
            class329 var8 = (class329)class44.method660(class107.method2198(-2132299585), var6, -2127248984);
            if (var8 != null) {
               var5.field2896 = var8;
               class30.method274(var5, 1822638837);
            }

            return 1;
         } else if (var0 == 1126) {
            boolean var7 = class81.field1272[--class135.field1964] == 1;
            var5.field2897 = var7;
            return 1;
         } else {
            return 2;
         }
      }
   }

   static void method2875(class201 var0, int var1, byte var2) {
      boolean var3 = var0.getBits(1, 921360267) == 1;
      if (var3) {
         class93.field1422[++class93.field1421 - 1] = var1;
      }

      int var4 = var0.getBits(2, -1216972325);
      class72 var5 = client.field971[var1];
      if (var4 == 0) {
         if (var3) {
            var5.field837 = false;
         } else {
            if (client.field1000 == var1) {
               throw new RuntimeException();
            }

            class93.field1420[var1] = (var5.field842 << 28) + (class4.field28 + var5.field1206[0] >> 13) + (class184.field2498 + var5.field1188[0] >> 13 << 14);
            if (var5.field1165 != -1) {
               class93.field1419[var1] = var5.field1165;
            } else {
               class93.field1419[var1] = var5.field1201;
            }

            class93.field1412[var1] = var5.field1190;
            client.field971[var1] = null;
            if (var0.getBits(1, 707687843) != 0) {
               class6.method27(var0, var1, 1222616853);
            }
         }
      } else {
         int var6;
         int var7;
         int var8;
         if (var4 == 1) {
            var6 = var0.getBits(3, 1886431436);
            var7 = var5.field1188[0];
            var8 = var5.field1206[0];
            if (var6 == 0) {
               --var7;
               --var8;
            } else if (var6 == 1) {
               --var8;
            } else if (var6 == 2) {
               ++var7;
               --var8;
            } else if (var6 == 3) {
               --var7;
            } else if (var6 == 4) {
               ++var7;
            } else if (var6 == 5) {
               --var7;
               ++var8;
            } else if (var6 == 6) {
               ++var8;
            } else if (var6 == 7) {
               ++var7;
               ++var8;
            }

            if (client.field1000 != var1 || var5.field1185 >= 1536 && var5.field1209 >= 1536 && var5.field1185 < 11776 && var5.field1209 < 11776) {
               if (var3) {
                  var5.field837 = true;
                  var5.field847 = var7;
                  var5.field846 = var8;
               } else {
                  var5.field837 = false;
                  var5.method1149(var7, var8, class93.field1409[var1], (byte)28);
               }
            } else {
               var5.method1159(var7, var8, -2048779069);
               var5.field837 = false;
            }
         } else if (var4 == 2) {
            var6 = var0.getBits(4, -1044382200);
            var7 = var5.field1188[0];
            var8 = var5.field1206[0];
            if (var6 == 0) {
               var7 -= 2;
               var8 -= 2;
            } else if (var6 == 1) {
               --var7;
               var8 -= 2;
            } else if (var6 == 2) {
               var8 -= 2;
            } else if (var6 == 3) {
               ++var7;
               var8 -= 2;
            } else if (var6 == 4) {
               var7 += 2;
               var8 -= 2;
            } else if (var6 == 5) {
               var7 -= 2;
               --var8;
            } else if (var6 == 6) {
               var7 += 2;
               --var8;
            } else if (var6 == 7) {
               var7 -= 2;
            } else if (var6 == 8) {
               var7 += 2;
            } else if (var6 == 9) {
               var7 -= 2;
               ++var8;
            } else if (var6 == 10) {
               var7 += 2;
               ++var8;
            } else if (var6 == 11) {
               var7 -= 2;
               var8 += 2;
            } else if (var6 == 12) {
               --var7;
               var8 += 2;
            } else if (var6 == 13) {
               var8 += 2;
            } else if (var6 == 14) {
               ++var7;
               var8 += 2;
            } else if (var6 == 15) {
               var7 += 2;
               var8 += 2;
            }

            if (client.field1000 != var1 || var5.field1185 >= 1536 && var5.field1209 >= 1536 && var5.field1185 < 11776 && var5.field1209 < 11776) {
               if (var3) {
                  var5.field837 = true;
                  var5.field847 = var7;
                  var5.field846 = var8;
               } else {
                  var5.field837 = false;
                  var5.method1149(var7, var8, class93.field1409[var1], (byte)8);
               }
            } else {
               var5.method1159(var7, var8, -1530594448);
               var5.field837 = false;
            }
         } else {
            var6 = var0.getBits(1, 1987530614);
            int var9;
            int var10;
            int var11;
            int var12;
            if (var6 == 0) {
               var7 = var0.getBits(12, -613207742);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = var9 + var5.field1188[0];
               var12 = var10 + var5.field1206[0];
               if (client.field1000 != var1 || var5.field1185 >= 1536 && var5.field1209 >= 1536 && var5.field1185 < 11776 && var5.field1209 < 11776) {
                  if (var3) {
                     var5.field837 = true;
                     var5.field847 = var11;
                     var5.field846 = var12;
                  } else {
                     var5.field837 = false;
                     var5.method1149(var11, var12, class93.field1409[var1], (byte)82);
                  }
               } else {
                  var5.method1159(var11, var12, -1881342795);
                  var5.field837 = false;
               }

               var5.field842 = (byte)(var8 + var5.field842 & 3);
               if (client.field1000 == var1) {
                  class237.field2769 = var5.field842;
               }
            } else {
               var7 = var0.getBits(30, -1651523408);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (var9 + class184.field2498 + var5.field1188[0] & 16383) - class184.field2498;
               var12 = (var10 + class4.field28 + var5.field1206[0] & 16383) - class4.field28;
               if (client.field1000 == var1 && (var5.field1185 < 1536 || var5.field1209 < 1536 || var5.field1185 >= 11776 || var5.field1209 >= 11776)) {
                  var5.method1159(var11, var12, -1490909058);
                  var5.field837 = false;
               } else if (var3) {
                  var5.field837 = true;
                  var5.field847 = var11;
                  var5.field846 = var12;
               } else {
                  var5.field837 = false;
                  var5.method1149(var11, var12, class93.field1409[var1], (byte)-3);
               }

               var5.field842 = (byte)(var8 + var5.field842 & 3);
               if (client.field1000 == var1) {
                  class237.field2769 = var5.field842;
               }
            }
         }
      }

   }
}

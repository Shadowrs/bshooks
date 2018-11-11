public abstract class class75 extends class139 {
   int field1204 = 0;
   int field1182 = -1;
   int[] field1188 = new int[10];
   int[] field1205 = new int[4];
   boolean field1181 = false;
   int field1165 = -1;
   int field1194 = 0;
   class215 field1175 = new class215();
   int[] field1206 = new int[10];
   byte field1169 = 0;
   int field1208 = 0;
   int field1164 = 0;
   int field1173 = -1;
   int field1153 = 1;
   int[] field1171 = new int[4];
   int field1155 = -1;
   int field1183 = 0;
   int field1195 = -1;
   int field1180 = 0;
   int field1157 = -1;
   int field1158 = -1;
   byte[] field1176 = new byte[10];
   int field1172 = -1;
   int field1185;
   int[] field1170 = new int[4];
   int field1160 = -1;
   int field1161 = -1;
   int[] field1150 = new int[4];
   int field1162 = -1;
   int field1200 = 200;
   int field1209;
   int[] field1174 = new int[4];
   String field1152 = null;
   int field1187 = -1;
   boolean field1179 = false;
   int field1159 = 0;
   int field1166 = 100;
   int field1207 = 0;
   int field1168 = 0;
   int field1191;
   int field1190 = -1;
   boolean field1177 = false;
   int field1201;
   int field1163 = 0;
   int field1184 = 0;
   int field1186 = 0;
   int field1156 = 0;
   int field1199 = 0;
   int field1149 = 0;
   int field1203 = 32;
   int field1196;
   int field1197;
   int field1192;
   int field1202;
   int field1193;
   int field1178;
   int field1198;
   int field1151;
   int field1154;
   int field1189;
   boolean field1167;

   boolean vmethod1824(int var1) {
      return false;
   }

   final void method1589(int var1) {
      this.field1204 = 0;
      this.field1194 = 0;
   }

   final void method1586(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         if (this.field1205[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if (var1 >= 0) {
         class281 var13 = class8.method49(var1, (byte)67);
         var11 = var13.field3581;
         var12 = var13.field3572;
      }

      int var15;
      if (var9) {
         if (var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if (var11 == 0) {
            var15 = this.field1205[0];
         } else if (var11 == 1) {
            var15 = this.field1171[0];
         }

         for(int var14 = 1; var14 < 4; ++var14) {
            if (var11 == 0) {
               if (this.field1205[var14] < var15) {
                  var10 = var14;
                  var15 = this.field1205[var14];
               }
            } else if (var11 == 1 && this.field1171[var14] < var15) {
               var10 = var14;
               var15 = this.field1171[var14];
            }
         }

         if (var11 == 1 && var15 >= var2) {
            return;
         }
      } else {
         if (var8) {
            this.field1169 = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var16 = this.field1169;
            this.field1169 = (byte)((this.field1169 + 1) % 4);
            if (this.field1205[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if (var10 >= 0) {
         this.field1170[var10] = var1;
         this.field1171[var10] = var2;
         this.field1150[var10] = var3;
         this.field1174[var10] = var4;
         this.field1205[var10] = var5 + var12 + var6;
      }

   }

   final void method1588(int var1, int var2) {
      class275 var3 = class158.method3188(var1, -944432178);

      for(class83 var4 = (class83)this.field1175.method3988(); var4 != null; var4 = (class83)this.field1175.method4003()) {
         if (var3 == var4.field1297) {
            var4.method4014();
            return;
         }
      }

   }

   final void method1585(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      class275 var8 = class158.method3188(var1, -2007106604);
      class83 var9 = null;
      class83 var10 = null;
      int var11 = var8.field3521;
      int var12 = 0;

      class83 var13;
      for(var13 = (class83)this.field1175.method3988(); var13 != null; var13 = (class83)this.field1175.method4003()) {
         ++var12;
         if (var13.field1297.field3529 == var8.field3529) {
            var13.method1818(var2 + var4, var5, var6, var3, -266560985);
            return;
         }

         if (var13.field1297.field3520 <= var8.field3520) {
            var9 = var13;
         }

         if (var13.field1297.field3521 > var11) {
            var10 = var13;
            var11 = var13.field1297.field3521;
         }
      }

      if (var10 != null || var12 < 4) {
         var13 = new class83(var8);
         if (var9 == null) {
            this.field1175.method4009(var13);
         } else {
            class215.method3986(var13, var9);
         }

         var13.method1818(var2 + var4, var5, var6, var3, -266560985);
         if (var12 >= 4) {
            var10.method4014();
         }
      }

   }

   static final void method1587(byte[] var0, int var1, int var2, class137 var3, class176[] var4, int var5) {
      class194 var6 = new class194(var0);
      int var7 = -1;

      while(true) {
         int var8 = var6.getUSmart(1802636445);
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var10 = var6.getUSmart(911785373);
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.getUByte(-519484657);
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var12 + var1;
            int var18 = var11 + var2;
            if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
               int var19 = var13;
               if ((class62.field720[1][var17][var18] & 2) == 2) {
                  var19 = var13 - 1;
               }

               class176 var20 = null;
               if (var19 >= 0) {
                  var20 = var4[var19];
               }

               class234.method4349(var13, var17, var18, var7, var16, var15, var3, var20, 882834286);
            }
         }
      }
   }

   static int method1601(int var0, class96 var1, boolean var2, int var3) {
      if (var0 == 6500) {
         class81.field1272[++class135.field1964 - 1] = class265.method4724(33602425) ? 1 : 0;
         return 1;
      } else {
         class77 var4;
         if (var0 == 6501) {
            class77.field1223 = 0;
            if (class77.field1223 < class77.field1222) {
               var4 = class141.field2058[++class77.field1223 - 1];
            } else {
               var4 = null;
            }

            if (var4 != null) {
               class81.field1272[++class135.field1964 - 1] = var4.field1230;
               class81.field1272[++class135.field1964 - 1] = var4.field1218;
               class81.field1281[++class77.field1233 - 1] = var4.field1225;
               class81.field1272[++class135.field1964 - 1] = var4.field1231;
               class81.field1272[++class135.field1964 - 1] = var4.field1228;
               class81.field1281[++class77.field1233 - 1] = var4.field1227;
            } else {
               class81.field1272[++class135.field1964 - 1] = -1;
               class81.field1272[++class135.field1964 - 1] = 0;
               class81.field1281[++class77.field1233 - 1] = "";
               class81.field1272[++class135.field1964 - 1] = 0;
               class81.field1272[++class135.field1964 - 1] = 0;
               class81.field1281[++class77.field1233 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            class77 var9;
            if (class77.field1223 < class77.field1222) {
               var9 = class141.field2058[++class77.field1223 - 1];
            } else {
               var9 = null;
            }

            if (var9 != null) {
               class81.field1272[++class135.field1964 - 1] = var9.field1230;
               class81.field1272[++class135.field1964 - 1] = var9.field1218;
               class81.field1281[++class77.field1233 - 1] = var9.field1225;
               class81.field1272[++class135.field1964 - 1] = var9.field1231;
               class81.field1272[++class135.field1964 - 1] = var9.field1228;
               class81.field1281[++class77.field1233 - 1] = var9.field1227;
            } else {
               class81.field1272[++class135.field1964 - 1] = -1;
               class81.field1272[++class135.field1964 - 1] = 0;
               class81.field1281[++class77.field1233 - 1] = "";
               class81.field1272[++class135.field1964 - 1] = 0;
               class81.field1272[++class135.field1964 - 1] = 0;
               class81.field1281[++class77.field1233 - 1] = "";
            }

            return 1;
         } else {
            int var5;
            int var6;
            if (var0 == 6506) {
               var5 = class81.field1272[--class135.field1964];
               var4 = null;

               for(var6 = 0; var6 < class77.field1222; ++var6) {
                  if (var5 == class141.field2058[var6].field1230) {
                     var4 = class141.field2058[var6];
                     break;
                  }
               }

               if (var4 != null) {
                  class81.field1272[++class135.field1964 - 1] = var4.field1230;
                  class81.field1272[++class135.field1964 - 1] = var4.field1218;
                  class81.field1281[++class77.field1233 - 1] = var4.field1225;
                  class81.field1272[++class135.field1964 - 1] = var4.field1231;
                  class81.field1272[++class135.field1964 - 1] = var4.field1228;
                  class81.field1281[++class77.field1233 - 1] = var4.field1227;
               } else {
                  class81.field1272[++class135.field1964 - 1] = -1;
                  class81.field1272[++class135.field1964 - 1] = 0;
                  class81.field1281[++class77.field1233 - 1] = "";
                  class81.field1272[++class135.field1964 - 1] = 0;
                  class81.field1272[++class135.field1964 - 1] = 0;
                  class81.field1281[++class77.field1233 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               class135.field1964 -= 4;
               var5 = class81.field1272[class135.field1964];
               boolean var10 = class81.field1272[class135.field1964 + 1] == 1;
               var6 = class81.field1272[class135.field1964 + 2];
               boolean var11 = class81.field1272[class135.field1964 + 3] == 1;
               class25.method201(var5, var10, var6, var11, -1708710488);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  client.field1094 = class81.field1272[--class135.field1964] == 1;
                  return 1;
               } else {
                  int var7;
                  class278 var8;
                  if (var0 == 6513) {
                     class135.field1964 -= 2;
                     var5 = class81.field1272[class135.field1964];
                     var7 = class81.field1272[class135.field1964 + 1];
                     var8 = client.method1577(var7, (byte)-100);
                     if (var8.method4907(1992436166)) {
                        class81.field1281[++class77.field1233 - 1] = class68.method1100(var5, (byte)-63).method5130(var7, var8.field3546, (byte)2);
                     } else {
                        class81.field1272[++class135.field1964 - 1] = class68.method1100(var5, (byte)-96).method5129(var7, var8.field3543, 709417805);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     class135.field1964 -= 2;
                     var5 = class81.field1272[class135.field1964];
                     var7 = class81.field1272[class135.field1964 + 1];
                     var8 = client.method1577(var7, (byte)-63);
                     if (var8.method4907(1933979280)) {
                        class81.field1281[++class77.field1233 - 1] = class260.method4546(var5, -1627504229).method5010(var7, var8.field3546, (byte)10);
                     } else {
                        class81.field1272[++class135.field1964 - 1] = class260.method4546(var5, 520838489).method5009(var7, var8.field3543, (byte)1);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     class135.field1964 -= 2;
                     var5 = class81.field1272[class135.field1964];
                     var7 = class81.field1272[class135.field1964 + 1];
                     var8 = client.method1577(var7, (byte)-68);
                     if (var8.method4907(1810547503)) {
                        class81.field1281[++class77.field1233 - 1] = class146.method3099(var5, (byte)38).method5068(var7, var8.field3546, 1778511748);
                     } else {
                        class81.field1272[++class135.field1964 - 1] = class146.method3099(var5, (byte)114).method5067(var7, var8.field3543, -417413109);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     class135.field1964 -= 2;
                     var5 = class81.field1272[class135.field1964];
                     var7 = class81.field1272[class135.field1964 + 1];
                     var8 = client.method1577(var7, (byte)-57);
                     if (var8.method4907(1736450588)) {
                        class81.field1281[++class77.field1233 - 1] = class92.method1926(var5, 154626736).method4928(var7, var8.field3546, (byte)-48);
                     } else {
                        class81.field1272[++class135.field1964 - 1] = class92.method1926(var5, 2117275555).method4927(var7, var8.field3543, (byte)-28);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     class81.field1272[++class135.field1964 - 1] = 0;
                     return 1;
                  } else {
                     return var0 == 6520 ? 1 : (var0 == 6521 ? 1 : 2);
                  }
               }
            } else {
               var5 = class81.field1272[--class135.field1964];
               if (var5 >= 0 && var5 < class77.field1222) {
                  var4 = class141.field2058[var5];
                  class81.field1272[++class135.field1964 - 1] = var4.field1230;
                  class81.field1272[++class135.field1964 - 1] = var4.field1218;
                  class81.field1281[++class77.field1233 - 1] = var4.field1225;
                  class81.field1272[++class135.field1964 - 1] = var4.field1231;
                  class81.field1272[++class135.field1964 - 1] = var4.field1228;
                  class81.field1281[++class77.field1233 - 1] = var4.field1227;
               } else {
                  class81.field1272[++class135.field1964 - 1] = -1;
                  class81.field1272[++class135.field1964 - 1] = 0;
                  class81.field1281[++class77.field1233 - 1] = "";
                  class81.field1272[++class135.field1964 - 1] = 0;
                  class81.field1272[++class135.field1964 - 1] = 0;
                  class81.field1281[++class77.field1233 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}

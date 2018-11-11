import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class267 extends class218 {
   public static class212 field3439 = new class212(64);
   public static class261 field3438;
   public int field3440 = 0;

   void method4731(class194 var1, int var2, int var3) {
      if (var2 == 2) {
         this.field3440 = var1.getUShort(-1208216487);
      }

   }

   public void method4736(class194 var1, int var2) {
      while(true) {
         int var3 = var1.getUByte(793343305);
         if (var3 == 0) {
            return;
         }

         this.method4731(var1, var3, 236529801);
      }
   }

   public static File method4737(String var0, String var1, int var2, byte var3) {
      String var4 = var2 == 0 ? "" : "" + var2;
      class167.field2205 = new File(class22.field327, "battlescape/oldschool/jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
      String var5 = null;
      String var6 = null;
      boolean var7 = false;
      int var8;
      File var9;
      if (class167.field2205.exists()) {
         try {
            class122 var10 = new class122(class167.field2205, "rw", 10000L);

            class194 var11;
            int var12;
            for(var11 = new class194((int)var10.method2537(-1769015356)); var11.field2565 < var11.field2566.length; var11.field2565 += var12) {
               var12 = var10.method2538(var11.field2566, var11.field2565, var11.field2566.length - var11.field2565, (byte)0);
               if (var12 == -1) {
                  throw new IOException();
               }
            }

            var11.field2565 = 0;
            var12 = var11.getUByte(857706775);
            if (var12 < 1 || var12 > 3) {
               throw new IOException("" + var12);
            }

            int var13 = 0;
            if (var12 > 1) {
               var13 = var11.getUByte(-427186746);
            }

            if (var12 <= 2) {
               var5 = var11.getString2(352970756);
               if (var13 == 1) {
                  var6 = var11.getString2(-181212533);
               }
            } else {
               var5 = var11.getSpecialString(1244460337);
               if (var13 == 1) {
                  var6 = var11.getSpecialString(1244460337);
               }
            }

            var10.method2535((byte)-3);
         } catch (IOException var20) {
            var20.printStackTrace();
         }

         if (var5 != null) {
            var9 = new File(var5);
            if (!var9.exists()) {
               var5 = null;
            }
         }

         if (var5 != null) {
            var9 = new File(var5, "battlescape/oldschool/test.dat");

            boolean var21;
            try {
               RandomAccessFile var23 = new RandomAccessFile(var9, "rw");
               var8 = var23.read();
               var23.seek(0L);
               var23.write(var8);
               var23.seek(0L);
               var23.close();
               var9.delete();
               var21 = true;
            } catch (Exception var18) {
               var21 = false;
            }

            if (!var21) {
               var5 = null;
            }
         }
      }

      File var29;
      if (var5 == null && var2 == 0) {
         label119:
         for(int var22 = 0; var22 < class167.field2214.length; ++var22) {
            for(int var24 = 0; var24 < class27.field380.length; ++var24) {
               File var27 = new File(class27.field380[var24] + class167.field2214[var22] + File.separatorChar + var0 + File.separatorChar);
               if (var27.exists()) {
                  var29 = new File(var27, "battlescape/oldschool/test.dat");

                  boolean var14;
                  try {
                     RandomAccessFile var15 = new RandomAccessFile(var29, "rw");
                     int var16 = var15.read();
                     var15.seek(0L);
                     var15.write(var16);
                     var15.seek(0L);
                     var15.close();
                     var29.delete();
                     var14 = true;
                  } catch (Exception var17) {
                     var14 = false;
                  }

                  if (var14) {
                     var5 = var27.toString();
                     var7 = true;
                     break label119;
                  }
               }
            }
         }
      }

      if (var5 == null) {
         var5 = class22.field327 + File.separatorChar + "battlescape" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var7 = true;
      }

      if (var6 != null) {
         File var25 = new File(var6);
         var9 = new File(var5);

         try {
            File[] var26 = var25.listFiles();
            File[] var28 = var26;

            for(var8 = 0; var8 < var28.length; ++var8) {
               var29 = var28[var8];
               File var30 = new File(var9, var29.getName());
               boolean var31 = var29.renameTo(var30);
               if (!var31) {
                  throw new IOException();
               }
            }
         } catch (Exception var19) {
            var19.printStackTrace();
         }

         var7 = true;
      }

      if (var7) {
         class282.method5052(new File(var5), (File)null, (byte)-6);
      }

      return new File(var5);
   }

   public static int method4738(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if ((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1)));
   }

   static final void method4730(class201 var0, int var1, class72 var2, int var3, int var4) {
      byte var5 = -1;
      int var6;
      if ((var3 & 256) != 0) {
         var2.field1187 = var0.getUShortLE128(258317187);
         var6 = var0.getIntLE(-2000564372);
         var2.field1191 = var6 >> 16;
         var2.field1189 = (var6 & '\uffff') + client.field866;
         var2.field1159 = 0;
         var2.field1156 = 0;
         if (var2.field1189 > client.field866) {
            var2.field1159 = -1;
         }

         if (var2.field1187 == 65535) {
            var2.field1187 = -1;
         }
      }

      if ((var3 & 2048) != 0) {
         class93.field1409[var1] = var0.getByte(1055184997);
      }

      if ((var3 & 4096) != 0) {
         var2.field1192 = var0.getByte(-380989723);
         var2.field1202 = var0.getReversedByte(518724032);
         var2.field1193 = var0.getByte(-721462552);
         var2.field1178 = var0.getByte128(2071617048);
         var2.field1196 = var0.getUShortLE(-1114400981) + client.field866;
         var2.field1197 = var0.getUShortLE128(-1007155448) + client.field866;
         var2.field1198 = var0.getUShortLE128(-1324160534);
         if (var2.field837) {
            var2.field1192 += var2.field847;
            var2.field1202 += var2.field846;
            var2.field1193 += var2.field847;
            var2.field1178 += var2.field846;
            var2.field1204 = 0;
         } else {
            var2.field1192 += var2.field1188[0];
            var2.field1202 += var2.field1206[0];
            var2.field1193 += var2.field1188[0];
            var2.field1178 += var2.field1206[0];
            var2.field1204 = 1;
         }

         var2.field1194 = 0;
      }

      if ((var3 & 1) != 0) {
         var2.field1190 = var0.getUShort(-1208216487);
         if (var2.field1190 == 65535) {
            var2.field1190 = -1;
         }
      }

      int var7;
      int var8;
      int var9;
      if ((var3 & 16) != 0) {
         var6 = var0.getUByte128(-1819959317);
         int var10;
         int var11;
         int var12;
         if (var6 > 0) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = -1;
               var9 = -1;
               var10 = -1;
               var11 = var0.getUSmart(1794393673);
               if (var11 == 32767) {
                  var11 = var0.getUSmart(1875375747);
                  var9 = var0.getUSmart(1971572101);
                  var8 = var0.getUSmart(1765558830);
                  var10 = var0.getUSmart(1857029818);
               } else if (var11 != 32766) {
                  var9 = var0.getUSmart(2070331872);
               } else {
                  var11 = -1;
               }

               var12 = var0.getUSmart(1191082455);
               var2.method1586(var11, var9, var8, var10, client.field866, var12, (byte)-13);
            }
         }

         var7 = var0.getUByte128(1153361841);
         if (var7 > 0) {
            for(var11 = 0; var11 < var7; ++var11) {
               var8 = var0.getUSmart(1387774237);
               var9 = var0.getUSmart(794332601);
               if (var9 != 32767) {
                  var10 = var0.getUSmart(1598656728);
                  var12 = var0.getUByte128(-653948426);
                  int var13 = var9 > 0 ? var0.getUReversedByte((byte)127) : var12;
                  var2.method1585(var8, client.field866, var9, var10, var12, var13, (byte)65);
               } else {
                  var2.method1588(var8, 1264970380);
               }
            }
         }
      }

      if ((var3 & 512) != 0) {
         for(var6 = 0; var6 < 3; ++var6) {
            var2.field825[var6] = var0.getString1(-778927800);
         }
      }

      if ((var3 & 1024) != 0) {
         var5 = var0.getReversedByte(518724032);
      }

      if ((var3 & 128) != 0) {
         var6 = var0.getUShort128(-538629344);
         if (var6 == 65535) {
            var6 = -1;
         }

         var7 = var0.getUByte(822890440);
         class309.method5496(var2, var6, var7, (byte)1);
      }

      if ((var3 & 2) != 0) {
         var2.field1152 = var0.getString1(-778927800);
         if (var2.field1152.charAt(0) == '~') {
            var2.field1152 = var2.field1152.substring(1);
            class189.method3483(2, var2.field823.method5436(2123672991), var2.field1152, (byte)-85);
         } else if (var2 == class12.field259) {
            class189.method3483(2, var2.field823.method5436(193135260), var2.field1152, (byte)-47);
         }

         var2.field1167 = false;
         var2.field1207 = 0;
         var2.field1168 = 0;
         var2.field1166 = 150;
      }

      if ((var3 & 4) != 0) {
         var2.field1165 = var0.getUShort128(-1088772744);
         if (var2.field1204 == 0) {
            var2.field1201 = var2.field1165;
            var2.field1165 = -1;
         }
      }

      if ((var3 & 64) != 0) {
         var6 = var0.getUShortLE128(412505969);
         class256 var17 = (class256)class44.method660(class3.method6((short)3771), var0.getUReversedByte((byte)93), -1392728826);
         boolean var21 = var0.getUByte(-645772071) == 1;
         var8 = var0.getUReversedByte((byte)83);
         var9 = var0.field2565;
         if (var2.field823 != null && var2.field820 != null) {
            boolean var20 = false;
            if (var17.field3327 && class164.field2182.method1695(var2.field823, (byte)-66)) {
               var20 = true;
            }

            if (!var20 && client.field969 == 0 && !var2.field836) {
               class93.field1423.field2565 = 0;
               var0.getReversedBytes128(class93.field1423.field2566, 0, var8, 230574637);
               class93.field1423.field2565 = 0;
               class194 var23 = class93.field1423;
               String var14 = class4.method13(var23, 32767, -489738290);
               String var15 = class312.method5520(class92.method1925(var14, (byte)78));
               var2.field1152 = var15.trim();
               var2.field1207 = var6 >> 8;
               var2.field1168 = var6 & 255;
               var2.field1166 = 150;
               var2.field1167 = var21;
               var2.field1179 = var2 != class12.field259 && var17.field3327 && "" != client.field869 && var15.toLowerCase().indexOf(client.field869) == -1;
               int var16;
               if (var17.field3335) {
                  var16 = var21 ? 91 : 1;
               } else {
                  var16 = var21 ? 90 : 2;
               }

               if (var17.field3334 != -1) {
                  class189.method3483(var16, class22.method186(var17.field3334, (byte)1) + var2.field823.method5436(2109269581), var15, (byte)5);
               } else {
                  class189.method3483(var16, var2.field823.method5436(1537813017), var15, (byte)44);
               }
            }
         }

         var0.field2565 = var8 + var9;
      }

      if ((var3 & 8) != 0) {
         var6 = var0.getUByte(1410287450);
         byte[] var18 = new byte[var6];
         class194 var22 = new class194(var18);
         var0.getReversedBytes128(var18, 0, var6, 230574637);
         class93.field1413[var1] = var22;
         var2.method1140(var22, -2010554176);
      }

      if (var2.field837) {
         if (var5 == 127) {
            var2.method1159(var2.field847, var2.field846, -242397897);
         } else {
            byte var19;
            if (var5 != -1) {
               var19 = var5;
            } else {
               var19 = class93.field1409[var1];
            }

            var2.method1149(var2.field847, var2.field846, var19, (byte)53);
         }
      }

   }
}

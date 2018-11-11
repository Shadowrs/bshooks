public class class14 {
   String field276;
   String field275;
   public long field278;
   public int field273;
   public class16 field274;

   class14(class194 var1, byte var2, int var3) {
      this.field275 = var1.getString1(-778927800);
      this.field276 = var1.getString1(-778927800);
      this.field273 = var1.getUShort(-1208216487);
      this.field278 = var1.getLong(128198034);
      int var4 = var1.getInt(-1817376731);
      int var5 = var1.getInt(-1817376731);
      this.field274 = new class16();
      this.field274.method114(2, (byte)8);
      this.field274.method115(var2, 83382116);
      this.field274.field290 = var4;
      this.field274.field286 = var5;
      this.field274.field287 = 0;
      this.field274.field283 = 0;
      this.field274.field284 = var3;
   }

   public String method92(int var1) {
      return this.field275;
   }

   public String method88(int var1) {
      return this.field276;
   }

   static final void method87(String var0, byte var1) {
      class47.method743("Please remove " + var0 + " from your friend list first", -992030463);
   }

   static void method95(int var0) {
      int var1;
      if (client.field1020 == 0) {
         class308.field3867 = new class137(4, 104, 104, class62.field728);

         for(var1 = 0; var1 < 4; ++var1) {
            client.field1047[var1] = new class176(104, 104);
         }

         class180.field2371 = new class331(512, 512);
         class90.field1354 = "Starting game engine...";
         class90.field1353 = 5;
         client.field1020 = 20;
      } else {
         int var2;
         int var3;
         int var4;
         int var5;
         if (client.field1020 == 20) {
            int[] var6 = new int[9];

            for(var2 = 0; var2 < 9; ++var2) {
               var3 = var2 * 32 + 15 + 128;
               var4 = var3 * 3 + 600;
               var5 = class134.field1955[var3];
               var6[var2] = var5 * var4 >> 16;
            }

            class137.method3017(var6, 500, 800, 512, 334);
            class90.field1354 = "Prepared visibility map";
            class90.field1353 = 10;
            client.field1020 = 30;
         } else if (client.field1020 == 30) {
            class169.field2218 = class51.method798(0, false, true, true, 1008043309);
            class19.field311 = class51.method798(1, false, true, true, 1008043309);
            class39.field502 = class51.method798(2, true, false, true, 1008043309);
            class55.field635 = class51.method798(3, false, true, true, 1008043309);
            class44.field552 = class51.method798(4, false, true, true, 1008043309);
            class1.field11 = class51.method798(5, true, true, true, 1008043309);
            class1.field12 = class51.method798(6, true, true, true, 1008043309);
            class44.field548 = class51.method798(7, false, true, true, 1008043309);
            class44.field549 = class51.method798(8, false, true, true, 1008043309);
            class74.field1147 = class51.method798(9, false, true, true, 1008043309);
            client.field1003 = class51.method798(10, false, true, true, 1008043309);
            class157.field2147 = class51.method798(11, false, true, true, 1008043309);
            class34.field445 = class51.method798(12, false, true, true, 1008043309);
            class18.field303 = class51.method798(13, true, false, true, 1008043309);
            class68.field790 = class51.method798(14, false, true, true, 1008043309);
            class139.field2043 = class51.method798(15, false, true, true, 1008043309);
            class151.field2128 = class51.method798(16, true, true, true, 1008043309);
            class90.field1354 = "Connecting to update server";
            class90.field1353 = 20;
            client.field1020 = 40;
         } else if (client.field1020 == 40) {
            byte var31 = 0;
            var1 = var31 + class169.field2218.method4662((byte)1) * 4 / 100;
            var1 += class19.field311.method4662((byte)1) * 4 / 100;
            var1 += class39.field502.method4662((byte)1) * 2 / 100;
            var1 += class55.field635.method4662((byte)1) * 2 / 100;
            var1 += class44.field552.method4662((byte)1) * 6 / 100;
            var1 += class1.field11.method4662((byte)1) * 4 / 100;
            var1 += class1.field12.method4662((byte)1) * 2 / 100;
            var1 += class44.field548.method4662((byte)1) * 58 / 100;
            var1 += class44.field549.method4662((byte)1) * 2 / 100;
            var1 += class74.field1147.method4662((byte)1) * 2 / 100;
            var1 += client.field1003.method4662((byte)1) * 2 / 100;
            var1 += class157.field2147.method4662((byte)1) * 2 / 100;
            var1 += class34.field445.method4662((byte)1) * 2 / 100;
            var1 += class18.field303.method4662((byte)1) * 2 / 100;
            var1 += class68.field790.method4662((byte)1) * 2 / 100;
            var1 += class139.field2043.method4662((byte)1) * 2 / 100;
            var1 += class151.field2128.method4662((byte)1) * 2 / 100;
            if (var1 != 100) {
               if (var1 != 0) {
                  class90.field1354 = "Checking for updates - " + var1 + "%";
               }

               class90.field1353 = 30;
            } else {
               class27.method232(class169.field2218, "Animations", 242480293);
               class27.method232(class19.field311, "Skeletons", 242480293);
               class27.method232(class44.field552, "Sound FX", 242480293);
               class27.method232(class1.field11, "Maps", 242480293);
               class27.method232(class1.field12, "Music Tracks", 242480293);
               class27.method232(class44.field548, "Models", 242480293);
               class27.method232(class44.field549, "Sprites", 242480293);
               class27.method232(class157.field2147, "Music Jingles", 242480293);
               class27.method232(class68.field790, "Music Samples", 242480293);
               class27.method232(class139.field2043, "Music Patches", 242480293);
               class27.method232(class151.field2128, "World Map", 242480293);
               class90.field1354 = "Loaded update list";
               class90.field1353 = 30;
               client.field1020 = 45;
            }
         } else {
            class263 var7;
            class263 var8;
            class263 var32;
            if (client.field1020 == 45) {
               boolean var9 = !client.field862;
               class317.field3927 = 22050;
               class17.field297 = var9;
               class238.field2777 = 2;
               class230 var10 = new class230();
               var10.method4152(9, 128, -87673009);
               class73.field852 = class97.method2022(class59.field683, 0, 22050, (byte)0);
               class73.field852.method2189(var10, 282833705);
               var32 = class139.field2043;
               var7 = class68.field790;
               var8 = class44.field552;
               class229.field2684 = var32;
               class229.field2678 = var7;
               class154.field2136 = var8;
               class229.field2679 = var10;
               class130.field1824 = class97.method2022(class59.field683, 1, 2048, (byte)0);
               class54.field632 = new class100();
               class130.field1824.method2189(class54.field632, 2088937790);
               class194.field2571 = new class114(22050, class317.field3927);
               class90.field1354 = "Prepared sound engine";
               class90.field1353 = 35;
               client.field1020 = 50;
               class7.field226 = new class310(class44.field549, class18.field303);
            } else if (client.field1020 == 50) {
               var1 = class309.method5498((byte)0).length;
               client.field907 = class7.field226.method5501(class309.method5498((byte)0), 80099990);
               if (client.field907.size() < var1) {
                  class90.field1354 = "Loading fonts - " + client.field907.size() * 100 / var1 + "%";
                  class90.field1353 = 40;
               } else {
                  class2.field15 = (class311)client.field907.get(class309.field3871);
                  class186.field2506 = (class311)client.field907.get(class309.field3874);
                  class228.field2676 = (class311)client.field907.get(class309.field3877);
                  class335.field4066 = new class337(true);
                  class90.field1354 = "Loaded fonts";
                  class90.field1353 = 40;
                  client.field1020 = 60;
               }
            } else if (client.field1020 == 60) {
               var1 = class34.method388(client.field1003, class44.field549, (byte)-13);
               byte var33 = 11;
               if (var1 < var33) {
                  class90.field1354 = "Loading title screen - " + var1 * 100 / var33 + "%";
                  class90.field1353 = 50;
               } else {
                  class90.field1354 = "Loaded title screen";
                  class90.field1353 = 50;
                  class48.method748(5, 1305995178);
                  client.field1020 = 70;
               }
            } else if (client.field1020 == 70) {
               if (!class39.field502.method4640(-861486927)) {
                  class90.field1354 = "Loading config - " + class39.field502.method4671(-5165968) + "%";
                  class90.field1353 = 60;
               } else {
                  class241.method4443(class39.field502, (byte)-7);
                  class263 var34 = class39.field502;
                  class55.field639 = var34;
                  class263 var36 = class39.field502;
                  var32 = class44.field548;
                  class274.field3506 = var36;
                  class274.field3505 = var32;
                  class274.field3512 = class274.field3506.method4563(3, 899370538);
                  var7 = class39.field502;
                  var8 = class44.field548;
                  boolean var11 = client.field862;
                  class252.field3298 = var7;
                  class282.field3587 = var8;
                  class282.field3616 = var11;
                  class263 var12 = class39.field502;
                  class263 var13 = class44.field548;
                  class285.field3727 = var12;
                  class285.field3714 = var13;
                  class167.method3254(class39.field502, -766944462);
                  class263 var14 = class39.field502;
                  class263 var15 = class44.field548;
                  boolean var16 = client.field855;
                  class311 var17 = class2.field15;
                  class156.field2142 = var14;
                  class283.field3688 = var15;
                  class154.field2134 = var16;
                  class20.field319 = class156.field2142.method4563(10, -1013311984);
                  class236.field2767 = var17;
                  class263 var18 = class39.field502;
                  class263 var19 = class169.field2218;
                  class263 var20 = class19.field311;
                  class17.field299 = var18;
                  class287.field3747 = var19;
                  class287.field3753 = var20;
                  class67.method1098(class39.field502, class44.field548, (short)18623);
                  class109.method2259(class39.field502, (byte)-4);
                  class263 var21 = class39.field502;
                  class268.field3447 = var21;
                  class268.field3445 = class268.field3447.method4563(16, 1454578689);
                  class9.method60(class55.field635, class44.field548, class44.field549, class18.field303, 408545515);
                  class197.method3753(class39.field502, 1008043309);
                  class17.method128(class39.field502, -105858561);
                  class263 var22 = class39.field502;
                  class270.field3473 = var22;
                  class154.method3158(class39.field502, -1955080323);
                  class263 var23 = class39.field502;
                  class278.field3542 = var23;
                  class158.field2151 = new class94();
                  class263 var24 = class39.field502;
                  class263 var25 = class44.field549;
                  class263 var26 = class18.field303;
                  class281.field3576 = var24;
                  class281.field3564 = var25;
                  class281.field3565 = var26;
                  class260.method4545(class39.field502, class44.field549, (byte)-83);
                  class263 var27 = class39.field502;
                  class263 var28 = class44.field549;
                  class269.field3456 = var28;
                  if (var27.method4640(393598591)) {
                     class269.field3450 = var27.method4563(35, 1185423693);
                     class269.field3471 = new class269[class269.field3450];

                     for(int var29 = 0; var29 < class269.field3450; ++var29) {
                        byte[] var30 = var27.method4551(35, var29, 997677194);
                        if (var30 != null) {
                           class269.field3471[var29] = new class269(var29);
                           class269.field3471[var29].method4751(new class194(var30), -842802464);
                           class269.field3471[var29].method4756((byte)0);
                        }
                     }
                  }

                  class90.field1354 = "Loaded config";
                  class90.field1353 = 60;
                  client.field1020 = 80;
               }
            } else if (client.field1020 == 80) {
               var1 = 0;
               class331 var35;
               if (class69.field796 == null) {
                  var32 = class44.field549;
                  var4 = var32.method4606("compass", -887640881);
                  var5 = var32.method4568(var4, "", (short)314);
                  var35 = class328.method5831(var32, var4, var5, 1724582313);
                  class69.field796 = var35;
               } else {
                  ++var1;
               }

               if (class34.field447 == null) {
                  var32 = class44.field549;
                  var4 = var32.method4606("mapedge", 2118608906);
                  var5 = var32.method4568(var4, "", (short)-28667);
                  var35 = class328.method5831(var32, var4, var5, 1862814976);
                  class34.field447 = var35;
               } else {
                  ++var1;
               }

               if (class61.field718 == null) {
                  class61.field718 = class199.method3774(class44.field549, "mapscene", "", (byte)0);
               } else {
                  ++var1;
               }

               if (class20.field317 == null) {
                  class20.field317 = class316.method5639(class44.field549, "headicons_pk", "", -52263419);
               } else {
                  ++var1;
               }

               if (class86.field1310 == null) {
                  class86.field1310 = class316.method5639(class44.field549, "headicons_prayer", "", -1540510467);
               } else {
                  ++var1;
               }

               if (class47.field569 == null) {
                  class47.field569 = class316.method5639(class44.field549, "headicons_hint", "", -3332717);
               } else {
                  ++var1;
               }

               if (class64.field748 == null) {
                  class64.field748 = class316.method5639(class44.field549, "mapmarker", "", -174334980);
               } else {
                  ++var1;
               }

               if (class12.field257 == null) {
                  class12.field257 = class316.method5639(class44.field549, "cross", "", 1284105063);
               } else {
                  ++var1;
               }

               if (class135.field1966 == null) {
                  class135.field1966 = class316.method5639(class44.field549, "mapdots", "", 1340258223);
               } else {
                  ++var1;
               }

               if (class74.field1144 == null) {
                  class74.field1144 = class199.method3774(class44.field549, "scrollbar", "", (byte)0);
               } else {
                  ++var1;
               }

               if (class44.field545 == null) {
                  class44.field545 = class199.method3774(class44.field549, "mod_icons", "", (byte)0);
               } else {
                  ++var1;
               }

               if (var1 < 11) {
                  class90.field1354 = "Loading sprites - " + var1 * 100 / 12 + "%";
                  class90.field1353 = 70;
               } else {
                  class312.field3894 = class44.field545;
                  class34.field447.method5862();
                  var2 = (int)(Math.random() * 21.0D) - 10;
                  var3 = (int)(Math.random() * 21.0D) - 10;
                  var4 = (int)(Math.random() * 21.0D) - 10;
                  var5 = (int)(Math.random() * 41.0D) - 20;
                  class61.field718[0].method5857(var2 + var5, var5 + var3, var4 + var5);
                  class90.field1354 = "Loaded sprites";
                  class90.field1353 = 70;
                  client.field1020 = 90;
               }
            } else if (client.field1020 == 90) {
               if (!class74.field1147.method4640(-207024720)) {
                  class90.field1354 = "Loading textures - 0%";
                  class90.field1353 = 90;
               } else {
                  class66.field760 = new class123(class74.field1147, class44.field549, 20, 0.8D, client.field862 ? 64 : 128);
                  class134.method2796(class66.field760);
                  class134.method2797(0.8D);
                  client.field1020 = 100;
               }
            } else if (client.field1020 == 100) {
               var1 = class66.field760.method2555(664914821);
               if (var1 < 100) {
                  class90.field1354 = "Loading textures - " + var1 + "%";
                  class90.field1353 = 90;
               } else {
                  class90.field1354 = "Loaded textures";
                  class90.field1353 = 90;
                  client.field1020 = 110;
               }
            } else if (client.field1020 == 110) {
               class38.field490 = new class69();
               class59.field683.method3230(class38.field490, 10, (byte)-48);
               class90.field1354 = "Loaded input handler";
               class90.field1353 = 92;
               client.field1020 = 120;
            } else if (client.field1020 == 120) {
               if (!client.field1003.method4637("huffman", "", 435367516)) {
                  class90.field1354 = "Loading wordpack - 0%";
                  class90.field1353 = 94;
               } else {
                  class186 var37 = new class186(client.field1003.method4572("huffman", "", -1432281857));
                  class313.field3907 = var37;
                  class90.field1354 = "Loaded wordpack";
                  class90.field1353 = 94;
                  client.field1020 = 130;
               }
            } else if (client.field1020 == 130) {
               if (!class55.field635.method4640(846426838)) {
                  class90.field1354 = "Loading interfaces - " + class55.field635.method4671(-5165968) * 4 / 5 + "%";
                  class90.field1353 = 96;
               } else if (!class34.field445.method4640(986227095)) {
                  class90.field1354 = "Loading interfaces - " + (80 + class34.field445.method4671(-5165968) / 6) + "%";
                  class90.field1353 = 96;
               } else if (!class18.field303.method4640(1694733159)) {
                  class90.field1354 = "Loading interfaces - " + (96 + class18.field303.method4671(-5165968) / 50) + "%";
                  class90.field1353 = 96;
               } else {
                  class90.field1354 = "Loaded interfaces";
                  class90.field1353 = 98;
                  client.field1020 = 140;
               }
            } else if (client.field1020 == 140) {
               class90.field1353 = 100;
               if (!class151.field2128.method4574(class41.field515.field513, 1647928915)) {
                  class90.field1354 = "Loading world map - " + class151.field2128.method4576(class41.field515.field513, 1888496618) / 10 + "%";
               } else {
                  if (class63.field742 == null) {
                     class63.field742 = new class334();
                     class63.field742.method6049(class151.field2128, class228.field2676, client.field907, class61.field718, 16711935);
                  }

                  var1 = class63.field742.method6010((byte)1);
                  if (var1 < 100) {
                     class90.field1354 = "Loading world map - " + (var1 * 9 / 10 + 10) + "%";
                  } else {
                     class90.field1354 = "Loaded world map";
                     client.field1020 = 150;
                  }
               }
            } else if (client.field1020 == 150) {
               class48.method748(10, -1170656197);
            }
         }
      }

   }

   static void method97(int var0, int var1, int var2, int var3, byte var4) {
      class65 var5 = (class65)class65.field753.method3981((long)var0);
      if (var5 == null) {
         var5 = new class65();
         class65.field753.method3972(var5, (long)var0);
      }

      if (var5.field757.length <= var1) {
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[var1 + 1];

         int var8;
         for(var8 = 0; var8 < var5.field757.length; ++var8) {
            var6[var8] = var5.field757[var8];
            var7[var8] = var5.field752[var8];
         }

         for(var8 = var5.field757.length; var8 < var1; ++var8) {
            var6[var8] = -1;
            var7[var8] = 0;
         }

         var5.field757 = var6;
         var5.field752 = var7;
      }

      var5.field757[var1] = var2;
      var5.field752[var1] = var3;
   }
}

import java.io.IOException;

public class class48 {
   static class147 field577;
   public int field573;
   public class238 field576;
   public class238 field574;

   public class48(int var1, class238 var2, class238 var3) {
      this.field573 = var1;
      this.field576 = var2;
      this.field574 = var3;
   }

   public static boolean method749(int var0) {
      long var1 = class6.method28(1358803598);
      int var3 = (int)(var1 - class264.field3413);
      class264.field3413 = var1;
      if (var3 > 200) {
         var3 = 200;
      }

      class264.field3410 += var3;
      if (class264.field3414 == 0 && class264.field3403 == 0 && class264.field3409 == 0 && class264.field3404 == 0) {
         return true;
      } else if (class264.field3412 == null) {
         return false;
      } else {
         try {
            if (class264.field3410 > 30000) {
               throw new IOException();
            } else {
               class260 var4;
               class194 var5;
               while(class264.field3403 < 200 && class264.field3404 > 0) {
                  var4 = (class260)class264.field3406.method3962();
                  var5 = new class194(4);
                  var5.addByte(1, (byte)-26);
                  var5.add24Int((int)var4.field2644, (byte)36);
                  class264.field3412.vmethod3320(var5.field2566, 0, 4, -1130563356);
                  class264.field3408.method3972(var4, var4.field2644);
                  --class264.field3404;
                  ++class264.field3403;
               }

               while(class264.field3414 < 200 && class264.field3409 > 0) {
                  var4 = (class260)class264.field3411.method3881();
                  var5 = new class194(4);
                  var5.addByte(0, (byte)-65);
                  var5.add24Int((int)var4.field2644, (byte)-46);
                  class264.field3412.vmethod3320(var5.field2566, 0, 4, -1130563356);
                  var4.method4051();
                  class264.field3407.method3972(var4, var4.field2644);
                  --class264.field3409;
                  ++class264.field3414;
               }

               for(int var6 = 0; var6 < 100; ++var6) {
                  int var7 = class264.field3412.vmethod3316(804931826);
                  if (var7 < 0) {
                     throw new IOException();
                  }

                  if (var7 == 0) {
                     break;
                  }

                  class264.field3410 = 0;
                  byte var8 = 0;
                  if (class82.field1294 == null) {
                     var8 = 8;
                  } else if (class264.field3416 == 0) {
                     var8 = 1;
                  }

                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  if (var8 > 0) {
                     var9 = var8 - class264.field3415.field2565;
                     if (var9 > var7) {
                        var9 = var7;
                     }

                     class264.field3412.vmethod3318(class264.field3415.field2566, class264.field3415.field2565, var9, 1376978392);
                     if (class264.field3420 != 0) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           class264.field3415.field2566[var10 + class264.field3415.field2565] ^= class264.field3420;
                        }
                     }

                     class264.field3415.field2565 += var9;
                     if (class264.field3415.field2565 < var8) {
                        break;
                     }

                     if (class82.field1294 == null) {
                        class264.field3415.field2565 = 0;
                        var10 = class264.field3415.getUByte(373607650);
                        var11 = class264.field3415.getUShort(-1208216487);
                        int var13 = class264.field3415.getUByte(1546079123);
                        var12 = class264.field3415.getInt(-1817376731);
                        long var14 = (long)(var11 + (var10 << 16));
                        class260 var16 = (class260)class264.field3408.method3981(var14);
                        class262.field3388 = true;
                        if (var16 == null) {
                           var16 = (class260)class264.field3407.method3981(var14);
                           class262.field3388 = false;
                        }

                        if (var16 == null) {
                           throw new IOException();
                        }

                        int var17 = var13 == 0 ? 5 : 9;
                        class82.field1294 = var16;
                        class202.field2604 = new class194(var12 + var17 + class82.field1294.field3363);
                        class202.field2604.addByte(var13, (byte)-29);
                        class202.field2604.addInt(var12, (byte)33);
                        class264.field3416 = 8;
                        class264.field3415.field2565 = 0;
                     } else if (class264.field3416 == 0) {
                        if (class264.field3415.field2566[0] == -1) {
                           class264.field3416 = 1;
                           class264.field3415.field2565 = 0;
                        } else {
                           class82.field1294 = null;
                        }
                     }
                  } else {
                     var9 = class202.field2604.field2566.length - class82.field1294.field3363;
                     var10 = 512 - class264.field3416;
                     if (var10 > var9 - class202.field2604.field2565) {
                        var10 = var9 - class202.field2604.field2565;
                     }

                     if (var10 > var7) {
                        var10 = var7;
                     }

                     class264.field3412.vmethod3318(class202.field2604.field2566, class202.field2604.field2565, var10, -127637139);
                     if (class264.field3420 != 0) {
                        for(var11 = 0; var11 < var10; ++var11) {
                           class202.field2604.field2566[class202.field2604.field2565 + var11] ^= class264.field3420;
                        }
                     }

                     class202.field2604.field2565 += var10;
                     class264.field3416 += var10;
                     if (var9 == class202.field2604.field2565) {
                        if (16711935L == class82.field1294.field2644) {
                           class264.field3418 = class202.field2604;

                           for(var11 = 0; var11 < 256; ++var11) {
                              class263 var21 = class264.field3419[var11];
                              if (var21 != null) {
                                 class264.field3418.field2565 = var11 * 8 + 5;
                                 var12 = class264.field3418.getInt(-1817376731);
                                 int var22 = class264.field3418.getInt(-1817376731);
                                 var21.method4688(var12, var22, 1641020422);
                              }
                           }
                        } else {
                           class264.field3417.reset();
                           class264.field3417.update(class202.field2604.field2566, 0, var9);
                           var11 = (int)class264.field3417.getValue();
                           if (var11 != class82.field1294.field3361) {
                              try {
                                 class264.field3412.vmethod3325(-1194121267);
                              } catch (Exception var19) {
                                 ;
                              }

                              ++class264.field3423;
                              class264.field3412 = null;
                              class264.field3420 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                              return false;
                           }

                           class264.field3423 = 0;
                           class264.field3422 = 0;
                           class82.field1294.field3362.method4665((int)(class82.field1294.field2644 & 65535L), class202.field2604.field2566, 16711680L == (class82.field1294.field2644 & 16711680L), class262.field3388, 213768222);
                        }

                        class82.field1294.method4014();
                        if (class262.field3388) {
                           --class264.field3403;
                        } else {
                           --class264.field3414;
                        }

                        class264.field3416 = 0;
                        class82.field1294 = null;
                        class202.field2604 = null;
                     } else {
                        if (class264.field3416 != 512) {
                           break;
                        }

                        class264.field3416 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var20) {
            try {
               class264.field3412.vmethod3325(-1623907237);
            } catch (Exception var18) {
               ;
            }

            ++class264.field3422;
            class264.field3412 = null;
            return false;
         }
      }
   }

   static String method747(String var0, int var1) {
      class256[] var2 = class3.method6((short)22015);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class256 var4 = var2[var3];
         if (var4.field3334 != -1 && var0.startsWith(class22.method186(var4.field3334, (byte)1))) {
            var0 = var0.substring(6 + Integer.toString(var4.field3334).length());
            break;
         }
      }

      return var0;
   }

   static void method748(int var0, int var1) {
      if (var0 != client.field872) {
         if (client.field872 == 0) {
            class9.field239.method907(-324614284);
         }

         if (var0 == 20 || var0 == 40 || var0 == 45) {
            client.field890 = 0;
            client.field891 = 0;
            client.field1110 = 0;
            client.field1050.method5212(var0, 564059302);
            if (var0 != 20) {
               class61.method1058(false, (byte)14);
            }
         }

         if (var0 != 20 && var0 != 40 && class87.field1324 != null) {
            class87.field1324.vmethod3325(-2062996793);
            class87.field1324 = null;
         }

         if (client.field872 == 25) {
            client.field978 = 0;
            client.field908 = 0;
            client.field859 = 1;
            client.field910 = 0;
            client.field911 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               class178.method3415(client.field1003, class44.field549, true, client.field872 == 11 ? 4 : 0, 410274951);
            } else if (var0 == 11) {
               class178.method3415(client.field1003, class44.field549, false, 4, 771899513);
            } else {
               class307.method5483((byte)-119);
            }
         } else {
            class178.method3415(client.field1003, class44.field549, true, 0, 1394721650);
         }

         client.field872 = var0;
      }

   }

   static final void method746(byte var0) {
      for(class91 var1 = (class91)client.field985.method4027(); var1 != null; var1 = (class91)client.field985.method4026()) {
         if (var1.field1399 == class237.field2769 && client.field866 <= var1.field1384) {
            if (client.field866 >= var1.field1383) {
               if (var1.field1387 > 0) {
                  class84 var2 = client.field897[var1.field1387 - 1];
                  if (var2 != null && var2.field1185 >= 0 && var2.field1185 < 13312 && var2.field1209 >= 0 && var2.field1209 < 13312) {
                     var1.method1913(var2.field1185, var2.field1209, class5.method16(var2.field1185, var2.field1209, var1.field1399, -1453085921) - var1.field1382, client.field866, (byte)86);
                  }
               }

               if (var1.field1387 < 0) {
                  int var4 = -var1.field1387 - 1;
                  class72 var3;
                  if (var4 == client.field1000) {
                     var3 = class12.field259;
                  } else {
                     var3 = client.field971[var4];
                  }

                  if (var3 != null && var3.field1185 >= 0 && var3.field1185 < 13312 && var3.field1209 >= 0 && var3.field1209 < 13312) {
                     var1.method1913(var3.field1185, var3.field1209, class5.method16(var3.field1185, var3.field1209, var1.field1399, -1453085921) - var1.field1382, client.field866, (byte)46);
                  }
               }

               var1.method1914(client.field893, 1151361699);
               class308.field3867.method3006(class237.field2769, (int)var1.field1389, (int)var1.field1392, (int)var1.field1398, 60, var1, var1.field1377, -1, false);
            }
         } else {
            var1.method4014();
         }
      }

   }
}

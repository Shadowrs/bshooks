import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class class234 extends class117 {
   static String[] field2758;
   class100 field2760 = new class100();
   class230 field2759;
   class217 field2757 = new class217();

   class234(class230 var1) {
      this.field2759 = var1;
   }

   protected void vmethod4339(int[] var1, int var2, int var3) {
      this.field2760.vmethod4339(var1, var2, var3);

      for(class231 var4 = (class231)this.field2757.method4027(); var4 != null; var4 = (class231)this.field2757.method4026()) {
         if (!this.field2759.method4177(var4, 544122271)) {
            int var5 = var2;
            int var6 = var3;

            do {
               if (var6 <= var4.field2714) {
                  this.method4341(var4, var1, var5, var6, var6 + var5, (byte)2);
                  var4.field2714 -= var6;
                  break;
               }

               this.method4341(var4, var1, var5, var4.field2714, var6 + var5, (byte)2);
               var5 += var4.field2714;
               var6 -= var4.field2714;
            } while(!this.field2759.method4199(var4, var1, var5, var6, -1984198763));
         }
      }

   }

   protected void vmethod4340(int var1) {
      this.field2760.vmethod4340(var1);

      for(class231 var2 = (class231)this.field2757.method4027(); var2 != null; var2 = (class231)this.field2757.method4026()) {
         if (!this.field2759.method4177(var2, 1772765434)) {
            int var3 = var1;

            do {
               if (var3 <= var2.field2714) {
                  this.method4342(var2, var3, -1987170951);
                  var2.field2714 -= var3;
                  break;
               }

               this.method4342(var2, var2.field2714, -1825285835);
               var3 -= var2.field2714;
            } while(!this.field2759.method4199(var2, (int[])null, 0, var3, -1984198763));
         }
      }

   }

   protected class117 vmethod4337() {
      class231 var1;
      do {
         var1 = (class231)this.field2757.method4026();
         if (var1 == null) {
            return null;
         }
      } while(var1.field2732 == null);

      return var1.field2732;
   }

   void method4342(class231 var1, int var2, int var3) {
      if ((this.field2759.field2698[var1.field2725] & 4) != 0 && var1.field2728 < 0) {
         int var4 = this.field2759.field2703[var1.field2725] / class317.field3927;
         int var5 = (var4 + 1048575 - var1.field2734) / var4;
         var1.field2734 = var4 * var2 + var1.field2734 & 1048575;
         if (var5 <= var2) {
            if (this.field2759.field2701[var1.field2725] == 0) {
               var1.field2732 = class115.method2446(var1.field2716, var1.field2732.method2296(), var1.field2732.method2307(), var1.field2732.method2436());
            } else {
               var1.field2732 = class115.method2446(var1.field2716, var1.field2732.method2296(), 0, var1.field2732.method2436());
               this.field2759.method4219(var1, var1.field2715.field2752[var1.field2719] < 0, -1765722956);
            }

            if (var1.field2715.field2752[var1.field2719] < 0) {
               var1.field2732.method2303(-1);
            }

            var2 = var1.field2734 / var4;
         }
      }

      var1.field2732.vmethod4340(var2);
   }

   void method4341(class231 var1, int[] var2, int var3, int var4, int var5, byte var6) {
      if ((this.field2759.field2698[var1.field2725] & 4) != 0 && var1.field2728 < 0) {
         int var7 = this.field2759.field2703[var1.field2725] / class317.field3927;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field2734) / var7;
            if (var8 > var4) {
               var1.field2734 += var7 * var4;
               break;
            }

            var1.field2732.vmethod4339(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field2734 += var8 * var7 - 1048576;
            int var9 = class317.field3927 / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            class115 var11 = var1.field2732;
            if (this.field2759.field2701[var1.field2725] == 0) {
               var1.field2732 = class115.method2446(var1.field2716, var11.method2296(), var11.method2307(), var11.method2436());
            } else {
               var1.field2732 = class115.method2446(var1.field2716, var11.method2296(), 0, var11.method2436());
               this.field2759.method4219(var1, var1.field2715.field2752[var1.field2719] < 0, -1765722956);
               var1.field2732.method2312(var9, var11.method2307());
            }

            if (var1.field2715.field2752[var1.field2719] < 0) {
               var1.field2732.method2303(-1);
            }

            var11.method2314(var9);
            var11.vmethod4339(var2, var3, var5 - var3);
            if (var11.method2318()) {
               this.field2760.method2085(var11);
            }
         }
      }

      var1.field2732.vmethod4339(var2, var3, var4);
   }

   protected class117 vmethod4336() {
      class231 var1 = (class231)this.field2757.method4027();
      return (class117)(var1 == null ? null : (var1.field2732 != null ? var1.field2732 : this.vmethod4337()));
   }

   protected int vmethod4338() {
      return 0;
   }

   static final int method4359(long var0, String var2, byte var3) {
      Random var4 = new Random();
      class194 var5 = new class194(128);
      class194 var6 = new class194(128);
      int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
      var5.addByte(10, (byte)-42);

      int var8;
      for(var8 = 0; var8 < 4; ++var8) {
         var5.addInt(var4.nextInt(), (byte)74);
      }

      var5.addInt(var7[0], (byte)89);
      var5.addInt(var7[1], (byte)94);
      var5.addLong(var0);
      var5.addLong(0L);

      for(var8 = 0; var8 < 4; ++var8) {
         var5.addInt(var4.nextInt(), (byte)8);
      }

      var5.method3541(class85.field1302, class85.field1305, (byte)61);
      var6.addByte(10, (byte)-42);

      for(var8 = 0; var8 < 3; ++var8) {
         var6.addInt(var4.nextInt(), (byte)90);
      }

      var6.addLong(var4.nextLong());
      var6.add48Int(var4.nextLong());
      class194.method3727(var6, 1581935309);
      var6.addLong(var4.nextLong());
      var6.method3541(class85.field1302, class85.field1305, (byte)-60);
      var8 = class91.method1916(var2, 1886114176);
      if (var8 % 8 != 0) {
         var8 += 8 - var8 % 8;
      }

      class194 var9 = new class194(var8);
      var9.addString1(var2, -271316963);
      var9.field2565 = var8;
      var9.method3537(var7, (byte)1);
      class194 var10 = new class194(var9.field2565 + var6.field2565 + var5.field2565 + 5);
      var10.addByte(2, (byte)-65);
      var10.addByte(var5.field2565, (byte)-108);
      var10.addBytes(var5.field2566, 0, var5.field2565, (byte)-35);
      var10.addByte(var6.field2565, (byte)-9);
      var10.addBytes(var6.field2566, 0, var6.field2565, (byte)-63);
      var10.addShort(var9.field2565, 874948031);
      var10.addBytes(var9.field2566, 0, var9.field2565, (byte)-76);
      byte[] var11 = var10.field2566;
      int var12 = var11.length;
      StringBuilder var13 = new StringBuilder();

      int var14;
      for(int var15 = 0; var15 < var12 + 0; var15 += 3) {
         int var16 = var11[var15] & 255;
         var13.append(class317.field3924[var16 >>> 2]);
         if (var15 < var12 - 1) {
            var14 = var11[var15 + 1] & 255;
            var13.append(class317.field3924[(var16 & 3) << 4 | var14 >>> 4]);
            if (var15 < var12 - 2) {
               int var17 = var11[var15 + 2] & 255;
               var13.append(class317.field3924[(var14 & 15) << 2 | var17 >>> 6]).append(class317.field3924[var17 & 63]);
            } else {
               var13.append(class317.field3924[(var14 & 15) << 2]).append("=");
            }
         } else {
            var13.append(class317.field3924[(var16 & 3) << 4]).append("==");
         }
      }

      String var24 = var13.toString();
      var24 = var24;

      try {
         URL var25 = new URL(class181.method3421("services", false, 1483782899) + "m=accountappeal/login.ws");
         URLConnection var26 = var25.openConnection();
         var26.setDoInput(true);
         var26.setDoOutput(true);
         var26.setConnectTimeout(5000);
         OutputStreamWriter var18 = new OutputStreamWriter(var26.getOutputStream());
         var18.write("data2=" + class295.method5258(var24, 1461119994) + "&dest=" + class295.method5258("passwordchoice.ws", 1461119994));
         var18.flush();
         InputStream var19 = var26.getInputStream();
         var10 = new class194(new byte[1000]);

         do {
            var14 = var19.read(var10.field2566, var10.field2565, 1000 - var10.field2565);
            if (var14 == -1) {
               var18.close();
               var19.close();
               String var20 = new String(var10.field2566);
               if (var20.startsWith("OFFLINE")) {
                  return 4;
               } else if (var20.startsWith("WRONG")) {
                  return 7;
               } else if (var20.startsWith("RELOAD")) {
                  return 3;
               } else if (var20.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var10.method3733(var7, (byte)-77);

                  while(var10.field2565 > 0 && var10.field2566[var10.field2565 - 1] == 0) {
                     --var10.field2565;
                  }

                  var20 = new String(var10.field2566, 0, var10.field2565);
                  if (!class6.method22(var20, -216341097)) {
                     return 5;
                  } else {
                     if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                           Desktop.getDesktop().browse(new URI(var20));
                           return 2;
                        } catch (Exception var22) {
                           ;
                        }
                     }

                     if (class57.field646.startsWith("win")) {
                        class124.method2580(var20, 0, -146099130);
                     } else if (class57.field646.startsWith("mac")) {
                        class39.method553(var20, 1, "openjs", (byte)8);
                     } else {
                        class124.method2580(var20, 2, -320019891);
                     }

                     return 2;
                  }
               }
            }

            var10.field2565 += var14;
         } while(var10.field2565 < 1000);

         return 5;
      } catch (Throwable var23) {
         var23.printStackTrace();
         return 5;
      }
   }

   static final void method4349(int var0, int var1, int var2, int var3, int var4, int var5, class137 var6, class176 var7, int var8) {
      if (!client.field862 || (class62.field720[0][var1][var2] & 2) != 0 || (class62.field720[var0][var1][var2] & 16) == 0) {
         if (var0 < class62.field722) {
            class62.field722 = var0;
         }

         class282 var9 = class260.method4546(var3, -2022327347);
         int var10;
         int var11;
         if (var4 != 1 && var4 != 3) {
            var10 = var9.field3601;
            var11 = var9.field3602;
         } else {
            var10 = var9.field3602;
            var11 = var9.field3601;
         }

         int var12;
         int var13;
         if (var10 + var1 <= 104) {
            var12 = (var10 >> 1) + var1;
            var13 = (var10 + 1 >> 1) + var1;
         } else {
            var12 = var1;
            var13 = var1 + 1;
         }

         int var14;
         int var15;
         if (var11 + var2 <= 104) {
            var14 = (var11 >> 1) + var2;
            var15 = var2 + (var11 + 1 >> 1);
         } else {
            var14 = var2;
            var15 = var2 + 1;
         }

         int[][] var16 = class62.field728[var0];
         int var17 = var16[var13][var15] + var16[var12][var14] + var16[var13][var14] + var16[var12][var15] >> 2;
         int var18 = (var1 << 7) + (var10 << 6);
         int var19 = (var2 << 7) + (var11 << 6);
         int var20 = (var3 << 14) + (var2 << 7) + var1 + 1073741824;
         if (var9.field3612 == 0) {
            var20 -= Integer.MIN_VALUE;
         }

         int var21 = var5 + (var4 << 6);
         if (var9.field3618 == 1) {
            var21 += 256;
         }

         if (var9.method5011((byte)-37)) {
            class29.method269(var0, var1, var2, var9, var4, (byte)22);
         }

         Object var22;
         if (var5 == 22) {
            if (!client.field862 || var9.field3612 != 0 || var9.field3586 == 1 || var9.field3619) {
               if (var9.field3592 == -1 && var9.field3627 == null) {
                  var22 = var9.method5031(22, var4, var16, var18, var17, var19, 1837930631);
               } else {
                  var22 = new class97(var3, 22, var4, var0, var1, var2, var9.field3592, true, (class139)null);
               }

               var6.method2965(var0, var1, var2, var17, (class139)var22, var20, var21);
               if (var9.field3586 == 1 && var7 != null) {
                  var7.method3399(var1, var2, -1999348344);
               }
            }
         } else {
            int var23;
            int var24;
            if (var5 != 10 && var5 != 11) {
               if (var5 >= 12) {
                  if (var9.field3592 == -1 && var9.field3627 == null) {
                     var22 = var9.method5031(var5, var4, var16, var18, var17, var19, 1837930631);
                  } else {
                     var22 = new class97(var3, var5, var4, var0, var1, var2, var9.field3592, true, (class139)null);
                  }

                  var6.method2896(var0, var1, var2, var17, 1, 1, (class139)var22, 0, var20, var21);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     class62.field721[var0][var1][var2] |= 2340;
                  }

                  if (var9.field3586 != 0 && var7 != null) {
                     var7.method3369(var1, var2, var10, var11, var9.field3604, (byte)-3);
                  }
               } else if (var5 == 0) {
                  if (var9.field3592 == -1 && var9.field3627 == null) {
                     var22 = var9.method5031(0, var4, var16, var18, var17, var19, 1837930631);
                  } else {
                     var22 = new class97(var3, 0, var4, var0, var1, var2, var9.field3592, true, (class139)null);
                  }

                  var6.method2884(var0, var1, var2, var17, (class139)var22, (class139)null, class62.field727[var4], 0, var20, var21);
                  if (var4 == 0) {
                     if (var9.field3631) {
                        class62.field725[var0][var1][var2] = 50;
                        class62.field725[var0][var1][var2 + 1] = 50;
                     }

                     if (var9.field3594) {
                        class62.field721[var0][var1][var2] |= 585;
                     }
                  } else if (var4 == 1) {
                     if (var9.field3631) {
                        class62.field725[var0][var1][var2 + 1] = 50;
                        class62.field725[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var9.field3594) {
                        class62.field721[var0][var1][var2 + 1] |= 1170;
                     }
                  } else if (var4 == 2) {
                     if (var9.field3631) {
                        class62.field725[var0][var1 + 1][var2] = 50;
                        class62.field725[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var9.field3594) {
                        class62.field721[var0][var1 + 1][var2] |= 585;
                     }
                  } else if (var4 == 3) {
                     if (var9.field3631) {
                        class62.field725[var0][var1][var2] = 50;
                        class62.field725[var0][var1 + 1][var2] = 50;
                     }

                     if (var9.field3594) {
                        class62.field721[var0][var1][var2] |= 1170;
                     }
                  }

                  if (var9.field3586 != 0 && var7 != null) {
                     var7.method3385(var1, var2, var5, var4, var9.field3604, (byte)-7);
                  }

                  if (var9.field3610 != 16) {
                     var6.method2892(var0, var1, var2, var9.field3610);
                  }
               } else if (var5 == 1) {
                  if (var9.field3592 == -1 && var9.field3627 == null) {
                     var22 = var9.method5031(1, var4, var16, var18, var17, var19, 1837930631);
                  } else {
                     var22 = new class97(var3, 1, var4, var0, var1, var2, var9.field3592, true, (class139)null);
                  }

                  var6.method2884(var0, var1, var2, var17, (class139)var22, (class139)null, class62.field731[var4], 0, var20, var21);
                  if (var9.field3631) {
                     if (var4 == 0) {
                        class62.field725[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        class62.field725[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        class62.field725[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        class62.field725[var0][var1][var2] = 50;
                     }
                  }

                  if (var9.field3586 != 0 && var7 != null) {
                     var7.method3385(var1, var2, var5, var4, var9.field3604, (byte)-98);
                  }
               } else {
                  Object var28;
                  if (var5 == 2) {
                     var24 = var4 + 1 & 3;
                     Object var26;
                     if (var9.field3592 == -1 && var9.field3627 == null) {
                        var26 = var9.method5031(2, var4 + 4, var16, var18, var17, var19, 1837930631);
                        var28 = var9.method5031(2, var24, var16, var18, var17, var19, 1837930631);
                     } else {
                        var26 = new class97(var3, 2, var4 + 4, var0, var1, var2, var9.field3592, true, (class139)null);
                        var28 = new class97(var3, 2, var24, var0, var1, var2, var9.field3592, true, (class139)null);
                     }

                     var6.method2884(var0, var1, var2, var17, (class139)var26, (class139)var28, class62.field727[var4], class62.field727[var24], var20, var21);
                     if (var9.field3594) {
                        if (var4 == 0) {
                           class62.field721[var0][var1][var2] |= 585;
                           class62.field721[var0][var1][var2 + 1] |= 1170;
                        } else if (var4 == 1) {
                           class62.field721[var0][var1][1 + var2] |= 1170;
                           class62.field721[var0][var1 + 1][var2] |= 585;
                        } else if (var4 == 2) {
                           class62.field721[var0][var1 + 1][var2] |= 585;
                           class62.field721[var0][var1][var2] |= 1170;
                        } else if (var4 == 3) {
                           class62.field721[var0][var1][var2] |= 1170;
                           class62.field721[var0][var1][var2] |= 585;
                        }
                     }

                     if (var9.field3586 != 0 && var7 != null) {
                        var7.method3385(var1, var2, var5, var4, var9.field3604, (byte)11);
                     }

                     if (var9.field3610 != 16) {
                        var6.method2892(var0, var1, var2, var9.field3610);
                     }
                  } else if (var5 == 3) {
                     if (var9.field3592 == -1 && var9.field3627 == null) {
                        var22 = var9.method5031(3, var4, var16, var18, var17, var19, 1837930631);
                     } else {
                        var22 = new class97(var3, 3, var4, var0, var1, var2, var9.field3592, true, (class139)null);
                     }

                     var6.method2884(var0, var1, var2, var17, (class139)var22, (class139)null, class62.field731[var4], 0, var20, var21);
                     if (var9.field3631) {
                        if (var4 == 0) {
                           class62.field725[var0][var1][var2 + 1] = 50;
                        } else if (var4 == 1) {
                           class62.field725[var0][var1 + 1][var2 + 1] = 50;
                        } else if (var4 == 2) {
                           class62.field725[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           class62.field725[var0][var1][var2] = 50;
                        }
                     }

                     if (var9.field3586 != 0 && var7 != null) {
                        var7.method3385(var1, var2, var5, var4, var9.field3604, (byte)-65);
                     }
                  } else if (var5 == 9) {
                     if (var9.field3592 == -1 && var9.field3627 == null) {
                        var22 = var9.method5031(var5, var4, var16, var18, var17, var19, 1837930631);
                     } else {
                        var22 = new class97(var3, var5, var4, var0, var1, var2, var9.field3592, true, (class139)null);
                     }

                     var6.method2896(var0, var1, var2, var17, 1, 1, (class139)var22, 0, var20, var21);
                     if (var9.field3586 != 0 && var7 != null) {
                        var7.method3369(var1, var2, var10, var11, var9.field3604, (byte)6);
                     }

                     if (var9.field3610 != 16) {
                        var6.method2892(var0, var1, var2, var9.field3610);
                     }
                  } else if (var5 == 4) {
                     if (var9.field3592 == -1 && var9.field3627 == null) {
                        var22 = var9.method5031(4, var4, var16, var18, var17, var19, 1837930631);
                     } else {
                        var22 = new class97(var3, 4, var4, var0, var1, var2, var9.field3592, true, (class139)null);
                     }

                     var6.method2885(var0, var1, var2, var17, (class139)var22, (class139)null, class62.field727[var4], 0, 0, 0, var20, var21);
                  } else if (var5 == 5) {
                     var24 = 16;
                     var23 = var6.method2987(var0, var1, var2);
                     if (var23 != 0) {
                        var24 = class260.method4546(var23 >> 14 & 32767, 410091570).field3610;
                     }

                     if (var9.field3592 == -1 && var9.field3627 == null) {
                        var28 = var9.method5031(4, var4, var16, var18, var17, var19, 1837930631);
                     } else {
                        var28 = new class97(var3, 4, var4, var0, var1, var2, var9.field3592, true, (class139)null);
                     }

                     var6.method2885(var0, var1, var2, var17, (class139)var28, (class139)null, class62.field727[var4], 0, var24 * class62.field730[var4], var24 * class62.field726[var4], var20, var21);
                  } else if (var5 == 6) {
                     var24 = 8;
                     var23 = var6.method2987(var0, var1, var2);
                     if (var23 != 0) {
                        var24 = class260.method4546(var23 >> 14 & 32767, -2068106782).field3610 / 2;
                     }

                     if (var9.field3592 == -1 && var9.field3627 == null) {
                        var28 = var9.method5031(4, var4 + 4, var16, var18, var17, var19, 1837930631);
                     } else {
                        var28 = new class97(var3, 4, var4 + 4, var0, var1, var2, var9.field3592, true, (class139)null);
                     }

                     var6.method2885(var0, var1, var2, var17, (class139)var28, (class139)null, 256, var4, var24 * class62.field723[var4], var24 * class62.field732[var4], var20, var21);
                  } else if (var5 == 7) {
                     var23 = var4 + 2 & 3;
                     if (var9.field3592 == -1 && var9.field3627 == null) {
                        var22 = var9.method5031(4, var23 + 4, var16, var18, var17, var19, 1837930631);
                     } else {
                        var22 = new class97(var3, 4, var23 + 4, var0, var1, var2, var9.field3592, true, (class139)null);
                     }

                     var6.method2885(var0, var1, var2, var17, (class139)var22, (class139)null, 256, var23, 0, 0, var20, var21);
                  } else if (var5 == 8) {
                     var24 = 8;
                     var23 = var6.method2987(var0, var1, var2);
                     if (var23 != 0) {
                        var24 = class260.method4546(var23 >> 14 & 32767, -776391622).field3610 / 2;
                     }

                     int var29 = var4 + 2 & 3;
                     Object var27;
                     if (var9.field3592 == -1 && var9.field3627 == null) {
                        var28 = var9.method5031(4, var4 + 4, var16, var18, var17, var19, 1837930631);
                        var27 = var9.method5031(4, var29 + 4, var16, var18, var17, var19, 1837930631);
                     } else {
                        var28 = new class97(var3, 4, var4 + 4, var0, var1, var2, var9.field3592, true, (class139)null);
                        var27 = new class97(var3, 4, var29 + 4, var0, var1, var2, var9.field3592, true, (class139)null);
                     }

                     var6.method2885(var0, var1, var2, var17, (class139)var28, (class139)var27, 256, var4, var24 * class62.field723[var4], var24 * class62.field732[var4], var20, var21);
                  }
               }
            } else {
               if (var9.field3592 == -1 && var9.field3627 == null) {
                  var22 = var9.method5031(10, var4, var16, var18, var17, var19, 1837930631);
               } else {
                  var22 = new class97(var3, 10, var4, var0, var1, var2, var9.field3592, true, (class139)null);
               }

               if (var22 != null && var6.method2896(var0, var1, var2, var17, var10, var11, (class139)var22, var5 == 11 ? 256 : 0, var20, var21) && var9.field3631) {
                  var23 = 15;
                  if (var22 instanceof class131) {
                     var23 = ((class131)var22).method2689() / 4;
                     if (var23 > 30) {
                        var23 = 30;
                     }
                  }

                  for(var24 = 0; var24 <= var10; ++var24) {
                     for(int var25 = 0; var25 <= var11; ++var25) {
                        if (var23 > class62.field725[var0][var24 + var1][var25 + var2]) {
                           class62.field725[var0][var24 + var1][var25 + var2] = (byte)var23;
                        }
                     }
                  }
               }

               if (var9.field3586 != 0 && var7 != null) {
                  var7.method3369(var1, var2, var10, var11, var9.field3604, (byte)44);
               }
            }
         }
      }

   }
}

public final class class201 extends class194 {
   static int[] field2593 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   class202 field2595;
   int field2594;

   public class201(int var1) {
      super(var1);
   }

   public boolean method3813(int var1) {
      int var2 = super.field2566[super.field2565] - this.field2595.method3824(-2038739260) & 255;
      return var2 >= 128;
   }

   public void method3816(class202 var1, int var2) {
      this.field2595 = var1;
   }

   public void method3790(int var1, int var2) {
      super.field2566[++super.field2565 - 1] = (byte)(var1 + this.field2595.method3823((byte)63));
   }

   public int method3791(int var1) {
      return super.field2566[++super.field2565 - 1] - this.field2595.method3823((byte)35) & 255;
   }

   public void method3793(byte var1) {
      this.field2594 = super.field2565 * 8;
   }

   public void method3795(int var1) {
      super.field2565 = (this.field2594 + 7) / 8;
   }

   public int getBits(int var1, int var2) {
      int var3 = this.field2594 >> 3;
      int var4 = 8 - (this.field2594 & 7);
      int var5 = 0;

      for(this.field2594 += var1; var1 > var4; var4 = 8) {
         var5 += (super.field2566[var3++] & field2593[var4]) << var1 - var4;
         var1 -= var4;
      }

      if (var4 == var1) {
         var5 += super.field2566[var3] & field2593[var4];
      } else {
         var5 += super.field2566[var3] >> var4 - var1 & field2593[var1];
      }

      return var5;
   }

   public int getBitSize(int var1, int var2) {
      return var1 * 8 - this.field2594;
   }

   public int method3792(byte var1) {
      int var2 = super.field2566[++super.field2565 - 1] - this.field2595.method3823((byte)4) & 255;
      return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field2566[++super.field2565 - 1] - this.field2595.method3823((byte)114) & 255);
   }

   public void method3788(int[] var1, int var2) {
      this.field2595 = new class202(var1);
   }

   static final void method3820(boolean var0, byte var1) {
      for(int var2 = 0; var2 < client.field898; ++var2) {
         class84 var3 = client.field897[client.field899[var2]];
         int var4 = (client.field899[var2] << 14) + 536870912;
         if (var3 != null && var3.vmethod1824(1521115154) && var3.field1300.field3699 == var0 && var3.field1300.method5134(-1179014291)) {
            int var5 = var3.field1185 >> 7;
            int var6 = var3.field1209 >> 7;
            if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
               if (var3.field1153 == 1 && (var3.field1185 & 127) == 64 && (var3.field1209 & 127) == 64) {
                  if (client.field952[var5][var6] == client.field953) {
                     continue;
                  }

                  client.field952[var5][var6] = client.field953;
               }

               if (!var3.field1300.field3729) {
                  var4 -= Integer.MIN_VALUE;
               }

               var3.field1154 = client.field866;
               class308.field3867.method3006(class237.field2769, var3.field1185, var3.field1209, class5.method16(var3.field1153 * 64 - 64 + var3.field1185, var3.field1153 * 64 - 64 + var3.field1209, class237.field2769, -1453085921), var3.field1153 * 64 - 64 + 60, var3, var3.field1151, var4, var3.field1181);
            }
         }
      }

   }

   static final void method3821(int var0, int var1, int var2, int var3, short var4) {
      if (client.field923 == 0 && !client.field1011) {
         class164.method3228("Walk here", "", 23, 0, var0 - var2, var1 - var3, (byte)-43);
      }

      int var5 = -1;
      int var6 = -1;

      int var7;
      int var8;
      for(var7 = 0; var7 < class132.field1913; ++var7) {
         var8 = class132.field1920[var7];
         int var9 = var8 & 127;
         int var10 = var8 >> 7 & 127;
         int var11 = var8 >> 29 & 3;
         int var12 = var8 >> 14 & 32767;
         if (var8 != var6) {
            var6 = var8;
            if (var11 == 2 && class308.field3867.method3041(class237.field2769, var9, var10, var8) >= 0) {
               class282 var13 = class260.method4546(var12, -2090415008);
               if (var13.field3627 != null) {
                  var13 = var13.method5008((byte)93);
               }

               if (var13 == null) {
                  continue;
               }

               if (client.field923 == 1) {
                  class164.method3228("Use", client.field1010 + " -> " + class173.method3342(65535, (byte)-6) + var13.field3596, 1, var8, var9, var10, (byte)-110);
               } else if (client.field1011) {
                  if ((class241.field2799 & 4) == 4) {
                     class164.method3228(client.field956, client.field1015 + " -> " + class173.method3342(65535, (byte)11) + var13.field3596, 2, var8, var9, var10, (byte)-32);
                  }
               } else {
                  String[] var14 = var13.field3613;
                  if (var14 != null) {
                     for(int var15 = 4; var15 >= 0; --var15) {
                        if (var14[var15] != null) {
                           short var16 = 0;
                           if (var15 == 0) {
                              var16 = 3;
                           }

                           if (var15 == 1) {
                              var16 = 4;
                           }

                           if (var15 == 2) {
                              var16 = 5;
                           }

                           if (var15 == 3) {
                              var16 = 6;
                           }

                           if (var15 == 4) {
                              var16 = 1001;
                           }

                           class164.method3228(var14[var15], class173.method3342(65535, (byte)-125) + var13.field3596, var16, var8, var9, var10, (byte)-37);
                        }
                     }
                  }

                  class164.method3228("Examine", class173.method3342(65535, (byte)-75) + var13.field3596, 1002, var13.field3593 << 14, var9, var10, (byte)-55);
               }
            }

            int var17;
            int var25;
            class84 var26;
            class72 var27;
            int[] var29;
            if (var11 == 1) {
               class84 var18 = client.field897[var12];
               if (var18 == null) {
                  continue;
               }

               if (var18.field1300.field3702 == 1 && (var18.field1185 & 127) == 64 && (var18.field1209 & 127) == 64) {
                  for(var25 = 0; var25 < client.field898; ++var25) {
                     var26 = client.field897[client.field899[var25]];
                     if (var26 != null && var18 != var26 && var26.field1300.field3702 == 1 && var26.field1185 == var18.field1185 && var26.field1209 == var18.field1209) {
                        class31.method302(var26.field1300, client.field899[var25], var9, var10, (byte)116);
                     }
                  }

                  var25 = class93.field1414;
                  var29 = class93.field1415;

                  for(var17 = 0; var17 < var25; ++var17) {
                     var27 = client.field971[var29[var17]];
                     if (var27 != null && var18.field1185 == var27.field1185 && var27.field1209 == var18.field1209) {
                        class37.method522(var27, var29[var17], var9, var10, (byte)-76);
                     }
                  }
               }

               class31.method302(var18.field1300, var12, var9, var10, (byte)34);
            }

            if (var11 == 0) {
               class72 var28 = client.field971[var12];
               if (var28 == null) {
                  continue;
               }

               if ((var28.field1185 & 127) == 64 && (var28.field1209 & 127) == 64) {
                  for(var25 = 0; var25 < client.field898; ++var25) {
                     var26 = client.field897[client.field899[var25]];
                     if (var26 != null && var26.field1300.field3702 == 1 && var26.field1185 == var28.field1185 && var28.field1209 == var26.field1209) {
                        class31.method302(var26.field1300, client.field899[var25], var9, var10, (byte)101);
                     }
                  }

                  var25 = class93.field1414;
                  var29 = class93.field1415;

                  for(var17 = 0; var17 < var25; ++var17) {
                     var27 = client.field971[var29[var17]];
                     if (var27 != null && var27 != var28 && var28.field1185 == var27.field1185 && var27.field1209 == var28.field1209) {
                        class37.method522(var27, var29[var17], var9, var10, (byte)-58);
                     }
                  }
               }

               if (var12 != client.field982) {
                  class37.method522(var28, var12, var9, var10, (byte)-22);
               } else {
                  var5 = var8;
               }
            }

            if (var11 == 3) {
               class217 var30 = client.field983[class237.field2769][var9][var10];
               if (var30 != null) {
                  for(class92 var19 = (class92)var30.method4032(); var19 != null; var19 = (class92)var30.method4046()) {
                     class283 var20 = class146.method3099(var19.field1404, (byte)83);
                     if (client.field923 == 1) {
                        class164.method3228("Use", client.field1010 + " -> " + class173.method3342(16748608, (byte)-87) + var20.field3644, 16, var19.field1404, var9, var10, (byte)-21);
                     } else if (client.field1011) {
                        if ((class241.field2799 & 1) == 1) {
                           class164.method3228(client.field956, client.field1015 + " -> " + class173.method3342(16748608, (byte)2) + var20.field3644, 17, var19.field1404, var9, var10, (byte)-2);
                        }
                     } else {
                        String[] var21 = var20.field3674;

                        for(int var22 = 4; var22 >= 0; --var22) {
                           if (var21 != null && var21[var22] != null) {
                              byte var23 = 0;
                              if (var22 == 0) {
                                 var23 = 18;
                              }

                              if (var22 == 1) {
                                 var23 = 19;
                              }

                              if (var22 == 2) {
                                 var23 = 20;
                              }

                              if (var22 == 3) {
                                 var23 = 21;
                              }

                              if (var22 == 4) {
                                 var23 = 22;
                              }

                              class164.method3228(var21[var22], class173.method3342(16748608, (byte)-47) + var20.field3644, var23, var19.field1404, var9, var10, (byte)-99);
                           } else if (var22 == 2) {
                              class164.method3228("Take", class173.method3342(16748608, (byte)-33) + var20.field3644, 20, var19.field1404, var9, var10, (byte)-34);
                           }
                        }

                        class164.method3228("Examine", class173.method3342(16748608, (byte)-9) + var20.field3644, 1004, var19.field1404, var9, var10, (byte)-56);
                     }
                  }
               }
            }
         }
      }

      if (var5 != -1) {
         var7 = var5 & 127;
         var8 = var5 >> 7 & 127;
         class72 var24 = client.field971[client.field982];
         class37.method522(var24, client.field982, var7, var8, (byte)-57);
      }

   }
}

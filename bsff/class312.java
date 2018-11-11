import java.util.Random;

public abstract class class312 extends class327 {
   static int field3896 = -1;
   static String[] field3886 = new String[100];
   static int field3897 = -1;
   static Random field3905 = new Random();
   static int field3902 = 256;
   static int field3898 = -1;
   static int field3900 = 0;
   static int field3901 = 0;
   static int field3906 = -1;
   static int field3903 = 0;
   static int field3890 = 0;
   public static class330[] field3894;
   public int field3891 = 0;
   int[] field3887;
   byte[][] field3889 = new byte[256][];
   public int field3899;
   public int field3893;
   int[] field3885;
   int[] field3904;
   byte[] field3895;
   int[] field3892;
   int[] field3888;

   class312(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field3885 = var2;
      this.field3904 = var3;
      this.field3892 = var4;
      this.field3888 = var5;
      this.method5514(var1);
      this.field3889 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if (this.field3904[var10] < var8 && this.field3888[var10] != 0) {
            var8 = this.field3904[var10];
         }

         if (this.field3904[var10] + this.field3888[var10] > var9) {
            var9 = this.field3904[var10] + this.field3888[var10];
         }
      }

      this.field3899 = this.field3891 - var8;
      this.field3893 = var9 - this.field3891;
   }

   class312(byte[] var1) {
      this.method5514(var1);
   }

   void method5540(int var1, int var2) {
      field3896 = -1;
      field3897 = -1;
      field3898 = var2;
      field3906 = var2;
      field3900 = var1;
      field3901 = var1;
      field3902 = 256;
      field3903 = 0;
      field3890 = 0;
   }

   public int method5590(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              String var8 = var7.substring(4);
                              int var9 = class136.method2876(var8, 10, true, 1385778371);
                              var4 += field3894[var9].field3975;
                              var3 = -1;
                           } catch (Exception var10) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == '\u00a0') {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.field3887[(char)(class70.method1133(var6, -1387664372) & 255)];
                  if (this.field3895 != null && var3 != -1) {
                     var4 += this.field3895[var6 + (var3 << 8)];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int method5517(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.method5547('<');
                     if (this.field3895 != null && var11 != -1) {
                        var4 += this.field3895[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.method5547('>');
                     if (this.field3895 != null && var11 != -1) {
                        var4 += this.field3895[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        String var17 = var16.substring(4);
                        int var18 = class136.method2876(var17, 10, true, -1589468217);
                        var4 += field3894[var18].field3975;
                        var11 = 0;
                     } catch (Exception var19) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.method5547(var15);
                     if (this.field3895 != null && var11 != -1) {
                        var4 += this.field3895[var15 + (var11 << 8)];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var20 = var6.toString();
         if (var20.length() > var5) {
            var3[var12++] = var20.substring(var5, var20.length());
         }

         return var12;
      }
   }

   void method5564(String var1, int var2, int var3) {
      var3 -= this.field3891;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(class70.method1133(var1.charAt(var6), 2010418802) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var8;
               if (var7 == '>' && var4 != -1) {
                  String var9 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var9.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var9.equals("gt")) {
                        if (var9.startsWith("img=")) {
                           try {
                              String var14 = var9.substring(4);
                              var8 = class136.method2876(var14, 10, true, 1863015862);
                              class330 var11 = field3894[var8];
                              var11.method5842(var2, var3 + this.field3891 - var11.field3970);
                              var2 += var11.field3975;
                              var5 = -1;
                           } catch (Exception var12) {
                              ;
                           }
                        } else {
                           this.method5531(var9);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == '\u00a0') {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.field3895 != null && var5 != -1) {
                     var2 += this.field3895[var7 + (var5 << 8)];
                  }

                  int var13 = this.field3892[var7];
                  var8 = this.field3888[var7];
                  if (var7 != ' ') {
                     if (field3902 == 256) {
                        if (field3906 != -1) {
                           method5537(this.field3889[var7], var2 + this.field3885[var7] + 1, var3 + this.field3904[var7] + 1, var13, var8, field3906);
                        }

                        this.vmethod5582(this.field3889[var7], var2 + this.field3885[var7], var3 + this.field3904[var7], var13, var8, field3901);
                     } else {
                        if (field3906 != -1) {
                           method5539(this.field3889[var7], var2 + this.field3885[var7] + 1, var3 + this.field3904[var7] + 1, var13, var8, field3906, field3902);
                        }

                        this.vmethod5536(this.field3889[var7], var2 + this.field3885[var7], var3 + this.field3904[var7], var13, var8, field3901, field3902);
                     }
                  } else if (field3903 > 0) {
                     field3890 += field3903;
                     var2 += field3890 >> 8;
                     field3890 &= 255;
                  }

                  int var10 = this.field3887[var7];
                  if (field3896 != -1) {
                     class327.method5756(var2, var3 + (int)((double)this.field3891 * 0.7D), var10, field3896);
                  }

                  if (field3897 != -1) {
                     class327.method5756(var2, var3 + this.field3891 + 1, var10, field3897);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void method5514(byte[] var1) {
      this.field3887 = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.field3887.length; ++var2) {
            this.field3887[var2] = var1[var2] & 255;
         }

         this.field3891 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field3887[var3] = var1[var2++] & 255;
         }

         int[] var12 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var12[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var6 = new byte[256][];

         int var7;
         for(int var8 = 0; var8 < 256; ++var8) {
            var6[var8] = new byte[var12[var8]];
            byte var9 = 0;

            for(var7 = 0; var7 < var6[var8].length; ++var7) {
               var9 += var1[var2++];
               var6[var8][var7] = var9;
            }
         }

         byte[][] var13 = new byte[256][];

         int var14;
         for(var14 = 0; var14 < 256; ++var14) {
            var13[var14] = new byte[var12[var14]];
            byte var10 = 0;

            for(int var11 = 0; var11 < var13[var14].length; ++var11) {
               var10 += var1[var2++];
               var13[var14][var11] = var10;
            }
         }

         this.field3895 = new byte[65536];

         for(var14 = 0; var14 < 256; ++var14) {
            if (var14 != 32 && var14 != 160) {
               for(var7 = 0; var7 < 256; ++var7) {
                  if (var7 != 32 && var7 != 160) {
                     this.field3895[var7 + (var14 << 8)] = (byte)method5609(var6, var13, var4, this.field3887, var12, var14, var7);
                  }
               }
            }
         }

         this.field3891 = var4[32] + var12[32];
      }

   }

   void method5534(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field3891;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            char var10 = (char)(class70.method1133(var1.charAt(var9), 1789773011) & 255);
            if (var10 == '<') {
               var6 = var9;
            } else {
               int var11;
               int var12;
               int var13;
               if (var10 == '>' && var6 != -1) {
                  String var14 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if (var14.equals("lt")) {
                     var10 = '<';
                  } else {
                     if (!var14.equals("gt")) {
                        if (var14.startsWith("img=")) {
                           try {
                              if (var4 != null) {
                                 var11 = var4[var8];
                              } else {
                                 var11 = 0;
                              }

                              if (var5 != null) {
                                 var12 = var5[var8];
                              } else {
                                 var12 = 0;
                              }

                              ++var8;
                              String var19 = var14.substring(4);
                              var13 = class136.method2876(var19, 10, true, 1175655108);
                              class330 var16 = field3894[var13];
                              var16.method5842(var11 + var2, var12 + (var3 + this.field3891 - var16.field3970));
                              var2 += var16.field3975;
                              var7 = -1;
                           } catch (Exception var17) {
                              ;
                           }
                        } else {
                           this.method5531(var14);
                        }
                        continue;
                     }

                     var10 = '>';
                  }
               }

               if (var10 == '\u00a0') {
                  var10 = ' ';
               }

               if (var6 == -1) {
                  if (this.field3895 != null && var7 != -1) {
                     var2 += this.field3895[var10 + (var7 << 8)];
                  }

                  int var18 = this.field3892[var10];
                  var11 = this.field3888[var10];
                  if (var4 != null) {
                     var12 = var4[var8];
                  } else {
                     var12 = 0;
                  }

                  if (var5 != null) {
                     var13 = var5[var8];
                  } else {
                     var13 = 0;
                  }

                  ++var8;
                  if (var10 != ' ') {
                     if (field3902 == 256) {
                        if (field3906 != -1) {
                           method5537(this.field3889[var10], var12 + var2 + this.field3885[var10] + 1, var3 + var13 + this.field3904[var10] + 1, var18, var11, field3906);
                        }

                        this.vmethod5582(this.field3889[var10], var12 + var2 + this.field3885[var10], var3 + var13 + this.field3904[var10], var18, var11, field3901);
                     } else {
                        if (field3906 != -1) {
                           method5539(this.field3889[var10], var12 + var2 + this.field3885[var10] + 1, var3 + var13 + this.field3904[var10] + 1, var18, var11, field3906, field3902);
                        }

                        this.vmethod5536(this.field3889[var10], var12 + var2 + this.field3885[var10], var3 + var13 + this.field3904[var10], var18, var11, field3901, field3902);
                     }
                  } else if (field3903 > 0) {
                     field3890 += field3903;
                     var2 += field3890 >> 8;
                     field3890 &= 255;
                  }

                  int var15 = this.field3887[var10];
                  if (field3896 != -1) {
                     class327.method5756(var2, var3 + (int)((double)this.field3891 * 0.7D), var15, field3896);
                  }

                  if (field3897 != -1) {
                     class327.method5756(var2, var3 + this.field3891, var15, field3897);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   int method5547(char var1) {
      if (var1 == '\u00a0') {
         var1 = ' ';
      }

      return this.field3887[class70.method1133(var1, -741262497) & 255];
   }

   public int method5519(String var1, int var2) {
      return this.method5517(var1, new int[]{var2}, field3886);
   }

   void method5531(String var1) {
      try {
         if (var1.startsWith("col=")) {
            field3901 = class93.method1928(var1.substring(4), 16, (short)21718);
         } else if (var1.equals("/col")) {
            field3901 = field3900;
         } else if (var1.startsWith("str=")) {
            field3896 = class93.method1928(var1.substring(4), 16, (short)-26237);
         } else if (var1.equals("str")) {
            field3896 = 8388608;
         } else if (var1.equals("/str")) {
            field3896 = -1;
         } else if (var1.startsWith("u=")) {
            field3897 = class93.method1928(var1.substring(2), 16, (short)-12148);
         } else if (var1.equals("u")) {
            field3897 = 0;
         } else if (var1.equals("/u")) {
            field3897 = -1;
         } else if (var1.startsWith("shad=")) {
            field3906 = class93.method1928(var1.substring(5), 16, (short)17875);
         } else if (var1.equals("shad")) {
            field3906 = 0;
         } else if (var1.equals("/shad")) {
            field3906 = field3898;
         } else if (var1.equals("br")) {
            this.method5540(field3900, field3898);
         }
      } catch (Exception var3) {
         ;
      }

   }

   public int method5525(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var1 == null) {
         return 0;
      } else {
         this.method5540(var6, var7);
         if (var10 == 0) {
            var10 = this.field3891;
         }

         int[] var11 = new int[]{var4};
         if (var5 < var10 + this.field3899 + this.field3893 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method5517(var1, var11, field3886);
         if (var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if (var9 == 0) {
            var13 = var3 + this.field3899;
         } else if (var9 == 1) {
            var13 = var3 + (var5 - this.field3899 - this.field3893 - var10 * (var12 - 1)) / 2 + this.field3899;
         } else if (var9 == 2) {
            var13 = var3 + var5 - this.field3893 - var10 * (var12 - 1);
         } else {
            var14 = (var5 - this.field3899 - this.field3893 - var10 * (var12 - 1)) / (var12 + 1);
            if (var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + var14 + this.field3899;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if (var8 == 0) {
               this.method5564(field3886[var14], var2, var13);
            } else if (var8 == 1) {
               this.method5564(field3886[var14], var2 + (var4 - this.method5590(field3886[var14])) / 2, var13);
            } else if (var8 == 2) {
               this.method5564(field3886[var14], var2 + var4 - this.method5590(field3886[var14]), var13);
            } else if (var14 == var12 - 1) {
               this.method5564(field3886[var14], var2, var13);
            } else {
               this.method5583(field3886[var14], var4);
               this.method5564(field3886[var14], var2, var13);
               field3903 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   void method5583(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         field3903 = (var2 - this.method5590(var1) << 8) / var3;
      }

   }

   abstract void vmethod5582(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void vmethod5536(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public void method5529(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method5540(var4, var5);
         field3905.setSeed((long)var6);
         field3902 = 192 + (field3905.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((field3905.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method5534(var1, var2, var3, var7, (int[])null);
      }

   }

   public int method5518(String var1, int var2) {
      int var3 = this.method5517(var1, new int[]{var2}, field3886);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method5590(field3886[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public void method5521(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method5540(var4, var5);
         this.method5564(var1, var2, var3);
      }

   }

   public void method5524(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method5540(var4, var5);
         this.method5564(var1, var2 - this.method5590(var1) / 2, var3);
      }

   }

   public void method5544(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method5540(var4, var5);
         this.method5564(var1, var2 - this.method5590(var1), var3);
      }

   }

   public void method5526(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method5540(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method5534(var1, var2 - this.method5590(var1) / 2, var3, (int[])null, var7);
      }

   }

   public void method5527(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method5540(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method5534(var1, var2 - this.method5590(var1) / 2, var3, var7, var8);
      }

   }

   public void method5528(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null) {
         this.method5540(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if (var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method5534(var1, var2 - this.method5590(var1) / 2, var3, (int[])null, var10);
      }

   }

   public void method5586(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method5540(var4, var5);
         field3902 = var6;
         this.method5564(var1, var2, var3);
      }

   }

   static int method5609(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   static void method5537(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class327.field3954;
      int var7 = class327.field3954 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < class327.field3955) {
         var10 = class327.field3955 - var2;
         var4 -= var10;
         var2 = class327.field3955;
         var9 += var3 * var10;
         var6 += var10 * class327.field3954;
      }

      if (var2 + var4 > class327.field3956) {
         var4 -= var2 + var4 - class327.field3956;
      }

      if (var1 < class327.field3952) {
         var10 = class327.field3952 - var1;
         var3 -= var10;
         var1 = class327.field3952;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 + var1 > class327.field3953) {
         var10 = var3 + var1 - class327.field3953;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         method5523(class327.field3958, var0, var5, var9, var6, var3, var4, var7, var8);
      }

   }

   static void method5523(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5605(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & '\uff00') * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & '\uff00') * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5539(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class327.field3954;
      int var8 = class327.field3954 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < class327.field3955) {
         var11 = class327.field3955 - var2;
         var4 -= var11;
         var2 = class327.field3955;
         var10 += var3 * var11;
         var7 += var11 * class327.field3954;
      }

      if (var2 + var4 > class327.field3956) {
         var4 -= var2 + var4 - class327.field3956;
      }

      if (var1 < class327.field3952) {
         var11 = class327.field3952 - var1;
         var3 -= var11;
         var1 = class327.field3952;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 + var1 > class327.field3953) {
         var11 = var3 + var1 - class327.field3953;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         method5605(class327.field3958, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }

   }

   public static String method5520(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }
}

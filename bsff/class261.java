public abstract class class261 {
   static class187 field3379 = new class187();
   static int field3383 = 0;
   int[][] field3374;
   int[] field3368;
   Object[] field3377;
   Object[][] field3375;
   boolean field3376;
   class210[] field3366;
   class210 field3370;
   int[] field3372;
   int[] field3373;
   public int field3380;
   boolean field3382;
   int[] field3371;
   int field3367;
   int[] field3369;
   int[][] field3381;

   class261(boolean var1, boolean var2) {
      this.field3376 = var1;
      this.field3382 = var2;
   }

   public int[] method4562(int var1, int var2) {
      return this.field3374[var1];
   }

   public byte[] method4552(int var1, int var2, int[] var3, int var4) {
      if (var1 >= 0 && var1 < this.field3375.length && this.field3375[var1] != null && var2 >= 0 && var2 < this.field3375[var1].length) {
         if (this.field3375[var1][var2] == null) {
            boolean var5 = this.method4575(var1, var3, 2131245707);
            if (!var5) {
               this.vmethod4663(var1, -1509535835);
               var5 = this.method4575(var1, var3, 425455633);
               if (!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = class35.method517(this.field3375[var1][var2], false, (byte)113);
         if (this.field3382) {
            this.field3375[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   public int method4565(int var1) {
      return this.field3375.length;
   }

   public byte[] method4559(int var1, int var2, byte var3) {
      if (var1 >= 0 && var1 < this.field3375.length && this.field3375[var1] != null && var2 >= 0 && var2 < this.field3375[var1].length) {
         if (this.field3375[var1][var2] == null) {
            boolean var4 = this.method4575(var1, (int[])null, -804802839);
            if (!var4) {
               this.vmethod4663(var1, -1509535835);
               var4 = this.method4575(var1, (int[])null, -815755103);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class35.method517(this.field3375[var1][var2], false, (byte)119);
         return var5;
      } else {
         return null;
      }
   }

   public boolean method4570(int var1, int var2, byte var3) {
      if (var1 >= 0 && var1 < this.field3375.length && this.field3375[var1] != null && var2 >= 0 && var2 < this.field3375[var1].length) {
         if (this.field3375[var1][var2] != null) {
            return true;
         } else if (this.field3377[var1] != null) {
            return true;
         } else {
            this.vmethod4663(var1, -1509535835);
            return this.field3377[var1] != null;
         }
      } else {
         return false;
      }
   }

   public byte[] method4551(int var1, int var2, int var3) {
      return this.method4552(var1, var2, (int[])null, 916811903);
   }

   void vmethod4663(int var1, int var2) {
   }

   public byte[] method4560(int var1, int var2) {
      if (this.field3375.length == 1) {
         return this.method4559(0, var1, (byte)-54);
      } else if (this.field3375[var1].length == 1) {
         return this.method4559(var1, 0, (byte)-7);
      } else {
         throw new RuntimeException();
      }
   }

   public int method4563(int var1, int var2) {
      return this.field3375[var1].length;
   }

   void method4549(byte[] var1, short var2) {
      this.field3380 = class304.method5427(var1, var1.length, 1564177834);
      class194 var3 = new class194(class5.method14(var1, 1571610652));
      int var4 = var3.getUByte(-2108498232);
      if (var4 >= 5 && var4 <= 7) {
         if (var4 >= 6) {
            var3.getInt(-1817376731);
         }

         int var5 = var3.getUByte(-1226561809);
         if (var4 >= 7) {
            this.field3367 = var3.getBigSmart2(-160670351);
         } else {
            this.field3367 = var3.getUShort(-1208216487);
         }

         int var6 = 0;
         int var7 = -1;
         this.field3368 = new int[this.field3367];
         int var8;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field3367; ++var8) {
               this.field3368[var8] = var6 += var3.getBigSmart2(-1518834033);
               if (this.field3368[var8] > var7) {
                  var7 = this.field3368[var8];
               }
            }
         } else {
            for(var8 = 0; var8 < this.field3367; ++var8) {
               this.field3368[var8] = var6 += var3.getUShort(-1208216487);
               if (this.field3368[var8] > var7) {
                  var7 = this.field3368[var8];
               }
            }
         }

         this.field3371 = new int[var7 + 1];
         this.field3372 = new int[var7 + 1];
         this.field3373 = new int[var7 + 1];
         this.field3374 = new int[var7 + 1][];
         this.field3377 = new Object[var7 + 1];
         this.field3375 = new Object[var7 + 1][];
         if (var5 != 0) {
            this.field3369 = new int[var7 + 1];

            for(var8 = 0; var8 < this.field3367; ++var8) {
               this.field3369[this.field3368[var8]] = var3.getInt(-1817376731);
            }

            this.field3370 = new class210(this.field3369);
         }

         for(var8 = 0; var8 < this.field3367; ++var8) {
            this.field3371[this.field3368[var8]] = var3.getInt(-1817376731);
         }

         for(var8 = 0; var8 < this.field3367; ++var8) {
            this.field3372[this.field3368[var8]] = var3.getInt(-1817376731);
         }

         for(var8 = 0; var8 < this.field3367; ++var8) {
            this.field3373[this.field3368[var8]] = var3.getUShort(-1208216487);
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field3367; ++var8) {
               var9 = this.field3368[var8];
               var10 = this.field3373[var9];
               var6 = 0;
               var11 = -1;
               this.field3374[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3374[var9][var12] = var6 += var3.getBigSmart2(-1652002054);
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3375[var9] = new Object[var11 + 1];
            }
         } else {
            for(var8 = 0; var8 < this.field3367; ++var8) {
               var9 = this.field3368[var8];
               var10 = this.field3373[var9];
               var6 = 0;
               var11 = -1;
               this.field3374[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3374[var9][var12] = var6 += var3.getUShort(-1208216487);
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3375[var9] = new Object[var11 + 1];
            }
         }

         if (var5 != 0) {
            this.field3381 = new int[var7 + 1][];
            this.field3366 = new class210[var7 + 1];

            for(var8 = 0; var8 < this.field3367; ++var8) {
               var9 = this.field3368[var8];
               var10 = this.field3373[var9];
               this.field3381[var9] = new int[this.field3375[var9].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.field3381[var9][this.field3374[var9][var11]] = var3.getInt(-1817376731);
               }

               this.field3366[var9] = new class210(this.field3381[var9]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   int vmethod4668(int var1, byte var2) {
      return this.field3377[var1] != null ? 100 : 0;
   }

   public boolean method4637(String var1, String var2, int var3) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3370.method3919(class183.method3426(var1, (byte)1));
      int var5 = this.field3366[var4].method3919(class183.method3426(var2, (byte)1));
      return this.method4570(var4, var5, (byte)70);
   }

   void vmethod4661(int var1, int var2) {
   }

   public boolean method4555(int var1, int var2) {
      if (this.field3377[var1] != null) {
         return true;
      } else {
         this.vmethod4663(var1, -1509535835);
         return this.field3377[var1] != null;
      }
   }

   public byte[] method4612(int var1, int var2) {
      if (this.field3375.length == 1) {
         return this.method4551(0, var1, -76698541);
      } else if (this.field3375[var1].length == 1) {
         return this.method4551(var1, 0, -769183165);
      } else {
         throw new RuntimeException();
      }
   }

   public int method4606(String var1, int var2) {
      var1 = var1.toLowerCase();
      return this.field3370.method3919(class183.method3426(var1, (byte)1));
   }

   public boolean method4571(String var1, String var2, byte var3) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3370.method3919(class183.method3426(var1, (byte)1));
      if (var4 < 0) {
         return false;
      } else {
         int var5 = this.field3366[var4].method3919(class183.method3426(var2, (byte)1));
         return var5 >= 0;
      }
   }

   public int method4568(int var1, String var2, short var3) {
      var2 = var2.toLowerCase();
      return this.field3366[var1].method3919(class183.method3426(var2, (byte)1));
   }

   public boolean method4630(int var1, int var2) {
      if (this.field3375.length == 1) {
         return this.method4570(0, var1, (byte)70);
      } else if (this.field3375[var1].length == 1) {
         return this.method4570(var1, 0, (byte)70);
      } else {
         throw new RuntimeException();
      }
   }

   public int method4576(String var1, int var2) {
      var1 = var1.toLowerCase();
      int var3 = this.field3370.method3919(class183.method3426(var1, (byte)1));
      return this.vmethod4668(var3, (byte)116);
   }

   boolean method4575(int var1, int[] var2, int var3) {
      if (this.field3377[var1] == null) {
         return false;
      } else {
         int var4 = this.field3373[var1];
         int[] var5 = this.field3374[var1];
         Object[] var6 = this.field3375[var1];
         boolean var7 = true;

         for(int var8 = 0; var8 < var4; ++var8) {
            if (var6[var5[var8]] == null) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            return true;
         } else {
            byte[] var19;
            if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
               var19 = class35.method517(this.field3377[var1], true, (byte)113);
               class194 var9 = new class194(var19);
               var9.method3540(var2, 5, var9.field2566.length, -1251864053);
            } else {
               var19 = class35.method517(this.field3377[var1], false, (byte)127);
            }

            byte[] var20 = class5.method14(var19, -730606758);
            if (this.field3376) {
               this.field3377[var1] = null;
            }

            if (var4 > 1) {
               int var10 = var20.length;
               --var10;
               int var11 = var20[var10] & 255;
               var10 -= var11 * var4 * 4;
               class194 var12 = new class194(var20);
               int[] var13 = new int[var4];
               var12.field2565 = var10;

               int var14;
               int var15;
               for(int var16 = 0; var16 < var11; ++var16) {
                  var14 = 0;

                  for(var15 = 0; var15 < var4; ++var15) {
                     var14 += var12.getInt(-1817376731);
                     var13[var15] += var14;
                  }
               }

               byte[][] var21 = new byte[var4][];

               for(var14 = 0; var14 < var4; ++var14) {
                  var21[var14] = new byte[var13[var14]];
                  var13[var14] = 0;
               }

               var12.field2565 = var10;
               var14 = 0;

               for(var15 = 0; var15 < var11; ++var15) {
                  int var17 = 0;

                  for(int var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.getInt(-1817376731);
                     System.arraycopy(var20, var14, var21[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var14 += var17;
                  }
               }

               for(var15 = 0; var15 < var4; ++var15) {
                  if (!this.field3382) {
                     var6[var5[var15]] = class61.method1059(var21[var15], false, (short)174);
                  } else {
                     var6[var5[var15]] = var21[var15];
                  }
               }
            } else if (!this.field3382) {
               var6[var5[0]] = class61.method1059(var20, false, (short)174);
            } else {
               var6[var5[0]] = var20;
            }

            return true;
         }
      }
   }

   public byte[] method4572(String var1, String var2, int var3) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3370.method3919(class183.method3426(var1, (byte)1));
      int var5 = this.field3366[var4].method3919(class183.method3426(var2, (byte)1));
      return this.method4551(var4, var5, -605896856);
   }

   public int[] test(String var1, String var2, int var3) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3370.method3919(class183.method3426(var1, (byte)1));
      int var5 = this.field3366[var4].method3919(class183.method3426(var2, (byte)1));
      return new int[]{var4, var5};
   }

   public boolean method4640(int var1) {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.field3368.length; ++var3) {
         int var4 = this.field3368[var3];
         if (this.field3377[var4] == null) {
            this.vmethod4663(var4, -1509535835);
            if (this.field3377[var4] == null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public boolean method4574(String var1, int var2) {
      var1 = var1.toLowerCase();
      int var3 = this.field3370.method3919(class183.method3426(var1, (byte)1));
      return this.method4555(var3, 702984081);
   }

   public void method4566(int var1, byte var2) {
      for(int var3 = 0; var3 < this.field3375[var1].length; ++var3) {
         this.field3375[var1][var3] = null;
      }

   }

   public void method4556(int var1) {
      for(int var2 = 0; var2 < this.field3377.length; ++var2) {
         this.field3377[var2] = null;
      }

   }

   public void method4567(short var1) {
      for(int var2 = 0; var2 < this.field3375.length; ++var2) {
         if (this.field3375[var2] != null) {
            for(int var3 = 0; var3 < this.field3375[var2].length; ++var3) {
               this.field3375[var2][var3] = null;
            }
         }
      }

   }

   public void method4585(String var1, int var2) {
      var1 = var1.toLowerCase();
      int var3 = this.field3370.method3919(class183.method3426(var1, (byte)1));
      if (var3 >= 0) {
         this.vmethod4661(var3, 448107719);
      }

   }

   static boolean method4595(int var0, int var1, int var2) {
      return var0 != 4 || var1 < 8;
   }

   public static int method4648(int var0, int var1, int var2, byte var3) {
      var2 &= 3;
      return var2 == 0 ? var1 : (var2 == 1 ? 7 - var0 : (var2 == 2 ? 7 - var1 : var0));
   }
}

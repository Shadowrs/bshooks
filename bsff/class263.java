import java.util.zip.CRC32;

public class class263 extends class261 {
   static CRC32 field3393 = new CRC32();
   class174 field3394;
   int field3400;
   class174 field3398;
   volatile boolean field3396 = false;
   volatile boolean[] field3399;
   int field3395;
   int field3401;
   int field3402 = -1;
   boolean field3397 = false;

   public class263(class174 var1, class174 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field3398 = var1;
      this.field3394 = var2;
      this.field3395 = var3;
      this.field3397 = var6;
      class107.method2241(this, this.field3395, -1902848877);
   }

   void vmethod4663(int var1, int var2) {
      if (this.field3398 != null && this.field3399 != null && this.field3399[var1]) {
         class239.method4436(var1, this.field3398, this, (byte)100);
      } else {
         class142.method3082(this, this.field3395, var1, super.field3371[var1], (byte)2, true, (byte)53);
      }

   }

   public boolean method4690(int var1, byte var2) {
      return this.method4562(var1, -446842660) != null;
   }

   int vmethod4668(int var1, byte var2) {
      return super.field3377[var1] != null ? 100 : (this.field3399[var1] ? 100 : class6.method29(this.field3395, var1, -115067930));
   }

   void method4667(short var1) {
      this.field3399 = new boolean[super.field3377.length];

      int var2;
      for(var2 = 0; var2 < this.field3399.length; ++var2) {
         this.field3399[var2] = false;
      }

      if (this.field3398 == null) {
         this.field3396 = true;
      } else {
         this.field3402 = -1;

         for(var2 = 0; var2 < this.field3399.length; ++var2) {
            if (super.field3373[var2] > 0) {
               class228.method4120(var2, this.field3398, this, (short)-15333);
               this.field3402 = var2;
            }
         }

         if (this.field3402 == -1) {
            this.field3396 = true;
         }
      }

   }

   void vmethod4661(int var1, int var2) {
      int var3 = this.field3395;
      long var4 = (long)((var3 << 16) + var1);
      class260 var6 = (class260)class264.field3421.method3981(var4);
      if (var6 != null) {
         class264.field3411.method3878(var6);
      }

   }

   public boolean method4675(int var1, int var2) {
      return this.field3399[var1];
   }

   public void method4666(class174 var1, int var2, byte[] var3, boolean var4, int var5) {
      int var6;
      if (var1 == this.field3394) {
         if (this.field3396) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            class142.method3082(this, 255, this.field3395, this.field3400, (byte)0, true, (byte)36);
         } else {
            field3393.reset();
            field3393.update(var3, 0, var3.length);
            var6 = (int)field3393.getValue();
            if (var6 != this.field3400) {
               class142.method3082(this, 255, this.field3395, this.field3400, (byte)0, true, (byte)78);
            } else {
               class194 var7 = new class194(class5.method14(var3, -1521419694));
               int var8 = var7.getUByte(-1537167193);
               if (var8 != 5 && var8 != 6) {
                  throw new RuntimeException(var8 + "," + this.field3395 + "," + var2);
               }

               int var9 = 0;
               if (var8 >= 6) {
                  var9 = var7.getInt(-1817376731);
               }

               if (var9 != this.field3401) {
                  class142.method3082(this, 255, this.field3395, this.field3400, (byte)0, true, (byte)72);
               } else {
                  this.method4549(var3, (short)-22035);
                  this.method4667((short)180);
               }
            }
         }
      } else {
         if (!var4 && var2 == this.field3402) {
            this.field3396 = true;
         }

         if (var3 != null && var3.length > 2) {
            field3393.reset();
            field3393.update(var3, 0, var3.length - 2);
            var6 = (int)field3393.getValue();
            int var10 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if (var6 == super.field3371[var2] && var10 == super.field3372[var2]) {
               this.field3399[var2] = true;
               if (var4) {
                  super.field3377[var2] = class61.method1059(var3, false, (short)174);
               }
            } else {
               this.field3399[var2] = false;
               if (this.field3397 || var4) {
                  class142.method3082(this, this.field3395, var2, super.field3371[var2], (byte)2, var4, (byte)50);
               }
            }
         } else {
            this.field3399[var2] = false;
            if (this.field3397 || var4) {
               class142.method3082(this, this.field3395, var2, super.field3371[var2], (byte)2, var4, (byte)42);
            }
         }
      }

   }

   void method4688(int var1, int var2, int var3) {
      this.field3400 = var1;
      this.field3401 = var2;
      if (this.field3394 != null) {
         class239.method4436(this.field3395, this.field3394, this, (byte)72);
      } else {
         class142.method3082(this, 255, this.field3395, this.field3400, (byte)0, true, (byte)51);
      }

   }

   public int method4662(byte var1) {
      if (this.field3396) {
         return 100;
      } else if (super.field3377 != null) {
         return 99;
      } else {
         int var2 = class6.method29(255, this.field3395, -115067930);
         if (var2 >= 100) {
            var2 = 99;
         }

         return var2;
      }
   }

   public int method4671(int var1) {
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < super.field3377.length; ++var4) {
         if (super.field3373[var4] > 0) {
            var2 += 100;
            var3 += this.vmethod4668(var4, (byte)-6);
         }
      }

      if (var2 == 0) {
         return 100;
      } else {
         var4 = var3 * 100 / var2;
         return var4;
      }
   }

   void method4665(int var1, byte[] var2, boolean var3, boolean var4, int var5) {
      if (var3) {
         if (this.field3396) {
            throw new RuntimeException();
         }

         if (this.field3394 != null) {
            class242.method4455(this.field3395, var2, this.field3394, 274859210);
         }

         this.method4549(var2, (short)-8502);
         this.method4667((short)180);
      } else {
         var2[var2.length - 2] = (byte)(super.field3372[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field3372[var1];
         if (this.field3398 != null) {
            class242.method4455(var1, var2, this.field3398, 1097979909);
            this.field3399[var1] = true;
         }

         if (var4) {
            super.field3377[var1] = class61.method1059(var2, false, (short)174);
         }
      }

   }

   public static double method4664(double var0) {
      return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
   }

   static final void method4694(int var0) {
      class47.method743("You can't add yourself to your own ignore list", -1942119771);
   }
}

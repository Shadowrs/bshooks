import java.awt.Font;
import java.io.EOFException;
import java.io.IOException;

public final class class174 {
   static byte[] field2244 = new byte[520];
   static Font field2249;
   class121 field2248 = null;
   class121 field2246 = null;
   int field2245 = 65000;
   int field2247;

   public class174(int var1, class121 var2, class121 var3, int var4) {
      this.field2247 = var1;
      this.field2248 = var2;
      this.field2246 = var3;
      this.field2245 = var4;
   }

   boolean method3349(int var1, byte[] var2, int var3, boolean var4, byte var5) {
      class121 var6 = this.field2248;
      synchronized(var6) {
         try {
            int var9;
            boolean var10000;
            if (var4) {
               if (this.field2246.method2531(-286787096) < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field2246.method2505((long)(var1 * 6));
               this.field2246.method2507(field2244, 0, 6, 1322693566);
               var9 = (field2244[5] & 255) + ((field2244[3] & 255) << 16) + ((field2244[4] & 255) << 8);
               if (var9 <= 0 || (long)var9 > this.field2248.method2531(2121217198) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var9 = (int)((this.field2248.method2531(-640096756) + 519L) / 520L);
               if (var9 == 0) {
                  var9 = 1;
               }
            }

            field2244[0] = (byte)(var3 >> 16);
            field2244[1] = (byte)(var3 >> 8);
            field2244[2] = (byte)var3;
            field2244[3] = (byte)(var9 >> 16);
            field2244[4] = (byte)(var9 >> 8);
            field2244[5] = (byte)var9;
            this.field2246.method2505((long)(var1 * 6));
            this.field2246.method2508(field2244, 0, 6, (short)22937);
            int var10 = 0;
            int var11 = 0;

            while(true) {
               if (var10 < var3) {
                  label130: {
                     int var12 = 0;
                     int var13;
                     if (var4) {
                        this.field2248.method2505((long)(var9 * 520));

                        try {
                           this.field2248.method2507(field2244, 0, 8, 1625607178);
                        } catch (EOFException var17) {
                           break label130;
                        }

                        var13 = (field2244[1] & 255) + ((field2244[0] & 255) << 8);
                        int var14 = (field2244[3] & 255) + ((field2244[2] & 255) << 8);
                        var12 = ((field2244[5] & 255) << 8) + ((field2244[4] & 255) << 16) + (field2244[6] & 255);
                        int var15 = field2244[7] & 255;
                        if (var13 != var1 || var14 != var11 || var15 != this.field2247) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var12 < 0 || (long)var12 > this.field2248.method2531(-1239537695) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var12 == 0) {
                        var4 = false;
                        var12 = (int)((this.field2248.method2531(-781058458) + 519L) / 520L);
                        if (var12 == 0) {
                           ++var12;
                        }

                        if (var12 == var9) {
                           ++var12;
                        }
                     }

                     if (var3 - var10 <= 512) {
                        var12 = 0;
                     }

                     field2244[0] = (byte)(var1 >> 8);
                     field2244[1] = (byte)var1;
                     field2244[2] = (byte)(var11 >> 8);
                     field2244[3] = (byte)var11;
                     field2244[4] = (byte)(var12 >> 16);
                     field2244[5] = (byte)(var12 >> 8);
                     field2244[6] = (byte)var12;
                     field2244[7] = (byte)this.field2247;
                     this.field2248.method2505((long)(var9 * 520));
                     this.field2248.method2508(field2244, 0, 8, (short)32248);
                     var13 = var3 - var10;
                     if (var13 > 512) {
                        var13 = 512;
                     }

                     this.field2248.method2508(var2, var10, var13, (short)22655);
                     var10 += var13;
                     var9 = var12;
                     ++var11;
                     continue;
                  }
               }

               boolean var8 = true;
               return var8;
            }
         } catch (IOException var18) {
            return false;
         }
      }
   }

   public boolean method3345(int var1, byte[] var2, int var3, int var4) {
      class121 var5 = this.field2248;
      synchronized(var5) {
         if (var3 >= 0 && var3 <= this.field2245) {
            boolean var7 = this.method3349(var1, var2, var3, true, (byte)67);
            if (!var7) {
               var7 = this.method3349(var1, var2, var3, false, (byte)81);
            }

            return var7;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   public byte[] method3344(int var1, int var2) {
      class121 var3 = this.field2248;
      synchronized(var3) {
         try {
            Object var10000;
            if (this.field2246.method2531(-214794823) < (long)(var1 * 6 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.field2246.method2505((long)(var1 * 6));
               this.field2246.method2507(field2244, 0, 6, 1506376877);
               int var5 = ((field2244[0] & 255) << 16) + (field2244[2] & 255) + ((field2244[1] & 255) << 8);
               int var6 = (field2244[5] & 255) + ((field2244[3] & 255) << 16) + ((field2244[4] & 255) << 8);
               if (var5 >= 0 && var5 <= this.field2245) {
                  if (var6 > 0 && (long)var6 <= this.field2248.method2531(1963798053) / 520L) {
                     byte[] var7 = new byte[var5];
                     int var8 = 0;

                     for(int var9 = 0; var8 < var5; ++var9) {
                        if (var6 == 0) {
                           var10000 = null;
                           return (byte[])var10000;
                        }

                        this.field2248.method2505((long)(var6 * 520));
                        int var10 = var5 - var8;
                        if (var10 > 512) {
                           var10 = 512;
                        }

                        this.field2248.method2507(field2244, 0, var10 + 8, 1462336658);
                        int var11 = (field2244[1] & 255) + ((field2244[0] & 255) << 8);
                        int var12 = (field2244[3] & 255) + ((field2244[2] & 255) << 8);
                        int var13 = ((field2244[5] & 255) << 8) + ((field2244[4] & 255) << 16) + (field2244[6] & 255);
                        int var14 = field2244[7] & 255;
                        if (var11 != var1 || var12 != var9 || var14 != this.field2247) {
                           var10000 = null;
                           return (byte[])var10000;
                        }

                        if (var13 < 0 || (long)var13 > this.field2248.method2531(-1830407053) / 520L) {
                           var10000 = null;
                           return (byte[])var10000;
                        }

                        for(int var15 = 0; var15 < var10; ++var15) {
                           var7[var8++] = field2244[var15 + 8];
                        }

                        var6 = var13;
                     }

                     byte[] var19 = var7;
                     return var19;
                  } else {
                     var10000 = null;
                     return (byte[])var10000;
                  }
               } else {
                  var10000 = null;
                  return (byte[])var10000;
               }
            }
         } catch (IOException var17) {
            return null;
         }
      }
   }
}

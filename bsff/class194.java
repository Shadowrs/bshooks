import java.applet.Applet;
import java.math.BigInteger;

public class class194 extends class216 {
   static int[] field2567 = new int[256];
   static long[] field2570;
   static class114 field2571;
   public byte[] field2566;
   public int field2565;

   public class194(int var1) {
      this.field2566 = class29.method271(var1, (byte)-51);
      this.field2565 = 0;
   }

   public class194(byte[] var1) {
      this.field2566 = var1;
      this.field2565 = 0;
   }

   public String getString1(int var1) {
      int var2 = this.field2565;

      while(this.field2566[++this.field2565 - 1] != 0) {
         ;
      }

      int var3 = this.field2565 - var2 - 1;
      String var4 = var3 == 0 ? "" : class176.method3392(this.field2566, var2, var3, (byte)2);
      if (var4.contains("to continue")) {
         ;
      }

      return var4;
   }

   public int getInt(int var1) {
      this.field2565 += 4;
      return ((this.field2566[this.field2565 - 3] & 255) << 16) + (this.field2566[this.field2565 - 1] & 255) + ((this.field2566[this.field2565 - 2] & 255) << 8) + ((this.field2566[this.field2565 - 4] & 255) << 24);
   }

   public void addByte(int var1, byte var2) {
      this.field2566[++this.field2565 - 1] = (byte)var1;
   }

   public int getUByte(int var1) {
      return this.field2566[++this.field2565 - 1] & 255;
   }

   public int getBigSmart(int var1) {
      if (this.field2566[this.field2565] < 0) {
         return this.getInt(-1817376731) & Integer.MAX_VALUE;
      } else {
         int var2 = this.getUShort(-1208216487);
         return var2 == 32767 ? -1 : var2;
      }
   }

   public int get24Int(byte var1) {
      this.field2565 += 3;
      return ((this.field2566[this.field2565 - 3] & 255) << 16) + (this.field2566[this.field2565 - 1] & 255) + ((this.field2566[this.field2565 - 2] & 255) << 8);
   }

   public int method3536(int var1) {
      byte var2 = this.field2566[++this.field2565 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.field2566[++this.field2565 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public byte getByte(int var1) {
      return this.field2566[++this.field2565 - 1];
   }

   public int getUShort(int var1) {
      this.field2565 += 2;
      return (this.field2566[this.field2565 - 1] & 255) + ((this.field2566[this.field2565 - 2] & 255) << 8);
   }

   public void getBytes(byte[] var1, int var2, int var3, int var4) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.field2566[++this.field2565 - 1];
      }

   }

   public void addInt(int var1, byte var2) {
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 24);
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 16);
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 8);
      this.field2566[++this.field2565 - 1] = (byte)var1;
   }

   public long getLong(int var1) {
      long var2 = (long)this.getInt(-1817376731) & 4294967295L;
      long var4 = (long)this.getInt(-1817376731) & 4294967295L;
      return var4 + (var2 << 32);
   }

   public void addShort(int var1, int var2) {
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 8);
      this.field2566[++this.field2565 - 1] = (byte)var1;
   }

   public int getShort(int var1) {
      this.field2565 += 2;
      int var2 = (this.field2566[this.field2565 - 1] & 255) + ((this.field2566[this.field2565 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public String getString2(int var1) {
      byte var2 = this.field2566[++this.field2565 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.field2565;

         while(this.field2566[++this.field2565 - 1] != 0) {
            ;
         }

         int var4 = this.field2565 - var3 - 1;
         String var5 = var4 == 0 ? "" : class176.method3392(this.field2566, var3, var4, (byte)76);
         if (var5.contains("to continue")) {
            ;
         }

         return var5;
      }
   }

   public void method3518(int var1, int var2) {
      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.addByte(var1 >>> 28 | 128, (byte)-20);
               }

               this.addByte(var1 >>> 21 | 128, (byte)-48);
            }

            this.addByte(var1 >>> 14 | 128, (byte)-20);
         }

         this.addByte(var1 >>> 7 | 128, (byte)-72);
      }

      this.addByte(var1 & 127, (byte)-9);
   }

   public void addBytes(byte[] var1, int var2, int var3, byte var4) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         this.field2566[++this.field2565 - 1] = var1[var5];
      }

   }

   public int getBigSmart2(int var1) {
      return this.field2566[this.field2565] < 0 ? this.getInt(-1817376731) & Integer.MAX_VALUE : this.getUShort(-1208216487);
   }

   public void method3540(int[] var1, int var2, int var3, int var4) {
      int var5 = this.field2565;
      this.field2565 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.getInt(-1817376731);
         int var9 = this.getInt(-1817376731);
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
            var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
            var10 -= var11;
         }

         this.field2565 -= 8;
         this.addInt(var8, (byte)24);
         this.addInt(var9, (byte)70);
      }

      this.field2565 = var5;
   }

   public void addString1(String var1, int var2) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field2565 += class198.method3755(var1, 0, var1.length(), this.field2566, this.field2565, -1232797607);
         this.field2566[++this.field2565 - 1] = 0;
      }
   }

   public void addBoolean(boolean var1, int var2) {
      this.addByte(var1 ? 1 : 0, (byte)-53);
   }

   public void method3502(int var1) {
      if (this.field2566 != null) {
         class38.method531(this.field2566, 2133478144);
      }

      this.field2566 = null;
   }

   public void add24Int(int var1, byte var2) {
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 16);
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 8);
      this.field2566[++this.field2565 - 1] = (byte)var1;
   }

   public String getString3(int var1) {
      if (this.field2566[this.field2565] == 0) {
         ++this.field2565;
         return null;
      } else {
         return this.getString1(-778927800);
      }
   }

   public boolean getBoolean(int var1) {
      return (this.getUByte(-2142548488) & 1) == 1;
   }

   public int getSmart(int var1) {
      int var2 = this.field2566[this.field2565] & 255;
      return var2 < 128 ? this.getUByte(-1267637495) - 64 : this.getUShort(-1208216487) - '\uc000';
   }

   public void addString2(String var1, byte var2) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field2566[++this.field2565 - 1] = 0;
         this.field2565 += class198.method3755(var1, 0, var1.length(), this.field2566, this.field2565, -1232797607);
         this.field2566[++this.field2565 - 1] = 0;
      }
   }

   public int getIntV3(int var1) {
      this.field2565 += 4;
      return ((this.field2566[this.field2565 - 1] & 255) << 8) + ((this.field2566[this.field2565 - 4] & 255) << 16) + (this.field2566[this.field2565 - 2] & 255) + ((this.field2566[this.field2565 - 3] & 255) << 24);
   }

   public int getUShortLE128(int var1) {
      this.field2565 += 2;
      return ((this.field2566[this.field2565 - 1] & 255) << 8) + (this.field2566[this.field2565 - 2] - 128 & 255);
   }

   public int getU128Byte(byte var1) {
      return 128 - this.field2566[++this.field2565 - 1] & 255;
   }

   public int getUShort128(int var1) {
      this.field2565 += 2;
      return (this.field2566[this.field2565 - 1] - 128 & 255) + ((this.field2566[this.field2565 - 2] & 255) << 8);
   }

   public int getUReversedByte(byte var1) {
      return 0 - this.field2566[++this.field2565 - 1] & 255;
   }

   public void setByte(int var1, int var2) {
      this.field2566[this.field2565 - var1 - 1] = (byte)var1;
   }

   public int getUByte128(int var1) {
      return this.field2566[++this.field2565 - 1] - 128 & 255;
   }

   public void addIntV2(int var1, byte var2) {
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 8);
      this.field2566[++this.field2565 - 1] = (byte)var1;
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 24);
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 16);
   }

   public int getUShortLE(int var1) {
      this.field2565 += 2;
      return ((this.field2566[this.field2565 - 1] & 255) << 8) + (this.field2566[this.field2565 - 2] & 255);
   }

   public int getUSmart(int var1) {
      int var2 = this.field2566[this.field2565] & 255;
      return var2 < 128 ? this.getUByte(-1133572438) : this.getUShort(-1208216487) - '\u8000';
   }

   public byte getReversedByte(int var1) {
      return (byte)(0 - this.field2566[++this.field2565 - 1]);
   }

   public void addIntLE(int var1, byte var2) {
      this.field2566[++this.field2565 - 1] = (byte)var1;
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 8);
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 16);
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 24);
   }

   public void addByte128(int var1, byte var2) {
      this.field2566[++this.field2565 - 1] = (byte)(var1 + 128);
   }

   public void addShort128(int var1, int var2) {
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 8);
      this.field2566[++this.field2565 - 1] = (byte)(var1 + 128);
   }

   public byte get128Byte(byte var1) {
      return (byte)(128 - this.field2566[++this.field2565 - 1]);
   }

   public int method3556(int var1, int var2) {
      byte[] var3 = this.field2566;
      int var4 = this.field2565;
      int var5 = -1;

      for(int var6 = var1; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field2567[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      this.addInt(var5, (byte)84);
      return var5;
   }

   public void setShort(int var1, int var2) {
      this.field2566[this.field2565 - var1 - 2] = (byte)(var1 >> 8);
      this.field2566[this.field2565 - var1 - 1] = (byte)var1;
   }

   public void addShortLE128(int var1, byte var2) {
      this.field2566[++this.field2565 - 1] = (byte)(var1 + 128);
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 8);
   }

   public void addLong(long var1) {
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 56));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 48));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 40));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 32));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 24));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 16));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 8));
      this.field2566[++this.field2565 - 1] = (byte)((int)var1);
   }

   public void addReversedByte(int var1, int var2) {
      this.field2566[++this.field2565 - 1] = (byte)(0 - var1);
   }

   public int getIntV2(int var1) {
      this.field2565 += 4;
      return ((this.field2566[this.field2565 - 2] & 255) << 24) + ((this.field2566[this.field2565 - 4] & 255) << 8) + (this.field2566[this.field2565 - 3] & 255) + ((this.field2566[this.field2565 - 1] & 255) << 16);
   }

   public void addShortLE(int var1, int var2) {
      this.field2566[++this.field2565 - 1] = (byte)var1;
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 8);
   }

   public void addIntV3(int var1, int var2) {
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 16);
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 24);
      this.field2566[++this.field2565 - 1] = (byte)var1;
      this.field2566[++this.field2565 - 1] = (byte)(var1 >> 8);
   }

   public void method3541(BigInteger var1, BigInteger var2, byte var3) {
      int var4 = this.field2565;
      this.field2565 = 0;
      byte[] var5 = new byte[var4];
      this.getBytes(var5, 0, var4, -671028430);
      BigInteger var6 = new BigInteger(var5);
      byte[] var8 = var6.toByteArray();
      this.field2565 = 0;
      this.addShort(var8.length, 2010374933);
      this.addBytes(var8, 0, var8.length, (byte)-18);
   }

   public int getShortLE(int var1) {
      this.field2565 += 2;
      int var2 = ((this.field2566[this.field2565 - 1] & 255) << 8) + (this.field2566[this.field2565 - 2] & 255);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public byte getByte128(int var1) {
      return (byte)(this.field2566[++this.field2565 - 1] - 128);
   }

   public String getSpecialString(int var1) {
      byte var2 = this.field2566[++this.field2565 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.method3536(480710536);
         if (var3 + this.field2565 > this.field2566.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var4 = this.field2566;
            int var5 = this.field2565;
            char[] var6 = new char[var3];
            int var7 = 0;
            int var8 = var5;

            int var9;
            for(int var10 = var3 + var5; var8 < var10; var6[var7++] = (char)var9) {
               int var11 = var4[var8++] & 255;
               if (var11 < 128) {
                  if (var11 == 0) {
                     var9 = 65533;
                  } else {
                     var9 = var11;
                  }
               } else if (var11 < 192) {
                  var9 = 65533;
               } else if (var11 < 224) {
                  if (var8 < var10 && (var4[var8] & 192) == 128) {
                     var9 = (var11 & 31) << 6 | var4[var8++] & 63;
                     if (var9 < 128) {
                        var9 = 65533;
                     }
                  } else {
                     var9 = 65533;
                  }
               } else if (var11 < 240) {
                  if (var8 + 1 < var10 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) {
                     var9 = (var11 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var9 < 2048) {
                        var9 = 65533;
                     }
                  } else {
                     var9 = 65533;
                  }
               } else if (var11 < 248) {
                  if (var8 + 2 < var10 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) {
                     var9 = (var11 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var9 >= 65536 && var9 <= 1114111) {
                        var9 = 65533;
                     } else {
                        var9 = 65533;
                     }
                  } else {
                     var9 = 65533;
                  }
               } else {
                  var9 = 65533;
               }
            }

            String var12 = new String(var6, 0, var7);
            this.field2565 += var3;
            return var12;
         }
      }
   }

   public int getShort128(byte var1) {
      this.field2565 += 2;
      int var2 = (this.field2566[this.field2565 - 1] - 128 & 255) + ((this.field2566[this.field2565 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int getIntLE(int var1) {
      this.field2565 += 4;
      return (this.field2566[this.field2565 - 4] & 255) + ((this.field2566[this.field2565 - 3] & 255) << 8) + ((this.field2566[this.field2565 - 2] & 255) << 16) + ((this.field2566[this.field2565 - 1] & 255) << 24);
   }

   public void setInt(int var1, byte var2) {
      this.field2566[this.field2565 - var1 - 4] = (byte)(var1 >> 24);
      this.field2566[this.field2565 - var1 - 3] = (byte)(var1 >> 16);
      this.field2566[this.field2565 - var1 - 2] = (byte)(var1 >> 8);
      this.field2566[this.field2565 - var1 - 1] = (byte)var1;
   }

   public boolean method3543(int var1) {
      this.field2565 -= 4;
      byte[] var2 = this.field2566;
      int var3 = this.field2565;
      int var4 = -1;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4 = var4 >>> 8 ^ field2567[(var4 ^ var2[var5]) & 255];
      }

      var4 = ~var4;
      var5 = this.getInt(-1817376731);
      return var4 == var5;
   }

   public void method3602(CharSequence var1, byte var2) {
      int var3 = class27.method240(var1, 970232060);
      this.field2566[++this.field2565 - 1] = 0;
      this.method3518(var3, -1793170748);
      int var4 = this.field2565;
      byte[] var5 = this.field2566;
      int var6 = this.field2565;
      int var7 = var1.length();
      int var8 = var6;

      int var9;
      for(var9 = 0; var9 < var7; ++var9) {
         char var10 = var1.charAt(var9);
         if (var10 <= '\u007f') {
            var5[var8++] = (byte)var10;
         } else if (var10 <= '\u07ff') {
            var5[var8++] = (byte)(192 | var10 >> 6);
            var5[var8++] = (byte)(128 | var10 & 63);
         } else {
            var5[var8++] = (byte)(224 | var10 >> 12);
            var5[var8++] = (byte)(128 | var10 >> 6 & 63);
            var5[var8++] = (byte)(128 | var10 & 63);
         }
      }

      var9 = var8 - var6;
      this.field2565 = var9 + var4;
   }

   public void add128Byte(int var1, int var2) {
      this.field2566[++this.field2565 - 1] = (byte)(128 - var1);
   }

   public void add48Int(long var1) {
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 40));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 32));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 24));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 16));
      this.field2566[++this.field2565 - 1] = (byte)((int)(var1 >> 8));
      this.field2566[++this.field2565 - 1] = (byte)((int)var1);
   }

   public void method3537(int[] var1, byte var2) {
      int var3 = this.field2565 / 8;
      this.field2565 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.getInt(-1817376731);
         int var6 = this.getInt(-1817376731);
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
            var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.field2565 -= 8;
         this.addInt(var5, (byte)85);
         this.addInt(var6, (byte)54);
      }

   }

   public void method3539(int[] var1, int var2, int var3, int var4) {
      int var5 = this.field2565;
      this.field2565 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.getInt(-1817376731);
         int var9 = this.getInt(-1817376731);
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
            var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
            var10 += var11;
         }

         this.field2565 -= 8;
         this.addInt(var8, (byte)126);
         this.addInt(var9, (byte)6);
      }

      this.field2565 = var5;
   }

   public void addSmart(int var1, byte var2) {
      if (var1 >= 0 && var1 < 128) {
         this.addByte(var1, (byte)-105);
      } else {
         if (var1 < 0 || var1 >= 32768) {
            throw new IllegalArgumentException();
         }

         this.addShort(var1 + '\u8000', 1687809779);
      }

   }

   public void method3733(int[] var1, byte var2) {
      int var3 = this.field2565 / 8;
      this.field2565 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.getInt(-1817376731);
         int var6 = this.getInt(-1817376731);
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
            var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
            var7 -= var8;
         }

         this.field2565 -= 8;
         this.addInt(var5, (byte)18);
         this.addInt(var6, (byte)47);
      }

   }

   public void getReversedBytes128(byte[] var1, int var2, int var3, int var4) {
      for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
         var1[var5] = (byte)(this.field2566[++this.field2565 - 1] - 128);
      }

   }

   static void method3738(class59 var0, int var1) {
      if (class60.field708 == 1 || !class32.field440 && class60.field708 == 4) {
         int var2 = class90.field1338 + 280;
         if (class60.field711 >= var2 && class60.field711 <= var2 + 14 && class60.field710 >= 4 && class60.field710 <= 18) {
            class195.method3750(0, 0, (byte)82);
            return;
         }

         if (class60.field711 >= var2 + 15 && class60.field711 <= var2 + 80 && class60.field710 >= 4 && class60.field710 <= 18) {
            class195.method3750(0, 1, (byte)82);
            return;
         }

         int var3 = class90.field1338 + 390;
         if (class60.field711 >= var3 && class60.field711 <= var3 + 14 && class60.field710 >= 4 && class60.field710 <= 18) {
            class195.method3750(1, 0, (byte)82);
            return;
         }

         if (class60.field711 >= var3 + 15 && class60.field711 <= var3 + 80 && class60.field710 >= 4 && class60.field710 <= 18) {
            class195.method3750(1, 1, (byte)82);
            return;
         }

         int var4 = class90.field1338 + 500;
         if (class60.field711 >= var4 && class60.field711 <= var4 + 14 && class60.field710 >= 4 && class60.field710 <= 18) {
            class195.method3750(2, 0, (byte)82);
            return;
         }

         if (class60.field711 >= var4 + 15 && class60.field711 <= var4 + 80 && class60.field710 >= 4 && class60.field710 <= 18) {
            class195.method3750(2, 1, (byte)82);
            return;
         }

         int var5 = class90.field1338 + 610;
         if (class60.field711 >= var5 && class60.field711 <= var5 + 14 && class60.field710 >= 4 && class60.field710 <= 18) {
            class195.method3750(3, 0, (byte)82);
            return;
         }

         if (class60.field711 >= var5 + 15 && class60.field711 <= var5 + 80 && class60.field710 >= 4 && class60.field710 <= 18) {
            class195.method3750(3, 1, (byte)82);
            return;
         }

         if (class60.field711 >= class90.field1338 + 708 && class60.field710 >= 4 && class60.field711 <= class90.field1338 + 708 + 50 && class60.field710 <= 20) {
            class90.field1370 = false;
            class317.field3926.method5868(class90.field1338, 0);
            class61.field715.method5868(class90.field1338 + 382, 0);
            class90.field1341.method5842(class90.field1338 + 382 - class90.field1341.field3971 / 2, 18);
            return;
         }

         if (class90.field1372 != -1) {
            class77 var6 = class141.field2058[class90.field1372];
            class80.method1727(var6, -428103561);
            class90.field1370 = false;
            class317.field3926.method5868(class90.field1338, 0);
            class61.field715.method5868(class90.field1338 + 382, 0);
            class90.field1341.method5842(class90.field1338 + 382 - class90.field1341.field3971 / 2, 18);
            return;
         }
      }

   }

   public static void method3581(Applet var0, String var1, byte var2) {
      class57.field652 = var0;
      if (var1 != null) {
         class57.field646 = var1;
      }

   }

   static void method3727(class194 var0, int var1) {
      if (client.field896 != null) {
         var0.addBytes(client.field896, 0, client.field896.length, (byte)1);
      } else {
         byte[] var2 = class33.method378(1218769080);
         var0.addBytes(var2, 0, var2.length, (byte)19);
      }

   }

   static int method3737(int var0, class96 var1, boolean var2, byte var3) {
      if (var0 == 5000) {
         class81.field1272[++class135.field1964 - 1] = client.field1071;
         return 1;
      } else if (var0 == 5001) {
         class135.field1964 -= 3;
         client.field1071 = class81.field1272[class135.field1964];
         class251.field3296 = class68.method1103(class81.field1272[class135.field1964 + 1], 2026232087);
         if (class251.field3296 == null) {
            class251.field3296 = class320.field3930;
         }

         client.field1035 = class81.field1272[class135.field1964 + 2];
         class184 var21 = class141.method3078(class181.field2433, client.field902.field1475, (byte)0);
         var21.field2500.addByte(client.field1071, (byte)-16);
         var21.field2500.addByte(class251.field3296.field3929, (byte)-83);
         var21.field2500.addByte(client.field1035, (byte)-115);
         client.field902.method2036(var21, (byte)60);
         return 1;
      } else {
         String var4;
         int var5;
         int var6;
         if (var0 == 5002) {
            var4 = class81.field1281[--class77.field1233];
            class135.field1964 -= 2;
            var5 = class81.field1272[class135.field1964];
            var6 = class81.field1272[class135.field1964 + 1];
            class184 var13 = class141.method3078(class181.field2462, client.field902.field1475, (byte)-15);
            var13.field2500.addByte(class91.method1916(var4, -1415191388) + 2, (byte)-54);
            var13.field2500.addString1(var4, 797731181);
            var13.field2500.addByte(var5 - 1, (byte)-16);
            var13.field2500.addByte(var6, (byte)-16);
            client.field902.method2036(var13, (byte)69);
            return 1;
         } else {
            int var7;
            class70 var18;
            if (var0 == 5003) {
               class135.field1964 -= 2;
               var7 = class81.field1272[class135.field1964];
               var5 = class81.field1272[class135.field1964 + 1];
               var18 = class2.method1(var7, var5, 697133436);
               if (var18 != null) {
                  class81.field1272[++class135.field1964 - 1] = var18.field811;
                  class81.field1272[++class135.field1964 - 1] = var18.field814;
                  class81.field1281[++class77.field1233 - 1] = var18.field806 != null ? var18.field806 : "";
                  class81.field1281[++class77.field1233 - 1] = var18.field807 != null ? var18.field807 : "";
                  class81.field1281[++class77.field1233 - 1] = var18.field812 != null ? var18.field812 : "";
                  class81.field1272[++class135.field1964 - 1] = var18.method1110(-859249780) ? 1 : (var18.method1113((byte)60) ? 2 : 0);
               } else {
                  class81.field1272[++class135.field1964 - 1] = -1;
                  class81.field1272[++class135.field1964 - 1] = 0;
                  class81.field1281[++class77.field1233 - 1] = "";
                  class81.field1281[++class77.field1233 - 1] = "";
                  class81.field1281[++class77.field1233 - 1] = "";
                  class81.field1272[++class135.field1964 - 1] = 0;
               }

               return 1;
            } else if (var0 == 5004) {
               var7 = class81.field1272[--class135.field1964];
               var18 = class20.method170(var7, (short)-13006);
               if (var18 != null) {
                  class81.field1272[++class135.field1964 - 1] = var18.field805;
                  class81.field1272[++class135.field1964 - 1] = var18.field814;
                  class81.field1281[++class77.field1233 - 1] = var18.field806 != null ? var18.field806 : "";
                  class81.field1281[++class77.field1233 - 1] = var18.field807 != null ? var18.field807 : "";
                  class81.field1281[++class77.field1233 - 1] = var18.field812 != null ? var18.field812 : "";
                  class81.field1272[++class135.field1964 - 1] = var18.method1110(-625927393) ? 1 : (var18.method1113((byte)60) ? 2 : 0);
               } else {
                  class81.field1272[++class135.field1964 - 1] = -1;
                  class81.field1272[++class135.field1964 - 1] = 0;
                  class81.field1281[++class77.field1233 - 1] = "";
                  class81.field1281[++class77.field1233 - 1] = "";
                  class81.field1281[++class77.field1233 - 1] = "";
                  class81.field1272[++class135.field1964 - 1] = 0;
               }

               return 1;
            } else if (var0 == 5005) {
               if (class251.field3296 == null) {
                  class81.field1272[++class135.field1964 - 1] = -1;
               } else {
                  class81.field1272[++class135.field1964 - 1] = class251.field3296.field3929;
               }

               return 1;
            } else if (var0 == 5008) {
               var4 = class81.field1281[--class77.field1233];
               var5 = class81.field1272[--class135.field1964];
               String var15 = var4.toLowerCase();
               byte var17 = 0;
               if (var15.startsWith("yellow:")) {
                  var17 = 0;
                  var4 = var4.substring("yellow:".length());
               } else if (var15.startsWith("red:")) {
                  var17 = 1;
                  var4 = var4.substring("red:".length());
               } else if (var15.startsWith("green:")) {
                  var17 = 2;
                  var4 = var4.substring("green:".length());
               } else if (var15.startsWith("cyan:")) {
                  var17 = 3;
                  var4 = var4.substring("cyan:".length());
               } else if (var15.startsWith("purple:")) {
                  var17 = 4;
                  var4 = var4.substring("purple:".length());
               } else if (var15.startsWith("white:")) {
                  var17 = 5;
                  var4 = var4.substring("white:".length());
               } else if (var15.startsWith("flash1:")) {
                  var17 = 6;
                  var4 = var4.substring("flash1:".length());
               } else if (var15.startsWith("flash2:")) {
                  var17 = 7;
                  var4 = var4.substring("flash2:".length());
               } else if (var15.startsWith("flash3:")) {
                  var17 = 8;
                  var4 = var4.substring("flash3:".length());
               } else if (var15.startsWith("glow1:")) {
                  var17 = 9;
                  var4 = var4.substring("glow1:".length());
               } else if (var15.startsWith("glow2:")) {
                  var17 = 10;
                  var4 = var4.substring("glow2:".length());
               } else if (var15.startsWith("glow3:")) {
                  var17 = 11;
                  var4 = var4.substring("glow3:".length());
               } else if (client.field863 != 0) {
                  if (var15.startsWith("yellow:")) {
                     var17 = 0;
                     var4 = var4.substring("yellow:".length());
                  } else if (var15.startsWith("red:")) {
                     var17 = 1;
                     var4 = var4.substring("red:".length());
                  } else if (var15.startsWith("green:")) {
                     var17 = 2;
                     var4 = var4.substring("green:".length());
                  } else if (var15.startsWith("cyan:")) {
                     var17 = 3;
                     var4 = var4.substring("cyan:".length());
                  } else if (var15.startsWith("purple:")) {
                     var17 = 4;
                     var4 = var4.substring("purple:".length());
                  } else if (var15.startsWith("white:")) {
                     var17 = 5;
                     var4 = var4.substring("white:".length());
                  } else if (var15.startsWith("flash1:")) {
                     var17 = 6;
                     var4 = var4.substring("flash1:".length());
                  } else if (var15.startsWith("flash2:")) {
                     var17 = 7;
                     var4 = var4.substring("flash2:".length());
                  } else if (var15.startsWith("flash3:")) {
                     var17 = 8;
                     var4 = var4.substring("flash3:".length());
                  } else if (var15.startsWith("glow1:")) {
                     var17 = 9;
                     var4 = var4.substring("glow1:".length());
                  } else if (var15.startsWith("glow2:")) {
                     var17 = 10;
                     var4 = var4.substring("glow2:".length());
                  } else if (var15.startsWith("glow3:")) {
                     var17 = 11;
                     var4 = var4.substring("glow3:".length());
                  }
               }

               var15 = var4.toLowerCase();
               byte var20 = 0;
               if (var15.startsWith("wave:")) {
                  var20 = 1;
                  var4 = var4.substring("wave:".length());
               } else if (var15.startsWith("wave2:")) {
                  var20 = 2;
                  var4 = var4.substring("wave2:".length());
               } else if (var15.startsWith("shake:")) {
                  var20 = 3;
                  var4 = var4.substring("shake:".length());
               } else if (var15.startsWith("scroll:")) {
                  var20 = 4;
                  var4 = var4.substring("scroll:".length());
               } else if (var15.startsWith("slide:")) {
                  var20 = 5;
                  var4 = var4.substring("slide:".length());
               } else if (client.field863 != 0) {
                  if (var15.startsWith("wave:")) {
                     var20 = 1;
                     var4 = var4.substring("wave:".length());
                  } else if (var15.startsWith("wave2:")) {
                     var20 = 2;
                     var4 = var4.substring("wave2:".length());
                  } else if (var15.startsWith("shake:")) {
                     var20 = 3;
                     var4 = var4.substring("shake:".length());
                  } else if (var15.startsWith("scroll:")) {
                     var20 = 4;
                     var4 = var4.substring("scroll:".length());
                  } else if (var15.startsWith("slide:")) {
                     var20 = 5;
                     var4 = var4.substring("slide:".length());
                  }
               }

               class184 var11 = class141.method3078(class181.field2449, client.field902.field1475, (byte)-58);
               var11.field2500.addByte(0, (byte)-33);
               int var12 = var11.field2500.field2565;
               var11.field2500.addByte(var5, (byte)-34);
               var11.field2500.addByte(var17, (byte)-90);
               var11.field2500.addByte(var20, (byte)-83);
               class283.method5113(var11.field2500, var4, -299280627);
               var11.field2500.setByte(var11.field2500.field2565 - var12, 1227920196);
               client.field902.method2036(var11, (byte)21);
               return 1;
            } else {
               int var8;
               if (var0 == 5009) {
                  class77.field1233 -= 2;
                  var4 = class81.field1281[class77.field1233];
                  String var16 = class81.field1281[class77.field1233 + 1];
                  class184 var19 = class141.method3078(class181.field2440, client.field902.field1475, (byte)-109);
                  var19.field2500.addShort(0, 867594139);
                  var8 = var19.field2500.field2565;
                  var19.field2500.addString1(var4, -1597407104);
                  class283.method5113(var19.field2500, var16, -812239165);
                  var19.field2500.setShort(var19.field2500.field2565 - var8, 510241681);
                  client.field902.method2036(var19, (byte)47);
                  return 1;
               } else if (var0 != 5015) {
                  if (var0 == 5016) {
                     class81.field1272[++class135.field1964 - 1] = client.field1035;
                     return 1;
                  } else if (var0 == 5017) {
                     var7 = class81.field1272[--class135.field1964];
                     class81.field1272[++class135.field1964 - 1] = class57.method858(var7, (byte)20);
                     return 1;
                  } else if (var0 == 5018) {
                     var7 = class81.field1272[--class135.field1964];
                     int[] var14 = class81.field1272;
                     var6 = ++class135.field1964 - 1;
                     class70 var10 = (class70)class95.field1432.method3907((long)var7);
                     if (var10 == null) {
                        var8 = -1;
                     } else if (var10.field2648 == class95.field1434.field2666) {
                        var8 = -1;
                     } else {
                        var8 = ((class70)var10.field2648).field811;
                     }

                     var14[var6] = var8;
                     return 1;
                  } else if (var0 == 5019) {
                     var7 = class81.field1272[--class135.field1964];
                     class81.field1272[++class135.field1964 - 1] = class146.method3098(var7, -1322308763);
                     return 1;
                  } else if (var0 == 5020) {
                     var4 = class81.field1281[--class77.field1233];
                     if (var4.equalsIgnoreCase("toggleroof")) {
                        class46.field564.field1236 = !class46.field564.field1236;
                        class46.method694(1489032378);
                        if (class46.field564.field1236) {
                           class189.method3483(99, "", "Roofs are now all hidden", (byte)83);
                        } else {
                           class189.method3483(99, "", "Roofs will only be removed selectively", (byte)14);
                        }
                     }

                     if (var4.equalsIgnoreCase("displayfps")) {
                        client.field922 = !client.field922;
                     }

                     if (var4.equalsIgnoreCase("renderself")) {
                        client.field974 = !client.field974;
                     }

                     if (var4.equalsIgnoreCase("mouseovertext")) {
                        client.field912 = !client.field912;
                     }

                     if (client.field1023 >= 2) {
                        if (var4.equalsIgnoreCase("aabb")) {
                           if (!class7.field228) {
                              class7.field228 = true;
                              class7.field230 = class11.field252;
                           } else if (class11.field252 == class7.field230) {
                              class7.field228 = true;
                              class7.field230 = class11.field254;
                           } else {
                              class7.field228 = false;
                           }
                        }

                        if (var4.equalsIgnoreCase("showcoord")) {
                           class63.field742.field4054 = !class63.field742.field4054;
                        }

                        if (var4.equalsIgnoreCase("fpson")) {
                           client.field922 = true;
                        }

                        if (var4.equalsIgnoreCase("fpsoff")) {
                           client.field922 = false;
                        }

                        if (var4.equalsIgnoreCase("gc")) {
                           System.gc();
                        }

                        if (var4.equalsIgnoreCase("clientdrop")) {
                           class150.method3132(1610841482);
                        }

                        if (var4.equalsIgnoreCase("cs")) {
                           class189.method3483(99, "", "" + client.field905, (byte)71);
                        }

                        if (var4.equalsIgnoreCase("errortest") && client.field955 == 2) {
                           throw new RuntimeException();
                        }
                     }

                     class184 var9 = class141.method3078(class181.field2383, client.field902.field1475, (byte)-48);
                     var9.field2500.addByte(var4.length() + 1, (byte)-88);
                     var9.field2500.addString1(var4, -1932311436);
                     client.field902.method2036(var9, (byte)70);
                     return 1;
                  } else if (var0 == 5021) {
                     client.field869 = class81.field1281[--class77.field1233].toLowerCase().trim();
                     return 1;
                  } else if (var0 == 5022) {
                     class81.field1281[++class77.field1233 - 1] = client.field869;
                     return 1;
                  } else {
                     return 2;
                  }
               } else {
                  if (class12.field259 != null && class12.field259.field823 != null) {
                     var4 = class12.field259.field823.method5436(-1363932942);
                  } else {
                     var4 = "";
                  }

                  class81.field1281[++class77.field1233 - 1] = var4;
                  return 1;
               }
            }
         }
      }
   }

   static {
      int var0;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = var1;

         for(var0 = 0; var0 < 8; ++var0) {
            if ((var2 & 1) == 1) {
               var2 = var2 >>> 1 ^ -306674912;
            } else {
               var2 >>>= 1;
            }
         }

         field2567[var1] = var2;
      }

      field2570 = new long[256];

      for(var0 = 0; var0 < 256; ++var0) {
         long var4 = (long)var0;

         for(int var3 = 0; var3 < 8; ++var3) {
            if (1L == (var4 & 1L)) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field2570[var0] = var4;
      }

   }
}

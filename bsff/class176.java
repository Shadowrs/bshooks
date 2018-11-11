public class class176 {
   int field2268;
   int field2266 = 0;
   public int[][] field2270;
   int field2269;
   int field2267 = 0;

   public class176(int var1, int var2) {
      this.field2268 = var1;
      this.field2269 = var2;
      this.field2270 = new int[this.field2268][this.field2269];
      this.method3368((byte)-9);
   }

   void method3367(int var1, int var2, int var3, byte var4) {
      this.field2270[var1][var2] &= ~var3;
   }

   void method3401(int var1, int var2, int var3, int var4) {
      this.field2270[var1][var2] |= var3;
   }

   public void method3368(byte var1) {
      for(int var2 = 0; var2 < this.field2268; ++var2) {
         for(int var3 = 0; var3 < this.field2269; ++var3) {
            if (var2 != 0 && var3 != 0 && var2 < this.field2268 - 5 && var3 < this.field2269 - 5) {
               this.field2270[var2][var3] = 16777216;
            } else {
               this.field2270[var2][var3] = 16777215;
            }
         }
      }

   }

   public void method3374(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      var1 -= this.field2266;
      var2 -= this.field2267;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3367(var1, var2, 128, (byte)43);
            this.method3367(var1 - 1, var2, 8, (byte)57);
         }

         if (var4 == 1) {
            this.method3367(var1, var2, 2, (byte)119);
            this.method3367(var1, var2 + 1, 32, (byte)74);
         }

         if (var4 == 2) {
            this.method3367(var1, var2, 8, (byte)72);
            this.method3367(var1 + 1, var2, 128, (byte)54);
         }

         if (var4 == 3) {
            this.method3367(var1, var2, 32, (byte)29);
            this.method3367(var1, var2 - 1, 2, (byte)14);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3367(var1, var2, 1, (byte)29);
            this.method3367(var1 - 1, var2 + 1, 16, (byte)30);
         }

         if (var4 == 1) {
            this.method3367(var1, var2, 4, (byte)78);
            this.method3367(var1 + 1, var2 + 1, 64, (byte)113);
         }

         if (var4 == 2) {
            this.method3367(var1, var2, 16, (byte)104);
            this.method3367(var1 + 1, var2 - 1, 1, (byte)72);
         }

         if (var4 == 3) {
            this.method3367(var1, var2, 64, (byte)77);
            this.method3367(var1 - 1, var2 - 1, 4, (byte)23);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3367(var1, var2, 130, (byte)126);
            this.method3367(var1 - 1, var2, 8, (byte)33);
            this.method3367(var1, var2 + 1, 32, (byte)80);
         }

         if (var4 == 1) {
            this.method3367(var1, var2, 10, (byte)28);
            this.method3367(var1, var2 + 1, 32, (byte)14);
            this.method3367(var1 + 1, var2, 128, (byte)86);
         }

         if (var4 == 2) {
            this.method3367(var1, var2, 40, (byte)51);
            this.method3367(var1 + 1, var2, 128, (byte)92);
            this.method3367(var1, var2 - 1, 2, (byte)18);
         }

         if (var4 == 3) {
            this.method3367(var1, var2, 160, (byte)125);
            this.method3367(var1, var2 - 1, 2, (byte)10);
            this.method3367(var1 - 1, var2, 8, (byte)53);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3367(var1, var2, 65536, (byte)31);
               this.method3367(var1 - 1, var2, 4096, (byte)109);
            }

            if (var4 == 1) {
               this.method3367(var1, var2, 1024, (byte)97);
               this.method3367(var1, var2 + 1, 16384, (byte)99);
            }

            if (var4 == 2) {
               this.method3367(var1, var2, 4096, (byte)90);
               this.method3367(var1 + 1, var2, 65536, (byte)87);
            }

            if (var4 == 3) {
               this.method3367(var1, var2, 16384, (byte)44);
               this.method3367(var1, var2 - 1, 1024, (byte)84);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3367(var1, var2, 512, (byte)12);
               this.method3367(var1 - 1, var2 + 1, 8192, (byte)74);
            }

            if (var4 == 1) {
               this.method3367(var1, var2, 2048, (byte)105);
               this.method3367(var1 + 1, var2 + 1, 32768, (byte)120);
            }

            if (var4 == 2) {
               this.method3367(var1, var2, 8192, (byte)46);
               this.method3367(var1 + 1, var2 - 1, 512, (byte)31);
            }

            if (var4 == 3) {
               this.method3367(var1, var2, 32768, (byte)52);
               this.method3367(var1 - 1, var2 - 1, 2048, (byte)24);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3367(var1, var2, 66560, (byte)9);
               this.method3367(var1 - 1, var2, 4096, (byte)26);
               this.method3367(var1, var2 + 1, 16384, (byte)105);
            }

            if (var4 == 1) {
               this.method3367(var1, var2, 5120, (byte)34);
               this.method3367(var1, var2 + 1, 16384, (byte)12);
               this.method3367(var1 + 1, var2, 65536, (byte)33);
            }

            if (var4 == 2) {
               this.method3367(var1, var2, 20480, (byte)20);
               this.method3367(var1 + 1, var2, 65536, (byte)125);
               this.method3367(var1, var2 - 1, 1024, (byte)77);
            }

            if (var4 == 3) {
               this.method3367(var1, var2, 81920, (byte)63);
               this.method3367(var1, var2 - 1, 1024, (byte)43);
               this.method3367(var1 - 1, var2, 4096, (byte)123);
            }
         }
      }

   }

   public void method3376(int var1, int var2, int var3) {
      var1 -= this.field2266;
      var2 -= this.field2267;
      this.field2270[var1][var2] &= -262145;
   }

   public void method3375(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      int var8 = 256;
      if (var6) {
         var8 += 131072;
      }

      var1 -= this.field2266;
      var2 -= this.field2267;
      int var9;
      if (var5 == 1 || var5 == 3) {
         var9 = var3;
         var3 = var4;
         var4 = var9;
      }

      for(var9 = var1; var9 < var3 + var1; ++var9) {
         if (var9 >= 0 && var9 < this.field2268) {
            for(int var10 = var2; var10 < var2 + var4; ++var10) {
               if (var10 >= 0 && var10 < this.field2269) {
                  this.method3367(var9, var10, var8, (byte)56);
               }
            }
         }
      }

   }

   public void method3371(int var1, int var2, int var3) {
      var1 -= this.field2266;
      var2 -= this.field2267;
      this.field2270[var1][var2] |= 2097152;
   }

   public void method3399(int var1, int var2, int var3) {
      var1 -= this.field2266;
      var2 -= this.field2267;
      this.field2270[var1][var2] |= 262144;
   }

   public void method3369(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      int var7 = 256;
      if (var5) {
         var7 += 131072;
      }

      var1 -= this.field2266;
      var2 -= this.field2267;

      for(int var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.field2268) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.field2269) {
                  this.method3401(var8, var9, var7, 36511393);
               }
            }
         }
      }

   }

   public void method3385(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      var1 -= this.field2266;
      var2 -= this.field2267;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3401(var1, var2, 128, 2003071124);
            this.method3401(var1 - 1, var2, 8, 9757612);
         }

         if (var4 == 1) {
            this.method3401(var1, var2, 2, 1564675280);
            this.method3401(var1, var2 + 1, 32, 2061707917);
         }

         if (var4 == 2) {
            this.method3401(var1, var2, 8, 1175911552);
            this.method3401(var1 + 1, var2, 128, 886248336);
         }

         if (var4 == 3) {
            this.method3401(var1, var2, 32, -1862362418);
            this.method3401(var1, var2 - 1, 2, 1367714351);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3401(var1, var2, 1, -1723307718);
            this.method3401(var1 - 1, var2 + 1, 16, 1765475523);
         }

         if (var4 == 1) {
            this.method3401(var1, var2, 4, 1900740583);
            this.method3401(var1 + 1, var2 + 1, 64, -112790193);
         }

         if (var4 == 2) {
            this.method3401(var1, var2, 16, -357977361);
            this.method3401(var1 + 1, var2 - 1, 1, -1263667370);
         }

         if (var4 == 3) {
            this.method3401(var1, var2, 64, 905723057);
            this.method3401(var1 - 1, var2 - 1, 4, -1433326937);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3401(var1, var2, 130, 719633696);
            this.method3401(var1 - 1, var2, 8, -1322439891);
            this.method3401(var1, var2 + 1, 32, 1292131861);
         }

         if (var4 == 1) {
            this.method3401(var1, var2, 10, -627272256);
            this.method3401(var1, var2 + 1, 32, 1458826394);
            this.method3401(var1 + 1, var2, 128, -389281287);
         }

         if (var4 == 2) {
            this.method3401(var1, var2, 40, 1063958342);
            this.method3401(var1 + 1, var2, 128, -1927644936);
            this.method3401(var1, var2 - 1, 2, 1662189949);
         }

         if (var4 == 3) {
            this.method3401(var1, var2, 160, 1526567229);
            this.method3401(var1, var2 - 1, 2, 607149005);
            this.method3401(var1 - 1, var2, 8, 548345718);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3401(var1, var2, 65536, -1657720521);
               this.method3401(var1 - 1, var2, 4096, 308608077);
            }

            if (var4 == 1) {
               this.method3401(var1, var2, 1024, -108406400);
               this.method3401(var1, var2 + 1, 16384, -387776713);
            }

            if (var4 == 2) {
               this.method3401(var1, var2, 4096, -36929403);
               this.method3401(var1 + 1, var2, 65536, -1605259703);
            }

            if (var4 == 3) {
               this.method3401(var1, var2, 16384, -506056059);
               this.method3401(var1, var2 - 1, 1024, -1791782140);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3401(var1, var2, 512, -752984713);
               this.method3401(var1 - 1, var2 + 1, 8192, -804365275);
            }

            if (var4 == 1) {
               this.method3401(var1, var2, 2048, -2034559148);
               this.method3401(var1 + 1, var2 + 1, 32768, -1310010248);
            }

            if (var4 == 2) {
               this.method3401(var1, var2, 8192, -947816085);
               this.method3401(var1 + 1, var2 - 1, 512, 19625636);
            }

            if (var4 == 3) {
               this.method3401(var1, var2, 32768, -909221711);
               this.method3401(var1 - 1, var2 - 1, 2048, 2087087613);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3401(var1, var2, 66560, 2029576976);
               this.method3401(var1 - 1, var2, 4096, 1424806999);
               this.method3401(var1, var2 + 1, 16384, 1865730484);
            }

            if (var4 == 1) {
               this.method3401(var1, var2, 5120, -780796721);
               this.method3401(var1, var2 + 1, 16384, -1396678557);
               this.method3401(var1 + 1, var2, 65536, 939695009);
            }

            if (var4 == 2) {
               this.method3401(var1, var2, 20480, -1818367548);
               this.method3401(var1 + 1, var2, 65536, 695769847);
               this.method3401(var1, var2 - 1, 1024, -1630664524);
            }

            if (var4 == 3) {
               this.method3401(var1, var2, 81920, -826970955);
               this.method3401(var1, var2 - 1, 1024, -2080018794);
               this.method3401(var1 - 1, var2, 4096, 1658956111);
            }
         }
      }

   }

   public static String method3392(byte[] var0, int var1, int var2, byte var3) {
      char[] var4 = new char[var2];
      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var0[var6 + var1] & 255;
         if (var7 != 0) {
            if (var7 >= 128 && var7 < 160) {
               char var8 = class314.field3912[var7 - 128];
               if (var8 == 0) {
                  var8 = '?';
               }

               var7 = var8;
            }

            var4[var5++] = (char)var7;
         }
      }

      return new String(var4, 0, var5);
   }
}

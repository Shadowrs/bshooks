public class class131 extends class139 {
   static boolean[] field1902 = new boolean[4700];
   static int[] field1889 = new int[1600];
   static int[] field1905;
   static class131 field1869 = new class131();
   static byte[] field1844 = new byte[1];
   static class131 field1861 = new class131();
   static int field1899;
   static byte[] field1891 = new byte[1];
   static int[] field1906;
   static int field1900;
   static int field1901;
   static int[] field1887 = new int[4700];
   static boolean[] field1880 = new boolean[4700];
   static int[] field1903 = new int[12];
   static int[] field1895 = new int[12];
   static int[] field1882 = new int[4700];
   static int[][] field1890 = new int[1600][512];
   static int[] field1865 = new int[4700];
   static int[] field1896 = new int[10];
   static int[] field1904 = new int[4700];
   static int[] field1884 = new int[4700];
   static int[] field1886 = new int[4700];
   static int[] field1897 = new int[10];
   static int[] field1854;
   static int[] field1867 = new int[10];
   static int[][] field1841 = new int[12][2000];
   static int[] field1842 = new int[2000];
   static int[] field1894 = new int[2000];
   static int[] field1851;
   static boolean field1881 = true;
   int field1871;
   public int field1876 = -1;
   int field1868;
   int[][] field1908;
   int field1845 = 0;
   public int field1873;
   int[] field1898;
   int field1849 = 0;
   int field1907;
   int[] field1846;
   int[] field1848;
   int[] field1864;
   int[][] field1856;
   int[] field1852;
   byte field1860 = 0;
   int field1866;
   int field1892 = 0;
   int[] field1843;
   byte[] field1857;
   public int field1874;
   int[] field1853;
   byte[] field1870;
   int[] field1855;
   public int field1877 = -1;
   public boolean field1850 = false;
   int[] field1885;
   public int field1875;
   int field1872;
   public int field1878 = -1;
   short[] field1859;
   byte[] field1858;
   int[] field1862;
   int[] field1863;
   int[] field1883;

   class131() {
   }

   public class131(class131[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.field1845 = 0;
      this.field1849 = 0;
      this.field1892 = 0;
      this.field1860 = -1;

      int var7;
      class131 var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            this.field1845 += var8.field1845;
            this.field1849 += var8.field1849;
            this.field1892 += var8.field1892;
            if (var8.field1870 != null) {
               var3 = true;
            } else {
               if (this.field1860 == -1) {
                  this.field1860 = var8.field1860;
               }

               if (this.field1860 != var8.field1860) {
                  var3 = true;
               }
            }

            var4 |= var8.field1857 != null;
            var5 |= var8.field1859 != null;
            var6 |= var8.field1858 != null;
         }
      }

      this.field1846 = new int[this.field1845];
      this.field1843 = new int[this.field1845];
      this.field1848 = new int[this.field1845];
      this.field1898 = new int[this.field1849];
      this.field1864 = new int[this.field1849];
      this.field1852 = new int[this.field1849];
      this.field1853 = new int[this.field1849];
      this.field1885 = new int[this.field1849];
      this.field1855 = new int[this.field1849];
      if (var3) {
         this.field1870 = new byte[this.field1849];
      }

      if (var4) {
         this.field1857 = new byte[this.field1849];
      }

      if (var5) {
         this.field1859 = new short[this.field1849];
      }

      if (var6) {
         this.field1858 = new byte[this.field1849];
      }

      if (this.field1892 > 0) {
         this.field1862 = new int[this.field1892];
         this.field1863 = new int[this.field1892];
         this.field1883 = new int[this.field1892];
      }

      this.field1845 = 0;
      this.field1849 = 0;
      this.field1892 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.field1849; ++var9) {
               this.field1898[this.field1849] = this.field1845 + var8.field1898[var9];
               this.field1864[this.field1849] = this.field1845 + var8.field1864[var9];
               this.field1852[this.field1849] = this.field1845 + var8.field1852[var9];
               this.field1853[this.field1849] = var8.field1853[var9];
               this.field1885[this.field1849] = var8.field1885[var9];
               this.field1855[this.field1849] = var8.field1855[var9];
               if (var3) {
                  if (var8.field1870 != null) {
                     this.field1870[this.field1849] = var8.field1870[var9];
                  } else {
                     this.field1870[this.field1849] = var8.field1860;
                  }
               }

               if (var4 && var8.field1857 != null) {
                  this.field1857[this.field1849] = var8.field1857[var9];
               }

               if (var5) {
                  if (var8.field1859 != null) {
                     this.field1859[this.field1849] = var8.field1859[var9];
                  } else {
                     this.field1859[this.field1849] = -1;
                  }
               }

               if (var6) {
                  if (var8.field1858 != null && var8.field1858[var9] != -1) {
                     this.field1858[this.field1849] = (byte)(this.field1892 + var8.field1858[var9]);
                  } else {
                     this.field1858[this.field1849] = -1;
                  }
               }

               ++this.field1849;
            }

            for(var9 = 0; var9 < var8.field1892; ++var9) {
               this.field1862[this.field1892] = this.field1845 + var8.field1862[var9];
               this.field1863[this.field1892] = this.field1845 + var8.field1863[var9];
               this.field1883[this.field1892] = this.field1845 + var8.field1883[var9];
               ++this.field1892;
            }

            for(var9 = 0; var9 < var8.field1845; ++var9) {
               this.field1846[this.field1845] = var8.field1846[var9];
               this.field1843[this.field1845] = var8.field1843[var9];
               this.field1848[this.field1845] = var8.field1848[var9];
               ++this.field1845;
            }
         }
      }

   }

   public void method2687() {
      if (this.field1868 != 1) {
         this.field1868 = 1;
         super.field2042 = 0;
         this.field1866 = 0;
         this.field1907 = 0;

         for(int var1 = 0; var1 < this.field1845; ++var1) {
            int var2 = this.field1846[var1];
            int var3 = this.field1843[var1];
            int var4 = this.field1848[var1];
            if (-var3 > super.field2042) {
               super.field2042 = -var3;
            }

            if (var3 > this.field1866) {
               this.field1866 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1907) {
               this.field1907 = var5;
            }
         }

         this.field1907 = (int)(Math.sqrt((double)this.field1907) + 0.99D);
         this.field1872 = (int)(Math.sqrt((double)(this.field1907 * this.field1907 + super.field2042 * super.field2042)) + 0.99D);
         this.field1871 = this.field1872 + (int)(Math.sqrt((double)(this.field1907 * this.field1907 + this.field1866 * this.field1866)) + 0.99D);
      }

   }

   public void method2759(class142 var1, int var2) {
      if (this.field1908 != null && var2 != -1) {
         class129 var3 = var1.field2063[var2];
         class136 var4 = var3.field1814;
         field1899 = 0;
         field1900 = 0;
         field1901 = 0;

         for(int var5 = 0; var5 < var3.field1806; ++var5) {
            int var6 = var3.field1811[var5];
            this.method2693(var4.field1975[var6], var4.field1971[var6], var3.field1812[var5], var3.field1809[var5], var3.field1810[var5]);
         }

         this.method2696();
      }

   }

   void method2696() {
      this.field1868 = 0;
      this.field1876 = -1;
   }

   final void method2765(int var1) {
      int var2 = class134.field1942;
      int var3 = class134.field1943;
      int var4 = 0;
      int var5 = this.field1898[var1];
      int var6 = this.field1864[var1];
      int var7 = this.field1852[var1];
      int var8 = field1887[var5];
      int var9 = field1887[var6];
      int var10 = field1887[var7];
      if (this.field1857 == null) {
         class134.field1934 = 0;
      } else {
         class134.field1934 = this.field1857[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field1896[var4] = field1882[var5];
         field1897[var4] = field1865[var5];
         field1867[var4++] = this.field1853[var1];
      } else {
         var11 = field1904[var5];
         var12 = field1886[var5];
         var13 = this.field1853[var1];
         if (var10 >= 50) {
            var14 = field1854[var10 - var8] * (50 - var8);
            field1896[var4] = var2 + class134.field1941 * (var11 + ((field1904[var7] - var11) * var14 >> 16)) / 50;
            field1897[var4] = var3 + class134.field1941 * (var12 + ((field1886[var7] - var12) * var14 >> 16)) / 50;
            field1867[var4++] = var13 + ((this.field1855[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = field1854[var9 - var8] * (50 - var8);
            field1896[var4] = var2 + class134.field1941 * (var11 + ((field1904[var6] - var11) * var14 >> 16)) / 50;
            field1897[var4] = var3 + class134.field1941 * (var12 + ((field1886[var6] - var12) * var14 >> 16)) / 50;
            field1867[var4++] = var13 + ((this.field1885[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field1896[var4] = field1882[var6];
         field1897[var4] = field1865[var6];
         field1867[var4++] = this.field1885[var1];
      } else {
         var11 = field1904[var6];
         var12 = field1886[var6];
         var13 = this.field1885[var1];
         if (var8 >= 50) {
            var14 = field1854[var8 - var9] * (50 - var9);
            field1896[var4] = var2 + class134.field1941 * (var11 + ((field1904[var5] - var11) * var14 >> 16)) / 50;
            field1897[var4] = var3 + class134.field1941 * (var12 + ((field1886[var5] - var12) * var14 >> 16)) / 50;
            field1867[var4++] = var13 + ((this.field1853[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = field1854[var10 - var9] * (50 - var9);
            field1896[var4] = var2 + class134.field1941 * (var11 + ((field1904[var7] - var11) * var14 >> 16)) / 50;
            field1897[var4] = var3 + class134.field1941 * (var12 + ((field1886[var7] - var12) * var14 >> 16)) / 50;
            field1867[var4++] = var13 + ((this.field1855[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field1896[var4] = field1882[var7];
         field1897[var4] = field1865[var7];
         field1867[var4++] = this.field1855[var1];
      } else {
         var11 = field1904[var7];
         var12 = field1886[var7];
         var13 = this.field1855[var1];
         if (var9 >= 50) {
            var14 = field1854[var9 - var10] * (50 - var10);
            field1896[var4] = var2 + class134.field1941 * (var11 + ((field1904[var6] - var11) * var14 >> 16)) / 50;
            field1897[var4] = var3 + class134.field1941 * (var12 + ((field1886[var6] - var12) * var14 >> 16)) / 50;
            field1867[var4++] = var13 + ((this.field1885[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = field1854[var8 - var10] * (50 - var10);
            field1896[var4] = var2 + class134.field1941 * (var11 + ((field1904[var5] - var11) * var14 >> 16)) / 50;
            field1897[var4] = var3 + class134.field1941 * (var12 + ((field1886[var5] - var12) * var14 >> 16)) / 50;
            field1867[var4++] = var13 + ((this.field1853[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field1896[0];
      var12 = field1896[1];
      var13 = field1896[2];
      var14 = field1897[0];
      int var15 = field1897[1];
      int var16 = field1897[2];
      class134.field1940 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class134.field1948 || var12 > class134.field1948 || var13 > class134.field1948) {
            class134.field1940 = true;
         }

         if (this.field1859 != null && this.field1859[var1] != -1) {
            if (this.field1858 != null && this.field1858[var1] != -1) {
               var17 = this.field1858[var1] & 255;
               var18 = this.field1862[var17];
               var19 = this.field1863[var17];
               var20 = this.field1883[var17];
            } else {
               var18 = var5;
               var19 = var6;
               var20 = var7;
            }

            if (this.field1855[var1] == -1) {
               class134.method2844(var14, var15, var16, var11, var12, var13, this.field1853[var1], this.field1853[var1], this.field1853[var1], field1904[var18], field1904[var19], field1904[var20], field1886[var18], field1886[var19], field1886[var20], field1887[var18], field1887[var19], field1887[var20], this.field1859[var1]);
            } else {
               class134.method2844(var14, var15, var16, var11, var12, var13, field1867[0], field1867[1], field1867[2], field1904[var18], field1904[var19], field1904[var20], field1886[var18], field1886[var19], field1886[var20], field1887[var18], field1887[var19], field1887[var20], this.field1859[var1]);
            }
         } else if (this.field1855[var1] == -1) {
            class134.method2803(var14, var15, var16, var11, var12, var13, field1851[this.field1853[var1]]);
         } else {
            class134.method2801(var14, var15, var16, var11, var12, var13, field1867[0], field1867[1], field1867[2]);
         }
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class134.field1948 || var12 > class134.field1948 || var13 > class134.field1948 || field1896[3] < 0 || field1896[3] > class134.field1948) {
            class134.field1940 = true;
         }

         if (this.field1859 != null && this.field1859[var1] != -1) {
            if (this.field1858 != null && this.field1858[var1] != -1) {
               var17 = this.field1858[var1] & 255;
               var18 = this.field1862[var17];
               var19 = this.field1863[var17];
               var20 = this.field1883[var17];
            } else {
               var18 = var5;
               var19 = var6;
               var20 = var7;
            }

            short var21 = this.field1859[var1];
            if (this.field1855[var1] == -1) {
               class134.method2844(var14, var15, var16, var11, var12, var13, this.field1853[var1], this.field1853[var1], this.field1853[var1], field1904[var18], field1904[var19], field1904[var20], field1886[var18], field1886[var19], field1886[var20], field1887[var18], field1887[var19], field1887[var20], var21);
               class134.method2844(var14, var16, field1897[3], var11, var13, field1896[3], this.field1853[var1], this.field1853[var1], this.field1853[var1], field1904[var18], field1904[var19], field1904[var20], field1886[var18], field1886[var19], field1886[var20], field1887[var18], field1887[var19], field1887[var20], var21);
            } else {
               class134.method2844(var14, var15, var16, var11, var12, var13, field1867[0], field1867[1], field1867[2], field1904[var18], field1904[var19], field1904[var20], field1886[var18], field1886[var19], field1886[var20], field1887[var18], field1887[var19], field1887[var20], var21);
               class134.method2844(var14, var16, field1897[3], var11, var13, field1896[3], field1867[0], field1867[2], field1867[3], field1904[var18], field1904[var19], field1904[var20], field1886[var18], field1886[var19], field1886[var20], field1887[var18], field1887[var19], field1887[var20], var21);
            }
         } else if (this.field1855[var1] == -1) {
            var18 = field1851[this.field1853[var1]];
            class134.method2803(var14, var15, var16, var11, var12, var13, var18);
            class134.method2803(var14, var16, field1897[3], var11, var13, field1896[3], var18);
         } else {
            class134.method2801(var14, var15, var16, var11, var12, var13, field1867[0], field1867[1], field1867[2]);
            class134.method2801(var14, var16, field1897[3], var11, var13, field1896[3], field1867[0], field1867[2], field1867[3]);
         }
      }

   }

   class131 method2685(boolean var1, class131 var2, byte[] var3) {
      var2.field1845 = this.field1845;
      var2.field1849 = this.field1849;
      var2.field1892 = this.field1892;
      if (var2.field1846 == null || var2.field1846.length < this.field1845) {
         var2.field1846 = new int[this.field1845 + 100];
         var2.field1843 = new int[this.field1845 + 100];
         var2.field1848 = new int[this.field1845 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field1845; ++var4) {
         var2.field1846[var4] = this.field1846[var4];
         var2.field1843[var4] = this.field1843[var4];
         var2.field1848[var4] = this.field1848[var4];
      }

      if (var1) {
         var2.field1857 = this.field1857;
      } else {
         var2.field1857 = var3;
         if (this.field1857 == null) {
            for(var4 = 0; var4 < this.field1849; ++var4) {
               var2.field1857[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field1849; ++var4) {
               var2.field1857[var4] = this.field1857[var4];
            }
         }
      }

      var2.field1898 = this.field1898;
      var2.field1864 = this.field1864;
      var2.field1852 = this.field1852;
      var2.field1853 = this.field1853;
      var2.field1885 = this.field1885;
      var2.field1855 = this.field1855;
      var2.field1870 = this.field1870;
      var2.field1858 = this.field1858;
      var2.field1859 = this.field1859;
      var2.field1860 = this.field1860;
      var2.field1862 = this.field1862;
      var2.field1863 = this.field1863;
      var2.field1883 = this.field1883;
      var2.field1908 = this.field1908;
      var2.field1856 = this.field1856;
      var2.field1850 = this.field1850;
      var2.method2696();
      return var2;
   }

   void method2686(int var1) {
      if (this.field1876 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field1906[var1];
         int var9 = field1905[var1];

         for(int var10 = 0; var10 < this.field1845; ++var10) {
            int var11 = class134.method2809(this.field1846[var10], this.field1848[var10], var8, var9);
            int var12 = this.field1843[var10];
            int var13 = class134.method2810(this.field1846[var10], this.field1848[var10], var8, var9);
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         this.field1873 = (var5 + var2) / 2;
         this.field1874 = (var6 + var3) / 2;
         this.field1875 = (var7 + var4) / 2;
         this.field1876 = (var5 - var2 + 1) / 2;
         this.field1877 = (var6 - var3 + 1) / 2;
         this.field1878 = (var7 - var4 + 1) / 2;
         if (this.field1876 < 32) {
            this.field1876 = 32;
         }

         if (this.field1878 < 32) {
            this.field1878 = 32;
         }

         if (this.field1850) {
            this.field1876 += 8;
            this.field1878 += 8;
         }
      }

   }

   public class131 method2763(boolean var1) {
      if (!var1 && field1891.length < this.field1849) {
         field1891 = new byte[this.field1849 + 100];
      }

      return this.method2685(var1, field1861, field1891);
   }

   void method2688() {
      if (this.field1868 != 2) {
         this.field1868 = 2;
         this.field1907 = 0;

         for(int var1 = 0; var1 < this.field1845; ++var1) {
            int var2 = this.field1846[var1];
            int var3 = this.field1843[var1];
            int var4 = this.field1848[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.field1907) {
               this.field1907 = var5;
            }
         }

         this.field1907 = (int)(Math.sqrt((double)this.field1907) + 0.99D);
         this.field1872 = this.field1907;
         this.field1871 = this.field1907 + this.field1907;
      }

   }

   public class131 method2715(boolean var1) {
      if (!var1 && field1844.length < this.field1849) {
         field1844 = new byte[this.field1849 + 100];
      }

      return this.method2685(var1, field1869, field1844);
   }

   public void method2756(int var1) {
      int var2 = field1905[var1];
      int var3 = field1906[var1];

      for(int var4 = 0; var4 < this.field1845; ++var4) {
         int var5 = var3 * this.field1843[var4] - var2 * this.field1848[var4] >> 16;
         this.field1848[var4] = var2 * this.field1843[var4] + var3 * this.field1848[var4] >> 16;
         this.field1843[var4] = var5;
      }

      this.method2696();
   }

   public class131 method2682(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2687();
      int var7 = var2 - this.field1907;
      int var8 = var2 + this.field1907;
      int var9 = var4 - this.field1907;
      int var10 = var4 + this.field1907;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class131 var11;
            if (var5) {
               var11 = new class131();
               var11.field1845 = this.field1845;
               var11.field1849 = this.field1849;
               var11.field1892 = this.field1892;
               var11.field1846 = this.field1846;
               var11.field1848 = this.field1848;
               var11.field1898 = this.field1898;
               var11.field1864 = this.field1864;
               var11.field1852 = this.field1852;
               var11.field1853 = this.field1853;
               var11.field1885 = this.field1885;
               var11.field1855 = this.field1855;
               var11.field1870 = this.field1870;
               var11.field1857 = this.field1857;
               var11.field1858 = this.field1858;
               var11.field1859 = this.field1859;
               var11.field1860 = this.field1860;
               var11.field1862 = this.field1862;
               var11.field1863 = this.field1863;
               var11.field1883 = this.field1883;
               var11.field1908 = this.field1908;
               var11.field1856 = this.field1856;
               var11.field1850 = this.field1850;
               var11.field1843 = new int[var11.field1845];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field1845; ++var12) {
                  var13 = var2 + this.field1846[var12];
                  var14 = var4 + this.field1848[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1843[var12] = var21 + this.field1843[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1845; ++var12) {
                  var13 = (-this.field1843[var12] << 16) / super.field2042;
                  if (var13 < var6) {
                     var14 = var2 + this.field1846[var12];
                     var15 = var4 + this.field1848[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1843[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field1843[var12];
                  }
               }
            }

            var11.method2696();
            return var11;
         }
      } else {
         return this;
      }
   }

   void vmethod3066(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      field1889[0] = -1;
      if (this.field1868 != 1) {
         this.method2687();
      }

      this.method2686(var1);
      int var10 = var5 * var8 - var4 * var6 >> 16;
      int var11 = var2 * var7 + var3 * var10 >> 16;
      int var12 = var3 * this.field1907 >> 16;
      int var13 = var11 + var12;
      if (var13 > 50 && var11 < 3500) {
         int var14 = var8 * var4 + var5 * var6 >> 16;
         int var15 = (var14 - this.field1907) * class134.field1941;
         if (var15 / var13 < class134.field1947) {
            int var16 = (var14 + this.field1907) * class134.field1941;
            if (var16 / var13 > class134.field1946) {
               int var17 = var3 * var7 - var10 * var2 >> 16;
               int var18 = var2 * this.field1907 >> 16;
               int var19 = (var17 + var18) * class134.field1941;
               if (var19 / var13 > class134.field1945) {
                  int var20 = (var3 * super.field2042 >> 16) + var18;
                  int var21 = (var17 - var20) * class134.field1941;
                  if (var21 / var13 < class134.field1949) {
                     int var22 = var12 + (var2 * super.field2042 >> 16);
                     boolean var23 = false;
                     boolean var24 = false;
                     if (var11 - var22 <= 50) {
                        var24 = true;
                     }

                     boolean var25 = var24 || this.field1892 > 0;
                     int var26 = class132.field1912;
                     int var27 = class42.method617(634757620);
                     boolean var28 = class132.field1916;
                     if (class7.field228 && var9 > 0) {
                        if (class27.method237(this, var6, var7, var8, 1660277578)) {
                           class40.method575(this, var6, var7, var8, -65281, (byte)0);
                        } else if (class7.field230 == class11.field252) {
                           class40.method575(this, var6, var7, var8, -16776961, (byte)0);
                        }
                     }

                     int var29;
                     int var30;
                     int var31;
                     int var32;
                     int var33;
                     int var34;
                     int var35;
                     if (class7.field225 && var9 > 0) {
                        int var36 = var11 - var12;
                        if (var36 <= 50) {
                           var36 = 50;
                        }

                        if (var14 > 0) {
                           var29 = var15 / var13;
                           var30 = var16 / var36;
                        } else {
                           var30 = var16 / var13;
                           var29 = var15 / var36;
                        }

                        if (var17 > 0) {
                           var31 = var21 / var13;
                           var32 = var19 / var36;
                        } else {
                           var32 = var19 / var13;
                           var31 = var21 / var36;
                        }

                        var33 = -8355840;
                        var34 = var26 - class134.field1942;
                        var35 = var27 - class134.field1943;
                        if (var34 > var29 && var34 < var30 && var35 > var31 && var35 < var32) {
                           var33 = -256;
                        }

                        class254.method4525(var29 + class134.field1942, var31 + class134.field1943, var30 + class134.field1942, var32 + class134.field1943, var33, 2114948306);
                     }

                     boolean var40 = false;
                     if (var9 > 0 && var28) {
                        boolean var37 = false;
                        if (field1881) {
                           var37 = class27.method237(this, var6, var7, var8, -8977408);
                        } else {
                           var30 = var11 - var12;
                           if (var30 <= 50) {
                              var30 = 50;
                           }

                           if (var14 > 0) {
                              var15 /= var13;
                              var16 /= var30;
                           } else {
                              var16 /= var13;
                              var15 /= var30;
                           }

                           if (var17 > 0) {
                              var21 /= var13;
                              var19 /= var30;
                           } else {
                              var19 /= var13;
                              var21 /= var30;
                           }

                           var31 = var26 - class134.field1942;
                           var32 = var27 - class134.field1943;
                           if (var31 > var15 && var31 < var16 && var32 > var21 && var32 < var19) {
                              var37 = true;
                           }
                        }

                        if (var37) {
                           if (this.field1850) {
                              class94.method1987(var9, 1689525097);
                           } else {
                              var40 = true;
                           }
                        }
                     }

                     var29 = class134.field1942;
                     var30 = class134.field1943;
                     var31 = 0;
                     var32 = 0;
                     if (var1 != 0) {
                        var31 = field1905[var1];
                        var32 = field1906[var1];
                     }

                     for(var33 = 0; var33 < this.field1845; ++var33) {
                        var34 = this.field1846[var33];
                        var35 = this.field1843[var33];
                        int var41 = this.field1848[var33];
                        int var38;
                        if (var1 != 0) {
                           var38 = var41 * var31 + var34 * var32 >> 16;
                           var41 = var41 * var32 - var34 * var31 >> 16;
                           var34 = var38;
                        }

                        var34 += var6;
                        var35 += var7;
                        var41 += var8;
                        var38 = var41 * var4 + var5 * var34 >> 16;
                        var41 = var5 * var41 - var34 * var4 >> 16;
                        var34 = var38;
                        var38 = var3 * var35 - var41 * var2 >> 16;
                        var41 = var35 * var2 + var3 * var41 >> 16;
                        field1884[var33] = var41 - var11;
                        if (var41 >= 50) {
                           field1882[var33] = var34 * class134.field1941 / var41 + var29;
                           field1865[var33] = var38 * class134.field1941 / var41 + var30;
                        } else {
                           field1882[var33] = -5000;
                           var23 = true;
                        }

                        if (var25) {
                           field1904[var33] = var34;
                           field1886[var33] = var38;
                           field1887[var33] = var41;
                        }
                     }

                     try {
                        this.method2710(var23, var40, this.field1850, var9);
                     } catch (Exception var39) {
                        ;
                     }
                  }
               }
            }
         }
      }

   }

   public void method2745() {
      for(int var1 = 0; var1 < this.field1845; ++var1) {
         int var2 = this.field1848[var1];
         this.field1848[var1] = this.field1846[var1];
         this.field1846[var1] = -var2;
      }

      this.method2696();
   }

   public void method2680(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1845; ++var4) {
         this.field1846[var4] = this.field1846[var4] * var1 / 128;
         this.field1843[var4] = var2 * this.field1843[var4] / 128;
         this.field1848[var4] = var3 * this.field1848[var4] / 128;
      }

      this.method2696();
   }

   public void method2695() {
      for(int var1 = 0; var1 < this.field1845; ++var1) {
         this.field1846[var1] = -this.field1846[var1];
         this.field1848[var1] = -this.field1848[var1];
      }

      this.method2696();
   }

   public void method2694() {
      for(int var1 = 0; var1 < this.field1845; ++var1) {
         int var2 = this.field1846[var1];
         this.field1846[var1] = this.field1848[var1];
         this.field1848[var1] = -var2;
      }

      this.method2696();
   }

   final void method2681(int var1) {
      if (field1902[var1]) {
         this.method2765(var1);
      } else {
         int var2 = this.field1898[var1];
         int var3 = this.field1864[var1];
         int var4 = this.field1852[var1];
         class134.field1940 = field1880[var1];
         if (this.field1857 == null) {
            class134.field1934 = 0;
         } else {
            class134.field1934 = this.field1857[var1] & 255;
         }

         if (this.field1859 != null && this.field1859[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if (this.field1858 != null && this.field1858[var1] != -1) {
               int var8 = this.field1858[var1] & 255;
               var5 = this.field1862[var8];
               var6 = this.field1863[var8];
               var7 = this.field1883[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if (this.field1855[var1] == -1) {
               class134.method2844(field1865[var2], field1865[var3], field1865[var4], field1882[var2], field1882[var3], field1882[var4], this.field1853[var1], this.field1853[var1], this.field1853[var1], field1904[var5], field1904[var6], field1904[var7], field1886[var5], field1886[var6], field1886[var7], field1887[var5], field1887[var6], field1887[var7], this.field1859[var1]);
            } else {
               class134.method2844(field1865[var2], field1865[var3], field1865[var4], field1882[var2], field1882[var3], field1882[var4], this.field1853[var1], this.field1885[var1], this.field1855[var1], field1904[var5], field1904[var6], field1904[var7], field1886[var5], field1886[var6], field1886[var7], field1887[var5], field1887[var6], field1887[var7], this.field1859[var1]);
            }
         } else if (this.field1855[var1] == -1) {
            class134.method2803(field1865[var2], field1865[var3], field1865[var4], field1882[var2], field1882[var3], field1882[var4], field1851[this.field1853[var1]]);
         } else {
            class134.method2801(field1865[var2], field1865[var3], field1865[var4], field1882[var2], field1882[var3], field1882[var4], this.field1853[var1], this.field1885[var1], this.field1855[var1]);
         }
      }

   }

   public void method2692(class142 var1, int var2, class142 var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            class129 var6 = var1.field2063[var2];
            class129 var7 = var3.field2063[var4];
            class136 var8 = var6.field1814;
            field1899 = 0;
            field1900 = 0;
            field1901 = 0;
            byte var9 = 0;
            int var10 = var9 + 1;
            int var11 = var5[var9];

            int var12;
            int var13;
            for(var12 = 0; var12 < var6.field1806; ++var12) {
               for(var13 = var6.field1811[var12]; var13 > var11; var11 = var5[var10++]) {
                  ;
               }

               if (var13 != var11 || var8.field1975[var13] == 0) {
                  this.method2693(var8.field1975[var13], var8.field1971[var13], var6.field1812[var12], var6.field1809[var12], var6.field1810[var12]);
               }
            }

            field1899 = 0;
            field1900 = 0;
            field1901 = 0;
            var9 = 0;
            var10 = var9 + 1;
            var11 = var5[var9];

            for(var12 = 0; var12 < var7.field1806; ++var12) {
               for(var13 = var7.field1811[var12]; var13 > var11; var11 = var5[var10++]) {
                  ;
               }

               if (var13 == var11 || var8.field1975[var13] == 0) {
                  this.method2693(var8.field1975[var13], var8.field1971[var13], var7.field1812[var12], var7.field1809[var12], var7.field1810[var12]);
               }
            }

            this.method2696();
         } else {
            this.method2759(var1, var2);
         }
      }

   }

   void method2693(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var9;
      int var10;
      if (var1 == 0) {
         var7 = 0;
         field1899 = 0;
         field1900 = 0;
         field1901 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var11 = var2[var8];
            if (var11 < this.field1908.length) {
               int[] var12 = this.field1908[var11];

               for(var9 = 0; var9 < var12.length; ++var9) {
                  var10 = var12[var9];
                  field1899 += this.field1846[var10];
                  field1900 += this.field1843[var10];
                  field1901 += this.field1848[var10];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            field1899 = var3 + field1899 / var7;
            field1900 = var4 + field1900 / var7;
            field1901 = var5 + field1901 / var7;
         } else {
            field1899 = var3;
            field1900 = var4;
            field1901 = var5;
         }
      } else {
         int[] var18;
         int var19;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field1908.length) {
                  var18 = this.field1908[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var9 = var18[var19];
                     this.field1846[var9] += var3;
                     this.field1843[var9] += var4;
                     this.field1848[var9] += var5;
                  }
               }
            }
         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field1908.length) {
                  var18 = this.field1908[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var9 = var18[var19];
                     this.field1846[var9] -= field1899;
                     this.field1843[var9] -= field1900;
                     this.field1848[var9] -= field1901;
                     var10 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = field1905[var14];
                        var16 = field1906[var14];
                        var17 = var15 * this.field1843[var9] + var16 * this.field1846[var9] >> 16;
                        this.field1843[var9] = var16 * this.field1843[var9] - var15 * this.field1846[var9] >> 16;
                        this.field1846[var9] = var17;
                     }

                     if (var10 != 0) {
                        var15 = field1905[var10];
                        var16 = field1906[var10];
                        var17 = var16 * this.field1843[var9] - var15 * this.field1848[var9] >> 16;
                        this.field1848[var9] = var15 * this.field1843[var9] + var16 * this.field1848[var9] >> 16;
                        this.field1843[var9] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field1905[var13];
                        var16 = field1906[var13];
                        var17 = var15 * this.field1848[var9] + var16 * this.field1846[var9] >> 16;
                        this.field1848[var9] = var16 * this.field1848[var9] - var15 * this.field1846[var9] >> 16;
                        this.field1846[var9] = var17;
                     }

                     this.field1846[var9] += field1899;
                     this.field1843[var9] += field1900;
                     this.field1848[var9] += field1901;
                  }
               }
            }
         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field1908.length) {
                  var18 = this.field1908[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var9 = var18[var19];
                     this.field1846[var9] -= field1899;
                     this.field1843[var9] -= field1900;
                     this.field1848[var9] -= field1901;
                     this.field1846[var9] = var3 * this.field1846[var9] / 128;
                     this.field1843[var9] = var4 * this.field1843[var9] / 128;
                     this.field1848[var9] = var5 * this.field1848[var9] / 128;
                     this.field1846[var9] += field1899;
                     this.field1843[var9] += field1900;
                     this.field1848[var9] += field1901;
                  }
               }
            }
         } else if (var1 == 5 && this.field1856 != null && this.field1857 != null) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field1856.length) {
                  var18 = this.field1856[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var9 = var18[var19];
                     var10 = (this.field1857[var9] & 255) + var3 * 8;
                     if (var10 < 0) {
                        var10 = 0;
                     } else if (var10 > 255) {
                        var10 = 255;
                     }

                     this.field1857[var9] = (byte)var10;
                  }
               }
            }
         }
      }

   }

   final void method2710(boolean var1, boolean var2, boolean var3, int var4) {
      if (this.field1871 < 1600) {
         int var5;
         for(var5 = 0; var5 < this.field1871; ++var5) {
            field1889[var5] = 0;
         }

         var5 = var3 ? 20 : 5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (class7.field227 && var2) {
            class131 var13 = this;

            for(var6 = 0; var6 < var13.field1849; ++var6) {
               if (var13.field1855[var6] != -2) {
                  var7 = var13.field1898[var6];
                  var8 = var13.field1864[var6];
                  var9 = var13.field1852[var6];
                  var10 = field1882[var7];
                  var11 = field1882[var8];
                  var12 = field1882[var9];
                  class35.method422(field1865[var7], field1865[var8], field1865[var9], var10, var11, var12, var5, (short)-21276);
               }
            }
         }

         int var14;
         int var15;
         int var16;
         int var26;
         for(var26 = 0; var26 < this.field1849; ++var26) {
            if (this.field1855[var26] != -2) {
               var6 = this.field1898[var26];
               var7 = this.field1864[var26];
               var8 = this.field1852[var26];
               var9 = field1882[var6];
               var10 = field1882[var7];
               var11 = field1882[var8];
               int var17;
               if (var1 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                  var12 = field1904[var6];
                  var14 = field1904[var7];
                  var15 = field1904[var8];
                  var17 = field1886[var6];
                  var16 = field1886[var7];
                  int var29 = field1886[var8];
                  int var19 = field1887[var6];
                  int var20 = field1887[var7];
                  int var21 = field1887[var8];
                  var12 -= var14;
                  var15 -= var14;
                  var17 -= var16;
                  var29 -= var16;
                  var19 -= var20;
                  var21 -= var20;
                  int var22 = var17 * var21 - var19 * var29;
                  int var23 = var19 * var15 - var12 * var21;
                  int var24 = var12 * var29 - var17 * var15;
                  if (var14 * var22 + var16 * var23 + var20 * var24 > 0) {
                     field1902[var26] = true;
                     int var25 = (field1884[var6] + field1884[var7] + field1884[var8]) / 3 + this.field1872;
                     field1890[var25][field1889[var25]++] = var26;
                  }
               } else {
                  if (var2) {
                     var14 = field1865[var6];
                     var15 = field1865[var7];
                     var17 = field1865[var8];
                     var16 = var5 + class132.field1919;
                     boolean var18;
                     if (var16 < var14 && var16 < var15 && var16 < var17) {
                        var18 = false;
                     } else {
                        var16 = class132.field1919 - var5;
                        if (var16 > var14 && var16 > var15 && var16 > var17) {
                           var18 = false;
                        } else {
                           var16 = var5 + class132.field1912;
                           if (var16 < var9 && var16 < var10 && var16 < var11) {
                              var18 = false;
                           } else {
                              var16 = class132.field1912 - var5;
                              if (var16 > var9 && var16 > var10 && var16 > var11) {
                                 var18 = false;
                              } else {
                                 var18 = true;
                              }
                           }
                        }
                     }

                     if (var18) {
                        class94.method1987(var4, 1855358746);
                        var2 = false;
                     }
                  }

                  if ((var9 - var10) * (field1865[var8] - field1865[var7]) - (var11 - var10) * (field1865[var6] - field1865[var7]) > 0) {
                     field1902[var26] = false;
                     if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= class134.field1948 && var10 <= class134.field1948 && var11 <= class134.field1948) {
                        field1880[var26] = false;
                     } else {
                        field1880[var26] = true;
                     }

                     var12 = (field1884[var6] + field1884[var7] + field1884[var8]) / 3 + this.field1872;
                     field1890[var12][field1889[var12]++] = var26;
                  }
               }
            }
         }

         int[] var27;
         if (this.field1870 == null) {
            for(var26 = this.field1871 - 1; var26 >= 0; --var26) {
               var6 = field1889[var26];
               if (var6 > 0) {
                  var27 = field1890[var26];

                  for(var8 = 0; var8 < var6; ++var8) {
                     this.method2681(var27[var8]);
                  }
               }
            }
         } else {
            for(var26 = 0; var26 < 12; ++var26) {
               field1903[var26] = 0;
               field1895[var26] = 0;
            }

            for(var26 = this.field1871 - 1; var26 >= 0; --var26) {
               var6 = field1889[var26];
               if (var6 > 0) {
                  var27 = field1890[var26];

                  for(var8 = 0; var8 < var6; ++var8) {
                     var9 = var27[var8];
                     byte var31 = this.field1870[var9];
                     var11 = field1903[var31]++;
                     field1841[var31][var11] = var9;
                     if (var31 < 10) {
                        field1895[var31] += var26;
                     } else if (var31 == 10) {
                        field1842[var11] = var26;
                     } else {
                        field1894[var11] = var26;
                     }
                  }
               }
            }

            var26 = 0;
            if (field1903[1] > 0 || field1903[2] > 0) {
               var26 = (field1895[1] + field1895[2]) / (field1903[1] + field1903[2]);
            }

            var6 = 0;
            if (field1903[3] > 0 || field1903[4] > 0) {
               var6 = (field1895[3] + field1895[4]) / (field1903[3] + field1903[4]);
            }

            var7 = 0;
            if (field1903[6] > 0 || field1903[8] > 0) {
               var7 = (field1895[8] + field1895[6]) / (field1903[8] + field1903[6]);
            }

            var9 = 0;
            var10 = field1903[10];
            int[] var32 = field1841[10];
            int[] var28 = field1842;
            if (var9 == var10) {
               var9 = 0;
               var10 = field1903[11];
               var32 = field1841[11];
               var28 = field1894;
            }

            if (var9 < var10) {
               var8 = var28[var9];
            } else {
               var8 = -1000;
            }

            for(var14 = 0; var14 < 10; ++var14) {
               while(var14 == 0 && var8 > var26) {
                  this.method2681(var32[var9++]);
                  if (var9 == var10 && var32 != field1841[11]) {
                     var9 = 0;
                     var10 = field1903[11];
                     var32 = field1841[11];
                     var28 = field1894;
                  }

                  if (var9 < var10) {
                     var8 = var28[var9];
                  } else {
                     var8 = -1000;
                  }
               }

               while(var14 == 3 && var8 > var6) {
                  this.method2681(var32[var9++]);
                  if (var9 == var10 && var32 != field1841[11]) {
                     var9 = 0;
                     var10 = field1903[11];
                     var32 = field1841[11];
                     var28 = field1894;
                  }

                  if (var9 < var10) {
                     var8 = var28[var9];
                  } else {
                     var8 = -1000;
                  }
               }

               while(var14 == 5 && var8 > var7) {
                  this.method2681(var32[var9++]);
                  if (var9 == var10 && var32 != field1841[11]) {
                     var9 = 0;
                     var10 = field1903[11];
                     var32 = field1841[11];
                     var28 = field1894;
                  }

                  if (var9 < var10) {
                     var8 = var28[var9];
                  } else {
                     var8 = -1000;
                  }
               }

               var15 = field1903[var14];
               int[] var30 = field1841[var14];

               for(var16 = 0; var16 < var15; ++var16) {
                  this.method2681(var30[var16]);
               }
            }

            while(var8 != -1000) {
               this.method2681(var32[var9++]);
               if (var9 == var10 && var32 != field1841[11]) {
                  var9 = 0;
                  var32 = field1841[11];
                  var10 = field1903[11];
                  var28 = field1894;
               }

               if (var9 < var10) {
                  var8 = var28[var9];
               } else {
                  var8 = -1000;
               }
            }
         }
      }

   }

   public void method2698(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1845; ++var4) {
         this.field1846[var4] += var1;
         this.field1843[var4] += var2;
         this.field1848[var4] += var3;
      }

      this.method2696();
   }

   public final void method2700(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field1889[0] = -1;
      if (this.field1868 != 2 && this.field1868 != 1) {
         this.method2688();
      }

      int var8 = class134.field1942;
      int var9 = class134.field1943;
      int var10 = field1905[var1];
      int var11 = field1906[var1];
      int var12 = field1905[var2];
      int var13 = field1906[var2];
      int var14 = field1905[var3];
      int var15 = field1906[var3];
      int var16 = field1905[var4];
      int var17 = field1906[var4];
      int var18 = var16 * var6 + var17 * var7 >> 16;

      for(int var19 = 0; var19 < this.field1845; ++var19) {
         int var20 = this.field1846[var19];
         int var21 = this.field1843[var19];
         int var22 = this.field1848[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field1884[var19] = var22 - var18;
         field1882[var19] = var20 * class134.field1941 / var22 + var8;
         field1865[var19] = var23 * class134.field1941 / var22 + var9;
         if (this.field1892 > 0) {
            field1904[var19] = var20;
            field1886[var19] = var23;
            field1887[var19] = var22;
         }
      }

      try {
         this.method2710(false, false, false, 0);
      } catch (Exception var24) {
         ;
      }

   }

   public final void method2701(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field1889[0] = -1;
      if (this.field1868 != 2 && this.field1868 != 1) {
         this.method2688();
      }

      int var9 = class134.field1942;
      int var10 = class134.field1943;
      int var11 = field1905[var1];
      int var12 = field1906[var1];
      int var13 = field1905[var2];
      int var14 = field1906[var2];
      int var15 = field1905[var3];
      int var16 = field1906[var3];
      int var17 = field1905[var4];
      int var18 = field1906[var4];
      int var19 = var17 * var6 + var18 * var7 >> 16;

      for(int var20 = 0; var20 < this.field1845; ++var20) {
         int var21 = this.field1846[var20];
         int var22 = this.field1843[var20];
         int var23 = this.field1848[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field1884[var20] = var23 - var19;
         field1882[var20] = var9 + var21 * class134.field1941 / var8;
         field1865[var20] = var10 + var24 * class134.field1941 / var8;
         if (this.field1892 > 0) {
            field1904[var20] = var21;
            field1886[var20] = var24;
            field1887[var20] = var23;
         }
      }

      try {
         this.method2710(false, false, false, 0);
      } catch (Exception var25) {
         ;
      }

   }

   public int method2689() {
      this.method2687();
      return this.field1907;
   }

   static {
      field1905 = class134.field1955;
      field1906 = class134.field1933;
      field1851 = class134.field1937;
      field1854 = class134.field1951;
   }
}

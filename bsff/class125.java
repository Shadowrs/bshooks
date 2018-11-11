public class class125 extends class139 {
   static int[] field1756;
   static int[] field1753 = new int[10000];
   static int[] field1731;
   static int[] field1757 = new int[10000];
   static int field1728 = 0;
   boolean field1747 = false;
   int[] field1739;
   int[] field1712;
   class133[] field1743;
   int field1732 = 0;
   short[] field1724;
   int field1715 = 0;
   int field1744;
   int[] field1713;
   int[] field1714;
   int[] field1735;
   short[] field1723;
   byte[] field1719;
   class133[] field1745;
   int field1750;
   int field1748;
   class141[] field1742;
   int[] field1716;
   int[][] field1740;
   int field1752;
   byte field1725 = 0;
   int[][] field1741;
   int[] field1718;
   int field1751;
   int field1726;
   int[] field1717;
   public short field1749;
   byte[] field1722;
   public short field1746;
   byte[] field1721;
   byte[] field1727;
   byte[] field1720;
   short[] field1734;
   short[] field1729;
   short[] field1730;
   short[] field1755;
   short[] field1711;
   short[] field1733;
   short[] field1754;
   byte[] field1737;
   short[] field1738;
   short[] field1736;

   class125() {
   }

   public class125(class125[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field1732 = 0;
      this.field1715 = 0;
      this.field1726 = 0;
      this.field1725 = -1;

      int var9;
      class125 var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if (var10 != null) {
            this.field1732 += var10.field1732;
            this.field1715 += var10.field1715;
            this.field1726 += var10.field1726;
            if (var10.field1720 != null) {
               var4 = true;
            } else {
               if (this.field1725 == -1) {
                  this.field1725 = var10.field1725;
               }

               if (this.field1725 != var10.field1725) {
                  var4 = true;
               }
            }

            var3 |= var10.field1719 != null;
            var5 |= var10.field1721 != null;
            var6 |= var10.field1735 != null;
            var7 |= var10.field1724 != null;
            var8 |= var10.field1722 != null;
         }
      }

      this.field1712 = new int[this.field1732];
      this.field1713 = new int[this.field1732];
      this.field1714 = new int[this.field1732];
      this.field1739 = new int[this.field1732];
      this.field1716 = new int[this.field1715];
      this.field1717 = new int[this.field1715];
      this.field1718 = new int[this.field1715];
      if (var3) {
         this.field1719 = new byte[this.field1715];
      }

      if (var4) {
         this.field1720 = new byte[this.field1715];
      }

      if (var5) {
         this.field1721 = new byte[this.field1715];
      }

      if (var6) {
         this.field1735 = new int[this.field1715];
      }

      if (var7) {
         this.field1724 = new short[this.field1715];
      }

      if (var8) {
         this.field1722 = new byte[this.field1715];
      }

      this.field1723 = new short[this.field1715];
      if (this.field1726 > 0) {
         this.field1727 = new byte[this.field1726];
         this.field1734 = new short[this.field1726];
         this.field1729 = new short[this.field1726];
         this.field1730 = new short[this.field1726];
         this.field1755 = new short[this.field1726];
         this.field1711 = new short[this.field1726];
         this.field1733 = new short[this.field1726];
         this.field1754 = new short[this.field1726];
         this.field1737 = new byte[this.field1726];
         this.field1738 = new short[this.field1726];
         this.field1736 = new short[this.field1726];
      }

      this.field1732 = 0;
      this.field1715 = 0;
      this.field1726 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if (var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field1715; ++var11) {
               if (var3 && var10.field1719 != null) {
                  this.field1719[this.field1715] = var10.field1719[var11];
               }

               if (var4) {
                  if (var10.field1720 != null) {
                     this.field1720[this.field1715] = var10.field1720[var11];
                  } else {
                     this.field1720[this.field1715] = var10.field1725;
                  }
               }

               if (var5 && var10.field1721 != null) {
                  this.field1721[this.field1715] = var10.field1721[var11];
               }

               if (var6 && var10.field1735 != null) {
                  this.field1735[this.field1715] = var10.field1735[var11];
               }

               if (var7) {
                  if (var10.field1724 != null) {
                     this.field1724[this.field1715] = var10.field1724[var11];
                  } else {
                     this.field1724[this.field1715] = -1;
                  }
               }

               if (var8) {
                  if (var10.field1722 != null && var10.field1722[var11] != -1) {
                     this.field1722[this.field1715] = (byte)(this.field1726 + var10.field1722[var11]);
                  } else {
                     this.field1722[this.field1715] = -1;
                  }
               }

               this.field1723[this.field1715] = var10.field1723[var11];
               this.field1716[this.field1715] = this.method2586(var10, var10.field1716[var11]);
               this.field1717[this.field1715] = this.method2586(var10, var10.field1717[var11]);
               this.field1718[this.field1715] = this.method2586(var10, var10.field1718[var11]);
               ++this.field1715;
            }

            for(var11 = 0; var11 < var10.field1726; ++var11) {
               byte var12 = this.field1727[this.field1726] = var10.field1727[var11];
               if (var12 == 0) {
                  this.field1734[this.field1726] = (short)this.method2586(var10, var10.field1734[var11]);
                  this.field1729[this.field1726] = (short)this.method2586(var10, var10.field1729[var11]);
                  this.field1730[this.field1726] = (short)this.method2586(var10, var10.field1730[var11]);
               }

               if (var12 >= 1 && var12 <= 3) {
                  this.field1734[this.field1726] = var10.field1734[var11];
                  this.field1729[this.field1726] = var10.field1729[var11];
                  this.field1730[this.field1726] = var10.field1730[var11];
                  this.field1755[this.field1726] = var10.field1755[var11];
                  this.field1711[this.field1726] = var10.field1711[var11];
                  this.field1733[this.field1726] = var10.field1733[var11];
                  this.field1754[this.field1726] = var10.field1754[var11];
                  this.field1737[this.field1726] = var10.field1737[var11];
                  this.field1738[this.field1726] = var10.field1738[var11];
               }

               if (var12 == 2) {
                  this.field1736[this.field1726] = var10.field1736[var11];
               }

               ++this.field1726;
            }
         }
      }

   }

   class125(byte[] var1) {
      if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method2584(var1);
      } else {
         this.method2638(var1);
      }

   }

   public class125(class125 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field1732 = var1.field1732;
      this.field1715 = var1.field1715;
      this.field1726 = var1.field1726;
      int var6;
      if (var2) {
         this.field1712 = var1.field1712;
         this.field1713 = var1.field1713;
         this.field1714 = var1.field1714;
      } else {
         this.field1712 = new int[this.field1732];
         this.field1713 = new int[this.field1732];
         this.field1714 = new int[this.field1732];

         for(var6 = 0; var6 < this.field1732; ++var6) {
            this.field1712[var6] = var1.field1712[var6];
            this.field1713[var6] = var1.field1713[var6];
            this.field1714[var6] = var1.field1714[var6];
         }
      }

      if (var3) {
         this.field1723 = var1.field1723;
      } else {
         this.field1723 = new short[this.field1715];

         for(var6 = 0; var6 < this.field1715; ++var6) {
            this.field1723[var6] = var1.field1723[var6];
         }
      }

      if (!var4 && var1.field1724 != null) {
         this.field1724 = new short[this.field1715];

         for(var6 = 0; var6 < this.field1715; ++var6) {
            this.field1724[var6] = var1.field1724[var6];
         }
      } else {
         this.field1724 = var1.field1724;
      }

      this.field1721 = var1.field1721;
      this.field1716 = var1.field1716;
      this.field1717 = var1.field1717;
      this.field1718 = var1.field1718;
      this.field1719 = var1.field1719;
      this.field1720 = var1.field1720;
      this.field1722 = var1.field1722;
      this.field1725 = var1.field1725;
      this.field1727 = var1.field1727;
      this.field1734 = var1.field1734;
      this.field1729 = var1.field1729;
      this.field1730 = var1.field1730;
      this.field1755 = var1.field1755;
      this.field1711 = var1.field1711;
      this.field1733 = var1.field1733;
      this.field1754 = var1.field1754;
      this.field1737 = var1.field1737;
      this.field1738 = var1.field1738;
      this.field1736 = var1.field1736;
      this.field1739 = var1.field1739;
      this.field1735 = var1.field1735;
      this.field1740 = var1.field1740;
      this.field1741 = var1.field1741;
      this.field1743 = var1.field1743;
      this.field1742 = var1.field1742;
      this.field1745 = var1.field1745;
      this.field1749 = var1.field1749;
      this.field1746 = var1.field1746;
   }

   void method2665() {
      if (!this.field1747) {
         super.field2042 = 0;
         this.field1748 = 0;
         this.field1744 = 999999;
         this.field1750 = -999999;
         this.field1751 = -99999;
         this.field1752 = 99999;

         for(int var1 = 0; var1 < this.field1732; ++var1) {
            int var2 = this.field1712[var1];
            int var3 = this.field1713[var1];
            int var4 = this.field1714[var1];
            if (var2 < this.field1744) {
               this.field1744 = var2;
            }

            if (var2 > this.field1750) {
               this.field1750 = var2;
            }

            if (var4 < this.field1752) {
               this.field1752 = var4;
            }

            if (var4 > this.field1751) {
               this.field1751 = var4;
            }

            if (-var3 > super.field2042) {
               super.field2042 = -var3;
            }

            if (var3 > this.field1748) {
               this.field1748 = var3;
            }
         }

         this.field1747 = true;
      }

   }

   public void method2599() {
      if (this.field1743 == null) {
         this.field1743 = new class133[this.field1732];

         int var1;
         for(var1 = 0; var1 < this.field1732; ++var1) {
            this.field1743[var1] = new class133();
         }

         for(var1 = 0; var1 < this.field1715; ++var1) {
            int var2 = this.field1716[var1];
            int var3 = this.field1717[var1];
            int var4 = this.field1718[var1];
            int var5 = this.field1712[var3] - this.field1712[var2];
            int var6 = this.field1713[var3] - this.field1713[var2];
            int var7 = this.field1714[var3] - this.field1714[var2];
            int var8 = this.field1712[var4] - this.field1712[var2];
            int var9 = this.field1713[var4] - this.field1713[var2];
            int var10 = this.field1714[var4] - this.field1714[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.field1719 == null) {
               var15 = 0;
            } else {
               var15 = this.field1719[var1];
            }

            if (var15 == 0) {
               class133 var16 = this.field1743[var2];
               var16.field1922 += var11;
               var16.field1923 += var12;
               var16.field1924 += var13;
               ++var16.field1925;
               var16 = this.field1743[var3];
               var16.field1922 += var11;
               var16.field1923 += var12;
               var16.field1924 += var13;
               ++var16.field1925;
               var16 = this.field1743[var4];
               var16.field1922 += var11;
               var16.field1923 += var12;
               var16.field1924 += var13;
               ++var16.field1925;
            } else if (var15 == 1) {
               if (this.field1742 == null) {
                  this.field1742 = new class141[this.field1715];
               }

               class141 var17 = this.field1742[var1] = new class141();
               var17.field2059 = var11;
               var17.field2056 = var12;
               var17.field2057 = var13;
            }
         }
      }

   }

   void method2600() {
      this.field1743 = null;
      this.field1745 = null;
      this.field1742 = null;
      this.field1747 = false;
   }

   public class125 method2587() {
      class125 var1 = new class125();
      if (this.field1719 != null) {
         var1.field1719 = new byte[this.field1715];

         for(int var2 = 0; var2 < this.field1715; ++var2) {
            var1.field1719[var2] = this.field1719[var2];
         }
      }

      var1.field1732 = this.field1732;
      var1.field1715 = this.field1715;
      var1.field1726 = this.field1726;
      var1.field1712 = this.field1712;
      var1.field1713 = this.field1713;
      var1.field1714 = this.field1714;
      var1.field1716 = this.field1716;
      var1.field1717 = this.field1717;
      var1.field1718 = this.field1718;
      var1.field1720 = this.field1720;
      var1.field1721 = this.field1721;
      var1.field1722 = this.field1722;
      var1.field1723 = this.field1723;
      var1.field1724 = this.field1724;
      var1.field1725 = this.field1725;
      var1.field1727 = this.field1727;
      var1.field1734 = this.field1734;
      var1.field1729 = this.field1729;
      var1.field1730 = this.field1730;
      var1.field1755 = this.field1755;
      var1.field1711 = this.field1711;
      var1.field1733 = this.field1733;
      var1.field1754 = this.field1754;
      var1.field1737 = this.field1737;
      var1.field1738 = this.field1738;
      var1.field1736 = this.field1736;
      var1.field1739 = this.field1739;
      var1.field1735 = this.field1735;
      var1.field1740 = this.field1740;
      var1.field1741 = this.field1741;
      var1.field1743 = this.field1743;
      var1.field1742 = this.field1742;
      var1.field1749 = this.field1749;
      var1.field1746 = this.field1746;
      return var1;
   }

   public void method2595(short var1, short var2) {
      for(int var3 = 0; var3 < this.field1715; ++var3) {
         if (this.field1723[var3] == var1) {
            this.field1723[var3] = var2;
         }
      }

   }

   public void method2644(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1732; ++var4) {
         this.field1712[var4] = this.field1712[var4] * var1 / 128;
         this.field1713[var4] = var2 * this.field1713[var4] / 128;
         this.field1714[var4] = var3 * this.field1714[var4] / 128;
      }

      this.method2600();
   }

   void method2638(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      class194 var4 = new class194(var1);
      class194 var5 = new class194(var1);
      class194 var6 = new class194(var1);
      class194 var7 = new class194(var1);
      class194 var8 = new class194(var1);
      var4.field2565 = var1.length - 18;
      int var9 = var4.getUShort(-1208216487);
      int var10 = var4.getUShort(-1208216487);
      int var11 = var4.getUByte(-159584657);
      int var12 = var4.getUByte(1061913628);
      int var13 = var4.getUByte(-2021998217);
      int var14 = var4.getUByte(438033584);
      int var15 = var4.getUByte(-454434974);
      int var16 = var4.getUByte(-1257249679);
      int var17 = var4.getUShort(-1208216487);
      int var18 = var4.getUShort(-1208216487);
      int var19 = var4.getUShort(-1208216487);
      int var20 = var4.getUShort(-1208216487);
      byte var21 = 0;
      int var22 = var21 + var9;
      int var23 = var22;
      var22 += var10;
      int var24 = var22;
      if (var13 == 255) {
         var22 += var10;
      }

      int var25 = var22;
      if (var15 == 1) {
         var22 += var10;
      }

      int var26 = var22;
      if (var12 == 1) {
         var22 += var10;
      }

      int var27 = var22;
      if (var16 == 1) {
         var22 += var9;
      }

      int var28 = var22;
      if (var14 == 1) {
         var22 += var10;
      }

      int var29 = var22;
      var22 += var20;
      int var30 = var22;
      var22 += var10 * 2;
      int var31 = var22;
      var22 += var11 * 6;
      int var32 = var22;
      var22 += var17;
      int var33 = var22;
      var22 += var18;
      int var10000 = var22 + var19;
      this.field1732 = var9;
      this.field1715 = var10;
      this.field1726 = var11;
      this.field1712 = new int[var9];
      this.field1713 = new int[var9];
      this.field1714 = new int[var9];
      this.field1716 = new int[var10];
      this.field1717 = new int[var10];
      this.field1718 = new int[var10];
      if (var11 > 0) {
         this.field1727 = new byte[var11];
         this.field1734 = new short[var11];
         this.field1729 = new short[var11];
         this.field1730 = new short[var11];
      }

      if (var16 == 1) {
         this.field1739 = new int[var9];
      }

      if (var12 == 1) {
         this.field1719 = new byte[var10];
         this.field1722 = new byte[var10];
         this.field1724 = new short[var10];
      }

      if (var13 == 255) {
         this.field1720 = new byte[var10];
      } else {
         this.field1725 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1721 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1735 = new int[var10];
      }

      this.field1723 = new short[var10];
      var4.field2565 = var21;
      var5.field2565 = var32;
      var6.field2565 = var33;
      var7.field2565 = var22;
      var8.field2565 = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.getUByte(-2046741737);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.getSmart(764027762);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.getSmart(764027762);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.getSmart(764027762);
         }

         this.field1712[var38] = var35 + var40;
         this.field1713[var38] = var36 + var41;
         this.field1714[var38] = var37 + var42;
         var35 = this.field1712[var38];
         var36 = this.field1713[var38];
         var37 = this.field1714[var38];
         if (var16 == 1) {
            this.field1739[var38] = var8.getUByte(875217299);
         }
      }

      var4.field2565 = var30;
      var5.field2565 = var26;
      var6.field2565 = var24;
      var7.field2565 = var28;
      var8.field2565 = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field1723[var38] = (short)var4.getUShort(-1208216487);
         if (var12 == 1) {
            var39 = var5.getUByte(-2043088278);
            if ((var39 & 1) == 1) {
               this.field1719[var38] = 1;
               var2 = true;
            } else {
               this.field1719[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.field1722[var38] = (byte)(var39 >> 2);
               this.field1724[var38] = this.field1723[var38];
               this.field1723[var38] = 127;
               if (this.field1724[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field1722[var38] = -1;
               this.field1724[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.field1720[var38] = var6.getByte(-1736955425);
         }

         if (var14 == 1) {
            this.field1721[var38] = var7.getByte(-1431621969);
         }

         if (var15 == 1) {
            this.field1735[var38] = var8.getUByte(-1990167480);
         }
      }

      var4.field2565 = var29;
      var5.field2565 = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.getUByte(-1206202751);
         if (var43 == 1) {
            var38 = var4.getSmart(764027762) + var41;
            var39 = var4.getSmart(764027762) + var38;
            var40 = var4.getSmart(764027762) + var39;
            var41 = var40;
            this.field1716[var42] = var38;
            this.field1717[var42] = var39;
            this.field1718[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.getSmart(764027762) + var41;
            var41 = var40;
            this.field1716[var42] = var38;
            this.field1717[var42] = var39;
            this.field1718[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.getSmart(764027762) + var41;
            var41 = var40;
            this.field1716[var42] = var38;
            this.field1717[var42] = var39;
            this.field1718[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.getSmart(764027762) + var41;
            var41 = var40;
            this.field1716[var42] = var38;
            this.field1717[var42] = var44;
            this.field1718[var42] = var40;
         }
      }

      var4.field2565 = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field1727[var42] = 0;
         this.field1734[var42] = (short)var4.getUShort(-1208216487);
         this.field1729[var42] = (short)var4.getUShort(-1208216487);
         this.field1730[var42] = (short)var4.getUShort(-1208216487);
      }

      if (this.field1722 != null) {
         boolean var45 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field1722[var43] & 255;
            if (var44 != 255) {
               if (this.field1716[var43] == (this.field1734[var44] & '\uffff') && this.field1717[var43] == (this.field1729[var44] & '\uffff') && this.field1718[var43] == (this.field1730[var44] & '\uffff')) {
                  this.field1722[var43] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if (!var45) {
            this.field1722 = null;
         }
      }

      if (!var3) {
         this.field1724 = null;
      }

      if (!var2) {
         this.field1719 = null;
      }

   }

   public void method2660(short var1, short var2) {
      if (this.field1724 != null) {
         for(int var3 = 0; var3 < this.field1715; ++var3) {
            if (this.field1724[var3] == var1) {
               this.field1724[var3] = var2;
            }
         }
      }

   }

   public final class131 method2596(int var1, int var2, int var3, int var4, int var5) {
      this.method2599();
      int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
      int var7 = var6 * var2 >> 8;
      class131 var8 = new class131();
      var8.field1853 = new int[this.field1715];
      var8.field1885 = new int[this.field1715];
      var8.field1855 = new int[this.field1715];
      if (this.field1726 > 0 && this.field1722 != null) {
         int[] var9 = new int[this.field1726];

         int var10;
         for(var10 = 0; var10 < this.field1715; ++var10) {
            if (this.field1722[var10] != -1) {
               ++var9[this.field1722[var10] & 255];
            }
         }

         var8.field1892 = 0;

         for(var10 = 0; var10 < this.field1726; ++var10) {
            if (var9[var10] > 0 && this.field1727[var10] == 0) {
               ++var8.field1892;
            }
         }

         var8.field1862 = new int[var8.field1892];
         var8.field1863 = new int[var8.field1892];
         var8.field1883 = new int[var8.field1892];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field1726; ++var11) {
            if (var9[var11] > 0 && this.field1727[var11] == 0) {
               var8.field1862[var10] = this.field1734[var11] & '\uffff';
               var8.field1863[var10] = this.field1729[var11] & '\uffff';
               var8.field1883[var10] = this.field1730[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field1858 = new byte[this.field1715];

         for(var11 = 0; var11 < this.field1715; ++var11) {
            if (this.field1722[var11] != -1) {
               var8.field1858[var11] = (byte)var9[this.field1722[var11] & 255];
            } else {
               var8.field1858[var11] = -1;
            }
         }
      }

      for(int var17 = 0; var17 < this.field1715; ++var17) {
         byte var18;
         if (this.field1719 == null) {
            var18 = 0;
         } else {
            var18 = this.field1719[var17];
         }

         byte var19;
         if (this.field1721 == null) {
            var19 = 0;
         } else {
            var19 = this.field1721[var17];
         }

         short var12;
         if (this.field1724 == null) {
            var12 = -1;
         } else {
            var12 = this.field1724[var17];
         }

         if (var19 == -2) {
            var18 = 3;
         }

         if (var19 == -1) {
            var18 = 2;
         }

         class133 var13;
         int var14;
         class141 var15;
         if (var12 == -1) {
            if (var18 != 0) {
               if (var18 == 1) {
                  var15 = this.field1742[var17];
                  var14 = (var4 * var15.field2056 + var5 * var15.field2057 + var3 * var15.field2059) / (var7 / 2 + var7) + var1;
                  var8.field1853[var17] = method2622(this.field1723[var17] & '\uffff', var14);
                  var8.field1855[var17] = -1;
               } else if (var18 == 3) {
                  var8.field1853[var17] = 128;
                  var8.field1855[var17] = -1;
               } else {
                  var8.field1855[var17] = -2;
               }
            } else {
               int var16 = this.field1723[var17] & '\uffff';
               if (this.field1745 != null && this.field1745[this.field1716[var17]] != null) {
                  var13 = this.field1745[this.field1716[var17]];
               } else {
                  var13 = this.field1743[this.field1716[var17]];
               }

               var14 = (var4 * var13.field1923 + var5 * var13.field1924 + var3 * var13.field1922) / (var7 * var13.field1925) + var1;
               var8.field1853[var17] = method2622(var16, var14);
               if (this.field1745 != null && this.field1745[this.field1717[var17]] != null) {
                  var13 = this.field1745[this.field1717[var17]];
               } else {
                  var13 = this.field1743[this.field1717[var17]];
               }

               var14 = (var4 * var13.field1923 + var5 * var13.field1924 + var3 * var13.field1922) / (var7 * var13.field1925) + var1;
               var8.field1885[var17] = method2622(var16, var14);
               if (this.field1745 != null && this.field1745[this.field1718[var17]] != null) {
                  var13 = this.field1745[this.field1718[var17]];
               } else {
                  var13 = this.field1743[this.field1718[var17]];
               }

               var14 = (var4 * var13.field1923 + var5 * var13.field1924 + var3 * var13.field1922) / (var7 * var13.field1925) + var1;
               var8.field1855[var17] = method2622(var16, var14);
            }
         } else if (var18 != 0) {
            if (var18 == 1) {
               var15 = this.field1742[var17];
               var14 = (var4 * var15.field2056 + var5 * var15.field2057 + var3 * var15.field2059) / (var7 / 2 + var7) + var1;
               var8.field1853[var17] = method2664(var14);
               var8.field1855[var17] = -1;
            } else {
               var8.field1855[var17] = -2;
            }
         } else {
            if (this.field1745 != null && this.field1745[this.field1716[var17]] != null) {
               var13 = this.field1745[this.field1716[var17]];
            } else {
               var13 = this.field1743[this.field1716[var17]];
            }

            var14 = (var4 * var13.field1923 + var5 * var13.field1924 + var3 * var13.field1922) / (var7 * var13.field1925) + var1;
            var8.field1853[var17] = method2664(var14);
            if (this.field1745 != null && this.field1745[this.field1717[var17]] != null) {
               var13 = this.field1745[this.field1717[var17]];
            } else {
               var13 = this.field1743[this.field1717[var17]];
            }

            var14 = (var4 * var13.field1923 + var5 * var13.field1924 + var3 * var13.field1922) / (var7 * var13.field1925) + var1;
            var8.field1885[var17] = method2664(var14);
            if (this.field1745 != null && this.field1745[this.field1718[var17]] != null) {
               var13 = this.field1745[this.field1718[var17]];
            } else {
               var13 = this.field1743[this.field1718[var17]];
            }

            var14 = (var4 * var13.field1923 + var5 * var13.field1924 + var3 * var13.field1922) / (var7 * var13.field1925) + var1;
            var8.field1855[var17] = method2664(var14);
         }
      }

      this.method2598();
      var8.field1845 = this.field1732;
      var8.field1846 = this.field1712;
      var8.field1843 = this.field1713;
      var8.field1848 = this.field1714;
      var8.field1849 = this.field1715;
      var8.field1898 = this.field1716;
      var8.field1864 = this.field1717;
      var8.field1852 = this.field1718;
      var8.field1870 = this.field1720;
      var8.field1857 = this.field1721;
      var8.field1860 = this.field1725;
      var8.field1908 = this.field1740;
      var8.field1856 = this.field1741;
      var8.field1859 = this.field1724;
      return var8;
   }

   void method2584(byte[] var1) {
      class194 var2 = new class194(var1);
      class194 var3 = new class194(var1);
      class194 var4 = new class194(var1);
      class194 var5 = new class194(var1);
      class194 var6 = new class194(var1);
      class194 var7 = new class194(var1);
      class194 var8 = new class194(var1);
      var2.field2565 = var1.length - 23;
      int var9 = var2.getUShort(-1208216487);
      int var10 = var2.getUShort(-1208216487);
      int var11 = var2.getUByte(1121043722);
      int var12 = var2.getUByte(-144653461);
      int var13 = var2.getUByte(380801771);
      int var14 = var2.getUByte(-260057676);
      int var15 = var2.getUByte(168793793);
      int var16 = var2.getUByte(-1329655596);
      int var17 = var2.getUByte(-566761982);
      int var18 = var2.getUShort(-1208216487);
      int var19 = var2.getUShort(-1208216487);
      int var20 = var2.getUShort(-1208216487);
      int var21 = var2.getUShort(-1208216487);
      int var22 = var2.getUShort(-1208216487);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.field1727 = new byte[var11];
         var2.field2565 = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field1727[var26] = var2.getByte(1220888513);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var56 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var28 = var26;
      var26 += var10;
      int var29 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var30 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var31 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var32 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var33 = var26;
      var26 += var21;
      int var34 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var35 = var26;
      var26 += var22;
      int var36 = var26;
      var26 += var10 * 2;
      int var37 = var26;
      var26 += var18;
      int var38 = var26;
      var26 += var19;
      int var39 = var26;
      var26 += var20;
      int var40 = var26;
      var26 += var23 * 6;
      int var41 = var26;
      var26 += var24 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 2;
      int var44 = var26;
      var26 += var24;
      int var45 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field1732 = var9;
      this.field1715 = var10;
      this.field1726 = var11;
      this.field1712 = new int[var9];
      this.field1713 = new int[var9];
      this.field1714 = new int[var9];
      this.field1716 = new int[var10];
      this.field1717 = new int[var10];
      this.field1718 = new int[var10];
      if (var17 == 1) {
         this.field1739 = new int[var9];
      }

      if (var12 == 1) {
         this.field1719 = new byte[var10];
      }

      if (var13 == 255) {
         this.field1720 = new byte[var10];
      } else {
         this.field1725 = (byte)var13;
      }

      if (var14 == 1) {
         this.field1721 = new byte[var10];
      }

      if (var15 == 1) {
         this.field1735 = new int[var10];
      }

      if (var16 == 1) {
         this.field1724 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field1722 = new byte[var10];
      }

      this.field1723 = new short[var10];
      if (var11 > 0) {
         this.field1734 = new short[var11];
         this.field1729 = new short[var11];
         this.field1730 = new short[var11];
         if (var24 > 0) {
            this.field1755 = new short[var24];
            this.field1711 = new short[var24];
            this.field1733 = new short[var24];
            this.field1754 = new short[var24];
            this.field1737 = new byte[var24];
            this.field1738 = new short[var24];
         }

         if (var25 > 0) {
            this.field1736 = new short[var25];
         }
      }

      var2.field2565 = var11;
      var3.field2565 = var37;
      var4.field2565 = var38;
      var5.field2565 = var39;
      var6.field2565 = var31;
      int var46 = 0;
      int var47 = 0;
      int var48 = 0;

      int var49;
      int var50;
      int var51;
      int var52;
      int var53;
      for(var49 = 0; var49 < var9; ++var49) {
         var50 = var2.getUByte(-380743887);
         var51 = 0;
         if ((var50 & 1) != 0) {
            var51 = var3.getSmart(764027762);
         }

         var52 = 0;
         if ((var50 & 2) != 0) {
            var52 = var4.getSmart(764027762);
         }

         var53 = 0;
         if ((var50 & 4) != 0) {
            var53 = var5.getSmart(764027762);
         }

         this.field1712[var49] = var46 + var51;
         this.field1713[var49] = var47 + var52;
         this.field1714[var49] = var48 + var53;
         var46 = this.field1712[var49];
         var47 = this.field1713[var49];
         var48 = this.field1714[var49];
         if (var17 == 1) {
            this.field1739[var49] = var6.getUByte(482507619);
         }
      }

      var2.field2565 = var36;
      var3.field2565 = var56;
      var4.field2565 = var29;
      var5.field2565 = var32;
      var6.field2565 = var30;
      var7.field2565 = var34;
      var8.field2565 = var35;

      for(var49 = 0; var49 < var10; ++var49) {
         this.field1723[var49] = (short)var2.getUShort(-1208216487);
         if (var12 == 1) {
            this.field1719[var49] = var3.getByte(-483251988);
         }

         if (var13 == 255) {
            this.field1720[var49] = var4.getByte(-456831293);
         }

         if (var14 == 1) {
            this.field1721[var49] = var5.getByte(176184276);
         }

         if (var15 == 1) {
            this.field1735[var49] = var6.getUByte(-1910388604);
         }

         if (var16 == 1) {
            this.field1724[var49] = (short)(var7.getUShort(-1208216487) - 1);
         }

         if (this.field1722 != null && this.field1724[var49] != -1) {
            this.field1722[var49] = (byte)(var8.getUByte(-1189719867) - 1);
         }
      }

      var2.field2565 = var33;
      var3.field2565 = var28;
      var49 = 0;
      var50 = 0;
      var51 = 0;
      var52 = 0;

      int var54;
      for(var53 = 0; var53 < var10; ++var53) {
         var54 = var3.getUByte(-803117261);
         if (var54 == 1) {
            var49 = var2.getSmart(764027762) + var52;
            var50 = var2.getSmart(764027762) + var49;
            var51 = var2.getSmart(764027762) + var50;
            var52 = var51;
            this.field1716[var53] = var49;
            this.field1717[var53] = var50;
            this.field1718[var53] = var51;
         }

         if (var54 == 2) {
            var50 = var51;
            var51 = var2.getSmart(764027762) + var52;
            var52 = var51;
            this.field1716[var53] = var49;
            this.field1717[var53] = var50;
            this.field1718[var53] = var51;
         }

         if (var54 == 3) {
            var49 = var51;
            var51 = var2.getSmart(764027762) + var52;
            var52 = var51;
            this.field1716[var53] = var49;
            this.field1717[var53] = var50;
            this.field1718[var53] = var51;
         }

         if (var54 == 4) {
            int var55 = var49;
            var49 = var50;
            var50 = var55;
            var51 = var2.getSmart(764027762) + var52;
            var52 = var51;
            this.field1716[var53] = var49;
            this.field1717[var53] = var55;
            this.field1718[var53] = var51;
         }
      }

      var2.field2565 = var40;
      var3.field2565 = var41;
      var4.field2565 = var42;
      var5.field2565 = var43;
      var6.field2565 = var44;
      var7.field2565 = var45;

      for(var53 = 0; var53 < var11; ++var53) {
         var54 = this.field1727[var53] & 255;
         if (var54 == 0) {
            this.field1734[var53] = (short)var2.getUShort(-1208216487);
            this.field1729[var53] = (short)var2.getUShort(-1208216487);
            this.field1730[var53] = (short)var2.getUShort(-1208216487);
         }

         if (var54 == 1) {
            this.field1734[var53] = (short)var3.getUShort(-1208216487);
            this.field1729[var53] = (short)var3.getUShort(-1208216487);
            this.field1730[var53] = (short)var3.getUShort(-1208216487);
            this.field1755[var53] = (short)var4.getUShort(-1208216487);
            this.field1711[var53] = (short)var4.getUShort(-1208216487);
            this.field1733[var53] = (short)var4.getUShort(-1208216487);
            this.field1754[var53] = (short)var5.getUShort(-1208216487);
            this.field1737[var53] = var6.getByte(-482126480);
            this.field1738[var53] = (short)var7.getUShort(-1208216487);
         }

         if (var54 == 2) {
            this.field1734[var53] = (short)var3.getUShort(-1208216487);
            this.field1729[var53] = (short)var3.getUShort(-1208216487);
            this.field1730[var53] = (short)var3.getUShort(-1208216487);
            this.field1755[var53] = (short)var4.getUShort(-1208216487);
            this.field1711[var53] = (short)var4.getUShort(-1208216487);
            this.field1733[var53] = (short)var4.getUShort(-1208216487);
            this.field1754[var53] = (short)var5.getUShort(-1208216487);
            this.field1737[var53] = var6.getByte(332093590);
            this.field1738[var53] = (short)var7.getUShort(-1208216487);
            this.field1736[var53] = (short)var7.getUShort(-1208216487);
         }

         if (var54 == 3) {
            this.field1734[var53] = (short)var3.getUShort(-1208216487);
            this.field1729[var53] = (short)var3.getUShort(-1208216487);
            this.field1730[var53] = (short)var3.getUShort(-1208216487);
            this.field1755[var53] = (short)var4.getUShort(-1208216487);
            this.field1711[var53] = (short)var4.getUShort(-1208216487);
            this.field1733[var53] = (short)var4.getUShort(-1208216487);
            this.field1754[var53] = (short)var5.getUShort(-1208216487);
            this.field1737[var53] = var6.getByte(179548930);
            this.field1738[var53] = (short)var7.getUShort(-1208216487);
         }
      }

      var2.field2565 = var26;
      var53 = var2.getUByte(-1028833252);
      if (var53 != 0) {
         new class138();
         var2.getUShort(-1208216487);
         var2.getUShort(-1208216487);
         var2.getUShort(-1208216487);
         var2.getInt(-1817376731);
      }

   }

   public class125 method2588(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2665();
      int var7 = var2 + this.field1744;
      int var8 = var2 + this.field1750;
      int var9 = var4 + this.field1752;
      int var10 = var4 + this.field1751;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class125 var11 = new class125();
            var11.field1732 = this.field1732;
            var11.field1715 = this.field1715;
            var11.field1726 = this.field1726;
            var11.field1712 = this.field1712;
            var11.field1714 = this.field1714;
            var11.field1716 = this.field1716;
            var11.field1717 = this.field1717;
            var11.field1718 = this.field1718;
            var11.field1719 = this.field1719;
            var11.field1720 = this.field1720;
            var11.field1721 = this.field1721;
            var11.field1722 = this.field1722;
            var11.field1723 = this.field1723;
            var11.field1724 = this.field1724;
            var11.field1725 = this.field1725;
            var11.field1727 = this.field1727;
            var11.field1734 = this.field1734;
            var11.field1729 = this.field1729;
            var11.field1730 = this.field1730;
            var11.field1755 = this.field1755;
            var11.field1711 = this.field1711;
            var11.field1733 = this.field1733;
            var11.field1754 = this.field1754;
            var11.field1737 = this.field1737;
            var11.field1738 = this.field1738;
            var11.field1736 = this.field1736;
            var11.field1739 = this.field1739;
            var11.field1735 = this.field1735;
            var11.field1740 = this.field1740;
            var11.field1741 = this.field1741;
            var11.field1749 = this.field1749;
            var11.field1746 = this.field1746;
            var11.field1713 = new int[var11.field1732];
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
               for(var12 = 0; var12 < var11.field1732; ++var12) {
                  var13 = var2 + this.field1712[var12];
                  var14 = var4 + this.field1714[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1713[var12] = var21 + this.field1713[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1732; ++var12) {
                  var13 = (-this.field1713[var12] << 16) / super.field2042;
                  if (var13 < var6) {
                     var14 = var2 + this.field1712[var12];
                     var15 = var4 + this.field1714[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1713[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field1713[var12];
                  }
               }
            }

            var11.method2600();
            return var11;
         }
      } else {
         return this;
      }
   }

   public void method2647(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1732; ++var4) {
         this.field1712[var4] += var1;
         this.field1713[var4] += var2;
         this.field1714[var4] += var3;
      }

      this.method2600();
   }

   void method2598() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if (this.field1739 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1732; ++var3) {
            var4 = this.field1739[var3];
            ++var1[var4];
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field1740 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1740[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1732; this.field1740[var4][var1[var4]++] = var3++) {
            var4 = this.field1739[var3];
         }

         this.field1739 = null;
      }

      if (this.field1735 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1715; ++var3) {
            var4 = this.field1735[var3];
            ++var1[var4];
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field1741 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1741[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1715; this.field1741[var4][var1[var4]++] = var3++) {
            var4 = this.field1735[var3];
         }

         this.field1735 = null;
      }

   }

   public void method2626() {
      int var1;
      for(var1 = 0; var1 < this.field1732; ++var1) {
         this.field1714[var1] = -this.field1714[var1];
      }

      for(var1 = 0; var1 < this.field1715; ++var1) {
         int var2 = this.field1716[var1];
         this.field1716[var1] = this.field1718[var1];
         this.field1718[var1] = var2;
      }

      this.method2600();
   }

   public void method2593(int var1) {
      int var2 = field1756[var1];
      int var3 = field1731[var1];

      for(int var4 = 0; var4 < this.field1732; ++var4) {
         int var5 = var2 * this.field1714[var4] + var3 * this.field1712[var4] >> 16;
         this.field1714[var4] = var3 * this.field1714[var4] - var2 * this.field1712[var4] >> 16;
         this.field1712[var4] = var5;
      }

      this.method2600();
   }

   public void method2590() {
      for(int var1 = 0; var1 < this.field1732; ++var1) {
         int var2 = this.field1712[var1];
         this.field1712[var1] = this.field1714[var1];
         this.field1714[var1] = -var2;
      }

      this.method2600();
   }

   public void method2591() {
      for(int var1 = 0; var1 < this.field1732; ++var1) {
         this.field1712[var1] = -this.field1712[var1];
         this.field1714[var1] = -this.field1714[var1];
      }

      this.method2600();
   }

   public void method2592() {
      for(int var1 = 0; var1 < this.field1732; ++var1) {
         int var2 = this.field1714[var1];
         this.field1714[var1] = this.field1712[var1];
         this.field1712[var1] = -var2;
      }

      this.method2600();
   }

   final int method2586(class125 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field1712[var2];
      int var5 = var1.field1713[var2];
      int var6 = var1.field1714[var2];

      for(int var7 = 0; var7 < this.field1732; ++var7) {
         if (var4 == this.field1712[var7] && var5 == this.field1713[var7] && var6 == this.field1714[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field1712[this.field1732] = var4;
         this.field1713[this.field1732] = var5;
         this.field1714[this.field1732] = var6;
         if (var1.field1739 != null) {
            this.field1739[this.field1732] = var1.field1739[var2];
         }

         var3 = this.field1732++;
      }

      return var3;
   }

   public static class125 method2583(class261 var0, int var1, int var2) {
      byte[] var3 = var0.method4551(var1, var2, 2025627741);
      return var3 == null ? null : new class125(var3);
   }

   static void method2602(class125 var0, class125 var1, int var2, int var3, int var4, boolean var5) {
      var0.method2665();
      var0.method2599();
      var1.method2665();
      var1.method2599();
      ++field1728;
      int var6 = 0;
      int[] var7 = var1.field1712;
      int var8 = var1.field1732;

      int var9;
      for(var9 = 0; var9 < var0.field1732; ++var9) {
         class133 var10 = var0.field1743[var9];
         if (var10.field1925 != 0) {
            int var11 = var0.field1713[var9] - var3;
            if (var11 <= var1.field1748) {
               int var12 = var0.field1712[var9] - var2;
               if (var12 >= var1.field1744 && var12 <= var1.field1750) {
                  int var13 = var0.field1714[var9] - var4;
                  if (var13 >= var1.field1752 && var13 <= var1.field1751) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class133 var15 = var1.field1743[var14];
                        if (var12 == var7[var14] && var13 == var1.field1714[var14] && var11 == var1.field1713[var14] && var15.field1925 != 0) {
                           if (var0.field1745 == null) {
                              var0.field1745 = new class133[var0.field1732];
                           }

                           if (var1.field1745 == null) {
                              var1.field1745 = new class133[var8];
                           }

                           class133 var16 = var0.field1745[var9];
                           if (var16 == null) {
                              var16 = var0.field1745[var9] = new class133(var10);
                           }

                           class133 var17 = var1.field1745[var14];
                           if (var17 == null) {
                              var17 = var1.field1745[var14] = new class133(var15);
                           }

                           var16.field1922 += var15.field1922;
                           var16.field1923 += var15.field1923;
                           var16.field1924 += var15.field1924;
                           var16.field1925 += var15.field1925;
                           var17.field1922 += var10.field1922;
                           var17.field1923 += var10.field1923;
                           var17.field1924 += var10.field1924;
                           var17.field1925 += var10.field1925;
                           ++var6;
                           field1753[var9] = field1728;
                           field1757[var14] = field1728;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field1715; ++var9) {
            if (field1753[var0.field1716[var9]] == field1728 && field1753[var0.field1717[var9]] == field1728 && field1753[var0.field1718[var9]] == field1728) {
               if (var0.field1719 == null) {
                  var0.field1719 = new byte[var0.field1715];
               }

               var0.field1719[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field1715; ++var9) {
            if (field1728 == field1757[var1.field1716[var9]] && field1728 == field1757[var1.field1717[var9]] && field1728 == field1757[var1.field1718[var9]]) {
               if (var1.field1719 == null) {
                  var1.field1719 = new byte[var1.field1715];
               }

               var1.field1719[var9] = 2;
            }
         }
      }

   }

   static final int method2664(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   static final int method2622(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static {
      field1756 = class134.field1955;
      field1731 = class134.field1933;
   }
}

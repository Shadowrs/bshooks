public class class115 extends class117 {
   int field1621;
   int field1613;
   int field1611;
   int field1618;
   int field1622;
   int field1612;
   int field1614;
   int field1616;
   int field1619;
   int field1617;
   int field1615;
   int field1623;
   int field1624;
   boolean field1620;
   int field1625;

   class115(class105 var1, int var2, int var3, int var4) {
      super.field1641 = var1;
      this.field1619 = var1.field1537;
      this.field1615 = var1.field1538;
      this.field1620 = var1.field1539;
      this.field1612 = var2;
      this.field1613 = var3;
      this.field1621 = var4;
      this.field1614 = 0;
      this.method2302();
   }

   class115(class105 var1, int var2, int var3) {
      super.field1641 = var1;
      this.field1619 = var1.field1537;
      this.field1615 = var1.field1538;
      this.field1620 = var1.field1539;
      this.field1612 = var2;
      this.field1613 = var3;
      this.field1621 = 8192;
      this.field1614 = 0;
      this.method2302();
   }

   public synchronized int method2436() {
      return this.field1621 < 0 ? -1 : this.field1621;
   }

   synchronized void method2306(int var1, int var2) {
      this.field1613 = var1;
      this.field1621 = var2;
      this.field1622 = 0;
      this.method2302();
   }

   synchronized void method2347(int var1) {
      this.method2306(var1, this.method2436());
   }

   public synchronized void method2313(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method2306(var2, var3);
      } else {
         int var4 = method2316(var2, var3);
         int var5 = method2396(var2, var3);
         if (var4 == this.field1616 && var5 == this.field1617) {
            this.field1622 = 0;
         } else {
            int var6 = var2 - this.field1611;
            if (this.field1611 - var2 > var6) {
               var6 = this.field1611 - var2;
            }

            if (var4 - this.field1616 > var6) {
               var6 = var4 - this.field1616;
            }

            if (this.field1616 - var4 > var6) {
               var6 = this.field1616 - var4;
            }

            if (var5 - this.field1617 > var6) {
               var6 = var5 - this.field1617;
            }

            if (this.field1617 - var5 > var6) {
               var6 = this.field1617 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field1622 = var1;
            this.field1613 = var2;
            this.field1621 = var3;
            this.field1623 = (var2 - this.field1611) / var1;
            this.field1624 = (var4 - this.field1616) / var1;
            this.field1625 = (var5 - this.field1617) / var1;
         }
      }

   }

   public synchronized void vmethod4339(int[] var1, int var2, int var3) {
      if (this.field1613 == 0 && this.field1622 == 0) {
         this.vmethod4340(var3);
      } else {
         class105 var4 = (class105)super.field1641;
         int var5 = this.field1619 << 8;
         int var6 = this.field1615 << 8;
         int var7 = var4.field1535.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field1618 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field1614 < 0) {
            if (this.field1612 <= 0) {
               this.method2311();
               this.method4014();
               return;
            }

            this.field1614 = 0;
         }

         if (this.field1614 >= var7) {
            if (this.field1612 >= 0) {
               this.method2311();
               this.method4014();
               return;
            }

            this.field1614 = var7 - 1;
         }

         if (this.field1618 < 0) {
            if (this.field1620) {
               if (this.field1612 < 0) {
                  var9 = this.method2402(var1, var2, var5, var3, var4.field1535[this.field1619]);
                  if (this.field1614 >= var5) {
                     return;
                  }

                  this.field1614 = var5 + var5 - 1 - this.field1614;
                  this.field1612 = -this.field1612;
               }

               while(true) {
                  var9 = this.method2324(var1, var9, var6, var3, var4.field1535[this.field1615 - 1]);
                  if (this.field1614 < var6) {
                     return;
                  }

                  this.field1614 = var6 + var6 - 1 - this.field1614;
                  this.field1612 = -this.field1612;
                  var9 = this.method2402(var1, var9, var5, var3, var4.field1535[this.field1619]);
                  if (this.field1614 >= var5) {
                     return;
                  }

                  this.field1614 = var5 + var5 - 1 - this.field1614;
                  this.field1612 = -this.field1612;
               }
            }

            if (this.field1612 < 0) {
               while(true) {
                  var9 = this.method2402(var1, var9, var5, var3, var4.field1535[this.field1615 - 1]);
                  if (this.field1614 >= var5) {
                     return;
                  }

                  this.field1614 = var6 - 1 - (var6 - 1 - this.field1614) % var8;
               }
            }

            while(true) {
               var9 = this.method2324(var1, var9, var6, var3, var4.field1535[this.field1619]);
               if (this.field1614 < var6) {
                  return;
               }

               this.field1614 = var5 + (this.field1614 - var5) % var8;
            }
         }

         if (this.field1618 > 0) {
            if (this.field1620) {
               label118: {
                  if (this.field1612 < 0) {
                     var9 = this.method2402(var1, var2, var5, var3, var4.field1535[this.field1619]);
                     if (this.field1614 >= var5) {
                        return;
                     }

                     this.field1614 = var5 + var5 - 1 - this.field1614;
                     this.field1612 = -this.field1612;
                     if (--this.field1618 == 0) {
                        break label118;
                     }
                  }

                  do {
                     var9 = this.method2324(var1, var9, var6, var3, var4.field1535[this.field1615 - 1]);
                     if (this.field1614 < var6) {
                        return;
                     }

                     this.field1614 = var6 + var6 - 1 - this.field1614;
                     this.field1612 = -this.field1612;
                     if (--this.field1618 == 0) {
                        break;
                     }

                     var9 = this.method2402(var1, var9, var5, var3, var4.field1535[this.field1619]);
                     if (this.field1614 >= var5) {
                        return;
                     }

                     this.field1614 = var5 + var5 - 1 - this.field1614;
                     this.field1612 = -this.field1612;
                  } while(--this.field1618 != 0);
               }
            } else {
               int var10;
               if (this.field1612 < 0) {
                  while(true) {
                     var9 = this.method2402(var1, var9, var5, var3, var4.field1535[this.field1615 - 1]);
                     if (this.field1614 >= var5) {
                        return;
                     }

                     var10 = (var6 - 1 - this.field1614) / var8;
                     if (var10 >= this.field1618) {
                        this.field1614 += var8 * this.field1618;
                        this.field1618 = 0;
                        break;
                     }

                     this.field1614 += var8 * var10;
                     this.field1618 -= var10;
                  }
               } else {
                  while(true) {
                     var9 = this.method2324(var1, var9, var6, var3, var4.field1535[this.field1619]);
                     if (this.field1614 < var6) {
                        return;
                     }

                     var10 = (this.field1614 - var5) / var8;
                     if (var10 >= this.field1618) {
                        this.field1614 -= var8 * this.field1618;
                        this.field1618 = 0;
                        break;
                     }

                     this.field1614 -= var8 * var10;
                     this.field1618 -= var10;
                  }
               }
            }
         }

         if (this.field1612 < 0) {
            this.method2402(var1, var9, 0, var3, 0);
            if (this.field1614 < 0) {
               this.field1614 = -1;
               this.method2311();
               this.method4014();
            }
         } else {
            this.method2324(var1, var9, var7, var3, 0);
            if (this.field1614 >= var7) {
               this.field1614 = var7;
               this.method2311();
               this.method4014();
            }
         }
      }

   }

   public synchronized void vmethod4340(int var1) {
      if (this.field1622 > 0) {
         if (var1 >= this.field1622) {
            if (this.field1613 == Integer.MIN_VALUE) {
               this.field1613 = 0;
               this.field1617 = 0;
               this.field1616 = 0;
               this.field1611 = 0;
               this.method4014();
               var1 = this.field1622;
            }

            this.field1622 = 0;
            this.method2302();
         } else {
            this.field1611 += this.field1623 * var1;
            this.field1616 += this.field1624 * var1;
            this.field1617 += this.field1625 * var1;
            this.field1622 -= var1;
         }
      }

      class105 var2 = (class105)super.field1641;
      int var3 = this.field1619 << 8;
      int var4 = this.field1615 << 8;
      int var5 = var2.field1535.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field1618 = 0;
      }

      if (this.field1614 < 0) {
         if (this.field1612 <= 0) {
            this.method2311();
            this.method4014();
            return;
         }

         this.field1614 = 0;
      }

      if (this.field1614 >= var5) {
         if (this.field1612 >= 0) {
            this.method2311();
            this.method4014();
            return;
         }

         this.field1614 = var5 - 1;
      }

      this.field1614 += this.field1612 * var1;
      if (this.field1618 < 0) {
         if (!this.field1620) {
            if (this.field1612 < 0) {
               if (this.field1614 >= var3) {
                  return;
               }

               this.field1614 = var4 - 1 - (var4 - 1 - this.field1614) % var6;
            } else {
               if (this.field1614 < var4) {
                  return;
               }

               this.field1614 = var3 + (this.field1614 - var3) % var6;
            }
         } else {
            if (this.field1612 < 0) {
               if (this.field1614 >= var3) {
                  return;
               }

               this.field1614 = var3 + var3 - 1 - this.field1614;
               this.field1612 = -this.field1612;
            }

            while(this.field1614 >= var4) {
               this.field1614 = var4 + var4 - 1 - this.field1614;
               this.field1612 = -this.field1612;
               if (this.field1614 >= var3) {
                  return;
               }

               this.field1614 = var3 + var3 - 1 - this.field1614;
               this.field1612 = -this.field1612;
            }
         }
      } else {
         if (this.field1618 > 0) {
            if (this.field1620) {
               label113: {
                  if (this.field1612 < 0) {
                     if (this.field1614 >= var3) {
                        return;
                     }

                     this.field1614 = var3 + var3 - 1 - this.field1614;
                     this.field1612 = -this.field1612;
                     if (--this.field1618 == 0) {
                        break label113;
                     }
                  }

                  do {
                     if (this.field1614 < var4) {
                        return;
                     }

                     this.field1614 = var4 + var4 - 1 - this.field1614;
                     this.field1612 = -this.field1612;
                     if (--this.field1618 == 0) {
                        break;
                     }

                     if (this.field1614 >= var3) {
                        return;
                     }

                     this.field1614 = var3 + var3 - 1 - this.field1614;
                     this.field1612 = -this.field1612;
                  } while(--this.field1618 != 0);
               }
            } else {
               int var7;
               if (this.field1612 < 0) {
                  if (this.field1614 >= var3) {
                     return;
                  }

                  var7 = (var4 - 1 - this.field1614) / var6;
                  if (var7 < this.field1618) {
                     this.field1614 += var6 * var7;
                     this.field1618 -= var7;
                     return;
                  }

                  this.field1614 += var6 * this.field1618;
                  this.field1618 = 0;
               } else {
                  if (this.field1614 < var4) {
                     return;
                  }

                  var7 = (this.field1614 - var3) / var6;
                  if (var7 < this.field1618) {
                     this.field1614 -= var6 * var7;
                     this.field1618 -= var7;
                     return;
                  }

                  this.field1614 -= var6 * this.field1618;
                  this.field1618 = 0;
               }
            }
         }

         if (this.field1612 < 0) {
            if (this.field1614 < 0) {
               this.field1614 = -1;
               this.method2311();
               this.method4014();
            }
         } else if (this.field1614 >= var5) {
            this.field1614 = var5;
            this.method2311();
            this.method4014();
         }
      }

   }

   void method2302() {
      this.field1611 = this.field1613;
      this.field1616 = method2316(this.field1613, this.field1621);
      this.field1617 = method2396(this.field1613, this.field1621);
   }

   public synchronized void method2323(int var1) {
      int var2 = ((class105)super.field1641).field1535.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field1614 = var1;
   }

   protected class117 vmethod4337() {
      return null;
   }

   public boolean method2317() {
      return this.field1614 < 0 || this.field1614 >= ((class105)super.field1641).field1535.length << 8;
   }

   public synchronized void method2315(int var1) {
      if (this.field1612 < 0) {
         this.field1612 = -var1;
      } else {
         this.field1612 = var1;
      }

   }

   public synchronized void method2314(int var1) {
      if (var1 == 0) {
         this.method2347(0);
         this.method4014();
      } else if (this.field1616 == 0 && this.field1617 == 0) {
         this.field1622 = 0;
         this.field1613 = 0;
         this.field1611 = 0;
         this.method4014();
      } else {
         int var2 = -this.field1611;
         if (this.field1611 > var2) {
            var2 = this.field1611;
         }

         if (-this.field1616 > var2) {
            var2 = -this.field1616;
         }

         if (this.field1616 > var2) {
            var2 = this.field1616;
         }

         if (-this.field1617 > var2) {
            var2 = -this.field1617;
         }

         if (this.field1617 > var2) {
            var2 = this.field1617;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1622 = var1;
         this.field1613 = Integer.MIN_VALUE;
         this.field1623 = -this.field1611 / var1;
         this.field1624 = -this.field1616 / var1;
         this.field1625 = -this.field1617 / var1;
      }

   }

   void method2311() {
      if (this.field1622 != 0) {
         if (this.field1613 == Integer.MIN_VALUE) {
            this.field1613 = 0;
         }

         this.field1622 = 0;
         this.method2302();
      }

   }

   public boolean method2318() {
      return this.field1622 != 0;
   }

   public synchronized void method2310(boolean var1) {
      this.field1612 = (this.field1612 ^ this.field1612 >> 31) + (this.field1612 >>> 31);
      this.field1612 = -this.field1612;
   }

   protected class117 vmethod4336() {
      return null;
   }

   int vmethod2472() {
      int var1 = this.field1611 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field1618 == 0) {
         var1 -= var1 * this.field1614 / (((class105)super.field1641).field1535.length << 8);
      } else if (this.field1618 >= 0) {
         var1 -= var1 * this.field1619 / ((class105)super.field1641).field1535.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   int method2402(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field1622 > 0) {
            int var6 = var2 + this.field1622;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field1622 += var2;
            if (this.field1612 == -256 && (this.field1614 & 255) == 0) {
               if (class17.field297) {
                  var2 = method2338(0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1616, this.field1617, this.field1624, this.field1625, 0, var6, var3, this);
               } else {
                  var2 = method2337(((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1611, this.field1623, 0, var6, var3, this);
               }
            } else if (class17.field297) {
               var2 = method2342(0, 0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1616, this.field1617, this.field1624, this.field1625, 0, var6, var3, this, this.field1612, var5);
            } else {
               var2 = method2438(0, 0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1611, this.field1623, 0, var6, var3, this, this.field1612, var5);
            }

            this.field1622 -= var2;
            if (this.field1622 != 0) {
               return var2;
            }

            if (!this.method2301()) {
               continue;
            }

            return var4;
         }

         if (this.field1612 == -256 && (this.field1614 & 255) == 0) {
            if (class17.field297) {
               return method2330(0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1616, this.field1617, 0, var4, var3, this);
            }

            return method2340(((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1611, 0, var4, var3, this);
         }

         if (class17.field297) {
            return method2334(0, 0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1616, this.field1617, 0, var4, var3, this, this.field1612, var5);
         }

         return method2359(0, 0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1611, 0, var4, var3, this, this.field1612, var5);
      }
   }

   public synchronized int method2296() {
      return this.field1612 < 0 ? -this.field1612 : this.field1612;
   }

   boolean method2301() {
      int var1 = this.field1613;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method2316(var1, this.field1621);
         var2 = method2396(var1, this.field1621);
      }

      if (var1 == this.field1611 && var3 == this.field1616 && var2 == this.field1617) {
         if (this.field1613 == Integer.MIN_VALUE) {
            this.field1613 = 0;
            this.field1617 = 0;
            this.field1616 = 0;
            this.field1611 = 0;
            this.method4014();
            return true;
         } else {
            this.method2302();
            return false;
         }
      } else {
         if (this.field1611 < var1) {
            this.field1623 = 1;
            this.field1622 = var1 - this.field1611;
         } else if (this.field1611 > var1) {
            this.field1623 = -1;
            this.field1622 = this.field1611 - var1;
         } else {
            this.field1623 = 0;
         }

         if (this.field1616 < var3) {
            this.field1624 = 1;
            if (this.field1622 == 0 || this.field1622 > var3 - this.field1616) {
               this.field1622 = var3 - this.field1616;
            }
         } else if (this.field1616 > var3) {
            this.field1624 = -1;
            if (this.field1622 == 0 || this.field1622 > this.field1616 - var3) {
               this.field1622 = this.field1616 - var3;
            }
         } else {
            this.field1624 = 0;
         }

         if (this.field1617 < var2) {
            this.field1625 = 1;
            if (this.field1622 == 0 || this.field1622 > var2 - this.field1617) {
               this.field1622 = var2 - this.field1617;
            }
         } else if (this.field1617 > var2) {
            this.field1625 = -1;
            if (this.field1622 == 0 || this.field1622 > this.field1617 - var2) {
               this.field1622 = this.field1617 - var2;
            }
         } else {
            this.field1625 = 0;
         }

         return false;
      }
   }

   int method2324(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field1622 > 0) {
            int var6 = var2 + this.field1622;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field1622 += var2;
            if (this.field1612 == 256 && (this.field1614 & 255) == 0) {
               if (class17.field297) {
                  var2 = method2336(0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1616, this.field1617, this.field1624, this.field1625, 0, var6, var3, this);
               } else {
                  var2 = method2394(((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1611, this.field1623, 0, var6, var3, this);
               }
            } else if (class17.field297) {
               var2 = method2367(0, 0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1616, this.field1617, this.field1624, this.field1625, 0, var6, var3, this, this.field1612, var5);
            } else {
               var2 = method2339(0, 0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1611, this.field1623, 0, var6, var3, this, this.field1612, var5);
            }

            this.field1622 -= var2;
            if (this.field1622 != 0) {
               return var2;
            }

            if (!this.method2301()) {
               continue;
            }

            return var4;
         }

         if (this.field1612 == 256 && (this.field1614 & 255) == 0) {
            if (class17.field297) {
               return method2328(0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1616, this.field1617, 0, var4, var3, this);
            }

            return method2326(((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1611, 0, var4, var3, this);
         }

         if (class17.field297) {
            return method2443(0, 0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1616, this.field1617, 0, var4, var3, this, this.field1612, var5);
         }

         return method2299(0, 0, ((class105)super.field1641).field1535, var1, this.field1614, var2, this.field1611, 0, var4, var3, this, this.field1612, var5);
      }
   }

   public synchronized int method2307() {
      return this.field1613 == Integer.MIN_VALUE ? 0 : this.field1613;
   }

   public synchronized void method2303(int var1) {
      this.field1618 = var1;
   }

   protected int vmethod4338() {
      return this.field1613 == 0 && this.field1622 == 0 ? 0 : 1;
   }

   public synchronized void method2312(int var1, int var2) {
      this.method2313(var1, var2, this.method2436());
   }

   public synchronized void method2304(int var1) {
      this.method2306(var1 << 6, this.method2436());
   }

   static int method2316(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int method2396(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   static int method2299(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class115 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var14;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var14 = var5++;
         var3[var14] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var14 = var5++;
         var3[var14] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field1614 = var4;
      return var5;
   }

   static int method2359(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class115 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
         var7 = var8;
      }

      int var13;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var13 = var5++;
         var3[var13] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var13 = var5++;
         var3[var13] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field1614 = var4;
      return var5;
   }

   static int method2326(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class115 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var9;
      for(var5 -= 3; var3 < var5; var1[var9] += var0[var2++] * var4) {
         var9 = var3++;
         var1[var9] += var0[var2++] * var4;
         var9 = var3++;
         var1[var9] += var0[var2++] * var4;
         var9 = var3++;
         var1[var9] += var0[var2++] * var4;
         var9 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var9] += var0[var2++] * var4) {
         var9 = var3++;
      }

      var8.field1614 = var2 << 8;
      return var3;
   }

   static int method2340(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class115 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var9;
      for(var5 -= 3; var3 < var5; var1[var9] += var0[var2--] * var4) {
         var9 = var3++;
         var1[var9] += var0[var2--] * var4;
         var9 = var3++;
         var1[var9] += var0[var2--] * var4;
         var9 = var3++;
         var1[var9] += var0[var2--] * var4;
         var9 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var9] += var0[var2--] * var4) {
         var9 = var3++;
      }

      var8.field1614 = var2 << 8;
      return var3;
   }

   static int method2443(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class115 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var15;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
         var15 = var5++;
         var3[var15] += var0 * var6 >> 6;
         var15 = var5++;
         var3[var15] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var15 = var5++;
         var3[var15] += var0 * var6 >> 6;
         var15 = var5++;
         var3[var15] += var0 * var7 >> 6;
      }

      var11.field1614 = var4;
      return var5 >> 1;
   }

   static int method2334(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class115 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var14;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var15 = var2[var1 - 1];
         var0 = (var2[var1] - var15) * (var4 & 255) + (var15 << 8);
         var14 = var5++;
         var3[var14] += var0 * var6 >> 6;
         var14 = var5++;
         var3[var14] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var14 = var5++;
         var3[var14] += var0 * var6 >> 6;
         var14 = var5++;
         var3[var14] += var0 * var7 >> 6;
      }

      var11.field1614 = var4;
      return var5 >> 1;
   }

   static int method2328(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class115 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var11;
      byte var12;
      for(var7 -= 6; var4 < var7; var2[var11] += var12 * var6) {
         var12 = var1[var3++];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
         var2[var11] += var12 * var6;
         var12 = var1[var3++];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
         var2[var11] += var12 * var6;
         var12 = var1[var3++];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
         var2[var11] += var12 * var6;
         var12 = var1[var3++];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var11] += var12 * var6) {
         var12 = var1[var3++];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
      }

      var10.field1614 = var3 << 8;
      return var4 >> 1;
   }

   static int method2330(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class115 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var11;
      byte var12;
      for(var7 -= 6; var4 < var7; var2[var11] += var12 * var6) {
         var12 = var1[var3--];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
         var2[var11] += var12 * var6;
         var12 = var1[var3--];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
         var2[var11] += var12 * var6;
         var12 = var1[var3--];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
         var2[var11] += var12 * var6;
         var12 = var1[var3--];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var11] += var12 * var6) {
         var12 = var1[var3--];
         var11 = var4++;
         var2[var11] += var12 * var5;
         var11 = var4++;
      }

      var10.field1614 = var3 << 8;
      return var4 >> 1;
   }

   static int method2339(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class115 var11, int var12, int var13) {
      var11.field1616 -= var11.field1624 * var5;
      var11.field1617 -= var11.field1625 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var15;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var15 = var5++;
         var3[var15] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var15 = var5++;
         var3[var15] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1616 += var11.field1624 * var5;
      var11.field1617 += var11.field1625 * var5;
      var11.field1611 = var6;
      var11.field1614 = var4;
      return var5;
   }

   static int method2438(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class115 var11, int var12, int var13) {
      var11.field1616 -= var11.field1624 * var5;
      var11.field1617 -= var11.field1625 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var14;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var15 = var2[var1 - 1];
         var14 = var5++;
         var3[var14] += ((var15 << 8) + (var2[var1] - var15) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var14 = var5++;
         var3[var14] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1616 += var11.field1624 * var5;
      var11.field1617 += var11.field1625 * var5;
      var11.field1611 = var6;
      var11.field1614 = var4;
      return var5;
   }

   static int method2394(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class115 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field1616 += var9.field1624 * (var6 - var3);
      var9.field1617 += var9.field1625 * (var6 - var3);

      int var10;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10 = var3++;
         var1[var10] += var0[var2++] * var4;
         var4 += var5;
         var10 = var3++;
         var1[var10] += var0[var2++] * var4;
         var4 += var5;
         var10 = var3++;
         var1[var10] += var0[var2++] * var4;
         var4 += var5;
         var10 = var3++;
         var1[var10] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10 = var3++;
         var1[var10] += var0[var2++] * var4;
      }

      var9.field1611 = var4 >> 2;
      var9.field1614 = var2 << 8;
      return var3;
   }

   static int method2337(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class115 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field1616 += var9.field1624 * (var6 - var3);
      var9.field1617 += var9.field1625 * (var6 - var3);

      int var10;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10 = var3++;
         var1[var10] += var0[var2--] * var4;
         var4 += var5;
         var10 = var3++;
         var1[var10] += var0[var2--] * var4;
         var4 += var5;
         var10 = var3++;
         var1[var10] += var0[var2--] * var4;
         var4 += var5;
         var10 = var3++;
         var1[var10] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10 = var3++;
         var1[var10] += var0[var2--] * var4;
      }

      var9.field1611 = var4 >> 2;
      var9.field1614 = var2 << 8;
      return var3;
   }

   static int method2367(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class115 var13, int var14, int var15) {
      var13.field1611 -= var5 * var13.field1623;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var17;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
         var17 = var5++;
         var3[var17] += var0 * var6 >> 6;
         var6 += var8;
         var17 = var5++;
         var3[var17] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var17 = var5++;
         var3[var17] += var0 * var6 >> 6;
         var6 += var8;
         var17 = var5++;
         var3[var17] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1611 += var13.field1623 * var5;
      var13.field1616 = var6;
      var13.field1617 = var7;
      var13.field1614 = var4;
      return var5;
   }

   static int method2342(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class115 var13, int var14, int var15) {
      var13.field1611 -= var5 * var13.field1623;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var16;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var17 = var2[var1 - 1];
         var0 = (var2[var1] - var17) * (var4 & 255) + (var17 << 8);
         var16 = var5++;
         var3[var16] += var0 * var6 >> 6;
         var6 += var8;
         var16 = var5++;
         var3[var16] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var16 = var5++;
         var3[var16] += var0 * var6 >> 6;
         var6 += var8;
         var16 = var5++;
         var3[var16] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1611 += var13.field1623 * var5;
      var13.field1616 = var6;
      var13.field1617 = var7;
      var13.field1614 = var4;
      return var5;
   }

   static int method2336(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class115 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field1611 += var12.field1623 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var14;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
      }

      var12.field1616 = var5 >> 2;
      var12.field1617 = var6 >> 2;
      var12.field1614 = var3 << 8;
      return var4 >> 1;
   }

   static int method2338(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class115 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field1611 += var12.field1623 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var14;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var14 = var4++;
         var2[var14] += var13 * var5;
         var5 += var7;
         var14 = var4++;
         var2[var14] += var13 * var6;
      }

      var12.field1616 = var5 >> 2;
      var12.field1617 = var6 >> 2;
      var12.field1614 = var3 << 8;
      return var4 >> 1;
   }

   public static class115 method2446(class105 var0, int var1, int var2, int var3) {
      return var0.field1535 != null && var0.field1535.length != 0 ? new class115(var0, var1, var2, var3) : null;
   }

   public static class115 method2300(class105 var0, int var1, int var2) {
      return var0.field1535 != null && var0.field1535.length != 0 ? new class115(var0, (int)((long)var0.field1536 * 256L * (long)var1 / (long)(class317.field3927 * 100)), var2 << 6) : null;
   }
}

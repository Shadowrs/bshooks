public final class class331 extends class327 {
   public int field3982;
   public int field3980;
   public int field3979;
   public int[] field3986;
   public int field3978;
   public int field3984;
   int field3977;

   public class331(int[] var1, int var2, int var3) {
      this.field3986 = var1;
      this.field3978 = this.field3982 = var2;
      this.field3979 = this.field3984 = var3;
      this.field3977 = 0;
      this.field3980 = 0;
   }

   public class331(int var1, int var2) {
      this(new int[var2 * var1], var1, var2);
   }

   class331() {
   }

   public void method5865(int var1, int var2) {
      var1 += this.field3980;
      var2 += this.field3977;
      int var3 = var1 + var2 * class327.field3954;
      int var4 = 0;
      int var5 = this.field3979;
      int var6 = this.field3978;
      int var7 = class327.field3954 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class327.field3955) {
         var9 = class327.field3955 - var2;
         var5 -= var9;
         var2 = class327.field3955;
         var4 += var9 * var6;
         var3 += var9 * class327.field3954;
      }

      if (var5 + var2 > class327.field3956) {
         var5 -= var5 + var2 - class327.field3956;
      }

      if (var1 < class327.field3952) {
         var9 = class327.field3952 - var1;
         var6 -= var9;
         var1 = class327.field3952;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 + var1 > class327.field3953) {
         var9 = var6 + var1 - class327.field3953;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method5870(class327.field3958, this.field3986, 0, var4, var3, var6, var5, var7, var8);
      }

   }

   void method5889(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.field3980 << 4;
         var2 -= this.field3977 << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = var10 * -var1 + -var2 * var9;
         int var12 = -var2 * var10 + var9 * -(-var1);
         int var13 = var10 * ((this.field3978 << 4) - var1) + -var2 * var9;
         int var14 = var9 * -((this.field3978 << 4) - var1) + -var2 * var10;
         int var15 = ((this.field3979 << 4) - var2) * var9 + var10 * -var1;
         int var16 = ((this.field3979 << 4) - var2) * var10 + var9 * -(-var1);
         int var17 = ((this.field3979 << 4) - var2) * var9 + var10 * ((this.field3978 << 4) - var1);
         int var18 = ((this.field3979 << 4) - var2) * var10 + var9 * -((this.field3978 << 4) - var1);
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < class327.field3952) {
            var19 = class327.field3952;
         }

         if (var20 > class327.field3953) {
            var20 = class327.field3953;
         }

         if (var21 < class327.field3955) {
            var21 = class327.field3955;
         }

         if (var22 > class327.field3956) {
            var22 = class327.field3956;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var19 + var21 * class327.field3954;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var29 * var27 >> 4) + (var2 << 8);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var32 = var22; var32 < 0; var23 += class327.field3954) {
                        var33 = var23;
                        var34 = var30;
                        var35 = var31;
                        var36 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.field3978 << 12) < 0 && var31 - (this.field3979 << 12) < 0) {
                           for(; var36 < 0; ++var36) {
                              var38 = this.field3986[(var34 >> 12) + (var35 >> 12) * this.field3978];
                              if (var38 != 0) {
                                 class327.field3958[var33++] = var38;
                              } else {
                                 ++var33;
                              }
                           }
                        }

                        ++var32;
                     }
                  } else if (var26 < 0) {
                     for(var32 = var22; var32 < 0; var23 += class327.field3954) {
                        var33 = var23;
                        var34 = var30;
                        var35 = (var28 * var26 >> 4) + var31;
                        var36 = var20;
                        if (var30 >= 0 && var30 - (this.field3978 << 12) < 0) {
                           if ((var37 = var35 - (this.field3979 << 12)) >= 0) {
                              var37 = (var26 - var37) / var26;
                              var36 = var20 + var37;
                              var35 += var26 * var37;
                              var33 = var23 + var37;
                           }

                           if ((var37 = (var35 - var26) / var26) > var36) {
                              var36 = var37;
                           }

                           while(var36 < 0) {
                              var38 = this.field3986[(var34 >> 12) + (var35 >> 12) * this.field3978];
                              if (var38 != 0) {
                                 class327.field3958[var33++] = var38;
                              } else {
                                 ++var33;
                              }

                              var35 += var26;
                              ++var36;
                           }
                        }

                        ++var32;
                        var30 -= var26;
                     }
                  } else {
                     for(var32 = var22; var32 < 0; var23 += class327.field3954) {
                        var33 = var23;
                        var34 = var30;
                        var35 = (var28 * var26 >> 4) + var31;
                        var36 = var20;
                        if (var30 >= 0 && var30 - (this.field3978 << 12) < 0) {
                           if (var35 < 0) {
                              var37 = (var26 - 1 - var35) / var26;
                              var36 = var20 + var37;
                              var35 += var26 * var37;
                              var33 = var23 + var37;
                           }

                           if ((var37 = (var35 + 1 - (this.field3979 << 12) - var26) / var26) > var36) {
                              var36 = var37;
                           }

                           while(var36 < 0) {
                              var38 = this.field3986[(var34 >> 12) + (var35 >> 12) * this.field3978];
                              if (var38 != 0) {
                                 class327.field3958[var33++] = var38;
                              } else {
                                 ++var33;
                              }

                              var35 += var26;
                              ++var36;
                           }
                        }

                        ++var32;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var32 = var22; var32 < 0; var23 += class327.field3954) {
                        var33 = var23;
                        var34 = (var28 * var27 >> 4) + var30;
                        var35 = var31;
                        var36 = var20;
                        if (var31 >= 0 && var31 - (this.field3979 << 12) < 0) {
                           if ((var37 = var34 - (this.field3978 << 12)) >= 0) {
                              var37 = (var27 - var37) / var27;
                              var36 = var20 + var37;
                              var34 += var27 * var37;
                              var33 = var23 + var37;
                           }

                           if ((var37 = (var34 - var27) / var27) > var36) {
                              var36 = var37;
                           }

                           while(var36 < 0) {
                              var38 = this.field3986[(var34 >> 12) + (var35 >> 12) * this.field3978];
                              if (var38 != 0) {
                                 class327.field3958[var33++] = var38;
                              } else {
                                 ++var33;
                              }

                              var34 += var27;
                              ++var36;
                           }
                        }

                        ++var32;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var32 = var22; var32 < 0; var23 += class327.field3954) {
                        var33 = var23;
                        var34 = (var28 * var27 >> 4) + var30;
                        var35 = (var28 * var26 >> 4) + var31;
                        var36 = var20;
                        if ((var37 = var34 - (this.field3978 << 12)) >= 0) {
                           var37 = (var27 - var37) / var27;
                           var36 = var20 + var37;
                           var34 += var27 * var37;
                           var35 += var26 * var37;
                           var33 = var23 + var37;
                        }

                        if ((var37 = (var34 - var27) / var27) > var36) {
                           var36 = var37;
                        }

                        if ((var37 = var35 - (this.field3979 << 12)) >= 0) {
                           var37 = (var26 - var37) / var26;
                           var36 += var37;
                           var34 += var27 * var37;
                           var35 += var26 * var37;
                           var33 += var37;
                        }

                        if ((var37 = (var35 - var26) / var26) > var36) {
                           var36 = var37;
                        }

                        while(var36 < 0) {
                           var38 = this.field3986[(var34 >> 12) + (var35 >> 12) * this.field3978];
                           if (var38 != 0) {
                              class327.field3958[var33++] = var38;
                           } else {
                              ++var33;
                           }

                           var34 += var27;
                           var35 += var26;
                           ++var36;
                        }

                        ++var32;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var32 = var22; var32 < 0; var23 += class327.field3954) {
                        var33 = var23;
                        var34 = (var28 * var27 >> 4) + var30;
                        var35 = (var28 * var26 >> 4) + var31;
                        var36 = var20;
                        if ((var37 = var34 - (this.field3978 << 12)) >= 0) {
                           var37 = (var27 - var37) / var27;
                           var36 = var20 + var37;
                           var34 += var27 * var37;
                           var35 += var26 * var37;
                           var33 = var23 + var37;
                        }

                        if ((var37 = (var34 - var27) / var27) > var36) {
                           var36 = var37;
                        }

                        if (var35 < 0) {
                           var37 = (var26 - 1 - var35) / var26;
                           var36 += var37;
                           var34 += var27 * var37;
                           var35 += var26 * var37;
                           var33 += var37;
                        }

                        if ((var37 = (var35 + 1 - (this.field3979 << 12) - var26) / var26) > var36) {
                           var36 = var37;
                        }

                        while(var36 < 0) {
                           var38 = this.field3986[(var34 >> 12) + (var35 >> 12) * this.field3978];
                           if (var38 != 0) {
                              class327.field3958[var33++] = var38;
                           } else {
                              ++var33;
                           }

                           var34 += var27;
                           var35 += var26;
                           ++var36;
                        }

                        ++var32;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var32 = var22; var32 < 0; var23 += class327.field3954) {
                     var33 = var23;
                     var34 = (var28 * var27 >> 4) + var30;
                     var35 = var31;
                     var36 = var20;
                     if (var31 >= 0 && var31 - (this.field3979 << 12) < 0) {
                        if (var34 < 0) {
                           var37 = (var27 - 1 - var34) / var27;
                           var36 = var20 + var37;
                           var34 += var27 * var37;
                           var33 = var23 + var37;
                        }

                        if ((var37 = (var34 + 1 - (this.field3978 << 12) - var27) / var27) > var36) {
                           var36 = var37;
                        }

                        while(var36 < 0) {
                           var38 = this.field3986[(var34 >> 12) + (var35 >> 12) * this.field3978];
                           if (var38 != 0) {
                              class327.field3958[var33++] = var38;
                           } else {
                              ++var33;
                           }

                           var34 += var27;
                           ++var36;
                        }
                     }

                     ++var32;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var32 = var22; var32 < 0; var23 += class327.field3954) {
                     var33 = var23;
                     var34 = (var28 * var27 >> 4) + var30;
                     var35 = (var28 * var26 >> 4) + var31;
                     var36 = var20;
                     if (var34 < 0) {
                        var37 = (var27 - 1 - var34) / var27;
                        var36 = var20 + var37;
                        var34 += var27 * var37;
                        var35 += var26 * var37;
                        var33 = var23 + var37;
                     }

                     if ((var37 = (var34 + 1 - (this.field3978 << 12) - var27) / var27) > var36) {
                        var36 = var37;
                     }

                     if ((var37 = var35 - (this.field3979 << 12)) >= 0) {
                        var37 = (var26 - var37) / var26;
                        var36 += var37;
                        var34 += var27 * var37;
                        var35 += var26 * var37;
                        var33 += var37;
                     }

                     if ((var37 = (var35 - var26) / var26) > var36) {
                        var36 = var37;
                     }

                     while(var36 < 0) {
                        var38 = this.field3986[(var34 >> 12) + (var35 >> 12) * this.field3978];
                        if (var38 != 0) {
                           class327.field3958[var33++] = var38;
                        } else {
                           ++var33;
                        }

                        var34 += var27;
                        var35 += var26;
                        ++var36;
                     }

                     ++var32;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var32 = var22; var32 < 0; var23 += class327.field3954) {
                     var33 = var23;
                     var34 = (var28 * var27 >> 4) + var30;
                     var35 = (var28 * var26 >> 4) + var31;
                     var36 = var20;
                     if (var34 < 0) {
                        var37 = (var27 - 1 - var34) / var27;
                        var36 = var20 + var37;
                        var34 += var27 * var37;
                        var35 += var26 * var37;
                        var33 = var23 + var37;
                     }

                     if ((var37 = (var34 + 1 - (this.field3978 << 12) - var27) / var27) > var36) {
                        var36 = var37;
                     }

                     if (var35 < 0) {
                        var37 = (var26 - 1 - var35) / var26;
                        var36 += var37;
                        var34 += var27 * var37;
                        var35 += var26 * var37;
                        var33 += var37;
                     }

                     if ((var37 = (var35 + 1 - (this.field3979 << 12) - var26) / var26) > var36) {
                        var36 = var37;
                     }

                     while(var36 < 0) {
                        var38 = this.field3986[(var34 >> 12) + (var35 >> 12) * this.field3978];
                        if (var38 != 0) {
                           class327.field3958[var33++] = var38;
                        } else {
                           ++var33;
                        }

                        var34 += var27;
                        var35 += var26;
                        ++var36;
                     }

                     ++var32;
                     var30 -= var26;
                     var31 += var27;
                  }
               }
            }
         }
      }

   }

   public void method5871(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.field3978;
         int var6 = this.field3979;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field3982;
         int var10 = this.field3984;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (this.field3980 > 0) {
            var13 = (var11 + (this.field3980 << 16) - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field3980 << 16);
         }

         if (this.field3977 > 0) {
            var13 = (var12 + (this.field3977 << 16) - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field3977 << 16);
         }

         if (var5 < var9) {
            var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
         }

         if (var6 < var10) {
            var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         var13 = var1 + var2 * class327.field3954;
         int var14 = class327.field3954 - var3;
         if (var2 + var4 > class327.field3956) {
            var4 -= var2 + var4 - class327.field3956;
         }

         int var15;
         if (var2 < class327.field3955) {
            var15 = class327.field3955 - var2;
            var4 -= var15;
            var13 += var15 * class327.field3954;
            var8 += var12 * var15;
         }

         if (var3 + var1 > class327.field3953) {
            var15 = var3 + var1 - class327.field3953;
            var3 -= var15;
            var14 += var15;
         }

         if (var1 < class327.field3952) {
            var15 = class327.field3952 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         method5872(class327.field3958, this.field3986, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }

   }

   public void method5890(int var1, int var2, int var3, int var4) {
      if (var3 <= this.field3982 && var4 <= this.field3984) {
         int var5 = var3 * this.field3980 / this.field3982 + var1;
         int var6 = (var3 * (this.field3980 + this.field3978) + this.field3982 - 1) / this.field3982 + var1;
         int var7 = var2 + var4 * this.field3977 / this.field3984;
         int var8 = var2 + (this.field3984 + (this.field3977 + this.field3979) * var4 - 1) / this.field3984;
         if (var5 < class327.field3952) {
            var5 = class327.field3952;
         }

         if (var6 > class327.field3953) {
            var6 = class327.field3953;
         }

         if (var7 < class327.field3955) {
            var7 = class327.field3955;
         }

         if (var8 > class327.field3956) {
            var8 = class327.field3956;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var5 + var7 * class327.field3954;
            int var10 = class327.field3954 - (var6 - var5);
            if (var9 < class327.field3958.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field3982 / var3 - (this.field3980 << 4);
                     int var16 = (var13 + 16) * this.field3982 / var3 - (this.field3980 << 4);
                     int var17 = var14 * this.field3984 / var4 - (this.field3977 << 4);
                     int var18 = (var14 + 16) * this.field3984 / var4 - (this.field3977 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.field3978 << 4) {
                           var16 = this.field3978 << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.field3979 << 4) {
                           var18 = this.field3979 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field3986[var30 + var28 * this.field3978];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += var32 * (var31 >> 16 & 255);
                                 var25 += var32 * (var31 >> 8 & 255);
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           var28 = var26 / var27 + (var24 / var27 << 16) + (var25 / var27 << 8);
                           if (var28 == 0) {
                              var28 = 1;
                           }

                           class327.field3958[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }
            }
         }

      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5868(int var1, int var2) {
      var1 += this.field3980;
      var2 += this.field3977;
      int var3 = var1 + var2 * class327.field3954;
      int var4 = 0;
      int var5 = this.field3979;
      int var6 = this.field3978;
      int var7 = class327.field3954 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class327.field3955) {
         var9 = class327.field3955 - var2;
         var5 -= var9;
         var2 = class327.field3955;
         var4 += var9 * var6;
         var3 += var9 * class327.field3954;
      }

      if (var5 + var2 > class327.field3956) {
         var5 -= var5 + var2 - class327.field3956;
      }

      if (var1 < class327.field3952) {
         var9 = class327.field3952 - var1;
         var6 -= var9;
         var1 = class327.field3952;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 + var1 > class327.field3953) {
         var9 = var6 + var1 - class327.field3953;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method5921(class327.field3958, this.field3986, var4, var3, var6, var5, var7, var8);
      }

   }

   public void method5903() {
      class327.method5731(this.field3986, this.field3978, this.field3979);
   }

   public class331 method5861() {
      class331 var1 = new class331(this.field3982, this.field3984);

      for(int var2 = 0; var2 < this.field3979; ++var2) {
         for(int var3 = 0; var3 < this.field3978; ++var3) {
            var1.field3986[var3 + (var2 + this.field3977) * this.field3982 + this.field3980] = this.field3986[var3 + var2 * this.field3978];
         }
      }

      return var1;
   }

   public void method5905() {
      int[] var1 = new int[this.field3978 * this.field3979];
      int var2 = 0;

      for(int var3 = this.field3979 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.field3978; ++var4) {
            var1[var2++] = this.field3986[var4 + var3 * this.field3978];
         }
      }

      this.field3986 = var1;
      this.field3977 = this.field3984 - this.field3979 - this.field3977;
   }

   public void method5888() {
      int[] var1 = new int[this.field3978 * this.field3979];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field3979; ++var3) {
         for(int var4 = this.field3978 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.field3986[var4 + var3 * this.field3978];
         }
      }

      this.field3986 = var1;
      this.field3980 = this.field3982 - this.field3978 - this.field3980;
   }

   public void method5884(int var1) {
      if (this.field3978 != this.field3982 || this.field3979 != this.field3984) {
         int var2 = var1;
         if (var1 > this.field3980) {
            var2 = this.field3980;
         }

         int var3 = var1;
         if (var1 + this.field3980 + this.field3978 > this.field3982) {
            var3 = this.field3982 - this.field3980 - this.field3978;
         }

         int var4 = var1;
         if (var1 > this.field3977) {
            var4 = this.field3977;
         }

         int var5 = var1;
         if (var1 + this.field3977 + this.field3979 > this.field3984) {
            var5 = this.field3984 - this.field3977 - this.field3979;
         }

         int var6 = var2 + var3 + this.field3978;
         int var7 = var4 + var5 + this.field3979;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.field3979; ++var9) {
            for(int var10 = 0; var10 < this.field3978; ++var10) {
               var8[var6 * (var9 + var4) + var10 + var2] = this.field3986[var10 + var9 * this.field3978];
            }
         }

         this.field3986 = var8;
         this.field3978 = var6;
         this.field3979 = var7;
         this.field3980 -= var2;
         this.field3977 -= var4;
      }

   }

   public void method5939(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field3978;
         int var7 = this.field3979;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field3982;
         int var11 = this.field3984;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.field3980 > 0) {
            var14 = (var12 + (this.field3980 << 16) - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field3980 << 16);
         }

         if (this.field3977 > 0) {
            var14 = (var13 + (this.field3977 << 16) - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field3977 << 16);
         }

         if (var6 < var10) {
            var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         if (var7 < var11) {
            var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
         }

         var14 = var1 + var2 * class327.field3954;
         int var15 = class327.field3954 - var3;
         if (var2 + var4 > class327.field3956) {
            var4 -= var2 + var4 - class327.field3956;
         }

         int var16;
         if (var2 < class327.field3955) {
            var16 = class327.field3955 - var2;
            var4 -= var16;
            var14 += var16 * class327.field3954;
            var9 += var13 * var16;
         }

         if (var3 + var1 > class327.field3953) {
            var16 = var3 + var1 - class327.field3953;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < class327.field3952) {
            var16 = class327.field3952 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if (var5 == 256) {
            method5883(0, 0, 0, var8, this.field3986, class327.field3958, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            method5864(0, 0, 0, var8, this.field3986, class327.field3958, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }
      }

   }

   public void method5879(int var1, int var2, int var3) {
      var1 += this.field3980;
      var2 += this.field3977;
      int var4 = var1 + var2 * class327.field3954;
      int var5 = 0;
      int var6 = this.field3979;
      int var7 = this.field3978;
      int var8 = class327.field3954 - var7;
      int var9 = 0;
      int var10;
      if (var2 < class327.field3955) {
         var10 = class327.field3955 - var2;
         var6 -= var10;
         var2 = class327.field3955;
         var5 += var10 * var7;
         var4 += var10 * class327.field3954;
      }

      if (var6 + var2 > class327.field3956) {
         var6 -= var6 + var2 - class327.field3956;
      }

      if (var1 < class327.field3952) {
         var10 = class327.field3952 - var1;
         var7 -= var10;
         var1 = class327.field3952;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 + var1 > class327.field3953) {
         var10 = var7 + var1 - class327.field3953;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            method5880(0, 0, 0, class327.field3958, this.field3986, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method5881(0, 0, 0, class327.field3958, this.field3986, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }
      }

   }

   public void method5866(int var1) {
      int[] var2 = new int[this.field3978 * this.field3979];
      int var3 = 0;

      for(int var4 = 0; var4 < this.field3979; ++var4) {
         for(int var5 = 0; var5 < this.field3978; ++var5) {
            int var6 = this.field3986[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.field3986[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.field3986[var3 - this.field3978] != 0) {
                  var6 = var1;
               } else if (var5 < this.field3978 - 1 && this.field3986[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.field3979 - 1 && this.field3986[var3 + this.field3978] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field3986 = var2;
   }

   public void method5863(int var1) {
      for(int var2 = this.field3979 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.field3978;

         for(int var4 = this.field3978 - 1; var4 > 0; --var4) {
            if (this.field3986[var4 + var3] == 0 && this.field3986[var4 + var3 - 1 - this.field3978] != 0) {
               this.field3986[var4 + var3] = var1;
            }
         }
      }

   }

   public void method5862() {
      if (this.field3978 != this.field3982 || this.field3979 != this.field3984) {
         int[] var1 = new int[this.field3982 * this.field3984];

         for(int var2 = 0; var2 < this.field3979; ++var2) {
            for(int var3 = 0; var3 < this.field3978; ++var3) {
               var1[var3 + (var2 + this.field3977) * this.field3982 + this.field3980] = this.field3986[var3 + var2 * this.field3978];
            }
         }

         this.field3986 = var1;
         this.field3978 = this.field3982;
         this.field3979 = this.field3984;
         this.field3980 = 0;
         this.field3977 = 0;
      }

   }

   public void method5886(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = var12 * var13 + var11 * var14 + (var5 << 16);
         int var16 = var12 * var14 - var11 * var13 + (var6 << 16);
         int var17 = var1 + var2 * class327.field3954;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               class327.field3958[var19++] = this.field3986[this.field3978 * (var21 >> 16) + (var20 >> 16)];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += class327.field3954;
         }
      } catch (Exception var22) {
         ;
      }

   }

   public void method5877(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field3978;
         int var7 = this.field3979;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field3982;
         int var11 = this.field3984;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.field3980 > 0) {
            var14 = (var12 + (this.field3980 << 16) - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field3980 << 16);
         }

         if (this.field3977 > 0) {
            var14 = (var13 + (this.field3977 << 16) - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field3977 << 16);
         }

         if (var6 < var10) {
            var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         if (var7 < var11) {
            var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
         }

         var14 = var1 + var2 * class327.field3954;
         int var15 = class327.field3954 - var3;
         if (var2 + var4 > class327.field3956) {
            var4 -= var2 + var4 - class327.field3956;
         }

         int var16;
         if (var2 < class327.field3955) {
            var16 = class327.field3955 - var2;
            var4 -= var16;
            var14 += var16 * class327.field3954;
            var9 += var13 * var16;
         }

         if (var3 + var1 > class327.field3953) {
            var16 = var3 + var1 - class327.field3953;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < class327.field3952) {
            var16 = class327.field3952 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         method5878(class327.field3958, this.field3986, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }

   }

   public void method5906(int var1, int var2, int var3, int var4) {
      this.method5889(this.field3982 << 3, this.field3984 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   public void method5875(int var1, int var2, int var3) {
      var1 += this.field3980;
      var2 += this.field3977;
      int var4 = var1 + var2 * class327.field3954;
      int var5 = 0;
      int var6 = this.field3979;
      int var7 = this.field3978;
      int var8 = class327.field3954 - var7;
      int var9 = 0;
      int var10;
      if (var2 < class327.field3955) {
         var10 = class327.field3955 - var2;
         var6 -= var10;
         var2 = class327.field3955;
         var5 += var10 * var7;
         var4 += var10 * class327.field3954;
      }

      if (var6 + var2 > class327.field3956) {
         var6 -= var6 + var2 - class327.field3956;
      }

      if (var1 < class327.field3952) {
         var10 = class327.field3952 - var1;
         var7 -= var10;
         var1 = class327.field3952;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 + var1 > class327.field3953) {
         var10 = var7 + var1 - class327.field3953;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         method5876(class327.field3958, this.field3986, 0, var5, var4, var7, var6, var8, var9, var3);
      }

   }

   public class331 method5924() {
      class331 var1 = new class331(this.field3978, this.field3979);
      var1.field3982 = this.field3982;
      var1.field3984 = this.field3984;
      var1.field3980 = this.field3982 - this.field3978 - this.field3980;
      var1.field3977 = this.field3977;

      for(int var2 = 0; var2 < this.field3979; ++var2) {
         for(int var3 = 0; var3 < this.field3978; ++var3) {
            var1.field3986[var3 + var2 * this.field3978] = this.field3986[var2 * this.field3978 + this.field3978 - 1 - var3];
         }
      }

      return var1;
   }

   public void method5885(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.field3979 <= var6 ? this.field3979 : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      if (this.field3978 + var1 <= var5) {
         int var12 = this.field3978;
      } else {
         int var10000 = var5 - var1;
      }

      int var13 = var3 + var11 + (var9 + var2 + var4) * class327.field3954 + var1;
      int var14 = var9 + var2;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var20;
         if (this.field3978 + var1 <= var16 + var17) {
            var20 = this.field3978;
         } else {
            var20 = var16 + var17 - var1;
         }

         for(int var21 = var19; var21 < var20; ++var21) {
            int var22 = this.field3986[var21 + var15 * this.field3978];
            if (var22 != 0) {
               class327.field3958[var18++] = var22;
            } else {
               ++var18;
            }
         }

         var13 += class327.field3954;
      }

   }

   public void method5887(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = var11 * var12 + var10 * var13 + (var5 << 16);
         int var15 = var11 * var13 - var10 * var12 + (var6 << 16);
         int var16 = var1 + var2 * class327.field3954;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.field3986[this.field3978 * (var19 >> 16) + (var18 >> 16)];
               if (var20 != 0) {
                  class327.field3958[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += class327.field3954;
         }
      } catch (Exception var21) {
         ;
      }

   }

   public void method5873(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.method5865(var1, var2);
      } else {
         var1 += this.field3980;
         var2 += this.field3977;
         int var5 = var1 + var2 * class327.field3954;
         int var6 = 0;
         int var7 = this.field3979;
         int var8 = this.field3978;
         int var9 = class327.field3954 - var8;
         int var10 = 0;
         int var11;
         if (var2 < class327.field3955) {
            var11 = class327.field3955 - var2;
            var7 -= var11;
            var2 = class327.field3955;
            var6 += var11 * var8;
            var5 += var11 * class327.field3954;
         }

         if (var7 + var2 > class327.field3956) {
            var7 -= var7 + var2 - class327.field3956;
         }

         if (var1 < class327.field3952) {
            var11 = class327.field3952 - var1;
            var8 -= var11;
            var1 = class327.field3952;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 + var1 > class327.field3953) {
            var11 = var8 + var1 - class327.field3953;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 > 0 && var7 > 0) {
            method5943(class327.field3958, this.field3986, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }

   }

   static void method5921(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            ;
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static void method5876(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var13 & 16711935) * var10 + var9 * (var2 & 16711935) & -16711936) + ((var2 & '\uff00') * var9 + var10 * (var13 & '\uff00') & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5870(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5880(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   static void method5881(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var13 * (var0 & 16711935);
               var0 = (var1 & -16711936) + (var13 * var0 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   static void method5943(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = var9 * (var2 & 16711935) & -16711936;
               var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = var10 + ((var12 | var13) >>> 8);
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5878(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = var11 * (var4 >> 16);

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & '\uff00') * var12 + var13 * (var18 & '\uff00') & 16711680) + ((var18 & 16711935) * var13 + var12 * (var2 & 16711935) & -16711936) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   static void method5872(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   static void method5883(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = var15 * (var9 >> 16);

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   static void method5864(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = var15 * (var9 >> 16);

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }
}

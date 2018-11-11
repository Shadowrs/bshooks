import java.io.EOFException;

public class class94 {
   public static int field1431;
   boolean field1429 = false;
   String[] field1430;
   int[] field1427;
   long field1425;
   boolean[] field1426;
   boolean[] field1428;

   class94() {
      this.field1427 = new int[class39.field502.method4563(19, -2070614960)];
      this.field1430 = new String[class39.field502.method4563(15, 481752456)];
      this.field1428 = new boolean[this.field1427.length];

      int var1;
      for(var1 = 0; var1 < this.field1427.length; ++var1) {
         class270 var2 = class12.method81(var1, 417172781);
         this.field1428[var1] = var2.field3475;
      }

      this.field1426 = new boolean[this.field1430.length];

      for(var1 = 0; var1 < this.field1430.length; ++var1) {
         class271 var5 = (class271)class271.field3478.method3929((long)var1);
         class271 var3;
         if (var5 != null) {
            var3 = var5;
         } else {
            byte[] var4 = class271.field3483.method4551(15, var1, 759867757);
            var5 = new class271();
            if (var4 != null) {
               var5.method4782(new class194(var4), 1507365460);
            }

            class271.field3478.method3932(var5, (long)var1);
            var3 = var5;
         }

         this.field1426[var1] = var3.field3482;
      }

      for(var1 = 0; var1 < this.field1427.length; ++var1) {
         this.field1427[var1] = -1;
      }

      this.method1986(-567129092);
   }

   class122 method1959(boolean var1, int var2) {
      return class139.method3072("2", class71.field816.field3353, var1, 992166807);
   }

   boolean method1958(int var1) {
      return this.field1429;
   }

   void method1960(byte var1) {
      class122 var2 = this.method1959(true, 1770610933);
      boolean var3 = false;

      try {
         label199: {
            try {
               var3 = true;
               int var4 = 3;
               int var5 = 0;

               int var6;
               for(var6 = 0; var6 < this.field1427.length; ++var6) {
                  if (this.field1428[var6] && this.field1427[var6] != -1) {
                     var4 += 6;
                     ++var5;
                  }
               }

               var4 += 2;
               var6 = 0;

               for(int var7 = 0; var7 < this.field1430.length; ++var7) {
                  if (this.field1426[var7] && this.field1430[var7] != null) {
                     var4 += 2 + class91.method1916(this.field1430[var7], -1368399566);
                     ++var6;
                  }
               }

               class194 var22 = new class194(var4);
               var22.addByte(1, (byte)-91);
               var22.addShort(var5, 1330380923);

               int var8;
               for(var8 = 0; var8 < this.field1427.length; ++var8) {
                  if (this.field1428[var8] && this.field1427[var8] != -1) {
                     var22.addShort(var8, 1472916820);
                     var22.addInt(this.field1427[var8], (byte)5);
                  }
               }

               var22.addShort(var6, 107780152);

               for(var8 = 0; var8 < this.field1430.length; ++var8) {
                  if (this.field1426[var8] && this.field1430[var8] != null) {
                     var22.addShort(var8, -201926294);
                     var22.addString1(this.field1430[var8], -1644114160);
                  }
               }

               var2.method2534(var22.field2566, 0, var22.field2565, 1679119576);
            } catch (Exception var20) {
               try {
                  var2.method2535((byte)-124);
                  var3 = false;
               } catch (Exception var19) {
                  var3 = false;
               }
               break label199;
            }

            try {
               var2.method2535((byte)-69);
               var3 = false;
            } catch (Exception var18) {
               var3 = false;
            }
         }
      } finally {
         if (var3) {
            try {
               var2.method2535((byte)-22);
            } catch (Exception var17) {
               ;
            }
         }

      }

      this.field1429 = false;
      this.field1425 = class6.method28(1358803598);
   }

   void method1986(int var1) {
      class122 var2 = this.method1959(false, 1309206126);
      boolean var3 = false;

      try {
         label224: {
            try {
               label244: {
                  var3 = true;
                  byte[] var4 = new byte[(int)var2.method2537(-1567046297)];

                  int var5;
                  for(int var6 = 0; var6 < var4.length; var6 += var5) {
                     var5 = var2.method2538(var4, var6, var4.length - var6, (byte)0);
                     if (var5 == -1) {
                        throw new EOFException();
                     }
                  }

                  class194 var32 = new class194(var4);
                  if (var32.field2566.length - var32.field2565 < 1) {
                     try {
                        var2.method2535((byte)-19);
                     } catch (Exception var28) {
                        ;
                     }

                     return;
                  }

                  int var7 = var32.getUByte(529337045);
                  if (var7 >= 0 && var7 <= 1) {
                     int var8 = var32.getUShort(-1208216487);

                     int var9;
                     int var10;
                     int var11;
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var32.getUShort(-1208216487);
                        var11 = var32.getInt(-1817376731);
                        if (this.field1428[var10]) {
                           this.field1427[var10] = var11;
                        }
                     }

                     var9 = var32.getUShort(-1208216487);
                     var10 = 0;

                     while(true) {
                        if (var10 >= var9) {
                           break label244;
                        }

                        var11 = var32.getUShort(-1208216487);
                        String var12 = var32.getString1(-778927800);
                        if (this.field1426[var11]) {
                           this.field1430[var11] = var12;
                        }

                        ++var10;
                     }
                  }

                  try {
                     var2.method2535((byte)-87);
                  } catch (Exception var29) {
                     ;
                  }

                  return;
               }
            } catch (Exception var30) {
               try {
                  var2.method2535((byte)-26);
                  var3 = false;
               } catch (Exception var27) {
                  var3 = false;
               }
               break label224;
            }

            try {
               var2.method2535((byte)-27);
               var3 = false;
            } catch (Exception var26) {
               var3 = false;
            }
         }
      } finally {
         if (var3) {
            try {
               var2.method2535((byte)-29);
            } catch (Exception var25) {
               ;
            }
         }

      }

      this.field1429 = false;
   }

   String method1957(int var1, int var2) {
      return this.field1430[var1];
   }

   int method1955(int var1, int var2) {
      return this.field1427[var1];
   }

   void method1954(int var1, int var2, byte var3) {
      this.field1427[var1] = var2;
      if (this.field1428[var1]) {
         this.field1429 = true;
      }

   }

   void method1956(int var1, String var2, int var3) {
      this.field1430[var1] = var2;
      if (this.field1426[var1]) {
         this.field1429 = true;
      }

   }

   void method1968(int var1) {
      int var2;
      for(var2 = 0; var2 < this.field1427.length; ++var2) {
         if (!this.field1428[var2]) {
            this.field1427[var2] = -1;
         }
      }

      for(var2 = 0; var2 < this.field1430.length; ++var2) {
         if (!this.field1426[var2]) {
            this.field1430[var2] = null;
         }
      }

   }

   void method1962(int var1) {
      if (this.field1429 && this.field1425 < class6.method28(1358803598) - 60000L) {
         this.method1960((byte)-30);
      }

   }

   static final void method1987(int var0, int var1) {
      class132.field1920[++class132.field1913 - 1] = var0;
   }
}

public class class40 {
   protected static boolean field508;
   class34 field509;
   public int field510;
   int field505;
   public class238 field506;
   public class238 field512;
   int field507;
   int field511;
   int field504;

   class40(int var1, class238 var2, class238 var3, class34 var4) {
      this.field510 = var1;
      this.field506 = var2;
      this.field512 = var3;
      this.field509 = var4;
      class269 var5 = class269.field3471[this.field510];
      class331 var6 = var5.method4753(false, -1665108496);
      if (var6 != null) {
         this.field507 = var6.field3978;
         this.field504 = var6.field3979;
      } else {
         this.field507 = 0;
         this.field504 = 0;
      }

   }

   boolean method562(int var1, int var2, int var3) {
      class269 var4 = class269.field3471[this.field510];
      switch(var4.field3466.field3689) {
      case 0:
         if (var1 < this.field505 || var1 >= this.field505 + this.field507) {
            return false;
         }
         break;
      case 1:
         if (var1 < this.field505 - this.field507 / 2 || var1 > this.field507 / 2 + this.field505) {
            return false;
         }
         break;
      case 2:
         if (var1 <= this.field505 - this.field507 || var1 > this.field505) {
            return false;
         }
      }

      switch(var4.field3467.field3433) {
      case 0:
         if (var2 < this.field511 - this.field504 / 2 || var2 > this.field504 / 2 + this.field511) {
            return false;
         }
         break;
      case 1:
         if (var2 < this.field511 || var2 >= this.field511 + this.field504) {
            return false;
         }
         break;
      case 2:
         if (var2 <= this.field511 - this.field504 || var2 > this.field511) {
            return false;
         }
      }

      return true;
   }

   boolean method573(int var1, int var2, int var3) {
      return this.field509 == null ? false : (var1 >= this.field505 - this.field509.field446 / 2 && var1 <= this.field509.field446 / 2 + this.field505 ? var2 >= this.field511 && var2 <= this.field509.field452 + this.field511 : false);
   }

   boolean method563(int var1, int var2, int var3) {
      return this.method562(var1, var2, -453936994) ? true : this.method573(var1, var2, -1305894451);
   }

   public static final void method575(class131 var0, int var1, int var2, int var3, int var4, byte var5) {
      class7.field229.method3984(new class10(var0, var1, var2, var3, var4));
   }

   protected static final void method576(int var0) {
      class164.field2177.vmethod3302(-1752267901);

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         class59.field667[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         class59.field664[var1] = 0L;
      }

      class59.field668 = 0;
   }

   static void method574(class77[] var0, int var1, int var2, int[] var3, int[] var4, byte var5) {
      if (var1 < var2) {
         int var6 = var1 - 1;
         int var7 = var2 + 1;
         int var8 = (var2 + var1) / 2;
         class77 var9 = var0[var8];
         var0[var8] = var0[var1];
         var0[var1] = var9;

         while(var6 < var7) {
            boolean var10 = true;

            int var11;
            int var12;
            int var13;
            do {
               --var7;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var7].field1232;
                     var13 = var9.field1232;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var7].field1228;
                     var13 = var9.field1228;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var7].method1614(867548888) ? 1 : 0;
                     var13 = var9.method1614(867548888) ? 1 : 0;
                  } else {
                     var12 = var0[var7].field1230;
                     var13 = var9.field1230;
                  }

                  if (var13 != var12) {
                     if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            var10 = true;

            do {
               ++var6;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var6].field1232;
                     var13 = var9.field1232;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var6].field1228;
                     var13 = var9.field1228;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var6].method1614(867548888) ? 1 : 0;
                     var13 = var9.method1614(867548888) ? 1 : 0;
                  } else {
                     var12 = var0[var6].field1230;
                     var13 = var9.field1230;
                  }

                  if (var13 != var12) {
                     if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            if (var6 < var7) {
               class77 var14 = var0[var6];
               var0[var6] = var0[var7];
               var0[var7] = var14;
            }
         }

         method574(var0, var1, var7, var3, var4, (byte)-113);
         method574(var0, var7 + 1, var2, var3, var4, (byte)61);
      }

   }

   static void method570(int var0) {
      class62.field722 = 99;
      class62.field733 = new byte[4][104][104];
      class62.field729 = new byte[4][104][104];
      class62.field724 = new byte[4][104][104];
      class164.field2183 = new byte[4][104][104];
      class62.field721 = new int[4][105][105];
      class62.field725 = new byte[4][105][105];
      class62.field719 = new int[105][105];
      class89.field1333 = new int[104];
      class1.field9 = new int[104];
      class204.field2613 = new int[104];
      class57.field648 = new int[104];
      class136.field1973 = new int[104];
   }

   static void method578(class242[] var0, class242 var1, boolean var2, int var3) {
      int var4 = var1.field2849 != 0 ? var1.field2849 : var1.field2826;
      int var5 = var1.field2838 != 0 ? var1.field2838 : var1.field2887;
      class130.method2679(var0, var1.field2814, var4, var5, var2, -1589097289);
      if (var1.field2938 != null) {
         class130.method2679(var1.field2938, var1.field2814, var4, var5, var2, -1589097289);
      }

      class67 var6 = (class67)client.field1017.method3981((long)var1.field2814);
      if (var6 != null) {
         class9.method61(var6.field773, var4, var5, var2, 1532265548);
      }

      if (var1.field2818 == 1337) {
         ;
      }

   }

   static final void method577(String var0, int var1, int var2) {
      class184 var3 = class141.method3078(class181.field2389, client.field902.field1475, (byte)-102);
      var3.field2500.addByte(class91.method1916(var0, -907820955) + 1, (byte)-63);
      var3.field2500.addReversedByte(var1, 827908482);
      var3.field2500.addString1(var0, -460087615);
      client.field902.method2036(var3, (byte)75);
   }

   static void method568(int var0, int var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      if (var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         class77 var9 = class141.field2058[var7];
         class141.field2058[var7] = class141.field2058[var1];
         class141.field2058[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            class77 var11 = class141.field2058[var10];
            int var12 = class30.method278(var11, var9, var2, var3, 601196409);
            int var13;
            if (var12 != 0) {
               if (var3) {
                  var13 = -var12;
               } else {
                  var13 = var12;
               }
            } else if (var4 == -1) {
               var13 = 0;
            } else {
               int var14 = class30.method278(var11, var9, var4, var5, 601196409);
               if (var5) {
                  var13 = -var14;
               } else {
                  var13 = var14;
               }
            }

            if (var13 <= 0) {
               class77 var15 = class141.field2058[var10];
               class141.field2058[var10] = class141.field2058[var8];
               class141.field2058[var8++] = var15;
            }
         }

         class141.field2058[var1] = class141.field2058[var8];
         class141.field2058[var8] = var9;
         method568(var0, var8 - 1, var2, var3, var4, var5, 570241823);
         method568(var8 + 1, var1, var2, var3, var4, var5, -489304788);
      }

   }
}

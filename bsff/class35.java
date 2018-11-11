import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class35 {
   public static class213 field458 = new class213(256, 256);
   public static class213 field470 = new class213(37748736, 256);
   static class238 field468 = new class238();
   static int field453;
   static int field461;
   List field471;
   LinkedList field462;
   int field459;
   HashMap field466;
   class22 field457;
   int field464;
   int field456;
   HashMap field467;
   int field463;

   class35(int var1, int var2, int var3, HashMap var4) {
      this.field459 = var1;
      this.field456 = var2;
      this.field462 = new LinkedList();
      this.field471 = new LinkedList();
      this.field466 = new HashMap();
      this.field463 = var3 | -16777216;
      this.field467 = var4;
   }

   void method410(int var1, int var2, class28 var3, int var4) {
      for(int var5 = 0; var5 < var3.field391; ++var5) {
         class31[] var6 = var3.field396[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            class31[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class31 var9 = var7[var8];
               if (class110.method2262(var9.field418, 541533633)) {
                  class282 var10 = class260.method4546(var9.field420, 218812496);
                  int var11 = var10.field3612 != 0 ? -3407872 : -3355444;
                  if (var9.field418 == class247.field2982.field2996) {
                     this.method427(var1, var2, var9.field419, var11, -1976692379);
                  }

                  if (var9.field418 == class247.field2975.field2996) {
                     this.method427(var1, var2, var9.field419, -3355444, -2089747095);
                     this.method427(var1, var2, var9.field419 + 1, var11, -2078695088);
                  }

                  if (var9.field418 == class247.field2976.field2996) {
                     if (var9.field419 == 0) {
                        class327.method5756(this.field464 * var1, this.field464 * (63 - var2), 1, var11);
                     }

                     if (var9.field419 == 1) {
                        class327.method5756(this.field464 + this.field464 * var1 - 1, this.field464 * (63 - var2), 1, var11);
                     }

                     if (var9.field419 == 2) {
                        class327.method5756(this.field464 * var1 + this.field464 - 1, this.field464 * (63 - var2) + this.field464 - 1, 1, var11);
                     }

                     if (var9.field419 == 3) {
                        class327.method5756(this.field464 * var1, this.field464 * (63 - var2) + this.field464 - 1, 1, var11);
                     }
                  }

                  if (var9.field418 == class247.field2977.field2996) {
                     int var12 = var9.field419 % 2;
                     int var13;
                     if (var12 == 0) {
                        for(var13 = 0; var13 < this.field464; ++var13) {
                           class327.method5756(var13 + this.field464 * var1, (64 - var2) * this.field464 - 1 - var13, 1, var11);
                        }
                     } else {
                        for(var13 = 0; var13 < this.field464; ++var13) {
                           class327.method5756(var13 + this.field464 * var1, var13 + this.field464 * (63 - var2), 1, var11);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method411(int var1, int var2, HashSet var3, int var4, short var5) {
      float var6 = (float)var4 / 64.0F;
      float var7 = var6 / 2.0F;
      Iterator var8 = this.field466.entrySet().iterator();

      while(var8.hasNext()) {
         Entry var9 = (Entry)var8.next();
         class238 var10 = (class238)var9.getKey();
         int var11 = (int)((float)var10.field2774 * var6 + (float)var1 - var7);
         int var12 = (int)((float)(var2 + var4) - (float)var10.field2776 * var6 - var7);
         class40 var13 = (class40)var9.getValue();
         if (var13 != null) {
            var13.field505 = var11;
            var13.field511 = var12;
            class269 var14 = class269.field3471[var13.field510];
            if (!var3.contains(var14.method4755(129877775))) {
               this.method518(var13, var11, var12, var6, (byte)3);
            }
         }
      }

   }

   void method409(int var1, int var2, class28 var3, class330[] var4, byte var5) {
      for(int var6 = 0; var6 < var3.field391; ++var6) {
         class31[] var7 = var3.field396[var6][var1][var2];
         if (var7 != null && var7.length != 0) {
            class31[] var8 = var7;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class31 var10 = var8[var9];
               if (!class13.method86(var10.field418, -1113535736)) {
                  int var11 = var10.field418;
                  boolean var12 = var11 == class247.field2993.field2996;
                  if (!var12) {
                     continue;
                  }
               }

               class282 var13 = class260.method4546(var10.field420, 479315366);
               if (var13.field3615 != -1) {
                  if (var13.field3615 != 46 && var13.field3615 != 52) {
                     var4[var13.field3615].method5844(this.field464 * var1, this.field464 * (63 - var2), this.field464 * 2, this.field464 * 2);
                  } else {
                     var4[var13.field3615].method5844(this.field464 * var1, this.field464 * (63 - var2), this.field464 * 2 + 1, this.field464 * 2 + 1);
                  }
               }
            }
         }
      }

   }

   class34 method509(class269 var1, int var2) {
      if (var1.field3455 != null && this.field467 != null && this.field467.get(class24.field347) != null) {
         class24 var3 = class24.method199(var1.field3449, 2038821774);
         if (var3 == null) {
            return null;
         } else {
            class311 var4 = (class311)this.field467.get(var3);
            if (var4 == null) {
               return null;
            } else {
               int var5 = var4.method5519(var1.field3455, 1000000);
               String[] var6 = new String[var5];
               var4.method5517(var1.field3455, (int[])null, var6);
               int var7 = var6.length * var4.field3891 / 2;
               int var8 = 0;
               String[] var9 = var6;

               for(int var10 = 0; var10 < var9.length; ++var10) {
                  String var11 = var9[var10];
                  int var12 = var4.method5590(var11);
                  if (var12 > var8) {
                     var8 = var12;
                  }
               }

               return new class34(var1.field3455, var8, var7, var3);
            }
         }
      } else {
         return null;
      }
   }

   void method417(int var1, int var2, HashSet var3, int var4, int var5) {
      float var6 = (float)var4 / 64.0F;
      Iterator var7 = this.field471.iterator();

      while(var7.hasNext()) {
         class40 var8 = (class40)var7.next();
         int var9 = var8.field512.field2774 % 64;
         int var10 = var8.field512.field2776 % 64;
         var8.field505 = (int)((float)var9 * var6 + (float)var1);
         var8.field511 = (int)((float)(63 - var10) * var6 + (float)var2);
         if (!var3.contains(var8.field510)) {
            this.method518(var8, var8.field505, var8.field511, var6, (byte)47);
         }
      }

   }

   void method419(class269 var1, int var2, int var3, byte var4) {
      class331 var5 = var1.method4753(false, -299054989);
      if (var5 != null) {
         int var6 = this.method514(var5, var1.field3466, 1546347288);
         int var7 = this.method421(var5, var1.field3467, 1035471215);
         var5.method5865(var6 + var2, var3 + var7);
      }

   }

   void method461(int var1, int var2, class28 var3, class47 var4, class33 var5, int var6) {
      int var7 = var3.field388[0][var1][var2] - 1;
      int var8 = var3.field393[0][var1][var2] - 1;
      if (var7 == -1 && var8 == -1) {
         class327.method5810(this.field464 * var1, this.field464 * (63 - var2), this.field464, this.field464, this.field463);
      }

      int var9 = 16711935;
      int var10;
      if (var8 != -1) {
         int var11 = this.field463;
         class286 var12 = class268.method4742(var8, 1539782344);
         if (var12 == null) {
            var10 = var11;
         } else if (var12.field3738 >= 0) {
            var10 = var12.field3738 | -16777216;
         } else {
            int var13;
            byte var14;
            int var15;
            int var16;
            if (var12.field3736 >= 0) {
               var13 = class134.field1944.vmethod3084(var12.field3736, 1638290134);
               var14 = 96;
               if (var13 == -2) {
                  var15 = 12345678;
               } else if (var13 == -1) {
                  if (var14 < 0) {
                     var14 = 0;
                  } else if (var14 > 127) {
                     var14 = 127;
                  }

                  var16 = 127 - var14;
                  var15 = var16;
               } else {
                  var16 = var14 * (var13 & 127) / 128;
                  if (var16 < 2) {
                     var16 = 2;
                  } else if (var16 > 126) {
                     var16 = 126;
                  }

                  var15 = var16 + (var13 & '\uff80');
               }

               var10 = class134.field1937[var15] | -16777216;
            } else if (var12.field3735 == 16711935) {
               var10 = var11;
            } else {
               var15 = class114.method2295(var12.field3743, var12.field3740, var12.field3745, -1281656114);
               var14 = 96;
               if (var15 == -2) {
                  var13 = 12345678;
               } else if (var15 == -1) {
                  if (var14 < 0) {
                     var14 = 0;
                  } else if (var14 > 127) {
                     var14 = 127;
                  }

                  var16 = 127 - var14;
                  var13 = var16;
               } else {
                  var16 = var14 * (var15 & 127) / 128;
                  if (var16 < 2) {
                     var16 = 2;
                  } else if (var16 > 126) {
                     var16 = 126;
                  }

                  var13 = var16 + (var15 & '\uff80');
               }

               var10 = class134.field1937[var13] | -16777216;
            }
         }

         var9 = var10;
      }

      if (var8 > -1 && var3.field394[0][var1][var2] == 0) {
         class327.method5810(this.field464 * var1, this.field464 * (63 - var2), this.field464, this.field464, var9);
      } else {
         var10 = this.method408(var1, var2, var3, var5, (byte)0);
         if (var8 == -1) {
            class327.method5810(this.field464 * var1, this.field464 * (63 - var2), this.field464, this.field464, var10);
         } else {
            var4.method699(this.field464 * var1, this.field464 * (63 - var2), var10, var9, this.field464, this.field464, var3.field394[0][var1][var2], var3.field395[0][var1][var2], (byte)-53);
         }
      }

   }

   class33 method404(class35[] var1, int var2) {
      class44 var3 = new class44(64, 64);
      if (this.field457 != null) {
         this.method406(0, 0, 64, 64, this.field457, var3, 1993208575);
      } else {
         Iterator var4 = this.field462.iterator();

         while(var4.hasNext()) {
            class46 var5 = (class46)var4.next();
            this.method406(var5.method687(1751234855) * 8, var5.method679((byte)45) * 8, 8, 8, var5, var3, -2006398151);
         }
      }

      this.method405(var1, var3, (byte)0);
      class33 var6 = new class33();
      var6.method377(var3, -1673673141);
      return var6;
   }

   int method428(int var1, int var2, int var3) {
      if (this.field457 != null) {
         return this.field457.method264(var1, var2, (byte)74);
      } else {
         if (!this.field462.isEmpty()) {
            Iterator var4 = this.field462.iterator();

            while(var4.hasNext()) {
               class46 var5 = (class46)var4.next();
               if (var5.method674(var1, var2, -1759794354)) {
                  return var5.method264(var1, var2, (byte)98);
               }
            }
         }

         return -1;
      }
   }

   int method514(class331 var1, class284 var2, int var3) {
      switch(var2.field3689) {
      case 1:
         return -var1.field3978 / 2;
      case 2:
         return 0;
      default:
         return -var1.field3978;
      }
   }

   void method502(int var1, int var2, class28 var3, class47 var4, class330[] var5, int var6) {
      this.method410(var1, var2, var3, -624507285);
      this.method409(var1, var2, var3, var5, (byte)4);
   }

   void method412(HashSet var1, int var2, int var3, int var4) {
      Iterator var5 = this.field471.iterator();

      while(var5.hasNext()) {
         class40 var6 = (class40)var5.next();
         class269 var7 = class269.field3471[var6.field510];
         if (var7 != null && var1.contains(var7.method4755(-1579529684))) {
            this.method413(var7, var6.field505, var6.field511, var2, var3, (byte)67);
         }
      }

   }

   void method393(int var1, int var2, int var3, int var4, class28 var5, int var6) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         label49:
         for(int var8 = var2; var8 < var2 + var4; ++var8) {
            class238 var9 = new class238(0, var7, var8);

            for(int var10 = 0; var10 < var5.field391; ++var10) {
               class31[] var11 = var5.field396[var10][var7][var8];
               if (var11 != null && var11.length != 0) {
                  class31[] var12 = var11;

                  for(int var13 = 0; var13 < var12.length; ++var13) {
                     class31 var14 = var12[var13];
                     class269 var15 = this.method424(var14.field420, 1086239022);
                     if (var15 != null) {
                        class238 var16 = new class238(var10, this.field459 * 64 + var7, this.field456 * 64 + var8);
                        class238 var17 = null;
                        if (this.field457 != null) {
                           var17 = new class238(this.field457.field392 + var10, var7 + this.field457.field390 * 64, var8 + this.field457.field387 * 64);
                        } else {
                           class46 var18 = (class46)var5;
                           var17 = new class238(var10 + var18.field392, var7 + var18.field390 * 64 + var18.method676((byte)96) * 8, var18.field387 * 64 + var8 + var18.method677((byte)6) * 8);
                        }

                        class40 var19 = new class40(var15.field3452, var17, var16, this.method509(var15, 505952158));
                        this.field466.put(var9, var19);
                        continue label49;
                     }
                  }
               }
            }
         }
      }

   }

   void method394(List var1, short var2) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class25 var4 = (class25)var3.next();
         if (var4.field354.field2774 >> 6 == this.field459 && var4.field354.field2776 >> 6 == this.field456) {
            class40 var5 = new class40(var4.field355, var4.field354, var4.field354, this.method451(var4.field355, -1254733264));
            this.field471.add(var5);
         }
      }

   }

   void method406(int var1, int var2, int var3, int var4, class28 var5, class44 var6, int var7) {
      for(int var8 = var1; var8 < var3 + var1; ++var8) {
         for(int var9 = var2; var9 < var2 + var4; ++var9) {
            int var10 = var5.field388[0][var8][var9] - 1;
            if (var10 != -1) {
               class273 var11 = class67.method1097(var10, -1820769234);
               var6.method650(var8, var9, 5, var11, -2107654868);
            }
         }
      }

   }

   void method437(class40 var1, class269 var2, int var3, int var4, float var5, byte var6) {
      if (var1.field509 != null && var1.field509.field448.method192(var5, (byte)70)) {
         class311 var7 = (class311)this.field467.get(var1.field509.field448);
         var7.method5525(var1.field509.field449, var3 - var1.field509.field446 / 2, var4, var1.field509.field446, var1.field509.field452, -16777216 | var2.field3459, 0, 1, 0, var7.field3891 / 2);
      }

   }

   void method475(int var1, int var2, class28 var3, int var4) {
      field468.method4381(0, var1, var2, (byte)96);

      for(int var5 = 0; var5 < var3.field391; ++var5) {
         class31[] var6 = var3.field396[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            class31[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class31 var9 = var7[var8];
               class269 var10 = this.method424(var9.field420, 1086239022);
               if (var10 != null) {
                  class40 var11 = (class40)this.field466.get(field468);
                  if (var11 != null) {
                     if (var11.field510 != var10.field3452) {
                        class40 var16 = new class40(var10.field3452, var11.field506, var11.field512, this.method509(var10, 2016125791));
                        this.field466.put(new class238(field468), var16);
                        var11 = var16;
                     }

                     int var17 = var11.field506.field2779 - var11.field512.field2779;
                     var11.field512.field2779 = var5;
                     var11.field506.field2779 = var5 + var17;
                     return;
                  }

                  class238 var12 = new class238(var5, this.field459 * 64 + var1, this.field456 * 64 + var2);
                  class238 var13 = null;
                  if (this.field457 != null) {
                     var13 = new class238(this.field457.field392 + var5, this.field457.field390 * 64 + var1, var2 + this.field457.field387 * 64);
                  } else {
                     Iterator var14 = this.field462.iterator();

                     while(var14.hasNext()) {
                        class46 var15 = (class46)var14.next();
                        if (var15.method674(var1, var2, -1759794354)) {
                           var13 = new class238(var5 + var15.field392, var15.field390 * 64 + var1 + var15.method676((byte)92) * 8, var15.field387 * 64 + var2 + var15.method677((byte)87) * 8);
                           break;
                        }
                     }
                  }

                  if (var13 != null) {
                     var11 = new class40(var10.field3452, var13, var12, this.method509(var10, -1944162588));
                     this.field466.put(new class238(field468), var11);
                     return;
                  }
               }
            }
         }
      }

      this.field466.remove(field468);
   }

   void method420(int var1, int var2, class28 var3, class47 var4, int var5) {
      for(int var6 = 1; var6 < var3.field391; ++var6) {
         int var7 = var3.field393[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var8 = this.field463;
            class286 var9 = class268.method4742(var7, 1054568572);
            int var10;
            if (var9 == null) {
               var10 = var8;
            } else if (var9.field3738 >= 0) {
               var10 = var9.field3738 | -16777216;
            } else {
               int var11;
               byte var12;
               int var13;
               int var14;
               if (var9.field3736 >= 0) {
                  var11 = class134.field1944.vmethod3084(var9.field3736, 1610151776);
                  var12 = 96;
                  if (var11 == -2) {
                     var13 = 12345678;
                  } else if (var11 == -1) {
                     if (var12 < 0) {
                        var12 = 0;
                     } else if (var12 > 127) {
                        var12 = 127;
                     }

                     var14 = 127 - var12;
                     var13 = var14;
                  } else {
                     var14 = var12 * (var11 & 127) / 128;
                     if (var14 < 2) {
                        var14 = 2;
                     } else if (var14 > 126) {
                        var14 = 126;
                     }

                     var13 = var14 + (var11 & '\uff80');
                  }

                  var10 = class134.field1937[var13] | -16777216;
               } else if (var9.field3735 == 16711935) {
                  var10 = var8;
               } else {
                  var13 = class114.method2295(var9.field3743, var9.field3740, var9.field3745, -1764503042);
                  var12 = 96;
                  if (var13 == -2) {
                     var11 = 12345678;
                  } else if (var13 == -1) {
                     if (var12 < 0) {
                        var12 = 0;
                     } else if (var12 > 127) {
                        var12 = 127;
                     }

                     var14 = 127 - var12;
                     var11 = var14;
                  } else {
                     var14 = var12 * (var13 & 127) / 128;
                     if (var14 < 2) {
                        var14 = 2;
                     } else if (var14 > 126) {
                        var14 = 126;
                     }

                     var11 = var14 + (var13 & '\uff80');
                  }

                  var10 = class134.field1937[var11] | -16777216;
               }
            }

            if (var3.field394[var6][var1][var2] == 0) {
               class327.method5810(this.field464 * var1, this.field464 * (63 - var2), this.field464, this.field464, var10);
            } else {
               var4.method699(this.field464 * var1, this.field464 * (63 - var2), 0, var10, this.field464, this.field464, var3.field394[var6][var1][var2], var3.field395[var6][var1][var2], (byte)-25);
            }
         }
      }

   }

   int method421(class331 var1, class266 var2, int var3) {
      switch(var2.field3433) {
      case 0:
         return -var1.field3979 / 2;
      case 2:
         return 0;
      default:
         return -var1.field3979;
      }
   }

   void method405(class35[] var1, class44 var2, byte var3) {
      class254[] var4 = new class254[]{class254.field3312, class254.field3314, class254.field3313, class254.field3316, class254.field3320, class254.field3311, class254.field3318, class254.field3315};
      class254[] var5 = var4;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         class254 var7 = var5[var6];
         if (var1[var7.vmethod5837(-1715067533)] != null) {
            byte var8 = 0;
            byte var9 = 0;
            byte var10 = 64;
            byte var11 = 64;
            byte var12 = 0;
            byte var13 = 0;
            switch(var7.field3319) {
            case 0:
               var12 = 59;
               var13 = 59;
               var10 = 5;
               var11 = 5;
               break;
            case 1:
               var9 = 59;
               var11 = 5;
               var8 = 59;
               var10 = 5;
               break;
            case 2:
               var9 = 59;
               var11 = 5;
               var12 = 59;
               var10 = 5;
               break;
            case 3:
               var13 = 59;
               var11 = 5;
               break;
            case 4:
               var8 = 59;
               var10 = 5;
               break;
            case 5:
               var9 = 59;
               var11 = 5;
               break;
            case 6:
               var13 = 59;
               var11 = 5;
               var8 = 59;
               var10 = 5;
               break;
            case 7:
               var12 = 59;
               var10 = 5;
            }

            this.method407(var12, var13, var8, var9, var10, var11, var1[var7.vmethod5837(-2073996281)], var2, (byte)-51);
         }
      }

   }

   int method408(int var1, int var2, class28 var3, class33 var4, byte var5) {
      return var3.field388[0][var1][var2] == 0 ? this.field463 : var4.method376(var1, var2, -37520770);
   }

   class33 method418(int var1, int var2, class35[] var3, int var4) {
      class213 var5 = field458;
      long var6 = (long)(0 | var1 << 8 | var2);
      class33 var8 = (class33)var5.method3945(var6);
      class33 var9 = var8;
      if (var8 == null) {
         var9 = this.method404(var3, -768703734);
         class213 var10 = field458;
         long var11 = (long)(0 | var1 << 8 | var2);
         var10.method3953(var9, var11);
      }

      return var9;
   }

   class269 method424(int var1, int var2) {
      class282 var3 = class260.method4546(var1, 249820364);
      if (var3.field3627 != null) {
         var3 = var3.method5008((byte)18);
         if (var3 == null) {
            return null;
         }
      }

      return var3.field3614 != -1 ? class269.field3471[var3.field3614] : null;
   }

   void method413(class269 var1, int var2, int var3, int var4, int var5, byte var6) {
      class331 var7 = var1.method4753(false, -1042084142);
      if (var7 != null) {
         var7.method5865(var2 - var7.field3978 / 2, var3 - var7.field3979 / 2);
         if (var4 % var5 < var5 / 2) {
            class327.method5739(var2, var3, 15, 16776960, 128);
            class327.method5739(var2, var3, 7, 16777215, 256);
         }
      }

   }

   List method426(int var1) {
      LinkedList var2 = new LinkedList();
      var2.addAll(this.field471);
      var2.addAll(this.field466.values());
      return var2;
   }

   class34 method451(int var1, int var2) {
      class269 var3 = class269.field3471[var1];
      return this.method509(var3, 1286794204);
   }

   void method518(class40 var1, int var2, int var3, float var4, byte var5) {
      class269 var6 = class269.field3471[var1.field510];
      this.method419(var6, var2, var3, (byte)-85);
      this.method437(var1, var6, var2, var3, var4, (byte)38);
   }

   void method398(class47 var1, class35[] var2, class330[] var3, class33 var4, byte var5) {
      int var6;
      int var7;
      for(var6 = 0; var6 < 64; ++var6) {
         for(var7 = 0; var7 < 64; ++var7) {
            this.method461(var6, var7, this.field457, var1, var4, 1639893092);
            this.method420(var6, var7, this.field457, var1, -1739354945);
         }
      }

      for(var6 = 0; var6 < 64; ++var6) {
         for(var7 = 0; var7 < 64; ++var7) {
            this.method502(var6, var7, this.field457, var1, var3, -1137960162);
         }
      }

   }

   void method399(class47 var1, class330[] var2, class33 var3, byte var4) {
      Iterator var5 = this.field462.iterator();

      class46 var6;
      int var7;
      int var8;
      while(var5.hasNext()) {
         var6 = (class46)var5.next();

         for(var7 = var6.method687(1881595982) * 8; var7 < var6.method687(2074798259) * 8 + 8; ++var7) {
            for(var8 = var6.method679((byte)73) * 8; var8 < var6.method679((byte)43) * 8 + 8; ++var8) {
               this.method461(var7, var8, var6, var1, var3, 1639893092);
               this.method420(var7, var8, var6, var1, -488804478);
            }
         }
      }

      var5 = this.field462.iterator();

      while(var5.hasNext()) {
         var6 = (class46)var5.next();

         for(var7 = var6.method687(1827166797) * 8; var7 < var6.method687(1188167764) * 8 + 8; ++var7) {
            for(var8 = var6.method679((byte)84) * 8; var8 < var6.method679((byte)10) * 8 + 8; ++var8) {
               this.method502(var7, var8, var6, var1, var2, -1587916970);
            }
         }
      }

   }

   void method442(int var1) {
      if (this.field457 != null) {
         for(int var2 = 0; var2 < 64; ++var2) {
            for(int var3 = 0; var3 < 64; ++var3) {
               this.method475(var2, var3, this.field457, -2073329586);
            }
         }
      } else {
         Iterator var6 = this.field462.iterator();

         while(var6.hasNext()) {
            class46 var7 = (class46)var6.next();

            for(int var4 = var7.method687(1757368335) * 8; var4 < var7.method687(1464388697) * 8 + 8; ++var4) {
               for(int var5 = var7.method679((byte)125) * 8; var5 < var7.method679((byte)67) * 8 + 8; ++var5) {
                  this.method475(var4, var5, var7, -2071079517);
               }
            }
         }
      }

   }

   void method397(HashSet var1, int var2, int var3, int var4) {
      Iterator var5 = this.field466.values().iterator();

      while(var5.hasNext()) {
         class40 var6 = (class40)var5.next();
         if (var1.contains(var6.field510)) {
            class269 var7 = class269.field3471[var6.field510];
            this.method413(var7, var6.field505, var6.field511, var2, var3, (byte)-26);
         }
      }

      this.method412(var1, var2, var3, 1424049642);
   }

   void method427(int var1, int var2, int var3, int var4, int var5) {
      var3 %= 4;
      if (var3 == 0) {
         class327.method5752(this.field464 * var1, this.field464 * (63 - var2), this.field464, var4);
      }

      if (var3 == 1) {
         class327.method5756(this.field464 * var1, this.field464 * (63 - var2), this.field464, var4);
      }

      if (var3 == 2) {
         class327.method5752(this.field464 * var1 + this.field464 - 1, this.field464 * (63 - var2), this.field464, var4);
      }

      if (var3 == 3) {
         class327.method5756(this.field464 * var1, this.field464 * (63 - var2) + this.field464 - 1, this.field464, var4);
      }

   }

   void method414(int var1, int var2, int var3, HashSet var4, int var5) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.method411(var1, var2, var4, var3, (short)256);
      this.method417(var1, var2, var4, var3, 129011931);
   }

   List method425(int var1, int var2, int var3, int var4, int var5, int var6) {
      LinkedList var7 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var8 = this.field466.values().iterator();

            class40 var9;
            while(var8.hasNext()) {
               var9 = (class40)var8.next();
               if (var9.method563(var4, var5, -1655949603)) {
                  var7.add(var9);
               }
            }

            var8 = this.field471.iterator();

            while(var8.hasNext()) {
               var9 = (class40)var8.next();
               if (var9.method563(var4, var5, -1758313475)) {
                  var7.add(var9);
               }
            }

            return var7;
         } else {
            return var7;
         }
      } else {
         return var7;
      }
   }

   void method395(int var1, class47 var2, class35[] var3, class330[] var4, byte var5) {
      this.field464 = var1;
      if ((this.field457 != null || !this.field462.isEmpty()) && class24.method194(this.field459, this.field456, var1, 1811050241) == null) {
         class33 var6 = this.method418(this.field459, this.field456, var3, -430539823);
         class331 var7 = new class331(this.field464 * 64, this.field464 * 64);
         var7.method5903();
         if (this.field457 != null) {
            this.method398(var2, var3, var4, var6, (byte)88);
         } else {
            this.method399(var2, var4, var6, (byte)-90);
         }

         class198.method3773(var7, this.field459, this.field456, this.field464, 1738352953);
      }

   }

   void method407(int var1, int var2, int var3, int var4, int var5, int var6, class35 var7, class44 var8, byte var9) {
      for(int var10 = 0; var10 < var5; ++var10) {
         for(int var11 = 0; var11 < var6; ++var11) {
            int var12 = var7.method428(var10 + var1, var11 + var2, 999262223);
            if (var12 != -1) {
               class273 var13 = class67.method1097(var12, -964058487);
               var8.method650(var3 + var10, var11 + var4, 5, var13, -2072985653);
            }
         }
      }

   }

   void method390(int var1, int var2, int var3, int var4) {
      class331 var5 = class24.method194(this.field459, this.field456, this.field464, 1873511939);
      if (var5 != null) {
         if (var3 == this.field464 * 64) {
            var5.method5868(var1, var2);
         } else {
            var5.method5890(var1, var2, var3, var3);
         }
      }

   }

   void method508(class22 var1, List var2, int var3) {
      this.field466.clear();
      this.field457 = var1;
      this.method393(0, 0, 64, 64, this.field457, -2022359444);
      this.method394(var2, (short)-14065);
   }

   void method392(HashSet var1, List var2, int var3) {
      this.field466.clear();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         class46 var5 = (class46)var4.next();
         if (var5.method260(1347687077) == this.field459 && var5.method247(373399447) == this.field456) {
            this.field462.add(var5);
            this.method393(var5.method687(1667850860) * 8, var5.method679((byte)11) * 8, 8, 8, var5, -2022359444);
         }
      }

      this.method394(var2, (short)4064);
   }

   public static byte[] method517(Object var0, boolean var1, byte var2) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var4 = (byte[])((byte[])((byte[])var0));
         return var1 ? class145.method3097(var4, 1058550691) : var4;
      } else if (var0 instanceof class198) {
         class198 var3 = (class198)var0;
         return var3.vmethod3763(111437251);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static final void method422(int var0, int var1, int var2, int var3, int var4, int var5, int var6, short var7) {
      int var8 = Math.min(var3, Math.min(var4, var5)) - var6;
      int var9 = Math.max(var3, Math.max(var4, var5)) + var6;
      int var10 = Math.min(var0, Math.min(var1, var2)) - var6;
      int var11 = Math.max(var0, Math.max(var1, var2)) + var6;
      class254.method4525(var8, var10, var9, var11, -49088, 1583502535);
   }

   public static final boolean method519(byte var0) {
      class51 var1 = class51.field622;
      synchronized(var1) {
         if (class51.field615 == class51.field617) {
            return false;
         } else {
            class130.field1839 = class51.field612[class51.field615];
            class257.field3346 = class51.field594[class51.field615];
            class51.field615 = class51.field615 + 1 & 127;
            return true;
         }
      }
   }

   static void method516(byte var0) {
      if (client.field1132 != null) {
         client.field972 = client.field866;
         client.field1132.method4710(-1720417176);

         for(int var1 = 0; var1 < client.field971.length; ++var1) {
            if (client.field971[var1] != null) {
               client.field1132.method4709((client.field971[var1].field1185 >> 7) + class184.field2498, (client.field971[var1].field1209 >> 7) + class4.field28, -510260419);
            }
         }
      }

   }
}

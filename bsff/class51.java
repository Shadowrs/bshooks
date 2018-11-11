import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class class51 implements KeyListener, FocusListener {
   static class51 field622 = new class51();
   static int field610 = 0;
   static int[] field619 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   public static boolean[] field607 = new boolean[112];
   static int[] field616 = new int[128];
   static int field609 = 0;
   static int field606 = 0;
   static int field615 = 0;
   static char[] field594 = new char[128];
   static int[] field612 = new int[128];
   public static int[] field613 = new int[128];
   public static int field593 = 0;
   static int field617 = 0;
   public static volatile int field611 = 0;

   public final synchronized void keyPressed(KeyEvent var1) {
      if (field622 != null) {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < field619.length) {
            var2 = field619[var2];
            if ((var2 & 128) != 0) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if (field610 >= 0 && var2 >= 0) {
            field616[field610] = var2;
            field610 = field610 + 1 & 127;
            if (field609 == field610) {
               field610 = -1;
            }
         }

         int var3;
         if (var2 >= 0) {
            var3 = field606 + 1 & 127;
            if (var3 != field615) {
               field612[field606] = var2;
               field594[field606] = 0;
               field606 = var3;
            }
         }

         var3 = var1.getModifiers();
         if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
            var1.consume();
         }
      }

   }

   public final synchronized void keyReleased(KeyEvent var1) {
      if (field622 != null) {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < field619.length) {
            var2 = field619[var2] & -129;
         } else {
            var2 = -1;
         }

         if (field610 >= 0 && var2 >= 0) {
            field616[field610] = ~var2;
            field610 = field610 + 1 & 127;
            if (field610 == field609) {
               field610 = -1;
            }
         }
      }

      var1.consume();
   }

   public final void keyTyped(KeyEvent var1) {
      if (field622 != null) {
         char var2 = var1.getKeyChar();
         if (var2 != 0 && var2 != '\uffff') {
            boolean var3;
            if (var2 > 0 && var2 < '\u0080' || var2 >= '\u00a0' && var2 <= '\u00ff') {
               var3 = true;
            } else {
               label56: {
                  if (var2 != 0) {
                     char[] var4 = class314.field3912;

                     for(int var5 = 0; var5 < var4.length; ++var5) {
                        char var6 = var4[var5];
                        if (var2 == var6) {
                           var3 = true;
                           break label56;
                        }
                     }
                  }

                  var3 = false;
               }
            }

            if (var3) {
               int var7 = field606 + 1 & 127;
               if (var7 != field615) {
                  field612[field606] = -1;
                  field594[field606] = var2;
                  field606 = var7;
               }
            }
         }
      }

      var1.consume();
   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field622 != null) {
         field610 = -1;
      }

   }

   static class263 method798(int var0, boolean var1, boolean var2, boolean var3, int var4) {
      class174 var5 = null;
      if (class167.field2211 != null) {
         var5 = new class174(var0, class167.field2211, class167.field2213[var0], 1000000);
      }

      return new class263(var5, class54.field628, var0, var1, var2, var3);
   }

   static final void method794(class201 var0, int var1) {
      int var2 = 0;
      var0.method3793((byte)-114);

      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < class93.field1414; ++var3) {
         var4 = class93.field1415[var3];
         if ((class93.field1411[var4] & 1) == 0) {
            if (var2 > 0) {
               --var2;
               class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
            } else {
               var5 = var0.getBits(1, -370973546);
               if (var5 == 0) {
                  var2 = class77.method1642(var0, -1804871393);
                  class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
               } else {
                  class136.method2875(var0, var4, (byte)3);
               }
            }
         }
      }

      var0.method3795(-147795770);
      if (var2 != 0) {
         throw new RuntimeException();
      } else {
         var0.method3793((byte)-94);

         for(var3 = 0; var3 < class93.field1414; ++var3) {
            var4 = class93.field1415[var3];
            if ((class93.field1411[var4] & 1) != 0) {
               if (var2 > 0) {
                  --var2;
                  class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
               } else {
                  var5 = var0.getBits(1, -600772664);
                  if (var5 == 0) {
                     var2 = class77.method1642(var0, -648184553);
                     class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
                  } else {
                     class136.method2875(var0, var4, (byte)3);
                  }
               }
            }
         }

         var0.method3795(1052604972);
         if (var2 != 0) {
            throw new RuntimeException();
         } else {
            var0.method3793((byte)-49);

            for(var3 = 0; var3 < class93.field1416; ++var3) {
               var4 = class93.field1418[var3];
               if ((class93.field1411[var4] & 1) != 0) {
                  if (var2 > 0) {
                     --var2;
                     class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
                  } else {
                     var5 = var0.getBits(1, 1016758259);
                     if (var5 == 0) {
                        var2 = class77.method1642(var0, -479608771);
                        class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
                     } else if (class6.method27(var0, var4, 1240419503)) {
                        class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
                     }
                  }
               }
            }

            var0.method3795(1189282043);
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.method3793((byte)-15);

               for(var3 = 0; var3 < class93.field1416; ++var3) {
                  var4 = class93.field1418[var3];
                  if ((class93.field1411[var4] & 1) == 0) {
                     if (var2 > 0) {
                        --var2;
                        class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
                     } else {
                        var5 = var0.getBits(1, -1683445567);
                        if (var5 == 0) {
                           var2 = class77.method1642(var0, -1202964194);
                           class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
                        } else if (class6.method27(var0, var4, -1036253905)) {
                           class93.field1411[var4] = (byte)(class93.field1411[var4] | 2);
                        }
                     }
                  }
               }

               var0.method3795(570495642);
               if (var2 != 0) {
                  throw new RuntimeException();
               } else {
                  class93.field1414 = 0;
                  class93.field1416 = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     class93.field1411[var3] = (byte)(class93.field1411[var3] >> 1);
                     class72 var6 = client.field971[var3];
                     if (var6 != null) {
                        class93.field1415[++class93.field1414 - 1] = var3;
                     } else {
                        class93.field1418[++class93.field1416 - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }
}

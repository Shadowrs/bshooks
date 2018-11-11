public class class305 implements Comparable {
   String field3850;
   String field3852;

   public class305(String var1, class335 var2) {
      this.field3850 = var1;
      String var3;
      if (var1 == null) {
         var3 = null;
      } else {
         int var4 = 0;

         int var5;
         char var6;
         boolean var7;
         for(var5 = var1.length(); var4 < var5; ++var4) {
            var6 = var1.charAt(var4);
            var7 = var6 == '\u00a0' || var6 == ' ' || var6 == '_' || var6 == '-';
            if (!var7) {
               break;
            }
         }

         while(var5 > var4) {
            var6 = var1.charAt(var5 - 1);
            var7 = var6 == '\u00a0' || var6 == ' ' || var6 == '_' || var6 == '-';
            if (!var7) {
               break;
            }

            --var5;
         }

         int var8 = var5 - var4;
         if (var8 >= 1 && var8 <= class307.method5491(var2, -983963280)) {
            StringBuilder var9 = new StringBuilder(var8);

            for(int var10 = var4; var10 < var5; ++var10) {
               char var11 = var1.charAt(var10);
               boolean var12;
               if (Character.isISOControl(var11)) {
                  var12 = false;
               } else {
                  boolean var13 = var11 >= '0' && var11 <= '9' || var11 >= 'A' && var11 <= 'Z' || var11 >= 'a' && var11 <= 'z';
                  if (var13) {
                     var12 = true;
                  } else {
                     label152: {
                        char[] var14 = class315.field3917;

                        int var15;
                        char var16;
                        for(var15 = 0; var15 < var14.length; ++var15) {
                           var16 = var14[var15];
                           if (var16 == var11) {
                              var12 = true;
                              break label152;
                           }
                        }

                        var14 = class315.field3914;
                        var15 = 0;

                        while(true) {
                           if (var15 >= var14.length) {
                              var12 = false;
                              break;
                           }

                           var16 = var14[var15];
                           if (var11 == var16) {
                              var12 = true;
                              break;
                           }

                           ++var15;
                        }
                     }
                  }
               }

               if (var12) {
                  char var17 = class259.method4542(var11, 2060311356);
                  if (var17 != 0) {
                     var9.append(var17);
                  }
               }
            }

            if (var9.length() == 0) {
               var3 = null;
            } else {
               var3 = var9.toString();
            }
         } else {
            var3 = null;
         }
      }

      this.field3852 = var3;
   }

   public int method5441(class305 var1, byte var2) {
      return this.field3852 == null ? (var1.field3852 == null ? 0 : 1) : (var1.field3852 == null ? -1 : this.field3852.compareTo(var1.field3852));
   }

   public boolean method5450(byte var1) {
      return this.field3852 != null;
   }

   public String method5436(int var1) {
      return this.field3850;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class305) {
         class305 var2 = (class305)var1;
         return this.field3852 == null ? var2.field3852 == null : (var2.field3852 == null ? false : (this.hashCode() != var2.hashCode() ? false : this.field3852.equals(var2.field3852)));
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field3852 == null ? 0 : this.field3852.hashCode();
   }

   public String toString() {
      return this.method5436(-1351055761);
   }

   public int compareTo(Object var1) {
      return this.method5441((class305)var1, (byte)-108);
   }

   public static boolean method5452(int var0, int var1) {
      if (class314.field3913[var0]) {
         return true;
      } else if (!class17.field295.method4555(var0, 1609088388)) {
         return false;
      } else {
         int var2 = class17.field295.method4563(var0, 2032970138);
         if (var2 == 0) {
            class314.field3913[var0] = true;
            return true;
         } else {
            if (class189.field2519[var0] == null) {
               class189.field2519[var0] = new class242[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (class189.field2519[var0][var3] == null) {
                  byte[] var4 = class17.field295.method4551(var0, var3, 872798932);
                  if (var4 != null) {
                     class189.field2519[var0][var3] = new class242();
                     class189.field2519[var0][var3].field2814 = var3 + (var0 << 16);
                     if (var4[0] == -1) {
                        class189.field2519[var0][var3].method4472(new class194(var4), -887829469);
                     } else {
                        class189.field2519[var0][var3].method4447(new class194(var4), -540136846);
                     }
                  }
               }
            }

            class314.field3913[var0] = true;
            return true;
         }
      }
   }

   static final void method5437(int var0) {
      for(class82 var1 = (class82)client.field977.method4027(); var1 != null; var1 = (class82)client.field977.method4026()) {
         if (var1.field1284 == class237.field2769 && !var1.field1283) {
            if (client.field866 >= var1.field1287) {
               var1.method1804(client.field893, (byte)95);
               if (var1.field1283) {
                  var1.method4014();
               } else {
                  class308.field3867.method3006(var1.field1284, var1.field1285, var1.field1286, var1.field1293, 60, var1, 0, -1, false);
               }
            }
         } else {
            var1.method4014();
         }
      }

   }
}

public final class class72 extends class75 {
   static int field849;
   class239 field820;
   class303 field845;
   class303 field841;
   class305 field823;
   int field822 = -1;
   int field830 = -1;
   boolean field839;
   String[] field825 = new String[3];
   int field832;
   int field827;
   int field840;
   int field844;
   int field829;
   boolean field836;
   boolean field837;
   class131 field834;
   int field831;
   int field842;
   int field821;
   int field828;
   int field833;
   int field843;
   int field835;
   int field848;
   int field826;
   int field838;
   int field847;
   int field846;

   class72() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field825[var1] = "";
      }

      this.field832 = 0;
      this.field827 = 0;
      this.field844 = 0;
      this.field829 = 0;
      this.field839 = false;
      this.field840 = 0;
      this.field836 = false;
      this.field841 = class303.field3842;
      this.field845 = class303.field3842;
      this.field837 = false;
   }

   protected final class131 vmethod3067(byte var1) {
      if (this.field820 == null) {
         return null;
      } else {
         class287 var2 = super.field1182 != -1 && super.field1164 == 0 ? class202.method3839(super.field1182, (byte)120) : null;
         class287 var3 = super.field1173 != -1 && !this.field839 && (super.field1155 != super.field1173 || var2 == null) ? class202.method3839(super.field1173, (byte)93) : null;
         class131 var4 = this.field820.method4413(var2, super.field1183, var3, super.field1180, 980120878);
         if (var4 == null) {
            return null;
         } else {
            var4.method2687();
            super.field1200 = var4.field2042;
            class131 var5;
            class131[] var6;
            if (!this.field839 && super.field1187 != -1 && super.field1159 != -1) {
               var5 = class249.method4518(super.field1187, -1509004030).method4795(super.field1159, -1009385808);
               if (var5 != null) {
                  var5.method2698(0, -super.field1191, 0);
                  var6 = new class131[]{var4, var5};
                  var4 = new class131(var6, 2);
               }
            }

            if (!this.field839 && this.field834 != null) {
               if (client.field866 >= this.field829) {
                  this.field834 = null;
               }

               if (client.field866 >= this.field844 && client.field866 < this.field829) {
                  var5 = this.field834;
                  var5.method2698(this.field831 - super.field1185, this.field821 - this.field828, this.field833 - super.field1209);
                  if (super.field1201 == 512) {
                     var5.method2694();
                     var5.method2694();
                     var5.method2694();
                  } else if (super.field1201 == 1024) {
                     var5.method2694();
                     var5.method2694();
                  } else if (super.field1201 == 1536) {
                     var5.method2694();
                  }

                  var6 = new class131[]{var4, var5};
                  var4 = new class131(var6, 2);
                  if (super.field1201 == 512) {
                     var5.method2694();
                  } else if (super.field1201 == 1024) {
                     var5.method2694();
                     var5.method2694();
                  } else if (super.field1201 == 1536) {
                     var5.method2694();
                     var5.method2694();
                     var5.method2694();
                  }

                  var5.method2698(super.field1185 - this.field831, this.field828 - this.field821, super.field1209 - this.field833);
               }
            }

            var4.field1850 = true;
            return var4;
         }
      }
   }

   void method1146(byte var1) {
      this.field845 = class33.field443 != null && class33.field443.method5316(this.field823, (byte)42) ? class303.field3841 : class303.field3843;
   }

   void method1143(int var1) {
      this.field841 = class164.field2182.method1670(this.field823, -307992040) ? class303.field3841 : class303.field3843;
   }

   void method1159(int var1, int var2, int var3) {
      super.field1204 = 0;
      super.field1194 = 0;
      super.field1208 = 0;
      super.field1188[0] = var1;
      super.field1206[0] = var2;
      int var4 = this.method1168(1415219210);
      super.field1185 = var4 * 64 + super.field1188[0] * 128;
      super.field1209 = var4 * 64 + super.field1206[0] * 128;
   }

   int method1168(int var1) {
      return this.field820 != null && this.field820.field2783 != -1 ? class68.method1100(this.field820.field2783, (byte)-57).field3702 : 1;
   }

   void method1166(int var1) {
      this.field841 = class303.field3842;
   }

   final void method1167(int var1, int var2, byte var3, byte var4) {
      if (super.field1204 < 9) {
         ++super.field1204;
      }

      for(int var5 = super.field1204; var5 > 0; --var5) {
         super.field1188[var5] = super.field1188[var5 - 1];
         super.field1206[var5] = super.field1206[var5 - 1];
         super.field1176[var5] = super.field1176[var5 - 1];
      }

      super.field1188[0] = var1;
      super.field1206[0] = var2;
      super.field1176[0] = var3;
   }

   void method1145(byte var1) {
      this.field845 = class303.field3842;
   }

   final boolean vmethod1824(int var1) {
      return this.field820 != null;
   }

   final void method1140(class194 var1, int var2) {
      var1.field2565 = 0;
      int var3 = var1.getUByte(219759414);
      this.field822 = var1.getByte(506294897);
      this.field830 = var1.getByte(352092364);
      int var4 = -1;
      this.field840 = 0;
      int[] var5 = new int[12];

      int var6;
      int var7;
      for(int var8 = 0; var8 < 12; ++var8) {
         var6 = var1.getUByte(966369673);
         if (var6 == 0) {
            var5[var8] = 0;
         } else {
            var7 = var1.getUByte(-74246982);
            var5[var8] = var7 + (var6 << 8);
            if (var8 == 0 && var5[0] == 65535) {
               var4 = var1.getUShort(-1208216487);
               break;
            }

            if (var5[var8] >= 512) {
               int var9 = class146.method3099(var5[var8] - 512, (byte)123).field3682;
               if (var9 != 0) {
                  this.field840 = var9;
               }
            }
         }
      }

      int[] var10 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var7 = var1.getUByte(1076126568);
         if (var7 < 0 || var7 >= class54.field629[var6].length) {
            var7 = 0;
         }

         var10[var6] = var7;
      }

      super.field1155 = var1.getUShort(-1208216487);
      if (super.field1155 == 65535) {
         super.field1155 = -1;
      }

      super.field1195 = var1.getUShort(-1208216487);
      if (super.field1195 == 65535) {
         super.field1195 = -1;
      }

      super.field1157 = super.field1195;
      super.field1158 = var1.getUShort(-1208216487);
      if (super.field1158 == 65535) {
         super.field1158 = -1;
      }

      super.field1172 = var1.getUShort(-1208216487);
      if (super.field1172 == 65535) {
         super.field1172 = -1;
      }

      super.field1160 = var1.getUShort(-1208216487);
      if (super.field1160 == 65535) {
         super.field1160 = -1;
      }

      super.field1161 = var1.getUShort(-1208216487);
      if (super.field1161 == 65535) {
         super.field1161 = -1;
      }

      super.field1162 = var1.getUShort(-1208216487);
      if (super.field1162 == 65535) {
         super.field1162 = -1;
      }

      String var11 = var1.getString1(-778927800);
      this.field823 = new class305(var11, client.field1107);
      this.method1166(1160676352);
      this.method1145((byte)61);
      if (this == class12.field259) {
         class164.field2176 = this.field823.method5436(-191403762);
      }

      this.field832 = var1.getUByte(-1224317279);
      this.field827 = var1.getUShort(-1208216487);
      this.field836 = var1.getUByte(-1171791543) == 1;
      if (client.field955 == 0 && client.field1023 >= 2) {
         this.field836 = false;
      }

      if (this.field820 == null) {
         this.field820 = new class239();
      }

      this.field820.method4408(var5, var10, var3 == 1, var4, (byte)124);
   }

   boolean method1141(int var1) {
      if (this.field841 == class303.field3842) {
         this.method1143(884143338);
      }

      return this.field841 == class303.field3841;
   }

   boolean method1144(int var1) {
      if (this.field845 == class303.field3842) {
         this.method1146((byte)15);
      }

      return this.field845 == class303.field3841;
   }

   final void method1149(int var1, int var2, byte var3, byte var4) {
      if (super.field1182 != -1 && class202.method3839(super.field1182, (byte)79).field3762 == 1) {
         super.field1182 = -1;
      }

      super.field1165 = -1;
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.field1188[0] >= 0 && super.field1188[0] < 104 && super.field1206[0] >= 0 && super.field1206[0] < 104) {
            if (var3 == 2) {
               class72 var5 = this;
               int var6 = super.field1188[0];
               int var7 = super.field1206[0];
               int var8 = this.method1168(1556653141);
               if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) {
                  int var9 = class18.method144(var6, var7, this.method1168(1626742479), class42.method605(var1, var2, -373695699), client.field1047[this.field842], true, client.field1128, client.field966, (byte)0);
                  if (var9 >= 1) {
                     for(int var10 = 0; var10 < var9 - 1; ++var10) {
                        var5.method1167(client.field1128[var10], client.field966[var10], (byte)2, (byte)14);
                     }
                  }
               }
            }

            this.method1167(var1, var2, var3, (byte)-76);
         } else {
            this.method1159(var1, var2, -2131327460);
         }
      } else {
         this.method1159(var1, var2, -1811652399);
      }

   }

   static final void method1182(int var0, int var1, int var2, byte var3) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = class5.method16(var0, var1, class237.field2769, -1453085921) - var2;
         var0 -= class287.field3766;
         var4 -= class269.field3472;
         var1 -= class98.field1468;
         int var5 = class134.field1955[class10.field241];
         int var6 = class134.field1933[class10.field241];
         int var7 = class134.field1955[class181.field2453];
         int var8 = class134.field1933[class181.field2453];
         int var9 = var0 * var8 + var7 * var1 >> 16;
         var1 = var8 * var1 - var0 * var7 >> 16;
         var0 = var9;
         var9 = var4 * var6 - var5 * var1 >> 16;
         var1 = var4 * var5 + var6 * var1 >> 16;
         if (var1 >= 50) {
            client.field954 = var0 * client.field1092 / var1 + client.field943 / 2;
            client.field864 = var9 * client.field1092 / var1 + client.field906 / 2;
         } else {
            client.field954 = -1;
            client.field864 = -1;
         }
      } else {
         client.field954 = -1;
         client.field864 = -1;
      }

   }
}

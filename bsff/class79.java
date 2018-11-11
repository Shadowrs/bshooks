import java.util.Iterator;

public class class79 {
   static int field1251;
   int field1246 = 0;
   public class298 field1249;
   public class304 field1250;
   class335 field1247;

   class79(class335 var1) {
      this.field1247 = var1;
      this.field1250 = new class304(var1);
      this.field1249 = new class298(var1);
   }

   final boolean method1670(class305 var1, int var2) {
      class306 var3 = (class306)this.field1250.method5317(var1, 1309128066);
      return var3 != null && var3.method5397(362145921);
   }

   final boolean method1665(int var1) {
      return this.field1250.method5315(-101234171) || this.field1250.method5314(779372658) >= 200 && client.field973 != 1;
   }

   final boolean method1667(int var1) {
      return this.field1249.method5315(-1050076000) || this.field1249.method5314(2063639630) >= 100 && client.field973 != 1;
   }

   final boolean method1705(class305 var1, boolean var2, int var3) {
      return var1 == null ? false : (var1.equals(class12.field259.field823) ? true : this.field1250.method5415(var1, var2, -695219581));
   }

   final boolean method1695(class305 var1, byte var2) {
      return var1 == null ? false : this.field1249.method5316(var1, (byte)78);
   }

   final void method1659(class194 var1, int var2, int var3) {
      this.field1250.method5420(var1, var2, -1858683533);
      this.field1246 = 2;

      for(int var4 = 0; var4 < class93.field1414; ++var4) {
         class72 var5 = client.field971[class93.field1415[var4]];
         var5.method1166(2059978993);
      }

      class54.method824(231267082);
      if (class33.field443 != null) {
         class33.field443.method5468(1582483967);
      }

   }

   final void method1658(byte var1) {
      this.field1246 = 1;
   }

   final void method1661(byte var1) {
      this.field1246 = 0;
      this.field1250.method5351(1804433414);
      this.field1249.method5351(1637882943);
   }

   boolean method1657(int var1) {
      return this.field1246 == 2;
   }

   final void method1664(String var1, int var2) {
      if (var1 != null) {
         class305 var3 = new class305(var1, this.field1247);
         if (var3.method5450((byte)0)) {
            if (this.method1665(-2055406942)) {
               class47.method743("Your friend list is full. Max of 200 for free users, and 400 for members", -39889280);
            } else if (class12.field259.field823.equals(var3)) {
               class240.method4441(-1133005837);
            } else if (this.method1705(var3, false, 498146722)) {
               class47.method743(var1 + " is already on your friend list", 586078291);
            } else if (this.method1695(var3, (byte)5)) {
               class47.method743("Please remove " + var1 + " from your ignore list first", 1568308747);
            } else {
               client.method1579(var1, -1695511311);
            }
         }
      }

   }

   final void method1668(String var1, int var2) {
      if (var1 != null) {
         class305 var3 = new class305(var1, this.field1247);
         if (var3.method5450((byte)0)) {
            if (this.field1250.method5345(var3, -1439538729)) {
               class132.method2786(466117418);
               class184 var4 = class141.method3078(class181.field2379, client.field902.field1475, (byte)-9);
               var4.field2500.addByte(class91.method1916(var1, 323782442), (byte)-62);
               var4.field2500.addString1(var1, 833093253);
               client.field902.method2036(var4, (byte)120);
            }

            class190.method3487(-77523360);
         }
      }

   }

   final void method1666(String var1, byte var2) {
      if (var1 != null) {
         class305 var3 = new class305(var1, this.field1247);
         if (var3.method5450((byte)0)) {
            if (this.method1667(109725225)) {
               class47.method743("Your ignore list is full. Max of 100 for free users, and 400 for members", 1548886812);
            } else if (class12.field259.field823.equals(var3)) {
               class263.method4694(-877036130);
            } else if (this.method1695(var3, (byte)-22)) {
               class49.method778(var1, -281347183);
            } else if (this.method1705(var3, false, 498146722)) {
               class14.method87(var1, (byte)9);
            } else {
               class184 var4 = class141.method3078(class181.field2439, client.field902.field1475, (byte)-104);
               var4.field2500.addByte(class91.method1916(var1, -847769381), (byte)-124);
               var4.field2500.addString1(var1, 282841785);
               client.field902.method2036(var4, (byte)22);
            }
         }
      }

   }

   final void method1690(String var1, int var2) {
      if (var1 != null) {
         class305 var3 = new class305(var1, this.field1247);
         if (var3.method5450((byte)0)) {
            if (this.field1249.method5345(var3, 98792597)) {
               class132.method2786(958207248);
               class184 var4 = class141.method3078(class181.field2399, client.field902.field1475, (byte)-41);
               var4.field2500.addByte(class91.method1916(var1, -498274088), (byte)-9);
               var4.field2500.addString1(var1, -1491207406);
               client.field902.method2036(var4, (byte)41);
            }

            Iterator var6 = class95.field1432.iterator();

            while(var6.hasNext()) {
               class70 var5 = (class70)var6.next();
               var5.method1107(-1757412682);
            }

            if (class33.field443 != null) {
               class33.field443.method5469(690637716);
            }
         }
      }

   }

   final void method1660(int var1) {
      for(class308 var2 = (class308)this.field1250.field3847.method4061(); var2 != null; var2 = (class308)this.field1250.field3847.method4062()) {
         if ((long)var2.field3868 < class6.method28(1358803598) / 1000L - 5L) {
            if (var2.field3866 > 0) {
               class189.method3483(5, "", var2.field3865 + " has logged in.", (byte)36);
            }

            if (var2.field3866 == 0) {
               class189.method3483(5, "", var2.field3865 + " has logged out.", (byte)-32);
            }

            var2.method4069();
         }
      }

   }

   static final void method1722(int var0) {
      client.field902.method2037((byte)7);
      class18.method155(-732981237);
      class308.field3867.method2878();

      for(int var1 = 0; var1 < 4; ++var1) {
         client.field1047[var1].method3368((byte)-43);
      }

      System.gc();
      class262.method4660(2, 985642245);
      client.field1089 = -1;
      client.field1090 = false;
      class231.method4261(-1821026638);
      class48.method748(10, -1839433512);
   }

   static void method1721(int var0, int var1) {
      if (var0 != -1 && class305.method5452(var0, -1009820586)) {
         class242[] var2 = class189.field2519[var0];
         boolean var3 = false;

         for(int var4 = 0; var4 < var2.length; ++var4) {
            class242 var5 = var2[var4];
            if (var5.field2895 != null) {
               class68 var6 = new class68();
               var6.field780 = var5;
               var6.field782 = var5.field2895;
               if (var3) {
                  System.out.println("Start");
               }

               class23.method188(var6, 5000000, (byte)1, var3);
               if (var3) {
                  System.out.println("End");
               }
            }
         }
      }

   }

   public static int method1686(int var0, byte var1) {
      return var0 > 0 ? 1 : (var0 < 0 ? -1 : 0);
   }
}

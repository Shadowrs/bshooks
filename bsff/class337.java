public class class337 extends class216 {
   String field4099;
   int[] field4112 = new int[3];
   int field4083;
   String field4104;
   boolean field4084;
   int field4091;
   String field4095;
   int field4103;
   int field4111;
   String field4093;
   int field4094;
   String field4101;
   int field4109;
   boolean field4096;
   String field4102;
   int field4097;
   int field4078;
   int field4110;
   int field4100;
   int field4106;
   int field4105;
   int field4107;
   int field4108;
   int field4086;

   public class337(boolean var1) {
      if (class185.field2505.startsWith("win")) {
         this.field4083 = 1;
      } else if (class185.field2505.startsWith("mac")) {
         this.field4083 = 2;
      } else if (class185.field2505.startsWith("linux")) {
         this.field4083 = 3;
      } else {
         this.field4083 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var12) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var11) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var10) {
         ;
      }

      if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         this.field4084 = false;
      } else {
         this.field4084 = true;
      }

      if (this.field4083 == 1) {
         if (var3.indexOf("4.0") != -1) {
            this.field4091 = 1;
         } else if (var3.indexOf("4.1") != -1) {
            this.field4091 = 2;
         } else if (var3.indexOf("4.9") != -1) {
            this.field4091 = 3;
         } else if (var3.indexOf("5.0") != -1) {
            this.field4091 = 4;
         } else if (var3.indexOf("5.1") != -1) {
            this.field4091 = 5;
         } else if (var3.indexOf("5.2") != -1) {
            this.field4091 = 8;
         } else if (var3.indexOf("6.0") != -1) {
            this.field4091 = 6;
         } else if (var3.indexOf("6.1") != -1) {
            this.field4091 = 7;
         } else if (var3.indexOf("6.2") != -1) {
            this.field4091 = 9;
         } else if (var3.indexOf("6.3") != -1) {
            this.field4091 = 10;
         } else if (var3.indexOf("10.0") != -1) {
            this.field4091 = 11;
         }
      } else if (this.field4083 == 2) {
         if (var3.indexOf("10.4") != -1) {
            this.field4091 = 20;
         } else if (var3.indexOf("10.5") != -1) {
            this.field4091 = 21;
         } else if (var3.indexOf("10.6") != -1) {
            this.field4091 = 22;
         } else if (var3.indexOf("10.7") != -1) {
            this.field4091 = 23;
         } else if (var3.indexOf("10.8") != -1) {
            this.field4091 = 24;
         } else if (var3.indexOf("10.9") != -1) {
            this.field4091 = 25;
         } else if (var3.indexOf("10.10") != -1) {
            this.field4091 = 26;
         } else if (var3.indexOf("10.11") != -1) {
            this.field4091 = 27;
         }
      }

      if (var4.toLowerCase().indexOf("sun") != -1) {
         this.field4103 = 1;
      } else if (var4.toLowerCase().indexOf("microsoft") != -1) {
         this.field4103 = 2;
      } else if (var4.toLowerCase().indexOf("apple") != -1) {
         this.field4103 = 3;
      } else if (var4.toLowerCase().indexOf("oracle") != -1) {
         this.field4103 = 5;
      } else {
         this.field4103 = 4;
      }

      int var6 = 2;
      int var7 = 0;

      char var8;
      try {
         while(var6 < var5.length()) {
            var8 = var5.charAt(var6);
            if (var8 < '0' || var8 > '9') {
               break;
            }

            var7 = var8 - 48 + var7 * 10;
            ++var6;
         }
      } catch (Exception var15) {
         ;
      }

      this.field4111 = var7;
      var6 = var5.indexOf(46, 2) + 1;
      var7 = 0;

      try {
         while(var6 < var5.length()) {
            var8 = var5.charAt(var6);
            if (var8 < '0' || var8 > '9') {
               break;
            }

            var7 = var7 * 10 + (var8 - 48);
            ++var6;
         }
      } catch (Exception var14) {
         ;
      }

      this.field4094 = var7;
      var6 = var5.indexOf(95, 4) + 1;
      var7 = 0;

      try {
         while(var6 < var5.length()) {
            var8 = var5.charAt(var6);
            if (var8 < '0' || var8 > '9') {
               break;
            }

            var7 = var7 * 10 + (var8 - 48);
            ++var6;
         }
      } catch (Exception var13) {
         ;
      }

      this.field4109 = var7;
      this.field4096 = false;
      this.field4097 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      if (this.field4111 > 3) {
         this.field4078 = Runtime.getRuntime().availableProcessors();
      } else {
         this.field4078 = 0;
      }

      this.field4110 = 0;
      if (this.field4099 == null) {
         this.field4099 = "";
      }

      if (this.field4104 == null) {
         this.field4104 = "";
      }

      if (this.field4095 == null) {
         this.field4095 = "";
      }

      if (this.field4093 == null) {
         this.field4093 = "";
      }

      if (this.field4101 == null) {
         this.field4101 = "";
      }

      if (this.field4102 == null) {
         this.field4102 = "";
      }

      this.method6227(1976710595);
   }

   void method6227(int var1) {
      if (this.field4099.length() > 40) {
         this.field4099 = this.field4099.substring(0, 40);
      }

      if (this.field4104.length() > 40) {
         this.field4104 = this.field4104.substring(0, 40);
      }

      if (this.field4095.length() > 10) {
         this.field4095 = this.field4095.substring(0, 10);
      }

      if (this.field4093.length() > 10) {
         this.field4093 = this.field4093.substring(0, 10);
      }

   }

   public int method6238(int var1) {
      byte var2 = 38;
      int var3 = var2 + class17.method139(this.field4099, -1984723451);
      var3 += class17.method139(this.field4104, -2134518238);
      var3 += class17.method139(this.field4095, -1947649751);
      var3 += class17.method139(this.field4093, -2023797802);
      var3 += class17.method139(this.field4101, -2133112274);
      var3 += class17.method139(this.field4102, -2025823188);
      return var3;
   }

   public void method6228(class194 var1, int var2) {
      var1.addByte(6, (byte)-78);
      var1.addByte(this.field4083, (byte)-27);
      var1.addByte(this.field4084 ? 1 : 0, (byte)-69);
      var1.addByte(this.field4091, (byte)-85);
      var1.addByte(this.field4103, (byte)-71);
      var1.addByte(this.field4111, (byte)-78);
      var1.addByte(this.field4094, (byte)-83);
      var1.addByte(this.field4109, (byte)-91);
      var1.addByte(this.field4096 ? 1 : 0, (byte)-82);
      var1.addShort(this.field4097, 16535625);
      var1.addByte(this.field4078, (byte)-38);
      var1.add24Int(this.field4110, (byte)8);
      var1.addShort(this.field4100, 824521339);
      var1.addString2(this.field4099, (byte)-100);
      var1.addString2(this.field4104, (byte)-71);
      var1.addString2(this.field4095, (byte)-16);
      var1.addString2(this.field4093, (byte)-6);
      var1.addByte(this.field4106, (byte)-29);
      var1.addShort(this.field4105, 1616985238);
      var1.addString2(this.field4101, (byte)-37);
      var1.addString2(this.field4102, (byte)-112);
      var1.addByte(this.field4107, (byte)-43);
      var1.addByte(this.field4108, (byte)-111);

      for(int var3 = 0; var3 < this.field4112.length; ++var3) {
         var1.addInt(this.field4112[var3], (byte)36);
      }

      var1.addInt(this.field4086, (byte)56);
   }
}

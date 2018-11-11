public class class294 {
   long field3809 = 0L;
   long field3813 = -1L;
   public boolean field3816 = false;
   long field3814 = -1L;
   int field3810 = 0;
   int field3817 = 0;
   long field3812 = 0L;
   long field3811 = 0L;
   int field3815 = 0;
   int field3818 = 0;

   public void method5213(int var1) {
      if (this.field3814 != -1L) {
         this.field3812 = class6.method28(1358803598) - this.field3814;
         this.field3814 = -1L;
      }

      ++this.field3817;
      this.field3816 = true;
   }

   public void method5211(int var1) {
      if (this.field3813 != -1L) {
         this.field3809 = class6.method28(1358803598) - this.field3813;
         this.field3813 = -1L;
      }

   }

   public void method5212(int var1, int var2) {
      this.field3814 = class6.method28(1358803598);
      this.field3815 = var1;
   }

   public void method5210(byte var1) {
      this.field3813 = class6.method28(1358803598);
   }

   public void method5216(class194 var1, int var2) {
      long var3 = this.field3809;
      var3 /= 10L;
      if (var3 < 0L) {
         var3 = 0L;
      } else if (var3 > 65535L) {
         var3 = 65535L;
      }

      var1.addShort((int)var3, 479866290);
      long var5 = this.field3812;
      var5 /= 10L;
      if (var5 < 0L) {
         var5 = 0L;
      } else if (var5 > 65535L) {
         var5 = 65535L;
      }

      var1.addShort((int)var5, 1087272556);
      long var7 = this.field3811;
      var7 /= 10L;
      if (var7 < 0L) {
         var7 = 0L;
      } else if (var7 > 65535L) {
         var7 = 65535L;
      }

      var1.addShort((int)var7, 1774689939);
      var1.addShort(this.field3815, 2021015764);
      var1.addShort(this.field3810, 361356198);
      var1.addShort(this.field3817, 324869440);
      var1.addShort(this.field3818, 2009230248);
   }

   public void method5214(byte var1) {
      this.field3816 = false;
      this.field3810 = 0;
   }

   public void method5229(int var1) {
      this.method5213(-2041160622);
   }

   public static String method5232(char var0, int var1, int var2) {
      char[] var3 = new char[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         var3[var4] = var0;
      }

      return new String(var3);
   }
}

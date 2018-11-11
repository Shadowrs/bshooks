import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class class133 {
   int field1922;
   int field1923;
   int field1924;
   int field1925;

   class133() {
   }

   class133(class133 var1) {
      this.field1922 = var1.field1922;
      this.field1923 = var1.field1923;
      this.field1924 = var1.field1924;
      this.field1925 = var1.field1925;
   }

   static final void method2787(String var0, boolean var1, int var2) {
      if (client.field960) {
         byte var3 = 4;
         int var4 = var3 + 6;
         int var5 = var3 + 6;
         int var6 = class186.field2506.method5518(var0, 250);
         int var7 = class186.field2506.method5519(var0, 250) * 13;
         class327.method5810(var4 - var3, var5 - var3, var3 + var6 + var3, var7 + var3 + var3, 0);
         class327.method5748(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var3 + var7, 16777215);
         class186.field2506.method5525(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         class61.method1055(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 1863552416);
         if (var1) {
            class324.field3941.vmethod5824(0, 0, 1408028865);
         } else {
            class259.method4541(var4, var5, var6, var7, 1723918902);
         }
      }

   }

   protected static int method2789(short var0) {
      int var1 = 0;
      if (class59.field688 == null || !class59.field688.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if (var3.isValid()) {
                  class59.field688 = var3;
                  class59.field690 = -1L;
                  class59.field689 = -1L;
               }
            }
         } catch (Throwable var10) {
            ;
         }
      }

      if (class59.field688 != null) {
         long var11 = class6.method28(1358803598);
         long var4 = class59.field688.getCollectionTime();
         if (-1L != class59.field689) {
            long var6 = var4 - class59.field689;
            long var8 = var11 - class59.field690;
            if (var8 != 0L) {
               var1 = (int)(100L * var6 / var8);
            }
         }

         class59.field689 = var4;
         class59.field690 = var11;
      }

      return var1;
   }

   static boolean method2790(int var0, byte var1) {
      return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
   }

   static int method2788(int var0, class96 var1, boolean var2, int var3) {
      class242 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class3.method2(class81.field1272[--class135.field1964], 2051943165);
      } else {
         var4 = var2 ? class336.field4073 : class61.field713;
      }

      String var5 = class81.field1281[--class77.field1233];
      int[] var6 = null;
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
         int var7 = class81.field1272[--class135.field1964];
         if (var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = class81.field1272[--class135.field1964]) {
               ;
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var9 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var9.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            var9[var8] = class81.field1281[--class77.field1233];
         } else {
            var9[var8] = new Integer(class81.field1272[--class135.field1964]);
         }
      }

      var8 = class81.field1272[--class135.field1964];
      if (var8 != -1) {
         var9[0] = new Integer(var8);
      } else {
         var9 = null;
      }

      if (var0 == 1400) {
         var4.field2827 = var9;
      } else if (var0 == 1401) {
         var4.field2899 = var9;
      } else if (var0 == 1402) {
         var4.field2898 = var9;
      } else if (var0 == 1403) {
         var4.field2900 = var9;
      } else if (var0 == 1404) {
         var4.field2902 = var9;
      } else if (var0 == 1405) {
         var4.field2903 = var9;
      } else if (var0 == 1406) {
         var4.field2943 = var9;
      } else if (var0 == 1407) {
         var4.field2907 = var9;
         var4.field2908 = var6;
      } else if (var0 == 1408) {
         var4.field2859 = var9;
      } else if (var0 == 1409) {
         var4.field2914 = var9;
      } else if (var0 == 1410) {
         var4.field2904 = var9;
      } else if (var0 == 1411) {
         var4.field2833 = var9;
      } else if (var0 == 1412) {
         var4.field2844 = var9;
      } else if (var0 == 1414) {
         var4.field2870 = var9;
         var4.field2861 = var6;
      } else if (var0 == 1415) {
         var4.field2911 = var9;
         var4.field2912 = var6;
      } else if (var0 == 1416) {
         var4.field2905 = var9;
      } else if (var0 == 1417) {
         var4.field2915 = var9;
      } else if (var0 == 1418) {
         var4.field2916 = var9;
      } else if (var0 == 1419) {
         var4.field2918 = var9;
      } else if (var0 == 1420) {
         var4.field2830 = var9;
      } else if (var0 == 1421) {
         var4.field2919 = var9;
      } else if (var0 == 1422) {
         var4.field2860 = var9;
      } else if (var0 == 1423) {
         var4.field2921 = var9;
      } else if (var0 == 1424) {
         var4.field2922 = var9;
      } else if (var0 == 1425) {
         var4.field2924 = var9;
      } else if (var0 == 1426) {
         var4.field2925 = var9;
      } else {
         if (var0 != 1427) {
            return 2;
         }

         var4.field2894 = var9;
      }

      var4.field2937 = true;
      return 1;
   }
}

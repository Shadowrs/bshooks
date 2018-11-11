public final class class62 {
   static int[][][] field728 = new int[4][105][105];
   static byte[][][] field720 = new byte[4][104][104];
   static int field722 = 99;
   static int[] field727 = new int[]{1, 2, 4, 8};
   static int[] field731 = new int[]{16, 32, 64, 128};
   static int[] field730 = new int[]{1, 0, -1, 0};
   static int[] field726 = new int[]{0, -1, 0, 1};
   static int[] field723 = new int[]{1, -1, -1, 1};
   static int[] field732 = new int[]{-1, -1, 1, 1};
   static int field734 = (int)(Math.random() * 17.0D) - 8;
   static int field735 = (int)(Math.random() * 33.0D) - 16;
   static byte[][][] field733;
   static byte[][][] field729;
   static byte[][][] field724;
   static int[][][] field721;
   static byte[][][] field725;
   static int[][] field719;

   public static class330 method1088(byte var0) {
      class330 var1 = new class330();
      var1.field3975 = class332.field3991;
      var1.field3970 = class81.field1280;
      var1.field3969 = class54.field633[0];
      var1.field3976 = class332.field3990[0];
      var1.field3971 = class25.field358[0];
      var1.field3972 = class332.field3989[0];
      var1.field3974 = class332.field3992;
      var1.field3973 = class332.field3993[0];
      class259.method4544(-2140445350);
      return var1;
   }

   static final void method1068(class242 var0, int var1, int var2, int var3, int var4) {
      class236 var5 = var0.method4475(false, (byte)7);
      if (var5 != null) {
         if (client.field1087 < 3) {
            class69.field796.method5886(var1, var2, var5.field2765, var5.field2763, 25, 25, client.field925, 256, var5.field2766, var5.field2768);
         } else {
            class327.method5759(var1, var2, 0, var5.field2766, var5.field2768);
         }
      }

   }

   static final void method1086(int var0) {
      int var1 = class93.field1414;
      int[] var2 = class93.field1415;

      for(int var3 = 0; var3 < var1; ++var3) {
         class72 var4 = client.field971[var2[var3]];
         if (var4 != null) {
            class30.method300(var4, 1, 517651227);
         }
      }

   }
}

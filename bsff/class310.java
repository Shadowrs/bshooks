import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class class310 {
   class261 field3882;
   class261 field3883;
   HashMap field3884;

   public class310(class261 var1, class261 var2) {
      this.field3882 = var1;
      this.field3883 = var2;
      this.field3884 = new HashMap();
   }

   public HashMap method5501(class309[] var1, int var2) {
      HashMap var3 = new HashMap();
      class309[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class309 var6 = var4[var5];
         if (this.field3884.containsKey(var6)) {
            var3.put(var6, this.field3884.get(var6));
         } else {
            class261 var7 = this.field3882;
            class261 var8 = this.field3883;
            String var9 = var6.field3876;
            int var10 = var7.method4606(var9, 53695090);
            int var11 = var7.method4568(var10, "", (short)13981);
            class311 var12;
            if (!class288.method5204(var7, var10, var11, (byte)108)) {
               var12 = null;
            } else {
               var12 = class269.method4772(var8.method4551(var10, var11, -405755436), -1984825310);
            }

            if (var12 != null) {
               this.field3884.put(var6, var12);
               var3.put(var6, var12);
            }
         }
      }

      return var3;
   }

   public static void method5504(class201 var0, int var1) {
      class325 var2 = (class325)class326.field3951.method3988();
      if (var2 != null) {
         int var3 = var0.field2565;
         var0.addInt(var2.field3948, (byte)32);

         for(int var4 = 0; var4 < var2.field3942; ++var4) {
            if (var2.field3945[var4] != 0) {
               var0.addByte(var2.field3945[var4], (byte)-57);
            } else {
               try {
                  int var5 = var2.field3944[var4];
                  Field var6;
                  int var7;
                  if (var5 == 0) {
                     var6 = var2.field3946[var4];
                     var7 = var6.getInt((Object)null);
                     var0.addByte(0, (byte)-67);
                     var0.addInt(var7, (byte)111);
                  } else if (var5 == 1) {
                     var6 = var2.field3946[var4];
                     var6.setInt((Object)null, var2.field3947[var4]);
                     var0.addByte(0, (byte)-33);
                  } else if (var5 == 2) {
                     var6 = var2.field3946[var4];
                     var7 = var6.getModifiers();
                     var0.addByte(0, (byte)-5);
                     var0.addInt(var7, (byte)66);
                  }

                  Method var8;
                  if (var5 != 3) {
                     if (var5 == 4) {
                        var8 = var2.field3943[var4];
                        var7 = var8.getModifiers();
                        var0.addByte(0, (byte)-5);
                        var0.addInt(var7, (byte)14);
                     }
                  } else {
                     var8 = var2.field3943[var4];
                     byte[][] var9 = var2.field3949[var4];
                     Object[] var10 = new Object[var9.length];

                     for(int var11 = 0; var11 < var9.length; ++var11) {
                        ObjectInputStream var12 = new ObjectInputStream(new ByteArrayInputStream(var9[var11]));
                        var10[var11] = var12.readObject();
                     }

                     Object var25 = var8.invoke((Object)null, var10);
                     if (var25 == null) {
                        var0.addByte(0, (byte)-3);
                     } else if (var25 instanceof Number) {
                        var0.addByte(1, (byte)-34);
                        var0.addLong(((Number)var25).longValue());
                     } else if (var25 instanceof String) {
                        var0.addByte(2, (byte)-83);
                        var0.addString1((String)var25, -365913842);
                     } else {
                        var0.addByte(4, (byte)-20);
                     }
                  }
               } catch (ClassNotFoundException var13) {
                  var0.addByte(-10, (byte)-62);
               } catch (InvalidClassException var14) {
                  var0.addByte(-11, (byte)-67);
               } catch (StreamCorruptedException var15) {
                  var0.addByte(-12, (byte)-10);
               } catch (OptionalDataException var16) {
                  var0.addByte(-13, (byte)-69);
               } catch (IllegalAccessException var17) {
                  var0.addByte(-14, (byte)-119);
               } catch (IllegalArgumentException var18) {
                  var0.addByte(-15, (byte)-124);
               } catch (InvocationTargetException var19) {
                  var0.addByte(-16, (byte)-113);
               } catch (SecurityException var20) {
                  var0.addByte(-17, (byte)-87);
               } catch (IOException var21) {
                  var0.addByte(-18, (byte)-125);
               } catch (NullPointerException var22) {
                  var0.addByte(-19, (byte)-36);
               } catch (Exception var23) {
                  var0.addByte(-20, (byte)-17);
               } catch (Throwable var24) {
                  var0.addByte(-21, (byte)-13);
               }
            }
         }

         var0.method3556(var3, -1305885136);
         var2.method4014();
      }

   }

   static String method5500(String var0, class242 var1, int var2) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               var0 = var0.substring(0, var4) + class139.method3069(class47.method713(var1, var3 - 1, 647059532), (byte)97) + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }
}

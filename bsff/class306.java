public class class306 extends class301 {
   boolean field3854;
   boolean field3855;

   int method5459(class306 var1, byte var2) {
      return super.field3840 == client.field857 && client.field857 != var1.field3840 ? -1 : (client.field857 == var1.field3840 && super.field3840 != client.field857 ? 1 : (super.field3840 != 0 && var1.field3840 == 0 ? -1 : (var1.field3840 != 0 && super.field3840 == 0 ? 1 : (this.field3854 && !var1.field3854 ? -1 : (!this.field3854 && var1.field3854 ? 1 : (this.field3855 && !var1.field3855 ? -1 : (!this.field3855 && var1.field3855 ? 1 : (super.field3840 != 0 ? super.field3839 - var1.field3839 : var1.field3839 - super.field3839))))))));
   }

   public int vmethod5454(class296 var1, byte var2) {
      return this.method5459((class306)var1, (byte)-18);
   }

   public int compareTo(Object var1) {
      return this.method5459((class306)var1, (byte)-65);
   }
}

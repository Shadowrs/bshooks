import java.util.Hashtable;

public class Loader$ClassLoaderSub extends ClassLoader {
   public Hashtable<String, Class> loadedClasses = new Hashtable();
   public Loader$Unpacker unpacker;

   public Loader$ClassLoaderSub(Loader$Unpacker var1) {
      this.unpacker = var1;
   }

   public synchronized Class loadClass(String var1, boolean var2) throws ClassNotFoundException {
      if (var1.equals("Loader")) {
         return Class.forName("Loader");
      } else {
         Class var3 = (Class)this.loadedClasses.get(var1);
         if (var3 != null) {
            return var3;
         } else {
            if (this.unpacker != null) {
               byte[] var4 = this.unpacker.getClassBytes(var1);
               if (var4 != null) {
                  var3 = this.defineClass(var1, var4, 0, var4.length, super.getClass().getProtectionDomain());
                  if (var2) {
                     this.resolveClass(var3);
                  }

                  this.loadedClasses.put(var1, var3);
                  return var3;
               }
            }

            return super.findSystemClass(var1);
         }
      }
   }
}

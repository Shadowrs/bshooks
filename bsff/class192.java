import java.nio.ByteBuffer;

public class class192 extends class198 {
   ByteBuffer field2526;

   byte[] vmethod3763(int var1) {
      byte[] var2 = new byte[this.field2526.capacity()];
      this.field2526.position(0);
      this.field2526.get(var2);
      return var2;
   }

   void vmethod3771(byte[] var1, byte var2) {
      this.field2526 = ByteBuffer.allocateDirect(var1.length);
      this.field2526.position(0);
      this.field2526.put(var1);
   }
}

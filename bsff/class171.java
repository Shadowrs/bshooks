import java.io.IOException;
import java.net.Socket;

public class class171 extends class169 {
   static int field2225;
   class175 field2222;
   class163 field2223;
   Socket field2224;

   class171(Socket var1, int var2, int var3) throws IOException {
      this.field2224 = var1;
      this.field2224.setSoTimeout(30000);
      this.field2224.setTcpNoDelay(true);
      this.field2224.setReceiveBufferSize(65536);
      this.field2224.setSendBufferSize(65536);
      this.field2223 = new class163(this.field2224.getInputStream(), var2);
      this.field2222 = new class175(this.field2224.getOutputStream(), var3);
   }

   public void vmethod3325(int var1) {
      this.field2222.method3353(540187265);

      try {
         this.field2224.close();
      } catch (IOException var3) {
         ;
      }

      this.field2223.method3222(-2141740289);
   }

   public boolean vmethod3338(int var1, byte var2) throws IOException {
      return this.field2223.method3207(var1, (short)-3579);
   }

   public int vmethod3318(byte[] var1, int var2, int var3, int var4) throws IOException {
      return this.field2223.method3210(var1, var2, var3, 139136151);
   }

   public void vmethod3320(byte[] var1, int var2, int var3, int var4) throws IOException {
      this.field2222.method3355(var1, var2, var3, 1843339632);
   }

   public int vmethod3316(int var1) throws IOException {
      return this.field2223.method3208(-1762340013);
   }

   public int vmethod3315(int var1) throws IOException {
      return this.field2223.method3211(-1857757321);
   }

   protected void finalize() {
      this.vmethod3325(-1801563331);
   }
}

package msb.j2se.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TestDataStream {

  public static void main(String[] args) {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    DataOutputStream dos = new DataOutputStream(baos);
    ByteArrayInputStream bais = null;
    DataInputStream dis = null;
    try {
      dos.writeDouble(Math.random());
      dos.writeBoolean(true);
      dos.close();
      
      bais = new ByteArrayInputStream(baos.toByteArray());
      dis = new DataInputStream(bais);
      System.out.println(dis.available());
      System.out.println(dis.readDouble());
      System.out.println(dis.readBoolean());
      dis.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (baos != null) {
          baos.close();
        }
        if (dos != null) {
          dos.close();
        }
        if (bais != null) {
          bais.close();
        }
        if (dis != null) {
          dis.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }

}

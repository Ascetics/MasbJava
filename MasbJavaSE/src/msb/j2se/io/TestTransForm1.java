package msb.j2se.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransForm1 {

  public static void main(String[] args) {
    OutputStreamWriter osw = null;
    try {
      osw = new OutputStreamWriter(new FileOutputStream("E:/lingmks/MSB/char.txt"));
      osw.write("MicrosoftIBMOracleHP");
      System.out.println(osw.getEncoding());
      osw.close();

      osw = new OutputStreamWriter(new FileOutputStream("E:/lingmks/MSB/char.txt", true),
          "ISO8859_1");
      osw.write("MicrosoftIBMOracleHP");
      System.out.println(osw.getEncoding());
      osw.close();
    } catch (FileNotFoundException e) {
      System.out.println("ָ���ļ�δ�ҵ���");
      System.exit(-1);
    } catch (IOException e) {
      System.out.println("�ļ��������");
      System.exit(-2);
    } finally {
      if (osw != null) {
        try {
          osw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

}

package msb.j2se.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("E:/lingmks/MSB/TestFileWriter.dat");
      for (int i = 0; i < 50000; i++) {
        fw.write(i);
      }
      System.out.println("文件写完了！");
    } catch (IOException e) {
      System.out.println("文件写错误！");
      System.exit(-1);
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}

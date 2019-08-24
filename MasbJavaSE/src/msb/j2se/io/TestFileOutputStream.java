package msb.j2se.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

  public static void main(String[] args) {
    FileInputStream in = null;
    FileOutputStream out = null;
    int b;
    try {
      in = new FileInputStream("C:/Users/Administrator/git/MasbJava/MasbJavaSE/src/msb/j2se/io/TestFileOutputStream.java");
      out = new FileOutputStream("E:/lingmks/MSB/TestFileOutputStream.java");
      while ((b = in.read()) != -1) {
        out.write(b);
      }
      System.out.print("File copied");
      in.close();
      out.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
      System.exit(-1);
    } catch (IOException e) {
      System.out.println("File copy error!");
      System.exit(-2);
    } finally {
      try {
        in.close();
        out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}

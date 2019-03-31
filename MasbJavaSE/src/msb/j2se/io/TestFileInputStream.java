package msb.j2se.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {

  public static void main(String[] args) {
    FileInputStream in = null;
    int b = 0;
    
    try {
      in = new FileInputStream("C:/Users/Administrator/git/MasbJava/MasbJavaSE/src/msb/j2se/io/TestFileInputStream.java");
    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
      System.exit(-1);
    }
    
    try {
      long num =0;
      while ((b = in.read()) != -1) {
        System.out.print((char) b);
        num++;
      }
      in.close();
      System.out.println();
      System.out.println("read " + num + " bytes");
    } catch (IOException e) {
      System.out.println("Read Error!");
      System.exit(-1);
    }
  }

}

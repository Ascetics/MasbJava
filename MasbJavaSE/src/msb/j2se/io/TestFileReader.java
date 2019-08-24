package msb.j2se.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

  public static void main(String[] args) {
    FileReader fr = null;
    int c;
    try {
      fr = new FileReader("C:/Users/Administrator/git/MasbJava/MasbJavaSE/src/msb/j2se/io/TestFileReader.java");
      while ((c = fr.read())!= -1) {
        System.out.print((char)c);
      }
    } catch (FileNotFoundException e) {
      System.out.println("ָ���ļ��Ҳ�����");
      System.exit(-1);
    } catch (IOException e) {
      System.out.println("�ļ���ȡ����");
      System.exit(-2);
    } finally {
      try {
        System.out.print("finally");
        fr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}

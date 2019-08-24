package msb.j2se.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStreasm {

  public static void main(String[] args) {
    BufferedWriter bw = null;
    BufferedReader br = null;
    String s = null;
    try {
      bw = new BufferedWriter(new FileWriter("E:/lingmks/MSB/dat2.txt"));
      for (int i = 0; i < 100; i++) {
        s = String.valueOf(Math.random());
        bw.write(s);
        bw.newLine();
      }
      bw.flush();
      
      br = new BufferedReader(new FileReader("E:/lingmks/MSB/dat2.txt"));
      while ((s = br.readLine()) != null) {
        System.out.println(s);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (bw != null) {
        try {
          bw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

}

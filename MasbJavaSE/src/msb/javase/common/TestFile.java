/**
 * 
 */
package msb.javase.common;

import java.io.File;
import java.io.IOException;

/**
 * @author oradba
 *
 */
public class TestFile {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String seprator = File.separator;
    String fileName = "myfile.txt";
    String directory = "mydir1" + seprator + "mydir2";
    File f = new File(directory, fileName);
    
    if (f.exists()) {
      System.out.println("File Name: " + f.getAbsolutePath());
      System.out.println("File Size: " + f.length());
    } else {
      f.getParentFile().mkdirs();
      try {
        f.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}

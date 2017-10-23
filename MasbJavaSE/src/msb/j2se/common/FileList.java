/**
 * 
 */
package msb.j2se.common;

import java.io.File;

/**
 * @author mingkun.ling
 *
 */
public class FileList {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String dir = new String("D:\\Ñ¸À×ÏÂÔØ");
    File root = new File(dir);
    tree(root, 0);
  }
  
  private static void tree(File root, int level) {
    StringBuilder spreBuilder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      spreBuilder.append("  ");
    }
    System.out.println(spreBuilder + root.getName());
    
    if (root.isDirectory()) {
      File[] files = root.listFiles();
      for (int i = 0; i < files.length; i++) {
        tree(files[i], level + 1);
      }
    }
  }

}

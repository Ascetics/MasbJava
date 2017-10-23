/**
 * 
 */
package msb.j2se.array;

/**
 * @author mingkun.ling
 *
 */
public class TestArray {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int a[] = {2, 4, 6, 7, 3, 5, 1, 8, 9};
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }

}

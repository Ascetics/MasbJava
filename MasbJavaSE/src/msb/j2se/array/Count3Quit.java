/**
 * 
 */
package msb.j2se.array;

/**
 * @author mingkun.ling
 *
 */
public class Count3Quit {

  /**
   * @param args
   */
  public static void main(String[] args) {
    boolean[] arr = new boolean[500];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = true;
    }
    
    int leftCount = arr.length;
    int count = 0;
    int index = 0;
    while (leftCount > 1) {
      if (arr[index]) {
        count++;
        if (count == 3) {
          count = 0;
          arr[index] = false;
          leftCount--;
        }
      }
      index++;
      if (index >= arr.length) {
        index = 0;
      }
    }
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]) {
        System.out.println(i);
      }
    }
  }

}

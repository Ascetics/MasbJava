/**
 * 
 */
package msb.javase.array;

import java.util.Arrays;

/**
 * @author mingkun.ling
 *
 */
public class NumSort {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int[] a = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      a[i] = Integer.parseInt(args[i]);
    }
    
    printIntArray(a);
    Arrays.sort(a);
    printIntArray(a);
  }
  
  private static void printIntArray(int[] a) {
    for (int i : a) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

}

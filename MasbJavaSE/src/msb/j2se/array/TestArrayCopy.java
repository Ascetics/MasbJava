/**
 * 
 */
package msb.j2se.array;

/**
 * @author mingkun.ling
 *
 */
public class TestArrayCopy {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] s = {"Microsoft", "IBM", "Oracle", "Apple", "Huawei"};
    String[] sBak = new String[6];
    System.arraycopy(s, 0, sBak, 0, s.length);
    for (int i = 0; i < sBak.length; i++) {
      System.out.print(sBak[i] + " ");
    }
    
    System.out.println();
    int[][] intArray = {{1, 2}, {1, 2, 3}, {3, 4}};
    int[][] intArrayBak = new int[3][];
    System.arraycopy(intArray, 0, intArrayBak, 0, intArray.length);
    intArrayBak[2][1] = 100;
    for (int i = 0; i < intArrayBak.length; i++) {
      for (int j = 0; j < intArrayBak[i].length; j++) {
        System.out.print(intArray[i][j] + " ");
      }
      System.out.println();
    }
    
    int[][] intArrayBak2 = new int[3][];
    for (int i = 0; i < intArrayBak2.length; i++) {
      intArrayBak2[i] = new int[intArray[i].length];
      System.arraycopy(intArray[i], 0, intArrayBak2[i], 0, intArray[i].length);
    }
    intArrayBak2[2][1] = 300;
    for (int i = 0; i < intArrayBak.length; i++) {
      for (int j = 0; j < intArrayBak[i].length; j++) {
        System.out.print(intArray[i][j] + " ");
      }
      System.out.println();
    }
    for (int i = 0; i < intArrayBak2.length; i++) {
      for (int j = 0; j < intArrayBak2[i].length; j++) {
        System.out.print(intArrayBak2[i][j] + " ");
      }
      System.out.println();
    }
  }

}

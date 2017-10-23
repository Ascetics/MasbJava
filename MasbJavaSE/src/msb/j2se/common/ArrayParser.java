/**
 * 
 */
package msb.j2se.common;

/**
 * @author mingkun.ling
 *
 */
public class ArrayParser {

  /**
   * @param args
   */
  public static void main(String[] args) {
    char[] cs = {'1', ',', '2', ';', '3', ',', '4', ',', '5', ';', '6', ',', '7', ',', '8'};
    String s = new String(cs);
    System.out.println(s);
    
    String[] s1= s.split(";");
    double[][] doubleArray = new double[s1.length][];
    for (int i = 0; i < s1.length; i++) {
      String[] s2 = s1[i].split(",");
      doubleArray[i] = new double[s2.length];
      for (int j = 0; j < s2.length; j++) {
        doubleArray[i][j] = Double.parseDouble(s2[j]);
      }
    }
    
    for (int i = 0; i < doubleArray.length; i++) {
      for (int j = 0; j < doubleArray[i].length; j++) {
        System.out.print(doubleArray[i][j] + " ");
      }
      System.out.println();
    }
  }

}

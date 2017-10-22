/**
 * 
 */
package msb.javase.common;

/**
 * @author oradba
 *
 */
public class TestCountJava {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s = "sunjavahpjavaokjavajavahahajavajavagoodjava";
    System.out.println(countSpecificString(s, "java"));
  }
  
  private static int countSpecificString(final String str, final String reg) {
    int count = 0;
    int fromIndex = str.indexOf(reg);
    while (-1 != fromIndex) {
      count++;
      fromIndex = str.indexOf(reg, fromIndex + reg.length());
    }
    return count;
  }

}

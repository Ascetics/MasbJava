/**
 * 
 */
package msb.j2se.common;

/**
 * @author oradba
 *
 */
public class TestCountJava {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String s = "sunjavahpjavaokjavajavahahajavajavagoodjava";
    int count = countSpecificString(s, "java");
    System.out.println(count);
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

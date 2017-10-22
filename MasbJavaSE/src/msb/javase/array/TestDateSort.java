/**
 * 
 */
package msb.javase.array;

import java.util.Arrays;

/**
 * @author mingkun.ling
 *
 */
public class TestDateSort {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Date[] dates = new Date[5];
    dates[0] = new Date(2006, 5, 4);
    dates[1] = new Date(2006, 7, 4);
    dates[2] = new Date(2008, 5, 4);
    dates[3] = new Date(2004, 5, 9);
    dates[4] = new Date(2004, 5, 4);
    
    printDateArray(dates);
    Arrays.sort(dates);
    printDateArray(dates);
  }
  
  private static void printDateArray(Date[] dates) {
    for (Date date : dates) {
      System.out.println(date);
    }
  }
  
}

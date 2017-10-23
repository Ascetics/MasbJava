/**
 * 
 */
package msb.j2se.array;

/**
 * @author mingkun.ling
 * @param <T>
 *
 */
public class Date implements Comparable<Date>{
  private int year, month, day;

  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Override
  public String toString() {
    return "Year,month,day -- " + year + "," + month + "," + day;
  }

  @Override
  public int compareTo(Date o) {
    if (year > o.year) {
      return 1;
    } else if (year < o.year) {
      return -1;
    } else if (month > o.month) {
      return 1;
    } else if (month < o.month) {
      return -1;
    } else if (day > o.day) {
      return 1;
    } else if (day < o.day) {
      return -1;
    } else {
      return 0;
    }
  }
  
}

/**
 * 
 */
package msb.javase.common;

/**
 * @author mingkun.ling
 *
 */
public class TestEnum {

  /**
   * @param args
   */
  public static void main(String[] args) {
    MyColor m = MyColor.red;
    switch (m) {
      case red:
        System.out.println("red");
        break;
      case green:
        System.out.println("green");
        break;
      case blue:
        System.out.println("blue");
        break;
      default:
        System.out.println("default");
        break;
    }
    System.out.println(m);
  }

  public enum MyColor {
    red, green, blue
  }
}

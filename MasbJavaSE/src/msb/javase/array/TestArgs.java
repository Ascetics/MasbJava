/**
 * 
 */
package msb.javase.array;

/**
 * @author mingkun.ling
 *
 */
public class TestArgs {

  /**
   * @param args
   */
  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Usage: java Test \"n1\" \"op\" \"n2\"");
      System.exit(-1);
    }
    
    double d1 = Double.parseDouble(args[0]);
    double d2 = Double.parseDouble(args[2]);
    double d = 0;
    if (args[1].equals("+")) {
      d = d1 + d2;
    } else if (args[1].equals("-")) {
      d = d1 - d2;
    } else if (args[1].equals("x")) {
      d = d1 * d2;
    } else if (args[1].equals("/")) {
      d = d1 / d2;
    } else {
      System.out.println("operator error!");
      System.exit(-1);
    }
    System.out.println(d);
  }

}

package msb.j2se.container;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {

  public static void main(String[] args) {
    Collection<Name> c = new HashSet<>();
    c.add(new Name("ffff1", "llll1"));
    c.add(new Name("f2", "l2"));
    c.add(new Name("ff333", "lll333"));
    
    for (Iterator<Name> i = c.iterator(); i.hasNext();) {
      Name n = i.next();
      if (n.getFirstName().length() < 3) {
        i.remove();
        //c.remove(n); exception
      }
    }
    System.out.println(c);
  }

}

/**
 * 
 */
package msb.j2se.container;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author oradba
 *
 */
public class BasicContainer {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Collection c = new HashSet();
    c.add("hello");
    c.add(new Name("f1", "l1"));
    c.add(new Integer(100));
    c.remove("hello");
    c.remove(new Integer(100));
    System.out.println(c.remove(new Name("f1", "l1")));
    System.out.println(c);
    
    Name n1 = new Name("f1", "l1");
    Name n2 = new Name("f1", "l2");
    System.out.println(n1.hashCode());
    System.out.println(n2.hashCode());
    
  }

}

class Name {
  private String firstName, lastName;

  public Name(String firstName, String lastName) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName;
  }

  @Override
  public int hashCode() {
    return firstName.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    if (obj instanceof Name) {
      Name other = (Name) obj;
      return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    }
    return super.equals(obj);
  }
  
}
/**
 * 
 */
package msb.javase.array;


/**
 * @author mingkun.ling
 *
 */
public class Count3Quit2 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    KidCircle kidCircle = new KidCircle(500);
    kidCircle.countQuit(3);
    System.out.println(kidCircle.getFirst().getNum());
  }

}

class KidCircle {
  private int count = 0;
  private Kid first, last;
  
  public KidCircle(int count) {
    for (int i = 0; i < count; i++) {
      add();
    }
  }
  
  public Kid getFirst() {
    return first;
  }

  public void add() {
    if (count <= 0) {
      Kid k = new Kid(0);
      count = 1;
      k.setLeft(k);
      k.setRight(k);
      first = k;
      last = k;
    } else {
      Kid k = new Kid(count);
      count++;
      last.setRight(k);
      k.setLeft(last);
      k.setRight(first);
      first.setLeft(k);
      last = k;
    }
    
  }
  
  public void delete(Kid k) {
    if (count <= 0) {
      return;
    }
    if (count == 1) {
      first = last =  null;
      count = 0;
      return;
    }
    k.getLeft().setRight(k.getRight());
    k.getRight().setLeft(k.getLeft());
    if (k == first) {
      first = first.getRight();
    }
    if (k == last) {
      last = last.getLeft();
    } 
    count--;
  }
  
  public void countQuit(final int countQuitNum) {
    int num = 0;
    Kid k = first;
    while (count > 1) {
      num++;
      if (countQuitNum == num) {
        num = 0;
        delete(k);
      }
      k = k.getRight();
    }
  }
}

class Kid {
  private final int num;
  private Kid left;
  private Kid right;
  
  public Kid(int num) {
    super();
    this.num = num;
    this.left = this;
    this.right = this;
  }

  public Kid getLeft() {
    return left;
  }

  public void setLeft(Kid left) {
    this.left = left;
  }

  public Kid getRight() {
    return right;
  }

  public void setRight(Kid right) {
    this.right = right;
  }

  public int getNum() {
    return num;
  }
  
}
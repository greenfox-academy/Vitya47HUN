import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Counter num = new Counter();
    num.add();
    num.add();
    num.add();
    num.add();
    System.out.println(num);
    num.get();
    System.out.println(num);
    num.reset();
    System.out.println(num);
  }
}
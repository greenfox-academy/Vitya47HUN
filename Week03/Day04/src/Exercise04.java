// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
public class Exercise04 {
  public static void main(String[] args) {
    System.out.println(powered(3, 5));
  }

  public static int powered(int base, int power) {
    if (power == 1)
      return base;
    else if (power % 2 == 0) {
      int x = powered(base, power / 2);
      return x * x;
    } else {
      int x = powered(base, (power - 1) / 2);
      return x * x * base;
    }
  }
}


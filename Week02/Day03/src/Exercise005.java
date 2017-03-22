//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Exercise005 {
  public static void main(String[] args) {
  int number = 10;
    System.out.println(factorio(number));
  }

  public static int factorio(int number) {
    int res = 1;
    for (int i = 1; i <= number; i++) {
      res = res * i;
    }
    return res;
  }
}

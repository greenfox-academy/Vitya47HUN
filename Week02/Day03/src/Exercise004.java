//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter
public class Exercise004 {
  public static void main(String args[]) {

    int number = 8;
    System.out.println(sum(number));


  }

  public static int sum(int number) {
    int res = 0;
    for (int i = 0; i <= number; i++) {
      res = res + i;
    }
    return res;
  }

}
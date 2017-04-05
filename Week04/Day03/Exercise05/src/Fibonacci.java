public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacci(6));
  }
  public static int fibonacci(int number) {
    if (number == 0) {
      return 0;
    }
    else if (number > 1) {
      return fibonacci(number - 1) + fibonacci(number - 2);
    }
    return number;
  }
}
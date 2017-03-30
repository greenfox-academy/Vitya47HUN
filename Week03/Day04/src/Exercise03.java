// Given a non-negative int n, return the sum of its digits!! recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
public class Exercise03 {
  public static void main(String[] args) {
    System.out.println(digitSum(123));
  }
  public static int digitSum(int n) {
    System.out.println("This is n : " + n);
    int r = n % 10;       //remainder, last digit of the number
    int num = n / 10;     //the rest of the number without the last digit
    if (num == 0) {
      return n;
    } else {
      int k = digitSum(num) + r;
      System.out.println("This is return value : " + k);
      return k;
    }
  }
}

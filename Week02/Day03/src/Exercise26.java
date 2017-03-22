// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150
import java.util.Scanner;
public class Exercise26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type a number");
    int userInput1 = scanner.nextInt();
    for (int i = 1; i <= 10; i++){
      System.out.println(i + "*" + userInput1 + "=" + (i*userInput1));
    }
  }
}

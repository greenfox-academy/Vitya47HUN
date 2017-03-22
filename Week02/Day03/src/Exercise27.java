// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
import java.util.Scanner;
public class Exercise27 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type a number");
    int userInput1 = scanner.nextInt();
    for (int i=1; i<=userInput1; i += 2)
    {
      for (int k=0;k < (4 - i / 2);k++)
        System.out.print(" ");
      for (int j=0; j<=i; j++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }

  }
}
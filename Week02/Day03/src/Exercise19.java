import java.util.Scanner;

// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot
public class Exercise19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number");
    int userInput1 = scanner.nextInt();

   if (userInput1 <= 0 ) {
     System.out.println("Not enough");
   }
   if (userInput1 == 1 ) {

     System.out.println("One");
   }
   if (userInput1 == 2 ) {
     System.out.println("Two");
   }
   if (userInput1 > 2 ) {
     System.out.println("Too much.");
   }
  }
}


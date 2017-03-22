import java.util.Scanner;
public class Exercise18 {
  public static void main(String[] args) {

    // Write a program that reads a number form the standard input,
    // Than prints "Odd" if the number is odd, or "Even" it it is even

      Scanner scanner = new Scanner(System.in);
      System.out.println("Please type a number");


      int userInput1 = scanner.nextInt();

      if (userInput1 % 2 == 0) {
        System.out.println("Even");
      }
        else {
        System.out.println("Odd");

      }


  }
}

import java.util.Scanner;
  public class Exercise16 {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs the farmer has
    // It should print how many legs all the animals have

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many chicken do the farmer has?");

    int userInput1 = scanner.nextInt();

    System.out.println("How many pigs do the farmer has?");

    int userInput2 = scanner.nextInt();

    System.out.println((userInput1 * 2) + (userInput2 * 4));
  }
}
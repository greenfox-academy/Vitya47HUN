// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;
public class Exercise17 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type 5 numbers");

    // The program stops and waits for user input and to press enter
    int userInput1 = scanner.nextInt();
    int userInput2 = scanner.nextInt();
    int userInput3 = scanner.nextInt();
    int userInput4 = scanner.nextInt();
    int userInput5 = scanner.nextInt();
    int sum = + userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
    int avg = sum / 5;

    // It prints the whole line that was given by the user
    System.out.println("The sum of your numbers is: " + sum);
    System.out.println("The average of your numbers is: " + avg);

  }

}

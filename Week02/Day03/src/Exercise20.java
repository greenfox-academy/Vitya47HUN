// Write a program that asks for two numbers and prints the bigger one
import java.util.Scanner;
public class Exercise20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type 2 numbers");
    int userInput1 = scanner.nextInt();
    int userInput2 = scanner.nextInt();

    if(userInput1 < userInput2){
      System.out.println(userInput2);
    }
    else {
      System.out.println(userInput1);
    }

  }
}

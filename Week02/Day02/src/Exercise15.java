import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
      // Write a program that asks for an integer that is a distance in kilometers,
      // then it converts that value to miles and prints it
      Scanner scanner = new Scanner(System.in);
      System.out.println("How far (km)?");

      int userInput1 = scanner.nextInt();

      // It prints the whole line that was given by the user


      System.out.println(userInput1 * 0.621371);

    }
  }




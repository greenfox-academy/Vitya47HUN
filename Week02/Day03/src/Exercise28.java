import java.util.Scanner;
public class Exercise28 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a number");
    int userInput1 = scanner.nextInt();
    for (int i=1; i<userInput1; i += 2)
    {
      for (int k=0;k < (4 - i / 2);k++)
        System.out.print(" ");
      for (int j=0; j<i; j++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }

  }
}


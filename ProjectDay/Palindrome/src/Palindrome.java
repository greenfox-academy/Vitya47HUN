import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    do {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome, I am the mighty palindrome builder, please enter a word and wait for the magic.");
      String answer = scanner.nextLine();
      if (answer.equals("Exit program")) {
        System.exit(0);
      } else {
        System.out.println(answer + reversePalindrome(answer));
      }
    } while (true);
  }

  public static String reversePalindrome(String text) {
    int length = text.length();
    String reversed = "";
    for (int i = length - 1; i >= 0; i--) {
      reversed = reversed + text.charAt(i);
    }
    return reversed;
  }

}

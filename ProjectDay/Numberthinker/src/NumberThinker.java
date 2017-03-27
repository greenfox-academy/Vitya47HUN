import java.util.Random;
import java.util.Scanner;
public class NumberThinker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give a boundary of 0 - x!");
    int boundary = scanner.nextInt();

    Random nm = new Random();
    int randomNumber = nm.nextInt(Integer.valueOf(boundary));

    System.out.println("Please guess a number between 0 - " + boundary);

    int lives = 4;
    while (lives >= 0) {
      int answer = scanner.nextInt();

      if (answer == randomNumber) {
        System.out.println("Congratulation you guessed my number! You must be a genius...");
        System.exit(0);
      } else if (lives == 0) {
        System.out.println("You are out of lives! GAME OVER! My number was: " + randomNumber);
        System.exit(0);
      } else if (answer < randomNumber) {
        System.out.println("My number is bigger than that! Guess again! Your lives left: " + lives);
        lives--;
      } else if (answer > randomNumber) {
        System.out.println("My number is smaller than that!Your lives left: " + lives);
        lives--;
      }
    }
  }
}


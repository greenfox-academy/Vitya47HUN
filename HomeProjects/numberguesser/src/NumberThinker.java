import java.util.Random;
import java.util.Scanner;

public class NumberThinker {
    public static void main(String[] args) {
        Random nm = new Random();
        int randomNumber = nm.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please think of a number between 1 - 100!");
        // boolean win = false;
        int lives = 4;
        while (lives <= 5) {
            String answer = scanner.nextLine();
            int answerNm = Integer.valueOf(answer);

            if (answerNm == randomNumber) {
                System.out.println("Congratulation you guessed my number! You must be a genius...");
                System.exit(0);
            } else if (lives == 0) {
                System.out.println("You are out of lives! GAME OVER! My number was: " + randomNumber);
                System.exit(0);
            } else if (answerNm < randomNumber) {
                System.out.println("My number is bigger than that! Guess again! Your lives left: " + lives);
                lives--;
            } else if (answerNm > randomNumber) {
                System.out.println("My number is smaller than that!Your lives left: " + lives);
                lives--;
            }
        }
    }
}






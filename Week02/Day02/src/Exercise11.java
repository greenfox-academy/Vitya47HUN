/**
 * Created by pc on 2017.03.21..
 */
public class Exercise11 {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented bt the variables
    int result = ((currentHours*60) + 34) * 60 + 42;

    System.out.println(86400 - result);

  }
}

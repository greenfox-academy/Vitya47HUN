/**
 * Created by pc on 2017.03.21..
 */
public class Exercise06 {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52


    int hours = 6;
    int semester = 17;
    int workdays = 5;
    int first = hours * workdays * semester;
    int percent = 52 * semester;
    int second = percent * 100 / first;
    System.out.println(first);
    System.out.println(second + "%");
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)
public class Exercise006 {
  public static void main(String[] args) {
    String [] texts = {"a","b","c","d"};

    printer(texts);
  }

  public static void printer(String... texts) {
    for (String random:texts) {
      System.out.println(random);

    }

  }
}

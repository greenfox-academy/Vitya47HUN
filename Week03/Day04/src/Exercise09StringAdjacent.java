// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
public class Exercise09StringAdjacent {
  public static void main(String[] args) {

    System.out.println(letterchange("xerxes was a king."));
  }

  public static String letterchange(String text) {
    int character = 0;
    int end = 0;

    if (text.length() < 1) {
      return text;
    }
    else if (end < text.length()) {
      end++;
      character++;
      return text.substring(character - 1) + "*" + letterchange(text.substring(character + 1));
    }
    else {
      return text;
    }
  }
}



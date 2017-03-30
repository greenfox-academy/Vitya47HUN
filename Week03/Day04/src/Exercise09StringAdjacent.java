// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
public class Exercise09StringAdjacent {
  public static void main(String[] args) {

    System.out.println(letterchange("xerxes was a king."));
  }

  public static String letterchange(String text) {
    char x = 'x';
    char y = 'y';
    int end = 0;

    if (text.length() < 1) {
      return text;
    }
    else if (end < text.length()) {
      return text.substring(0) + "*" + letterchange(text.substring(1));
    }
    else {
      return text.charAt(0) + letterchange(text.substring(1));
    }
  }
}



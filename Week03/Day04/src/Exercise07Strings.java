// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
public class Exercise07Strings {
  public static void main(String[] args) {

    System.out.println(letterchange("xerxes was a king."));
  }

  public static String letterchange(String text) {
    char x = 'x';
    char y = 'y';

    if (text.length() < 1) {
      return text;
    }
    else if (x == text.charAt(0)) {
        return y + letterchange(text.substring(1));
      }
      else {
        return text.charAt(0) + letterchange(text.substring(1));
      }
    }
  }



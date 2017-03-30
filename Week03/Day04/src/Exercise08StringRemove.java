// Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class Exercise08StringRemove {
  public static void main(String[] args) {

    System.out.println(letterchange("xerxes was a king."));
  }

  public static String letterchange(String text) {
    char x = 'x';
    String y = "";

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



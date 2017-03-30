// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
public class Exercise07Strings {
  public static void main(String[] args) {

    System.out.println(letterchange("Xerxes is a king.",'x', 'y'));
  }

  public static String letterchange(String text, char x, char y) {
    int count = 0;
    if (text.charAt(0) == x){
      count = count + 1;
      return letterchange(text, x = y, y);
    }
      else return text;
  }
}

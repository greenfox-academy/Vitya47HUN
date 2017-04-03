public class Exercise01 {
  public static void main(String[] args) {
    PostIt text1 = new PostIt();
    PostIt text2 = new PostIt();

    text1.text = "Ideal";
    text1.textColor = "Blue";
    text1.backgroundColor = "Orange";
    text2.text = "Awsome";
    text2.textColor = "Black";
    text2.backgroundColor = "Pink";

    System.out.println(text1.text + " " + text1.textColor + " " + text1.backgroundColor);
  }

}

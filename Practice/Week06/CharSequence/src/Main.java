public class Main {
  public static void main(String[] args) {
    CharOperations charOperations = new CharOperations("Hello worlds,this is char test");
    System.out.println(charOperations.length());
    System.out.println(charOperations.charAt(2));
    System.out.println(charOperations.subSequence(3, 7));
    System.out.println(charOperations.toString());
  }
}
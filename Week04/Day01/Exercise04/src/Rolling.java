public class Rolling {
  public static void main(String[] args) {
    Dice number = new Dice();
    number.roll();
    System.out.println(number.getCurrent());
  }
}

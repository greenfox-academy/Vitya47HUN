public class Roll {
  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.roll();
    for (int i = 0; i < 6; i++) {
      if (myDice.getCurrent(i) == 6) {
      }
      while (myDice.getCurrent(i) < 6) {
        myDice.reroll(i);
      }
      System.out.println(myDice.getCurrent(i));
    }

  }

}




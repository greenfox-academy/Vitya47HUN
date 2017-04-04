public class Garden {
  public static void main(String[] args) {
    Flowers tulip = new Flowers();
    tulip.setcolor("Red");

      tulip.watering(40);
    System.out.println(tulip.waterlevel + " " + tulip.color);
  }

}

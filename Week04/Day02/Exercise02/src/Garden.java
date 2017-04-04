public class Garden {
  public static void main(String[] args) {
    Flowers tulip = new Flowers();
    tulip.setcolor("Red");
    for (int i = 0; i < tulip.waterlimit; i++){
      tulip.watering();
    }
    System.out.println(tulip.waterlevel + " " + tulip.color);
  }

}

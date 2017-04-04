public class Garden {
  public static void main(String[] args) {
    Flowers tulip = new Flowers("Red", 0);
    
    for (int i = 0; i < 50; i++){
      tulip.watering();
    }
    System.out.println(tulip.waterlevel);
  }

}

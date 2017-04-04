import java.util.ArrayList;

public class Garden {
  public static void main(String[] args) {

    ArrayList<Flowers> allFlowers = new ArrayList<>();

    Flowers rose = new Flowers("blue", 1,5);
    allFlowers.add(rose);
    Flowers tulip = new Flowers("white", 2,5);
    allFlowers.add(tulip);

    for (int i = 0;i < allFlowers.size();i++){
      if (allFlowers.get(i).waterlevel < 5){
        allFlowers.get(i).watering(40);
        System.out.println("The flower :"allFlowers.get(i).waterlevel);
      }

    }

  }

}

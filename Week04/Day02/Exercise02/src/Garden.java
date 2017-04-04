import java.util.ArrayList;

public class Garden {
  public static void main(String[] args) {

    ArrayList<Flowers> allFlowers = new ArrayList<>();

    Flowers rose = new Flowers("blue", 2, 5);
    allFlowers.add(rose);
    Flowers tulip = new Flowers("white", 2, 5);
    allFlowers.add(tulip);
    Flowers pitypang = new Flowers("green", 3, 5);
    allFlowers.add(pitypang);
    Flowers szotyi = new Flowers("red", 6, 5);
    allFlowers.add(szotyi);

    double thristyPlants = 0.0;

    for (int i = 0; i < allFlowers.size(); i++) {
      if (allFlowers.get(i).waterlevel < 5) {
        thristyPlants += 1.0;
      }

    }
    for (int j = 0; j < allFlowers.size(); j++) {
      if (allFlowers.get(j).waterlevel < 5) {
        allFlowers.get(j).watering(6.0 / thristyPlants);


      }
    }
    for (int i = 0; i < allFlowers.size(); i++) {
      System.out.println(allFlowers.get(i));
    }
  }
}

  





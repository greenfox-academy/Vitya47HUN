import java.util.ArrayList;

public class Garden {
  public static void main(String[] args) {

    ArrayList<Plants> allPlants = new ArrayList<>();

    Flowers rose = new Flowers("blue", 0, 5);
    allPlants.add(rose);
    Flowers tulip = new Flowers("white", 0, 5);
    allPlants.add(tulip);
    Trees oak = new Trees("green", 0, 10.0);
    allPlants.add(oak);
    Trees tolgy = new Trees("red", 0, 10.0);
    allPlants.add(tolgy);

    double thristyPlants = 0.0;

    for (int i = 0; i < allPlants.size(); i++) {
      if (allPlants.get(i).waterlevel < allPlants.get(i).waterlimit) {
        thristyPlants += 1.0;
      }
    }
    for (int j = 0; j < allPlants.size(); j++) {
      if (allPlants.get(j).waterlevel < allPlants.get(j).waterlimit) {
        allPlants.get(j).watering(0 / thristyPlants);
        System.out.println("The " + allPlants.get(j).color + " " + allPlants.get(j).getClass());
        allPlants.get(j).info();
      }
    }

    thristyPlants = 0.0;

    for (int i = 0; i < allPlants.size(); i++) {
      if (allPlants.get(i).waterlevel < allPlants.get(i).waterlimit) {
        thristyPlants += 1.0;
      }
    }
    for (int j = 0; j < allPlants.size(); j++) {
      if (allPlants.get(j).waterlevel < allPlants.get(j).waterlimit) {
        allPlants.get(j).watering(40 / thristyPlants);
        System.out.println("The " + allPlants.get(j).color + " " + allPlants.get(j).getClass());
        allPlants.get(j).info();
      }
    }

    thristyPlants = 0.0;

    for (int i = 0; i < allPlants.size(); i++) {
      if (allPlants.get(i).waterlevel < allPlants.get(i).waterlimit) {
        thristyPlants += 1.0;
      }
    }
    for (int j = 0; j < allPlants.size(); j++) {
      if (allPlants.get(j).waterlevel < allPlants.get(j).waterlimit) {
        allPlants.get(j).watering(70 / thristyPlants);
        System.out.println("The " + allPlants.get(j).color + " " + allPlants.get(j).getClass());
        allPlants.get(j).info();
      } else
        System.out.println("The " + allPlants.get(j).color + " " + allPlants.get(j).getClass());
      allPlants.get(j).info();
    }

  }
}









//You have the Thing class
//You have the Fleet class
//You have the FleetOfThings class with a main method
//        Download those, use those
//        In the main method create a fleet
//        Achieve this output:
//        1. [ ] Get milk
//        2. [ ] Remove the obstacles
//        3. [x] Stand up
//        4. [x] Eat lunch

public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    fleet.add(true);
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}
import java.util.*;

public class Exercise09 {
  public static void main(String... args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    // Accidentally we added "2" and "false" to the list. 
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines

    for (int i = 0; i <= 4; i++) {
      if (i == arrayList.indexOf(2)) {
        arrayList.set(arrayList.indexOf(2), "Croissant");
      } else if (i == arrayList.indexOf(false)) {
        arrayList.set(arrayList.indexOf(false), "Ice cream");
      }

    }
    System.out.println(arrayList);
  }
}

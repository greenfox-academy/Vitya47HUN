import java.io.File;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise01 {
  public static void main(String[] args) {
    // Create a method that find the 5 most common lotto numbers assets/lotto.csv
    Map<String, Integer> map = new HashMap<String, Integer>();
    try {
      Path filePath = Paths.get("otos.csv");
      List<String> lines = Files.readAllLines(filePath);
      List<String> numbers = new ArrayList<String>();
      for (int i = 0; i < lines.size(); i++) {

        List<String> list = Arrays.asList(lines.get(i).split(";"));
        List<String> allNumbers = (list.subList(list.size() - 5, list.size()));
        numbers.addAll(allNumbers);
//        System.out.println(list.subList(list.size() - 5, list.size()));x

      }

      for (int j = 0; j < numbers.size(); j++) {
        Integer count = map.get(numbers.get(j));
        map.put(numbers.get(j), count == null ? 1 : count + 1);   //auto boxing and count
      }

//      System.out.println(map);

      for (String key : map.keySet()) {
        map.get(key);
        for (int k = 0; k < key.length(); k++) {
          int max = key.indexOf(k);

          System.out.println(key);
        }

//      System.out.println(numbers);

      }

    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Error");
    }

  }
}

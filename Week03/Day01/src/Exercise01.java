
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Exercise01 {
  final public static String CSV_PATH = "otos.csv";
  final public static String SEPARATOR = ";";
  final public static int NUMBER_START_INDEX = 11;
  final public static int LOTTERY_COUNT = 5;

  public static void main(String[] args) {
    List<String> allNumbers = parseAllNumbersFromFile();
    Map<String, Integer> numberCounts = getNumberCounts(allNumbers);
    List<Integer> topFiveCounts = getTopFiveCounts(numberCounts);

    for (Map.Entry<String, Integer> entry : numberCounts.entrySet()) {
      if (topFiveCounts.contains(entry.getValue())) {
        System.out.println(entry.getKey() + "/" + entry.getValue());
      }
    }
  }

  public static List<Integer> getTopFiveCounts(Map<String, Integer> numberCounts) {
    List<Integer> allCounts = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : numberCounts.entrySet()) {
      allCounts.add(entry.getValue());
    }
    Collections.sort(allCounts);
    Collections.reverse(allCounts);
    return allCounts.subList(0, 5);
  }

  public static Map<String, Integer> getNumberCounts(List<String> allNumbers) {
    Map<String, Integer> numberCounts = new HashMap<String, Integer>();
    for (String number : allNumbers) {
      if (numberCounts.containsKey(number)) {
        numberCounts.put(number, numberCounts.get(number) + 1);
      } else {
        numberCounts.put(number, 1);
      }
    }
    return numberCounts;
  }

  public static List<String> parseAllNumbersFromFile() {
    List<String> allNumbers = new ArrayList<>();
    List<String> lines = readFileLines();
    for (String line : lines) {
      String[] values = Arrays.copyOfRange(line.split(SEPARATOR), NUMBER_START_INDEX, NUMBER_START_INDEX + LOTTERY_COUNT);
      for (String number : values) {
        allNumbers.add(number);
      }
    }
    return allNumbers;
  }

  public static List<String> readFileLines() {
    List<String> lines;
    try {
      Path rawCsv = Paths.get(CSV_PATH);
      lines = Files.readAllLines(rawCsv);
    } catch (IOException e) {
      System.out.println("Unable to read the file :(");
      lines = new ArrayList<>();
    }
    System.out.println("File is loaded");
    return lines;
  }
}
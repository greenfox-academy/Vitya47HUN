import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise01 {
  public static void main(String[] args) {
      // Create a method that find the 5 most common lotto numbers assets/lotto.csv
    try {
      Path filePath = Paths.get("otos.csv");
      List<String> lines = Files.readAllLines(filePath);
      for(int i = 0;i < lines.size();i++)
        System.out.println(Arrays.toString(lines.get(i).split(";")));

    }

    catch (Exception e){
      System.out.println("Error");
    }
  }
  }
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
//      for(int i = 0;i < lines.size();i++) {
//        List<String> subList = lines.subList(lines.size()-5, lines.size() - 1);
//        System.out.println(subList);

//      }
      List<String> list = Arrays.asList(lines.get(0).split(";"));
      List<String> allNumbers = "";
      System.out.println(list.subList(list.size()-5, list.size()));


    }

    catch (Exception e){
      e.printStackTrace();
      System.out.println("Error");
    }
  }
  }
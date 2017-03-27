import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise02 {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("duplicated-chars.txt");
      List<String> lines = Files.readAllLines(filePath);
      List<String> texts = new ArrayList<String>();

      // Create a method that decrypts the assets/duplicated_chars.txt
      for (int i = 0; i < lines.size(); i++) {
        String readyLine = "";
        for (int j = 0; j < lines.get(i).length(); j += 2) {

          readyLine = readyLine + lines.get(i).charAt(j);

        }
        readyLine += "\n";
        texts.add(readyLine);

      }

      System.out.print(texts);

    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Error");
    }
  }
}
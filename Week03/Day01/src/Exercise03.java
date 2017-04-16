import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
public class Exercise03 {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("duplicated-chars.txt");
      List<String> lines = Files.readAllLines(filePath);
      int linesNumber = 0;

      for (int i = 0; i < lines.size(); i++) {
        linesNumber += 1;
      }
      System.out.print(linesNumber);
    } catch (Exception exception) {
      System.out.println(0);
    }
  }
}

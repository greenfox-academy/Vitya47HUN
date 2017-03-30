import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BasicExceptions2 {
    public static void main(String[] args) {

        Path path = Paths.get("BasicExceptions.iml");
        try {
            for(String line: Files.readAllLines(Paths.get("BasicExceptions.iml"))) {
                System.out.println(line.toUpperCase());
            }

            Files.lines(Paths.get("BasicExceptions.iml"))
                    .map(line -> line.toUpperCase())
                    .filter(line -> line.startsWith(" "))
                    .forEach (line -> System.out.println(line.toUpperCase()));



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

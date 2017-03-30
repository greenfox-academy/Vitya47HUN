import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BasicExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File file = new File("BasicExceptions.iml");
        System.out.println(file.exists());
        System.out.println(file.canRead() + ", " + file.canWrite());

        try {
            Scanner anotherScanner = new Scanner(file);
            while (anotherScanner.hasNext()) {
                System.out.println(anotherScanner.nextLine());
            }

        } catch (IOException ex){

        }
    }
}

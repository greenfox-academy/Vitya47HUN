import java.util.Arrays;
import java.util.List;

public class TodoApp {
  public static void main(String[] args) {
//    List<String> rawLines = readLinesFromFiles();
    System.out.println(Arrays.toString(args));
    String name = args[1];

    if (args[0].equals("-b")){
      System.out.println("Bye " + name);
    }else{
      System.out.println("Hello " + name);
    }

  }
}

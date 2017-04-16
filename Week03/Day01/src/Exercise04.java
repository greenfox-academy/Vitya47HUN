import java.io.*;

public class Exercise04 {
  public static void main(String[] args) {

    try {
      FileWriter writer = new FileWriter("my-file.txt", true);
      writer.write("Viktor");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      FileReader reader = new FileReader("my-filse.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    }catch (Exception exception) {
      exception.printStackTrace();
      System.out.println("Unable to read file");
    }

  }
}

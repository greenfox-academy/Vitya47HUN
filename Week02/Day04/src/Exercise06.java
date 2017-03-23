// Saturn is missing from the planetList
// Insert it into the correct position
import java.util.*;
public class Exercise06{
  public static void main(String... args){
      ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
      planetList.add("Saturn");
      System.out.println(planetList);
    }
  }


import java.util.*;
public class Exercise08{
  public static void main(String... args){
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

    // Add "a" to every string in the far list.
    int length = far.size();
    for (int i = 0;i < length;i++){
      far.set(i,far.get(i) + "a");
    }

    System.out.println(far);
  }
}
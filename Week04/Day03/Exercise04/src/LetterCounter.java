import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
  public static void main(String[] args) {
    String letters = "bbcdefghhh";
    System.out.println(letterCounter(letters));

  }

  public static Map<String, Integer> letterCounter(String letters){
    Map <String, Integer> letterMap = new HashMap<>();
    for (int i = 0; i < letters.length();i++){
      if(letterMap.containsKey(letters.substring(i, i + 1))){
        letterMap.put(letters.substring(i,i+1),letterMap.get(letters.substring(i,i+1)) + 1);
      }
      else {
        letterMap.put(letters.substring(i, i + 1), 1);
      }
    }
    return letterMap;
  }
}

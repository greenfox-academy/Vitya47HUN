import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a+b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > a && b > c) {
      return b;
    } else
      return c;
  }

  double median(List<Integer> pool) {
    Collections.sort(pool);
    if(pool.size() % 2 != 0){
      return (double)(pool.get((pool.size() - 1) / 2));
    }
    else {

      return (double)(pool.get(pool.size() / 2) + pool.get(pool.size() / 2 - 1)) / 2;
    }

  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
//    String test = "";
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        return hungarian.substring();

        i += 2;
        length += 2;
      }
    }

    return teve;

  }
}
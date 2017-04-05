import java.util.ArrayList;
import java.util.Collections;

public class Sum {
  public static void main(String[] args) {
    ArrayList<Integer> listNumbers = new ArrayList<>();
    listNumbers.add(1);
    listNumbers.add(2);
    listNumbers.add(3);
    listNumbers.add(4);
//    Collections.addAll(listNumbers, 1, 2, 3, 4);  < --- ezzel gyorsabb!
    System.out.println(listNumbers);
    System.out.println(sumTogether(listNumbers));

  }

  public static int sumTogether(ArrayList numbers) {
    if (numbers == null) {
      return 0;
    }
    else {
      int sum = 0;
      for (int i = 0; i < numbers.size(); i++) {
        sum += (int) numbers.get(i);
      }
      return sum;
    }
  }
}
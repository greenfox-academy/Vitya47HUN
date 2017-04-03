import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    List<Dominoes> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println((dominoes));
  }

//  public static List<Dominoes> adjacent(List<Dominoes> input) {
//    for (int i = 0; i < input.size(); i++) {
//      int[] value1 = input.get(i).getValues();
//      for (int j = i + 1; j < input.size(); j++) {
//        int[] value2 = input.get(j).getValues();
//        if (value1[1] == value2[0]) {
//          Collections.swap(input, i + 1, j);
//        }
//      }
//    }
//      return input;
//    }

    static List<Dominoes> initializeDominoes () {
      List<Dominoes> dominoes = new ArrayList<>();
      dominoes.add(new Dominoes(5, 2));
      dominoes.add(new Dominoes(2, 4));
      dominoes.add(new Dominoes(4, 6));
      dominoes.add(new Dominoes(6, 7));
      dominoes.add(new Dominoes(7, 1));
      dominoes.add(new Dominoes(1, 5));
      return dominoes;
    }
  }

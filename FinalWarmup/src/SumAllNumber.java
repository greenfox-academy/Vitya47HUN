import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumAllNumber {
  public static void main(String[] args) {

    int[][] table = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    List<List<Integer>> group = new ArrayList<List<Integer>>();
    group.add(Arrays.asList(1, 2, 3));
    group.add(Arrays.asList(4, 5, 6, 1));
    group.add(Arrays.asList(7, 8, 9));
    group.add(Arrays.asList(7, 8, 9));
    System.out.println(summerList(group));
    System.out.println(summerArray(table));
  }

  public static int summerList(List<List<Integer>> inputMatrix) {
    int result = 0;
    for (int i = 0; i < inputMatrix.size(); i++) {
      for (int j = 0; j < inputMatrix.get(i).size(); j++) {
        result = result + inputMatrix.get(i).get(j);
      }
    }
    return result;
  }

  public static int summerArray(int[][] inputMatrix) {
    int sum = 0;
    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix[i].length; j++) {
        sum = sum + inputMatrix[i][j];
      }
    }
    return sum;
  }
}
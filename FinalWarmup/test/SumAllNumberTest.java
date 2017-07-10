import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class SumAllNumberTest {

  @Test
  public void summerListTest() throws Exception {
    List<List<Integer>> testMatrix = new ArrayList<List<Integer>>();
    testMatrix.add(Arrays.asList(1, 2, 3));
    assertEquals(6,SumAllNumber.summerList(testMatrix));
  }

  @Test
  public void summerArrayTest() throws Exception {
    int[][] table = {{1, 2, 3}, {4, 5, 6}};
    assertEquals(21,SumAllNumber.summerArray(table));
  }

}
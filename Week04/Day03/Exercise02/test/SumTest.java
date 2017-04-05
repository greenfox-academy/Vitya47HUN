import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
  static int sum;
  @Test
  public void testGetSum() throws Exception {
    Sum mySum = new Sum();
    assertEquals(sum, mySum.sum);
  }
}
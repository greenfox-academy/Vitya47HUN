import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
  @Test
  public void testGetSum() throws Exception {
    Sum mySum = new Sum();
    assertEquals(mySum, mySum.sum);
  }
}
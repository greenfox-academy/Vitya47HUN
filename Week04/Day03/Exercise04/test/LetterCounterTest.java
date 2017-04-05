import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class LetterCounterTest {
  LetterCounter test = new LetterCounter();

  @Test
  public void testLetterCounter() throws Exception {
    String letters = "alma";
    Map<String, Integer> letterMap = new HashMap<>();
    letterMap.put("a", 0);
    letterMap.put("l", 1);
    letterMap.put("m", 2);
    letterMap.put("a", 3);

    assertEquals(letterMap, test.letterCounter(letters));
  }
}
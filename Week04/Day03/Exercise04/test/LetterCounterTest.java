import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class LetterCounterTest {
  @Test
  public void testCountLetters() throws Exception {
    LetterCounter myCounter = new LetterCounter();
    String text = "bbread";
    assertEquals(1,(int)myCounter.letterCounter(text).get("b"));
  }

}
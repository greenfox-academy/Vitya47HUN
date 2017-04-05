import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnagrammTest {
  Anagramm test = new Anagramm();
  String input1 = "asda";
  String input2 = "dsaa";

  @Before

  @Test
  public void testAnagram()throws Exception{
    assertTrue(test.isAnagram(input1,input2));
  }
}
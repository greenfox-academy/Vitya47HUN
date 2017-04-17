import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
  Animal test = new Animal();

  @Test
  public void testEat() throws Exception {
    test.eat();
    assertEquals(49, test.getHunger());
  }

  @Test
  public void testDrink() throws Exception {
    test.drink();
    assertEquals(49, test.getThirst());
  }

  @Test
  public void testPlay() throws Exception {
    test.play();
    assertEquals(51, test.getHunger());
    assertEquals(51, test.getThirst());
  }
}
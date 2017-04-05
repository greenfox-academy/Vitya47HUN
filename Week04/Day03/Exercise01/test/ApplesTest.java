import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  @Test
  public void testgetApple() throws Exception {
    Apples myApple = new Apples();
    assertEquals("apple", myApple.getApple());
  }

  @Test
  public void testgetApple2() throws Exception {
    Apples myApple = new Apples();
    assertEquals("orange",myApple.getApple());
  }
}
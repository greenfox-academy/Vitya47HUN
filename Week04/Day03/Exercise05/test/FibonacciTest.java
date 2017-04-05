import static org.junit.Assert.*;
import org.junit.Test;



public class FibonacciTest {

  @Test
  public void fibotest(){
    Fibonacci fibo = new Fibonacci();
    assertEquals(21,fibo.fibonacci(8));
  }

}
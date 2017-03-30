// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
public class Exercise02 {
  public static void main(String[] args) {
    System.out.println(sumnumbers(5));
  }

  public static int sumnumbers(int n) {
    if(n > 0){

      return n + sumnumbers(--n);
    }
   else return n;
  }

}
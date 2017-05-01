public class GenericMethodExample {
  public static void main(String[] args) {

    Integer[] ints = {1,2,3,4,5};
    Character[] chars = {'a','b','c','d'};
    printThis(ints);
    printThis(chars);
  }

  public static <T> void printThis (T[] x){
    for(T b : x) {
      System.out.printf("%s ", b);
    }
    System.out.println();
  }
}

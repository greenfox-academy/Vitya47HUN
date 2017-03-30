public class Exercise01 {
  public static void main(String[] args) {
    System.out.println(countdown(15));
  }
  public static int countdown(int n) {
    if(n <= 0){
      return 0;
    }
    System.out.println(n);
    return countdown(n - 1);
    }

  }



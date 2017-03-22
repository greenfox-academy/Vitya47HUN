
public class Exercise30 {
  public static void main(String[] args) {
    int sor = 4;
    for (int i = 1; i <= sor; i++) {
      for (int j = 1; j <= sor; j++) {
        if (i == 1 || i == sor)
          System.out.print("*");
        else if (j == 1 || j == sor)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}


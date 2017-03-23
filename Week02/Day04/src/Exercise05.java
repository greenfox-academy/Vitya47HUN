// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

public class Exercise05 {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    int length = reversed.length();


    for (int i = length - 1; i >= 0; i--) {

      System.out.print(reversed.charAt(i));
    }


  }


}


}




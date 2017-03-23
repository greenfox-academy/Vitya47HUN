// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

public class Exercise03 {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String quote2 = "always takes longer than ";
            quote =  quote.substring(0,quote.indexOf("you"))+ quote2 + quote.substring(quote.indexOf("you"),quote.length());
    System.out.println(quote);
  }
}


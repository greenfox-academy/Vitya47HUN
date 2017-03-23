import java.util.*;
public class Exercise10{
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

    // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
    // Do this again with a different solution using different list functions!
    int length = arrayList.size();
    for(int i = 0;i < length;i++){
      if( i == arrayList.indexOf(7)){
        System.out.println("Hooray");
      }
      else{
        System.out.println("Nooooo");
      }
    }

  }
}
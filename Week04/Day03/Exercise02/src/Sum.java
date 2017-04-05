import java.util.ArrayList;

public class Sum {
  ArrayList <Integer> mylist = new ArrayList<Integer>();
  int sum = 0;

  public int sumNumbers(){
    for (int i = 0; i < mylist.size(); i++){
      sum = sum + mylist.indexOf(i);
    }
    return sum;
  }
}

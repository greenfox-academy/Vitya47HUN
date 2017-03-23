import java.util.ArrayList;
import java.util.HashMap;

public class MaterialReview {
  public static void main(String[] args) {
    String s0 = "AS-D-A-S-D";
    for (String str: s0.split("-")) {
      System.out.println(str);
    }
    ArrayList<Integer> alist = new ArrayList<>();
    alist.add(1);

    System.out.println(alist.contains(1));
    alist.clear();
    System.out.println(alist.isEmpty());
    alist.add(1);
    alist.add(1);
    alist.add(1);
    int [] intarray;
    System.out.println(alist.toString());
    HashMap hm = new HashMap();
    hm.put(1,"Ertek");
    System.out.println(hm.get(1));

  }

}

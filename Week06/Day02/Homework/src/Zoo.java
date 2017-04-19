import com.sun.org.apache.regexp.internal.RE;

public class Zoo {

  public static void main(String[] args) {

    Reptile reptile = new Reptile("Crocodile",11,"male");
    Mammal mammal = new Mammal("Koala",3,"female");
    Bird bird = new Bird("Parrot",5,"female");
    Animal monkey = new Monkey("Chimpee",13,"male");

    System.out.println("Who want a baby?");
    System.out.println(reptile.getName() + ", " + reptile.wantChild());
    System.out.println(mammal.getName() + ", " + mammal.wantChild());
    System.out.println(bird.getName() + ", " + bird.wantChild());
    monkey.isHungry();
  }
}
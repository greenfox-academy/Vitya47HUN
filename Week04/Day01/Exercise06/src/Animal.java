//Create Animal class
//Every animal has a hunger value, which is a whole number
//                Every animal has a thirst value, which is a whole number
//                when creating a new animal object these values are created with the default 50 value
//        Every animal can eat() which decreases their hunger by one
//        Every animal can drink() which decreases their thirst by one
//        Every animal can play() which increases both by one
public class Animal {
  String name;
  int hunger;
  int thirst;

  public Animal() {
    this("unkown", 0, 0);
  }

  public Human(String name, int hunger, int thirst) {
    this.name = name;
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public static void main(String[] args) {
    Animal gepard = new Animal();
    Animal turtle = new Animal();

  }
}

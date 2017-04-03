import java.util.Scanner;

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
  int eat;
  int drink;

  public Animal() {
    this("unkown", 0, 0);
  }

  public Animal(String name, int hunger, int thirst) {
    this.name = name;
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public Animal(int eat, int drink, int play){
    this.eat = eat;
    this.drink = drink;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Animal gepard = new Animal();
    Animal turtle = new Animal();
    gepard.thirst = 50;
    gepard.hunger = 50;
    gepard.drink = 1;

    System.out.println("Feed the gepard with meat pieces :");
    int feeding = scanner.nextInt();
    gepard.hunger = gepard.hunger - feeding;
    System.out.println("Gepard is : " + (gepard.hunger) + "% hungry");

    System.out.println("Give some water to the gepard (dl) :");
    int drinking = scanner.nextInt();
    gepard.thirst = gepard.thirst - drinking;
    System.out.println("Gepard is : " + gepard.thirst + "% thirsty");

    System.out.println("Play with the gepard some hours :");
    int playtime = scanner.nextInt();
    gepard.thirst = gepard.thirst + playtime;
    gepard.hunger = gepard.hunger + playtime;
    System.out.println("Gepard is : " + gepard.thirst + "% thirsty. | " + "Gepard is : " + (gepard.hunger) + "% hungry");
  }
}

public class Animal {
  int hunger;
  int thirst;
  String name;

  public Animal() {
    this("Pidgeon", 50, 50);
  }

  public Animal(String name, int hunger, int thirst) {
    this.name = name;
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public int eat() {
    return hunger--;
  }

  public int drink() {
    return thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  public static void main(String[] args) {
    Animal lion = new Animal();

    System.out.println(lion.hunger);
    System.out.println(lion.thirst);
    lion.eat();
    System.out.println(lion.hunger);
    System.out.println(lion.thirst);
    lion.drink();
    System.out.println(lion.thirst);
    for (int i = 0; i < 5; i++) {
      lion.play();
    }
    System.out.println(lion.thirst);
    System.out.println(lion.hunger);
  }
}
public class Bird extends Animal{

  public Bird(String name, int age, String gender) {
    super(name, age, gender);
  }

  @Override
  void greet() {
    System.out.println(name + " welcomes you!");
  }

  @Override
  String wantChild() {
    return "wants a child from an egg!";
  }

  @Override
  void isHungry() {
    System.out.println(name + "wants to eat seeds");
  }

  @Override
  String getName() {
    return name;
  }
}

public class Bird extends Animal{

  public Bird(String name, int age, String gender) {
    super(name, age, gender);
  }

  @Override
  void greet() {

  }

  @Override
  String wantChild() {
    return "wants a child from an egg!";
  }

  @Override
  void isHungry() {

  }

  @Override
  String getName() {
    return name;
  }
}

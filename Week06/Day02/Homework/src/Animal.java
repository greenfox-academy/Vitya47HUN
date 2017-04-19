public abstract class Animal {
  String name;
  int age;
  String gender;

  public Animal(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  abstract void greet();
  abstract String wantChild();
  abstract void isHungry();
  abstract String getName();
}

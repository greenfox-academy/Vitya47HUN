public class Monkey extends Mammal{
    public Monkey(String name, int age, String gender) {
      super(name, age, gender);
    }

    @Override
    void greet() {
      System.out.println(name + " welcomes you!");
    }

    @Override
    String wantChild() {
      return "wants a child from my uterus!";
    }

    @Override
    void isHungry() {
      System.out.println(name + " wants to eat Banana");
    }

    @Override
    String getName() {
      return name;
    }
  }
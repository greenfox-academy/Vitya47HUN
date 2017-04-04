public class Mentor extends Person {
  String level;

  @Override
  public void getGoal(){
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce(){
    System.out.println("Hi, I'm name, a age year old gender level mentor.");
  }
}

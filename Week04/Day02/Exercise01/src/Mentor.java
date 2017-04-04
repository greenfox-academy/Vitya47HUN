public class Mentor extends Person {
  String level;

  @Override
  public void getGoal(){
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + "year old " + this.getGender() + this.level + " mentor.");
  }

  Mentor(String name,int age,String gender,String level){
    super(name,age,gender);
    this.level = level;
  }

  Mentor(){
    super();
    this.level = "Intermediate";
  }
}

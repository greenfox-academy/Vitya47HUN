public class Sponsor extends Person {
  String company;
  int hiredStudents;

  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + "year old " + this.getGender() + "who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire(){
    this.hiredStudents = hiredStudents + 1;
  }

  @Override
  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }

  Sponsor(String name,int age,String gender,String company){
    super(name,age,gender);
    this.hiredStudents = 0;
    this.company= company;
  }
  Sponsor(){
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }
}

public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  @Override
  public void getGoal(){
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce(){
    System.out.println("Hi, I'm" + name + ", a " + age + "year old " + gender + "from" + previousOrganization + "who skipped " + skippedDays + "days from the course already.");
  }
}


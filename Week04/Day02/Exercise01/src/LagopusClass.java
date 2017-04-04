import java.util.List;

public class LagopusClass {
  String className;
  List<Student> students;
  List<Mentor> mentors;

  public void addStudent(Student newStudent) {
    this.students.add(newStudent);
  }

  public void addMentor(Mentor newMentor) {
    this.mentors.add(newMentor);
  }

  public void info(){
    System.out.println( "Lagopus " + className + " class has " + students.size() + "students and " + mentors.size() + " mentors.");
  }

}

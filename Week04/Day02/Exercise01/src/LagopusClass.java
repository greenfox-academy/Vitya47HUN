import java.util.ArrayList;
import java.util.List;

public class LagopusClass {
  String className;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;

  public void addStudent(Student newStudent) {
    this.students.add(newStudent);
  }

  public void addMentor(Mentor newMentor) {
    this.mentors.add(newMentor);
  }

  public void info(){
    System.out.println( "Lagopus " + className + " class has " + students.size() + " students and " + mentors.size() + "  mentors.");
  }

  LagopusClass(String className){
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }
}

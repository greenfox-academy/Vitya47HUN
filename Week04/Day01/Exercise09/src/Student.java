//Teacher Student
//
//        Create Student and Teacher classes
//        Student
//        learn()
//        question(teacher) -> calls the teachers answer method
//        Teacher
//        teach(student) -> calls the students learn method
//        answer()
public class Student {
  String question;

  public void question(String teacherName) {
    teacherName = question;
  }

  public void learn(String question) {
    this.question = question;
  }
}

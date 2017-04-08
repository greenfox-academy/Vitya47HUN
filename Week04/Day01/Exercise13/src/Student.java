//Create Student and Teacher classes
//        Student
//        learn()
//        question(teacher) -> calls the teachers answer method
//        Teacher
//        teach(student) -> calls the students learn method
//        answer()
public class Student {
  public static void main(String[] args) {
  Teacher marika = new Teacher();
  Student pistika = new Student();
  pistika.question(marika);
  marika.answer();
    System.out.println(pistika);

  }

  public void learn(Teacher teacher){
  String knowledge = teacher.answer();
  }

  public void question(Teacher teacher){
    teacher.answer();
  }
}

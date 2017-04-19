import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Dog implements Comparable<Dog>{
  private int age;
  private String name;
  private String gender;

  public Dog(int age, String name, String gender) {
    this.age = age;
    this.name = name;
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString(){

    return this.getName() + " " + this.getAge();
  }

  public static void main(String[] args) {

    ArrayList<Dog> dogList = new ArrayList<>();
    Dog a =new Dog(4,"Peti", "boy");
    dogList.add(a);
    a =new Dog(5,"Dani", "boy");
    dogList.add(a);
    a =new Dog(10,"Kata", "girl");
    dogList.add(a);

    a =new Dog(1,"Bea", "girl");
    dogList.add(a);

    Collections.sort(dogList);

    System.out.println(dogList.toString());

    Collections.sort(dogList, new GenderComparator());

    System.out.println(dogList.toString());


  }

  @Override
  public int compareTo(Dog that) {



    return -(this.getAge() - that.getAge());
  }


  public String getGender() {
    return gender;
  }
}



class GenderComparator implements Comparator<Dog>{


  @Override
  public int compare(Dog o1, Dog o2) {
    return o1.getGender().equals("girl") ? -1 : 1 ;
  }
}

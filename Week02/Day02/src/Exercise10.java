/**
 * Created by pc on 2017.03.21..
 */
public class Exercise10 {
  public static void main(String[] args) {

    double a = 5;
    double b = 4;
    double c = 10;
    double vol = a * b * c;
    double area = 2 * (a * b + a * c + b * c);

    System.out.println("Volume : " + vol);
    System.out.println("Surface Area : " + area);
  }
}
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
public class Car {
  //mileage, price, doors count

  //fields are set private - > encapsulation
  private double mileage;
  private int price;
  private int doors;

  //functions
  //start  shutoff

  public void carStart(){
    System.out.println("Car Started");
  }

  public void carShutOff(){
    System.out.println("Car Engine off");
  }


  //Getters and setters
  //getters -> return type -> return something.
  //setters -> void -> doesn't return anything.

  public double getMileage() {
    return mileage;
  }

  public void setMileage(double mileage) {
    this.mileage = mileage;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }
}
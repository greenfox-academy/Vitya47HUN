public class Car {
  int gasAmount = 0;
  int capacity = 100;

  public void Car(int gasAmount, int capacity) {
    this.gasAmount = gasAmount;
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "Car{" +
            "gasAmount=" + gasAmount +
            ", capacity=" + capacity +
            '}';
  }

  public void refill() {
    while(true) {
      if (gasAmount == 100) {
        return;
      }
      gasAmount = gasAmount + 1;
    }
  }
}

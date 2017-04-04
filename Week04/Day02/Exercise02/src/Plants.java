public class Plants {
  String color;
  double waterlevel;
  double waterlimit;

  public void watering(double waterIncome) {
    waterlevel = waterlevel + waterIncome;
  }

  public void setcolor(String color){
    this.color = color;
  }


  public boolean isNeed() {
    return (this.waterlevel < this.waterlimit);
  }

  public void info() {
    if (isNeed()) {
      System.out.println("need water");
    } else {
      System.out.println("dont need water");
    }
  }
}

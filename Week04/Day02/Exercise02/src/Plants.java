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
}

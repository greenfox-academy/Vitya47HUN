public class Plants {
  String color;
  int waterlevel;
  int waterlimit;

  public void watering(int waterIncome) {
    waterlevel = waterlevel + waterIncome;
  }

  public void setcolor(String color){
    this.color = color;
  }
}

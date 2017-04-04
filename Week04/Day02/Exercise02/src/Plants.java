public class Plants {
  String color;
  int waterlevel;
  int waterlimit;

  public void watering() {
    this.waterlevel = waterlevel + 1;
  }

  public void setcolor(String color){
    this.color = color;
  }
}

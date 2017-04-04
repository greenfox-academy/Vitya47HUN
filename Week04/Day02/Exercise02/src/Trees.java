public class Trees extends Plants {

  Trees(String color, int waterlevel) {
    this.color = color;
    this.waterlevel = waterlevel;
    this.waterlimit = waterlimit;
  }

  Trees(){
    this.waterlimit = 10;
  }

  @Override
  public void watering(int waterIncome) {
    waterlevel = waterlevel + waterIncome * 40 / 100;
  }
}

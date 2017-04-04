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
  public void watering(double waterIncome) {
    waterlevel = waterlevel + waterIncome * 0.75;
  }
}

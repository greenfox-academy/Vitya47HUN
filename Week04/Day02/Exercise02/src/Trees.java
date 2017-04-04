public class Trees extends Plants {

  @Override
  public String toString() {
    return "Trees{" +
            "color='" + color + '\'' +
            ", waterlevel=" + waterlevel +
            ", waterlimit=" + waterlimit +
            '}';
  }

  Trees(String color, double waterlevel,double waterlimit) {
    this.color = color;
    this.waterlevel = waterlevel;
    this.waterlimit = waterlimit;
  }

  Trees(){
    this.waterlimit = 10.0;
  }

  @Override
  public void watering(double waterIncome) {
    waterlevel = waterlevel + waterIncome * 0.40;
  }
}

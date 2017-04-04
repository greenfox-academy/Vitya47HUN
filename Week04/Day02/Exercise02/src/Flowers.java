public class Flowers extends Plants {

  @Override
  public String toString() {
    return "Flowers{" +
            "color='" + color + '\'' +
            ", waterlevel=" + waterlevel +
            ", waterlimit=" + waterlimit +
            '}';
  }

  Flowers(String color, int waterlevel, int waterlimit) {
    this.color = color;
    this.waterlevel = waterlevel;
    this.waterlimit = waterlimit;
  }
  @Override
  public void watering(double waterIncome) {
    waterlevel = waterlevel + waterIncome * 0.75;
  }

  Flowers() {
    this.waterlimit = 5.0;
  }

//  public void absorb(int waterincome){
//    this.watering((waterincome * 75) / 100);
//  }
}

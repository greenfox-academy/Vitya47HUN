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
  public void watering(int waterIncome) {
    waterlevel = waterlevel + waterIncome * 75 / 100;
  }

  Flowers() {
    this.waterlimit = 5;
  }

//  public void absorb(int waterincome){
//    this.watering((waterincome * 75) / 100);
//  }
}

public class Flowers extends Plants {

  Flowers(String color, int waterlevel, int waterlimit) {
    this.color = color;
    this.waterlevel = waterlevel;
    this.waterlimit = waterlimit;
  }


  public void watering(int waterIncome) {
    waterlevel = waterlevel + waterIncome * 75 / 100;
  }


  Flowers(){
    this.waterlimit = 10;
  }

//  public void absorb(int waterincome){
//    this.watering((waterincome * 75) / 100);
//  }
}

public class Flowers {
  String color;
  int waterlevel;

  public void watering(){
    waterlevel = waterlevel + 1;
  }

  Flowers(String color, int waterlevel){
   this.color = color;
   this.waterlevel = waterlevel;
  }
}

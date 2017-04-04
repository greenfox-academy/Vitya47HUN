public class Flowers extends Plants {

  Flowers(String color, int waterlevel, int waterlimit) {
    this.color = color;
    this.waterlevel = waterlevel;
    this.waterlimit = waterlimit;
  }

  Flowers(){
    this.waterlimit = 10;
  }
}

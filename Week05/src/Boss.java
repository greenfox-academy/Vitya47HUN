public class Boss extends Character {

  public Boss(int x, int y, String imageName) {
    super(x,y, imageName);
    x = (int)(Math.random() * 3) - 1;
    y = (int)(Math.random() * 3) - 1;
  }

  @Override
  public void update(int[][] map, int keyCode) {
//    int moveX = (int)(Math.random() * 3) - 1;
//    int moveY = (int)(Math.random() * 3) - 1;

    // TODO csak az egyik ir�nyba l�pjen

//    if (canMove(x + moveX, y + moveY, map)) {
//      x += moveX;
//      y += moveY;
  }
}
//}
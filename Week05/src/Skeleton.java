public class Skeleton extends Character {

  public Skeleton(int x, int y, String imageName, int maxHp, int currentHp, int attackP) {
    super(x, y, imageName, maxHp, currentHp, attackP);
    x = (int) (Math.random() * 3) - 1;
    y = (int) (Math.random() * 3) - 1;
  }
  @Override
  public void update(int[][] map, int keyCode) {

    int moveX = (int) (Math.random() * 3) - 1;
    int moveY = (int) (Math.random() * 3) - 1;
//     Random moving.
    if (canMove(x + moveX, y + moveY, map)) {
      x += moveX;
      y += moveY;
    }
  }
}
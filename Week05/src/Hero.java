import java.awt.event.KeyEvent;

public class Hero extends Character {

  public Hero(int x, int y, String imageName) {
    super(x,y, imageName);
  }

  @Override
  public void update(int[][] map, int keyCode) {
    if (keyCode == KeyEvent.VK_UP && canMove(x, y - 1, map)) {
      y -= 1;
      setImage("./assets/hero-up.png");
    } else if (keyCode == KeyEvent.VK_DOWN && canMove(x, y + 1, map)) {
      y += 1;
      setImage("./assets/hero-down.png");
    } else if (keyCode == KeyEvent.VK_LEFT && canMove(x - 1,y, map)) {
      x -= 1;
      setImage("./assets/hero-left.png");
    } else if (keyCode == KeyEvent.VK_RIGHT && canMove(x+1, y, map)) {
      x += 1;
      setImage("./assets/hero-right.png");
    }
  }
}
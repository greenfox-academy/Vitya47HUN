import java.awt.event.KeyEvent;

public class Hero extends Character {

  public Hero(int x, int y, String imageName, int maxHp, int currentHp, int attackP) {
    super(x, y, imageName, maxHp, currentHp, attackP);
  }

//  @Override
//  public void update(int[][] map, int keyCode) {
//
//    if (keyCode == KeyEvent.VK_UP && canMove(x, y - 1, map)) {
//      moveUp();
//    } else if (keyCode == KeyEvent.VK_DOWN && canMove(x, y + 1, map)) {
//      y += 1;
//      setImage("./assets/hero-down.png");
//    } else if (keyCode == KeyEvent.VK_LEFT && canMove(x - 1, y, map)) {
//      x -= 1;
//      setImage("./assets/hero-left.png");
//    } else if (keyCode == KeyEvent.VK_RIGHT && canMove(x + 1, y, map)) {
//      x += 1;
//      setImage("./assets/hero-right.png");
//    } else if (keyCode == KeyEvent.VK_SPACE){
//
//    }
//
//  }

  public void moveUp(){
    setImage("./assets/hero-up.png");
    y = y - 1;
  }
  public void moveDown(){
    setImage("./assets/hero-down.png");
    y = y + 1;
  }

  public void moveLeft(){
    setImage("./assets/hero-left.png");
    x = x - 1;
  }

  public void moveRight(){
    setImage("./assets/hero-right.png");
    x = x + 1;
  }
}
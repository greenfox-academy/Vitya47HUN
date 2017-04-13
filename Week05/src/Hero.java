import java.awt.event.KeyEvent;

public class Hero extends Character {

  public Hero(int x, int y, String imageName, int maxHp, int currentHp, int attackP) {
    super(x, y, imageName, maxHp, currentHp, attackP);
  }

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
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Character {
  int maxHp;
  int currentHp;
  int attackP;
  int x, y;
  String imageName;

  public Character(int x, int y, String imageName, int maxHp, int currentHp, int attackP) {
    this.x = x;
    this.y = y;
    this.imageName = imageName;
    this.maxHp = maxHp;
    this.currentHp = currentHp;
    this.attackP = attackP;
  }

  public void setImage(String filename) {
    this.imageName = filename;
  }

  public void update(int[][] map, int keyCode) {
  }

  public void draw(Graphics graphics) throws IOException {
    BufferedImage image = ImageIO.read(new File(imageName));
    if (image != null) {
      graphics.drawImage(image, x * 72, y * 72, null);
    }
  }

  public void attack(Character target) {
    target.currentHp = target.currentHp - this.attackP;
  }
  boolean canMove(int toX, int toY,int[][] map) {
    if (toX < 0 || toX >= map.length){
      return false;
    }
    if (toY < 0 || toY >= map.length){
      return false;
    }
    return map[toY][toX] == 0;
  }
}




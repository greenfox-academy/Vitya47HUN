import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Vitya on 2017.04.11..
 */
public class Character {

  int x, y;
  BufferedImage image;


  public Character(int x, int y, String imageName) {
    this.x = x;
    this.y = y;
    setImage(imageName);
  }

  void setImage(String filename) {
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void update(int[][] map, int keyCode) {
  }

  boolean canMove(int toX, int toY, int[][] map) {

    if (toX < 0 || toX >= map.length) return false;
    if (toY < 0 || toY >= map.length) return false;

    return map[toY][toX] == 0;
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, x * 72, y * 72, null);
    }
  }

}
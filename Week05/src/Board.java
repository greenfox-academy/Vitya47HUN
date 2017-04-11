import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  String heroImage;
  int CurrentLocationX = testBoxX;
  int CurrentLocationY = testBoxY;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    heroImage = "./assets/hero-down.png";

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    int posX = 0;
    int posY = 0;
    for (int i = 0; i < 11; i++) {
      for (int j = 0; j < 10; j++) {
        PositionedImage image = new PositionedImage("./assets/floor.png", posX, posY);
        image.draw(graphics);
        posX = j * 72;
      }
      posY = i * 72;
    }

//    ArrayList<Integer> savedCoordinates = new ArrayList<>();
    int[][] map = {
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };
    int skeletonx = (int)(Math.random());
    int skeletony = (int)(Math.random() * 144);
    int wallX = 0;
    int wallY = 0;
    for (int x = 0; x < map.length; x++) {
      for (int y = 0; y < map[x].length; y++) {
        if (map[x][y] == 1) {
          wallX = y * 72;
          wallY = x * 72;
          PositionedImage wall = new PositionedImage("./assets/wall.png", wallX, wallY);
          wall.draw(graphics);
          if (testBoxX == wallX && testBoxY == wallY) {
            testBoxY = CurrentLocationY;
            testBoxX = CurrentLocationX;
          }
        }
      }
      PositionedImage skeleton = new PositionedImage("./assets/skeleton.png",skeletonx, skeletony);
      skeleton.draw(graphics);

      PositionedImage hero = new PositionedImage(heroImage, testBoxX, testBoxY);
      hero.draw(graphics);

      if (testBoxX == 720) {
        testBoxX -= 72;
      } else if (testBoxX == -72) {
        testBoxX = 0;
      } else if (testBoxY == -72) {
        testBoxY = 0;
      } else if (testBoxY == +720) {
        testBoxY -= 72;
      }
    }
    CurrentLocationX = testBoxX;
    CurrentLocationY = testBoxY;
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 72;
      heroImage = "./assets/hero-up.png";
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 72;
      heroImage = "./assets/hero-down.png";
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxX -= 72;
      heroImage = "./assets/hero-left.png";
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += 72;
      heroImage = "./assets/hero-right.png";
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}

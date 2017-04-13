import javafx.geometry.Pos;
import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {

  public final int f = 72; // Field size
  Hero Geralt = new Hero(0, 0, "./assets/hero-down.png", 100, 100, 5);
  int lastKey;
  List<Character> characters;

  int[][] map = {
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
          {0, 1, 1, 1, 0, 0, 1, 1, 1, 0,},
          {0, 0, 1, 0, 0, 0, 0, 1, 0, 0,},
          {0, 0, 1, 0, 0, 0, 0, 1, 0, 0,},
          {0, 0, 1, 0, 0, 0, 0, 1, 0, 0,},
          {0, 1, 1, 1, 0, 0, 1, 1, 1, 0,},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
          {0, 1, 0, 0, 1, 1, 0, 0, 1, 0,},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
          {1, 1, 1, 1, 0, 0, 1, 1, 1, 1,},
  };

  public Board() {
    characters = new ArrayList<Character>();
    setPreferredSize(new Dimension(1200, 720));
    setVisible(true);
    int x = (int) (Math.random() * 9);
    int y = (int) (Math.random() * 9);
    for (int c = 0; c < 3; c++) {
      while (map[y][x] == 1) {
        x = (int) (Math.random() * 9);
        y = (int) (Math.random() * 9);
      }
      characters.add(new Skeleton(x, y, "./assets/frog02.gif", 25, 25, 5));
      x = (int) (Math.random() * 9);
      y = (int) (Math.random() * 9);
    }
    while (map[y][x] == 1) {
      x = (int) (Math.random() * 9);
      y = (int) (Math.random() * 9);
    }
    characters.add(new Boss(x, y, "./assets/boss.png", 50, 50, 15));
    characters.add(Geralt);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    // Draw map
    drawMap(graphics);

    // Update characters
    for (Character character : characters) {
      character.update(map, lastKey);
      character.die(characters);
    }


    // Draw characteres
    for (Character character : characters) {
      PositionedImage tempImage = new PositionedImage(character.imageName, character.x * f, character.y * f);
      tempImage.draw(graphics);
    }
    // Draw some character's stats
    graphics.setColor(Color.RED);
    graphics.setFont(new Font("TimesRoman", Font.PLAIN, 16));
    graphics.drawString("Hero Health: " + Geralt.currentHp + "/" + Geralt.maxHp + " | " + "AP :" + Geralt.attackP, 730, 72);
    for (Character a : characters) {
      if (a.imageName != Geralt.imageName && a.x == Geralt.x && a.y == Geralt.y) {
        graphics.setColor(Color.RED);
        graphics.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        graphics.drawString("Enemy health : " + a.currentHp + "/" + a.maxHp, 730, 150);
      }
    }
  }

  void drawMap(Graphics graphics) {
    // Draw floor
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
    // Draw walls
    int wallX = 0;
    int wallY = 0;
    for (int x = 0; x < map.length; x++) {
      for (int y = 0; y < map[x].length; y++) {
        if (map[x][y] == 1) {
          wallX = y * 72;
          wallY = x * 72;
          PositionedImage wall = new PositionedImage("./assets/wall.png", wallX, wallY);
          wall.draw(graphics);
        }
      }
    }
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
    lastKey = e.getKeyCode();

    if (e.getKeyCode() == KeyEvent.VK_UP && canMove(Geralt.x, Geralt.y - 1)) {
      Geralt.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && canMove(Geralt.x, Geralt.y + 1)) {
      Geralt.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && canMove(Geralt.x - 1, Geralt.y)) {
      Geralt.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && canMove(Geralt.x + 1, Geralt.y)) {
      Geralt.moveRight();
    } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      for (Character a : characters) {
        if (a.imageName != Geralt.imageName && a.x == Geralt.x && a.y == Geralt.y) {
          Geralt.attack(a);
        }
      }
    }
    repaint();
  }

  boolean canMove(int toX, int toY) {
    if (toX < 0 || toX >= map.length) {
      return false;
    }
    if (toY < 0 || toY >= map.length) {
      return false;
    }
    return map[toY][toX] == 0;
  }
}

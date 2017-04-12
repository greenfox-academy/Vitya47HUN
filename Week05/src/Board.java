import javafx.scene.layout.Background;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {

  public final int f = 72; // Field size

  int lastKey;
  List<Character> characters;

  int[][] map = {
          {0, 0, 1, 0, 0, 0, 0, 0, 0, 0,},
          {0, 0, 1, 0, 0, 0, 0, 0, 0, 0,},
          {0, 0, 1, 1, 0, 0, 0, 0, 0, 0,},
          {0, 0, 0, 1, 0, 0, 0, 0, 0, 0,},
          {0, 1, 1, 1, 1, 0, 0, 0, 0, 0,},
          {0, 1, 0, 0, 0, 0, 0, 0, 0, 0,},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
          {1, 1, 1, 1, 1, 0, 0, 0, 0, 0,},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
  };

  public Board() {

    characters = new ArrayList<Character>();
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    int x = (int)(Math.random() * 9);
    int y = (int)(Math.random() * 9);
    while(map[y][x] == 1){
      x = (int)(Math.random() * 9);
      y = (int)(Math.random() * 9);
    }

    characters.add(new Boss(x,y, "./assets/boss.png"));
    characters.add(new Hero(5, 5, "./assets/hero-down.png"));
    characters.add(new Skeleton(x,y, "./assets/skeleton.png"));

  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    // Update characters
    for (Character character: characters){
      character.update(map, lastKey);
    }

    // Draw map
    drawMap(graphics);

    // Draw characteres
    for (Character character : characters) {
      character.draw(graphics);
    }

    // Draw hero's pos
    Character hero = characters.get(0);
    graphics.setColor(Color.RED);
    graphics.setFont(new Font("TimesRoman", Font.PLAIN, 16));
    graphics.drawString("hero pos: " +hero.x + ", " + hero.y,140,640);

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

    repaint();
  }
}
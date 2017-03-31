import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {

    int x = 150;
    int y = 150;
    int w = 300;
    int h = 300;
    mainboxes(x, y, w, h, graphics);
  }


  public static void mainboxes(int x, int y, int w, int h, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    if (w < 10) {
      return;
    }

    graphics.drawRect(x, y, w, h);
    mainboxes(x - (w / 8), y - (h / 8), w / 2, h / 2, graphics);
    mainboxes(x + (w / 8) * 7, y - (h / 8), w / 2, h / 2, graphics);
    mainboxes(x - (w / 8), y + (h / 8) * 7, w / 2, h / 2, graphics);
    mainboxes(x + (w / 8) * 7, y + (h / 8) * 7, w / 2, h / 2, graphics);

  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.WHITE);
      mainDraw(graphics);

    }
  }
}

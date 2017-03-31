import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {

    int x = 75;
    int y = 75;
    int w = 150;
    int h = 150;
    mainboxes(x, y, w, h, graphics);
  }


  public static void mainboxes(int x, int y, int w, int h, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    if (w < 15) {
      return;
    }

    graphics.drawRect(x, y, w, h);
    mainboxes(x / 2, y / 2, w / 2, h / 2, graphics);
    mainboxes(x / 2 + w, y / 2, w / 2, h / 2, graphics);
    mainboxes(x / 2, y / 2 + h, w / 2, h / 2, graphics);
    mainboxes(x / 2 + w, y / 2 + h, w / 2, h / 2, graphics);

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

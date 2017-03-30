import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise11BoxesinBoxes {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int w = 0;
    int h = 0;

    mainboxes(x, y, w, h, graphics);
  }


  public static void mainboxes(int x, int y, int w, int h, Graphics graphics) {
    x = 100;
    y = 0;
    w = 100;
    h = 100;
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, y, w, h);
        x = x + 100;
        y = y + 100;
      }
      x = x - 300;
      y = y - 100;
    }
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
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);

    }
  }
}




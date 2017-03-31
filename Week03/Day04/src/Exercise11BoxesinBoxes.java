import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise11BoxesinBoxes {
  public static void mainDraw(Graphics graphics) {

    int x = 0;
    int y = 0;
<<<<<<< HEAD
    int w = 300;
    int h = 300;
    mainboxes(x, y, w, h, graphics);
=======
    int w = 0;


    mainboxes(x, y, w, w, graphics);
>>>>>>> 873b5091be654c43ac8c564ef128b8ee4086a59e
  }


  public static void mainboxes(int x, int y, int w, int h, Graphics graphics) {
<<<<<<< HEAD
    graphics.setColor(Color.BLACK);
    if (w < 2) {
      return;
=======
    x = 100;
    y = 0;
    w = 100;
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, y, w, w);
        x = x + 100;
        y = y + 100;
      }
      x = x - 300;
      y = y - 100;
>>>>>>> 873b5091be654c43ac8c564ef128b8ee4086a59e
    }
    graphics.drawRect(x, y, w, h);
    mainboxes(x + (w / 3), y + (h / 3) * 2, w / 3, h / 3, graphics);
    mainboxes(x, y + h / 3, w / 3, h / 3, graphics);
    mainboxes(x + w / 3, y, w / 3, h / 3, graphics);
    mainboxes(x + (w / 3) * 2, y + h / 3, w / 3, h / 3, graphics);
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




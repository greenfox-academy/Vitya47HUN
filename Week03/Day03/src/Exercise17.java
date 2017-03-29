import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise17 {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/envelope-star/r2.png]

    int xstart = 150;
    int ystart = 150;
    int yfinish = 0;
    int xfinish = 150;
    for (int l = 0; l < 15; l++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(xstart, ystart, xfinish, yfinish);
      xstart = xstart - 10;
      yfinish = yfinish + 10;
    }
    xstart = 150;
    ystart = 150;
    yfinish = 0;
    xfinish = 150;
    for (int l = 0; l < 15; l++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(xstart, ystart, xfinish, yfinish);
      xstart = xstart + 10;
      yfinish = yfinish + 10;
    }
    xstart = 150;
    ystart = 150;
    yfinish = 300;
    xfinish = 150;
    for (int l = 0; l < 15; l++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(xstart, ystart, xfinish, yfinish);
      xstart = xstart - 10;
      yfinish = yfinish - 10;
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
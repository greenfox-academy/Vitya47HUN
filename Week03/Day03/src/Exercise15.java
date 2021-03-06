import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise15 {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]
    int xfinish = 0;
    int yfinish = 0;
    int xstart = 0;
    int ystart = 300;
    for (int k = 0;k <= 1; k++) {
      if (xstart == 0 && ystart == 300) {
        for (int i = 0; i < 12; i++) {
          graphics.setColor(Color.GREEN);
          graphics.drawLine(xstart, ystart, xfinish, yfinish);
          xstart = xstart + 25;
          yfinish = yfinish + 25;
        }
      }
      else {
        xfinish = 300;
        yfinish = 0;
        for (int j = 0; j < 12; j++) {
          graphics.setColor(Color.BLUE);
          graphics.drawLine(xfinish, yfinish, xstart, ystart);
          ystart = ystart - 25;
          xfinish = xfinish - 25;
        }
      }
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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class KochCurve {
  public static void mainDraw(Graphics graphics) {
    int level = 3;
    double x1 = 0, y1 = 300;
    double x2 = 150, y2 = 0;
    double x3 = 300, y3 = 300;


    //Order of points - important to be correct so snowflake doesn't grow inward
    drawFlake(level, x1, y1, x3, y3, graphics); //Draws bottom portion of flake
    drawFlake(level, x2, y2, x1, y1, graphics); //Draws left side of flake
    drawFlake(level, x3, y3, x2, y2, graphics); //Draws right side of the flake

  }
  // Draws the flake recursively. The base case is order 1 for which a simple straight line is drawn.
// Otherwise three intermediate points are computed, and each line segment is drawn.
  public static void drawFlake(int order, double x1, double y1, double x5, double y5, Graphics g) {

    double vectorX, vectorY, x2, y2, x3, y3, x4, y4;

    if (order == 1) {
      g.drawLine((int) x1, (int) y1, (int) x5, (int) y5);
    } else {

      vectorX = x5 - x1;
      vectorY = y5 - y1;

      x2 = x1 + vectorX / 3;
      y2 = y1 + vectorY / 3;

      x3 = ((x1 + x5) / 2 + (Math.sqrt(3.0) / 6) * (y1 - y5));
      y3 = ((y1 + y5) / 2 + (Math.sqrt(3.0) / 6) * (x5 - x1));

      x4 = x1 + vectorX * 2 / 3;
      y4 = y1 + vectorY * 2 / 3;

      drawFlake(order - 1, x1, y1, x2, y2, g);
      drawFlake(order - 1, x2, y2, x3, y3, g);
      drawFlake(order - 1, x3, y3, x4, y4, g);
      drawFlake(order - 1, x4, y4, x5, y5, g);
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
      this.setBackground(Color.WHITE);
      mainDraw(graphics);

    }
  }
}
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise14 {
  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    int xi = 0;
    int yi = 0;

    drawLine(graphics,xi , yi);
  }

  public static void drawLine(Graphics graphics, int x, int y) {
    int xi = 0;
    int yi = 0;
    for (int i = 0; i <= 60; i++) {
      if(xi == 300 && yi == 300) {
        for (int j = 0; j < 15; j++) {
          graphics.setColor(Color.blue);
          graphics.drawLine(xi, yi, 150, 150);
          xi = xi - 20;
        }
      }

      else if (xi == 0 && yi == 300) {
        for (int j = 0; j < 15; j++) {
          graphics.setColor(Color.blue);
          graphics.drawLine(xi, yi, 150, 150);
          yi = yi - 20;
        }
      }

      else if (xi == 300) {
        graphics.setColor(Color.blue);
        graphics.drawLine(xi, yi, 150, 150);
        yi = yi + 20;
      }

      else if(yi == 0) {
        graphics.setColor(Color.blue);
        graphics.drawLine(xi, yi, 150, 150);
        xi = xi + 20;
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
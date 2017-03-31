import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Trilanges {
  public static void mainDraw(Graphics graphics) {
    int xpoints[] = {0, 150, 300};
    int ypoints[] = {0, 300, 0};
    int npoints = 3;
    graphics.drawPolygon(xpoints,ypoints,npoints);

  }


//  public static void mainTrilanges(int x1, int y1, int x2, int x2,int x3,int y3, Graphics graphics) {
//
//    graphics.setColor(Color.WHITE);
//    if (w < 2) {
//      return;
//    }
//    graphics.drawPolygon(x, y, w, h);
//    mainTrilanges(x, y + (h / 3) * 2, w / 3, h / 3, graphics);
//    mainTrilanges(x, y + h / 3, w / 3, h / 3, graphics);
//    mainTrilanges(x, y, w / 3, h / 3, graphics);
//
//  }


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
      this.setBackground(Color.BLACK);
      mainDraw(graphics);

    }
  }
}
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Trilanges {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int w = 300;
    int h = 300;
    int npoints = 5;
    mainTrilanges(x,y,npoints,w,h,graphics);

  }


  public static void mainTrilanges(int x1, int y1,int nsize,int width,int height, Graphics graphics) {
    int x [] ={x1 , x1 + (width / 2), x1 + width};
    int y [] ={y1, y1 + height, y1};
    graphics.setColor(Color.WHITE);
    if (nsize == 0) {
      return;
    }
    graphics.drawPolygon(x,y,nsize);
    mainTrilanges(x1,y1,nsize - 1,width / 2,height / 2,graphics);
    mainTrilanges(x1 + (width / 2),y1,nsize - 1,width / 2,height / 2, graphics);
    mainTrilanges(x1 + (width / 5),y1 + (height / 2),nsize - 1,width / 2,height / 2, graphics);

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
      this.setBackground(Color.BLACK);
      mainDraw(graphics);

    }
  }
}
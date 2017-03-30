import sun.java2d.windows.GDIRenderer;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise11BoxesinBoxes {
  public static void mainDraw(Graphics graphics) {
    int x = 100;
    int y = 0;
    int w = 100;
    int h = 100;
    for(int i = 0; i < 4; i++){
      graphics.setColor(Color.BLACK);
    graphics.drawRect(x,y,w,h);
    x = x + 100;
    y = y + 100;
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


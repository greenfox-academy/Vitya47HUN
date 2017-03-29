import javax.swing.*;
import java.awt.*;

import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise06 {

  public static void mainDraw(Graphics graphics){
    // draw a green 10x10 square to the canvas' center.

    graphics.setColor(Color.GREEN);
    graphics.drawRect(140,140, 10, 10);

  }

  //    Don't touch the code below
  public static void main(String[] args) {
    int framex = 300;
    int framey = 300;
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(framex, framey));
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
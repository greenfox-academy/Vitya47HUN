import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise02 {

  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.

    graphics.setColor(Color.RED);
    graphics.drawLine(10,25,60,25);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(60,25,60,75);
    graphics.setColor(Color.BLUE);
    graphics.drawLine(60,75,10,75);
    graphics.setColor(Color.YELLOW);
    graphics.drawLine(10,75,10,25);

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
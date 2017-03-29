import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise07 {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    int R = (int) (Math.random() * 255);
    int G = (int) (Math.random() * 255);
    int B = (int) (Math.random() * 255);
    Color randomColor = new Color(R ,G, B);
    graphics.setColor(Color (randomColor));
    graphics.drawRect(140,140, 10, 10);

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
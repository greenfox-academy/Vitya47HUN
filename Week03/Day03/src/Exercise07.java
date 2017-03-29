import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise07 {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    int xPos = (int) (Math.random() * 300);
    int yPos = (int) (Math.random() * 300);
    int xSize = (int) (Math.random() * 100);
    int ySize = (int) (Math.random() * 100);

    int R = (int) (Math.random() * 255);
    int G = (int) (Math.random() * 255);
    int B = (int) (Math.random() * 255);
    Color randomColor = new Color(R ,G, B);
    graphics.setColor(randomColor);
    graphics.fillRect(xPos,yPos, xSize, ySize);
    graphics.fillRect(xPos,yPos, xSize, ySize);
    graphics.fillRect(xPos,yPos, xSize, ySize);


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
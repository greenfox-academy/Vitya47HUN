import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.Scanner;

public class Exercise08 {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please add the square starting parameters (X,Y)");
    drawLine(graphics, scanner.nextInt(), scanner.nextInt());
    System.out.println("Please add the 2nd square starting parameters (X,Y)");
    drawLine(graphics, scanner.nextInt(), scanner.nextInt());
    System.out.println("Please add the 3rd square starting parameters (X,Y)");
    drawLine(graphics, scanner.nextInt(), scanner.nextInt());

  }

  public static void drawLine(Graphics graphics, int x, int y) {
    graphics.setColor(Color.blue);
    graphics.fillRect(x, y, 50, 50);
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
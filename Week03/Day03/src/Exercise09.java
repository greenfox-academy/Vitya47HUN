import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise09 {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    Scanner scanner = new Scanner(System.in);

    int r = 255;
    int g = 0;
    int b = 0;
    int x = 300;
    int y = 300;
    for(int i = 0;i < 7; i++){
      Color rainbowColor = new Color(r ,g, b);
      drawSquare(graphics,rainbowColor, x , y);
      r = r - 25;
      g = + 25;
      b = + 25;
      x = x - 25;
      y = y - 25;
    }
  }
    public static void drawSquare(Graphics graphics,Color colorinput, int x, int y) {
      graphics.setColor(colorinput);
      y = x;
      graphics.fillRect(0, 0, x, y);
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
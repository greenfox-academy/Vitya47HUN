import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Exercise12 {
  public static void mainDraw(Graphics graphics) {
    int xpos = 10;
    int ypos = 10;
    int xsize = 10;
    int ysize = 10;
    for (int i = 0; i < 7; i++) {
      graphics.setColor(Color.BLACK);
      graphics.drawRect(xpos, ypos, xsize, ysize);
      graphics.setColor(Color.MAGENTA);
      graphics.fillRect(xpos, ypos, xsize, ysize);
      xpos = xpos + xsize;
      ypos = ypos + ysize;
      xsize = xsize + xsize / 2;
      ysize = ysize + ysize / 2;

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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
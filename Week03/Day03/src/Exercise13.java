import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise13 {
  public static void mainDraw(Graphics graphics){
    int xpos = 0;
    int ypos = 0;
    int xsize = 25;
    int ysize = 25;
    // fill the canvas with a checkerboard pattern.
  for(int length = 0; length < 12; length++){
    if (length == 0){
      xpos = + 25;
    }
    else if (length % 2 == 0){
      xpos = + 25;
      ypos = ypos + 25;
    }
    else {
      xpos = 0;
      ypos = ypos + 25;
    }
    for (int row = 0; row < 12; row++){
      if (row % 2 == 0) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(xpos, ypos, xsize, ysize);
        xpos = xpos + xsize;
      }
      else {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(xpos, ypos, xsize, ysize);
        xpos = xpos + xsize;
      }

    }
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
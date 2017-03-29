import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise11 {
  public static void mainDraw(Graphics graphics){
    int xpos = 25;
    int ypos = 25;
    for(int i = 0; i < 10;i++){
      graphics.setColor(Color.MAGENTA);
      graphics.fillRect(xpos, ypos, 25, 25);
      graphics.setColor(Color.BLACK);
      graphics.drawRect(xpos,ypos,25,25);
      xpos = xpos + 25;
      ypos = ypos + 25;
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
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise18 {
  public static void mainDraw(Graphics graphics) {
    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    int box[][] = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
    int other[][] = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

     connectPoints(other, graphics);


  }

  public static void connectPoints(int numbers[][],Graphics graphics) {
    int startx = 0;
    int sarty = 0;
    int endx = 0;
    int endy = 0;
    for (int i = 0;i < numbers.length;i++){
      startx = numbers[i][0];
      startx = numbers[i][1];
      endx = numbers[i + 1][0];
      endy = numbers[i + 1][1];
      graphics.drawLine(startx,sarty,endx,endy);
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
    mainDraw(graphics);

  }
}

}



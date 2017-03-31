import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int w = 300;
    int h = 300;
    mainboxes(x, y, w, h, graphics);
  }

  public static void mainboxes(int x, int y, int w, int h, Graphics graphics) {
    graphics.setColor(Color.WHITE);
    if (w < 2) {
      return;
    }
    graphics.drawRect(x, y, w, h);
    mainboxes(x, y + (h / 3) * 2, w / 3, h / 3, graphics);
    mainboxes(x, y + h / 3, w / 3, h / 3, graphics);
    mainboxes(x, y, w / 3, h / 3, graphics);
    mainboxes(x + (w / 3), y, w / 3, h / 3, graphics);
    mainboxes(x + (w / 3) * 2, y , w / 3, h / 3, graphics);
    mainboxes(x + (w / 3) * 2, y + h / 3, w / 3, h / 3, graphics);
    mainboxes(x + (w / 3) * 2, y + (h / 3) * 2, w / 3, h / 3, graphics);
    mainboxes(x + w / 3, y + (h / 3) * 2, w / 3, h / 3, graphics);
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
      this.setBackground(Color.BLACK);
      mainDraw(graphics);

    }
  }
}

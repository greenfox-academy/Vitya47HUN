import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {
    Graphics2D g1 = (Graphics2D) graphics;
    int x = 75;
    int y = 75;
    int w = 150;
    int h = 150;
    int lvl = 10;
    g1.setStroke(new BasicStroke(20));
    mainboxes(x, y, w, h, graphics, lvl);
  }
  public static void mainboxes(int x, int y, int w, int h, Graphics graphics, int level) {
    Graphics2D g2 = (Graphics2D) graphics;
    if (w < 15) {
      return;
    }
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x, y, w, h);
    g2.setStroke(new BasicStroke((level)));
    mainboxes(x - (w / 4), y - (h / 4), w / 2, h / 2, g2, level / 2);
    g2.setStroke(new BasicStroke((level)));
    mainboxes(x + 3 * (w / 4), y - (h / 4), w / 2, h / 2, g2, level / 2);
    g2.setStroke(new BasicStroke((level)));
    mainboxes(x - (w / 4), y + (h / 4) * 3, w / 2, h / 2, g2, level / 2);
    g2.setStroke(new BasicStroke((level)));
    mainboxes(x + 3 * (w / 4), y + (h / 4 * 3), h / 2, h / 2, g2, level / 2);
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
      this.setBackground(Color.WHITE);
      mainDraw(graphics);

    }
  }
}

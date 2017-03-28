import javax.swing.*;
import java.awt.*;

public class Window {
  public static void main(String[] args) {

      JFrame f = new JFrame("Title");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      DrawingBasics2 p = new DrawingBasics2();
      f.add(p);
      f.setSize(500,270);
      f.setVisible(true);
  }
}
